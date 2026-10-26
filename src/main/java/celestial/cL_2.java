/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.cA_2;
import celestial.cm_3;
import celestial.cv_3;
import java.util.List;

public class cL_2
implements cv_3 {
    public final /* synthetic */ List id_break;
    public final /* synthetic */ cm_3 id_byte;

    @Override
    public int id_byte(Ml_1 ml_1, int n, int n2, int n3, int n4) {
        int n5 = n2;
        for (cA_2 cA_22 : this.id_break) {
            this.id_byte.id_break(ml_1, cA_22.id_class, (float)n, (float)n5, n4);
            n5 += n3;
        }
        return n5;
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public cL_2(List list, cm_3 cm_32) {
        this.id_break = list;
        this.id_byte = cm_32;
    }

    @Override
    public int id_class() {
        return this.id_break.size();
    }

    @Override
    public int id_class(Ml_1 ml_1, int n, int n2, int n3, int n4) {
        int n5 = n2;
        for (cA_2 cA_22 : this.id_break) {
            this.id_byte.id_class(ml_1, cA_22.id_class, (float)(n - cA_22.id_break / 2), (float)n5, n4);
            n5 += n3;
        }
        return n5;
    }

    @Override
    public int id_class(Ml_1 ml_1, int n, int n2) {
        return this.id_class(ml_1, n, n2, 9, 0xFFFFFF);
    }

    @Override
    public int id_break(Ml_1 ml_1, int n, int n2, int n3, int n4) {
        int n5 = n2;
        for (cA_2 cA_22 : this.id_break) {
            this.id_byte.id_class(ml_1, cA_22.id_class, (float)n, (float)n5, n4);
            n5 += n3;
        }
        return n5;
    }
}

