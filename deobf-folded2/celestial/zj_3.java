package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class zj_3 extends JD {
   public static final rCc_1 id_package = kE_2.p;
   private static final Map<rpr_3, rjC_2> id_int = Maps.newEnumMap(
      ImmutableMap.of(
         rpr_3.NORTH,
         xd_3.id_class(0.0, 4.5, 14.0, 16.0, 12.5, 16.0),
         rpr_3.SOUTH,
         xd_3.id_class(0.0, 4.5, 0.0, 16.0, 12.5, 2.0),
         rpr_3.EAST,
         xd_3.id_class(0.0, 4.5, 0.0, 2.0, 12.5, 16.0),
         rpr_3.WEST,
         xd_3.id_class(14.0, 4.5, 0.0, 16.0, 12.5, 16.0)
      )
   );

   public zj_3(Jq_1 var1, Qr_1 var2) {
      super(var1, var2);
      this.id_extends(this.id_abstract.id_break().id_class(id_package, rpr_3.NORTH).id_class(id_volatile, Boolean.valueOf(false)));
   }

   @Override
   public xc_3 id_class(xc_3 var1, rqd_3 var2) {
      return var1.id_class(id_package, var2.id_class(var1.id_byte(id_package)));
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpa_3 var2) {
      return var1.id_class(var2.id_class(var1.id_byte(id_package)));
   }

   @Override
   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(id_package, id_volatile);
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      return var2.id_case() == var1.id_byte(id_package) && !var1.id_class(var4, var5)
         ? xu_3.id_class.id_continue()
         : super.id_class(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return id_int.get(var1.id_byte(id_package));
   }

   @Override
   public xc_3 id_class(rxx_3 var1) {
      xc_3 var2 = this.id_continue();
      rXE var3 = var1.id_int().id_break(var1.id_class());
      rYB var4 = var1.id_int();
      rfH_2 var5 = var1.id_class();
      rpr_3[] var6 = var1.id_throws();

      for (rpr_3 var10 : var6) {
         if (var10.id_final().id_protected()) {
            rpr_3 var11 = var10.id_case();
            var2 = var2.id_class(id_package, var11);
            if (var2.id_class((rRR)var4, var5)) {
               return var2.id_class(id_volatile, Boolean.valueOf(var3.id_class() == rXG.id_byte));
            }
         }
      }

      return null;
   }

   @Override
   public boolean id_class(xc_3 var1, rRR var2, rfH_2 var3) {
      return var2.id_byte(var3.id_break(var1.id_byte(id_package).id_case())).id_byte().id_break();
   }

   @Override
   public String id_volatile() {
      return this.id_case().id_break();
   }
}
