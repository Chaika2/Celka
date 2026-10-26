/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class gq_3
extends Enum<gq_3> {
    public static final /* enum */ gq_3 ALL = new gq_3(true, true);
    public static final /* enum */ gq_3 DEDICATED = new gq_3(false, true);
    public static final /* enum */ gq_3 INTEGRATED = new gq_3(true, false);
    public final boolean field_237219_d_;
    public final boolean field_237220_e_;
    private static final /* synthetic */ gq_3[] $VALUES;

    private gq_3(boolean bl, boolean bl2) {
        this.field_237219_d_ = bl;
        this.field_237220_e_ = bl2;
    }

    static {
        $VALUES = gq_3.id_class();
    }

    public static gq_3[] values() {
        return (gq_3[])$VALUES.clone();
    }

    public static gq_3 valueOf(String string) {
        return Enum.valueOf(gq_3.class, string);
    }

    private static /* synthetic */ gq_3[] id_class() {
        return new gq_3[]{ALL, DEDICATED, INTEGRATED};
    }
}

