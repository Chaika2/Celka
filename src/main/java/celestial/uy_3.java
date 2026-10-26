/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.uq_3;

public final class uy_3
extends Enum<uy_3> {
    public static final /* enum */ uy_3 HORIZONTAL = new uy_3();
    public static final /* enum */ uy_3 VERTICAL = new uy_3();
    private static final /* synthetic */ uy_3[] $VALUES;

    public uq_3 id_byte() {
        return switch (this) {
            default -> throw new IncompatibleClassChangeError();
            case HORIZONTAL -> uq_3.LEFT;
            case VERTICAL -> uq_3.UP;
        };
    }

    static {
        $VALUES = uy_3.id_protected();
    }

    public static uy_3[] values() {
        return (uy_3[])$VALUES.clone();
    }

    public static uy_3 valueOf(String string) {
        return Enum.valueOf(uy_3.class, string);
    }

    public uq_3 id_class(boolean bl) {
        return bl ? this.id_break() : this.id_byte();
    }

    public uy_3 id_class() {
        return switch (this) {
            default -> throw new IncompatibleClassChangeError();
            case HORIZONTAL -> VERTICAL;
            case VERTICAL -> HORIZONTAL;
        };
    }

    public uq_3 id_break() {
        return switch (this) {
            default -> throw new IncompatibleClassChangeError();
            case HORIZONTAL -> uq_3.RIGHT;
            case VERTICAL -> uq_3.DOWN;
        };
    }

    private static /* synthetic */ uy_3[] id_protected() {
        return new uy_3[]{HORIZONTAL, VERTICAL};
    }
}

