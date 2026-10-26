package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class rtG_2 extends rwW_2 {
   public rtG_2(Schema var1, boolean var2) {
      super(var1, var2, "CatTypeFix", rTC.int_, "minecraft:cat");
   }

   public Dynamic<?> class_(Dynamic<?> var1) {
      return var1.get("CatType").asInt(0) == 9 ? var1.set("CatType", var1.createInt(10)) : var1;
   }

   @Override
   protected Typed<?> class_(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), this::class_);
   }
}
