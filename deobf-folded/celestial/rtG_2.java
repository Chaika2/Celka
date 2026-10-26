package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class rtG_2 extends rwW_2 {
   public rtG_2(Schema var1, boolean var2) {
      super(var1, var2, "CatTypeFix", rTC.id_int, "minecraft:cat");
   }

   public Dynamic<?> id_class(Dynamic<?> var1) {
      return var1.get("CatType").asInt(0) == 9 ? var1.set("CatType", var1.createInt(10)) : var1;
   }

   @Override
   protected Typed<?> id_class(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), this::id_class);
   }
}
