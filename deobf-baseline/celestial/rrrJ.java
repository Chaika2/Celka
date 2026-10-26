package celestial;

import java.util.List;
import java.util.Random;

public class rrrJ extends rrrQ {
   protected final int id_class;

   public rrrJ(int var1, Random var2, rfi_3 var3, rpr_3 var4) {
      super(raF_2.id_instanceof, var1);
      this.id_class(var4);
      this.id_protected = this.id_class(var2);
      this.id_final = var3;
      this.id_class = var2.nextInt(5);
   }

   public rrrJ(rrPt_1 var1, rcd_3 var2) {
      super(raF_2.id_instanceof, var2);
      this.id_class = var2.id_private("Type");
   }

   public static rrrJ id_class(List<rrrn_1> var0, Random var1, int var2, int var3, int var4, rpr_3 var5, int var6) {
      rfi_3 var7 = rfi_3.id_class(var2, var3, var4, -4, -1, 0, 11, 7, 11, var5);
      return id_class(var7) && rrrn_1.id_class(var0, var7) == null ? new rrrJ(var6, var1, var7, var5) : null;
   }

   @Override
   public boolean id_class(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7) {
      this.id_class(var1, var5, 0, 0, 0, 10, 6, 10, true, var4, rii_3.id_throws);
      this.id_class(var1, var4, var5, this.id_protected, 4, 1, 0);
      this.id_class(var1, var5, 4, 1, 10, 6, 3, 10, id_volatile, id_volatile, false);
      this.id_class(var1, var5, 0, 1, 4, 0, 3, 6, id_volatile, id_volatile, false);
      this.id_class(var1, var5, 10, 1, 4, 10, 3, 6, id_volatile, id_volatile, false);
      switch (this.id_class) {
         case 0:
            this.id_class(var1, xu_3.BL.id_continue(), 5, 1, 5, var5);
            this.id_class(var1, xu_3.BL.id_continue(), 5, 2, 5, var5);
            this.id_class(var1, xu_3.BL.id_continue(), 5, 3, 5, var5);
            this.id_class(var1, xu_3.rY.id_continue().id_class(zg_3.id_volatile, rpr_3.WEST), 4, 3, 5, var5);
            this.id_class(var1, xu_3.rY.id_continue().id_class(zg_3.id_volatile, rpr_3.EAST), 6, 3, 5, var5);
            this.id_class(var1, xu_3.rY.id_continue().id_class(zg_3.id_volatile, rpr_3.SOUTH), 5, 3, 4, var5);
            this.id_class(var1, xu_3.rY.id_continue().id_class(zg_3.id_volatile, rpr_3.NORTH), 5, 3, 6, var5);
            this.id_class(var1, xu_3.Ge.id_continue(), 4, 1, 4, var5);
            this.id_class(var1, xu_3.Ge.id_continue(), 4, 1, 5, var5);
            this.id_class(var1, xu_3.Ge.id_continue(), 4, 1, 6, var5);
            this.id_class(var1, xu_3.Ge.id_continue(), 6, 1, 4, var5);
            this.id_class(var1, xu_3.Ge.id_continue(), 6, 1, 5, var5);
            this.id_class(var1, xu_3.Ge.id_continue(), 6, 1, 6, var5);
            this.id_class(var1, xu_3.Ge.id_continue(), 5, 1, 4, var5);
            this.id_class(var1, xu_3.Ge.id_continue(), 5, 1, 6, var5);
            break;
         case 1:
            for (int var13 = 0; var13 < 5; var13++) {
               this.id_class(var1, xu_3.BL.id_continue(), 3, 1, 3 + var13, var5);
               this.id_class(var1, xu_3.BL.id_continue(), 7, 1, 3 + var13, var5);
               this.id_class(var1, xu_3.BL.id_continue(), 3 + var13, 1, 3, var5);
               this.id_class(var1, xu_3.BL.id_continue(), 3 + var13, 1, 7, var5);
            }

            this.id_class(var1, xu_3.BL.id_continue(), 5, 1, 5, var5);
            this.id_class(var1, xu_3.BL.id_continue(), 5, 2, 5, var5);
            this.id_class(var1, xu_3.BL.id_continue(), 5, 3, 5, var5);
            this.id_class(var1, xu_3.id_try.id_continue(), 5, 4, 5, var5);
            break;
         case 2:
            for (int var8 = 1; var8 <= 9; var8++) {
               this.id_class(var1, xu_3.id_volatile.id_continue(), 1, 3, var8, var5);
               this.id_class(var1, xu_3.id_volatile.id_continue(), 9, 3, var8, var5);
            }

            for (int var9 = 1; var9 <= 9; var9++) {
               this.id_class(var1, xu_3.id_volatile.id_continue(), var9, 3, 1, var5);
               this.id_class(var1, xu_3.id_volatile.id_continue(), var9, 3, 9, var5);
            }

            this.id_class(var1, xu_3.id_volatile.id_continue(), 5, 1, 4, var5);
            this.id_class(var1, xu_3.id_volatile.id_continue(), 5, 1, 6, var5);
            this.id_class(var1, xu_3.id_volatile.id_continue(), 5, 3, 4, var5);
            this.id_class(var1, xu_3.id_volatile.id_continue(), 5, 3, 6, var5);
            this.id_class(var1, xu_3.id_volatile.id_continue(), 4, 1, 5, var5);
            this.id_class(var1, xu_3.id_volatile.id_continue(), 6, 1, 5, var5);
            this.id_class(var1, xu_3.id_volatile.id_continue(), 4, 3, 5, var5);
            this.id_class(var1, xu_3.id_volatile.id_continue(), 6, 3, 5, var5);

            for (int var10 = 1; var10 <= 3; var10++) {
               this.id_class(var1, xu_3.id_volatile.id_continue(), 4, var10, 4, var5);
               this.id_class(var1, xu_3.id_volatile.id_continue(), 6, var10, 4, var5);
               this.id_class(var1, xu_3.id_volatile.id_continue(), 4, var10, 6, var5);
               this.id_class(var1, xu_3.id_volatile.id_continue(), 6, var10, 6, var5);
            }

            this.id_class(var1, xu_3.rR.id_continue(), 5, 3, 5, var5);

            for (int var11 = 2; var11 <= 8; var11++) {
               this.id_class(var1, xu_3.id_final.id_continue(), 2, 3, var11, var5);
               this.id_class(var1, xu_3.id_final.id_continue(), 3, 3, var11, var5);
               if (var11 <= 3 || var11 >= 7) {
                  this.id_class(var1, xu_3.id_final.id_continue(), 4, 3, var11, var5);
                  this.id_class(var1, xu_3.id_final.id_continue(), 5, 3, var11, var5);
                  this.id_class(var1, xu_3.id_final.id_continue(), 6, 3, var11, var5);
               }

               this.id_class(var1, xu_3.id_final.id_continue(), 7, 3, var11, var5);
               this.id_class(var1, xu_3.id_final.id_continue(), 8, 3, var11, var5);
            }

            xc_3 var12 = xu_3.PJ.id_continue().id_class(kc_3.id_volatile, rpr_3.WEST);
            this.id_class(var1, var12, 9, 1, 3, var5);
            this.id_class(var1, var12, 9, 2, 3, var5);
            this.id_class(var1, var12, 9, 3, 3, var5);
            this.id_class(var1, var5, var4, 3, 4, 8, rzl_3.id_public);
      }

      return true;
   }

   @Override
   public void id_class(rrrn_1 var1, List<rrrn_1> var2, Random var3) {
      this.id_class((rrrd_1)var1, var2, var3, 4, 1);
      this.id_break((rrrd_1)var1, var2, var3, 1, 4);
      this.id_byte((rrrd_1)var1, var2, var3, 1, 4);
   }

   @Override
   protected void id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_break("Type", this.id_class);
   }
}
