package celestial;

public class rxH_2 extends rdb_3 implements eU_2, rdS_2 {
   private static final rdn_3 id_class = new rdn_3(rdy_3.dc);

   public rxH_2(rdO_2 var1) {
      super(var1);
      dQ_2.id_class(this, rxS_2.id_class);
   }

   @Override
   public rym_3<rdn_3> id_class(rYB var1, rhd_3 var2, rpm_3 var3) {
      rdn_3 var4 = var2.id_protected(var3);
      rXQ var5 = is_3.id_finally(var4);
      rdn_3 var6 = var2.id_class(var5);
      if (var6.id_class()) {
         var2.id_class(var5, var4.id_implements());
         var4.id_throws(0);
         return rym_3.id_class(var4, var1.id_import());
      } else {
         return rym_3.id_protected(var4);
      }
   }

   @Override
   public String id_class(rhd_3 var1, rdn_3 var2) {
      int var3 = 0;

      for (int var4 = 0; var4 < 45; var4++) {
         rdn_3 var5 = ((rhz_3)var1.id_implements[1]).id_extends(var4);
         if (var5.id_break() == rdy_3.dc) {
            var3 += var5.id_char();
         }
      }

      return var3 + "";
   }

   @Override
   public boolean id_class(rdn_3 var1, rdn_3 var2) {
      return var2.id_break() == rdy_3.ko;
   }

   @Override
   public rdn_3 id_catch() {
      return id_class;
   }

   public static boolean id_protected(rdn_3 var0) {
      return var0.id_catch() < var0.id_private() - 1;
   }
}
