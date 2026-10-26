/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonObject
 *  it.unimi.dsi.fastutil.ints.IntCollection
 *  it.unimi.dsi.fastutil.ints.IntOpenHashSet
 */
package celestial;

import celestial.jY_2;
import celestial.rAF;
import celestial.rAL;
import celestial.rpY_2;
import celestial.rqO_2;
import celestial.uG_2;
import celestial.uN_2;
import celestial.uQ_2;
import celestial.ub_3;
import celestial.uc_3;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import it.unimi.dsi.fastutil.ints.IntCollection;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class uM_2
extends jY_2<Map<rqO_2, List<uc_3>>> {
    public final /* synthetic */ ub_3 id_class;

    public uM_2(ub_3 ub_32) {
        this.id_class = ub_32;
    }

    protected Map<rqO_2, List<uc_3>> id_class(rAL rAL2) {
        Gson gson = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
        HashMap hashMap = Maps.newHashMap();
        for (rqO_2 rqO_23 : rAL2.id_class("font", (String string) -> string.endsWith(".json"))) {
            String string2 = rqO_23.id_break();
            rqO_2 rqO_24 = new rqO_2(rqO_23.id_byte(), string2.substring("font/".length(), string2.length() - ".json".length()));
            List list = hashMap.computeIfAbsent(rqO_24, rqO_22 -> Lists.newArrayList((Object[])new uc_3[]{new uQ_2()}));
            try {
                for (rAF rAF2 : rAL2.id_byte(rqO_23)) {
                    try {
                        Closeable closeable = rAF2.id_break();
                        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((InputStream)closeable, StandardCharsets.UTF_8));){
                            JsonArray jsonArray = rpY_2.id_volatile(rpY_2.id_class(gson, (Reader)bufferedReader, JsonObject.class), "providers");
                            for (int i = jsonArray.size() - 1; i >= 0; --i) {
                                JsonObject jsonObject = rpY_2.id_private(jsonArray.get(i), "providers[" + i + "]");
                                try {
                                    String string3 = rpY_2.id_case(jsonObject, "type");
                                    uN_2 uN_22 = uN_2.id_class(string3);
                                    uc_3 uc_32 = uN_22.id_class(jsonObject).id_class(rAL2);
                                    if (uc_32 == null) continue;
                                    list.add(uc_32);
                                    continue;
                                }
                                catch (RuntimeException runtimeException) {
                                    ub_3.id_break.warn("Unable to read definition '{}' in fonts.json in resourcepack: '{}': {}", (Object)rqO_24, (Object)rAF2.id_byte(), (Object)runtimeException.getMessage());
                                }
                            }
                        }
                        finally {
                            if (closeable == null) continue;
                            ((InputStream)closeable).close();
                        }
                    }
                    catch (RuntimeException runtimeException) {
                        ub_3.id_break.warn("Unable to load font '{}' in fonts.json in resourcepack: '{}': {}", (Object)rqO_24, (Object)rAF2.id_byte(), (Object)runtimeException.getMessage());
                    }
                }
            }
            catch (IOException iOException) {
                ub_3.id_break.warn("Unable to load font '{}' in fonts.json: {}", (Object)rqO_24, (Object)iOException.getMessage());
            }
            IntOpenHashSet intOpenHashSet = new IntOpenHashSet();
            for (Closeable closeable : list) {
                intOpenHashSet.addAll((IntCollection)closeable.id_class());
            }
            intOpenHashSet.forEach(n -> {
                block1: {
                    uc_3 uc_32;
                    if (n == 32) break block1;
                    Iterator iterator = Lists.reverse((List)list).iterator();
                    while (iterator.hasNext() && (uc_32 = (uc_3)iterator.next()).id_class(n) == null) {
                    }
                }
            });
        }
        return hashMap;
    }

    @Override
    protected void id_class(Map<rqO_2, List<uc_3>> map, rAL rAL2) {
        this.id_class.id_protected.values().forEach(uG_2::close);
        this.id_class.id_protected.clear();
        map.forEach((rqO_22, list) -> {
            uG_2 uG_22 = new uG_2(this.id_class.id_throws, (rqO_2)rqO_22);
            uG_22.id_class(Lists.reverse((List)list));
            this.id_class.id_protected.put((rqO_2)rqO_22, uG_22);
        });
    }

    @Override
    protected /* synthetic */ Object id_break(rAL rAL2) {
        return this.id_class(rAL2);
    }

    @Override
    public String i_() {
        return "FontManager";
    }
}

