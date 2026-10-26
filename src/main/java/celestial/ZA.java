/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonIOException
 *  com.google.gson.stream.JsonWriter
 *  com.mojang.datafixers.util.Function4
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.JsonOps
 *  it.unimi.dsi.fastutil.booleans.BooleanConsumer
 *  org.apache.commons.io.FileUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.LF;
import celestial.Lu_1;
import celestial.Ml_1;
import celestial.QK;
import celestial.QY;
import celestial.Qj_1;
import celestial.cN_2;
import celestial.my_3;
import celestial.rAL;
import celestial.rTH;
import celestial.rVm_1;
import celestial.rVp_1;
import celestial.rVv_1;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rqR_2;
import celestial.rrGP;
import celestial.rrGd_1;
import celestial.rrGk_1;
import celestial.rrGm_1;
import celestial.rrGr_1;
import celestial.rrSp_1;
import celestial.vb_3;
import celestial.vm_3;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.google.gson.stream.JsonWriter;
import com.mojang.datafixers.util.Function4;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.JsonOps;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.concurrent.ExecutionException;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ZA
extends vm_3 {
    private static final Logger id_class = LogManager.getLogger();
    private static final Gson id_throws = new GsonBuilder().setPrettyPrinting().serializeNulls().disableHtmlEscaping().create();
    private static final rgP_2 id_case = new rgn_3("selectWorld.enterName");
    private LF id_catch;
    private final BooleanConsumer id_private;
    private Lu_1 id_implements;
    private final rrGk_1 id_finally;

    public ZA(BooleanConsumer booleanConsumer, rrGk_1 rrGk_12) {
        super(new rgn_3("selectWorld.edit.title"));
        this.id_private = booleanConsumer;
        this.id_finally = rrGk_12;
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        this.id_class(ml_1);
        ZA.id_class(ml_1, this.id_super, this.id_extends, this.id_package / 2, 15, 0xFFFFFF);
        ZA.id_break(ml_1, this.id_super, id_case, this.id_package / 2 - 100, 24, 0xA0A0A0);
        this.id_implements.id_class(ml_1, n, n2, f);
        super.id_class(ml_1, n, n2, f);
    }

    @Override
    public void id_class(QY qY, int n, int n2) {
        String string = this.id_implements.id_private();
        this.id_break(qY, n, n2);
        this.id_implements.id_class(string);
    }

    public static void id_class(rrGd_1 rrGd_12, String string) {
        try (rrGk_1 rrGk_12 = rrGd_12.id_byte(string);){
            ZA.id_class(rrGk_12);
        }
        catch (IOException iOException) {
            id_class.warn("Failed to create backup of level {}", (Object)string, (Object)iOException);
        }
    }

    public static boolean id_class(rrGk_1 rrGk_12) {
        long l = 0L;
        IOException iOException = null;
        try {
            l = rrGk_12.id_private();
        }
        catch (IOException iOException2) {
            iOException = iOException2;
        }
        return iOException == null;
    }

    private void id_finally() {
        try {
            this.id_finally.id_class(this.id_implements.id_private().trim());
            this.id_private.accept(true);
        }
        catch (IOException iOException) {
            id_class.error("Failed to access world '{}'", (Object)this.id_finally.id_class(), (Object)iOException);
            this.id_private.accept(true);
        }
    }

    @Override
    public void id_private() {
        this.id_implements.id_catch();
    }

    @Override
    public void id_volatile() {
        this.id_private.accept(false);
    }

    @Override
    protected void v_() {
        ((Qj_1)this.id_volatile.id_class[23]).id_class(true);
        LF lF2 = this.id_class(new LF(this.id_package / 2 - 100, this.id_int / 4 + 5, 200, 20, new rgn_3("selectWorld.edit.resetIcon"), lF -> {
            FileUtils.deleteQuietly((File)this.id_finally.id_case());
            lF.id_int = false;
        }));
        this.id_class(new LF(this.id_package / 2 - 100, this.id_int / 4 + 24 + 5, 200, 20, new rgn_3("selectWorld.edit.openFolder"), lF -> rqR_2.id_implements().id_class(this.id_finally.id_class(rrGr_1.id_implements).toFile())));
        this.id_class(new LF(this.id_package / 2 - 100, this.id_int / 4 + 48 + 5, 200, 20, new rgn_3("selectWorld.edit.backup"), lF -> {
            boolean bl = ZA.id_class(this.id_finally);
            this.id_private.accept(!bl);
        }));
        this.id_class(new LF(this.id_package / 2 - 100, this.id_int / 4 + 72 + 5, 200, 20, new rgn_3("selectWorld.edit.backupFolder"), lF -> {
            rrGd_1 rrGd_12 = this.id_volatile.M();
            Path path = rrGd_12.id_byte();
            try {
                Files.createDirectories(Files.exists(path, new LinkOption[0]) ? path.toRealPath(new LinkOption[0]) : path, new FileAttribute[0]);
            }
            catch (IOException iOException) {
                throw new RuntimeException(iOException);
            }
            rqR_2.id_implements().id_class(path.toFile());
        }));
        this.id_class(new LF(this.id_package / 2 - 100, this.id_int / 4 + 96 + 5, 200, 20, new rgn_3("selectWorld.edit.optimize"), lF -> this.id_volatile.id_break(new my_3(this, (bl, bl2) -> {
            if (bl) {
                ZA.id_class(this.id_finally);
            }
            this.id_volatile.id_break(vb_3.id_class(this.id_volatile, this.id_private, this.id_volatile.id_protected(), this.id_finally, bl2));
        }, new rgn_3("optimizeWorld.confirm.title"), new rgn_3("optimizeWorld.confirm.description"), true))));
        this.id_class(new LF(this.id_package / 2 - 100, this.id_int / 4 + 120 + 5, 200, 20, new rgn_3("selectWorld.edit.export_worldgen_settings"), lF -> {
            DataResult dataResult;
            rVv_1 rVv_12 = rVm_1.id_break();
            try (QK qK = this.id_volatile.id_class(rVv_12, QY::id_class, (Function4<rrGk_1, rVv_1, rAL, rTH, rrGP>)((Function4)QY::id_class), false, this.id_finally);){
                rVp_1 rVp_12 = rVp_1.id_class(JsonOps.INSTANCE, rVv_12);
                DataResult dataResult2 = rrSp_1.id_class.encodeStart(rVp_12, (Object)qK.id_byte().id_long());
                dataResult = dataResult2.flatMap(jsonElement -> {
                    Path path = this.id_finally.id_class(rrGr_1.id_implements).resolve("worldgen_settings_export.json");
                    try (JsonWriter jsonWriter = id_throws.newJsonWriter((Writer)Files.newBufferedWriter(path, StandardCharsets.UTF_8, new OpenOption[0]));){
                        id_throws.toJson(jsonElement, jsonWriter);
                    }
                    catch (JsonIOException | IOException throwable) {
                        return DataResult.error((String)("Error writing file: " + throwable.getMessage()));
                    }
                    return DataResult.success((Object)path.toString());
                });
            }
            catch (InterruptedException | ExecutionException exception) {
                dataResult = DataResult.error((String)"Could not parse level data!");
            }
            dataResult.error().ifPresent(partialResult -> id_class.error("Error exporting world settings: {}", partialResult));
        }));
        this.id_catch = this.id_class(new LF(this.id_package / 2 - 100, this.id_int / 4 + 144 + 5, 98, 20, new rgn_3("selectWorld.edit.save"), lF -> this.id_finally()));
        this.id_class(new LF(this.id_package / 2 + 2, this.id_int / 4 + 144 + 5, 98, 20, cN_2.id_protected, lF -> this.id_private.accept(false)));
        lF2.id_int = this.id_finally.id_case().isFile();
        rrGm_1 rrGm_12 = this.id_finally.id_protected();
        String string2 = rrGm_12 == null ? "" : rrGm_12.id_break();
        this.id_implements = new Lu_1(this.id_super, this.id_package / 2 - 100, 38, 200, 20, new rgn_3("selectWorld.enterName"));
        this.id_implements.id_class(string2);
        this.id_implements.id_class((String string) -> {
            this.id_catch.id_int = !string.trim().isEmpty();
        });
        this.id_native.add(this.id_implements);
        this.id_break(this.id_implements);
    }

    @Override
    public void w_() {
        super.w_();
        ((Qj_1)this.id_volatile.id_class[23]).id_class(false);
    }
}

