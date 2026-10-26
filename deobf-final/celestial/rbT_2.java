package celestial;

import java.util.EnumSet;
import java.util.Optional;
import java.util.function.Predicate;

class rbT_2 extends rbq_3 {
   private final Predicate<xc_3> byte_;
   private int protected_;
   private int throws_;
   private boolean case_;
   private rjU_2 catch_;
   private int private_;

   @Override
   public void byte_() {
      this.protected_ = 0;
      this.private_ = 0;
      this.throws_ = 0;
      this.case_ = true;
      this.class_.sJ();
   }

   rbT_2(rbF_2 var1) {
      super(var1);
      this.class_ = var1;
      this.byte_ = var0 -> {
         if (var0.class_(rls_3.const_)) {
            return var0.class_(xu_3.Gr) ? var0.byte_(du_3.volatile_) == rCf_1.UPPER : true;
         } else {
            return var0.class_(rls_3.import_);
         }
      };
      this.protected_ = 0;
      this.throws_ = 0;
      this.private_ = 0;
      this.class_(EnumSet.of(rBW.MOVE));
   }

   private Optional<rfH_2> class_(Predicate<xc_3> var1, double var2) {
      rfH_2 var4 = this.class_.Bs();
      rfw_3 var5 = new rfw_3();

      for (int var6 = 0; (double)var6 <= var2; var6 = var6 > 0 ? -var6 : 1 - var6) {
         for (int var7 = 0; (double)var7 < var2; var7++) {
            for (int var8 = 0; var8 <= var7; var8 = var8 > 0 ? -var8 : 1 - var8) {
               for (int var9 = var8 < var7 && var8 > -var7 ? var7 : 0; var9 <= var7; var9 = var9 > 0 ? -var9 : 1 - var9) {
                  var5.class_(var4, var8, var6 - 1, var9);
                  if (var4.class_(var5, var2) && var1.test(((rYB)this.class_.throws_[7]).byte_(var5))) {
                     return Optional.of(var5);
                  }
               }
            }
         }
      }

      return Optional.empty();
   }

   @Override
   public void throws_() {
      this.private_++;
      if (this.private_ > 600) {
         this.class_.char_ = null;
      } else {
         rjU_2 var1 = rjU_2.protected_(this.class_.char_).break_(0.0, 0.6F, 0.0);
         if (var1.case_(this.class_.Ps()) > 1.0) {
            this.catch_ = var1;
            this.volatile_();
         } else {
            if (this.catch_ == null) {
               this.catch_ = var1;
            }

            boolean var2 = this.class_.Ps().case_(this.catch_) <= 0.1;
            boolean var3 = true;
            if (!var2 && this.private_ > 600) {
               this.class_.char_ = null;
            } else {
               if (var2) {
                  boolean var4 = rbF_2.this_(this.class_).nextInt(25) == 0;
                  if (var4) {
                     this.catch_ = new rjU_2(var1.class_() + (double)this.final_(), var1.break_(), var1.byte_() + (double)this.final_());
                     rbF_2.else_(this.class_).final_();
                  } else {
                     var3 = false;
                  }

                  this.class_.continue_().class_(var1.class_(), var1.break_(), var1.byte_());
               }

               if (var3) {
                  this.volatile_();
               }

               this.protected_++;
               if (rbF_2.synchronized_(this.class_).nextFloat() < 0.05F && this.protected_ > this.throws_ + 60) {
                  this.throws_ = this.protected_;
                  this.class_.class_(rqn_3.T, 1.0F, 1.0F);
               }
            }
         }
      }
   }

   private boolean finally_() {
      return this.protected_ > 400;
   }

   @Override
   public boolean catch_() {
      if (this.class_.interface_ > 0) {
         return false;
      } else if (this.class_.sc()) {
         return false;
      } else if (((rYB)this.class_.throws_[7]).s()) {
         return false;
      } else if (rbF_2.int_(this.class_).nextFloat() < 0.7F) {
         return false;
      } else {
         Optional var1 = this.package_();
         if (var1.isPresent()) {
            this.class_.char_ = (rfH_2)var1.get();
            rbF_2.new_(this.class_)
               .class_((double)this.class_.char_.b_() + 0.5, (double)this.class_.char_.c_() + 0.5, (double)this.class_.char_.d_() + 0.5, 1.2F);
            return true;
         } else {
            return false;
         }
      }
   }

   boolean extends_() {
      return this.case_;
   }

   private Optional<rfH_2> package_() {
      return this.class_(this.byte_, 5.0);
   }

   @Override
   public void protected_() {
      if (this.finally_()) {
         this.class_.this_(true);
      }

      this.case_ = false;
      rbF_2.super_(this.class_).final_();
      this.class_.interface_ = 200;
   }

   @Override
   public boolean private_() {
      if (!this.case_) {
         return false;
      } else if (!this.class_.n()) {
         return false;
      } else if (((rYB)this.class_.throws_[7]).s()) {
         return false;
      } else if (this.finally_()) {
         return rbF_2.continue_(this.class_).nextFloat() < 0.2F;
      } else if ((Integer)this.class_.throws_[41] % 20 == 0 && !this.class_.volatile_(this.class_.char_)) {
         this.class_.char_ = null;
         return false;
      } else {
         return true;
      }
   }

   private float final_() {
      return (rbF_2.return_(this.class_).nextFloat() * 2.0F - 1.0F) * 0.33333334F;
   }

   private void volatile_() {
      this.class_.super_().class_(this.catch_.class_(), this.catch_.break_(), this.catch_.byte_(), 0.35F);
   }

   void native_() {
      this.case_ = false;
   }
}
