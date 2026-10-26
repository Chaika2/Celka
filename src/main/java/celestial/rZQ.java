/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rZN;
import celestial.rmH_2;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rZQ
implements ruS_2<rmH_2> {
    private rZN id_class;

    public rZQ() {
    }

    public rZQ(rZN rZN2) {
        this.id_class = rZN2;
    }

    @Override
    public void id_class(rZN rZN2) {
        this.id_class = rZN2;
    }

    @Override
    public void id_class(rmH_2 rmH_22) {
        rmH_22.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.id_class(rZN.class);
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_class(this.id_class);
    }

    public rZN id_break() {
        return this.id_class;
    }
}

