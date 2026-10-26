/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.serialization.Dynamic
 *  it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.IntList
 *  it.unimi.dsi.fastutil.ints.IntListIterator
 */
package celestial;

import celestial.rtO_2;
import celestial.rtX_2;
import celestial.rtk_3;
import com.google.common.collect.Lists;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntListIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public final class rtW_2 {
    private int id_class;
    private final rtk_3[] id_break = new rtk_3[16];
    private final Dynamic<?> id_byte;
    private final int id_protected;
    private final int id_throws;
    private final Int2ObjectMap<Dynamic<?>> id_case = new Int2ObjectLinkedOpenHashMap(16);

    private Dynamic<?> id_byte(int n) {
        return (Dynamic)this.id_case.remove(n);
    }

    public rtW_2(Dynamic<?> dynamic) {
        this.id_byte = dynamic;
        this.id_protected = dynamic.get("xPos").asInt(0) << 4;
        this.id_throws = dynamic.get("zPos").asInt(0) << 4;
        dynamic.get("TileEntities").asStreamOpt().result().ifPresent(stream -> stream.forEach(dynamic -> {
            int n;
            int n2 = dynamic.get("x").asInt(0) - this.id_protected & 0xF;
            int n3 = dynamic.get("y").asInt(0);
            int n4 = n3 << 8 | (n = dynamic.get("z").asInt(0) - this.id_throws & 0xF) << 4 | n2;
            if (this.id_case.put(n4, dynamic) != null) {
                rtO_2.id_class.warn("In chunk: {}x{} found a duplicate block entity at position: [{}, {}, {}]", (Object)this.id_protected, (Object)this.id_throws, (Object)n2, (Object)n3, (Object)n);
            }
        }));
        boolean bl = dynamic.get("convertedFromAlphaFormat").asBoolean(false);
        dynamic.get("Sections").asStreamOpt().result().ifPresent(stream -> stream.forEach(dynamic -> {
            rtk_3 rtk_32 = new rtk_3((Dynamic<?>)dynamic);
            this.id_class = rtk_32.id_break(this.id_class);
            this.id_break[rtk_32.id_class] = rtk_32;
        }));
        for (rtk_3 rtk_32 : this.id_break) {
            if (rtk_32 == null) continue;
            block14: for (Map.Entry entry : rtk_32.id_case.entrySet()) {
                int n = rtk_32.id_class << 12;
                switch ((Integer)entry.getKey()) {
                    case 2: {
                        Object object2;
                        Dynamic<?> dynamic2;
                        int n2;
                        IntListIterator intListIterator = ((IntList)entry.getValue()).iterator();
                        while (intListIterator.hasNext()) {
                            n2 = (Integer)intListIterator.next();
                            dynamic2 = this.id_class(n2 |= n);
                            if (!"minecraft:grass_block".equals(rtO_2.id_class(dynamic2)) || !"minecraft:snow".equals(object2 = rtO_2.id_class(this.id_class(rtW_2.id_class(n2, rtX_2.UP)))) && !"minecraft:snow_layer".equals(object2)) continue;
                            this.id_class(n2, rtO_2.id_case);
                        }
                        continue block14;
                    }
                    case 3: {
                        Object object2;
                        Dynamic<?> dynamic2;
                        int n2;
                        IntListIterator intListIterator = ((IntList)entry.getValue()).iterator();
                        while (intListIterator.hasNext()) {
                            n2 = (Integer)intListIterator.next();
                            dynamic2 = this.id_class(n2 |= n);
                            if (!"minecraft:podzol".equals(rtO_2.id_class(dynamic2)) || !"minecraft:snow".equals(object2 = rtO_2.id_class(this.id_class(rtW_2.id_class(n2, rtX_2.UP)))) && !"minecraft:snow_layer".equals(object2)) continue;
                            this.id_class(n2, rtO_2.id_throws);
                        }
                        continue block14;
                    }
                    case 25: {
                        Object object2;
                        Dynamic<?> dynamic2;
                        int n2;
                        IntListIterator intListIterator = ((IntList)entry.getValue()).iterator();
                        while (intListIterator.hasNext()) {
                            n2 = (Integer)intListIterator.next();
                            dynamic2 = this.id_byte(n2 |= n);
                            if (dynamic2 == null) continue;
                            object2 = Boolean.toString(dynamic2.get("powered").asBoolean(false)) + (byte)Math.min(Math.max(dynamic2.get("note").asInt(0), 0), 24);
                            this.id_class(n2, rtO_2.id_new.getOrDefault(object2, rtO_2.id_new.get("false0")));
                        }
                        continue block14;
                    }
                    case 26: {
                        Object object;
                        Object object2;
                        Dynamic<?> dynamic2;
                        int n2;
                        IntListIterator intListIterator = ((IntList)entry.getValue()).iterator();
                        while (intListIterator.hasNext()) {
                            int n3;
                            n2 = (Integer)intListIterator.next();
                            dynamic2 = this.id_break(n2 |= n);
                            object2 = this.id_class(n2);
                            if (dynamic2 == null || (n3 = dynamic2.get("color").asInt(0)) == 14 || n3 < 0 || n3 >= 16 || !rtO_2.id_super.containsKey(object = rtO_2.id_class(object2, "facing") + rtO_2.id_class(object2, "occupied") + rtO_2.id_class(object2, "part") + n3)) continue;
                            this.id_class(n2, rtO_2.id_super.get(object));
                        }
                        continue block14;
                    }
                    case 64: 
                    case 71: 
                    case 193: 
                    case 194: 
                    case 195: 
                    case 196: 
                    case 197: {
                        Object object;
                        Object object2;
                        Dynamic<?> dynamic2;
                        int n2;
                        IntListIterator intListIterator = ((IntList)entry.getValue()).iterator();
                        while (intListIterator.hasNext()) {
                            n2 = (Integer)intListIterator.next();
                            dynamic2 = this.id_class(n2 |= n);
                            if (!rtO_2.id_class(dynamic2).endsWith("_door") || !"lower".equals(rtO_2.id_class(object2 = this.id_class(n2), "half"))) continue;
                            int n4 = rtW_2.id_class(n2, rtX_2.UP);
                            object = this.id_class(n4);
                            String string = rtO_2.id_class(object2);
                            if (!string.equals(rtO_2.id_class(object))) continue;
                            String string2 = rtO_2.id_class(object2, "facing");
                            String string3 = rtO_2.id_class(object2, "open");
                            String string4 = bl ? "left" : rtO_2.id_class(object, "hinge");
                            String string5 = bl ? "false" : rtO_2.id_class(object, "powered");
                            this.id_class(n2, rtO_2.id_int.get(string + string2 + "lower" + string4 + string3 + string5));
                            this.id_class(n4, rtO_2.id_int.get(string + string2 + "upper" + string4 + string3 + string5));
                        }
                        continue block14;
                    }
                    case 86: {
                        Object object2;
                        Dynamic<?> dynamic2;
                        int n2;
                        IntListIterator intListIterator = ((IntList)entry.getValue()).iterator();
                        while (intListIterator.hasNext()) {
                            n2 = (Integer)intListIterator.next();
                            dynamic2 = this.id_class(n2 |= n);
                            if (!"minecraft:carved_pumpkin".equals(rtO_2.id_class(dynamic2)) || !"minecraft:grass_block".equals(object2 = rtO_2.id_class(this.id_class(rtW_2.id_class(n2, rtX_2.DOWN)))) && !"minecraft:dirt".equals(object2)) continue;
                            this.id_class(n2, rtO_2.id_protected);
                        }
                        continue block14;
                    }
                    case 110: {
                        Object object2;
                        Dynamic<?> dynamic2;
                        int n2;
                        IntListIterator intListIterator = ((IntList)entry.getValue()).iterator();
                        while (intListIterator.hasNext()) {
                            n2 = (Integer)intListIterator.next();
                            dynamic2 = this.id_class(n2 |= n);
                            if (!"minecraft:mycelium".equals(rtO_2.id_class(dynamic2)) || !"minecraft:snow".equals(object2 = rtO_2.id_class(this.id_class(rtW_2.id_class(n2, rtX_2.UP)))) && !"minecraft:snow_layer".equals(object2)) continue;
                            this.id_class(n2, rtO_2.id_catch);
                        }
                        continue block14;
                    }
                    case 140: {
                        Object object2;
                        Dynamic<?> dynamic2;
                        int n2;
                        IntListIterator intListIterator = ((IntList)entry.getValue()).iterator();
                        while (intListIterator.hasNext()) {
                            n2 = (Integer)intListIterator.next();
                            dynamic2 = this.id_byte(n2 |= n);
                            if (dynamic2 == null) continue;
                            object2 = dynamic2.get("Item").asString("") + dynamic2.get("Data").asInt(0);
                            this.id_class(n2, rtO_2.id_final.getOrDefault(object2, rtO_2.id_final.get("minecraft:air0")));
                        }
                        continue block14;
                    }
                    case 144: {
                        Object object;
                        Object object2;
                        Dynamic<?> dynamic2;
                        int n2;
                        IntListIterator intListIterator = ((IntList)entry.getValue()).iterator();
                        while (intListIterator.hasNext()) {
                            n2 = (Integer)intListIterator.next();
                            dynamic2 = this.id_break(n2 |= n);
                            if (dynamic2 == null) continue;
                            object2 = String.valueOf(dynamic2.get("SkullType").asInt(0));
                            String string = rtO_2.id_class(this.id_class(n2), "facing");
                            object = !"up".equals(string) && !"down".equals(string) ? object2 + string : object2 + String.valueOf(dynamic2.get("Rot").asInt(0));
                            dynamic2.remove("SkullType");
                            dynamic2.remove("facing");
                            dynamic2.remove("Rot");
                            this.id_class(n2, rtO_2.id_package.getOrDefault(object, rtO_2.id_package.get("0north")));
                        }
                        continue block14;
                    }
                    case 175: {
                        Object object2;
                        Dynamic<?> dynamic2;
                        int n2;
                        IntListIterator intListIterator = ((IntList)entry.getValue()).iterator();
                        while (intListIterator.hasNext()) {
                            n2 = (Integer)intListIterator.next();
                            dynamic2 = this.id_class(n2 |= n);
                            if (!"upper".equals(rtO_2.id_class(dynamic2, "half"))) continue;
                            object2 = this.id_class(rtW_2.id_class(n2, rtX_2.DOWN));
                            String string = rtO_2.id_class(object2);
                            if ("minecraft:sunflower".equals(string)) {
                                this.id_class(n2, rtO_2.id_private);
                                continue;
                            }
                            if ("minecraft:lilac".equals(string)) {
                                this.id_class(n2, rtO_2.id_implements);
                                continue;
                            }
                            if ("minecraft:tall_grass".equals(string)) {
                                this.id_class(n2, rtO_2.id_finally);
                                continue;
                            }
                            if ("minecraft:large_fern".equals(string)) {
                                this.id_class(n2, rtO_2.id_extends);
                                continue;
                            }
                            if ("minecraft:rose_bush".equals(string)) {
                                this.id_class(n2, rtO_2.id_native);
                                continue;
                            }
                            if (!"minecraft:peony".equals(string)) continue;
                            this.id_class(n2, rtO_2.id_volatile);
                        }
                        continue block14;
                    }
                    case 176: 
                    case 177: {
                        Object object;
                        Object object2;
                        Dynamic<?> dynamic2;
                        int n2;
                        IntListIterator intListIterator = ((IntList)entry.getValue()).iterator();
                        while (intListIterator.hasNext()) {
                            int n5;
                            n2 = (Integer)intListIterator.next();
                            dynamic2 = this.id_break(n2 |= n);
                            object2 = this.id_class(n2);
                            if (dynamic2 == null || (n5 = dynamic2.get("Base").asInt(0)) == 15 || n5 < 0 || n5 >= 16 || !rtO_2.id_this.containsKey(object = rtO_2.id_class(object2, (Integer)entry.getKey() == 176 ? "rotation" : "facing") + "_" + n5)) continue;
                            this.id_class(n2, rtO_2.id_this.get(object));
                        }
                        break;
                    }
                }
            }
        }
    }

    public Dynamic<?> id_class(int n) {
        if (n >= 0 && n <= 65535) {
            rtk_3 rtk_32 = this.id_protected(n);
            return rtk_32 == null ? rtO_2.id_else : rtk_32.id_class(n & 0xFFF);
        }
        return rtO_2.id_else;
    }

    public Dynamic<?> id_class() {
        Dynamic dynamic = this.id_byte;
        dynamic = this.id_case.isEmpty() ? dynamic.remove("TileEntities") : dynamic.set("TileEntities", dynamic.createList(this.id_case.values().stream()));
        Dynamic dynamic2 = dynamic.emptyMap();
        ArrayList arrayList = Lists.newArrayList();
        for (rtk_3 rtk_32 : this.id_break) {
            if (rtk_32 == null) continue;
            arrayList.add(rtk_32.id_class());
            dynamic2 = dynamic2.set(String.valueOf(rtk_32.id_class), dynamic2.createIntList(Arrays.stream(rtk_32.id_catch.toIntArray())));
        }
        Dynamic dynamic3 = dynamic.emptyMap();
        dynamic3 = dynamic3.set("Sides", dynamic3.createByte((byte)this.id_class));
        dynamic3 = dynamic3.set("Indices", dynamic2);
        return dynamic.set("UpgradeData", dynamic3).set("Sections", dynamic3.createList(arrayList.stream()));
    }

    public static int id_class(int n, rtX_2 rtX_22) {
        switch (rtX_22.id_break()) {
            case X: {
                int n2 = (n & 0xF) + rtX_22.id_class().id_class();
                return n2 >= 0 && n2 <= 15 ? n & 0xFFFFFFF0 | n2 : -1;
            }
            case Y: {
                int n3 = (n >> 8) + rtX_22.id_class().id_class();
                return n3 >= 0 && n3 <= 255 ? n & 0xFF | n3 << 8 : -1;
            }
            case Z: {
                int n4 = (n >> 4 & 0xF) + rtX_22.id_class().id_class();
                return n4 >= 0 && n4 <= 15 ? n & 0xFFFFFF0F | n4 << 4 : -1;
            }
        }
        return -1;
    }

    private void id_class(int n, Dynamic<?> dynamic) {
        rtk_3 rtk_32;
        if (n >= 0 && n <= 65535 && (rtk_32 = this.id_protected(n)) != null) {
            rtk_32.id_class(n & 0xFFF, dynamic);
        }
    }

    private Dynamic<?> id_break(int n) {
        return (Dynamic)this.id_case.get(n);
    }

    private rtk_3 id_protected(int n) {
        int n2 = n >> 12;
        return n2 < this.id_break.length ? this.id_break[n2] : null;
    }
}

