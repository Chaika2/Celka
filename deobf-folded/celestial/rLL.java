package celestial;

public class rLL extends rLy_1 {
   @Override
   protected rjU_2 id_byte() {
      return this.id_break.Ps();
   }

   public rLL(is_3 var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   public void id_class() {
      this.id_case++;
      if (this.id_final) {
         this.id_implements();
      }

      if (!this.id_native()) {
         if (this.id_break()) {
            this.id_extends();
         } else if (this.id_protected != null && !this.id_protected.id_byte()) {
            rjU_2 var1 = this.id_protected.id_class(this.id_break);
            if (rfU_2.id_byte(this.id_break.rx()) == rfU_2.id_byte(var1.id_break)
               && rfU_2.id_byte(this.id_break.re()) == rfU_2.id_byte(var1.id_byte)
               && rfU_2.id_byte(this.id_break.BO()) == rfU_2.id_byte(var1.id_protected)) {
               this.id_protected.id_class();
            }
         }

         ruP_2.id_class(this.id_byte, this.id_break, this.id_protected, this.id_volatile);
         if (!this.id_native()) {
            rjU_2 var2 = this.id_protected.id_class(this.id_break);
            this.id_break.id_super().id_class(var2.id_break, var2.id_byte, var2.id_protected, this.id_throws);
         }
      }
   }

   @Override
   protected boolean id_class(rjU_2 var1, rjU_2 var2, int var3, int var4, int var5) {
      int var6 = rfU_2.id_byte(var1.id_break);
      int var7 = rfU_2.id_byte(var1.id_byte);
      int var8 = rfU_2.id_byte(var1.id_protected);
      double var9 = var2.id_break - var1.id_break;
      double var11 = var2.id_byte - var1.id_byte;
      double var13 = var2.id_protected - var1.id_protected;
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
         double var25 = (double)var6 - var1.id_break;
         double var27 = (double)var7 - var1.id_byte;
         double var29 = (double)var8 - var1.id_protected;
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
         int var34 = rfU_2.id_byte(var2.id_break);
         int var35 = rfU_2.id_byte(var2.id_byte);
         int var36 = rfU_2.id_byte(var2.id_protected);
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
   public boolean id_class(rfH_2 var1) {
      return this.id_byte.id_byte(var1).id_class(this.id_byte, var1, this.id_break);
   }

   public void id_class(boolean var1) {
      this.id_int.id_break(var1);
   }

   @Override
   protected rLl_1 id_class(int var1) {
      this.id_int = new rLF();
      this.id_int.id_class(true);
      return new rLl_1(this.id_int, var1);
   }

   @Override
   public rLC id_class(an_3 var1, int var2) {
      return this.id_class(var1.Bs(), var2);
   }

   @Override
   protected boolean id_break() {
      return this.id_new() && this.id_package() || !this.id_break.Pm();
   }

   public void id_break(boolean var1) {
      this.id_int.id_class(var1);
   }
}
