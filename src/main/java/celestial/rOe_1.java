/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.util.Arrays;
import java.util.Comparator;

public final class rOe_1
extends Enum<rOe_1> {
    public static final /* enum */ rOe_1 NONE = new rOe_1(0);
    public static final /* enum */ rOe_1 WHITE = new rOe_1(1);
    public static final /* enum */ rOe_1 WHITE_FIELD = new rOe_1(2);
    public static final /* enum */ rOe_1 WHITE_DOTS = new rOe_1(3);
    public static final /* enum */ rOe_1 BLACK_DOTS = new rOe_1(4);
    private static final rOe_1[] VALUES;
    private final int id;
    private static final /* synthetic */ rOe_1[] $VALUES;

    private rOe_1(int n2) {
        this.id = n2;
    }

    static {
        $VALUES = rOe_1.id_break();
        VALUES = (rOe_1[])Arrays.stream(rOe_1.values()).sorted(Comparator.comparingInt(rOe_1::id_class)).toArray(rOe_1[]::new);
    }

    public static rOe_1[] values() {
        return (rOe_1[])$VALUES.clone();
    }

    public static rOe_1 valueOf(String string) {
        return Enum.valueOf(rOe_1.class, string);
    }

    public static rOe_1 id_class(int n) {
        return VALUES[n % VALUES.length];
    }

    public int id_class() {
        return this.id;
    }

    private static /* synthetic */ rOe_1[] id_break() {
        return new rOe_1[]{NONE, WHITE, WHITE_FIELD, WHITE_DOTS, BLACK_DOTS};
    }
}

