package celestial;

public class rLL extends rLy_1 {
   @Override
   protected rjU_2 byte_() {
      return this.break_.Ps();
   }

   public rLL(is_3 var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   public void class_() {
      this.case_++;
      if (this.final_) {
         this.implements_();
      }

      if (!this.native_()) {
         if (this.break_()) {
            this.extends_();
         } else if (this.protected_ != null && !this.protected_.byte_()) {
            rjU_2 var1 = this.protected_.class_(this.break_);
            if (rfU_2.byte_(this.break_.rx()) == rfU_2.byte_(var1.break_)
               && rfU_2.byte_(this.break_.re()) == rfU_2.byte_(var1.byte_)
               && rfU_2.byte_(this.break_.BO()) == rfU_2.byte_(var1.protected_)) {
               this.protected_.class_();
            }
         }

         ruP_2.class_(this.byte_, this.break_, this.protected_, this.volatile_);
         if (!this.native_()) {
            rjU_2 var2 = this.protected_.class_(this.break_);
            this.break_.super_().class_(var2.break_, var2.byte_, var2.protected_, this.throws_);
         }
      }
   }

   @Override
   protected boolean class_(rjU_2 var1, rjU_2 var2, int var3, int var4, int var5) {
      int var6 = rfU_2.byte_(var1.break_);
      int var7 = rfU_2.byte_(var1.byte_);
      int var8 = rfU_2.byte_(var1.protected_);
      double var9 = var2.break_ - var1.break_;
      double var11 = var2.byte_ - var1.byte_;
      double var13 = var2.protected_ - var1.protected_;
      double var15 = var9 * var9 + var11 * var11 + var13 * var13;
      if (var15 < 1.0E-8) {
         return false;
      } else {
         double var17 = 1.0 / Math.sqrt(var15);
         var9 *= var17;
         var11 *= var17;
         var13 *= var17;
         double var19 = 1.0 / Math.abs(var9);
         double var21 = 1.0 / Math.abs(var11);
         double var23 = 1.0 / Math.abs(var13);
         double var25 = (double)var6 - var1.break_;
         double var27 = (double)var7 - var1.byte_;
         double var29 = (double)var8 - var1.protected_;
         if (var9 >= 0.0) {
            var25++;
         }

         if (var11 >= 0.0) {
            var27++;
         }

         if (var13 >= 0.0) {
            var29++;
         }

         var25 /= var9;
         var27 /= var11;
         var29 /= var13;
         int var31 = var9 < 0.0 ? -1 : 1;
         int var32 = var11 < 0.0 ? -1 : 1;
         int var33 = var13 < 0.0 ? -1 : 1;
         int var34 = rfU_2.byte_(var2.break_);
         int var35 = rfU_2.byte_(var2.byte_);
         int var36 = rfU_2.byte_(var2.protected_);
         int var37 = var34 - var6;
         int var38 = var35 - var7;
         int var39 = var36 - var8;

         while (var37 * var31 > 0 || var38 * var32 > 0 || var39 * var33 > 0) {
            if (var25 < var29 && var25 <= var27) {
               var25 += var19;
               var6 += var31;
               var37 = var34 - var6;
            } else if (var27 < var25 && var27 <= var29) {
               var27 += var21;
               var7 += var32;
               var38 = var35 - var7;
            } else {
               var29 += var23;
               var8 += var33;
               var39 = var36 - var8;
            }
         }

         return true;
      }
   }

   @Override
   public boolean class_(rfH_2 var1) {
      return this.byte_.byte_(var1).class_(this.byte_, var1, this.break_);
   }

   public void class_(boolean var1) {
      this.int_.break_(var1);
   }

   @Override
   protected rLl_1 class_(int var1) {
      this.int_ = new rLF();
      this.int_.class_(true);
      return new rLl_1(this.int_, var1);
   }

   @Override
   public rLC class_(an_3 var1, int var2) {
      return this.class_(var1.Bs(), var2);
   }

   @Override
   protected boolean break_() {
      return this.new_() && this.package_() || !this.break_.Pm();
   }

   public void break_(boolean var1) {
      this.int_.class_(var1);
   }
}
