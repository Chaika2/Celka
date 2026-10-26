package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Set;

public class rkS_2 extends rkQ_2 {
   private static final Set<xd_3> id_byte = Sets.newHashSet(
      new xd_3[]{
         xu_3.PI,
         xu_3.id_finally,
         xu_3.id_extends,
         xu_3.id_native,
         xu_3.PS,
         xu_3.id_implements,
         xu_3.id_char,
         xu_3.Bi,
         xu_3.id_throw,
         xu_3.id_interface,
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
   protected static final Map<xd_3, xc_3> id_class = Maps.newHashMap(ImmutableMap.of(xu_3.id_implements, xu_3.bt.id_continue()));

   public rkS_2(rdG_2 var1, float var2, float var3, rdO_2 var4) {
      super(var2, var3, var1, id_byte, var4);
   }

   @Override
   public ryZ_2 id_class(rdH_2 var1) {
      rYB var2 = var1.id_int();
      rfH_2 var3 = var1.id_class();
      xc_3 var4 = var2.id_byte(var3);
      if (var1.id_finally() == rpr_3.DOWN) {
         return ryZ_2.PASS;
      } else {
         rhd_3 var5 = var1.id_final();
         xc_3 var6 = id_class.get(var4.id_break());
         xc_3 var7 = null;
         if (var6 != null && var2.id_byte(var3.id_final()).id_catch()) {
            var2.id_class(var5, var3, rqn_3.Jb, rqL_2.BLOCKS, 1.0F, 1.0F);
            var7 = var6;
         } else if (var4.id_break() instanceof xn_3 && var4.id_byte(xn_3.id_final)) {
            if (!var2.id_import()) {
               var2.id_class((rhd_3)null, 1009, var3, 0);
            }

            xn_3.id_byte(var2, var3, var4);
            var7 = var4.id_class(xn_3.id_final, Boolean.valueOf(false));
         }

         if (var7 != null) {
            if (!var2.id_continue) {
               var2.id_class(var3, var7, 11);
               if (var5 != null) {
                  var1.id_volatile().id_class(1, var5, var1x -> var1x.id_byte(var1.id_package()));
               }
            }

            return ryZ_2.id_class(var2.id_continue);
         } else {
            return ryZ_2.PASS;
         }
      }
   }

   @Override
   public boolean id_break(xc_3 var1) {
      return var1.id_class(xu_3.Pq) || var1.id_class(xu_3.Pt);
   }
}
