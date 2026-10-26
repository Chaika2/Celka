/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.rCd_1;
import celestial.rgP_2;
import com.google.gson.JsonObject;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class rnY_2<T>
extends rCd_1<T> {
    public static final SimpleDateFormat id_class = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
    protected final Date id_break;
    protected final String id_byte;
    protected final Date id_protected;
    protected final String id_throws;

    public String id_byte() {
        return this.id_throws;
    }

    public rnY_2(T t, Date date, String string, Date date2, String string2) {
        super(t);
        this.id_break = date == null ? new Date() : date;
        this.id_byte = string == null ? "(Unknown)" : string;
        this.id_protected = date2;
        this.id_throws = string2 == null ? "Banned by an operator." : string2;
    }

    protected rnY_2(T t, JsonObject jsonObject) {
        super(t);
        Date date;
        Date date2;
        try {
            date2 = jsonObject.has("created") ? id_class.parse(jsonObject.get("created").getAsString()) : new Date();
        }
        catch (ParseException parseException) {
            date2 = new Date();
        }
        this.id_break = date2;
        this.id_byte = jsonObject.has("source") ? jsonObject.get("source").getAsString() : "(Unknown)";
        try {
            date = jsonObject.has("expires") ? id_class.parse(jsonObject.get("expires").getAsString()) : null;
        }
        catch (ParseException parseException) {
            date = null;
        }
        this.id_protected = date;
        this.id_throws = jsonObject.has("reason") ? jsonObject.get("reason").getAsString() : "Banned by an operator.";
    }

    @Override
    protected void id_class(JsonObject jsonObject) {
        jsonObject.addProperty("created", id_class.format(this.id_break));
        jsonObject.addProperty("source", this.id_byte);
        jsonObject.addProperty("expires", this.id_protected == null ? "forever" : id_class.format(this.id_protected));
        jsonObject.addProperty("reason", this.id_throws);
    }

    public String id_class() {
        return this.id_byte;
    }

    public Date id_break() {
        return this.id_protected;
    }

    @Override
    public boolean id_throws() {
        return this.id_protected == null ? false : this.id_protected.before(new Date());
    }

    public abstract rgP_2 id_protected();
}

