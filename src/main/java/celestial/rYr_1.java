/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rYr_1
extends Enum<rYr_1> {
    public static final /* enum */ rYr_1 EXTREMELY_HIGH = new rYr_1(-3);
    public static final /* enum */ rYr_1 VERY_HIGH = new rYr_1(-2);
    public static final /* enum */ rYr_1 HIGH = new rYr_1(-1);
    public static final /* enum */ rYr_1 NORMAL = new rYr_1(0);
    public static final /* enum */ rYr_1 LOW = new rYr_1(1);
    public static final /* enum */ rYr_1 VERY_LOW = new rYr_1(2);
    public static final /* enum */ rYr_1 EXTREMELY_LOW = new rYr_1(3);
    private final int priority;
    private static final /* synthetic */ rYr_1[] $VALUES;

    private rYr_1(int n2) {
        this.priority = n2;
    }

    static {
        $VALUES = rYr_1.id_break();
    }

    public static rYr_1[] values() {
        return (rYr_1[])$VALUES.clone();
    }

    public static rYr_1 valueOf(String string) {
        return Enum.valueOf(rYr_1.class, string);
    }

    public static rYr_1 id_class(int n) {
        for (rYr_1 rYr_12 : rYr_1.values()) {
            if (rYr_12.priority != n) continue;
            return rYr_12;
        }
        return n < rYr_1.EXTREMELY_HIGH.priority ? EXTREMELY_HIGH : EXTREMELY_LOW;
    }

    public int id_class() {
        return this.priority;
    }

    private static /* synthetic */ rYr_1[] id_break() {
        return new rYr_1[]{EXTREMELY_HIGH, VERY_HIGH, HIGH, NORMAL, LOW, VERY_LOW, EXTREMELY_LOW};
    }
}

