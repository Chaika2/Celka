package celestial;

import com.google.common.collect.Maps;
import java.util.Map;

public class rxA_2 extends rdb_3 {
   private static final Map<rxL_2, rxA_2> class_ = Maps.newEnumMap(rxL_2.class);
   private final rxL_2 break_;

   public rxL_2 byte_() {
      return this.break_;
   }

   public rxA_2(rxL_2 var1, rdO_2 var2) {
      super(var2);
      this.break_ = var1;
      class_.put(var1, this);
   }

   public static rxA_2 class_(rxL_2 var0) {
      return class_.get(var0);
   }

   @Override
   public ryZ_2 class_(rdn_3 var1, rhd_3 var2, iB_2 var3, rpm_3 var4) {
      if (var3 instanceof rOb_1 var5 && var5.BM() && !var5.sJ() && var5.n() != this.break_) {
         if (!((rYB)var2.throws_[7]).continue_) {
            var5.break_(this.break_);
            var1.catch_(1);
         }

         return ryZ_2.class_(((rYB)var2.throws_[7]).continue_);
      }

      return ryZ_2.PASS;
   }
}
