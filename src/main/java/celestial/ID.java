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

import celestial.IK;
import celestial.If_1;
import celestial.rpY_2;
import celestial.rqO_2;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class ID
implements JsonDeserializer<IK> {
    protected int id_byte(JsonObject jsonObject) {
        int n = rpY_2.id_class(jsonObject, "weight", 1);
        if (n < 1) {
            throw new JsonParseException("Invalid weight " + n + " found, expected integer >= 1");
        }
        return n;
    }

    protected If_1 id_class(JsonObject jsonObject) {
        int n;
        int n2 = rpY_2.id_class(jsonObject, "x", 0);
        If_1 if_1 = If_1.id_class(n2, n = rpY_2.id_class(jsonObject, "y", 0));
        if (if_1 == null) {
            throw new JsonParseException("Invalid BlockModelRotation x: " + n2 + ", y: " + n);
        }
        return if_1;
    }

    public IK id_class(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        rqO_2 rqO_22 = this.id_break(jsonObject);
        If_1 if_1 = this.id_class(jsonObject);
        boolean bl = this.id_protected(jsonObject);
        int n = this.id_byte(jsonObject);
        return new IK(rqO_22, if_1.id_class(), bl, n);
    }

    protected rqO_2 id_break(JsonObject jsonObject) {
        return new rqO_2(rpY_2.id_case(jsonObject, "model"));
    }

    private boolean id_protected(JsonObject jsonObject) {
        return rpY_2.id_class(jsonObject, "uvlock", false);
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        return this.id_class(jsonElement, type, jsonDeserializationContext);
    }
}

