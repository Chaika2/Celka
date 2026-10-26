package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class rwB_2 extends rwW_2 {
   public rwB_2(Schema var1, boolean var2) {
      super(var1, var2, "JigsawPropertiesFix", rTC.extends_, "minecraft:jigsaw");
   }

   private static Dynamic<?> class_(Dynamic<?> var0) {
      String var1 = var0.get("attachement_type").asString("minecraft:empty");
      String var2 = var0.get("target_pool").asString("minecraft:empty");
      return var0.set("name", var0.createString(var1))
         .set("target", var0.createString(var1))
         .remove("attachement_type")
         .set("pool", var0.createString(var2))
         .remove("target_pool");
   }

   @Override
   protected Typed<?> class_(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), rwB_2::class_);
   }
}
