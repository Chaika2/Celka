package celestial;

import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum rYJ implements rpH_2 {
   NONE("none"),
   RAIN("rain"),
   SNOW("snow");

   public static final Codec<rYJ> CODEC = rpH_2.class_(rYJ::values, rYJ::class_);
   private static final Map<String, rYJ> BY_NAME = Arrays.stream(values()).collect(Collectors.toMap(rYJ::break_, var0 -> (rYJ)var0));
   private final String name;

   private rYJ(String var3) {
      this.name = var3;
   }

   public static rYJ class_(String var0) {
      return BY_NAME.get(var0);
   }

   @Override
   public String class_() {
      return this.name;
   }

   public String break_() {
      return this.name;
   }
}
