/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rvY_2
extends Enum<rvY_2> {
    public static final /* enum */ rvY_2 ADD_PLAYER = new rvY_2();
    public static final /* enum */ rvY_2 UPDATE_GAME_MODE = new rvY_2();
    public static final /* enum */ rvY_2 UPDATE_LATENCY = new rvY_2();
    public static final /* enum */ rvY_2 UPDATE_DISPLAY_NAME = new rvY_2();
    public static final /* enum */ rvY_2 REMOVE_PLAYER = new rvY_2();
    private static final /* synthetic */ rvY_2[] $VALUES;

    static {
        $VALUES = rvY_2.id_class();
    }

    public static rvY_2[] values() {
        return (rvY_2[])$VALUES.clone();
    }

    public static rvY_2 valueOf(String string) {
        return Enum.valueOf(rvY_2.class, string);
    }

    private static /* synthetic */ rvY_2[] id_class() {
        return new rvY_2[]{ADD_PLAYER, UPDATE_GAME_MODE, UPDATE_LATENCY, UPDATE_DISPLAY_NAME, REMOVE_PLAYER};
    }
}

