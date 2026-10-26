/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.ProfileLookupCallback
 */
package celestial;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.ProfileLookupCallback;
import java.util.concurrent.atomic.AtomicReference;

public class rCS
implements ProfileLookupCallback {
    public final /* synthetic */ AtomicReference id_class;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public rCS(AtomicReference atomicReference) {
        this.id_class = atomicReference;
    }

    public void onProfileLookupSucceeded(GameProfile gameProfile) {
        this.id_class.set(gameProfile);
    }

    public void onProfileLookupFailed(GameProfile gameProfile, Exception exception) {
        this.id_class.set(null);
    }
}

