package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Objects;

public class rtR_2 extends rtq_3 {
   public rtR_2(Schema var1, boolean var2) {
      super("EntityHorseSplitFix", var1, var2);
   }

   @Override
   protected Pair<String, Typed<?>> class_(String var1, Typed<?> var2) {
      Dynamic var3 = (Dynamic)var2.get(DSL.remainderFinder());
      if (Objects.equals("EntityHorse", var1)) {
         int var4 = var3.get("Type").asInt(0);

         String var5 = switch (var4) {
            default -> "Horse";
            case 1 -> "Donkey";
            case 2 -> "Mule";
            case 3 -> "ZombieHorse";
            case 4 -> "SkeletonHorse";
         };
         var3.remove("Type");
         Type var6 = (Type)this.getOutputSchema().findChoiceType(rTC.int_).types().get(var5);
         return Pair.of(
            var5,
            (Typed)((Pair)var2.write().flatMap(var6::readTyped).result().orElseThrow(() -> new IllegalStateException("Could not parse the new horse")))
               .getFirst()
         );
      } else {
         return Pair.of(var1, var2);
      }
   }
}
