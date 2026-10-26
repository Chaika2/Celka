/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.types.templates.List$ListType
 *  com.mojang.serialization.Dynamic
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.ints.IntIterator
 *  it.unimi.dsi.fastutil.ints.IntOpenHashSet
 *  it.unimi.dsi.fastutil.ints.IntSet
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 */
package celestial;

import celestial.rTC;
import celestial.rwM_2;
import celestial.rwO_2;
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
import com.mojang.datafixers.types.templates.List;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntIterator;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class rwb_3
extends DataFix {
    private static final int[][] id_class = new int[][]{{-1, 0, 0}, {1, 0, 0}, {0, -1, 0}, {0, 1, 0}, {0, 0, -1}, {0, 0, 1}};
    public static final Object2IntMap<String> id_break = (Object2IntMap)DataFixUtils.make((Object)new Object2IntOpenHashMap(), object2IntOpenHashMap -> {
        object2IntOpenHashMap.put((Object)"minecraft:acacia_leaves", 0);
        object2IntOpenHashMap.put((Object)"minecraft:birch_leaves", 1);
        object2IntOpenHashMap.put((Object)"minecraft:dark_oak_leaves", 2);
        object2IntOpenHashMap.put((Object)"minecraft:jungle_leaves", 3);
        object2IntOpenHashMap.put((Object)"minecraft:oak_leaves", 4);
        object2IntOpenHashMap.put((Object)"minecraft:spruce_leaves", 5);
    });
    public static final Set<String> id_byte = ImmutableSet.of((Object)"minecraft:acacia_bark", (Object)"minecraft:birch_bark", (Object)"minecraft:dark_oak_bark", (Object)"minecraft:jungle_bark", (Object)"minecraft:oak_bark", (Object)"minecraft:spruce_bark", (Object[])new String[]{"minecraft:acacia_log", "minecraft:birch_log", "minecraft:dark_oak_log", "minecraft:jungle_log", "minecraft:oak_log", "minecraft:spruce_log", "minecraft:stripped_acacia_log", "minecraft:stripped_birch_log", "minecraft:stripped_dark_oak_log", "minecraft:stripped_jungle_log", "minecraft:stripped_oak_log", "minecraft:stripped_spruce_log"});

    private int id_byte(int n) {
        return n >> 4 & 0xF;
    }

    public rwb_3(Schema schema, boolean bl) {
        super(schema, bl);
    }

    private static /* synthetic */ Typed id_class(Int2ObjectMap int2ObjectMap, Typed typed) {
        return ((rwM_2)int2ObjectMap.get(((Dynamic)typed.get(DSL.remainderFinder())).get("Y").asInt(0))).id_class(typed);
    }

    private int id_class(int n) {
        return n & 0xF;
    }

    public static int id_class(boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        int n = 0;
        if (bl3) {
            n = bl2 ? (n |= 2) : (bl ? (n |= 0x80) : (n |= 1));
        } else if (bl4) {
            n = bl ? (n |= 0x20) : (bl2 ? (n |= 8) : (n |= 0x10));
        } else if (bl2) {
            n |= 4;
        } else if (bl) {
            n |= 0x40;
        }
        return n;
    }

    public static int id_class(int n, int n2, int n3) {
        return n2 << 8 | n3 << 4 | n;
    }

    private int id_break(int n) {
        return n >> 8 & 0xFF;
    }

    protected TypeRewriteRule makeRule() {
        Type type = this.getInputSchema().getType(rTC.id_byte);
        OpticFinder opticFinder = type.findField("Level");
        OpticFinder opticFinder2 = opticFinder.type().findField("Sections");
        Type type2 = opticFinder2.type();
        if (!(type2 instanceof List.ListType)) {
            throw new IllegalStateException("Expecting sections to be a list.");
        }
        Type type3 = ((List.ListType)type2).getElement();
        OpticFinder opticFinder3 = DSL.typeFinder((Type)type3);
        return this.fixTypeEverywhereTyped("Leaves fix", type, typed2 -> typed2.updateTyped(opticFinder, typed -> {
            int[] nArray = new int[]{0};
            Typed typed3 = typed.updateTyped(opticFinder2, typed2 -> {
                int n;
                int n2;
                Int2ObjectOpenHashMap int2ObjectOpenHashMap = new Int2ObjectOpenHashMap(typed2.getAllTyped(opticFinder3).stream().map(typed -> new rwM_2((Typed<?>)typed, this.getInputSchema())).collect(Collectors.toMap(rwO_2::id_byte, rwM_22 -> rwM_22)));
                if (int2ObjectOpenHashMap.values().stream().allMatch(rwO_2::id_break)) {
                    return typed2;
                }
                ArrayList arrayList = Lists.newArrayList();
                for (int i = 0; i < 7; ++i) {
                    arrayList.add(new IntOpenHashSet());
                }
                for (rwM_2 rwM_23 : int2ObjectOpenHashMap.values()) {
                    if (rwM_23.id_break()) continue;
                    for (int i = 0; i < 4096; ++i) {
                        int n3 = rwM_23.id_byte(i);
                        if (rwM_23.id_class(n3)) {
                            ((IntSet)arrayList.get(0)).add(rwM_23.id_byte() << 12 | i);
                            continue;
                        }
                        if (!rwM_23.id_break(n3)) continue;
                        n2 = this.id_class(i);
                        n = this.id_byte(i);
                        nArray[0] = nArray[0] | rwb_3.id_class(n2 == 0, n2 == 15, n == 0, n == 15);
                    }
                }
                for (int i = 1; i < 7; ++i) {
                    rwM_2 rwM_23;
                    rwM_23 = (IntSet)arrayList.get(i - 1);
                    IntSet intSet = (IntSet)arrayList.get(i);
                    IntIterator intIterator = rwM_23.iterator();
                    while (intIterator.hasNext()) {
                        n2 = intIterator.nextInt();
                        n = this.id_class(n2);
                        int n4 = this.id_break(n2);
                        int n5 = this.id_byte(n2);
                        for (int[] nArray2 : id_class) {
                            int n6;
                            int n7;
                            int n8;
                            rwM_2 rwM_24;
                            int n9 = n + nArray2[0];
                            int n10 = n4 + nArray2[1];
                            int n11 = n5 + nArray2[2];
                            if (n9 < 0 || n9 > 15 || n11 < 0 || n11 > 15 || n10 < 0 || n10 > 255 || (rwM_24 = (rwM_2)int2ObjectOpenHashMap.get(n10 >> 4)) == null || rwM_24.id_break() || !rwM_24.id_break(n8 = rwM_24.id_byte(n7 = rwb_3.id_class(n9, n10 & 0xF, n11))) || (n6 = rwM_24.id_protected(n8)) <= i) continue;
                            rwM_24.id_class(n7, n8, i);
                            intSet.add(rwb_3.id_class(n9, n10, n11));
                        }
                    }
                }
                return typed2.updateTyped(opticFinder3, arg_0 -> rwb_3.id_class((Int2ObjectMap)int2ObjectOpenHashMap, arg_0));
            });
            if (nArray[0] != 0) {
                typed3 = typed3.update(DSL.remainderFinder(), dynamic -> {
                    Dynamic dynamic2 = (Dynamic)DataFixUtils.orElse((Optional)dynamic.get("UpgradeData").result(), (Object)dynamic.emptyMap());
                    return dynamic.set("UpgradeData", dynamic2.set("Sides", dynamic.createByte((byte)(dynamic2.get("Sides").asByte((byte)0) | nArray[0]))));
                });
            }
            return typed3;
        }));
    }
}

