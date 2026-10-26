/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.rGz_1;
import celestial.rHK;
import celestial.rRf_1;
import celestial.raF_2;
import celestial.rcd_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.reD_2;
import celestial.rfH_2;
import celestial.rfi_3;
import celestial.rpr_3;
import celestial.rqO_2;
import celestial.rqd_3;
import celestial.rrPN;
import celestial.rrPl_1;
import celestial.rrPt_1;
import celestial.rrrw_1;
import celestial.rsG_2;
import celestial.rzl_3;
import java.util.Random;

public class rar_3
extends rrrw_1 {
    private final String id_protected;
    private final rqd_3 id_throws;
    private final boolean id_case;

    public rar_3(rrPt_1 rrPt_12, String string, rfH_2 rfH_22, rqd_3 rqd_32, boolean bl) {
        super(raF_2.s, 0);
        this.id_protected = string;
        this.id_byte = rfH_22;
        this.id_throws = rqd_32;
        this.id_case = bl;
        this.id_class(rrPt_12);
    }

    public rar_3(rrPt_1 rrPt_12, rcd_3 rcd_32) {
        super(raF_2.s, rcd_32);
        this.id_protected = rcd_32.id_native("Template");
        this.id_throws = rqd_3.valueOf(rcd_32.id_native("Rot"));
        this.id_case = rcd_32.id_new("OW");
        this.id_class(rrPt_12);
    }

    @Override
    protected void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_class("Template", this.id_protected);
        rcd_32.id_class("Rot", this.id_throws.name());
        rcd_32.id_class("OW", this.id_case);
    }

    @Override
    protected void id_class(String string, rfH_2 rfH_22, rRf_1 rRf_12, Random random, rfi_3 rfi_32) {
        if (string.startsWith("Chest")) {
            rfH_2 rfH_23 = rfH_22.id_break();
            if (rfi_32.id_break(rfH_23)) {
                rHK.id_class(rRf_12, random, rfH_23, rzl_3.id_byte);
            }
        } else if (string.startsWith("Sentry")) {
            rGz_1 rGz_12 = aI_2.v.id_class(rRf_12.id_byte());
            rGz_12.id_new((double)rfH_22.b_() + 0.5, (double)rfH_22.c_() + 0.5, (double)rfH_22.d_() + 0.5);
            rGz_12.id_finally(rfH_22);
            rRf_12.a_(rGz_12);
        } else if (string.startsWith("Elytra")) {
            rsG_2 rsG_22 = new rsG_2(rRf_12.id_byte(), rfH_22, this.id_throws.id_class(rpr_3.SOUTH));
            rsG_22.id_class(new rdn_3(rdy_3.kc), false);
            rRf_12.a_(rsG_22);
        }
    }

    private void id_class(rrPt_1 rrPt_12) {
        rrPl_1 rrPl_12 = rrPt_12.id_class(new rqO_2("end_city/" + this.id_protected));
        rrPN rrPN2 = (this.id_case ? reD_2.id_class : reD_2.id_break).id_class().id_class(this.id_throws);
        this.id_class(rrPl_12, this.id_byte, rrPN2);
    }
}

