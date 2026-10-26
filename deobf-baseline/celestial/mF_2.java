package celestial;

class mF_2 extends mN_2 {
   mF_2(String var1) {
      super(var1);
   }

   @Override
   protected rKd_1 id_class(rVL<rYG> var1, rVL<rKW> var2, long var3) {
      return new rKT(new ror_3(var1.id_byte(rYl_1.id_break)), var3, () -> var2.id_byte(rKW.id_catch));
   }

   @Override
   public rrSp_1 id_class(rVv_1 var1, long var2, boolean var4, boolean var5) {
      rVF var6 = var1.id_break(rVL.n);
      rVF var7 = var1.id_break(rVL.id_void);
      rVF var8 = var1.id_break(rVL.u);
      return new rrSp_1(
         var2, var4, var5, rrSp_1.id_class(rRJ.id_class(var7, var6, var8, var2), () -> var7.id_byte(rRJ.id_native), this.id_class(var6, var8, var2))
      );
   }
}
