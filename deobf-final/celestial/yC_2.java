package celestial;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;

public class yC_2 {
   private final rqE_2<yy_3> class_ = new rqE_2<>(32);
   private final Map<xd_3, Set<rCZ<?>>> break_ = Maps.newHashMap();

   private void class_(Set<rCZ<?>> var1, xd_3... var2) {
      for (xd_3 var6 : var2) {
         this.break_.put(var6, var1);
      }
   }

   private void class_(rCZ<?> var1, xd_3... var2) {
      this.class_(ImmutableSet.of(var1), var2);
   }

   public Set<rCZ<?>> class_(xd_3 var1) {
      return this.break_.getOrDefault(var1, ImmutableSet.of());
   }

   public static yC_2 class_() {
      yC_2 var0 = new yC_2();
      var0.class_(
         (var0x, var1, var2, var3) -> var1 != null && var2 != null ? rYm_1.class_(var1, var0x.byte_(du_3.volatile_) == rCf_1.UPPER ? var2.break_() : var2) : -1,
         xu_3.GE,
         xu_3.Gs
      );
      var0.class_(du_3.volatile_, xu_3.GE, xu_3.Gs);
      var0.class_(
         (var0x, var1, var2, var3) -> var1 != null && var2 != null ? rYm_1.class_(var1, var2) : rRH.class_(0.5, 1.0), xu_3.implements_, xu_3.a, xu_3.e, xu_3.Sq
      );
      var0.class_((var0x, var1, var2, var3) -> rRN.class_(), xu_3.d);
      var0.class_((var0x, var1, var2, var3) -> rRN.break_(), xu_3.k);
      var0.class_((var0x, var1, var2, var3) -> var1 != null && var2 != null ? rYm_1.break_(var1, var2) : rRN.byte_(), xu_3.x, xu_3.W, xu_3.z, xu_3.Q, xu_3.BD);
      var0.class_((var0x, var1, var2, var3) -> var1 != null && var2 != null ? rYm_1.byte_(var1, var2) : -1, xu_3.try_, xu_3.hM, xu_3.Sb);
      var0.class_((var0x, var1, var2, var3) -> Wu_1.byte_(var0x.byte_(Wu_1.new_)), xu_3.ra);
      var0.class_(Wu_1.new_, xu_3.ra);
      var0.class_((var0x, var1, var2, var3) -> var1 != null && var2 != null ? rYm_1.class_(var1, var2) : -1, xu_3.Pf);
      var0.class_((var0x, var1, var2, var3) -> 14731036, xu_3.BY, xu_3.BR);
      var0.class_((var0x, var1, var2, var3) -> {
         int var4 = var0x.byte_(zO_2.volatile_);
         int var5 = var4 * 32;
         int var6 = 255 - var4 * 8;
         int var7 = var4 * 4;
         return var5 << 16 | var6 << 8 | var7;
      }, xu_3.BK, xu_3.Bo);
      var0.class_(zO_2.volatile_, xu_3.BK, xu_3.Bo);
      var0.class_((var0x, var1, var2, var3) -> var1 != null && var2 != null ? 2129968 : 7455580, xu_3.Sr);
      return var0;
   }

   public void class_(yy_3 var1, xd_3... var2) {
      for (xd_3 var6 : var2) {
         this.class_.class_(var1, rVL.strictfp_.class_(var6));
      }
   }

   public int class_(xc_3 var1, rRp_1 var2, rfH_2 var3, int var4) {
      yy_3 var5 = this.class_.class_(rVL.strictfp_.class_(var1.break_()));
      return var5 == null ? -1 : var5.getColor(var1, var2, var3, var4);
   }

   public int class_(xc_3 var1, rYB var2, rfH_2 var3) {
      yy_3 var4 = this.class_.class_(rVL.strictfp_.class_(var1.break_()));
      if (var4 != null) {
         return var4.getColor(var1, (rRp_1)null, (rfH_2)null, 0);
      } else {
         QS var5 = var1.protected_(var2, var3);
         return var5 != null ? var5.d : -1;
      }
   }
}
