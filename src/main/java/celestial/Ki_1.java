/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonElement
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.JsonOps
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.DA;
import celestial.DT;
import celestial.Dn_1;
import celestial.rVy_1;
import celestial.rYG;
import celestial.rqM_2;
import celestial.rqO_2;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.JsonOps;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Ki_1
implements DT {
    private static final Logger id_break = LogManager.getLogger();
    private static final Gson id_byte = new GsonBuilder().setPrettyPrinting().create();
    private final DA id_protected;

    public Ki_1(DA dA) {
        this.id_protected = dA;
    }

    @Override
    public String id_class() {
        return "Biomes";
    }

    @Override
    public void id_class(Dn_1 dn_1) {
        Path path = this.id_protected.id_break();
        for (Map.Entry<rqM_2<rYG>, rYG> entry : rVy_1.id_implements.id_throws()) {
            Path path2 = Ki_1.id_class(path, entry.getKey().id_class());
            rYG rYG2 = entry.getValue();
            Function function = JsonOps.INSTANCE.withEncoder(rYG.id_protected);
            try {
                Optional optional = ((DataResult)function.apply(() -> rYG2)).result();
                if (optional.isPresent()) {
                    DT.id_class(id_byte, dn_1, (JsonElement)optional.get(), path2);
                    continue;
                }
                id_break.error("Couldn't serialize biome {}", (Object)path2);
            }
            catch (IOException iOException) {
                id_break.error("Couldn't save biome {}", (Object)path2, (Object)iOException);
            }
        }
    }

    private static Path id_class(Path path, rqO_2 rqO_22) {
        return path.resolve("reports/biomes/" + rqO_22.id_break() + ".json");
    }
}

