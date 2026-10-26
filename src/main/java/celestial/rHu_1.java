/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rCt_1;
import celestial.rHD;
import celestial.rHK;
import celestial.rHf_1;
import celestial.rHw_1;
import celestial.rJr_1;
import celestial.rRq_1;
import celestial.rXC;
import celestial.rXW;
import celestial.rXe_1;
import celestial.rXu_1;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rfl_3;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rhd_3;
import celestial.rhz_3;
import celestial.rpr_3;
import celestial.rqA_2;
import celestial.rqL_2;
import celestial.rqn_3;
import celestial.rqs_3;
import celestial.ryO_2;
import celestial.ryW_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xt_3;

public class rHu_1
extends rHK
implements rHf_1,
rHw_1 {
    private rqs_3<rdn_3> id_case = rqs_3.id_class(27, rdn_3.id_break);
    protected float id_class;
    protected float id_break;
    protected int id_byte;
    private int id_catch;

    protected rHu_1(ryW_2<?> ryW_22) {
        super(ryW_22);
    }

    public rHu_1() {
        this(ryW_2.id_break);
    }

    private void id_class(rqA_2 rqA_22) {
        rCt_1 rCt_12 = this.id_abstract().id_byte(xt_3.id_package);
        if (rCt_12 != rCt_1.LEFT) {
            double d = (double)this.id_native.b_() + 0.5;
            double d2 = (double)this.id_native.c_() + 0.5;
            double d3 = (double)this.id_native.d_() + 0.5;
            if (rCt_12 == rCt_1.RIGHT) {
                rpr_3 rpr_32 = xt_3.id_implements(this.id_abstract());
                d += (double)rpr_32.id_implements() * 0.5;
                d3 += (double)rpr_32.id_extends() * 0.5;
            }
            this.id_extends.id_class((rhd_3)null, d, d2, d3, rqA_22, rqL_2.BLOCKS, 0.5f, this.id_extends.id_int.nextFloat() * 0.1f + 0.9f);
        }
    }

    public static void id_class(rHu_1 rHu_12, rHu_1 rHu_13) {
        rqs_3<rdn_3> rqs_32 = rHu_12.ad_();
        rHu_12.id_class(rHu_13.ad_());
        rHu_13.id_class(rqs_32);
    }

    public static int id_class(rYB rYB2, rHD rHD2, int n, int n2, int n3) {
        int n4 = 0;
        float f = 5.0f;
        for (rhd_3 rhd_32 : rYB2.id_class(rhd_3.class, new rfl_3((float)n - 5.0f, (float)n2 - 5.0f, (float)n3 - 5.0f, (float)(n + 1) + 5.0f, (float)(n2 + 1) + 5.0f, (float)(n3 + 1) + 5.0f))) {
            rXu_1 rXu_12;
            if (!((rJr_1)rhd_32.id_implements[4] instanceof rXe_1) || (rXu_12 = ((rXe_1)((rJr_1)rhd_32.id_implements[4])).id_class()) != rHD2 && (!(rXu_12 instanceof rXW) || !((rXW)rXu_12).id_class(rHD2))) continue;
            ++n4;
        }
        return n4;
    }

    public static int id_class(rRq_1 rRq_12, rfH_2 rfH_22) {
        ryO_2 ryO_22;
        xc_3 xc_32 = rRq_12.id_byte(rfH_22);
        if (xc_32.id_break().id_protected() && (ryO_22 = rRq_12.id_class(rfH_22)) instanceof rHu_1) {
            return ((rHu_1)ryO_22).id_byte;
        }
        return 0;
    }

    @Override
    public float id_class(float f) {
        return rfU_2.id_catch(f, this.id_break, this.id_class);
    }

    @Override
    protected void id_class(rqs_3<rdn_3> rqs_32) {
        this.id_case = rqs_32;
    }

    @Override
    public void id_class(xc_3 xc_32, rcd_3 rcd_32) {
        super.id_class(xc_32, rcd_32);
        this.id_case = rqs_3.id_class(this.id_else(), rdn_3.id_break);
        if (!this.id_break(rcd_32)) {
            rXC.id_break(rcd_32, this.id_case);
        }
    }

    @Override
    public rcd_3 id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        if (!this.id_byte(rcd_32)) {
            rXC.id_class(rcd_32, this.id_case);
        }
        return rcd_32;
    }

    @Override
    protected rJr_1 id_class(int n, rhz_3 rhz_32) {
        return rXe_1.id_class(n, rhz_32, this);
    }

    public static int id_class(rYB rYB2, rHD rHD2, int n, int n2, int n3, int n4, int n5) {
        if (!rYB2.id_continue && n5 != 0 && (n + n2 + n3 + n4) % 200 == 0) {
            n5 = rHu_1.id_class(rYB2, rHD2, n2, n3, n4);
        }
        return n5;
    }

    @Override
    public void id_break(rhd_3 rhd_32) {
        if (!rhd_32.id_native()) {
            --this.id_byte;
            this.id_catch();
        }
    }

    @Override
    public void id_throws() {
        int n = this.id_native.b_();
        int n2 = this.id_native.c_();
        int n3 = this.id_native.d_();
        ++this.id_catch;
        this.id_byte = rHu_1.id_class(this.id_extends, this, this.id_catch, n, n2, n3, this.id_byte);
        this.id_break = this.id_class;
        float f = 0.1f;
        if (this.id_byte > 0 && this.id_class == 0.0f) {
            this.id_class(rqn_3.rI);
        }
        if (this.id_byte == 0 && this.id_class > 0.0f || this.id_byte > 0 && this.id_class < 1.0f) {
            float f2 = this.id_class;
            this.id_class = this.id_byte > 0 ? (this.id_class += 0.1f) : (this.id_class -= 0.1f);
            if (this.id_class > 1.0f) {
                this.id_class = 1.0f;
            }
            float f3 = 0.5f;
            if (this.id_class < 0.5f && f2 >= 0.5f) {
                this.id_class(rqn_3.rt);
            }
            if (this.id_class < 0.0f) {
                this.id_class = 0.0f;
            }
        }
    }

    protected void id_catch() {
        xd_3 xd_32 = this.id_abstract().id_break();
        if (xd_32 instanceof xt_3) {
            this.id_extends.id_class(this.id_native, xd_32, 1, this.id_byte);
            this.id_extends.id_break(this.id_native, xd_32);
        }
    }

    @Override
    public int id_else() {
        return 27;
    }

    public int id_private() {
        return this.id_byte;
    }

    @Override
    public boolean a_(int n, int n2) {
        if (n == 1) {
            this.id_byte = n2;
            return true;
        }
        return super.a_(n, n2);
    }

    @Override
    protected rqs_3<rdn_3> ad_() {
        return this.id_case;
    }

    @Override
    public void b_(rhd_3 rhd_32) {
        if (!rhd_32.id_native()) {
            if (this.id_byte < 0) {
                this.id_byte = 0;
            }
            ++this.id_byte;
            this.id_catch();
        }
    }

    @Override
    protected rgP_2 X_() {
        return new rgn_3("container.chest");
    }
}

