/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSyntaxException
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 */
package celestial;

import celestial.rNe_1;
import celestial.rQz_1;
import celestial.rcH_2;
import celestial.rcd_3;
import celestial.rpY_2;
import celestial.rzO_2;
import celestial.rzX_2;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public class rNa_1
extends rzX_2<rNe_1> {
    @Override
    public /* synthetic */ rzO_2 id_class(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, rQz_1[] rQz_1Array) {
        return this.id_break(jsonObject, jsonDeserializationContext, rQz_1Array);
    }

    @Override
    public void id_class(JsonObject jsonObject, rNe_1 rNe_12, JsonSerializationContext jsonSerializationContext) {
        super.id_class(jsonObject, rNe_12, jsonSerializationContext);
        jsonObject.addProperty("tag", rNe_12.id_break.toString());
    }

    public rNe_1 id_break(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, rQz_1[] rQz_1Array) {
        try {
            rcd_3 rcd_32 = rcH_2.id_class(rpY_2.id_case(jsonObject, "tag"));
            return new rNe_1(rQz_1Array, rcd_32);
        }
        catch (CommandSyntaxException commandSyntaxException) {
            throw new JsonSyntaxException(commandSyntaxException.getMessage());
        }
    }
}

