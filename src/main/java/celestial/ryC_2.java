/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iB_2;
import celestial.rVi_1;
import celestial.rgH_2;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgl_3;
import celestial.rgn_3;
import celestial.rgp_3;
import celestial.rgv_3;
import celestial.rgy_3;
import celestial.rye_3;

public class ryC_2
extends rye_3 {
    protected ryC_2() {
        super("badRespawnPoint");
        this.id_continue();
        this.id_throws();
    }

    @Override
    public rgP_2 id_class(iB_2 iB_22) {
        rVi_1 rVi_12 = rgv_3.id_class(new rgn_3("death.attack.badRespawnPoint.link")).id_class(rgc_32 -> rgc_32.id_class(new rgl_3(rgH_2.OPEN_URL, "https://bugs.mojang.com/browse/MCPE-28723")).id_class(new rgy_3(rgp_3.id_class, new rgN_2("MCPE-28723"))));
        return new rgn_3("death.attack.badRespawnPoint.message", iB_22.L_(), rVi_12);
    }
}

