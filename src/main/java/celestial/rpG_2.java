/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rpG_2
extends Enum<rpG_2> {
    public static final /* enum */ rpG_2 POSITIVE = new rpG_2(1, "Towards positive");
    public static final /* enum */ rpG_2 NEGATIVE = new rpG_2(-1, "Towards negative");
    private final int offset;
    private final String description;
    private static final /* synthetic */ rpG_2[] $VALUES;

    private static /* synthetic */ rpG_2[] id_byte() {
        return new rpG_2[]{POSITIVE, NEGATIVE};
    }

    private rpG_2(int n2, String string2) {
        this.offset = n2;
        this.description = string2;
    }

    static {
        $VALUES = rpG_2.id_byte();
    }

    public String toString() {
        return this.description;
    }

    public static rpG_2[] values() {
        return (rpG_2[])$VALUES.clone();
    }

    public static rpG_2 valueOf(String string) {
        return Enum.valueOf(rpG_2.class, string);
    }

    public int id_class() {
        return this.offset;
    }

    public rpG_2 id_break() {
        return this == POSITIVE ? NEGATIVE : POSITIVE;
    }
}

