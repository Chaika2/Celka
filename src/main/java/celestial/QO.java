/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.QM;
import celestial.QP;
import celestial.xc_3;

public class QO
extends QM {
    public QO(QP qP) {
        super(qP);
    }

    @Override
    public /* synthetic */ boolean test(Object object) {
        return this.id_class((xc_3)object);
    }

    @Override
    public boolean id_class(xc_3 xc_32) {
        return xc_32 != null && xc_32.id_catch();
    }
}

