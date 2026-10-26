package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class rwI_2 extends DataFix {
   public rwI_2(Schema var1) {
      super(var1, false);
   }

   private <T> Dynamic<T> id_class(Dynamic<T> var1) {
      boolean var2 = var1.get("Name").asString().result().filter("minecraft:redstone_wire"::equals).isPresent();
      return !var2
         ? var1
         : var1.update(
            "Properties",
            var0 -> {
               String var1x = var0.get("east").asString("none");
               String var2x = var0.get("west").asString("none");
               String var3 = var0.get("north").asString("none");
               String var4 = var0.get("south").asString("none");
               boolean var5 = id_class(var1x) || id_class(var2x);
               boolean var6 = id_class(var3) || id_class(var4);
               String var7 = !id_class(var1x) && !var6 ? "side" : var1x;
               String var8 = !id_class(var2x) && !var6 ? "side" : var2x;
               String var9 = !id_class(var3) && !var5 ? "side" : var3;
               String var10 = !id_class(var4) && !var5 ? "side" : var4;
               return var0.update("east", var1xx -> var1xx.createString(var7))
                  .update("west", var1xx -> var1xx.createString(var8))
                  .update("north", var1xx -> var1xx.createString(var9))
                  .update("south", var1xx -> var1xx.createString(var10));
            }
         );
   }

   private static boolean id_class(String var0) {
      return !"none".equals(var0);
   }

   protected TypeRewriteRule makeRule() {
      Schema var1 = this.getInputSchema();
      return this.fixTypeEverywhereTyped("RedstoneConnectionsFix", var1.getType(rTC.id_volatile), var1x -> var1x.update(DSL.remainderFinder(), this::id_class));
   }
}
