/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public final class riI_2
extends Enum<riI_2> {
    public static final /* enum */ riI_2 ON_LAND_SURFACE = new riI_2("on_land_surface");
    public static final /* enum */ riI_2 PARTLY_BURIED = new riI_2("partly_buried");
    public static final /* enum */ riI_2 ON_OCEAN_FLOOR = new riI_2("on_ocean_floor");
    public static final /* enum */ riI_2 IN_MOUNTAIN = new riI_2("in_mountain");
    public static final /* enum */ riI_2 UNDERGROUND = new riI_2("underground");
    public static final /* enum */ riI_2 IN_NETHER = new riI_2("in_nether");
    private static final Map<String, riI_2> field_237038_g_;
    private final String field_237039_h_;
    private static final /* synthetic */ riI_2[] $VALUES;

    private riI_2(String string2) {
        this.field_237039_h_ = string2;
    }

    static {
        $VALUES = riI_2.id_break();
        field_237038_g_ = Arrays.stream(riI_2.values()).collect(Collectors.toMap(riI_2::id_class, riI_22 -> riI_22));
    }

    public static riI_2[] values() {
        return (riI_2[])$VALUES.clone();
    }

    public static riI_2 valueOf(String string) {
        return Enum.valueOf(riI_2.class, string);
    }

    public static riI_2 id_class(String string) {
        return field_237038_g_.get(string);
    }

    public String id_class() {
        return this.field_237039_h_;
    }

    private static /* synthetic */ riI_2[] id_break() {
        return new riI_2[]{ON_LAND_SURFACE, PARTLY_BURIED, ON_OCEAN_FLOOR, IN_MOUNTAIN, UNDERGROUND, IN_NETHER};
    }
}

