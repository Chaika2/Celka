package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.function.BiPredicate;

public class rPQ<E extends iB_2, T extends an_3> extends rPm_1<E> {
   private final int class_;
   private final BiPredicate<E, an_3> byte_;

   public rPQ(int var1, BiPredicate<E, an_3> var2) {
      super(ImmutableMap.of(il_3.super_, iC_2.REGISTERED));
      this.class_ = var1;
      this.byte_ = var2;
   }

   private boolean class_(E var1, an_3 var2) {
      return var2.BM() && var2.class_(var1, (double)this.class_) && (rYB)var2.throws_[7] == (rYB)var1.throws_[7];
   }

   @Override
   protected boolean class_(rrEm_1 var1, E var2) {
      an_3 var3 = var2.ra();
      an_3 var4 = var2.SF().byte_(il_3.super_).orElse((an_3)null);
      if (var3 == null && var4 == null) {
         return false;
      } else {
         an_3 var5 = var3 == null ? var4 : var3;
         return !this.class_((E)var2, var5) || this.byte_.test((E)var2, var5);
      }
   }

   @Override
   protected void protected_(rrEm_1 var1, E var2, long var3) {
      var2.BH();
      var2.SF().break_(il_3.super_);
   }
}
