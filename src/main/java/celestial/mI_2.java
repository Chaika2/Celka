/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.LF;
import celestial.LR;
import celestial.Ml_1;
import celestial.QF;
import celestial.Qw_1;
import celestial.Va_1;
import celestial.Ve_1;
import celestial.Vi_1;
import celestial.Vu_1;
import celestial.cN_2;
import celestial.rgn_3;
import celestial.rqR_2;
import celestial.vE_2;
import celestial.vl_3;
import celestial.vm_3;
import java.util.HashSet;
import java.util.Set;

public class mI_2
extends vl_3 {
    public Vu_1 id_class;
    public long id_throws;
    private LR id_private;
    private LF id_implements;
    private final Set<Va_1> id_finally = new HashSet<Va_1>();

    public mI_2(vm_3 vm_32, Qw_1 qw_1) {
        super(vm_32, qw_1, new rgn_3("controls.title"));
    }

    @Override
    public boolean id_class(double d, double d2, int n) {
        if (this.id_class != null && !this.id_finally.isEmpty()) {
            this.id_catch.id_class(this.id_class, Vi_1.MOUSE.id_class(n), this.id_finally);
            this.id_finally.clear();
            this.id_class = null;
            this.id_throws = rqR_2.id_break();
            Vu_1.id_byte();
            return true;
        }
        return super.id_class(d, d2, n);
    }

    @Override
    public boolean id_class(int n, int n2, int n3) {
        if (this.id_class != null) {
            if (n != 256) {
                this.id_finally.add(Ve_1.id_class(n, n2));
            }
            return true;
        }
        return super.id_class(n, n2, n3);
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        this.id_class(ml_1);
        this.id_private.id_class(ml_1, n, n2, f);
        mI_2.id_class(ml_1, this.id_super, this.id_extends, this.id_package / 2, 8, 0xFFFFFF);
        boolean bl = false;
        for (Vu_1 vu_1 : this.id_catch.f) {
            if (vu_1.id_volatile()) continue;
            bl = true;
            break;
        }
        this.id_implements.id_int = bl;
        super.id_class(ml_1, n, n2, f);
    }

    @Override
    public boolean id_break(int n, int n2, int n3) {
        if (this.id_class != null) {
            if (n == 256) {
                this.id_catch.id_class(this.id_class, Ve_1.id_class);
            } else {
                this.id_catch.id_class(this.id_class, Ve_1.id_class(n, n2), this.id_finally);
            }
            this.id_finally.clear();
            this.id_class = null;
            this.id_throws = rqR_2.id_break();
            Vu_1.id_byte();
            return true;
        }
        return super.id_break(n, n2, n3);
    }

    @Override
    public boolean id_break(double d, double d2, int n) {
        if (this.id_class != null) {
            this.id_finally.add(Vi_1.MOUSE.id_class(n));
            return true;
        }
        return super.id_break(d, d2, n);
    }

    @Override
    protected void v_() {
        this.id_class(new LF(this.id_package / 2 - 155, 18, 150, 20, new rgn_3("options.mouse_settings"), lF -> this.id_volatile.id_break(new vE_2(this, this.id_catch))));
        this.id_class(QF.id_throw.id_class(this.id_catch, this.id_package / 2 - 155 + 160, 18, 150));
        this.id_private = new LR(this, this.id_volatile);
        this.id_native.add(this.id_private);
        this.id_implements = this.id_class(new LF(this.id_package / 2 - 155, this.id_int - 29, 150, 20, new rgn_3("controls.resetAll"), lF -> {
            for (Vu_1 vu_1 : this.id_catch.f) {
                vu_1.id_class(vu_1.id_private(), vu_1.id_finally());
            }
            Vu_1.id_byte();
        }));
        this.id_class(new LF(this.id_package / 2 - 155 + 160, this.id_int - 29, 150, 20, cN_2.id_byte, lF -> this.id_volatile.id_break(this.id_case)));
    }
}

