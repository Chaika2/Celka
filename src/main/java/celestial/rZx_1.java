/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rff_3;
import celestial.rmH_2;
import celestial.rpm_3;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rZx_1
implements ruS_2<rmH_2> {
    private rff_3 id_class;
    private rpm_3 id_break;

    public rff_3 id_byte() {
        return this.id_class;
    }

    public rZx_1() {
    }

    public rZx_1(rpm_3 rpm_32, rff_3 rff_32) {
        this.id_break = rpm_32;
        this.id_class = rff_32;
    }

    @Override
    public void id_class(rmH_2 rmH_22) {
        rmH_22.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_break = ruu_32.id_class(rpm_3.class);
        this.id_class = ruu_32.id_package();
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_class(this.id_break);
        ruu_32.id_class(this.id_class);
    }

    public rpm_3 id_break() {
        return this.id_break;
    }
}

