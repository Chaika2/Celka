/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class wi_3
extends Enum<wi_3> {
    public static final /* enum */ wi_3 FRONT = new wi_3("front");
    public static final /* enum */ wi_3 SIDE = new wi_3("side");
    private final String name;
    private static final /* synthetic */ wi_3[] $VALUES;

    private wi_3(String string2) {
        this.name = string2;
    }

    static {
        $VALUES = wi_3.id_break();
    }

    public static wi_3[] values() {
        return (wi_3[])$VALUES.clone();
    }

    public static wi_3 valueOf(String string) {
        return Enum.valueOf(wi_3.class, string);
    }

    public static wi_3 id_class(String string) {
        for (wi_3 wi_32 : wi_3.values()) {
            if (!wi_32.name.equals(string)) continue;
            return wi_32;
        }
        throw new IllegalArgumentException("Invalid gui light: " + string);
    }

    public boolean id_class() {
        return this == SIDE;
    }

    private static /* synthetic */ wi_3[] id_break() {
        return new wi_3[]{FRONT, SIDE};
    }
}

