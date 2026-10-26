/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  org.apache.commons.lang3.StringUtils
 */
package celestial;

import celestial.rcd_3;
import celestial.rco_3;
import celestial.rdO_2;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rku_3;
import celestial.rys_3;
import celestial.xd_3;
import com.mojang.authlib.GameProfile;
import java.util.UUID;
import org.apache.commons.lang3.StringUtils;

public class rkG_2
extends rku_3 {
    public rkG_2(xd_3 xd_32, xd_3 xd_33, rdO_2 rdO_22) {
        super(xd_32, xd_33, rdO_22);
    }

    @Override
    public boolean id_break(rcd_3 rcd_32) {
        super.id_break(rcd_32);
        if (rcd_32.id_byte("SkullOwner", 8) && !StringUtils.isBlank((CharSequence)rcd_32.id_native("SkullOwner"))) {
            GameProfile gameProfile = new GameProfile((UUID)null, rcd_32.id_native("SkullOwner"));
            gameProfile = rys_3.id_break(gameProfile);
            rcd_32.id_class("SkullOwner", rco_3.id_class(new rcd_3(), gameProfile));
            return true;
        }
        return false;
    }

    @Override
    public rgP_2 id_implements(rdn_3 rdn_32) {
        if (rdn_32.id_break() == rdy_3.dJ && rdn_32.id_final()) {
            rcd_3 rcd_32;
            String string = null;
            rcd_3 rcd_33 = rdn_32.id_package();
            if (rcd_33.id_byte("SkullOwner", 8)) {
                string = rcd_33.id_native("SkullOwner");
            } else if (rcd_33.id_byte("SkullOwner", 10) && (rcd_32 = rcd_33.id_int("SkullOwner")).id_byte("Name", 8)) {
                string = rcd_32.id_native("Name");
            }
            if (string != null) {
                return new rgn_3(this.id_break() + ".named", string);
            }
        }
        return super.id_implements(rdn_32);
    }
}

