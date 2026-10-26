/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rgF_2;

public final class rRb_1
extends Enum<rRb_1> {
    public static final /* enum */ rRb_1 PINK = new rRb_1("pink", rgF_2.RED);
    public static final /* enum */ rRb_1 BLUE = new rRb_1("blue", rgF_2.BLUE);
    public static final /* enum */ rRb_1 RED = new rRb_1("red", rgF_2.DARK_RED);
    public static final /* enum */ rRb_1 GREEN = new rRb_1("green", rgF_2.GREEN);
    public static final /* enum */ rRb_1 YELLOW = new rRb_1("yellow", rgF_2.YELLOW);
    public static final /* enum */ rRb_1 PURPLE = new rRb_1("purple", rgF_2.DARK_BLUE);
    public static final /* enum */ rRb_1 WHITE = new rRb_1("white", rgF_2.WHITE);
    private final String name;
    private final rgF_2 formatting;
    private static final rRb_1[] VALUES;
    private static final /* synthetic */ rRb_1[] $VALUES;

    private static /* synthetic */ rRb_1[] id_byte() {
        return new rRb_1[]{PINK, BLUE, RED, GREEN, YELLOW, PURPLE, WHITE};
    }

    private rRb_1(String string2, rgF_2 rgF_22) {
        this.name = string2;
        this.formatting = rgF_22;
    }

    static {
        $VALUES = rRb_1.id_byte();
        VALUES = rRb_1.values();
    }

    public static rRb_1[] values() {
        return (rRb_1[])$VALUES.clone();
    }

    public static rRb_1 valueOf(String string) {
        return Enum.valueOf(rRb_1.class, string);
    }

    public static rRb_1 id_class(rgF_2 rgF_22) {
        for (rRb_1 rRb_12 : VALUES) {
            if (rRb_12.formatting != rgF_22) continue;
            return rRb_12;
        }
        return WHITE;
    }

    public static rRb_1 id_class(String string) {
        for (rRb_1 rRb_12 : VALUES) {
            if (!rRb_12.name.equals(string)) continue;
            return rRb_12;
        }
        return WHITE;
    }

    public rgF_2 id_class() {
        return this.formatting;
    }

    public String id_break() {
        return this.name;
    }
}

