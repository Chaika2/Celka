package celestial;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class rfA_2 extends rTA {
   public rfA_2(int var1, Schema var2) {
      super(var1, var2);
   }

   public void registerTypes(Schema var1, Map<String, Supplier<TypeTemplate>> var2, Map<String, Supplier<TypeTemplate>> var3) {
      super.registerTypes(var1, var2, var3);
      var1.registerType(
         false,
         rTC.goto_,
         () -> DSL.fields(
               "dimensions",
               DSL.compoundList(
                  DSL.constType(class_()),
                  DSL.fields(
                     "generator",
                     DSL.taggedChoiceLazy(
                        "type",
                        DSL.string(),
                        ImmutableMap.of(
                           "minecraft:debug",
                           DSL::remainder,
                           "minecraft:flat",
                           (Supplier<TypeTemplate>)() -> DSL.optionalFields(
                                 "settings",
                                 DSL.optionalFields("biome", rTC.public_.in(var1), "layers", DSL.list(DSL.optionalFields("block", rTC.new_.in(var1))))
                              ),
                           "minecraft:noise",
                           (Supplier<TypeTemplate>)() -> DSL.optionalFields(
                                 "biome_source",
                                 DSL.taggedChoiceLazy(
                                    "type",
                                    DSL.string(),
                                    ImmutableMap.of(
                                       "minecraft:fixed",
                                       (Supplier<TypeTemplate>)() -> DSL.fields("biome", rTC.public_.in(var1)),
                                       "minecraft:multi_noise",
                                       (Supplier<TypeTemplate>)() -> DSL.list(DSL.fields("biome", rTC.public_.in(var1))),
                                       "minecraft:checkerboard",
                                       (Supplier<TypeTemplate>)() -> DSL.fields("biomes", DSL.list(rTC.public_.in(var1))),
                                       "minecraft:vanilla_layered",
                                       DSL::remainder,
                                       "minecraft:the_end",
                                       DSL::remainder
                                    )
                                 ),
                                 "settings",
                                 DSL.or(DSL.constType(DSL.string()), DSL.optionalFields("default_block", rTC.new_.in(var1), "default_fluid", rTC.new_.in(var1)))
                              )
                        )
                     )
                  )
               )
            )
      );
   }
}
