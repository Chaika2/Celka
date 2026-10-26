package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.datafixers.schemas.Schema;

class rTm_1 extends rwW_2 {
   rTm_1(Schema var1, boolean var2, String var3, TypeReference var4, String var5) {
      super(var1, var2, var3, var4, var5);
   }

   @Override
   protected Typed<?> class_(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), rtm_3::class_);
   }
}
