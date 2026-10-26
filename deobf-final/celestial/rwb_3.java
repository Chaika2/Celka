package celestial;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.List.ListType;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntIterator;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;

public class rwb_3 extends DataFix {
   private static final int[][] class_ = new int[][]{{-1, 0, 0}, {1, 0, 0}, {0, -1, 0}, {0, 1, 0}, {0, 0, -1}, {0, 0, 1}};
   static final Object2IntMap<String> break_ = (Object2IntMap<String>)DataFixUtils.make(new Object2IntOpenHashMap(), var0 -> {
      var0.put("minecraft:acacia_leaves", 0);
      var0.put("minecraft:birch_leaves", 1);
      var0.put("minecraft:dark_oak_leaves", 2);
      var0.put("minecraft:jungle_leaves", 3);
      var0.put("minecraft:oak_leaves", 4);
      var0.put("minecraft:spruce_leaves", 5);
   });
   static final Set<String> byte_ = ImmutableSet.of(
      "minecraft:acacia_bark",
      "minecraft:birch_bark",
      "minecraft:dark_oak_bark",
      "minecraft:jungle_bark",
      "minecraft:oak_bark",
      "minecraft:spruce_bark",
      new String[]{
         "minecraft:acacia_log",
         "minecraft:birch_log",
         "minecraft:dark_oak_log",
         "minecraft:jungle_log",
         "minecraft:oak_log",
         "minecraft:spruce_log",
         "minecraft:stripped_acacia_log",
         "minecraft:stripped_birch_log",
         "minecraft:stripped_dark_oak_log",
         "minecraft:stripped_jungle_log",
         "minecraft:stripped_oak_log",
         "minecraft:stripped_spruce_log"
      }
   );

   private int byte_(int var1) {
      return var1 >> 4 & 15;
   }

   public rwb_3(Schema var1, boolean var2) {
      super(var1, var2);
   }

   private int class_(int var1) {
      return var1 & 15;
   }

   public static int class_(boolean var0, boolean var1, boolean var2, boolean var3) {
      short var4 = 0;
      if (var2) {
         if (var1) {
            var4 |= 2;
         } else if (var0) {
            var4 |= 128;
         } else {
            var4 |= 1;
         }
      } else if (var3) {
         if (var0) {
            var4 |= 32;
         } else if (var1) {
            var4 |= 8;
         } else {
            var4 |= 16;
         }
      } else if (var1) {
         var4 |= 4;
      } else if (var0) {
         var4 |= 64;
      }

      return var4;
   }

   public static int class_(int var0, int var1, int var2) {
      return var1 << 8 | var2 << 4 | var0;
   }

   private int break_(int var1) {
      return var1 >> 8 & 0xFF;
   }

   protected TypeRewriteRule makeRule() {
      Type var1 = this.getInputSchema().getType(rTC.byte_);
      OpticFinder var2 = var1.findField("Level");
      OpticFinder var3 = var2.type().findField("Sections");
      Type var4 = var3.type();
      if (!(var4 instanceof ListType)) {
         throw new IllegalStateException("Expecting sections to be a list.");
      } else {
         Type var5 = ((ListType)var4).getElement();
         OpticFinder var6 = DSL.typeFinder(var5);
         return this.fixTypeEverywhereTyped(
            "Leaves fix",
            var1,
            var4x -> var4x.updateTyped(
                  var2,
                  var3xx -> {
                     int[] var4xx = new int[]{0};
                     Typed var5x = var3xx.updateTyped(
                        var3,
                        var3xxx -> {
                           Int2ObjectOpenHashMap var4xxx = new Int2ObjectOpenHashMap(
                              var3xxx.getAllTyped(var6)
                                 .stream()
                                 .map(var1xxxx -> new rwM_2((Typed<?>)var1xxxx, this.getInputSchema()))
                                 .collect(Collectors.toMap(rwO_2::byte_, var0 -> (rwM_2)var0))
                           );
                           if (var4xxx.values().stream().allMatch(rwO_2::break_)) {
                              return var3xxx;
                           } else {
                              ArrayList var5xx = Lists.newArrayList();

                              for (int var6x = 0; var6x < 7; var6x++) {
                                 var5xx.add(new IntOpenHashSet());
                              }

                              ObjectIterator var25 = var4xxx.values().iterator();

                              while (var25.hasNext()) {
                                 rwM_2 var7 = (rwM_2)var25.next();
                                 if (!var7.break_()) {
                                    for (int var8 = 0; var8 < 4096; var8++) {
                                       int var9 = var7.byte_(var8);
                                       if (var7.class_(var9)) {
                                          ((IntSet)var5xx.get(0)).add(var7.byte_() << 12 | var8);
                                       } else if (var7.break_(var9)) {
                                          int var10 = this.class_(var8);
                                          int var11 = this.byte_(var8);
                                          var4xx[0] |= class_(var10 == 0, var10 == 15, var11 == 0, var11 == 15);
                                       }
                                    }
                                 }
                              }

                              for (int var26 = 1; var26 < 7; var26++) {
                                 IntSet var27 = (IntSet)var5xx.get(var26 - 1);
                                 IntSet var28 = (IntSet)var5xx.get(var26);
                                 IntIterator var29 = var27.iterator();

                                 while (var29.hasNext()) {
                                    int var30 = var29.nextInt();
                                    int var31 = this.class_(var30);
                                    int var12 = this.break_(var30);
                                    int var13 = this.byte_(var30);

                                    for (int[] var17 : class_) {
                                       int var18 = var31 + var17[0];
                                       int var19 = var12 + var17[1];
                                       int var20 = var13 + var17[2];
                                       if (var18 >= 0 && var18 <= 15 && var20 >= 0 && var20 <= 15 && var19 >= 0 && var19 <= 255) {
                                          rwM_2 var21 = (rwM_2)var4xxx.get(var19 >> 4);
                                          if (var21 != null && !var21.break_()) {
                                             int var22 = class_(var18, var19 & 15, var20);
                                             int var23 = var21.byte_(var22);
                                             if (var21.break_(var23)) {
                                                int var24 = var21.protected_(var23);
                                                if (var24 > var26) {
                                                   var21.class_(var22, var23, var26);
                                                   var28.add(class_(var18, var19, var20));
                                                }
                                             }
                                          }
                                       }
                                    }
                                 }
                              }

                              return var3xxx.updateTyped(
                                 var6, var1xxxx -> ((rwM_2)var4xxx.get(((Dynamic)var1xxxx.get(DSL.remainderFinder())).get("Y").asInt(0))).class_(var1xxxx)
                              );
                           }
                        }
                     );
                     if (var4xx[0] != 0) {
                        var5x = var5x.update(DSL.remainderFinder(), var1xxx -> {
                           Dynamic var2xxx = (Dynamic)DataFixUtils.orElse(var1xxx.get("UpgradeData").result(), var1xxx.emptyMap());
                           return var1xxx.set("UpgradeData", var2xxx.set("Sides", var1xxx.createByte((byte)(var2xxx.get("Sides").asByte((byte)0) | var4xx[0]))));
                        });
                     }

                     return var5x;
                  }
               )
         );
      }
   }
}
