/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.QO;
import celestial.QP;
import celestial.xc_3;
import java.util.function.Predicate;

public class QM
implements Predicate<xc_3> {
    private static final QM id_class = new QO(QP.id_class);
    private final QP id_break;

    public QM(QP qP) {
        this.id_break = qP;
    }

    @Override
    public /* synthetic */ boolean test(Object object) {
        return this.id_class((xc_3)object);
    }

    public static QM id_class(QP qP) {
        return qP == QP.id_class ? id_class : new QM(qP);
    }

    public boolean id_class(xc_3 xc_32) {
        return xc_32 != null && xc_32.id_byte() == this.id_break;
    }
}

