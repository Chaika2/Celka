/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.VD;
import celestial.kz_3;
import celestial.rRg_1;
import celestial.rVi_1;
import celestial.rYB;
import celestial.rdH_2;
import celestial.rdO_2;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rgF_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rhd_3;
import celestial.rlB_2;
import celestial.rqA_2;
import celestial.ryZ_2;
import celestial.xc_3;
import celestial.xu_3;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;

public class rdR_2
extends rdb_3 {
    private static final Map<rqA_2, rdR_2> id_class = Maps.newHashMap();
    private final int id_break;
    private final rqA_2 id_byte;

    protected rdR_2(int n, rqA_2 rqA_22, rdO_2 rdO_22) {
        super(rdO_22);
        this.id_break = n;
        this.id_byte = rqA_22;
        id_class.put(this.id_byte, this);
    }

    @Override
    public ryZ_2 id_class(rdH_2 rdH_22) {
        rfH_2 rfH_22;
        rYB rYB2 = rdH_22.id_int();
        xc_3 xc_32 = rYB2.id_byte(rfH_22 = rdH_22.id_class());
        if (xc_32.id_class(xu_3.Pj) && !xc_32.id_byte(kz_3.id_volatile).booleanValue()) {
            rdn_3 rdn_32 = rdH_22.id_volatile();
            if (!rYB2.id_continue) {
                ((kz_3)xu_3.Pj).id_class((rRg_1)rYB2, rfH_22, xc_32, rdn_32);
                rYB2.id_class((rhd_3)null, 1010, rfH_22, rdb_3.id_class(this));
                rdn_32.id_catch(1);
                rhd_3 rhd_32 = rdH_22.id_final();
                if (rhd_32 != null) {
                    rhd_32.id_break(rlB_2.W);
                }
            }
            return ryZ_2.id_class(rYB2.id_continue);
        }
        return ryZ_2.PASS;
    }

    @Override
    public void id_class(rdn_3 rdn_32, rYB rYB2, List<rgP_2> list, VD vD) {
        list.add(this.id_private().id_class(rgF_2.GRAY));
    }

    public static rdR_2 id_class(rqA_2 rqA_22) {
        return id_class.get(rqA_22);
    }

    public int id_catch() {
        return this.id_break;
    }

    public rqA_2 id_return() {
        return this.id_byte;
    }

    public rVi_1 id_private() {
        return new rgn_3(this.id_break() + ".desc");
    }
}

