/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.OT;
import celestial.rZu_1;
import celestial.rmH_2;
import celestial.rqO_2;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rZc_1
implements ruS_2<rmH_2> {
    private rZu_1 id_class;
    private rqO_2 id_break;

    public rZu_1 id_byte() {
        return this.id_class;
    }

    public rZc_1() {
    }

    public rZc_1(rZu_1 rZu_12, rqO_2 rqO_22) {
        this.id_class = rZu_12;
        this.id_break = rqO_22;
    }

    @Override
    public void id_class(rmH_2 rmH_22) {
        rmH_22.id_class(this);
    }

    public static rZc_1 id_class(OT oT) {
        return new rZc_1(rZu_1.OPENED_TAB, oT.id_private());
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.id_class(rZu_1.class);
        if (this.id_class == rZu_1.OPENED_TAB) {
            this.id_break = ruu_32.id_volatile();
        }
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_class(this.id_class);
        if (this.id_class == rZu_1.OPENED_TAB) {
            ruu_32.id_class(this.id_break);
        }
    }

    public static rZc_1 id_break() {
        return new rZc_1(rZu_1.CLOSED_SCREEN, null);
    }

    public rqO_2 id_protected() {
        return this.id_break;
    }
}

