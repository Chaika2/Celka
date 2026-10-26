package celestial;

import java.util.function.Consumer;

enum rra_3 {
   ORDERED(var0 -> {
   }),
   SHUFFLED(rTB::class_);

   private final Consumer<rTB<?>> field_220629_c;

   private rra_3(Consumer<rTB<?>> var3) {
      this.field_220629_c = var3;
   }

   public void class_(rTB<?> var1) {
      this.field_220629_c.accept(var1);
   }
}
