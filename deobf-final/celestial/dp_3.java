package celestial;

public class dp_3 extends dV_2 {
   private final rjC_2[] else_;

   @Override
   public rjC_2 byte_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return this.class_(var1, var2, var3, var4);
   }

   public dp_3(Jq_1 var1) {
      super(2.0F, 2.0F, 16.0F, 16.0F, 24.0F, var1);
      this.extends_(
         this.abstract_
            .break_()
            .class_(volatile_, Boolean.valueOf(false))
            .class_(final_, Boolean.valueOf(false))
            .class_(package_, Boolean.valueOf(false))
            .class_(int_, Boolean.valueOf(false))
            .class_(new_, Boolean.valueOf(false))
      );
      this.else_ = this.class_(2.0F, 1.0F, 16.0F, 6.0F, 15.0F);
   }

   @Override
   public ryZ_2 class_(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      if (var2.continue_) {
         rdn_3 var7 = var4.protected_(var5);
         return var7.break_() == rdy_3.df ? ryZ_2.SUCCESS : ryZ_2.PASS;
      } else {
         return rdq_3.class_(var4, var2, var3);
      }
   }

   @Override
   public xc_3 class_(rxx_3 var1) {
      rYB var2 = var1.int_();
      rfH_2 var3 = var1.class_();
      rXE var4 = var1.int_().break_(var1.class_());
      rfH_2 var5 = var3.private_();
      rfH_2 var6 = var3.extends_();
      rfH_2 var7 = var3.protected_();
      rfH_2 var8 = var3.byte_();
      xc_3 var9 = var2.byte_(var5);
      xc_3 var10 = var2.byte_(var6);
      xc_3 var11 = var2.byte_(var7);
      xc_3 var12 = var2.byte_(var8);
      return super.class_(var1)
         .class_(volatile_, Boolean.valueOf(this.class_(var9, var9.protected_(var2, var5, rpr_3.SOUTH), rpr_3.SOUTH)))
         .class_(final_, Boolean.valueOf(this.class_(var10, var10.protected_(var2, var6, rpr_3.WEST), rpr_3.WEST)))
         .class_(package_, Boolean.valueOf(this.class_(var11, var11.protected_(var2, var7, rpr_3.NORTH), rpr_3.NORTH)))
         .class_(int_, Boolean.valueOf(this.class_(var12, var12.protected_(var2, var8, rpr_3.EAST), rpr_3.EAST)))
         .class_(new_, Boolean.valueOf(var4.class_() == rXG.byte_));
   }

   @Override
   public xc_3 class_(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      if (var1.byte_(new_)) {
         var4.extends_().class_(var5, rXG.byte_, rXG.byte_.class_(var4));
      }

      return var2.final_().throws_() == rpb_3.HORIZONTAL
         ? var1.class_(continue_.get(var2), Boolean.valueOf(this.class_(var3, var3.protected_(var4, var6, var2.case_()), var2.case_())))
         : super.class_(var1, var2, var3, var4, var5, var6);
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(volatile_, final_, int_, package_, new_);
   }

   @Override
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3) {
      return this.else_[this.private_(var1)];
   }

   @Override
   public boolean class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rLT var4) {
      return false;
   }

   public boolean class_(xc_3 var1, boolean var2, rpr_3 var3) {
      xd_3 var4 = var1.break_();
      boolean var5 = this.class_(var4);
      boolean var6 = var4 instanceof dq_3 && dq_3.class_(var1, var3);
      return !byte_(var4) && var2 || var5 || var6;
   }

   private boolean class_(xd_3 var1) {
      return var1.class_(rls_3.default_) && var1.class_(rls_3.extends_) == this.continue_().class_(rls_3.extends_);
   }
}
