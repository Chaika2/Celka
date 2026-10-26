package celestial;

import java.util.Optional;

public interface C_final extends C_native {
   rP_2 byte_();

   default Optional<Double> class_(boolean var1) {
      rW_2 var2 = this.throws_();
      if (var2 == null) {
         return Optional.empty();
      } else {
         int var3 = var1 ? var2.break_() : var2.break_() + 1;
         return Optional.of(var2.class_().class_(var3));
      }
   }

   Optional<Double> class_();

   boolean break_();

   rW_2 throws_();

   default boolean finally_() {
      return this.throws_() != null;
   }

   boolean catch_();

   default Optional<Double> extends_() {
      return this.class_(true);
   }

   Optional<? extends i_1> case_();

   rW_2 implements_();

   default Optional<a_1> protected_() {
      return Optional.ofNullable(this.throws_()).map(rW_2::class_);
   }

   void private_();
}
