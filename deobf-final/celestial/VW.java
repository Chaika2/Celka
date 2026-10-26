package celestial;

import java.util.Arrays;
import java.util.Comparator;

public enum VW {
   FAST(0, "options.graphics.fast"),
   FANCY(1, "options.graphics.fancy"),
   FABULOUS(2, "options.graphics.fabulous");

   private static final VW[] field_238159_d_ = Arrays.stream(values()).sorted(Comparator.comparingInt(VW::class_)).toArray(VW[]::new);
   private final int field_238160_e_;
   private final String field_238161_f_;

   public VW byte_() {
      return class_(this.class_() + 1);
   }

   private VW(int var3, String var4) {
      this.field_238160_e_ = var3;
      this.field_238161_f_ = var4;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
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

   public int class_() {
      return this.field_238160_e_;
   }

   public static VW class_(int var0) {
      return field_238159_d_[rfU_2.break_(var0, field_238159_d_.length)];
   }

   public String break_() {
      return this.field_238161_f_;
   }
}
