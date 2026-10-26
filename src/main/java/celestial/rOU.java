/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.util.Arrays;
import java.util.Comparator;

public final class rOU
extends Enum<rOU> {
    public static final /* enum */ rOU WHITE = new rOU(0);
    public static final /* enum */ rOU CREAMY = new rOU(1);
    public static final /* enum */ rOU CHESTNUT = new rOU(2);
    public static final /* enum */ rOU BROWN = new rOU(3);
    public static final /* enum */ rOU BLACK = new rOU(4);
    public static final /* enum */ rOU GRAY = new rOU(5);
    public static final /* enum */ rOU DARKBROWN = new rOU(6);
    private static final rOU[] VALUES;
    private final int id;
    private static final /* synthetic */ rOU[] $VALUES;

    private rOU(int n2) {
        this.id = n2;
    }

    static {
        $VALUES = rOU.id_break();
        VALUES = (rOU[])Arrays.stream(rOU.values()).sorted(Comparator.comparingInt(rOU::id_class)).toArray(rOU[]::new);
    }

    public static rOU[] values() {
        return (rOU[])$VALUES.clone();
    }

    public static rOU valueOf(String string) {
        return Enum.valueOf(rOU.class, string);
    }

    public static rOU id_class(int n) {
        return VALUES[n % VALUES.length];
    }

    public int id_class() {
        return this.id;
    }

    private static /* synthetic */ rOU[] id_break() {
        return new rOU[]{WHITE, CREAMY, CHESTNUT, BROWN, BLACK, GRAY, DARKBROWN};
    }
}

