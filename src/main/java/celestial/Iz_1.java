/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 */
package celestial;

import celestial.IL;
import celestial.Ik_1;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class Iz_1
implements JsonDeserializer<Ik_1> {
    protected Iz_1() {
    }

    private IL id_class(JsonDeserializationContext jsonDeserializationContext, JsonObject jsonObject, String string) {
        return jsonObject.has(string) ? (IL)jsonDeserializationContext.deserialize(jsonObject.get(string), IL.class) : IL.id_class;
    }

    public Ik_1 id_class(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        IL iL = this.id_class(jsonDeserializationContext, jsonObject, "thirdperson_righthand");
        IL iL2 = this.id_class(jsonDeserializationContext, jsonObject, "thirdperson_lefthand");
        if (iL2 == IL.id_class) {
            iL2 = iL;
        }
        IL iL3 = this.id_class(jsonDeserializationContext, jsonObject, "firstperson_righthand");
        IL iL4 = this.id_class(jsonDeserializationContext, jsonObject, "firstperson_lefthand");
        if (iL4 == IL.id_class) {
            iL4 = iL3;
        }
        IL iL5 = this.id_class(jsonDeserializationContext, jsonObject, "head");
        IL iL6 = this.id_class(jsonDeserializationContext, jsonObject, "gui");
        IL iL7 = this.id_class(jsonDeserializationContext, jsonObject, "ground");
        IL iL8 = this.id_class(jsonDeserializationContext, jsonObject, "fixed");
        return new Ik_1(iL2, iL, iL4, iL3, iL5, iL6, iL7, iL8);
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        return this.id_class(jsonElement, type, jsonDeserializationContext);
    }
}

