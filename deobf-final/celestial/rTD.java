package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class rTD extends rwW_2 {
   public rTD(Schema var1, boolean var2) {
      super(var1, var2, "BlockEntityKeepPacked", rTC.extends_, "DUMMY");
   }

   private static Dynamic<?> class_(Dynamic<?> var0) {
      return var0.set("keepPacked", var0.createBoolean(true));
   }

   @Override
   protected Typed<?> class_(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), rTD::class_);
   }
}
