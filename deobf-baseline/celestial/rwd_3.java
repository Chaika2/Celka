package celestial;

import com.google.common.collect.Lists;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.TaggedChoice.TaggedChoiceType;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.Objects;

public class rwd_3 extends DataFix {
   private static final List<String> id_class = Lists.newArrayList(new String[]{"MinecartRideable", "MinecartChest", "MinecartFurnace"});

   public rwd_3(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      TaggedChoiceType var1 = this.getInputSchema().findChoiceType(rTC.id_int);
      TaggedChoiceType var2 = this.getOutputSchema().findChoiceType(rTC.id_int);
      return this.fixTypeEverywhere(
         "EntityMinecartIdentifiersFix",
         var1,
         var2,
         var2x -> var3 -> {
               if (!Objects.equals(var3.getFirst(), "Minecart")) {
                  return var3;
               } else {
                  Typed var4 = (Typed)var1.point(var2x, "Minecart", var3.getSecond()).orElseThrow(IllegalStateException::new);
                  Dynamic var5 = (Dynamic)var4.getOrCreate(DSL.remainderFinder());
                  int var6 = var5.get("Type").asInt(0);
                  String var7;
                  if (var6 > 0 && var6 < id_class.size()) {
                     var7 = id_class.get(var6);
                  } else {
                     var7 = "MinecartRideable";
                  }

                  return Pair.of(
                     var7,
                     (DataResult)var4.write()
                        .map(var2xxx -> ((Type)var2.types().get(var7)).read(var2xxx))
                        .result()
                        .orElseThrow(() -> new IllegalStateException("Could not read the new minecart."))
                  );
               }
            }
      );
   }
}
