/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.LZ;
import celestial.QF;
import celestial.QY;
import celestial.Qw_1;
import celestial.Vx_1;
import celestial.cN_2;
import celestial.cm_3;
import celestial.rgP_2;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class VJ
extends QF {
    private final Predicate<Qw_1> rF;
    private final BiConsumer<Qw_1, Boolean> rL;
    private final rgP_2 rA;

    public rgP_2 id_byte(Qw_1 qw_1) {
        return cN_2.id_class(this.id_class(), this.id_break(qw_1));
    }

    public VJ(String string, Predicate<Qw_1> predicate, BiConsumer<Qw_1, Boolean> biConsumer) {
        this(string, null, predicate, biConsumer);
    }

    public VJ(String string, rgP_2 rgP_22, Predicate<Qw_1> predicate, BiConsumer<Qw_1, Boolean> biConsumer) {
        super(string);
        this.rF = predicate;
        this.rL = biConsumer;
        this.rA = rgP_22;
    }

    @Override
    public LZ id_class(Qw_1 qw_1, int n, int n2, int n3) {
        if (this.rA != null) {
            this.id_class(((cm_3)QY.id_instanceof().id_class[15]).id_break(this.rA, 200));
        }
        return new Vx_1(this, n, n2, n3, 20, this, this.id_byte(qw_1), lF -> {
            this.id_class(qw_1);
            lF.id_break(this.id_byte(qw_1));
        });
    }

    public void id_class(Qw_1 qw_1, String string) {
        this.id_class(qw_1, "true".equals(string));
    }

    private void id_class(Qw_1 qw_1, boolean bl) {
        this.rL.accept(qw_1, bl);
    }

    public void id_class(Qw_1 qw_1) {
        this.id_class(qw_1, !this.id_break(qw_1));
        qw_1.id_break();
    }

    public boolean id_break(Qw_1 qw_1) {
        return this.rF.test(qw_1);
    }
}

