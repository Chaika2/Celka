/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iB_2;
import celestial.rBk_1;
import celestial.rGT;
import celestial.rGp_1;
import celestial.rqA_2;

public abstract class rGt_1
extends rBk_1 {
    protected int id_break;
    protected int id_byte;
    public final /* synthetic */ rGp_1 id_protected;

    @Override
    public void id_byte() {
        this.id_break = this.id_volatile();
        this.id_protected.id_protected = this.id_catch();
        this.id_byte = (Integer)this.id_protected.id_throws[41] + this.id_private();
        rqA_2 rqA_22 = this.id_extends();
        if (rqA_22 != null) {
            this.id_protected.id_class(rqA_22, 1.0f, 1.0f);
        }
        this.id_protected.id_class(this.id_native());
    }

    protected rGt_1(rGp_1 rGp_12) {
        this.id_protected = rGp_12;
    }

    @Override
    public boolean id_class() {
        iB_2 iB_22 = this.id_protected.I_();
        if (iB_22 != null && iB_22.BM()) {
            if (this.id_protected.sn()) {
                return false;
            }
            return (Integer)this.id_protected.id_throws[41] >= this.id_byte;
        }
        return false;
    }

    @Override
    public boolean id_break() {
        iB_2 iB_22 = this.id_protected.I_();
        return iB_22 != null && iB_22.BM() && this.id_break > 0;
    }

    @Override
    public void id_throws() {
        --this.id_break;
        if (this.id_break == 0) {
            this.id_finally();
            this.id_protected.id_class(this.id_protected.sc(), 1.0f, 1.0f);
        }
    }

    protected abstract void id_finally();

    protected abstract int id_catch();

    protected abstract rqA_2 id_extends();

    protected abstract int id_private();

    protected int id_volatile() {
        return 20;
    }

    protected abstract rGT id_native();
}

