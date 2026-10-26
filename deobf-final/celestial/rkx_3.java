package celestial;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class rkx_3 extends rkW_2 implements ee_3 {
   private final float class_;
   private final Multimap<iJ_2, ix_3> break_;

   public rkx_3(rdG_2 var1, int var2, float var3, rdO_2 var4) {
      super(var1, var4);
      this.class_ = (float)var2 + var1.byte_();
      Builder var5 = ImmutableMultimap.builder();
      var5.put(iQ_2.case_, new ix_3(case_, "Weapon modifier", (double)this.class_, id_3.ADDITION));
      var5.put(iQ_2.private_, new ix_3(catch_, "Weapon modifier", (double)var3, id_3.ADDITION));
      this.break_ = var5.build();
   }

   @Override
   public boolean class_(rdn_3 var1, iB_2 var2, iB_2 var3) {
      var1.class_(1, var3, var0 -> var0.break_(rXQ.MAINHAND));
      return true;
   }

   @Override
   public boolean class_(rdn_3 var1, rYB var2, xc_3 var3, rfH_2 var4, iB_2 var5) {
      if (var3.private_(var2, var4) != 0.0F) {
         var1.class_(2, var5, var0 -> var0.break_(rXQ.MAINHAND));
      }

      return true;
   }

   @Override
   public Multimap<iJ_2, ix_3> class_(rXQ var1) {
      return var1 == rXQ.MAINHAND ? this.break_ : super.class_(var1);
   }

   @Override
   public boolean class_(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4) {
      return !var4.implements_();
   }

   @Override
   public float class_(rdn_3 var1, xc_3 var2) {
      if (var2.class_(xu_3.U)) {
         return 15.0F;
      } else {
         QP var3 = var2.byte_();
         return var3 != QP.throws_ && var3 != QP.catch_ && var3 != QP.strictfp_ && !var2.class_(rls_3.void_) && var3 != QP.boolean_ ? 1.0F : 1.5F;
      }
   }

   @Override
   public boolean break_(xc_3 var1) {
      return var1.class_(xu_3.U);
   }

   public float catch_() {
      return this.class_;
   }
}
