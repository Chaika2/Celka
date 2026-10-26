/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
package celestial;

import celestial.rCr_1;
import celestial.rVv_1;
import celestial.rcd_3;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rhN_2;
import celestial.rnW_2;
import celestial.rng_3;
import celestial.rrGx_1;
import com.mojang.authlib.GameProfile;
import java.net.SocketAddress;

public class rnV_2
extends rCr_1 {
    private rcd_3 id_case;

    @Override
    public /* synthetic */ rnW_2 id_byte() {
        return this.id_break();
    }

    public rnV_2(rng_3 rng_32, rVv_1 rVv_12, rrGx_1 rrGx_12) {
        super(rng_32, rVv_12, rrGx_12, 8);
        this.id_class(10);
    }

    @Override
    public rgP_2 id_class(SocketAddress socketAddress, GameProfile gameProfile) {
        return gameProfile.getName().equalsIgnoreCase(this.id_break().id_default()) && this.id_class(gameProfile.getName()) != null ? new rgn_3("multiplayer.disconnect.name_taken") : super.id_class(socketAddress, gameProfile);
    }

    @Override
    protected void id_class(rhN_2 rhN_22) {
        if (rhN_22.g().getString().equals(this.id_break().id_default())) {
            this.id_case = rhN_22.id_case(new rcd_3());
        }
        super.id_class(rhN_22);
    }

    public rng_3 id_break() {
        return (rng_3)super.id_byte();
    }

    @Override
    public rcd_3 id_protected() {
        return this.id_case;
    }
}

