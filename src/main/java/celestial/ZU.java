/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.LF;
import celestial.Lp_1;
import celestial.Ml_1;
import celestial.QF;
import celestial.Qw_1;
import celestial.Za_1;
import celestial.Ze_1;
import celestial.cN_2;
import celestial.jV_2;
import celestial.rgF_2;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.vl_3;
import celestial.vm_3;

public class ZU
extends vl_3 {
    private static final rgP_2 id_class = new rgN_2("(").id_class(new rgn_3("options.languageWarning")).id_break(")").id_class(rgF_2.GRAY);
    private Ze_1 id_throws;
    public final jV_2 id_private;
    private Lp_1 id_implements;
    private LF id_finally;

    public ZU(vm_3 vm_32, Qw_1 qw_1, jV_2 jV_22) {
        super(vm_32, qw_1, new rgn_3("options.language"));
        this.id_private = jV_22;
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        this.id_throws.id_class(ml_1, n, n2, f);
        ZU.id_class(ml_1, this.id_super, this.id_extends, this.id_package / 2, 16, 0xFFFFFF);
        ZU.id_class(ml_1, this.id_super, id_class, this.id_package / 2, this.id_int - 56, 0x808080);
        super.id_class(ml_1, n, n2, f);
    }

    @Override
    protected void v_() {
        this.id_throws = new Ze_1(this, this.id_volatile);
        this.id_native.add(this.id_throws);
        this.id_implements = this.id_class(new Lp_1(this.id_package / 2 - 155, this.id_int - 38, 150, 20, QF.id_default, QF.id_default.id_byte(this.id_catch), lF -> {
            QF.id_default.id_class(this.id_catch);
            this.id_catch.id_break();
            lF.id_break(QF.id_default.id_byte(this.id_catch));
            this.id_volatile.v();
        }));
        this.id_finally = this.id_class(new LF(this.id_package / 2 - 155 + 160, this.id_int - 38, 150, 20, cN_2.id_byte, lF -> {
            Za_1 za_1 = (Za_1)this.id_throws.id_finally();
            if (za_1 != null && !za_1.id_break.getCode().equals(this.id_private.id_break().getCode())) {
                this.id_private.id_class(za_1.id_break);
                this.id_catch.rG = za_1.id_break.getCode();
                this.id_volatile.id_private();
                this.id_finally.id_break(cN_2.id_byte);
                this.id_implements.id_break(QF.id_default.id_byte(this.id_catch));
                this.id_catch.id_break();
            }
            this.id_volatile.id_break(this.id_case);
        }));
        super.v_();
    }
}

