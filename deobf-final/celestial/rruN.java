package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rruN {
   ;
   private static short[] shorts36ebb780c771397e903bfcb65c8ed147;
   private static String[] strings36ebb780c771397e903bfcb65c8ed147;
   public Object[] fields36ebb780c771397e903bfcb65c8ed147;
   private static boolean[] booleans36ebb780c771397e903bfcb65c8ed147;
   private static byte[] bytes36ebb780c771397e903bfcb65c8ed147;
   public static Object[] staticFields36ebb780c771397e903bfcb65c8ed147;

   private static void byte_() {
      shorts36ebb780c771397e903bfcb65c8ed147 = new short[]{5, 0, 0, 0, 1, 2, 3, 4};
   }

   private rruN(String var3) {
      this.break_();
      this.fields36ebb780c771397e903bfcb65c8ed147[0] = var3;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3853282229258830282L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-103, 52, -37, -4, -59, 86, 45, -125}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 880110962;
   }

   public String class_() {
      return (String)this.fields36ebb780c771397e903bfcb65c8ed147[0];
   }

   private void break_() {
      if (this.fields36ebb780c771397e903bfcb65c8ed147 == null) {
         this.fields36ebb780c771397e903bfcb65c8ed147 = new Object[1];
         Object[] var1 = this.fields36ebb780c771397e903bfcb65c8ed147;
      }
   }

   private static void throws_() {
      strings36ebb780c771397e903bfcb65c8ed147 = new String[]{
         new String("ADDITION"),
         new String("[+]"),
         new String("IMPROVEMENT"),
         new String("[*]"),
         new String("RENAME"),
         new String("[~]"),
         new String("FIX"),
         new String("[/]"),
         new String("REMOVAL"),
         new String("[-]")
      };
   }

   private static void catch_() {
      bytes36ebb780c771397e903bfcb65c8ed147 = new byte[]{5, 2, 3, 4, 2, 2, 3, 3, 4, 4, 5, 6};
   }

   private static void protected_() {
      booleans36ebb780c771397e903bfcb65c8ed147 = new boolean[]{false, true, false, false, true, true, true};
   }

   private static void private_() {
      Object[] var0 = new Object[]{new rruN("[+]"), new rruN("[*]"), new rruN("[~]"), new rruN("[/]"), new rruN("[-]"), null};
      var0[5] = new rruN[]{(rruN)var0[0], (rruN)var0[1], (rruN)var0[2], (rruN)var0[3], (rruN)var0[4]};
      staticFields36ebb780c771397e903bfcb65c8ed147 = var0;
   }
}
