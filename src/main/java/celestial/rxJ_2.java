/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Oo_1;
import celestial.VD;
import celestial.rCF;
import celestial.rCZ;
import celestial.rRR;
import celestial.rRq_1;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rdH_2;
import celestial.rdO_2;
import celestial.rdX_2;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rgP_2;
import celestial.rhN_2;
import celestial.rhd_3;
import celestial.rhx_3;
import celestial.rjm_3;
import celestial.rnW_2;
import celestial.rqA_2;
import celestial.rqL_2;
import celestial.rqs_3;
import celestial.rxx_3;
import celestial.ryO_2;
import celestial.ryZ_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.zr_3;
import java.util.List;
import java.util.Map;

public class rxJ_2
extends rdb_3 {
    @Deprecated
    private final xd_3 id_class;

    public xc_3 id_byte(rxx_3 rxx_32) {
        xc_3 xc_32 = this.id_catch().id_class(rxx_32);
        return xc_32 != null && this.id_break(rxx_32, xc_32) ? xc_32 : null;
    }

    public rxJ_2(xd_3 xd_32, rdO_2 rdO_22) {
        super(rdO_22);
        this.id_class = xd_32;
    }

    protected boolean id_class(rxx_3 rxx_32, xc_3 xc_32) {
        return rxx_32.id_int().id_class(rxx_32.id_class(), xc_32, 11);
    }

    private static <T extends Comparable<T>> xc_3 id_class(xc_3 xc_32, rCZ<T> rCZ2, String string) {
        return rCZ2.id_break(string).map(comparable -> (xc_3)xc_32.id_class(rCZ2, comparable)).orElse(xc_32);
    }

    public void id_class(Map<xd_3, rdb_3> map, rdb_3 rdb_32) {
        map.put(this.id_catch(), rdb_32);
    }

    @Override
    public void id_class(rdn_3 rdn_32, rYB rYB2, List<rgP_2> list, VD vD) {
        super.id_class(rdn_32, rYB2, list, vD);
        this.id_catch().id_class(rdn_32, (rRq_1)rYB2, list, vD);
    }

    @Override
    public void id_class(rdX_2 rdX_22, rqs_3<rdn_3> rqs_32) {
        if (this.id_class(rdX_22)) {
            this.id_catch().id_class(rdX_22, rqs_32);
        }
    }

    public static boolean id_class(rYB rYB2, rhd_3 rhd_32, rfH_2 rfH_22, rdn_3 rdn_32) {
        ryO_2 ryO_22;
        rnW_2 rnW_22 = rYB2.id_const();
        if (rnW_22 == null) {
            return false;
        }
        rcd_3 rcd_32 = rdn_32.id_break("BlockEntityTag");
        if (rcd_32 != null && (ryO_22 = rYB2.id_class(rfH_22)) != null) {
            if (!(rYB2.id_continue || !ryO_22.ac_() || rhd_32 != null && rhd_32.sU())) {
                return false;
            }
            rcd_3 rcd_33 = ryO_22.id_class(new rcd_3());
            rcd_3 rcd_34 = rcd_33.id_catch();
            rcd_33.id_class(rcd_32);
            rcd_33.id_break("x", rfH_22.b_());
            rcd_33.id_break("y", rfH_22.c_());
            rcd_33.id_break("z", rfH_22.d_());
            if (!rcd_33.equals(rcd_34)) {
                ryO_22.id_class(rYB2.id_byte(rfH_22), rcd_33);
                ryO_22.id_break();
                return true;
            }
        }
        return false;
    }

    @Override
    public ryZ_2 id_class(rdH_2 rdH_22) {
        ryZ_2 ryZ_22 = this.id_class(new rxx_3(rdH_22));
        return !ryZ_22.id_class() && this.id_super() ? this.id_class(rdH_22.id_int(), rdH_22.id_final(), rdH_22.id_package()).id_class() : ryZ_22;
    }

    public ryZ_2 id_class(rxx_3 rxx_32) {
        if (!rxx_32.id_break()) {
            return ryZ_2.FAIL;
        }
        rxx_3 rxx_33 = this.id_break(rxx_32);
        if (rxx_33 == null) {
            return ryZ_2.FAIL;
        }
        xc_3 xc_32 = this.id_byte(rxx_33);
        if (xc_32 == null) {
            return ryZ_2.FAIL;
        }
        if (!this.id_class(rxx_33, xc_32)) {
            return ryZ_2.FAIL;
        }
        rfH_2 rfH_22 = rxx_33.id_class();
        rYB rYB2 = rxx_33.id_int();
        rhd_3 rhd_32 = rxx_33.id_final();
        rdn_3 rdn_32 = rxx_33.id_volatile();
        xc_3 xc_33 = rYB2.id_byte(rfH_22);
        xd_3 xd_32 = xc_33.id_break();
        if (xd_32 == xc_32.id_break()) {
            xc_33 = this.id_class(rfH_22, rYB2, rdn_32, xc_33);
            this.id_class(rfH_22, rYB2, rhd_32, rdn_32, xc_33);
            xd_32.id_class(rYB2, rfH_22, xc_33, rhd_32, rdn_32);
            if (rhd_32 instanceof rhN_2) {
                Oo_1.id_goto.id_class((rhN_2)rhd_32, rfH_22, rdn_32);
            }
        }
        zr_3 zr_32 = xc_33.id_package();
        rYB2.id_class(rhd_32, rfH_22, this.id_class(xc_33), rqL_2.BLOCKS, (zr_32.id_class() + 1.0f) / 2.0f, zr_32.id_break() * 0.8f);
        if (rhd_32 == null || !((rhx_3)rhd_32.id_implements[18]).id_protected) {
            rdn_32.id_catch(1);
        }
        return ryZ_2.id_class(rYB2.id_continue);
    }

    protected rqA_2 id_class(xc_3 xc_32) {
        return xc_32.id_package().id_throws();
    }

    private xc_3 id_class(rfH_2 rfH_22, rYB rYB2, rdn_3 rdn_32, xc_3 xc_32) {
        xc_3 xc_33 = xc_32;
        rcd_3 rcd_32 = rdn_32.id_package();
        if (rcd_32 != null) {
            rcd_3 rcd_33 = rcd_32.id_int("BlockStateTag");
            rCF<xd_3, xc_3> rCF2 = xc_32.id_break().id_new();
            for (String string : rcd_33.id_protected()) {
                rCZ<?> rCZ2 = rCF2.id_class(string);
                if (rCZ2 == null) continue;
                String string2 = rcd_33.id_byte(string).id_native();
                xc_33 = rxJ_2.id_class(xc_33, rCZ2, string2);
            }
        }
        if (xc_33 != xc_32) {
            rYB2.id_class(rfH_22, xc_33, 2);
        }
        return xc_33;
    }

    protected boolean id_class(rfH_2 rfH_22, rYB rYB2, rhd_3 rhd_32, rdn_3 rdn_32, xc_3 xc_32) {
        return rxJ_2.id_class(rYB2, rhd_32, rfH_22, rdn_32);
    }

    protected boolean id_break(rxx_3 rxx_32, xc_3 xc_32) {
        rhd_3 rhd_32 = rxx_32.id_final();
        rjm_3 rjm_32 = rhd_32 == null ? rjm_3.id_break() : rjm_3.id_class(rhd_32);
        return (!this.id_throws() || xc_32.id_class((rRR)rxx_32.id_int(), rxx_32.id_class())) && rxx_32.id_int().id_class(xc_32, rxx_32.id_class(), rjm_32);
    }

    public rxx_3 id_break(rxx_3 rxx_32) {
        return rxx_32;
    }

    @Override
    public String id_break() {
        return this.id_catch().id_volatile();
    }

    protected boolean id_throws() {
        return true;
    }

    public xd_3 id_catch() {
        return this.id_class;
    }
}

