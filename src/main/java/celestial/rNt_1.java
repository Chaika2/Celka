/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonPrimitive
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSyntaxException
 */
package celestial;

import celestial.iJ_2;
import celestial.id_3;
import celestial.rVL;
import celestial.rXQ;
import celestial.rpY_2;
import celestial.rqO_2;
import celestial.rzV_2;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;
import java.util.UUID;

public class rNt_1 {
    public final String id_class;
    public final iJ_2 id_break;
    public final id_3 id_byte;
    public final rzV_2 id_protected;
    public final UUID id_throws;
    public final rXQ[] id_case;

    private rNt_1(String string, iJ_2 iJ_22, id_3 id_32, rzV_2 rzV_22, rXQ[] rXQArray, UUID uUID) {
        this.id_class = string;
        this.id_break = iJ_22;
        this.id_byte = id_32;
        this.id_protected = rzV_22;
        this.id_throws = uUID;
        this.id_case = rXQArray;
    }

    private static id_3 id_class(String string) {
        int n = -1;
        switch (string.hashCode()) {
            case -1226589444: {
                if (!string.equals("addition")) break;
                n = 0;
                break;
            }
            case -78229492: {
                if (!string.equals("multiply_base")) break;
                n = 1;
                break;
            }
            case 1886894441: {
                if (!string.equals("multiply_total")) break;
                n = 2;
            }
        }
        switch (n) {
            case 0: {
                return id_3.ADDITION;
            }
            case 1: {
                return id_3.MULTIPLY_BASE;
            }
            case 2: {
                return id_3.MULTIPLY_TOTAL;
            }
        }
        throw new JsonSyntaxException("Unknown attribute modifier operation " + string);
    }

    private static String id_class(id_3 id_32) {
        switch (id_32) {
            case ADDITION: {
                return "addition";
            }
            case MULTIPLY_BASE: {
                return "multiply_base";
            }
            case MULTIPLY_TOTAL: {
                return "multiply_total";
            }
        }
        throw new IllegalArgumentException("Unknown operation " + id_32);
    }

    public static rNt_1 id_class(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
        Object object;
        rXQ[] rXQArray;
        String string = rpY_2.id_case(jsonObject, "name");
        rqO_2 rqO_22 = new rqO_2(rpY_2.id_case(jsonObject, "attribute"));
        iJ_2 iJ_22 = rVL.O.id_class(rqO_22);
        if (iJ_22 == null) {
            throw new JsonSyntaxException("Unknown attribute: " + rqO_22);
        }
        id_3 id_32 = rNt_1.id_class(rpY_2.id_case(jsonObject, "operation"));
        rzV_2 rzV_22 = rpY_2.id_class(jsonObject, "amount", jsonDeserializationContext, rzV_2.class);
        UUID uUID = null;
        if (rpY_2.id_class(jsonObject, "slot")) {
            rXQArray = new rXQ[]{rXQ.id_class(rpY_2.id_case(jsonObject, "slot"))};
        } else {
            if (!rpY_2.id_byte(jsonObject, "slot")) {
                throw new JsonSyntaxException("Invalid or missing attribute modifier slot; must be either string or array of strings.");
            }
            object = rpY_2.id_volatile(jsonObject, "slot");
            rXQArray = new rXQ[object.size()];
            int n = 0;
            for (JsonElement jsonElement : object) {
                rXQArray[n++] = rXQ.id_class(rpY_2.id_class(jsonElement, "slot"));
            }
            if (rXQArray.length == 0) {
                throw new JsonSyntaxException("Invalid attribute modifier slot; must contain at least one entry.");
            }
        }
        if (jsonObject.has("id")) {
            object = rpY_2.id_case(jsonObject, "id");
            try {
                uUID = UUID.fromString((String)object);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw new JsonSyntaxException("Invalid attribute modifier id '" + (String)object + "' (must be UUID format, with dashes)");
            }
        }
        return new rNt_1(string, iJ_22, id_32, rzV_22, rXQArray, uUID);
    }

    public JsonObject id_class(JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", this.id_class);
        jsonObject.addProperty("attribute", rVL.O.id_break(this.id_break).toString());
        jsonObject.addProperty("operation", rNt_1.id_class(this.id_byte));
        jsonObject.add("amount", jsonSerializationContext.serialize((Object)this.id_protected));
        if (this.id_throws != null) {
            jsonObject.addProperty("id", this.id_throws.toString());
        }
        if (this.id_case.length == 1) {
            jsonObject.addProperty("slot", this.id_case[0].id_protected());
        } else {
            JsonArray jsonArray = new JsonArray();
            for (rXQ rXQ2 : this.id_case) {
                jsonArray.add((JsonElement)new JsonPrimitive(rXQ2.id_protected()));
            }
            jsonObject.add("slot", (JsonElement)jsonArray);
        }
        return jsonObject;
    }
}

