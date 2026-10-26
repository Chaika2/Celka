/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntComparator
 */
package celestial;

import celestial.uy_3;
import it.unimi.dsi.fastutil.ints.IntComparator;

public final class uq_3
extends Enum<uq_3> {
    public static final /* enum */ uq_3 UP = new uq_3();
    public static final /* enum */ uq_3 DOWN = new uq_3();
    public static final /* enum */ uq_3 LEFT = new uq_3();
    public static final /* enum */ uq_3 RIGHT = new uq_3();
    private final IntComparator coordinateValueComparator = (n, n2) -> n == n2 ? 0 : (this.id_break(n, n2) ? -1 : 1);
    private static final /* synthetic */ uq_3[] $VALUES;

    public boolean id_byte() {
        return switch (this) {
            default -> throw new IncompatibleClassChangeError();
            case UP, LEFT -> false;
            case DOWN, RIGHT -> true;
        };
    }

    static {
        $VALUES = uq_3.id_throws();
    }

    public static uq_3[] values() {
        return (uq_3[])$VALUES.clone();
    }

    public static uq_3 valueOf(String string) {
        return Enum.valueOf(uq_3.class, string);
    }

    public boolean id_class(int n, int n2) {
        return this.id_byte() ? n > n2 : n2 > n;
    }

    public uy_3 id_class() {
        return switch (this) {
            default -> throw new IncompatibleClassChangeError();
            case UP, DOWN -> uy_3.VERTICAL;
            case LEFT, RIGHT -> uy_3.HORIZONTAL;
        };
    }

    public uq_3 id_break() {
        return switch (this) {
            default -> throw new IncompatibleClassChangeError();
            case UP -> DOWN;
            case DOWN -> UP;
            case LEFT -> RIGHT;
            case RIGHT -> LEFT;
        };
    }

    public boolean id_break(int n, int n2) {
        return this.id_byte() ? n < n2 : n2 < n;
    }

    private static /* synthetic */ uq_3[] id_throws() {
        return new uq_3[]{UP, DOWN, LEFT, RIGHT};
    }

    public IntComparator id_protected() {
        return this.coordinateValueComparator;
    }
}

