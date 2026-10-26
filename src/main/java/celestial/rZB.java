/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rkw_3;
import celestial.rmH_2;
import celestial.rqO_2;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rZB
implements ruS_2<rmH_2> {
    private rqO_2 id_class;

    public rZB() {
    }

    public rZB(rkw_3<?> rkw_32) {
        this.id_class = rkw_32.id_case();
    }

    @Override
    public void id_class(rmH_2 rmH_22) {
        rmH_22.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.id_volatile();
    }

    public rqO_2 id_break() {
        return this.id_class;
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_class(this.id_class);
    }
}

