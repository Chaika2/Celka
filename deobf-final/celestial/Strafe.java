package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Strafe extends Module implements rrnZ_2 {
   private static double[] byte_;
   private static float[] protected_;
   private static boolean[] throws_;
   private static String[] catch_;
   private static byte[] private_;
   public Object[] break_;
   private static short[] implements_;

   public Strafe() {
      super("Strafe", "Позволяет не замедляться при\nдвижении в стороны", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[1]);
      this.while_();
      rrlX_2 var5 = new rrlX_2(this);
      this.break_[0] = var5;
   }

   static {
      ntfClinit();
   }

   public boolean this_() {
      this.while_();
      return (Boolean)this.break_[3];
   }

   @EventTarget
   public void class_(rrLW var1) {
      this.while_();
      ((rrlX_2)this.break_[0]).class_(var1);
   }

   @EventTarget
   public void class_(rrAl_1 var1) {
      this.while_();
      if (var1.class_() < 10.0F) {
         Boolean var6 = true;
         this.break_[3] = var6;
      }
   }

   @EventTarget
   public void class_(rrAo_1 var1) {
      this.while_();
      if ((Boolean)this.break_[2] && rmD_2.break_ != (Boolean)this.break_[1]) {
         var1.protected_(!rmD_2.break_ ? true : throws_[1]);
      }

      ((rrlX_2)this.break_[0]).class_(var1);
   }

   @EventTarget
   public void class_(rrAB var1) {
      this.while_();
      if ((Boolean)this.break_[2]) {
         var1.class_(true);
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5528047994387930442L;
   }

   @EventTarget
   public void class_(q_1 var1) {
      this.while_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         ((Qw_1)import_.class_[20]).Pr = false;
         Boolean var6 = this.throw_();
         this.break_[2] = var6;
         if ((Boolean)this.break_[3] && (Integer)((cb_3)import_.class_[57]).throws_[41] % 6 == 0) {
            Boolean var7 = false;
            this.break_[3] = var7;
            ((rrlX_2)this.break_[0]).class_(0.0);
         }
      }
   }

   @Override
   public void class_(boolean var1) {
      this.while_();
      super.class_(var1);
      ((rrlX_2)this.break_[0]).class_(0.15F);
   }

   @Override
   public void class_() {
      this.byte_(false);
   }

   @EventTarget
   public void class_(rrLz_1 var1) {
      this.while_();
      if ((Boolean)this.break_[2]) {
         var1.class_(((rrlX_2)this.break_[0]).class_(var1));
      } else {
         ((rrlX_2)this.break_[0]).class_(0.0);
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 330663405;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-13, -34, 113, -64, 10, -44, -7, -114}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void throws_(boolean var1) {
      super.throws_(var1);
      if ((cb_3)import_.class_[57] != null) {
         rjU_2 var2 = ((cb_3)import_.class_[57]).rv();
         var2.break_ *= 0.7;
         var2.protected_ *= 0.7;
      }
   }

   private static void goto_() {
      implements_ = new short[]{
         1, 0, 0, 2, 0, 0, 2, 1, 0, 2, 0, 20, 2, 3, 57, 41, 3, 0, 3, 0, 57, 56, 3, 57, 23, 57, 18, 57, 57, 57, 57, 0, 57, 57, 0, 1, 1, 2, 3
      };
   }

   public void case_(boolean var1) {
      this.while_();
      Boolean var6 = var1;
      this.break_[1] = var6;
   }

   public boolean continue_() {
      this.while_();
      return (Boolean)this.break_[1];
   }

   private static void else_() {
      private_ = new byte[]{6, 4, 2, 3};
   }

   private static void instanceof_() {
      protected_ = new float[]{10.0F};
   }

   public boolean new_() {
      this.while_();
      return (Boolean)this.break_[2];
   }

   private static void return_() {
      catch_ = new String[]{new String("Strafe"), new String("Позволяет не замедляться при\nдвижении в стороны")};
   }

   public rrlX_2 super_() {
      this.while_();
      return (rrlX_2)this.break_[0];
   }

   private boolean throw_() {
      this.while_();
      rrvT var1 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_();
      if ((cb_3)import_.class_[57] == null || (gm_3)import_.class_[56] == null) {
         return throws_[6];
      } else if ((Boolean)this.break_[3]) {
         return false;
      } else if (var1.strictfp_().aJ_() || var1.K().aJ_()) {
         return throws_[8];
      } else if (var1.B().aJ_() && (Boolean)((cb_3)import_.class_[57]).throws_[23]) {
         return false;
      } else if (rrfZ_2.protected_()) {
         return false;
      } else if (((rhx_3)((cb_3)import_.class_[57]).implements_[18]).break_) {
         return false;
      } else if (((cb_3)import_.class_[57]).break_(rLD.goto_)) {
         return false;
      } else if (((cb_3)import_.class_[57]).h()) {
         return false;
      } else if (((cb_3)import_.class_[57]).Sy()) {
         return false;
      } else {
         return ((cb_3)import_.class_[57]).PZ() ? false : throws_[16];
      }
   }

   private static void try_() {
      byte_ = new double[]{0.0, 0.0, 0.15F, 0.7, 0.7};
   }

   private void while_() {
      if (this.break_ == null) {
         this.break_ = new Object[4];
         this.break_[1] = false;
         this.break_[2] = false;
         this.break_[3] = false;
      }
   }

   private static void public_() {
      throws_ = new boolean[]{
         true, false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, true, false, true, false, false, false
      };
   }
}
