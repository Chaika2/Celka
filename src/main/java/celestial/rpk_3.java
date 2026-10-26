/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.TypeAdapter
 *  com.google.gson.stream.JsonReader
 *  com.google.gson.stream.JsonToken
 *  com.google.gson.stream.JsonWriter
 */
package celestial;

import celestial.rpd_3;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Map;

public class rpk_3
extends TypeAdapter<T> {
    public final /* synthetic */ Map id_class;
    public final /* synthetic */ rpd_3 id_break;

    public rpk_3(rpd_3 rpd_32, Map map) {
        this.id_break = rpd_32;
        this.id_class = map;
    }

    public void write(JsonWriter jsonWriter, T t) throws IOException {
        if (t == null) {
            jsonWriter.nullValue();
        } else {
            jsonWriter.value(this.id_break.id_class(t));
        }
    }

    public T read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        return this.id_class.get(jsonReader.nextString());
    }
}

