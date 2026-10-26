/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rqO_2;
import java.util.Arrays;

public final class rHE
extends Enum<rHE> {
    public static final /* enum */ rHE BASE = new rHE("base", "b", false);
    public static final /* enum */ rHE SQUARE_BOTTOM_LEFT = new rHE("square_bottom_left", "bl");
    public static final /* enum */ rHE SQUARE_BOTTOM_RIGHT = new rHE("square_bottom_right", "br");
    public static final /* enum */ rHE SQUARE_TOP_LEFT = new rHE("square_top_left", "tl");
    public static final /* enum */ rHE SQUARE_TOP_RIGHT = new rHE("square_top_right", "tr");
    public static final /* enum */ rHE STRIPE_BOTTOM = new rHE("stripe_bottom", "bs");
    public static final /* enum */ rHE STRIPE_TOP = new rHE("stripe_top", "ts");
    public static final /* enum */ rHE STRIPE_LEFT = new rHE("stripe_left", "ls");
    public static final /* enum */ rHE STRIPE_RIGHT = new rHE("stripe_right", "rs");
    public static final /* enum */ rHE STRIPE_CENTER = new rHE("stripe_center", "cs");
    public static final /* enum */ rHE STRIPE_MIDDLE = new rHE("stripe_middle", "ms");
    public static final /* enum */ rHE STRIPE_DOWNRIGHT = new rHE("stripe_downright", "drs");
    public static final /* enum */ rHE STRIPE_DOWNLEFT = new rHE("stripe_downleft", "dls");
    public static final /* enum */ rHE STRIPE_SMALL = new rHE("small_stripes", "ss");
    public static final /* enum */ rHE CROSS = new rHE("cross", "cr");
    public static final /* enum */ rHE STRAIGHT_CROSS = new rHE("straight_cross", "sc");
    public static final /* enum */ rHE TRIANGLE_BOTTOM = new rHE("triangle_bottom", "bt");
    public static final /* enum */ rHE TRIANGLE_TOP = new rHE("triangle_top", "tt");
    public static final /* enum */ rHE TRIANGLES_BOTTOM = new rHE("triangles_bottom", "bts");
    public static final /* enum */ rHE TRIANGLES_TOP = new rHE("triangles_top", "tts");
    public static final /* enum */ rHE DIAGONAL_LEFT = new rHE("diagonal_left", "ld");
    public static final /* enum */ rHE DIAGONAL_RIGHT = new rHE("diagonal_up_right", "rd");
    public static final /* enum */ rHE DIAGONAL_LEFT_MIRROR = new rHE("diagonal_up_left", "lud");
    public static final /* enum */ rHE DIAGONAL_RIGHT_MIRROR = new rHE("diagonal_right", "rud");
    public static final /* enum */ rHE CIRCLE_MIDDLE = new rHE("circle", "mc");
    public static final /* enum */ rHE RHOMBUS_MIDDLE = new rHE("rhombus", "mr");
    public static final /* enum */ rHE HALF_VERTICAL = new rHE("half_vertical", "vh");
    public static final /* enum */ rHE HALF_HORIZONTAL = new rHE("half_horizontal", "hh");
    public static final /* enum */ rHE HALF_VERTICAL_MIRROR = new rHE("half_vertical_right", "vhr");
    public static final /* enum */ rHE HALF_HORIZONTAL_MIRROR = new rHE("half_horizontal_bottom", "hhb");
    public static final /* enum */ rHE BORDER = new rHE("border", "bo");
    public static final /* enum */ rHE CURLY_BORDER = new rHE("curly_border", "cbo");
    public static final /* enum */ rHE GRADIENT = new rHE("gradient", "gra");
    public static final /* enum */ rHE GRADIENT_UP = new rHE("gradient_up", "gru");
    public static final /* enum */ rHE BRICKS = new rHE("bricks", "bri");
    public static final /* enum */ rHE GLOBE = new rHE("globe", "glb", true);
    public static final /* enum */ rHE CREEPER = new rHE("creeper", "cre", true);
    public static final /* enum */ rHE SKULL = new rHE("skull", "sku", true);
    public static final /* enum */ rHE FLOWER = new rHE("flower", "flo", true);
    public static final /* enum */ rHE MOJANG = new rHE("mojang", "moj", true);
    public static final /* enum */ rHE PIGLIN = new rHE("piglin", "pig", true);
    private static final rHE[] BANNER_PATTERNS;
    public static final int BANNER_PATTERNS_COUNT;
    public static final int BANNERS_WITH_ITEMS;
    public static final int PATTERN_ITEM_INDEX;
    private final boolean hasPatternItem;
    private final String fileName;
    public final String hashname;
    private static final /* synthetic */ rHE[] $VALUES;

    private static /* synthetic */ rHE[] id_byte() {
        return new rHE[]{BASE, SQUARE_BOTTOM_LEFT, SQUARE_BOTTOM_RIGHT, SQUARE_TOP_LEFT, SQUARE_TOP_RIGHT, STRIPE_BOTTOM, STRIPE_TOP, STRIPE_LEFT, STRIPE_RIGHT, STRIPE_CENTER, STRIPE_MIDDLE, STRIPE_DOWNRIGHT, STRIPE_DOWNLEFT, STRIPE_SMALL, CROSS, STRAIGHT_CROSS, TRIANGLE_BOTTOM, TRIANGLE_TOP, TRIANGLES_BOTTOM, TRIANGLES_TOP, DIAGONAL_LEFT, DIAGONAL_RIGHT, DIAGONAL_LEFT_MIRROR, DIAGONAL_RIGHT_MIRROR, CIRCLE_MIDDLE, RHOMBUS_MIDDLE, HALF_VERTICAL, HALF_HORIZONTAL, HALF_VERTICAL_MIRROR, HALF_HORIZONTAL_MIRROR, BORDER, CURLY_BORDER, GRADIENT, GRADIENT_UP, BRICKS, GLOBE, CREEPER, SKULL, FLOWER, MOJANG, PIGLIN};
    }

    private rHE(String string2, String string3) {
        this(string2, string3, false);
    }

    private rHE(String string2, String string3, boolean bl) {
        this.fileName = string2;
        this.hashname = string3;
        this.hasPatternItem = bl;
    }

    static {
        $VALUES = rHE.id_byte();
        BANNER_PATTERNS = rHE.values();
        BANNER_PATTERNS_COUNT = BANNER_PATTERNS.length;
        BANNERS_WITH_ITEMS = (int)Arrays.stream(BANNER_PATTERNS).filter(rHE2 -> rHE2.hasPatternItem).count();
        PATTERN_ITEM_INDEX = BANNER_PATTERNS_COUNT - BANNERS_WITH_ITEMS - 1;
    }

    public static rHE[] values() {
        return (rHE[])$VALUES.clone();
    }

    public static rHE valueOf(String string) {
        return Enum.valueOf(rHE.class, string);
    }

    public String id_class() {
        return this.fileName;
    }

    public static rHE id_class(String string) {
        for (rHE rHE2 : rHE.values()) {
            if (!rHE2.hashname.equals(string)) continue;
            return rHE2;
        }
        return null;
    }

    public rqO_2 id_class(boolean bl) {
        String string = bl ? "banner" : "shield";
        return new rqO_2("entity/" + string + "/" + this.id_class());
    }

    public String id_break() {
        return this.hashname;
    }
}

