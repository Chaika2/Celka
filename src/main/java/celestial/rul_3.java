/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSerializer
 *  com.mojang.authlib.GameProfile
 */
package celestial;

import celestial.rpY_2;
import celestial.ruC_2;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.mojang.authlib.GameProfile;
import java.lang.reflect.Type;
import java.util.UUID;

public class rul_3
implements JsonDeserializer<ruC_2>,
JsonSerializer<ruC_2> {
    public JsonElement id_class(ruC_2 ruC_22, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("max", (Number)ruC_22.id_class());
        jsonObject.addProperty("online", (Number)ruC_22.id_break());
        if (ruC_22.id_byte() != null && ruC_22.id_byte().length > 0) {
            JsonArray jsonArray = new JsonArray();
            for (int i = 0; i < ruC_22.id_byte().length; ++i) {
                JsonObject jsonObject2 = new JsonObject();
                UUID uUID = ruC_22.id_byte()[i].getId();
                jsonObject2.addProperty("id", uUID == null ? "" : uUID.toString());
                jsonObject2.addProperty("name", ruC_22.id_byte()[i].getName());
                jsonArray.add((JsonElement)jsonObject2);
            }
            jsonObject.add("sample", (JsonElement)jsonArray);
        }
        return jsonObject;
    }

    public ruC_2 id_class(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonArray jsonArray;
        JsonObject jsonObject = rpY_2.id_private(jsonElement, "players");
        ruC_2 ruC_22 = new ruC_2(rpY_2.id_extends(jsonObject, "max"), rpY_2.id_extends(jsonObject, "online"));
        if (rpY_2.id_byte(jsonObject, "sample") && (jsonArray = rpY_2.id_volatile(jsonObject, "sample")).size() > 0) {
            GameProfile[] gameProfileArray = new GameProfile[jsonArray.size()];
            for (int i = 0; i < gameProfileArray.length; ++i) {
                JsonObject jsonObject2 = rpY_2.id_private(jsonArray.get(i), "player[" + i + "]");
                String string = rpY_2.id_case(jsonObject2, "id");
                gameProfileArray[i] = new GameProfile(UUID.fromString(string), rpY_2.id_case(jsonObject2, "name"));
            }
            ruC_22.id_class(gameProfileArray);
        }
        return ruC_22;
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        return this.id_class(jsonElement, type, jsonDeserializationContext);
    }

    public /* synthetic */ JsonElement serialize(Object object, Type type, JsonSerializationContext jsonSerializationContext) {
        return this.id_class((ruC_2)object, type, jsonSerializationContext);
    }
}

