package celestial;

import java.util.Optional;
import java.util.Random;

public class rHc_1 extends ryO_2 implements rHf_1, rXc_1 {
   private final rqs_3<rdn_3> class_ = rqs_3.class_(4, rdn_3.break_);
   private final int[] break_ = new int[4];
   private final int[] byte_ = new int[4];

   public rHc_1() {
      super(ryW_2.abstract_);
   }

   @Override
   public rcd_3 class_(rcd_3 var1) {
      this.break_(var1);
      var1.class_("CookingTimes", this.break_);
      var1.class_("CookingTotalTimes", this.byte_);
      return var1;
   }

   @Override
   public void class_(xc_3 var1, rcd_3 var2) {
      super.class_(var1, var2);
      this.class_.clear();
      rXC.break_(var2, this.class_);
      if (var2.byte_("CookingTimes", 11)) {
         int[] var3 = var2.final_("CookingTimes");
         System.arraycopy(var3, 0, this.break_, 0, Math.min(this.byte_.length, var3.length));
      }

      if (var2.byte_("CookingTotalTimes", 11)) {
         int[] var4 = var2.final_("CookingTotalTimes");
         System.arraycopy(var4, 0, this.byte_, 0, Math.min(this.byte_.length, var4.length));
      }
   }

   public Optional<rkC_2> class_(rdn_3 var1) {
      return this.class_.stream().noneMatch(rdn_3::class_) ? Optional.empty() : this.extends_.implements_().class_(rkj_3.throws_, new rXA(var1), this.extends_);
   }

   public boolean class_(rdn_3 var1, int var2) {
      for (int var3 = 0; var3 < this.class_.size(); var3++) {
         rdn_3 var4 = this.class_.get(var3);
         if (var4.class_()) {
            this.byte_[var3] = var2;
            this.break_[var3] = 0;
            this.class_.set(var3, var1.class_(1));
            this.extends_();
            return true;
         }
      }

      return false;
   }

   public rqs_3<rdn_3> class_() {
      return this.class_;
   }

   private rcd_3 break_(rcd_3 var1) {
      super.class_(var1);
      rXC.class_(var1, this.class_, true);
      return var1;
   }

   @Override
   public void throws_() {
      boolean var1 = this.abstract_().byte_(xn_3.final_);
      boolean var2 = this.extends_.continue_;
      if (var2) {
         if (var1) {
            this.finally_();
         }
      } else if (var1) {
         this.private_();
      } else {
         for (int var3 = 0; var3 < this.class_.size(); var3++) {
            if (this.break_[var3] > 0) {
               this.break_[var3] = rfU_2.class_(this.break_[var3] - 2, 0, this.byte_[var3]);
            }
         }
      }
   }

   private void finally_() {
      rYB var1 = this.while_();
      if (var1 != null) {
         rfH_2 var2 = this.char_();
         Random var3 = var1.int_;
         if (var3.nextFloat() < 0.11F) {
            for (int var4 = 0; var4 < var3.nextInt(2) + 2; var4++) {
               xn_3.class_(var1, var2, this.abstract_().byte_(xn_3.package_), false);
            }
         }

         int var15 = this.abstract_().byte_(xn_3.new_).protected_();

         for (int var5 = 0; var5 < this.class_.size(); var5++) {
            if (!this.class_.get(var5).class_() && var3.nextFloat() < 0.2F) {
               rpr_3 var6 = rpr_3.break_(Math.floorMod(var5 + var15, 4));
               float var7 = 0.3125F;
               double var8 = (double)var2.b_() + 0.5 - (double)((float)var6.implements_() * 0.3125F) + (double)((float)var6.catch_().implements_() * 0.3125F);
               double var10 = (double)var2.c_() + 0.5;
               double var12 = (double)var2.d_() + 0.5 - (double)((float)var6.extends_() * 0.3125F) + (double)((float)var6.catch_().extends_() * 0.3125F);

               for (int var14 = 0; var14 < 4; var14++) {
                  var1.class_(rLQ.double_, var8, var10, var12, 0.0, 5.0E-4, 0.0);
               }
            }
         }
      }
   }

   public void catch_() {
      if (this.extends_ != null) {
         if (!this.extends_.continue_) {
            rXn_1.class_(this.extends_, this.char_(), this.class_());
         }

         this.extends_();
      }
   }

   private void extends_() {
      this.break_();
      this.while_().class_(this.char_(), this.abstract_(), this.abstract_(), 3);
   }

   @Override
   public void public_() {
      this.class_.clear();
   }

   private void private_() {
      for (int var1 = 0; var1 < this.class_.size(); var1++) {
         rdn_3 var2 = this.class_.get(var1);
         if (!var2.class_()) {
            this.break_[var1]++;
            if (this.break_[var1] >= this.byte_[var1]) {
               rXA var4 = new rXA(var2);
               rdn_3 var5 = this.extends_.implements_().class_(rkj_3.throws_, var4, this.extends_).map(var1x -> var1x.class_(var4)).orElse(var2);
               rfH_2 var6 = this.char_();
               rXn_1.class_(this.extends_, (double)var6.b_(), (double)var6.c_(), (double)var6.d_(), var5);
               this.class_.set(var1, rdn_3.break_);
               this.extends_();
            }
         }
      }
   }

   @Override
   public rFy_1 Y_() {
      return new rFy_1(this.native_, 13, this.Z_());
   }

   @Override
   public rcd_3 Z_() {
      return this.break_(new rcd_3());
   }
}
