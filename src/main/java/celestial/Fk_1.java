/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.FJ;
import celestial.Fh_1;
import celestial.Ml_1;
import celestial.QY;
import celestial.fj_3;
import celestial.rLD;
import celestial.rLR;
import celestial.rgP_2;
import celestial.rgn_3;

public class Fk_1
extends FJ {
    private final rLR id_throws;
    private final fj_3 id_case;
    private final boolean id_catch;
    private final rgP_2 id_private;
    public final /* synthetic */ Fh_1 id_class;

    public Fk_1(Fh_1 fh_1, int n, int n2, rLR rLR2, boolean bl) {
        this.id_class = fh_1;
        super(n, n2);
        this.id_throws = rLR2;
        this.id_case = QY.id_instanceof().id_abstract().id_class(rLR2);
        this.id_catch = bl;
        this.id_private = this.id_class(rLR2, bl);
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2) {
        this.id_class.id_class(ml_1, this.id_private, n, n2);
    }

    @Override
    protected void id_class(Ml_1 ml_1) {
        QY.id_instanceof().A().id_class(this.id_case.id_extends().id_protected());
        Fk_1.id_class(ml_1, this.id_volatile + 2, this.id_final + 2, this.h_(), 18, 18, this.id_case);
    }

    private rgP_2 id_class(rLR rLR2, boolean bl) {
        rgn_3 rgn_32 = new rgn_3(rLR2.id_byte());
        if (!bl && rLR2 != rLD.id_finally) {
            rgn_32.id_break(" II");
        }
        return rgn_32;
    }

    @Override
    public void id_catch() {
        if (!this.id_private()) {
            if (this.id_catch) {
                this.id_class.id_implements = this.id_throws;
            } else {
                this.id_class.id_finally = this.id_throws;
            }
            Fh_1.id_private(this.id_class).clear();
            Fh_1.id_implements(this.id_class).clear();
            this.id_class.v_();
            this.id_class.id_private();
        }
    }
}

