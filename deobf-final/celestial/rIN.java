package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class rIN extends rwW_2 {
   public rIN(Schema var1, boolean var2) {
      super(var1, var2, "EntityWolfColorFix", rTC.int_, "minecraft:wolf");
   }

   @Override
   protected Typed<?> class_(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), this::class_);
   }

   public Dynamic<?> class_(Dynamic<?> var1) {
      return var1.update("CollarColor", var0 -> var0.createByte((byte)(15 - var0.asInt(0))));
   }
}
