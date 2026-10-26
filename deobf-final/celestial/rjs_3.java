package celestial;

import java.util.function.Predicate;

public enum rjs_3 {
   NONE(var0 -> false),
   SOURCE_ONLY(rXE::break_),
   ANY(var0 -> !var0.byte_());

   private final Predicate<rXE> fluidTest;

   private rjs_3(Predicate<rXE> var3) {
      this.fluidTest = var3;
   }

   public boolean class_(rXE var1) {
      return this.fluidTest.test(var1);
   }
}
