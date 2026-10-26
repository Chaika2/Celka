package celestial;

public class kG_2 extends kE_2 {
   public static final rCu_1<rCH> q = rCT.id_transient;

   protected kG_2(Jq_1 var1) {
      super(var1);
   }

   @Override
   public xc_3 id_class(rxx_3 var1) {
      for (rpr_3 var5 : var1.id_throws()) {
         xc_3 var6;
         if (var5.id_final() == rpB_2.Y) {
            var6 = this.id_continue().id_class(q, var5 == rpr_3.UP ? rCH.CEILING : rCH.FLOOR).id_class(p, var1.id_case());
         } else {
            var6 = this.id_continue().id_class(q, rCH.WALL).id_class(p, var5.id_case());
         }

         if (var6.id_class((rRR)var1.id_int(), var1.id_class())) {
            return var6;
         }
      }

      return null;
   }

   @Override
   public boolean id_class(xc_3 var1, rRR var2, rfH_2 var3) {
      return id_break(var2, var3, id_private(var1).id_case());
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      return id_private(var1).id_case() == var2 && !var1.id_class(var4, var5)
         ? xu_3.id_class.id_continue()
         : super.id_class(var1, var2, var3, var4, var5, var6);
   }

   public static boolean id_break(rRR var0, rfH_2 var1, rpr_3 var2) {
      rfH_2 var3 = var1.id_break(var2);
      return var0.id_byte(var3).id_protected(var0, var3, var2.id_case());
   }

   protected static rpr_3 id_private(xc_3 var0) {
      switch ((rCH)var0.id_byte(q)) {
         case CEILING:
            return rpr_3.DOWN;
         case FLOOR:
            return rpr_3.UP;
         default:
            return var0.id_byte(p);
      }
   }
}
