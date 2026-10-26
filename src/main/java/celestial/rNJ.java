/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rNs_1;
import celestial.rcZ_2;
import celestial.rzQ_2;
import celestial.rzd_3;
import celestial.rzr_3;
import java.util.function.Function;

public final class rNJ
extends Enum<rNJ> {
    public static final /* enum */ rNJ THIS = new rNJ("this", rzQ_2.id_class, rNs_1.id_protected);
    public static final /* enum */ rNJ KILLER = new rNJ("killer", rzQ_2.id_protected, rNs_1.id_protected);
    public static final /* enum */ rNJ KILLER_PLAYER = new rNJ("killer_player", rzQ_2.id_break, rNs_1.id_protected);
    public static final /* enum */ rNJ BLOCK_ENTITY = new rNJ("block_entity", rzQ_2.id_private, rNs_1.id_throws);
    public final String sourceName;
    public final rzd_3<?> lootParam;
    public final Function<rzr_3, rcZ_2> field_216226_g;
    private static final /* synthetic */ rNJ[] $VALUES;

    private <T> rNJ(String string2, rzd_3<T> rzd_32, Function<? super T, rcZ_2> function) {
        this.sourceName = string2;
        this.lootParam = rzd_32;
        this.field_216226_g = rzr_32 -> {
            Object t = rzr_32.id_break(rzd_32);
            return t != null ? (rcZ_2)function.apply((Object)t) : null;
        };
    }

    static {
        $VALUES = rNJ.id_class();
    }

    public static rNJ[] values() {
        return (rNJ[])$VALUES.clone();
    }

    public static rNJ valueOf(String string) {
        return Enum.valueOf(rNJ.class, string);
    }

    public static rNJ id_class(String string) {
        for (rNJ rNJ2 : rNJ.values()) {
            if (!rNJ2.sourceName.equals(string)) continue;
            return rNJ2;
        }
        throw new IllegalArgumentException("Invalid tag source " + string);
    }

    private static /* synthetic */ rNJ[] id_class() {
        return new rNJ[]{THIS, KILLER, KILLER_PLAYER, BLOCK_ENTITY};
    }
}

