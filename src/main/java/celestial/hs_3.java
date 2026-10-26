/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.google.common.io.Files
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonParseException
 *  com.google.gson.internal.Streams
 *  com.google.gson.reflect.TypeToken
 *  com.google.gson.stream.JsonReader
 *  com.mojang.datafixers.DataFixer
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.OD;
import celestial.OK;
import celestial.OT;
import celestial.OV;
import celestial.Of_1;
import celestial.Oj_1;
import celestial.Oo_1;
import celestial.hB_2;
import celestial.hE_2;
import celestial.hP_2;
import celestial.hr_3;
import celestial.rCr_1;
import celestial.rFS;
import celestial.rRu_1;
import celestial.rTv_1;
import celestial.rVU;
import celestial.rYB;
import celestial.rZI;
import celestial.rgn_3;
import celestial.rhN_2;
import celestial.rqO_2;
import celestial.rqR_2;
import celestial.rqh_3;
import celestial.rqu_3;
import com.google.common.base.Charsets;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.io.Files;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.internal.Streams;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class hs_3 {
    private static final Logger id_class = LogManager.getLogger();
    private static final Gson id_break = new GsonBuilder().registerTypeAdapter(Oj_1.class, (Object)new OV()).registerTypeAdapter(rqO_2.class, (Object)new rqh_3()).setPrettyPrinting().create();
    private static final TypeToken<Map<rqO_2, Oj_1>> id_byte = new hE_2();
    private final DataFixer id_protected;
    private final rCr_1 id_throws;
    private final File id_case;
    private final Map<OT, Oj_1> id_catch = Maps.newLinkedHashMap();
    private final Set<OT> id_private = Sets.newLinkedHashSet();
    private final Set<OT> id_implements = Sets.newLinkedHashSet();
    private final Set<OT> id_finally = Sets.newLinkedHashSet();
    private rhN_2 id_extends;
    private OT id_native;
    private boolean id_volatile = true;

    private void id_byte() {
        ArrayList arrayList = Lists.newArrayList();
        for (Map.Entry<OT, Oj_1> entry : this.id_catch.entrySet()) {
            if (!entry.getValue().id_class()) continue;
            arrayList.add((OT)entry.getKey());
            this.id_finally.add((OT)entry.getKey());
        }
        for (Map.Entry<OT, Oj_1> entry : arrayList) {
            this.id_throws((OT)((Object)entry));
        }
    }

    private void id_byte(OT oT) {
        Oj_1 oj_1 = this.id_break(oT);
        if (!oj_1.id_class()) {
            for (Map.Entry<String, OK> entry : oT.id_case().entrySet()) {
                hP_2<hr_3> hP_22;
                hr_3 hr_32;
                OD oD = oj_1.id_byte(entry.getKey());
                if (oD == null || oD.id_class() || (hr_32 = entry.getValue().id_class()) == null || (hP_22 = Oo_1.id_class(hr_32.id_class())) == null) continue;
                hP_22.id_class(this, new hB_2<hr_3>(hr_32, oT, entry.getKey()));
            }
        }
    }

    private void id_byte(Of_1 of_1) {
        for (OT oT : of_1.id_class()) {
            if (!oT.id_case().isEmpty()) continue;
            this.id_class(oT, "");
            oT.id_protected().id_class(this.id_extends);
        }
    }

    public hs_3(DataFixer dataFixer, rCr_1 rCr_12, Of_1 of_1, File file, rhN_2 rhN_22) {
        this.id_protected = dataFixer;
        this.id_throws = rCr_12;
        this.id_case = file;
        this.id_extends = rhN_22;
        this.id_protected(of_1);
    }

    public void id_class() {
        for (hP_2<?> hP_22 : Oo_1.id_class()) {
            hP_22.id_class(this);
        }
    }

    public void id_class(OT oT) {
        OT oT2 = this.id_native;
        this.id_native = oT != null && oT.id_break() == null && oT.id_byte() != null ? oT : null;
        if (oT2 != this.id_native) {
            this.id_extends.id_class.id_class(new rFS(this.id_native == null ? null : this.id_native.id_private()));
        }
    }

    public void id_class(rhN_2 rhN_22) {
        this.id_extends = rhN_22;
    }

    public boolean id_class(OT oT, String string) {
        boolean bl = false;
        Oj_1 oj_1 = this.id_break(oT);
        boolean bl2 = oj_1.id_class();
        if (oj_1.id_class(string)) {
            this.id_protected(oT);
            this.id_finally.add(oT);
            bl = true;
            if (!bl2 && oj_1.id_class()) {
                oT.id_protected().id_class(this.id_extends);
                if (oT.id_byte() != null && oT.id_byte().id_implements() && ((rYB)this.id_extends.id_throws[7]).B().id_break(rRu_1.id_return)) {
                    this.id_throws.id_class(new rgn_3("chat.type.advancement." + oT.id_byte().id_throws().id_class(), this.id_extends.L_(), oT.id_finally()), rVU.SYSTEM, rqR_2.id_break);
                }
            }
        }
        if (oj_1.id_class()) {
            this.id_throws(oT);
        }
        return bl;
    }

    public void id_class(Of_1 of_1) {
        this.id_class();
        this.id_catch.clear();
        this.id_private.clear();
        this.id_implements.clear();
        this.id_finally.clear();
        this.id_volatile = true;
        this.id_native = null;
        this.id_protected(of_1);
    }

    private void id_class(OT oT, Oj_1 oj_1) {
        oj_1.id_class(oT.id_case(), oT.id_implements());
        this.id_catch.put(oT, oj_1);
    }

    public void id_break(rhN_2 rhN_22) {
        if (this.id_volatile || !this.id_implements.isEmpty() || !this.id_finally.isEmpty()) {
            HashMap hashMap = Maps.newHashMap();
            LinkedHashSet linkedHashSet = Sets.newLinkedHashSet();
            LinkedHashSet linkedHashSet2 = Sets.newLinkedHashSet();
            for (OT oT : this.id_finally) {
                if (!this.id_private.contains(oT)) continue;
                hashMap.put(oT.id_private(), this.id_catch.get(oT));
            }
            for (OT oT : this.id_implements) {
                if (this.id_private.contains(oT)) {
                    linkedHashSet.add(oT);
                    continue;
                }
                linkedHashSet2.add(oT.id_private());
            }
            if (this.id_volatile || !hashMap.isEmpty() || !linkedHashSet.isEmpty() || !linkedHashSet2.isEmpty()) {
                rhN_22.id_class.id_class(new rZI(this.id_volatile, linkedHashSet, linkedHashSet2, hashMap));
                this.id_implements.clear();
                this.id_finally.clear();
            }
        }
        this.id_volatile = false;
    }

    public boolean id_break(OT oT, String string) {
        boolean bl = false;
        Oj_1 oj_1 = this.id_break(oT);
        if (oj_1.id_break(string)) {
            this.id_byte(oT);
            this.id_finally.add(oT);
            bl = true;
        }
        if (!oj_1.id_break()) {
            this.id_throws(oT);
        }
        return bl;
    }

    public Oj_1 id_break(OT oT) {
        Oj_1 oj_1 = this.id_catch.get(oT);
        if (oj_1 == null) {
            oj_1 = new Oj_1();
            this.id_class(oT, oj_1);
        }
        return oj_1;
    }

    private void id_break(Of_1 of_1) {
        for (OT oT : of_1.id_class()) {
            this.id_byte(oT);
        }
    }

    public void id_break() {
        Object object;
        HashMap hashMap = Maps.newHashMap();
        for (Map.Entry<OT, Oj_1> entry : this.id_catch.entrySet()) {
            object = entry.getValue();
            if (!((Oj_1)object).id_break()) continue;
            hashMap.put(entry.getKey().id_private(), object);
        }
        if (this.id_case.getParentFile() != null) {
            this.id_case.getParentFile().mkdirs();
        }
        JsonElement jsonElement = id_break.toJsonTree((Object)hashMap);
        jsonElement.getAsJsonObject().addProperty("DataVersion", (Number)rqu_3.id_class().getWorldVersion());
        try {
            Map.Entry<OT, Oj_1> entry;
            entry = new FileOutputStream(this.id_case);
            try {
                object = new OutputStreamWriter((OutputStream)((Object)entry), Charsets.UTF_8.newEncoder());
                try {
                    id_break.toJson(jsonElement, (Appendable)object);
                }
                finally {
                    ((Writer)object).close();
                }
            }
            finally {
                ((OutputStream)((Object)entry)).close();
            }
        }
        catch (IOException iOException) {
            id_class.error("Couldn't save player advancements to {}", (Object)this.id_case, (Object)iOException);
        }
    }

    private void id_throws(OT oT) {
        boolean bl = this.id_case(oT);
        boolean bl2 = this.id_private.contains(oT);
        if (bl && !bl2) {
            this.id_private.add(oT);
            this.id_implements.add(oT);
            if (this.id_catch.containsKey(oT)) {
                this.id_finally.add(oT);
            }
        } else if (!bl && bl2) {
            this.id_private.remove(oT);
            this.id_implements.add(oT);
        }
        if (bl != bl2 && oT.id_break() != null) {
            this.id_throws(oT.id_break());
        }
        for (OT oT2 : oT.id_throws()) {
            this.id_throws(oT2);
        }
    }

    private boolean id_catch(OT oT) {
        Oj_1 oj_1 = this.id_break(oT);
        if (oj_1.id_class()) {
            return true;
        }
        for (OT oT2 : oT.id_throws()) {
            if (!this.id_catch(oT2)) continue;
            return true;
        }
        return false;
    }

    private boolean id_case(OT oT) {
        for (int n = 0; oT != null && n <= 2; oT = oT.id_break(), ++n) {
            if (n == 0 && this.id_catch(oT)) {
                return true;
            }
            if (oT.id_byte() == null) {
                return false;
            }
            Oj_1 oj_1 = this.id_break(oT);
            if (oj_1.id_class()) {
                return true;
            }
            if (!oT.id_byte().id_finally()) continue;
            return false;
        }
        return false;
    }

    private void id_protected(OT oT) {
        Oj_1 oj_1 = this.id_break(oT);
        for (Map.Entry<String, OK> entry : oT.id_case().entrySet()) {
            hP_2<hr_3> hP_22;
            hr_3 hr_32;
            OD oD = oj_1.id_byte(entry.getKey());
            if (oD == null || !oD.id_class() && !oj_1.id_class() || (hr_32 = entry.getValue().id_class()) == null || (hP_22 = Oo_1.id_class(hr_32.id_class())) == null) continue;
            hP_22.id_break(this, new hB_2<hr_3>(hr_32, oT, entry.getKey()));
        }
    }

    private void id_protected(Of_1 of_1) {
        if (this.id_case.isFile()) {
            try (JsonReader jsonReader = new JsonReader((Reader)new StringReader(Files.toString((File)this.id_case, (Charset)StandardCharsets.UTF_8)));){
                jsonReader.setLenient(false);
                Dynamic dynamic = new Dynamic((DynamicOps)JsonOps.INSTANCE, (Object)Streams.parse((JsonReader)jsonReader));
                if (!dynamic.get("DataVersion").asNumber().result().isPresent()) {
                    dynamic = dynamic.set("DataVersion", dynamic.createInt(1343));
                }
                dynamic = this.id_protected.update(rTv_1.ADVANCEMENTS.id_class(), dynamic, dynamic.get("DataVersion").asInt(0), rqu_3.id_class().getWorldVersion());
                dynamic = dynamic.remove("DataVersion");
                Map map = (Map)id_break.getAdapter(id_byte).fromJsonTree((JsonElement)dynamic.getValue());
                if (map == null) {
                    throw new JsonParseException("Found null for advancements");
                }
                Stream<Map.Entry> stream = map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue));
                for (Map.Entry entry : stream.collect(Collectors.toList())) {
                    OT oT = of_1.id_class((rqO_2)entry.getKey());
                    if (oT == null) {
                        id_class.warn("Ignored advancement '{}' in progress file {} - it doesn't exist anymore?", entry.getKey(), (Object)this.id_case);
                        continue;
                    }
                    this.id_class(oT, (Oj_1)entry.getValue());
                }
            }
            catch (JsonParseException jsonParseException) {
                id_class.error("Couldn't parse player advancements in {}", (Object)this.id_case, (Object)jsonParseException);
            }
            catch (IOException iOException) {
                id_class.error("Couldn't access player advancements in {}", (Object)this.id_case, (Object)iOException);
            }
        }
        this.id_byte(of_1);
        this.id_byte();
        this.id_break(of_1);
    }
}

