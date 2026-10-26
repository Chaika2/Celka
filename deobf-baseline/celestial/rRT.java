package celestial;

import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public interface rRT extends rRq_1 {
   default Stream<rjC_2> id_byte(an_3 var1, rfl_3 var2, Predicate<an_3> var3) {
      return Stream.concat(this.id_byte(var1, var2), this.id_class(var1, var2, var3));
   }

   rRq_1 id_byte(int var1, int var2);

   default Stream<rjC_2> id_byte(an_3 var1, rfl_3 var2) {
      return StreamSupport.stream(new rjt_3(this, var1, var2), false);
   }

   default boolean id_class(an_3 var1, rfl_3 var2, BiPredicate<xc_3, rfH_2> var3) {
      return this.id_break(var1, var2, var3).allMatch(rjC_2::id_break);
   }

   Stream<rjC_2> id_class(an_3 var1, rfl_3 var2, Predicate<an_3> var3);

   default boolean id_class(an_3 var1, rjC_2 var2) {
      return true;
   }

   default boolean id_class(xc_3 var1, rfH_2 var2, rjm_3 var3) {
      rjC_2 var4 = var1.id_break(this, var2, var3);
      return var4.id_break() || this.id_class((an_3)null, var4.id_class((double)var2.b_(), (double)var2.c_(), (double)var2.d_()));
   }

   default Stream<rjC_2> id_break(an_3 var1, rfl_3 var2, BiPredicate<xc_3, rfH_2> var3) {
      return StreamSupport.stream(new rjt_3(this, var1, var2, var3), false);
   }

   default boolean id_break(rfl_3 var1) {
      return this.a_((an_3)null, var1, var0 -> true);
   }

   default boolean id_break(an_3 var1, rfl_3 var2) {
      return this.id_byte(var1, var2, var0 -> true).allMatch(rjC_2::id_break);
   }

   default boolean id_throws(an_3 var1) {
      return this.a_(var1, var1.rN(), var0 -> true);
   }

   roE_2 id_instanceof();

   default boolean id_protected(an_3 var1) {
      return this.id_class(var1, rjw_3.id_class(var1.rN()));
   }

   default boolean a_(an_3 var1, rfl_3 var2, Predicate<an_3> var3) {
      return this.id_byte(var1, var2, var3).allMatch(rjC_2::id_break);
   }

   default boolean a_(an_3 var1, rfl_3 var2) {
      return this.a_(var1, var2, var0 -> true);
   }
}
