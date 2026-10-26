package celestial;

import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class EG extends C_try {
   private static String[] id_break;
   private static short[] id_throws;
   private static byte[] id_case;
   private static boolean[] id_catch;

   public EG(C_case var1) {
      super(var1, "set", "setting", "settings");
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 140216340;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7932241875734323523L;
   }

   private void id_class(C_extends<?> var1, String var2, boolean var3, String var4, String var5) {
      try {
         if (var3) {
            if (var1.id_byte() != Boolean.class) {
               this.id_case(id_break[35]);
               return;
            }

            Boolean var12 = (Boolean)var1.id_class[id_throws[8]] ^ id_catch[31];
            var1.id_class[id_throws[9]] = var12;
            String var10001 = id_break[36];
            Object[] var10002 = new Object[id_case[11]];
            var10002[id_catch[32]] = var1.id_protected();
            var10002[id_catch[33]] = var1.id_class[id_throws[10]];
            this.id_case(String.format(var10001, var10002));
         } else if (var2 != null) {
            Pd_1.id_class(C_class.id_instanceof(), var5, var2);
            String var14 = id_break[37];
            Object[] var15 = new Object[id_case[12]];
            var15[id_catch[34]] = var1.id_protected();
            var15[id_catch[35]] = Pd_1.id_break(var1);
            this.id_case(String.format(var14, var15));
         }

         this.id_class(var1, var4);
         Pd_1.id_break(C_class.id_instanceof());
      } catch (Exception var13) {
         this.id_case("Ошибка при изменении настройки: " + var13.getMessage());
         var13.printStackTrace();
      }
   }

   private void id_class(C_extends<?> var1, C_static var2, boolean var3, boolean var4, String var5, String var6) throws x_1 {
      if (var3) {
         var1.id_break();
      } else if (var4) {
         if (var1.id_byte() != Boolean.class) {
            throw new W(var2.id_private(), "переключаемая настройка", "другие параметры");
         }

         Boolean var13 = (Boolean)var1.id_class[0] ^ true;
         var1.id_class[0] = var13;
         this.id_case(String.format("Переключение настройки %s на %s", var1.id_protected(), var1.id_class[0]));
      } else {
         String var7 = var2.id_extends();

         try {
            Pd_1.id_class(C_class.id_instanceof(), var6, var7);
         } catch (Throwable var14) {
            var14.printStackTrace();
            throw new W(var2.id_private(), "a valid value", var14);
         }
      }

      if (!var4) {
         this.id_case(String.format("Настройка \"%s %s\" установлена на %s", var3 ? "reset" : id_break[30], var1.id_protected(), Pd_1.id_break(var1)));
      }

      this.id_class(var1, var5);
   }

   private void id_class(C_extends<?> var1, String var2) {
      rVe_1 var3 = new rVe_1(String.format("Старое значение: %s", var2));
      var3.id_class(
         var3.id_class()
            .id_class(rgF_2.GRAY)
            .id_class(new rgy_3(rgp_3.id_class, new rgN_2("Нажмите, чтобы вернуть настройку к данному значению")))
            .id_class(
               new rgl_3(rgH_2.RUN_COMMAND, (String)C_class.id_instanceof().id_protected.id_class[0] + String.format("set %s %s", var1.id_protected(), var2))
            )
      );
      this.id_class(new rVi_1[]{var3});
   }

   private C_finally id_class(C_extends<?> var1) {
      try {
         Field[] var2 = C_class.id_instanceof().getClass().getFields();
         Field[] var3 = var2;
         int var4 = var2.length;

         for (int var5 = id_catch[19]; var5 < var4; var5++) {
            Field var6 = var3[var5];
            if (var6.getType().equals(C_extends.class)) {
               try {
                  C_extends var7 = (C_extends)var6.get(C_class.id_instanceof());
                  if (var7 == var1) {
                     return var6.getAnnotation(C_finally.class);
                  }
               } catch (IllegalAccessException var8) {
                  var8.printStackTrace();
                  this.id_case("Не удалось получить значение настройки " + var6.getName());
               }
            }
         }
      } catch (Exception var9) {
         var9.printStackTrace();
         this.id_case("Не удалось получить аннотацию подтверждения для настройки " + var1.id_protected());
      }

      return null;
   }

   @Override
   public void id_class(String var1, C_static var2) throws x_1 {
      String var3 = var2.id_final() ? var2.id_extends().toLowerCase(Locale.US) : id_break[3];
      if (Arrays.asList("s", "save").contains(var3)) {
         Pd_1.id_break(C_class.id_instanceof());
         this.id_case("Настройки сохранены");
      } else {
         String[] var10000 = new String[id_case[3]];
         var10000[0] = "m";
         var10000[1] = "mod";
         var10000[2] = "modified";
         boolean var4 = Arrays.asList(var10000).contains(var3);
         boolean var5 = Arrays.asList("all", "l", "list").contains(var3);
         boolean var6 = !var4 && !var5 ? id_catch[9] : id_catch[8];
         if (var6) {
            String var15 = var2.id_final() && var2.id_throws(Integer.class) == null ? var2.id_extends() : id_break[13];
            var2.id_class(1);
            List var16 = (var4 ? Pd_1.id_class(C_class.id_instanceof()) : (List)C_class.id_instanceof().Pj[1])
               .stream()
               .filter(var0 -> !Pd_1.id_throws(var0) ? true : id_catch[64])
               .filter(var1x -> var1x.id_protected().toLowerCase(Locale.US).contains(var15.toLowerCase(Locale.US)))
               .sorted((var0, var1x) -> String.CASE_INSENSITIVE_ORDER.compare(var0.id_protected(), var1x.id_protected()))
               .collect(Collectors.toList());
            Z.id_class(
               var2,
               new Z<>(var16),
               () -> this.id_case(
                     !var15.isEmpty()
                        ? String.format("All %ssettings containing the string '%s':", var4 ? "modified " : id_break[74], var15)
                        : String.format(id_break[75], var4 ? "modified " : id_break[77])
                  ),
               var0 -> {
                  rgN_2 var1x = new rgN_2(String.format(" (%s)", Pd_1.id_protected(var0)));
                  var1x.id_class(var1x.id_class().id_class(rgF_2.DARK_GRAY));
                  rgN_2 var2x = new rgN_2("");
                  var2x.id_class(var2x.id_class().id_class(rgF_2.GRAY));
                  var2x.id_break(var0.id_protected());
                  var2x.id_break(String.format("\nТип: %s", Pd_1.id_protected(var0)));
                  var2x.id_break(String.format("\n\nЗначение:\n%s", Pd_1.id_break(var0)));
                  var2x.id_break(String.format("\n\nЗначение по умолчанию:\n%s", Pd_1.id_class(var0)));
                  String var3x = (String)C_class.id_instanceof().id_protected.id_class[0] + String.format("set %s ", var0.id_protected());
                  rVe_1 var4x = new rVe_1(var0.id_protected());
                  var4x.id_class(var4x.id_class().id_class(rgF_2.GRAY));
                  var4x.id_class(var1x);
                  var4x.id_class(var4x.id_class().id_class(new rgy_3(rgp_3.id_class, var2x)).id_class(new rgl_3(rgH_2.SUGGEST_COMMAND, var3x)));
                  return var4x;
               },
               (String)C_class.id_instanceof().id_protected.id_class[0] + "set " + var3 + " " + var15
            );
         } else {
            var2.id_class(1);
            boolean var7 = var3.equalsIgnoreCase("reset");
            boolean var8 = var3.equalsIgnoreCase("toggle");
            boolean var9 = !var7 && !var8 ? id_catch[13] : id_catch[12];
            if (var7) {
               if (!var2.id_final()) {
                  this.id_case("Пожалуйста, укажите 'all' в качестве аргумента для сброса, чтобы подтвердить, что вы действительно хотите сделать это.");
                  this.id_case(
                     "Все настройки будут сброшены. Используйте команды 'set modified' или 'modified', чтобы увидеть, какие настройки будут сброшены."
                  );
                  this.id_case("Укажите имя настройки вместо 'all', чтобы сбросить только одну настройку");
               } else if (var2.id_implements().equalsIgnoreCase("all")) {
                  Pd_1.id_class(C_class.id_instanceof()).forEach(C_extends::id_break);
                  this.id_case("Все настройки были сброшены до значений по умолчанию");
                  Pd_1.id_break(C_class.id_instanceof());
                  return;
               }
            }

            if (var8) {
               var2.id_private(1);
            }

            String var10 = var9 ? var2.id_extends() : var3;
            C_extends var11 = ((List)C_class.id_instanceof().Pj[1])
               .stream()
               .filter(var1x -> var1x.id_protected().equalsIgnoreCase(var10))
               .findFirst()
               .orElse(null);
            if (var11 == null) {
               throw new W(var2.id_private(), "валидная настройка");
            } else if (Pd_1.id_throws(var11)) {
               throw new k_1(String.format("Настройка %s может быть использована только через api.", var11.id_protected()));
            } else {
               if (!var9 && !var2.id_final()) {
                  this.id_case(String.format("Value of setting %s:", var11.id_protected()));
                  this.id_case(Pd_1.id_break(var11));
               } else {
                  String var12 = Pd_1.id_break(var11);
                  if (!var7) {
                     C_finally var13 = this.id_class(var11);
                     if (var13 != null) {
                        String var14 = var2.id_final() ? var2.id_extends() : null;
                        this.id_class(var11, var14, var8, var12, var3, var13);
                        return;
                     }
                  }

                  this.id_class(var11, var2, var7, var8, var12, var3);
               }

               Pd_1.id_break(C_class.id_instanceof());
            }
         }
      }
   }

   private void id_class(C_extends<?> var1, String var2, boolean var3, String var4, String var5, C_finally var6) {
      try {
         QY var7 = ((Ps_1)this.id_class[id_throws[7]]).id_throws();
         mT_2 var8 = new mT_2(var7x -> {
            if (var7x) {
               this.id_class(var1, var2, var3, var4, var5);
            } else {
               this.id_case("Изменение настройки отменено");
            }

            var7.id_break(null);
         }, new rgn_3(var6.id_class()), new rgn_3(var6.id_break()));
         var7.id_private(() -> var7.id_break(var8));
      } catch (Exception var9) {
         this.id_case("Не удалось показать диалог подтверждения, применяем изменение...");
         this.id_class(var1, var2, var3, var4, var5);
      }
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{80, -8, -88, 105, 112, -30, 64, -97}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Stream<String> id_break(String var1, C_static var2) throws x_1 {
      if (var2.id_final()) {
         String var3 = var2.id_extends();
         if (var2.id_case() && !Arrays.asList("s", "save").contains(var2.id_implements().toLowerCase(Locale.US))) {
            if (var3.equalsIgnoreCase("reset")) {
               return new v_1().id_case().id_class("all").id_class(var2.id_extends()).id_protected();
            }

            if (var3.equalsIgnoreCase("toggle")) {
               return new v_1().id_throws().id_class(var2.id_extends()).id_protected();
            }

            C_extends var4 = (C_extends)((Map)C_class.id_instanceof().Pj[0]).get(var3.toLowerCase(Locale.US));
            if (var4 != null) {
               if (var4.id_throws() == Boolean.class) {
                  v_1 var5 = new v_1();
                  if ((Boolean)var4.id_class[0]) {
                     var5.id_break("true", "false");
                  } else {
                     var5.id_break("false", "true");
                  }

                  return var5.id_class(var2.id_extends()).id_protected();
               }

               return Stream.of(Pd_1.id_break(var4));
            }
         } else if (!var2.id_final()) {
            return new v_1().id_byte().id_break().id_class("list", "modified", "reset", "toggle", "save").id_class(var3).id_protected();
         }
      }

      return Stream.empty();
   }

   private static void id_throws() {
      id_case = new byte[]{3, 2, 2, 3, 2, 3, 2, 2, 3, 2, 2, 2, 2, 2, 2, 2, 5, 2, 3, 4, 12, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 2};
   }

   private static void id_finally() {
      id_throws = new short[]{1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0};
   }

   @Override
   public List<String> id_catch() {
      return Arrays.asList(
         "Используя команду set, вы можете управлять всеми настройками Celestial. Практически каждый аспект контролируется этими настройками - будьте уверены!",
         "",
         "Использование:",
         "> set - То же самое, что и `set list`.",
         "> set list [страница] - Просмотр всех настроек",
         "> set modified [страница] - Просмотр измененных настроек",
         "> set <настройка> - Просмотр текущего значения настройки",
         "> set <настройка> <значение> - Установите значение параметра",
         "> set reset all - Сбросить ВСЕ НАСТРОЙКИ на значения по умолчанию",
         "> set reset <настройка> - Сброс настройки на значение по умолчанию",
         "> set toggle <настройка> - Переключение настройки с true на false и наоборот",
         "> set save - Сохранить все настройки (это происходит автоматически)"
      );
   }

   private static void id_extends() {
      id_catch = new boolean[]{
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         true,
         false,
         true,
         true,
         true,
         false,
         true,
         true,
         false,
         true,
         false,
         false,
         true,
         false,
         true,
         false,
         true,
         true,
         false,
         false,
         true,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         true,
         false,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         true,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         false,
         true,
         true,
         false,
         true,
         false
      };
   }

   @Override
   public boolean id_case() {
      return true;
   }

   @Override
   public String id_implements() {
      return "Изменение настроек баритона";
   }

   private static void id_protected() {
      id_break = new String[]{
         new String("set"),
         new String("setting"),
         new String("settings"),
         new String("list"),
         new String("s"),
         new String("save"),
         new String("Настройки сохранены"),
         new String("m"),
         new String("mod"),
         new String("modified"),
         new String("all"),
         new String("l"),
         new String("list"),
         new String(""),
         new String("reset"),
         new String("toggle"),
         new String("Пожалуйста, укажите 'all' в качестве аргумента для сброса, чтобы подтвердить, что вы действительно хотите сделать это."),
         new String("Все настройки будут сброшены. Используйте команды 'set modified' или 'modified', чтобы увидеть, какие настройки будут сброшены."),
         new String("Укажите имя настройки вместо 'all', чтобы сбросить только одну настройку"),
         new String("all"),
         new String("Все настройки были сброшены до значений по умолчанию"),
         new String("валидная настройка"),
         new String("Настройка %s может быть использована только через api."),
         new String("Value of setting %s:"),
         new String("переключаемая настройка"),
         new String("другие параметры"),
         new String("Переключение настройки %s на %s"),
         new String("a valid value"),
         new String("Настройка \"%s %s\" установлена на %s"),
         new String("reset"),
         new String("set"),
         new String("Старое значение: %s"),
         new String("Нажмите, чтобы вернуть настройку к данному значению"),
         new String("set %s %s"),
         new String("Не удалось показать диалог подтверждения, применяем изменение..."),
         new String("Ошибка: настройка не может быть переключена"),
         new String("Переключение настройки %s на %s"),
         new String("Настройка \"set %s\" установлена на %s"),
         new String("s"),
         new String("save"),
         new String("reset"),
         new String("all"),
         new String("toggle"),
         new String("true"),
         new String("false"),
         new String("false"),
         new String("true"),
         new String("list"),
         new String("modified"),
         new String("reset"),
         new String("toggle"),
         new String("save"),
         new String("Изменение настроек баритона"),
         new String(
            "Используя команду set, вы можете управлять всеми настройками Celestial. Практически каждый аспект контролируется этими настройками - будьте уверены!"
         ),
         new String(""),
         new String("Использование:"),
         new String("> set - То же самое, что и `set list`."),
         new String("> set list [страница] - Просмотр всех настроек"),
         new String("> set modified [страница] - Просмотр измененных настроек"),
         new String("> set <настройка> - Просмотр текущего значения настройки"),
         new String("> set <настройка> <значение> - Установите значение параметра"),
         new String("> set reset all - Сбросить ВСЕ НАСТРОЙКИ на значения по умолчанию"),
         new String("> set reset <настройка> - Сброс настройки на значение по умолчанию"),
         new String("> set toggle <настройка> - Переключение настройки с true на false и наоборот"),
         new String("> set save - Сохранить все настройки (это происходит автоматически)"),
         new String("Изменение настройки отменено"),
         new String(" (%s)"),
         new String(""),
         new String("\nТип: %s"),
         new String("\n\nЗначение:\n%s"),
         new String("\n\nЗначение по умолчанию:\n%s"),
         new String("set %s "),
         new String("All %ssettings containing the string '%s':"),
         new String("modified "),
         new String(""),
         new String("All %ssettings:"),
         new String("modified "),
         new String("")
      };
   }
}
