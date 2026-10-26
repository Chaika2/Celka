/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2IntFunction
 */
package celestial;

import celestial.HQ;
import celestial.rrbY_2;
import celestial.ryO_2;
import celestial.ryX_2;
import celestial.yX_2;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;

public class jB_2<S extends ryO_2>
implements ryX_2<S, Int2IntFunction> {
    @Override
    public Int2IntFunction id_class(S s, S s2) {
        return n -> {
            if (rrbY_2.id_case()) {
                return HQ.id_class;
            }
            int n2 = yX_2.id_class(s.id_while(), s.id_char());
            int n3 = yX_2.id_class(s2.id_while(), s2.id_char());
            int n4 = HQ.id_class(n2);
            int n5 = HQ.id_class(n3);
            int n6 = HQ.id_break(n2);
            int n7 = HQ.id_break(n3);
            return HQ.id_class(Math.max(n4, n5), Math.max(n6, n7));
        };
    }

    public Int2IntFunction id_class() {
        return n -> n;
    }

    @Override
    public Int2IntFunction id_class(S s) {
        return n -> n;
    }

    @Override
    public /* synthetic */ Object id_break() {
        return this.id_class();
    }
}

