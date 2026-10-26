package celestial;

import com.google.common.collect.Lists;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntListIterator;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map.Entry;

final class rtW_2 {
   private int id_class;
   private final rtk_3[] id_break = new rtk_3[16];
   private final Dynamic<?> id_byte;
   private final int id_protected;
   private final int id_throws;
   private final Int2ObjectMap<Dynamic<?>> id_case = new Int2ObjectLinkedOpenHashMap(16);

   private Dynamic<?> id_byte(int var1) {
      return (Dynamic<?>)this.id_case.remove(var1);
   }

   public rtW_2(Dynamic<?> var1) {
      this.id_byte = var1;
      this.id_protected = var1.get("xPos").asInt(0) << 4;
      this.id_throws = var1.get("zPos").asInt(0) << 4;
      var1.get("TileEntities")
         .asStreamOpt()
         .result()
         .ifPresent(
            var1x -> var1x.forEach(
                  var1xx -> {
                     int var2x = var1xx.get("x").asInt(0) - this.id_protected & 15;
                     int var3 = var1xx.get("y").asInt(0);
                     int var4 = var1xx.get("z").asInt(0) - this.id_throws & 15;
                     int var5 = var3 << 8 | var4 << 4 | var2x;
                     if (this.id_case.put(var5, var1xx) != null) {
                        rtO_2.id_class
                           .warn(
                              "In chunk: {}x{} found a duplicate block entity at position: [{}, {}, {}]", this.id_protected, this.id_throws, var2x, var3, var4
                           );
                     }
                  }
               )
         );
      boolean var2 = var1.get("convertedFromAlphaFormat").asBoolean(false);
      var1.get("Sections").asStreamOpt().result().ifPresent(var1x -> var1x.forEach(var1xx -> {
            rtk_3 var2x = new rtk_3((Dynamic<?>)var1xx);
            this.id_class = var2x.id_break(this.id_class);
            this.id_break[var2x.id_class] = var2x;
         }));

      for (rtk_3 var6 : this.id_break) {
         if (var6 != null) {
            ObjectIterator var7 = var6.id_case.entrySet().iterator();

            while (var7.hasNext()) {
               Entry var8 = (Entry)var7.next();
               int var9 = var6.id_class << 12;
               switch (var8.getKey()) {
                  case 2:
                     IntListIterator var30 = ((IntList)var8.getValue()).iterator();

                     while (var30.hasNext()) {
                        int var50 = (Integer)var30.next();
                        var50 |= var9;
                        Dynamic var61 = this.id_class(var50);
                        if ("minecraft:grass_block".equals(rtO_2.id_class(var61))) {
                           String var71 = rtO_2.id_class(this.id_class(id_class(var50, rtX_2.UP)));
                           if ("minecraft:snow".equals(var71) || "minecraft:snow_layer".equals(var71)) {
                              this.id_class(var50, rtO_2.id_case);
                           }
                        }
                     }
                     break;
                  case 3:
                     IntListIterator var29 = ((IntList)var8.getValue()).iterator();

                     while (var29.hasNext()) {
                        int var48 = (Integer)var29.next();
                        var48 |= var9;
                        Dynamic var60 = this.id_class(var48);
                        if ("minecraft:podzol".equals(rtO_2.id_class(var60))) {
                           String var70 = rtO_2.id_class(this.id_class(id_class(var48, rtX_2.UP)));
                           if ("minecraft:snow".equals(var70) || "minecraft:snow_layer".equals(var70)) {
                              this.id_class(var48, rtO_2.id_throws);
                           }
                        }
                     }
                     break;
                  case 25:
                     IntListIterator var28 = ((IntList)var8.getValue()).iterator();

                     while (var28.hasNext()) {
                        int var46 = (Integer)var28.next();
                        var46 |= var9;
                        Dynamic var59 = this.id_byte(var46);
                        if (var59 != null) {
                           String var69 = Boolean.toString(var59.get("powered").asBoolean(false)) + (byte)Math.min(Math.max(var59.get("note").asInt(0), 0), 24);
                           this.id_class(var46, rtO_2.id_new.getOrDefault(var69, rtO_2.id_new.get("false0")));
                        }
                     }
                     break;
                  case 26:
                     IntListIterator var27 = ((IntList)var8.getValue()).iterator();

                     while (var27.hasNext()) {
                        int var44 = (Integer)var27.next();
                        var44 |= var9;
                        Dynamic var58 = this.id_break(var44);
                        Dynamic var68 = this.id_class(var44);
                        if (var58 != null) {
                           int var75 = var58.get("color").asInt(0);
                           if (var75 != 14 && var75 >= 0 && var75 < 16) {
                              String var78 = rtO_2.id_class(var68, "facing") + rtO_2.id_class(var68, "occupied") + rtO_2.id_class(var68, "part") + var75;
                              if (rtO_2.id_super.containsKey(var78)) {
                                 this.id_class(var44, rtO_2.id_super.get(var78));
                              }
                           }
                        }
                     }
                     break;
                  case 64:
                  case 71:
                  case 193:
                  case 194:
                  case 195:
                  case 196:
                  case 197:
                     IntListIterator var26 = ((IntList)var8.getValue()).iterator();

                     while (var26.hasNext()) {
                        int var42 = (Integer)var26.next();
                        var42 |= var9;
                        Dynamic var57 = this.id_class(var42);
                        if (rtO_2.id_class(var57).endsWith("_door")) {
                           Dynamic var67 = this.id_class(var42);
                           if ("lower".equals(rtO_2.id_class(var67, "half"))) {
                              int var74 = id_class(var42, rtX_2.UP);
                              Dynamic var77 = this.id_class(var74);
                              String var16 = rtO_2.id_class(var67);
                              if (var16.equals(rtO_2.id_class(var77))) {
                                 String var17 = rtO_2.id_class(var67, "facing");
                                 String var18 = rtO_2.id_class(var67, "open");
                                 String var19 = var2 ? "left" : rtO_2.id_class(var77, "hinge");
                                 String var20 = var2 ? "false" : rtO_2.id_class(var77, "powered");
                                 this.id_class(var42, rtO_2.id_int.get(var16 + var17 + "lower" + var19 + var18 + var20));
                                 this.id_class(var74, rtO_2.id_int.get(var16 + var17 + "upper" + var19 + var18 + var20));
                              }
                           }
                        }
                     }
                     break;
                  case 86:
                     IntListIterator var25 = ((IntList)var8.getValue()).iterator();

                     while (var25.hasNext()) {
                        int var40 = (Integer)var25.next();
                        var40 |= var9;
                        Dynamic var56 = this.id_class(var40);
                        if ("minecraft:carved_pumpkin".equals(rtO_2.id_class(var56))) {
                           String var66 = rtO_2.id_class(this.id_class(id_class(var40, rtX_2.DOWN)));
                           if ("minecraft:grass_block".equals(var66) || "minecraft:dirt".equals(var66)) {
                              this.id_class(var40, rtO_2.id_protected);
                           }
                        }
                     }
                     break;
                  case 110:
                     IntListIterator var24 = ((IntList)var8.getValue()).iterator();

                     while (var24.hasNext()) {
                        int var38 = (Integer)var24.next();
                        var38 |= var9;
                        Dynamic var55 = this.id_class(var38);
                        if ("minecraft:mycelium".equals(rtO_2.id_class(var55))) {
                           String var65 = rtO_2.id_class(this.id_class(id_class(var38, rtX_2.UP)));
                           if ("minecraft:snow".equals(var65) || "minecraft:snow_layer".equals(var65)) {
                              this.id_class(var38, rtO_2.id_catch);
                           }
                        }
                     }
                     break;
                  case 140:
                     IntListIterator var23 = ((IntList)var8.getValue()).iterator();

                     while (var23.hasNext()) {
                        int var36 = (Integer)var23.next();
                        var36 |= var9;
                        Dynamic var54 = this.id_byte(var36);
                        if (var54 != null) {
                           String var64 = var54.get("Item").asString("") + var54.get("Data").asInt(0);
                           this.id_class(var36, rtO_2.id_final.getOrDefault(var64, rtO_2.id_final.get("minecraft:air0")));
                        }
                     }
                     break;
                  case 144:
                     IntListIterator var22 = ((IntList)var8.getValue()).iterator();

                     while (var22.hasNext()) {
                        int var34 = (Integer)var22.next();
                        var34 |= var9;
                        Dynamic var53 = this.id_break(var34);
                        if (var53 != null) {
                           String var63 = String.valueOf(var53.get("SkullType").asInt(0));
                           String var73 = rtO_2.id_class(this.id_class(var34), "facing");
                           String var76;
                           if (!"up".equals(var73) && !"down".equals(var73)) {
                              var76 = var63 + var73;
                           } else {
                              var76 = var63 + var53.get("Rot").asInt(0);
                           }

                           var53.remove("SkullType");
                           var53.remove("facing");
                           var53.remove("Rot");
                           this.id_class(var34, rtO_2.id_package.getOrDefault(var76, rtO_2.id_package.get("0north")));
                        }
                     }
                     break;
                  case 175:
                     IntListIterator var21 = ((IntList)var8.getValue()).iterator();

                     while (var21.hasNext()) {
                        int var32 = (Integer)var21.next();
                        var32 |= var9;
                        Dynamic var52 = this.id_class(var32);
                        if ("upper".equals(rtO_2.id_class(var52, "half"))) {
                           Dynamic var62 = this.id_class(id_class(var32, rtX_2.DOWN));
                           String var72 = rtO_2.id_class(var62);
                           if ("minecraft:sunflower".equals(var72)) {
                              this.id_class(var32, rtO_2.id_private);
                           } else if ("minecraft:lilac".equals(var72)) {
                              this.id_class(var32, rtO_2.id_implements);
                           } else if ("minecraft:tall_grass".equals(var72)) {
                              this.id_class(var32, rtO_2.id_finally);
                           } else if ("minecraft:large_fern".equals(var72)) {
                              this.id_class(var32, rtO_2.id_extends);
                           } else if ("minecraft:rose_bush".equals(var72)) {
                              this.id_class(var32, rtO_2.id_native);
                           } else if ("minecraft:peony".equals(var72)) {
                              this.id_class(var32, rtO_2.id_volatile);
                           }
                        }
                     }
                     break;
                  case 176:
                  case 177:
                     IntListIterator var10 = ((IntList)var8.getValue()).iterator();

                     while (var10.hasNext()) {
                        int var11 = (Integer)var10.next();
                        var11 |= var9;
                        Dynamic var12 = this.id_break(var11);
                        Dynamic var13 = this.id_class(var11);
                        if (var12 != null) {
                           int var14 = var12.get("Base").asInt(0);
                           if (var14 != 15 && var14 >= 0 && var14 < 16) {
                              String var15 = rtO_2.id_class(var13, var8.getKey() == 176 ? "rotation" : "facing") + "_" + var14;
                              if (rtO_2.id_this.containsKey(var15)) {
                                 this.id_class(var11, rtO_2.id_this.get(var15));
                              }
                           }
                        }
                     }
               }
            }
         }
      }
   }

   public Dynamic<?> id_class(int var1) {
      if (var1 >= 0 && var1 <= 65535) {
         rtk_3 var2 = this.id_protected(var1);
         return var2 == null ? rtO_2.id_else : var2.id_class(var1 & 4095);
      } else {
         return rtO_2.id_else;
      }
   }

   public Dynamic<?> id_class() {
      Dynamic var1 = this.id_byte;
      if (this.id_case.isEmpty()) {
         var1 = var1.remove("TileEntities");
      } else {
         var1 = var1.set("TileEntities", var1.createList(this.id_case.values().stream()));
      }

      Dynamic var2 = var1.emptyMap();
      ArrayList var3 = Lists.newArrayList();

      for (rtk_3 var7 : this.id_break) {
         if (var7 != null) {
            var3.add(var7.id_class());
            var2 = var2.set(String.valueOf(var7.id_class), var2.createIntList(Arrays.stream(var7.id_catch.toIntArray())));
         }
      }

      Dynamic var9 = var1.emptyMap();
      var9 = var9.set("Sides", var9.createByte((byte)this.id_class));
      var9 = var9.set("Indices", var2);
      return var1.set("UpgradeData", var9).set("Sections", var9.createList(var3.stream()));
   }

   public static int id_class(int var0, rtX_2 var1) {
      switch (var1.id_break()) {
         case X:
            int var2 = (var0 & 15) + var1.id_class().id_class();
            return var2 >= 0 && var2 <= 15 ? var0 & -16 | var2 : -1;
         case Y:
            int var3 = (var0 >> 8) + var1.id_class().id_class();
            return var3 >= 0 && var3 <= 255 ? var0 & 0xFF | var3 << 8 : -1;
         case Z:
            int var4 = (var0 >> 4 & 15) + var1.id_class().id_class();
            return var4 >= 0 && var4 <= 15 ? var0 & -241 | var4 << 4 : -1;
         default:
            return -1;
      }
   }

   private void id_class(int var1, Dynamic<?> var2) {
      if (var1 >= 0 && var1 <= 65535) {
         rtk_3 var3 = this.id_protected(var1);
         if (var3 != null) {
            var3.id_class(var1 & 4095, var2);
         }
      }
   }

   private Dynamic<?> id_break(int var1) {
      return (Dynamic<?>)this.id_case.get(var1);
   }

   private rtk_3 id_protected(int var1) {
      int var2 = var1 >> 12;
      return var2 < this.id_break.length ? this.id_break[var2] : null;
   }
}
