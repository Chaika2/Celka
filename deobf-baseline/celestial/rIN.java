package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class rIN extends rwW_2 {
   public rIN(Schema var1, boolean var2) {
      super(var1, var2, "EntityWolfColorFix", rTC.id_int, "minecraft:wolf");
   }

   @Override
   protected Typed<?> id_class(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), this::id_class);
   }

   public Dynamic<?> id_class(Dynamic<?> var1) {
      return var1.update("CollarColor", var0 -> var0.createByte((byte)(15 - var0.asInt(0))));
   }
}
