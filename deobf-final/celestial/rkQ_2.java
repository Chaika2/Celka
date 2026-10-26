package celestial;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import java.util.Set;

public class rkQ_2 extends rkW_2 implements ee_3 {
   private final Set<xd_3> class_;
   protected final float break_;
   private final float byte_;
   private final Multimap<iJ_2, ix_3> protected_;

   protected rkQ_2(float var1, float var2, rdG_2 var3, Set<xd_3> var4, rdO_2 var5) {
      super(var3, var5);
      this.class_ = var4;
      this.break_ = var3.break_();
      this.byte_ = var1 + var3.byte_();
      Builder var6 = ImmutableMultimap.builder();
      var6.put(iQ_2.case_, new ix_3(case_, "Tool modifier", (double)this.byte_, id_3.ADDITION));
      var6.put(iQ_2.private_, new ix_3(catch_, "Tool modifier", (double)var2, id_3.ADDITION));
      this.protected_ = var6.build();
   }

   @Override
   public boolean class_(rdn_3 var1, rYB var2, xc_3 var3, rfH_2 var4, iB_2 var5) {
      if (!var2.continue_ && var3.private_(var2, var4) != 0.0F) {
         var1.class_(1, var5, var0 -> var0.break_(rXQ.MAINHAND));
      }

      return true;
   }

   @Override
   public Multimap<iJ_2, ix_3> class_(rXQ var1) {
      return var1 == rXQ.MAINHAND ? this.protected_ : super.class_(var1);
   }

   @Override
   public float class_(rdn_3 var1, xc_3 var2) {
      return this.class_.contains(var2.break_()) ? this.break_ : 1.0F;
   }

   @Override
   public boolean class_(rdn_3 var1, iB_2 var2, iB_2 var3) {
      var1.class_(2, var3, var0 -> var0.break_(rXQ.MAINHAND));
      return true;
   }

   public float catch_() {
      return this.byte_;
   }
}
