/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.LZ;
import celestial.Ml_1;
import celestial.QF;
import celestial.Qw_1;
import celestial.jI_2;
import celestial.rgN_2;
import celestial.rrJM;
import celestial.rrJX;
import celestial.rrJd_1;
import celestial.rrXi_1;
import celestial.vm_3;

public class rrJs_1
extends rrJM {
    private vm_3 id_class;
    private Qw_1 id_private;
    private static QF[] id_implements = new QF[]{QF.rc, QF.rh, QF.rm, QF.rO, QF.E, QF.H, QF.n, QF.C, QF.rb};
    private rrJX id_finally = new rrJX(this, new rrJd_1());

    public rrJs_1(vm_3 vm_32, Qw_1 qw_1) {
        super(new rgN_2(jI_2.id_class("of.options.performanceTitle", new Object[0])));
        this.id_class = vm_32;
        this.id_private = qw_1;
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        this.id_class(ml_1);
        rrJs_1.id_class(ml_1, this.id_case, this.id_extends, this.id_package / 2, 15, 0xFFFFFF);
        super.id_class(ml_1, n, n2, f);
        this.id_finally.id_class(ml_1, n, n2, this.id_throws);
    }

    @Override
    protected void id_break(LZ lZ) {
        if (lZ instanceof rrXi_1) {
            rrXi_1 rrXi_12 = (rrXi_1)lZ;
            if (rrXi_12.id_int && rrXi_12.id_class == 200) {
                ((Qw_1)this.id_volatile.id_class[20]).id_break();
                this.id_volatile.id_break(this.id_class);
            }
        }
    }

    @Override
    public void v_() {
        this.id_throws.clear();
        for (int i = 0; i < id_implements.length; ++i) {
            QF qF = id_implements[i];
            int n = this.id_package / 2 - 155 + i % 2 * 160;
            int n2 = this.id_int / 6 + 21 * (i / 2) - 12;
            this.id_class(qF.id_class((Qw_1)this.id_volatile.id_class[20], n, n2, 150));
        }
        this.id_class(new rrXi_1(200, this.id_package / 2 - 100, this.id_int / 6 + 168 + 11, jI_2.id_class("gui.done", new Object[0])));
    }

    @Override
    public void w_() {
        super.w_();
        ((Qw_1)this.id_volatile.id_class[20]).id_break();
    }
}

