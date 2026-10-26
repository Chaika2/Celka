/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rCF;
import celestial.rCZ;
import celestial.rRg_1;
import celestial.rVL;
import celestial.rVU;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rdH_2;
import celestial.rdO_2;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rhN_2;
import celestial.rhd_3;
import celestial.rpm_3;
import celestial.rqR_2;
import celestial.ryZ_2;
import celestial.xc_3;
import celestial.xd_3;
import java.util.Collection;

public class rxZ_2
extends rdb_3 {
    public rxZ_2(rdO_2 rdO_22) {
        super(rdO_22);
    }

    private static <T extends Comparable<T>> xc_3 id_class(xc_3 xc_32, rCZ<T> rCZ2, boolean bl) {
        return (xc_3)xc_32.id_class(rCZ2, (Comparable)rxZ_2.id_class(rCZ2.id_class(), xc_32.id_byte(rCZ2), bl));
    }

    private static <T> T id_class(Iterable<T> iterable, T t, boolean bl) {
        return bl ? rqR_2.id_break(iterable, t) : rqR_2.id_class(iterable, t);
    }

    private static void id_class(rhd_3 rhd_32, rgP_2 rgP_22) {
        ((rhN_2)rhd_32).id_class(rgP_22, rVU.GAME_INFO, rqR_2.id_break);
    }

    private static <T extends Comparable<T>> String id_class(xc_3 xc_32, rCZ<T> rCZ2) {
        return rCZ2.id_class(xc_32.id_byte(rCZ2));
    }

    @Override
    public boolean id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, rhd_3 rhd_32) {
        if (!rYB2.id_continue) {
            this.id_class(rhd_32, xc_32, rYB2, rfH_22, false, rhd_32.id_protected(rpm_3.MAIN_HAND));
        }
        return false;
    }

    @Override
    public ryZ_2 id_class(rdH_2 rdH_22) {
        rhd_3 rhd_32 = rdH_22.id_final();
        rYB rYB2 = rdH_22.id_int();
        if (!rYB2.id_continue && rhd_32 != null) {
            rfH_2 rfH_22 = rdH_22.id_class();
            this.id_class(rhd_32, rYB2.id_byte(rfH_22), rYB2, rfH_22, true, rdH_22.id_volatile());
        }
        return ryZ_2.id_class(rYB2.id_continue);
    }

    private void id_class(rhd_3 rhd_32, xc_3 xc_32, rRg_1 rRg_12, rfH_2 rfH_22, boolean bl, rdn_3 rdn_32) {
        if (rhd_32.sU()) {
            xd_3 xd_32 = xc_32.id_break();
            rCF<xd_3, xc_3> rCF2 = xd_32.id_new();
            Collection<rCZ<?>> collection = rCF2.id_protected();
            String string = rVL.id_strictfp.id_break(xd_32).toString();
            if (collection.isEmpty()) {
                rxZ_2.id_class(rhd_32, new rgn_3(this.id_break() + ".empty", string));
            } else {
                rcd_3 rcd_32 = rdn_32.id_class("DebugProperty");
                String string2 = rcd_32.id_native(string);
                rCZ<?> rCZ2 = rCF2.id_class(string2);
                if (bl) {
                    if (rCZ2 == null) {
                        rCZ2 = collection.iterator().next();
                    }
                    xc_3 xc_33 = rxZ_2.id_class(xc_32, rCZ2, rhd_32.sN());
                    rRg_12.id_class(rfH_22, xc_33, 18);
                    rxZ_2.id_class(rhd_32, new rgn_3(this.id_break() + ".update", rCZ2.id_throws(), rxZ_2.id_class(xc_33, rCZ2)));
                } else {
                    rCZ2 = rxZ_2.id_class(collection, rCZ2, rhd_32.sN());
                    String string3 = rCZ2.id_throws();
                    rcd_32.id_class(string, string3);
                    rxZ_2.id_class(rhd_32, new rgn_3(this.id_break() + ".select", string3, rxZ_2.id_class(xc_32, rCZ2)));
                }
            }
        }
    }

    @Override
    public boolean id_throws(rdn_3 rdn_32) {
        return true;
    }
}

