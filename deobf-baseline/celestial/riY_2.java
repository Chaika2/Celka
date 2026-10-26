package celestial;

import java.util.Random;

public abstract class riY_2 extends rrrn_1 {
   protected final int id_class;
   protected final int id_break;
   protected final int id_byte;
   protected int id_protected = -1;

   protected riY_2(raF_2 var1, Random var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      super(var1, 0);
      this.id_class = var6;
      this.id_break = var7;
      this.id_byte = var8;
      this.id_class(rpb_3.HORIZONTAL.id_class(var2));
      if (this.id_implements().id_final() == rpB_2.Z) {
         this.id_final = new rfi_3(var3, var4, var5, var3 + var6 - 1, var4 + var7 - 1, var5 + var8 - 1);
      } else {
         this.id_final = new rfi_3(var3, var4, var5, var3 + var8 - 1, var4 + var7 - 1, var5 + var6 - 1);
      }
   }

   protected riY_2(raF_2 var1, rcd_3 var2) {
      super(var1, var2);
      this.id_class = var2.id_private("Width");
      this.id_break = var2.id_private("Height");
      this.id_byte = var2.id_private("Depth");
      this.id_protected = var2.id_private("HPos");
   }

   protected boolean id_class(rRg_1 var1, rfi_3 var2, int var3) {
      if (this.id_protected >= 0) {
         return true;
      } else {
         int var4 = 0;
         int var5 = 0;
         rfw_3 var6 = new rfw_3();

         for (int var7 = this.id_final.id_byte; var7 <= this.id_final.id_case; var7++) {
            for (int var8 = this.id_final.id_class; var8 <= this.id_final.id_protected; var8++) {
               var6.id_class(var8, 64, var7);
               if (var2.id_break(var6)) {
                  var4 += var1.id_class(rKv_1.MOTION_BLOCKING_NO_LEAVES, var6).c_();
                  var5++;
               }
            }
         }

         if (var5 == 0) {
            return false;
         } else {
            this.id_protected = var4 / var5;
            this.id_final.id_class(0, this.id_protected - this.id_final.id_break + var3, 0);
            return true;
         }
      }
   }

   @Override
   protected void id_class(rcd_3 var1) {
      var1.id_break("Width", this.id_class);
      var1.id_break("Height", this.id_break);
      var1.id_break("Depth", this.id_byte);
      var1.id_break("HPos", this.id_protected);
   }
}
