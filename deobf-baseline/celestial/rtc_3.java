package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;

public class rtc_3 extends rwW_2 {
   public rtc_3(Schema var1, boolean var2) {
      super(var1, var2, "Colorless shulker entity fix", rTC.id_int, "minecraft:shulker");
   }

   @Override
   protected Typed<?> id_class(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), var0 -> var0.get("Color").asInt(0) == 10 ? var0.set("Color", var0.createByte((byte)16)) : var0);
   }
}
