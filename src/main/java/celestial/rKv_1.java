/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.kZ_2;
import celestial.rKF;
import celestial.rKZ;
import celestial.rpH_2;
import celestial.rqR_2;
import celestial.xc_3;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.Map;
import java.util.function.Predicate;

public final class rKv_1
extends Enum<rKv_1>
implements rpH_2 {
    public static final /* enum */ rKv_1 WORLD_SURFACE_WG = new rKv_1("WORLD_SURFACE_WG", rKF.WORLDGEN, rKZ.id_class);
    public static final /* enum */ rKv_1 WORLD_SURFACE = new rKv_1("WORLD_SURFACE", rKF.CLIENT, rKZ.id_class);
    public static final /* enum */ rKv_1 OCEAN_FLOOR_WG = new rKv_1("OCEAN_FLOOR_WG", rKF.WORLDGEN, rKZ.id_break);
    public static final /* enum */ rKv_1 OCEAN_FLOOR = new rKv_1("OCEAN_FLOOR", rKF.LIVE_WORLD, rKZ.id_break);
    public static final /* enum */ rKv_1 MOTION_BLOCKING = new rKv_1("MOTION_BLOCKING", rKF.CLIENT, xc_32 -> xc_32.id_byte().id_byte() || !xc_32.id_volatile().id_byte());
    public static final /* enum */ rKv_1 MOTION_BLOCKING_NO_LEAVES = new rKv_1("MOTION_BLOCKING_NO_LEAVES", rKF.LIVE_WORLD, xc_32 -> (xc_32.id_byte().id_byte() || !xc_32.id_volatile().id_byte()) && !(xc_32.id_break() instanceof kZ_2));
    public static final Codec<rKv_1> field_236078_g_;
    private final String id;
    private final rKF usage;
    private final Predicate<xc_3> heightLimitPredicate;
    private static final Map<String, rKv_1> BY_ID;
    private static final /* synthetic */ rKv_1[] $VALUES;

    public boolean id_byte() {
        return this.usage == rKF.CLIENT;
    }

    private rKv_1(String string2, rKF rKF2, Predicate<xc_3> predicate) {
        this.id = string2;
        this.usage = rKF2;
        this.heightLimitPredicate = predicate;
    }

    static {
        $VALUES = rKv_1.id_case();
        field_236078_g_ = rpH_2.id_class(rKv_1::values, rKv_1::id_class);
        BY_ID = rqR_2.id_class(Maps.newHashMap(), (T hashMap) -> {
            for (rKv_1 rKv_12 : rKv_1.values()) {
                hashMap.put(rKv_12.id, rKv_12);
            }
        });
    }

    public static rKv_1[] values() {
        return (rKv_1[])$VALUES.clone();
    }

    public static rKv_1 valueOf(String string) {
        return Enum.valueOf(rKv_1.class, string);
    }

    @Override
    public String id_class() {
        return this.id;
    }

    public static rKv_1 id_class(String string) {
        return BY_ID.get(string);
    }

    public String id_break() {
        return this.id;
    }

    public Predicate<xc_3> id_throws() {
        return this.heightLimitPredicate;
    }

    private static /* synthetic */ rKv_1[] id_case() {
        return new rKv_1[]{WORLD_SURFACE_WG, WORLD_SURFACE, OCEAN_FLOOR_WG, OCEAN_FLOOR, MOTION_BLOCKING, MOTION_BLOCKING_NO_LEAVES};
    }

    public boolean id_protected() {
        return this.usage != rKF.WORLDGEN;
    }
}

