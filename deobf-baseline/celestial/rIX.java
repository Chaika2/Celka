package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.List.ListType;
import com.mojang.datafixers.types.templates.TaggedChoice.TaggedChoiceType;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rIX extends DataFix {
   private static final Logger id_class = LogManager.getLogger();

   public rIX(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      Type var1 = this.getOutputSchema().getType(rTC.id_byte);
      Type var2 = var1.findFieldType("Level");
      if (!(var2.findFieldType("TileEntities") instanceof ListType var4)) {
         throw new IllegalStateException("Tile entity type is not a list type.");
      } else {
         OpticFinder var5 = DSL.fieldFinder("TileEntities", var4);
         Type var6 = this.getInputSchema().getType(rTC.id_byte);
         OpticFinder var7 = var6.findField("Level");
         OpticFinder var8 = var7.type().findField("Sections");
         Type var9 = var8.type();
         if (!(var9 instanceof ListType)) {
            throw new IllegalStateException("Expecting sections to be a list.");
         } else {
            Type var10 = ((ListType)var9).getElement();
            OpticFinder var11 = DSL.typeFinder(var10);
            return TypeRewriteRule.seq(
               new rTT(this.getOutputSchema(), "AddTrappedChestFix", rTC.id_extends).makeRule(),
               this.fixTypeEverywhereTyped(
                  "Trapped Chest fix",
                  var6,
                  var5x -> var5x.updateTyped(
                        var7,
                        var4xx -> {
                           Optional var5xx = var4xx.getOptionalTyped(var8);
                           if (!var5xx.isPresent()) {
                              return var4xx;
                           } else {
                              List var6x = ((Typed)var5xx.get()).getAllTyped(var11);
                              IntOpenHashSet var7x = new IntOpenHashSet();

                              for (Typed var9x : var6x) {
                                 rIJ var10x = new rIJ(var9x, this.getInputSchema());
                                 if (!var10x.id_break()) {
                                    for (int var11x = 0; var11x < 4096; var11x++) {
                                       int var12 = var10x.id_byte(var11x);
                                       if (var10x.id_class(var12)) {
                                          var7x.add(var10x.id_byte() << 12 | var11x);
                                       }
                                    }
                                 }
                              }

                              Dynamic var13 = (Dynamic)var4xx.get(DSL.remainderFinder());
                              int var14 = var13.get("xPos").asInt(0);
                              int var15 = var13.get("zPos").asInt(0);
                              TaggedChoiceType var16 = this.getInputSchema().findChoiceType(rTC.id_extends);
                              return var4xx.updateTyped(
                                 var5,
                                 var4xxx -> var4xxx.updateTyped(
                                       var16.finder(),
                                       var4xxxx -> {
                                          Dynamic var5xxx = (Dynamic)var4xxxx.getOrCreate(DSL.remainderFinder());
                                          int var6xx = var5xxx.get("x").asInt(0) - (var14 << 4);
                                          int var7xx = var5xxx.get("y").asInt(0);
                                          int var8x = var5xxx.get("z").asInt(0) - (var15 << 4);
                                          return var7x.contains(rwb_3.id_class(var6xx, var7xx, var8x))
                                             ? var4xxxx.update(var16.finder(), var0xx -> var0xx.mapFirst(var0xxx -> {
                                                   if (!Objects.equals(var0xxx, "minecraft:chest")) {
                                                      id_class.warn("Block Entity was expected to be a chest");
                                                   }

                                                   return "minecraft:trapped_chest";
                                                }))
                                             : var4xxxx;
                                       }
                                    )
                              );
                           }
                        }
                     )
               )
            );
         }
      }
   }
}
