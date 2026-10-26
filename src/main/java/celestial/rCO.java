/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.ProfileLookupCallback
 */
package celestial;

import celestial.rCE;
import celestial.rnW_2;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.ProfileLookupCallback;
import java.util.List;

public class rCO
implements ProfileLookupCallback {
    public final /* synthetic */ rnW_2 id_class;
    public final /* synthetic */ List id_break;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public rCO(rnW_2 rnW_22, List list) {
        this.id_class = rnW_22;
        this.id_break = list;
    }

    public void onProfileLookupSucceeded(GameProfile gameProfile) {
        this.id_class.F().id_class(gameProfile);
        this.id_break.add(gameProfile);
    }

    public void onProfileLookupFailed(GameProfile gameProfile, Exception exception) {
        rCE.id_throws.warn("Could not lookup user whitelist entry for {}", (Object)gameProfile.getName(), (Object)exception);
    }
}

