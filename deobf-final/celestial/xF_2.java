package celestial;

public class xF_2 extends xd_3 {
   protected xF_2(Jq_1 var1) {
      super(var1);
   }

   @Override
   public boolean class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rLT var4) {
      return var4 == rLT.AIR && !this.byte_ ? true : super.class_(var1, var2, var3, var4);
   }

   @Override
   public boolean class_(xc_3 var1, rRR var2, rfH_2 var3) {
      rfH_2 var4 = var3.break_();
      return this.catch_(var2.byte_(var4), var2, var4);
   }

   @Override
   public xc_3 class_(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      return !var1.class_(var4, var5) ? xu_3.class_.continue_() : super.class_(var1, var2, var3, var4, var5, var6);
   }

   protected boolean catch_(xc_3 var1, rRq_1 var2, rfH_2 var3) {
      return var1.class_(xu_3.implements_) || var1.class_(xu_3.finally_) || var1.class_(xu_3.extends_) || var1.class_(xu_3.native_) || var1.class_(xu_3.PS);
   }

   @Override
   public boolean a_(xc_3 var1, rRq_1 var2, rfH_2 var3) {
      return var1.volatile_().byte_();
   }
}
