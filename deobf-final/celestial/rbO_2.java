package celestial;

import com.google.common.collect.ImmutableMap;

public class rbO_2<E extends rbk_3> extends rPm_1<E> {
   private final int class_;

   public rbO_2(int var1) {
      super(
         ImmutableMap.of(il_3.static_, iC_2.VALUE_PRESENT, il_3.const_, iC_2.VALUE_ABSENT, il_3.transient_, iC_2.VALUE_ABSENT, il_3.boolean_, iC_2.VALUE_ABSENT)
      );
      this.class_ = var1;
   }

   protected void class_(rrEm_1 var1, E var2, long var3) {
      var2.SF().class_(il_3.const_, true, (long)this.class_);
   }

   protected boolean class_(rrEm_1 var1, E var2) {
      rsE_2 var3 = var2.SF().byte_(il_3.static_).get();
      return rbW_2.class_(var3.protected_().break_());
   }
}
