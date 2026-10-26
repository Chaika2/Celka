/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rpH_2;

public final class zf_3
extends Enum<zf_3>
implements rpH_2 {
    public static final /* enum */ zf_3 NONE = new zf_3("none");
    public static final /* enum */ zf_3 LOW = new zf_3("low");
    public static final /* enum */ zf_3 TALL = new zf_3("tall");
    private final String heightName;
    private static final /* synthetic */ zf_3[] $VALUES;

    private zf_3(String string2) {
        this.heightName = string2;
    }

    static {
        $VALUES = zf_3.id_break();
    }

    public String toString() {
        return this.id_class();
    }

    public static zf_3[] values() {
        return (zf_3[])$VALUES.clone();
    }

    public static zf_3 valueOf(String string) {
        return Enum.valueOf(zf_3.class, string);
    }

    @Override
    public String id_class() {
        return this.heightName;
    }

    private static /* synthetic */ zf_3[] id_break() {
        return new zf_3[]{NONE, LOW, TALL};
    }
}

