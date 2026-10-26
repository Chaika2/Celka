/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iB_2;
import celestial.rBl_1;
import celestial.rMi_1;

public class rOP
extends rBl_1 {
    public rOP(rMi_1 rMi_12) {
        super(rMi_12, 1.4, true);
    }

    @Override
    protected double id_class(iB_2 iB_22) {
        return 4.0f + iB_22.PN();
    }
}

