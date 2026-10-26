/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.AZ;
import celestial.Ml_1;
import celestial.QY;
import celestial.Qw_1;
import celestial.cm_3;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rqR_2;
import celestial.vG_2;
import celestial.vL_2;

public class vA_2
extends vL_2 {
    private static final rgP_2 id_byte = new rgn_3("lanServer.title");
    private static final rgP_2 id_protected = new rgn_3("selectServer.hiddenAddress");
    private final vG_2 id_throws;
    protected final QY id_class;
    protected final AZ id_break;
    private long id_case;

    protected vA_2(vG_2 vG_22, AZ aZ) {
        this.id_throws = vG_22;
        this.id_break = aZ;
        this.id_class = QY.id_instanceof();
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl, float f) {
        ((cm_3)this.id_class.id_class[15]).id_byte(ml_1, id_byte, n3 + 32 + 3, n2 + 1, 0xFFFFFF);
        ((cm_3)this.id_class.id_class[15]).id_break(ml_1, this.id_break.id_class(), (float)(n3 + 32 + 3), (float)(n2 + 12), 0x808080);
        if (((Qw_1)this.id_class.id_class[20]).id_package) {
            ((cm_3)this.id_class.id_class[15]).id_byte(ml_1, id_protected, n3 + 32 + 3, n2 + 12 + 11, 0x303030);
        } else {
            ((cm_3)this.id_class.id_class[15]).id_break(ml_1, this.id_break.id_break(), (float)(n3 + 32 + 3), (float)(n2 + 12 + 11), 0x303030);
        }
    }

    public AZ id_class() {
        return this.id_break;
    }

    @Override
    public boolean id_break(double d, double d2, int n) {
        this.id_throws.id_class(this);
        if (rqR_2.id_break() - this.id_case < 250L) {
            this.id_throws.id_finally();
        }
        this.id_case = rqR_2.id_break();
        return false;
    }
}

