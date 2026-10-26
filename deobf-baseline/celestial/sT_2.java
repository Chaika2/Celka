package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum sT_2 {
   private static byte[] bytesd035b37d0ef43a14a807173dd90a9560;
   private static String[] stringsd035b37d0ef43a14a807173dd90a9560;
   public static Object[] staticFieldsd035b37d0ef43a14a807173dd90a9560;
   private static boolean[] booleansd035b37d0ef43a14a807173dd90a9560;
   private static short[] shortsd035b37d0ef43a14a807173dd90a9560;
   public Object[] fieldsd035b37d0ef43a14a807173dd90a9560;

   private sT_2(C_double var3) {
      this.id_case();
      this.fieldsd035b37d0ef43a14a807173dd90a9560[shortsd035b37d0ef43a14a807173dd90a9560[1]] = var3;
   }

   static {
      ntfClinit();
   }

   private static void id_class() {
      bytesd035b37d0ef43a14a807173dd90a9560 = new byte[]{2, 2, 3};
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2045281285120453566L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-95, 11, 112, 121, -43, 84, -22, -33}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 120817260;
   }

   private static void id_break() {
      shortsd035b37d0ef43a14a807173dd90a9560 = new short[]{2, 0, 0, 1};
   }

   private static void id_throws() {
      Object[] var0 = new Object[]{new sT_2(new C_default()), new sT_2(new B()), null};
      var0[2] = new sT_2[]{(sT_2)var0[0], (sT_2)var0[1]};
      staticFieldsd035b37d0ef43a14a807173dd90a9560 = var0;
   }

   private static void id_catch() {
      booleansd035b37d0ef43a14a807173dd90a9560 = new boolean[]{false, true, false, false, false, true, false, true, true};
   }

   private void id_case() {
      if (this.fieldsd035b37d0ef43a14a807173dd90a9560 == null) {
         this.fieldsd035b37d0ef43a14a807173dd90a9560 = new Object[booleansd035b37d0ef43a14a807173dd90a9560[8]];
         Object[] var1 = this.fieldsd035b37d0ef43a14a807173dd90a9560;
      }
   }

   private static void id_protected() {
      stringsd035b37d0ef43a14a807173dd90a9560 = new String[]{new String("ENTITY"), new String("PLAYER")};
   }
}
