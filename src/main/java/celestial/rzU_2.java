/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rWR;
import celestial.rfU_2;
import celestial.rzY_2;

public abstract class rzU_2
implements rWR {
    public final /* synthetic */ rzY_2 id_break;

    protected rzU_2(rzY_2 rzY_22) {
        this.id_break = rzY_22;
    }

    @Override
    public int id_class(float f) {
        return Math.max(rfU_2.id_protected((float)this.id_break.id_protected + (float)this.id_break.id_throws * f), 0);
    }
}

