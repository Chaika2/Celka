package celestial;

import java.util.Optional;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public interface Ps_1 {
   rjG_2 byte_();

   default boolean class_(rfH_2 var1) {
      return this.class_().equals(Optional.of(var1));
   }

   @Deprecated
   static double class_(boolean var0) {
      return var0 ? 1.27 : 1.62;
   }

   default Optional<rfH_2> class_() {
      rjG_2 var1 = this.byte_();
      return var1 != null && var1.byte_() == rjM_2.BLOCK ? Optional.of(((rff_3)var1).class_()) : Optional.empty();
   }

   default rjU_2 break_() {
      return new rjU_2(this.catch_().Ps().break_, this.catch_().Ps().byte_, this.catch_().Ps().protected_);
   }

   QY throws_();

   default rjU_2 finally_() {
      return new rjU_2(this.catch_().Ps().break_, this.catch_().Ps().byte_ + (double)this.catch_().Bx(), this.catch_().Ps().protected_);
   }

   cb_3 catch_();

   default rfH_2 extends_() {
      return new rfH_2(this.catch_().Ps().break_, this.catch_().Ps().byte_ + (double)this.catch_().Bx(), this.catch_().Ps().protected_);
   }

   rYB case_();

   default Stream<an_3> implements_() {
      return StreamSupport.stream(this.final_().spliterator(), false);
   }

   C_return package_();

   default PX protected_() {
      return new PX((Float)this.catch_().throws_[15], (Float)this.catch_().throws_[16]);
   }

   default rjU_2 private_() {
      return new rjU_2(this.catch_().Ps().break_, this.catch_().Ps().byte_ + (double)(this.catch_().Bx() / 2.0F), this.catch_().Ps().protected_);
   }

   default Iterable<an_3> final_() {
      return ((gm_3)this.case_()).byte_();
   }

   default rU_2 volatile_() {
      rU_2 var1 = new rU_2(this.catch_().Ps().break_, this.catch_().Ps().byte_ + 0.1251, this.catch_().Ps().protected_);

      try {
         if (this.case_().byte_(var1).break_() instanceof Wg_1) {
            return var1.class_();
         }
      } catch (NullPointerException var3) {
      }

      return var1;
   }

   PE native_();
}
