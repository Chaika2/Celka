/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Maps
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
import celestial.xu_3;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;

public class rxi_3
extends rkQ_2 {
    private static final Set<xd_3> id_byte = ImmutableSet.of((Object)xu_3.bg, (Object)xu_3.XN, (Object)xu_3.Ey, (Object)xu_3.Oh, (Object)xu_3.Jb, (Object)xu_3.Xn, (Object[])new xd_3[]{xu_3.N, xu_3.c, xu_3.W, xu_3.x, xu_3.d, xu_3.Q, xu_3.z, xu_3.k});
    protected static final Map<xd_3, xc_3> id_class = Maps.newHashMap((Map)ImmutableMap.of((Object)xu_3.id_implements, (Object)xu_3.PS.id_continue(), (Object)xu_3.bt, (Object)xu_3.PS.id_continue(), (Object)xu_3.id_finally, (Object)xu_3.PS.id_continue(), (Object)xu_3.id_extends, (Object)xu_3.id_finally.id_continue()));

    protected rxi_3(rdG_2 rdG_22, int n, float f, rdO_2 rdO_22) {
        super(n, f, rdG_22, id_byte, rdO_22);
    }

    @Override
    public ryZ_2 id_class(rdH_2 rdH_22) {
        xc_3 xc_32;
        rYB rYB2 = rdH_22.id_int();
        rfH_2 rfH_22 = rdH_22.id_class();
        if (rdH_22.id_finally() != rpr_3.DOWN && rYB2.id_byte(rfH_22.id_final()).id_catch() && (xc_32 = id_class.get(rYB2.id_byte(rfH_22).id_break())) != null) {
            rhd_3 rhd_33 = rdH_22.id_final();
            rYB2.id_class(rhd_33, rfH_22, rqn_3.sy, rqL_2.BLOCKS, 1.0f, 1.0f);
            if (!rYB2.id_continue) {
                rYB2.id_class(rfH_22, xc_32, 11);
                if (rhd_33 != null) {
                    rdH_22.id_volatile().id_class(1, rhd_33, (T rhd_32) -> rhd_32.id_byte(rdH_22.id_package()));
                }
            }
            return ryZ_2.id_class(rYB2.id_continue);
        }
        return ryZ_2.PASS;
    }
}

