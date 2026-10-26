/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 */
package celestial;

import celestial.QS;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rpH_2;
import celestial.rqO_2;
import celestial.rrGI;
import celestial.rrxr_3;
import celestial.rxA_2;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public final class rxL_2
extends Enum<rxL_2>
implements rpH_2 {
    public static final /* enum */ rxL_2 WHITE = new rxL_2(0, "white", 0xF9FFFE, QS.id_finally, 0xF0F0F0, 0xFFFFFF);
    public static final /* enum */ rxL_2 ORANGE = new rxL_2(1, "orange", 16351261, QS.id_new, 15435844, 16738335);
    public static final /* enum */ rxL_2 MAGENTA = new rxL_2(2, "magenta", 13061821, QS.id_continue, 12801229, 0xFF00FF);
    public static final /* enum */ rxL_2 LIGHT_BLUE = new rxL_2(3, "light_blue", 3847130, QS.id_super, 6719955, 10141901);
    public static final /* enum */ rxL_2 YELLOW = new rxL_2(4, "yellow", 16701501, QS.id_this, 14602026, 0xFFFF00);
    public static final /* enum */ rxL_2 LIME = new rxL_2(5, "lime", 8439583, QS.id_else, 4312372, 0xBFFF00);
    public static final /* enum */ rxL_2 PINK = new rxL_2(6, "pink", 15961002, QS.id_synchronized, 14188952, 16738740);
    public static final /* enum */ rxL_2 GRAY = new rxL_2(7, "gray", 4673362, QS.id_return, 0x434343, 0x808080);
    public static final /* enum */ rxL_2 LIGHT_GRAY = new rxL_2(8, "light_gray", 0x9D9D97, QS.id_public, 0xABABAB, 0xD3D3D3);
    public static final /* enum */ rxL_2 CYAN = new rxL_2(9, "cyan", 1481884, QS.id_goto, 2651799, 65535);
    public static final /* enum */ rxL_2 PURPLE = new rxL_2(10, "purple", 8991416, QS.id_while, 8073150, 10494192);
    public static final /* enum */ rxL_2 BLUE = new rxL_2(11, "blue", 3949738, QS.id_try, 2437522, 255);
    public static final /* enum */ rxL_2 BROWN = new rxL_2(12, "brown", 8606770, QS.id_instanceof, 5320730, 9127187);
    public static final /* enum */ rxL_2 GREEN = new rxL_2(13, "green", 6192150, QS.id_throw, 3887386, 65280);
    public static final /* enum */ rxL_2 RED = new rxL_2(14, "red", 11546150, QS.id_interface, 11743532, 0xFF0000);
    public static final /* enum */ rxL_2 BLACK = new rxL_2(15, "black", 0x1D1D21, QS.id_char, 0x1E1B1B, 0);
    public static final rxL_2[] VALUES;
    private static final Int2ObjectOpenHashMap<rxL_2> BY_FIREWORK_COLOR;
    private final int id;
    private final String translationKey;
    private final QS mapColor;
    private final int colorValue;
    private final int swappedColorValue;
    private float[] colorComponentValues;
    private final int fireworkColor;
    private final rrGI<rdb_3> tag;
    private final int textColor;
    private static final /* synthetic */ rxL_2[] $VALUES;

    public String id_byte() {
        return this.translationKey;
    }

    private rxL_2(int n2, String string2, int n3, QS qS, int n4, int n5) {
        this.id = n2;
        this.translationKey = string2;
        this.colorValue = n3;
        this.mapColor = qS;
        this.textColor = n5;
        int n6 = (n3 & 0xFF0000) >> 16;
        int n7 = (n3 & 0xFF00) >> 8;
        int n8 = (n3 & 0xFF) >> 0;
        this.swappedColorValue = n8 << 16 | n7 << 8 | n6 << 0;
        this.tag = (rrGI)rrxr_3.Pm.id_class((Object)new rqO_2("forge", "dyes/" + string2));
        this.colorComponentValues = new float[]{(float)n6 / 255.0f, (float)n7 / 255.0f, (float)n8 / 255.0f};
        this.fireworkColor = n4;
    }

    static {
        $VALUES = rxL_2.id_finally();
        VALUES = (rxL_2[])Arrays.stream(rxL_2.values()).sorted(Comparator.comparingInt(rxL_2::id_break)).toArray(rxL_2[]::new);
        BY_FIREWORK_COLOR = new Int2ObjectOpenHashMap(Arrays.stream(rxL_2.values()).collect(Collectors.toMap(rxL_22 -> rxL_22.fireworkColor, rxL_22 -> rxL_22)));
    }

    public String toString() {
        return this.translationKey;
    }

    public static rxL_2[] values() {
        return (rxL_2[])$VALUES.clone();
    }

    public static rxL_2 valueOf(String string) {
        return Enum.valueOf(rxL_2.class, string);
    }

    public static rxL_2 id_class(String string, rxL_2 rxL_22) {
        for (rxL_2 rxL_23 : rxL_2.values()) {
            if (!rxL_23.translationKey.equals(string)) continue;
            return rxL_23;
        }
        return rxL_22;
    }

    public static rxL_2 id_class(rdn_3 rdn_32) {
        if (rdn_32.id_break() instanceof rxA_2) {
            return ((rxA_2)rdn_32.id_break()).id_byte();
        }
        for (rxL_2 rxL_22 : VALUES) {
            if (!rdn_32.id_break().id_class(rxL_22.id_implements())) continue;
            return rxL_22;
        }
        return null;
    }

    @Override
    public String id_class() {
        return this.translationKey;
    }

    public void id_class(float[] fArray) {
        this.colorComponentValues = fArray;
    }

    public static rxL_2 id_class(int n) {
        if (n < 0 || n >= VALUES.length) {
            n = 0;
        }
        return VALUES[n];
    }

    public static rxL_2 id_break(int n) {
        return (rxL_2)BY_FIREWORK_COLOR.get(n);
    }

    public int id_break() {
        return this.id;
    }

    public QS id_throws() {
        return this.mapColor;
    }

    private static /* synthetic */ rxL_2[] id_finally() {
        return new rxL_2[]{WHITE, ORANGE, MAGENTA, LIGHT_BLUE, YELLOW, LIME, PINK, GRAY, LIGHT_GRAY, CYAN, PURPLE, BLUE, BROWN, GREEN, RED, BLACK};
    }

    public int id_catch() {
        return this.textColor;
    }

    public int id_case() {
        return this.fireworkColor;
    }

    public rrGI<rdb_3> id_implements() {
        return this.tag;
    }

    public float[] id_protected() {
        return this.colorComponentValues;
    }

    public int id_private() {
        return this.colorValue;
    }
}

