/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  org.apache.commons.io.FileUtils
 *  org.apache.commons.io.IOUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.DA;
import celestial.DT;
import celestial.Dn_1;
import celestial.UP;
import celestial.Ur_1;
import celestial.rcH_2;
import celestial.rcW_2;
import celestial.rcd_3;
import celestial.rqR_2;
import com.google.common.collect.Lists;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Di_1
implements DT {
    private static final Path id_break = null;
    private static final Logger id_byte = LogManager.getLogger();
    private final DA id_protected;
    private final List<Ur_1> id_throws = Lists.newArrayList();

    public Di_1(DA dA) {
        this.id_protected = dA;
    }

    private void id_class(Dn_1 dn_1, UP uP, Path path) {
        Path path2;
        if (uP.id_byte != null) {
            path2 = id_break.resolve(uP.id_class + ".snbt");
            try {
                FileUtils.write((File)path2.toFile(), (CharSequence)uP.id_byte, (Charset)StandardCharsets.UTF_8);
            }
            catch (IOException iOException) {
                id_byte.error("Couldn't write structure SNBT {} at {}", (Object)uP.id_class, (Object)path2, (Object)iOException);
            }
        }
        path2 = path.resolve(uP.id_class + ".nbt");
        try {
            if (!Objects.equals(dn_1.id_class(path2), uP.id_protected) || !Files.exists(path2, new LinkOption[0])) {
                Files.createDirectories(path2.getParent(), new FileAttribute[0]);
                try (OutputStream outputStream = Files.newOutputStream(path2, new OpenOption[0]);){
                    outputStream.write(uP.id_break);
                }
            }
            dn_1.id_class(path2, uP.id_protected);
        }
        catch (IOException iOException) {
            id_byte.error("Couldn't write structure {} at {}", (Object)uP.id_class, (Object)path2, (Object)iOException);
        }
    }

    private UP id_class(Path path, String string) {
        block10: {
            UP uP;
            block9: {
                BufferedReader bufferedReader = Files.newBufferedReader(path);
                try {
                    String string2 = IOUtils.toString((Reader)bufferedReader);
                    rcd_3 rcd_32 = this.id_class(string, rcH_2.id_class(string2));
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    rcW_2.id_class(rcd_32, byteArrayOutputStream);
                    byte[] byArray = byteArrayOutputStream.toByteArray();
                    String string3 = id_class.hashBytes(byArray).toString();
                    String string4 = id_break != null ? rcd_32.id_class("    ", 0).getString() + "\n" : null;
                    uP = new UP(string, byArray, string4, string3);
                    if (bufferedReader == null) break block9;
                }
                catch (Throwable throwable) {
                    try {
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            }
                            catch (Throwable throwable2) {
                                throwable.addSuppressed(throwable2);
                            }
                        }
                        throw throwable;
                    }
                    catch (CommandSyntaxException commandSyntaxException) {
                        id_byte.error("Couldn't convert {} from SNBT to NBT at {} as it's invalid SNBT", (Object)string, (Object)path, (Object)commandSyntaxException);
                        break block10;
                    }
                    catch (IOException iOException) {
                        id_byte.error("Couldn't convert {} from SNBT to NBT at {}", (Object)string, (Object)path, (Object)iOException);
                    }
                }
                bufferedReader.close();
            }
            return uP;
        }
        return null;
    }

    @Override
    public void id_class(Dn_1 dn_1) throws IOException {
        Path path3 = this.id_protected.id_break();
        ArrayList arrayList = Lists.newArrayList();
        for (Path path4 : this.id_protected.id_class()) {
            Files.walk(path4, new FileVisitOption[0]).filter(path -> path.toString().endsWith(".snbt")).forEach(path2 -> arrayList.add(CompletableFuture.supplyAsync(() -> this.id_class((Path)path2, this.id_class(path4, (Path)path2)), rqR_2.id_case())));
        }
        rqR_2.id_break(arrayList).join().stream().filter(Objects::nonNull).forEach(uP -> this.id_class(dn_1, (UP)uP, path3));
    }

    private rcd_3 id_class(String string, rcd_3 rcd_32) {
        rcd_3 rcd_33 = rcd_32;
        for (Ur_1 ur_1 : this.id_throws) {
            rcd_33 = ur_1.id_class(string, rcd_33);
        }
        return rcd_33;
    }

    @Override
    public String id_class() {
        return "SNBT -> NBT";
    }

    private String id_class(Path path, Path path2) {
        String string = path.relativize(path2).toString().replaceAll("\\\\", "/");
        return string.substring(0, string.length() - ".snbt".length());
    }

    public Di_1 id_class(Ur_1 ur_1) {
        this.id_throws.add(ur_1);
        return this;
    }
}

