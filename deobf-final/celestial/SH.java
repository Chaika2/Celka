package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class SH extends Sv_1 {
   public Object[] break_;
   private static byte[] byte_;
   private static boolean[] protected_;
   private static short[] throws_;

   public static String byte_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-74, 2, 101, -7, 71, 0, -111, 98}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void byte_() {
      this.finally_();
      super.byte_();
      Boolean var5 = false;
      this.break_[0] = var5;
      Integer var6 = 0;
      this.break_[1] = var6;
   }

   public SH(SL var1) {
      super(var1);
      this.finally_();
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5444140911029213933L;
   }

   @Override
   public void class_(rrAM var1) {
      this.finally_();
      super.class_(var1);
      SL var2 = this.case_();
      SC var3 = var2.catch_();
      if (var3 != null) {
         Boolean var8 = true;
         this.break_[0] = var8;
         this.case_().class_();
      }
   }

   @Override
   public void class_(q_1 var1) {
      this.finally_();
      super.class_(var1);
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         SL var2 = this.case_();
         SC var3 = var2.catch_();
         if (var3 == null || !(Boolean)this.break_[0]) {
            return;
         }

         int var4 = (rrfq_3)rrfp_3.class_[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4] ? 0 : byte_[0];
         if (var3 instanceof Sl_1 var5) {
            int var6 = var5.break_();
            if (var6 > 0) {
               var4 = var6;
            }
         }

         int var10002 = (Integer)this.break_[1] + 1;
         Integer var11 = var10002;
         this.break_[1] = var11;
         if (var10002 >= var4 && !C_throws.byte_().try_().class_(true)) {
            ((cb_3)import_.class_[57]).case_("/" + var3.byte_());
            Integer var12 = -10;
            this.break_[1] = var12;
         }
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1456044445;
   }

   @Override
   public boolean break_(String var1) {
      PI var2 = PI.break_(var1);
      if (var2 != null) {
         Pf_1 var3 = var2.class_();
         if (var3 != null) {
            return var3.break_();
         }
      }

      return protected_[0];
   }

   @Override
   public String throws_() {
      PI var1 = C_throws.byte_().native_().protected_();
      if (var1 != null) {
         Pf_1 var2 = var1.class_();
         if (var2 != null) {
            return var2.class_() + var1.break_();
         }
      }

      return null;
   }

   private void finally_() {
      if (this.break_ == null) {
         this.break_ = new Object[2];
         Object[] var1 = this.break_;
         var1[0] = false;
         var1[1] = 0;
      }
   }

   private static void extends_() {
      protected_ = new boolean[]{false, false, false, true, false, true, true, false, false, true, false};
   }

   private static void implements_() {
      throws_ = new short[]{0, 1, 0, 0, 0, 1, 4, 1, 1, 57, 1};
   }

   private static void private_() {
      byte_ = new byte[]{17, -10, 2};
   }
}
