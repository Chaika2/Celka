package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class rty_3 extends rwW_2 {
   public rty_3(Schema var1, boolean var2) {
      super(var1, var2, "EntityItemFrameDirectionFix", rTC.int_, "minecraft:item_frame");
   }

   private static byte class_(byte var0) {
      switch (var0) {
         case 0:
            return 3;
         case 1:
            return 4;
         case 2:
         default:
            return 2;
         case 3:
            return 5;
      }
   }

   @Override
   protected Typed<?> class_(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), this::class_);
   }

   public Dynamic<?> class_(Dynamic<?> var1) {
      return var1.set("Facing", var1.createByte(class_(var1.get("Facing").asByte((byte)0))));
   }
}
