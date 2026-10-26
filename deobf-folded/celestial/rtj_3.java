package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class rtj_3 extends rwW_2 {
   public rtj_3(Schema var1, String var2) {
      super(var1, false, "Gossip for for " + var2, rTC.id_int, var2);
   }

   @Override
   protected Typed<?> id_class(Typed<?> var1) {
      return var1.update(
         DSL.remainderFinder(),
         var0 -> var0.update(
               "Gossips",
               var0x -> (Dynamic)DataFixUtils.orElse(
                     var0x.asStreamOpt()
                        .result()
                        .map(var0xx -> var0xx.map(var0xxx -> (Dynamic)rTp_1.id_byte((Dynamic<?>)var0xxx, "Target", "Target").orElse((Dynamic<?>)var0xxx)))
                        .map(var0x::createList),
                     var0x
                  )
            )
      );
   }
}
