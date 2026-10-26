package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashSet;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum Es_1 {
   private static byte[] bytes5696f710d79436c0a6411ece0fff2016;
   private static String[] strings5696f710d79436c0a6411ece0fff2016;
   private static boolean[] booleans5696f710d79436c0a6411ece0fff2016;
   public static Object[] staticFields5696f710d79436c0a6411ece0fff2016;
   private static short[] shorts5696f710d79436c0a6411ece0fff2016;
   public Object[] fields5696f710d79436c0a6411ece0fff2016;

   private static void id_byte() {
      Object[] var0 = new Object[15];
      String var10004 = strings5696f710d79436c0a6411ece0fff2016[0];
      String[] var2 = new String[]{
         strings5696f710d79436c0a6411ece0fff2016[1], strings5696f710d79436c0a6411ece0fff2016[2], strings5696f710d79436c0a6411ece0fff2016[3]
      };
      var0[0] = new Es_1(var2);
      var10004 = strings5696f710d79436c0a6411ece0fff2016[4];
      String[] var3 = new String[]{
         strings5696f710d79436c0a6411ece0fff2016[5], strings5696f710d79436c0a6411ece0fff2016[6], strings5696f710d79436c0a6411ece0fff2016[7]
      };
      var0[1] = new Es_1(var3);
      var10004 = strings5696f710d79436c0a6411ece0fff2016[8];
      String[] var4 = new String[]{strings5696f710d79436c0a6411ece0fff2016[9], strings5696f710d79436c0a6411ece0fff2016[10]};
      var0[2] = new Es_1(var4);
      var10004 = strings5696f710d79436c0a6411ece0fff2016[11];
      String[] var5 = new String[]{strings5696f710d79436c0a6411ece0fff2016[12], strings5696f710d79436c0a6411ece0fff2016[13]};
      var0[3] = new Es_1(var5);
      var10004 = strings5696f710d79436c0a6411ece0fff2016[14];
      String[] var6 = new String[]{
         strings5696f710d79436c0a6411ece0fff2016[15],
         strings5696f710d79436c0a6411ece0fff2016[16],
         strings5696f710d79436c0a6411ece0fff2016[17],
         strings5696f710d79436c0a6411ece0fff2016[18]
      };
      var0[4] = new Es_1(var6);
      var10004 = strings5696f710d79436c0a6411ece0fff2016[19];
      String[] var7 = new String[]{strings5696f710d79436c0a6411ece0fff2016[20], strings5696f710d79436c0a6411ece0fff2016[21]};
      var0[5] = new Es_1(var7);
      var10004 = strings5696f710d79436c0a6411ece0fff2016[22];
      String[] var8 = new String[]{strings5696f710d79436c0a6411ece0fff2016[23], strings5696f710d79436c0a6411ece0fff2016[24]};
      var0[6] = new Es_1(var8);
      var10004 = strings5696f710d79436c0a6411ece0fff2016[25];
      String[] var9 = new String[]{strings5696f710d79436c0a6411ece0fff2016[26], strings5696f710d79436c0a6411ece0fff2016[27]};
      var0[7] = new Es_1(var9);
      var10004 = strings5696f710d79436c0a6411ece0fff2016[28];
      String[] var10 = new String[]{strings5696f710d79436c0a6411ece0fff2016[29], strings5696f710d79436c0a6411ece0fff2016[30]};
      var0[8] = new Es_1(var10);
      var10004 = strings5696f710d79436c0a6411ece0fff2016[31];
      String[] var11 = new String[]{strings5696f710d79436c0a6411ece0fff2016[32], strings5696f710d79436c0a6411ece0fff2016[33]};
      var0[9] = new Es_1(var11);
      var10004 = strings5696f710d79436c0a6411ece0fff2016[34];
      String[] var12 = new String[]{strings5696f710d79436c0a6411ece0fff2016[35], strings5696f710d79436c0a6411ece0fff2016[36]};
      var0[10] = new Es_1(var12);
      var10004 = strings5696f710d79436c0a6411ece0fff2016[37];
      String[] var13 = new String[]{strings5696f710d79436c0a6411ece0fff2016[38], strings5696f710d79436c0a6411ece0fff2016[39]};
      var0[11] = new Es_1(var13);
      var10004 = strings5696f710d79436c0a6411ece0fff2016[40];
      String[] var14 = new String[]{strings5696f710d79436c0a6411ece0fff2016[41], strings5696f710d79436c0a6411ece0fff2016[42]};
      var0[12] = new Es_1(var14);
      var10004 = strings5696f710d79436c0a6411ece0fff2016[43];
      String[] var15 = new String[]{strings5696f710d79436c0a6411ece0fff2016[44], strings5696f710d79436c0a6411ece0fff2016[45]};
      var0[13] = new Es_1(var15);
      var0[14] = new Es_1[]{
         (Es_1)var0[0],
         (Es_1)var0[1],
         (Es_1)var0[2],
         (Es_1)var0[3],
         (Es_1)var0[4],
         (Es_1)var0[5],
         (Es_1)var0[6],
         (Es_1)var0[7],
         (Es_1)var0[8],
         (Es_1)var0[9],
         (Es_1)var0[10],
         (Es_1)var0[11],
         (Es_1)var0[12],
         (Es_1)var0[13]
      };
      staticFields5696f710d79436c0a6411ece0fff2016 = var0;
   }

   private Es_1(String... var3) {
      this.id_case();
      this.fields5696f710d79436c0a6411ece0fff2016[shorts5696f710d79436c0a6411ece0fff2016[1]] = var3;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8812346209545728543L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1489077;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{38, 4, 53, 90, 12, 63, -95, 31}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static String[] id_class() {
      HashSet var0 = new HashSet();
      Es_1[] var1 = values();
      int var2 = var1.length;

      for (int var3 = booleans5696f710d79436c0a6411ece0fff2016[2]; var3 < var2; var3++) {
         Es_1 var4 = var1[var3];
         var0.addAll(Arrays.asList((String[])var4.fields5696f710d79436c0a6411ece0fff2016[shorts5696f710d79436c0a6411ece0fff2016[3]]));
      }

      return var0.toArray(new String[booleans5696f710d79436c0a6411ece0fff2016[3]]);
   }

   public static Es_1 id_break(String var0) {
      Es_1[] var1 = values();
      int var2 = var1.length;

      for (int var3 = booleans5696f710d79436c0a6411ece0fff2016[0]; var3 < var2; var3++) {
         Es_1 var4 = var1[var3];
         String[] var5 = (String[])var4.fields5696f710d79436c0a6411ece0fff2016[shorts5696f710d79436c0a6411ece0fff2016[2]];
         int var6 = var5.length;

         for (int var7 = booleans5696f710d79436c0a6411ece0fff2016[1]; var7 < var6; var7++) {
            String var8 = var5[var7];
            if (var8.equalsIgnoreCase(var0)) {
               return var4;
            }
         }
      }

      return null;
   }

   private static void id_throws() {
      shorts5696f710d79436c0a6411ece0fff2016 = new short[]{14, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
   }

   private static void id_catch() {
      bytes5696f710d79436c0a6411ece0fff2016 = new byte[]{
         14,
         2,
         3,
         4,
         5,
         6,
         7,
         8,
         9,
         10,
         11,
         12,
         13,
         3,
         2,
         3,
         2,
         2,
         2,
         2,
         3,
         2,
         3,
         4,
         4,
         2,
         3,
         4,
         5,
         2,
         5,
         6,
         2,
         6,
         7,
         2,
         7,
         8,
         2,
         8,
         9,
         2,
         9,
         10,
         2,
         10,
         11,
         2,
         11,
         12,
         2,
         12,
         13,
         2,
         13,
         14,
         15
      };
   }

   private void id_case() {
      if (this.fields5696f710d79436c0a6411ece0fff2016 == null) {
         this.fields5696f710d79436c0a6411ece0fff2016 = new Object[booleans5696f710d79436c0a6411ece0fff2016[38]];
         Object[] var1 = this.fields5696f710d79436c0a6411ece0fff2016;
      }
   }

   private static void id_protected() {
      strings5696f710d79436c0a6411ece0fff2016 = new String[]{
         new String("POS1"),
         new String("pos1"),
         new String("p1"),
         new String("1"),
         new String("POS2"),
         new String("pos2"),
         new String("p2"),
         new String("2"),
         new String("CLEAR"),
         new String("clear"),
         new String("c"),
         new String("UNDO"),
         new String("undo"),
         new String("u"),
         new String("SET"),
         new String("set"),
         new String("fill"),
         new String("s"),
         new String("f"),
         new String("WALLS"),
         new String("walls"),
         new String("w"),
         new String("SHELL"),
         new String("shell"),
         new String("shl"),
         new String("CLEARAREA"),
         new String("cleararea"),
         new String("ca"),
         new String("REPLACE"),
         new String("replace"),
         new String("r"),
         new String("EXPAND"),
         new String("expand"),
         new String("ex"),
         new String("COPY"),
         new String("copy"),
         new String("cp"),
         new String("PASTE"),
         new String("paste"),
         new String("p"),
         new String("CONTRACT"),
         new String("contract"),
         new String("ct"),
         new String("SHIFT"),
         new String("shift"),
         new String("sh")
      };
   }

   private static void id_private() {
      booleans5696f710d79436c0a6411ece0fff2016 = new boolean[]{
         false,
         false,
         false,
         false,
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
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         true
      };
   }
}
