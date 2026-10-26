package celestial;

import java.util.Random;

public class rPa_1 extends rBp_1 {
   private final xd_3 catch_;
   private final is_3 private_;
   private int implements_;

   @Override
   public void byte_() {
      super.byte_();
      this.implements_ = 0;
   }

   public rPa_1(xd_3 var1, aA_2 var2, double var3, int var5) {
      super(var2, var3, 24, var5);
      this.catch_ = var1;
      this.private_ = var2;
   }

   public void class_(rRg_1 var1, rfH_2 var2) {
   }

   public void class_(rYB var1, rfH_2 var2) {
   }

   private rfH_2 class_(rfH_2 var1, rRq_1 var2) {
      if (var2.byte_(var1).class_(this.catch_)) {
         return var1;
      } else {
         rfH_2[] var3 = new rfH_2[]{var1.break_(), var1.byte_(), var1.extends_(), var1.private_(), var1.protected_(), var1.break_().break_()};

         for (rfH_2 var7 : var3) {
            if (var2.byte_(var7).class_(this.catch_)) {
               return var7;
            }
         }

         return null;
      }
   }

   @Override
   protected boolean class_(rRR var1, rfH_2 var2) {
      roC_2 var3 = var1.class_(var2.b_() >> 4, var2.d_() >> 4, roN_2.volatile_, false);
      return var3 == null ? false : var3.byte_(var2).class_(this.catch_) && var3.byte_(var2.final_()).catch_() && var3.byte_(var2.break_(2)).catch_();
   }

   @Override
   public boolean class_() {
      if (!((rYB)this.private_.throws_[7]).B().break_(rRu_1.break_)) {
         return false;
      } else if (this.byte_ > 0) {
         this.byte_--;
         return false;
      } else if (this.final_()) {
         this.byte_ = 20;
         return true;
      } else {
         this.byte_ = this.class_(this.class_);
         return false;
      }
   }

   @Override
   public void throws_() {
      super.throws_();
      rYB var1 = (rYB)this.private_.throws_[7];
      rfH_2 var2 = this.private_.Bs();
      rfH_2 var3 = this.class_(var2, var1);
      Random var4 = this.private_.Sa();
      if (this.native_() && var3 != null) {
         if (this.implements_ > 0) {
            rjU_2 var5 = this.private_.rv();
            this.private_.catch_(var5.break_, 0.3, var5.protected_);
            if (!var1.continue_) {
               double var6 = 0.08;
               ((rrEm_1)var1)
                  .class_(
                     new rLk_1(rLQ.void_, new rdn_3(rdy_3.XJ)),
                     (double)var3.b_() + 0.5,
                     (double)var3.c_() + 0.7,
                     (double)var3.d_() + 0.5,
                     3,
                     ((double)var4.nextFloat() - 0.5) * 0.08,
                     ((double)var4.nextFloat() - 0.5) * 0.08,
                     ((double)var4.nextFloat() - 0.5) * 0.08,
                     0.15F
                  );
            }
         }

         if (this.implements_ % 2 == 0) {
            rjU_2 var12 = this.private_.rv();
            this.private_.catch_(var12.break_, -0.3, var12.protected_);
            if (this.implements_ % 6 == 0) {
               this.class_((rRg_1)var1, this.throws_);
            }
         }

         if (this.implements_ > 60) {
            var1.class_(var3, false);
            if (!var1.continue_) {
               for (int var13 = 0; var13 < 20; var13++) {
                  double var14 = var4.nextGaussian() * 0.02;
                  double var8 = var4.nextGaussian() * 0.02;
                  double var10 = var4.nextGaussian() * 0.02;
                  ((rrEm_1)var1).class_(rLQ.boolean_, (double)var3.b_() + 0.5, (double)var3.c_(), (double)var3.d_() + 0.5, 1, var14, var8, var10, 0.15F);
               }

               this.class_(var1, var3);
            }
         }

         this.implements_++;
      }
   }

   @Override
   public void protected_() {
      super.protected_();
      is_3 var10000 = this.private_;
      Float var5 = 1.0F;
      var10000.throws_[31] = var5;
   }

   private boolean final_() {
      return this.throws_ != null && this.class_((rRR)((rYB)this.class_.throws_[7]), this.throws_) ? true : this.volatile_();
   }
}
