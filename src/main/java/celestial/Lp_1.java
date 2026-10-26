/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.LF;
import celestial.LL;
import celestial.QF;
import celestial.cn_3;
import celestial.rgP_2;
import celestial.rpl_3;
import celestial.rrJO;
import java.util.List;
import java.util.Optional;

public class Lp_1
extends LF
implements cn_3,
rrJO {
    private final QF id_class;

    public Lp_1(int n, int n2, int n3, int n4, QF qF, rgP_2 rgP_22, LL lL) {
        super(n, n2, n3, n4, rgP_22, lL);
        this.id_class = qF;
    }

    @Override
    public Optional<List<rpl_3>> id_class() {
        return this.id_class.id_break();
    }

    @Override
    public QF id_implements() {
        return this.id_class;
    }

    public QF id_private() {
        return this.id_class;
    }
}

