package celestial;

import java.util.EnumSet;
import java.util.List;

public class rBF extends rBk_1 {
   public final rhP_2 class_;
   private double break_;
   private int byte_;

   public rBF(rhP_2 var1, double var2) {
      this.class_ = var1;
      this.break_ = var2;
      this.class_(EnumSet.of(rBW.MOVE));
   }

   private boolean class_(rhP_2 var1, int var2) {
      if (var2 > 8) {
         return false;
      } else if (var1.EB()) {
         if (var1.ES().z()) {
            return true;
         } else {
            rhP_2 var3 = var1.ES();
            return this.class_(var3, ++var2);
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean class_() {
      if (!this.class_.z() && !this.class_.EB()) {
         List var1 = ((rYB)this.class_.throws_[7]).break_(this.class_, this.class_.rN().byte_(9.0, 4.0, 9.0), var0 -> {
            aI_2 var1x = var0.BC();
            return var1x == aI_2.transient_ || var1x == aI_2.R;
         });
         rhP_2 var2 = null;
         double var3 = Double.MAX_VALUE;

         for (an_3 var6 : var1) {
            rhP_2 var7 = (rhP_2)var6;
            if (var7.EB() && !var7.EP()) {
               double var8 = this.class_.int_(var7);
               if (!(var8 > var3)) {
                  var3 = var8;
                  var2 = var7;
               }
            }
         }

         if (var2 == null) {
            for (an_3 var11 : var1) {
               rhP_2 var12 = (rhP_2)var11;
               if (var12.z() && !var12.EP()) {
                  double var13 = this.class_.int_(var12);
                  if (!(var13 > var3)) {
                     var3 = var13;
                     var2 = var12;
                  }
               }
            }
         }

         if (var2 == null) {
            return false;
         } else if (var3 < 4.0) {
            return false;
         } else if (!var2.z() && !this.class_(var2, 1)) {
            return false;
         } else {
            this.class_.class_(var2);
            return true;
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean break_() {
      if (this.class_.EB() && this.class_.ES().BM() && this.class_(this.class_, 0)) {
         double var1 = this.class_.int_(this.class_.ES());
         if (var1 > 676.0) {
            if (this.break_ <= 3.0) {
               this.break_ *= 1.2;
               this.byte_ = 40;
               return true;
            }

            if (this.byte_ == 0) {
               return false;
            }
         }

         if (this.byte_ > 0) {
            this.byte_--;
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public void throws_() {
      if (this.class_.EB() && !(this.class_.N() instanceof rsM_2)) {
         rhP_2 var1 = this.class_.ES();
         double var2 = (double)this.class_.implements_(var1);
         float var4 = 2.0F;
         rjU_2 var5 = new rjU_2(var1.rx() - this.class_.rx(), var1.re() - this.class_.re(), var1.BO() - this.class_.BO())
            .protected_()
            .class_(Math.max(var2 - 2.0, 0.0));
         this.class_.public_().class_(this.class_.rx() + var5.break_, this.class_.re() + var5.byte_, this.class_.BO() + var5.protected_, this.break_);
      }
   }

   @Override
   public void protected_() {
      this.class_.Er();
      this.break_ = 2.1;
   }
}
