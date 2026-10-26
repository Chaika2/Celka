/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.Wp_1;
import celestial.an_3;
import celestial.rAB;
import celestial.rAS;
import celestial.rCL;
import celestial.rCT;
import celestial.rCZ;
import celestial.rCm_1;
import celestial.rHb_1;
import celestial.rJT;
import celestial.rLT;
import celestial.rRq_1;
import celestial.rYB;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rds_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rff_3;
import celestial.rhN_2;
import celestial.rhd_3;
import celestial.rhx_3;
import celestial.rhz_3;
import celestial.rjC_2;
import celestial.rjN_2;
import celestial.rjm_3;
import celestial.rjw_3;
import celestial.rlB_2;
import celestial.rpm_3;
import celestial.rqL_2;
import celestial.rqn_3;
import celestial.rxJ_2;
import celestial.rxO_2;
import celestial.ryZ_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;

public class xp_3
extends xd_3 {
    public static final rCm_1 id_volatile = rCT.Z;
    private static final rjC_2 id_package = xp_3.id_class(2.0, 4.0, 2.0, 14.0, 16.0, 14.0);
    protected static final rjC_2 id_final = rjw_3.id_class(rjw_3.id_break(), rjw_3.id_class(xp_3.id_class(0.0, 0.0, 4.0, 16.0, 3.0, 12.0), xp_3.id_class(4.0, 0.0, 0.0, 12.0, 3.0, 16.0), xp_3.id_class(2.0, 0.0, 2.0, 14.0, 3.0, 14.0), id_package), rjN_2.id_throws);

    @Override
    public void id_byte(rYB rYB2, rfH_2 rfH_22) {
        xc_3 xc_32;
        float f;
        if (rYB2.id_int.nextInt(20) == 1 && !((f = rYB2.id_implements(rfH_22).id_class(rfH_22)) < 0.15f) && (xc_32 = rYB2.id_byte(rfH_22)).id_byte(id_volatile) < 3) {
            rYB2.id_class(rfH_22, (xc_3)xc_32.id_class(id_volatile), 2);
        }
    }

    @Override
    public rjC_2 id_byte(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22) {
        return id_package;
    }

    public xp_3(Jq_1 jq_1) {
        super(jq_1);
        this.id_extends((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_volatile, 0));
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, an_3 an_32) {
        int n = xc_32.id_byte(id_volatile);
        float f = (float)rfH_22.c_() + (6.0f + (float)(3 * n)) / 16.0f;
        if (!rYB2.id_continue && an_32.Pz() && n > 0 && an_32.re() <= (double)f) {
            an_32.rE();
            this.id_class(rYB2, rfH_22, xc_32, n - 1);
        }
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(new rCZ[]{id_volatile});
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rLT rLT2) {
        return false;
    }

    @Override
    public ryZ_2 id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, rhd_3 rhd_32, rpm_3 rpm_32, rff_3 rff_32) {
        Object object;
        rdn_3 rdn_32 = rhd_32.id_protected(rpm_32);
        if (rdn_32.id_class()) {
            return ryZ_2.PASS;
        }
        int n = xc_32.id_byte(id_volatile);
        rdb_3 rdb_32 = rdn_32.id_break();
        if (rdb_32 == rdy_3.hR) {
            if (n < 3 && !rYB2.id_continue) {
                if (!((rhx_3)rhd_32.id_implements[18]).id_protected) {
                    rhd_32.id_class(rpm_32, new rdn_3(rdy_3.hg));
                }
                rhd_32.id_break(rlB_2.r);
                this.id_class(rYB2, rfH_22, xc_32, 3);
                rYB2.id_class((rhd_3)null, rfH_22, rqn_3.rk, rqL_2.BLOCKS, 1.0f, 1.0f);
            }
            return ryZ_2.id_class(rYB2.id_continue);
        }
        if (rdb_32 == rdy_3.hg) {
            if (n == 3 && !rYB2.id_continue) {
                if (!((rhx_3)rhd_32.id_implements[18]).id_protected) {
                    rdn_32.id_catch(1);
                    if (rdn_32.id_class()) {
                        rhd_32.id_class(rpm_32, new rdn_3(rdy_3.hR));
                    } else if (!((rhz_3)rhd_32.id_implements[1]).id_throws(new rdn_3(rdy_3.hR))) {
                        rhd_32.id_class(new rdn_3(rdy_3.hR), false);
                    }
                }
                rhd_32.id_break(rlB_2.P);
                this.id_class(rYB2, rfH_22, xc_32, 0);
                rYB2.id_class((rhd_3)null, rfH_22, rqn_3.rQ, rqL_2.BLOCKS, 1.0f, 1.0f);
            }
            return ryZ_2.id_class(rYB2.id_continue);
        }
        if (rdb_32 == rdy_3.Jn) {
            if (n > 0 && !rYB2.id_continue) {
                if (!((rhx_3)rhd_32.id_implements[18]).id_protected) {
                    rdn_3 rdn_33 = rAB.id_class(new rdn_3(rdy_3.JA), rAS.id_break);
                    rhd_32.id_break(rlB_2.P);
                    rdn_32.id_catch(1);
                    if (rdn_32.id_class()) {
                        rhd_32.id_class(rpm_32, rdn_33);
                    } else if (!((rhz_3)rhd_32.id_implements[1]).id_throws(rdn_33)) {
                        rhd_32.id_class(rdn_33, false);
                    } else if (rhd_32 instanceof rhN_2) {
                        ((rhN_2)rhd_32).id_class((rJT)rhd_32.id_implements[3]);
                    }
                }
                rYB2.id_class((rhd_3)null, rfH_22, rqn_3.rb, rqL_2.BLOCKS, 1.0f, 1.0f);
                this.id_class(rYB2, rfH_22, xc_32, n - 1);
            }
            return ryZ_2.id_class(rYB2.id_continue);
        }
        if (rdb_32 == rdy_3.JA && rAB.id_protected(rdn_32) == rAS.id_break) {
            if (n < 3 && !rYB2.id_continue) {
                if (!((rhx_3)rhd_32.id_implements[18]).id_protected) {
                    rdn_3 rdn_34 = new rdn_3(rdy_3.Jn);
                    rhd_32.id_break(rlB_2.P);
                    rhd_32.id_class(rpm_32, rdn_34);
                    if (rhd_32 instanceof rhN_2) {
                        ((rhN_2)rhd_32).id_class((rJT)rhd_32.id_implements[3]);
                    }
                }
                rYB2.id_class((rhd_3)null, rfH_22, rqn_3.rG, rqL_2.BLOCKS, 1.0f, 1.0f);
                this.id_class(rYB2, rfH_22, xc_32, n + 1);
            }
            return ryZ_2.id_class(rYB2.id_continue);
        }
        if (n > 0 && rdb_32 instanceof rds_3 && (object = (rds_3)((Object)rdb_32)).c_(rdn_32) && !rYB2.id_continue) {
            object.e_(rdn_32);
            this.id_class(rYB2, rfH_22, xc_32, n - 1);
            rhd_32.id_break(rlB_2.B);
            return ryZ_2.SUCCESS;
        }
        if (n > 0 && rdb_32 instanceof rxO_2) {
            if (rHb_1.id_break(rdn_32) > 0 && !rYB2.id_continue) {
                object = rdn_32.id_implements();
                ((rdn_3)object).id_throws(1);
                rHb_1.id_byte((rdn_3)object);
                rhd_32.id_break(rlB_2.S);
                if (!((rhx_3)rhd_32.id_implements[18]).id_protected) {
                    rdn_32.id_catch(1);
                    this.id_class(rYB2, rfH_22, xc_32, n - 1);
                }
                if (rdn_32.id_class()) {
                    rhd_32.id_class(rpm_32, (rdn_3)object);
                } else if (!((rhz_3)rhd_32.id_implements[1]).id_throws((rdn_3)object)) {
                    rhd_32.id_class((rdn_3)object, false);
                } else if (rhd_32 instanceof rhN_2) {
                    ((rhN_2)rhd_32).id_class((rJT)rhd_32.id_implements[3]);
                }
            }
            return ryZ_2.id_class(rYB2.id_continue);
        }
        if (n > 0 && rdb_32 instanceof rxJ_2) {
            object = ((rxJ_2)rdb_32).id_catch();
            if (object instanceof Wp_1 && !rYB2.id_import()) {
                rdn_3 rdn_35 = new rdn_3(xu_3.bD, 1);
                if (rdn_32.id_final()) {
                    rdn_35.id_byte(rdn_32.id_package().id_catch());
                }
                rhd_32.id_class(rpm_32, rdn_35);
                this.id_class(rYB2, rfH_22, xc_32, n - 1);
                rhd_32.id_break(rlB_2.s);
                return ryZ_2.SUCCESS;
            }
            return ryZ_2.CONSUME;
        }
        return ryZ_2.PASS;
    }

    public void id_class(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32, int n) {
        rYB2.id_class(rfH_22, (xc_3)xc_32.id_class(id_volatile, rfU_2.id_class(n, 0, 3)), 2);
        rYB2.id_byte(rfH_22, this);
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return id_final;
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

