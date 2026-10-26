/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rfU_2;
import java.util.Arrays;
import java.util.Comparator;

public final class Vd_1
extends Enum<Vd_1> {
    public static final /* enum */ Vd_1 OFF = new Vd_1(0, "options.off");
    public static final /* enum */ Vd_1 FAST = new Vd_1(1, "options.clouds.fast");
    public static final /* enum */ Vd_1 FANCY = new Vd_1(2, "options.clouds.fancy");
    private static final Vd_1[] BY_ID;
    private final int id;
    private final String key;
    private static final /* synthetic */ Vd_1[] $VALUES;

    private static /* synthetic */ Vd_1[] id_byte() {
        return new Vd_1[]{OFF, FAST, FANCY};
    }

    private Vd_1(int n2, String string2) {
        this.id = n2;
        this.key = string2;
    }

    static {
        $VALUES = Vd_1.id_byte();
        BY_ID = (Vd_1[])Arrays.stream(Vd_1.values()).sorted(Comparator.comparingInt(Vd_1::id_class)).toArray(Vd_1[]::new);
    }

    public static Vd_1[] values() {
        return (Vd_1[])$VALUES.clone();
    }

    public static Vd_1 valueOf(String string) {
        return Enum.valueOf(Vd_1.class, string);
    }

    public int id_class() {
        return this.id;
    }

    public static Vd_1 id_class(int n) {
        return BY_ID[rfU_2.id_break(n, BY_ID.length)];
    }

    public String id_break() {
        return this.key;
    }
}

