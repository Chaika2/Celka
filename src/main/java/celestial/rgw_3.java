/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.internal.Streams
 *  com.google.gson.stream.JsonReader
 *  com.google.gson.stream.JsonWriter
 *  com.mojang.authlib.GameProfile
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.rgI_2;
import celestial.rgV_2;
import celestial.rgf_3;
import celestial.rgj_3;
import celestial.rpY_2;
import celestial.rqu_3;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.internal.Streams;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.mojang.authlib.GameProfile;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rgw_3
implements AutoCloseable {
    private static final Logger id_class = LogManager.getLogger();
    private static final AtomicInteger id_break = new AtomicInteger(1);
    private static final ThreadFactory id_byte = runnable -> {
        Thread thread = new Thread(runnable);
        thread.setName("Chat-Filter-Worker-" + id_break.getAndIncrement());
        return thread;
    };
    private final URL id_protected = null;
    public final URL id_throws = null;
    public final URL id_case = null;
    private final String id_catch;
    private final int id_private;
    private final String id_implements;
    public final rgf_3 id_finally = null;
    public final ExecutorService id_extends = null;

    private HttpURLConnection id_byte(JsonObject jsonObject, URL uRL) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection)uRL.openConnection();
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setReadTimeout(2000);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
        httpURLConnection.setRequestProperty("Accept", "application/json");
        httpURLConnection.setRequestProperty("Authorization", "Basic " + this.id_catch);
        httpURLConnection.setRequestProperty("User-Agent", "Minecraft server" + rqu_3.id_class().getName());
        try (OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream(), StandardCharsets.UTF_8);
             JsonWriter jsonWriter = new JsonWriter((Writer)outputStreamWriter);){
            Streams.write((JsonElement)jsonObject, (JsonWriter)jsonWriter);
        }
        int n = httpURLConnection.getResponseCode();
        if (n >= 200 && n < 300) {
            return httpURLConnection;
        }
        throw new rgI_2(n + " " + httpURLConnection.getResponseMessage());
    }

    private rgw_3() {
        this.id_catch = null;
        this.id_private = 0;
        this.id_implements = null;
        throw new RuntimeException("Synthetic constructor added by MCP, do not call");
    }

    public CompletableFuture<Optional<String>> id_class(GameProfile gameProfile, String string, rgf_3 rgf_32, Executor executor) {
        if (string.isEmpty()) {
            return CompletableFuture.completedFuture(Optional.of(""));
        }
        JsonObject jsonObject = new JsonObject();
        Objects.requireNonNull(this);
        jsonObject.addProperty("rule", (Number)0);
        jsonObject.addProperty("server", this.id_implements);
        jsonObject.addProperty("room", "Chat");
        jsonObject.addProperty("player", gameProfile.getId().toString());
        jsonObject.addProperty("player_display_name", gameProfile.getName());
        jsonObject.addProperty("text", string);
        return CompletableFuture.supplyAsync(() -> {
            try {
                JsonObject jsonObject2 = this.id_class(jsonObject, this.id_protected);
                boolean bl = rpY_2.id_class(jsonObject2, "response", false);
                if (bl) {
                    return Optional.of(string);
                }
                String string2 = rpY_2.id_class(jsonObject2, "hashed", (String)null);
                if (string2 == null) {
                    return Optional.empty();
                }
                int n = rpY_2.id_volatile(jsonObject2, "hashes").size();
                return rgf_32.shouldIgnore(string2, n) ? Optional.empty() : Optional.of(string2);
            }
            catch (Exception exception) {
                id_class.warn("Failed to validate message '{}'", (Object)string, (Object)exception);
                return Optional.empty();
            }
        }, executor);
    }

    public void id_class(GameProfile gameProfile, URL uRL, Executor executor) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("server", this.id_implements);
        jsonObject.addProperty("room", "Chat");
        jsonObject.addProperty("user_id", gameProfile.getId().toString());
        jsonObject.addProperty("user_display_name", gameProfile.getName());
        executor.execute(() -> {
            try {
                this.id_break(jsonObject, uRL);
            }
            catch (Exception exception) {
                id_class.warn("Failed to send join/leave packet to {} for player {}", (Object)uRL, (Object)gameProfile, (Object)exception);
            }
        });
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private JsonObject id_class(JsonObject jsonObject, URL uRL) throws IOException {
        JsonObject jsonObject2;
        HttpURLConnection httpURLConnection = this.id_byte(jsonObject, uRL);
        try (InputStream inputStream = httpURLConnection.getInputStream();){
            if (httpURLConnection.getResponseCode() != 204) {
                try {
                    JsonObject jsonObject3 = Streams.parse((JsonReader)new JsonReader((Reader)new InputStreamReader(inputStream))).getAsJsonObject();
                    return jsonObject3;
                }
                finally {
                    this.id_class(inputStream);
                }
            }
            jsonObject2 = new JsonObject();
        }
        return jsonObject2;
    }

    private void id_class(InputStream inputStream) throws IOException {
        byte[] byArray = new byte[1024];
        while (inputStream.read(byArray) != -1) {
        }
    }

    public rgV_2 id_class(GameProfile gameProfile) {
        return new rgj_3(this, gameProfile);
    }

    @Override
    public void close() {
        this.id_extends.shutdownNow();
    }

    private void id_break(JsonObject jsonObject, URL uRL) throws IOException {
        HttpURLConnection httpURLConnection = this.id_byte(jsonObject, uRL);
        try (InputStream inputStream = httpURLConnection.getInputStream();){
            this.id_class(inputStream);
        }
    }
}

