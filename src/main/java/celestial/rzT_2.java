/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSerializer
 *  com.google.gson.JsonSyntaxException
 *  com.mojang.datafixers.util.Pair
 */
package celestial;

import celestial.rVL;
import celestial.rpY_2;
import celestial.rqO_2;
import celestial.rzH_2;
import celestial.rzp_3;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonSyntaxException;
import com.mojang.datafixers.util.Pair;
import java.lang.reflect.Type;
import java.util.function.Function;

public class rzT_2<E, T extends rzH_2<E>>
implements JsonDeserializer<E>,
JsonSerializer<E> {
    private final rVL<T> id_class;
    private final String id_break;
    private final String id_byte;
    private final Function<E, T> id_protected;
    private final Pair<T, rzp_3<? extends E>> id_throws;

    public rzT_2(rVL<T> rVL2, String string, String string2, Function<E, T> function, Pair<T, rzp_3<? extends E>> pair) {
        this.id_class = rVL2;
        this.id_break = string;
        this.id_byte = string2;
        this.id_protected = function;
        this.id_throws = pair;
    }

    public E deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        if (jsonElement.isJsonObject()) {
            JsonObject jsonObject = rpY_2.id_private(jsonElement, this.id_break);
            rqO_2 rqO_22 = new rqO_2(rpY_2.id_case(jsonObject, this.id_byte));
            rzH_2 rzH_22 = (rzH_2)this.id_class.id_class(rqO_22);
            if (rzH_22 == null) {
                throw new JsonSyntaxException("Unknown type '" + rqO_22 + "'");
            }
            return (E)rzH_22.id_class().id_class(jsonObject, jsonDeserializationContext);
        }
        if (this.id_throws == null) {
            throw new UnsupportedOperationException("Object " + jsonElement + " can't be deserialized");
        }
        return (E)((rzp_3)this.id_throws.getSecond()).id_class(jsonElement, jsonDeserializationContext);
    }

    public JsonElement serialize(E e, Type type, JsonSerializationContext jsonSerializationContext) {
        rzH_2 rzH_22 = (rzH_2)this.id_protected.apply(e);
        if (this.id_throws != null && this.id_throws.getFirst() == rzH_22) {
            return ((rzp_3)this.id_throws.getSecond()).id_class(e, jsonSerializationContext);
        }
        if (rzH_22 == null) {
            throw new JsonSyntaxException("Unknown type: " + e);
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(this.id_byte, this.id_class.id_break(rzH_22).toString());
        rzH_22.id_class().id_class(jsonObject, e, jsonSerializationContext);
        return jsonObject;
    }
}

