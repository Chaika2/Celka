package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Bv_1 extends Pv_1 {
   private static boolean[] break_;
   private static short[] byte_;
   private static byte[] protected_;

   private static void byte_() {
      byte_ = new short[]{1};
   }

   public Bv_1(C_class var1) {
      super(var1);
   }

   static {
      ntfClinit();
   }

   @Override
   public void class_(rrLu_1 var1) {
      super.class_(var1);
      if (var1.class_() instanceof rvQ_2 var2 && var2.break_() == 35 && var2.class_(((Ps_1)this.class_[1]).case_()) instanceof rhd_3 var4) {
         rdn_3[] var5 = rrfH_2.class_(var4);

         for (rdn_3 var9 : var5) {
            if (var9.break_() == rdy_3.kL) {
               rrAp_1.class_(var4, var9);
               break;
            }
         }
      }
   }

   private static void class_() {
      protected_ = new byte[]{35};
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 359486306;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3757962789593181448L;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{23, -8, -79, 90, -100, 64, 94, 84}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      break_ = new boolean[1];
   }
}
