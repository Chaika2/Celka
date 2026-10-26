package celestial;

class rXg_1 extends rJY {
   public rXg_1(rXu_1 var1, int var2, int var3, int var4) {
      super(var1, var2, var3, var4);
   }

   @Override
   public rdn_3 id_class(rhd_3 var1, rdn_3 var2) {
      rLi_1 var3 = rAB.id_protected(var2);
      if (var1 instanceof rhN_2) {
         Oo_1.id_extends.id_class((rhN_2)var1, var3);
      }

      super.id_class(var1, var2);
      return var2;
   }

   @Override
   public boolean id_class(rdn_3 var1) {
      return id_protected(var1);
   }

   public static boolean id_protected(rdn_3 var0) {
      rdb_3 var1 = var0.id_break();
      return var1 == rdy_3.JA || var1 == rdy_3.kk || var1 == rdy_3.kQ || var1 == rdy_3.Jn;
   }

   @Override
   public int id_protected() {
      return 1;
   }
}
