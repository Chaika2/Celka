package celestial;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;

public class rwx_3 extends rwW_2 {
   private Dynamic<?> id_byte(Dynamic<?> var1) {
      return var1.updateMapValues(this::id_class);
   }

   public rwx_3(Schema var1, String var2) {
      super(var1, false, "Memory expiry data fix (" + var2 + ")", rTC.id_int, var2);
   }

   @Override
   protected Typed<?> id_class(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), this::id_class);
   }

   private Pair<Dynamic<?>, Dynamic<?>> id_class(Pair<Dynamic<?>, Dynamic<?>> var1) {
      return var1.mapSecond(this::id_protected);
   }

   public Dynamic<?> id_class(Dynamic<?> var1) {
      return var1.update("Brain", this::id_break);
   }

   private Dynamic<?> id_break(Dynamic<?> var1) {
      return var1.update("memories", this::id_byte);
   }

   private Dynamic<?> id_protected(Dynamic<?> var1) {
      return var1.createMap(ImmutableMap.of(var1.createString("value"), var1));
   }
}
