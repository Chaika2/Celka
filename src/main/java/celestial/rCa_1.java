/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonPrimitive
 *  com.google.gson.internal.Streams
 *  com.google.gson.stream.JsonReader
 *  com.mojang.datafixers.DataFixer
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  it.unimi.dsi.fastutil.objects.ObjectIterator
 *  org.apache.commons.io.FileUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.rCi_1;
import celestial.rFW;
import celestial.rTv_1;
import celestial.rVL;
import celestial.rcd_3;
import celestial.rco_3;
import celestial.rhN_2;
import celestial.rhd_3;
import celestial.rlP_2;
import celestial.rlr_3;
import celestial.rnW_2;
import celestial.rqO_2;
import celestial.rqR_2;
import celestial.rqu_3;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.internal.Streams;
import com.google.gson.stream.JsonReader;
import com.mojang.datafixers.DataFixer;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rCa_1
extends rlP_2 {
    private static final Logger id_break = LogManager.getLogger();
    private final rnW_2 id_byte;
    private final File id_protected;
    private final Set<rCi_1<?>> id_throws = Sets.newHashSet();
    private int id_case = -300;

    public void id_byte() {
        this.id_throws.addAll((Collection<rCi_1<?>>)this.id_class.keySet());
    }

    public rCa_1(rnW_2 rnW_22, File file) {
        this.id_byte = rnW_22;
        this.id_protected = file;
        if (file.isFile()) {
            try {
                this.id_class(rnW_22.T(), FileUtils.readFileToString((File)file));
            }
            catch (IOException iOException) {
                id_break.error("Couldn't read statistics file {}", (Object)file, (Object)iOException);
            }
            catch (JsonParseException jsonParseException) {
                id_break.error("Couldn't parse statistics file {}", (Object)file, (Object)jsonParseException);
            }
        }
    }

    @Override
    public void id_class(rhd_3 rhd_32, rCi_1<?> rCi_12, int n) {
        super.id_class(rhd_32, rCi_12, n);
        this.id_throws.add(rCi_12);
    }

    public void id_class() {
        try {
            FileUtils.writeStringToFile((File)this.id_protected, (String)this.id_break());
        }
        catch (IOException iOException) {
            id_break.error("Couldn't save stats", (Throwable)iOException);
        }
    }

    public void id_class(rhN_2 rhN_22) {
        int n = this.id_byte.Q();
        Object2IntOpenHashMap object2IntOpenHashMap = new Object2IntOpenHashMap();
        if (n - this.id_case > 300) {
            this.id_case = n;
            for (rCi_1<?> rCi_12 : this.id_protected()) {
                object2IntOpenHashMap.put(rCi_12, this.id_class(rCi_12));
            }
        }
        rhN_22.id_class.id_class(new rFW((Object2IntMap<rCi_1<?>>)object2IntOpenHashMap));
    }

    public void id_class(DataFixer dataFixer, String string) {
        try (JsonReader jsonReader = new JsonReader((Reader)new StringReader(string));){
            jsonReader.setLenient(false);
            JsonElement jsonElement = Streams.parse((JsonReader)jsonReader);
            if (jsonElement.isJsonNull()) {
                id_break.error("Unable to parse Stat data from {}", (Object)this.id_protected);
                return;
            }
            rcd_3 rcd_32 = rCa_1.id_class(jsonElement.getAsJsonObject());
            if (!rcd_32.id_byte("DataVersion", 99)) {
                rcd_32.id_break("DataVersion", 1343);
            }
            if ((rcd_32 = rco_3.id_class(dataFixer, rTv_1.STATS, rcd_32, rcd_32.id_private("DataVersion"))).id_byte("stats", 10)) {
                rcd_3 rcd_33 = rcd_32.id_int("stats");
                for (String string2 : rcd_33.id_protected()) {
                    if (!rcd_33.id_byte(string2, 10)) continue;
                    rqR_2.id_class(rVL.h.id_break(new rqO_2(string2)), rlr_32 -> {
                        rcd_3 rcd_33 = rcd_33.id_int(string2);
                        for (String string2 : rcd_33.id_protected()) {
                            if (rcd_33.id_byte(string2, 99)) {
                                rqR_2.id_class(this.id_class((rlr_3)rlr_32, string2), rCi_12 -> this.id_class.put(rCi_12, rcd_33.id_private(string2)), () -> id_break.warn("Invalid statistic in {}: Don't know what {} is", (Object)this.id_protected, (Object)string2));
                                continue;
                            }
                            id_break.warn("Invalid statistic value in {}: Don't know what {} is for key {}", (Object)this.id_protected, (Object)rcd_33.id_byte(string2), (Object)string2);
                        }
                    }, () -> id_break.warn("Invalid statistic type in {}: Don't know what {} is", (Object)this.id_protected, (Object)string2));
                }
            }
        }
        catch (JsonParseException | IOException throwable) {
            id_break.error("Unable to parse Stat data from {}", (Object)this.id_protected, (Object)throwable);
        }
    }

    private <T> Optional<rCi_1<T>> id_class(rlr_3<T> rlr_32, String string) {
        return Optional.ofNullable(rqO_2.id_break(string)).flatMap(rlr_32.id_class()::id_break).map(rlr_32::id_break);
    }

    private static rcd_3 id_class(JsonObject jsonObject) {
        rcd_3 rcd_32 = new rcd_3();
        for (Map.Entry entry : jsonObject.entrySet()) {
            JsonPrimitive jsonPrimitive;
            JsonElement jsonElement = (JsonElement)entry.getValue();
            if (jsonElement.isJsonObject()) {
                rcd_32.id_class((String)entry.getKey(), rCa_1.id_class(jsonElement.getAsJsonObject()));
                continue;
            }
            if (!jsonElement.isJsonPrimitive() || !(jsonPrimitive = jsonElement.getAsJsonPrimitive()).isNumber()) continue;
            rcd_32.id_break((String)entry.getKey(), jsonPrimitive.getAsInt());
        }
        return rcd_32;
    }

    private static <T> rqO_2 id_break(rCi_1<T> rCi_12) {
        return rCi_12.id_protected().id_class().id_break(rCi_12.id_throws());
    }

    protected String id_break() {
        Object object22;
        HashMap hashMap = Maps.newHashMap();
        for (Object object22 : this.id_class.object2IntEntrySet()) {
            rCi_1 object3 = (rCi_1)object22.getKey();
            hashMap.computeIfAbsent(object3.id_protected(), rlr_32 -> new JsonObject()).addProperty(rCa_1.id_break(object3).toString(), (Number)object22.getIntValue());
        }
        ObjectIterator objectIterator = new JsonObject();
        for (Map.Entry entry : hashMap.entrySet()) {
            objectIterator.add(rVL.h.id_break((rlr_3)entry.getKey()).toString(), (JsonElement)entry.getValue());
        }
        object22 = new JsonObject();
        object22.add("stats", (JsonElement)objectIterator);
        object22.addProperty("DataVersion", (Number)rqu_3.id_class().getWorldVersion());
        return object22.toString();
    }

    private Set<rCi_1<?>> id_protected() {
        HashSet hashSet = Sets.newHashSet(this.id_throws);
        this.id_throws.clear();
        return hashSet;
    }
}

