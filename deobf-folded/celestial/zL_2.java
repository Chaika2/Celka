package celestial;

public class zL_2 extends xt_3 {
   @Override
   public boolean id_byte(xc_3 var1) {
      return true;
   }

   public zL_2(Jq_1 var1) {
      super(var1, () -> ryW_2.id_byte);
   }

   @Override
   public int id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rpr_3 var4) {
      return rfU_2.id_class(rHu_1.id_class(var2, var3), 0, 15);
   }

   @Override
   public ryO_2 id_class(rRq_1 var1) {
      return new ryQ_2();
   }

   @Override
   public int id_break(xc_3 var1, rRq_1 var2, rfH_2 var3, rpr_3 var4) {
      return var4 == rpr_3.UP ? var1.id_break(var2, var3, var4) : 0;
   }

   @Override
   protected rCi_1<rqO_2> id_break() {
      return rlB_2.id_implements.id_break(rlB_2.x);
   }
}
