/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rpr_3;

public final class Im_1
extends Enum<Im_1> {
    public static final /* enum */ Im_1 UP = new Im_1(rpr_3.UP, 0, -1);
    public static final /* enum */ Im_1 DOWN = new Im_1(rpr_3.DOWN, 0, 1);
    public static final /* enum */ Im_1 LEFT = new Im_1(rpr_3.EAST, -1, 0);
    public static final /* enum */ Im_1 RIGHT = new Im_1(rpr_3.WEST, 1, 0);
    private final rpr_3 facing;
    private final int xOffset;
    private final int yOffset;
    private static final /* synthetic */ Im_1[] $VALUES;

    public int id_byte() {
        return this.yOffset;
    }

    private Im_1(rpr_3 rpr_32, int n2, int n3) {
        this.facing = rpr_32;
        this.xOffset = n2;
        this.yOffset = n3;
    }

    static {
        $VALUES = Im_1.id_throws();
    }

    public static Im_1[] values() {
        return (Im_1[])$VALUES.clone();
    }

    public static Im_1 valueOf(String string) {
        return Enum.valueOf(Im_1.class, string);
    }

    public rpr_3 id_class() {
        return this.facing;
    }

    public int id_break() {
        return this.xOffset;
    }

    private static /* synthetic */ Im_1[] id_throws() {
        return new Im_1[]{UP, DOWN, LEFT, RIGHT};
    }

    public boolean id_protected() {
        return this == DOWN || this == UP;
    }
}

