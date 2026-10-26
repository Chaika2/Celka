/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rfU_2;

public final class rrGh_1
extends Enum<rrGh_1> {
    public static final /* enum */ rrGh_1 PLAYER = new rrGh_1(false);
    public static final /* enum */ rrGh_1 FRAME = new rrGh_1(true);
    public static final /* enum */ rrGh_1 RED_MARKER = new rrGh_1(false);
    public static final /* enum */ rrGh_1 BLUE_MARKER = new rrGh_1(false);
    public static final /* enum */ rrGh_1 TARGET_X = new rrGh_1(true);
    public static final /* enum */ rrGh_1 TARGET_POINT = new rrGh_1(true);
    public static final /* enum */ rrGh_1 PLAYER_OFF_MAP = new rrGh_1(false);
    public static final /* enum */ rrGh_1 PLAYER_OFF_LIMITS = new rrGh_1(false);
    public static final /* enum */ rrGh_1 MANSION = new rrGh_1(true, 5393476);
    public static final /* enum */ rrGh_1 MONUMENT = new rrGh_1(true, 3830373);
    public static final /* enum */ rrGh_1 BANNER_WHITE = new rrGh_1(true);
    public static final /* enum */ rrGh_1 BANNER_ORANGE = new rrGh_1(true);
    public static final /* enum */ rrGh_1 BANNER_MAGENTA = new rrGh_1(true);
    public static final /* enum */ rrGh_1 BANNER_LIGHT_BLUE = new rrGh_1(true);
    public static final /* enum */ rrGh_1 BANNER_YELLOW = new rrGh_1(true);
    public static final /* enum */ rrGh_1 BANNER_LIME = new rrGh_1(true);
    public static final /* enum */ rrGh_1 BANNER_PINK = new rrGh_1(true);
    public static final /* enum */ rrGh_1 BANNER_GRAY = new rrGh_1(true);
    public static final /* enum */ rrGh_1 BANNER_LIGHT_GRAY = new rrGh_1(true);
    public static final /* enum */ rrGh_1 BANNER_CYAN = new rrGh_1(true);
    public static final /* enum */ rrGh_1 BANNER_PURPLE = new rrGh_1(true);
    public static final /* enum */ rrGh_1 BANNER_BLUE = new rrGh_1(true);
    public static final /* enum */ rrGh_1 BANNER_BROWN = new rrGh_1(true);
    public static final /* enum */ rrGh_1 BANNER_GREEN = new rrGh_1(true);
    public static final /* enum */ rrGh_1 BANNER_RED = new rrGh_1(true);
    public static final /* enum */ rrGh_1 BANNER_BLACK = new rrGh_1(true);
    public static final /* enum */ rrGh_1 RED_X = new rrGh_1(true);
    private final byte icon = (byte)this.ordinal();
    private final boolean renderedOnFrame;
    private final int mapColor;
    private static final /* synthetic */ rrGh_1[] $VALUES;

    public boolean id_byte() {
        return this.mapColor >= 0;
    }

    private rrGh_1(boolean bl) {
        this(bl, -1);
    }

    private rrGh_1(boolean bl, int n2) {
        this.renderedOnFrame = bl;
        this.mapColor = n2;
    }

    static {
        $VALUES = rrGh_1.id_throws();
    }

    public static rrGh_1[] values() {
        return (rrGh_1[])$VALUES.clone();
    }

    public static rrGh_1 valueOf(String string) {
        return Enum.valueOf(rrGh_1.class, string);
    }

    public static rrGh_1 id_class(byte by) {
        return rrGh_1.values()[rfU_2.id_class((int)by, 0, rrGh_1.values().length - 1)];
    }

    public byte id_class() {
        return this.icon;
    }

    public boolean id_break() {
        return this.renderedOnFrame;
    }

    private static /* synthetic */ rrGh_1[] id_throws() {
        return new rrGh_1[]{PLAYER, FRAME, RED_MARKER, BLUE_MARKER, TARGET_X, TARGET_POINT, PLAYER_OFF_MAP, PLAYER_OFF_LIMITS, MANSION, MONUMENT, BANNER_WHITE, BANNER_ORANGE, BANNER_MAGENTA, BANNER_LIGHT_BLUE, BANNER_YELLOW, BANNER_LIME, BANNER_PINK, BANNER_GRAY, BANNER_LIGHT_GRAY, BANNER_CYAN, BANNER_PURPLE, BANNER_BLUE, BANNER_BROWN, BANNER_GREEN, BANNER_RED, BANNER_BLACK, RED_X};
    }

    public int id_protected() {
        return this.mapColor;
    }
}

