/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class DE
extends Enum<DE> {
    public static final /* enum */ DE R0 = new DE(0);
    public static final /* enum */ DE R90 = new DE(90);
    public static final /* enum */ DE R180 = new DE(180);
    public static final /* enum */ DE R270 = new DE(270);
    public final int field_240208_e_;
    private static final /* synthetic */ DE[] $VALUES;

    private DE(int n2) {
        this.field_240208_e_ = n2;
    }

    static {
        $VALUES = DE.id_class();
    }

    public static DE[] values() {
        return (DE[])$VALUES.clone();
    }

    public static DE valueOf(String string) {
        return Enum.valueOf(DE.class, string);
    }

    private static /* synthetic */ DE[] id_class() {
        return new DE[]{R0, R90, R180, R270};
    }
}

