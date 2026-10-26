/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rrdn_1
extends Enum<rrdn_1> {
    public static final /* enum */ rrdn_1 NORMAL = new rrdn_1("_n");
    public static final /* enum */ rrdn_1 SPECULAR = new rrdn_1("_s");
    private String suffix;
    private static final /* synthetic */ rrdn_1[] $VALUES;

    private rrdn_1(String string2) {
        this.suffix = string2;
    }

    static {
        $VALUES = rrdn_1.id_break();
    }

    public static rrdn_1[] values() {
        return (rrdn_1[])$VALUES.clone();
    }

    public static rrdn_1 valueOf(String string) {
        return Enum.valueOf(rrdn_1.class, string);
    }

    public String id_class() {
        return this.suffix;
    }

    private static /* synthetic */ rrdn_1[] id_break() {
        return new rrdn_1[]{NORMAL, SPECULAR};
    }
}

