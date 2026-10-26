/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashBasedTable
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.apache.logging.log4j.util.Supplier
 */
package celestial;

import celestial.gM_2;
import celestial.mG_2;
import celestial.rVL;
import celestial.rdX_2;
import celestial.rdn_3;
import celestial.rkU_2;
import celestial.rkj_3;
import celestial.rkw_3;
import celestial.rxJ_2;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.util.Supplier;

public class VR
extends rkU_2 {
    private static final Logger id_byte = LogManager.getLogger();
    private Map<gM_2, List<mG_2>> id_protected = ImmutableMap.of();
    private List<mG_2> id_throws = ImmutableList.of();

    public void id_class(Iterable<rkw_3<?>> iterable) {
        Map<gM_2, List<List<rkw_3<?>>>> map = VR.id_break(iterable);
        HashMap hashMap = Maps.newHashMap();
        ImmutableList.Builder builder = ImmutableList.builder();
        map.forEach((gM_22, list) -> {
            List list2 = hashMap.put(gM_22, (List)list.stream().map(mG_2::new).peek(arg_0 -> ((ImmutableList.Builder)builder).add(arg_0)).collect(ImmutableList.toImmutableList()));
        });
        gM_2.field_243235_w.forEach((gM_23, list) -> {
            List list2 = hashMap.put(gM_23, (List)list.stream().flatMap(gM_22 -> ((List)hashMap.getOrDefault(gM_22, ImmutableList.of())).stream()).collect(ImmutableList.toImmutableList()));
        });
        this.id_protected = ImmutableMap.copyOf((Map)hashMap);
        this.id_throws = builder.build();
    }

    public List<mG_2> id_class(gM_2 gM_22) {
        return this.id_protected.getOrDefault((Object)gM_22, Collections.emptyList());
    }

    public List<mG_2> id_class() {
        return this.id_throws;
    }

    private static Map<gM_2, List<List<rkw_3<?>>>> id_break(Iterable<rkw_3<?>> iterable) {
        HashMap hashMap = Maps.newHashMap();
        HashBasedTable hashBasedTable = HashBasedTable.create();
        for (rkw_3<?> rkw_32 : iterable) {
            if (rkw_32.id_implements()) continue;
            gM_2 gM_23 = VR.id_catch(rkw_32);
            String string = rkw_32.id_protected();
            if (string.isEmpty()) {
                hashMap.computeIfAbsent(gM_23, gM_22 -> Lists.newArrayList()).add(ImmutableList.of(rkw_32));
                continue;
            }
            List list = (List)hashBasedTable.get((Object)gM_23, (Object)string);
            if (list == null) {
                list = Lists.newArrayList();
                hashBasedTable.put((Object)gM_23, (Object)string, (Object)list);
                hashMap.computeIfAbsent(gM_23, gM_22 -> Lists.newArrayList()).add(list);
            }
            list.add(rkw_32);
        }
        return hashMap;
    }

    private static gM_2 id_catch(rkw_3<?> rkw_32) {
        rkj_3<?> rkj_32 = rkw_32.id_catch();
        if (rkj_32 == rkj_3.id_class) {
            rdn_3 rdn_32 = rkw_32.id_byte();
            rdX_2 rdX_22 = rdn_32.id_break().id_new();
            if (rdX_22 == rdX_2.id_break) {
                return gM_2.CRAFTING_BUILDING_BLOCKS;
            }
            if (rdX_22 != rdX_2.id_implements && rdX_22 != rdX_2.id_finally) {
                return rdX_22 == rdX_2.id_protected ? gM_2.CRAFTING_REDSTONE : gM_2.CRAFTING_MISC;
            }
            return gM_2.CRAFTING_EQUIPMENT;
        }
        if (rkj_32 == rkj_3.id_break) {
            if (rkw_32.id_byte().id_break().id_super()) {
                return gM_2.FURNACE_FOOD;
            }
            return rkw_32.id_byte().id_break() instanceof rxJ_2 ? gM_2.FURNACE_BLOCKS : gM_2.FURNACE_MISC;
        }
        if (rkj_32 == rkj_3.id_byte) {
            return rkw_32.id_byte().id_break() instanceof rxJ_2 ? gM_2.BLAST_FURNACE_BLOCKS : gM_2.BLAST_FURNACE_MISC;
        }
        if (rkj_32 == rkj_3.id_protected) {
            return gM_2.SMOKER_FOOD;
        }
        if (rkj_32 == rkj_3.id_case) {
            return gM_2.STONECUTTER;
        }
        if (rkj_32 == rkj_3.id_throws) {
            return gM_2.CAMPFIRE;
        }
        if (rkj_32 == rkj_3.id_catch) {
            return gM_2.SMITHING;
        }
        Supplier[] supplierArray = new Supplier[2];
        supplierArray[0] = () -> rVL.b.id_break(rkw_32.id_catch());
        supplierArray[1] = rkw_32::id_case;
        id_byte.warn("Unknown recipe category: {}/{}", supplierArray);
        return gM_2.UNKNOWN;
    }
}

