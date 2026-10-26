/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.DA;
import celestial.DT;
import celestial.Dn_1;
import celestial.Ud_1;
import celestial.rVL;
import celestial.rlM_2;
import celestial.rlO_2;
import celestial.rlb_3;
import celestial.rlm_3;
import celestial.rqO_2;
import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class Ux_1<T>
implements DT {
    private static final Logger id_protected = LogManager.getLogger();
    private static final Gson id_throws = new GsonBuilder().setPrettyPrinting().create();
    protected final DA id_break;
    protected final rVL<T> id_byte;
    private final Map<rqO_2, rlM_2> id_case = Maps.newLinkedHashMap();

    protected Ux_1(DA dA, rVL<T> rVL2) {
        this.id_break = dA;
        this.id_byte = rVL2;
    }

    @Override
    public void id_class(Dn_1 dn_1) {
        this.id_case.clear();
        this.id_break();
        rlm_3 rlm_32 = rlm_3.id_break();
        Function<rqO_2, rlb_3> function = rqO_22 -> this.id_case.containsKey(rqO_22) ? rlm_32 : null;
        Function<rqO_2, Object> function2 = rqO_22 -> this.id_byte.id_break((rqO_2)rqO_22).orElse(null);
        this.id_case.forEach((rqO_22, rlM_22) -> {
            List list = rlM_22.id_break(function, function2).collect(Collectors.toList());
            if (!list.isEmpty()) {
                throw new IllegalArgumentException(String.format("Couldn't define tag %s as it is missing following references: %s", rqO_22, list.stream().map(Objects::toString).collect(Collectors.joining(","))));
            }
            JsonObject jsonObject = rlM_22.id_byte();
            Path path = this.id_class((rqO_2)rqO_22);
            try {
                String string = id_throws.toJson((JsonElement)jsonObject);
                String string2 = id_class.hashUnencodedChars((CharSequence)string).toString();
                if (!Objects.equals(dn_1.id_class(path), string2) || !Files.exists(path, new LinkOption[0])) {
                    Files.createDirectories(path.getParent(), new FileAttribute[0]);
                    try (BufferedWriter bufferedWriter = Files.newBufferedWriter(path, new OpenOption[0]);){
                        bufferedWriter.write(string);
                    }
                }
                dn_1.id_class(path, string2);
            }
            catch (IOException iOException) {
                id_protected.error("Couldn't save tags to {}", (Object)path, (Object)iOException);
            }
        });
    }

    protected Ud_1<T> id_class(rlO_2<T> rlO_22) {
        rlM_2 rlM_22 = this.id_break(rlO_22);
        return new Ud_1<T>(rlM_22, this.id_byte, "vanilla");
    }

    protected abstract Path id_class(rqO_2 var1);

    protected rlM_2 id_break(rlO_2<T> rlO_22) {
        return this.id_case.computeIfAbsent(rlO_22.id_break(), rqO_22 -> new rlM_2());
    }

    protected abstract void id_break();
}

