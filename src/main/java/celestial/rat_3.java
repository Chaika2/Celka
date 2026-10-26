/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Maps
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.longs.LongArrayList
 */
package celestial;

import celestial.rYB;
import celestial.rcZ_2;
import celestial.rcd_3;
import celestial.rcy_3;
import celestial.rfj_3;
import celestial.rqM_2;
import celestial.rqR_2;
import celestial.rrEi_1;
import celestial.rrGc_1;
import celestial.rrrL;
import celestial.rrrZ;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongArrayList;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class rat_3 {
    private static final Map<String, String> id_class = rqR_2.id_class(Maps.newHashMap(), (T hashMap) -> {
        hashMap.put("Village", "Village");
        hashMap.put("Mineshaft", "Mineshaft");
        hashMap.put("Mansion", "Mansion");
        hashMap.put("Igloo", "Temple");
        hashMap.put("Desert_Pyramid", "Temple");
        hashMap.put("Jungle_Pyramid", "Temple");
        hashMap.put("Swamp_Hut", "Temple");
        hashMap.put("Stronghold", "Stronghold");
        hashMap.put("Monument", "Monument");
        hashMap.put("Fortress", "Fortress");
        hashMap.put("EndCity", "EndCity");
    });
    private static final Map<String, String> id_break = rqR_2.id_class(Maps.newHashMap(), (T hashMap) -> {
        hashMap.put("Iglu", "Igloo");
        hashMap.put("TeDP", "Desert_Pyramid");
        hashMap.put("TeJP", "Jungle_Pyramid");
        hashMap.put("TeSH", "Swamp_Hut");
    });
    private final boolean id_byte;
    private final Map<String, Long2ObjectMap<rcd_3>> id_protected = Maps.newHashMap();
    private final Map<String, rrrL> id_throws = Maps.newHashMap();
    private final List<String> id_case;
    private final List<String> id_catch;

    public rat_3(rrEi_1 rrEi_12, List<String> list, List<String> list2) {
        this.id_case = list;
        this.id_catch = list2;
        this.id_class(rrEi_12);
        boolean bl = false;
        for (String string : this.id_catch) {
            bl |= this.id_protected.get(string) != null;
        }
        this.id_byte = bl;
    }

    public void id_class(long l) {
        for (String string : this.id_case) {
            rrrL rrrL2 = this.id_throws.get(string);
            if (rrrL2 == null || !rrrL2.id_byte(l)) continue;
            rrrL2.id_protected(l);
            rrrL2.id_byte();
        }
    }

    public static rat_3 id_class(rqM_2<rYB> rqM_22, rrEi_1 rrEi_12) {
        if (rqM_22 == rYB.id_byte) {
            return new rat_3(rrEi_12, (List<String>)ImmutableList.of((Object)"Monument", (Object)"Stronghold", (Object)"Village", (Object)"Mineshaft", (Object)"Temple", (Object)"Mansion"), (List<String>)ImmutableList.of((Object)"Village", (Object)"Mineshaft", (Object)"Mansion", (Object)"Igloo", (Object)"Desert_Pyramid", (Object)"Jungle_Pyramid", (Object)"Swamp_Hut", (Object)"Stronghold", (Object)"Monument"));
        }
        if (rqM_22 == rYB.id_protected) {
            ImmutableList immutableList = ImmutableList.of((Object)"Fortress");
            return new rat_3(rrEi_12, (List<String>)immutableList, (List<String>)immutableList);
        }
        if (rqM_22 == rYB.id_throws) {
            ImmutableList immutableList = ImmutableList.of((Object)"EndCity");
            return new rat_3(rrEi_12, (List<String>)immutableList, (List<String>)immutableList);
        }
        throw new RuntimeException(String.format("Unknown dimension type : %s", rqM_22));
    }

    private void id_class(rrEi_1 rrEi_12) {
        if (rrEi_12 != null) {
            for (String string2 : this.id_case) {
                rcZ_2 rcZ_22;
                Object object;
                rcd_3 rcd_32 = new rcd_3();
                try {
                    rcd_32 = rrEi_12.id_class(string2, 1493).id_int("data").id_int("Features");
                    if (rcd_32.id_case()) {
                        continue;
                    }
                }
                catch (IOException iOException) {
                    // empty catch block
                }
                for (String string3 : rcd_32.id_protected()) {
                    String string4;
                    String string5;
                    object = rcd_32.id_int(string3);
                    long l = rfj_3.id_class(((rcd_3)object).id_private("ChunkX"), ((rcd_3)object).id_private("ChunkZ"));
                    rcZ_22 = ((rcd_3)object).id_protected("Children", 10);
                    if (!((rcy_3)rcZ_22).isEmpty() && (string5 = id_break.get(string4 = ((rcy_3)rcZ_22).id_class(0).id_native("id"))) != null) {
                        ((rcd_3)object).id_class("id", string5);
                    }
                    string4 = ((rcd_3)object).id_native("id");
                    this.id_protected.computeIfAbsent(string4, string -> new Long2ObjectOpenHashMap()).put(l, object);
                }
                String string5 = string2 + "_index";
                rrrL object22 = rrEi_12.id_class(() -> new rrrL(string5), string5);
                if (!object22.id_class().isEmpty()) {
                    this.id_throws.put(string2, object22);
                    continue;
                }
                object = new rrrL(string5);
                this.id_throws.put(string2, (rrrL)object);
                for (String string6 : rcd_32.id_protected()) {
                    rcZ_22 = rcd_32.id_int(string6);
                    ((rrrL)object).id_class(rfj_3.id_class(((rcd_3)rcZ_22).id_private("ChunkX"), ((rcd_3)rcZ_22).id_private("ChunkZ")));
                }
                ((rrGc_1)object).id_byte();
            }
        }
    }

    public rcd_3 id_class(rcd_3 rcd_32) {
        rcd_3 rcd_33 = rcd_32.id_int("Level");
        rfj_3 rfj_32 = new rfj_3(rcd_33.id_private("xPos"), rcd_33.id_private("zPos"));
        if (this.id_class(rfj_32.id_break, rfj_32.id_byte)) {
            rcd_32 = this.id_class(rcd_32, rfj_32);
        }
        rcd_3 rcd_34 = rcd_33.id_int("Structures");
        rcd_3 rcd_35 = rcd_34.id_int("References");
        for (String string : this.id_catch) {
            rrrZ rrrZ2 = (rrrZ)rrrZ.id_class.get((Object)string.toLowerCase(Locale.ROOT));
            if (rcd_35.id_byte(string, 12) || rrrZ2 == null) continue;
            int n = 8;
            LongArrayList longArrayList = new LongArrayList();
            for (int i = rfj_32.id_break - 8; i <= rfj_32.id_break + 8; ++i) {
                for (int j = rfj_32.id_byte - 8; j <= rfj_32.id_byte + 8; ++j) {
                    if (!this.id_class(i, j, string)) continue;
                    longArrayList.add(rfj_3.id_class(i, j));
                }
            }
            rcd_35.id_break(string, (List<Long>)longArrayList);
        }
        rcd_34.id_class("References", rcd_35);
        rcd_33.id_class("Structures", rcd_34);
        rcd_32.id_class("Level", rcd_33);
        return rcd_32;
    }

    private boolean id_class(int n, int n2, String string) {
        if (!this.id_byte) {
            return false;
        }
        return this.id_protected.get(string) != null && this.id_throws.get(id_class.get(string)).id_break(rfj_3.id_class(n, n2));
    }

    private rcd_3 id_class(rcd_3 rcd_32, rfj_3 rfj_32) {
        rcd_3 rcd_33 = rcd_32.id_int("Level");
        rcd_3 rcd_34 = rcd_33.id_int("Structures");
        rcd_3 rcd_35 = rcd_34.id_int("Starts");
        for (String string : this.id_catch) {
            rcd_3 rcd_36;
            Long2ObjectMap<rcd_3> long2ObjectMap = this.id_protected.get(string);
            if (long2ObjectMap == null) continue;
            long l = rfj_32.id_class();
            if (!this.id_throws.get(id_class.get(string)).id_byte(l) || (rcd_36 = (rcd_3)long2ObjectMap.get(l)) == null) continue;
            rcd_35.id_class(string, rcd_36);
        }
        rcd_34.id_class("Starts", rcd_35);
        rcd_33.id_class("Structures", rcd_34);
        rcd_32.id_class("Level", rcd_33);
        return rcd_32;
    }

    private boolean id_class(int n, int n2) {
        if (!this.id_byte) {
            return false;
        }
        for (String string : this.id_catch) {
            if (this.id_protected.get(string) == null || !this.id_throws.get(id_class.get(string)).id_byte(rfj_3.id_class(n, n2))) continue;
            return true;
        }
        return false;
    }
}

