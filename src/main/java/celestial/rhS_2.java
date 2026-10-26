/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rBc_1;
import celestial.rhP_2;

public class rhS_2
extends rBc_1 {
    public rhS_2(rhP_2 rhP_22) {
        super(rhP_22, new Class[0]);
    }

    @Override
    public boolean id_break() {
        if (this.id_throws instanceof rhP_2) {
            rhP_2 rhP_22 = (rhP_2)this.id_throws;
            if (rhP_22.id_char) {
                rhP_22.id_try(false);
                return false;
            }
        }
        return super.id_break();
    }
}

