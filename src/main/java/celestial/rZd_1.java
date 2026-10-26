/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rmH_2;
import celestial.rpm_3;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rZd_1
implements ruS_2<rmH_2> {
    private rpm_3 id_class;

    public rZd_1() {
    }

    public rZd_1(rpm_3 rpm_32) {
        this.id_class = rpm_32;
    }

    @Override
    public void id_class(rmH_2 rmH_22) {
        rmH_22.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.id_class(rpm_3.class);
    }

    public rpm_3 id_break() {
        return this.id_class;
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_class(this.id_class);
    }
}

