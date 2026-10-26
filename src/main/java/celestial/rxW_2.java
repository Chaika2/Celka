/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.dd_3;
import celestial.kX_2;
import celestial.rLQ;
import celestial.rRR;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rYB;
import celestial.rYG;
import celestial.rYl_1;
import celestial.rdH_2;
import celestial.rdO_2;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rls_3;
import celestial.rpB_2;
import celestial.rpb_3;
import celestial.rpr_3;
import celestial.rqM_2;
import celestial.rrEm_1;
import celestial.ryZ_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import java.util.Objects;
import java.util.Optional;

public class rxW_2
extends rdb_3 {
    public rxW_2(rdO_2 rdO_22) {
        super(rdO_22);
    }

    public static void id_class(rRg_1 rRg_12, rfH_2 rfH_22, int n) {
        xc_3 xc_32;
        if (n == 0) {
            n = 15;
        }
        if (!(xc_32 = rRg_12.id_byte(rfH_22)).id_catch()) {
            double d;
            double d2 = 0.5;
            if (xc_32.id_class(xu_3.id_try)) {
                n *= 3;
                d = 1.0;
                d2 = 3.0;
            } else if (xc_32.id_implements(rRg_12, rfH_22)) {
                rfH_22 = rfH_22.id_final();
                n *= 3;
                d2 = 3.0;
                d = 1.0;
            } else {
                d = xc_32.id_finally(rRg_12, rfH_22).id_byte(rpB_2.Y);
            }
            rRg_12.id_class(rLQ.id_char, (double)rfH_22.b_() + 0.5, (double)rfH_22.c_() + 0.5, (double)rfH_22.d_() + 0.5, 0.0, 0.0, 0.0);
            for (int i = 0; i < n; ++i) {
                double d3;
                double d4;
                double d5 = id_private.nextGaussian() * 0.02;
                double d6 = id_private.nextGaussian() * 0.02;
                double d7 = id_private.nextGaussian() * 0.02;
                double d8 = 0.5 - d2;
                double d9 = (double)rfH_22.b_() + d8 + id_private.nextDouble() * d2 * 2.0;
                if (rRg_12.id_byte(new rfH_2(d9, d4 = (double)rfH_22.c_() + id_private.nextDouble() * d, d3 = (double)rfH_22.d_() + d8 + id_private.nextDouble() * d2 * 2.0).id_break()).id_catch()) continue;
                rRg_12.id_class(rLQ.id_char, d9, d4, d3, d5, d6, d7);
            }
        }
    }

    public static boolean id_class(rdn_3 rdn_32, rYB rYB2, rfH_2 rfH_22, rpr_3 rpr_32) {
        if (rYB2.id_byte(rfH_22).id_class(xu_3.id_try) && rYB2.id_break(rfH_22).id_throws() == 8) {
            if (!(rYB2 instanceof rrEm_1)) {
                return true;
            }
            block0: for (int i = 0; i < 128; ++i) {
                rfH_2 rfH_23 = rfH_22;
                xc_3 xc_32 = xu_3.rr.id_continue();
                for (int j = 0; j < i / 16; ++j) {
                    if (rYB2.id_byte(rfH_23 = rfH_23.id_break(id_private.nextInt(3) - 1, (id_private.nextInt(3) - 1) * id_private.nextInt(3) / 2, id_private.nextInt(3) - 1)).id_new(rYB2, rfH_23)) continue block0;
                }
                Optional<rqM_2<rYG>> optional = rYB2.id_protected(rfH_23);
                if (Objects.equals(optional, Optional.of(rYl_1.id_double)) || Objects.equals(optional, Optional.of(rYl_1.P))) {
                    if (i == 0 && rpr_32 != null && rpr_32.id_final().id_protected()) {
                        xc_32 = (xc_3)((xd_3)rls_3.E.id_class(rYB2.id_int)).id_continue().id_class(dd_3.id_final, rpr_32);
                    } else if (id_private.nextInt(4) == 0) {
                        xc_32 = ((xd_3)rls_3.S.id_class(id_private)).id_continue();
                    }
                }
                if (xc_32.id_break().id_class(rls_3.E)) {
                    for (int j = 0; !xc_32.id_class((rRR)rYB2, rfH_23) && j < 4; ++j) {
                        xc_32 = (xc_3)xc_32.id_class(dd_3.id_final, rpb_3.HORIZONTAL.id_class(id_private));
                    }
                }
                if (!xc_32.id_class((rRR)rYB2, rfH_23)) continue;
                xc_3 xc_33 = rYB2.id_byte(rfH_23);
                if (xc_33.id_class(xu_3.id_try) && rYB2.id_break(rfH_23).id_throws() == 8) {
                    rYB2.id_class(rfH_23, xc_32, 3);
                    continue;
                }
                if (!xc_33.id_class(xu_3.rr) || id_private.nextInt(10) != 0) continue;
                ((kX_2)((Object)xu_3.rr)).id_class((rrEm_1)rYB2, id_private, rfH_23, xc_33);
            }
            rdn_32.id_catch(1);
            return true;
        }
        return false;
    }

    public static boolean id_class(rdn_3 rdn_32, rYB rYB2, rfH_2 rfH_22) {
        kX_2 kX_22;
        xc_3 xc_32 = rYB2.id_byte(rfH_22);
        if (xc_32.id_break() instanceof kX_2 && (kX_22 = (kX_2)((Object)xc_32.id_break())).id_class((rRq_1)rYB2, rfH_22, xc_32, rYB2.id_continue)) {
            if (rYB2 instanceof rrEm_1) {
                if (kX_22.id_class(rYB2, rYB2.id_int, rfH_22, xc_32)) {
                    kX_22.id_class((rrEm_1)rYB2, rYB2.id_int, rfH_22, xc_32);
                }
                rdn_32.id_catch(1);
            }
            return true;
        }
        return false;
    }

    @Override
    public ryZ_2 id_class(rdH_2 rdH_22) {
        rYB rYB2 = rdH_22.id_int();
        rfH_2 rfH_22 = rdH_22.id_class();
        rfH_2 rfH_23 = rfH_22.id_break(rdH_22.id_finally());
        if (rxW_2.id_class(rdH_22.id_volatile(), rYB2, rfH_22)) {
            if (!rYB2.id_continue) {
                rYB2.id_byte(2005, rfH_22, 0);
            }
            return ryZ_2.id_class(rYB2.id_continue);
        }
        xc_3 xc_32 = rYB2.id_byte(rfH_22);
        boolean bl = xc_32.id_protected(rYB2, rfH_22, rdH_22.id_finally());
        if (bl && rxW_2.id_class(rdH_22.id_volatile(), rYB2, rfH_23, rdH_22.id_finally())) {
            if (!rYB2.id_continue) {
                rYB2.id_byte(2005, rfH_23, 0);
            }
            return ryZ_2.id_class(rYB2.id_continue);
        }
        return ryZ_2.PASS;
    }
}

