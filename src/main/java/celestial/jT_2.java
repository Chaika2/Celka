/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.jo_3;
import celestial.rqO_2;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class jT_2
extends jo_3 {
    private final File id_break;

    public jT_2(File file) {
        this.id_break = file;
    }

    @Override
    public File id_class(rqO_2 rqO_22) {
        return new File(this.id_break, rqO_22.toString().replace(':', '/'));
    }

    @Override
    public File id_class(String string) {
        return new File(this.id_break, string);
    }

    @Override
    public Collection<rqO_2> id_class(String string, String string2, int n, Predicate<String> predicate) {
        block10: {
            Collection collection;
            block9: {
                Path path3 = this.id_break.toPath().resolve(string2);
                Stream<Path> stream = Files.walk(path3.resolve(string), n, new FileVisitOption[0]);
                try {
                    collection = stream.filter(path -> Files.isRegularFile(path, new LinkOption[0])).filter(path -> !path.endsWith(".mcmeta")).filter(path -> predicate.test(path.getFileName().toString())).map(path2 -> new rqO_2(string2, path3.relativize((Path)path2).toString().replaceAll("\\\\", "/"))).collect(Collectors.toList());
                    if (stream == null) break block9;
                }
                catch (Throwable throwable) {
                    try {
                        if (stream != null) {
                            try {
                                stream.close();
                            }
                            catch (Throwable throwable2) {
                                throwable.addSuppressed(throwable2);
                            }
                        }
                        throw throwable;
                    }
                    catch (NoSuchFileException noSuchFileException) {
                        break block10;
                    }
                    catch (IOException iOException) {
                        id_class.warn("Unable to getFiles on {}", (Object)string, (Object)iOException);
                    }
                }
                stream.close();
            }
            return collection;
        }
        return Collections.emptyList();
    }
}

