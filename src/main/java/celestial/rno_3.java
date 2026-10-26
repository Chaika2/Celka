/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.mojang.authlib.GameProfile
 */
package celestial;

import celestial.rCJ;
import celestial.rCd_1;
import celestial.rCx_1;
import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.io.File;

public class rno_3
extends rCx_1<GameProfile, rCJ> {
    public rno_3(File file) {
        super(file);
    }

    @Override
    protected /* synthetic */ String id_class(Object object) {
        return this.id_break((GameProfile)object);
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

    public boolean id_class(GameProfile gameProfile) {
        return this.id_protected(gameProfile);
    }

    @Override
    protected rCd_1<GameProfile> id_class(JsonObject jsonObject) {
        return new rCJ(jsonObject);
    }

    @Override
    protected String id_break(GameProfile gameProfile) {
        return gameProfile.getId().toString();
    }
}

