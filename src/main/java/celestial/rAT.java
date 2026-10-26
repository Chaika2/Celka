/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rAp_1;
import java.util.List;
import java.util.function.Function;

public final class rAT
extends Enum<rAT> {
    public static final /* enum */ rAT TOP = new rAT();
    public static final /* enum */ rAT BOTTOM = new rAT();
    private static final /* synthetic */ rAT[] $VALUES;

    static {
        $VALUES = rAT.id_break();
    }

    public static rAT[] values() {
        return (rAT[])$VALUES.clone();
    }

    public static rAT valueOf(String string) {
        return Enum.valueOf(rAT.class, string);
    }

    public <T> int id_class(List<T> list, T t, Function<T, rAp_1> function, boolean bl) {
        rAp_1 rAp_12;
        int n;
        rAT rAT2;
        rAT rAT3 = rAT2 = bl ? this.id_class() : this;
        if (rAT2 == BOTTOM) {
            rAp_1 rAp_13;
            int n2;
            for (n2 = 0; n2 < list.size() && (rAp_13 = function.apply(list.get(n2))).id_catch() && rAp_13.id_private() == this; ++n2) {
            }
            list.add(n2, t);
            return n2;
        }
        for (n = list.size() - 1; n >= 0 && (rAp_12 = function.apply(list.get(n))).id_catch() && rAp_12.id_private() == this; --n) {
        }
        list.add(n + 1, t);
        return n + 1;
    }

    public rAT id_class() {
        return this == TOP ? BOTTOM : TOP;
    }

    private static /* synthetic */ rAT[] id_break() {
        return new rAT[]{TOP, BOTTOM};
    }
}

