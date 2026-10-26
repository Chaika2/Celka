package celestial;

import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rruc_1 {
   ;
   private static boolean[] booleans8976bba2dba834c8b8aad687eeef9d7a;
   private static short[] shorts8976bba2dba834c8b8aad687eeef9d7a;
   private static byte[] bytes8976bba2dba834c8b8aad687eeef9d7a;
   public Object[] fields8976bba2dba834c8b8aad687eeef9d7a;
   public static Object[] staticFields8976bba2dba834c8b8aad687eeef9d7a;
   private static String[] strings8976bba2dba834c8b8aad687eeef9d7a;

   private rruc_1() {
      this.protected_();
      LinkedHashMap var7 = new LinkedHashMap();
      this.fields8976bba2dba834c8b8aad687eeef9d7a[0] = var7;
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 297380404;
   }

   public void class_(boolean var1) {
      StringBuilder var2 = new StringBuilder();

      for (Entry var4 : ((Map)this.fields8976bba2dba834c8b8aad687eeef9d7a[0]).entrySet()) {
         rruz_1 var5 = (rruz_1)var4.getKey();
         List var6 = (List)var4.getValue();
         if (var5.class_().equals("1.1")) {
            var2.append("Build: ").append(var5.class_()).append(" (").append(var5.break_()).append(")\n");

            for (int var7 = 0; var7 < var6.size(); var7++) {
               rruQ var8 = (rruQ)var6.get(var7);
               var2.append(var8.byte_().class_()).append(" ").append(var8.class_().getString());
               if (var8.break_() != null) {
                  var2.append(" (").append(var8.break_().getString()).append(")");
               }

               if (var7 != var6.size() - 1) {
                  var2.append("\n");
               }
            }
         }
      }

      System.out.println(var2);
      if (var1) {
         ((Qj_1)QY.instanceof_().class_[23]).class_(var2.toString());
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-10, -30, -49, 0, -102, 53, 59, -52}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3548499412152470583L;
   }

   public void class_(rruz_1 var1, List<rruQ> var2) {
      ((Map)this.fields8976bba2dba834c8b8aad687eeef9d7a[0]).put(var1, var2);
   }

   public Map<rruz_1, List<rruQ>> class_() {
      return (Map<rruz_1, List<rruQ>>)this.fields8976bba2dba834c8b8aad687eeef9d7a[0];
   }

   public void break_() {
      this.class_(
         new rruz_1("1.1", "25/05/2026"),
         List.of(
            new rruQ(
               new rgN_2("Добавлен режим \"SpookyTime\" в AttackAura"),
               new rgN_2("Самая лучшая и быстрая AttackAura среди всех клиентов"),
               (rruN)rruN.staticFields36ebb780c771397e903bfcb65c8ed147[0]
            ),
            new rruQ(new rgN_2("Добавлен режим \"SpookyTime\" в NoSlow"), (rruN)rruN.staticFields36ebb780c771397e903bfcb65c8ed147[0]),
            new rruQ(new rgN_2("Добавлен режим \"SpookyTime\" в KeepSprint"), (rruN)rruN.staticFields36ebb780c771397e903bfcb65c8ed147[0]),
            new rruQ(new rgN_2("Добавлен режим \"JumpReset\" в Velocity"), (rruN)rruN.staticFields36ebb780c771397e903bfcb65c8ed147[0]),
            new rruQ(new rgN_2("Добавлен чекбокс \"Пинг\" в ESP"), (rruN)rruN.staticFields36ebb780c771397e903bfcb65c8ed147[0]),
            new rruQ(new rgN_2("Добавлено зелье прыгучести в FTHelper"), (rruN)rruN.staticFields36ebb780c771397e903bfcb65c8ed147[0]),
            new rruQ(new rgN_2("Добавлена система центрирования перетаскиваемых элементов HUD"), (rruN)rruN.staticFields36ebb780c771397e903bfcb65c8ed147[0]),
            new rruQ(new rgN_2("Добавлено отображение экипировки цели в TargetHUD"), (rruN)rruN.staticFields36ebb780c771397e903bfcb65c8ed147[0]),
            new rruQ(
               new rgN_2("Добавлен чекбокс \"Превью шалкера\" в ESP"),
               new rgN_2("Долгожданная функция. Шалкеры не перекрывают друг друга - удобно рассматривать, какие ресурсы внутри"),
               (rruN)rruN.staticFields36ebb780c771397e903bfcb65c8ed147[0]
            ),
            new rruQ(
               new rgN_2("Добавлена категория \"Бинды предметов\" в HUD"),
               new rgN_2("Показывает забинженные предметы из FT/HW Helper'ов, имеющиеся в инвентаре"),
               (rruN)rruN.staticFields36ebb780c771397e903bfcb65c8ed147[0]
            ),
            new rruQ(
               new rgN_2("AutoBuy теперь работает на SpookyTime"),
               new rgN_2("Лучший AutoBuy среди всех клиентов"),
               (rruN)rruN.staticFields36ebb780c771397e903bfcb65c8ed147[1]
            ),
            new rruQ(new rgN_2("Команда .rct теперь работает на SpookyTime"), (rruN)rruN.staticFields36ebb780c771397e903bfcb65c8ed147[1]),
            new rruQ(new rgN_2("StructureTimer теперь работает на SpookyTime"), (rruN)rruN.staticFields36ebb780c771397e903bfcb65c8ed147[1]),
            new rruQ(new rgN_2("AntiAFK теперь работает на SpookyTime"), (rruN)rruN.staticFields36ebb780c771397e903bfcb65c8ed147[1]),
            new rruQ(new rgN_2("Режим \"Перезаход\" в AutoLeave теперь работает на SpookyTime"), (rruN)rruN.staticFields36ebb780c771397e903bfcb65c8ed147[1]),
            new rruQ(
               new rgN_2("Значительно расширена история предметов в AutoBuy - больше данных по каждой покупке"),
               (rruN)rruN.staticFields36ebb780c771397e903bfcb65c8ed147[1]
            ),
            new rruQ(
               new rgN_2("Полностью переписан AutoSprint - добавлена кастомная настройка под любой античит"),
               (rruN)rruN.staticFields36ebb780c771397e903bfcb65c8ed147[1]
            ),
            new rruQ(
               new rgN_2("Улучшен AutoExp"), new rgN_2("Исправлен детект в некоторых античитах"), (rruN)rruN.staticFields36ebb780c771397e903bfcb65c8ed147[1]
            ),
            new rruQ(
               new rgN_2("Теперь голова цели в TargetHUD зеленеет при выигрыше и краснеет при проигрыше"),
               (rruN)rruN.staticFields36ebb780c771397e903bfcb65c8ed147[1]
            ),
            new rruQ(new rgN_2("Улучшены анимации в ClickGUI"), (rruN)rruN.staticFields36ebb780c771397e903bfcb65c8ed147[1]),
            new rruQ(new rgN_2("Доработаны мелкие детали для улучшения пользовательского опыта"), (rruN)rruN.staticFields36ebb780c771397e903bfcb65c8ed147[1]),
            new rruQ(
               new rgN_2("Режим \"HolyWorld\" в GuiMove переименован в \"Advanced\""),
               new rgN_2("Советуем использовать именно этот режим на SpookyTime"),
               (rruN)rruN.staticFields36ebb780c771397e903bfcb65c8ed147[2]
            ),
            new rruQ(new rgN_2("Исправлено отображение логотипа клиента в DiscordRPC"), (rruN)rruN.staticFields36ebb780c771397e903bfcb65c8ed147[3]),
            new rruQ(new rgN_2("Исправлены краши и прочие недоработки"), (rruN)rruN.staticFields36ebb780c771397e903bfcb65c8ed147[3])
         )
      );
   }

   private static void throws_() {
      booleans8976bba2dba834c8b8aad687eeef9d7a = new boolean[]{false, true, false, true, true, false, false, false, true, true};
   }

   private static void catch_() {
      bytes8976bba2dba834c8b8aad687eeef9d7a = new byte[]{24, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 2};
   }

   private static void case_() {
      strings8976bba2dba834c8b8aad687eeef9d7a = new String[]{
         new String("1.1"),
         new String("25/05/2026"),
         new String("Добавлен режим \"SpookyTime\" в AttackAura"),
         new String("Самая лучшая и быстрая AttackAura среди всех клиентов"),
         new String("Добавлен режим \"SpookyTime\" в NoSlow"),
         new String("Добавлен режим \"SpookyTime\" в KeepSprint"),
         new String("Добавлен режим \"JumpReset\" в Velocity"),
         new String("Добавлен чекбокс \"Пинг\" в ESP"),
         new String("Добавлено зелье прыгучести в FTHelper"),
         new String("Добавлена система центрирования перетаскиваемых элементов HUD"),
         new String("Добавлено отображение экипировки цели в TargetHUD"),
         new String("Добавлен чекбокс \"Превью шалкера\" в ESP"),
         new String("Долгожданная функция. Шалкеры не перекрывают друг друга - удобно рассматривать, какие ресурсы внутри"),
         new String("Добавлена категория \"Бинды предметов\" в HUD"),
         new String("Показывает забинженные предметы из FT/HW Helper'ов, имеющиеся в инвентаре"),
         new String("AutoBuy теперь работает на SpookyTime"),
         new String("Лучший AutoBuy среди всех клиентов"),
         new String("Команда .rct теперь работает на SpookyTime"),
         new String("StructureTimer теперь работает на SpookyTime"),
         new String("AntiAFK теперь работает на SpookyTime"),
         new String("Режим \"Перезаход\" в AutoLeave теперь работает на SpookyTime"),
         new String("Значительно расширена история предметов в AutoBuy - больше данных по каждой покупке"),
         new String("Полностью переписан AutoSprint - добавлена кастомная настройка под любой античит"),
         new String("Улучшен AutoExp"),
         new String("Исправлен детект в некоторых античитах"),
         new String("Теперь голова цели в TargetHUD зеленеет при выигрыше и краснеет при проигрыше"),
         new String("Улучшены анимации в ClickGUI"),
         new String("Доработаны мелкие детали для улучшения пользовательского опыта"),
         new String("Режим \"HolyWorld\" в GuiMove переименован в \"Advanced\""),
         new String("Советуем использовать именно этот режим на SpookyTime"),
         new String("Исправлено отображение логотипа клиента в DiscordRPC"),
         new String("Исправлены краши и прочие недоработки"),
         new String("1.1"),
         new String("Build: "),
         new String(" ("),
         new String(")\n"),
         new String(" "),
         new String(" ("),
         new String(")"),
         new String("\n"),
         new String("INSTANCE")
      };
   }

   private static void implements_() {
      shorts8976bba2dba834c8b8aad687eeef9d7a = new short[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 3, 3, 0, 23, 0, 0, 0};
   }

   private void protected_() {
      if (this.fields8976bba2dba834c8b8aad687eeef9d7a == null) {
         this.fields8976bba2dba834c8b8aad687eeef9d7a = new Object[1];
         Object[] var1 = this.fields8976bba2dba834c8b8aad687eeef9d7a;
      }
   }

   private static void private_() {
      Object[] var0 = new Object[]{new rruc_1(), null};
      rruc_1[] var2 = new rruc_1[]{new rruc_1()};
      var0[1] = var2;
      staticFields8976bba2dba834c8b8aad687eeef9d7a = var0;
   }
}
