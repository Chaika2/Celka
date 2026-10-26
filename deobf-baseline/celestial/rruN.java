package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rruN {
   private static short[] shorts36ebb780c771397e903bfcb65c8ed147;
   private static String[] strings36ebb780c771397e903bfcb65c8ed147;
   public Object[] fields36ebb780c771397e903bfcb65c8ed147;
   private static boolean[] booleans36ebb780c771397e903bfcb65c8ed147;
   private static byte[] bytes36ebb780c771397e903bfcb65c8ed147;
   public static Object[] staticFields36ebb780c771397e903bfcb65c8ed147;

   private static void id_byte() {
      shorts36ebb780c771397e903bfcb65c8ed147 = new short[]{5, 0, 0, 0, 1, 2, 3, 4};
   }

   private rruN(String var3) {
      this.id_break();
      this.fields36ebb780c771397e903bfcb65c8ed147[shorts36ebb780c771397e903bfcb65c8ed147[2]] = var3;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3853282229258830282L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-103, 52, -37, -4, -59, 86, 45, -125}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 880110962;
   }

   public String id_class() {
      return (String)this.fields36ebb780c771397e903bfcb65c8ed147[shorts36ebb780c771397e903bfcb65c8ed147[1]];
   }

   private void id_break() {
      if (this.fields36ebb780c771397e903bfcb65c8ed147 == null) {
         this.fields36ebb780c771397e903bfcb65c8ed147 = new Object[booleans36ebb780c771397e903bfcb65c8ed147[6]];
         Object[] var1 = this.fields36ebb780c771397e903bfcb65c8ed147;
      }
   }

   private static void id_throws() {
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

   private static void id_catch() {
      bytes36ebb780c771397e903bfcb65c8ed147 = new byte[]{5, 2, 3, 4, 2, 2, 3, 3, 4, 4, 5, 6};
   }

   private static void id_protected() {
      booleans36ebb780c771397e903bfcb65c8ed147 = new boolean[]{false, true, false, false, true, true, true};
   }

   private static void id_private() {
      Object[] var0 = new Object[]{
         new rruN(strings36ebb780c771397e903bfcb65c8ed147[1]),
         new rruN(strings36ebb780c771397e903bfcb65c8ed147[3]),
         new rruN(strings36ebb780c771397e903bfcb65c8ed147[5]),
         new rruN(strings36ebb780c771397e903bfcb65c8ed147[7]),
         new rruN(strings36ebb780c771397e903bfcb65c8ed147[9]),
         null
      };
      var0[5] = new rruN[]{(rruN)var0[0], (rruN)var0[1], (rruN)var0[2], (rruN)var0[3], (rruN)var0[4]};
      staticFields36ebb780c771397e903bfcb65c8ed147 = var0;
   }
}
