/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jp_1;
import celestial.Jq_1;
import celestial.QP;
import celestial.QS;
import celestial.Qs_1;
import celestial.an_3;
import celestial.kx_3;
import celestial.rJZ;
import celestial.rLT;
import celestial.rRR;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rVL;
import celestial.rXE;
import celestial.rXG;
import celestial.rXs_1;
import celestial.rYB;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rff_3;
import celestial.rhd_3;
import celestial.rhf_3;
import celestial.rjC_2;
import celestial.rjm_3;
import celestial.rjw_3;
import celestial.rlG_2;
import celestial.rpa_3;
import celestial.rpm_3;
import celestial.rpr_3;
import celestial.rqO_2;
import celestial.rqd_3;
import celestial.rrEm_1;
import celestial.ruP_2;
import celestial.rxx_3;
import celestial.ryZ_2;
import celestial.rzL_2;
import celestial.rzP_2;
import celestial.rzQ_2;
import celestial.rzl_3;
import celestial.rzr_3;
import celestial.rzz_3;
import celestial.xN_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.zr_3;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public abstract class JA {
    protected static final rpr_3[] id_class = new rpr_3[]{rpr_3.WEST, rpr_3.EAST, rpr_3.NORTH, rpr_3.SOUTH, rpr_3.DOWN, rpr_3.UP};
    protected final QP id_break;
    public final boolean id_byte;
    protected final float id_protected;
    protected final boolean id_throws;
    protected final zr_3 id_case;
    protected final float id_catch;
    protected final float id_private;
    protected final float id_implements;
    protected final boolean id_finally;
    protected final Jq_1 id_extends;
    protected rqO_2 id_native;

    public Jp_1 id_byte() {
        return Jp_1.NONE;
    }

    @Deprecated
    public boolean id_byte(xc_3 xc_32) {
        return false;
    }

    @Deprecated
    public rjC_2 id_byte(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return this.id_break(xc_32, rRq_12, rfH_22, rjm_32);
    }

    @Deprecated
    public rjC_2 id_byte(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22) {
        return rjw_3.id_class();
    }

    public JA(Jq_1 jq_1) {
        this.id_break = jq_1.id_class;
        this.id_byte = jq_1.id_byte;
        this.id_native = jq_1.id_volatile;
        this.id_protected = jq_1.id_case;
        this.id_throws = jq_1.id_implements;
        this.id_case = jq_1.id_protected;
        this.id_catch = jq_1.id_finally;
        this.id_private = jq_1.id_extends;
        this.id_implements = jq_1.id_native;
        this.id_finally = jq_1.id_synchronized;
        this.id_extends = jq_1;
    }

    @Deprecated
    public boolean id_class(xc_3 xc_32, rRR rRR2, rfH_2 rfH_22) {
        return true;
    }

    @Deprecated
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return rjw_3.id_break();
    }

    @Deprecated
    public void id_class(xc_3 xc_32, rRg_1 rRg_12, rfH_2 rfH_22, int n, int n2) {
    }

    @Deprecated
    public void id_class(xc_3 xc_32, rrEm_1 rrEm_12, rfH_2 rfH_22, Random random) {
        this.id_break(xc_32, rrEm_12, rfH_22, random);
    }

    @Deprecated
    public long id_class(xc_3 xc_32, rfH_2 rfH_22) {
        return rfU_2.id_class(rfH_22);
    }

    @Deprecated
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22) {
        return xc_32.id_finally(rRq_12, rfH_22);
    }

    @Deprecated
    public boolean id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rLT rLT2) {
        switch (rLT2) {
            case LAND: {
                return !xc_32.id_new(rRq_12, rfH_22);
            }
            case WATER: {
                return rRq_12.id_break(rfH_22).id_class(rlG_2.id_break);
            }
            case AIR: {
                return !xc_32.id_new(rRq_12, rfH_22);
            }
        }
        return false;
    }

    @Deprecated
    public rJZ id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22) {
        return null;
    }

    @Deprecated
    public int id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rpr_3 rpr_32) {
        return 0;
    }

    @Deprecated
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, an_3 an_32) {
    }

    @Deprecated
    public void id_class(rYB rYB2, xc_3 xc_32, rff_3 rff_32, rhf_3 rhf_32) {
    }

    @Deprecated
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, xd_3 xd_32, rfH_2 rfH_23, boolean bl) {
        ruP_2.id_class(rYB2, rfH_22);
    }

    @Deprecated
    public float id_class(xc_3 xc_32, rhd_3 rhd_32, rRq_1 rRq_12, rfH_2 rfH_22) {
        float f = xc_32.id_private(rRq_12, rfH_22);
        if (f == -1.0f) {
            return 0.0f;
        }
        int n = rhd_32.id_byte(xc_32) ? 30 : 100;
        return rhd_32.id_protected(xc_32) / f / (float)n;
    }

    public float id_class(xc_3 xc_32, rhd_3 rhd_32, rdn_3 rdn_32, rRq_1 rRq_12, rfH_2 rfH_22) {
        float f = xc_32.id_private(rRq_12, rfH_22);
        if (f == -1.0f) {
            return 0.0f;
        }
        int n = rhd_32.id_class(xc_32, rdn_32) ? 30 : 100;
        return rhd_32.id_class(rdn_32, xc_32) / f / (float)n;
    }

    @Deprecated
    public void id_class(xc_3 xc_32, rrEm_1 rrEm_12, rfH_2 rfH_22, rdn_3 rdn_32) {
    }

    @Deprecated
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, rhd_3 rhd_32) {
    }

    @Deprecated
    public boolean id_class(xc_3 xc_32, xc_3 xc_33, rpr_3 rpr_32) {
        return false;
    }

    @Deprecated
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, xc_3 xc_33, boolean bl) {
    }

    @Deprecated
    public xc_3 id_class(xc_3 xc_32, rpr_3 rpr_32, xc_3 xc_33, rRg_1 rRg_12, rfH_2 rfH_22, rfH_2 rfH_23) {
        return xc_32;
    }

    @Deprecated
    public xc_3 id_class(xc_3 xc_32, rqd_3 rqd_32) {
        return xc_32;
    }

    @Deprecated
    public xN_2 id_class(xc_3 xc_32) {
        return xN_2.MODEL;
    }

    @Deprecated
    public boolean id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, int n, int n2) {
        return false;
    }

    @Deprecated
    public ryZ_2 id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, rhd_3 rhd_32, rpm_3 rpm_32, rff_3 rff_32) {
        return ryZ_2.PASS;
    }

    @Deprecated
    public boolean id_class(xc_3 xc_32, rxx_3 rxx_32) {
        return this.id_break.id_throws() && (rxx_32.id_volatile().id_class() || rxx_32.id_volatile().id_break() != this.id_case());
    }

    @Deprecated
    public List<rdn_3> id_class(xc_3 xc_32, rzP_2 rzP_22) {
        rqO_2 rqO_22 = this.id_throws();
        if (rqO_22 == rzl_3.id_class) {
            return Collections.emptyList();
        }
        rzr_3 rzr_32 = rzP_22.id_class(rzQ_2.id_catch, xc_32).id_class(rzz_3.id_native);
        rrEm_1 rrEm_12 = rzr_32.id_byte();
        rzL_2 rzL_22 = rrEm_12.id_const().o().id_class(rqO_22);
        return rzL_22.id_class(rzr_32);
    }

    @Deprecated
    public xc_3 id_class(xc_3 xc_32, rpa_3 rpa_32) {
        return xc_32;
    }

    @Deprecated
    public boolean id_class(xc_3 xc_32, rXs_1 rXs_12) {
        return this.id_break.id_throws() || !this.id_break.id_break();
    }

    @Deprecated
    public int id_break(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rpr_3 rpr_32) {
        return 0;
    }

    @Deprecated
    public rjC_2 id_break(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22) {
        return this.id_break(xc_32, rRq_12, rfH_22, rjm_3.id_break());
    }

    @Deprecated
    public boolean id_break(xc_3 xc_32) {
        return false;
    }

    @Deprecated
    public int id_break(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22) {
        return 0;
    }

    @Deprecated
    public rjC_2 id_break(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return this.id_byte ? xc_32.id_finally(rRq_12, rfH_22) : rjw_3.id_class();
    }

    @Deprecated
    public void id_break(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, xc_3 xc_33, boolean bl) {
        if (this.id_protected() && !xc_32.id_class(xc_33.id_break())) {
            rYB2.id_else(rfH_22);
        }
    }

    @Deprecated
    public void id_break(xc_3 xc_32, rrEm_1 rrEm_12, rfH_2 rfH_22, Random random) {
    }

    public final rqO_2 id_throws() {
        if (this.id_native == null) {
            rqO_2 rqO_22 = rVL.id_strictfp.id_break(this.id_catch());
            this.id_native = new rqO_2(rqO_22.id_byte(), "blocks/" + rqO_22.id_break());
        }
        return this.id_native;
    }

    @Deprecated
    public rXE id_throws(xc_3 xc_32) {
        return rXG.id_class.id_private();
    }

    @Deprecated
    public float id_throws(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22) {
        return xc_32.id_new(rRq_12, rfH_22) ? 0.2f : 1.0f;
    }

    protected abstract xd_3 id_catch();

    @Deprecated
    public boolean id_case(xc_3 xc_32) {
        return false;
    }

    public abstract rdb_3 id_case();

    @Deprecated
    public Qs_1 id_protected(xc_3 xc_32) {
        return this.id_break.id_catch();
    }

    @Deprecated
    public int id_protected(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22) {
        if (xc_32.id_implements(rRq_12, rfH_22)) {
            return rRq_12.id_while();
        }
        return xc_32.id_class(rRq_12, rfH_22) ? 0 : 1;
    }

    public final boolean id_protected() {
        return this instanceof kx_3;
    }

    public QS id_private() {
        return this.id_extends.id_break.apply(this.id_catch().id_continue());
    }
}

