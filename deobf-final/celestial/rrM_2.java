package celestial;

import com.google.common.collect.ImmutableMap;

public class rrM_2<E extends is_3> extends rPm_1<E> {
   private final int class_;
   private final float byte_;

   private iB_2 byte_(E var1) {
      return var1.SF().byte_(il_3.package_).get();
   }

   public rrM_2(int var1, float var2) {
      super(
         ImmutableMap.of(il_3.volatile_, iC_2.VALUE_ABSENT, il_3.final_, iC_2.REGISTERED, il_3.package_, iC_2.VALUE_PRESENT, il_3.private_, iC_2.VALUE_PRESENT)
      );
      this.class_ = var1;
      this.byte_ = var2;
   }

   private boolean class_(E var1) {
      return var1.SF().byte_(il_3.private_).get().contains(this.byte_((E)var1));
   }

   protected boolean class_(rrEm_1 var1, E var2) {
      return this.class_((E)var2) && this.break_((E)var2);
   }

   protected void class_(rrEm_1 var1, E var2, long var3) {
      var2.SF().class_(il_3.final_, new rfY_2(this.byte_((E)var2), true));
      var2.super_().class_(-this.byte_, 0.0F);
      Float var9 = rfU_2.break_((Float)var2.throws_[15], (Float)var2.private_[25], 0.0F);
      var2.throws_[15] = var9;
   }

   private boolean break_(E var1) {
      return this.byte_((E)var1).class_(var1, (double)this.class_);
   }
}
