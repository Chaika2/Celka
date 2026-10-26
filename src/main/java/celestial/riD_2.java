/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rHK;
import celestial.rKd_1;
import celestial.rKv_1;
import celestial.rRI;
import celestial.rRf_1;
import celestial.raF_2;
import celestial.rcd_3;
import celestial.rfH_2;
import celestial.rfi_3;
import celestial.rfj_3;
import celestial.riK_2;
import celestial.rpa_3;
import celestial.rqO_2;
import celestial.rqd_3;
import celestial.rrPG;
import celestial.rrPN;
import celestial.rrPl_1;
import celestial.rrPt_1;
import celestial.rrrA;
import celestial.rrrw_1;
import celestial.rzl_3;
import java.util.Random;

public class riD_2
extends rrrw_1 {
    private final rqd_3 id_protected;
    private final rqO_2 id_throws;
    private final boolean id_case;

    public riD_2(rrPt_1 rrPt_12, rqO_2 rqO_22, rfH_2 rfH_22, rqd_3 rqd_32, boolean bl) {
        super(raF_2.b, 0);
        this.id_byte = rfH_22;
        this.id_protected = rqd_32;
        this.id_throws = rqO_22;
        this.id_case = bl;
        this.id_class(rrPt_12);
    }

    public riD_2(rrPt_1 rrPt_12, rcd_3 rcd_32) {
        super(raF_2.b, rcd_32);
        this.id_throws = new rqO_2(rcd_32.id_native("Template"));
        this.id_case = rcd_32.id_new("isBeached");
        this.id_protected = rqd_3.valueOf(rcd_32.id_native("Rot"));
        this.id_class(rrPt_12);
    }

    @Override
    protected void id_class(String string, rfH_2 rfH_22, rRf_1 rRf_12, Random random, rfi_3 rfi_32) {
        if ("map_chest".equals(string)) {
            rHK.id_class(rRf_12, random, rfH_22.id_break(), rzl_3.id_float);
        } else if ("treasure_chest".equals(string)) {
            rHK.id_class(rRf_12, random, rfH_22.id_break(), rzl_3.id_static);
        } else if ("supply_chest".equals(string)) {
            rHK.id_class(rRf_12, random, rfH_22.id_break(), rzl_3.id_void);
        }
    }

    @Override
    public boolean id_class(rRI rRI2, rrrA rrrA2, rKd_1 rKd_12, Random random, rfi_3 rfi_32, rfj_3 rfj_32, rfH_2 rfH_22) {
        int n = 256;
        int n2 = 0;
        rfH_2 rfH_23 = this.id_class.id_class();
        rKv_1 rKv_12 = this.id_case ? rKv_1.WORLD_SURFACE_WG : rKv_1.OCEAN_FLOOR_WG;
        int n3 = rfH_23.b_() * rfH_23.d_();
        if (n3 == 0) {
            n2 = rRI2.id_class(rKv_12, this.id_byte.b_(), this.id_byte.d_());
        } else {
            rfH_2 rfH_24 = this.id_byte.id_break(rfH_23.b_() - 1, 0, rfH_23.d_() - 1);
            for (rfH_2 rfH_25 : rfH_2.id_class(this.id_byte, rfH_24)) {
                int n4 = rRI2.id_class(rKv_12, rfH_25.b_(), rfH_25.d_());
                n2 += n4;
                n = Math.min(n, n4);
            }
            n2 /= n3;
        }
        int n5 = this.id_case ? n - rfH_23.c_() / 2 - random.nextInt(3) : n2;
        this.id_byte = new rfH_2(this.id_byte.b_(), n5, this.id_byte.d_());
        return super.id_class(rRI2, rrrA2, rKd_12, random, rfi_32, rfj_32, rfH_22);
    }

    private void id_class(rrPt_1 rrPt_12) {
        rrPl_1 rrPl_12 = rrPt_12.id_class(this.id_throws);
        rrPN rrPN2 = new rrPN().id_class(this.id_protected).id_class(rpa_3.NONE).id_class(riK_2.id_class).id_class(rrPG.id_protected);
        this.id_class(rrPl_12, this.id_byte, rrPN2);
    }

    @Override
    protected void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_class("Template", this.id_throws.toString());
        rcd_32.id_class("isBeached", this.id_case);
        rcd_32.id_class("Rot", this.id_protected.name());
    }
}

