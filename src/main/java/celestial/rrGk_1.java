/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DataFixer
 *  com.mojang.serialization.DynamicOps
 */
package celestial;

import celestial.rRJ;
import celestial.rTH;
import celestial.rVm_1;
import celestial.rYB;
import celestial.rcW_2;
import celestial.rcZ_2;
import celestial.rcd_3;
import celestial.rnu_3;
import celestial.rpC_2;
import celestial.rpz_3;
import celestial.rqM_2;
import celestial.rqR_2;
import celestial.rrED;
import celestial.rrGP;
import celestial.rrGW;
import celestial.rrGd_1;
import celestial.rrGm_1;
import celestial.rrGr_1;
import celestial.rrGx_1;
import celestial.rrGz_1;
import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.DynamicOps;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.ZipOutputStream;

public class rrGk_1
implements AutoCloseable {
    public final rnu_3 id_break;
    public final Path id_byte;
    private final String id_protected;
    private final Map<rrGr_1, Path> id_throws = new ConcurrentHashMap<rrGr_1, Path>();
    public final /* synthetic */ rrGd_1 id_class;

    public boolean id_byte() {
        rrGm_1 rrGm_12 = this.id_protected();
        return rrGm_12 != null && rrGm_12.id_finally().id_class() != this.id_class.id_protected();
    }

    public rrGk_1(rrGd_1 rrGd_12, String string) throws IOException {
        this.id_class = rrGd_12;
        this.id_protected = string;
        this.id_byte = rrGd_12.id_protected.resolve(string);
        this.id_break = rnu_3.id_class(this.id_byte);
    }

    public boolean id_class(rpC_2 rpC_22) {
        this.id_implements();
        return rrED.id_class(this, rpC_22);
    }

    public void id_class(String string) throws IOException {
        File file;
        this.id_implements();
        File file2 = new File(this.id_class.id_protected.toFile(), this.id_protected);
        if (file2.exists() && (file = new File(file2, "level.dat")).exists()) {
            rcd_3 rcd_32 = rcW_2.id_class(file);
            rcd_3 rcd_33 = rcd_32.id_int("Data");
            rcd_33.id_class("LevelName", string);
            rcW_2.id_class(rcd_32, file);
        }
    }

    public rrGP id_class(DynamicOps<rcZ_2> dynamicOps, rTH rTH2) {
        this.id_implements();
        return this.id_class.id_class(this.id_byte.toFile(), rrGd_1.id_class(dynamicOps, rTH2));
    }

    public void id_class(rVm_1 rVm_12, rrGP rrGP2, rcd_3 rcd_32) {
        File file = this.id_byte.toFile();
        rcd_3 rcd_33 = rrGP2.id_class(rVm_12, rcd_32);
        rcd_3 rcd_34 = new rcd_3();
        rcd_34.id_class("Data", rcd_33);
        try {
            File file2 = File.createTempFile("level", ".dat", file);
            rcW_2.id_class(rcd_34, file2);
            File file3 = new File(file, "level.dat_old");
            File file4 = new File(file, "level.dat");
            rqR_2.id_class(file4, file2, file3);
        }
        catch (Exception exception) {
            rrGd_1.id_class.error("Failed to save level {}", (Object)file, (Object)exception);
        }
    }

    public void id_class(rVm_1 rVm_12, rrGP rrGP2) {
        this.id_class(rVm_12, rrGP2, null);
    }

    public Path id_class(rrGr_1 rrGr_13) {
        return this.id_throws.computeIfAbsent(rrGr_13, rrGr_12 -> this.id_byte.resolve(rrGr_12.id_class()));
    }

    public File id_class(rqM_2<rYB> rqM_22) {
        return rRJ.id_class(rqM_22, this.id_byte.toFile());
    }

    public String id_class() {
        return this.id_protected;
    }

    @Override
    public void close() throws IOException {
        this.id_break.close();
    }

    public rrGx_1 id_break() {
        this.id_implements();
        return new rrGx_1(this, this.id_class.id_case);
    }

    public rTH id_throws() {
        this.id_implements();
        return this.id_class.id_class(this.id_byte.toFile(), (File file, DataFixer dataFixer) -> rrGd_1.id_class(file, dataFixer));
    }

    public void id_catch() throws IOException {
        this.id_implements();
        Path path = this.id_byte.resolve("session.lock");
        for (int i = 1; i <= 5; ++i) {
            rrGd_1.id_class.info("Attempt {}...", (Object)i);
            try {
                Files.walkFileTree(this.id_byte, new rrGW(this, path));
                break;
            }
            catch (IOException iOException) {
                if (i >= 5) {
                    throw iOException;
                }
                rrGd_1.id_class.warn("Failed to delete {}", (Object)this.id_byte, (Object)iOException);
                try {
                    Thread.sleep(500L);
                }
                catch (InterruptedException interruptedException) {
                    // empty catch block
                }
                continue;
            }
        }
    }

    public File id_case() {
        this.id_implements();
        return this.id_byte.resolve("icon.png").toFile();
    }

    private void id_implements() {
        if (!this.id_break.id_class()) {
            throw new IllegalStateException("Lock is no longer valid");
        }
    }

    public rrGm_1 id_protected() {
        this.id_implements();
        return this.id_class.id_class(this.id_byte.toFile(), this.id_class.id_class(this.id_byte.toFile(), false));
    }

    public long id_private() throws IOException {
        this.id_implements();
        String string = LocalDateTime.now().format(rrGd_1.id_break) + "_" + this.id_protected;
        Path path = this.id_class.id_byte();
        try {
            Files.createDirectories(Files.exists(path, new LinkOption[0]) ? path.toRealPath(new LinkOption[0]) : path, new FileAttribute[0]);
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
        Path path2 = path.resolve(rpz_3.id_class(path, string, ".zip"));
        try (ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(Files.newOutputStream(path2, new OpenOption[0])));){
            Path path3 = Paths.get(this.id_protected, new String[0]);
            Files.walkFileTree(this.id_byte, new rrGz_1(this, path3, zipOutputStream));
        }
        return Files.size(path2);
    }
}

