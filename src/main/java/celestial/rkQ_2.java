/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMultimap
 *  com.google.common.collect.ImmutableMultimap$Builder
 *  com.google.common.collect.Multimap
 */
package celestial;

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
import celestial.rkW_2;
import celestial.xc_3;
import celestial.xd_3;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import java.util.Set;

public class rkQ_2
extends rkW_2
implements ee_3 {
    private final Set<xd_3> id_class;
    protected final float id_break;
    private final float id_byte;
    private final Multimap<iJ_2, ix_3> id_protected;

    protected rkQ_2(float f, float f2, rdG_2 rdG_22, Set<xd_3> set, rdO_2 rdO_22) {
        super(rdG_22, rdO_22);
        this.id_class = set;
        this.id_break = rdG_22.id_break();
        this.id_byte = f + rdG_22.id_byte();
        ImmutableMultimap.Builder builder = ImmutableMultimap.builder();
        builder.put((Object)iQ_2.id_case, (Object)new ix_3(id_case, "Tool modifier", (double)this.id_byte, id_3.ADDITION));
        builder.put((Object)iQ_2.id_private, (Object)new ix_3(id_catch, "Tool modifier", (double)f2, id_3.ADDITION));
        this.id_protected = builder.build();
    }

    @Override
    public boolean id_class(rdn_3 rdn_32, rYB rYB2, xc_3 xc_32, rfH_2 rfH_22, iB_2 iB_23) {
        if (!rYB2.id_continue && xc_32.id_private(rYB2, rfH_22) != 0.0f) {
            rdn_32.id_class(1, iB_23, (T iB_22) -> iB_22.id_break(rXQ.MAINHAND));
        }
        return true;
    }

    @Override
    public Multimap<iJ_2, ix_3> id_class(rXQ rXQ2) {
        return rXQ2 == rXQ.MAINHAND ? this.id_protected : super.id_class(rXQ2);
    }

    @Override
    public float id_class(rdn_3 rdn_32, xc_3 xc_32) {
        return this.id_class.contains(xc_32.id_break()) ? this.id_break : 1.0f;
    }

    @Override
    public boolean id_class(rdn_3 rdn_32, iB_2 iB_23, iB_2 iB_24) {
        rdn_32.id_class(2, iB_24, (T iB_22) -> iB_22.id_break(rXQ.MAINHAND));
        return true;
    }

    public float id_catch() {
        return this.id_byte;
    }
}

