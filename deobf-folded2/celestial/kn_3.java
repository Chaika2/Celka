package celestial;

public class kn_3 extends xF_2 {
   protected static final rjC_2 id_volatile = xd_3.id_class(1.0, 0.0, 1.0, 15.0, 1.5, 15.0);

   protected kn_3(Jq_1 var1) {
      super(var1);
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, an_3 var4) {
      super.id_class(var1, var2, var3, var4);
      if (var2 instanceof rrEm_1 && var4 instanceof rSK) {
         var2.id_class(new rfH_2(var3), true, var4);
      }
   }

   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return id_volatile;
   }

   @Override
   protected boolean id_catch(xc_3 var1, rRq_1 var2, rfH_2 var3) {
      rXE var4 = var2.id_break(var3);
      rXE var5 = var2.id_break(var3.id_final());
      return (var4.id_class() == rXG.id_byte || var1.id_byte() == QP.id_long) && var5.id_class() == rXG.id_class;
   }
}
