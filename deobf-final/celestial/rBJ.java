package celestial;

import java.util.EnumSet;

public class rBJ extends rBk_1 {
   private final rOQ class_;
   private iB_2 break_;
   private final rRR byte_;
   private final double protected_;
   private final rLy_1 throws_;
   private int case_;
   private final float catch_;
   private final float private_;
   private float implements_;
   private final boolean finally_;

   @Override
   public void byte_() {
      this.case_ = 0;
      this.implements_ = this.class_.class_(rLp_1.WATER);
      this.class_.class_(rLp_1.WATER, 0.0F);
   }

   public rBJ(rOQ var1, double var2, float var4, float var5, boolean var6) {
      this.class_ = var1;
      this.byte_ = (rYB)var1.throws_[7];
      this.protected_ = var2;
      this.throws_ = var1.public_();
      this.private_ = var4;
      this.catch_ = var5;
      this.finally_ = var6;
      this.class_(EnumSet.of(rBW.MOVE, rBW.LOOK));
      if (!(var1.public_() instanceof rLA) && !(var1.public_() instanceof rLL)) {
         throw new IllegalArgumentException("Unsupported mob type for FollowOwnerGoal");
      }
   }

   private int class_(int var1, int var2) {
      return this.class_.Sa().nextInt(var2 - var1 + 1) + var1;
   }

   private boolean class_(int var1, int var2, int var3) {
      if (Math.abs((double)var1 - this.break_.rx()) < 2.0 && Math.abs((double)var3 - this.break_.BO()) < 2.0) {
         return false;
      } else if (!this.class_(new rfH_2(var1, var2, var3))) {
         return false;
      } else {
         this.class_.class_((double)var1 + 0.5, (double)var2, (double)var3 + 0.5, (Float)this.class_.throws_[15], (Float)this.class_.throws_[16]);
         this.throws_.final_();
         return true;
      }
   }

   private boolean class_(rfH_2 var1) {
      rLp_1 var2 = rLf_1.class_(this.byte_, var1.new_());
      if (var2 != rLp_1.WALKABLE) {
         return false;
      } else {
         xc_3 var3 = this.byte_.byte_(var1.break_());
         if (!this.finally_ && var3.break_() instanceof kZ_2) {
            return false;
         } else {
            rfH_2 var4 = var1.byte_(this.class_.Bs());
            return this.byte_.a_(this.class_, this.class_.rN().class_(var4));
         }
      }
   }

   @Override
   public boolean class_() {
      iB_2 var1 = this.class_.sF();
      if (var1 == null) {
         return false;
      } else if (var1.native_()) {
         return false;
      } else if (this.class_.sL()) {
         return false;
      } else if (this.class_.int_(var1) < (double)(this.private_ * this.private_)) {
         return false;
      } else {
         this.break_ = var1;
         return true;
      }
   }

   @Override
   public boolean break_() {
      if (this.throws_.native_()) {
         return false;
      } else {
         return this.class_.sL() ? false : !(this.class_.int_(this.break_) <= (double)(this.catch_ * this.catch_));
      }
   }

   @Override
   public void throws_() {
      this.class_.continue_().class_(this.break_, 10.0F, (float)this.class_.r());
      if (--this.case_ <= 0) {
         this.case_ = 10;
         if (!this.class_.z() && !this.class_.Pm()) {
            if (this.class_.int_(this.break_) >= 144.0) {
               this.catch_();
            } else {
               this.throws_.class_(this.break_, this.protected_);
            }
         }
      }
   }

   private void catch_() {
      rfH_2 var1 = this.break_.Bs();

      for (int var2 = 0; var2 < 10; var2++) {
         int var3 = this.class_(-3, 3);
         int var4 = this.class_(-1, 1);
         int var5 = this.class_(-3, 3);
         boolean var6 = this.class_(var1.b_() + var3, var1.c_() + var4, var1.d_() + var5);
         if (var6) {
            return;
         }
      }
   }

   @Override
   public void protected_() {
      this.break_ = null;
      this.throws_.final_();
      this.class_.class_(rLp_1.WATER, this.implements_);
   }
}
