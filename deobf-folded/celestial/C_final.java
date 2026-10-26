package celestial;

import java.util.Optional;

public interface C_final extends C_native {
   rP_2 id_byte();

   default Optional<Double> id_class(boolean var1) {
      rW_2 var2 = this.id_throws();
      if (var2 == null) {
         return Optional.empty();
      } else {
         int var3 = var1 ? var2.id_break() : var2.id_break() + 1;
         return Optional.of(var2.id_class().id_class(var3));
      }
   }

   Optional<Double> id_class();

   boolean id_break();

   rW_2 id_throws();

   default boolean id_finally() {
      return this.id_throws() != null;
   }

   boolean id_catch();

   default Optional<Double> id_extends() {
      return this.id_class(true);
   }

   Optional<? extends i_1> id_case();

   rW_2 id_implements();

   default Optional<a_1> id_protected() {
      return Optional.ofNullable(this.id_throws()).map(rW_2::id_class);
   }

   void id_private();
}
