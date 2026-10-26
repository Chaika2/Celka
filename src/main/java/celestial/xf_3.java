/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rHu_1;
import celestial.rJZ;
import celestial.rJr_1;
import celestial.rXe_1;
import celestial.rXu_1;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rhd_3;
import celestial.rhz_3;
import celestial.xI_2;

public class xf_3
implements rJZ {
    public final /* synthetic */ rHu_1 id_class;
    public final /* synthetic */ rHu_1 id_break;
    public final /* synthetic */ rXu_1 id_byte;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public xf_3(xI_2 xI_22, rHu_1 rHu_12, rHu_1 rHu_13, rXu_1 rXu_12) {
        this.id_class = rHu_12;
        this.id_break = rHu_13;
        this.id_byte = rXu_12;
    }

    @Override
    public rgP_2 L_() {
        if (this.id_class.Bk()) {
            return this.id_class.L_();
        }
        return this.id_break.Bk() ? this.id_break.L_() : new rgn_3("container.chestDouble");
    }

    @Override
    public rJr_1 createMenu(int n, rhz_3 rhz_32, rhd_3 rhd_32) {
        if (this.id_class.id_throws(rhd_32) && this.id_break.id_throws(rhd_32)) {
            this.id_class.id_protected(rhz_32.id_throws);
            this.id_break.id_protected(rhz_32.id_throws);
            return rXe_1.id_break(n, rhz_32, this.id_byte);
        }
        return null;
    }
}

