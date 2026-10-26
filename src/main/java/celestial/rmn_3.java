/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
package celestial;

import celestial.AH;
import celestial.rqV_2;
import celestial.ruS_2;
import celestial.ruu_3;
import com.mojang.authlib.GameProfile;
import java.io.IOException;
import java.util.UUID;

public class rmn_3
implements ruS_2<AH> {
    private GameProfile id_class;

    public rmn_3() {
    }

    public rmn_3(GameProfile gameProfile) {
        this.id_class = gameProfile;
    }

    @Override
    public void id_class(AH aH) {
        aH.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        int[] nArray = new int[4];
        for (int i = 0; i < nArray.length; ++i) {
            nArray[i] = ruu_32.readInt();
        }
        UUID uUID = rqV_2.id_class(nArray);
        String string = ruu_32.id_throws(16);
        this.id_class = new GameProfile(uUID, string);
    }

    public GameProfile id_break() {
        return this.id_class;
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        for (int n : rqV_2.id_class(this.id_class.getId())) {
            ruu_32.writeInt(n);
        }
        ruu_32.id_class(this.id_class.getName());
    }
}

