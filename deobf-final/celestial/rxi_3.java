package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;

public class rxi_3 extends rkQ_2 {
   private static final Set<xd_3> byte_ = ImmutableSet.of(
      xu_3.bg, xu_3.XN, xu_3.Ey, xu_3.Oh, xu_3.Jb, xu_3.Xn, new xd_3[]{xu_3.N, xu_3.c, xu_3.W, xu_3.x, xu_3.d, xu_3.Q, xu_3.z, xu_3.k}
   );
   protected static final Map<xd_3, xc_3> class_ = Maps.newHashMap(
      ImmutableMap.of(
         xu_3.implements_, xu_3.PS.continue_(), xu_3.bt, xu_3.PS.continue_(), xu_3.finally_, xu_3.PS.continue_(), xu_3.extends_, xu_3.finally_.continue_()
      )
   );

   protected rxi_3(rdG_2 var1, int var2, float var3, rdO_2 var4) {
      super((float)var2, var3, var1, byte_, var4);
   }

   @Override
   public ryZ_2 class_(rdH_2 var1) {
      rYB var2 = var1.int_();
      rfH_2 var3 = var1.class_();
      if (var1.finally_() != rpr_3.DOWN && var2.byte_(var3.final_()).catch_()) {
         xc_3 var4 = class_.get(var2.byte_(var3).break_());
         if (var4 != null) {
            rhd_3 var5 = var1.final_();
            var2.class_(var5, var3, rqn_3.sy, rqL_2.BLOCKS, 1.0F, 1.0F);
            if (!var2.continue_) {
               var2.class_(var3, var4, 11);
               if (var5 != null) {
                  var1.volatile_().class_(1, var5, var1x -> var1x.byte_(var1.package_()));
               }
            }

            return ryZ_2.class_(var2.continue_);
         }
      }

      return ryZ_2.PASS;
   }
}
