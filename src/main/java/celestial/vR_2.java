/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.LF;
import celestial.Le_1;
import celestial.Ml_1;
import celestial.QF;
import celestial.Qw_1;
import celestial.cN_2;
import celestial.rgP_2;
import celestial.rpl_3;
import celestial.vl_3;
import celestial.vm_3;
import java.util.List;

public abstract class vR_2
extends vl_3 {
    private final QF[] id_class;
    private Le_1 id_throws;

    public vR_2(vm_3 vm_32, Qw_1 qw_1, rgP_2 rgP_22, QF[] qFArray) {
        super(vm_32, qw_1, rgP_22);
        this.id_class = qFArray;
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        this.id_class(ml_1);
        this.id_throws.id_class(ml_1, n, n2, f);
        vR_2.id_class(ml_1, this.id_super, this.id_extends, this.id_package / 2, 20, 0xFFFFFF);
        super.id_class(ml_1, n, n2, f);
        List<rpl_3> list = vR_2.id_class(this.id_throws, n, n2);
        if (list != null) {
            this.id_break(ml_1, list, n, n2);
        }
    }

    protected void id_protected() {
        this.id_class(new LF(this.id_package / 2 - 100, this.id_int - 27, 200, 20, cN_2.id_byte, lF -> this.id_volatile.id_break(this.id_case)));
    }

    @Override
    protected void v_() {
        this.id_throws = new Le_1(this.id_volatile, this.id_package, this.id_int, 32, this.id_int - 32, 25);
        this.id_throws.id_class(this.id_class);
        this.id_native.add(this.id_throws);
        this.id_protected();
    }
}

