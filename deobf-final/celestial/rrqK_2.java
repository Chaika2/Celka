package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.IntSupplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrqK_2 {
   ;
   public static Object[] staticFields052c2fa722bb33cbaa8dc8a4acf6b5f3;
   private static byte[] bytes052c2fa722bb33cbaa8dc8a4acf6b5f3;
   private static short[] shorts052c2fa722bb33cbaa8dc8a4acf6b5f3;
   private static String[] strings052c2fa722bb33cbaa8dc8a4acf6b5f3;
   private static boolean[] booleans052c2fa722bb33cbaa8dc8a4acf6b5f3;
   public Object[] fields052c2fa722bb33cbaa8dc8a4acf6b5f3;

   private void byte_() {
      if (this.fields052c2fa722bb33cbaa8dc8a4acf6b5f3 == null) {
         this.fields052c2fa722bb33cbaa8dc8a4acf6b5f3 = new Object[1];
      }
   }

   private rrqK_2(IntSupplier var3) {
      this.byte_();
      this.fields052c2fa722bb33cbaa8dc8a4acf6b5f3[0] = var3;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4300174724976002016L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{64, 91, -25, 30, -30, 120, -22, -14}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public IntSupplier class_() {
      return (IntSupplier)this.fields052c2fa722bb33cbaa8dc8a4acf6b5f3[0];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1033652860;
   }

   private static void break_() {
      Object[] var0 = new Object[]{
         new rrqK_2(((rrIz_1)BlockEsp.byte_[7])::byte_),
         new rrqK_2(((rrIz_1)BlockEsp.byte_[8])::byte_),
         new rrqK_2(((rrIz_1)BlockEsp.byte_[9])::byte_),
         new rrqK_2(((rrIz_1)BlockEsp.byte_[11])::byte_),
         new rrqK_2(((rrIz_1)BlockEsp.byte_[12])::byte_),
         new rrqK_2(((rrIz_1)BlockEsp.byte_[13])::byte_),
         new rrqK_2(((rrIz_1)BlockEsp.byte_[10])::byte_),
         null
      };
      var0[7] = new rrqK_2[]{(rrqK_2)var0[0], (rrqK_2)var0[1], (rrqK_2)var0[2], (rrqK_2)var0[3], (rrqK_2)var0[4], (rrqK_2)var0[5], (rrqK_2)var0[6]};
      staticFields052c2fa722bb33cbaa8dc8a4acf6b5f3 = var0;
   }

   private static void throws_() {
      booleans052c2fa722bb33cbaa8dc8a4acf6b5f3 = new boolean[]{false, true, false, false, true, true, true};
   }

   private static void catch_() {
      bytes052c2fa722bb33cbaa8dc8a4acf6b5f3 = new byte[]{7, 2, 3, 4, 5, 6, 7, 8, 2, 9, 2, 3, 11, 3, 4, 12, 4, 5, 13, 5, 6, 10, 6, 7, 8};
   }

   private static void case_() {
      shorts052c2fa722bb33cbaa8dc8a4acf6b5f3 = new short[]{7, 0, 0, 0, 1, 2, 3, 4, 5, 6};
   }

   private static void protected_() {
      strings052c2fa722bb33cbaa8dc8a4acf6b5f3 = new String[]{
         new String("SPAWNER"),
         new String("SHULKER"),
         new String("CHEST"),
         new String("MINECART"),
         new String("DISPENSER"),
         new String("GIFT"),
         new String("BARREL")
      };
   }
}
