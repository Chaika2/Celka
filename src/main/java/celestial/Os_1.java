/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class Os_1
extends Enum<Os_1> {
    public static final /* enum */ Os_1 BASE = new Os_1();
    public static final /* enum */ Os_1 EXT = new Os_1();
    public static final /* enum */ Os_1 NONE = new Os_1();
    private static final /* synthetic */ Os_1[] $VALUES;

    static {
        $VALUES = Os_1.id_class();
    }

    public static Os_1[] values() {
        return (Os_1[])$VALUES.clone();
    }

    public static Os_1 valueOf(String string) {
        return Enum.valueOf(Os_1.class, string);
    }

    private static /* synthetic */ Os_1[] id_class() {
        return new Os_1[]{BASE, EXT, NONE};
    }
}

