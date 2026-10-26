/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 */
package celestial;

import celestial.Jq_1;
import celestial.WF;
import celestial.aI_2;
import celestial.rCL;
import celestial.rCT;
import celestial.rCZ;
import celestial.rCm_1;
import celestial.rLQ;
import celestial.rLT;
import celestial.rRT;
import celestial.rRq_1;
import celestial.rRz_1;
import celestial.rXE;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rff_3;
import celestial.rfw_3;
import celestial.rhN_2;
import celestial.rhd_3;
import celestial.rhx_3;
import celestial.rjU_2;
import celestial.rja_3;
import celestial.rlG_2;
import celestial.rpb_3;
import celestial.rpm_3;
import celestial.rqI_2;
import celestial.rqL_2;
import celestial.rqn_3;
import celestial.ryZ_2;
import celestial.rye_3;
import celestial.xc_3;
import celestial.xd_3;
import com.google.common.collect.ImmutableList;
import java.util.Optional;
import java.util.Random;

public class Wv_1
extends xd_3 {
    public static final rCm_1 id_volatile = rCT.q;
    private static final ImmutableList<rja_3> id_final = ImmutableList.of((Object)new rja_3(0, 0, -1), (Object)new rja_3(-1, 0, 0), (Object)new rja_3(0, 0, 1), (Object)new rja_3(1, 0, 0), (Object)new rja_3(-1, 0, -1), (Object)new rja_3(1, 0, -1), (Object)new rja_3(-1, 0, 1), (Object)new rja_3(1, 0, 1));
    private static final ImmutableList<rja_3> id_package = new ImmutableList.Builder().addAll(id_final).addAll(id_final.stream().map(rja_3::id_catch).iterator()).addAll(id_final.stream().map(rja_3::id_implements).iterator()).add((Object)new rja_3(0, 1, 0)).build();

    private void id_byte(xc_3 xc_32, rYB rYB2, rfH_2 rfH_23) {
        rYB2.id_class(rfH_23, false);
        boolean bl = rpb_3.HORIZONTAL.id_class().map(rfH_23::id_break).anyMatch(rfH_22 -> Wv_1.id_class(rfH_22, rYB2));
        boolean bl2 = bl || rYB2.id_break(rfH_23.id_final()).id_class(rlG_2.id_break);
        WF wF = new WF(this, bl2);
        rYB2.id_class(null, rye_3.id_class(), wF, (double)rfH_23.b_() + 0.5, (double)rfH_23.c_() + 0.5, (double)rfH_23.d_() + 0.5, 5.0f, true, rRz_1.DESTROY);
    }

    public Wv_1(Jq_1 jq_1) {
        super(jq_1);
        this.id_extends((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_volatile, 0));
    }

    @Override
    public ryZ_2 id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, rhd_3 rhd_32, rpm_3 rpm_32, rff_3 rff_32) {
        rhN_2 rhN_22;
        rdn_3 rdn_32 = rhd_32.id_protected(rpm_32);
        if (rpm_32 == rpm_3.MAIN_HAND && !Wv_1.id_class(rdn_32) && Wv_1.id_class(rhd_32.id_protected(rpm_3.OFF_HAND))) {
            return ryZ_2.PASS;
        }
        if (Wv_1.id_class(rdn_32) && Wv_1.id_private(xc_32)) {
            Wv_1.id_class(rYB2, rfH_22, xc_32);
            if (!((rhx_3)rhd_32.id_implements[18]).id_protected) {
                rdn_32.id_catch(1);
            }
            return ryZ_2.id_class(rYB2.id_continue);
        }
        if (xc_32.id_byte(id_volatile) == 0) {
            return ryZ_2.PASS;
        }
        if (!Wv_1.id_class(rYB2)) {
            if (!rYB2.id_continue) {
                this.id_byte(xc_32, rYB2, rfH_22);
            }
            return ryZ_2.id_class(rYB2.id_continue);
        }
        if (!(rYB2.id_continue || (rhN_22 = (rhN_2)rhd_32).E() == rYB2.E() && rhN_22.S().equals(rfH_22))) {
            rhN_22.id_class(rYB2.E(), rfH_22, 0.0f, false, true);
            rYB2.id_class((rhd_3)null, (double)rfH_22.b_() + 0.5, (double)rfH_22.c_() + 0.5, (double)rfH_22.d_() + 0.5, rqn_3.Xy, rqL_2.BLOCKS, 1.0f, 1.0f);
            return ryZ_2.SUCCESS;
        }
        return ryZ_2.CONSUME;
    }

    public static int id_class(xc_3 xc_32, int n) {
        return rfU_2.id_protected((float)(xc_32.id_byte(id_volatile) - 0) / 4.0f * (float)n);
    }

    public static Optional<rjU_2> id_class(aI_2<?> aI_22, rRT rRT2, rfH_2 rfH_22) {
        Optional<rjU_2> optional = Wv_1.id_class(aI_22, rRT2, rfH_22, true);
        return optional.isPresent() ? optional : Wv_1.id_class(aI_22, rRT2, rfH_22, false);
    }

    private static Optional<rjU_2> id_class(aI_2<?> aI_22, rRT rRT2, rfH_2 rfH_22, boolean bl) {
        rfw_3 rfw_32 = new rfw_3();
        for (rja_3 rja_32 : id_package) {
            rfw_32.id_class(rfH_22).id_case(rja_32);
            rjU_2 rjU_22 = rqI_2.id_class(aI_22, rRT2, rfw_32, bl);
            if (rjU_22 == null) continue;
            return Optional.of(rjU_22);
        }
        return Optional.empty();
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rLT rLT2) {
        return false;
    }

    private static boolean id_class(rfH_2 rfH_22, rYB rYB2) {
        rXE rXE2 = rYB2.id_break(rfH_22);
        if (!rXE2.id_class(rlG_2.id_break)) {
            return false;
        }
        if (rXE2.id_break()) {
            return true;
        }
        float f = rXE2.id_throws();
        if (f < 2.0f) {
            return false;
        }
        rXE rXE3 = rYB2.id_break(rfH_22.id_break());
        return !rXE3.id_class(rlG_2.id_break);
    }

    private static boolean id_class(rdn_3 rdn_32) {
        return rdn_32.id_break() == rdy_3.Bm;
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(new rCZ[]{id_volatile});
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, Random random) {
        if (xc_32.id_byte(id_volatile) != 0) {
            if (random.nextInt(100) == 0) {
                rYB2.id_class((rhd_3)null, (double)rfH_22.b_() + 0.5, (double)rfH_22.c_() + 0.5, (double)rfH_22.d_() + 0.5, rqn_3.XC, rqL_2.BLOCKS, 1.0f, 1.0f);
            }
            double d = (double)rfH_22.b_() + 0.5 + (0.5 - random.nextDouble());
            double d2 = (double)rfH_22.c_() + 1.0;
            double d3 = (double)rfH_22.d_() + 0.5 + (0.5 - random.nextDouble());
            double d4 = (double)random.nextFloat() * 0.04;
            rYB2.id_class(rLQ.v, d, d2, d3, 0.0, d4, 0.0);
        }
    }

    public static void id_class(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32) {
        rYB2.id_class(rfH_22, (xc_3)xc_32.id_class(id_volatile, xc_32.id_byte(id_volatile) + 1), 3);
        rYB2.id_class((rhd_3)null, (double)rfH_22.b_() + 0.5, (double)rfH_22.c_() + 0.5, (double)rfH_22.d_() + 0.5, rqn_3.Xl, rqL_2.BLOCKS, 1.0f, 1.0f);
    }

    public static boolean id_class(rYB rYB2) {
        return rYB2.id_default().id_implements();
    }

    @Override
    public int id_break(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22) {
        return Wv_1.id_class(xc_32, 15);
    }

    @Override
    public boolean id_case(xc_3 xc_32) {
        return true;
    }

    private static boolean id_private(xc_3 xc_32) {
        return xc_32.id_byte(id_volatile) < 4;
    }
}

