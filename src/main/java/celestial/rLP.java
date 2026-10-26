/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rLB;
import celestial.rLG;
import celestial.rLS;
import celestial.rLb_1;
import celestial.rLr_1;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rnW_2;
import celestial.rud_3;

public class rLP
implements rLr_1 {
    private static final rgP_2 id_class = new rgn_3("multiplayer.status.request_handled");
    private final rnW_2 id_break;
    private final rud_3 id_byte;
    private boolean id_protected;

    public rLP(rnW_2 rnW_22, rud_3 rud_32) {
        this.id_break = rnW_22;
        this.id_byte = rud_32;
    }

    @Override
    public void id_class(rLS rLS2) {
        if (this.id_protected) {
            this.id_byte.id_class(id_class);
        } else {
            this.id_protected = true;
            this.id_byte.id_class(new rLb_1(this.id_break.L()));
        }
    }

    @Override
    public void id_class(rLB rLB2) {
        this.id_byte.id_class(new rLG(rLB2.id_break()));
        this.id_byte.id_class(id_class);
    }

    @Override
    public void id_class(rgP_2 rgP_22, rgP_2 rgP_23) {
    }

    @Override
    public rud_3 id_class() {
        return this.id_byte;
    }
}

