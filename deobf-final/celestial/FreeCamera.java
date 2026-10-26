package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class FreeCamera extends Module {
   private static short[] byte_;
   private static String[] protected_;
   private static double[] throws_;
   private static float[] catch_;
   private static boolean[] private_;
   public Object[] break_;
   private static byte[] implements_;

   public FreeCamera() {
      super("Free Camera", "Позволяет летать в режиме\nнаблюдателя", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[3]);
      this.return_();
      rrIm_1 var5 = new rrIm_1("Скорость", 1.5F, 0.5F, 5.0F, 0.1F);
      this.break_[1] = var5;
      rrIk_1 var6 = new rrIk_1("Выключать при дамаге", false);
      this.break_[2] = var6;
      rjU_2 var7 = rjU_2.class_;
      this.break_[3] = var7;
      rjU_2 var8 = rjU_2.class_;
      this.break_[4] = var8;
      rrlU_2 var9 = (rrlU_2)rrlU_2.break_[0];
      this.break_[5] = var9;
      this.class_(new Setting[]{(rrIk_1)this.break_[2], (rrIm_1)this.break_[1]});
      rrle_3 var10 = new rrle_3(this);
      this.break_[0] = var10;
   }

   static {
      ntfClinit();
   }

   public boolean this_() {
      return this.aJ_() && ((gm_3)import_.class_[56]).E() == rYB.protected_ ? private_[17] : private_[16];
   }

   private static void interface_() {
      byte_ = new short[]{
         3,
         1,
         2,
         3,
         4,
         0,
         5,
         2,
         1,
         0,
         0,
         16,
         0,
         5,
         0,
         57,
         10,
         2,
         4,
         3,
         1,
         57,
         57,
         15,
         20,
         4,
         4,
         20,
         4,
         4,
         20,
         4,
         4,
         20,
         4,
         4,
         20,
         4,
         4,
         20,
         4,
         4,
         3,
         4,
         16,
         5,
         5,
         6,
         6,
         57,
         57,
         57,
         57,
         57,
         15,
         57,
         16,
         57,
         5,
         57,
         3,
         3,
         4,
         20,
         20,
         6,
         3,
         4,
         0,
         5,
         6,
         20,
         6,
         6,
         0,
         5,
         56,
         56,
         8,
         8
      };
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1417185782388117196L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1762245422;
   }

   @EventTarget
   public void class_(rrAX var1) {
      this.return_();
      if (this.continue_()) {
         var1.class_(new PX(((rrlU_2)this.break_[5]).throws_(), ((rrlU_2)this.break_[5]).case_()));
      }
   }

   @EventTarget
   public void class_(rrAO var1) {
      if (this.continue_()) {
         var1.class_(true);
      }
   }

   @EventTarget
   public void class_(rrAz_1 var1) {
      an_3 var2 = import_.catch_();
      float var3 = var1.case_();
      double var4 = var1.protected_();
      ly_3 var6 = ((Hh_1)import_.class_[16]).finally_();
      rjU_2 var7 = var6.break_();
      rjG_2 var8 = var2.class_(var7, var2.class_(var6.throws_(), var6.protected_(), var3), var4, false);
      var1.class_(var8);
      var1.class_(new PX(var6.throws_(), var6.protected_()));
      var1.class_(var7);
      var1.class_(var2.rN().throws_(var2.Ps()).protected_(var7));
   }

   @EventTarget
   public void class_(rrFK var1) {
      this.byte_(false);
   }

   @EventTarget
   public void class_(rrLw_1 var1) {
      this.return_();
      if ((VZ)this.break_[6] != null && var1.break_() != (VZ)this.break_[6]) {
         var1.class_(true);
      }
   }

   @EventTarget
   public void class_(rrLt_1 var1) {
      this.return_();
      var1.class_((rjU_2)this.break_[3]);
      var1.break_((rjU_2)this.break_[4]);
      var1.class_(true);
   }

   @EventTarget
   public void class_(rrAM var1) {
      this.byte_(false);
   }

   private rjU_2 class_(rjU_2 var1, int var2) {
      return var1.byte_(new rjU_2(0.0, 1.0, 0.0)).protected_().class_((double)var2);
   }

   @EventTarget
   public void class_(rrAh_1 var1) {
      if (this.continue_()) {
         var1.class_(true);
      }
   }

   @Override
   public void class_(boolean var1) {
      this.return_();
      super.class_(var1);
      if ((cb_3)import_.class_[57] != null) {
         rrlU_2 var7 = new rrlU_2(
            ((cb_3)import_.class_[57]).rx(),
            ((cb_3)import_.class_[57]).re(),
            ((cb_3)import_.class_[57]).BO(),
            (Float)((cb_3)import_.class_[57]).throws_[15],
            (Float)((cb_3)import_.class_[57]).throws_[16],
            ((cb_3)import_.class_[57]).BL()
         );
         this.break_[5] = var7;
         rjU_2 var8 = ((cb_3)import_.class_[57]).Ps();
         this.break_[3] = var8;
         rjU_2 var9 = (rjU_2)this.break_[3];
         this.break_[4] = var9;
         VZ var2 = ((Qw_1)import_.class_[20]).volatile_();
         ((Qw_1)import_.class_[20]).class_(VZ.THIRD_PERSON_BACK);
         this.break_[6] = var2;
         RenderSystem.recordRenderCall(() -> ((yX_2)import_.class_[8]).throws_());
      }

      this.super_().aI_();
   }

   @EventTarget
   public void class_(q_1 var1) {
      this.return_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         if ((Integer)((cb_3)import_.class_[57]).private_[10] > 0 && ((rrIk_1)this.break_[2]).class_()) {
            this.byte_(true);
         }

         rjU_2 var9 = (rjU_2)this.break_[4];
         this.break_[3] = var9;
         float var2 = ((rrIm_1)this.break_[1]).byte_();
         rjU_2 var3 = ((cb_3)import_.class_[57]).byte_(0.0F, (Float)((cb_3)import_.class_[57]).throws_[15]).class_((double)var2);
         rjU_2 var4 = new rjU_2(0.0, 1.0, 0.0).class_((double)var2);
         if (((Qw_1)import_.class_[20]).h.protected_()) {
            rjU_2 var10 = ((rjU_2)this.break_[4]).throws_(var3);
            this.break_[4] = var10;
         }

         if (((Qw_1)import_.class_[20]).J.protected_()) {
            rjU_2 var11 = ((rjU_2)this.break_[4]).protected_(var3);
            this.break_[4] = var11;
         }

         if (((Qw_1)import_.class_[20]).X.protected_()) {
            rjU_2 var12 = ((rjU_2)this.break_[4]).throws_(this.class_(var3, -1).class_((double)var2));
            this.break_[4] = var12;
         }

         if (((Qw_1)import_.class_[20]).x.protected_()) {
            rjU_2 var13 = ((rjU_2)this.break_[4]).throws_(this.class_(var3, 1).class_((double)var2));
            this.break_[4] = var13;
         }

         if (((Qw_1)import_.class_[20]).d.protected_()) {
            rjU_2 var14 = ((rjU_2)this.break_[4]).throws_(new rjU_2(0.0, 1.0, 0.0).class_((double)var2));
            this.break_[4] = var14;
         } else if (((Qw_1)import_.class_[20]).k.protected_()) {
            rjU_2 var15 = ((rjU_2)this.break_[4]).protected_(var4);
            this.break_[4] = var15;
         }
      }
   }

   @EventTarget
   public void class_(rrnB_2 var1) {
      this.return_();
      Ml_1 var2 = var1.class_();
      rrZO var3 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).class_();
      ly_3 var4 = ((Hh_1)import_.class_[16]).finally_();
      rjU_2 var5 = var4.break_();
      float var6 = (float)const_.new_() / 4.0F;
      float var7 = (float)const_.continue_() / 4.0F + 13.0F;
      if (!((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().throws_().new_()) {
         var3.class_(var2, "Camera Pos: " + rgF_2.GRAY + (int)var5.class_() + " " + (int)var5.break_() + " " + (int)var5.byte_(), var6, var7, rrZF.d_, false);
         var7 += (float)(var3.class_() + 5);
      }

      var3.class_(var2, "vclip: " + rgF_2.GRAY + (int)((double)var4.byte_().c_() - ((rrlU_2)this.break_[5]).byte_()), var6, var7, rrZF.d_, false);
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{92, 123, 67, 89, -62, 25, -28, -63}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void throws_(boolean var1) {
      this.return_();
      super.throws_(var1);
      rjU_2 var6 = rjU_2.class_;
      this.break_[3] = var6;
      rjU_2 var7 = rjU_2.class_;
      this.break_[4] = var7;
      rrlU_2 var8 = (rrlU_2)rrlU_2.break_[0];
      this.break_[5] = var8;
      if ((VZ)this.break_[6] != null) {
         ((Qw_1)import_.class_[20]).class_((VZ)this.break_[6]);
         Object var9 = null;
         this.break_[6] = var9;
      }

      RenderSystem.recordRenderCall(() -> ((yX_2)import_.class_[8]).throws_());
      this.super_().aK_();
   }

   private static void goto_() {
      throws_ = new double[]{0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0};
   }

   public boolean continue_() {
      return rrfZ_2.protected_() ? false : private_[15];
   }

   public boolean else_() {
      return this.aJ_() && ((gm_3)import_.class_[56]).E() == rYB.protected_ ? true : private_[19];
   }

   public rrlU_2 new_() {
      this.return_();
      return (rrlU_2)this.break_[5];
   }

   private void return_() {
      if (this.break_ == null) {
         this.break_ = new Object[7];
      }
   }

   public rrTF<FreeCamera> super_() {
      this.return_();
      return (rrTF<FreeCamera>)this.break_[0];
   }

   private static void throw_() {
      implements_ = new byte[]{2, 5, -1, 7};
   }

   private static void try_() {
      catch_ = new float[]{1.5F, 0.5F, 5.0F, 0.1F, 4.0F, 4.0F, 13.0F, 0.0F};
   }

   private static void while_() {
      protected_ = new String[]{
         new String("Free Camera"), new String("Позволяет летать в режиме\nнаблюдателя"), new String("Скорость"), new String("Выключать при дамаге")
      };
   }

   private static void public_() {
      private_ = new boolean[]{
         false, false, true, false, false, true, true, true, false, true, true, true, false, false, false, true, true, false, true, false
      };
   }
}
