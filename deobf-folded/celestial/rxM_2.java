package celestial;

import com.google.common.collect.Sets;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Set;

public class rxM_2 extends rkQ_2 {
   private static final Set<QP> id_byte = Sets.newHashSet(new QP[]{QP.id_goto, QP.id_while, QP.id_throws, QP.id_catch, QP.id_instanceof, QP.id_boolean});
   private static final Set<xd_3> id_protected = Sets.newHashSet(
      new xd_3[]{xu_3.PJ, xu_3.hU, xu_3.sB, xu_3.sS, xu_3.ss, xu_3.sE, xu_3.sb, xu_3.sG, xu_3.XU, xu_3.Xe}
   );
   protected static final Map<xd_3, xd_3> id_class = new Builder()
      .put(xu_3.P, xu_3.b)
      .put(xu_3.id_static, xu_3.r)
      .put(xu_3.G, xu_3.J)
      .put(xu_3.id_strictfp, xu_3.id_switch)
      .put(xu_3.E, xu_3.X)
      .put(xu_3.id_const, xu_3.id_double)
      .put(xu_3.S, xu_3.O)
      .put(xu_3.id_short, xu_3.id_transient)
      .put(xu_3.s, xu_3.h)
      .put(xu_3.id_default, xu_3.id_for)
      .put(xu_3.B, xu_3.M)
      .put(xu_3.id_import, xu_3.id_boolean)
      .put(xu_3.Xx, xu_3.Xd)
      .put(xu_3.Xk, xu_3.XW)
      .put(xu_3.Xm, xu_3.XZ)
      .put(xu_3.Xv, xu_3.XF)
      .build();

   protected rxM_2(rdG_2 var1, float var2, float var3, rdO_2 var4) {
      super(var2, var3, var1, id_protected, var4);
   }

   @Override
   public float id_class(rdn_3 var1, xc_3 var2) {
      QP var3 = var2.id_byte();
      return id_byte.contains(var3) ? this.id_break : super.id_class(var1, var2);
   }

   @Override
   public ryZ_2 id_class(rdH_2 var1) {
      rYB var2 = var1.id_int();
      rfH_2 var3 = var1.id_class();
      xc_3 var4 = var2.id_byte(var3);
      xd_3 var5 = id_class.get(var4.id_break());
      if (var5 != null) {
         rhd_3 var6 = var1.id_final();
         var2.id_class(var6, var3, rqn_3.E, rqL_2.BLOCKS, 1.0F, 1.0F);
         if (!var2.id_continue) {
            var2.id_class(var3, var5.id_continue().id_class(WL.id_new, var4.id_byte(WL.id_new)), 11);
            if (var6 != null) {
               var1.id_volatile().id_class(1, var6, var1x -> var1x.id_byte(var1.id_package()));
            }
         }

         return ryZ_2.id_class(var2.id_continue);
      } else {
         return ryZ_2.PASS;
      }
   }
}
