/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.util.Arrays;
import java.util.Comparator;

public final class rxV_2
extends Enum<rxV_2> {
    public static final /* enum */ rxV_2 SMALL_BALL = new rxV_2(0, "small_ball");
    public static final /* enum */ rxV_2 LARGE_BALL = new rxV_2(1, "large_ball");
    public static final /* enum */ rxV_2 STAR = new rxV_2(2, "star");
    public static final /* enum */ rxV_2 CREEPER = new rxV_2(3, "creeper");
    public static final /* enum */ rxV_2 BURST = new rxV_2(4, "burst");
    private static final rxV_2[] VALUES;
    private final int index;
    private final String shapeName;
    private static final /* synthetic */ rxV_2[] $VALUES;

    private static /* synthetic */ rxV_2[] id_byte() {
        return new rxV_2[]{SMALL_BALL, LARGE_BALL, STAR, CREEPER, BURST};
    }

    private rxV_2(int n2, String string2) {
        this.index = n2;
        this.shapeName = string2;
    }

    static {
        $VALUES = rxV_2.id_byte();
        VALUES = (rxV_2[])Arrays.stream(rxV_2.values()).sorted(Comparator.comparingInt(rxV_22 -> rxV_22.index)).toArray(rxV_2[]::new);
    }

    public static rxV_2[] values() {
        return (rxV_2[])$VALUES.clone();
    }

    public static rxV_2 valueOf(String string) {
        return Enum.valueOf(rxV_2.class, string);
    }

    public static rxV_2 id_class(int n) {
        return n >= 0 && n < VALUES.length ? VALUES[n] : SMALL_BALL;
    }

    public int id_class() {
        return this.index;
    }

    public String id_break() {
        return this.shapeName;
    }
}

