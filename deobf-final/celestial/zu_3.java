package celestial;

public class zu_3 extends du_3 implements kJ_2 {
   public static final rCu_1<rCf_1> final_ = du_3.volatile_;
   protected static final rjC_2 package_ = xd_3.class_(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   public zu_3(Jq_1 var1) {
      super(var1);
   }

   @Override
   public boolean class_(rRq_1 var1, rfH_2 var2, xc_3 var3, rXs_1 var4) {
      return false;
   }

   @Override
   public boolean class_(rRg_1 var1, rfH_2 var2, xc_3 var3, rXE var4) {
      return false;
   }

   @Override
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return package_;
   }

   @Override
   public xc_3 class_(rxx_3 var1) {
      xc_3 var2 = super.class_(var1);
      if (var2 != null) {
         rXE var3 = var1.int_().break_(var1.class_().final_());
         if (var3.class_(rlG_2.break_) && var3.throws_() == 8) {
            return var2;
         }
      }

      return null;
   }

   @Override
   public rdn_3 class_(rRq_1 var1, rfH_2 var2, xc_3 var3) {
      return new rdn_3(xu_3.rr);
   }

   @Override
   public boolean class_(xc_3 var1, rRR var2, rfH_2 var3) {
      if (var1.byte_(final_) == rCf_1.UPPER) {
         xc_3 var5 = var2.byte_(var3.break_());
         return var5.class_(this) && var5.byte_(final_) == rCf_1.LOWER;
      } else {
         rXE var4 = var2.break_(var3);
         return super.class_(var1, var2, var3) && var4.class_(rlG_2.break_) && var4.throws_() == 8;
      }
   }

   @Override
   public rXE throws_(xc_3 var1) {
      return rXG.byte_.class_(false);
   }

   @Override
   protected boolean catch_(xc_3 var1, rRq_1 var2, rfH_2 var3) {
      return var1.protected_(var2, var3, rpr_3.UP) && !var1.class_(xu_3.bV);
   }
}
