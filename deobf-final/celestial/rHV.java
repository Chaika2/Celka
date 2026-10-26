package celestial;

import java.util.Arrays;
import java.util.Optional;

public enum rHV implements rpH_2 {
   ROLLABLE("rollable"),
   ALIGNED("aligned");

   private final String field_235672_c_;

   private rHV(String var3) {
      this.field_235672_c_ = var3;
   }

   public static Optional<rHV> class_(String var0) {
      return Arrays.stream(values()).filter(var1 -> var1.class_().equals(var0)).findFirst();
   }

   @Override
   public String class_() {
      return this.field_235672_c_;
   }
}
