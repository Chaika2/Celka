package celestial;

import java.util.List;

public class rBh_1 extends rBk_1 {
   private int class_;
   private final aA_2 break_;
   private rhd_3 byte_;
   private rPe_1 protected_;

   @Override
   public void byte_() {
      for (rSK var2 : ((rYB)this.break_.throws_[7]).class_(rSK.class, this.break_.rN().class_(5.0))) {
         if (var2.rU() != null && var2.rU() instanceof rhd_3) {
            this.byte_ = (rhd_3)var2.rU();
            break;
         }
      }

      this.class_ = 0;
      this.protected_ = rPe_1.GO_TO_BOAT;
   }

   public rBh_1(aA_2 var1) {
      this.break_ = var1;
   }

   @Override
   public boolean class_() {
      List var1 = ((rYB)this.break_.throws_[7]).class_(rSK.class, this.break_.rN().class_(5.0));
      boolean var2 = false;

      for (rSK var4 : var1) {
         an_3 var5 = var4.rU();
         if (var5 instanceof rhd_3 && (rfU_2.throws_((Float)((rhd_3)var5).private_[42]) > 0.0F || rfU_2.throws_((Float)((rhd_3)var5).private_[44]) > 0.0F)) {
            var2 = true;
            break;
         }
      }

      return this.byte_ != null && (rfU_2.throws_((Float)this.byte_.private_[42]) > 0.0F || rfU_2.throws_((Float)this.byte_.private_[44]) > 0.0F) || var2;
   }

   @Override
   public boolean break_() {
      return this.byte_ != null
         && this.byte_.Pm()
         && (rfU_2.throws_((Float)this.byte_.private_[42]) > 0.0F || rfU_2.throws_((Float)this.byte_.private_[44]) > 0.0F);
   }

   @Override
   public void throws_() {
      boolean var1 = rfU_2.throws_((Float)this.byte_.private_[42]) > 0.0F || rfU_2.throws_((Float)this.byte_.private_[44]) > 0.0F;
      float var2 = this.protected_ == rPe_1.GO_IN_BOAT_DIRECTION ? (var1 ? 0.01F : 0.0F) : 0.015F;
      this.break_
         .class_(
            var2,
            new rjU_2(
               (double)((Float)this.break_.private_[42]).floatValue(),
               (double)((Float)this.break_.private_[43]).floatValue(),
               (double)((Float)this.break_.private_[44]).floatValue()
            )
         );
      this.break_.class_(iG_2.SELF, this.break_.rv());
      if (--this.class_ <= 0) {
         this.class_ = 10;
         if (this.protected_ == rPe_1.GO_TO_BOAT) {
            rfH_2 var3 = this.byte_.Bs().break_(this.byte_.Pg().case_());
            var3 = var3.break_(0, -1, 0);
            this.break_.public_().class_((double)var3.b_(), (double)var3.c_(), (double)var3.d_(), 1.0);
            if (this.break_.implements_(this.byte_) < 4.0F) {
               this.class_ = 0;
               this.protected_ = rPe_1.GO_IN_BOAT_DIRECTION;
            }
         } else if (this.protected_ == rPe_1.GO_IN_BOAT_DIRECTION) {
            rpr_3 var6 = this.byte_.rS();
            rfH_2 var4 = this.byte_.Bs().class_(var6, 10);
            this.break_.public_().class_((double)var4.b_(), (double)(var4.c_() - 1), (double)var4.d_(), 1.0);
            if (this.break_.implements_(this.byte_) > 12.0F) {
               this.class_ = 0;
               this.protected_ = rPe_1.GO_TO_BOAT;
            }
         }
      }
   }

   @Override
   public void protected_() {
      this.byte_ = null;
   }

   @Override
   public boolean J_() {
      return true;
   }
}
