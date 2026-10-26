/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rgP_2;
import celestial.rgn_3;
import java.util.Arrays;
import java.util.Comparator;

public final class rRO
extends Enum<rRO> {
    public static final /* enum */ rRO PEACEFUL = new rRO(0, "peaceful");
    public static final /* enum */ rRO EASY = new rRO(1, "easy");
    public static final /* enum */ rRO NORMAL = new rRO(2, "normal");
    public static final /* enum */ rRO HARD = new rRO(3, "hard");
    private static final rRO[] ID_MAPPING;
    private final int id;
    private final String translationKey;
    private static final /* synthetic */ rRO[] $VALUES;

    public String id_byte() {
        return this.translationKey;
    }

    private rRO(int n2, String string2) {
        this.id = n2;
        this.translationKey = string2;
    }

    static {
        $VALUES = rRO.id_throws();
        ID_MAPPING = (rRO[])Arrays.stream(rRO.values()).sorted(Comparator.comparingInt(rRO::id_class)).toArray(rRO[]::new);
    }

    public static rRO[] values() {
        return (rRO[])$VALUES.clone();
    }

    public static rRO valueOf(String string) {
        return Enum.valueOf(rRO.class, string);
    }

    public int id_class() {
        return this.id;
    }

    public static rRO id_class(int n) {
        return ID_MAPPING[n % ID_MAPPING.length];
    }

    public static rRO id_class(String string) {
        for (rRO rRO2 : rRO.values()) {
            if (!rRO2.translationKey.equals(string)) continue;
            return rRO2;
        }
        return null;
    }

    public rgP_2 id_break() {
        return new rgn_3("options.difficulty." + this.translationKey);
    }

    private static /* synthetic */ rRO[] id_throws() {
        return new rRO[]{PEACEFUL, EASY, NORMAL, HARD};
    }

    public rRO id_protected() {
        return ID_MAPPING[(this.id + 1) % ID_MAPPING.length];
    }
}

