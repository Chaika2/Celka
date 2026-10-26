/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rmH_2;
import celestial.rmf_3;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rmI_2
implements ruS_2<rmH_2> {
    private rmf_3 id_class;

    public rmI_2() {
    }

    public rmI_2(rmf_3 rmf_32) {
        this.id_class = rmf_32;
    }

    @Override
    public void id_class(rmH_2 rmH_22) {
        rmH_22.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.id_class(rmf_3.class);
    }

    public rmf_3 id_break() {
        return this.id_class;
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_class(this.id_class);
    }
}

