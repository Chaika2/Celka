package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class xr_3 extends xF_2 {
   public static final rCc_1 id_volatile = kE_2.p;
   private final zh_3 id_final;
   private static final Map<rpr_3, rjC_2> id_package = Maps.newEnumMap(
      ImmutableMap.of(
         rpr_3.SOUTH,
         xd_3.id_class(6.0, 0.0, 6.0, 10.0, 10.0, 16.0),
         rpr_3.WEST,
         xd_3.id_class(0.0, 0.0, 6.0, 10.0, 10.0, 10.0),
         rpr_3.NORTH,
         xd_3.id_class(6.0, 0.0, 0.0, 10.0, 10.0, 10.0),
         rpr_3.EAST,
         xd_3.id_class(6.0, 0.0, 6.0, 16.0, 10.0, 10.0)
      )
   );

   protected xr_3(zh_3 var1, Jq_1 var2) {
      super(var2);
      this.id_extends(this.id_abstract.id_break().id_class(id_volatile, rpr_3.NORTH));
      this.id_final = var1;
   }

   @Override
   public xc_3 id_class(xc_3 var1, rqd_3 var2) {
      return var1.id_class(id_volatile, var2.id_class(var1.id_byte(id_volatile)));
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpa_3 var2) {
      return var1.id_class(var2.id_class(var1.id_byte(id_volatile)));
   }

   @Override
   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(id_volatile);
   }

   @Override
   public rdn_3 id_class(rRq_1 var1, rfH_2 var2, xc_3 var3) {
      return new rdn_3(this.id_break());
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      return !var3.id_class(this.id_final) && var2 == var1.id_byte(id_volatile)
         ? this.id_final.id_break().id_continue().id_class(zO_2.id_volatile, Integer.valueOf(7))
         : super.id_class(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return id_package.get(var1.id_byte(id_volatile));
   }

   protected rdb_3 id_break() {
      if (this.id_final == xu_3.Pg) {
         return rdy_3.Jk;
      } else {
         return this.id_final == xu_3.Bg ? rdy_3.JW : rdy_3.id_class;
      }
   }

   @Override
   protected boolean id_catch(xc_3 var1, rRq_1 var2, rfH_2 var3) {
      return var1.id_class(xu_3.PS);
   }
}
