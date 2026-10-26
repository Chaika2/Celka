/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.an_3;
import celestial.iB_2;
import celestial.iJ_2;
import celestial.ic_3;
import celestial.id_3;
import celestial.ik_3;
import celestial.ix_3;
import celestial.rLD;
import celestial.rLo_1;
import celestial.rVL;
import celestial.rYB;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rhd_3;
import celestial.rqR_2;
import celestial.rye_3;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.UUID;

public class rLR {
    private final Map<iJ_2, ix_3> id_class = Maps.newHashMap();
    private final rLo_1 id_break;
    private final int id_byte;
    private String id_protected;

    public String id_byte() {
        return this.id_break();
    }

    protected rLR(rLo_1 rLo_12, int n) {
        this.id_break = rLo_12;
        this.id_byte = n;
    }

    public boolean id_class() {
        return false;
    }

    public static rLR id_class(int n) {
        return (rLR)rVL.id_const.id_class(n);
    }

    public double id_class(int n, ix_3 ix_32) {
        return ix_32.id_protected() * (double)(n + 1);
    }

    public rLR id_class(iJ_2 iJ_22, String string, double d, id_3 id_32) {
        ix_3 ix_32 = new ix_3(UUID.fromString(string), this::id_byte, d, id_32);
        this.id_class.put(iJ_22, ix_32);
        return this;
    }

    public void id_class(iB_2 iB_22, ik_3 ik_32, int n) {
        for (Map.Entry<iJ_2, ix_3> entry : this.id_class.entrySet()) {
            ic_3 ic_32 = ik_32.id_class(entry.getKey());
            if (ic_32 == null) continue;
            ic_32.id_protected(entry.getValue());
        }
    }

    public void id_class(iB_2 iB_22, int n) {
        if (this == rLD.id_finally) {
            if (iB_22.Ss() < iB_22.SK()) {
                iB_22.id_protected(1.0f);
            }
        } else if (this == rLD.id_super) {
            if (iB_22.Ss() > 1.0f) {
                iB_22.id_break(rye_3.id_package, 1.0f);
            }
        } else if (this == rLD.id_this) {
            iB_22.id_break(rye_3.id_int, 1.0f);
        } else if (this == rLD.id_new && iB_22 instanceof rhd_3) {
            ((rhd_3)iB_22).id_while(0.005f * (float)(n + 1));
        } else if (this == rLD.id_return && iB_22 instanceof rhd_3) {
            if (!((rYB)iB_22.id_throws[7]).id_continue) {
                ((rhd_3)iB_22).sk().id_class(n + 1, 1.0f);
            }
        } else if (!(this == rLD.id_case && !iB_22.BR() || this == rLD.id_catch && iB_22.BR())) {
            if (this == rLD.id_catch && !iB_22.BR() || this == rLD.id_case && iB_22.BR()) {
                iB_22.id_break(rye_3.id_package, (float)(6 << n));
            }
        } else {
            iB_22.id_protected((float)Math.max(4 << n, 0));
        }
    }

    public void id_class(an_3 an_32, an_3 an_33, iB_2 iB_22, int n, double d) {
        if (!(this == rLD.id_case && !iB_22.BR() || this == rLD.id_catch && iB_22.BR())) {
            if (this == rLD.id_catch && !iB_22.BR() || this == rLD.id_case && iB_22.BR()) {
                int n2 = (int)(d * (double)(6 << n) + 0.5);
                if (an_32 == null) {
                    iB_22.id_break(rye_3.id_package, (float)n2);
                } else {
                    iB_22.id_break(rye_3.id_byte(an_32, an_33), (float)n2);
                }
            } else {
                this.id_class(iB_22, n);
            }
        } else {
            int n3 = (int)(d * (double)(4 << n) + 0.5);
            iB_22.id_protected((float)n3);
        }
    }

    public boolean id_class(int n, int n2) {
        if (this == rLD.id_finally) {
            int n3 = 50 >> n2;
            if (n3 > 0) {
                return n % n3 == 0;
            }
            return true;
        }
        if (this == rLD.id_super) {
            int n4 = 25 >> n2;
            if (n4 > 0) {
                return n % n4 == 0;
            }
            return true;
        }
        if (this == rLD.id_this) {
            int n5 = 40 >> n2;
            if (n5 > 0) {
                return n % n5 == 0;
            }
            return true;
        }
        return this == rLD.id_new;
    }

    public static int id_class(rLR rLR2) {
        return rVL.id_const.id_class(rLR2);
    }

    public void id_break(iB_2 iB_22, ik_3 ik_32, int n) {
        for (Map.Entry<iJ_2, ix_3> entry : this.id_class.entrySet()) {
            ic_3 ic_32 = ik_32.id_class(entry.getKey());
            if (ic_32 == null) continue;
            ix_3 ix_32 = entry.getValue();
            ic_32.id_protected(ix_32);
            ic_32.id_byte(new ix_3(ix_32.id_class(), this.id_byte() + " " + n, this.id_class(n, ix_32), ix_32.id_byte()));
        }
    }

    protected String id_break() {
        if (this.id_protected == null) {
            this.id_protected = rqR_2.id_class("effect", rVL.id_const.id_break(this));
        }
        return this.id_protected;
    }

    public rLo_1 id_throws() {
        return this.id_break;
    }

    public Map<iJ_2, ix_3> id_catch() {
        return this.id_class;
    }

    public int id_case() {
        return this.id_byte;
    }

    public boolean id_implements() {
        return this.id_break == rLo_1.HARMFUL;
    }

    public rgP_2 id_protected() {
        return new rgn_3(this.id_byte());
    }

    public boolean id_private() {
        return this.id_break == rLo_1.BENEFICIAL;
    }
}

