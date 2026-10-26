/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rnY_2;
import com.google.gson.JsonObject;
import java.util.Date;

public class rnD_2
extends rnY_2<String> {
    public rnD_2(JsonObject jsonObject) {
        super(rnD_2.id_break(jsonObject), jsonObject);
    }

    public rnD_2(String string, Date date, String string2, Date date2, String string3) {
        super(string, date, string2, date2, string3);
    }

    public rnD_2(String string) {
        this(string, (Date)null, (String)null, (Date)null, (String)null);
    }

    @Override
    protected void id_class(JsonObject jsonObject) {
        if (this.id_case() != null) {
            jsonObject.addProperty("ip", (String)this.id_case());
            super.id_class(jsonObject);
        }
    }

    private static String id_break(JsonObject jsonObject) {
        return jsonObject.has("ip") ? jsonObject.get("ip").getAsString() : null;
    }

    @Override
    public rgP_2 id_protected() {
        return new rgN_2((String)this.id_case());
    }
}

