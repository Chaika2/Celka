package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.function.Function;

public class rPO<T> extends rPm_1<aA_2> {
   private final il_3<T> class_;
   private final float byte_;
   private final int protected_;
   private final Function<T, rjU_2> throws_;

   public rPO(il_3<T> var1, float var2, int var3, boolean var4, Function<T, rjU_2> var5) {
      super(ImmutableMap.of(il_3.volatile_, var4 ? iC_2.REGISTERED : iC_2.VALUE_ABSENT, var1, iC_2.VALUE_PRESENT));
      this.class_ = var1;
      this.byte_ = var2;
      this.protected_ = var3;
      this.throws_ = var5;
   }

   private rjU_2 class_(aA_2 var1) {
      return this.throws_.apply(var1.SF().byte_(this.class_).get());
   }

   private static void class_(aA_2 var0, rjU_2 var1, float var2) {
      for (int var3 = 0; var3 < 10; var3++) {
         rjU_2 var4 = iX_2.protected_(var0, 16, 7, var1);
         if (var4 != null) {
            var0.SF().class_(il_3.volatile_, new iH_2(var4, var2, 0));
            return;
         }
      }
   }

   protected void class_(rrEm_1 var1, aA_2 var2, long var3) {
      class_(var2, this.class_(var2), this.byte_);
   }

   protected boolean class_(rrEm_1 var1, aA_2 var2) {
      return this.break_(var2) ? false : var2.Ps().class_(this.class_(var2), (double)this.protected_);
   }

   public static rPO<rfH_2> class_(il_3<rfH_2> var0, float var1, int var2, boolean var3) {
      return new rPO<>(var0, var1, var2, var3, rjU_2::protected_);
   }

   private boolean break_(aA_2 var1) {
      if (!var1.SF().class_(il_3.volatile_)) {
         return false;
      } else {
         iH_2 var2 = var1.SF().byte_(il_3.volatile_).get();
         if (var2.break_() != this.byte_) {
            return false;
         } else {
            rjU_2 var3 = var2.class_().class_().protected_(var1.Ps());
            rjU_2 var4 = this.class_(var1).protected_(var1.Ps());
            return var3.break_(var4) < 0.0;
         }
      }
   }

   public static rPO<? extends an_3> break_(il_3<? extends an_3> var0, float var1, int var2, boolean var3) {
      return new rPO<>(var0, var1, var2, var3, an_3::Ps);
   }
}
