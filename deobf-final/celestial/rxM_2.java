package celestial;

import com.google.common.collect.Sets;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Set;

public class rxM_2 extends rkQ_2 {
   private static final Set<QP> byte_ = Sets.newHashSet(new QP[]{QP.goto_, QP.while_, QP.throws_, QP.catch_, QP.instanceof_, QP.boolean_});
   private static final Set<xd_3> protected_ = Sets.newHashSet(
      new xd_3[]{xu_3.PJ, xu_3.hU, xu_3.sB, xu_3.sS, xu_3.ss, xu_3.sE, xu_3.sb, xu_3.sG, xu_3.XU, xu_3.Xe}
   );
   protected static final Map<xd_3, xd_3> class_ = new Builder()
      .put(xu_3.P, xu_3.b)
      .put(xu_3.static_, xu_3.r)
      .put(xu_3.G, xu_3.J)
      .put(xu_3.strictfp_, xu_3.switch_)
      .put(xu_3.E, xu_3.X)
      .put(xu_3.const_, xu_3.double_)
      .put(xu_3.S, xu_3.O)
      .put(xu_3.short_, xu_3.transient_)
      .put(xu_3.s, xu_3.h)
      .put(xu_3.default_, xu_3.for_)
      .put(xu_3.B, xu_3.M)
      .put(xu_3.import_, xu_3.boolean_)
      .put(xu_3.Xx, xu_3.Xd)
      .put(xu_3.Xk, xu_3.XW)
      .put(xu_3.Xm, xu_3.XZ)
      .put(xu_3.Xv, xu_3.XF)
      .build();

   protected rxM_2(rdG_2 var1, float var2, float var3, rdO_2 var4) {
      super(var2, var3, var1, protected_, var4);
   }

   @Override
   public float class_(rdn_3 var1, xc_3 var2) {
      QP var3 = var2.byte_();
      return byte_.contains(var3) ? this.break_ : super.class_(var1, var2);
   }

   @Override
   public ryZ_2 class_(rdH_2 var1) {
      rYB var2 = var1.int_();
      rfH_2 var3 = var1.class_();
      xc_3 var4 = var2.byte_(var3);
      xd_3 var5 = class_.get(var4.break_());
      if (var5 != null) {
         rhd_3 var6 = var1.final_();
         var2.class_(var6, var3, rqn_3.E, rqL_2.BLOCKS, 1.0F, 1.0F);
         if (!var2.continue_) {
            var2.class_(var3, var5.continue_().class_(WL.new_, var4.byte_(WL.new_)), 11);
            if (var6 != null) {
               var1.volatile_().class_(1, var6, var1x -> var1x.byte_(var1.package_()));
            }
         }

         return ryZ_2.class_(var2.continue_);
      } else {
         return ryZ_2.PASS;
      }
   }
}
