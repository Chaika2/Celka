/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.gson.Gson
 *  com.google.gson.JsonObject
 *  org.apache.commons.io.IOUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.rAF;
import celestial.rAL;
import celestial.rlM_2;
import celestial.rlW_2;
import celestial.rlb_3;
import celestial.rpY_2;
import celestial.rqO_2;
import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rlv_3<T> {
    private static final Logger id_class = LogManager.getLogger();
    private static final Gson id_break = new Gson();
    private static final int id_byte = ".json".length();
    private final Function<rqO_2, Optional<T>> id_protected;
    private final String id_throws;
    private final String id_case;

    public rlv_3(Function<rqO_2, Optional<T>> function, String string, String string2) {
        this.id_protected = function;
        this.id_throws = string;
        this.id_case = string2;
    }

    public rlW_2<T> id_class(Map<rqO_2, rlM_2> map) {
        HashMap hashMap = Maps.newHashMap();
        Function function = hashMap::get;
        Function<rqO_2, Object> function2 = rqO_22 -> this.id_protected.apply((rqO_2)rqO_22).orElse(null);
        while (!map.isEmpty()) {
            boolean bl = false;
            Iterator<Map.Entry<rqO_2, rlM_2>> iterator = map.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<rqO_2, rlM_2> entry = iterator.next();
                Optional<rlb_3<Object>> optional = entry.getValue().id_class(function, function2);
                if (!optional.isPresent()) continue;
                hashMap.put(entry.getKey(), optional.get());
                iterator.remove();
                bl = true;
            }
            if (bl) continue;
            break;
        }
        map.forEach((rqO_22, rlM_22) -> id_class.error("Couldn't load {} tag {} as it is missing following references: {}", (Object)this.id_case, rqO_22, (Object)rlM_22.id_break(function, function2).map(Objects::toString).collect(Collectors.joining(","))));
        return rlW_2.id_class(hashMap);
    }

    public CompletableFuture<Map<rqO_2, rlM_2>> id_class(rAL rAL2, Executor executor) {
        return CompletableFuture.supplyAsync(() -> {
            HashMap hashMap = Maps.newHashMap();
            for (rqO_2 rqO_23 : rAL2.id_class(this.id_throws, (String string) -> string.endsWith(".json"))) {
                String string2 = rqO_23.id_break();
                rqO_2 rqO_24 = new rqO_2(rqO_23.id_byte(), string2.substring(this.id_throws.length() + 1, string2.length() - id_byte));
                try {
                    for (rAF rAF2 : rAL2.id_byte(rqO_23)) {
                        try {
                            InputStream inputStream = rAF2.id_break();
                            try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));){
                                JsonObject jsonObject = rpY_2.id_class(id_break, (Reader)bufferedReader, JsonObject.class);
                                if (jsonObject == null) {
                                    id_class.error("Couldn't load {} tag list {} from {} in data pack {} as it is empty or null", (Object)this.id_case, (Object)rqO_24, (Object)rqO_23, (Object)rAF2.id_byte());
                                    continue;
                                }
                                hashMap.computeIfAbsent(rqO_24, rqO_22 -> rlM_2.id_class()).id_class(jsonObject, rAF2.id_byte());
                            }
                            finally {
                                if (inputStream == null) continue;
                                inputStream.close();
                            }
                        }
                        catch (IOException | RuntimeException exception) {
                            id_class.error("Couldn't read {} tag list {} from {} in data pack {}", (Object)this.id_case, (Object)rqO_24, (Object)rqO_23, (Object)rAF2.id_byte(), (Object)exception);
                        }
                        finally {
                            IOUtils.closeQuietly((Closeable)rAF2);
                        }
                    }
                }
                catch (IOException iOException) {
                    id_class.error("Couldn't read {} tag list {} from {}", (Object)this.id_case, (Object)rqO_24, (Object)rqO_23, (Object)iOException);
                }
            }
            return hashMap;
        }, executor);
    }
}

