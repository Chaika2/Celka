package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class dd_3 extends ds_3 {
   public static final rCc_1 id_final = kE_2.p;
   private static final Map<rpr_3, rjC_2> id_package = Maps.newEnumMap(
      ImmutableMap.of(
         rpr_3.NORTH,
         xd_3.id_class(0.0, 4.0, 5.0, 16.0, 12.0, 16.0),
         rpr_3.SOUTH,
         xd_3.id_class(0.0, 4.0, 0.0, 16.0, 12.0, 11.0),
         rpr_3.WEST,
         xd_3.id_class(5.0, 4.0, 0.0, 16.0, 12.0, 16.0),
         rpr_3.EAST,
         xd_3.id_class(0.0, 4.0, 0.0, 11.0, 12.0, 16.0)
      )
   );

   protected dd_3(Jq_1 var1) {
      super(var1);
      this.id_extends(this.id_abstract.id_break().id_class(id_final, rpr_3.NORTH).id_class(id_volatile, Boolean.valueOf(true)));
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      if (var1.id_byte(id_volatile)) {
         var4.id_extends().id_class(var5, rXG.id_byte, rXG.id_byte.id_class(var4));
      }

      return var2.id_case() == var1.id_byte(id_final) && !var1.id_class(var4, var5) ? xu_3.id_class.id_continue() : var1;
   }

   @Override
   public boolean id_class(xc_3 var1, rRR var2, rfH_2 var3) {
      rpr_3 var4 = var1.id_byte(id_final);
      rfH_2 var5 = var3.id_break(var4.id_case());
      xc_3 var6 = var2.id_byte(var5);
      return var6.id_protected(var2, var5, var4);
   }

   @Override
   public xc_3 id_class(rxx_3 var1) {
      xc_3 var2 = super.id_class(var1);
      rYB var3 = var1.id_int();
      rfH_2 var4 = var1.id_class();
      rpr_3[] var5 = var1.id_throws();

      for (rpr_3 var9 : var5) {
         if (var9.id_final().id_protected()) {
            var2 = var2.id_class(id_final, var9.id_case());
            if (var2.id_class((rRR)var3, var4)) {
               return var2;
            }
         }
      }

      return null;
   }

   @Override
   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(id_final, id_volatile);
   }

   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return id_package.get(var1.id_byte(id_final));
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpa_3 var2) {
      return var1.id_class(var2.id_class(var1.id_byte(id_final)));
   }

   @Override
   public xc_3 id_class(xc_3 var1, rqd_3 var2) {
      return var1.id_class(id_final, var2.id_class(var1.id_byte(id_final)));
   }
}
