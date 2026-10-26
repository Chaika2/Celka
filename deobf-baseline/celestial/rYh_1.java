package celestial;

import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum rYh_1 implements rpH_2 {
   NONE("none"),
   TAIGA("taiga"),
   EXTREME_HILLS("extreme_hills"),
   JUNGLE("jungle"),
   MESA("mesa"),
   PLAINS("plains"),
   SAVANNA("savanna"),
   ICY("icy"),
   THEEND("the_end"),
   BEACH("beach"),
   FOREST("forest"),
   OCEAN("ocean"),
   DESERT("desert"),
   RIVER("river"),
   SWAMP("swamp"),
   MUSHROOM("mushroom"),
   NETHER("nether");

   public static final Codec<rYh_1> CODEC = rpH_2.id_class(rYh_1::values, rYh_1::id_class);
   private static final Map<String, rYh_1> BY_NAME = Arrays.stream(values()).collect(Collectors.toMap(rYh_1::id_break, var0 -> (rYh_1)var0));
   private final String name;

   private rYh_1(String var3) {
      this.name = var3;
   }

   public static rYh_1 id_class(String var0) {
      return BY_NAME.get(var0);
   }

   @Override
   public String id_class() {
      return this.name;
   }

   public String id_break() {
      return this.name;
   }
}
