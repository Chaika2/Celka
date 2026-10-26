/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  org.apache.commons.io.IOUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import com.google.common.base.Charsets;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Dn_1 {
    private static final Logger id_class = LogManager.getLogger();
    private final Path id_break;
    private final Path id_byte;
    private int id_protected;
    private final Map<Path, String> id_throws = Maps.newHashMap();
    private final Map<Path, String> id_case = Maps.newHashMap();
    private final Set<Path> id_catch = Sets.newHashSet();

    private Stream<Path> id_byte() throws IOException {
        return Files.walk(this.id_break, new FileVisitOption[0]).filter(path -> !Objects.equals(this.id_byte, path) && !Files.isDirectory(path, new LinkOption[0]));
    }

    public void id_byte(Path path) {
        this.id_catch.add(path);
    }

    public Dn_1(Path path2, String string2) throws IOException {
        this.id_break = path2;
        Path path3 = path2.resolve(".cache");
        Files.createDirectories(path3, new FileAttribute[0]);
        this.id_byte = path3.resolve(string2);
        this.id_byte().forEach(path -> {
            String string = this.id_throws.put((Path)path, "");
        });
        if (Files.isReadable(this.id_byte)) {
            IOUtils.readLines((InputStream)Files.newInputStream(this.id_byte, new OpenOption[0]), (Charset)Charsets.UTF_8).forEach(string -> {
                int n = string.indexOf(32);
                this.id_throws.put(path2.resolve(string.substring(n + 1)), string.substring(0, n));
            });
        }
    }

    public void id_class() throws IOException {
        BufferedWriter bufferedWriter;
        this.id_break();
        try {
            bufferedWriter = Files.newBufferedWriter(this.id_byte, new OpenOption[0]);
        }
        catch (IOException iOException) {
            id_class.warn("Unable write cachefile {}: {}", (Object)this.id_byte, (Object)iOException.toString());
            return;
        }
        IOUtils.writeLines((Collection)this.id_case.entrySet().stream().map(entry -> (String)entry.getValue() + " " + this.id_break.relativize((Path)entry.getKey())).collect(Collectors.toList()), (String)System.lineSeparator(), (Writer)bufferedWriter);
        ((Writer)bufferedWriter).close();
        id_class.debug("Caching: cache hits: {}, created: {} removed: {}", (Object)this.id_protected, (Object)(this.id_case.size() - this.id_protected), (Object)this.id_throws.size());
    }

    public void id_class(Path path, String string) {
        this.id_case.put(path, string);
        if (Objects.equals(this.id_throws.remove(path), string)) {
            ++this.id_protected;
        }
    }

    public String id_class(Path path) {
        return this.id_throws.get(path);
    }

    public boolean id_break(Path path) {
        return this.id_throws.containsKey(path);
    }

    private void id_break() throws IOException {
        this.id_byte().forEach(path -> {
            if (this.id_break((Path)path) && !this.id_catch.contains(path)) {
                try {
                    Files.delete(path);
                }
                catch (IOException iOException) {
                    id_class.debug("Unable to delete: {} ({})", path, (Object)iOException.toString());
                }
            }
        });
    }
}

