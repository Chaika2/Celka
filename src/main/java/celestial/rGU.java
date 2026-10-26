/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iB_2;
import celestial.rBl_1;
import celestial.rGD;
import celestial.rGx_1;

public class rGU
extends rBl_1 {
    public rGU(rGD rGD2, rGD rGD3) {
        super(rGD3, 1.0, false);
    }

    @Override
    protected double id_class(iB_2 iB_22) {
        if (this.id_class.ra() instanceof rGx_1) {
            float f = this.id_class.ra().PN() - 0.1f;
            return f * 2.0f * f * 2.0f + iB_22.PN();
        }
        return super.id_class(iB_22);
    }
}

