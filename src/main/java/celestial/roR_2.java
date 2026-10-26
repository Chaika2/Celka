/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  it.unimi.dsi.fastutil.longs.LongSet
 *  it.unimi.dsi.fastutil.shorts.ShortList
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.aI_2;
import celestial.an_3;
import celestial.rKZ;
import celestial.rKd_1;
import celestial.rKu_1;
import celestial.rKv_1;
import celestial.rRV;
import celestial.rRe_1;
import celestial.rRo_1;
import celestial.rVL;
import celestial.rVh_1;
import celestial.rXG;
import celestial.rXs_1;
import celestial.rYB;
import celestial.rYY;
import celestial.rYZ;
import celestial.rcD_2;
import celestial.rcZ_2;
import celestial.rcd_3;
import celestial.rcq_3;
import celestial.rcy_3;
import celestial.rfH_2;
import celestial.rfj_3;
import celestial.rga_3;
import celestial.rjh_3;
import celestial.roC_2;
import celestial.roH_2;
import celestial.roJ_2;
import celestial.roN_2;
import celestial.roQ_2;
import celestial.roW_2;
import celestial.roX_2;
import celestial.roZ_2;
import celestial.rok_3;
import celestial.roz_3;
import celestial.rqu_3;
import celestial.rrEN;
import celestial.rrEZ;
import celestial.rrEm_1;
import celestial.rrPt_1;
import celestial.rrrH;
import celestial.rrrZ;
import celestial.rrse_3;
import celestial.ryO_2;
import celestial.xd_3;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.shorts.ShortList;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class roR_2 {
    private static final Logger id_class = LogManager.getLogger();

    public static rok_3 id_class(rrEm_1 rrEm_12, rrPt_1 rrPt_12, rga_3 rga_32, rfj_3 rfj_32, rcd_3 rcd_32) {
        int n;
        rcy_3 rcy_32;
        Object object3;
        rRV<xd_3> rRV2;
        Object object4;
        rKd_1 rKd_12 = rrEm_12.id_else().id_implements();
        rYY rYY2 = rKd_12.id_protected();
        rcd_3 rcd_33 = rcd_32.id_int("Level");
        rfj_3 rfj_33 = new rfj_3(rcd_33.id_private("xPos"), rcd_33.id_private("zPos"));
        if (!Objects.equals(rfj_32, rfj_33)) {
            id_class.error("Chunk file at {} is in the wrong location; relocating. (Expected {}, got {})", (Object)rfj_32, (Object)rfj_32, (Object)rfj_33);
        }
        rYZ rYZ2 = new rYZ(rrEm_12.id_new().id_break(rVL.n), rfj_32, rYY2, rcd_33.id_byte("Biomes", 11) ? rcd_33.id_final("Biomes") : null);
        rVh_1 rVh_12 = rcd_33.id_byte("UpgradeData", 10) ? new rVh_1(rcd_33.id_int("UpgradeData")) : rVh_1.id_class;
        roW_2<xd_3> roW_22 = new roW_2<xd_3>(xd_32 -> xd_32 == null || xd_32.id_continue().id_catch(), rfj_32, rcd_33.id_protected("ToBeTicked", 9));
        roW_2<rXs_1> roW_23 = new roW_2<rXs_1>(rXs_12 -> rXs_12 == null || rXs_12 == rXG.id_class, rfj_32, rcd_33.id_protected("LiquidsToBeTicked", 9));
        boolean bl = rcd_33.id_new("isLightOn");
        rcy_3 rcy_33 = rcd_33.id_protected("Sections", 10);
        int n2 = 16;
        roQ_2[] roQ_2Array = new roQ_2[16];
        boolean bl2 = rrEm_12.id_default().id_break();
        rrEN rrEN2 = rrEm_12.id_else();
        rrse_3 rrse_32 = ((roX_2)rrEN2).id_class();
        if (bl) {
            rrse_32.id_break(rfj_32, true);
        }
        for (int i = 0; i < rcy_33.size(); ++i) {
            rcd_3 rcd_34 = rcy_33.id_class(i);
            byte by = rcd_34.id_case("Y");
            if (rcd_34.id_byte("Palette", 9) && rcd_34.id_byte("BlockStates", 12)) {
                object4 = new roQ_2(by << 4);
                ((roQ_2)object4).id_implements().id_class(rcd_34.id_protected("Palette", 10), rcd_34.id_package("BlockStates"));
                ((roQ_2)object4).id_private();
                if (!((roQ_2)object4).id_byte()) {
                    roQ_2Array[by] = object4;
                }
                rga_32.id_class(rfj_32, (roQ_2)object4);
            }
            if (!bl) continue;
            if (rcd_34.id_byte("BlockLight", 7)) {
                rrse_32.id_class(rRo_1.BLOCK, rjh_3.id_class(rfj_32, (int)by), new roH_2(rcd_34.id_volatile("BlockLight")), true);
            }
            if (!bl2 || !rcd_34.id_byte("SkyLight", 7)) continue;
            rrse_32.id_class(rRo_1.SKY, rjh_3.id_class(rfj_32, (int)by), new roH_2(rcd_34.id_volatile("SkyLight")), true);
        }
        long l = rcd_33.id_implements("InhabitedTime");
        roZ_2 roZ_22 = roR_2.id_class(rcd_32);
        if (roZ_22 == roZ_2.LEVELCHUNK) {
            rRV2 = rcd_33.id_byte("TileTicks", 9) ? rRe_1.id_class(rcd_33.id_protected("TileTicks", 10), rVL.id_strictfp::id_break, rVL.id_strictfp::id_class) : roW_22;
            object3 = rcd_33.id_byte("LiquidTicks", 9) ? rRe_1.id_class(rcd_33.id_protected("LiquidTicks", 10), rVL.id_default::id_break, rVL.id_default::id_class) : roW_23;
            object4 = new roJ_2(rrEm_12.id_byte(), rfj_32, rYZ2, rVh_12, rRV2, (rRV<rXs_1>)object3, l, roQ_2Array, roJ_22 -> roR_2.id_class(rcd_33, roJ_22));
        } else {
            rRV2 = new rok_3(rfj_32, rVh_12, roQ_2Array, roW_22, roW_23);
            ((rok_3)((Object)rRV2)).id_class(rYZ2);
            object4 = rRV2;
            ((rok_3)((Object)rRV2)).id_break(l);
            ((rok_3)((Object)rRV2)).id_class(roN_2.id_class(rcd_33.id_native("Status")));
            if (((rok_3)((Object)rRV2)).id_goto().id_break(roN_2.id_implements)) {
                ((rok_3)((Object)rRV2)).id_class(rrse_32);
            }
            if (!bl && ((rok_3)((Object)rRV2)).id_goto().id_break(roN_2.id_finally)) {
                for (rfH_2 object22 : rfH_2.id_break(rfj_32.id_break(), 0, rfj_32.id_byte(), rfj_32.id_protected(), 255, rfj_32.id_throws())) {
                    if (object4.id_byte(object22).id_case() == 0) continue;
                    ((rok_3)((Object)rRV2)).id_implements(object22);
                }
            }
        }
        object4.id_protected(bl);
        rRV2 = rcd_33.id_int("Heightmaps");
        object3 = EnumSet.noneOf(rKv_1.class);
        for (rKv_1 rKv_12 : object4.id_goto().id_private()) {
            String string = rKv_12.id_break();
            if (((rcd_3)((Object)rRV2)).id_byte(string, 12)) {
                object4.id_class(rKv_12, ((rcd_3)((Object)rRV2)).id_package(string));
                continue;
            }
            ((AbstractCollection)object3).add((rKv_1)rKv_12);
        }
        rKZ.id_class((roC_2)object4, object3);
        rcd_3 rcd_34 = rcd_33.id_int("Structures");
        object4.id_break(roR_2.id_class(rrPt_12, rcd_34, rrEm_12.id_break()));
        object4.id_class(roR_2.id_class(rfj_32, rcd_34));
        if (rcd_33.id_new("shouldSave")) {
            object4.id_break(true);
        }
        rcy_3 rcy_34 = rcd_33.id_protected("PostProcessing", 9);
        for (int i = 0; i < rcy_34.size(); ++i) {
            rcy_32 = rcy_34.id_break(i);
            for (n = 0; n < rcy_32.size(); ++n) {
                object4.id_break(rcy_32.id_protected(n), i);
            }
        }
        if (roZ_22 == roZ_2.LEVELCHUNK) {
            return new roz_3((roJ_2)object4);
        }
        rok_3 rok_32 = (rok_3)object4;
        rcy_32 = rcd_33.id_protected("Entities", 10);
        for (n = 0; n < rcy_32.size(); ++n) {
            rok_32.id_break(rcy_32.id_class(n));
        }
        rcy_3 rcy_35 = rcd_33.id_protected("TileEntities", 10);
        for (int i = 0; i < rcy_35.size(); ++i) {
            rcd_3 rcd_35 = rcy_35.id_class(i);
            object4.id_class(rcd_35);
        }
        rcy_3 rcy_36 = rcd_33.id_protected("Lights", 9);
        for (int i = 0; i < rcy_36.size(); ++i) {
            rcy_3 rcy_37 = rcy_36.id_break(i);
            for (int j = 0; j < rcy_37.size(); ++j) {
                rok_32.id_class(rcy_37.id_protected(j), i);
            }
        }
        rcd_3 rcd_36 = rcd_33.id_int("CarvingMasks");
        for (String string : rcd_36.id_protected()) {
            rKu_1 rKu_12 = rKu_1.valueOf(string);
            rok_32.id_class(rKu_12, BitSet.valueOf(rcd_36.id_volatile(string)));
        }
        return rok_32;
    }

    public static rcy_3 id_class(ShortList[] shortListArray) {
        rcy_3 rcy_32 = new rcy_3();
        for (ShortList shortList : shortListArray) {
            rcy_3 rcy_33 = new rcy_3();
            if (shortList != null) {
                for (Short s : shortList) {
                    rcy_33.add(rcD_2.id_class(s));
                }
            }
            rcy_32.add(rcy_33);
        }
        return rcy_32;
    }

    public static roZ_2 id_class(rcd_3 rcd_32) {
        roN_2 roN_22;
        if (rcd_32 != null && (roN_22 = roN_2.id_class(rcd_32.id_int("Level").id_native("Status"))) != null) {
            return roN_22.id_catch();
        }
        return roZ_2.PROTOCHUNK;
    }

    private static void id_class(rcd_3 rcd_32, roJ_2 roJ_22) {
        rcy_3 rcy_32 = rcd_32.id_protected("Entities", 10);
        rYB rYB2 = roJ_22.id_extends();
        for (int i = 0; i < rcy_32.size(); ++i) {
            rcd_3 rcd_33 = rcy_32.id_class(i);
            aI_2.id_class(rcd_33, rYB2, (an_3 an_32) -> {
                roJ_22.id_class((an_3)an_32);
                return an_32;
            });
            roJ_22.id_byte(true);
        }
        rcy_3 rcy_33 = rcd_32.id_protected("TileEntities", 10);
        for (int i = 0; i < rcy_33.size(); ++i) {
            rcd_3 rcd_34 = rcy_33.id_class(i);
            boolean bl = rcd_34.id_new("keepPacked");
            if (bl) {
                roJ_22.id_class(rcd_34);
                continue;
            }
            rfH_2 rfH_22 = new rfH_2(rcd_34.id_private("x"), rcd_34.id_private("y"), rcd_34.id_private("z"));
            ryO_2 ryO_22 = ryO_2.id_break(roJ_22.id_byte(rfH_22), rcd_34);
            if (ryO_22 == null) continue;
            roJ_22.id_class(ryO_22);
        }
    }

    public static rcd_3 id_class(rrEm_1 rrEm_12, roC_2 roC_22) {
        rYZ rYZ2;
        Object object;
        Object object2;
        Object object4;
        rfj_3 rfj_32 = roC_22.id_private();
        rcd_3 rcd_32 = new rcd_3();
        rcd_3 rcd_33 = new rcd_3();
        rcd_32.id_break("DataVersion", rqu_3.id_class().getWorldVersion());
        rcd_32.id_class("Level", rcd_33);
        rcd_33.id_break("xPos", rfj_32.id_break);
        rcd_33.id_break("zPos", rfj_32.id_byte);
        rcd_33.id_class("LastUpdate", rrEm_12.r());
        rcd_33.id_class("InhabitedTime", roC_22.id_this());
        rcd_33.id_class("Status", roC_22.id_goto().id_protected());
        rVh_1 rVh_12 = roC_22.id_synchronized();
        if (!rVh_12.id_class()) {
            rcd_33.id_class("UpgradeData", rVh_12.id_break());
        }
        roQ_2[] roQ_2Array = roC_22.id_byte();
        rcy_3 rcy_32 = new rcy_3();
        rrEZ rrEZ2 = rrEm_12.id_else().id_protected();
        boolean bl = roC_22.id_throw();
        for (int i = -1; i < 17; ++i) {
            int n = i;
            object4 = Arrays.stream(roQ_2Array).filter(roQ_22 -> roQ_22 != null && roQ_22.id_catch() >> 4 == n).findFirst().orElse(roJ_2.id_class);
            roH_2 object32 = rrEZ2.id_class(rRo_1.BLOCK).id_class(rjh_3.id_class(rfj_32, n));
            object2 = rrEZ2.id_class(rRo_1.SKY).id_class(rjh_3.id_class(rfj_32, n));
            if (object4 == roJ_2.id_class && object32 == null && object2 == null) continue;
            object = new rcd_3();
            ((rcd_3)object).id_class("Y", (byte)(n & 0xFF));
            if (object4 != roJ_2.id_class) {
                ((roQ_2)object4).id_implements().id_class((rcd_3)object, "Palette", "BlockStates");
            }
            if (object32 != null && !object32.id_byte()) {
                ((rcd_3)object).id_class("BlockLight", object32.id_class());
            }
            if (object2 != null && !((roH_2)object2).id_byte()) {
                ((rcd_3)object).id_class("SkyLight", ((roH_2)object2).id_class());
            }
            rcy_32.add(object);
        }
        rcd_33.id_class("Sections", rcy_32);
        if (bl) {
            rcd_33.id_class("isLightOn", true);
        }
        if ((rYZ2 = roC_22.id_implements()) != null) {
            rcd_33.id_class("Biomes", rYZ2.id_class());
        }
        rcy_3 rcy_33 = new rcy_3();
        for (rfH_2 rfH_22 : roC_22.id_break()) {
            object2 = roC_22.id_protected(rfH_22);
            if (object2 == null) continue;
            rcy_33.add(object2);
        }
        rcd_33.id_class("TileEntities", rcy_33);
        object4 = new rcy_3();
        if (roC_22.id_goto().id_catch() == roZ_2.LEVELCHUNK) {
            roJ_2 roJ_22 = (roJ_2)roC_22;
            roJ_22.id_byte(false);
            for (int i = 0; i < roJ_22.id_final().length; ++i) {
                for (an_3 an_32 : roJ_22.id_final()[i]) {
                    rcd_3 rcd_34;
                    if (!an_32.id_byte(rcd_34 = new rcd_3())) continue;
                    roJ_22.id_byte(true);
                    ((AbstractList)object4).add(rcd_34);
                }
            }
        } else {
            rok_3 rok_32 = (rok_3)roC_22;
            ((AbstractCollection)object4).addAll(rok_32.id_case());
            rcd_33.id_class("Lights", roR_2.id_class(rok_32.id_protected()));
            object2 = new rcd_3();
            for (rKu_1 rKu_12 : rKu_1.values()) {
                BitSet bitSet = rok_32.id_class(rKu_12);
                if (bitSet == null) continue;
                ((rcd_3)object2).id_class(rKu_12.toString(), bitSet.toByteArray());
            }
            rcd_33.id_class("CarvingMasks", (rcZ_2)object2);
        }
        rcd_33.id_class("Entities", (rcZ_2)object4);
        rRV<xd_3> rRV2 = roC_22.id_int();
        if (rRV2 instanceof roW_2) {
            rcd_33.id_class("ToBeTicked", ((roW_2)rRV2).id_class());
        } else if (rRV2 instanceof rRe_1) {
            rcd_33.id_class("TileTicks", ((rRe_1)rRV2).id_class());
        } else {
            rcd_33.id_class("TileTicks", rrEm_12.id_synchronized().id_class(rfj_32));
        }
        rRV<rXs_1> rRV3 = roC_22.id_new();
        if (rRV3 instanceof roW_2) {
            rcd_33.id_class("LiquidsToBeTicked", ((roW_2)rRV3).id_class());
        } else if (rRV3 instanceof rRe_1) {
            rcd_33.id_class("LiquidTicks", ((rRe_1)rRV3).id_class());
        } else {
            rcd_33.id_class("LiquidTicks", rrEm_12.id_return().id_class(rfj_32));
        }
        rcd_33.id_class("PostProcessing", roR_2.id_class(roC_22.id_return()));
        object = new rcd_3();
        for (Map.Entry<rKv_1, rKZ> entry : roC_22.id_native()) {
            if (!roC_22.id_goto().id_private().contains(entry.getKey())) continue;
            ((rcd_3)object).id_class(entry.getKey().id_break(), new rcq_3(entry.getValue().id_class()));
        }
        rcd_33.id_class("Heightmaps", (rcZ_2)object);
        rcd_33.id_class("Structures", roR_2.id_class(rfj_32, roC_22.id_super(), roC_22.id_class()));
        return rcd_32;
    }

    private static Map<rrrZ<?>, LongSet> id_class(rfj_3 rfj_32, rcd_3 rcd_32) {
        HashMap hashMap = Maps.newHashMap();
        rcd_3 rcd_33 = rcd_32.id_int("References");
        for (String string : rcd_33.id_protected()) {
            hashMap.put((rrrZ)rrrZ.id_class.get((Object)string.toLowerCase(Locale.ROOT)), new LongOpenHashSet(Arrays.stream(rcd_33.id_package(string)).filter(l -> {
                rfj_3 rfj_33 = new rfj_3(l);
                if (rfj_33.id_class(rfj_32) > 8) {
                    id_class.warn("Found invalid structure reference [ {} @ {} ] for chunk {}.", (Object)string, (Object)rfj_33, (Object)rfj_32);
                    return false;
                }
                return true;
            }).toArray()));
        }
        return hashMap;
    }

    private static Map<rrrZ<?>, rrrH<?>> id_class(rrPt_1 rrPt_12, rcd_3 rcd_32, long l) {
        HashMap hashMap = Maps.newHashMap();
        rcd_3 rcd_33 = rcd_32.id_int("Starts");
        for (String string : rcd_33.id_protected()) {
            String string2 = string.toLowerCase(Locale.ROOT);
            rrrZ rrrZ2 = (rrrZ)rrrZ.id_class.get((Object)string2);
            if (rrrZ2 == null) {
                id_class.error("Unknown structure start: {}", (Object)string2);
                continue;
            }
            rrrH<?> rrrH2 = rrrZ.id_class(rrPt_12, rcd_33.id_int(string), l);
            if (rrrH2 == null) continue;
            hashMap.put(rrrZ2, rrrH2);
        }
        return hashMap;
    }

    private static rcd_3 id_class(rfj_3 rfj_32, Map<rrrZ<?>, rrrH<?>> map, Map<rrrZ<?>, LongSet> map2) {
        rcd_3 rcd_32 = new rcd_3();
        rcd_3 rcd_33 = new rcd_3();
        for (Map.Entry<rrrZ<?>, rrrH<?>> object : map.entrySet()) {
            rcd_33.id_class(object.getKey().id_catch(), object.getValue().id_class(rfj_32.id_break, rfj_32.id_byte));
        }
        rcd_32.id_class("Starts", rcd_33);
        rcd_3 rcd_34 = new rcd_3();
        for (Map.Entry<rrrZ<?>, LongSet> entry : map2.entrySet()) {
            rcd_34.id_class(entry.getKey().id_catch(), new rcq_3(entry.getValue()));
        }
        rcd_32.id_class("References", rcd_34);
        return rcd_32;
    }
}

