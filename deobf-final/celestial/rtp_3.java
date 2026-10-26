package celestial;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.schemas.Schema;
import java.util.Map;
import java.util.Objects;

public class rtp_3 extends rIx_1 {
   public static final Map<String, String> class_ = ImmutableMap.builder().put("minecraft:illager_beast_spawn_egg", "minecraft:ravager_spawn_egg").build();

   public rtp_3(Schema var1, boolean var2) {
      super("EntityRavagerRenameFix", var1, var2);
   }

   @Override
   protected String class_(String var1) {
      return Objects.equals("minecraft:illager_beast", var1) ? "minecraft:ravager" : var1;
   }
}
