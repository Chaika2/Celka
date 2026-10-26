package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashSet;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum Es_1 {
   ;
   private static byte[] bytes5696f710d79436c0a6411ece0fff2016;
   private static String[] strings5696f710d79436c0a6411ece0fff2016;
   private static boolean[] booleans5696f710d79436c0a6411ece0fff2016;
   public static Object[] staticFields5696f710d79436c0a6411ece0fff2016;
   private static short[] shorts5696f710d79436c0a6411ece0fff2016;
   public Object[] fields5696f710d79436c0a6411ece0fff2016;

   private static void byte_() {
      Object[] var0 = new Object[15];
      String[] var2 = new String[]{"pos1", "p1", "1"};
      var0[0] = new Es_1(var2);
      String[] var3 = new String[]{"pos2", "p2", "2"};
      var0[1] = new Es_1(var3);
      String[] var4 = new String[]{"clear", "c"};
      var0[2] = new Es_1(var4);
      String[] var5 = new String[]{"undo", "u"};
      var0[3] = new Es_1(var5);
      String[] var6 = new String[]{"set", "fill", "s", "f"};
      var0[4] = new Es_1(var6);
      String[] var7 = new String[]{"walls", "w"};
      var0[5] = new Es_1(var7);
      String[] var8 = new String[]{"shell", "shl"};
      var0[6] = new Es_1(var8);
      String[] var9 = new String[]{"cleararea", "ca"};
      var0[7] = new Es_1(var9);
      String[] var10 = new String[]{"replace", "r"};
      var0[8] = new Es_1(var10);
      String[] var11 = new String[]{"expand", "ex"};
      var0[9] = new Es_1(var11);
      String[] var12 = new String[]{"copy", "cp"};
      var0[10] = new Es_1(var12);
      String[] var13 = new String[]{"paste", "p"};
      var0[11] = new Es_1(var13);
      String[] var14 = new String[]{"contract", "ct"};
      var0[12] = new Es_1(var14);
      String[] var15 = new String[]{"shift", "sh"};
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
      this.case_();
      this.fields5696f710d79436c0a6411ece0fff2016[0] = var3;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8812346209545728543L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1489077;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{38, 4, 53, 90, 12, 63, -95, 31}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static String[] class_() {
      HashSet var0 = new HashSet();

      for (Es_1 var4 : values()) {
         var0.addAll(Arrays.asList((String[])var4.fields5696f710d79436c0a6411ece0fff2016[0]));
      }

      return var0.toArray(new String[0]);
   }

   public static Es_1 break_(String var0) {
      for (Es_1 var4 : values()) {
         for (String var8 : (String[])var4.fields5696f710d79436c0a6411ece0fff2016[0]) {
            if (var8.equalsIgnoreCase(var0)) {
               return var4;
            }
         }
      }

      return null;
   }

   private static void throws_() {
      shorts5696f710d79436c0a6411ece0fff2016 = new short[]{14, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
   }

   private static void catch_() {
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

   private void case_() {
      if (this.fields5696f710d79436c0a6411ece0fff2016 == null) {
         this.fields5696f710d79436c0a6411ece0fff2016 = new Object[1];
         Object[] var1 = this.fields5696f710d79436c0a6411ece0fff2016;
      }
   }

   private static void protected_() {
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

   private static void private_() {
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
