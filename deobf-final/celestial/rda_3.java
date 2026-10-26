package celestial;

public class rda_3 extends rdb_3 {
   public rda_3(rdO_2 var1) {
      super(var1);
   }

   @Override
   public ryZ_2 class_(rdn_3 var1, rhd_3 var2, iB_2 var3, rpm_3 var4) {
      if (var3 instanceof aK_2 && var3.BM()) {
         aK_2 var5 = (aK_2)var3;
         if (!var5.byte_() && var5.class_()) {
            if (!((rYB)var2.throws_[7]).continue_) {
               var5.class_(rqL_2.NEUTRAL);
               var1.catch_(1);
            }

            return ryZ_2.class_(((rYB)var2.throws_[7]).continue_);
         }
      }

      return ryZ_2.PASS;
   }
}
