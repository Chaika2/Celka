/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class FM
extends Enum<FM> {
    public static final /* enum */ FM PUT_ALL = new FM();
    public static final /* enum */ FM TAKE_ALL = new FM();
    public static final /* enum */ FM DROP_ALL = new FM();
    private static final /* synthetic */ FM[] $VALUES;

    static {
        $VALUES = FM.id_class();
    }

    public static FM[] values() {
        return (FM[])$VALUES.clone();
    }

    public static FM valueOf(String string) {
        return Enum.valueOf(FM.class, string);
    }

    private static /* synthetic */ FM[] id_class() {
        return new FM[]{PUT_ALL, TAKE_ALL, DROP_ALL};
    }
}

