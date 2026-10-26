/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.LZ;
import celestial.Ml_1;
import celestial.QF;
import celestial.QH;
import celestial.Qw_1;
import celestial.jI_2;
import celestial.mT_2;
import celestial.rgN_2;
import celestial.rrJM;
import celestial.rrJX;
import celestial.rrJd_1;
import celestial.rrXi_1;
import celestial.vm_3;

public class rrJS
extends rrJM {
    private vm_3 id_class;
    private Qw_1 id_private;
    private rrJX id_implements = new rrJX(this, new rrJd_1());

    public void id_byte(boolean bl) {
        if (bl) {
            ((Qw_1)this.id_volatile.id_class[20]).id_finally();
        }
        this.id_volatile.id_break(this);
    }

    public rrJS(vm_3 vm_32, Qw_1 qw_1) {
        super(new rgN_2(jI_2.id_class("of.options.otherTitle", new Object[0])));
        this.id_class = vm_32;
        this.id_private = qw_1;
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        this.id_class(ml_1);
        rrJS.id_class(ml_1, this.id_case, this.id_extends, this.id_package / 2, 15, 0xFFFFFF);
        super.id_class(ml_1, n, n2, f);
        this.id_implements.id_class(ml_1, n, n2, this.id_throws);
    }

    @Override
    protected void id_break(LZ lZ) {
        if (lZ instanceof rrXi_1) {
            rrXi_1 rrXi_12 = (rrXi_1)lZ;
            if (rrXi_12.id_int) {
                if (rrXi_12.id_class == 200) {
                    ((Qw_1)this.id_volatile.id_class[20]).id_break();
                    this.id_volatile.id_else().id_catch();
                    this.id_volatile.id_break(this.id_class);
                }
                if (rrXi_12.id_class == 210) {
                    ((Qw_1)this.id_volatile.id_class[20]).id_break();
                    String string = jI_2.id_class("of.message.other.reset", new Object[0]);
                    mT_2 mT_22 = new mT_2(this::id_byte, new rgN_2(string), new rgN_2(""));
                    this.id_volatile.id_break(mT_22);
                }
            }
        }
    }

    @Override
    public void v_() {
        this.id_throws.clear();
        QH qH = new QH(this.id_volatile.id_else());
        QF[] qFArray = new QF[]{QF.k, QF.j, QF.W, QF.rz, QF.Z, QF.l, QF.r, QF.z, QF.rQ, QF.ru, qH, null};
        for (int i = 0; i < qFArray.length; ++i) {
            QF qF = qFArray[i];
            int n = this.id_package / 2 - 155 + i % 2 * 160;
            int n2 = this.id_int / 6 + 21 * (i / 2) - 12;
            LZ lZ = this.id_class(qF.id_class((Qw_1)this.id_volatile.id_class[20], n, n2, 150));
            if (qF != qH) continue;
            lZ.id_int(310);
            ++i;
        }
        this.id_class(new rrXi_1(210, this.id_package / 2 - 100, this.id_int / 6 + 168 + 11 - 44, jI_2.id_class("of.options.other.reset", new Object[0])));
        this.id_class(new rrXi_1(200, this.id_package / 2 - 100, this.id_int / 6 + 168 + 11, jI_2.id_class("gui.done", new Object[0])));
    }

    @Override
    public void w_() {
        super.w_();
        ((Qw_1)this.id_volatile.id_class[20]).id_break();
        this.id_volatile.id_else().id_catch();
    }
}

