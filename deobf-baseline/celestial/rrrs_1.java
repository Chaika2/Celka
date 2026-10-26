package celestial;

import java.util.List;
import java.util.Random;

public class rrrs_1 extends rrrQ {
   private final int id_class;

   public rrrs_1(int var1, rfi_3 var2, rpr_3 var3) {
      super(raF_2.id_else, var1);
      this.id_class(var3);
      this.id_final = var2;
      this.id_class = var3 != rpr_3.NORTH && var3 != rpr_3.SOUTH ? var2.id_protected() : var2.id_case();
   }

   public rrrs_1(rrPt_1 var1, rcd_3 var2) {
      super(raF_2.id_else, var2);
      this.id_class = var2.id_private("Steps");
   }

   public static rfi_3 id_class(List<rrrn_1> var0, Random var1, int var2, int var3, int var4, rpr_3 var5) {
      byte var6 = 3;
      rfi_3 var7 = rfi_3.id_class(var2, var3, var4, -1, -1, 0, 5, 5, 4, var5);
      rrrn_1 var8 = rrrn_1.id_class(var0, var7);
      if (var8 == null) {
         return null;
      } else {
         if (var8.id_catch().id_break == var7.id_break) {
            for (int var9 = 3; var9 >= 1; var9--) {
               var7 = rfi_3.id_class(var2, var3, var4, -1, -1, 0, 5, 5, var9 - 1, var5);
               if (!var8.id_catch().id_class(var7)) {
                  return rfi_3.id_class(var2, var3, var4, -1, -1, 0, 5, 5, var9, var5);
               }
            }
         }

         return null;
      }
   }

   @Override
   public boolean id_class(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7) {
      for (int var8 = 0; var8 < this.id_class; var8++) {
         this.id_class(var1, xu_3.BL.id_continue(), 0, 0, var8, var5);
         this.id_class(var1, xu_3.BL.id_continue(), 1, 0, var8, var5);
         this.id_class(var1, xu_3.BL.id_continue(), 2, 0, var8, var5);
         this.id_class(var1, xu_3.BL.id_continue(), 3, 0, var8, var5);
         this.id_class(var1, xu_3.BL.id_continue(), 4, 0, var8, var5);

         for (int var9 = 1; var9 <= 3; var9++) {
            this.id_class(var1, xu_3.BL.id_continue(), 0, var9, var8, var5);
            this.id_class(var1, xu_3.hb.id_continue(), 1, var9, var8, var5);
            this.id_class(var1, xu_3.hb.id_continue(), 2, var9, var8, var5);
            this.id_class(var1, xu_3.hb.id_continue(), 3, var9, var8, var5);
            this.id_class(var1, xu_3.BL.id_continue(), 4, var9, var8, var5);
         }

         this.id_class(var1, xu_3.BL.id_continue(), 0, 4, var8, var5);
         this.id_class(var1, xu_3.BL.id_continue(), 1, 4, var8, var5);
         this.id_class(var1, xu_3.BL.id_continue(), 2, 4, var8, var5);
         this.id_class(var1, xu_3.BL.id_continue(), 3, 4, var8, var5);
         this.id_class(var1, xu_3.BL.id_continue(), 4, 4, var8, var5);
      }

      return true;
   }

   @Override
   protected void id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_break("Steps", this.id_class);
   }
}
