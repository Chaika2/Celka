package celestial;

import java.util.Optional;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public interface Ps_1 {
   rjG_2 id_byte();

   default boolean id_class(rfH_2 var1) {
      return this.id_class().equals(Optional.of(var1));
   }

   @Deprecated
   static double id_class(boolean var0) {
      return var0 ? 1.27 : 1.62;
   }

   default Optional<rfH_2> id_class() {
      rjG_2 var1 = this.id_byte();
      return var1 != null && var1.id_byte() == rjM_2.BLOCK ? Optional.of(((rff_3)var1).id_class()) : Optional.empty();
   }

   default rjU_2 id_break() {
      return new rjU_2(this.id_catch().Ps().id_break, this.id_catch().Ps().id_byte, this.id_catch().Ps().id_protected);
   }

   QY id_throws();

   default rjU_2 id_finally() {
      return new rjU_2(this.id_catch().Ps().id_break, this.id_catch().Ps().id_byte + (double)this.id_catch().Bx(), this.id_catch().Ps().id_protected);
   }

   cb_3 id_catch();

   default rfH_2 id_extends() {
      return new rfH_2(this.id_catch().Ps().id_break, this.id_catch().Ps().id_byte + (double)this.id_catch().Bx(), this.id_catch().Ps().id_protected);
   }

   rYB id_case();

   default Stream<an_3> id_implements() {
      return StreamSupport.stream(this.id_final().spliterator(), false);
   }

   C_return id_package();

   default PX id_protected() {
      return new PX((Float)this.id_catch().id_throws[15], (Float)this.id_catch().id_throws[16]);
   }

   default rjU_2 id_private() {
      return new rjU_2(this.id_catch().Ps().id_break, this.id_catch().Ps().id_byte + (double)(this.id_catch().Bx() / 2.0F), this.id_catch().Ps().id_protected);
   }

   default Iterable<an_3> id_final() {
      return ((gm_3)this.id_case()).id_byte();
   }

   default rU_2 id_volatile() {
      rU_2 var1 = new rU_2(this.id_catch().Ps().id_break, this.id_catch().Ps().id_byte + 0.1251, this.id_catch().Ps().id_protected);

      try {
         if (this.id_case().id_byte(var1).id_break() instanceof Wg_1) {
            return var1.id_class();
         }
      } catch (NullPointerException var3) {
      }

      return var1;
   }

   PE id_native();
}
