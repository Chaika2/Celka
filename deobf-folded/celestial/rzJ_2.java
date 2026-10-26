package celestial;

import java.util.function.Function;

final class rzJ_2 extends rzh_3<rzJ_2> {
   private final Function<rQz_1[], rNL> id_class;

   public rzJ_2(Function<rQz_1[], rNL> var1) {
      this.id_class = var1;
   }

   protected rzJ_2 id_throws() {
      return this;
   }

   @Override
   public rNL id_case() {
      return this.id_class.apply(this.id_byte());
   }
}
