/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.mojang.bridge.game.GameVersion
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.rpY_2;
import celestial.rqu_3;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.mojang.bridge.game.GameVersion;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.UUID;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rpe_3
implements GameVersion {
    private static final Logger id_break = LogManager.getLogger();
    public static final GameVersion id_class = new rpe_3();
    private final String id_byte;
    private final String id_protected;
    private final boolean id_throws;
    private final int id_case;
    private final int id_catch;
    private final int id_private;
    private final Date id_implements;
    private final String id_finally;

    private rpe_3() {
        this.id_byte = UUID.randomUUID().toString().replaceAll("-", "");
        this.id_protected = "1.16.5";
        this.id_throws = true;
        this.id_case = 2586;
        this.id_catch = rqu_3.id_break();
        this.id_private = 6;
        this.id_implements = new Date();
        this.id_finally = "1.16.5";
    }

    private rpe_3(JsonObject jsonObject) {
        this.id_byte = rpY_2.id_case(jsonObject, "id");
        this.id_protected = rpY_2.id_case(jsonObject, "name");
        this.id_finally = rpY_2.id_case(jsonObject, "release_target");
        this.id_throws = rpY_2.id_private(jsonObject, "stable");
        this.id_case = rpY_2.id_extends(jsonObject, "world_version");
        this.id_catch = rpY_2.id_extends(jsonObject, "protocol_version");
        this.id_private = rpY_2.id_extends(jsonObject, "pack_version");
        this.id_implements = Date.from(ZonedDateTime.parse(rpY_2.id_case(jsonObject, "build_time")).toInstant());
    }

    public String getName() {
        return this.id_protected;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static GameVersion id_class() {
        try (InputStream inputStream = rpe_3.class.getResourceAsStream("/version.json");){
            rpe_3 rpe_32;
            if (inputStream == null) {
                id_break.warn("Missing version information!");
                GameVersion gameVersion = id_class;
                return gameVersion;
            }
            try (Object object = new InputStreamReader(inputStream);){
                rpe_32 = new rpe_3(rpY_2.id_class((Reader)object));
            }
            object = rpe_32;
            return object;
        }
        catch (JsonParseException | IOException throwable3) {
            throw new IllegalStateException("Game version information is corrupt", throwable3);
        }
    }

    public String getId() {
        return this.id_byte;
    }

    public boolean isStable() {
        return this.id_throws;
    }

    public String getReleaseTarget() {
        return this.id_finally;
    }

    public int getPackVersion() {
        return this.id_private;
    }

    public int getWorldVersion() {
        return this.id_case;
    }

    public Date getBuildTime() {
        return this.id_implements;
    }

    public int getProtocolVersion() {
        return this.id_catch;
    }
}

