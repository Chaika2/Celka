/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.IJ;
import celestial.IQ;
import celestial.Ml_1;
import celestial.fj_3;
import celestial.rRp_1;
import celestial.rfH_2;
import celestial.rpr_3;
import celestial.rrGq_1;
import celestial.rrxr_3;
import celestial.wK_2;
import celestial.xc_3;
import java.util.List;
import java.util.Random;

public interface rrGn_1 {
    default public rrGq_1 id_class(rRp_1 rRp_12, rfH_2 rfH_22, xc_3 xc_32, rrGq_1 rrGq_12) {
        return rrGq_12;
    }

    default public fj_3 id_class(rrGq_1 rrGq_12) {
        return this.id_private().id_throws();
    }

    default public boolean id_class(xc_3 xc_32) {
        return this.id_private().id_class();
    }

    default public List<wK_2> id_class(xc_3 xc_32, rpr_3 rpr_32, Random random, rrGq_1 rrGq_12) {
        return this.id_private().id_class(xc_32, rpr_32, random);
    }

    default public IJ id_class(IQ iQ, Ml_1 ml_1) {
        return (IJ)rrxr_3.rW.id_class(new Object[]{this.id_private(), iQ, ml_1});
    }

    default public boolean id_implements() {
        return false;
    }

    default public IJ id_private() {
        return (IJ)this;
    }
}

