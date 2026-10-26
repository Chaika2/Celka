package celestial;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.schemas.Schema;
import java.util.Map;

public class rtC_2 extends rIx_1 {
   public static final Map<String, String> class_ = ImmutableMap.builder()
      .put("minecraft:salmon_mob", "minecraft:salmon")
      .put("minecraft:cod_mob", "minecraft:cod")
      .build();
   public static final Map<String, String> break_ = ImmutableMap.builder()
      .put("minecraft:salmon_mob_spawn_egg", "minecraft:salmon_spawn_egg")
      .put("minecraft:cod_mob_spawn_egg", "minecraft:cod_spawn_egg")
      .build();

   public rtC_2(Schema var1, boolean var2) {
      super("EntityCodSalmonFix", var1, var2);
   }

   @Override
   protected String class_(String var1) {
      return class_.getOrDefault(var1, var1);
   }
}
