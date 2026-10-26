/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rJZ;
import celestial.rJr_1;
import celestial.rRK;
import celestial.rXu_1;
import celestial.rcd_3;
import celestial.rgB_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rhd_3;
import celestial.rhz_3;
import celestial.rpA_2;
import celestial.rqL_2;
import celestial.rqn_3;
import celestial.ryO_2;
import celestial.ryW_2;
import celestial.xc_3;

public abstract class rHD
extends ryO_2
implements rJZ,
rXu_1,
rpA_2 {
    private rRK id_class = rRK.id_class;
    private rgP_2 id_break;

    protected rHD(ryW_2<?> ryW_22) {
        super(ryW_22);
    }

    public void id_class(rgP_2 rgP_22) {
        this.id_break = rgP_22;
    }

    protected abstract rJr_1 id_class(int var1, rhz_3 var2);

    public static boolean id_class(rhd_3 rhd_32, rRK rRK2, rgP_2 rgP_22) {
        if (!rhd_32.id_native() && !rRK2.id_class(rhd_32.ss())) {
            rhd_32.id_class((rgP_2)new rgn_3("container.isLocked", rgP_22), true);
            rhd_32.id_class(rqn_3.rw, rqL_2.BLOCKS, 1.0f, 1.0f);
            return false;
        }
        return true;
    }

    @Override
    public rcd_3 id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        this.id_class.id_class(rcd_32);
        if (this.id_break != null) {
            rcd_32.id_class("CustomName", rgB_2.id_class(this.id_break));
        }
        return rcd_32;
    }

    @Override
    public void id_class(xc_3 xc_32, rcd_3 rcd_32) {
        super.id_class(xc_32, rcd_32);
        this.id_class = rRK.id_break(rcd_32);
        if (rcd_32.id_byte("CustomName", 8)) {
            this.id_break = rgB_2.id_class(rcd_32.id_native("CustomName"));
        }
    }

    @Override
    public rgP_2 g() {
        return this.id_break != null ? this.id_break : this.X_();
    }

    public boolean id_throws(rhd_3 rhd_32) {
        return rHD.id_class(rhd_32, this.id_class, this.L_());
    }

    @Override
    public rgP_2 rD() {
        return this.id_break;
    }

    @Override
    public rgP_2 L_() {
        return this.g();
    }

    @Override
    public rJr_1 createMenu(int n, rhz_3 rhz_32, rhd_3 rhd_32) {
        return this.id_throws(rhd_32) ? this.id_class(n, rhz_32) : null;
    }

    protected abstract rgP_2 X_();
}

