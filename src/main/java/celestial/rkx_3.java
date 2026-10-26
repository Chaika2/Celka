/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMultimap
 *  com.google.common.collect.ImmutableMultimap$Builder
 *  com.google.common.collect.Multimap
 */
package celestial;

import celestial.QP;
import celestial.ee_3;
import celestial.iB_2;
import celestial.iJ_2;
import celestial.iQ_2;
import celestial.id_3;
import celestial.ix_3;
import celestial.rXQ;
import celestial.rYB;
import celestial.rdG_2;
import celestial.rdO_2;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rhd_3;
import celestial.rkW_2;
import celestial.rls_3;
import celestial.xc_3;
import celestial.xu_3;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;

public class rkx_3
extends rkW_2
implements ee_3 {
    private final float id_class;
    private final Multimap<iJ_2, ix_3> id_break;

    public rkx_3(rdG_2 rdG_22, int n, float f, rdO_2 rdO_22) {
        super(rdG_22, rdO_22);
        this.id_class = (float)n + rdG_22.id_byte();
        ImmutableMultimap.Builder builder = ImmutableMultimap.builder();
        builder.put((Object)iQ_2.id_case, (Object)new ix_3(id_case, "Weapon modifier", (double)this.id_class, id_3.ADDITION));
        builder.put((Object)iQ_2.id_private, (Object)new ix_3(id_catch, "Weapon modifier", (double)f, id_3.ADDITION));
        this.id_break = builder.build();
    }

    @Override
    public boolean id_class(rdn_3 rdn_32, iB_2 iB_23, iB_2 iB_24) {
        rdn_32.id_class(1, iB_24, (T iB_22) -> iB_22.id_break(rXQ.MAINHAND));
        return true;
    }

    @Override
    public boolean id_class(rdn_3 rdn_32, rYB rYB2, xc_3 xc_32, rfH_2 rfH_22, iB_2 iB_23) {
        if (xc_32.id_private(rYB2, rfH_22) != 0.0f) {
            rdn_32.id_class(2, iB_23, (T iB_22) -> iB_22.id_break(rXQ.MAINHAND));
        }
        return true;
    }

    @Override
    public Multimap<iJ_2, ix_3> id_class(rXQ rXQ2) {
        return rXQ2 == rXQ.MAINHAND ? this.id_break : super.id_class(rXQ2);
    }

    @Override
    public boolean id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, rhd_3 rhd_32) {
        return !rhd_32.id_implements();
    }

    @Override
    public float id_class(rdn_3 rdn_32, xc_3 xc_32) {
        if (xc_32.id_class(xu_3.U)) {
            return 15.0f;
        }
        QP qP = xc_32.id_byte();
        return qP != QP.id_throws && qP != QP.id_catch && qP != QP.id_strictfp && !xc_32.id_class(rls_3.id_void) && qP != QP.id_boolean ? 1.0f : 1.5f;
    }

    @Override
    public boolean id_break(xc_3 xc_32) {
        return xc_32.id_class(xu_3.U);
    }

    public float id_catch() {
        return this.id_class;
    }
}

