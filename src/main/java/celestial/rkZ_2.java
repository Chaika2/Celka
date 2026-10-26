/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.VD;
import celestial.an_3;
import celestial.gy_3;
import celestial.kv_3;
import celestial.rVi_1;
import celestial.rYB;
import celestial.rca_3;
import celestial.rcd_3;
import celestial.rcy_3;
import celestial.rdH_2;
import celestial.rdO_2;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rgB_2;
import celestial.rgF_2;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rgv_3;
import celestial.rhd_3;
import celestial.rkm_3;
import celestial.rlB_2;
import celestial.rpm_3;
import celestial.rql_3;
import celestial.ryZ_2;
import celestial.rym_3;
import celestial.xc_3;
import celestial.xu_3;
import java.util.List;

public class rkZ_2
extends rdb_3 {
    public rkZ_2(rdO_2 rdO_22) {
        super(rdO_22);
    }

    @Override
    public void id_class(rdn_3 rdn_32, rYB rYB2, List<rgP_2> list, VD vD) {
        if (rdn_32.id_final()) {
            rcd_3 rcd_32 = rdn_32.id_package();
            String string = rcd_32.id_native("author");
            if (!rql_3.id_break(string)) {
                list.add(new rgn_3("book.byAuthor", string).id_class(rgF_2.GRAY));
            }
            list.add(new rgn_3("book.generation." + rcd_32.id_private("generation")).id_class(rgF_2.GRAY));
        }
    }

    @Override
    public ryZ_2 id_class(rdH_2 rdH_22) {
        rfH_2 rfH_22;
        rYB rYB2 = rdH_22.id_int();
        xc_3 xc_32 = rYB2.id_byte(rfH_22 = rdH_22.id_class());
        if (xc_32.id_class(xu_3.Xs)) {
            return kv_3.id_class(rYB2, rfH_22, xc_32, rdH_22.id_volatile()) ? ryZ_2.id_class(rYB2.id_continue) : ryZ_2.PASS;
        }
        return ryZ_2.PASS;
    }

    @Override
    public rym_3<rdn_3> id_class(rYB rYB2, rhd_3 rhd_32, rpm_3 rpm_32) {
        rdn_3 rdn_32 = rhd_32.id_protected(rpm_32);
        rhd_32.id_class(rdn_32, rpm_32);
        rhd_32.id_class(rlB_2.id_byte.id_break(this));
        return rym_3.id_class(rdn_32, rYB2.id_import());
    }

    public static boolean id_class(rdn_3 rdn_32, gy_3 gy_32, rhd_3 rhd_32) {
        rcd_3 rcd_32 = rdn_32.id_package();
        if (rcd_32 != null && !rcd_32.id_new("resolved")) {
            rcd_32.id_class("resolved", true);
            if (!rkZ_2.id_class(rcd_32)) {
                return false;
            }
            rcy_3 rcy_32 = rcd_32.id_protected("pages", 8);
            for (int i = 0; i < rcy_32.size(); ++i) {
                rVi_1 rVi_12;
                String string = rcy_32.id_implements(i);
                try {
                    rVi_12 = rgB_2.id_break(string);
                    rVi_12 = rgv_3.id_class(gy_32, rVi_12, (an_3)rhd_32, 0);
                }
                catch (Exception exception) {
                    rVi_12 = new rgN_2(string);
                }
                rcy_32.id_protected(i, rca_3.id_class(rgB_2.id_class(rVi_12)));
            }
            rcd_32.id_class("pages", rcy_32);
            return true;
        }
        return false;
    }

    public static boolean id_class(rcd_3 rcd_32) {
        if (!rkm_3.id_class(rcd_32)) {
            return false;
        }
        if (!rcd_32.id_byte("title", 8)) {
            return false;
        }
        String string = rcd_32.id_native("title");
        return string.length() > 32 ? false : rcd_32.id_byte("author", 8);
    }

    @Override
    public boolean id_throws(rdn_3 rdn_32) {
        return true;
    }

    public static int id_catch(rdn_3 rdn_32) {
        rcd_3 rcd_32 = rdn_32.id_package();
        return rcd_32 != null ? rcd_32.id_protected("pages", 8).size() : 0;
    }

    @Override
    public rgP_2 id_implements(rdn_3 rdn_32) {
        rcd_3 rcd_32;
        String string;
        if (rdn_32.id_final() && !rql_3.id_break(string = (rcd_32 = rdn_32.id_package()).id_native("title"))) {
            return new rgN_2(string);
        }
        return super.id_implements(rdn_32);
    }

    public static int id_protected(rdn_3 rdn_32) {
        return rdn_32.id_package().id_private("generation");
    }
}

