package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Codec;
import com.mojang.serialization.OptionalDynamic;
import java.util.List;

public class rwf_3 extends DataFix {
   private static final Codec<List<Float>> id_class = Codec.FLOAT.listOf();

   public rwf_3(Schema var1, boolean var2) {
      super(var1, var2);
   }

   private static boolean id_class(OptionalDynamic<?> var0, int var1) {
      return var0.flatMap(id_class::parse).map(var1x -> var1x.size() == var1 && var1x.stream().allMatch(var0xx -> var0xx == 0.0F)).result().orElse(false);
   }

   public TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "EntityRedundantChanceTagsFix", this.getInputSchema().getType(rTC.id_int), var0 -> var0.update(DSL.remainderFinder(), var0x -> {
               if (id_class(var0x.get("HandDropChances"), 2)) {
                  var0x = var0x.remove("HandDropChances");
               }

               if (id_class(var0x.get("ArmorDropChances"), 4)) {
                  var0x = var0x.remove("ArmorDropChances");
               }

               return var0x;
            })
      );
   }
}
