package celestial;

import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum rYQ implements rpH_2 {
   NONE("none"),
   DARK_FOREST("dark_forest"),
   SWAMP("swamp");

   private final String name;
   public static final Codec<rYQ> CODEC = rpH_2.class_(rYQ::values, rYQ::class_);
   private static final Map<String, rYQ> NAME_TO_MODIFIER_MAP = Arrays.stream(values()).collect(Collectors.toMap(rYQ::break_, var0 -> (rYQ)var0));

   rYQ(String var3) {
      this.name = var3;
   }

   @Override
   public String class_() {
      return this.name;
   }

   public static rYQ class_(String var0) {
      return NAME_TO_MODIFIER_MAP.get(var0);
   }

   public abstract int class_(double var1, double var3, int var5);

   public String break_() {
      return this.name;
   }
}
