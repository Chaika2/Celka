package celestial;

public class dr_3 extends dH_2 {
   private final xc_3 volatile_;

   public dr_3(xd_3 var1, Jq_1 var2) {
      super(var2);
      this.volatile_ = var1.continue_();
   }

   @Override
   public xc_3 class_(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      return class_(var4, var5) ? this.volatile_ : super.class_(var1, var2, var3, var4, var5, var6);
   }

   private static boolean class_(rRq_1 var0, rfH_2 var1) {
      boolean var2 = false;
      rfw_3 var3 = var1.new_();

      for (rpr_3 var7 : rpr_3.values()) {
         xc_3 var8 = var0.byte_(var3);
         if (var7 != rpr_3.DOWN || private_(var8)) {
            var3.class_(var1, var7);
            var8 = var0.byte_(var3);
            if (private_(var8) && !var8.protected_(var0, var1, var7.case_())) {
               var2 = true;
               break;
            }
         }
      }

      return var2;
   }

   @Override
   public xc_3 class_(rxx_3 var1) {
      rYB var2 = var1.int_();
      rfH_2 var3 = var1.class_();
      xc_3 var4 = var2.byte_(var3);
      return break_(var2, var3, var4) ? this.volatile_ : super.class_(var1);
   }

   @Override
   public void class_(rYB var1, rfH_2 var2, xc_3 var3, xc_3 var4, rsB_2 var5) {
      if (break_(var1, var2, var4)) {
         var1.class_(var2, this.volatile_, 3);
      }
   }

   private static boolean break_(rRq_1 var0, rfH_2 var1, xc_3 var2) {
      return private_(var2) || class_(var0, var1);
   }

   @Override
   public int catch_(xc_3 var1, rRq_1 var2, rfH_2 var3) {
      return var1.protected_(var2, var3).d;
   }

   private static boolean private_(xc_3 var0) {
      return var0.volatile_().class_(rlG_2.break_);
   }
}
