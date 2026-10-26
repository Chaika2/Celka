/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 */
package celestial;

import celestial.Jq_1;
import celestial.UT;
import celestial.Uq_1;
import celestial.Uy_1;
import celestial.dB_2;
import celestial.dz_3;
import celestial.eX_2;
import celestial.ek_3;
import celestial.ex_3;
import celestial.iB_2;
import celestial.rCL;
import celestial.rCN;
import celestial.rCT;
import celestial.rCc_1;
import celestial.rHC;
import celestial.rHl_1;
import celestial.rJr_1;
import celestial.rRq_1;
import celestial.rXn_1;
import celestial.rXu_1;
import celestial.rYB;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rff_3;
import celestial.rhd_3;
import celestial.rlB_2;
import celestial.rpL_2;
import celestial.rpa_3;
import celestial.rpm_3;
import celestial.rpr_3;
import celestial.rqR_2;
import celestial.rqd_3;
import celestial.rrEm_1;
import celestial.rxx_3;
import celestial.ryO_2;
import celestial.ryZ_2;
import celestial.xN_2;
import celestial.xc_3;
import celestial.xd_3;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Random;

public class dQ_2
extends dB_2 {
    public static final rCc_1 id_volatile = dz_3.id_volatile;
    public static final rCN id_final = rCT.id_try;
    private static final Map<rdb_3, UT> id_package = (Map)rqR_2.id_class(new Object2ObjectOpenHashMap(), (T object2ObjectOpenHashMap) -> object2ObjectOpenHashMap.defaultReturnValue((Object)new Uy_1()));

    protected dQ_2(Jq_1 jq_1) {
        super(jq_1);
        this.id_extends((xc_3)((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_volatile, rpr_3.NORTH)).id_class(id_final, false));
    }

    public static eX_2 id_class(Uq_1 uq_1) {
        rpr_3 rpr_32 = uq_1.id_throws().id_byte(id_volatile);
        double d = uq_1.id_class() + 0.7 * (double)rpr_32.id_implements();
        double d2 = uq_1.id_break() + 0.7 * (double)rpr_32.id_finally();
        double d3 = uq_1.id_byte() + 0.7 * (double)rpr_32.id_extends();
        return new ex_3(d, d2, d3);
    }

    @Override
    public xN_2 id_class(xc_3 xc_32) {
        return xN_2.MODEL;
    }

    public static void id_class(rpL_2 rpL_22, UT uT) {
        id_package.put(rpL_22.id_case(), uT);
    }

    @Override
    public void id_class(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32, iB_2 iB_22, rdn_3 rdn_32) {
        ryO_2 ryO_22;
        if (rdn_32.id_this() && (ryO_22 = rYB2.id_class(rfH_22)) instanceof rHC) {
            ((rHC)ryO_22).id_class(rdn_32.id_continue());
        }
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(id_volatile, id_final);
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpa_3 rpa_32) {
        return xc_32.id_class(rpa_32.id_class(xc_32.id_byte(id_volatile)));
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rqd_3 rqd_32) {
        return (xc_3)xc_32.id_class(id_volatile, rqd_32.id_class(xc_32.id_byte(id_volatile)));
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, xd_3 xd_32, rfH_2 rfH_23, boolean bl) {
        boolean bl2 = rYB2.id_public(rfH_22) || rYB2.id_public(rfH_22.id_final());
        boolean bl3 = xc_32.id_byte(id_final);
        if (bl2 && !bl3) {
            rYB2.id_finally().id_class(rfH_22, this, 4);
            rYB2.id_class(rfH_22, (xc_3)xc_32.id_class(id_final, true), 4);
        } else if (!bl2 && bl3) {
            rYB2.id_class(rfH_22, (xc_3)xc_32.id_class(id_final, false), 4);
        }
    }

    protected UT id_class(rdn_3 rdn_32) {
        return id_package.get(rdn_32.id_break());
    }

    protected void id_class(rrEm_1 rrEm_12, rfH_2 rfH_22) {
        ek_3 ek_32 = new ek_3(rrEm_12, rfH_22);
        rHC rHC2 = (rHC)ek_32.id_case();
        int n = rHC2.id_catch();
        if (n < 0) {
            rrEm_12.id_byte(1001, rfH_22, 0);
        } else {
            rdn_3 rdn_32 = rHC2.id_extends(n);
            UT uT = this.id_class(rdn_32);
            if (uT != UT.id_class) {
                rHC2.id_break(n, uT.dispense(ek_32, rdn_32));
            }
        }
    }

    @Override
    public ryZ_2 id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, rhd_3 rhd_32, rpm_3 rpm_32, rff_3 rff_32) {
        if (rYB2.id_continue) {
            return ryZ_2.SUCCESS;
        }
        ryO_2 ryO_22 = rYB2.id_class(rfH_22);
        if (ryO_22 instanceof rHC) {
            rhd_32.id_class((rHC)ryO_22);
            if (ryO_22 instanceof rHl_1) {
                rhd_32.id_break(rlB_2.b);
            } else {
                rhd_32.id_break(rlB_2.O);
            }
        }
        return ryZ_2.CONSUME;
    }

    @Override
    public xc_3 id_class(rxx_3 rxx_32) {
        return (xc_3)this.id_continue().id_class(id_volatile, rxx_32.id_protected().id_case());
    }

    @Override
    public ryO_2 id_class(rRq_1 rRq_12) {
        return new rHC();
    }

    @Override
    public void id_break(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, xc_3 xc_33, boolean bl) {
        if (!xc_32.id_class(xc_33.id_break())) {
            ryO_2 ryO_22 = rYB2.id_class(rfH_22);
            if (ryO_22 instanceof rHC) {
                rXn_1.id_class(rYB2, rfH_22, (rXu_1)((rHC)ryO_22));
                rYB2.id_byte(rfH_22, this);
            }
            super.id_break(xc_32, rYB2, rfH_22, xc_33, bl);
        }
    }

    @Override
    public void id_break(xc_3 xc_32, rrEm_1 rrEm_12, rfH_2 rfH_22, Random random) {
        this.id_class(rrEm_12, rfH_22);
    }

    @Override
    public int id_break(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22) {
        return rJr_1.id_class(rYB2.id_class(rfH_22));
    }

    @Override
    public boolean id_case(xc_3 xc_32) {
        return true;
    }
}

