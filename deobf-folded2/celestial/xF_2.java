package celestial;

public class xF_2 extends xd_3 {
   protected xF_2(Jq_1 var1) {
      super(var1);
   }

   @Override
   public boolean id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rLT var4) {
      return var4 == rLT.AIR && !this.id_byte ? true : super.id_class(var1, var2, var3, var4);
   }

   @Override
   public boolean id_class(xc_3 var1, rRR var2, rfH_2 var3) {
      rfH_2 var4 = var3.id_break();
      return this.id_catch(var2.id_byte(var4), var2, var4);
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      return !var1.id_class(var4, var5) ? xu_3.id_class.id_continue() : super.id_class(var1, var2, var3, var4, var5, var6);
   }

   protected boolean id_catch(xc_3 var1, rRq_1 var2, rfH_2 var3) {
      return var1.id_class(xu_3.id_implements)
         || var1.id_class(xu_3.id_finally)
         || var1.id_class(xu_3.id_extends)
         || var1.id_class(xu_3.id_native)
         || var1.id_class(xu_3.PS);
   }

   @Override
   public boolean a_(xc_3 var1, rRq_1 var2, rfH_2 var3) {
      return var1.id_volatile().id_byte();
   }
}
