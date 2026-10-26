/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rRo_1;
import celestial.rfH_2;
import celestial.rfj_3;
import celestial.rjh_3;
import celestial.roH_2;
import celestial.rol_3;
import celestial.rrsH_2;
import celestial.rrsT_2;
import celestial.rrsV_2;
import celestial.rrso_3;
import celestial.rrsq_3;
import celestial.rrst_3;

public class rrse_3
implements rrsq_3 {
    private final rrsV_2<?, ?> id_class;
    private final rrsV_2<?, ?> id_break;

    public rrse_3(rol_3 rol_32, boolean bl, boolean bl2) {
        this.id_class = bl ? new rrsH_2(rol_32) : null;
        this.id_break = bl2 ? new rrso_3(rol_32) : null;
    }

    public rrsT_2 id_class(rRo_1 rRo_12) {
        if (rRo_12 == rRo_1.BLOCK) {
            return this.id_class == null ? rrst_3.INSTANCE : this.id_class;
        }
        return this.id_break == null ? rrst_3.INSTANCE : this.id_break;
    }

    public void id_class(rfj_3 rfj_32, boolean bl) {
        if (this.id_class != null) {
            this.id_class.id_class(rfj_32, bl);
        }
        if (this.id_break != null) {
            this.id_break.id_class(rfj_32, bl);
        }
    }

    @Override
    public void id_class(rjh_3 rjh_32, boolean bl) {
        if (this.id_class != null) {
            this.id_class.id_class(rjh_32, bl);
        }
        if (this.id_break != null) {
            this.id_break.id_class(rjh_32, bl);
        }
    }

    public String id_class(rRo_1 rRo_12, rjh_3 rjh_32) {
        if (rRo_12 == rRo_1.BLOCK) {
            if (this.id_class != null) {
                return this.id_class.id_break(rjh_32.id_continue());
            }
        } else if (this.id_break != null) {
            return this.id_break.id_break(rjh_32.id_continue());
        }
        return "n/a";
    }

    public void id_class(rRo_1 rRo_12, rjh_3 rjh_32, roH_2 roH_22, boolean bl) {
        if (rRo_12 == rRo_1.BLOCK) {
            if (this.id_class != null) {
                this.id_class.id_class(rjh_32.id_continue(), roH_22, bl);
            }
        } else if (this.id_break != null) {
            this.id_break.id_class(rjh_32.id_continue(), roH_22, bl);
        }
    }

    public void id_class(rfH_2 rfH_22) {
        if (this.id_class != null) {
            this.id_class.id_break(rfH_22);
        }
        if (this.id_break != null) {
            this.id_break.id_break(rfH_22);
        }
    }

    public void id_class(rfH_2 rfH_22, int n) {
        if (this.id_class != null) {
            this.id_class.id_class(rfH_22, n);
        }
    }

    public boolean id_class() {
        if (this.id_break != null && this.id_break.id_class()) {
            return true;
        }
        return this.id_class != null && this.id_class.id_class();
    }

    public int id_class(int n, boolean bl, boolean bl2) {
        if (this.id_class != null && this.id_break != null) {
            int n2 = n / 2;
            int n3 = this.id_class.id_class(n2, bl, bl2);
            int n4 = n - n2 + n3;
            int n5 = this.id_break.id_class(n4, bl, bl2);
            return n3 == 0 && n5 > 0 ? this.id_class.id_class(n5, bl, bl2) : n5;
        }
        if (this.id_class != null) {
            return this.id_class.id_class(n, bl, bl2);
        }
        return this.id_break != null ? this.id_break.id_class(n, bl, bl2) : n;
    }

    public int id_break(rfH_2 rfH_22, int n) {
        int n2 = this.id_break == null ? 0 : this.id_break.id_class(rfH_22) - n;
        int n3 = this.id_class == null ? 0 : this.id_class.id_class(rfH_22);
        return Math.max(n3, n2);
    }

    public void id_break(rfj_3 rfj_32, boolean bl) {
        if (this.id_class != null) {
            this.id_class.id_break(rfj_32, bl);
        }
        if (this.id_break != null) {
            this.id_break.id_break(rfj_32, bl);
        }
    }
}

