/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aa_3;
import celestial.an_3;
import celestial.iB_2;
import celestial.is_3;
import celestial.rBW;
import celestial.rBk_1;
import celestial.rEi_1;
import celestial.rdy_3;
import celestial.rhj_3;
import celestial.rxQ_2;
import java.util.EnumSet;

public class rBa_1<T extends rEi_1>
extends rBk_1 {
    private final T id_class;
    private final double id_break;
    private int id_byte;
    private final float id_protected;
    private int id_throws = -1;
    private int id_case;
    private boolean id_catch;
    private boolean id_private;
    private int id_implements = -1;

    @Override
    public void id_byte() {
        super.id_byte();
        ((is_3)this.id_class).id_case(true);
    }

    public rBa_1(T t, double d, int n, float f) {
        this.id_class = t;
        this.id_break = d;
        this.id_byte = n;
        this.id_protected = f * f;
        this.id_class(EnumSet.of(rBW.MOVE, rBW.LOOK));
    }

    @Override
    public boolean id_class() {
        return ((is_3)this.id_class).I_() == null ? false : this.id_catch();
    }

    public void id_class(int n) {
        this.id_byte = n;
    }

    @Override
    public boolean id_break() {
        return (this.id_class() || !((is_3)this.id_class).id_public().id_native()) && this.id_catch();
    }

    @Override
    public void id_throws() {
        iB_2 iB_22 = ((is_3)this.id_class).I_();
        if (iB_22 != null) {
            boolean bl;
            double d = ((an_3)this.id_class).id_class(iB_22.rx(), iB_22.re(), iB_22.BO());
            boolean bl2 = ((is_3)this.id_class).id_goto().id_class(iB_22);
            boolean bl3 = bl = this.id_case > 0;
            if (bl2 != bl) {
                this.id_case = 0;
            }
            this.id_case = bl2 ? ++this.id_case : --this.id_case;
            if (!(d > (double)this.id_protected) && this.id_case >= 20) {
                ((is_3)this.id_class).id_public().id_final();
                ++this.id_implements;
            } else {
                ((is_3)this.id_class).id_public().id_class((an_3)iB_22, this.id_break);
                this.id_implements = -1;
            }
            if (this.id_implements >= 20) {
                if ((double)((iB_2)this.id_class).Sa().nextFloat() < 0.3) {
                    boolean bl4 = this.id_catch = !this.id_catch;
                }
                if ((double)((iB_2)this.id_class).Sa().nextFloat() < 0.3) {
                    this.id_private = !this.id_private;
                }
                this.id_implements = 0;
            }
            if (this.id_implements > -1) {
                if (d > (double)(this.id_protected * 0.75f)) {
                    this.id_private = false;
                } else if (d < (double)(this.id_protected * 0.25f)) {
                    this.id_private = true;
                }
                ((is_3)this.id_class).id_super().id_class(this.id_private ? -0.5f : 0.5f, this.id_catch ? 0.5f : -0.5f);
                ((is_3)this.id_class).id_class((an_3)iB_22, 30.0f, 30.0f);
            } else {
                ((is_3)this.id_class).id_continue().id_class(iB_22, 30.0f, 30.0f);
            }
            if (((iB_2)this.id_class).id_return()) {
                int n;
                if (!bl2 && this.id_case < -60) {
                    ((iB_2)this.id_class).id_throw();
                } else if (bl2 && (n = ((iB_2)this.id_class).SU()) >= 20) {
                    ((iB_2)this.id_class).id_throw();
                    ((aa_3)this.id_class).id_break(iB_22, rxQ_2.id_class(n));
                    this.id_throws = this.id_byte;
                }
            } else if (--this.id_throws <= 0 && this.id_case >= -60) {
                ((iB_2)this.id_class).id_break(rhj_3.id_class(this.id_class, rdy_3.OM));
            }
        }
    }

    protected boolean id_catch() {
        return ((iB_2)this.id_class).id_class(rdy_3.OM);
    }

    @Override
    public void id_protected() {
        super.id_protected();
        ((is_3)this.id_class).id_case(false);
        this.id_case = 0;
        this.id_throws = -1;
        ((iB_2)this.id_class).id_throw();
    }
}

