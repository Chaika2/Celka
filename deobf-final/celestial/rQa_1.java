package celestial;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class rQa_1 extends rzO_2 {
   final xd_3 break_;
   final Set<rCZ<?>> byte_;

   rQa_1(rQz_1[] var1, xd_3 var2, Set<rCZ<?>> var3) {
      super(var1);
      this.break_ = var2;
      this.byte_ = var3;
   }

   public static rQi_1 class_(xd_3 var0) {
      return new rQi_1(var0);
   }

   private static <T extends Comparable<T>> String class_(xc_3 var0, rCZ<T> var1) {
      Comparable var2 = var0.byte_(var1);
      return var1.class_((T)var2);
   }

   @Override
   public Set<rzd_3<?>> class_() {
      return ImmutableSet.of(rzQ_2.catch_);
   }

   @Override
   public rzx_3 break_() {
      return rNl_1.synchronized_;
   }

   @Override
   protected rdn_3 break_(rdn_3 var1, rzr_3 var2) {
      xc_3 var3 = var2.break_(rzQ_2.catch_);
      if (var3 != null) {
         rcd_3 var4 = var1.int_();
         rcd_3 var5;
         if (var4.byte_("BlockStateTag", 10)) {
            var5 = var4.int_("BlockStateTag");
         } else {
            var5 = new rcd_3();
            var4.class_("BlockStateTag", var5);
         }

         this.byte_.stream().filter(var3::break_).forEach(var2x -> var5.class_(var2x.throws_(), class_(var3, (rCZ<?>)var2x)));
      }

      return var1;
   }
}
