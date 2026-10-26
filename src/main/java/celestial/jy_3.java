/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  org.apache.commons.codec.digest.DigestUtils
 *  org.apache.commons.io.FileUtils
 *  org.apache.commons.io.comparator.LastModifiedFileComparator
 *  org.apache.commons.io.filefilter.IOFileFilter
 *  org.apache.commons.io.filefilter.TrueFileFilter
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.QY;
import celestial.je_3;
import celestial.jo_3;
import celestial.jp_3;
import celestial.jq_3;
import celestial.rAC;
import celestial.rAK;
import celestial.rAT;
import celestial.rAW;
import celestial.rAY;
import celestial.rAZ;
import celestial.rAk_1;
import celestial.rAl_1;
import celestial.rAm_1;
import celestial.rAp_1;
import celestial.rAq_1;
import celestial.rgn_3;
import celestial.rpu_3;
import celestial.rqO_2;
import celestial.rqR_2;
import celestial.rqu_3;
import celestial.vY_2;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.comparator.LastModifiedFileComparator;
import org.apache.commons.io.filefilter.IOFileFilter;
import org.apache.commons.io.filefilter.TrueFileFilter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class jy_3
implements rAm_1 {
    private static final Logger id_class = LogManager.getLogger();
    private static final Pattern id_break = Pattern.compile("^[a-fA-F0-9]{40}$");
    private final rAY id_byte;
    private final File id_protected;
    private final ReentrantLock id_throws = new ReentrantLock();
    private final jo_3 id_case;
    private CompletableFuture<?> id_catch;
    private rAp_1 id_private;

    private static Map<String, String> id_byte() {
        HashMap hashMap = Maps.newHashMap();
        hashMap.put("X-Minecraft-Username", QY.id_instanceof().id_while().id_byte());
        hashMap.put("X-Minecraft-UUID", QY.id_instanceof().id_while().id_break());
        hashMap.put("X-Minecraft-Version", rqu_3.id_class().getName());
        hashMap.put("X-Minecraft-Version-ID", rqu_3.id_class().getId());
        hashMap.put("X-Minecraft-Pack-Format", String.valueOf(rqu_3.id_class().getPackVersion()));
        hashMap.put("User-Agent", "Minecraft Java/" + rqu_3.id_class().getName());
        return hashMap;
    }

    private static rAC id_byte(File file) {
        return new jq_3(file);
    }

    public jy_3(File file, jo_3 jo_32) {
        this.id_protected = file;
        this.id_case = jo_32;
        this.id_byte = new je_3(jo_32);
    }

    @Override
    public void id_class(Consumer<rAp_1> consumer, rAq_1 rAq_12) {
        rAp_1 rAp_12;
        rAp_1 rAp_13 = rAp_1.id_class("vanilla", true, () -> this.id_byte, rAq_12, rAT.BOTTOM, rAZ.id_break);
        if (rAp_13 != null) {
            consumer.accept(rAp_13);
        }
        if (this.id_private != null) {
            consumer.accept(this.id_private);
        }
        if ((rAp_12 = this.id_class(rAq_12)) != null) {
            consumer.accept(rAp_12);
        }
    }

    public rAY id_class() {
        return this.id_byte;
    }

    private rAp_1 id_class(rAq_1 rAq_12) {
        File file;
        rAp_1 rAp_12 = null;
        File file2 = this.id_case.id_class(new rqO_2("resourcepacks/programmer_art.zip"));
        if (file2 != null && file2.isFile()) {
            rAp_12 = jy_3.id_class(rAq_12, () -> jy_3.id_byte(file2));
        }
        if (rAp_12 == null && rqu_3.id_byte && (file = this.id_case.id_class("../resourcepacks/programmer_art")) != null && file.isDirectory()) {
            rAp_12 = jy_3.id_class(rAq_12, () -> jy_3.id_break(file));
        }
        return rAp_12;
    }

    private static rAp_1 id_class(rAq_1 rAq_12, Supplier<rAC> supplier) {
        return rAp_1.id_class("programer_art", false, supplier, rAq_12, rAT.TOP, rAZ.id_break);
    }

    private static void id_class(File file) {
        try {
            Files.delete(file.toPath());
        }
        catch (IOException iOException) {
            id_class.warn("Failed to delete file {}: {}", (Object)file, (Object)iOException.getMessage());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean id_class(String string, File file) {
        try (FileInputStream fileInputStream = new FileInputStream(file);){
            String string2 = DigestUtils.sha1Hex((InputStream)fileInputStream);
            if (string.isEmpty()) {
                id_class.info("Found file {} without verification hash", (Object)file);
                boolean bl = true;
                return bl;
            }
            if (string2.toLowerCase(Locale.ROOT).equals(string.toLowerCase(Locale.ROOT))) {
                id_class.info("Found file {} matching requested hash {}", (Object)file, (Object)string);
                boolean bl = true;
                return bl;
            }
            id_class.warn("File {} had wrong hash (expected {}, found {}).", (Object)file, (Object)string, (Object)string2);
            return false;
        }
        catch (IOException iOException) {
            id_class.warn("File {} couldn't be hashed.", (Object)file, (Object)iOException);
        }
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public CompletableFuture<?> id_class(String string, String string2) {
        CompletableFuture<?> completableFuture;
        String string3 = DigestUtils.sha1Hex((String)string);
        String string4 = id_break.matcher(string2).matches() ? string2 : "";
        this.id_throws.lock();
        try {
            CompletableFuture<String> completableFuture2;
            this.id_break();
            this.id_protected();
            File file = new File(this.id_protected, string3);
            if (file.exists()) {
                completableFuture2 = CompletableFuture.completedFuture("");
            } else {
                vY_2 vY_22 = new vY_2();
                Map<String, String> map = jy_3.id_byte();
                QY qY = QY.id_instanceof();
                qY.id_catch(() -> qY.id_break(vY_22));
                completableFuture2 = rpu_3.id_class(file, string, map, 0x6400000, vY_22, qY.W());
            }
            completableFuture = this.id_catch = ((CompletableFuture)completableFuture2.thenCompose(object -> !this.id_class(string4, file) ? rqR_2.id_class((Throwable)new RuntimeException("Hash check failure for file " + file + ", see log")) : this.id_class(file, rAZ.id_protected))).whenComplete((void_, throwable) -> {
                if (throwable != null) {
                    id_class.warn("Pack application failed: {}, deleting file {}", (Object)throwable.getMessage(), (Object)file);
                    jy_3.id_class(file);
                }
            });
        }
        finally {
            this.id_throws.unlock();
        }
        return completableFuture;
    }

    public CompletableFuture<Void> id_class(File file, rAZ rAZ2) {
        rAK rAK2;
        try (rAk_1 rAk_12 = new rAk_1(file);){
            rAK2 = rAk_12.id_class(rAK.id_class);
        }
        catch (IOException iOException) {
            return rqR_2.id_class((Throwable)new IOException(String.format("Invalid resourcepack at %s", file), iOException));
        }
        id_class.info("Applying server pack {}", (Object)file);
        this.id_private = new rAp_1("server", true, () -> new rAk_1(file), new rgn_3("resourcePack.server.name"), rAK2.id_class(), rAl_1.id_class(rAK2.id_break()), rAT.TOP, true, rAZ2);
        return QY.id_instanceof().x();
    }

    private static rAW id_break(File file) {
        return new jp_3(file);
    }

    public void id_break() {
        this.id_throws.lock();
        try {
            if (this.id_catch != null) {
                this.id_catch.cancel(true);
            }
            this.id_catch = null;
            if (this.id_private != null) {
                this.id_private = null;
                QY.id_instanceof().x();
            }
        }
        finally {
            this.id_throws.unlock();
        }
    }

    private void id_protected() {
        try {
            ArrayList arrayList = Lists.newArrayList((Iterable)FileUtils.listFiles((File)this.id_protected, (IOFileFilter)TrueFileFilter.TRUE, (IOFileFilter)null));
            arrayList.sort(LastModifiedFileComparator.LASTMODIFIED_REVERSE);
            int n = 0;
            for (File file : arrayList) {
                if (n++ < 10) continue;
                id_class.info("Deleting old server resource pack {}", (Object)file.getName());
                FileUtils.deleteQuietly((File)file);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            id_class.error("Error while deleting old server resource pack : {}", (Object)illegalArgumentException.getMessage());
        }
    }
}

