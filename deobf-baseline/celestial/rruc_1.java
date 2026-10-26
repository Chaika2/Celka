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
   private static boolean[] booleans8976bba2dba834c8b8aad687eeef9d7a;
   private static short[] shorts8976bba2dba834c8b8aad687eeef9d7a;
   private static byte[] bytes8976bba2dba834c8b8aad687eeef9d7a;
   public Object[] fields8976bba2dba834c8b8aad687eeef9d7a;
   public static Object[] staticFields8976bba2dba834c8b8aad687eeef9d7a;
   private static String[] strings8976bba2dba834c8b8aad687eeef9d7a;

   private rruc_1() {
      this.id_protected();
      LinkedHashMap var7 = new LinkedHashMap();
      this.fields8976bba2dba834c8b8aad687eeef9d7a[shorts8976bba2dba834c8b8aad687eeef9d7a[1]] = var7;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 297380404;
   }

   public void id_class(boolean var1) {
      StringBuilder var2 = new StringBuilder();

      for (Entry var4 : ((Map)this.fields8976bba2dba834c8b8aad687eeef9d7a[shorts8976bba2dba834c8b8aad687eeef9d7a[26]]).entrySet()) {
         rruz_1 var5 = (rruz_1)var4.getKey();
         List var6 = (List)var4.getValue();
         if (var5.id_class().equals(strings8976bba2dba834c8b8aad687eeef9d7a[32])) {
            var2.append(strings8976bba2dba834c8b8aad687eeef9d7a[33])
               .append(var5.id_class())
               .append(strings8976bba2dba834c8b8aad687eeef9d7a[34])
               .append(var5.id_break())
               .append(strings8976bba2dba834c8b8aad687eeef9d7a[35]);

            for (int var7 = booleans8976bba2dba834c8b8aad687eeef9d7a[2]; var7 < var6.size(); var7++) {
               rruQ var8 = (rruQ)var6.get(var7);
               var2.append(var8.id_byte().id_class()).append(strings8976bba2dba834c8b8aad687eeef9d7a[36]).append(var8.id_class().getString());
               if (var8.id_break() != null) {
                  var2.append(strings8976bba2dba834c8b8aad687eeef9d7a[37])
                     .append(var8.id_break().getString())
                     .append(strings8976bba2dba834c8b8aad687eeef9d7a[38]);
               }

               if (var7 != var6.size() - booleans8976bba2dba834c8b8aad687eeef9d7a[3]) {
                  var2.append(strings8976bba2dba834c8b8aad687eeef9d7a[39]);
               }
            }
         }
      }

      System.out.println(var2);
      if (var1) {
         ((Qj_1)QY.id_instanceof().id_class[shorts8976bba2dba834c8b8aad687eeef9d7a[27]]).id_class(var2.toString());
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-10, -30, -49, 0, -102, 53, 59, -52}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3548499412152470583L;
   }

   public void id_class(rruz_1 var1, List<rruQ> var2) {
      ((Map)this.fields8976bba2dba834c8b8aad687eeef9d7a[shorts8976bba2dba834c8b8aad687eeef9d7a[28]]).put(var1, var2);
   }

   public Map<rruz_1, List<rruQ>> id_class() {
      return (Map<rruz_1, List<rruQ>>)this.fields8976bba2dba834c8b8aad687eeef9d7a[shorts8976bba2dba834c8b8aad687eeef9d7a[29]];
   }

   public void id_break() {
      rruz_1 var10001 = new rruz_1(strings8976bba2dba834c8b8aad687eeef9d7a[0], strings8976bba2dba834c8b8aad687eeef9d7a[1]);
      rruQ[] var10002 = new rruQ[bytes8976bba2dba834c8b8aad687eeef9d7a[0]];
      var10002[booleans8976bba2dba834c8b8aad687eeef9d7a[0]] = new rruQ(
         new rgN_2(strings8976bba2dba834c8b8aad687eeef9d7a[2]),
         new rgN_2(strings8976bba2dba834c8b8aad687eeef9d7a[3]),
         (rruN)rruN.staticFields36ebb780c771397e903bfcb65c8ed147[shorts8976bba2dba834c8b8aad687eeef9d7a[2]]
      );
      var10002[booleans8976bba2dba834c8b8aad687eeef9d7a[1]] = new rruQ(
         new rgN_2(strings8976bba2dba834c8b8aad687eeef9d7a[4]),
         (rruN)rruN.staticFields36ebb780c771397e903bfcb65c8ed147[shorts8976bba2dba834c8b8aad687eeef9d7a[3]]
      );
      var10002[bytes8976bba2dba834c8b8aad687eeef9d7a[1]] = new rruQ(
         new rgN_2(strings8976bba2dba834c8b8aad687eeef9d7a[5]),
         (rruN)rruN.staticFields36ebb780c771397e903bfcb65c8ed147[shorts8976bba2dba834c8b8aad687eeef9d7a[4]]
      );
      var10002[bytes8976bba2dba834c8b8aad687eeef9d7a[2]] = new rruQ(
         new rgN_2(strings8976bba2dba834c8b8aad687eeef9d7a[6]),
         (rruN)rruN.staticFields36ebb780c771397e903bfcb65c8ed147[shorts8976bba2dba834c8b8aad687eeef9d7a[5]]
      );
      var10002[bytes8976bba2dba834c8b8aad687eeef9d7a[3]] = new rruQ(
         new rgN_2(strings8976bba2dba834c8b8aad687eeef9d7a[7]),
         (rruN)rruN.staticFields36ebb780c771397e903bfcb65c8ed147[shorts8976bba2dba834c8b8aad687eeef9d7a[6]]
      );
      var10002[bytes8976bba2dba834c8b8aad687eeef9d7a[4]] = new rruQ(
         new rgN_2(strings8976bba2dba834c8b8aad687eeef9d7a[8]),
         (rruN)rruN.staticFields36ebb780c771397e903bfcb65c8ed147[shorts8976bba2dba834c8b8aad687eeef9d7a[7]]
      );
      var10002[bytes8976bba2dba834c8b8aad687eeef9d7a[5]] = new rruQ(
         new rgN_2(strings8976bba2dba834c8b8aad687eeef9d7a[9]),
         (rruN)rruN.staticFields36ebb780c771397e903bfcb65c8ed147[shorts8976bba2dba834c8b8aad687eeef9d7a[8]]
      );
      var10002[bytes8976bba2dba834c8b8aad687eeef9d7a[6]] = new rruQ(
         new rgN_2(strings8976bba2dba834c8b8aad687eeef9d7a[10]),
         (rruN)rruN.staticFields36ebb780c771397e903bfcb65c8ed147[shorts8976bba2dba834c8b8aad687eeef9d7a[9]]
      );
      var10002[bytes8976bba2dba834c8b8aad687eeef9d7a[7]] = new rruQ(
         new rgN_2(strings8976bba2dba834c8b8aad687eeef9d7a[11]),
         new rgN_2(strings8976bba2dba834c8b8aad687eeef9d7a[12]),
         (rruN)rruN.staticFields36ebb780c771397e903bfcb65c8ed147[shorts8976bba2dba834c8b8aad687eeef9d7a[10]]
      );
      var10002[bytes8976bba2dba834c8b8aad687eeef9d7a[8]] = new rruQ(
         new rgN_2(strings8976bba2dba834c8b8aad687eeef9d7a[13]),
         new rgN_2(strings8976bba2dba834c8b8aad687eeef9d7a[14]),
         (rruN)rruN.staticFields36ebb780c771397e903bfcb65c8ed147[shorts8976bba2dba834c8b8aad687eeef9d7a[11]]
      );
      var10002[bytes8976bba2dba834c8b8aad687eeef9d7a[9]] = new rruQ(
         new rgN_2(strings8976bba2dba834c8b8aad687eeef9d7a[15]),
         new rgN_2(strings8976bba2dba834c8b8aad687eeef9d7a[16]),
         (rruN)rruN.staticFields36ebb780c771397e903bfcb65c8ed147[shorts8976bba2dba834c8b8aad687eeef9d7a[12]]
      );
      var10002[bytes8976bba2dba834c8b8aad687eeef9d7a[10]] = new rruQ(
         new rgN_2(strings8976bba2dba834c8b8aad687eeef9d7a[17]),
         (rruN)rruN.staticFields36ebb780c771397e903bfcb65c8ed147[shorts8976bba2dba834c8b8aad687eeef9d7a[13]]
      );
      var10002[bytes8976bba2dba834c8b8aad687eeef9d7a[11]] = new rruQ(
         new rgN_2(strings8976bba2dba834c8b8aad687eeef9d7a[18]),
         (rruN)rruN.staticFields36ebb780c771397e903bfcb65c8ed147[shorts8976bba2dba834c8b8aad687eeef9d7a[14]]
      );
      var10002[bytes8976bba2dba834c8b8aad687eeef9d7a[12]] = new rruQ(
         new rgN_2(strings8976bba2dba834c8b8aad687eeef9d7a[19]),
         (rruN)rruN.staticFields36ebb780c771397e903bfcb65c8ed147[shorts8976bba2dba834c8b8aad687eeef9d7a[15]]
      );
      var10002[bytes8976bba2dba834c8b8aad687eeef9d7a[13]] = new rruQ(
         new rgN_2(strings8976bba2dba834c8b8aad687eeef9d7a[20]),
         (rruN)rruN.staticFields36ebb780c771397e903bfcb65c8ed147[shorts8976bba2dba834c8b8aad687eeef9d7a[16]]
      );
      var10002[bytes8976bba2dba834c8b8aad687eeef9d7a[14]] = new rruQ(
         new rgN_2(strings8976bba2dba834c8b8aad687eeef9d7a[21]),
         (rruN)rruN.staticFields36ebb780c771397e903bfcb65c8ed147[shorts8976bba2dba834c8b8aad687eeef9d7a[17]]
      );
      var10002[bytes8976bba2dba834c8b8aad687eeef9d7a[15]] = new rruQ(
         new rgN_2(strings8976bba2dba834c8b8aad687eeef9d7a[22]),
         (rruN)rruN.staticFields36ebb780c771397e903bfcb65c8ed147[shorts8976bba2dba834c8b8aad687eeef9d7a[18]]
      );
      var10002[bytes8976bba2dba834c8b8aad687eeef9d7a[16]] = new rruQ(
         new rgN_2(strings8976bba2dba834c8b8aad687eeef9d7a[23]),
         new rgN_2(strings8976bba2dba834c8b8aad687eeef9d7a[24]),
         (rruN)rruN.staticFields36ebb780c771397e903bfcb65c8ed147[shorts8976bba2dba834c8b8aad687eeef9d7a[19]]
      );
      var10002[bytes8976bba2dba834c8b8aad687eeef9d7a[17]] = new rruQ(
         new rgN_2(strings8976bba2dba834c8b8aad687eeef9d7a[25]),
         (rruN)rruN.staticFields36ebb780c771397e903bfcb65c8ed147[shorts8976bba2dba834c8b8aad687eeef9d7a[20]]
      );
      var10002[bytes8976bba2dba834c8b8aad687eeef9d7a[18]] = new rruQ(
         new rgN_2(strings8976bba2dba834c8b8aad687eeef9d7a[26]),
         (rruN)rruN.staticFields36ebb780c771397e903bfcb65c8ed147[shorts8976bba2dba834c8b8aad687eeef9d7a[21]]
      );
      var10002[bytes8976bba2dba834c8b8aad687eeef9d7a[19]] = new rruQ(
         new rgN_2(strings8976bba2dba834c8b8aad687eeef9d7a[27]),
         (rruN)rruN.staticFields36ebb780c771397e903bfcb65c8ed147[shorts8976bba2dba834c8b8aad687eeef9d7a[22]]
      );
      var10002[bytes8976bba2dba834c8b8aad687eeef9d7a[20]] = new rruQ(
         new rgN_2(strings8976bba2dba834c8b8aad687eeef9d7a[28]),
         new rgN_2(strings8976bba2dba834c8b8aad687eeef9d7a[29]),
         (rruN)rruN.staticFields36ebb780c771397e903bfcb65c8ed147[shorts8976bba2dba834c8b8aad687eeef9d7a[23]]
      );
      var10002[bytes8976bba2dba834c8b8aad687eeef9d7a[21]] = new rruQ(
         new rgN_2(strings8976bba2dba834c8b8aad687eeef9d7a[30]),
         (rruN)rruN.staticFields36ebb780c771397e903bfcb65c8ed147[shorts8976bba2dba834c8b8aad687eeef9d7a[24]]
      );
      var10002[bytes8976bba2dba834c8b8aad687eeef9d7a[22]] = new rruQ(
         new rgN_2(strings8976bba2dba834c8b8aad687eeef9d7a[31]),
         (rruN)rruN.staticFields36ebb780c771397e903bfcb65c8ed147[shorts8976bba2dba834c8b8aad687eeef9d7a[25]]
      );
      this.id_class(var10001, List.of(var10002));
   }

   private static void id_throws() {
      booleans8976bba2dba834c8b8aad687eeef9d7a = new boolean[]{false, true, false, true, true, false, false, false, true, true};
   }

   private static void id_catch() {
      bytes8976bba2dba834c8b8aad687eeef9d7a = new byte[]{24, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 2};
   }

   private static void id_case() {
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

   private static void id_implements() {
      shorts8976bba2dba834c8b8aad687eeef9d7a = new short[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 3, 3, 0, 23, 0, 0, 0};
   }

   private void id_protected() {
      if (this.fields8976bba2dba834c8b8aad687eeef9d7a == null) {
         this.fields8976bba2dba834c8b8aad687eeef9d7a = new Object[booleans8976bba2dba834c8b8aad687eeef9d7a[9]];
         Object[] var1 = this.fields8976bba2dba834c8b8aad687eeef9d7a;
      }
   }

   private static void id_private() {
      Object[] var0 = new Object[]{new rruc_1(), null};
      rruc_1[] var2 = new rruc_1[]{new rruc_1()};
      var0[1] = var2;
      staticFields8976bba2dba834c8b8aad687eeef9d7a = var0;
   }
}
