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
import celestial.rCJ;
import celestial.rCX;
import celestial.rnW_2;
import celestial.rno_3;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.ProfileLookupCallback;
import com.mojang.authlib.yggdrasil.ProfileNotFoundException;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

public class rCG
implements ProfileLookupCallback {
    public final /* synthetic */ rnW_2 id_class;
    public final /* synthetic */ Map id_break;
    public final /* synthetic */ rno_3 id_byte;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public rCG(rnW_2 rnW_22, Map map, rno_3 rno_32) {
        this.id_class = rnW_22;
        this.id_break = map;
        this.id_byte = rno_32;
    }

    public void onProfileLookupSucceeded(GameProfile gameProfile) {
        this.id_class.F().id_class(gameProfile);
        String[] stringArray = (String[])this.id_break.get(gameProfile.getName().toLowerCase(Locale.ROOT));
        if (stringArray == null) {
            rCE.id_throws.warn("Could not convert user banlist entry for {}", (Object)gameProfile.getName());
            throw new rCX("Profile not in the conversionlist");
        }
        Date date = stringArray.length > 1 ? rCE.id_class(stringArray[1], (Date)null) : null;
        String string = stringArray.length > 2 ? stringArray[2] : null;
        Date date2 = stringArray.length > 3 ? rCE.id_class(stringArray[3], (Date)null) : null;
        String string2 = stringArray.length > 4 ? stringArray[4] : null;
        this.id_byte.id_class(new rCJ(gameProfile, date, string, date2, string2));
    }

    public void onProfileLookupFailed(GameProfile gameProfile, Exception exception) {
        rCE.id_throws.warn("Could not lookup user banlist entry for {}", (Object)gameProfile.getName(), (Object)exception);
        if (!(exception instanceof ProfileNotFoundException)) {
            throw new rCX("Could not request user " + gameProfile.getName() + " from backend systems", exception);
        }
    }
}

