package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;

public class rwD_2 extends rwW_2 {
   public rwD_2(Schema var1, boolean var2) {
      super(var1, var2, "BlockEntityShulkerBoxColorFix", rTC.id_extends, "minecraft:shulker_box");
   }

   @Override
   protected Typed<?> id_class(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), var0 -> var0.remove("Color"));
   }
}
