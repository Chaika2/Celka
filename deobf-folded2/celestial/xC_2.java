package celestial;

public class xC_2 extends xd_3 {
   protected static final rjC_2 id_volatile = xd_3.id_class(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private final rxL_2 id_final;

   protected xC_2(rxL_2 var1, Jq_1 var2) {
      super(var2);
      this.id_final = var1;
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      return !var1.id_class(var4, var5) ? xu_3.id_class.id_continue() : super.id_class(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public boolean id_class(xc_3 var1, rRR var2, rfH_2 var3) {
      return !var2.id_finally(var3.id_break());
   }

   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return id_volatile;
   }

   public rxL_2 id_break() {
      return this.id_final;
   }
}
