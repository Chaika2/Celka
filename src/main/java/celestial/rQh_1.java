/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSyntaxException
 */
package celestial;

import celestial.JS;
import celestial.rQM;
import celestial.rVL;
import celestial.rWY;
import celestial.rpY_2;
import celestial.rqO_2;
import celestial.xd_3;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;

public class rQh_1
implements rWY<rQM> {
    @Override
    public /* synthetic */ Object id_class(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
        return this.id_break(jsonObject, jsonDeserializationContext);
    }

    @Override
    public void id_class(JsonObject jsonObject, rQM rQM2, JsonSerializationContext jsonSerializationContext) {
        jsonObject.addProperty("block", rVL.id_strictfp.id_break(rQM2.id_class).toString());
        jsonObject.add("properties", rQM2.id_break.id_class());
    }

    public rQM id_break(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
        rqO_2 rqO_22 = new rqO_2(rpY_2.id_case(jsonObject, "block"));
        xd_3 xd_32 = rVL.id_strictfp.id_break(rqO_22).orElseThrow(() -> new IllegalArgumentException("Can't find block " + rqO_22));
        JS jS = JS.id_class(jsonObject.get("properties"));
        jS.id_class(xd_32.id_new(), (String string) -> {
            throw new JsonSyntaxException("Block " + xd_32 + " has no property " + string);
        });
        return new rQM(xd_32, jS);
    }
}

