/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.JC;
import celestial.Jq_1;
import celestial.an_3;
import celestial.dy_3;
import celestial.kX_2;
import celestial.rCL;
import celestial.rCT;
import celestial.rCZ;
import celestial.rCm_1;
import celestial.rCn_1;
import celestial.rGx_1;
import celestial.rRR;
import celestial.rRq_1;
import celestial.rRu_1;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rjC_2;
import celestial.rjm_3;
import celestial.rpL_2;
import celestial.rrEm_1;
import celestial.xF_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import java.util.Random;

public class dO_2
extends xF_2
implements kX_2 {
    public static final rCm_1 id_final = rCT.d;
    private static final rjC_2[] id_volatile = new rjC_2[]{xd_3.id_class(0.0, 0.0, 0.0, 16.0, 2.0, 16.0), xd_3.id_class(0.0, 0.0, 0.0, 16.0, 4.0, 16.0), xd_3.id_class(0.0, 0.0, 0.0, 16.0, 6.0, 16.0), xd_3.id_class(0.0, 0.0, 0.0, 16.0, 8.0, 16.0), xd_3.id_class(0.0, 0.0, 0.0, 16.0, 10.0, 16.0), xd_3.id_class(0.0, 0.0, 0.0, 16.0, 12.0, 16.0), xd_3.id_class(0.0, 0.0, 0.0, 16.0, 14.0, 16.0), xd_3.id_class(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)};

    public xc_3 id_byte(int n) {
        return (xc_3)this.id_continue().id_class(this.id_break(), n);
    }

    protected dO_2(Jq_1 jq_1) {
        super(jq_1);
        this.id_extends((xc_3)((xc_3)this.id_abstract.id_break()).id_class(this.id_break(), 0));
    }

    @Override
    public rdn_3 id_class(rRq_1 rRq_12, rfH_2 rfH_22, xc_3 xc_32) {
        return new rdn_3(this.id_finally());
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, an_3 an_32) {
        if (an_32 instanceof rGx_1 && rYB2.B().id_break(rRu_1.id_break)) {
            rYB2.id_class(rfH_22, true, an_32);
        }
        super.id_class(xc_32, rYB2, rfH_22, an_32);
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRR rRR2, rfH_2 rfH_22) {
        return (rRR2.id_class(rfH_22, 0) >= 8 || rRR2.id_case(rfH_22)) && super.id_class(xc_32, rRR2, rfH_22);
    }

    protected int id_class(rYB rYB2) {
        return rfU_2.id_class(rYB2.id_int, 2, 5);
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return id_volatile[xc_32.id_byte(this.id_break())];
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(new rCZ[]{id_final});
    }

    @Override
    public void id_class(rrEm_1 rrEm_12, Random random, rfH_2 rfH_22, xc_3 xc_32) {
        this.id_class((rYB)rrEm_12, rfH_22, xc_32);
    }

    @Override
    public boolean id_class(rYB rYB2, Random random, rfH_2 rfH_22, xc_3 xc_32) {
        return true;
    }

    @Override
    public boolean id_class(rRq_1 rRq_12, rfH_2 rfH_22, xc_3 xc_32, boolean bl) {
        return !this.id_implements(xc_32);
    }

    protected static float id_class(xd_3 xd_32, rRq_1 rRq_12, rfH_2 rfH_22) {
        boolean bl;
        Object object;
        float f = 1.0f;
        rfH_2 rfH_23 = rfH_22.id_break();
        for (int i = -1; i <= 1; ++i) {
            for (int j = -1; j <= 1; ++j) {
                float f2 = 0.0f;
                object = rRq_12.id_byte(rfH_23.id_break(i, 0, j));
                if (((JC)object).id_class(xu_3.PS)) {
                    f2 = 1.0f;
                    if (((rCn_1)object).id_byte(dy_3.id_volatile) > 0) {
                        f2 = 3.0f;
                    }
                }
                if (i != 0 || j != 0) {
                    f2 /= 4.0f;
                }
                f += f2;
            }
        }
        rfH_2 rfH_24 = rfH_22.id_private();
        rfH_2 rfH_25 = rfH_22.id_protected();
        rfH_2 rfH_26 = rfH_22.id_byte();
        object = rfH_22.id_extends();
        boolean bl2 = xd_32 == rRq_12.id_byte(rfH_26).id_break() || xd_32 == rRq_12.id_byte((rfH_2)object).id_break();
        boolean bl3 = bl = xd_32 == rRq_12.id_byte(rfH_24).id_break() || xd_32 == rRq_12.id_byte(rfH_25).id_break();
        if (bl2 && bl) {
            f /= 2.0f;
        } else {
            boolean bl4;
            boolean bl5 = bl4 = xd_32 == rRq_12.id_byte(rfH_26.id_private()).id_break() || xd_32 == rRq_12.id_byte(((rfH_2)object).id_private()).id_break() || xd_32 == rRq_12.id_byte(((rfH_2)object).id_protected()).id_break() || xd_32 == rRq_12.id_byte(rfH_26.id_protected()).id_break();
            if (bl4) {
                f /= 2.0f;
            }
        }
        return f;
    }

    @Override
    public void id_class(xc_3 xc_32, rrEm_1 rrEm_12, rfH_2 rfH_22, Random random) {
        float f;
        int n;
        if (rrEm_12.id_class(rfH_22, 0) >= 9 && (n = this.id_private(xc_32)) < this.id_implements() && random.nextInt((int)(25.0f / (f = dO_2.id_class(this, rrEm_12, rfH_22))) + 1) == 0) {
            rrEm_12.id_class(rfH_22, this.id_byte(n + 1), 2);
        }
    }

    public void id_class(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32) {
        int n;
        int n2 = this.id_private(xc_32) + this.id_class(rYB2);
        if (n2 > (n = this.id_implements())) {
            n2 = n;
        }
        rYB2.id_class(rfH_22, this.id_byte(n2), 2);
    }

    public rCm_1 id_break() {
        return id_final;
    }

    protected rpL_2 id_finally() {
        return rdy_3.hP;
    }

    @Override
    protected boolean id_catch(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22) {
        return xc_32.id_class(xu_3.PS);
    }

    public int id_implements() {
        return 7;
    }

    public boolean id_implements(xc_3 xc_32) {
        return xc_32.id_byte(this.id_break()) >= this.id_implements();
    }

    protected int id_private(xc_3 xc_32) {
        return xc_32.id_byte(this.id_break());
    }

    @Override
    public boolean a_(xc_3 xc_32) {
        return !this.id_implements(xc_32);
    }
}

