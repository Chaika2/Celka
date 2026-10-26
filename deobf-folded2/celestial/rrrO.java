package celestial;

import java.util.List;
import java.util.Random;

public class rrrO extends rrrQ {
   private boolean id_class;

   public rrrO(int var1, rfi_3 var2, rpr_3 var3) {
      super(raF_2.id_goto, var1);
      this.id_class(var3);
      this.id_final = var2;
   }

   public rrrO(rrPt_1 var1, rcd_3 var2) {
      super(raF_2.id_goto, var2);
      this.id_class = var2.id_new("Mob");
   }

   public static rrrO id_class(List<rrrn_1> var0, int var1, int var2, int var3, rpr_3 var4, int var5) {
      rfi_3 var6 = rfi_3.id_class(var1, var2, var3, -4, -1, 0, 11, 8, 16, var4);
      return id_class(var6) && rrrn_1.id_class(var0, var6) == null ? new rrrO(var5, var6, var4) : null;
   }

   @Override
   public boolean id_class(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7) {
      this.id_class(var1, var5, 0, 0, 0, 10, 7, 15, false, var4, rii_3.id_throws);
      this.id_class(var1, var4, var5, rrrN.GRATES, 4, 1, 0);
      int var8 = 6;
      this.id_class(var1, var5, 1, var8, 1, 1, var8, 14, false, var4, rii_3.id_throws);
      this.id_class(var1, var5, 9, var8, 1, 9, var8, 14, false, var4, rii_3.id_throws);
      this.id_class(var1, var5, 2, var8, 1, 8, var8, 2, false, var4, rii_3.id_throws);
      this.id_class(var1, var5, 2, var8, 14, 8, var8, 14, false, var4, rii_3.id_throws);
      this.id_class(var1, var5, 1, 1, 1, 2, 1, 4, false, var4, rii_3.id_throws);
      this.id_class(var1, var5, 8, 1, 1, 9, 1, 4, false, var4, rii_3.id_throws);
      this.id_class(var1, var5, 1, 1, 1, 1, 1, 3, xu_3.id_instanceof.id_continue(), xu_3.id_instanceof.id_continue(), false);
      this.id_class(var1, var5, 9, 1, 1, 9, 1, 3, xu_3.id_instanceof.id_continue(), xu_3.id_instanceof.id_continue(), false);
      this.id_class(var1, var5, 3, 1, 8, 7, 1, 12, false, var4, rii_3.id_throws);
      this.id_class(var1, var5, 4, 1, 9, 6, 1, 11, xu_3.id_instanceof.id_continue(), xu_3.id_instanceof.id_continue(), false);
      xc_3 var9 = xu_3.Bf.id_continue().id_class(kK_2.id_volatile, Boolean.valueOf(true)).id_class(kK_2.id_package, Boolean.valueOf(true));
      xc_3 var10 = xu_3.Bf.id_continue().id_class(kK_2.id_int, Boolean.valueOf(true)).id_class(kK_2.id_final, Boolean.valueOf(true));

      for (byte var11 = 3; var11 < 14; var11 += 2) {
         this.id_class(var1, var5, 0, 3, var11, 0, 4, var11, var9, var9, false);
         this.id_class(var1, var5, 10, 3, var11, 10, 4, var11, var9, var9, false);
      }

      for (byte var21 = 2; var21 < 9; var21 += 2) {
         this.id_class(var1, var5, var21, 3, 15, var21, 4, 15, var10, var10, false);
      }

      xc_3 var22 = xu_3.Ba.id_continue().id_class(zG_2.id_volatile, rpr_3.NORTH);
      this.id_class(var1, var5, 4, 1, 5, 6, 1, 7, false, var4, rii_3.id_throws);
      this.id_class(var1, var5, 4, 2, 6, 6, 2, 7, false, var4, rii_3.id_throws);
      this.id_class(var1, var5, 4, 3, 7, 6, 3, 7, false, var4, rii_3.id_throws);

      for (int var12 = 4; var12 <= 6; var12++) {
         this.id_class(var1, var22, var12, 1, 4, var5);
         this.id_class(var1, var22, var12, 2, 5, var5);
         this.id_class(var1, var22, var12, 3, 6, var5);
      }

      xc_3 var23 = xu_3.SO.id_continue().id_class(dA_2.id_volatile, rpr_3.NORTH);
      xc_3 var13 = xu_3.SO.id_continue().id_class(dA_2.id_volatile, rpr_3.SOUTH);
      xc_3 var14 = xu_3.SO.id_continue().id_class(dA_2.id_volatile, rpr_3.EAST);
      xc_3 var15 = xu_3.SO.id_continue().id_class(dA_2.id_volatile, rpr_3.WEST);
      boolean var16 = true;
      boolean[] var17 = new boolean[12];

      for (int var18 = 0; var18 < var17.length; var18++) {
         var17[var18] = var4.nextFloat() > 0.9F;
         var16 &= var17[var18];
      }

      this.id_class(var1, var23.id_class(dA_2.id_final, Boolean.valueOf(var17[0])), 4, 3, 8, var5);
      this.id_class(var1, var23.id_class(dA_2.id_final, Boolean.valueOf(var17[1])), 5, 3, 8, var5);
      this.id_class(var1, var23.id_class(dA_2.id_final, Boolean.valueOf(var17[2])), 6, 3, 8, var5);
      this.id_class(var1, var13.id_class(dA_2.id_final, Boolean.valueOf(var17[3])), 4, 3, 12, var5);
      this.id_class(var1, var13.id_class(dA_2.id_final, Boolean.valueOf(var17[4])), 5, 3, 12, var5);
      this.id_class(var1, var13.id_class(dA_2.id_final, Boolean.valueOf(var17[5])), 6, 3, 12, var5);
      this.id_class(var1, var14.id_class(dA_2.id_final, Boolean.valueOf(var17[6])), 3, 3, 9, var5);
      this.id_class(var1, var14.id_class(dA_2.id_final, Boolean.valueOf(var17[7])), 3, 3, 10, var5);
      this.id_class(var1, var14.id_class(dA_2.id_final, Boolean.valueOf(var17[8])), 3, 3, 11, var5);
      this.id_class(var1, var15.id_class(dA_2.id_final, Boolean.valueOf(var17[9])), 7, 3, 9, var5);
      this.id_class(var1, var15.id_class(dA_2.id_final, Boolean.valueOf(var17[10])), 7, 3, 10, var5);
      this.id_class(var1, var15.id_class(dA_2.id_final, Boolean.valueOf(var17[11])), 7, 3, 11, var5);
      if (var16) {
         xc_3 var24 = xu_3.SM.id_continue();
         this.id_class(var1, var24, 4, 3, 9, var5);
         this.id_class(var1, var24, 5, 3, 9, var5);
         this.id_class(var1, var24, 6, 3, 9, var5);
         this.id_class(var1, var24, 4, 3, 10, var5);
         this.id_class(var1, var24, 5, 3, 10, var5);
         this.id_class(var1, var24, 6, 3, 10, var5);
         this.id_class(var1, var24, 4, 3, 11, var5);
         this.id_class(var1, var24, 5, 3, 11, var5);
         this.id_class(var1, var24, 6, 3, 11, var5);
      }

      if (!this.id_class) {
         var8 = this.id_class(3);
         rfH_2 var25 = new rfH_2(this.id_class(5, 6), var8, this.id_break(5, 6));
         if (var5.id_break(var25)) {
            this.id_class = true;
            var1.id_class(var25, xu_3.rD.id_continue(), 2);
            ryO_2 var19 = var1.id_class(var25);
            if (var19 instanceof rHU) {
               ((rHU)var19).id_catch().id_class(aI_2.L);
            }
         }
      }

      return true;
   }

   @Override
   public void id_class(rrrn_1 var1, List<rrrn_1> var2, Random var3) {
      if (var1 != null) {
         ((rrrd_1)var1).id_break = this;
      }
   }

   @Override
   protected void id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_class("Mob", this.id_class);
   }
}
