package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Timer extends Module implements rrnZ_2 {
   public static Object[] break_;
   private static double[] protected_;
   private static float[] throws_;
   public Object[] byte_;
   private static short[] catch_;
   private static byte[] private_;
   private static boolean[] implements_;
   private static String[] finally_;

   public Timer() {
      super("Timer", "Ускоряет время игры", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[1]);
      this.goto_();
      rrIm_1 var5 = new rrIm_1("Скорость", 1.8F, 1.1F, 10.0F, 0.1F);
      this.byte_[0] = var5;
      rrIk_1 var6 = new rrIk_1("Умный режим", true);
      this.byte_[1] = var6;
      rrIm_1 var7 = new rrIm_1("Скорость убывания", 1.0F, 0.5F, 3.0F, 0.1F).class_(((rrIk_1)this.byte_[1])::class_);
      this.byte_[2] = var7;
      rrIm_1 var8 = new rrIm_1("Добавлять в движении", 0.0F, 0.0F, 1.0F, 0.05F).class_(((rrIk_1)this.byte_[1])::class_);
      this.byte_[3] = var8;
      this.class_(true, false);
      this.class_(new Setting[]{(rrIm_1)this.byte_[0], (rrIk_1)this.byte_[1], (rrIm_1)this.byte_[2], (rrIm_1)this.byte_[3]});
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(new OH<>(rrAy_1.class, var1 -> this.class_(var1)));
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      protected_ = new double[4];
   }

   public void class_(rrAy_1 var1) {
      this.class_(
         ((cb_3)import_.class_[57]).N(),
         ((cb_3)import_.class_[57]).b(),
         ((cb_3)import_.class_[57]).for_(),
         ((cb_3)import_.class_[57]).O(),
         ((cb_3)import_.class_[57]).static_()
      );
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1404158420;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3275059681255142658L;
   }

   public void class_(float var1, float var2, double var3, double var5, double var7) {
      this.goto_();
      if (this.continue_()) {
         Float var13 = (Float)this.byte_[4] - (((rrIm_1)this.byte_[2]).byte_() + 0.4F);
         this.byte_[4] = var13;
      } else {
         Float var14 = (Float)this.byte_[4] - ((rrIm_1)this.byte_[3]).byte_() / 10.0F;
         this.byte_[4] = var14;
      }

      Float var15 = (float)rfU_2.class_((double)((Float)this.byte_[4]).floatValue(), 0.0, Math.floor((double)(100.0F / ((rqw_3)import_.class_[6]).class_())));
      this.byte_[4] = var15;
      Double var16 = var3;
      this.byte_[5] = var16;
      Double var17 = var5;
      this.byte_[6] = var17;
      Double var18 = var7;
      this.byte_[7] = var18;
      Float var19 = var1;
      this.byte_[8] = var19;
      Float var20 = var2;
      this.byte_[9] = var20;
   }

   @Override
   public void class_() {
      this.byte_(false);
   }

   @EventTarget(
      id_class = -200
   )
   public void class_(q_1 var1) {
      this.goto_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         ((rqw_3)import_.class_[6]).class_(((rrIm_1)this.byte_[0]).byte_());
         if (!((rrIk_1)this.byte_[1]).class_() || ((rqw_3)import_.class_[6]).class_() <= 1.0F) {
            return;
         }

         if ((Float)this.byte_[4] < 90.0F / ((rrIm_1)this.byte_[0]).byte_()) {
            Float var6 = (Float)this.byte_[4] + ((rrIm_1)this.byte_[2]).byte_();
            this.byte_[4] = var6;
            Float var7 = rfU_2.class_((Float)this.byte_[4], 0.0F, 100.0F / ((rrIm_1)this.byte_[0]).byte_());
            this.byte_[4] = var7;
         } else {
            this.aw_();
         }
      }
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-94, -9, 45, -92, -33, -109, -8, -23}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void throws_(boolean var1) {
      super.throws_(var1);
      ((rqw_3)import_.class_[6]).class_(1.0F);
   }

   private void goto_() {
      if (this.byte_ == null) {
         this.byte_ = new Object[10];
         this.byte_[4] = 0.0F;
         this.byte_[5] = 0.0;
         this.byte_[6] = 0.0;
         this.byte_[7] = 0.0;
         this.byte_[8] = 0.0F;
         this.byte_[9] = 0.0F;
      }
   }

   private boolean continue_() {
      this.goto_();
      return this.byte_[5] == ((cb_3)import_.class_[57]).rx()
            && this.byte_[6] == ((cb_3)import_.class_[57]).re()
            && this.byte_[7] == ((cb_3)import_.class_[57]).BO()
            && this.byte_[8] == ((cb_3)import_.class_[57]).throws_[15]
            && this.byte_[9] == ((cb_3)import_.class_[57]).throws_[16]
         ? true
         : implements_[6];
   }

   private static void else_() {
      private_ = new byte[]{4, 2, 3, 10, 4, 5, 6, 7, 8, 9};
   }

   public float new_() {
      this.goto_();
      return 1.0F - (Float)this.byte_[4] / (100.0F / ((rrIm_1)this.byte_[0]).byte_());
   }

   private static void return_() {
      throws_ = new float[]{
         1.8F,
         1.1F,
         10.0F,
         0.1F,
         1.0F,
         0.5F,
         3.0F,
         0.1F,
         0.0F,
         0.0F,
         1.0F,
         0.05F,
         1.0F,
         90.0F,
         0.0F,
         100.0F,
         1.0F,
         100.0F,
         0.4F,
         10.0F,
         100.0F,
         1.0F,
         0.0F,
         0.0F,
         0.0F,
         100.0F
      };
   }

   private static void super_() {
      finally_ = new String[]{
         new String("Timer"),
         new String("Ускоряет время игры"),
         new String("Скорость"),
         new String("Умный режим"),
         new String("Скорость убывания"),
         new String("Добавлять в движении")
      };
   }

   private static void try_() {
      Object[] var0 = new Object[]{0.0F};
      break_ = var0;
   }

   private static void while_() {
      implements_ = new boolean[]{true, true, false, false, true, true, false, false, true, false};
   }

   private static void public_() {
      catch_ = new short[]{
         1,
         0,
         1,
         1,
         2,
         1,
         3,
         0,
         1,
         2,
         3,
         0,
         57,
         57,
         57,
         57,
         57,
         0,
         6,
         0,
         1,
         6,
         4,
         0,
         4,
         2,
         4,
         4,
         0,
         4,
         4,
         0,
         4,
         2,
         4,
         4,
         3,
         4,
         4,
         6,
         4,
         5,
         6,
         7,
         8,
         9,
         5,
         57,
         6,
         57,
         7,
         57,
         8,
         57,
         15,
         9,
         57,
         16,
         6
      };
   }
}
