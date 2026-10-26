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
import celestial.rnv_3;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.ProfileLookupCallback;
import com.mojang.authlib.yggdrasil.ProfileNotFoundException;
import java.io.File;
import java.util.UUID;

public class rCh_1
implements ProfileLookupCallback {
    public final /* synthetic */ rnv_3 id_class;
    public final /* synthetic */ File id_break;
    public final /* synthetic */ File id_byte;
    public final /* synthetic */ File id_protected;
    public final /* synthetic */ String[] id_throws;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public rCh_1(rnv_3 rnv_32, File file, File file2, File file3, String[] stringArray) {
        this.id_class = rnv_32;
        this.id_break = file;
        this.id_byte = file2;
        this.id_protected = file3;
        this.id_throws = stringArray;
    }

    private void id_class(File file, String string, String string2) {
        File file2 = new File(this.id_protected, string + ".dat");
        File file3 = new File(file, string2 + ".dat");
        rCE.id_class(file);
        if (!file2.renameTo(file3)) {
            throw new rCX("Could not convert file for " + string);
        }
    }

    private String id_class(GameProfile gameProfile) {
        String string = null;
        for (String string2 : this.id_throws) {
            if (string2 == null || !string2.equalsIgnoreCase(gameProfile.getName())) continue;
            string = string2;
            break;
        }
        if (string == null) {
            throw new rCX("Could not find the filename for " + gameProfile.getName() + " anymore");
        }
        return string;
    }

    public void onProfileLookupSucceeded(GameProfile gameProfile) {
        this.id_class.F().id_class(gameProfile);
        UUID uUID = gameProfile.getId();
        if (uUID == null) {
            throw new rCX("Missing UUID for user profile " + gameProfile.getName());
        }
        this.id_class(this.id_break, this.id_class(gameProfile), uUID.toString());
    }

    public void onProfileLookupFailed(GameProfile gameProfile, Exception exception) {
        rCE.id_throws.warn("Could not lookup user uuid for {}", (Object)gameProfile.getName(), (Object)exception);
        if (!(exception instanceof ProfileNotFoundException)) {
            throw new rCX("Could not request user " + gameProfile.getName() + " from backend systems", exception);
        }
        String string = this.id_class(gameProfile);
        this.id_class(this.id_byte, string, string);
    }
}

