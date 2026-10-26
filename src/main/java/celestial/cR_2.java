/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.QY;
import celestial.cb_3;
import celestial.cl_3;
import celestial.rJP;
import celestial.rJr_1;
import celestial.rgP_2;
import celestial.rhz_3;
import celestial.vm_3;

public interface cR_2<T extends rJr_1, U extends vm_3> {
    default public void id_class(rgP_2 rgP_22, rJP<T> rJP2, QY qY, int n) {
        U u = this.create(rJP2.id_class(n, (rhz_3)((cb_3)qY.id_class[57]).id_implements[1]), (rhz_3)((cb_3)qY.id_class[57]).id_implements[1], rgP_22);
        Object t = ((cl_3)u).G_();
        ((cb_3)qY.id_class[57]).id_implements[4] = t;
        qY.id_break((vm_3)u);
    }

    public U create(T var1, rhz_3 var2, rgP_2 var3);
}

