package celestial;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.schemas.Schema;
import java.util.Map;
import java.util.Objects;

public class rwq_3 extends rIx_1 {
   public static final Map<String, String> class_ = ImmutableMap.builder().put("minecraft:puffer_fish_spawn_egg", "minecraft:pufferfish_spawn_egg").build();

   public rwq_3(Schema var1, boolean var2) {
      super("EntityPufferfishRenameFix", var1, var2);
   }

   @Override
   protected String class_(String var1) {
      return Objects.equals("minecraft:puffer_fish", var1) ? "minecraft:pufferfish" : var1;
   }
}
