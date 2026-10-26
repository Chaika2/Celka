package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.shorts.ShortArrayList;
import it.unimi.dsi.fastutil.shorts.ShortList;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class rtb_3 extends DataFix {
   public rtb_3(Schema var1, boolean var2) {
      super(var1, var2);
   }

   private static short class_(int var0, int var1, int var2) {
      return (short)(var0 & 15 | (var1 & 15) << 4 | (var2 & 15) << 8);
   }

   public TypeRewriteRule makeRule() {
      Type var1 = this.getInputSchema().getType(rTC.byte_);
      Type var2 = this.getOutputSchema().getType(rTC.byte_);
      Type var3 = var1.findFieldType("Level");
      Type var4 = var2.findFieldType("Level");
      Type var5 = var3.findFieldType("TileTicks");
      OpticFinder var6 = DSL.fieldFinder("Level", var3);
      OpticFinder var7 = DSL.fieldFinder("TileTicks", var5);
      return TypeRewriteRule.seq(
         this.fixTypeEverywhereTyped(
            "ChunkToProtoChunkFix",
            var1,
            this.getOutputSchema().getType(rTC.byte_),
            var3x -> var3x.updateTyped(
                  var6,
                  var4,
                  var2xx -> {
                     Optional var3xx = var2xx.getOptionalTyped(var7)
                        .flatMap(var0xx -> var0xx.write().result())
                        .flatMap(var0xx -> var0xx.asStreamOpt().result());
                     Dynamic var4x = (Dynamic)var2xx.get(DSL.remainderFinder());
                     boolean var5x = var4x.get("TerrainPopulated").asBoolean(false)
                        && (!var4x.get("LightPopulated").asNumber().result().isPresent() || var4x.get("LightPopulated").asBoolean(false));
                     var4x = var4x.set("Status", var4x.createString(var5x ? "mobs_spawned" : "empty"));
                     var4x = var4x.set("hasLegacyStructureData", var4x.createBoolean(true));
                     Dynamic var6x;
                     if (var5x) {
                        Optional var7x = var4x.get("Biomes").asByteBufferOpt().result();
                        if (var7x.isPresent()) {
                           ByteBuffer var8 = (ByteBuffer)var7x.get();
                           int[] var9 = new int[256];

                           for (int var10 = 0; var10 < var9.length; var10++) {
                              if (var10 < var8.capacity()) {
                                 var9[var10] = var8.get(var10) & 255;
                              }
                           }

                           var4x = var4x.set("Biomes", var4x.createIntList(Arrays.stream(var9)));
                        }

                        Dynamic var13 = var4x;
                        List var14 = IntStream.range(0, 16).mapToObj(var0xx -> new ShortArrayList()).collect(Collectors.toList());
                        if (var3xx.isPresent()) {
                           ((Stream)var3xx.get()).forEach(var1xxx -> {
                              int var2xxx = var1xxx.get("x").asInt(0);
                              int var3xxx = var1xxx.get("y").asInt(0);
                              int var4xx = var1xxx.get("z").asInt(0);
                              short var5xx = class_(var2xxx, var3xxx, var4xx);
                              ((ShortList)var14.get(var3xxx >> 4)).add(var5xx);
                           });
                           var4x = var4x.set(
                              "ToBeTicked", var4x.createList(var14.stream().map(var1xxx -> var13.createList(var1xxx.stream().map(var13::createShort))))
                           );
                        }

                        var6x = (Dynamic)DataFixUtils.orElse(var2xx.set(DSL.remainderFinder(), var4x).write().result(), var4x);
                     } else {
                        var6x = var4x;
                     }

                     return (Typed)((Pair)var4.readTyped(var6x).result().orElseThrow(() -> new IllegalStateException("Could not read the new chunk")))
                        .getFirst();
                  }
               )
         ),
         this.writeAndRead("Structure biome inject", this.getInputSchema().getType(rTC.this_), this.getOutputSchema().getType(rTC.this_))
      );
   }
}
