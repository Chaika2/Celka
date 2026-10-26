/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ax_1;
import celestial.LF;
import celestial.cN_2;
import celestial.cb_3;
import celestial.cl_3;
import celestial.rJr_1;
import celestial.rJu_1;
import celestial.rJv_1;
import celestial.rdn_3;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rhz_3;
import celestial.vN_2;
import celestial.vm_3;
import celestial.vr_3;
import celestial.vz_3;

public class Zi_1
extends vz_3
implements cl_3<rJv_1> {
    private final rJv_1 id_case;
    private final rJu_1 id_catch = new vr_3(this);

    public void id_char() {
        this.id_byte(this.id_case.id_break());
    }

    public Zi_1(rJv_1 rJv_12, rhz_3 rhz_32, rgP_2 rgP_22) {
        this.id_case = rJv_12;
    }

    public void id_interface() {
        rdn_3 rdn_32 = this.id_case.id_class();
        this.id_class(vN_2.id_class(rdn_32));
    }

    @Override
    protected boolean id_break(int n) {
        if (n != this.id_case.id_break()) {
            this.id_finally(100 + n);
            return true;
        }
        return false;
    }

    private void id_finally(int n) {
        ((Ax_1)this.id_volatile.id_class[55]).id_class(this.id_case.id_case, n);
    }

    public rJv_1 id_finally() {
        return this.id_case;
    }

    @Override
    protected void id_package() {
        this.id_finally(2);
    }

    @Override
    protected void id_final() {
        this.id_finally(1);
    }

    @Override
    public void id_volatile() {
        ((cb_3)this.id_volatile.id_class[57]).id_strictfp();
        super.id_volatile();
    }

    @Override
    protected void id_native() {
        if (((cb_3)this.id_volatile.id_class[57]).sD()) {
            this.id_class(new LF(this.id_package / 2 - 100, 196, 98, 20, cN_2.id_byte, lF -> this.id_volatile.id_break((vm_3)null)));
            this.id_class(new LF(this.id_package / 2 + 2, 196, 98, 20, new rgn_3("lectern.take_book"), lF -> this.id_finally(3)));
        } else {
            super.id_native();
        }
    }

    @Override
    protected void v_() {
        super.v_();
        this.id_case.id_class(this.id_catch);
    }

    @Override
    public boolean z_() {
        return false;
    }

    @Override
    public void w_() {
        super.w_();
        this.id_case.id_break(this.id_catch);
    }

    @Override
    public /* synthetic */ rJr_1 G_() {
        return this.id_finally();
    }
}

