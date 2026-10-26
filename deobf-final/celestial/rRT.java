package celestial;

import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public interface rRT extends rRq_1 {
   default Stream<rjC_2> byte_(an_3 var1, rfl_3 var2, Predicate<an_3> var3) {
      return Stream.concat(this.byte_(var1, var2), this.class_(var1, var2, var3));
   }

   rRq_1 byte_(int var1, int var2);

   default Stream<rjC_2> byte_(an_3 var1, rfl_3 var2) {
      return StreamSupport.stream(new rjt_3(this, var1, var2), false);
   }

   default boolean class_(an_3 var1, rfl_3 var2, BiPredicate<xc_3, rfH_2> var3) {
      return this.break_(var1, var2, var3).allMatch(rjC_2::break_);
   }

   Stream<rjC_2> class_(an_3 var1, rfl_3 var2, Predicate<an_3> var3);

   default boolean class_(an_3 var1, rjC_2 var2) {
      return true;
   }

   default boolean class_(xc_3 var1, rfH_2 var2, rjm_3 var3) {
      rjC_2 var4 = var1.break_(this, var2, var3);
      return var4.break_() || this.class_((an_3)null, var4.class_((double)var2.b_(), (double)var2.c_(), (double)var2.d_()));
   }

   default Stream<rjC_2> break_(an_3 var1, rfl_3 var2, BiPredicate<xc_3, rfH_2> var3) {
      return StreamSupport.stream(new rjt_3(this, var1, var2, var3), false);
   }

   default boolean break_(rfl_3 var1) {
      return this.a_((an_3)null, var1, var0 -> true);
   }

   default boolean break_(an_3 var1, rfl_3 var2) {
      return this.byte_(var1, var2, var0 -> true).allMatch(rjC_2::break_);
   }

   default boolean throws_(an_3 var1) {
      return this.a_(var1, var1.rN(), var0 -> true);
   }

   roE_2 instanceof_();

   default boolean protected_(an_3 var1) {
      return this.class_(var1, rjw_3.class_(var1.rN()));
   }

   default boolean a_(an_3 var1, rfl_3 var2, Predicate<an_3> var3) {
      return this.byte_(var1, var2, var3).allMatch(rjC_2::break_);
   }

   default boolean a_(an_3 var1, rfl_3 var2) {
      return this.a_(var1, var2, var0 -> true);
   }
}
