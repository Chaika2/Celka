/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rrXC
extends Enum<rrXC> {
    public static final /* enum */ rrXC FLOAT = new rrXC();
    public static final /* enum */ rrXC FLOAT_ARRAY = new rrXC();
    public static final /* enum */ rrXC BOOL = new rrXC();
    private static final /* synthetic */ rrXC[] $VALUES;

    static {
        $VALUES = rrXC.id_class();
    }

    public static rrXC[] values() {
        return (rrXC[])$VALUES.clone();
    }

    public static rrXC valueOf(String string) {
        return Enum.valueOf(rrXC.class, string);
    }

    private static /* synthetic */ rrXC[] id_class() {
        return new rrXC[]{FLOAT, FLOAT_ARRAY, BOOL};
    }
}

