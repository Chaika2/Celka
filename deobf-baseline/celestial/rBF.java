package celestial;

import java.util.EnumSet;
import java.util.List;

public class rBF extends rBk_1 {
   public final rhP_2 id_class;
   private double id_break;
   private int id_byte;

   public rBF(rhP_2 var1, double var2) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_class(EnumSet.of(rBW.MOVE));
   }

   private boolean id_class(rhP_2 var1, int var2) {
      if (var2 > 8) {
         return false;
      } else if (var1.EB()) {
         if (var1.ES().z()) {
            return true;
         } else {
            rhP_2 var3 = var1.ES();
            return this.id_class(var3, ++var2);
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean id_class() {
      if (!this.id_class.z() && !this.id_class.EB()) {
         List var1 = ((rYB)this.id_class.id_throws[7]).id_break(this.id_class, this.id_class.rN().id_byte(9.0, 4.0, 9.0), var0 -> {
            aI_2 var1x = var0.BC();
            return var1x == aI_2.id_transient || var1x == aI_2.R;
         });
         rhP_2 var2 = null;
         double var3 = Double.MAX_VALUE;

         for (an_3 var6 : var1) {
            rhP_2 var7 = (rhP_2)var6;
            if (var7.EB() && !var7.EP()) {
               double var8 = this.id_class.id_int(var7);
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
                  double var13 = this.id_class.id_int(var12);
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
         } else if (!var2.z() && !this.id_class(var2, 1)) {
            return false;
         } else {
            this.id_class.id_class(var2);
            return true;
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean id_break() {
      if (this.id_class.EB() && this.id_class.ES().BM() && this.id_class(this.id_class, 0)) {
         double var1 = this.id_class.id_int(this.id_class.ES());
         if (var1 > 676.0) {
            if (this.id_break <= 3.0) {
               this.id_break *= 1.2;
               this.id_byte = 40;
               return true;
            }

            if (this.id_byte == 0) {
               return false;
            }
         }

         if (this.id_byte > 0) {
            this.id_byte--;
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public void id_throws() {
      if (this.id_class.EB() && !(this.id_class.N() instanceof rsM_2)) {
         rhP_2 var1 = this.id_class.ES();
         double var2 = (double)this.id_class.id_implements(var1);
         float var4 = 2.0F;
         rjU_2 var5 = new rjU_2(var1.rx() - this.id_class.rx(), var1.re() - this.id_class.re(), var1.BO() - this.id_class.BO())
            .id_protected()
            .id_class(Math.max(var2 - 2.0, 0.0));
         this.id_class
            .id_public()
            .id_class(this.id_class.rx() + var5.id_break, this.id_class.re() + var5.id_byte, this.id_class.BO() + var5.id_protected, this.id_break);
      }
   }

   @Override
   public void id_protected() {
      this.id_class.Er();
      this.id_break = 2.1;
   }
}
