package celestial;

import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum rKu_1 implements rpH_2 {
   AIR("air"),
   LIQUID("liquid");

   public static final Codec<rKu_1> field_236074_c_ = rpH_2.class_(rKu_1::values, rKu_1::class_);
   private static final Map<String, rKu_1> BY_NAME = Arrays.stream(values()).collect(Collectors.toMap(rKu_1::break_, var0 -> (rKu_1)var0));
   private final String name;

   private rKu_1(String var3) {
      this.name = var3;
   }

   public static rKu_1 class_(String var0) {
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
