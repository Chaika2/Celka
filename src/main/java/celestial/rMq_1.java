/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public final class rMq_1
extends Enum<rMq_1> {
    public static final /* enum */ rMq_1 NORMAL = new rMq_1(0, "normal", false);
    public static final /* enum */ rMq_1 LAZY = new rMq_1(1, "lazy", false);
    public static final /* enum */ rMq_1 WORRIED = new rMq_1(2, "worried", false);
    public static final /* enum */ rMq_1 PLAYFUL = new rMq_1(3, "playful", false);
    public static final /* enum */ rMq_1 BROWN = new rMq_1(4, "brown", true);
    public static final /* enum */ rMq_1 WEAK = new rMq_1(5, "weak", true);
    public static final /* enum */ rMq_1 AGGRESSIVE = new rMq_1(6, "aggressive", false);
    private static final rMq_1[] field_221109_h;
    private final int index;
    private final String name;
    private final boolean field_221112_k;
    private static final /* synthetic */ rMq_1[] $VALUES;

    public boolean id_byte() {
        return this.field_221112_k;
    }

    private rMq_1(int n2, String string2, boolean bl) {
        this.index = n2;
        this.name = string2;
        this.field_221112_k = bl;
    }

    static {
        $VALUES = rMq_1.id_protected();
        field_221109_h = (rMq_1[])Arrays.stream(rMq_1.values()).sorted(Comparator.comparingInt(rMq_1::id_class)).toArray(rMq_1[]::new);
    }

    public static rMq_1[] values() {
        return (rMq_1[])$VALUES.clone();
    }

    public static rMq_1 valueOf(String string) {
        return Enum.valueOf(rMq_1.class, string);
    }

    public static rMq_1 id_class(int n) {
        if (n < 0 || n >= field_221109_h.length) {
            n = 0;
        }
        return field_221109_h[n];
    }

    public static rMq_1 id_class(Random random) {
        int n = random.nextInt(16);
        if (n == 0) {
            return LAZY;
        }
        if (n == 1) {
            return WORRIED;
        }
        if (n == 2) {
            return PLAYFUL;
        }
        if (n == 4) {
            return AGGRESSIVE;
        }
        if (n < 9) {
            return WEAK;
        }
        return n < 11 ? BROWN : NORMAL;
    }

    public static rMq_1 id_class(rMq_1 rMq_12, rMq_1 rMq_13) {
        if (rMq_12.id_byte()) {
            return rMq_12 == rMq_13 ? rMq_12 : NORMAL;
        }
        return rMq_12;
    }

    public int id_class() {
        return this.index;
    }

    public static rMq_1 id_class(String string) {
        for (rMq_1 rMq_12 : rMq_1.values()) {
            if (!rMq_12.name.equals(string)) continue;
            return rMq_12;
        }
        return NORMAL;
    }

    public String id_break() {
        return this.name;
    }

    private static /* synthetic */ rMq_1[] id_protected() {
        return new rMq_1[]{NORMAL, LAZY, WORRIED, PLAYFUL, BROWN, WEAK, AGGRESSIVE};
    }
}

