package celestial;

import java.util.EnumSet;

public class rBa_1<T extends rEi_1 & aa_3> extends rBk_1 {
   private final T class_;
   private final double break_;
   private int byte_;
   private final float protected_;
   private int throws_ = -1;
   private int case_;
   private boolean catch_;
   private boolean private_;
   private int implements_ = -1;

   @Override
   public void byte_() {
      super.byte_();
      this.class_.case_(true);
   }

   public rBa_1(T var1, double var2, int var4, float var5) {
      this.class_ = (T)var1;
      this.break_ = var2;
      this.byte_ = var4;
      this.protected_ = var5 * var5;
      this.class_(EnumSet.of(rBW.MOVE, rBW.LOOK));
   }

   @Override
   public boolean class_() {
      return this.class_.I_() == null ? false : this.catch_();
   }

   public void class_(int var1) {
      this.byte_ = var1;
   }

   @Override
   public boolean break_() {
      return (this.class_() || !this.class_.public_().native_()) && this.catch_();
   }

   @Override
   public void throws_() {
      iB_2 var1 = this.class_.I_();
      if (var1 != null) {
         double var2 = this.class_.class_(var1.rx(), var1.re(), var1.BO());
         boolean var4 = this.class_.goto_().class_(var1);
         boolean var5 = this.case_ > 0;
         if (var4 != var5) {
            this.case_ = 0;
         }

         if (var4) {
            this.case_++;
         } else {
            this.case_--;
         }

         if (!(var2 > (double)this.protected_) && this.case_ >= 20) {
            this.class_.public_().final_();
            this.implements_++;
         } else {
            this.class_.public_().class_(var1, this.break_);
            this.implements_ = -1;
         }

         if (this.implements_ >= 20) {
            if ((double)this.class_.Sa().nextFloat() < 0.3) {
               this.catch_ = !this.catch_;
            }

            if ((double)this.class_.Sa().nextFloat() < 0.3) {
               this.private_ = !this.private_;
            }

            this.implements_ = 0;
         }

         if (this.implements_ > -1) {
            if (var2 > (double)(this.protected_ * 0.75F)) {
               this.private_ = false;
            } else if (var2 < (double)(this.protected_ * 0.25F)) {
               this.private_ = true;
            }

            this.class_.super_().class_(this.private_ ? -0.5F : 0.5F, this.catch_ ? 0.5F : -0.5F);
            this.class_.class_(var1, 30.0F, 30.0F);
         } else {
            this.class_.continue_().class_(var1, 30.0F, 30.0F);
         }

         if (this.class_.return_()) {
            if (!var4 && this.case_ < -60) {
               this.class_.throw_();
            } else if (var4) {
               int var6 = this.class_.SU();
               if (var6 >= 20) {
                  this.class_.throw_();
                  this.class_.break_(var1, rxQ_2.class_(var6));
                  this.throws_ = this.byte_;
               }
            }
         } else if (--this.throws_ <= 0 && this.case_ >= -60) {
            this.class_.break_(rhj_3.class_(this.class_, rdy_3.OM));
         }
      }
   }

   protected boolean catch_() {
      return this.class_.class_(rdy_3.OM);
   }

   @Override
   public void protected_() {
      super.protected_();
      this.class_.case_(false);
      this.case_ = 0;
      this.throws_ = -1;
      this.class_.throw_();
   }
}
