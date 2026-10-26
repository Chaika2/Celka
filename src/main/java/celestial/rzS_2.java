/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.TypeAdapter
 *  com.google.gson.stream.JsonReader
 *  com.google.gson.stream.JsonWriter
 */
package celestial;

import celestial.rzB_2;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

public class rzS_2
extends TypeAdapter<rzB_2> {
    public rzB_2 id_class(JsonReader jsonReader) throws IOException {
        return rzB_2.id_class(jsonReader.nextString());
    }

    public void id_class(JsonWriter jsonWriter, rzB_2 rzB_22) throws IOException {
        jsonWriter.value(rzB_22.targetType);
    }

    public /* synthetic */ void write(JsonWriter jsonWriter, Object object) throws IOException {
        this.id_class(jsonWriter, (rzB_2)((Object)object));
    }

    public /* synthetic */ Object read(JsonReader jsonReader) throws IOException {
        return this.id_class(jsonReader);
    }
}

