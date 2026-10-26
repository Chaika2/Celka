package celestial;

import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum riV_2 implements rpH_2 {
   STANDARD("standard"),
   DESERT("desert"),
   JUNGLE("jungle"),
   SWAMP("swamp"),
   MOUNTAIN("mountain"),
   OCEAN("ocean"),
   NETHER("nether");

   public static final Codec<riV_2> field_236342_h_ = rpH_2.class_(riV_2::values, riV_2::class_);
   private static final Map<String, riV_2> field_236343_i_ = Arrays.stream(values()).collect(Collectors.toMap(riV_2::break_, var0 -> (riV_2)var0));
   private final String field_236344_j_;

   private riV_2(String var3) {
      this.field_236344_j_ = var3;
   }

   public static riV_2 class_(String var0) {
      return field_236343_i_.get(var0);
   }

   @Override
   public String class_() {
      return this.field_236344_j_;
   }

   public String break_() {
      return this.field_236344_j_;
   }
}
