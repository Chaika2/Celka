/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.ProfileLookupCallback
 *  com.mojang.authlib.yggdrasil.ProfileNotFoundException
 */
package celestial;

import celestial.rCE;
import celestial.rCW;
import celestial.rCX;
import celestial.rCk_1;
import celestial.rnW_2;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.ProfileLookupCallback;
import com.mojang.authlib.yggdrasil.ProfileNotFoundException;

public class rCM
implements ProfileLookupCallback {
    public final /* synthetic */ rnW_2 id_class;
    public final /* synthetic */ rCk_1 id_break;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public rCM(rnW_2 rnW_22, rCk_1 rCk_12) {
        this.id_class = rnW_22;
        this.id_break = rCk_12;
    }

    public void onProfileLookupSucceeded(GameProfile gameProfile) {
        this.id_class.F().id_class(gameProfile);
        this.id_break.id_class(new rCW(gameProfile));
    }

    public void onProfileLookupFailed(GameProfile gameProfile, Exception exception) {
        rCE.id_throws.warn("Could not lookup user whitelist entry for {}", (Object)gameProfile.getName(), (Object)exception);
        if (!(exception instanceof ProfileNotFoundException)) {
            throw new rCX("Could not request user " + gameProfile.getName() + " from backend systems", exception);
        }
    }
}

