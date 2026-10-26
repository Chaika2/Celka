package celestial;

import java.util.function.Predicate;

public enum rjs_3 {
   NONE(var0 -> false),
   SOURCE_ONLY(rXE::id_break),
   ANY(var0 -> !var0.id_byte());

   private final Predicate<rXE> fluidTest;

   private rjs_3(Predicate<rXE> var3) {
      this.fluidTest = var3;
   }

   public boolean id_class(rXE var1) {
      return this.fluidTest.test(var1);
   }
}
