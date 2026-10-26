/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rfU_2;
import celestial.rhN_2;
import celestial.rhd_3;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.ToIntFunction;

public final class ou_3
extends Enum<ou_3> {
    public static final /* enum */ ou_3 POINTS = new ou_3("points", rhd_3::id_this, (rhN_22, n) -> {
        if (n >= rhN_22.sn()) {
            return false;
        }
        rhN_22.id_class((int)n);
        return true;
    }, rhN_22 -> rfU_2.id_protected(((Float)rhN_22.id_implements[21]).floatValue() * (float)rhN_22.sn()));
    public static final /* enum */ ou_3 LEVELS = new ou_3("levels", rhN_2::id_super, (rhN_22, n) -> {
        rhN_22.id_else((int)n);
        return true;
    }, rhN_22 -> (Integer)rhN_22.id_implements[19]);
    public final BiConsumer<rhN_2, Integer> xpAdder;
    public final BiPredicate<rhN_2, Integer> xpSetter;
    public final String name;
    public final ToIntFunction<rhN_2> xpGetter;
    private static final /* synthetic */ ou_3[] $VALUES;

    private ou_3(String string2, BiConsumer<rhN_2, Integer> biConsumer, BiPredicate<rhN_2, Integer> biPredicate, ToIntFunction<rhN_2> toIntFunction) {
        this.xpAdder = biConsumer;
        this.name = string2;
        this.xpSetter = biPredicate;
        this.xpGetter = toIntFunction;
    }

    static {
        $VALUES = ou_3.id_class();
    }

    public static ou_3[] values() {
        return (ou_3[])$VALUES.clone();
    }

    public static ou_3 valueOf(String string) {
        return Enum.valueOf(ou_3.class, string);
    }

    private static /* synthetic */ ou_3[] id_class() {
        return new ou_3[]{POINTS, LEVELS};
    }
}

