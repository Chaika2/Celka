/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.aU_2;
import celestial.iO_2;
import celestial.rEx_1;
import celestial.rHu_1;
import celestial.rKd_1;
import celestial.rKv_1;
import celestial.rRI;
import celestial.rRf_1;
import celestial.rRq_1;
import celestial.rXE;
import celestial.raF_2;
import celestial.rcd_3;
import celestial.rfH_2;
import celestial.rfi_3;
import celestial.rfj_3;
import celestial.rfw_3;
import celestial.rip_3;
import celestial.rlG_2;
import celestial.rls_3;
import celestial.rpa_3;
import celestial.rqO_2;
import celestial.rqd_3;
import celestial.rrPG;
import celestial.rrPN;
import celestial.rrPd_1;
import celestial.rrPl_1;
import celestial.rrPt_1;
import celestial.rrrA;
import celestial.rrrw_1;
import celestial.ryO_2;
import celestial.rzl_3;
import celestial.xc_3;
import celestial.xt_3;
import celestial.xu_3;
import java.util.Random;

public class ril_3
extends rrrw_1 {
    private final rip_3 id_protected;
    private final float id_throws;
    private final rqO_2 id_case;
    private final rqd_3 id_catch;
    private final boolean id_private;

    public ril_3(rrPt_1 rrPt_12, rqO_2 rqO_22, rfH_2 rfH_22, rqd_3 rqd_32, float f, rip_3 rip_32, boolean bl) {
        super(raF_2.id_float, 0);
        this.id_case = rqO_22;
        this.id_byte = rfH_22;
        this.id_catch = rqd_32;
        this.id_throws = f;
        this.id_protected = rip_32;
        this.id_private = bl;
        this.id_class(rrPt_12);
    }

    public ril_3(rrPt_1 rrPt_12, rcd_3 rcd_32) {
        super(raF_2.id_float, rcd_32);
        this.id_case = new rqO_2(rcd_32.id_native("Template"));
        this.id_catch = rqd_3.valueOf(rcd_32.id_native("Rot"));
        this.id_throws = rcd_32.id_finally("Integrity");
        this.id_protected = rip_3.valueOf(rcd_32.id_native("BiomeType"));
        this.id_private = rcd_32.id_new("IsLarge");
        this.id_class(rrPt_12);
    }

    @Override
    public boolean id_class(rRI rRI2, rrrA rrrA2, rKd_1 rKd_12, Random random, rfi_3 rfi_32, rfj_3 rfj_32, rfH_2 rfH_22) {
        this.id_break.id_break().id_class(new rrPd_1(this.id_throws)).id_class(rrPG.id_protected);
        int n = rRI2.id_class(rKv_1.OCEAN_FLOOR_WG, this.id_byte.b_(), this.id_byte.d_());
        this.id_byte = new rfH_2(this.id_byte.b_(), n, this.id_byte.d_());
        rfH_2 rfH_23 = rrPl_1.id_class(new rfH_2(this.id_class.id_class().b_() - 1, 0, this.id_class.id_class().d_() - 1), rpa_3.NONE, this.id_catch, rfH_2.id_protected).id_break(this.id_byte);
        this.id_byte = new rfH_2(this.id_byte.b_(), this.id_class(this.id_byte, rRI2, rfH_23), this.id_byte.d_());
        return super.id_class(rRI2, rrrA2, rKd_12, random, rfi_32, rfj_32, rfH_22);
    }

    @Override
    protected void id_class(String string, rfH_2 rfH_22, rRf_1 rRf_12, Random random, rfi_3 rfi_32) {
        if ("chest".equals(string)) {
            rRf_12.id_class(rfH_22, (xc_3)xu_3.re.id_continue().id_class(xt_3.id_int, rRf_12.id_break(rfH_22).id_class(rlG_2.id_break)), 2);
            ryO_2 ryO_22 = rRf_12.id_class(rfH_22);
            if (ryO_22 instanceof rHu_1) {
                ((rHu_1)ryO_22).id_class(this.id_private ? rzl_3.id_abstract : rzl_3.id_char, random.nextLong());
            }
        } else if ("drowned".equals(string)) {
            rEx_1 rEx_12 = aI_2.id_new.id_class(rRf_12.id_byte());
            rEx_12.b();
            rEx_12.id_class(rfH_22, 0.0f, 0.0f);
            rEx_12.id_class(rRf_12, rRf_12.id_throws(rfH_22), iO_2.STRUCTURE, (aU_2)null, (rcd_3)null);
            rRf_12.id_class(rEx_12);
            if (rfH_22.c_() > rRf_12.id_short()) {
                rRf_12.id_class(rfH_22, xu_3.id_class.id_continue(), 2);
            } else {
                rRf_12.id_class(rfH_22, xu_3.id_try.id_continue(), 2);
            }
        }
    }

    private int id_class(rfH_2 rfH_22, rRq_1 rRq_12, rfH_2 rfH_23) {
        int n = rfH_22.c_();
        int n2 = 512;
        int n3 = n - 1;
        int n4 = 0;
        for (rfH_2 rfH_24 : rfH_2.id_class(rfH_22, rfH_23)) {
            int n5 = rfH_24.b_();
            int n6 = rfH_24.d_();
            int n7 = rfH_22.c_() - 1;
            rfw_3 rfw_32 = new rfw_3(n5, n7, n6);
            xc_3 xc_32 = rRq_12.id_byte(rfw_32);
            rXE rXE2 = rRq_12.id_break(rfw_32);
            while ((xc_32.id_catch() || rXE2.id_class(rlG_2.id_break) || xc_32.id_break().id_class(rls_3.r)) && n7 > 1) {
                rfw_32.id_class(n5, --n7, n6);
                xc_32 = rRq_12.id_byte(rfw_32);
                rXE2 = rRq_12.id_break(rfw_32);
            }
            n2 = Math.min(n2, n7);
            if (n7 >= n3 - 2) continue;
            ++n4;
        }
        int n8 = Math.abs(rfH_22.b_() - rfH_23.b_());
        if (n3 - n2 > 2 && n4 > n8 - 2) {
            n = n2 + 1;
        }
        return n;
    }

    @Override
    protected void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_class("Template", this.id_case.toString());
        rcd_32.id_class("Rot", this.id_catch.name());
        rcd_32.id_class("Integrity", this.id_throws);
        rcd_32.id_class("BiomeType", this.id_protected.toString());
        rcd_32.id_class("IsLarge", this.id_private);
    }

    private void id_class(rrPt_1 rrPt_12) {
        rrPl_1 rrPl_12 = rrPt_12.id_class(this.id_case);
        rrPN rrPN2 = new rrPN().id_class(this.id_catch).id_class(rpa_3.NONE).id_class(rrPG.id_protected);
        this.id_class(rrPl_12, this.id_byte, rrPN2);
    }
}

