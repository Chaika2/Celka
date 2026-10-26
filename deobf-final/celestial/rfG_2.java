package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class rfG_2 extends rTA {
   public rfG_2(int var1, Schema var2) {
      super(var1, var2);
   }

   protected static void class_(Schema var0, Map<String, Supplier<TypeTemplate>> var1, String var2) {
      var0.register(var1, var2, () -> rIl_1.class_(var0));
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema var1) {
      Map var2 = super.registerEntities(var1);
      class_(var1, var2, "minecraft:turtle");
      class_(var1, var2, "minecraft:cod_mob");
      class_(var1, var2, "minecraft:tropical_fish");
      class_(var1, var2, "minecraft:salmon_mob");
      class_(var1, var2, "minecraft:puffer_fish");
      class_(var1, var2, "minecraft:phantom");
      class_(var1, var2, "minecraft:dolphin");
      class_(var1, var2, "minecraft:drowned");
      var1.register(var2, "minecraft:trident", var1x -> DSL.optionalFields("inBlockState", rTC.volatile_.in(var1)));
      return var2;
   }
}
