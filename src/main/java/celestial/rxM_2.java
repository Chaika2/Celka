/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.google.common.collect.Sets
 */
package celestial;

import celestial.QP;
import celestial.WL;
import celestial.rYB;
import celestial.rdG_2;
import celestial.rdH_2;
import celestial.rdO_2;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rhd_3;
import celestial.rkQ_2;
import celestial.rqL_2;
import celestial.rqn_3;
import celestial.ryZ_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Set;

public class rxM_2
extends rkQ_2 {
    private static final Set<QP> id_byte = Sets.newHashSet((Object[])new QP[]{QP.id_goto, QP.id_while, QP.id_throws, QP.id_catch, QP.id_instanceof, QP.id_boolean});
    private static final Set<xd_3> id_protected = Sets.newHashSet((Object[])new xd_3[]{xu_3.PJ, xu_3.hU, xu_3.sB, xu_3.sS, xu_3.ss, xu_3.sE, xu_3.sb, xu_3.sG, xu_3.XU, xu_3.Xe});
    protected static final Map<xd_3, xd_3> id_class = new ImmutableMap.Builder().put((Object)xu_3.P, (Object)xu_3.b).put((Object)xu_3.id_static, (Object)xu_3.r).put((Object)xu_3.G, (Object)xu_3.J).put((Object)xu_3.id_strictfp, (Object)xu_3.id_switch).put((Object)xu_3.E, (Object)xu_3.X).put((Object)xu_3.id_const, (Object)xu_3.id_double).put((Object)xu_3.S, (Object)xu_3.O).put((Object)xu_3.id_short, (Object)xu_3.id_transient).put((Object)xu_3.s, (Object)xu_3.h).put((Object)xu_3.id_default, (Object)xu_3.id_for).put((Object)xu_3.B, (Object)xu_3.M).put((Object)xu_3.id_import, (Object)xu_3.id_boolean).put((Object)xu_3.Xx, (Object)xu_3.Xd).put((Object)xu_3.Xk, (Object)xu_3.XW).put((Object)xu_3.Xm, (Object)xu_3.XZ).put((Object)xu_3.Xv, (Object)xu_3.XF).build();

    protected rxM_2(rdG_2 rdG_22, float f, float f2, rdO_2 rdO_22) {
        super(f, f2, rdG_22, id_protected, rdO_22);
    }

    @Override
    public float id_class(rdn_3 rdn_32, xc_3 xc_32) {
        QP qP = xc_32.id_byte();
        return id_byte.contains(qP) ? this.id_break : super.id_class(rdn_32, xc_32);
    }

    @Override
    public ryZ_2 id_class(rdH_2 rdH_22) {
        rfH_2 rfH_22;
        rYB rYB2 = rdH_22.id_int();
        xc_3 xc_32 = rYB2.id_byte(rfH_22 = rdH_22.id_class());
        xd_3 xd_32 = id_class.get(xc_32.id_break());
        if (xd_32 != null) {
            rhd_3 rhd_33 = rdH_22.id_final();
            rYB2.id_class(rhd_33, rfH_22, rqn_3.E, rqL_2.BLOCKS, 1.0f, 1.0f);
            if (!rYB2.id_continue) {
                rYB2.id_class(rfH_22, (xc_3)xd_32.id_continue().id_class(WL.id_new, xc_32.id_byte(WL.id_new)), 11);
                if (rhd_33 != null) {
                    rdH_22.id_volatile().id_class(1, rhd_33, (T rhd_32) -> rhd_32.id_byte(rdH_22.id_package()));
                }
            }
            return ryZ_2.id_class(rYB2.id_continue);
        }
        return ryZ_2.PASS;
    }
}

