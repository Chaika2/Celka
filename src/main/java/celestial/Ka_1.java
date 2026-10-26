/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Sets
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonElement
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.DA;
import celestial.DT;
import celestial.Dn_1;
import celestial.OT;
import celestial.UN;
import celestial.UQ;
import celestial.Uc_1;
import celestial.Um_1;
import celestial.Uu_1;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import java.io.IOException;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.List;
import java.util.function.Consumer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Ka_1
implements DT {
    private static final Logger id_break = LogManager.getLogger();
    private static final Gson id_byte = new GsonBuilder().setPrettyPrinting().create();
    private final DA id_protected;
    private final List<Consumer<Consumer<OT>>> id_throws = ImmutableList.of((Object)new UN(), (Object)new Uc_1(), (Object)new UQ(), (Object)new Uu_1(), (Object)new Um_1());

    public Ka_1(DA dA) {
        this.id_protected = dA;
    }

    @Override
    public String id_class() {
        return "Advancements";
    }

    @Override
    public void id_class(Dn_1 dn_1) throws IOException {
        Path path = this.id_protected.id_break();
        HashSet hashSet = Sets.newHashSet();
        Consumer<OT> consumer = oT -> {
            if (!hashSet.add(oT.id_private())) {
                throw new IllegalStateException("Duplicate advancement " + oT.id_private());
            }
            Path path2 = Ka_1.id_class(path, oT);
            try {
                DT.id_class(id_byte, dn_1, (JsonElement)oT.id_class().id_break(), path2);
            }
            catch (IOException iOException) {
                id_break.error("Couldn't save advancement {}", (Object)path2, (Object)iOException);
            }
        };
        for (Consumer<Consumer<OT>> consumer2 : this.id_throws) {
            consumer2.accept(consumer);
        }
    }

    private static Path id_class(Path path, OT oT) {
        return path.resolve("data/" + oT.id_private().id_byte() + "/advancements/" + oT.id_private().id_break() + ".json");
    }
}

