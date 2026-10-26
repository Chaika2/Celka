/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.LQ;
import celestial.LZ;
import celestial.QF;
import celestial.Qw_1;
import celestial.VF;
import celestial.cn_3;
import celestial.rgP_2;
import celestial.rpl_3;
import celestial.rrJO;
import celestial.rrMu_1;
import java.util.List;
import java.util.Optional;

public class LN
extends LQ
implements cn_3,
rrJO {
    private final VF id_case;
    private boolean id_catch;
    private boolean id_private;

    @Override
    public void id_byte(double d, double d2) {
        if (this.id_catch) {
            this.id_private = true;
        }
        super.id_byte(d, d2);
    }

    public LN(Qw_1 qw_1, int n, int n2, int n3, int n4, VF vF) {
        super(qw_1, n, n2, n3, n4, (double)((float)vF.id_break(vF.id_class(qw_1))));
        this.id_case = vF;
        this.id_catch();
        this.id_catch = rrMu_1.id_class(this.id_case);
        this.id_private = false;
    }

    public static int id_class(LZ lZ) {
        return lZ.id_extends;
    }

    @Override
    protected void id_class(double d, double d2, double d3, double d4) {
        if (this.id_catch) {
            this.id_private = true;
        }
        super.id_class(d, d2, d3, d4);
    }

    @Override
    public Optional<List<rpl_3>> id_class() {
        return this.id_case.id_break();
    }

    public static int id_break(LZ lZ) {
        return lZ.id_native;
    }

    @Override
    protected void id_catch() {
        if (this.id_private) {
            double d = this.id_case.id_byte(this.id_throws);
            rgP_2 rgP_22 = rrMu_1.id_class(this.id_case, d);
            if (rgP_22 != null) {
                this.id_break(rgP_22);
            }
        } else {
            this.id_break(this.id_case.id_break(this.id_class));
        }
    }

    @Override
    public QF id_implements() {
        return this.id_case;
    }

    @Override
    public void id_protected(double d, double d2) {
        if (this.id_private) {
            this.id_private = false;
            this.id_private();
            this.id_catch();
        }
        super.id_protected(d, d2);
    }

    @Override
    protected void id_private() {
        if (!this.id_private) {
            double d = this.id_case.id_class(this.id_class);
            double d2 = this.id_case.id_byte(this.id_throws);
            if (d2 != d) {
                this.id_case.id_class(this.id_class, this.id_case.id_byte(this.id_throws));
                this.id_class.id_break();
            }
        }
    }
}

