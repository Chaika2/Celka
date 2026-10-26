package celestial;

import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Bl_1 {
   private static boolean[] id_break;
   public static Object[] id_class;
   private static byte[] id_byte;
   private static String[] id_protected;

   private static void id_byte() {
      id_break = new boolean[]{
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
         false,
         true,
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
         false,
         false,
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
         true,
         false,
         true,
         false,
         true,
         false,
         true
      };
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2972832421538414116L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -573454485;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{55, -62, -46, 11, 54, -46, 47, -47}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_class() {
      id_byte = new byte[]{2, 3, 4, 5, 6, 7, 2, 8, 2, 9, 10, 11, 12, 13, 14, 2, 15, 2, 16, 2, 17, 2, 18, 2, 19, 2, 20, 2, 21, 2, 22, 2, 23, 24};
   }

   private static void id_break() {
      Object[] var0 = new Object[24];
      var0[0] = Pattern.compile(id_protected[0], 0);
      var0[1] = Pattern.compile(id_protected[1]);
      var0[2] = Pattern.compile(id_protected[2]);
      var0[3] = Pattern.compile(id_protected[3]);
      String[] var2 = new String[]{id_protected[4]};
      var0[4] = var2;
      String[] var3 = new String[]{id_protected[5]};
      var0[5] = var3;
      String[] var4 = new String[]{id_protected[6]};
      var0[6] = var4;
      String[] var5 = new String[]{id_protected[7]};
      var0[7] = var5;
      String[] var6 = new String[]{id_protected[8], id_protected[9]};
      var0[8] = var6;
      String[] var7 = new String[]{id_protected[10], id_protected[11]};
      var0[9] = var7;
      String[] var8 = new String[]{id_protected[12]};
      var0[10] = var8;
      String[] var9 = new String[]{id_protected[13]};
      var0[11] = var9;
      String[] var10 = new String[]{id_protected[14]};
      var0[12] = var10;
      String[] var11 = new String[]{id_protected[15]};
      var0[13] = var11;
      String[] var12 = new String[]{id_protected[16]};
      var0[14] = var12;
      Pattern[] var13 = new Pattern[]{Pattern.compile(id_protected[17]), Pattern.compile(id_protected[18])};
      var0[15] = var13;
      Pattern[] var14 = new Pattern[]{Pattern.compile(id_protected[19]), Pattern.compile(id_protected[20])};
      var0[16] = var14;
      Pattern[] var15 = new Pattern[]{Pattern.compile(id_protected[21]), Pattern.compile(id_protected[22])};
      var0[17] = var15;
      Pattern[] var16 = new Pattern[]{Pattern.compile(id_protected[23]), Pattern.compile(id_protected[24])};
      var0[18] = var16;
      Pattern[] var17 = new Pattern[]{Pattern.compile(id_protected[25]), Pattern.compile(id_protected[26])};
      var0[19] = var17;
      Pattern[] var18 = new Pattern[]{Pattern.compile(id_protected[27]), Pattern.compile(id_protected[28])};
      var0[20] = var18;
      Pattern[] var19 = new Pattern[]{Pattern.compile(id_protected[29]), Pattern.compile(id_protected[30])};
      var0[21] = var19;
      Pattern[] var20 = new Pattern[]{Pattern.compile(id_protected[31]), Pattern.compile(id_protected[32])};
      var0[22] = var20;
      Pattern[] var21 = new Pattern[]{Pattern.compile(id_protected[33]), Pattern.compile(id_protected[34])};
      var0[23] = var21;
      id_class = var0;
   }

   private static void id_protected() {
      id_protected = new String[]{
         new String(
            "\\[(\\d+)] (Мистический сундук|Метеоритный дождь|Маяк убийца|Сундук смерти|Вулкан|Алтарь|Снежная бойня|Загадочный маяк|Дед мороз|Горящий череп|Гейзер):"
         ),
         new String("\\|\\| (Статус|Координаты|Уровень лута): (.+)"),
         new String("Появился на координатах ?[^\\d-]*(-?\\d+)(?: (-?\\d+))? (-?\\d+)[^\\d-]*"),
         new String("Призван игроком: (\\w+)"),
         new String("метеоритный дождь"),
         new String("мистический сундук"),
         new String("загадочный маяк"),
         new String("маяк убийца"),
         new String("сундук смерти"),
         new String("уровень лута"),
         new String("снежная бойня"),
         new String("портал активируется через 3 минуты!"),
         new String("вулкан"),
         new String("алтарь"),
         new String("дед мороз"),
         new String("горящий череп"),
         new String("гейзер"),
         new String("Появился на координатах ?[^\\d-]*(-?\\d+)(?: (-?\\d+))? (-?\\d+)[^\\d-]*"),
         new String("Координаты:? ?[^\\d-]*(-?\\d+)(?: (-?\\d+))? (-?\\d+)[^\\d-]*"),
         new String("Появился на координатах ?[^\\d-]*(-?\\d+)(?: (-?\\d+))? (-?\\d+)[^\\d-]*"),
         new String("Координаты:? ?[^\\d-]*(-?\\d+)(?: (-?\\d+))? (-?\\d+)[^\\d-]*"),
         new String("Появился на координатах ?[^\\d-]*(-?\\d+)(?: (-?\\d+))? (-?\\d+)[^\\d-]*"),
         new String("Координаты:? ?[^\\d-]*(-?\\d+)(?: (-?\\d+))? (-?\\d+)[^\\d-]*"),
         new String("Появился на координатах ?[^\\d-]*(-?\\d+)(?: (-?\\d+))? (-?\\d+)[^\\d-]*"),
         new String("Координаты:? ?[^\\d-]*(-?\\d+)(?: (-?\\d+))? (-?\\d+)[^\\d-]*"),
         new String("Появился на координатах ?[^\\d-]*(-?\\d+)(?: (-?\\d+))? (-?\\d+)[^\\d-]*"),
         new String("Координаты:? ?[^\\d-]*(-?\\d+)(?: (-?\\d+))? (-?\\d+)[^\\d-]*"),
         new String("Появился на координатах ?[^\\d-]*(-?\\d+)(?: (-?\\d+))? (-?\\d+)[^\\d-]*"),
         new String("Координаты:? ?[^\\d-]*(-?\\d+)(?: (-?\\d+))? (-?\\d+)[^\\d-]*"),
         new String("Появился на координатах ?[^\\d-]*(-?\\d+)(?: (-?\\d+))? (-?\\d+)[^\\d-]*"),
         new String("Координаты:? ?[^\\d-]*(-?\\d+)(?: (-?\\d+))? (-?\\d+)[^\\d-]*"),
         new String("Появился на координатах ?[^\\d-]*(-?\\d+)(?: (-?\\d+))? (-?\\d+)[^\\d-]*"),
         new String("Координаты:? ?[^\\d-]*(-?\\d+)(?: (-?\\d+))? (-?\\d+)[^\\d-]*"),
         new String("Появился на координатах ?[^\\d-]*(-?\\d+)(?: (-?\\d+))? (-?\\d+)[^\\d-]*"),
         new String("Координаты:? ?[^\\d-]*(-?\\d+)(?: (-?\\d+))? (-?\\d+)[^\\d-]*")
      };
   }
}
