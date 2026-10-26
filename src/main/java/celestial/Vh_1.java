/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rfU_2;
import java.util.Arrays;
import java.util.Comparator;

public final class Vh_1
extends Enum<Vh_1> {
    public static final /* enum */ Vh_1 OFF = new Vh_1(0, "options.ao.off");
    public static final /* enum */ Vh_1 MIN = new Vh_1(1, "options.ao.min");
    public static final /* enum */ Vh_1 MAX = new Vh_1(2, "options.ao.max");
    private static final Vh_1[] VALUES;
    private final int id;
    private final String resourceKey;
    private static final /* synthetic */ Vh_1[] $VALUES;

    private static /* synthetic */ Vh_1[] id_byte() {
        return new Vh_1[]{OFF, MIN, MAX};
    }

    private Vh_1(int n2, String string2) {
        this.id = n2;
        this.resourceKey = string2;
    }

    static {
        $VALUES = Vh_1.id_byte();
        VALUES = (Vh_1[])Arrays.stream(Vh_1.values()).sorted(Comparator.comparingInt(Vh_1::id_class)).toArray(Vh_1[]::new);
    }

    public static Vh_1[] values() {
        return (Vh_1[])$VALUES.clone();
    }

    public static Vh_1 valueOf(String string) {
        return Enum.valueOf(Vh_1.class, string);
    }

    public int id_class() {
        return this.id;
    }

    public static Vh_1 id_class(int n) {
        return VALUES[rfU_2.id_break(n, VALUES.length)];
    }

    public String id_break() {
        return this.resourceKey;
    }
}

