/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.mojang.authlib.GameProfile
 */
package celestial;

import celestial.rCd_1;
import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class rCW
extends rCd_1<GameProfile> {
    public rCW(GameProfile gameProfile) {
        super(gameProfile);
    }

    public rCW(JsonObject jsonObject) {
        super(rCW.id_break(jsonObject));
    }

    @Override
    protected void id_class(JsonObject jsonObject) {
        if (this.id_case() != null) {
            jsonObject.addProperty("uuid", ((GameProfile)this.id_case()).getId() == null ? "" : ((GameProfile)this.id_case()).getId().toString());
            jsonObject.addProperty("name", ((GameProfile)this.id_case()).getName());
        }
    }

    private static GameProfile id_break(JsonObject jsonObject) {
        if (jsonObject.has("uuid") && jsonObject.has("name")) {
            UUID uUID;
            String string = jsonObject.get("uuid").getAsString();
            try {
                uUID = UUID.fromString(string);
            }
            catch (Throwable throwable) {
                return null;
            }
            return new GameProfile(uUID, jsonObject.get("name").getAsString());
        }
        return null;
    }
}

