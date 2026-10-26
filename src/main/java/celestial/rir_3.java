/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rKd_1;
import celestial.rRI;
import celestial.rRf_1;
import celestial.raF_2;
import celestial.rcd_3;
import celestial.rfH_2;
import celestial.rfi_3;
import celestial.rfj_3;
import celestial.rpa_3;
import celestial.rqO_2;
import celestial.rqd_3;
import celestial.rrPG;
import celestial.rrPN;
import celestial.rrPl_1;
import celestial.rrPt_1;
import celestial.rrrA;
import celestial.rrrw_1;
import java.util.Random;

public class rir_3
extends rrrw_1 {
    private final rqO_2 id_protected;
    private final rqd_3 id_throws;

    public rir_3(rrPt_1 rrPt_12, rqO_2 rqO_22, rfH_2 rfH_22, rqd_3 rqd_32) {
        super(raF_2.M, 0);
        this.id_protected = rqO_22;
        this.id_byte = rfH_22;
        this.id_throws = rqd_32;
        this.id_class(rrPt_12);
    }

    public rir_3(rrPt_1 rrPt_12, rcd_3 rcd_32) {
        super(raF_2.M, rcd_32);
        this.id_protected = new rqO_2(rcd_32.id_native("Template"));
        this.id_throws = rqd_3.valueOf(rcd_32.id_native("Rot"));
        this.id_class(rrPt_12);
    }

    @Override
    protected void id_class(String string, rfH_2 rfH_22, rRf_1 rRf_12, Random random, rfi_3 rfi_32) {
    }

    @Override
    public boolean id_class(rRI rRI2, rrrA rrrA2, rKd_1 rKd_12, Random random, rfi_3 rfi_32, rfj_3 rfj_32, rfH_2 rfH_22) {
        rfi_32.id_break(this.id_class.id_break(this.id_break, this.id_byte));
        return super.id_class(rRI2, rrrA2, rKd_12, random, rfi_32, rfj_32, rfH_22);
    }

    @Override
    protected void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_class("Template", this.id_protected.toString());
        rcd_32.id_class("Rot", this.id_throws.name());
    }

    private void id_class(rrPt_1 rrPt_12) {
        rrPl_1 rrPl_12 = rrPt_12.id_class(this.id_protected);
        rrPN rrPN2 = new rrPN().id_class(this.id_throws).id_class(rpa_3.NONE).id_class(rrPG.id_protected);
        this.id_class(rrPl_12, this.id_byte, rrPN2);
    }
}

