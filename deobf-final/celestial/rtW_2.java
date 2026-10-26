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
   private int class_;
   private final rtk_3[] break_ = new rtk_3[16];
   private final Dynamic<?> byte_;
   private final int protected_;
   private final int throws_;
   private final Int2ObjectMap<Dynamic<?>> case_ = new Int2ObjectLinkedOpenHashMap(16);

   private Dynamic<?> byte_(int var1) {
      return (Dynamic<?>)this.case_.remove(var1);
   }

   public rtW_2(Dynamic<?> var1) {
      this.byte_ = var1;
      this.protected_ = var1.get("xPos").asInt(0) << 4;
      this.throws_ = var1.get("zPos").asInt(0) << 4;
      var1.get("TileEntities").asStreamOpt().result().ifPresent(var1x -> var1x.forEach(var1xx -> {
            int var2x = var1xx.get("x").asInt(0) - this.protected_ & 15;
            int var3 = var1xx.get("y").asInt(0);
            int var4 = var1xx.get("z").asInt(0) - this.throws_ & 15;
            int var5 = var3 << 8 | var4 << 4 | var2x;
            if (this.case_.put(var5, var1xx) != null) {
               rtO_2.class_.warn("In chunk: {}x{} found a duplicate block entity at position: [{}, {}, {}]", this.protected_, this.throws_, var2x, var3, var4);
            }
         }));
      boolean var2 = var1.get("convertedFromAlphaFormat").asBoolean(false);
      var1.get("Sections").asStreamOpt().result().ifPresent(var1x -> var1x.forEach(var1xx -> {
            rtk_3 var2x = new rtk_3((Dynamic<?>)var1xx);
            this.class_ = var2x.break_(this.class_);
            this.break_[var2x.class_] = var2x;
         }));

      for (rtk_3 var6 : this.break_) {
         if (var6 != null) {
            ObjectIterator var7 = var6.case_.entrySet().iterator();

            while (var7.hasNext()) {
               Entry var8 = (Entry)var7.next();
               int var9 = var6.class_ << 12;
               switch (var8.getKey()) {
                  case 2:
                     IntListIterator var30 = ((IntList)var8.getValue()).iterator();

                     while (var30.hasNext()) {
                        int var50 = (Integer)var30.next();
                        var50 |= var9;
                        Dynamic var61 = this.class_(var50);
                        if ("minecraft:grass_block".equals(rtO_2.class_(var61))) {
                           String var71 = rtO_2.class_(this.class_(class_(var50, rtX_2.UP)));
                           if ("minecraft:snow".equals(var71) || "minecraft:snow_layer".equals(var71)) {
                              this.class_(var50, rtO_2.case_);
                           }
                        }
                     }
                     break;
                  case 3:
                     IntListIterator var29 = ((IntList)var8.getValue()).iterator();

                     while (var29.hasNext()) {
                        int var48 = (Integer)var29.next();
                        var48 |= var9;
                        Dynamic var60 = this.class_(var48);
                        if ("minecraft:podzol".equals(rtO_2.class_(var60))) {
                           String var70 = rtO_2.class_(this.class_(class_(var48, rtX_2.UP)));
                           if ("minecraft:snow".equals(var70) || "minecraft:snow_layer".equals(var70)) {
                              this.class_(var48, rtO_2.throws_);
                           }
                        }
                     }
                     break;
                  case 25:
                     IntListIterator var28 = ((IntList)var8.getValue()).iterator();

                     while (var28.hasNext()) {
                        int var46 = (Integer)var28.next();
                        var46 |= var9;
                        Dynamic var59 = this.byte_(var46);
                        if (var59 != null) {
                           String var69 = Boolean.toString(var59.get("powered").asBoolean(false)) + (byte)Math.min(Math.max(var59.get("note").asInt(0), 0), 24);
                           this.class_(var46, rtO_2.new_.getOrDefault(var69, rtO_2.new_.get("false0")));
                        }
                     }
                     break;
                  case 26:
                     IntListIterator var27 = ((IntList)var8.getValue()).iterator();

                     while (var27.hasNext()) {
                        int var44 = (Integer)var27.next();
                        var44 |= var9;
                        Dynamic var58 = this.break_(var44);
                        Dynamic var68 = this.class_(var44);
                        if (var58 != null) {
                           int var75 = var58.get("color").asInt(0);
                           if (var75 != 14 && var75 >= 0 && var75 < 16) {
                              String var78 = rtO_2.class_(var68, "facing") + rtO_2.class_(var68, "occupied") + rtO_2.class_(var68, "part") + var75;
                              if (rtO_2.super_.containsKey(var78)) {
                                 this.class_(var44, rtO_2.super_.get(var78));
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
                        Dynamic var57 = this.class_(var42);
                        if (rtO_2.class_(var57).endsWith("_door")) {
                           Dynamic var67 = this.class_(var42);
                           if ("lower".equals(rtO_2.class_(var67, "half"))) {
                              int var74 = class_(var42, rtX_2.UP);
                              Dynamic var77 = this.class_(var74);
                              String var16 = rtO_2.class_(var67);
                              if (var16.equals(rtO_2.class_(var77))) {
                                 String var17 = rtO_2.class_(var67, "facing");
                                 String var18 = rtO_2.class_(var67, "open");
                                 String var19 = var2 ? "left" : rtO_2.class_(var77, "hinge");
                                 String var20 = var2 ? "false" : rtO_2.class_(var77, "powered");
                                 this.class_(var42, rtO_2.int_.get(var16 + var17 + "lower" + var19 + var18 + var20));
                                 this.class_(var74, rtO_2.int_.get(var16 + var17 + "upper" + var19 + var18 + var20));
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
                        Dynamic var56 = this.class_(var40);
                        if ("minecraft:carved_pumpkin".equals(rtO_2.class_(var56))) {
                           String var66 = rtO_2.class_(this.class_(class_(var40, rtX_2.DOWN)));
                           if ("minecraft:grass_block".equals(var66) || "minecraft:dirt".equals(var66)) {
                              this.class_(var40, rtO_2.protected_);
                           }
                        }
                     }
                     break;
                  case 110:
                     IntListIterator var24 = ((IntList)var8.getValue()).iterator();

                     while (var24.hasNext()) {
                        int var38 = (Integer)var24.next();
                        var38 |= var9;
                        Dynamic var55 = this.class_(var38);
                        if ("minecraft:mycelium".equals(rtO_2.class_(var55))) {
                           String var65 = rtO_2.class_(this.class_(class_(var38, rtX_2.UP)));
                           if ("minecraft:snow".equals(var65) || "minecraft:snow_layer".equals(var65)) {
                              this.class_(var38, rtO_2.catch_);
                           }
                        }
                     }
                     break;
                  case 140:
                     IntListIterator var23 = ((IntList)var8.getValue()).iterator();

                     while (var23.hasNext()) {
                        int var36 = (Integer)var23.next();
                        var36 |= var9;
                        Dynamic var54 = this.byte_(var36);
                        if (var54 != null) {
                           String var64 = var54.get("Item").asString("") + var54.get("Data").asInt(0);
                           this.class_(var36, rtO_2.final_.getOrDefault(var64, rtO_2.final_.get("minecraft:air0")));
                        }
                     }
                     break;
                  case 144:
                     IntListIterator var22 = ((IntList)var8.getValue()).iterator();

                     while (var22.hasNext()) {
                        int var34 = (Integer)var22.next();
                        var34 |= var9;
                        Dynamic var53 = this.break_(var34);
                        if (var53 != null) {
                           String var63 = String.valueOf(var53.get("SkullType").asInt(0));
                           String var73 = rtO_2.class_(this.class_(var34), "facing");
                           String var76;
                           if (!"up".equals(var73) && !"down".equals(var73)) {
                              var76 = var63 + var73;
                           } else {
                              var76 = var63 + var53.get("Rot").asInt(0);
                           }

                           var53.remove("SkullType");
                           var53.remove("facing");
                           var53.remove("Rot");
                           this.class_(var34, rtO_2.package_.getOrDefault(var76, rtO_2.package_.get("0north")));
                        }
                     }
                     break;
                  case 175:
                     IntListIterator var21 = ((IntList)var8.getValue()).iterator();

                     while (var21.hasNext()) {
                        int var32 = (Integer)var21.next();
                        var32 |= var9;
                        Dynamic var52 = this.class_(var32);
                        if ("upper".equals(rtO_2.class_(var52, "half"))) {
                           Dynamic var62 = this.class_(class_(var32, rtX_2.DOWN));
                           String var72 = rtO_2.class_(var62);
                           if ("minecraft:sunflower".equals(var72)) {
                              this.class_(var32, rtO_2.private_);
                           } else if ("minecraft:lilac".equals(var72)) {
                              this.class_(var32, rtO_2.implements_);
                           } else if ("minecraft:tall_grass".equals(var72)) {
                              this.class_(var32, rtO_2.finally_);
                           } else if ("minecraft:large_fern".equals(var72)) {
                              this.class_(var32, rtO_2.extends_);
                           } else if ("minecraft:rose_bush".equals(var72)) {
                              this.class_(var32, rtO_2.native_);
                           } else if ("minecraft:peony".equals(var72)) {
                              this.class_(var32, rtO_2.volatile_);
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
                        Dynamic var12 = this.break_(var11);
                        Dynamic var13 = this.class_(var11);
                        if (var12 != null) {
                           int var14 = var12.get("Base").asInt(0);
                           if (var14 != 15 && var14 >= 0 && var14 < 16) {
                              String var15 = rtO_2.class_(var13, var8.getKey() == 176 ? "rotation" : "facing") + "_" + var14;
                              if (rtO_2.this_.containsKey(var15)) {
                                 this.class_(var11, rtO_2.this_.get(var15));
                              }
                           }
                        }
                     }
               }
            }
         }
      }
   }

   public Dynamic<?> class_(int var1) {
      if (var1 >= 0 && var1 <= 65535) {
         rtk_3 var2 = this.protected_(var1);
         return var2 == null ? rtO_2.else_ : var2.class_(var1 & 4095);
      } else {
         return rtO_2.else_;
      }
   }

   public Dynamic<?> class_() {
      Dynamic var1 = this.byte_;
      if (this.case_.isEmpty()) {
         var1 = var1.remove("TileEntities");
      } else {
         var1 = var1.set("TileEntities", var1.createList(this.case_.values().stream()));
      }

      Dynamic var2 = var1.emptyMap();
      ArrayList var3 = Lists.newArrayList();

      for (rtk_3 var7 : this.break_) {
         if (var7 != null) {
            var3.add(var7.class_());
            var2 = var2.set(String.valueOf(var7.class_), var2.createIntList(Arrays.stream(var7.catch_.toIntArray())));
         }
      }

      Dynamic var9 = var1.emptyMap();
      var9 = var9.set("Sides", var9.createByte((byte)this.class_));
      var9 = var9.set("Indices", var2);
      return var1.set("UpgradeData", var9).set("Sections", var9.createList(var3.stream()));
   }

   public static int class_(int var0, rtX_2 var1) {
      switch (var1.break_()) {
         case X:
            int var2 = (var0 & 15) + var1.class_().class_();
            return var2 >= 0 && var2 <= 15 ? var0 & -16 | var2 : -1;
         case Y:
            int var3 = (var0 >> 8) + var1.class_().class_();
            return var3 >= 0 && var3 <= 255 ? var0 & 0xFF | var3 << 8 : -1;
         case Z:
            int var4 = (var0 >> 4 & 15) + var1.class_().class_();
            return var4 >= 0 && var4 <= 15 ? var0 & -241 | var4 << 4 : -1;
         default:
            return -1;
      }
   }

   private void class_(int var1, Dynamic<?> var2) {
      if (var1 >= 0 && var1 <= 65535) {
         rtk_3 var3 = this.protected_(var1);
         if (var3 != null) {
            var3.class_(var1 & 4095, var2);
         }
      }
   }

   private Dynamic<?> break_(int var1) {
      return (Dynamic<?>)this.case_.get(var1);
   }

   private rtk_3 protected_(int var1) {
      int var2 = var1 >> 12;
      return var2 < this.break_.length ? this.break_[var2] : null;
   }
}
