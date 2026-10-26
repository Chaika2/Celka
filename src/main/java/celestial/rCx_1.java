/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.io.Files
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.rCd_1;
import celestial.rpY_2;
import celestial.rqR_2;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.io.Files;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class rCx_1<K, V extends rCd_1<K>> {
    protected static final Logger id_class = LogManager.getLogger();
    private static final Gson id_break = new GsonBuilder().setPrettyPrinting().create();
    private final File id_byte;
    private final Map<String, V> id_protected = Maps.newHashMap();

    public void id_byte(K k) {
        this.id_protected.remove(this.id_class(k));
        try {
            this.id_throws();
        }
        catch (IOException iOException) {
            id_class.warn("Could not save the list after removing a user.", (Throwable)iOException);
        }
    }

    public boolean id_byte() {
        return this.id_protected.size() < 1;
    }

    public rCx_1(File file) {
        this.id_byte = file;
    }

    protected String id_class(K k) {
        return k.toString();
    }

    public void id_class(V v) {
        this.id_protected.put(this.id_class((K)((rCd_1)v).id_case()), v);
        try {
            this.id_throws();
        }
        catch (IOException iOException) {
            id_class.warn("Could not save the list after adding a user.", (Throwable)iOException);
        }
    }

    protected abstract rCd_1<K> id_class(JsonObject var1);

    public String[] id_class() {
        return this.id_protected.keySet().toArray(new String[this.id_protected.size()]);
    }

    public File id_break() {
        return this.id_byte;
    }

    public void id_break(rCd_1<K> rCd_12) {
        this.id_byte(rCd_12.id_case());
    }

    public V id_break(K k) {
        this.id_catch();
        return (V)((rCd_1)this.id_protected.get(this.id_class(k)));
    }

    public void id_throws() throws IOException {
        JsonArray jsonArray = new JsonArray();
        this.id_protected.values().stream().map(rCd_12 -> rqR_2.id_class(new JsonObject(), rCd_12::id_class)).forEach(arg_0 -> ((JsonArray)jsonArray).add(arg_0));
        try (BufferedWriter bufferedWriter = Files.newWriter((File)this.id_byte, (Charset)StandardCharsets.UTF_8);){
            id_break.toJson((JsonElement)jsonArray, (Appendable)bufferedWriter);
        }
    }

    private void id_catch() {
        ArrayList arrayList = Lists.newArrayList();
        for (Object object : this.id_protected.values()) {
            if (!((rCd_1)object).id_throws()) continue;
            arrayList.add(((rCd_1)object).id_case());
        }
        for (Object object : arrayList) {
            this.id_protected.remove(this.id_class((K)object));
        }
    }

    public void id_case() throws IOException {
        if (this.id_byte.exists()) {
            try (BufferedReader bufferedReader = Files.newReader((File)this.id_byte, (Charset)StandardCharsets.UTF_8);){
                JsonArray jsonArray = (JsonArray)id_break.fromJson((Reader)bufferedReader, JsonArray.class);
                this.id_protected.clear();
                for (JsonElement jsonElement : jsonArray) {
                    JsonObject jsonObject = rpY_2.id_private(jsonElement, "entry");
                    rCd_1<K> rCd_12 = this.id_class(jsonObject);
                    if (rCd_12.id_case() == null) continue;
                    this.id_protected.put(this.id_class(rCd_12.id_case()), rCd_12);
                }
            }
        }
    }

    protected boolean id_protected(K k) {
        return this.id_protected.containsKey(this.id_class(k));
    }

    public Collection<V> id_protected() {
        return this.id_protected.values();
    }
}

