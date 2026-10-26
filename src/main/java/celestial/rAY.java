/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.rAC;
import celestial.rAH;
import celestial.rAI;
import celestial.rAW;
import celestial.rAo_1;
import celestial.rqO_2;
import celestial.rqR_2;
import celestial.rqi_3;
import celestial.rrxr_3;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.FileSystem;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rAY
implements rAC {
    public static Path id_class;
    private static final Logger id_protected;
    public static Class<?> id_break;
    private static final Map<rAI, FileSystem> id_throws;
    public final Set<String> id_byte;
    private static final boolean id_case;
    private static final boolean id_catch;

    protected InputStream id_byte(rAI rAI2, rqO_2 rqO_22) {
        Object object;
        String string = rAY.id_protected(rAI2, rqO_22);
        if (id_class != null && Files.exists((Path)(object = id_class.resolve(rAI2.id_class() + "/" + rqO_22.id_byte() + "/" + rqO_22.id_break())), new LinkOption[0])) {
            try {
                return Files.newInputStream((Path)object, new OpenOption[0]);
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
        try {
            object = rAY.class.getResource(string);
            return rAY.id_class(string, (URL)object) ? (id_catch ? this.id_class(rAI2, string) : ((URL)object).openStream()) : null;
        }
        catch (IOException iOException) {
            return rAY.class.getResourceAsStream(string);
        }
    }

    public rAY(String ... stringArray) {
        this.id_byte = ImmutableSet.copyOf((Object[])stringArray);
    }

    static {
        id_protected = LogManager.getLogger();
        id_throws = rqR_2.id_class(Maps.newHashMap(), (T hashMap) -> {
            Class<rAY> clazz = rAY.class;
            synchronized (rAY.class) {
                for (rAI rAI2 : rAI.values()) {
                    URL uRL = rAY.class.getResource("/" + rAI2.id_class() + "/.mcassetsroot");
                    try {
                        FileSystem fileSystem;
                        URI uRI = uRL.toURI();
                        if (!"jar".equals(uRI.getScheme())) continue;
                        try {
                            fileSystem = FileSystems.getFileSystem(uRI);
                        }
                        catch (FileSystemNotFoundException fileSystemNotFoundException) {
                            fileSystem = FileSystems.newFileSystem(uRI, Collections.emptyMap());
                        }
                        hashMap.put(rAI2, fileSystem);
                    }
                    catch (IOException | URISyntaxException exception) {
                        id_protected.error("Couldn't get a list of all vanilla resources", (Throwable)exception);
                    }
                }
                // ** MonitorExit[var1_1] (shouldn't be in output)
                return;
            }
        });
        id_case = rqR_2.id_implements() == rqi_3.WINDOWS;
        id_catch = rrxr_3.rb.id_byte();
    }

    private InputStream id_class(rAI rAI2, String string) {
        try {
            FileSystem fileSystem = id_throws.get((Object)rAI2);
            return fileSystem != null ? Files.newInputStream(fileSystem.getPath(string, new String[0]), new OpenOption[0]) : rAY.class.getResourceAsStream(string);
        }
        catch (IOException iOException) {
            return rAY.class.getResourceAsStream(string);
        }
    }

    private static boolean id_class(File file, String string) throws IOException {
        String string2 = file.getPath();
        if (string2.startsWith("file:")) {
            if (id_case) {
                string2 = string2.replace("\\", "/");
            }
            return string2.endsWith(string);
        }
        return rAW.id_class(file, string);
    }

    @Override
    public String id_class() {
        return "Default";
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public <T> T id_class(rAo_1<T> rAo_12) throws IOException {
        try (InputStream inputStream = this.id_class("pack.mcmeta");){
            T t = rAH.id_class(rAo_12, inputStream);
            return t;
        }
        catch (FileNotFoundException | RuntimeException exception) {
            return null;
        }
    }

    @Override
    public Set<String> id_class(rAI rAI2) {
        return this.id_byte;
    }

    private static boolean id_class(String string, URL uRL) throws IOException {
        return uRL != null && (uRL.getProtocol().equals("jar") || rAY.id_class(new File(uRL.getFile()), string));
    }

    @Override
    public InputStream id_class(rAI rAI2, rqO_2 rqO_22) throws IOException {
        InputStream inputStream = this.id_byte(rAI2, rqO_22);
        if (inputStream != null) {
            return inputStream;
        }
        throw new FileNotFoundException(rqO_22.id_break());
    }

    private static void id_class(Collection<rqO_2> collection, int n, String string, Path path3, String string2, Predicate<String> predicate) throws IOException {
        Path path4 = path3.resolve(string);
        try (Stream<Path> stream = Files.walk(path4.resolve(string2), n, new FileVisitOption[0]);){
            stream.filter(path -> !path.endsWith(".mcmeta") && Files.isRegularFile(path, new LinkOption[0]) && predicate.test(path.getFileName().toString())).map(path2 -> new rqO_2(string, path4.relativize((Path)path2).toString().replaceAll("\\\\", "/"))).forEach(collection::add);
        }
    }

    @Override
    public Collection<rqO_2> id_class(rAI rAI2, String string, String string2, int n, Predicate<String> predicate) {
        URI uRI;
        Object object;
        HashSet hashSet = Sets.newHashSet();
        if (id_class != null) {
            try {
                rAY.id_class(hashSet, n, string, id_class.resolve(rAI2.id_class()), string2, predicate);
            }
            catch (IOException iOException) {
                // empty catch block
            }
            if (rAI2 == rAI.CLIENT_RESOURCES) {
                object = null;
                try {
                    object = id_break.getClassLoader().getResources(rAI2.id_class() + "/");
                }
                catch (IOException iOException) {
                    // empty catch block
                }
                while (object != null && object.hasMoreElements()) {
                    try {
                        uRI = ((URL)object.nextElement()).toURI();
                        if (!"file".equals(uRI.getScheme())) continue;
                        rAY.id_class(hashSet, n, string, Paths.get(uRI), string2, predicate);
                    }
                    catch (IOException | URISyntaxException exception) {}
                }
            }
        }
        try {
            object = rAY.class.getResource("/" + rAI2.id_class() + "/.mcassetsroot");
            if (object == null) {
                id_protected.error("Couldn't find .mcassetsroot, cannot load vanilla resources");
                return hashSet;
            }
            uRI = ((URL)object).toURI();
            if ("file".equals(uRI.getScheme())) {
                URL uRL = new URL(((URL)object).toString().substring(0, ((URL)object).toString().length() - ".mcassetsroot".length()));
                Path path = Paths.get(uRL.toURI());
                rAY.id_class(hashSet, n, string, path, string2, predicate);
            } else if ("jar".equals(uRI.getScheme())) {
                Path path = id_throws.get((Object)rAI2).getPath("/" + rAI2.id_class(), new String[0]);
                rAY.id_class(hashSet, n, "minecraft", path, string2, predicate);
            } else {
                id_protected.error("Unsupported scheme {} trying to list vanilla resources (NYI?)", (Object)uRI);
            }
        }
        catch (FileNotFoundException | NoSuchFileException iOException) {
        }
        catch (IOException | URISyntaxException exception) {
            id_protected.error("Couldn't get a list of all vanilla resources", (Throwable)exception);
        }
        return hashSet;
    }

    @Override
    public InputStream id_class(String string) throws IOException {
        if (!string.contains("/") && !string.contains("\\")) {
            Path path;
            if (id_class != null && Files.exists(path = id_class.resolve(string), new LinkOption[0])) {
                return Files.newInputStream(path, new OpenOption[0]);
            }
            return this.id_break(string);
        }
        throw new IllegalArgumentException("Root resources can only be filenames, not paths (no / allowed!)");
    }

    @Override
    public void close() {
    }

    @Override
    public boolean id_break(rAI rAI2, rqO_2 rqO_22) {
        Object object;
        String string = rAY.id_protected(rAI2, rqO_22);
        Object var4_4 = null;
        if (id_class != null && Files.exists((Path)(object = id_class.resolve(rAI2.id_class() + "/" + rqO_22.id_byte() + "/" + rqO_22.id_break())), new LinkOption[0])) {
            return true;
        }
        try {
            object = rAY.class.getResource(string);
            return rAY.id_class(string, (URL)object);
        }
        catch (IOException iOException) {
            return false;
        }
    }

    protected InputStream id_break(String string) {
        return id_catch ? this.id_class(rAI.SERVER_DATA, "/" + string) : rAY.class.getResourceAsStream("/" + string);
    }

    private static String id_protected(rAI rAI2, rqO_2 rqO_22) {
        return "/" + rAI2.id_class() + "/" + rqO_22.id_byte() + "/" + rqO_22.id_break();
    }
}

