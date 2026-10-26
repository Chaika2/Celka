/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.aU_2;
import celestial.iO_2;
import celestial.rRf_1;
import celestial.raF_2;
import celestial.rcd_3;
import celestial.rfH_2;
import celestial.rfi_3;
import celestial.rpa_3;
import celestial.rpr_3;
import celestial.rqO_2;
import celestial.rqd_3;
import celestial.rrPG;
import celestial.rrPN;
import celestial.rrPl_1;
import celestial.rrPt_1;
import celestial.rrrw_1;
import celestial.rsi_3;
import celestial.rzl_3;
import celestial.xc_3;
import celestial.xt_3;
import celestial.xu_3;
import java.util.Random;

public class rrrY
extends rrrw_1 {
    private final String id_protected;
    private final rqd_3 id_throws;
    private final rpa_3 id_case;

    public rrrY(rrPt_1 rrPt_12, rcd_3 rcd_32) {
        super(raF_2.E, rcd_32);
        this.id_protected = rcd_32.id_native("Template");
        this.id_throws = rqd_3.valueOf(rcd_32.id_native("Rot"));
        this.id_case = rpa_3.valueOf(rcd_32.id_native("Mi"));
        this.id_class(rrPt_12);
    }

    public rrrY(rrPt_1 rrPt_12, String string, rfH_2 rfH_22, rqd_3 rqd_32, rpa_3 rpa_32) {
        super(raF_2.E, 0);
        this.id_protected = string;
        this.id_byte = rfH_22;
        this.id_throws = rqd_32;
        this.id_case = rpa_32;
        this.id_class(rrPt_12);
    }

    public rrrY(rrPt_1 rrPt_12, String string, rfH_2 rfH_22, rqd_3 rqd_32) {
        this(rrPt_12, string, rfH_22, rqd_32, rpa_3.NONE);
    }

    @Override
    protected void id_class(String string, rfH_2 rfH_22, rRf_1 rRf_12, Random random, rfi_3 rfi_32) {
        if (string.startsWith("Chest")) {
            rqd_3 rqd_32 = this.id_break.id_protected();
            xc_3 xc_32 = xu_3.re.id_continue();
            if ("ChestWest".equals(string)) {
                xc_32 = (xc_3)xc_32.id_class(xt_3.id_final, rqd_32.id_class(rpr_3.WEST));
            } else if ("ChestEast".equals(string)) {
                xc_32 = (xc_3)xc_32.id_class(xt_3.id_final, rqd_32.id_class(rpr_3.EAST));
            } else if ("ChestSouth".equals(string)) {
                xc_32 = (xc_3)xc_32.id_class(xt_3.id_final, rqd_32.id_class(rpr_3.SOUTH));
            } else if ("ChestNorth".equals(string)) {
                xc_32 = (xc_3)xc_32.id_class(xt_3.id_final, rqd_32.id_class(rpr_3.NORTH));
            }
            this.id_class(rRf_12, rfi_32, random, rfH_22, rzl_3.id_interface, xc_32);
        } else {
            rsi_3 rsi_32;
            int n = -1;
            switch (string.hashCode()) {
                case -1505748702: {
                    if (!string.equals("Warrior")) break;
                    n = 1;
                    break;
                }
                case 2390418: {
                    if (!string.equals("Mage")) break;
                    n = 0;
                }
            }
            switch (n) {
                case 0: {
                    rsi_32 = aI_2.id_return.id_class(rRf_12.id_byte());
                    break;
                }
                case 1: {
                    rsi_32 = aI_2.U.id_class(rRf_12.id_byte());
                    break;
                }
                default: {
                    return;
                }
            }
            rsi_32.b();
            rsi_32.id_class(rfH_22, 0.0f, 0.0f);
            rsi_32.id_class(rRf_12, rRf_12.id_throws(rsi_32.Bs()), iO_2.STRUCTURE, (aU_2)null, (rcd_3)null);
            rRf_12.id_class(rsi_32);
            rRf_12.id_class(rfH_22, xu_3.id_class.id_continue(), 2);
        }
    }

    @Override
    protected void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_class("Template", this.id_protected);
        rcd_32.id_class("Rot", this.id_break.id_protected().name());
        rcd_32.id_class("Mi", this.id_break.id_byte().name());
    }

    private void id_class(rrPt_1 rrPt_12) {
        rrPl_1 rrPl_12 = rrPt_12.id_class(new rqO_2("woodland_mansion/" + this.id_protected));
        rrPN rrPN2 = new rrPN().id_class(true).id_class(this.id_throws).id_class(this.id_case).id_class(rrPG.id_break);
        this.id_class(rrPl_12, this.id_byte, rrPN2);
    }
}

