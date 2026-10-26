package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.List.ListType;
import com.mojang.datafixers.util.Pair;
import java.util.Objects;
import java.util.function.Function;

public class rIz_1 extends rwW_2 {
   public rIz_1(Schema var1, boolean var2) {
      super(var1, var2, "Villager trade fix", rTC.id_int, "minecraft:villager");
   }

   @Override
   protected Typed<?> id_class(Typed<?> var1) {
      OpticFinder var2 = var1.getType().findField("Offers");
      OpticFinder var3 = var2.type().findField("Recipes");
      if (!(var3.type() instanceof ListType var5)) {
         throw new IllegalStateException("Recipes are expected to be a list.");
      } else {
         Type var6 = var5.getElement();
         OpticFinder var7 = DSL.typeFinder(var6);
         OpticFinder var8 = var6.findField("buy");
         OpticFinder var9 = var6.findField("buyB");
         OpticFinder var10 = var6.findField("sell");
         OpticFinder var11 = DSL.fieldFinder("id", DSL.named(rTC.id_continue.typeName(), rTA.id_class()));
         Function var12 = var2x -> this.id_class(var11, var2x);
         return var1.updateTyped(
            var2,
            var6x -> var6x.updateTyped(
                  var3, var5xx -> var5xx.updateTyped(var7, var4xx -> var4xx.updateTyped(var8, var12).updateTyped(var9, var12).updateTyped(var10, var12))
               )
         );
      }
   }

   private Typed<?> id_class(OpticFinder<Pair<String, String>> var1, Typed<?> var2) {
      return var2.update(var1, var0 -> var0.mapSecond(var0x -> Objects.equals(var0x, "minecraft:carved_pumpkin") ? "minecraft:pumpkin" : var0x));
   }
}
