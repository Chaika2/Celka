package celestial;

public class zP_2 extends dB_2 {
   protected zP_2(Jq_1 var1) {
      super(var1);
   }

   @Override
   public rdn_3 id_class(rRq_1 var1, rfH_2 var2, xc_3 var3) {
      return rdn_3.id_break;
   }

   @Override
   public xN_2 id_class(xc_3 var1) {
      return xN_2.MODEL;
   }

   @Override
   public void id_class(xc_3 var1, rrEm_1 var2, rfH_2 var3, rdn_3 var4) {
      super.id_class(var1, var2, var3, var4);
      int var5 = 15 + var2.id_int.nextInt(15) + var2.id_int.nextInt(15);
      this.id_class(var2, var3, var5);
   }

   @Override
   public ryO_2 id_class(rRq_1 var1) {
      return new rHU();
   }
}
