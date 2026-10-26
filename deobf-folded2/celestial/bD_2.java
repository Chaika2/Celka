package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bD_2 extends rqr_3 {
   private static short[] id_volatile;
   private static boolean[] id_final;
   private static float[] id_package;
   public Object[] id_class;
   private static double[] id_int;

   public bD_2(bV_2 var1) {
      this.id_catch();
      this.id_class[0] = var1;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-128, 76, -90, -35, -44, -48, -91, -20}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_class(boolean var1) {
      this.id_catch();
      this.id_break = 0.0F;
      this.id_byte = 0.0F;
      this.id_private = ((bV_2)this.id_class[0]).id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[6]);
      if (this.id_protected = ((bV_2)this.id_class[0]).id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[0])) {
         this.id_byte++;
      }

      if (this.id_throws = ((bV_2)this.id_class[0]).id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[1])) {
         this.id_byte--;
      }

      if (this.id_case = ((bV_2)this.id_class[0]).id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[2])) {
         this.id_break++;
      }

      if (this.id_catch = ((bV_2)this.id_class[0]).id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[3])) {
         this.id_break--;
      }

      if (this.id_implements = ((bV_2)this.id_class[0]).id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[7])) {
         this.id_break = (float)((double)this.id_break * 0.3);
         this.id_byte = (float)((double)this.id_byte * 0.3);
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -783662286;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1787823403877654655L;
   }

   private static void id_throws() {
      id_package = new float[]{0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 1.0F};
   }

   private void id_catch() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_case() {
      id_volatile = new short[]{0, 0, 6, 0, 0, 0, 1, 0, 2, 0, 3, 0, 7};
   }

   private static void id_implements() {
      id_final = new boolean[]{true};
   }

   private static void id_private() {
      id_int = new double[]{0.3, 0.3};
   }
}
