package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public abstract class FE<T extends rXH> extends Fu_1<T> implements mB_2 {
   private static final rqO_2 throws_ = new rqO_2("textures/gui/recipe_button.png");
   public final ue_3 class_;
   private boolean case_;
   private final rqO_2 catch_;

   public FE(T var1, ue_3 var2, rhz_3 var3, rgP_2 var4, rqO_2 var5) {
      super((T)var1, var3, var4);
      this.class_ = var2;
      this.catch_ = var5;
   }

   @Override
   public void class_(rJY var1, int var2, int var3, rXa_1 var4) {
      super.class_(var1, var2, var3, var4);
      this.class_.class_(var1);
   }

   @Override
   public boolean class_(int var1, int var2, int var3) {
      return this.class_.class_(var1, var2, var3) ? false : super.class_(var1, var2, var3);
   }

   @Override
   public boolean class_(char var1, int var2) {
      return this.class_.class_(var1, var2) ? true : super.class_(var1, var2);
   }

   @Override
   public void class_() {
      this.class_.finally_();
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      this.class_(var1);
      if (this.class_.private_() && this.case_) {
         this.class_(var1, var4, var2, var3);
         this.class_.class_(var1, var2, var3, var4);
      } else {
         this.class_.class_(var1, var2, var3, var4);
         super.class_(var1, var2, var3, var4);
         this.class_.class_(var1, this.char_, this.abstract_, true, var4);
      }

      this.break_(var1, var2, var3);
      this.class_.byte_(var1, this.char_, this.abstract_, var2, var3);
   }

   @Override
   protected boolean class_(double var1, double var3, int var5, int var6, int var7) {
      boolean var8 = var1 < (double)var5 || var3 < (double)var6 || var1 >= (double)(var5 + this.synchronized_) || var3 >= (double)(var6 + this.return_);
      return this.class_.class_(var1, var3, this.char_, this.abstract_, this.synchronized_, this.return_, var7) && var8;
   }

   @Override
   protected void class_(Ml_1 var1, float var2, int var3, int var4) {
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.volatile_.A().class_(this.catch_);
      int var5 = this.char_;
      int var6 = this.abstract_;
      this.break_(var1, var5, var6, 0, 0, this.synchronized_, this.return_);
      if (this.instanceof_.private_()) {
         int var7 = this.instanceof_.catch_();
         this.break_(var1, var5 + 56, var6 + 36 + 12 - var7, 176, 12 - var7, 14, var7 + 1);
      }

      int var8 = this.instanceof_.case_();
      this.break_(var1, var5 + 79, var6 + 34, 176, 14, var8 + 1, 16);
   }

   @Override
   public boolean break_(double var1, double var3, int var5) {
      if (this.class_.break_(var1, var3, var5)) {
         return true;
      } else {
         return this.case_ && this.class_.private_() ? true : super.break_(var1, var3, var5);
      }
   }

   @Override
   public ms_3 break_() {
      return this.class_;
   }

   @Override
   public void private_() {
      super.private_();
      this.class_.implements_();
   }

   @Override
   public void v_() {
      super.v_();
      this.case_ = this.package_ < 379;
      this.class_.class_(this.package_, this.int_, this.volatile_, this.case_, this.instanceof_);
      this.char_ = this.class_.class_(this.case_, this.package_, this.synchronized_);
      this.class_(new Ll_1(this.char_ + 20, this.int_ / 2 - 49, 20, 18, 0, 0, 19, throws_, var1 -> {
         this.class_.class_(this.case_);
         this.class_.catch_();
         this.char_ = this.class_.class_(this.case_, this.package_, this.synchronized_);
         ((Ll_1)var1).class_(this.char_ + 20, this.int_ / 2 - 49);
      }));
      this.public_ = (this.synchronized_ - this.super_.class_(this.extends_)) / 2;
   }

   @Override
   public void w_() {
      super.w_();
      this.class_.case_();
   }
}
