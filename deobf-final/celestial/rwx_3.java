package celestial;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;

public class rwx_3 extends rwW_2 {
   private Dynamic<?> byte_(Dynamic<?> var1) {
      return var1.updateMapValues(this::class_);
   }

   public rwx_3(Schema var1, String var2) {
      super(var1, false, "Memory expiry data fix (" + var2 + ")", rTC.int_, var2);
   }

   @Override
   protected Typed<?> class_(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), this::class_);
   }

   private Pair<Dynamic<?>, Dynamic<?>> class_(Pair<Dynamic<?>, Dynamic<?>> var1) {
      return var1.mapSecond(this::protected_);
   }

   public Dynamic<?> class_(Dynamic<?> var1) {
      return var1.update("Brain", this::break_);
   }

   private Dynamic<?> break_(Dynamic<?> var1) {
      return var1.update("memories", this::byte_);
   }

   private Dynamic<?> protected_(Dynamic<?> var1) {
      return var1.createMap(ImmutableMap.of(var1.createString("value"), var1));
   }
}
