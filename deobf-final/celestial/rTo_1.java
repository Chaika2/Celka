package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.List.ListType;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.stream.LongStream;

public class rTo_1 extends DataFix {
   public rTo_1(Schema var1) {
      super(var1, false);
   }

   private Typed<?> class_(Typed<?> var1) {
      return var1.update(
         DSL.remainderFinder(),
         var0 -> var0.update("Heightmaps", var1x -> var1x.updateMapValues(var1xx -> var1xx.mapSecond(var1xxx -> class_(var0, var1xxx, 256, 9))))
      );
   }

   private static Typed<?> class_(OpticFinder<?> var0, OpticFinder<?> var1, OpticFinder<List<Pair<String, Dynamic<?>>>> var2, Typed<?> var3) {
      return var3.updateTyped(
         var0,
         var2x -> var2x.updateTyped(
               var1,
               var1xx -> {
                  int var2xx = var1xx.getOptional(var2).map(var0xxx -> Math.max(4, DataFixUtils.ceillog2(var0xxx.size()))).orElse(0);
                  return var2xx != 0 && !rfU_2.protected_(var2xx)
                     ? var1xx.update(DSL.remainderFinder(), var1xxx -> var1xxx.update("BlockStates", var2xxx -> class_(var1xxx, var2xxx, 4096, var2xx)))
                     : var1xx;
               }
            )
      );
   }

   private static Dynamic<?> class_(Dynamic<?> var0, Dynamic<?> var1, int var2, int var3) {
      long[] var4 = var1.asLongStream().toArray();
      long[] var5 = class_(var2, var3, var4);
      return var0.createLongList(LongStream.of(var5));
   }

   public static long[] class_(int var0, int var1, long[] var2) {
      int var3 = var2.length;
      if (var3 == 0) {
         return var2;
      } else {
         long var4 = (1L << var1) - 1L;
         int var6 = 64 / var1;
         int var7 = (var0 + var6 - 1) / var6;
         long[] var8 = new long[var7];
         int var9 = 0;
         int var10 = 0;
         long var11 = 0L;
         int var13 = 0;
         long var14 = var2[0];
         long var16 = var3 > 1 ? var2[1] : 0L;

         for (int var18 = 0; var18 < var0; var18++) {
            int var19 = var18 * var1;
            int var20 = var19 >> 6;
            int var21 = (var18 + 1) * var1 - 1 >> 6;
            int var22 = var19 ^ var20 << 6;
            if (var20 != var13) {
               var14 = var16;
               var16 = var20 + 1 < var3 ? var2[var20 + 1] : 0L;
               var13 = var20;
            }

            long var23;
            if (var20 == var21) {
               var23 = var14 >>> var22 & var4;
            } else {
               int var25 = 64 - var22;
               var23 = (var14 >>> var22 | var16 << var25) & var4;
            }

            int var26 = var10 + var1;
            if (var26 >= 64) {
               var8[var9++] = var11;
               var11 = var23;
               var10 = var1;
            } else {
               var11 |= var23 << var10;
               var10 = var26;
            }
         }

         if (var11 != 0L) {
            var8[var9] = var11;
         }

         return var8;
      }
   }

   protected TypeRewriteRule makeRule() {
      Type var1 = this.getInputSchema().getType(rTC.byte_);
      Type var2 = var1.findFieldType("Level");
      OpticFinder var3 = DSL.fieldFinder("Level", var2);
      OpticFinder var4 = var3.type().findField("Sections");
      Type var5 = ((ListType)var4.type()).getElement();
      OpticFinder var6 = DSL.typeFinder(var5);
      Type var7 = DSL.named(rTC.volatile_.typeName(), DSL.remainderType());
      OpticFinder var8 = DSL.fieldFinder("Palette", DSL.list(var7));
      return this.fixTypeEverywhereTyped(
         "BitStorageAlignFix",
         var1,
         this.getOutputSchema().getType(rTC.byte_),
         var5x -> var5x.updateTyped(var3, var4xx -> this.class_(class_(var4, var6, var8, var4xx)))
      );
   }
}
