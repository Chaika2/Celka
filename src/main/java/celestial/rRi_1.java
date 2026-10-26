/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.kT_2;
import celestial.rCT;
import celestial.rKv_1;
import celestial.rRP;
import celestial.rRr_1;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rfj_3;
import celestial.rfw_3;
import celestial.rgU_2;
import celestial.rga_3;
import celestial.roE_2;
import celestial.rpB_2;
import celestial.rpG_2;
import celestial.rpr_3;
import celestial.rqT_2;
import celestial.rqp_3;
import celestial.rrEl_1;
import celestial.rrEm_1;
import celestial.xc_3;
import celestial.xu_3;
import java.util.Comparator;
import java.util.Optional;

public class rRi_1 {
    private final rrEm_1 id_class;

    public rRi_1(rrEm_1 rrEm_12) {
        this.id_class = rrEm_12;
    }

    public Optional<rqT_2> id_class(rfH_2 rfH_22, boolean bl) {
        rga_3 rga_32 = this.id_class.d();
        int n = bl ? 16 : 128;
        rga_32.id_class(this.id_class, rfH_22, n);
        Optional<rgU_2> optional = rga_32.id_break(rRP2 -> rRP2 == rRP.id_synchronized, rfH_22, n, rRr_1.ANY).sorted(Comparator.comparingDouble(rgU_22 -> rgU_22.id_throws().id_private(rfH_22)).thenComparingInt(rgU_22 -> rgU_22.id_throws().c_())).filter(rgU_22 -> this.id_class.id_byte(rgU_22.id_throws()).id_break(rCT.id_char)).findFirst();
        return optional.map(rgU_22 -> {
            rfH_2 rfH_23 = rgU_22.id_throws();
            this.id_class.id_else().id_class(rrEl_1.id_case, new rfj_3(rfH_23), 3, rfH_23);
            xc_3 xc_32 = this.id_class.id_byte(rfH_23);
            return rqp_3.id_class(rfH_23, xc_32.id_byte(rCT.id_char), 21, rpB_2.Y, 21, rfH_22 -> this.id_class.id_byte((rfH_2)rfH_22) == xc_32);
        });
    }

    public Optional<rqT_2> id_class(rfH_2 rfH_22, rpB_2 rpB_22) {
        int n;
        int n2;
        rpr_3 rpr_32 = rpr_3.id_class(rpG_2.POSITIVE, rpB_22);
        double d = -1.0;
        rfH_2 rfH_23 = null;
        double d2 = -1.0;
        rfH_2 rfH_24 = null;
        roE_2 roE_22 = this.id_class.id_instanceof();
        int n3 = this.id_class.id_float() - 1;
        rfw_3 rfw_32 = rfH_22.id_new();
        for (rfw_3 rfw_33 : rfH_2.id_class(rfH_22, 16, rpr_3.EAST, rpr_3.SOUTH)) {
            n2 = Math.min(n3, this.id_class.id_class(rKv_1.MOTION_BLOCKING, rfw_33.b_(), rfw_33.d_()));
            n = 1;
            if (!roE_22.id_class(rfw_33) || !roE_22.id_class(rfw_33.id_byte(rpr_32, 1))) continue;
            rfw_33.id_byte(rpr_32.id_case(), 1);
            for (int i = n2; i >= 0; --i) {
                int n4;
                rfw_33.b_(i);
                if (!this.id_class.id_finally(rfw_33)) continue;
                int n5 = i;
                while (i > 0 && this.id_class.id_finally(rfw_33.id_class(rpr_3.DOWN))) {
                    --i;
                }
                if (i + 4 > n3 || (n4 = n5 - i) > 0 && n4 < 3) continue;
                rfw_33.b_(i);
                if (!this.id_class(rfw_33, rfw_32, rpr_32, 0)) continue;
                double d3 = rfH_22.id_private(rfw_33);
                if (this.id_class(rfw_33, rfw_32, rpr_32, -1) && this.id_class(rfw_33, rfw_32, rpr_32, 1) && (d == -1.0 || d > d3)) {
                    d = d3;
                    rfH_23 = rfw_33.id_int();
                }
                if (d != -1.0 || d2 != -1.0 && !(d2 > d3)) continue;
                d2 = d3;
                rfH_24 = rfw_33.id_int();
            }
        }
        if (d == -1.0 && d2 != -1.0) {
            rfH_23 = rfH_24;
            d = d2;
        }
        if (d == -1.0) {
            rfH_23 = new rfH_2(rfH_22.b_(), rfU_2.id_class(rfH_22.c_(), 70, this.id_class.id_float() - 10), rfH_22.d_()).id_int();
            rpr_3 rpr_33 = rpr_32.id_catch();
            if (!roE_22.id_class(rfH_23)) {
                return Optional.empty();
            }
            for (int i = -1; i < 2; ++i) {
                for (n2 = 0; n2 < 2; ++n2) {
                    for (n = -1; n < 3; ++n) {
                        xc_3 xc_32 = n < 0 ? xu_3.rg.id_continue() : xu_3.id_class.id_continue();
                        rfw_32.id_class(rfH_23, n2 * rpr_32.id_implements() + i * rpr_33.id_implements(), n, n2 * rpr_32.id_extends() + i * rpr_33.id_extends());
                        this.id_class.id_break((rfH_2)rfw_32, xc_32);
                    }
                }
            }
        }
        for (int i = -1; i < 3; ++i) {
            for (int j = -1; j < 4; ++j) {
                if (i != -1 && i != 2 && j != -1 && j != 3) continue;
                rfw_32.id_class(rfH_23, i * rpr_32.id_implements(), j, i * rpr_32.id_extends());
                this.id_class.id_class((rfH_2)rfw_32, xu_3.rg.id_continue(), 3);
            }
        }
        xc_3 xc_33 = (xc_3)xu_3.Pi.id_continue().id_class(kT_2.id_volatile, rpB_22);
        for (int i = 0; i < 2; ++i) {
            for (n2 = 0; n2 < 3; ++n2) {
                rfw_32.id_class(rfH_23, i * rpr_32.id_implements(), n2, i * rpr_32.id_extends());
                this.id_class.id_class((rfH_2)rfw_32, xc_33, 18);
            }
        }
        return Optional.of(new rqT_2(rfH_23.id_int(), 2, 3));
    }

    private boolean id_class(rfH_2 rfH_22, rfw_3 rfw_32, rpr_3 rpr_32, int n) {
        rpr_3 rpr_33 = rpr_32.id_catch();
        for (int i = -1; i < 3; ++i) {
            for (int j = -1; j < 4; ++j) {
                rfw_32.id_class(rfH_22, rpr_32.id_implements() * i + rpr_33.id_implements() * n, j, rpr_32.id_extends() * i + rpr_33.id_extends() * n);
                if (j < 0 && !this.id_class.id_byte(rfw_32).id_byte().id_break()) {
                    return false;
                }
                if (j < 0 || this.id_class.id_finally(rfw_32)) continue;
                return false;
            }
        }
        return true;
    }
}

