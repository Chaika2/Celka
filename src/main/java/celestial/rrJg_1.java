/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonParser
 */
package celestial;

import celestial.QY;
import celestial.fN_2;
import celestial.rqO_2;
import celestial.rrJA;
import celestial.rrJN;
import celestial.rrJR;
import celestial.rrJV;
import celestial.rrJY;
import celestial.rrWf_1;
import celestial.rrbb_3;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class rrJg_1 {
    private String id_protected = null;
    public static final String id_class = "items";
    public static final String id_break = "type";
    public static final String id_byte = "active";

    public rrJg_1(String string) {
        this.id_protected = string;
    }

    private fN_2 id_class(String string) {
        String string2 = rrJA.id_class() + "/" + string;
        try {
            byte[] byArray = rrJN.id_break(string2, QY.id_instanceof().W());
            return fN_2.id_class(new ByteArrayInputStream(byArray));
        }
        catch (IOException iOException) {
            rrbb_3.id_protected("Error loading item texture " + string + ": " + iOException.getClass().getName() + ": " + iOException.getMessage());
            return null;
        }
    }

    public rrJV id_class(JsonElement jsonElement) {
        if (jsonElement == null) {
            throw new JsonParseException("JSON object is null, player: " + this.id_protected);
        }
        JsonObject jsonObject = (JsonObject)jsonElement;
        rrJV rrJV2 = new rrJV();
        JsonArray jsonArray = (JsonArray)jsonObject.get(id_class);
        if (jsonArray != null) {
            for (int i = 0; i < jsonArray.size(); ++i) {
                rrJR rrJR2;
                JsonObject jsonObject2 = (JsonObject)jsonArray.get(i);
                boolean bl = rrWf_1.id_class(jsonObject2, id_byte, true);
                if (!bl) continue;
                String string = rrWf_1.id_class(jsonObject2, id_break);
                if (string == null) {
                    rrbb_3.id_protected("Item type is null, player: " + this.id_protected);
                    continue;
                }
                Object object = rrWf_1.id_class(jsonObject2, "model");
                if (object == null) {
                    object = "items/" + string + "/model.cfg";
                }
                if ((rrJR2 = this.id_break((String)object)) == null) continue;
                if (!rrJR2.id_protected()) {
                    fN_2 fN_22;
                    Object object2 = rrWf_1.id_class(jsonObject2, "texture");
                    if (object2 == null) {
                        object2 = "items/" + string + "/users/" + this.id_protected + ".png";
                    }
                    if ((fN_22 = this.id_class((String)object2)) == null) continue;
                    rrJR2.id_class(fN_22);
                    rqO_2 rqO_22 = new rqO_2("optifine.net", (String)object2);
                    rrJR2.id_class(rqO_22);
                }
                rrJV2.id_class(rrJR2);
            }
        }
        return rrJV2;
    }

    private rrJR id_break(String string) {
        String string2 = rrJA.id_class() + "/" + string;
        try {
            byte[] byArray = rrJN.id_break(string2, QY.id_instanceof().W());
            String string3 = new String(byArray, "ASCII");
            JsonParser jsonParser = new JsonParser();
            JsonObject jsonObject = (JsonObject)jsonParser.parse(string3);
            return rrJY.id_class(jsonObject);
        }
        catch (Exception exception) {
            rrbb_3.id_protected("Error loading item model " + string + ": " + exception.getClass().getName() + ": " + exception.getMessage());
            return null;
        }
    }
}

