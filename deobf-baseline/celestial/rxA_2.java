package celestial;

import com.google.common.collect.Maps;
import java.util.Map;

public class rxA_2 extends rdb_3 {
   private static final Map<rxL_2, rxA_2> id_class = Maps.newEnumMap(rxL_2.class);
   private final rxL_2 id_break;

   public rxL_2 id_byte() {
      return this.id_break;
   }

   public rxA_2(rxL_2 var1, rdO_2 var2) {
      super(var2);
      this.id_break = var1;
      id_class.put(var1, this);
   }

   public static rxA_2 id_class(rxL_2 var0) {
      return id_class.get(var0);
   }

   @Override
   public ryZ_2 id_class(rdn_3 var1, rhd_3 var2, iB_2 var3, rpm_3 var4) {
      if (var3 instanceof rOb_1 var5 && var5.BM() && !var5.sJ() && var5.n() != this.id_break) {
         if (!((rYB)var2.id_throws[7]).id_continue) {
            var5.id_break(this.id_break);
            var1.id_catch(1);
         }

         return ryZ_2.id_class(((rYB)var2.id_throws[7]).id_continue);
      }

      return ryZ_2.PASS;
   }
}
