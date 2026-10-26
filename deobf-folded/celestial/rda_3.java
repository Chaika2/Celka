package celestial;

public class rda_3 extends rdb_3 {
   public rda_3(rdO_2 var1) {
      super(var1);
   }

   @Override
   public ryZ_2 id_class(rdn_3 var1, rhd_3 var2, iB_2 var3, rpm_3 var4) {
      if (var3 instanceof aK_2 && var3.BM()) {
         aK_2 var5 = (aK_2)var3;
         if (!var5.id_byte() && var5.id_class()) {
            if (!((rYB)var2.id_throws[7]).id_continue) {
               var5.id_class(rqL_2.NEUTRAL);
               var1.id_catch(1);
            }

            return ryZ_2.id_class(((rYB)var2.id_throws[7]).id_continue);
         }
      }

      return ryZ_2.PASS;
   }
}
