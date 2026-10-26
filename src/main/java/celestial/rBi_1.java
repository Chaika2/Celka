/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aY_2;
import celestial.aa_3;
import celestial.an_3;
import celestial.iB_2;
import celestial.is_3;
import celestial.rBW;
import celestial.rBk_1;
import celestial.rEi_1;
import celestial.rSr_1;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rhj_3;
import celestial.rqb_3;
import celestial.rxm_3;
import java.util.EnumSet;

public class rBi_1<T extends rEi_1 & aY_2>
extends rBk_1 {
    public static final rqb_3 id_class = new rqb_3(20, 40);
    private final T id_break;
    private rSr_1 id_byte = rSr_1.UNCHARGED;
    private final double id_protected;
    private final float id_throws;
    private int id_case;
    private int id_catch;
    private int id_private;

    public rBi_1(T t, double d, float f) {
        this.id_break = t;
        this.id_protected = d;
        this.id_throws = f * f;
        this.id_class(EnumSet.of(rBW.MOVE, rBW.LOOK));
    }

    @Override
    public boolean id_class() {
        return this.id_private() && this.id_catch();
    }

    @Override
    public boolean id_break() {
        return this.id_private() && (this.id_class() || !((is_3)this.id_break).id_public().id_native()) && this.id_catch();
    }

    @Override
    public void id_throws() {
        iB_2 iB_22 = ((is_3)this.id_break).I_();
        if (iB_22 != null) {
            boolean bl;
            boolean bl2;
            boolean bl3 = ((is_3)this.id_break).id_goto().id_class(iB_22);
            boolean bl4 = bl2 = this.id_case > 0;
            if (bl3 != bl2) {
                this.id_case = 0;
            }
            this.id_case = bl3 ? ++this.id_case : --this.id_case;
            double d = ((an_3)this.id_break).id_int(iB_22);
            boolean bl5 = bl = (d > (double)this.id_throws || this.id_case < 5) && this.id_catch == 0;
            if (bl) {
                --this.id_private;
                if (this.id_private <= 0) {
                    ((is_3)this.id_break).id_public().id_class((an_3)iB_22, this.id_finally() ? this.id_protected : this.id_protected * 0.5);
                    this.id_private = id_class.id_class(((iB_2)this.id_break).Sa());
                }
            } else {
                this.id_private = 0;
                ((is_3)this.id_break).id_public().id_final();
            }
            ((is_3)this.id_break).id_continue().id_class(iB_22, 30.0f, 30.0f);
            if (this.id_byte == rSr_1.UNCHARGED) {
                if (!bl) {
                    ((iB_2)this.id_break).id_break(rhj_3.id_class(this.id_break, rdy_3.kU));
                    this.id_byte = rSr_1.CHARGING;
                    ((aY_2)this.id_break).id_break(true);
                }
            } else if (this.id_byte == rSr_1.CHARGING) {
                rdn_3 rdn_32;
                int n;
                if (!((iB_2)this.id_break).id_return()) {
                    this.id_byte = rSr_1.UNCHARGED;
                }
                if ((n = ((iB_2)this.id_break).SU()) >= rxm_3.id_private(rdn_32 = ((iB_2)this.id_break).sX())) {
                    ((iB_2)this.id_break).SC();
                    this.id_byte = rSr_1.CHARGED;
                    this.id_catch = 20 + ((iB_2)this.id_break).Sa().nextInt(20);
                    ((aY_2)this.id_break).id_break(false);
                }
            } else if (this.id_byte == rSr_1.CHARGED) {
                --this.id_catch;
                if (this.id_catch == 0) {
                    this.id_byte = rSr_1.READY_TO_ATTACK;
                }
            } else if (this.id_byte == rSr_1.READY_TO_ATTACK && bl3) {
                ((aa_3)this.id_break).id_break(iB_22, 1.0f);
                rdn_3 rdn_33 = ((iB_2)this.id_break).id_protected(rhj_3.id_class(this.id_break, rdy_3.kU));
                rxm_3.id_class(rdn_33, false);
                this.id_byte = rSr_1.UNCHARGED;
            }
        }
    }

    private boolean id_finally() {
        return this.id_byte == rSr_1.UNCHARGED;
    }

    private boolean id_catch() {
        return ((iB_2)this.id_break).id_class(rdy_3.kU);
    }

    @Override
    public void id_protected() {
        super.id_protected();
        ((is_3)this.id_break).id_case(false);
        ((is_3)this.id_break).id_byte((iB_2)null);
        this.id_case = 0;
        if (((iB_2)this.id_break).id_return()) {
            ((iB_2)this.id_break).id_throw();
            ((aY_2)this.id_break).id_break(false);
            rxm_3.id_class(((iB_2)this.id_break).sX(), false);
        }
    }

    private boolean id_private() {
        return ((is_3)this.id_break).I_() != null && ((is_3)this.id_break).I_().BM();
    }
}

