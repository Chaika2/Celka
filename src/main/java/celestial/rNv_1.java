/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.mojang.authlib.GameProfile
 */
package celestial;

import celestial.an_3;
import celestial.rNl_1;
import celestial.rQz_1;
import celestial.rcd_3;
import celestial.rco_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rhd_3;
import celestial.rzB_2;
import celestial.rzO_2;
import celestial.rzd_3;
import celestial.rzr_3;
import celestial.rzx_3;
import com.google.common.collect.ImmutableSet;
import com.mojang.authlib.GameProfile;
import java.util.Set;

public class rNv_1
extends rzO_2 {
    public final rzB_2 id_break;

    public rNv_1(rQz_1[] rQz_1Array, rzB_2 rzB_22) {
        super(rQz_1Array);
        this.id_break = rzB_22;
    }

    @Override
    public Set<rzd_3<?>> id_class() {
        return ImmutableSet.of(this.id_break.id_class());
    }

    @Override
    public rzx_3 id_break() {
        return rNl_1.id_this;
    }

    @Override
    public rdn_3 id_break(rdn_3 rdn_32, rzr_3 rzr_32) {
        an_3 an_32;
        if (rdn_32.id_break() == rdy_3.dJ && (an_32 = rzr_32.id_break(this.id_break.id_class())) instanceof rhd_3) {
            GameProfile gameProfile = ((rhd_3)an_32).sv();
            rdn_32.id_int().id_class("SkullOwner", rco_3.id_class(new rcd_3(), gameProfile));
        }
        return rdn_32;
    }
}

