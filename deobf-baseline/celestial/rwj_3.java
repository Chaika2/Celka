package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class rwj_3 extends rwW_2 {
   public rwj_3(Schema var1, boolean var2) {
      super(var1, var2, "Remove Golem Gossip Fix", rTC.id_int, "minecraft:villager");
   }

   private static Dynamic<?> id_class(Dynamic<?> var0) {
      return var0.update("Gossips", var1 -> var0.createList(var1.asStream().filter(var0xx -> !var0xx.get("Type").asString("").equals("golem"))));
   }

   @Override
   protected Typed<?> id_class(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), rwj_3::id_class);
   }
}
