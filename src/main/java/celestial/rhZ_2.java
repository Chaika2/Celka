/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rhZ_2
extends Enum<rhZ_2> {
    public static final /* enum */ rhZ_2 DISALLOWED = new rhZ_2();
    public static final /* enum */ rhZ_2 ALLOWED = new rhZ_2();
    public static final /* enum */ rhZ_2 CREATIVE_ONLY = new rhZ_2();
    private static final /* synthetic */ rhZ_2[] $VALUES;

    static {
        $VALUES = rhZ_2.id_class();
    }

    public static rhZ_2[] values() {
        return (rhZ_2[])$VALUES.clone();
    }

    public static rhZ_2 valueOf(String string) {
        return Enum.valueOf(rhZ_2.class, string);
    }

    private static /* synthetic */ rhZ_2[] id_class() {
        return new rhZ_2[]{DISALLOWED, ALLOWED, CREATIVE_ONLY};
    }

    public static rhZ_2 id_class(int n) {
        if (n < 0 || n > rhZ_2.values().length) {
            n = 0;
        }
        return rhZ_2.values()[n];
    }
}

