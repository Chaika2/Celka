/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.NW;
import celestial.cb_3;
import celestial.rYB;
import celestial.rqn_3;
import celestial.xc_3;
import celestial.xu_3;
import celestial.xv_3;

public class Nh_1
implements NW {
    private final cb_3 id_class;
    private boolean id_break;
    private boolean id_byte = true;

    public Nh_1(cb_3 cb_32) {
        this.id_class = cb_32;
    }

    @Override
    public void id_break() {
        rYB rYB2 = (rYB)this.id_class.id_throws[7];
        xc_3 xc_33 = rYB2.id_byte(this.id_class.rN().id_byte(0.0, -0.4f, 0.0).id_break(0.001)).filter(xc_32 -> xc_32.id_class(xu_3.hM)).findFirst().orElse(null);
        if (xc_33 != null) {
            if (!this.id_break && !this.id_byte && xc_33.id_class(xu_3.hM) && !this.id_class.id_native()) {
                boolean bl = xc_33.id_byte(xv_3.id_volatile);
                if (bl) {
                    this.id_class.id_class(rqn_3.rd, 1.0f, 1.0f);
                } else {
                    this.id_class.id_class(rqn_3.rJ, 1.0f, 1.0f);
                }
            }
            this.id_break = true;
        } else {
            this.id_break = false;
        }
        this.id_byte = false;
    }
}

