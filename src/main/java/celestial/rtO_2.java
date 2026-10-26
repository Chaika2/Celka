/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.serialization.Dynamic
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap$Entry
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.rTC;
import celestial.rpf_3;
import celestial.rtS_2;
import celestial.rtW_2;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.BitSet;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rtO_2
extends DataFix {
    public static final Logger id_class = LogManager.getLogger();
    public static final BitSet id_break = new BitSet(256);
    public static final BitSet id_byte = new BitSet(256);
    public static final Dynamic<?> id_protected = rtS_2.id_break("{Name:'minecraft:pumpkin'}");
    public static final Dynamic<?> id_throws = rtS_2.id_break("{Name:'minecraft:podzol',Properties:{snowy:'true'}}");
    public static final Dynamic<?> id_case = rtS_2.id_break("{Name:'minecraft:grass_block',Properties:{snowy:'true'}}");
    public static final Dynamic<?> id_catch = rtS_2.id_break("{Name:'minecraft:mycelium',Properties:{snowy:'true'}}");
    public static final Dynamic<?> id_private = rtS_2.id_break("{Name:'minecraft:sunflower',Properties:{half:'upper'}}");
    public static final Dynamic<?> id_implements = rtS_2.id_break("{Name:'minecraft:lilac',Properties:{half:'upper'}}");
    public static final Dynamic<?> id_finally = rtS_2.id_break("{Name:'minecraft:tall_grass',Properties:{half:'upper'}}");
    public static final Dynamic<?> id_extends = rtS_2.id_break("{Name:'minecraft:large_fern',Properties:{half:'upper'}}");
    public static final Dynamic<?> id_native = rtS_2.id_break("{Name:'minecraft:rose_bush',Properties:{half:'upper'}}");
    public static final Dynamic<?> id_volatile = rtS_2.id_break("{Name:'minecraft:peony',Properties:{half:'upper'}}");
    public static final Map<String, Dynamic<?>> id_final = (Map)DataFixUtils.make((Object)Maps.newHashMap(), hashMap -> {
        hashMap.put("minecraft:air0", rtS_2.id_break("{Name:'minecraft:flower_pot'}"));
        hashMap.put("minecraft:red_flower0", rtS_2.id_break("{Name:'minecraft:potted_poppy'}"));
        hashMap.put("minecraft:red_flower1", rtS_2.id_break("{Name:'minecraft:potted_blue_orchid'}"));
        hashMap.put("minecraft:red_flower2", rtS_2.id_break("{Name:'minecraft:potted_allium'}"));
        hashMap.put("minecraft:red_flower3", rtS_2.id_break("{Name:'minecraft:potted_azure_bluet'}"));
        hashMap.put("minecraft:red_flower4", rtS_2.id_break("{Name:'minecraft:potted_red_tulip'}"));
        hashMap.put("minecraft:red_flower5", rtS_2.id_break("{Name:'minecraft:potted_orange_tulip'}"));
        hashMap.put("minecraft:red_flower6", rtS_2.id_break("{Name:'minecraft:potted_white_tulip'}"));
        hashMap.put("minecraft:red_flower7", rtS_2.id_break("{Name:'minecraft:potted_pink_tulip'}"));
        hashMap.put("minecraft:red_flower8", rtS_2.id_break("{Name:'minecraft:potted_oxeye_daisy'}"));
        hashMap.put("minecraft:yellow_flower0", rtS_2.id_break("{Name:'minecraft:potted_dandelion'}"));
        hashMap.put("minecraft:sapling0", rtS_2.id_break("{Name:'minecraft:potted_oak_sapling'}"));
        hashMap.put("minecraft:sapling1", rtS_2.id_break("{Name:'minecraft:potted_spruce_sapling'}"));
        hashMap.put("minecraft:sapling2", rtS_2.id_break("{Name:'minecraft:potted_birch_sapling'}"));
        hashMap.put("minecraft:sapling3", rtS_2.id_break("{Name:'minecraft:potted_jungle_sapling'}"));
        hashMap.put("minecraft:sapling4", rtS_2.id_break("{Name:'minecraft:potted_acacia_sapling'}"));
        hashMap.put("minecraft:sapling5", rtS_2.id_break("{Name:'minecraft:potted_dark_oak_sapling'}"));
        hashMap.put("minecraft:red_mushroom0", rtS_2.id_break("{Name:'minecraft:potted_red_mushroom'}"));
        hashMap.put("minecraft:brown_mushroom0", rtS_2.id_break("{Name:'minecraft:potted_brown_mushroom'}"));
        hashMap.put("minecraft:deadbush0", rtS_2.id_break("{Name:'minecraft:potted_dead_bush'}"));
        hashMap.put("minecraft:tallgrass2", rtS_2.id_break("{Name:'minecraft:potted_fern'}"));
        hashMap.put("minecraft:cactus0", rtS_2.id_break(2240));
    });
    public static final Map<String, Dynamic<?>> id_package = (Map)DataFixUtils.make((Object)Maps.newHashMap(), hashMap -> {
        rtO_2.id_class(hashMap, 0, "skeleton", "skull");
        rtO_2.id_class(hashMap, 1, "wither_skeleton", "skull");
        rtO_2.id_class(hashMap, 2, "zombie", "head");
        rtO_2.id_class(hashMap, 3, "player", "head");
        rtO_2.id_class(hashMap, 4, "creeper", "head");
        rtO_2.id_class(hashMap, 5, "dragon", "head");
    });
    public static final Map<String, Dynamic<?>> id_int = (Map)DataFixUtils.make((Object)Maps.newHashMap(), hashMap -> {
        rtO_2.id_class(hashMap, "oak_door", 1024);
        rtO_2.id_class(hashMap, "iron_door", 1136);
        rtO_2.id_class(hashMap, "spruce_door", 3088);
        rtO_2.id_class(hashMap, "birch_door", 3104);
        rtO_2.id_class(hashMap, "jungle_door", 3120);
        rtO_2.id_class(hashMap, "acacia_door", 3136);
        rtO_2.id_class(hashMap, "dark_oak_door", 3152);
    });
    public static final Map<String, Dynamic<?>> id_new = (Map)DataFixUtils.make((Object)Maps.newHashMap(), hashMap -> {
        for (int i = 0; i < 26; ++i) {
            hashMap.put("true" + i, rtS_2.id_break("{Name:'minecraft:note_block',Properties:{powered:'true',note:'" + i + "'}}"));
            hashMap.put("false" + i, rtS_2.id_break("{Name:'minecraft:note_block',Properties:{powered:'false',note:'" + i + "'}}"));
        }
    });
    private static final Int2ObjectMap<String> id_continue = (Int2ObjectMap)DataFixUtils.make((Object)new Int2ObjectOpenHashMap(), int2ObjectOpenHashMap -> {
        int2ObjectOpenHashMap.put(0, (Object)"white");
        int2ObjectOpenHashMap.put(1, (Object)"orange");
        int2ObjectOpenHashMap.put(2, (Object)"magenta");
        int2ObjectOpenHashMap.put(3, (Object)"light_blue");
        int2ObjectOpenHashMap.put(4, (Object)"yellow");
        int2ObjectOpenHashMap.put(5, (Object)"lime");
        int2ObjectOpenHashMap.put(6, (Object)"pink");
        int2ObjectOpenHashMap.put(7, (Object)"gray");
        int2ObjectOpenHashMap.put(8, (Object)"light_gray");
        int2ObjectOpenHashMap.put(9, (Object)"cyan");
        int2ObjectOpenHashMap.put(10, (Object)"purple");
        int2ObjectOpenHashMap.put(11, (Object)"blue");
        int2ObjectOpenHashMap.put(12, (Object)"brown");
        int2ObjectOpenHashMap.put(13, (Object)"green");
        int2ObjectOpenHashMap.put(14, (Object)"red");
        int2ObjectOpenHashMap.put(15, (Object)"black");
    });
    public static final Map<String, Dynamic<?>> id_super = (Map)DataFixUtils.make((Object)Maps.newHashMap(), hashMap -> {
        for (Int2ObjectMap.Entry entry : id_continue.int2ObjectEntrySet()) {
            if (Objects.equals(entry.getValue(), "red")) continue;
            rtO_2.id_class(hashMap, entry.getIntKey(), (String)entry.getValue());
        }
    });
    public static final Map<String, Dynamic<?>> id_this = (Map)DataFixUtils.make((Object)Maps.newHashMap(), hashMap -> {
        for (Int2ObjectMap.Entry entry : id_continue.int2ObjectEntrySet()) {
            if (Objects.equals(entry.getValue(), "white")) continue;
            rtO_2.id_break(hashMap, 15 - entry.getIntKey(), (String)entry.getValue());
        }
    });
    public static final Dynamic<?> id_else = rtS_2.id_break(0);

    public rtO_2(Schema schema, boolean bl) {
        super(schema, bl);
    }

    static {
        id_byte.set(2);
        id_byte.set(3);
        id_byte.set(110);
        id_byte.set(140);
        id_byte.set(144);
        id_byte.set(25);
        id_byte.set(86);
        id_byte.set(26);
        id_byte.set(176);
        id_byte.set(177);
        id_byte.set(175);
        id_byte.set(64);
        id_byte.set(71);
        id_byte.set(193);
        id_byte.set(194);
        id_byte.set(195);
        id_byte.set(196);
        id_byte.set(197);
        id_break.set(54);
        id_break.set(146);
        id_break.set(25);
        id_break.set(26);
        id_break.set(51);
        id_break.set(53);
        id_break.set(67);
        id_break.set(108);
        id_break.set(109);
        id_break.set(114);
        id_break.set(128);
        id_break.set(134);
        id_break.set(135);
        id_break.set(136);
        id_break.set(156);
        id_break.set(163);
        id_break.set(164);
        id_break.set(180);
        id_break.set(203);
        id_break.set(55);
        id_break.set(85);
        id_break.set(113);
        id_break.set(188);
        id_break.set(189);
        id_break.set(190);
        id_break.set(191);
        id_break.set(192);
        id_break.set(93);
        id_break.set(94);
        id_break.set(101);
        id_break.set(102);
        id_break.set(160);
        id_break.set(106);
        id_break.set(107);
        id_break.set(183);
        id_break.set(184);
        id_break.set(185);
        id_break.set(186);
        id_break.set(187);
        id_break.set(132);
        id_break.set(139);
        id_break.set(199);
    }

    private static void id_class(Map<String, Dynamic<?>> map, String string, int n) {
        map.put("minecraft:" + string + "eastlowerleftfalsefalse", rtS_2.id_break("{Name:'minecraft:" + string + "',Properties:{facing:'east',half:'lower',hinge:'left',open:'false',powered:'false'}}"));
        map.put("minecraft:" + string + "eastlowerleftfalsetrue", rtS_2.id_break("{Name:'minecraft:" + string + "',Properties:{facing:'east',half:'lower',hinge:'left',open:'false',powered:'true'}}"));
        map.put("minecraft:" + string + "eastlowerlefttruefalse", rtS_2.id_break("{Name:'minecraft:" + string + "',Properties:{facing:'east',half:'lower',hinge:'left',open:'true',powered:'false'}}"));
        map.put("minecraft:" + string + "eastlowerlefttruetrue", rtS_2.id_break("{Name:'minecraft:" + string + "',Properties:{facing:'east',half:'lower',hinge:'left',open:'true',powered:'true'}}"));
        map.put("minecraft:" + string + "eastlowerrightfalsefalse", rtS_2.id_break(n));
        map.put("minecraft:" + string + "eastlowerrightfalsetrue", rtS_2.id_break("{Name:'minecraft:" + string + "',Properties:{facing:'east',half:'lower',hinge:'right',open:'false',powered:'true'}}"));
        map.put("minecraft:" + string + "eastlowerrighttruefalse", rtS_2.id_break(n + 4));
        map.put("minecraft:" + string + "eastlowerrighttruetrue", rtS_2.id_break("{Name:'minecraft:" + string + "',Properties:{facing:'east',half:'lower',hinge:'right',open:'true',powered:'true'}}"));
        map.put("minecraft:" + string + "eastupperleftfalsefalse", rtS_2.id_break(n + 8));
        map.put("minecraft:" + string + "eastupperleftfalsetrue", rtS_2.id_break(n + 10));
        map.put("minecraft:" + string + "eastupperlefttruefalse", rtS_2.id_break("{Name:'minecraft:" + string + "',Properties:{facing:'east',half:'upper',hinge:'left',open:'true',powered:'false'}}"));
        map.put("minecraft:" + string + "eastupperlefttruetrue", rtS_2.id_break("{Name:'minecraft:" + string + "',Properties:{facing:'east',half:'upper',hinge:'left',open:'true',powered:'true'}}"));
        map.put("minecraft:" + string + "eastupperrightfalsefalse", rtS_2.id_break(n + 9));
        map.put("minecraft:" + string + "eastupperrightfalsetrue", rtS_2.id_break(n + 11));
        map.put("minecraft:" + string + "eastupperrighttruefalse", rtS_2.id_break("{Name:'minecraft:" + string + "',Properties:{facing:'east',half:'upper',hinge:'right',open:'true',powered:'false'}}"));
        map.put("minecraft:" + string + "eastupperrighttruetrue", rtS_2.id_break("{Name:'minecraft:" + string + "',Properties:{facing:'east',half:'upper',hinge:'right',open:'true',powered:'true'}}"));
        map.put("minecraft:" + string + "northlowerleftfalsefalse", rtS_2.id_break("{Name:'minecraft:" + string + "',Properties:{facing:'north',half:'lower',hinge:'left',open:'false',powered:'false'}}"));
        map.put("minecraft:" + string + "northlowerleftfalsetrue", rtS_2.id_break("{Name:'minecraft:" + string + "',Properties:{facing:'north',half:'lower',hinge:'left',open:'false',powered:'true'}}"));
        map.put("minecraft:" + string + "northlowerlefttruefalse", rtS_2.id_break("{Name:'minecraft:" + string + "',Properties:{facing:'north',half:'lower',hinge:'left',open:'true',powered:'false'}}"));
        map.put("minecraft:" + string + "northlowerlefttruetrue", rtS_2.id_break("{Name:'minecraft:" + string + "',Properties:{facing:'north',half:'lower',hinge:'left',open:'true',powered:'true'}}"));
        map.put("minecraft:" + string + "northlowerrightfalsefalse", rtS_2.id_break(n + 3));
        map.put("minecraft:" + string + "northlowerrightfalsetrue", rtS_2.id_break("{Name:'minecraft:" + string + "',Properties:{facing:'north',half:'lower',hinge:'right',open:'false',powered:'true'}}"));
        map.put("minecraft:" + string + "northlowerrighttruefalse", rtS_2.id_break(n + 7));
        map.put("minecraft:" + string + "northlowerrighttruetrue", rtS_2.id_break("{Name:'minecraft:" + string + "',Properties:{facing:'north',half:'lower',hinge:'right',open:'true',powered:'true'}}"));
        map.put("minecraft:" + string + "northupperleftfalsefalse", rtS_2.id_break("{Name:'minecraft:" + string + "',Properties:{facing:'north',half:'upper',hinge:'left',open:'false',powered:'false'}}"));
        map.put("minecraft:" + string + "northupperleftfalsetrue", rtS_2.id_break("{Name:'minecraft:" + string + "',Properties:{facing:'north',half:'upper',hinge:'left',open:'false',powered:'true'}}"));
        map.put("minecraft:" + string + "northupperlefttruefalse", rtS_2.id_break("{Name:'minecraft:" + string + "',Properties:{facing:'north',half:'upper',hinge:'left',open:'true',powered:'false'}}"));
        map.put("minecraft:" + string + "northupperlefttruetrue", rtS_2.id_break("{Name:'minecraft:" + string + "',Properties:{facing:'north',half:'upper',hinge:'left',open:'true',powered:'true'}}"));
        map.put("minecraft:" + string + "northupperrightfalsefalse", rtS_2.id_break("{Name:'minecraft:" + string + "',Properties:{facing:'north',half:'upper',hinge:'right',open:'false',powered:'false'}}"));
        map.put("minecraft:" + string + "northupperrightfalsetrue", rtS_2.id_break("{Name:'minecraft:" + string + "',Properties:{facing:'north',half:'upper',hinge:'right',open:'false',powered:'true'}}"));
        map.put("minecraft:" + string + "northupperrighttruefalse", rtS_2.id_break("{Name:'minecraft:" + string + "',Properties:{facing:'north',half:'upper',hinge:'right',open:'true',powered:'false'}}"));
        map.put("minecraft:" + string + "northupperrighttruetrue", rtS_2.id_break("{Name:'minecraft:" + string + "',Properties:{facing:'north',half:'upper',hinge:'right',open:'true',powered:'true'}}"));
        map.put("minecraft:" + string + "southlowerleftfalsefalse", rtS_2.id_break("{Name:'minecraft:" + string + "',Properties:{facing:'south',half:'lower',hinge:'left',open:'false',powered:'false'}}"));
        map.put("minecraft:" + string + "southlowerleftfalsetrue", rtS_2.id_break("{Name:'minecraft:" + string + "',Properties:{facing:'south',half:'lower',hinge:'left',open:'false',powered:'true'}}"));
        map.put("minecraft:" + string + "southlowerlefttruefalse", rtS_2.id_break("{Name:'minecraft:" + string + "',Properties:{facing:'south',half:'lower',hinge:'left',open:'true',powered:'false'}}"));
        map.put("minecraft:" + string + "southlowerlefttruetrue", rtS_2.id_break("{Name:'minecraft:" + string + "',Properties:{facing:'south',half:'lower',hinge:'left',open:'true',powered:'true'}}"));
        map.put("minecraft:" + string + "southlowerrightfalsefalse", rtS_2.id_break(n + 1));
        map.put("minecraft:" + string + "southlowerrightfalsetrue", rtS_2.id_break("{Name:'minecraft:" + string + "',Properties:{facing:'south',half:'lower',hinge:'right',open:'false',powered:'true'}}"));
        map.put("minecraft:" + string + "southlowerrighttruefalse", rtS_2.id_break(n + 5));
        map.put("minecraft:" + string + "southlowerrighttruetrue", rtS_2.id_break("{Name:'minecraft:" + string + "',Properties:{facing:'south',half:'lower',hinge:'right',open:'true',powered:'true'}}"));
        map.put("minecraft:" + string + "southupperleftfalsefalse", rtS_2.id_break("{Name:'minecraft:" + string + "',Properties:{facing:'south',half:'upper',hinge:'left',open:'false',powered:'false'}}"));
        map.put("minecraft:" + string + "southupperleftfalsetrue", rtS_2.id_break("{Name:'minecraft:" + string + "',Properties:{facing:'south',half:'upper',hinge:'left',open:'false',powered:'true'}}"));
        map.put("minecraft:" + string + "southupperlefttruefalse", rtS_2.id_break("{Name:'minecraft:" + string + "',Properties:{facing:'south',half:'upper',hinge:'left',open:'true',powered:'false'}}"));
        map.put("minecraft:" + string + "southupperlefttruetrue", rtS_2.id_break("{Name:'minecraft:" + string + "',Properties:{facing:'south',half:'upper',hinge:'left',open:'true',powered:'true'}}"));
        map.put("minecraft:" + string + "southupperrightfalsefalse", rtS_2.id_break("{Name:'minecraft:" + string + "',Properties:{facing:'south',half:'upper',hinge:'right',open:'false',powered:'false'}}"));
        map.put("minecraft:" + string + "southupperrightfalsetrue", rtS_2.id_break("{Name:'minecraft:" + string + "',Properties:{facing:'south',half:'upper',hinge:'right',open:'false',powered:'true'}}"));
        map.put("minecraft:" + string + "southupperrighttruefalse", rtS_2.id_break("{Name:'minecraft:" + string + "',Properties:{facing:'south',half:'upper',hinge:'right',open:'true',powered:'false'}}"));
        map.put("minecraft:" + string + "southupperrighttruetrue", rtS_2.id_break("{Name:'minecraft:" + string + "',Properties:{facing:'south',half:'upper',hinge:'right',open:'true',powered:'true'}}"));
        map.put("minecraft:" + string + "westlowerleftfalsefalse", rtS_2.id_break("{Name:'minecraft:" + string + "',Properties:{facing:'west',half:'lower',hinge:'left',open:'false',powered:'false'}}"));
        map.put("minecraft:" + string + "westlowerleftfalsetrue", rtS_2.id_break("{Name:'minecraft:" + string + "',Properties:{facing:'west',half:'lower',hinge:'left',open:'false',powered:'true'}}"));
        map.put("minecraft:" + string + "westlowerlefttruefalse", rtS_2.id_break("{Name:'minecraft:" + string + "',Properties:{facing:'west',half:'lower',hinge:'left',open:'true',powered:'false'}}"));
        map.put("minecraft:" + string + "westlowerlefttruetrue", rtS_2.id_break("{Name:'minecraft:" + string + "',Properties:{facing:'west',half:'lower',hinge:'left',open:'true',powered:'true'}}"));
        map.put("minecraft:" + string + "westlowerrightfalsefalse", rtS_2.id_break(n + 2));
        map.put("minecraft:" + string + "westlowerrightfalsetrue", rtS_2.id_break("{Name:'minecraft:" + string + "',Properties:{facing:'west',half:'lower',hinge:'right',open:'false',powered:'true'}}"));
        map.put("minecraft:" + string + "westlowerrighttruefalse", rtS_2.id_break(n + 6));
        map.put("minecraft:" + string + "westlowerrighttruetrue", rtS_2.id_break("{Name:'minecraft:" + string + "',Properties:{facing:'west',half:'lower',hinge:'right',open:'true',powered:'true'}}"));
        map.put("minecraft:" + string + "westupperleftfalsefalse", rtS_2.id_break("{Name:'minecraft:" + string + "',Properties:{facing:'west',half:'upper',hinge:'left',open:'false',powered:'false'}}"));
        map.put("minecraft:" + string + "westupperleftfalsetrue", rtS_2.id_break("{Name:'minecraft:" + string + "',Properties:{facing:'west',half:'upper',hinge:'left',open:'false',powered:'true'}}"));
        map.put("minecraft:" + string + "westupperlefttruefalse", rtS_2.id_break("{Name:'minecraft:" + string + "',Properties:{facing:'west',half:'upper',hinge:'left',open:'true',powered:'false'}}"));
        map.put("minecraft:" + string + "westupperlefttruetrue", rtS_2.id_break("{Name:'minecraft:" + string + "',Properties:{facing:'west',half:'upper',hinge:'left',open:'true',powered:'true'}}"));
        map.put("minecraft:" + string + "westupperrightfalsefalse", rtS_2.id_break("{Name:'minecraft:" + string + "',Properties:{facing:'west',half:'upper',hinge:'right',open:'false',powered:'false'}}"));
        map.put("minecraft:" + string + "westupperrightfalsetrue", rtS_2.id_break("{Name:'minecraft:" + string + "',Properties:{facing:'west',half:'upper',hinge:'right',open:'false',powered:'true'}}"));
        map.put("minecraft:" + string + "westupperrighttruefalse", rtS_2.id_break("{Name:'minecraft:" + string + "',Properties:{facing:'west',half:'upper',hinge:'right',open:'true',powered:'false'}}"));
        map.put("minecraft:" + string + "westupperrighttruetrue", rtS_2.id_break("{Name:'minecraft:" + string + "',Properties:{facing:'west',half:'upper',hinge:'right',open:'true',powered:'true'}}"));
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

    private static void id_class(Map<String, Dynamic<?>> map, int n, String string, String string2) {
        map.put(n + "north", rtS_2.id_break("{Name:'minecraft:" + string + "_wall_" + string2 + "',Properties:{facing:'north'}}"));
        map.put(n + "east", rtS_2.id_break("{Name:'minecraft:" + string + "_wall_" + string2 + "',Properties:{facing:'east'}}"));
        map.put(n + "south", rtS_2.id_break("{Name:'minecraft:" + string + "_wall_" + string2 + "',Properties:{facing:'south'}}"));
        map.put(n + "west", rtS_2.id_break("{Name:'minecraft:" + string + "_wall_" + string2 + "',Properties:{facing:'west'}}"));
        for (int i = 0; i < 16; ++i) {
            map.put("" + n + i, rtS_2.id_break("{Name:'minecraft:" + string + "_" + string2 + "',Properties:{rotation:'" + i + "'}}"));
        }
    }

    public static String id_class(Dynamic<?> dynamic) {
        return dynamic.get("Name").asString("");
    }

    public static String id_class(Dynamic<?> dynamic, String string) {
        return dynamic.get("Properties").get(string).asString("");
    }

    public static int id_class(rpf_3<Dynamic<?>> rpf_32, Dynamic<?> dynamic) {
        int n = rpf_32.id_class(dynamic);
        if (n == -1) {
            n = rpf_32.id_break(dynamic);
        }
        return n;
    }

    private static void id_class(Map<String, Dynamic<?>> map, int n, String string) {
        map.put("southfalsefoot" + n, rtS_2.id_break("{Name:'minecraft:" + string + "_bed',Properties:{facing:'south',occupied:'false',part:'foot'}}"));
        map.put("westfalsefoot" + n, rtS_2.id_break("{Name:'minecraft:" + string + "_bed',Properties:{facing:'west',occupied:'false',part:'foot'}}"));
        map.put("northfalsefoot" + n, rtS_2.id_break("{Name:'minecraft:" + string + "_bed',Properties:{facing:'north',occupied:'false',part:'foot'}}"));
        map.put("eastfalsefoot" + n, rtS_2.id_break("{Name:'minecraft:" + string + "_bed',Properties:{facing:'east',occupied:'false',part:'foot'}}"));
        map.put("southfalsehead" + n, rtS_2.id_break("{Name:'minecraft:" + string + "_bed',Properties:{facing:'south',occupied:'false',part:'head'}}"));
        map.put("westfalsehead" + n, rtS_2.id_break("{Name:'minecraft:" + string + "_bed',Properties:{facing:'west',occupied:'false',part:'head'}}"));
        map.put("northfalsehead" + n, rtS_2.id_break("{Name:'minecraft:" + string + "_bed',Properties:{facing:'north',occupied:'false',part:'head'}}"));
        map.put("eastfalsehead" + n, rtS_2.id_break("{Name:'minecraft:" + string + "_bed',Properties:{facing:'east',occupied:'false',part:'head'}}"));
        map.put("southtruehead" + n, rtS_2.id_break("{Name:'minecraft:" + string + "_bed',Properties:{facing:'south',occupied:'true',part:'head'}}"));
        map.put("westtruehead" + n, rtS_2.id_break("{Name:'minecraft:" + string + "_bed',Properties:{facing:'west',occupied:'true',part:'head'}}"));
        map.put("northtruehead" + n, rtS_2.id_break("{Name:'minecraft:" + string + "_bed',Properties:{facing:'north',occupied:'true',part:'head'}}"));
        map.put("easttruehead" + n, rtS_2.id_break("{Name:'minecraft:" + string + "_bed',Properties:{facing:'east',occupied:'true',part:'head'}}"));
    }

    private static void id_break(Map<String, Dynamic<?>> map, int n, String string) {
        for (int i = 0; i < 16; ++i) {
            map.put(i + "_" + n, rtS_2.id_break("{Name:'minecraft:" + string + "_banner',Properties:{rotation:'" + i + "'}}"));
        }
        map.put("north_" + n, rtS_2.id_break("{Name:'minecraft:" + string + "_wall_banner',Properties:{facing:'north'}}"));
        map.put("south_" + n, rtS_2.id_break("{Name:'minecraft:" + string + "_wall_banner',Properties:{facing:'south'}}"));
        map.put("west_" + n, rtS_2.id_break("{Name:'minecraft:" + string + "_wall_banner',Properties:{facing:'west'}}"));
        map.put("east_" + n, rtS_2.id_break("{Name:'minecraft:" + string + "_wall_banner',Properties:{facing:'east'}}"));
    }

    private Dynamic<?> id_break(Dynamic<?> dynamic) {
        Optional optional = dynamic.get("Level").result();
        return optional.isPresent() && ((Dynamic)optional.get()).get("Sections").asStreamOpt().result().isPresent() ? dynamic.set("Level", new rtW_2((Dynamic)optional.get()).id_class()) : dynamic;
    }

    public TypeRewriteRule makeRule() {
        Type type = this.getInputSchema().getType(rTC.id_byte);
        Type type2 = this.getOutputSchema().getType(rTC.id_byte);
        return this.writeFixAndRead("ChunkPalettedStorageFix", type, type2, this::id_break);
    }
}

