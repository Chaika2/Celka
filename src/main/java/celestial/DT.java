/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.hash.HashFunction
 *  com.google.common.hash.Hashing
 *  com.google.gson.Gson
 *  com.google.gson.JsonElement
 */
package celestial;

import celestial.Dn_1;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.Objects;

public interface DT {
    public static final HashFunction id_class = Hashing.sha1();

    public void id_class(Dn_1 var1) throws IOException;

    public static void id_class(Gson gson, Dn_1 dn_1, JsonElement jsonElement, Path path) throws IOException {
        String string = gson.toJson(jsonElement);
        String string2 = id_class.hashUnencodedChars((CharSequence)string).toString();
        if (!Objects.equals(dn_1.id_class(path), string2) || !Files.exists(path, new LinkOption[0])) {
            Files.createDirectories(path.getParent(), new FileAttribute[0]);
            try (BufferedWriter bufferedWriter = Files.newBufferedWriter(path, new OpenOption[0]);){
                bufferedWriter.write(string);
            }
        }
        dn_1.id_class(path, string2);
    }

    public String id_class();
}

