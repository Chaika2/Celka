package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class zV_2 extends JU {
   public static final rCc_1 id_volatile = kE_2.p;
   private static final Map<rpr_3, rjC_2> id_final = Maps.newEnumMap(
      ImmutableMap.of(
         rpr_3.NORTH,
         xd_3.id_class(4.0, 4.0, 8.0, 12.0, 12.0, 16.0),
         rpr_3.SOUTH,
         xd_3.id_class(4.0, 4.0, 0.0, 12.0, 12.0, 8.0),
         rpr_3.EAST,
         xd_3.id_class(0.0, 4.0, 4.0, 8.0, 12.0, 12.0),
         rpr_3.WEST,
         xd_3.id_class(8.0, 4.0, 4.0, 16.0, 12.0, 12.0)
      )
   );

   protected zV_2(WI var1, Jq_1 var2) {
      super(var1, var2);
      this.id_extends(this.id_abstract.id_break().id_class(id_volatile, rpr_3.NORTH));
   }

   @Override
   public xc_3 id_class(xc_3 var1, rqd_3 var2) {
      return var1.id_class(id_volatile, var2.id_class(var1.id_byte(id_volatile)));
   }

   @Override
   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(id_volatile);
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpa_3 var2) {
      return var1.id_class(var2.id_class(var1.id_byte(id_volatile)));
   }

   @Override
   public xc_3 id_class(rxx_3 var1) {
      xc_3 var2 = this.id_continue();
      rYB var3 = var1.id_int();
      rfH_2 var4 = var1.id_class();
      rpr_3[] var5 = var1.id_throws();

      for (rpr_3 var9 : var5) {
         if (var9.id_final().id_protected()) {
            rpr_3 var10 = var9.id_case();
            var2 = var2.id_class(id_volatile, var10);
            if (!var3.id_byte(var4.id_break(var9)).id_class(var1)) {
               return var2;
            }
         }
      }

      return null;
   }

   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return id_final.get(var1.id_byte(id_volatile));
   }

   @Override
   public String id_volatile() {
      return this.id_case().id_break();
   }
}
