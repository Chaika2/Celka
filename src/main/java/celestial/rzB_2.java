/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.rzQ_2;
import celestial.rzd_3;

public final class rzB_2
extends Enum<rzB_2> {
    public static final /* enum */ rzB_2 THIS = new rzB_2("this", rzQ_2.id_class);
    public static final /* enum */ rzB_2 KILLER = new rzB_2("killer", rzQ_2.id_protected);
    public static final /* enum */ rzB_2 DIRECT_KILLER = new rzB_2("direct_killer", rzQ_2.id_throws);
    public static final /* enum */ rzB_2 KILLER_PLAYER = new rzB_2("killer_player", rzQ_2.id_break);
    public final String targetType;
    private final rzd_3<? extends an_3> parameter;
    private static final /* synthetic */ rzB_2[] $VALUES;

    private rzB_2(String string2, rzd_3<? extends an_3> rzd_32) {
        this.targetType = string2;
        this.parameter = rzd_32;
    }

    static {
        $VALUES = rzB_2.id_break();
    }

    public static rzB_2[] values() {
        return (rzB_2[])$VALUES.clone();
    }

    public static rzB_2 valueOf(String string) {
        return Enum.valueOf(rzB_2.class, string);
    }

    public rzd_3<? extends an_3> id_class() {
        return this.parameter;
    }

    public static rzB_2 id_class(String string) {
        for (rzB_2 rzB_22 : rzB_2.values()) {
            if (!rzB_22.targetType.equals(string)) continue;
            return rzB_22;
        }
        throw new IllegalArgumentException("Invalid entity target " + string);
    }

    private static /* synthetic */ rzB_2[] id_break() {
        return new rzB_2[]{THIS, KILLER, DIRECT_KILLER, KILLER_PLAYER};
    }
}

