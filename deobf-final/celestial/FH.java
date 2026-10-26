package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.List;

public class FH extends cc_3<rJT> implements mB_2 {
   private static final rqO_2 throws_ = new rqO_2("textures/gui/recipe_button.png");
   private float case_;
   private float catch_;
   private final ms_3 private_ = new ms_3();
   private boolean implements_;
   private boolean finally_;
   private boolean boolean_;
   private LZ transient_;

   public FH(rhd_3 var1) {
      super((rJT)var1.implements_[3], (rhz_3)var1.implements_[1], new rgn_3("container.crafting"));
      this.continue_ = true;
      this.public_ = 97;
   }

   @Override
   protected void class_(Ml_1 var1, float var2, int var3, int var4) {
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.volatile_.A().class_(else_);
      int var5 = this.char_;
      int var6 = this.abstract_;
      this.break_(var1, var5, var6, 0, 0, this.synchronized_, this.return_);
      class_(var5 + 51, var6 + 75, 30, (float)(var5 + 51) - this.case_, (float)(var6 + 75 - 50) - this.catch_, (cb_3)this.volatile_.class_[57]);
   }

   public static void class_(int var0, int var1, int var2, float var3, float var4, iB_2 var5) {
      float var6 = (float)Math.atan((double)(var3 / 40.0F));
      float var7 = (float)Math.atan((double)(var4 / 40.0F));
      RenderSystem.pushMatrix();
      RenderSystem.translatef((float)var0, (float)var1, 1050.0F);
      RenderSystem.scalef(1.0F, 1.0F, -1.0F);
      Ml_1 var8 = new Ml_1();
      var8.class_(0.0, 0.0, 1000.0);
      var8.class_((float)var2, (float)var2, (float)var2);
      rjY_2 var9 = rje_3.case_.byte_(180.0F);
      rjY_2 var10 = rje_3.break_.byte_(var7 * 20.0F);
      var9.class_(var10);
      var8.class_(var9);
      float var11 = (Float)var5.private_[23];
      float var12 = (Float)var5.throws_[15];
      float var13 = (Float)var5.private_[26];
      float var14 = (Float)var5.private_[27];
      float var15 = (Float)var5.private_[25];
      Float var23 = 180.0F + var6 * 20.0F;
      var5.private_[23] = var23;
      Float var24 = 180.0F + var6 * 40.0F;
      var5.throws_[15] = var24;
      Float var25 = -var7 * 20.0F;
      var5.private_[26] = var25;
      Float var26 = (Float)var5.throws_[15];
      var5.private_[25] = var26;
      Float var27 = (Float)var5.throws_[15];
      var5.private_[27] = var27;
      PX var16 = var5 == (cb_3)import_.class_[57] ? ((cb_3)import_.class_[57]).switch_() : null;
      if (var5 == (cb_3)import_.class_[57]) {
         ((cb_3)import_.class_[57]).class_(new PX((Float)var5.throws_[15], (Float)var5.private_[26]));
      }

      pg_3 var17 = QY.instanceof_().case_();
      var10.throws_();
      var17.class_(var10);
      var17.class_(false);
      Hd_1 var18 = QY.instanceof_().interface_().break_();
      RenderSystem.runAsFancy(() -> var17.class_(var5, 0.0, 0.0, 0.0, 0.0F, 1.0F, var8, var18, 15728880));
      var18.break_();
      var17.class_(true);
      Float var28 = var11;
      var5.private_[23] = var28;
      Float var29 = var12;
      var5.throws_[15] = var29;
      Float var30 = var13;
      var5.private_[26] = var30;
      Float var31 = var14;
      var5.private_[27] = var31;
      Float var32 = var15;
      var5.private_[25] = var32;
      if (var16 != null) {
         ((cb_3)import_.class_[57]).class_(var16);
      }

      RenderSystem.popMatrix();
   }

   @Override
   protected boolean class_(int var1, int var2, int var3, int var4, double var5, double var7) {
      return (!this.finally_ || !this.private_.private_()) && super.class_(var1, var2, var3, var4, var5, var7);
   }

   @Override
   public void class_() {
      this.private_.finally_();
   }

   @Override
   protected boolean class_(double var1, double var3, int var5, int var6, int var7) {
      boolean var8 = var1 < (double)var5 || var3 < (double)var6 || var1 >= (double)(var5 + this.synchronized_) || var3 >= (double)(var6 + this.return_);
      return this.private_.class_(var1, var3, this.char_, this.abstract_, this.synchronized_, this.return_, var7) && var8;
   }

   @Override
   public void class_(rJY var1, int var2, int var3, rXa_1 var4) {
      super.class_(var1, var2, var3, var4);
      this.private_.class_(var1);
   }

   @Override
   public boolean class_(double var1, double var3, int var5) {
      if (this.boolean_) {
         this.boolean_ = false;
         return true;
      } else {
         return super.class_(var1, var3, var5);
      }
   }

   @Override
   protected void class_(Ml_1 var1, int var2, int var3) {
      this.super_.byte_(var1, this.extends_, (float)this.public_, (float)this.goto_, 4210752);
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      this.class_(var1);
      this.class_ = !this.private_.private_();
      if (this.private_.private_() && this.finally_) {
         this.class_(var1, var4, var2, var3);
         this.private_.class_(var1, var2, var3, var4);
      } else {
         this.private_.class_(var1, var2, var3, var4);
         super.class_(var1, var2, var3, var4);
         this.private_.class_(var1, this.char_, this.abstract_, false, var4);
      }

      this.break_(var1, var2, var3);
      this.private_.byte_(var1, this.char_, this.abstract_, var2, var3);
      this.case_ = (float)var2;
      this.catch_ = (float)var3;
   }

   @Override
   public ms_3 break_() {
      return this.private_;
   }

   @Override
   public boolean break_(double var1, double var3, int var5) {
      if (this.private_.break_(var1, var3, var5)) {
         this.class_(this.private_);
         return true;
      } else {
         return (!this.finally_ || !this.private_.private_()) && super.break_(var1, var3, var5);
      }
   }

   @Override
   public boolean finally_() {
      return true;
   }

   @Override
   public void private_() {
      super.private_();
      if (((Ax_1)this.volatile_.class_[55]).catch_()) {
         this.volatile_.break_(new Fv_1((cb_3)this.volatile_.class_[57]));
      } else {
         this.private_.implements_();
      }
   }

   @Override
   public void final_() {
      super.final_();
      this.private_.class_(this.package_, this.int_, this.volatile_, this.finally_, this.instanceof_);
      this.implements_ = true;
      this.char_ = this.private_.class_(this.finally_, this.package_, this.synchronized_);
   }

   @Override
   public List<LZ> native_() {
      ArrayList var1 = new ArrayList();
      var1.add(
         this.transient_ = new Ff_1(this, this.char_ + this.synchronized_ / 2 - 50, this.abstract_ - 23, 100, 20, var1x -> this.class_(FM.DROP_ALL))
            .finally_(false)
      );
      return var1;
   }

   @Override
   protected void v_() {
      if (((Ax_1)this.volatile_.class_[55]).catch_()) {
         this.volatile_.break_(new Fv_1((cb_3)this.volatile_.class_[57]));
      } else {
         super.v_();
         this.finally_ = this.package_ < 379;
         this.native_.add(this.private_);
         this.break_(this.private_);
         this.class_(new Ll_1(this.char_ + 104, this.int_ / 2 - 22, 20, 18, 0, 0, 19, throws_, var1 -> {
            this.private_.class_(this.finally_);
            this.private_.catch_();
            this.char_ = this.private_.class_(this.finally_, this.package_, this.synchronized_);
            ((Ll_1)var1).class_(this.char_ + 104, this.int_ / 2 - 22);
            this.boolean_ = true;
            this.transient_.volatile_ = this.char_ + this.synchronized_ / 2 - 50;
         }));
      }
   }

   @Override
   public void w_() {
      super.w_();
      if (this.implements_) {
         this.private_.case_();
      }
   }
}
