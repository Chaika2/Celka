/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.FP;
import celestial.cq_3;
import celestial.rrbb_3;
import celestial.rrdZ;
import celestial.vV_2;
import celestial.yX_2;

public class rrJr_1
extends FP {
    private static final String id_throws = "/reloadShaders";
    private static final String id_case = "/reloadChunks";

    public rrJr_1(FP fP) {
        super(vV_2.id_class(fP));
    }

    private boolean id_class(String string) {
        if (string == null) {
            return false;
        }
        if ((string = string.trim()).equals(id_throws)) {
            if (rrbb_3.rs()) {
                rrdZ.id_while();
                rrdZ.id_byte();
            }
            return true;
        }
        if (string.equals(id_case)) {
            ((yX_2)this.id_volatile.id_class[8]).id_throws();
            return true;
        }
        return false;
    }

    @Override
    public void id_break(String string) {
        if (this.id_class(string)) {
            ((cq_3)this.id_volatile.id_class[19]).id_throws().id_class(string);
        } else {
            super.id_break(string);
        }
    }
}

