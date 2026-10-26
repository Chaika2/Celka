package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class rIj_1 extends Schema {
   public rIj_1(int var1, Schema var2) {
      super(var1, var2);
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema var1) {
      Map var2 = super.registerEntities(var1);
      var2.remove("EntityHorse");
      var1.register(var2, "Horse", () -> DSL.optionalFields("ArmorItem", rTC.native_.in(var1), "SaddleItem", rTC.native_.in(var1), rIl_1.class_(var1)));
      var1.register(var2, "Donkey", () -> DSL.optionalFields("Items", DSL.list(rTC.native_.in(var1)), "SaddleItem", rTC.native_.in(var1), rIl_1.class_(var1)));
      var1.register(var2, "Mule", () -> DSL.optionalFields("Items", DSL.list(rTC.native_.in(var1)), "SaddleItem", rTC.native_.in(var1), rIl_1.class_(var1)));
      var1.register(var2, "ZombieHorse", () -> DSL.optionalFields("SaddleItem", rTC.native_.in(var1), rIl_1.class_(var1)));
      var1.register(var2, "SkeletonHorse", () -> DSL.optionalFields("SaddleItem", rTC.native_.in(var1), rIl_1.class_(var1)));
      return var2;
   }
}
