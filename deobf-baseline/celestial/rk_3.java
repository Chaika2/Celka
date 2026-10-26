package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rk_3 {
   public static Object[] staticFields5f483cd00ec6343b89d8ec7a44fc67de;
   public Object[] fields5f483cd00ec6343b89d8ec7a44fc67de;
   private static boolean[] booleans5f483cd00ec6343b89d8ec7a44fc67de;
   private static String[] strings5f483cd00ec6343b89d8ec7a44fc67de;
   private static short[] shorts5f483cd00ec6343b89d8ec7a44fc67de;
   private static byte[] bytes5f483cd00ec6343b89d8ec7a44fc67de;

   private rk_3(boolean var3) {
      this.id_private();
      Boolean var8 = var3;
      this.fields5f483cd00ec6343b89d8ec7a44fc67de[shorts5f483cd00ec6343b89d8ec7a44fc67de[1]] = var8;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8040588162469199241L;
   }

   public boolean id_class() {
      return (Boolean)this.fields5f483cd00ec6343b89d8ec7a44fc67de[shorts5f483cd00ec6343b89d8ec7a44fc67de[2]];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 328909569;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{98, -45, -128, -51, -127, 74, -116, -60}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      shorts5f483cd00ec6343b89d8ec7a44fc67de = new short[]{7, 0, 0, 0, 1, 2, 3, 4, 5, 6};
   }

   private static void id_throws() {
      booleans5f483cd00ec6343b89d8ec7a44fc67de = new boolean[]{
         false, true, false, false, false, true, false, true, false, true, true, true, true, true, false, false
      };
   }

   private static void id_catch() {
      Object[] var0 = new Object[]{new rk_3(false), new rk_3(false), new rk_3(false), new rk_3(true), new rk_3(true), new rk_3(true), new rk_3(true), null};
      var0[7] = new rk_3[]{(rk_3)var0[0], (rk_3)var0[1], (rk_3)var0[2], (rk_3)var0[3], (rk_3)var0[4], (rk_3)var0[5], (rk_3)var0[6]};
      staticFields5f483cd00ec6343b89d8ec7a44fc67de = var0;
   }

   private static void id_case() {
      bytes5f483cd00ec6343b89d8ec7a44fc67de = new byte[]{7, 2, 3, 4, 5, 6, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 8};
   }

   private static void id_protected() {
      strings5f483cd00ec6343b89d8ec7a44fc67de = new String[]{
         new String("PREPPING"),
         new String("WAITING"),
         new String("RUNNING"),
         new String("SUCCESS"),
         new String("UNREACHABLE"),
         new String("FAILED"),
         new String("CANCELED")
      };
   }

   private void id_private() {
      if (this.fields5f483cd00ec6343b89d8ec7a44fc67de == null) {
         this.fields5f483cd00ec6343b89d8ec7a44fc67de = new Object[booleans5f483cd00ec6343b89d8ec7a44fc67de[13]];
         Object[] var1 = this.fields5f483cd00ec6343b89d8ec7a44fc67de;
         var1[booleans5f483cd00ec6343b89d8ec7a44fc67de[14]] = booleans5f483cd00ec6343b89d8ec7a44fc67de[15];
      }
   }
}
