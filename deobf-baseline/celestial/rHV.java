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

   public static Optional<rHV> id_class(String var0) {
      return Arrays.stream(values()).filter(var1 -> var1.id_class().equals(var0)).findFirst();
   }

   @Override
   public String id_class() {
      return this.field_235672_c_;
   }
}
