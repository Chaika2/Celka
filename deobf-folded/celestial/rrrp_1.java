package celestial;

import java.util.Random;

public class rrrp_1 extends riY_2 {
   private boolean id_throws;
   private boolean id_case;

   public rrrp_1(Random var1, int var2, int var3) {
      super(raF_2.id_import, var1, var2, 64, var3, 7, 7, 9);
   }

   public rrrp_1(rrPt_1 var1, rcd_3 var2) {
      super(raF_2.id_import, var2);
      this.id_throws = var2.id_new("Witch");
      this.id_case = var2.id_new("Cat");
   }

   @Override
   public boolean id_class(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7) {
      if (!this.id_class(var1, var5, 0)) {
         return false;
      } else {
         this.id_class(var1, var5, 1, 1, 1, 5, 1, 7, xu_3.id_package.id_continue(), xu_3.id_package.id_continue(), false);
         this.id_class(var1, var5, 1, 4, 2, 5, 4, 7, xu_3.id_package.id_continue(), xu_3.id_package.id_continue(), false);
         this.id_class(var1, var5, 2, 1, 0, 4, 1, 0, xu_3.id_package.id_continue(), xu_3.id_package.id_continue(), false);
         this.id_class(var1, var5, 2, 2, 2, 3, 3, 2, xu_3.id_package.id_continue(), xu_3.id_package.id_continue(), false);
         this.id_class(var1, var5, 1, 2, 3, 1, 3, 6, xu_3.id_package.id_continue(), xu_3.id_package.id_continue(), false);
         this.id_class(var1, var5, 5, 2, 3, 5, 3, 6, xu_3.id_package.id_continue(), xu_3.id_package.id_continue(), false);
         this.id_class(var1, var5, 2, 2, 7, 4, 3, 7, xu_3.id_package.id_continue(), xu_3.id_package.id_continue(), false);
         this.id_class(var1, var5, 1, 0, 2, 1, 3, 2, xu_3.id_static.id_continue(), xu_3.id_static.id_continue(), false);
         this.id_class(var1, var5, 5, 0, 2, 5, 3, 2, xu_3.id_static.id_continue(), xu_3.id_static.id_continue(), false);
         this.id_class(var1, var5, 1, 0, 7, 1, 3, 7, xu_3.id_static.id_continue(), xu_3.id_static.id_continue(), false);
         this.id_class(var1, var5, 5, 0, 7, 5, 3, 7, xu_3.id_static.id_continue(), xu_3.id_static.id_continue(), false);
         this.id_class(var1, xu_3.PV.id_continue(), 2, 3, 2, var5);
         this.id_class(var1, xu_3.PV.id_continue(), 3, 3, 7, var5);
         this.id_class(var1, xu_3.id_class.id_continue(), 1, 3, 4, var5);
         this.id_class(var1, xu_3.id_class.id_continue(), 5, 3, 4, var5);
         this.id_class(var1, xu_3.id_class.id_continue(), 5, 3, 5, var5);
         this.id_class(var1, xu_3.SU.id_continue(), 1, 3, 5, var5);
         this.id_class(var1, xu_3.PP.id_continue(), 3, 2, 6, var5);
         this.id_class(var1, xu_3.Sb.id_continue(), 4, 2, 6, var5);
         this.id_class(var1, xu_3.PV.id_continue(), 1, 2, 1, var5);
         this.id_class(var1, xu_3.PV.id_continue(), 5, 2, 1, var5);
         xc_3 var8 = xu_3.Sc.id_continue().id_class(zG_2.id_volatile, rpr_3.NORTH);
         xc_3 var9 = xu_3.Sc.id_continue().id_class(zG_2.id_volatile, rpr_3.EAST);
         xc_3 var10 = xu_3.Sc.id_continue().id_class(zG_2.id_volatile, rpr_3.WEST);
         xc_3 var11 = xu_3.Sc.id_continue().id_class(zG_2.id_volatile, rpr_3.SOUTH);
         this.id_class(var1, var5, 0, 4, 1, 6, 4, 1, var8, var8, false);
         this.id_class(var1, var5, 0, 4, 2, 0, 4, 7, var9, var9, false);
         this.id_class(var1, var5, 6, 4, 2, 6, 4, 7, var10, var10, false);
         this.id_class(var1, var5, 0, 4, 8, 6, 4, 8, var11, var11, false);
         this.id_class(var1, var8.id_class(zG_2.id_package, rCK.OUTER_RIGHT), 0, 4, 1, var5);
         this.id_class(var1, var8.id_class(zG_2.id_package, rCK.OUTER_LEFT), 6, 4, 1, var5);
         this.id_class(var1, var11.id_class(zG_2.id_package, rCK.OUTER_LEFT), 0, 4, 8, var5);
         this.id_class(var1, var11.id_class(zG_2.id_package, rCK.OUTER_RIGHT), 6, 4, 8, var5);

         for (byte var12 = 2; var12 <= 7; var12 += 5) {
            for (byte var13 = 1; var13 <= 5; var13 += 4) {
               this.id_break(var1, xu_3.id_static.id_continue(), var13, -1, var12, var5);
            }
         }

         if (!this.id_throws) {
            int var16 = this.id_class(2, 5);
            int var17 = this.id_class(2);
            int var14 = this.id_break(2, 5);
            if (var5.id_break(new rfH_2(var16, var17, var14))) {
               this.id_throws = true;
               rGi_1 var15 = aI_2.a.id_class(var1.id_byte());
               var15.b();
               var15.id_class((double)var16 + 0.5, (double)var17, (double)var14 + 0.5, 0.0F, 0.0F);
               var15.id_class(var1, var1.id_throws(new rfH_2(var16, var17, var14)), iO_2.STRUCTURE, (aU_2)null, (rcd_3)null);
               var1.id_class(var15);
            }
         }

         this.id_class(var1, var5);
         return true;
      }
   }

   private void id_class(rRf_1 var1, rfi_3 var2) {
      if (!this.id_case) {
         int var3 = this.id_class(2, 5);
         int var4 = this.id_class(2);
         int var5 = this.id_break(2, 5);
         if (var2.id_break(new rfH_2(var3, var4, var5))) {
            this.id_case = true;
            rbf_3 var6 = aI_2.id_private.id_class(var1.id_byte());
            var6.b();
            var6.id_class((double)var3 + 0.5, (double)var4, (double)var5 + 0.5, 0.0F, 0.0F);
            var6.id_class(var1, var1.id_throws(new rfH_2(var3, var4, var5)), iO_2.STRUCTURE, (aU_2)null, (rcd_3)null);
            var1.id_class(var6);
         }
      }
   }

   @Override
   protected void id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_class("Witch", this.id_throws);
      var1.id_class("Cat", this.id_case);
   }
}
