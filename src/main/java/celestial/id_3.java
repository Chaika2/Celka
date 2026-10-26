/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class id_3
extends Enum<id_3> {
    public static final /* enum */ id_3 ADDITION = new id_3(0);
    public static final /* enum */ id_3 MULTIPLY_BASE = new id_3(1);
    public static final /* enum */ id_3 MULTIPLY_TOTAL = new id_3(2);
    private static final id_3[] VALUES;
    private final int id;
    private static final /* synthetic */ id_3[] $VALUES;

    private id_3(int n2) {
        this.id = n2;
    }

    static {
        $VALUES = id_3.id_break();
        VALUES = new id_3[]{ADDITION, MULTIPLY_BASE, MULTIPLY_TOTAL};
    }

    public static id_3[] values() {
        return (id_3[])$VALUES.clone();
    }

    public static id_3 valueOf(String string) {
        return Enum.valueOf(id_3.class, string);
    }

    public int id_class() {
        return this.id;
    }

    public static id_3 id_class(int n) {
        if (n >= 0 && n < VALUES.length) {
            return VALUES[n];
        }
        throw new IllegalArgumentException("No operation with value " + n);
    }

    private static /* synthetic */ id_3[] id_break() {
        return new id_3[]{ADDITION, MULTIPLY_BASE, MULTIPLY_TOTAL};
    }
}

