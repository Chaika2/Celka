/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMultimap
 *  com.google.common.collect.ImmutableMultimap$Builder
 *  com.google.common.collect.Multimap
 */
package celestial;

import celestial.eA_2;
import celestial.ee_3;
import celestial.iB_2;
import celestial.iG_2;
import celestial.iJ_2;
import celestial.iQ_2;
import celestial.id_3;
import celestial.ix_3;
import celestial.rXQ;
import celestial.rYB;
import celestial.rdO_2;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rhD_2;
import celestial.rhZ_2;
import celestial.rhd_3;
import celestial.rhx_3;
import celestial.rhz_3;
import celestial.rjU_2;
import celestial.rkc_3;
import celestial.rlB_2;
import celestial.rpm_3;
import celestial.rqA_2;
import celestial.rqL_2;
import celestial.rqn_3;
import celestial.rym_3;
import celestial.xc_3;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;

public class rkN_2
extends rdb_3
implements ee_3 {
    private final Multimap<iJ_2, ix_3> id_class;

    @Override
    public rkc_3 id_byte(rdn_3 rdn_32) {
        return rkc_3.SPEAR;
    }

    public rkN_2(rdO_2 rdO_22) {
        super(rdO_22);
        ImmutableMultimap.Builder builder = ImmutableMultimap.builder();
        builder.put((Object)iQ_2.id_case, (Object)new ix_3(id_case, "Tool modifier", 8.0, id_3.ADDITION));
        builder.put((Object)iQ_2.id_private, (Object)new ix_3(id_catch, "Tool modifier", (double)-2.9f, id_3.ADDITION));
        this.id_class = builder.build();
    }

    @Override
    public boolean id_class(rdn_3 rdn_32, iB_2 iB_23, iB_2 iB_24) {
        rdn_32.id_class(1, iB_24, (T iB_22) -> iB_22.id_break(rXQ.MAINHAND));
        return true;
    }

    @Override
    public boolean id_class(rdn_3 rdn_32, rYB rYB2, xc_3 xc_32, rfH_2 rfH_22, iB_2 iB_23) {
        if ((double)xc_32.id_private(rYB2, rfH_22) != 0.0) {
            rdn_32.id_class(2, iB_23, (T iB_22) -> iB_22.id_break(rXQ.MAINHAND));
        }
        return true;
    }

    @Override
    public Multimap<iJ_2, ix_3> id_class(rXQ rXQ2) {
        return rXQ2 == rXQ.MAINHAND ? this.id_class : super.id_class(rXQ2);
    }

    @Override
    public boolean id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, rhd_3 rhd_32) {
        return !rhd_32.id_implements();
    }

    @Override
    public void id_class(rdn_3 rdn_32, rYB rYB2, iB_2 iB_22, int n) {
        if (iB_22 instanceof rhd_3) {
            int n2;
            rhd_3 rhd_33 = (rhd_3)iB_22;
            int n3 = this.id_break(rdn_32) - n;
            if (n3 >= 10 && ((n2 = eA_2.id_catch(rdn_32)) <= 0 || rhd_33.Pf())) {
                if (!rYB2.id_continue) {
                    rdn_32.id_class(1, rhd_33, (T rhd_32) -> rhd_32.id_byte(iB_22.P()));
                    if (n2 == 0) {
                        rhD_2 rhD_22 = new rhD_2(rYB2, (iB_2)rhd_33, rdn_32);
                        rhD_22.id_class(rhd_33, ((Float)rhd_33.id_throws[16]).floatValue(), ((Float)rhd_33.id_throws[15]).floatValue(), 0.0f, 2.5f + (float)n2 * 0.5f, 1.0f);
                        if (((rhx_3)rhd_33.id_implements[18]).id_protected) {
                            rhD_22.id_protected = rhZ_2.CREATIVE_ONLY;
                        }
                        rYB2.a_(rhD_22);
                        rYB2.id_class((rhd_3)null, rhD_22, rqn_3.dk, rqL_2.PLAYERS, 1.0f, 1.0f);
                        if (!((rhx_3)rhd_33.id_implements[18]).id_protected) {
                            ((rhz_3)rhd_33.id_implements[1]).id_catch(rdn_32);
                        }
                    }
                }
                rhd_33.id_class(rlB_2.id_byte.id_break(this));
                if (n2 > 0) {
                    float f = ((Float)rhd_33.id_throws[15]).floatValue();
                    float f2 = ((Float)rhd_33.id_throws[16]).floatValue();
                    float f3 = -rfU_2.id_class(f * ((float)Math.PI / 180)) * rfU_2.id_break(f2 * ((float)Math.PI / 180));
                    float f4 = -rfU_2.id_class(f2 * ((float)Math.PI / 180));
                    float f5 = rfU_2.id_break(f * ((float)Math.PI / 180)) * rfU_2.id_break(f2 * ((float)Math.PI / 180));
                    float f6 = rfU_2.id_byte(f3 * f3 + f4 * f4 + f5 * f5);
                    float f7 = 3.0f * ((1.0f + (float)n2) / 4.0f);
                    rhd_33.id_implements(f3 *= f7 / f6, f4 *= f7 / f6, f5 *= f7 / f6);
                    rhd_33.id_volatile(20);
                    if (rhd_33.BL()) {
                        float f8 = 1.1999999f;
                        rhd_33.id_class(iG_2.SELF, new rjU_2(0.0, 1.1999999284744263, 0.0));
                    }
                    rqA_2 rqA_22 = n2 >= 3 ? rqn_3.dd : (n2 == 2 ? rqn_3.dx : rqn_3.dJ);
                    rYB2.id_class((rhd_3)null, rhd_33, rqA_22, rqL_2.PLAYERS, 1.0f, 1.0f);
                }
            }
        }
    }

    @Override
    public rym_3<rdn_3> id_class(rYB rYB2, rhd_3 rhd_32, rpm_3 rpm_32) {
        rdn_3 rdn_32 = rhd_32.id_protected(rpm_32);
        if (rdn_32.id_catch() >= rdn_32.id_private() - 1) {
            return rym_3.id_protected(rdn_32);
        }
        if (eA_2.id_catch(rdn_32) > 0 && !rhd_32.Pf()) {
            return rym_3.id_protected(rdn_32);
        }
        rhd_32.id_break(rpm_32);
        return rym_3.id_break(rdn_32);
    }

    @Override
    public int id_break(rdn_3 rdn_32) {
        return 72000;
    }

    @Override
    public int id_protected() {
        return 1;
    }
}

