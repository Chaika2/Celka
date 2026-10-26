package celestial;

import com.google.common.collect.ImmutableMap;

public class rPv_1 extends rPm_1<rsq_3> {
   private final float id_class;

   protected void id_byte(rrEm_1 var1, rsq_3 var2, long var3) {
      iZ_2 var5 = var2.SF();
      var5.id_break(il_3.id_volatile);
      var5.id_break(il_3.id_final);
   }

   public rPv_1(float var1) {
      super(ImmutableMap.of(il_3.id_volatile, iC_2.REGISTERED, il_3.id_final, iC_2.REGISTERED), Integer.MAX_VALUE);
      this.id_class = var1;
   }

   private void id_class(rsq_3 var1) {
      iZ_2 var2 = var1.SF();
      var2.id_class(il_3.id_volatile, new iH_2(new rfY_2(var1.id_class(), false), this.id_class, 2));
      var2.id_class(il_3.id_final, new rfY_2(var1.id_class(), true));
   }

   @Override
   protected boolean id_class(long var1) {
      return false;
   }

   protected boolean id_class(rrEm_1 var1, rsq_3 var2) {
      rhd_3 var3 = var2.id_class();
      return var2.BM() && var3 != null && !var2.rT() && !(Boolean)var2.id_throws[25] && var2.id_int(var3) <= 16.0 && (rJr_1)var3.id_implements[4] != null;
   }

   protected boolean id_class(rrEm_1 var1, rsq_3 var2, long var3) {
      return this.id_class(var1, var2);
   }

   protected void id_break(rrEm_1 var1, rsq_3 var2, long var3) {
      this.id_class(var2);
   }

   protected void id_protected(rrEm_1 var1, rsq_3 var2, long var3) {
      this.id_class(var2);
   }
}
