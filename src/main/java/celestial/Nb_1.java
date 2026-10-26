/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.QY;
import celestial.an_3;
import celestial.cr_3;
import celestial.rbF_2;
import celestial.rfU_2;
import celestial.rqA_2;
import celestial.rqL_2;

public abstract class Nb_1
extends cr_3 {
    protected final rbF_2 id_class;
    private boolean id_package;

    @Override
    public void id_byte() {
        boolean bl = this.id_break();
        if (bl && !this.id_continue()) {
            QY.id_instanceof().c().id_class(this.id_class());
            this.id_package = true;
        }
        if (!((Boolean)this.id_class.id_throws[27]).booleanValue() && !this.id_package) {
            this.id_catch = (float)this.id_class.rx();
            this.id_private = (float)this.id_class.re();
            this.id_implements = (float)this.id_class.BO();
            float f = rfU_2.id_class(an_3.id_case(this.id_class.rv()));
            if ((double)f >= 0.01) {
                this.id_case = rfU_2.id_catch(rfU_2.id_class(f, this.id_this(), this.id_else()), this.id_this(), this.id_else());
                this.id_throws = rfU_2.id_catch(rfU_2.id_class(f, 0.0f, 0.5f), 0.0f, 1.2f);
            } else {
                this.id_case = 0.0f;
                this.id_throws = 0.0f;
            }
        } else {
            this.id_super();
        }
    }

    public Nb_1(rbF_2 rbF_22, rqA_2 rqA_22, rqL_2 rqL_22) {
        super(rqA_22, rqL_22);
        this.id_class = rbF_22;
        this.id_catch = (float)rbF_22.rx();
        this.id_private = (float)rbF_22.re();
        this.id_implements = (float)rbF_22.BO();
        this.id_finally = true;
        this.id_extends = 0;
        this.id_throws = 0.0f;
    }

    private float id_this() {
        return this.id_class.n_() ? 1.1f : 0.7f;
    }

    protected abstract cr_3 id_class();

    protected abstract boolean id_break();

    @Override
    public boolean id_throws() {
        return !this.id_class.BF();
    }

    private float id_else() {
        return this.id_class.n_() ? 1.5f : 1.1f;
    }

    @Override
    public boolean id_protected() {
        return true;
    }
}

