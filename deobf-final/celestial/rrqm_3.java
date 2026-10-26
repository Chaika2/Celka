package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrqm_3 extends rrqk_3 {
   private static short[] byte_;
   private static boolean[] protected_;

   private static void int_() {
      protected_ = new boolean[2];
   }

   public rrqm_3(XRay<?> var1) {
      super(var1);
   }

   static {
      ntfClinit();
   }

   @EventTarget
   public void class_(rrLu_1 var1) {
      if (var1.class_() instanceof rvj_3 var3) {
         xd_3 var4 = var3.break_().break_();
         rfH_2 var5 = var3.byte_();

         for (rrqz_3 var7 : ((rrqQ_2)rrqQ_2.staticFieldsaf585ffa18e23930a314cd0048f74bf2[0]).break_()) {
            if (var7.byte_() == var4) {
               this.class_(new rrqc_3(new rrqz_3(var4, ((rrqQ_2)rrqQ_2.staticFieldsaf585ffa18e23930a314cd0048f74bf2[0]).class_(var4)), var5, var5));
               break;
            }
         }
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5893049719233734085L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1354853200;
   }

   @Override
   public void class_(q_1 var1) {
      super.class_(var1);
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         XRay var2 = this.continue_();
         if (!var2.continue_()) {
            return;
         }

         List var3 = this.extends_();
         float var4 = this.continue_().new_().byte_();

         for (int var5 = 0; (float)var5 < var4 && !var3.isEmpty(); var5++) {
            rja_3 var6 = (rja_3)var3.remove(0);
            ((Aq_1)((cb_3)import_.class_[57]).break_[0]).break_(new rZb_1(rZM.STOP_DESTROY_BLOCK, new rfH_2(var6), rpr_3.UP));
            this.class_(var6);
            this.class_();
         }
      }
   }

   private static void new_() {
      byte_ = new short[]{0, 57, 0, 0, 0};
   }

   public static String protected_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{117, -53, -65, 69, -12, -54, 37, 112}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }
}
