package celestial;

import com.google.common.collect.ImmutableMap;

public class rPv_1 extends rPm_1<rsq_3> {
   private final float class_;

   protected void byte_(rrEm_1 var1, rsq_3 var2, long var3) {
      iZ_2 var5 = var2.SF();
      var5.break_(il_3.volatile_);
      var5.break_(il_3.final_);
   }

   public rPv_1(float var1) {
      super(ImmutableMap.of(il_3.volatile_, iC_2.REGISTERED, il_3.final_, iC_2.REGISTERED), Integer.MAX_VALUE);
      this.class_ = var1;
   }

   private void class_(rsq_3 var1) {
      iZ_2 var2 = var1.SF();
      var2.class_(il_3.volatile_, new iH_2(new rfY_2(var1.class_(), false), this.class_, 2));
      var2.class_(il_3.final_, new rfY_2(var1.class_(), true));
   }

   @Override
   protected boolean class_(long var1) {
      return false;
   }

   protected boolean class_(rrEm_1 var1, rsq_3 var2) {
      rhd_3 var3 = var2.class_();
      return var2.BM() && var3 != null && !var2.rT() && !(Boolean)var2.throws_[25] && var2.int_(var3) <= 16.0 && (rJr_1)var3.implements_[4] != null;
   }

   protected boolean class_(rrEm_1 var1, rsq_3 var2, long var3) {
      return this.class_(var1, var2);
   }

   protected void break_(rrEm_1 var1, rsq_3 var2, long var3) {
      this.class_(var2);
   }

   protected void protected_(rrEm_1 var1, rsq_3 var2, long var3) {
      this.class_(var2);
   }
}
