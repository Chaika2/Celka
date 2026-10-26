package celestial;

import java.util.function.Predicate;

public enum rRr_1 {
   HAS_SPACE(rgU_2::id_byte),
   IS_OCCUPIED(rgU_2::id_protected),
   ANY(var0 -> true);

   private final Predicate<? super rgU_2> test;

   private rRr_1(Predicate<? super rgU_2> var3) {
      this.test = var3;
   }

   public Predicate<? super rgU_2> id_class() {
      return this.test;
   }
}
