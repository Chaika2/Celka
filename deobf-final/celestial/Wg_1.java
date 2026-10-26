package celestial;

public class Wg_1 extends xd_3 implements kd_3 {
   public static final rCu_1<rCo_1> volatile_ = rCT.g;
   public static final rCN final_ = rCT.throw_;
   protected static final rjC_2 package_ = xd_3.class_(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   protected static final rjC_2 int_ = xd_3.class_(0.0, 8.0, 0.0, 16.0, 16.0, 16.0);

   public Wg_1(Jq_1 var1) {
      super(var1);
      this.extends_(this.continue_().class_(volatile_, rCo_1.BOTTOM).class_(final_, Boolean.valueOf(false)));
   }

   @Override
   public boolean class_(rRg_1 var1, rfH_2 var2, xc_3 var3, rXE var4) {
      return var3.byte_(volatile_) != rCo_1.DOUBLE ? kd_3.super.class_(var1, var2, var3, var4) : false;
   }

   @Override
   public boolean class_(rRq_1 var1, rfH_2 var2, xc_3 var3, rXs_1 var4) {
      return var3.byte_(volatile_) != rCo_1.DOUBLE ? kd_3.super.class_(var1, var2, var3, var4) : false;
   }

   @Override
   public xc_3 class_(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      if (var1.byte_(final_)) {
         var4.extends_().class_(var5, rXG.byte_, rXG.byte_.class_(var4));
      }

      return super.class_(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public boolean class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rLT var4) {
      switch (var4) {
         case LAND:
            return false;
         case WATER:
            return var2.break_(var3).class_(rlG_2.break_);
         case AIR:
            return false;
         default:
            return false;
      }
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(volatile_, final_);
   }

   @Override
   public xc_3 class_(rxx_3 var1) {
      rfH_2 var2 = var1.class_();
      xc_3 var3 = var1.int_().byte_(var2);
      if (var3.class_(this)) {
         return var3.class_(volatile_, rCo_1.DOUBLE).class_(final_, Boolean.valueOf(false));
      } else {
         rXE var4 = var1.int_().break_(var2);
         xc_3 var5 = this.continue_().class_(volatile_, rCo_1.BOTTOM).class_(final_, Boolean.valueOf(var4.class_() == rXG.byte_));
         rpr_3 var6 = var1.finally_();
         return var6 == rpr_3.DOWN || var6 != rpr_3.UP && var1.extends_().byte_ - (double)var2.c_() > 0.5 ? var5.class_(volatile_, rCo_1.TOP) : var5;
      }
   }

   @Override
   public boolean class_(xc_3 var1, rxx_3 var2) {
      rdn_3 var3 = var2.volatile_();
      rCo_1 var4 = var1.byte_(volatile_);
      if (var4 == rCo_1.DOUBLE || var3.break_() != this.case_()) {
         return false;
      } else if (var2.byte_()) {
         boolean var5 = var2.extends_().byte_ - (double)var2.class_().c_() > 0.5;
         rpr_3 var6 = var2.finally_();
         return var4 == rCo_1.BOTTOM ? var6 == rpr_3.UP || var5 && var6.final_().protected_() : var6 == rpr_3.DOWN || !var5 && var6.final_().protected_();
      } else {
         return true;
      }
   }

   @Override
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      rCo_1 var5 = var1.byte_(volatile_);
      switch (var5) {
         case DOUBLE:
            return rjw_3.break_();
         case TOP:
            return int_;
         default:
            return package_;
      }
   }

   @Override
   public boolean break_(xc_3 var1) {
      return var1.byte_(volatile_) != rCo_1.DOUBLE;
   }

   @Override
   public rXE throws_(xc_3 var1) {
      return var1.byte_(final_) ? rXG.byte_.class_(false) : super.throws_(var1);
   }
}
