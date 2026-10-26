/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.LZ;
import celestial.QF;
import celestial.Qw_1;
import celestial.Vc_1;
import celestial.rgP_2;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class VN
extends QF {
    protected BiConsumer<Qw_1, Integer> rF;
    protected BiFunction<Qw_1, VN, rgP_2> rL;

    public VN(String string, BiConsumer<Qw_1, Integer> biConsumer, BiFunction<Qw_1, VN, rgP_2> biFunction) {
        super(string);
        this.rF = biConsumer;
        this.rL = biFunction;
    }

    public rgP_2 id_class(Qw_1 qw_1) {
        return this.rL.apply(qw_1, this);
    }

    @Override
    public LZ id_class(Qw_1 qw_1, int n, int n2, int n3) {
        return new Vc_1(this, n, n2, n3, 20, this, this.id_class(qw_1), lF -> {
            this.id_class(qw_1, 1);
            lF.id_break(this.id_class(qw_1));
        });
    }

    public void id_class(Qw_1 qw_1, int n) {
        this.rF.accept(qw_1, n);
        qw_1.id_break();
    }
}

