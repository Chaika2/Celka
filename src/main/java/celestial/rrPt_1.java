/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.DataFixer
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.rAF;
import celestial.rAL;
import celestial.rTv_1;
import celestial.rcW_2;
import celestial.rcd_3;
import celestial.rco_3;
import celestial.rpz_3;
import celestial.rqO_2;
import celestial.rqX_2;
import celestial.rrGk_1;
import celestial.rrGr_1;
import celestial.rrPl_1;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixer;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rrPt_1 {
    private static final Logger id_class = LogManager.getLogger();
    private final Map<rqO_2, rrPl_1> id_break = Maps.newHashMap();
    private final DataFixer id_byte;
    private rAL id_protected;
    private final Path id_throws;

    public boolean id_byte(rqO_2 rqO_22) {
        boolean bl;
        rrPl_1 rrPl_12 = this.id_break.get(rqO_22);
        if (rrPl_12 == null) {
            return false;
        }
        Path path = this.id_break(rqO_22, ".nbt");
        Path path2 = path.getParent();
        if (path2 == null) {
            return false;
        }
        try {
            Files.createDirectories(Files.exists(path2, new LinkOption[0]) ? path2.toRealPath(new LinkOption[0]) : path2, new FileAttribute[0]);
        }
        catch (IOException iOException) {
            id_class.error("Failed to create parent directory: {}", (Object)path2);
            return false;
        }
        rcd_3 rcd_32 = rrPl_12.id_class(new rcd_3());
        FileOutputStream fileOutputStream = new FileOutputStream(path.toFile());
        try {
            rcW_2.id_class(rcd_32, fileOutputStream);
            bl = true;
        }
        catch (Throwable throwable) {
            try {
                try {
                    ((OutputStream)fileOutputStream).close();
                }
                catch (Throwable throwable2) {
                    throwable.addSuppressed(throwable2);
                }
                throw throwable;
            }
            catch (Throwable throwable3) {
                return false;
            }
        }
        ((OutputStream)fileOutputStream).close();
        return bl;
    }

    public rrPt_1(rAL rAL2, rrGk_1 rrGk_12, DataFixer dataFixer) {
        this.id_protected = rAL2;
        this.id_byte = dataFixer;
        this.id_throws = rrGk_12.id_class(rrGr_1.id_case).normalize();
    }

    private rrPl_1 id_class(InputStream inputStream) throws IOException {
        rcd_3 rcd_32 = rcW_2.id_class(inputStream);
        return this.id_class(rcd_32);
    }

    public rrPl_1 id_class(rqO_2 rqO_22) {
        rrPl_1 rrPl_12 = this.id_break(rqO_22);
        if (rrPl_12 == null) {
            rrPl_12 = new rrPl_1();
            this.id_break.put(rqO_22, rrPl_12);
        }
        return rrPl_12;
    }

    public Path id_class(rqO_2 rqO_22, String string) {
        try {
            Path path = this.id_throws.resolve(rqO_22.id_byte());
            Path path2 = path.resolve("structures");
            return rpz_3.id_break(path2, rqO_22.id_break(), string);
        }
        catch (InvalidPathException invalidPathException) {
            throw new rqX_2("Invalid resource path: " + rqO_22, invalidPathException);
        }
    }

    public rrPl_1 id_class(rcd_3 rcd_32) {
        if (!rcd_32.id_byte("DataVersion", 99)) {
            rcd_32.id_break("DataVersion", 500);
        }
        rrPl_1 rrPl_12 = new rrPl_1();
        rrPl_12.id_break(rco_3.id_class(this.id_byte, rTv_1.STRUCTURE, rcd_32, rcd_32.id_private("DataVersion")));
        return rrPl_12;
    }

    public void id_class(rAL rAL2) {
        this.id_protected = rAL2;
        this.id_break.clear();
    }

    public rrPl_1 id_break(rqO_2 rqO_23) {
        return this.id_break.computeIfAbsent(rqO_23, rqO_22 -> {
            rrPl_1 rrPl_12 = this.id_case((rqO_2)rqO_22);
            return rrPl_12 != null ? rrPl_12 : this.id_throws((rqO_2)rqO_22);
        });
    }

    private Path id_break(rqO_2 rqO_22, String string) {
        if (rqO_22.id_break().contains("//")) {
            throw new rqX_2("Invalid resource path: " + rqO_22);
        }
        Path path = this.id_class(rqO_22, string);
        if (path.startsWith(this.id_throws) && rpz_3.id_class(path) && rpz_3.id_break(path)) {
            return path;
        }
        throw new rqX_2("Invalid resource path: " + path);
    }

    private rrPl_1 id_throws(rqO_2 rqO_22) {
        rrPl_1 rrPl_12;
        block9: {
            rqO_2 rqO_23 = new rqO_2(rqO_22.id_byte(), "structures/" + rqO_22.id_break() + ".nbt");
            rAF rAF2 = this.id_protected.id_class(rqO_23);
            try {
                rrPl_12 = this.id_class(rAF2.id_break());
                if (rAF2 == null) break block9;
            }
            catch (Throwable throwable) {
                try {
                    if (rAF2 != null) {
                        try {
                            rAF2.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                catch (FileNotFoundException fileNotFoundException) {
                    return null;
                }
                catch (Throwable throwable3) {
                    id_class.error("Couldn't load structure {}: {}", (Object)rqO_22, (Object)throwable3.toString());
                    return null;
                }
            }
            rAF2.close();
        }
        return rrPl_12;
    }

    private rrPl_1 id_case(rqO_2 rqO_22) {
        rrPl_1 rrPl_12;
        if (!this.id_throws.toFile().isDirectory()) {
            return null;
        }
        Path path = this.id_break(rqO_22, ".nbt");
        FileInputStream fileInputStream = new FileInputStream(path.toFile());
        try {
            rrPl_12 = this.id_class(fileInputStream);
        }
        catch (Throwable throwable) {
            try {
                try {
                    ((InputStream)fileInputStream).close();
                }
                catch (Throwable throwable2) {
                    throwable.addSuppressed(throwable2);
                }
                throw throwable;
            }
            catch (FileNotFoundException fileNotFoundException) {
                return null;
            }
            catch (IOException iOException) {
                id_class.error("Couldn't load structure from {}", (Object)path, (Object)iOException);
                return null;
            }
        }
        ((InputStream)fileInputStream).close();
        return rrPl_12;
    }

    public void id_protected(rqO_2 rqO_22) {
        this.id_break.remove(rqO_22);
    }
}

