package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class rwo_3 extends rwW_2 {
   public rwo_3(Schema var1, boolean var2) {
      super(var1, var2, "EntityShulkerColorFix", rTC.id_int, "minecraft:shulker");
   }

   public Dynamic<?> id_class(Dynamic<?> var1) {
      return !var1.get("Color").map(Dynamic::asNumber).result().isPresent() ? var1.set("Color", var1.createByte((byte)10)) : var1;
   }

   @Override
   protected Typed<?> id_class(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), this::id_class);
   }
}
