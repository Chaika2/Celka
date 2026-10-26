package celestial;

import java.nio.charset.StandardCharsets;
import java.util.LinkedHashSet;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum sl_3 {
   private static boolean[] booleans30c4eacb1e233b1abdfca916ea51d438;
   private static short[] shorts30c4eacb1e233b1abdfca916ea51d438;
   private static String[] strings30c4eacb1e233b1abdfca916ea51d438;
   public Object[] fields30c4eacb1e233b1abdfca916ea51d438;
   private static byte[] bytes30c4eacb1e233b1abdfca916ea51d438;
   public static Object[] staticFields30c4eacb1e233b1abdfca916ea51d438;

   private sl_3(String... var3) {
      this.id_catch();
      this.fields30c4eacb1e233b1abdfca916ea51d438[0] = var3;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3412381848074725101L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 956013740;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-102, -128, -54, -128, -7, 0, -76, 8}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static String[] id_class() {
      LinkedHashSet var0 = new LinkedHashSet();

      for (sl_3 var4 : values()) {
         var0.add(((String[])var4.fields30c4eacb1e233b1abdfca916ea51d438[0])[0]);
      }

      return var0.toArray(new String[0]);
   }

   public static sl_3 id_break(String var0) {
      for (sl_3 var4 : values()) {
         for (String var8 : (String[])var4.fields30c4eacb1e233b1abdfca916ea51d438[0]) {
            if (var8.equalsIgnoreCase(var0)) {
               return var4;
            }
         }
      }

      return null;
   }

   private static void id_break() {
      bytes30c4eacb1e233b1abdfca916ea51d438 = new byte[]{3, 2, 2, 2, 2, 2, 2, 3, 4};
   }

   private static void id_throws() {
      strings30c4eacb1e233b1abdfca916ea51d438 = new String[]{
         new String("POS1"),
         new String("pos1"),
         new String("p1"),
         new String("POS2"),
         new String("pos2"),
         new String("p2"),
         new String("SELECTION"),
         new String("sel"),
         new String("selection")
      };
   }

   private void id_catch() {
      if (this.fields30c4eacb1e233b1abdfca916ea51d438 == null) {
         this.fields30c4eacb1e233b1abdfca916ea51d438 = new Object[1];
         Object[] var1 = this.fields30c4eacb1e233b1abdfca916ea51d438;
      }
   }

   private static void id_case() {
      booleans30c4eacb1e233b1abdfca916ea51d438 = new boolean[]{
         false, false, false, false, false, false, true, false, false, true, false, true, false, true, true, false, true, true
      };
   }

   private static void id_protected() {
      Object[] var0 = new Object[4];
      String[] var2 = new String[]{"pos1", "p1"};
      var0[0] = new sl_3(var2);
      String[] var3 = new String[]{"pos2", "p2"};
      var0[1] = new sl_3(var3);
      String[] var4 = new String[]{"sel", "selection"};
      var0[2] = new sl_3(var4);
      var0[3] = new sl_3[]{(sl_3)var0[0], (sl_3)var0[1], (sl_3)var0[2]};
      staticFields30c4eacb1e233b1abdfca916ea51d438 = var0;
   }

   private static void id_private() {
      shorts30c4eacb1e233b1abdfca916ea51d438 = new short[]{3, 0, 0, 0, 0, 1, 2};
   }
}
