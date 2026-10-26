package celestial;

import java.util.Arrays;
import java.util.Comparator;

public enum VW {
   FAST(0, "options.graphics.fast"),
   FANCY(1, "options.graphics.fancy"),
   FABULOUS(2, "options.graphics.fabulous");

   private static final VW[] field_238159_d_ = Arrays.stream(values()).sorted(Comparator.comparingInt(VW::id_class)).toArray(VW[]::new);
   private final int field_238160_e_;
   private final String field_238161_f_;

   public VW id_byte() {
      return id_class(this.id_class() + 1);
   }

   private VW(int var3, String var4) {
      this.field_238160_e_ = var3;
      this.field_238161_f_ = var4;
   }

   @Override
   public String toString() {
      switch (this) {
         case FAST:
            return "fast";
         case FANCY:
            return "fancy";
         case FABULOUS:
            return "fabulous";
         default:
            throw new IllegalArgumentException();
      }
   }

   public int id_class() {
      return this.field_238160_e_;
   }

   public static VW id_class(int var0) {
      return field_238159_d_[rfU_2.id_break(var0, field_238159_d_.length)];
   }

   public String id_break() {
      return this.field_238161_f_;
   }
}
