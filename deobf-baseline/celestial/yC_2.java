package celestial;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;

public class yC_2 {
   private final rqE_2<yy_3> id_class = new rqE_2<>(32);
   private final Map<xd_3, Set<rCZ<?>>> id_break = Maps.newHashMap();

   private void id_class(Set<rCZ<?>> var1, xd_3... var2) {
      for (xd_3 var6 : var2) {
         this.id_break.put(var6, var1);
      }
   }

   private void id_class(rCZ<?> var1, xd_3... var2) {
      this.id_class(ImmutableSet.of(var1), var2);
   }

   public Set<rCZ<?>> id_class(xd_3 var1) {
      return this.id_break.getOrDefault(var1, ImmutableSet.of());
   }

   public static yC_2 id_class() {
      yC_2 var0 = new yC_2();
      var0.id_class(
         (var0x, var1, var2, var3) -> var1 != null && var2 != null
               ? rYm_1.id_class(var1, var0x.id_byte(du_3.id_volatile) == rCf_1.UPPER ? var2.id_break() : var2)
               : -1,
         xu_3.GE,
         xu_3.Gs
      );
      var0.id_class(du_3.id_volatile, xu_3.GE, xu_3.Gs);
      var0.id_class(
         (var0x, var1, var2, var3) -> var1 != null && var2 != null ? rYm_1.id_class(var1, var2) : rRH.id_class(0.5, 1.0),
         xu_3.id_implements,
         xu_3.a,
         xu_3.e,
         xu_3.Sq
      );
      var0.id_class((var0x, var1, var2, var3) -> rRN.id_class(), xu_3.d);
      var0.id_class((var0x, var1, var2, var3) -> rRN.id_break(), xu_3.k);
      var0.id_class(
         (var0x, var1, var2, var3) -> var1 != null && var2 != null ? rYm_1.id_break(var1, var2) : rRN.id_byte(), xu_3.x, xu_3.W, xu_3.z, xu_3.Q, xu_3.BD
      );
      var0.id_class((var0x, var1, var2, var3) -> var1 != null && var2 != null ? rYm_1.id_byte(var1, var2) : -1, xu_3.id_try, xu_3.hM, xu_3.Sb);
      var0.id_class((var0x, var1, var2, var3) -> Wu_1.id_byte(var0x.id_byte(Wu_1.id_new)), xu_3.ra);
      var0.id_class(Wu_1.id_new, xu_3.ra);
      var0.id_class((var0x, var1, var2, var3) -> var1 != null && var2 != null ? rYm_1.id_class(var1, var2) : -1, xu_3.Pf);
      var0.id_class((var0x, var1, var2, var3) -> 14731036, xu_3.BY, xu_3.BR);
      var0.id_class((var0x, var1, var2, var3) -> {
         int var4 = var0x.id_byte(zO_2.id_volatile);
         int var5 = var4 * 32;
         int var6 = 255 - var4 * 8;
         int var7 = var4 * 4;
         return var5 << 16 | var6 << 8 | var7;
      }, xu_3.BK, xu_3.Bo);
      var0.id_class(zO_2.id_volatile, xu_3.BK, xu_3.Bo);
      var0.id_class((var0x, var1, var2, var3) -> var1 != null && var2 != null ? 2129968 : 7455580, xu_3.Sr);
      return var0;
   }

   public void id_class(yy_3 var1, xd_3... var2) {
      for (xd_3 var6 : var2) {
         this.id_class.id_class(var1, rVL.id_strictfp.id_class(var6));
      }
   }

   public int id_class(xc_3 var1, rRp_1 var2, rfH_2 var3, int var4) {
      yy_3 var5 = this.id_class.id_class(rVL.id_strictfp.id_class(var1.id_break()));
      return var5 == null ? -1 : var5.getColor(var1, var2, var3, var4);
   }

   public int id_class(xc_3 var1, rYB var2, rfH_2 var3) {
      yy_3 var4 = this.id_class.id_class(rVL.id_strictfp.id_class(var1.id_break()));
      if (var4 != null) {
         return var4.getColor(var1, (rRp_1)null, (rfH_2)null, 0);
      } else {
         QS var5 = var1.id_protected(var2, var3);
         return var5 != null ? var5.d : -1;
      }
   }
}
