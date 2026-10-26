/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.LQ;
import celestial.QY;
import celestial.Qw_1;
import celestial.cN_2;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgZ_2;
import celestial.rgn_3;
import celestial.rqL_2;

public class Lc_1
extends LQ {
    private final rqL_2 id_case;

    public Lc_1(QY qY, int n, int n2, rqL_2 rqL_22, int n3) {
        super((Qw_1)qY.id_class[20], n, n2, n3, 20, (double)((Qw_1)qY.id_class[20]).id_class(rqL_22));
        this.id_case = rqL_22;
        this.id_catch();
    }

    @Override
    protected void id_catch() {
        rgP_2 rgP_22 = (float)this.id_throws == (float)this.a_(false) ? cN_2.id_break : new rgN_2((int)(this.id_throws * 100.0) + "%");
        this.id_break(this.id_implements().id_break(": ").id_class(rgP_22));
    }

    private rgZ_2 id_implements() {
        return new rgn_3("soundCategory." + this.id_case.id_class());
    }

    @Override
    protected void id_private() {
        this.id_class.id_class(this.id_case, (float)this.id_throws);
        this.id_class.id_break();
    }
}

