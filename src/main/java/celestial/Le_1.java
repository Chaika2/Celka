/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.LZ;
import celestial.La_1;
import celestial.Lf_1;
import celestial.Lp_1;
import celestial.QF;
import celestial.QY;
import celestial.Qw_1;
import java.util.Optional;

public class Le_1
extends Lf_1<La_1> {
    public Le_1(QY qY, int n, int n2, int n3, int n4, int n5) {
        super(qY, n, n2, n3, n4, n5);
        this.id_this = false;
    }

    @Override
    public void id_class(QF[] qFArray) {
        for (int i = 0; i < qFArray.length; i += 2) {
            this.id_class(qFArray[i], i < qFArray.length - 1 ? qFArray[i + 1] : null);
        }
    }

    public void id_class(QF qF, QF qF2) {
        this.id_break(La_1.id_class((Qw_1)this.id_native.id_class[20], this.id_final, qF, qF2));
    }

    public int id_class(QF qF) {
        return this.id_break(La_1.id_class((Qw_1)this.id_native.id_class[20], this.id_final, qF));
    }

    public LZ id_break(QF qF) {
        for (La_1 la_1 : this.x_()) {
            for (LZ lZ : la_1.id_class) {
                if (!(lZ instanceof Lp_1) || ((Lp_1)lZ).id_private() != qF) continue;
                return lZ;
            }
        }
        return null;
    }

    public Optional<LZ> id_throws(double d, double d2) {
        for (La_1 la_1 : this.x_()) {
            for (LZ lZ : la_1.id_class) {
                if (!lZ.id_break(d, d2)) continue;
                return Optional.of(lZ);
            }
        }
        return Optional.empty();
    }

    @Override
    protected int id_protected() {
        return super.id_protected() + 32;
    }

    @Override
    public int F_() {
        return 400;
    }
}

