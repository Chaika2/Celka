package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Set;

public class rkS_2 extends rkQ_2 {
   private static final Set<xd_3> byte_ = Sets.newHashSet(
      new xd_3[]{
         xu_3.PI,
         xu_3.finally_,
         xu_3.extends_,
         xu_3.native_,
         xu_3.PS,
         xu_3.implements_,
         xu_3.char_,
         xu_3.Bi,
         xu_3.throw_,
         xu_3.interface_,
         xu_3.Pt,
         xu_3.Pq,
         xu_3.PY,
         xu_3.bt,
         xu_3.MY,
         xu_3.Mo,
         xu_3.MK,
         xu_3.MD,
         xu_3.MU,
         xu_3.Me,
         xu_3.Ma,
         xu_3.Mi,
         xu_3.Or,
         xu_3.OP,
         xu_3.OB,
         xu_3.OS,
         xu_3.Os,
         xu_3.OE,
         xu_3.OG,
         xu_3.Ob,
         xu_3.Po
      }
   );
   protected static final Map<xd_3, xc_3> class_ = Maps.newHashMap(ImmutableMap.of(xu_3.implements_, xu_3.bt.continue_()));

   public rkS_2(rdG_2 var1, float var2, float var3, rdO_2 var4) {
      super(var2, var3, var1, byte_, var4);
   }

   @Override
   public ryZ_2 class_(rdH_2 var1) {
      rYB var2 = var1.int_();
      rfH_2 var3 = var1.class_();
      xc_3 var4 = var2.byte_(var3);
      if (var1.finally_() == rpr_3.DOWN) {
         return ryZ_2.PASS;
      } else {
         rhd_3 var5 = var1.final_();
         xc_3 var6 = class_.get(var4.break_());
         xc_3 var7 = null;
         if (var6 != null && var2.byte_(var3.final_()).catch_()) {
            var2.class_(var5, var3, rqn_3.Jb, rqL_2.BLOCKS, 1.0F, 1.0F);
            var7 = var6;
         } else if (var4.break_() instanceof xn_3 && var4.byte_(xn_3.final_)) {
            if (!var2.import_()) {
               var2.class_((rhd_3)null, 1009, var3, 0);
            }

            xn_3.byte_(var2, var3, var4);
            var7 = var4.class_(xn_3.final_, Boolean.valueOf(false));
         }

         if (var7 != null) {
            if (!var2.continue_) {
               var2.class_(var3, var7, 11);
               if (var5 != null) {
                  var1.volatile_().class_(1, var5, var1x -> var1x.byte_(var1.package_()));
               }
            }

            return ryZ_2.class_(var2.continue_);
         } else {
            return ryZ_2.PASS;
         }
      }
   }

   @Override
   public boolean break_(xc_3 var1) {
      return var1.class_(xu_3.Pq) || var1.class_(xu_3.Pt);
   }
}
