/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 */
package celestial;

import celestial.rYB;
import celestial.rdG_2;
import celestial.rdH_2;
import celestial.rdO_2;
import celestial.rfH_2;
import celestial.rhd_3;
import celestial.rkQ_2;
import celestial.rpr_3;
import celestial.rqL_2;
import celestial.rqn_3;
import celestial.ryZ_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xn_3;
import celestial.xu_3;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Set;

public class rkS_2
extends rkQ_2 {
    private static final Set<xd_3> id_byte = Sets.newHashSet((Object[])new xd_3[]{xu_3.PI, xu_3.id_finally, xu_3.id_extends, xu_3.id_native, xu_3.PS, xu_3.id_implements, xu_3.id_char, xu_3.Bi, xu_3.id_throw, xu_3.id_interface, xu_3.Pt, xu_3.Pq, xu_3.PY, xu_3.bt, xu_3.MY, xu_3.Mo, xu_3.MK, xu_3.MD, xu_3.MU, xu_3.Me, xu_3.Ma, xu_3.Mi, xu_3.Or, xu_3.OP, xu_3.OB, xu_3.OS, xu_3.Os, xu_3.OE, xu_3.OG, xu_3.Ob, xu_3.Po});
    protected static final Map<xd_3, xc_3> id_class = Maps.newHashMap((Map)ImmutableMap.of((Object)xu_3.id_implements, (Object)xu_3.bt.id_continue()));

    public rkS_2(rdG_2 rdG_22, float f, float f2, rdO_2 rdO_22) {
        super(f, f2, rdG_22, id_byte, rdO_22);
    }

    @Override
    public ryZ_2 id_class(rdH_2 rdH_22) {
        rYB rYB2 = rdH_22.id_int();
        rfH_2 rfH_22 = rdH_22.id_class();
        xc_3 xc_32 = rYB2.id_byte(rfH_22);
        if (rdH_22.id_finally() == rpr_3.DOWN) {
            return ryZ_2.PASS;
        }
        rhd_3 rhd_33 = rdH_22.id_final();
        xc_3 xc_33 = id_class.get(xc_32.id_break());
        xc_3 xc_34 = null;
        if (xc_33 != null && rYB2.id_byte(rfH_22.id_final()).id_catch()) {
            rYB2.id_class(rhd_33, rfH_22, rqn_3.Jb, rqL_2.BLOCKS, 1.0f, 1.0f);
            xc_34 = xc_33;
        } else if (xc_32.id_break() instanceof xn_3 && xc_32.id_byte(xn_3.id_final).booleanValue()) {
            if (!rYB2.id_import()) {
                rYB2.id_class((rhd_3)null, 1009, rfH_22, 0);
            }
            xn_3.id_byte(rYB2, rfH_22, xc_32);
            xc_34 = (xc_3)xc_32.id_class(xn_3.id_final, false);
        }
        if (xc_34 != null) {
            if (!rYB2.id_continue) {
                rYB2.id_class(rfH_22, xc_34, 11);
                if (rhd_33 != null) {
                    rdH_22.id_volatile().id_class(1, rhd_33, (T rhd_32) -> rhd_32.id_byte(rdH_22.id_package()));
                }
            }
            return ryZ_2.id_class(rYB2.id_continue);
        }
        return ryZ_2.PASS;
    }

    @Override
    public boolean id_break(xc_3 xc_32) {
        return xc_32.id_class(xu_3.Pq) || xc_32.id_class(xu_3.Pt);
    }
}

