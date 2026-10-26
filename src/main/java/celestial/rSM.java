/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.ay_3;
import celestial.iB_2;
import celestial.iQ_2;
import celestial.is_3;
import celestial.rBk_1;
import celestial.rLC;
import celestial.rLq_1;
import celestial.rfU_2;
import celestial.rhd_3;
import celestial.rhx_3;
import celestial.rnM_2;

public abstract class rSM
extends rBk_1 {
    protected final is_3 id_throws;
    protected final boolean id_case;
    private final boolean id_class;
    private int id_break;
    private int id_byte;
    private int id_protected;
    protected iB_2 id_catch;
    protected int id_private = 60;

    @Override
    public void id_byte() {
        this.id_break = 0;
        this.id_byte = 0;
        this.id_protected = 0;
    }

    public rSM(is_3 is_32, boolean bl) {
        this(is_32, bl, false);
    }

    public rSM(is_3 is_32, boolean bl, boolean bl2) {
        this.id_throws = is_32;
        this.id_case = bl;
        this.id_class = bl2;
    }

    protected boolean id_class(iB_2 iB_22, ay_3 ay_32) {
        if (iB_22 == null) {
            return false;
        }
        if (!ay_32.id_class(this.id_throws, iB_22)) {
            return false;
        }
        if (!this.id_throws.id_private(iB_22.Bs())) {
            return false;
        }
        if (this.id_class) {
            if (--this.id_byte <= 0) {
                this.id_break = 0;
            }
            if (this.id_break == 0) {
                int n = this.id_break = this.id_class(iB_22) ? 1 : 2;
            }
            if (this.id_break == 2) {
                return false;
            }
        }
        return true;
    }

    public rSM id_class(int n) {
        this.id_private = n;
        return this;
    }

    private boolean id_class(iB_2 iB_22) {
        int n;
        this.id_byte = 10 + this.id_throws.Sa().nextInt(5);
        rLC rLC2 = this.id_throws.id_public().id_class((an_3)iB_22, 0);
        if (rLC2 == null) {
            return false;
        }
        rLq_1 rLq_12 = rLC2.id_protected();
        if (rLq_12 == null) {
            return false;
        }
        int n2 = rLq_12.id_class - rfU_2.id_byte(iB_22.rx());
        return (double)(n2 * n2 + (n = rLq_12.id_byte - rfU_2.id_byte(iB_22.BO())) * n) <= 2.25;
    }

    @Override
    public boolean id_break() {
        iB_2 iB_22 = this.id_throws.I_();
        if (iB_22 == null) {
            iB_22 = this.id_catch;
        }
        if (iB_22 == null) {
            return false;
        }
        if (!iB_22.BM()) {
            return false;
        }
        rnM_2 rnM_22 = this.id_throws.BG();
        rnM_2 rnM_23 = iB_22.BG();
        if (rnM_22 != null && rnM_23 == rnM_22) {
            return false;
        }
        double d = this.id_extends();
        if (this.id_throws.id_int(iB_22) > d * d) {
            return false;
        }
        if (this.id_case) {
            if (this.id_throws.id_goto().id_class(iB_22)) {
                this.id_protected = 0;
            } else if (++this.id_protected > this.id_private) {
                return false;
            }
        }
        if (iB_22 instanceof rhd_3 && ((rhx_3)((rhd_3)iB_22).id_implements[18]).id_class) {
            return false;
        }
        this.id_throws.id_byte(iB_22);
        return true;
    }

    protected double id_extends() {
        return this.id_throws.id_class(iQ_2.id_break);
    }

    @Override
    public void id_protected() {
        this.id_throws.id_byte((iB_2)null);
        this.id_catch = null;
    }
}

