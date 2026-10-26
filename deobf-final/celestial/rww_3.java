package celestial;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.schemas.Schema;
import java.util.Map;

public class rww_3 extends rwT_2 {
   private static final Map<String, String> class_ = ImmutableMap.builder()
      .put("minecraft:acacia_bark", "minecraft:acacia_wood")
      .put("minecraft:birch_bark", "minecraft:birch_wood")
      .put("minecraft:dark_oak_bark", "minecraft:dark_oak_wood")
      .put("minecraft:jungle_bark", "minecraft:jungle_wood")
      .put("minecraft:oak_bark", "minecraft:oak_wood")
      .put("minecraft:spruce_bark", "minecraft:spruce_wood")
      .build();

   public rww_3(Schema var1, boolean var2) {
      super(var1, var2, "Recipes renamening fix", var0 -> class_.getOrDefault(var0, var0));
   }
}
