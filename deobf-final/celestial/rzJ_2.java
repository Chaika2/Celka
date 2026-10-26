package celestial;

import java.util.function.Function;

final class rzJ_2 extends rzh_3<rzJ_2> {
   private final Function<rQz_1[], rNL> class_;

   public rzJ_2(Function<rQz_1[], rNL> var1) {
      this.class_ = var1;
   }

   protected rzJ_2 throws_() {
      return this;
   }

   @Override
   public rNL case_() {
      return this.class_.apply(this.byte_());
   }
}
