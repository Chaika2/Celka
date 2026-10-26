package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class rrCz_1 extends rrCk_1 {
   private static short[] byte_;
   private static byte[] protected_;
   private static boolean[] case_;
   public Object[] break_;

   @Override
   public void byte_() {
      rdn_3 var1 = ((cb_3)import_.class_[57]).Sn();
      if (!this.continue_().continue_()) {
         Pair var2 = this.continue_().this_();
         int var3 = (Integer)var2.getRight();
         if (var3 >= 0) {
            var3 = rrfY_2.break_(var3);
            if (!var1.class_()) {
               ((rrmi_3)this.class_[1]).class_(var1, var3);
            }

            ((Ax_1)import_.class_[55]).class_(((rJr_1)((cb_3)import_.class_[57]).implements_[4]).case_, var3, 40, rXa_1.SWAP, false);
            Boolean var8 = true;
            this.class_[0] = var8;
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(rrLY.class_());
         }
      }
   }

   public rrCz_1(AutoTotem var1) {
      super(var1);
      this.implements_();
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -893705568;
   }

   @EventTarget
   public void class_(q_1 var1) {
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         if (this.continue_().super_()) {
            this.byte_();
         } else {
            this.class_();
         }
      }
   }

   @EventTarget
   public void class_(rrAM var1) {
      this.throws_();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8797402902491132945L;
   }

   @Override
   public void class_() {
      this.implements_();
      if ((Boolean)this.class_[0] && ((rrmi_3)this.class_[1]).class_()) {
         int var10002 = (Integer)this.break_[0] + 1;
         Integer var6 = var10002;
         this.break_[0] = var6;
         if (var10002 > 1) {
            int var1 = ((rrmi_3)this.class_[1]).class_(true);
            if (var1 < 0) {
               return;
            }

            ((Ax_1)import_.class_[55]).class_(((rJr_1)((cb_3)import_.class_[57]).implements_[4]).case_, var1, 40, rXa_1.SWAP, false);
            this.throws_();
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(rrLY.class_());
         }
      }
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{57, 108, -37, 119, -16, -31, -16, -9}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void throws_() {
      this.implements_();
      ((rrmi_3)this.class_[1]).throws_();
      Boolean var5 = false;
      this.class_[0] = var5;
      Integer var6 = 0;
      this.break_[0] = var6;
   }

   private static void finally_() {
      byte_ = new short[]{0, 57, 1, 55, 57, 4, 0, 0, 0, 1, 0, 0, 1, 55, 57, 4, 0, 1, 0, 0};
   }

   private static void case_() {
      case_ = new boolean[]{false, true, true, true, true, false, false, false, false, true, false, false};
   }

   private void implements_() {
      if (this.break_ == null) {
         this.break_ = new Object[1];
         this.break_[0] = 0;
      }
   }

   private static void private_() {
      protected_ = new byte[]{40, 40};
   }

   @Override
   public boolean aK_() {
      this.throws_();
      return super.aK_();
   }
}
