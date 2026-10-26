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

   private <T> Dynamic<T> class_(Dynamic<T> var1) {
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
               boolean var5 = class_(var1x) || class_(var2x);
               boolean var6 = class_(var3) || class_(var4);
               String var7 = !class_(var1x) && !var6 ? "side" : var1x;
               String var8 = !class_(var2x) && !var6 ? "side" : var2x;
               String var9 = !class_(var3) && !var5 ? "side" : var3;
               String var10 = !class_(var4) && !var5 ? "side" : var4;
               return var0.update("east", var1xx -> var1xx.createString(var7))
                  .update("west", var1xx -> var1xx.createString(var8))
                  .update("north", var1xx -> var1xx.createString(var9))
                  .update("south", var1xx -> var1xx.createString(var10));
            }
         );
   }

   private static boolean class_(String var0) {
      return !"none".equals(var0);
   }

   protected TypeRewriteRule makeRule() {
      Schema var1 = this.getInputSchema();
      return this.fixTypeEverywhereTyped("RedstoneConnectionsFix", var1.getType(rTC.volatile_), var1x -> var1x.update(DSL.remainderFinder(), this::class_));
   }
}
