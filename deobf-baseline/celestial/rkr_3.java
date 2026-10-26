package celestial;

public class rkr_3 extends rdb_3 {
   public rkr_3(rdO_2 var1) {
      super(var1);
   }

   @Override
   public float id_class(rdn_3 var1, xc_3 var2) {
      if (!var2.id_class(xu_3.U) && !var2.id_class(rls_3.id_void)) {
         return var2.id_class(rls_3.id_break) ? 5.0F : super.id_class(var1, var2);
      } else {
         return 15.0F;
      }
   }

   @Override
   public boolean id_class(rdn_3 var1, rYB var2, xc_3 var3, rfH_2 var4, iB_2 var5) {
      if (!var2.id_continue && !var3.id_break().id_class(rls_3.N)) {
         var1.id_class(1, var5, var0 -> var0.id_break(rXQ.MAINHAND));
      }

      return !var3.id_class(rls_3.id_void)
            && !var3.id_class(xu_3.U)
            && !var3.id_class(xu_3.e)
            && !var3.id_class(xu_3.a)
            && !var3.id_class(xu_3.i)
            && !var3.id_class(xu_3.BD)
            && !var3.id_class(xu_3.SQ)
            && !var3.id_class(rls_3.id_break)
         ? super.id_class(var1, var2, var3, var4, var5)
         : true;
   }

   @Override
   public boolean id_break(xc_3 var1) {
      return var1.id_class(xu_3.U) || var1.id_class(xu_3.ra) || var1.id_class(xu_3.SQ);
   }
}
