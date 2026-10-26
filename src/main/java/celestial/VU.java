/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.VD;

public final class VU
extends Enum<VU>
implements VD {
    public static final /* enum */ VU NORMAL = new VU(false);
    public static final /* enum */ VU ADVANCED = new VU(true);
    private final boolean isAdvanced;
    private static final /* synthetic */ VU[] $VALUES;

    private VU(boolean bl) {
        this.isAdvanced = bl;
    }

    static {
        $VALUES = VU.id_break();
    }

    public static VU[] values() {
        return (VU[])$VALUES.clone();
    }

    public static VU valueOf(String string) {
        return Enum.valueOf(VU.class, string);
    }

    @Override
    public boolean id_class() {
        return this.isAdvanced;
    }

    private static /* synthetic */ VU[] id_break() {
        return new VU[]{NORMAL, ADVANCED};
    }
}

