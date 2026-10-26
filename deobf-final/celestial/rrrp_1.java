package celestial;

import java.util.Random;

public class rrrp_1 extends riY_2 {
   private boolean throws_;
   private boolean case_;

   public rrrp_1(Random var1, int var2, int var3) {
      super(raF_2.import_, var1, var2, 64, var3, 7, 7, 9);
   }

   public rrrp_1(rrPt_1 var1, rcd_3 var2) {
      super(raF_2.import_, var2);
      this.throws_ = var2.new_("Witch");
      this.case_ = var2.new_("Cat");
   }

   @Override
   public boolean class_(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7) {
      if (!this.class_(var1, var5, 0)) {
         return false;
      } else {
         this.class_(var1, var5, 1, 1, 1, 5, 1, 7, xu_3.package_.continue_(), xu_3.package_.continue_(), false);
         this.class_(var1, var5, 1, 4, 2, 5, 4, 7, xu_3.package_.continue_(), xu_3.package_.continue_(), false);
         this.class_(var1, var5, 2, 1, 0, 4, 1, 0, xu_3.package_.continue_(), xu_3.package_.continue_(), false);
         this.class_(var1, var5, 2, 2, 2, 3, 3, 2, xu_3.package_.continue_(), xu_3.package_.continue_(), false);
         this.class_(var1, var5, 1, 2, 3, 1, 3, 6, xu_3.package_.continue_(), xu_3.package_.continue_(), false);
         this.class_(var1, var5, 5, 2, 3, 5, 3, 6, xu_3.package_.continue_(), xu_3.package_.continue_(), false);
         this.class_(var1, var5, 2, 2, 7, 4, 3, 7, xu_3.package_.continue_(), xu_3.package_.continue_(), false);
         this.class_(var1, var5, 1, 0, 2, 1, 3, 2, xu_3.static_.continue_(), xu_3.static_.continue_(), false);
         this.class_(var1, var5, 5, 0, 2, 5, 3, 2, xu_3.static_.continue_(), xu_3.static_.continue_(), false);
         this.class_(var1, var5, 1, 0, 7, 1, 3, 7, xu_3.static_.continue_(), xu_3.static_.continue_(), false);
         this.class_(var1, var5, 5, 0, 7, 5, 3, 7, xu_3.static_.continue_(), xu_3.static_.continue_(), false);
         this.class_(var1, xu_3.PV.continue_(), 2, 3, 2, var5);
         this.class_(var1, xu_3.PV.continue_(), 3, 3, 7, var5);
         this.class_(var1, xu_3.class_.continue_(), 1, 3, 4, var5);
         this.class_(var1, xu_3.class_.continue_(), 5, 3, 4, var5);
         this.class_(var1, xu_3.class_.continue_(), 5, 3, 5, var5);
         this.class_(var1, xu_3.SU.continue_(), 1, 3, 5, var5);
         this.class_(var1, xu_3.PP.continue_(), 3, 2, 6, var5);
         this.class_(var1, xu_3.Sb.continue_(), 4, 2, 6, var5);
         this.class_(var1, xu_3.PV.continue_(), 1, 2, 1, var5);
         this.class_(var1, xu_3.PV.continue_(), 5, 2, 1, var5);
         xc_3 var8 = xu_3.Sc.continue_().class_(zG_2.volatile_, rpr_3.NORTH);
         xc_3 var9 = xu_3.Sc.continue_().class_(zG_2.volatile_, rpr_3.EAST);
         xc_3 var10 = xu_3.Sc.continue_().class_(zG_2.volatile_, rpr_3.WEST);
         xc_3 var11 = xu_3.Sc.continue_().class_(zG_2.volatile_, rpr_3.SOUTH);
         this.class_(var1, var5, 0, 4, 1, 6, 4, 1, var8, var8, false);
         this.class_(var1, var5, 0, 4, 2, 0, 4, 7, var9, var9, false);
         this.class_(var1, var5, 6, 4, 2, 6, 4, 7, var10, var10, false);
         this.class_(var1, var5, 0, 4, 8, 6, 4, 8, var11, var11, false);
         this.class_(var1, var8.class_(zG_2.package_, rCK.OUTER_RIGHT), 0, 4, 1, var5);
         this.class_(var1, var8.class_(zG_2.package_, rCK.OUTER_LEFT), 6, 4, 1, var5);
         this.class_(var1, var11.class_(zG_2.package_, rCK.OUTER_LEFT), 0, 4, 8, var5);
         this.class_(var1, var11.class_(zG_2.package_, rCK.OUTER_RIGHT), 6, 4, 8, var5);

         for (byte var12 = 2; var12 <= 7; var12 += 5) {
            for (byte var13 = 1; var13 <= 5; var13 += 4) {
               this.break_(var1, xu_3.static_.continue_(), var13, -1, var12, var5);
            }
         }

         if (!this.throws_) {
            int var16 = this.class_(2, 5);
            int var17 = this.class_(2);
            int var14 = this.break_(2, 5);
            if (var5.break_(new rfH_2(var16, var17, var14))) {
               this.throws_ = true;
               rGi_1 var15 = aI_2.a.class_(var1.byte_());
               var15.b();
               var15.class_((double)var16 + 0.5, (double)var17, (double)var14 + 0.5, 0.0F, 0.0F);
               var15.class_(var1, var1.throws_(new rfH_2(var16, var17, var14)), iO_2.STRUCTURE, (aU_2)null, (rcd_3)null);
               var1.class_(var15);
            }
         }

         this.class_(var1, var5);
         return true;
      }
   }

   private void class_(rRf_1 var1, rfi_3 var2) {
      if (!this.case_) {
         int var3 = this.class_(2, 5);
         int var4 = this.class_(2);
         int var5 = this.break_(2, 5);
         if (var2.break_(new rfH_2(var3, var4, var5))) {
            this.case_ = true;
            rbf_3 var6 = aI_2.private_.class_(var1.byte_());
            var6.b();
            var6.class_((double)var3 + 0.5, (double)var4, (double)var5 + 0.5, 0.0F, 0.0F);
            var6.class_(var1, var1.throws_(new rfH_2(var3, var4, var5)), iO_2.STRUCTURE, (aU_2)null, (rcd_3)null);
            var1.class_(var6);
         }
      }
   }

   @Override
   protected void class_(rcd_3 var1) {
      super.class_(var1);
      var1.class_("Witch", this.throws_);
      var1.class_("Cat", this.case_);
   }
}
