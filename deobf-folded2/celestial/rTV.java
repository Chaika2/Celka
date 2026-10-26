package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;

public class rTV extends DataFix {
   public rTV(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      OpticFinder var1 = DSL.fieldFinder("id", DSL.named(rTC.id_continue.typeName(), rTA.id_class()));
      return this.fixTypeEverywhereTyped("BedItemColorFix", this.getInputSchema().getType(rTC.id_native), var1x -> {
         Optional var2 = var1x.getOptional(var1);
         if (var2.isPresent() && Objects.equals(((Pair)var2.get()).getSecond(), "minecraft:bed")) {
            Dynamic var3 = (Dynamic)var1x.get(DSL.remainderFinder());
            if (var3.get("Damage").asInt(0) == 0) {
               return var1x.set(DSL.remainderFinder(), var3.set("Damage", var3.createShort((short)14)));
            }
         }

         return var1x;
      });
   }
}
