/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.rqO_2;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.function.Supplier;

public class DJ
implements Supplier<JsonElement> {
    private final rqO_2 id_class;

    public DJ(rqO_2 rqO_22) {
        this.id_class = rqO_22;
    }

    @Override
    public /* synthetic */ Object get() {
        return this.id_class();
    }

    public JsonElement id_class() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("parent", this.id_class.toString());
        return jsonObject;
    }
}

