package celestial;

public class kG_2 extends kE_2 {
   public static final rCu_1<rCH> q = rCT.transient_;

   protected kG_2(Jq_1 var1) {
      super(var1);
   }

   @Override
   public xc_3 class_(rxx_3 var1) {
      for (rpr_3 var5 : var1.throws_()) {
         xc_3 var6;
         if (var5.final_() == rpB_2.Y) {
            var6 = this.continue_().class_(q, var5 == rpr_3.UP ? rCH.CEILING : rCH.FLOOR).class_(p, var1.case_());
         } else {
            var6 = this.continue_().class_(q, rCH.WALL).class_(p, var5.case_());
         }

         if (var6.class_((rRR)var1.int_(), var1.class_())) {
            return var6;
         }
      }

      return null;
   }

   @Override
   public boolean class_(xc_3 var1, rRR var2, rfH_2 var3) {
      return break_(var2, var3, private_(var1).case_());
   }

   @Override
   public xc_3 class_(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      return private_(var1).case_() == var2 && !var1.class_(var4, var5) ? xu_3.class_.continue_() : super.class_(var1, var2, var3, var4, var5, var6);
   }

   public static boolean break_(rRR var0, rfH_2 var1, rpr_3 var2) {
      rfH_2 var3 = var1.break_(var2);
      return var0.byte_(var3).protected_(var0, var3, var2.case_());
   }

   protected static rpr_3 private_(xc_3 var0) {
      switch ((rCH)var0.byte_(q)) {
         case CEILING:
            return rpr_3.DOWN;
         case FLOOR:
            return rpr_3.UP;
         default:
            return var0.byte_(p);
      }
   }
}
