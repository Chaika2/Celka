package celestial;

public class rdY_2 extends rdb_3 {
   public rdY_2(rdO_2 var1) {
      super(var1);
   }

   @Override
   public ryZ_2 id_class(rdn_3 var1, rhd_3 var2, iB_2 var3, rpm_3 var4) {
      if (var1.id_this() && !(var3 instanceof rhd_3)) {
         if (!((rYB)var2.id_throws[7]).id_continue && var3.BM()) {
            var3.id_break(var1.id_continue());
            if (var3 instanceof is_3) {
               ((is_3)var3).b();
            }

            var1.id_catch(1);
         }

         return ryZ_2.id_class(((rYB)var2.id_throws[7]).id_continue);
      } else {
         return ryZ_2.PASS;
      }
   }
}
