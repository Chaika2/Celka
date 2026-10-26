package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;

public class rxi_3 extends rkQ_2 {
   private static final Set<xd_3> id_byte = ImmutableSet.of(
      xu_3.bg, xu_3.XN, xu_3.Ey, xu_3.Oh, xu_3.Jb, xu_3.Xn, new xd_3[]{xu_3.N, xu_3.c, xu_3.W, xu_3.x, xu_3.d, xu_3.Q, xu_3.z, xu_3.k}
   );
   protected static final Map<xd_3, xc_3> id_class = Maps.newHashMap(
      ImmutableMap.of(
         xu_3.id_implements,
         xu_3.PS.id_continue(),
         xu_3.bt,
         xu_3.PS.id_continue(),
         xu_3.id_finally,
         xu_3.PS.id_continue(),
         xu_3.id_extends,
         xu_3.id_finally.id_continue()
      )
   );

   protected rxi_3(rdG_2 var1, int var2, float var3, rdO_2 var4) {
      super((float)var2, var3, var1, id_byte, var4);
   }

   @Override
   public ryZ_2 id_class(rdH_2 var1) {
      rYB var2 = var1.id_int();
      rfH_2 var3 = var1.id_class();
      if (var1.id_finally() != rpr_3.DOWN && var2.id_byte(var3.id_final()).id_catch()) {
         xc_3 var4 = id_class.get(var2.id_byte(var3).id_break());
         if (var4 != null) {
            rhd_3 var5 = var1.id_final();
            var2.id_class(var5, var3, rqn_3.sy, rqL_2.BLOCKS, 1.0F, 1.0F);
            if (!var2.id_continue) {
               var2.id_class(var3, var4, 11);
               if (var5 != null) {
                  var1.id_volatile().id_class(1, var5, var1x -> var1x.id_byte(var1.id_package()));
               }
            }

            return ryZ_2.id_class(var2.id_continue);
         }
      }

      return ryZ_2.PASS;
   }
}
