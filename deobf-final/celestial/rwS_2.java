package celestial;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Map;
import java.util.Optional;

public class rwS_2 extends DataFix {
   private static final Map<String, String> class_ = ImmutableMap.builder()
      .put("down", "down_south")
      .put("up", "up_north")
      .put("north", "north_up")
      .put("south", "south_up")
      .put("west", "west_up")
      .put("east", "east_up")
      .build();

   public rwS_2(Schema var1, boolean var2) {
      super(var1, var2);
   }

   private static Dynamic<?> class_(Dynamic<?> var0) {
      Optional var1 = var0.get("Name").asString().result();
      return var1.equals(Optional.of("minecraft:jigsaw")) ? var0.update("Properties", var0x -> {
         String var1x = var0x.get("facing").asString("north");
         return var0x.remove("facing").set("orientation", var0x.createString(class_.getOrDefault(var1x, var1x)));
      }) : var0;
   }

   protected TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "jigsaw_rotation_fix", this.getInputSchema().getType(rTC.volatile_), var0 -> var0.update(DSL.remainderFinder(), rwS_2::class_)
      );
   }
}
