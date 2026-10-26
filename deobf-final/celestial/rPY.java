package celestial;

public class rPY {
   protected final is_3 class_;
   protected double break_;
   protected double byte_;
   protected double protected_;
   protected double throws_;
   protected float case_;
   protected float catch_;
   protected rPo_1 private_ = rPo_1.WAIT;

   public double byte_() {
      return this.throws_;
   }

   public rPY(is_3 var1) {
      this.class_ = var1;
   }

   protected float class_(float var1, float var2, float var3) {
      float var4 = rfU_2.catch_(var2 - var1);
      if (var4 > var3) {
         var4 = var3;
      }

      if (var4 < -var3) {
         var4 = -var3;
      }

      float var5 = var1 + var4;
      if (var5 < 0.0F) {
         var5 += 360.0F;
      } else if (var5 > 360.0F) {
         var5 -= 360.0F;
      }

      return var5;
   }

   public void class_() {
      if (this.private_ == rPo_1.STRAFE) {
         float var1 = (float)this.class_.class_(iQ_2.protected_);
         float var2 = (float)this.throws_ * var1;
         float var3 = this.case_;
         float var4 = this.catch_;
         float var5 = rfU_2.byte_(var3 * var3 + var4 * var4);
         if (var5 < 1.0F) {
            var5 = 1.0F;
         }

         var5 = var2 / var5;
         var3 *= var5;
         var4 *= var5;
         float var6 = rfU_2.class_((Float)this.class_.throws_[15] * (float) (Math.PI / 180.0));
         float var7 = rfU_2.break_((Float)this.class_.throws_[15] * (float) (Math.PI / 180.0));
         float var8 = var3 * var7 - var4 * var6;
         float var9 = var4 * var7 + var3 * var6;
         if (!this.break_(var8, var9)) {
            this.case_ = 1.0F;
            this.catch_ = 0.0F;
         }

         this.class_.super_(var2);
         this.class_.catch_(this.case_);
         this.class_.try_(this.catch_);
         this.private_ = rPo_1.WAIT;
      } else if (this.private_ == rPo_1.MOVE_TO) {
         this.private_ = rPo_1.WAIT;
         double var19 = this.break_ - this.class_.rx();
         double var21 = this.protected_ - this.class_.BO();
         double var24 = this.byte_ - this.class_.re();
         double var25 = var19 * var19 + var24 * var24 + var21 * var21;
         if (var25 < 2.5000003E-7F) {
            this.class_.catch_(0.0F);
            return;
         }

         float var26 = (float)(rfU_2.protected_(var21, var19) * 180.0F / (float)Math.PI) - 90.0F;
         is_3 var10000 = this.class_;
         Float var18 = this.class_((Float)this.class_.throws_[15], var26, 90.0F);
         var10000.throws_[15] = var18;
         this.class_.super_((float)(this.throws_ * this.class_.class_(iQ_2.protected_)));
         rfH_2 var10 = this.class_.Bs();
         xc_3 var11 = ((rYB)this.class_.throws_[7]).byte_(var10);
         xd_3 var12 = var11.break_();
         rjC_2 var13 = var11.extends_((rYB)this.class_.throws_[7], var10);
         if (var24 > (double)((Float)this.class_.throws_[37]).floatValue() && var19 * var19 + var21 * var21 < (double)Math.max(1.0F, this.class_.PN())
            || !var13.break_() && this.class_.re() < var13.byte_(rpB_2.Y) + (double)var10.c_() && !var12.class_(rls_3.int_) && !var12.class_(rls_3.default_)) {
            this.class_.else_().class_();
            this.private_ = rPo_1.JUMPING;
         }
      } else if (this.private_ == rPo_1.JUMPING) {
         this.class_.super_((float)(this.throws_ * this.class_.class_(iQ_2.protected_)));
         if (this.class_.BL()) {
            this.private_ = rPo_1.WAIT;
         }
      } else {
         this.class_.catch_(0.0F);
      }
   }

   public void class_(float var1, float var2) {
      this.private_ = rPo_1.STRAFE;
      this.case_ = var1;
      this.catch_ = var2;
      this.throws_ = 0.25;
   }

   public void class_(double var1, double var3, double var5, double var7) {
      this.break_ = var1;
      this.byte_ = var3;
      this.protected_ = var5;
      this.throws_ = var7;
      if (this.private_ != rPo_1.JUMPING) {
         this.private_ = rPo_1.MOVE_TO;
      }
   }

   public boolean break_() {
      return this.private_ == rPo_1.MOVE_TO;
   }

   private boolean break_(float var1, float var2) {
      rLy_1 var3 = this.class_.public_();
      if (var3 != null) {
         rLn_1 var4 = var3.int_();
         if (var4 != null
            && var4.class_(
                  (rYB)this.class_.throws_[7],
                  rfU_2.byte_(this.class_.rx() + (double)var1),
                  rfU_2.byte_(this.class_.re()),
                  rfU_2.byte_(this.class_.BO() + (double)var2)
               )
               != rLp_1.WALKABLE) {
            return false;
         }
      }

      return true;
   }

   public double throws_() {
      return this.byte_;
   }

   public double case_() {
      return this.protected_;
   }

   public double protected_() {
      return this.break_;
   }
}
