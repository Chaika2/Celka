package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Random;

public class zg_3 extends zZ_2 {
   public static final rCc_1 id_volatile = kE_2.p;
   private static final Map<rpr_3, rjC_2> id_final = Maps.newEnumMap(
      ImmutableMap.of(
         rpr_3.NORTH,
         xd_3.id_class(5.5, 3.0, 11.0, 10.5, 13.0, 16.0),
         rpr_3.SOUTH,
         xd_3.id_class(5.5, 3.0, 0.0, 10.5, 13.0, 5.0),
         rpr_3.WEST,
         xd_3.id_class(11.0, 3.0, 5.5, 16.0, 13.0, 10.5),
         rpr_3.EAST,
         xd_3.id_class(0.0, 3.0, 5.5, 5.0, 13.0, 10.5)
      )
   );

   protected zg_3(Jq_1 var1, rLx_1 var2) {
      super(var1, var2);
      this.id_extends(this.id_abstract.id_break().id_class(id_volatile, rpr_3.NORTH));
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, Random var4) {
      rpr_3 var5 = var1.id_byte(id_volatile);
      double var6 = (double)var3.b_() + 0.5;
      double var8 = (double)var3.c_() + 0.7;
      double var10 = (double)var3.d_() + 0.5;
      double var12 = 0.22;
      double var14 = 0.27;
      rpr_3 var16 = var5.id_case();
      var2.id_class(rLQ.id_double, var6 + 0.27 * (double)var16.id_implements(), var8 + 0.22, var10 + 0.27 * (double)var16.id_extends(), 0.0, 0.0, 0.0);
      var2.id_class(this.id_new, var6 + 0.27 * (double)var16.id_implements(), var8 + 0.22, var10 + 0.27 * (double)var16.id_extends(), 0.0, 0.0, 0.0);
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
   public xc_3 id_class(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      return var2.id_case() == var1.id_byte(id_volatile) && !var1.id_class(var4, var5) ? xu_3.id_class.id_continue() : var1;
   }

   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return id_private(var1);
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
            if (var2.id_class((rRR)var3, var4)) {
               return var2;
            }
         }
      }

      return null;
   }

   @Override
   public boolean id_class(xc_3 var1, rRR var2, rfH_2 var3) {
      rpr_3 var4 = var1.id_byte(id_volatile);
      rfH_2 var5 = var3.id_break(var4.id_case());
      xc_3 var6 = var2.id_byte(var5);
      return var6.id_protected(var2, var5, var4);
   }

   public static rjC_2 id_private(xc_3 var0) {
      return id_final.get(var0.id_byte(id_volatile));
   }

   @Override
   public String id_volatile() {
      return this.id_case().id_break();
   }
}
