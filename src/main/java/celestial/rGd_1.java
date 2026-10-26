/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iB_2;
import celestial.rBl_1;
import celestial.rGx_1;

public class rGd_1
extends rBl_1 {
    public final /* synthetic */ rGx_1 id_break;

    public rGd_1(rGx_1 rGx_12) {
        this.id_break = rGx_12;
        super(rGx_12, 1.0, true);
    }

    @Override
    protected double id_class(iB_2 iB_22) {
        float f = this.id_break.PN() - 0.1f;
        return f * 2.0f * f * 2.0f + iB_22.PN();
    }
}

