/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Nm_1;
import celestial.Nv_1;
import celestial.rqA_2;
import celestial.rqL_2;

public abstract class cr_3
extends Nv_1
implements Nm_1 {
    private boolean id_class;

    protected cr_3(rqA_2 rqA_22, rqL_2 rqL_22) {
        super(rqA_22, rqL_22);
    }

    @Override
    public boolean id_continue() {
        return this.id_class;
    }

    protected final void id_super() {
        this.id_class = true;
        this.id_finally = false;
    }
}

