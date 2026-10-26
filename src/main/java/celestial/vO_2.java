/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.LF;
import celestial.Lc_1;
import celestial.Lp_1;
import celestial.Ml_1;
import celestial.QF;
import celestial.Qw_1;
import celestial.cN_2;
import celestial.rgn_3;
import celestial.rqL_2;
import celestial.vl_3;
import celestial.vm_3;

public class vO_2
extends vl_3 {
    public vO_2(vm_3 vm_32, Qw_1 qw_1) {
        super(vm_32, qw_1, new rgn_3("options.sounds.title"));
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        this.id_class(ml_1);
        vO_2.id_class(ml_1, this.id_super, this.id_extends, this.id_package / 2, 15, 0xFFFFFF);
        super.id_class(ml_1, n, n2, f);
    }

    @Override
    protected void v_() {
        int n = 0;
        this.id_class(new Lc_1(this.id_volatile, this.id_package / 2 - 155 + n % 2 * 160, this.id_int / 6 - 12 + 24 * (n >> 1), rqL_2.MASTER, 310));
        n += 2;
        for (rqL_2 rqL_22 : rqL_2.values()) {
            if (rqL_22 == rqL_2.MASTER) continue;
            this.id_class(new Lc_1(this.id_volatile, this.id_package / 2 - 155 + n % 2 * 160, this.id_int / 6 - 12 + 24 * (n >> 1), rqL_22, 150));
            ++n;
        }
        int n2 = this.id_package / 2 - 75;
        int n3 = this.id_int / 6 - 12;
        this.id_class(new Lp_1(n2, n3 + 24 * (++n >> 1), 150, 20, QF.id_boolean, QF.id_boolean.id_byte(this.id_catch), lF -> {
            QF.id_boolean.id_class((Qw_1)this.id_volatile.id_class[20]);
            lF.id_break(QF.id_boolean.id_byte((Qw_1)this.id_volatile.id_class[20]));
            ((Qw_1)this.id_volatile.id_class[20]).id_break();
        }));
        this.id_class(new LF(this.id_package / 2 - 100, this.id_int / 6 + 168, 200, 20, cN_2.id_byte, lF -> this.id_volatile.id_break(this.id_case)));
    }
}

