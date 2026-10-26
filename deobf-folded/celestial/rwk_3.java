package celestial;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.FieldFinder;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.CompoundList.CompoundListType;
import com.mojang.datafixers.types.templates.TaggedChoice.TaggedChoiceType;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Dynamic;
import java.util.List;

public class rwk_3 extends DataFix {
   public rwk_3(Schema var1, boolean var2) {
      super(var1, var2);
   }

   private <T> Dynamic<T> id_class(Dynamic<T> var1) {
      long var2 = var1.get("seed").asLong(0L);
      return new Dynamic(var1.getOps(), rIc_1.id_class(var1, var2, rIc_1.id_class(var1, var2), false));
   }

   private static <A> Type<Pair<A, Dynamic<?>>> id_class(String var0, Type<A> var1) {
      return DSL.and(DSL.field(var0, var1), DSL.remainderType());
   }

   private static <A1, A2> Type<Pair<Either<A1, Unit>, Pair<Either<A2, Unit>, Dynamic<?>>>> id_class(String var0, Type<A1> var1, String var2, Type<A2> var3) {
      return DSL.and(DSL.optional(DSL.field(var0, var1)), DSL.optional(DSL.field(var2, var3)), DSL.remainderType());
   }

   private static <A> Type<Pair<Either<A, Unit>, Dynamic<?>>> id_break(String var0, Type<A> var1) {
      return DSL.and(DSL.optional(DSL.field(var0, var1)), DSL.remainderType());
   }

   protected TypeRewriteRule makeRule() {
      Schema var1 = this.getInputSchema();
      TaggedChoiceType var2 = new TaggedChoiceType(
         "type",
         DSL.string(),
         ImmutableMap.of(
            "minecraft:debug",
            DSL.remainderType(),
            "minecraft:flat",
            id_break("settings", id_class("biome", var1.getType(rTC.id_public), "layers", DSL.list(id_break("block", var1.getType(rTC.id_new))))),
            "minecraft:noise",
            id_class(
               "biome_source",
               DSL.taggedChoiceType(
                  "type",
                  DSL.string(),
                  ImmutableMap.of(
                     "minecraft:fixed",
                     id_class("biome", var1.getType(rTC.id_public)),
                     "minecraft:multi_noise",
                     DSL.list(id_class("biome", var1.getType(rTC.id_public))),
                     "minecraft:checkerboard",
                     id_class("biomes", DSL.list(var1.getType(rTC.id_public))),
                     "minecraft:vanilla_layered",
                     DSL.remainderType(),
                     "minecraft:the_end",
                     DSL.remainderType()
                  )
               ),
               "settings",
               DSL.or(DSL.string(), id_class("default_block", var1.getType(rTC.id_new), "default_fluid", var1.getType(rTC.id_new)))
            )
         )
      );
      CompoundListType var3 = DSL.compoundList(rTA.id_class(), id_class("generator", var2));
      Type var4 = DSL.and(var3, DSL.remainderType());
      Type var5 = var1.getType(rTC.id_goto);
      FieldFinder var6 = new FieldFinder("dimensions", var4);
      if (!var5.findFieldType("dimensions").equals(var4)) {
         throw new IllegalStateException();
      } else {
         OpticFinder var7 = var3.finder();
         return this.fixTypeEverywhereTyped("MissingDimensionFix", var5, var4x -> var4x.updateTyped(var6, var4xx -> var4xx.updateTyped(var7, var3xxx -> {
                  if (!(var3xxx.getValue() instanceof List)) {
                     throw new IllegalStateException("List exptected");
                  } else if (((List)var3xxx.getValue()).isEmpty()) {
                     Dynamic var4xxx = (Dynamic)var4x.get(DSL.remainderFinder());
                     Dynamic var5x = this.id_class(var4xxx);
                     return (Typed)DataFixUtils.orElse(var3.readTyped(var5x).result().map(Pair::getFirst), var3xxx);
                  } else {
                     return var3xxx;
                  }
               })));
      }
   }
}
