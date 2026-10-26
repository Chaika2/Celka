/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rgF_2;

public final class rde_3
extends Enum<rde_3> {
    public static final /* enum */ rde_3 COMMON = new rde_3(rgF_2.WHITE);
    public static final /* enum */ rde_3 UNCOMMON = new rde_3(rgF_2.YELLOW);
    public static final /* enum */ rde_3 RARE = new rde_3(rgF_2.AQUA);
    public static final /* enum */ rde_3 EPIC = new rde_3(rgF_2.LIGHT_PURPLE);
    public final rgF_2 color;
    private static final /* synthetic */ rde_3[] $VALUES;

    private rde_3(rgF_2 rgF_22) {
        this.color = rgF_22;
    }

    static {
        $VALUES = rde_3.id_class();
    }

    public static rde_3[] values() {
        return (rde_3[])$VALUES.clone();
    }

    public static rde_3 valueOf(String string) {
        return Enum.valueOf(rde_3.class, string);
    }

    private static /* synthetic */ rde_3[] id_class() {
        return new rde_3[]{COMMON, UNCOMMON, RARE, EPIC};
    }
}

