/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableMap
 */
package celestial;

import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rke_3;
import celestial.xu_3;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public final class gM_2
extends Enum<gM_2> {
    public static final /* enum */ gM_2 CRAFTING_SEARCH = new gM_2(new rdn_3(rdy_3.Xx));
    public static final /* enum */ gM_2 CRAFTING_BUILDING_BLOCKS = new gM_2(new rdn_3(xu_3.rI));
    public static final /* enum */ gM_2 CRAFTING_REDSTONE = new gM_2(new rdn_3(rdy_3.hD));
    public static final /* enum */ gM_2 CRAFTING_EQUIPMENT = new gM_2(new rdn_3(rdy_3.OT), new rdn_3(rdy_3.OA));
    public static final /* enum */ gM_2 CRAFTING_MISC = new gM_2(new rdn_3(rdy_3.hY), new rdn_3(rdy_3.Ob));
    public static final /* enum */ gM_2 FURNACE_SEARCH = new gM_2(new rdn_3(rdy_3.Xx));
    public static final /* enum */ gM_2 FURNACE_FOOD = new gM_2(new rdn_3(rdy_3.hC));
    public static final /* enum */ gM_2 FURNACE_BLOCKS = new gM_2(new rdn_3(xu_3.id_break));
    public static final /* enum */ gM_2 FURNACE_MISC = new gM_2(new rdn_3(rdy_3.hY), new rdn_3(rdy_3.dP));
    public static final /* enum */ gM_2 BLAST_FURNACE_SEARCH = new gM_2(new rdn_3(rdy_3.Xx));
    public static final /* enum */ gM_2 BLAST_FURNACE_BLOCKS = new gM_2(new rdn_3(xu_3.Pl));
    public static final /* enum */ gM_2 BLAST_FURNACE_MISC = new gM_2(new rdn_3(rdy_3.Op), new rdn_3(rdy_3.hm));
    public static final /* enum */ gM_2 SMOKER_SEARCH = new gM_2(new rdn_3(rdy_3.Xx));
    public static final /* enum */ gM_2 SMOKER_FOOD = new gM_2(new rdn_3(rdy_3.hC));
    public static final /* enum */ gM_2 STONECUTTER = new gM_2(new rdn_3(rdy_3.BV));
    public static final /* enum */ gM_2 SMITHING = new gM_2(new rdn_3(rdy_3.hF));
    public static final /* enum */ gM_2 CAMPFIRE = new gM_2(new rdn_3(rdy_3.hC));
    public static final /* enum */ gM_2 UNKNOWN = new gM_2(new rdn_3(rdy_3.sV));
    public static final List<gM_2> field_243231_s;
    public static final List<gM_2> field_243232_t;
    public static final List<gM_2> field_243233_u;
    public static final List<gM_2> field_243234_v;
    public static final Map<gM_2, List<gM_2>> field_243235_w;
    private final List<rdn_3> icons;
    private static final /* synthetic */ gM_2[] $VALUES;

    private gM_2(rdn_3 ... rdn_3Array) {
        this.icons = ImmutableList.copyOf((Object[])rdn_3Array);
    }

    static {
        $VALUES = gM_2.id_break();
        field_243231_s = ImmutableList.of((Object)((Object)SMOKER_SEARCH), (Object)((Object)SMOKER_FOOD));
        field_243232_t = ImmutableList.of((Object)((Object)BLAST_FURNACE_SEARCH), (Object)((Object)BLAST_FURNACE_BLOCKS), (Object)((Object)BLAST_FURNACE_MISC));
        field_243233_u = ImmutableList.of((Object)((Object)FURNACE_SEARCH), (Object)((Object)FURNACE_FOOD), (Object)((Object)FURNACE_BLOCKS), (Object)((Object)FURNACE_MISC));
        field_243234_v = ImmutableList.of((Object)((Object)CRAFTING_SEARCH), (Object)((Object)CRAFTING_EQUIPMENT), (Object)((Object)CRAFTING_BUILDING_BLOCKS), (Object)((Object)CRAFTING_MISC), (Object)((Object)CRAFTING_REDSTONE));
        field_243235_w = ImmutableMap.of((Object)((Object)CRAFTING_SEARCH), (Object)ImmutableList.of((Object)((Object)CRAFTING_EQUIPMENT), (Object)((Object)CRAFTING_BUILDING_BLOCKS), (Object)((Object)CRAFTING_MISC), (Object)((Object)CRAFTING_REDSTONE)), (Object)((Object)FURNACE_SEARCH), (Object)ImmutableList.of((Object)((Object)FURNACE_FOOD), (Object)((Object)FURNACE_BLOCKS), (Object)((Object)FURNACE_MISC)), (Object)((Object)BLAST_FURNACE_SEARCH), (Object)ImmutableList.of((Object)((Object)BLAST_FURNACE_BLOCKS), (Object)((Object)BLAST_FURNACE_MISC)), (Object)((Object)SMOKER_SEARCH), (Object)ImmutableList.of((Object)((Object)SMOKER_FOOD)));
    }

    public static gM_2[] values() {
        return (gM_2[])$VALUES.clone();
    }

    public static gM_2 valueOf(String string) {
        return Enum.valueOf(gM_2.class, string);
    }

    public static List<gM_2> id_class(rke_3 rke_32) {
        switch (rke_32) {
            case CRAFTING: {
                return field_243234_v;
            }
            case FURNACE: {
                return field_243233_u;
            }
            case BLAST_FURNACE: {
                return field_243232_t;
            }
            case SMOKER: {
                return field_243231_s;
            }
        }
        return ImmutableList.of();
    }

    public List<rdn_3> id_class() {
        return this.icons;
    }

    private static /* synthetic */ gM_2[] id_break() {
        return new gM_2[]{CRAFTING_SEARCH, CRAFTING_BUILDING_BLOCKS, CRAFTING_REDSTONE, CRAFTING_EQUIPMENT, CRAFTING_MISC, FURNACE_SEARCH, FURNACE_FOOD, FURNACE_BLOCKS, FURNACE_MISC, BLAST_FURNACE_SEARCH, BLAST_FURNACE_BLOCKS, BLAST_FURNACE_MISC, SMOKER_SEARCH, SMOKER_FOOD, STONECUTTER, SMITHING, CAMPFIRE, UNKNOWN};
    }
}

