package celestial;

import java.util.EnumSet;

public class rBe_1 extends rBk_1 {
   private final is_3 class_;
   private final aa_3 break_;
   private iB_2 byte_;
   private int protected_ = -1;
   private final double throws_;
   private int case_;
   private final int catch_;
   private final int private_;
   private final float implements_;
   private final float finally_;

   public rBe_1(aa_3 var1, double var2, int var4, float var5) {
      this(var1, var2, var4, var4, var5);
   }

   public rBe_1(aa_3 var1, double var2, int var4, int var5, float var6) {
      if (!(var1 instanceof iB_2)) {
         throw new IllegalArgumentException("ArrowAttackGoal requires Mob implements RangedAttackMob");
      } else {
         this.break_ = var1;
         this.class_ = (is_3)var1;
         this.throws_ = var2;
         this.catch_ = var4;
         this.private_ = var5;
         this.implements_ = var6;
         this.finally_ = var6 * var6;
         this.class_(EnumSet.of(rBW.MOVE, rBW.LOOK));
      }
   }

   @Override
   public boolean class_() {
      iB_2 var1 = this.class_.I_();
      if (var1 != null && var1.BM()) {
         this.byte_ = var1;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean break_() {
      return this.class_() || !this.class_.public_().native_();
   }

   @Override
   public void throws_() {
      double var1 = this.class_.class_(this.byte_.rx(), this.byte_.re(), this.byte_.BO());
      boolean var3 = this.class_.goto_().class_(this.byte_);
      if (var3) {
         this.case_++;
      } else {
         this.case_ = 0;
      }

      if (!(var1 > (double)this.finally_) && this.case_ >= 5) {
         this.class_.public_().final_();
      } else {
         this.class_.public_().class_(this.byte_, this.throws_);
      }

      this.class_.continue_().class_(this.byte_, 30.0F, 30.0F);
      if (--this.protected_ == 0) {
         if (!var3) {
            return;
         }

         float var4 = rfU_2.class_(var1) / this.implements_;
         float var5 = rfU_2.class_(var4, 0.1F, 1.0F);
         this.break_.break_(this.byte_, var5);
         this.protected_ = rfU_2.protected_(var4 * (float)(this.private_ - this.catch_) + (float)this.catch_);
      } else if (this.protected_ < 0) {
         float var6 = rfU_2.class_(var1) / this.implements_;
         this.protected_ = rfU_2.protected_(var6 * (float)(this.private_ - this.catch_) + (float)this.catch_);
      }
   }

   @Override
   public void protected_() {
      this.byte_ = null;
      this.case_ = 0;
      this.protected_ = -1;
   }
}
