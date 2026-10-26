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

public class rne_3
extends rCd_1<GameProfile> {
    private final int id_class;
    private final boolean id_break;

    public rne_3(GameProfile gameProfile, int n, boolean bl) {
        super(gameProfile);
        this.id_class = n;
        this.id_break = bl;
    }

    public rne_3(JsonObject jsonObject) {
        super(rne_3.id_break(jsonObject));
        this.id_class = jsonObject.has("level") ? jsonObject.get("level").getAsInt() : 0;
        this.id_break = jsonObject.has("bypassesPlayerLimit") && jsonObject.get("bypassesPlayerLimit").getAsBoolean();
    }

    @Override
    protected void id_class(JsonObject jsonObject) {
        if (this.id_case() != null) {
            jsonObject.addProperty("uuid", ((GameProfile)this.id_case()).getId() == null ? "" : ((GameProfile)this.id_case()).getId().toString());
            jsonObject.addProperty("name", ((GameProfile)this.id_case()).getName());
            jsonObject.addProperty("level", (Number)this.id_class);
            jsonObject.addProperty("bypassesPlayerLimit", Boolean.valueOf(this.id_break));
        }
    }

    public int id_class() {
        return this.id_class;
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

    public boolean id_break() {
        return this.id_break;
    }
}

