/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class oM_2
extends Enum<oM_2> {
    public static final /* enum */ oM_2 FORCE = new oM_2(true);
    public static final /* enum */ oM_2 MOVE = new oM_2(true);
    public static final /* enum */ oM_2 NORMAL = new oM_2(false);
    private final boolean allowOverlap;
    private static final /* synthetic */ oM_2[] $VALUES;

    private oM_2(boolean bl) {
        this.allowOverlap = bl;
    }

    static {
        $VALUES = oM_2.id_break();
    }

    public static oM_2[] values() {
        return (oM_2[])$VALUES.clone();
    }

    public static oM_2 valueOf(String string) {
        return Enum.valueOf(oM_2.class, string);
    }

    public boolean id_class() {
        return this.allowOverlap;
    }

    private static /* synthetic */ oM_2[] id_break() {
        return new oM_2[]{FORCE, MOVE, NORMAL};
    }
}

