/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.JC;
import celestial.Jq_1;
import celestial.an_3;
import celestial.dB_2;
import celestial.eA_2;
import celestial.iB_2;
import celestial.kd_3;
import celestial.rCL;
import celestial.rCN;
import celestial.rCT;
import celestial.rCc_1;
import celestial.rHc_1;
import celestial.rLO;
import celestial.rLQ;
import celestial.rLT;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rRu_1;
import celestial.rXE;
import celestial.rXG;
import celestial.rXn_1;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rff_3;
import celestial.rhd_3;
import celestial.rhf_3;
import celestial.rhx_3;
import celestial.rjC_2;
import celestial.rjN_2;
import celestial.rjm_3;
import celestial.rjw_3;
import celestial.rkC_2;
import celestial.rlB_2;
import celestial.rls_3;
import celestial.rpa_3;
import celestial.rpm_3;
import celestial.rpr_3;
import celestial.rqL_2;
import celestial.rqd_3;
import celestial.rqn_3;
import celestial.rxx_3;
import celestial.ryO_2;
import celestial.ryZ_2;
import celestial.rye_3;
import celestial.xN_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import java.util.Optional;
import java.util.Random;

public class xn_3
extends dB_2
implements kd_3 {
    protected static final rjC_2 id_volatile = xd_3.id_class(0.0, 0.0, 0.0, 16.0, 7.0, 16.0);
    public static final rCN id_final = rCT.id_continue;
    public static final rCN id_package = rCT.id_goto;
    public static final rCN id_int = rCT.id_throw;
    public static final rCc_1 id_new = rCT.id_strictfp;
    private static final rjC_2 id_continue = xd_3.id_class(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
    private final boolean id_super;
    private final int id_this;

    public static void id_byte(rRg_1 rRg_12, rfH_2 rfH_22, xc_3 xc_32) {
        ryO_2 ryO_22;
        if (rRg_12.id_import()) {
            for (int i = 0; i < 20; ++i) {
                xn_3.id_class((rYB)rRg_12, rfH_22, xc_32.id_byte(id_package), true);
            }
        }
        if ((ryO_22 = rRg_12.id_class(rfH_22)) instanceof rHc_1) {
            ((rHc_1)ryO_22).id_catch();
        }
    }

    public xn_3(boolean bl, int n, Jq_1 jq_1) {
        super(jq_1);
        this.id_super = bl;
        this.id_this = n;
        this.id_extends((xc_3)((xc_3)((xc_3)((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_final, true)).id_class(id_package, false)).id_class(id_int, false)).id_class(id_new, rpr_3.NORTH));
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpa_3 rpa_32) {
        return xc_32.id_class(rpa_32.id_class(xc_32.id_byte(id_new)));
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rqd_3 rqd_32) {
        return (xc_3)xc_32.id_class(id_new, rqd_32.id_class(xc_32.id_byte(id_new)));
    }

    @Override
    public void id_class(rYB rYB2, xc_3 xc_32, rff_3 rff_32, rhf_3 rhf_32) {
        if (!rYB2.id_continue && rhf_32.Pz()) {
            boolean bl;
            an_3 an_32 = rhf_32.id_else();
            boolean bl2 = bl = an_32 == null || an_32 instanceof rhd_3 || rYB2.B().id_break(rRu_1.id_break);
            if (bl && !xc_32.id_byte(id_final).booleanValue() && !xc_32.id_byte(id_int).booleanValue()) {
                rfH_2 rfH_22 = rff_32.id_class();
                rYB2.id_class(rfH_22, (xc_3)xc_32.id_class(rCT.id_continue, true), 11);
            }
        }
    }

    public static void id_class(rYB rYB2, rfH_2 rfH_22, boolean bl, boolean bl2) {
        Random random = rYB2.id_long();
        rLO rLO2 = bl ? rLQ.x : rLQ.J;
        rYB2.id_break(rLO2, true, (double)rfH_22.b_() + 0.5 + random.nextDouble() / 3.0 * (double)(random.nextBoolean() ? 1 : -1), (double)rfH_22.c_() + random.nextDouble() + random.nextDouble(), (double)rfH_22.d_() + 0.5 + random.nextDouble() / 3.0 * (double)(random.nextBoolean() ? 1 : -1), 0.0, 0.07, 0.0);
        if (bl2) {
            rYB2.id_class(rLQ.id_double, (double)rfH_22.b_() + 0.25 + random.nextDouble() / 2.0 * (double)(random.nextBoolean() ? 1 : -1), (double)rfH_22.c_() + 0.4, (double)rfH_22.d_() + 0.25 + random.nextDouble() / 2.0 * (double)(random.nextBoolean() ? 1 : -1), 0.0, 0.005, 0.0);
        }
    }

    @Override
    public ryZ_2 id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, rhd_3 rhd_32, rpm_3 rpm_32, rff_3 rff_32) {
        rdn_3 rdn_32;
        rHc_1 rHc_12;
        Optional<rkC_2> optional;
        ryO_2 ryO_22 = rYB2.id_class(rfH_22);
        if (ryO_22 instanceof rHc_1 && (optional = (rHc_12 = (rHc_1)ryO_22).id_class(rdn_32 = rhd_32.id_protected(rpm_32))).isPresent()) {
            if (!rYB2.id_continue && rHc_12.id_class(((rhx_3)rhd_32.id_implements[18]).id_protected ? rdn_32.id_implements() : rdn_32, optional.get().id_throws())) {
                rhd_32.id_break(rlB_2.L);
                return ryZ_2.SUCCESS;
            }
            return ryZ_2.CONSUME;
        }
        return ryZ_2.PASS;
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rLT rLT2) {
        return false;
    }

    @Override
    public ryO_2 id_class(rRq_1 rRq_12) {
        return new rHc_1();
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(id_final, id_package, id_int, id_new);
    }

    @Override
    public xN_2 id_class(xc_3 xc_32) {
        return xN_2.MODEL;
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return id_volatile;
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpr_3 rpr_32, xc_3 xc_33, rRg_1 rRg_12, rfH_2 rfH_22, rfH_2 rfH_23) {
        if (xc_32.id_byte(id_int).booleanValue()) {
            rRg_12.id_extends().id_class(rfH_22, rXG.id_byte, rXG.id_byte.id_class(rRg_12));
        }
        return rpr_32 == rpr_3.DOWN ? (xc_3)xc_32.id_class(id_package, this.id_volatile(xc_33)) : super.id_class(xc_32, rpr_32, xc_33, rRg_12, rfH_22, rfH_23);
    }

    @Override
    public xc_3 id_class(rxx_3 rxx_32) {
        rfH_2 rfH_22;
        rYB rYB2 = rxx_32.id_int();
        boolean bl = rYB2.id_break(rfH_22 = rxx_32.id_class()).id_class() == rXG.id_byte;
        return (xc_3)((xc_3)((xc_3)((xc_3)this.id_continue().id_class(id_int, bl)).id_class(id_package, this.id_volatile(rYB2.id_byte(rfH_22.id_break())))).id_class(id_final, !bl)).id_class(id_new, rxx_32.id_case());
    }

    public static boolean id_class(rYB rYB2, rfH_2 rfH_22) {
        for (int i = 1; i <= 5; ++i) {
            rfH_2 rfH_23 = rfH_22.id_catch(i);
            xc_3 xc_32 = rYB2.id_byte(rfH_23);
            if (xn_3.id_private(xc_32)) {
                return true;
            }
            boolean bl = rjw_3.id_byte(id_continue, xc_32.id_break((rRq_1)rYB2, rfH_22, rjm_3.id_break()), rjN_2.id_implements);
            if (!bl) continue;
            xc_3 xc_33 = rYB2.id_byte(rfH_23.id_break());
            return xn_3.id_private(xc_33);
        }
        return false;
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, Random random) {
        if (xc_32.id_byte(id_final).booleanValue()) {
            if (random.nextInt(10) == 0) {
                rYB2.id_class((double)rfH_22.b_() + 0.5, (double)rfH_22.c_() + 0.5, (double)rfH_22.d_() + 0.5, rqn_3.ru, rqL_2.BLOCKS, 0.5f + random.nextFloat(), random.nextFloat() * 0.7f + 0.6f, false);
            }
            if (this.id_super && random.nextInt(5) == 0) {
                for (int i = 0; i < random.nextInt(1) + 1; ++i) {
                    rYB2.id_class(rLQ.id_default, (double)rfH_22.b_() + 0.5, (double)rfH_22.c_() + 0.5, (double)rfH_22.d_() + 0.5, (double)(random.nextFloat() / 2.0f), 5.0E-5, random.nextFloat() / 2.0f);
                }
            }
        }
    }

    @Override
    public boolean id_class(rRg_1 rRg_12, rfH_2 rfH_22, xc_3 xc_32, rXE rXE2) {
        if (!xc_32.id_byte(rCT.id_throw).booleanValue() && rXE2.id_class() == rXG.id_byte) {
            boolean bl = xc_32.id_byte(id_final);
            if (bl) {
                if (!rRg_12.id_import()) {
                    rRg_12.id_class((rhd_3)null, rfH_22, rqn_3.SY, rqL_2.BLOCKS, 1.0f, 1.0f);
                }
                xn_3.id_byte(rRg_12, rfH_22, xc_32);
            }
            rRg_12.id_class(rfH_22, (xc_3)((xc_3)xc_32.id_class(id_int, true)).id_class(id_final, false), 3);
            rRg_12.id_extends().id_class(rfH_22, rXE2.id_class(), rXE2.id_class().id_class(rRg_12));
            return true;
        }
        return false;
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, an_3 an_32) {
        if (!an_32.q() && xc_32.id_byte(id_final).booleanValue() && an_32 instanceof iB_2 && !eA_2.id_implements((iB_2)an_32)) {
            an_32.id_break(rye_3.id_class, this.id_this);
        }
        super.id_class(xc_32, rYB2, rfH_22, an_32);
    }

    @Override
    public void id_break(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, xc_3 xc_33, boolean bl) {
        if (!xc_32.id_class(xc_33.id_break())) {
            ryO_2 ryO_22 = rYB2.id_class(rfH_22);
            if (ryO_22 instanceof rHc_1) {
                rXn_1.id_class(rYB2, rfH_22, ((rHc_1)ryO_22).id_class());
            }
            super.id_break(xc_32, rYB2, rfH_22, xc_33, bl);
        }
    }

    @Override
    public rXE id_throws(xc_3 xc_32) {
        return xc_32.id_byte(id_int) != false ? rXG.id_byte.id_class(false) : super.id_throws(xc_32);
    }

    public static boolean id_implements(xc_3 xc_32) {
        return xc_32.id_class(rls_3.l, (JC jC) -> jC.id_break(rCT.id_throw) && jC.id_break(rCT.id_continue)) && xc_32.id_byte(rCT.id_throw) == false && xc_32.id_byte(rCT.id_continue) == false;
    }

    public static boolean id_private(xc_3 xc_32) {
        return xc_32.id_break(id_final) && xc_32.id_class(rls_3.l) && xc_32.id_byte(id_final) != false;
    }

    private boolean id_volatile(xc_3 xc_32) {
        return xc_32.id_class(xu_3.Ey);
    }
}

