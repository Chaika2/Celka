package celestial;

import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public enum rpB_2 implements Predicate<rpr_3>, rpH_2 {
   X("x"),
   Y("y"),
   Z("z");

   private static final rpB_2[] VALUES = values();
   public static final Codec<rpB_2> CODEC = rpH_2.class_(rpB_2::values, rpB_2::class_);
   private static final Map<String, rpB_2> NAME_LOOKUP = Arrays.stream(VALUES).collect(Collectors.toMap(rpB_2::break_, var0 -> (rpB_2)var0));
   private final String name;

   public boolean byte_() {
      return this == Y;
   }

   rpB_2(String var3) {
      this.name = var3;
   }

   @Override
   public String toString() {
      return this.name;
   }

   public abstract int class_(int var1, int var2, int var3);

   public boolean class_(rpr_3 var1) {
      return var1 != null && var1.final_() == this;
   }

   public abstract double class_(double var1, double var3, double var5);

   @Override
   public String class_() {
      return this.name;
   }

   public static rpB_2 class_(Random var0) {
      return rqR_2.class_(VALUES, var0);
   }

   public static rpB_2 class_(String var0) {
      return NAME_LOOKUP.get(var0.toLowerCase(Locale.ROOT));
   }

   public String break_() {
      return this.name;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public rpb_3 throws_() {
      switch (this) {
         case X:
         case Z:
            return rpb_3.HORIZONTAL;
         case Y:
            return rpb_3.VERTICAL;
         default:
            throw new Error("Someone's been tampering with the universe!");
      }
   }

   public boolean protected_() {
      return this == X || this == Z;
   }
}
