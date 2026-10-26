/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rdn_3;
import celestial.rkt_3;
import celestial.rqO_2;

public abstract class rWN
implements rkt_3 {
    private final rqO_2 id_class;

    @Override
    public rdn_3 id_byte() {
        return rdn_3.id_break;
    }

    public rWN(rqO_2 rqO_22) {
        this.id_class = rqO_22;
    }

    @Override
    public rqO_2 id_case() {
        return this.id_class;
    }

    @Override
    public boolean id_implements() {
        return true;
    }
}

