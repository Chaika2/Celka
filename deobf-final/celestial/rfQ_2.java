package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class rfQ_2 extends rTA {
   public rfQ_2(int var1, Schema var2) {
      super(var1, var2);
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema var1) {
      Map var2 = super.registerEntities(var1);
      var1.register(
         var2,
         "minecraft:wandering_trader",
         var1x -> DSL.optionalFields(
               "Inventory",
               DSL.list(rTC.native_.in(var1)),
               "Offers",
               DSL.optionalFields(
                  "Recipes", DSL.list(DSL.optionalFields("buy", rTC.native_.in(var1), "buyB", rTC.native_.in(var1), "sell", rTC.native_.in(var1)))
               ),
               rIl_1.class_(var1)
            )
      );
      var1.register(
         var2,
         "minecraft:trader_llama",
         var1x -> DSL.optionalFields(
               "Items", DSL.list(rTC.native_.in(var1)), "SaddleItem", rTC.native_.in(var1), "DecorItem", rTC.native_.in(var1), rIl_1.class_(var1)
            )
      );
      return var2;
   }
}
