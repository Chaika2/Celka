package celestial;

import java.util.EnumSet;

public class rBY extends rBk_1 {
   protected final aA_2 class_;
   protected final double break_;
   protected double byte_;
   protected double protected_;
   protected double throws_;
   protected boolean case_;

   @Override
   public void byte_() {
      this.class_.public_().class_(this.byte_, this.protected_, this.throws_, this.break_);
      this.case_ = true;
   }

   public rBY(aA_2 var1, double var2) {
      this.class_ = var1;
      this.break_ = var2;
      this.class_(EnumSet.of(rBW.MOVE));
   }

   @Override
   public boolean class_() {
      if (this.class_.Sr() == null && !this.class_.Pz()) {
         return false;
      } else {
         if (this.class_.Pz()) {
            rfH_2 var1 = this.class_((rYB)this.class_.throws_[7], this.class_, 5, 4);
            if (var1 != null) {
               this.byte_ = (double)var1.b_();
               this.protected_ = (double)var1.c_();
               this.throws_ = (double)var1.d_();
               return true;
            }
         }

         return this.catch_();
      }
   }

   protected rfH_2 class_(rRq_1 var1, an_3 var2, int var3, int var4) {
      rfH_2 var5 = var2.Bs();
      int var6 = var5.b_();
      int var7 = var5.c_();
      int var8 = var5.d_();
      float var9 = (float)(var3 * var3 * var4 * 2);
      rfH_2 var10 = null;
      rfw_3 var11 = new rfw_3();

      for (int var12 = var6 - var3; var12 <= var6 + var3; var12++) {
         for (int var13 = var7 - var4; var13 <= var7 + var4; var13++) {
            for (int var14 = var8 - var3; var14 <= var8 + var3; var14++) {
               var11.class_(var12, var13, var14);
               if (var1.break_(var11).class_(rlG_2.break_)) {
                  float var15 = (float)((var12 - var6) * (var12 - var6) + (var13 - var7) * (var13 - var7) + (var14 - var8) * (var14 - var8));
                  if (var15 < var9) {
                     var9 = var15;
                     var10 = new rfH_2(var11);
                  }
               }
            }
         }
      }

      return var10;
   }

   @Override
   public boolean break_() {
      return !this.class_.public_().native_();
   }

   protected boolean catch_() {
      rjU_2 var1 = iX_2.class_(this.class_, 5, 4);
      if (var1 == null) {
         return false;
      } else {
         this.byte_ = var1.break_;
         this.protected_ = var1.byte_;
         this.throws_ = var1.protected_;
         return true;
      }
   }

   @Override
   public void protected_() {
      this.case_ = false;
   }

   public boolean private_() {
      return this.case_;
   }
}
