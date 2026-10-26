package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class rId_1 extends rwW_2 {
   public rId_1(Schema var1) {
      super(var1, false, "Villager Follow Range Fix", rTC.id_int, "minecraft:villager");
   }

   private static Dynamic<?> id_class(Dynamic<?> var0) {
      return var0.update(
         "Attributes",
         var1 -> var0.createList(
               var1.asStream()
                  .map(
                     var0xx -> var0xx.get("Name").asString("").equals("generic.follow_range") && var0xx.get("Base").asDouble(0.0) == 16.0
                           ? var0xx.set("Base", var0xx.createDouble(48.0))
                           : var0xx
                  )
            )
      );
   }

   @Override
   protected Typed<?> id_class(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), rId_1::id_class);
   }
}
