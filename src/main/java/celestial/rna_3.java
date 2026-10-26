/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.mojang.authlib.GameProfile
 */
package celestial;

import celestial.rCd_1;
import celestial.rCx_1;
import celestial.rne_3;
import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.io.File;

public class rna_3
extends rCx_1<GameProfile, rne_3> {
    public rna_3(File file) {
        super(file);
    }

    @Override
    protected /* synthetic */ String id_class(Object object) {
        return this.id_break((GameProfile)object);
    }

    public boolean id_class(GameProfile gameProfile) {
        rne_3 rne_32 = (rne_3)this.id_break(gameProfile);
        return rne_32 != null ? rne_32.id_break() : false;
    }

    @Override
    public String[] id_class() {
        String[] stringArray = new String[this.id_protected().size()];
        int n = 0;
        for (rCd_1 rCd_12 : this.id_protected()) {
            stringArray[n++] = ((GameProfile)rCd_12.id_case()).getName();
        }
        return stringArray;
    }

    @Override
    protected rCd_1<GameProfile> id_class(JsonObject jsonObject) {
        return new rne_3(jsonObject);
    }

    @Override
    protected String id_break(GameProfile gameProfile) {
        return gameProfile.getId().toString();
    }
}

