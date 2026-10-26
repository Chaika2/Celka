/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.LF;
import celestial.Le_1;
import celestial.Ml_1;
import celestial.QF;
import celestial.Qw_1;
import celestial.Ve_1;
import celestial.cN_2;
import celestial.rgn_3;
import celestial.vl_3;
import celestial.vm_3;
import java.util.Arrays;
import java.util.stream.Stream;

public class vE_2
extends vl_3 {
    private Le_1 id_class;
    private static final QF[] id_throws = new QF[]{QF.id_continue, QF.id_const, QF.id_final, QF.id_static, QF.id_switch};

    public vE_2(vm_3 vm_32, Qw_1 qw_1) {
        super(vm_32, qw_1, new rgn_3("options.mouse_settings.title"));
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        this.id_class(ml_1);
        this.id_class.id_class(ml_1, n, n2, f);
        vE_2.id_class(ml_1, this.id_super, this.id_extends, this.id_package / 2, 5, 0xFFFFFF);
        super.id_class(ml_1, n, n2, f);
    }

    @Override
    protected void v_() {
        this.id_class = new Le_1(this.id_volatile, this.id_package, this.id_int, 32, this.id_int - 32, 25);
        if (Ve_1.id_class()) {
            this.id_class.id_class((QF[])Stream.concat(Arrays.stream(id_throws), Stream.of(QF.id_package)).toArray(QF[]::new));
        } else {
            this.id_class.id_class(id_throws);
        }
        this.id_native.add(this.id_class);
        this.id_class(new LF(this.id_package / 2 - 100, this.id_int - 27, 200, 20, cN_2.id_byte, lF -> {
            this.id_catch.id_break();
            this.id_volatile.id_break(this.id_case);
        }));
    }
}

