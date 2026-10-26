package celestial;

import com.google.common.collect.ImmutableMap;

public class rrd_3<E extends au_3> extends rPm_1<E> {
   private final rqb_3 class_;
   private final float byte_;

   public rrd_3(rqb_3 var1, float var2) {
      super(ImmutableMap.of(il_3.void_, iC_2.VALUE_PRESENT, il_3.volatile_, iC_2.VALUE_ABSENT));
      this.class_ = var1;
      this.byte_ = var2;
   }

   private au_3 class_(E var1) {
      return var1.SF().byte_(il_3.void_).get();
   }

   protected void class_(rrEm_1 var1, E var2, long var3) {
      iA_2.class_(var2, this.class_((E)var2), this.byte_, this.class_.class_() - 1);
   }

   protected boolean class_(rrEm_1 var1, E var2) {
      if (!var2.n_()) {
         return false;
      } else {
         au_3 var3 = this.class_((E)var2);
         return var2.class_(var3, (double)(this.class_.break_() + 1)) && !var2.class_(var3, (double)this.class_.class_());
      }
   }
}
