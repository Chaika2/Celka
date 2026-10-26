/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rfU_2;
import java.util.Arrays;
import java.util.Comparator;

public final class VX
extends Enum<VX> {
    public static final /* enum */ VX OFF = new VX(0, "options.off");
    public static final /* enum */ VX CROSSHAIR = new VX(1, "options.attack.crosshair");
    public static final /* enum */ VX HOTBAR = new VX(2, "options.attack.hotbar");
    private static final VX[] BY_ID;
    private final int id;
    private final String resourceKey;
    private static final /* synthetic */ VX[] $VALUES;

    private static /* synthetic */ VX[] id_byte() {
        return new VX[]{OFF, CROSSHAIR, HOTBAR};
    }

    private VX(int n2, String string2) {
        this.id = n2;
        this.resourceKey = string2;
    }

    static {
        $VALUES = VX.id_byte();
        BY_ID = (VX[])Arrays.stream(VX.values()).sorted(Comparator.comparingInt(VX::id_class)).toArray(VX[]::new);
    }

    public static VX[] values() {
        return (VX[])$VALUES.clone();
    }

    public static VX valueOf(String string) {
        return Enum.valueOf(VX.class, string);
    }

    public int id_class() {
        return this.id;
    }

    public static VX id_class(int n) {
        return BY_ID[rfU_2.id_break(n, BY_ID.length)];
    }

    public String id_break() {
        return this.resourceKey;
    }
}

