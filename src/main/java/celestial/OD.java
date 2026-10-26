/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonNull
 *  com.google.gson.JsonPrimitive
 *  com.google.gson.JsonSyntaxException
 */
package celestial;

import celestial.ruu_3;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OD {
    private static final SimpleDateFormat id_class = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
    private Date id_break;

    public void id_byte() {
        this.id_break = null;
    }

    public String toString() {
        return "CriterionProgress{obtained=" + (Serializable)(this.id_break == null ? "false" : this.id_break) + "}";
    }

    public void id_class(ruu_3 ruu_32) {
        ruu_32.writeBoolean(this.id_break != null);
        if (this.id_break != null) {
            ruu_32.id_class(this.id_break);
        }
    }

    public boolean id_class() {
        return this.id_break != null;
    }

    public static OD id_class(String string) {
        OD oD = new OD();
        try {
            oD.id_break = id_class.parse(string);
            return oD;
        }
        catch (ParseException parseException) {
            throw new JsonSyntaxException("Invalid datetime: " + string, (Throwable)parseException);
        }
    }

    public static OD id_break(ruu_3 ruu_32) {
        OD oD = new OD();
        if (ruu_32.readBoolean()) {
            oD.id_break = ruu_32.id_final();
        }
        return oD;
    }

    public void id_break() {
        this.id_break = new Date();
    }

    public JsonElement id_throws() {
        return this.id_break != null ? new JsonPrimitive(id_class.format(this.id_break)) : JsonNull.INSTANCE;
    }

    public Date id_protected() {
        return this.id_break;
    }
}

