package celestial;

import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;

public class rBX extends rBk_1 {
   private final is_3 class_;
   private final Predicate<is_3> break_;
   private is_3 byte_;
   private final double protected_;
   private final rLy_1 throws_;
   private int case_;
   private final float catch_;
   private float private_;
   private final float implements_;

   @Override
   public void byte_() {
      this.case_ = 0;
      this.private_ = this.class_.class_(rLp_1.WATER);
      this.class_.class_(rLp_1.WATER, 0.0F);
   }

   public rBX(is_3 var1, double var2, float var4, float var5) {
      this.class_ = var1;
      this.break_ = var1x -> var1x != null && var1.getClass() != var1x.getClass();
      this.protected_ = var2;
      this.throws_ = var1.public_();
      this.catch_ = var4;
      this.implements_ = var5;
      this.class_(EnumSet.of(rBW.MOVE, rBW.LOOK));
      if (!(var1.public_() instanceof rLA) && !(var1.public_() instanceof rLL)) {
         throw new IllegalArgumentException("Unsupported mob type for FollowMobGoal");
      }
   }

   @Override
   public boolean class_() {
      List var1 = ((rYB)this.class_.throws_[7]).class_(is_3.class, this.class_.rN().class_((double)this.implements_), this.break_);
      if (!var1.isEmpty()) {
         for (is_3 var3 : var1) {
            if (!var3.Pp()) {
               this.byte_ = var3;
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public boolean break_() {
      return this.byte_ != null && !this.throws_.native_() && this.class_.int_(this.byte_) > (double)(this.catch_ * this.catch_);
   }

   @Override
   public void throws_() {
      if (this.byte_ != null && !this.class_.z()) {
         this.class_.continue_().class_(this.byte_, 10.0F, (float)this.class_.r());
         if (--this.case_ <= 0) {
            this.case_ = 10;
            double var1 = this.class_.rx() - this.byte_.rx();
            double var3 = this.class_.re() - this.byte_.re();
            double var5 = this.class_.BO() - this.byte_.BO();
            double var7 = var1 * var1 + var3 * var3 + var5 * var5;
            if (!(var7 <= (double)(this.catch_ * this.catch_))) {
               this.throws_.class_(this.byte_, this.protected_);
            } else {
               this.throws_.final_();
               rPR var9 = this.byte_.continue_();
               if (var7 <= (double)this.catch_
                  || var9.protected_() == this.class_.rx() && var9.throws_() == this.class_.re() && var9.case_() == this.class_.BO()) {
                  double var10 = this.byte_.rx() - this.class_.rx();
                  double var12 = this.byte_.BO() - this.class_.BO();
                  this.throws_.class_(this.class_.rx() - var10, this.class_.re(), this.class_.BO() - var12, this.protected_);
               }
            }
         }
      }
   }

   @Override
   public void protected_() {
      this.byte_ = null;
      this.throws_.final_();
      this.class_.class_(rLp_1.WATER, this.private_);
   }
}
