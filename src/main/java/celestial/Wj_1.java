/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  org.apache.commons.lang3.StringUtils
 */
package celestial;

import celestial.Jq_1;
import celestial.Wf_1;
import celestial.Ww_1;
import celestial.iB_2;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rco_3;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.ryO_2;
import celestial.rys_3;
import celestial.xc_3;
import com.mojang.authlib.GameProfile;
import java.util.UUID;
import org.apache.commons.lang3.StringUtils;

public class Wj_1
extends Ww_1 {
    protected Wj_1(Jq_1 jq_1) {
        super(Wf_1.PLAYER, jq_1);
    }

    @Override
    public void id_class(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32, iB_2 iB_22, rdn_3 rdn_32) {
        super.id_class(rYB2, rfH_22, xc_32, iB_22, rdn_32);
        ryO_2 ryO_22 = rYB2.id_class(rfH_22);
        if (ryO_22 instanceof rys_3) {
            rys_3 rys_32 = (rys_3)ryO_22;
            GameProfile gameProfile = null;
            if (rdn_32.id_final()) {
                rcd_3 rcd_32 = rdn_32.id_package();
                if (rcd_32.id_byte("SkullOwner", 10)) {
                    gameProfile = rco_3.id_class(rcd_32.id_int("SkullOwner"));
                } else if (rcd_32.id_byte("SkullOwner", 8) && !StringUtils.isBlank((CharSequence)rcd_32.id_native("SkullOwner"))) {
                    gameProfile = new GameProfile((UUID)null, rcd_32.id_native("SkullOwner"));
                }
            }
            rys_32.id_class(gameProfile);
        }
    }
}

