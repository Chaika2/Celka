# Discord RPC: таймер и сервер в статусе

Патч `prepareDiscordRpcFix` исправляет две вещи в `celestial.rrZP` (класс
Discord Rich Presence).

## 1. Таймер «2000+ часов»

### Симптом

В профиле Discord рядом с Celestial показывается, что игрок играет уже
несколько тысяч часов, хотя клиент только что запущен.

### Причина

В статическом инициализаторе `rrZP.id_throws()V` собирается массив, второй
элемент которого используется как время старта сессии:

```java
Object[] values = new Object[]{new rrZP(), "999325989563801640", 1787089031580L, ...};
```

Presence строится так:

```java
builder.setStartTimestamp((Long) staticFieldsfda1a12b8e6d3a64af93b1c14ed22523[2] / 1000L);
```

`1787089031580L` — фиксированный момент (16 августа 2026), поэтому Discord
показывал тысячи часов.

### Фикс

В `rrZP.id_throws()V` константа заменяется на `System.currentTimeMillis()`:

```java
// было: iconst_2; ldc2_w 1787089031580L; Long.valueOf(J)
// стало: iconst_2; invokestatic System.currentTimeMillis()J; Long.valueOf(J)
```

Стек не меняется, поэтому кадры (`StackMapTable`) и `max_stack`/`max_locals`
остаются валидными. Класс инициализируется при запуске RPC-потока, и таймер
каждый раз начинается с `00:00`.

## 2. Сервер в статусе

### Что показывает

Вторая строка статуса (`state`) больше не является константой
`Build » 1.1 (1.16.5)`. Вместо неё вызывается
`celestial.DiscordRpcServer.line()`:

| Ситуация | Строка статуса |
| --- | --- |
| Распознанный сервер | `Играет на HolyWorld` / `Funtime` / `SpookyTime` / ... |
| Любой другой сервер | `Сервер » play.example.com` |
| Одиночная игра | `Одиночная игра` |
| Главное меню | `Build » 1.1 (1.16.5)` |

Распознанные серверы те же, что и для иконки в RPC: ReallyWorld, AresMine,
Funtime, FunSky, SpookyTime, SlimeWorld, HolyWorld, Sunrise, InfinityHVH,
MetaHVH. Адрес берётся из `rrfp_3.id_throws()` (это `ServerData.ipAddress`),
поэтому строка обновляется сама при входе на сервер и выходе в меню.

### Как устроено

В `rrZP.id_class(celestial/rrZr_1)V` перед вызовом
`Builder.setState(String)` байткод кладёт на стек строку из массива. Патч
вставляет `pop` (убрать константу) и `invokestatic DiscordRpcServer.line()`
(положить актуальную строку). Форма стека и `max_stack` не меняются.

`celestial.DiscordRpcServer` компилируется из `discord-rpc-fix-src/celestial/`
против runtime-джара и кладётся в тот же `celestial-fix`, что и патченый
`rrZP.class`, поэтому оба класса грузятся одним загрузчиком игры. Ошибки
хелпер ловит и в худшем случае возвращает старую строку `Build » ...`.

## Проверка

```powershell
.\gradlew.bat prepareDiscordRpcFix
javap -p -c build\celestial-fix\celestial\rrZP.class |
    Select-String 'currentTimeMillis|DiscordRpcServer'
```

В `id_throws()` должна быть строка
`invokestatic java/lang/System.currentTimeMillis:()J`, а в
`id_class(celestial.rrZr_1)` — `invokestatic celestial/DiscordRpcServer.line`.