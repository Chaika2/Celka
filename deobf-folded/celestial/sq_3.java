package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum sq_3 {
   private static String[] strings7c97b86bc96f32548c9e3133b384faa8;
   private static short[] shorts7c97b86bc96f32548c9e3133b384faa8;
   public Object[] fields7c97b86bc96f32548c9e3133b384faa8;
   private static boolean[] booleans7c97b86bc96f32548c9e3133b384faa8;
   private static byte[] bytes7c97b86bc96f32548c9e3133b384faa8;
   public static Object[] staticFields7c97b86bc96f32548c9e3133b384faa8;

   private void id_byte() {
      if (this.fields7c97b86bc96f32548c9e3133b384faa8 == null) {
         this.fields7c97b86bc96f32548c9e3133b384faa8 = new Object[1];
         Object[] var1 = this.fields7c97b86bc96f32548c9e3133b384faa8;
      }
   }

   private sq_3(Predicate<an_3> var3) {
      this.id_byte();
      this.fields7c97b86bc96f32548c9e3133b384faa8[shorts7c97b86bc96f32548c9e3133b384faa8[1]] = var3;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{5, -12, -32, 0, 5, -54, 21, 10}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1138194812;
   }

   private static void id_class() {
      strings7c97b86bc96f32548c9e3133b384faa8 = new String[]{new String("ENTITIES"), new String("PLAYERS")};
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6618958478045194288L;
   }

   private static void id_break() {
      Object[] var0 = new Object[]{new sq_3(iB_2.class::isInstance), new sq_3(rhd_3.class::isInstance), null};
      var0[2] = new sq_3[]{(sq_3)var0[0], (sq_3)var0[1]};
      staticFields7c97b86bc96f32548c9e3133b384faa8 = var0;
   }

   private static void id_catch() {
      shorts7c97b86bc96f32548c9e3133b384faa8 = new short[]{2, 0, 0, 1};
   }

   private static void id_case() {
      booleans7c97b86bc96f32548c9e3133b384faa8 = new boolean[]{false, true, false, false, true, true, true};
   }

   private static void id_protected() {
      bytes7c97b86bc96f32548c9e3133b384faa8 = new byte[]{2, 2, 3};
   }
}
