package celestial;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class rkx_3 extends rkW_2 implements ee_3 {
   private final float id_class;
   private final Multimap<iJ_2, ix_3> id_break;

   public rkx_3(rdG_2 var1, int var2, float var3, rdO_2 var4) {
      super(var1, var4);
      this.id_class = (float)var2 + var1.id_byte();
      Builder var5 = ImmutableMultimap.builder();
      var5.put(iQ_2.id_case, new ix_3(id_case, "Weapon modifier", (double)this.id_class, id_3.ADDITION));
      var5.put(iQ_2.id_private, new ix_3(id_catch, "Weapon modifier", (double)var3, id_3.ADDITION));
      this.id_break = var5.build();
   }

   @Override
   public boolean id_class(rdn_3 var1, iB_2 var2, iB_2 var3) {
      var1.id_class(1, var3, var0 -> var0.id_break(rXQ.MAINHAND));
      return true;
   }

   @Override
   public boolean id_class(rdn_3 var1, rYB var2, xc_3 var3, rfH_2 var4, iB_2 var5) {
      if (var3.id_private(var2, var4) != 0.0F) {
         var1.id_class(2, var5, var0 -> var0.id_break(rXQ.MAINHAND));
      }

      return true;
   }

   @Override
   public Multimap<iJ_2, ix_3> id_class(rXQ var1) {
      return var1 == rXQ.MAINHAND ? this.id_break : super.id_class(var1);
   }

   @Override
   public boolean id_class(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4) {
      return !var4.id_implements();
   }

   @Override
   public float id_class(rdn_3 var1, xc_3 var2) {
      if (var2.id_class(xu_3.U)) {
         return 15.0F;
      } else {
         QP var3 = var2.id_byte();
         return var3 != QP.id_throws && var3 != QP.id_catch && var3 != QP.id_strictfp && !var2.id_class(rls_3.id_void) && var3 != QP.id_boolean ? 1.0F : 1.5F;
      }
   }

   @Override
   public boolean id_break(xc_3 var1) {
      return var1.id_class(xu_3.U);
   }

   public float id_catch() {
      return this.id_class;
   }
}
