/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rHK;
import celestial.rHu_1;
import celestial.rJr_1;
import celestial.rXC;
import celestial.rXe_1;
import celestial.rcd_3;
import celestial.rdn_3;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rhd_3;
import celestial.rhz_3;
import celestial.rja_3;
import celestial.rqA_2;
import celestial.rqL_2;
import celestial.rqn_3;
import celestial.rqs_3;
import celestial.ryW_2;
import celestial.xc_3;
import celestial.xs_3;
import celestial.xu_3;

public class rHM
extends rHK {
    private rqs_3<rdn_3> id_class = rqs_3.id_class(27, rdn_3.id_break);
    private int id_break;

    private rHM(ryW_2<?> ryW_22) {
        super(ryW_22);
    }

    public rHM() {
        this(ryW_2.id_while);
    }

    private void id_class(xc_3 xc_32, rqA_2 rqA_22) {
        rja_3 rja_32 = xc_32.id_byte(xs_3.id_volatile).id_int();
        double d = (double)this.id_native.b_() + 0.5 + (double)rja_32.b_() / 2.0;
        double d2 = (double)this.id_native.c_() + 0.5 + (double)rja_32.c_() / 2.0;
        double d3 = (double)this.id_native.d_() + 0.5 + (double)rja_32.d_() / 2.0;
        this.id_extends.id_class((rhd_3)null, d, d2, d3, rqA_22, rqL_2.BLOCKS, 0.5f, this.id_extends.id_int.nextFloat() * 0.1f + 0.9f);
    }

    @Override
    protected void id_class(rqs_3<rdn_3> rqs_32) {
        this.id_class = rqs_32;
    }

    @Override
    protected rJr_1 id_class(int n, rhz_3 rhz_32) {
        return rXe_1.id_class(n, rhz_32, this);
    }

    private void id_class(xc_3 xc_32, boolean bl) {
        this.id_extends.id_class(this.id_char(), (xc_3)xc_32.id_class(xs_3.id_final, bl), 3);
    }

    @Override
    public void id_class(xc_3 xc_32, rcd_3 rcd_32) {
        super.id_class(xc_32, rcd_32);
        this.id_class = rqs_3.id_class(this.id_else(), rdn_3.id_break);
        if (!this.id_break(rcd_32)) {
            rXC.id_break(rcd_32, this.id_class);
        }
    }

    @Override
    public rcd_3 id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        if (!this.id_byte(rcd_32)) {
            rXC.id_class(rcd_32, this.id_class);
        }
        return rcd_32;
    }

    @Override
    public void id_break(rhd_3 rhd_32) {
        if (!rhd_32.id_native()) {
            --this.id_break;
        }
    }

    public void id_catch() {
        int n = this.id_native.b_();
        int n2 = this.id_native.c_();
        int n3 = this.id_native.d_();
        this.id_break = rHu_1.id_class(this.id_extends, this, n, n2, n3);
        if (this.id_break > 0) {
            this.id_private();
        } else {
            xc_3 xc_32 = this.id_abstract();
            if (!xc_32.id_class(xu_3.ha)) {
                this.aa_();
                return;
            }
            boolean bl = xc_32.id_byte(xs_3.id_final);
            if (bl) {
                this.id_class(xc_32, rqn_3.d);
                this.id_class(xc_32, false);
            }
        }
    }

    @Override
    public int id_else() {
        return 27;
    }

    private void id_private() {
        this.id_extends.id_finally().id_class(this.id_char(), this.id_abstract().id_break(), 5);
    }

    @Override
    protected rqs_3<rdn_3> ad_() {
        return this.id_class;
    }

    @Override
    public void b_(rhd_3 rhd_32) {
        if (!rhd_32.id_native()) {
            if (this.id_break < 0) {
                this.id_break = 0;
            }
            ++this.id_break;
            xc_3 xc_32 = this.id_abstract();
            boolean bl = xc_32.id_byte(xs_3.id_final);
            if (!bl) {
                this.id_class(xc_32, rqn_3.k);
                this.id_class(xc_32, true);
            }
            this.id_private();
        }
    }

    @Override
    protected rgP_2 X_() {
        return new rgn_3("container.barrel");
    }
}

