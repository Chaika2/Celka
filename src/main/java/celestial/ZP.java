/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.LF;
import celestial.Lp_1;
import celestial.Ml_1;
import celestial.QF;
import celestial.Qw_1;
import celestial.cN_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rhQ_2;
import celestial.rrJb_1;
import celestial.rrba_3;
import celestial.vl_3;
import celestial.vm_3;

public class ZP
extends vl_3 {
    public ZP(vm_3 vm_32, Qw_1 qw_1) {
        super(vm_32, qw_1, new rgn_3("options.skinCustomisation.title"));
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        this.id_class(ml_1);
        ZP.id_class(ml_1, this.id_super, this.id_extends, this.id_package / 2, 20, 0xFFFFFF);
        super.id_class(ml_1, n, n2, f);
    }

    private rgP_2 id_class(rhQ_2 rhQ_22) {
        return cN_2.id_class(rhQ_22.id_byte(), this.id_catch.id_protected().contains((Object)rhQ_22));
    }

    @Override
    protected void v_() {
        int n = 0;
        for (rhQ_2 rhQ_22 : rhQ_2.values()) {
            this.id_class(new LF(this.id_package / 2 - 155 + n % 2 * 160, this.id_int / 6 + 24 * (n >> 1), 150, 20, this.id_class(rhQ_22), lF -> {
                this.id_catch.id_class(rhQ_22);
                lF.id_break(this.id_class(rhQ_22));
            }));
            ++n;
        }
        this.id_class(new Lp_1(this.id_package / 2 - 155 + n % 2 * 160, this.id_int / 6 + 24 * (n >> 1), 150, 20, QF.id_goto, QF.id_goto.id_class(this.id_catch), lF -> {
            QF.id_goto.id_class(this.id_catch, 1);
            this.id_catch.id_break();
            lF.id_break(QF.id_goto.id_class(this.id_catch));
            this.id_catch.id_byte();
        }));
        if (++n % 2 == 1) {
            ++n;
        }
        this.id_class(new LF(this.id_package / 2 - 100, this.id_int / 6 + 24 * (n >> 1), 200, 20, rrba_3.id_break("of.options.skinCustomisation.ofCape"), lF -> this.id_volatile.id_break(new rrJb_1(this))));
        this.id_class(new LF(this.id_package / 2 - 100, this.id_int / 6 + 24 * ((n += 2) >> 1), 200, 20, cN_2.id_byte, lF -> this.id_volatile.id_break(this.id_case)));
    }
}

