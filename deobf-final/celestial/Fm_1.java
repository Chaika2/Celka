package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public class Fm_1 extends Fu_1<rJa_1> implements mB_2 {
   private static final rqO_2 class_ = new rqO_2("textures/gui/container/crafting_table.png");
   private static final rqO_2 throws_ = new rqO_2("textures/gui/recipe_button.png");
   private final ms_3 case_ = new ms_3();
   private boolean catch_;

   public Fm_1(rJa_1 var1, rhz_3 var2, rgP_2 var3) {
      super(var1, var2, var3);
   }

   @Override
   protected boolean class_(int var1, int var2, int var3, int var4, double var5, double var7) {
      return (!this.catch_ || !this.case_.private_()) && super.class_(var1, var2, var3, var4, var5, var7);
   }

   @Override
   protected boolean class_(double var1, double var3, int var5, int var6, int var7) {
      boolean var8 = var1 < (double)var5 || var3 < (double)var6 || var1 >= (double)(var5 + this.synchronized_) || var3 >= (double)(var6 + this.return_);
      return this.case_.class_(var1, var3, this.char_, this.abstract_, this.synchronized_, this.return_, var7) && var8;
   }

   @Override
   public void class_() {
      this.case_.finally_();
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      this.class_(var1);
      if (this.case_.private_() && this.catch_) {
         this.class_(var1, var4, var2, var3);
         this.case_.class_(var1, var2, var3, var4);
      } else {
         this.case_.class_(var1, var2, var3, var4);
         super.class_(var1, var2, var3, var4);
         this.case_.class_(var1, this.char_, this.abstract_, true, var4);
      }

      this.break_(var1, var2, var3);
      this.case_.byte_(var1, this.char_, this.abstract_, var2, var3);
   }

   @Override
   public void class_(rJY var1, int var2, int var3, rXa_1 var4) {
      super.class_(var1, var2, var3, var4);
      this.case_.class_(var1);
   }

   @Override
   protected void class_(Ml_1 var1, float var2, int var3, int var4) {
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.volatile_.A().class_(class_);
      int var5 = this.char_;
      int var6 = (this.int_ - this.return_) / 2;
      this.break_(var1, var5, var6, 0, 0, this.synchronized_, this.return_);
   }

   @Override
   public ms_3 break_() {
      return this.case_;
   }

   @Override
   public boolean break_(double var1, double var3, int var5) {
      if (this.case_.break_(var1, var3, var5)) {
         this.class_(this.case_);
         return true;
      } else {
         return this.catch_ && this.case_.private_() ? true : super.break_(var1, var3, var5);
      }
   }

   @Override
   public void private_() {
      super.private_();
      this.case_.implements_();
   }

   @Override
   protected void v_() {
      super.v_();
      this.catch_ = this.package_ < 379;
      this.case_.class_(this.package_, this.int_, this.volatile_, this.catch_, this.instanceof_);
      this.char_ = this.case_.class_(this.catch_, this.package_, this.synchronized_);
      this.native_.add(this.case_);
      this.break_(this.case_);
      this.class_(new Ll_1(this.char_ + 5, this.int_ / 2 - 49, 20, 18, 0, 0, 19, throws_, var1 -> {
         this.case_.class_(this.catch_);
         this.case_.catch_();
         this.char_ = this.case_.class_(this.catch_, this.package_, this.synchronized_);
         ((Ll_1)var1).class_(this.char_ + 5, this.int_ / 2 - 49);
      }));
      this.public_ = 29;
   }

   @Override
   public void w_() {
      super.w_();
      this.case_.case_();
   }
}
