package celestial;

import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum rYx_1 implements rpH_2 {
   NONE("none"),
   FROZEN("frozen");

   private final String name;
   public static final Codec<rYx_1> CODEC = rpH_2.class_(rYx_1::values, rYx_1::class_);
   private static final Map<String, rYx_1> NAME_TO_MODIFIER_MAP = Arrays.stream(values()).collect(Collectors.toMap(rYx_1::break_, var0 -> (rYx_1)var0));

   rYx_1(String var3) {
      this.name = var3;
   }

   @Override
   public String class_() {
      return this.name;
   }

   public static rYx_1 class_(String var0) {
      return NAME_TO_MODIFIER_MAP.get(var0);
   }

   public abstract float class_(rfH_2 var1, float var2);

   public String break_() {
      return this.name;
   }
}
