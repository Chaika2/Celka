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
import celestial.rCX;
import celestial.rnW_2;
import celestial.rna_3;
import celestial.rne_3;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.ProfileLookupCallback;
import com.mojang.authlib.yggdrasil.ProfileNotFoundException;

public class rCb_1
implements ProfileLookupCallback {
    public final /* synthetic */ rnW_2 id_class;
    public final /* synthetic */ rna_3 id_break;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public rCb_1(rnW_2 rnW_22, rna_3 rna_32) {
        this.id_class = rnW_22;
        this.id_break = rna_32;
    }

    public void onProfileLookupSucceeded(GameProfile gameProfile) {
        this.id_class.F().id_class(gameProfile);
        this.id_break.id_class(new rne_3(gameProfile, this.id_class.id_new(), false));
    }

    public void onProfileLookupFailed(GameProfile gameProfile, Exception exception) {
        rCE.id_throws.warn("Could not lookup oplist entry for {}", (Object)gameProfile.getName(), (Object)exception);
        if (!(exception instanceof ProfileNotFoundException)) {
            throw new rCX("Could not request user " + gameProfile.getName() + " from backend systems", exception);
        }
    }
}

