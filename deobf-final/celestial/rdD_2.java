package celestial;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class rdD_2 extends rkQ_2 {
   private static final Set<xd_3> class_ = ImmutableSet.of(
      xu_3.sT,
      xu_3.float_,
      xu_3.volatile_,
      xu_3.K,
      xu_3.Pr,
      xu_3.ri,
      new xd_3[]{
         xu_3.o,
         xu_3.rt,
         xu_3.abstract_,
         xu_3.void_,
         xu_3.PT,
         xu_3.rw,
         xu_3.long_,
         xu_3.Z,
         xu_3.m,
         xu_3.rV,
         xu_3.PR,
         xu_3.Ei,
         xu_3.hP,
         xu_3.Px,
         xu_3.Pl,
         xu_3.F,
         xu_3.L,
         xu_3.A,
         xu_3.Gf,
         xu_3.Gj,
         xu_3.GI,
         xu_3.break_,
         xu_3.byte_,
         xu_3.protected_,
         xu_3.throws_,
         xu_3.case_,
         xu_3.catch_,
         xu_3.private_,
         xu_3.GU,
         xu_3.Ge,
         xu_3.Ga,
         xu_3.br,
         xu_3.bP,
         xu_3.bB,
         xu_3.bS,
         xu_3.bs,
         xu_3.bE,
         xu_3.bG,
         xu_3.bM,
         xu_3.bX,
         xu_3.bJ,
         xu_3.bh,
         xu_3.bO,
         xu_3.Pp,
         xu_3.Pm,
         xu_3.hZ,
         xu_3.hv,
         xu_3.hF,
         xu_3.hL,
         xu_3.hA,
         xu_3.hn,
         xu_3.hC,
         xu_3.hl,
         xu_3.hH,
         xu_3.hy,
         xu_3.hp,
         xu_3.hq,
         xu_3.hT,
         xu_3.bD,
         xu_3.MX,
         xu_3.Mb,
         xu_3.MM,
         xu_3.ME,
         xu_3.MS,
         xu_3.MO,
         xu_3.bi,
         xu_3.Ms,
         xu_3.MP,
         xu_3.ba,
         xu_3.be,
         xu_3.MB,
         xu_3.MG,
         xu_3.Mh,
         xu_3.bU,
         xu_3.Mr,
         xu_3.rB,
         xu_3.D,
         xu_3.rS
      }
   );

   protected rdD_2(rdG_2 var1, int var2, float var3, rdO_2 var4) {
      super((float)var2, var3, var1, class_, var4);
   }

   @Override
   public float class_(rdn_3 var1, xc_3 var2) {
      QP var3 = var2.byte_();
      return var3 != QP.static_ && var3 != QP.short_ && var3 != QP.void_ ? super.class_(var1, var2) : this.break_;
   }

   @Override
   public boolean break_(xc_3 var1) {
      int var2 = this.private_().protected_();
      if (var1.class_(xu_3.rg) || var1.class_(xu_3.Jd) || var1.class_(xu_3.JJ) || var1.class_(xu_3.Jk) || var1.class_(xu_3.Jx)) {
         return var2 >= 3;
      } else if (var1.class_(xu_3.Pr)
         || var1.class_(xu_3.ri)
         || var1.class_(xu_3.Sk)
         || var1.class_(xu_3.SN)
         || var1.class_(xu_3.rt)
         || var1.class_(xu_3.abstract_)
         || var1.class_(xu_3.Pl)) {
         return var2 >= 2;
      } else if (!var1.class_(xu_3.rw) && !var1.class_(xu_3.long_) && !var1.class_(xu_3.Z) && !var1.class_(xu_3.m)) {
         QP var3 = var1.byte_();
         return var3 == QP.void_ || var3 == QP.static_ || var3 == QP.short_ || var1.class_(xu_3.void_);
      } else {
         return var2 >= 1;
      }
   }
}
