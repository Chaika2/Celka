package celestial;

public class kc_3 extends xd_3 implements kd_3 {
   public static final rCc_1 volatile_ = kE_2.p;
   public static final rCN final_ = rCT.throw_;
   protected static final rjC_2 package_ = xd_3.class_(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final rjC_2 int_ = xd_3.class_(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final rjC_2 new_ = xd_3.class_(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final rjC_2 continue_ = xd_3.class_(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);

   protected kc_3(Jq_1 var1) {
      super(var1);
      this.extends_(this.abstract_.break_().class_(volatile_, rpr_3.NORTH).class_(final_, Boolean.valueOf(false)));
   }

   @Override
   public xc_3 class_(xc_3 var1, rqd_3 var2) {
      return var1.class_(volatile_, var2.class_(var1.byte_(volatile_)));
   }

   @Override
   public xc_3 class_(xc_3 var1, rpa_3 var2) {
      return var1.class_(var2.class_(var1.byte_(volatile_)));
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(volatile_, final_);
   }

   @Override
   public xc_3 class_(rxx_3 var1) {
      if (!var1.byte_()) {
         xc_3 var2 = var1.int_().byte_(var1.class_().break_(var1.finally_().case_()));
         if (var2.class_(this) && var2.byte_(volatile_) == var1.finally_()) {
            return null;
         }
      }

      xc_3 var10 = this.continue_();
      rYB var3 = var1.int_();
      rfH_2 var4 = var1.class_();
      rXE var5 = var1.int_().break_(var1.class_());

      for (rpr_3 var9 : var1.throws_()) {
         if (var9.final_().protected_()) {
            var10 = var10.class_(volatile_, var9.case_());
            if (var10.class_((rRR)var3, var4)) {
               return var10.class_(final_, Boolean.valueOf(var5.class_() == rXG.byte_));
            }
         }
      }

      return null;
   }

   private boolean class_(rRq_1 var1, rfH_2 var2, rpr_3 var3) {
      xc_3 var4 = var1.byte_(var2);
      return var4.protected_(var1, var2, var3);
   }

   @Override
   public boolean class_(xc_3 var1, rRR var2, rfH_2 var3) {
      rpr_3 var4 = var1.byte_(volatile_);
      return this.class_(var2, var3.break_(var4.case_()), var4);
   }

   @Override
   public xc_3 class_(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      if (var2.case_() == var1.byte_(volatile_) && !var1.class_(var4, var5)) {
         return xu_3.class_.continue_();
      } else {
         if (var1.byte_(final_)) {
            var4.extends_().class_(var5, rXG.byte_, rXG.byte_.class_(var4));
         }

         return super.class_(var1, var2, var3, var4, var5, var6);
      }
   }

   @Override
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      switch ((rpr_3)var1.byte_(volatile_)) {
         case NORTH:
            return continue_;
         case SOUTH:
            return new_;
         case WEST:
            return int_;
         case EAST:
         default:
            return package_;
      }
   }

   @Override
   public rXE throws_(xc_3 var1) {
      return var1.byte_(final_) ? rXG.byte_.class_(false) : super.throws_(var1);
   }
}
