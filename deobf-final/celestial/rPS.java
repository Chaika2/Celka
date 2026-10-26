package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.function.Predicate;

public class rPS<E extends iB_2> extends rPm_1<E> {
   private final Predicate<E> class_;
   private final int byte_;
   private final float protected_;

   public rPS(float var1, boolean var2, int var3) {
      this(var0 -> true, var1, var2, var3);
   }

   public rPS(Predicate<E> var1, float var2, boolean var3, int var4) {
      super(ImmutableMap.of(il_3.final_, iC_2.REGISTERED, il_3.volatile_, var3 ? iC_2.REGISTERED : iC_2.VALUE_ABSENT, il_3.static_, iC_2.VALUE_PRESENT));
      this.class_ = var1;
      this.byte_ = var4;
      this.protected_ = var2;
   }

   private rsE_2 class_(E var1) {
      return var1.SF().byte_(il_3.static_).get();
   }

   @Override
   protected boolean class_(rrEm_1 var1, E var2) {
      return this.class_.test((E)var2) && this.class_((E)var2).class_(var2, (double)this.byte_);
   }

   @Override
   protected void protected_(rrEm_1 var1, E var2, long var3) {
      iA_2.class_(var2, this.class_((E)var2), this.protected_, 0);
   }
}
