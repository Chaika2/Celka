/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.io.Files
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.mojang.authlib.Agent
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.GameProfileRepository
 *  com.mojang.authlib.ProfileLookupCallback
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.rCS;
import celestial.rCs_1;
import celestial.rhd_3;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.io.Files;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.mojang.authlib.Agent;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.ProfileLookupCallback;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Stream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rCB {
    private static final Logger id_class = LogManager.getLogger();
    private static boolean id_break;
    private final Map<String, rCs_1> id_byte = Maps.newConcurrentMap();
    private final Map<UUID, rCs_1> id_protected = Maps.newConcurrentMap();
    private final GameProfileRepository id_throws;
    private final Gson id_case = new GsonBuilder().create();
    private final File id_catch;
    private final AtomicLong id_private = new AtomicLong();

    private static boolean id_byte() {
        return id_break;
    }

    public rCB(GameProfileRepository gameProfileRepository, File file) {
        this.id_throws = gameProfileRepository;
        this.id_catch = file;
        Lists.reverse(this.id_class()).forEach(this::id_class);
    }

    private static JsonElement id_class(rCs_1 rCs_12, DateFormat dateFormat) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", rCs_12.id_class().getName());
        UUID uUID = rCs_12.id_class().getId();
        jsonObject.addProperty("uuid", uUID == null ? "" : uUID.toString());
        jsonObject.addProperty("expiresOn", dateFormat.format(rCs_12.id_break()));
        return jsonObject;
    }

    private Stream<rCs_1> id_class(int n) {
        return ImmutableList.copyOf(this.id_protected.values()).stream().sorted(Comparator.comparing(rCs_1::id_byte).reversed()).limit(n);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public List<rCs_1> id_class() {
        ArrayList arrayList = Lists.newArrayList();
        try (BufferedReader bufferedReader = Files.newReader((File)this.id_catch, (Charset)StandardCharsets.UTF_8);){
            JsonArray jsonArray = (JsonArray)this.id_case.fromJson((Reader)bufferedReader, JsonArray.class);
            if (jsonArray == null) {
                ArrayList arrayList2 = arrayList;
                return arrayList2;
            }
            DateFormat dateFormat = rCB.id_throws();
            jsonArray.forEach(jsonElement -> {
                rCs_1 rCs_12 = rCB.id_class(jsonElement, dateFormat);
                if (rCs_12 != null) {
                    arrayList.add(rCs_12);
                }
            });
            return arrayList;
        }
        catch (FileNotFoundException fileNotFoundException) {
            return arrayList;
        }
        catch (JsonParseException | IOException throwable) {
            id_class.warn("Failed to load profile cache {}", (Object)this.id_catch, (Object)throwable);
        }
        return arrayList;
    }

    private void id_class(rCs_1 rCs_12) {
        UUID uUID;
        GameProfile gameProfile = rCs_12.id_class();
        rCs_12.id_class(this.id_protected());
        String string = gameProfile.getName();
        if (string != null) {
            this.id_byte.put(string.toLowerCase(Locale.ROOT), rCs_12);
        }
        if ((uUID = gameProfile.getId()) != null) {
            this.id_protected.put(uUID, rCs_12);
        }
    }

    private static rCs_1 id_class(JsonElement jsonElement, DateFormat dateFormat) {
        if (jsonElement.isJsonObject()) {
            JsonObject jsonObject = jsonElement.getAsJsonObject();
            JsonElement jsonElement2 = jsonObject.get("name");
            JsonElement jsonElement3 = jsonObject.get("uuid");
            JsonElement jsonElement4 = jsonObject.get("expiresOn");
            if (jsonElement2 != null && jsonElement3 != null) {
                String string = jsonElement3.getAsString();
                String string2 = jsonElement2.getAsString();
                Date date = null;
                if (jsonElement4 != null) {
                    try {
                        date = dateFormat.parse(jsonElement4.getAsString());
                    }
                    catch (ParseException parseException) {
                        // empty catch block
                    }
                }
                if (string2 != null && string != null && date != null) {
                    UUID uUID;
                    try {
                        uUID = UUID.fromString(string);
                    }
                    catch (Throwable throwable) {
                        return null;
                    }
                    return new rCs_1(new GameProfile(uUID, string2), date);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static void id_class(boolean bl) {
        id_break = bl;
    }

    private static GameProfile id_class(GameProfileRepository gameProfileRepository, String string) {
        AtomicReference atomicReference = new AtomicReference();
        rCS rCS2 = new rCS(atomicReference);
        gameProfileRepository.findProfilesByNames(new String[]{string}, Agent.MINECRAFT, (ProfileLookupCallback)rCS2);
        GameProfile gameProfile = (GameProfile)atomicReference.get();
        if (!rCB.id_byte() && gameProfile == null) {
            UUID uUID = rhd_3.id_class(new GameProfile((UUID)null, string));
            gameProfile = new GameProfile(uUID, string);
        }
        return gameProfile;
    }

    public void id_class(GameProfile gameProfile) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(2, 1);
        Date date = calendar.getTime();
        rCs_1 rCs_12 = new rCs_1(gameProfile, date);
        this.id_class(rCs_12);
        this.id_break();
    }

    public GameProfile id_class(String string) {
        GameProfile gameProfile;
        String string2 = string.toLowerCase(Locale.ROOT);
        rCs_1 rCs_12 = this.id_byte.get(string2);
        boolean bl = false;
        if (rCs_12 != null && new Date().getTime() >= rCs_12.id_break.getTime()) {
            this.id_protected.remove(rCs_12.id_class().getId());
            this.id_byte.remove(rCs_12.id_class().getName().toLowerCase(Locale.ROOT));
            bl = true;
            rCs_12 = null;
        }
        if (rCs_12 != null) {
            rCs_12.id_class(this.id_protected());
            gameProfile = rCs_12.id_class();
        } else {
            gameProfile = rCB.id_class(this.id_throws, string2);
            if (gameProfile != null) {
                this.id_class(gameProfile);
                bl = false;
            }
        }
        if (bl) {
            this.id_break();
        }
        return gameProfile;
    }

    public GameProfile id_class(UUID uUID) {
        rCs_1 rCs_12 = this.id_protected.get(uUID);
        if (rCs_12 == null) {
            return null;
        }
        rCs_12.id_class(this.id_protected());
        return rCs_12.id_class();
    }

    public void id_break() {
        JsonArray jsonArray = new JsonArray();
        DateFormat dateFormat = rCB.id_throws();
        this.id_class(1000).forEach(rCs_12 -> jsonArray.add(rCB.id_class(rCs_12, dateFormat)));
        String string = this.id_case.toJson((JsonElement)jsonArray);
        try (BufferedWriter bufferedWriter = Files.newWriter((File)this.id_catch, (Charset)StandardCharsets.UTF_8);){
            bufferedWriter.write(string);
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    private static DateFormat id_throws() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
    }

    private long id_protected() {
        return this.id_private.incrementAndGet();
    }
}

