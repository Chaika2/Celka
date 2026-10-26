/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class He_1
extends Enum<He_1> {
    public static final /* enum */ He_1 NONE = new He_1("none");
    public static final /* enum */ He_1 IS_OUTLINE = new He_1("is_outline");
    public static final /* enum */ He_1 AFFECTS_OUTLINE = new He_1("affects_outline");
    private final String name;
    private static final /* synthetic */ He_1[] $VALUES;

    private He_1(String string2) {
        this.name = string2;
    }

    static {
        $VALUES = He_1.id_class();
    }

    public String toString() {
        return this.name;
    }

    public static He_1[] values() {
        return (He_1[])$VALUES.clone();
    }

    public static He_1 valueOf(String string) {
        return Enum.valueOf(He_1.class, string);
    }

    private static /* synthetic */ He_1[] id_class() {
        return new He_1[]{NONE, IS_OUTLINE, AFFECTS_OUTLINE};
    }
}

