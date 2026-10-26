package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class rTK extends rwW_2 {
   public rTK(Schema var1, boolean var2) {
      super(var1, var2, "BlockEntityBannerColorFix", rTC.extends_, "minecraft:banner");
   }

   public Dynamic<?> class_(Dynamic<?> var1) {
      var1 = var1.update("Base", var0 -> var0.createInt(15 - var0.asInt(0)));
      return var1.update(
         "Patterns",
         var0 -> (Dynamic)DataFixUtils.orElse(
               var0.asStreamOpt()
                  .map(var0x -> var0x.map(var0xx -> var0xx.update("Color", var0xxx -> var0xxx.createInt(15 - var0xxx.asInt(0)))))
                  .map(var0::createList)
                  .result(),
               var0
            )
      );
   }

   @Override
   protected Typed<?> class_(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), this::class_);
   }
}
