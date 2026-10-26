/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.Oo_1;
import celestial.an_3;
import celestial.dB_2;
import celestial.dt_3;
import celestial.eA_2;
import celestial.eY_2;
import celestial.iB_2;
import celestial.kE_2;
import celestial.rCL;
import celestial.rCT;
import celestial.rCc_1;
import celestial.rCm_1;
import celestial.rEJ;
import celestial.rHk_1;
import celestial.rHx_1;
import celestial.rLQ;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rRu_1;
import celestial.rSN;
import celestial.rYB;
import celestial.rbF_2;
import celestial.rcd_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rff_3;
import celestial.rfl_3;
import celestial.rhN_2;
import celestial.rhU_2;
import celestial.rhd_3;
import celestial.rhz_3;
import celestial.rjC_2;
import celestial.rls_3;
import celestial.rpB_2;
import celestial.rpm_3;
import celestial.rpr_3;
import celestial.rqL_2;
import celestial.rqR_2;
import celestial.rqn_3;
import celestial.rsE_2;
import celestial.rsX_2;
import celestial.rsv_3;
import celestial.rxx_3;
import celestial.ryO_2;
import celestial.ryZ_2;
import celestial.rzP_2;
import celestial.rzQ_2;
import celestial.xN_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xn_3;
import java.util.List;
import java.util.Random;

public class xO_2
extends dB_2 {
    private static final rpr_3[] id_package = new rpr_3[]{rpr_3.WEST, rpr_3.EAST, rpr_3.SOUTH};
    public static final rCc_1 id_volatile = kE_2.p;
    public static final rCm_1 id_final = rCT.L;

    public xO_2(Jq_1 jq_1) {
        super(jq_1);
        this.id_extends((xc_3)((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_final, 0)).id_class(id_volatile, rpr_3.NORTH));
    }

    @Override
    public ryO_2 id_class(rRq_1 rRq_12) {
        return new rHx_1();
    }

    @Override
    public xN_2 id_class(xc_3 xc_32) {
        return xN_2.MODEL;
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(id_final, id_volatile);
    }

    @Override
    public xc_3 id_class(rxx_3 rxx_32) {
        return (xc_3)this.id_continue().id_class(id_volatile, rxx_32.id_case().id_case());
    }

    private void id_class(rYB rYB2, rfH_2 rfH_22, rjC_2 rjC_22, double d) {
        this.id_class(rYB2, (double)rfH_22.b_() + rjC_22.id_break(rpB_2.X), (double)rfH_22.b_() + rjC_22.id_byte(rpB_2.X), (double)rfH_22.d_() + rjC_22.id_break(rpB_2.Z), (double)rfH_22.d_() + rjC_22.id_byte(rpB_2.Z), d);
    }

    public static rpr_3 id_class(Random random) {
        return rqR_2.id_class(id_package, random);
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpr_3 rpr_32, xc_3 xc_33, rRg_1 rRg_12, rfH_2 rfH_22, rfH_2 rfH_23) {
        ryO_2 ryO_22;
        if (rRg_12.id_byte(rfH_23).id_break() instanceof dt_3 && (ryO_22 = rRg_12.id_class(rfH_22)) instanceof rHx_1) {
            rHx_1 rHx_12 = (rHx_1)ryO_22;
            rHx_12.id_class(null, xc_32, rHk_1.EMERGENCY);
        }
        return super.id_class(xc_32, rpr_32, xc_33, rRg_12, rfH_22, rfH_23);
    }

    @Override
    public List<rdn_3> id_class(xc_3 xc_32, rzP_2 rzP_22) {
        ryO_2 ryO_22;
        an_3 an_32 = rzP_22.id_break(rzQ_2.id_class);
        if ((an_32 instanceof rsX_2 || an_32 instanceof rEJ || an_32 instanceof rhU_2 || an_32 instanceof rSN || an_32 instanceof rsv_3) && (ryO_22 = rzP_22.id_break(rzQ_2.id_private)) instanceof rHx_1) {
            rHx_1 rHx_12 = (rHx_1)ryO_22;
            rHx_12.id_class(null, xc_32, rHk_1.EMERGENCY);
        }
        return super.id_class(xc_32, rzP_22);
    }

    @Override
    public void id_class(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32, rhd_3 rhd_32) {
        ryO_2 ryO_22;
        if (!rYB2.id_continue && rhd_32.id_implements() && rYB2.B().id_break(rRu_1.id_case) && (ryO_22 = rYB2.id_class(rfH_22)) instanceof rHx_1) {
            rcd_3 rcd_32;
            boolean bl;
            rHx_1 rHx_12 = (rHx_1)ryO_22;
            rdn_3 rdn_32 = new rdn_3(this);
            int n = xc_32.id_byte(id_final);
            boolean bl2 = bl = !rHx_12.id_catch();
            if (!bl && n == 0) {
                return;
            }
            if (bl) {
                rcd_32 = new rcd_3();
                rcd_32.id_class("Bees", rHx_12.id_volatile());
                rdn_32.id_class("BlockEntityTag", rcd_32);
            }
            rcd_32 = new rcd_3();
            rcd_32.id_break("honey_level", n);
            rdn_32.id_class("BlockStateTag", rcd_32);
            rsE_2 rsE_22 = new rsE_2(rYB2, rfH_22.b_(), rfH_22.c_(), rfH_22.d_(), rdn_32);
            rsE_22.id_private();
            rYB2.a_(rsE_22);
        }
        super.id_class(rYB2, rfH_22, xc_32, rhd_32);
    }

    public void id_class(rYB rYB2, xc_3 xc_32, rfH_2 rfH_22, rhd_3 rhd_32, rHk_1 rHk_12) {
        this.id_class(rYB2, xc_32, rfH_22);
        ryO_2 ryO_22 = rYB2.id_class(rfH_22);
        if (ryO_22 instanceof rHx_1) {
            rHx_1 rHx_12 = (rHx_1)ryO_22;
            rHx_12.id_class(rhd_32, xc_32, rHk_12);
        }
    }

    private void id_class(rYB rYB2, double d, double d2, double d3, double d4, double d5) {
        rYB2.id_class(rLQ.d, rfU_2.id_protected(rYB2.id_int.nextDouble(), d, d2), d5, rfU_2.id_protected(rYB2.id_int.nextDouble(), d3, d4), 0.0, 0.0, 0.0);
    }

    @Override
    public void id_class(rYB rYB2, rhd_3 rhd_32, rfH_2 rfH_22, xc_3 xc_32, ryO_2 ryO_22, rdn_3 rdn_32) {
        super.id_class(rYB2, rhd_32, rfH_22, xc_32, ryO_22, rdn_32);
        if (!rYB2.id_continue && ryO_22 instanceof rHx_1) {
            rHx_1 rHx_12 = (rHx_1)ryO_22;
            if (eA_2.id_class(eY_2.id_else, rdn_32) == 0) {
                rHx_12.id_class(rhd_32, xc_32, rHk_1.EMERGENCY);
                rYB2.id_byte(rfH_22, this);
                this.id_break(rYB2, rfH_22);
            }
            Oo_1.id_import.id_class((rhN_2)rhd_32, xc_32.id_break(), rdn_32, rHx_12.id_finally());
        }
    }

    public static void id_class(rYB rYB2, rfH_2 rfH_22) {
        xO_2.id_class(rYB2, rfH_22, new rdn_3(rdy_3.Wm, 3));
    }

    @Override
    public ryZ_2 id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, rhd_3 rhd_33, rpm_3 rpm_32, rff_3 rff_32) {
        rdn_3 rdn_32 = rhd_33.id_protected(rpm_32);
        int n = xc_32.id_byte(id_final);
        boolean bl = false;
        if (n >= 5) {
            if (rdn_32.id_break() == rdy_3.JJ) {
                rYB2.id_class(rhd_33, rhd_33.rx(), rhd_33.re(), rhd_33.BO(), rqn_3.f, rqL_2.NEUTRAL, 1.0f, 1.0f);
                xO_2.id_class(rYB2, rfH_22);
                rdn_32.id_class(1, rhd_33, (T rhd_32) -> rhd_32.id_byte(rpm_32));
                bl = true;
            } else if (rdn_32.id_break() == rdy_3.Jn) {
                rdn_32.id_catch(1);
                rYB2.id_class(rhd_33, rhd_33.rx(), rhd_33.re(), rhd_33.BO(), rqn_3.rb, rqL_2.NEUTRAL, 1.0f, 1.0f);
                if (rdn_32.id_class()) {
                    rhd_33.id_class(rpm_32, new rdn_3(rdy_3.WF));
                } else if (!((rhz_3)rhd_33.id_implements[1]).id_throws(new rdn_3(rdy_3.WF))) {
                    rhd_33.id_class(new rdn_3(rdy_3.WF), false);
                }
                bl = true;
            }
        }
        if (bl) {
            if (!xn_3.id_class(rYB2, rfH_22)) {
                if (this.id_protected(rYB2, rfH_22)) {
                    this.id_break(rYB2, rfH_22);
                }
                this.id_class(rYB2, xc_32, rfH_22, rhd_33, rHk_1.EMERGENCY);
            } else {
                this.id_class(rYB2, xc_32, rfH_22);
            }
            return ryZ_2.id_class(rYB2.id_continue);
        }
        return super.id_class(xc_32, rYB2, rfH_22, rhd_33, rpm_32, rff_32);
    }

    private void id_class(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32) {
        rjC_2 rjC_22;
        double d;
        if (xc_32.id_volatile().id_byte() && !(rYB2.id_int.nextFloat() < 0.3f) && (d = (rjC_22 = xc_32.id_extends(rYB2, rfH_22)).id_byte(rpB_2.Y)) >= 1.0 && !xc_32.id_class(rls_3.B)) {
            double d2 = rjC_22.id_break(rpB_2.Y);
            if (d2 > 0.0) {
                this.id_class(rYB2, rfH_22, rjC_22, (double)rfH_22.c_() + d2 - 0.05);
            } else {
                rfH_2 rfH_23 = rfH_22.id_break();
                xc_3 xc_33 = rYB2.id_byte(rfH_23);
                rjC_2 rjC_23 = xc_33.id_extends(rYB2, rfH_23);
                double d3 = rjC_23.id_byte(rpB_2.Y);
                if ((d3 < 1.0 || !xc_33.id_new(rYB2, rfH_23)) && xc_33.id_volatile().id_byte()) {
                    this.id_class(rYB2, rfH_22, rjC_22, (double)rfH_22.c_() - 0.05);
                }
            }
        }
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, Random random) {
        if (xc_32.id_byte(id_final) >= 5) {
            for (int i = 0; i < random.nextInt(1) + 1; ++i) {
                this.id_class(rYB2, rfH_22, xc_32);
            }
        }
    }

    public void id_class(rYB rYB2, xc_3 xc_32, rfH_2 rfH_22) {
        rYB2.id_class(rfH_22, (xc_3)xc_32.id_class(id_final, 0), 3);
    }

    private void id_break(rYB rYB2, rfH_2 rfH_22) {
        List<rbF_2> list = rYB2.id_class(rbF_2.class, new rfl_3(rfH_22).id_byte(8.0, 6.0, 8.0));
        if (!list.isEmpty()) {
            List<rhd_3> list2 = rYB2.id_class(rhd_3.class, new rfl_3(rfH_22).id_byte(8.0, 6.0, 8.0));
            int n = list2.size();
            for (rbF_2 rbF_22 : list) {
                if (rbF_22.I_() != null) continue;
                rbF_22.id_byte((iB_2)list2.get(rYB2.id_int.nextInt(n)));
            }
        }
    }

    @Override
    public int id_break(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22) {
        return xc_32.id_byte(id_final);
    }

    @Override
    public boolean id_case(xc_3 xc_32) {
        return true;
    }

    private boolean id_protected(rYB rYB2, rfH_2 rfH_22) {
        ryO_2 ryO_22 = rYB2.id_class(rfH_22);
        if (ryO_22 instanceof rHx_1) {
            rHx_1 rHx_12 = (rHx_1)ryO_22;
            return !rHx_12.id_catch();
        }
        return false;
    }
}

