/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class iG_2
extends Enum<iG_2> {
    public static final /* enum */ iG_2 SELF = new iG_2();
    public static final /* enum */ iG_2 PLAYER = new iG_2();
    public static final /* enum */ iG_2 PISTON = new iG_2();
    public static final /* enum */ iG_2 SHULKER_BOX = new iG_2();
    public static final /* enum */ iG_2 SHULKER = new iG_2();
    private static final /* synthetic */ iG_2[] $VALUES;

    static {
        $VALUES = iG_2.id_class();
    }

    public static iG_2[] values() {
        return (iG_2[])$VALUES.clone();
    }

    public static iG_2 valueOf(String string) {
        return Enum.valueOf(iG_2.class, string);
    }

    private static /* synthetic */ iG_2[] id_class() {
        return new iG_2[]{SELF, PLAYER, PISTON, SHULKER_BOX, SHULKER};
    }
}

