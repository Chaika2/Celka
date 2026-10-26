/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rKv_1;
import celestial.rpH_2;
import celestial.rrPA;
import celestial.rrPh_1;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public final class rem_3
extends Enum<rem_3>
implements rpH_2 {
    public static final /* enum */ rem_3 TERRAIN_MATCHING = new rem_3("terrain_matching", (ImmutableList<rrPA>)ImmutableList.of((Object)new rrPh_1(rKv_1.WORLD_SURFACE_WG, -1)));
    public static final /* enum */ rem_3 RIGID = new rem_3("rigid", (ImmutableList<rrPA>)ImmutableList.of());
    public static final Codec<rem_3> field_236858_c_;
    private static final Map<String, rem_3> BEHAVIOURS;
    private final String name;
    private final ImmutableList<rrPA> structureProcessors;
    private static final /* synthetic */ rem_3[] $VALUES;

    public ImmutableList<rrPA> id_byte() {
        return this.structureProcessors;
    }

    private rem_3(String string2, ImmutableList<rrPA> immutableList) {
        this.name = string2;
        this.structureProcessors = immutableList;
    }

    static {
        $VALUES = rem_3.id_protected();
        field_236858_c_ = rpH_2.id_class(rem_3::values, rem_3::id_class);
        BEHAVIOURS = Arrays.stream(rem_3.values()).collect(Collectors.toMap(rem_3::id_break, rem_32 -> rem_32));
    }

    public static rem_3[] values() {
        return (rem_3[])$VALUES.clone();
    }

    public static rem_3 valueOf(String string) {
        return Enum.valueOf(rem_3.class, string);
    }

    @Override
    public String id_class() {
        return this.name;
    }

    public static rem_3 id_class(String string) {
        return BEHAVIOURS.get(string);
    }

    public String id_break() {
        return this.name;
    }

    private static /* synthetic */ rem_3[] id_protected() {
        return new rem_3[]{TERRAIN_MATCHING, RIGID};
    }
}

