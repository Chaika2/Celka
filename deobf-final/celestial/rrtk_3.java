package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrtk_3 extends rrtd_3 {
   private static short[] throws_;
   private static boolean[] case_;
   public Object[] protected_;

   public static String byte_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{26, 57, 41, -102, 106, -112, -126, -47}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrtk_3(String var1, String var2, int var3, rrtz_3 var4) {
      this(new rgN_2(var1), new rgN_2(var2), var3, var4);
   }

   public rrtk_3(rVi_1 var1, rVi_1 var2, int var3, rrtz_3 var4) {
      super(var1, var2, var3);
      this.synchronized_();
      this.protected_[0] = var4;
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      case_ = new boolean[]{true};
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1356303449;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8037362624815299927L;
   }

   @Override
   public rqA_2 throws_() {
      this.synchronized_();

      return switch (((int[])rrtW_2.class_[0])[((rrtz_3)this.protected_[0]).ordinal()]) {
         case 1, 2 -> rqn_3.zh;
         case 3 -> rqn_3.zX;
         default -> throw new IncompatibleClassChangeError();
      };
   }

   private static void else_() {
      throws_ = new short[3];
   }

   private void synchronized_() {
      if (this.protected_ == null) {
         this.protected_ = new Object[1];
         Object[] var1 = this.protected_;
      }
   }
}
