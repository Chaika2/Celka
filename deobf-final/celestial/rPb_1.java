package celestial;

import com.google.common.collect.ImmutableMap;

public class rPb_1<E extends iB_2> extends rPm_1<E> {
   private final float class_;

   public rPb_1(float var1) {
      super(ImmutableMap.of(il_3.final_, iC_2.REGISTERED, il_3.volatile_, iC_2.VALUE_ABSENT, il_3.super_, iC_2.VALUE_PRESENT));
      this.class_ = var1;
   }

   @Override
   protected boolean class_(rrEm_1 var1, E var2) {
      return !var2.Pm();
   }

   private boolean class_(E var1) {
      return this.break_((E)var1).class_(var1, 1.0);
   }

   private an_3 break_(E var1) {
      return var1.SF().byte_(il_3.super_).get();
   }

   @Override
   protected void protected_(rrEm_1 var1, E var2, long var3) {
      if (this.class_((E)var2)) {
         var2.this_(this.break_((E)var2));
      } else {
         iA_2.class_(var2, this.break_((E)var2), this.class_, 1);
      }
   }
}
