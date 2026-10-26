package celestial;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.schemas.Schema;
import java.util.Map;
import java.util.Objects;

public class rIF extends rIx_1 {
   public static final Map<String, String> id_class = ImmutableMap.builder()
      .put("minecraft:zombie_pigman_spawn_egg", "minecraft:zombified_piglin_spawn_egg")
      .build();

   public rIF(Schema var1) {
      super("EntityZombifiedPiglinRenameFix", var1, true);
   }

   @Override
   protected String id_class(String var1) {
      return Objects.equals("minecraft:zombie_pigman", var1) ? "minecraft:zombified_piglin" : var1;
   }
}
