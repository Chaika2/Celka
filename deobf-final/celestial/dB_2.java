package celestial;

public abstract class dB_2 extends xd_3 implements kx_3 {
   protected dB_2(Jq_1 var1) {
      super(var1);
   }

   @Override
   public rJZ class_(xc_3 var1, rYB var2, rfH_2 var3) {
      ryO_2 var4 = var2.class_(var3);
      return var4 instanceof rJZ ? (rJZ)var4 : null;
   }

   @Override
   public boolean class_(xc_3 var1, rYB var2, rfH_2 var3, int var4, int var5) {
      super.class_(var1, var2, var3, var4, var5);
      ryO_2 var6 = var2.class_(var3);
      return var6 == null ? false : var6.a_(var4, var5);
   }

   @Override
   public xN_2 class_(xc_3 var1) {
      return xN_2.INVISIBLE;
   }
}
