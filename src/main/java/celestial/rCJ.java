/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.mojang.authlib.GameProfile
 */
package celestial;

import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rnY_2;
import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;

public class rCJ
extends rnY_2<GameProfile> {
    public rCJ(JsonObject jsonObject) {
        super(rCJ.id_break(jsonObject), jsonObject);
    }

    public rCJ(GameProfile gameProfile, Date date, String string, Date date2, String string2) {
        super(gameProfile, date, string, date2, string2);
    }

    public rCJ(GameProfile gameProfile) {
        this(gameProfile, (Date)null, (String)null, (Date)null, (String)null);
    }

    @Override
    protected void id_class(JsonObject jsonObject) {
        if (this.id_case() != null) {
            jsonObject.addProperty("uuid", ((GameProfile)this.id_case()).getId() == null ? "" : ((GameProfile)this.id_case()).getId().toString());
            jsonObject.addProperty("name", ((GameProfile)this.id_case()).getName());
            super.id_class(jsonObject);
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

    @Override
    public rgP_2 id_protected() {
        GameProfile gameProfile = (GameProfile)this.id_case();
        return new rgN_2(gameProfile.getName() != null ? gameProfile.getName() : Objects.toString(gameProfile.getId(), "(Unknown)"));
    }
}

