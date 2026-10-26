package celestial;

import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum rip_3 implements rpH_2 {
   WARM("warm"),
   COLD("cold");

   public static final Codec<rip_3> field_236998_c_ = rpH_2.class_(rip_3::values, rip_3::class_);
   private static final Map<String, rip_3> BY_NAME = Arrays.stream(values()).collect(Collectors.toMap(rip_3::break_, var0 -> (rip_3)var0));
   private final String name;

   private rip_3(String var3) {
      this.name = var3;
   }

   public static rip_3 class_(String var0) {
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
