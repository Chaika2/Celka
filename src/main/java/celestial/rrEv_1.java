/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rrEv_1
extends Enum<rrEv_1> {
    public static final /* enum */ rrEv_1 PRE_UPDATE = new rrEv_1();
    public static final /* enum */ rrEv_1 POST_UPDATE = new rrEv_1();
    private static final /* synthetic */ rrEv_1[] $VALUES;

    static {
        $VALUES = rrEv_1.id_class();
    }

    public static rrEv_1[] values() {
        return (rrEv_1[])$VALUES.clone();
    }

    public static rrEv_1 valueOf(String string) {
        return Enum.valueOf(rrEv_1.class, string);
    }

    private static /* synthetic */ rrEv_1[] id_class() {
        return new rrEv_1[]{PRE_UPDATE, POST_UPDATE};
    }
}

