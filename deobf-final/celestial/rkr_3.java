package celestial;

public class rkr_3 extends rdb_3 {
   public rkr_3(rdO_2 var1) {
      super(var1);
   }

   @Override
   public float class_(rdn_3 var1, xc_3 var2) {
      if (!var2.class_(xu_3.U) && !var2.class_(rls_3.void_)) {
         return var2.class_(rls_3.break_) ? 5.0F : super.class_(var1, var2);
      } else {
         return 15.0F;
      }
   }

   @Override
   public boolean class_(rdn_3 var1, rYB var2, xc_3 var3, rfH_2 var4, iB_2 var5) {
      if (!var2.continue_ && !var3.break_().class_(rls_3.N)) {
         var1.class_(1, var5, var0 -> var0.break_(rXQ.MAINHAND));
      }

      return !var3.class_(rls_3.void_)
            && !var3.class_(xu_3.U)
            && !var3.class_(xu_3.e)
            && !var3.class_(xu_3.a)
            && !var3.class_(xu_3.i)
            && !var3.class_(xu_3.BD)
            && !var3.class_(xu_3.SQ)
            && !var3.class_(rls_3.break_)
         ? super.class_(var1, var2, var3, var4, var5)
         : true;
   }

   @Override
   public boolean break_(xc_3 var1) {
      return var1.class_(xu_3.U) || var1.class_(xu_3.ra) || var1.class_(xu_3.SQ);
   }
}
