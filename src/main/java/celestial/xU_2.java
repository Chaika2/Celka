/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2FloatMap
 *  it.unimi.dsi.fastutil.objects.Object2FloatOpenHashMap
 */
package celestial;

import celestial.Jq_1;
import celestial.rCL;
import celestial.rCT;
import celestial.rCZ;
import celestial.rCm_1;
import celestial.rLQ;
import celestial.rLT;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rXF;
import celestial.rXL;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rff_3;
import celestial.rhd_3;
import celestial.rhx_3;
import celestial.rjC_2;
import celestial.rjN_2;
import celestial.rjm_3;
import celestial.rjw_3;
import celestial.rpB_2;
import celestial.rpL_2;
import celestial.rpm_3;
import celestial.rqL_2;
import celestial.rqR_2;
import celestial.rqn_3;
import celestial.rrEm_1;
import celestial.rsE_2;
import celestial.ryZ_2;
import celestial.xa_3;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xe_3;
import celestial.xi_3;
import it.unimi.dsi.fastutil.objects.Object2FloatMap;
import it.unimi.dsi.fastutil.objects.Object2FloatOpenHashMap;
import java.util.Random;

public class xU_2
extends xd_3
implements rXL {
    public static final rCm_1 id_volatile = rCT.v;
    public static final Object2FloatMap<rpL_2> id_final = new Object2FloatOpenHashMap();
    private static final rjC_2 id_package = rjw_3.id_break();
    private static final rjC_2[] id_int = rqR_2.id_class(new rjC_2[9], (T rjC_2Array) -> {
        for (int i = 0; i < 8; ++i) {
            rjC_2Array[i] = rjw_3.id_class(id_package, xd_3.id_class(2.0, Math.max(2, 1 + i * 2), 2.0, 14.0, 16.0, 14.0), rjN_2.id_throws);
        }
        rjC_2Array[8] = rjC_2Array[7];
    });

    @Override
    public rjC_2 id_byte(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22) {
        return id_package;
    }

    public static xc_3 id_byte(xc_3 xc_32, rRg_1 rRg_12, rfH_2 rfH_22) {
        xc_3 xc_33 = (xc_3)xc_32.id_class(id_volatile, 0);
        rRg_12.id_class(rfH_22, xc_33, 3);
        return xc_33;
    }

    public static xc_3 id_byte(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22) {
        if (!rYB2.id_continue) {
            float f = 0.7f;
            double d = (double)(rYB2.id_int.nextFloat() * 0.7f) + (double)0.15f;
            double d2 = (double)(rYB2.id_int.nextFloat() * 0.7f) + 0.06000000238418579 + 0.6;
            double d3 = (double)(rYB2.id_int.nextFloat() * 0.7f) + (double)0.15f;
            rsE_2 rsE_22 = new rsE_2(rYB2, (double)rfH_22.b_() + d, (double)rfH_22.c_() + d2, (double)rfH_22.d_() + d3, new rdn_3(rdy_3.Xg));
            rsE_22.id_private();
            rYB2.a_(rsE_22);
        }
        xc_3 xc_33 = xU_2.id_byte(xc_32, (rRg_1)rYB2, rfH_22);
        rYB2.id_class((rhd_3)null, rfH_22, rqn_3.Pr, rqL_2.BLOCKS, 1.0f, 1.0f);
        return xc_33;
    }

    public xU_2(Jq_1 jq_1) {
        super(jq_1);
        this.id_extends((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_volatile, 0));
    }

    private static void id_class(float f, rpL_2 rpL_22) {
        id_final.put((Object)rpL_22.id_case(), f);
    }

    public static xc_3 id_class(xc_3 xc_32, rRg_1 rRg_12, rfH_2 rfH_22, rdn_3 rdn_32) {
        int n = xc_32.id_byte(id_volatile);
        float f = id_final.getFloat((Object)rdn_32.id_break());
        if (!(n == 0 && f > 0.0f || rRg_12.id_long().nextDouble() < (double)f)) {
            return xc_32;
        }
        int n2 = n + 1;
        xc_3 xc_33 = (xc_3)xc_32.id_class(id_volatile, n2);
        rRg_12.id_class(rfH_22, xc_33, 3);
        if (n2 == 7) {
            rRg_12.id_finally().id_class(rfH_22, xc_32.id_break(), 20);
        }
        return xc_33;
    }

    @Override
    public rXF id_class(xc_3 xc_32, rRg_1 rRg_12, rfH_2 rfH_22) {
        int n = xc_32.id_byte(id_volatile);
        if (n == 8) {
            return new xa_3(xc_32, rRg_12, rfH_22, new rdn_3(rdy_3.Xg));
        }
        return (rXF)((Object)(n < 7 ? new xi_3(xc_32, rRg_12, rfH_22) : new xe_3()));
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rLT rLT2) {
        return false;
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(new rCZ[]{id_volatile});
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return id_int[xc_32.id_byte(id_volatile)];
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, xc_3 xc_33, boolean bl) {
        if (xc_32.id_byte(id_volatile) == 7) {
            rYB2.id_finally().id_class(rfH_22, xc_32.id_break(), 20);
        }
    }

    @Override
    public ryZ_2 id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, rhd_3 rhd_32, rpm_3 rpm_32, rff_3 rff_32) {
        int n = xc_32.id_byte(id_volatile);
        rdn_3 rdn_32 = rhd_32.id_protected(rpm_32);
        if (n < 8 && id_final.containsKey((Object)rdn_32.id_break())) {
            if (n < 7 && !rYB2.id_continue) {
                xc_3 xc_33 = xU_2.id_class(xc_32, (rRg_1)rYB2, rfH_22, rdn_32);
                rYB2.id_byte(1500, rfH_22, xc_32 != xc_33 ? 1 : 0);
                if (!((rhx_3)rhd_32.id_implements[18]).id_protected) {
                    rdn_32.id_catch(1);
                }
            }
            return ryZ_2.id_class(rYB2.id_continue);
        }
        if (n == 8) {
            xU_2.id_byte(xc_32, rYB2, rfH_22);
            return ryZ_2.id_class(rYB2.id_continue);
        }
        return ryZ_2.PASS;
    }

    public static xc_3 id_class(xc_3 xc_32, rrEm_1 rrEm_12, rdn_3 rdn_32, rfH_2 rfH_22) {
        int n = xc_32.id_byte(id_volatile);
        if (n < 7 && id_final.containsKey((Object)rdn_32.id_break())) {
            xc_3 xc_33 = xU_2.id_class(xc_32, (rRg_1)rrEm_12, rfH_22, rdn_32);
            rdn_32.id_catch(1);
            return xc_33;
        }
        return xc_32;
    }

    public static void id_class(rYB rYB2, rfH_2 rfH_22, boolean bl) {
        xc_3 xc_32 = rYB2.id_byte(rfH_22);
        rYB2.id_class(rfH_22.b_(), (double)rfH_22.c_(), (double)rfH_22.d_(), bl ? rqn_3.PB : rqn_3.PP, rqL_2.BLOCKS, 1.0f, 1.0f, false);
        double d = xc_32.id_finally(rYB2, rfH_22).id_class(rpB_2.Y, 0.5, 0.5) + 0.03125;
        double d2 = 0.13125f;
        double d3 = 0.7375f;
        Random random = rYB2.id_long();
        for (int i = 0; i < 10; ++i) {
            double d4 = random.nextGaussian() * 0.02;
            double d5 = random.nextGaussian() * 0.02;
            double d6 = random.nextGaussian() * 0.02;
            rYB2.id_class(rLQ.id_abstract, (double)rfH_22.b_() + (double)0.13125f + (double)0.7375f * (double)random.nextFloat(), (double)rfH_22.c_() + d + (double)random.nextFloat() * (1.0 - d), (double)rfH_22.d_() + (double)0.13125f + (double)0.7375f * (double)random.nextFloat(), d4, d5, d6);
        }
    }

    public static void id_break() {
        id_final.defaultReturnValue(-1.0f);
        float f = 0.3f;
        float f2 = 0.5f;
        float f3 = 0.65f;
        float f4 = 0.85f;
        float f5 = 1.0f;
        xU_2.id_class(0.3f, rdy_3.L);
        xU_2.id_class(0.3f, rdy_3.Z);
        xU_2.id_class(0.3f, rdy_3.v);
        xU_2.id_class(0.3f, rdy_3.n);
        xU_2.id_class(0.3f, rdy_3.A);
        xU_2.id_class(0.3f, rdy_3.F);
        xU_2.id_class(0.3f, rdy_3.id_public);
        xU_2.id_class(0.3f, rdy_3.id_goto);
        xU_2.id_class(0.3f, rdy_3.id_while);
        xU_2.id_class(0.3f, rdy_3.id_try);
        xU_2.id_class(0.3f, rdy_3.id_instanceof);
        xU_2.id_class(0.3f, rdy_3.id_throw);
        xU_2.id_class(0.3f, rdy_3.kJ);
        xU_2.id_class(0.3f, rdy_3.Jd);
        xU_2.id_class(0.3f, rdy_3.R);
        xU_2.id_class(0.3f, rdy_3.rt);
        xU_2.id_class(0.3f, rdy_3.JW);
        xU_2.id_class(0.3f, rdy_3.Jk);
        xU_2.id_class(0.3f, rdy_3.K);
        xU_2.id_class(0.3f, rdy_3.WQ);
        xU_2.id_class(0.3f, rdy_3.hP);
        xU_2.id_class(0.5f, rdy_3.XG);
        xU_2.id_class(0.5f, rdy_3.EN);
        xU_2.id_class(0.5f, rdy_3.BS);
        xU_2.id_class(0.5f, rdy_3.rT);
        xU_2.id_class(0.5f, rdy_3.Be);
        xU_2.id_class(0.5f, rdy_3.ry);
        xU_2.id_class(0.5f, rdy_3.rp);
        xU_2.id_class(0.5f, rdy_3.rq);
        xU_2.id_class(0.5f, rdy_3.Jx);
        xU_2.id_class(0.65f, rdy_3.D);
        xU_2.id_class(0.65f, rdy_3.SO);
        xU_2.id_class(0.65f, rdy_3.Bd);
        xU_2.id_class(0.65f, rdy_3.Bk);
        xU_2.id_class(0.65f, rdy_3.BU);
        xU_2.id_class(0.65f, rdy_3.Ob);
        xU_2.id_class(0.65f, rdy_3.kX);
        xU_2.id_class(0.65f, rdy_3.ds);
        xU_2.id_class(0.65f, rdy_3.Xv);
        xU_2.id_class(0.65f, rdy_3.dE);
        xU_2.id_class(0.65f, rdy_3.hB);
        xU_2.id_class(0.65f, rdy_3.rL);
        xU_2.id_class(0.65f, rdy_3.rA);
        xU_2.id_class(0.65f, rdy_3.BY);
        xU_2.id_class(0.65f, rdy_3.rn);
        xU_2.id_class(0.65f, rdy_3.rC);
        xU_2.id_class(0.65f, rdy_3.JL);
        xU_2.id_class(0.65f, rdy_3.rl);
        xU_2.id_class(0.65f, rdy_3.rH);
        xU_2.id_class(0.65f, rdy_3.Wu);
        xU_2.id_class(0.65f, rdy_3.rx);
        xU_2.id_class(0.65f, rdy_3.rd);
        xU_2.id_class(0.65f, rdy_3.rk);
        xU_2.id_class(0.65f, rdy_3.rW);
        xU_2.id_class(0.65f, rdy_3.rz);
        xU_2.id_class(0.65f, rdy_3.rQ);
        xU_2.id_class(0.65f, rdy_3.rN);
        xU_2.id_class(0.65f, rdy_3.rc);
        xU_2.id_class(0.65f, rdy_3.ru);
        xU_2.id_class(0.65f, rdy_3.rm);
        xU_2.id_class(0.65f, rdy_3.rZ);
        xU_2.id_class(0.65f, rdy_3.rv);
        xU_2.id_class(0.65f, rdy_3.rF);
        xU_2.id_class(0.65f, rdy_3.Y);
        xU_2.id_class(0.65f, rdy_3.Ek);
        xU_2.id_class(0.65f, rdy_3.EW);
        xU_2.id_class(0.65f, rdy_3.Ez);
        xU_2.id_class(0.65f, rdy_3.EQ);
        xU_2.id_class(0.65f, rdy_3.Ec);
        xU_2.id_class(0.85f, rdy_3.sR);
        xU_2.id_class(0.85f, rdy_3.Bg);
        xU_2.id_class(0.85f, rdy_3.BR);
        xU_2.id_class(0.85f, rdy_3.Gk);
        xU_2.id_class(0.85f, rdy_3.GW);
        xU_2.id_class(0.85f, rdy_3.hS);
        xU_2.id_class(0.85f, rdy_3.dG);
        xU_2.id_class(0.85f, rdy_3.Jh);
        xU_2.id_class(1.0f, rdy_3.Xo);
        xU_2.id_class(1.0f, rdy_3.dN);
    }

    @Override
    public rjC_2 id_break(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return id_int[0];
    }

    @Override
    public void id_break(xc_3 xc_32, rrEm_1 rrEm_12, rfH_2 rfH_22, Random random) {
        if (xc_32.id_byte(id_volatile) == 7) {
            rrEm_12.id_class(rfH_22, (xc_3)xc_32.id_class(id_volatile), 3);
            rrEm_12.id_class((rhd_3)null, rfH_22, rqn_3.PS, rqL_2.BLOCKS, 1.0f, 1.0f);
        }
    }

    @Override
    public int id_break(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22) {
        return xc_32.id_byte(id_volatile);
    }

    @Override
    public boolean id_case(xc_3 xc_32) {
        return true;
    }
}

