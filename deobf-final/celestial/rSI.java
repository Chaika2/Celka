package celestial;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rSI extends rSp_1 {
   private static final Logger break_ = LogManager.getLogger();
   private int byte_;
   private rLC protected_;
   private rjU_2 throws_;
   private iB_2 case_;
   private boolean catch_;

   @Override
   public void byte_() {
      this.byte_ = 0;
      this.throws_ = null;
      this.protected_ = null;
      this.case_ = null;
   }

   public rSI(rSu_1 var1) {
      super(var1);
   }

   public void class_(iB_2 var1) {
      this.case_ = var1;
      int var2 = this.class_.catch_();
      int var3 = this.class_.continue_(this.case_.rx(), this.case_.re(), this.case_.BO());
      int var4 = rfU_2.byte_(this.case_.rx());
      int var5 = rfU_2.byte_(this.case_.BO());
      double var6 = (double)var4 - this.class_.rx();
      double var8 = (double)var5 - this.class_.BO();
      double var10 = (double)rfU_2.class_(var6 * var6 + var8 * var8);
      double var12 = Math.min(0.4F + var10 / 80.0 - 1.0, 10.0);
      int var14 = rfU_2.byte_(this.case_.re() + var12);
      rLq_1 var15 = new rLq_1(var4, var14, var5);
      this.protected_ = this.class_.class_(var2, var3, var15);
      if (this.protected_ != null) {
         this.protected_.class_();
         this.extends_();
      }
   }

   @Override
   public void break_() {
      if (this.case_ == null) {
         break_.warn("Skipping player strafe phase because no player was found");
         this.class_.L().class_(rST.class_);
      } else {
         if (this.protected_ != null && this.protected_.byte_()) {
            double var1 = this.case_.rx();
            double var3 = this.case_.BO();
            double var5 = var1 - this.class_.rx();
            double var7 = var3 - this.class_.BO();
            double var9 = (double)rfU_2.class_(var5 * var5 + var7 * var7);
            double var11 = Math.min(0.4F + var9 / 80.0 - 1.0, 10.0);
            this.throws_ = new rjU_2(var1, this.case_.re() + var11, var3);
         }

         double var25 = this.throws_ == null ? 0.0 : this.throws_.protected_(this.class_.rx(), this.class_.re(), this.class_.BO());
         if (var25 < 100.0 || var25 > 22500.0) {
            this.finally_();
         }

         double var26 = 64.0;
         if (this.case_.int_(this.class_) < 4096.0) {
            if (this.class_.while_(this.case_)) {
               this.byte_++;
               rjU_2 var27 = new rjU_2(this.case_.rx() - this.class_.rx(), 0.0, this.case_.BO() - this.class_.BO()).protected_();
               rjU_2 var6 = new rjU_2(
                     (double)rfU_2.class_((Float)this.class_.throws_[15] * (float) (Math.PI / 180.0)),
                     0.0,
                     (double)(-rfU_2.break_((Float)this.class_.throws_[15] * (float) (Math.PI / 180.0)))
                  )
                  .protected_();
               float var28 = (float)var6.break_(var27);
               float var8 = (float)(Math.acos((double)var28) * 180.0F / (float)Math.PI);
               var8 += 0.5F;
               if (this.byte_ >= 5 && var8 >= 0.0F && var8 < 10.0F) {
                  double var30 = 1.0;
                  rjU_2 var31 = this.class_.break_(1.0F);
                  double var12 = this.class_.super_.rx() - var31.break_ * 1.0;
                  double var14 = this.class_.super_.byte_(0.5) + 0.5;
                  double var16 = this.class_.super_.BO() - var31.protected_ * 1.0;
                  double var18 = this.case_.rx() - var12;
                  double var20 = this.case_.byte_(0.5) - var14;
                  double var22 = this.case_.BO() - var16;
                  if (!this.class_.BF()) {
                     ((rYB)this.class_.throws_[7]).class_((rhd_3)null, 1017, this.class_.Bs(), 0);
                  }

                  rhA_2 var24 = new rhA_2((rYB)this.class_.throws_[7], this.class_, var18, var20, var22);
                  var24.class_(var12, var14, var16, 0.0F, 0.0F);
                  ((rYB)this.class_.throws_[7]).a_(var24);
                  this.byte_ = 0;
                  if (this.protected_ != null) {
                     while (!this.protected_.byte_()) {
                        this.protected_.class_();
                     }
                  }

                  this.class_.L().class_(rST.class_);
               }
            } else if (this.byte_ > 0) {
               this.byte_--;
            }
         } else if (this.byte_ > 0) {
            this.byte_--;
         }
      }
   }

   private void finally_() {
      if (this.protected_ == null || this.protected_.byte_()) {
         int var1 = this.class_.catch_();
         int var2 = var1;
         if (this.class_.Sa().nextInt(8) == 0) {
            this.catch_ = !this.catch_;
            var2 = var1 + 6;
         }

         if (this.catch_) {
            var2++;
         } else {
            var2--;
         }

         if (this.class_.n() != null && this.class_.n().byte_() > 0) {
            var2 %= 12;
            if (var2 < 0) {
               var2 += 12;
            }
         } else {
            var2 -= 12;
            var2 &= 7;
            var2 += 12;
         }

         this.protected_ = this.class_.class_(var1, var2, (rLq_1)null);
         if (this.protected_ != null) {
            this.protected_.class_();
         }
      }

      this.extends_();
   }

   private void extends_() {
      if (this.protected_ != null && !this.protected_.byte_()) {
         rfH_2 var1 = this.protected_.catch_();
         this.protected_.class_();
         double var2 = (double)var1.b_();
         double var4 = (double)var1.d_();

         double var6;
         do {
            var6 = (double)((float)var1.c_() + this.class_.Sa().nextFloat() * 20.0F);
         } while (var6 < (double)var1.c_());

         this.throws_ = new rjU_2(var2, var6, var4);
      }
   }

   @Override
   public rjU_2 case_() {
      return this.throws_;
   }

   @Override
   public rST<rSI> protected_() {
      return rST.break_;
   }
}
