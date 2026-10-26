/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonIOException
 *  com.google.gson.JsonParser
 *  com.google.gson.JsonSyntaxException
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DataResult$PartialResult
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  com.mojang.serialization.Lifecycle
 *  it.unimi.dsi.fastutil.booleans.BooleanConsumer
 *  org.apache.commons.lang3.StringUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.PointerBuffer
 *  org.lwjgl.util.tinyfd.TinyFileDialogs
 */
package celestial;

import celestial.LF;
import celestial.Lu_1;
import celestial.Ml_1;
import celestial.QY;
import celestial.ZR;
import celestial.cm_3;
import celestial.cp_3;
import celestial.cv_3;
import celestial.gq_3;
import celestial.mN_2;
import celestial.mT_2;
import celestial.mn_3;
import celestial.mo_3;
import celestial.rAZ;
import celestial.rAf_1;
import celestial.rAh_1;
import celestial.rAt_1;
import celestial.rAz_1;
import celestial.rVm_1;
import celestial.rVp_1;
import celestial.rVq_1;
import celestial.rVv_1;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgS_2;
import celestial.rgn_3;
import celestial.rnW_2;
import celestial.rqR_2;
import celestial.rrSp_1;
import celestial.vD_2;
import celestial.vU_2;
import celestial.ve_3;
import celestial.vm_3;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.Lifecycle;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Consumer;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.PointerBuffer;
import org.lwjgl.util.tinyfd.TinyFileDialogs;

public class vK_2
implements ZR,
cp_3 {
    private static final Logger id_break = LogManager.getLogger();
    public static final rgP_2 id_byte = new rgn_3("generator.custom");
    public static final rgP_2 id_protected = new rgn_3("generator.amplified.info");
    private static final rgP_2 id_throws = new rgn_3("selectWorld.mapFeatures.info");
    private cv_3 id_case = cv_3.id_class;
    private cm_3 id_catch;
    private int id_private;
    private Lu_1 id_implements;
    private LF id_finally;
    public LF id_class;
    private LF id_extends;
    private LF id_native;
    private LF id_volatile;
    private rVv_1 id_final;
    public rrSp_1 id_package;
    public Optional<mN_2> id_int;
    private OptionalLong id_new;

    private OptionalLong id_byte() {
        OptionalLong optionalLong;
        String string = this.id_implements.id_private();
        OptionalLong optionalLong2 = StringUtils.isEmpty((CharSequence)string) ? OptionalLong.empty() : ((optionalLong = vK_2.id_class(string)).isPresent() && optionalLong.getAsLong() != 0L ? optionalLong : OptionalLong.of(string.hashCode()));
        return optionalLong2;
    }

    public vK_2(rVv_1 rVv_12, rrSp_1 rrSp_12, Optional<mN_2> optional, OptionalLong optionalLong) {
        this.id_final = rVv_12;
        this.id_package = rrSp_12;
        this.id_int = optional;
        this.id_new = optionalLong;
    }

    public void id_class(rAh_1 rAh_12) {
        rVv_1 rVv_12 = rVm_1.id_break();
        rVp_1 rVp_12 = rVp_1.id_class(JsonOps.INSTANCE, this.id_final);
        rVq_1 rVq_12 = rVq_1.id_class(JsonOps.INSTANCE, rAh_12.id_private(), rVv_12);
        DataResult dataResult = rrSp_1.id_class.encodeStart(rVp_12, (Object)this.id_package).flatMap(jsonElement -> rrSp_1.id_class.parse((DynamicOps)rVq_12, jsonElement));
        dataResult.resultOrPartial((Consumer)((Object)rqR_2.id_class("Error parsing worldgen settings after loading data packs: ", arg_0 -> ((Logger)id_break).error(arg_0)))).ifPresent(rrSp_12 -> {
            this.id_package = rrSp_12;
            this.id_final = rVv_12;
        });
    }

    private /* synthetic */ void id_class(QY qY, mo_3 mo_32, rVv_1 rVv_12, Lifecycle lifecycle, rrSp_1 rrSp_12) {
        BooleanConsumer booleanConsumer = bl -> {
            qY.id_break(mo_32);
            if (bl) {
                this.id_class(rVv_12, rrSp_12);
            }
        };
        if (lifecycle == Lifecycle.stable()) {
            this.id_class(rVv_12, rrSp_12);
        } else if (lifecycle == Lifecycle.experimental()) {
            qY.id_break(new mT_2(booleanConsumer, new rgn_3("selectWorld.import_worldgen_settings.experimental.title"), new rgn_3("selectWorld.import_worldgen_settings.experimental.question")));
        } else {
            qY.id_break(new mT_2(booleanConsumer, new rgn_3("selectWorld.import_worldgen_settings.deprecated.title"), new rgn_3("selectWorld.import_worldgen_settings.deprecated.question")));
        }
    }

    private static OptionalLong id_class(String string) {
        try {
            return OptionalLong.of(Long.parseLong(string));
        }
        catch (NumberFormatException numberFormatException) {
            return OptionalLong.empty();
        }
    }

    protected void id_class(rrSp_1 rrSp_12) {
        this.id_package = rrSp_12;
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        if (this.id_finally.id_new) {
            this.id_catch.id_break(ml_1, id_throws, (float)(this.id_private / 2 - 150), 122.0f, -6250336);
        }
        this.id_implements.id_class(ml_1, n, n2, f);
        if (this.id_int.equals(Optional.of(mN_2.id_break))) {
            this.id_case.id_break(ml_1, this.id_extends.id_volatile + 2, this.id_extends.id_final + 22, 9, 0xA0A0A0);
        }
    }

    public void id_class(mo_3 mo_32, QY qY, cm_3 cm_32) {
        this.id_catch = cm_32;
        this.id_private = mo_32.id_package;
        this.id_implements = new Lu_1(this.id_catch, this.id_private / 2 - 100, 60, 200, 20, new rgn_3("selectWorld.enterSeed"));
        this.id_implements.id_class(vK_2.id_class(this.id_new));
        this.id_implements.id_class((String string) -> {
            this.id_new = this.id_byte();
        });
        mo_32.id_protected(this.id_implements);
        int n = this.id_private / 2 - 155;
        int n2 = this.id_private / 2 + 5;
        this.id_finally = mo_32.id_class(new vD_2(this, n, 100, 150, 20, new rgn_3("selectWorld.mapFeatures"), lF -> {
            this.id_package = this.id_package.id_extends();
        }));
        this.id_finally.id_new = false;
        this.id_extends = mo_32.id_class(new vU_2(this, n2, 100, 150, 20, new rgn_3("selectWorld.mapType"), lF -> {
            while (this.id_int.isPresent()) {
                int n = mN_2.id_byte.indexOf(this.id_int.get()) + 1;
                if (n >= mN_2.id_byte.size()) {
                    n = 0;
                }
                mN_2 mN_22 = mN_2.id_byte.get(n);
                this.id_int = Optional.of(mN_22);
                this.id_package = mN_22.id_class(this.id_final, this.id_package.id_class(), this.id_package.id_break(), this.id_package.id_byte());
                if (this.id_package.id_catch() && !vm_3.id_synchronized()) continue;
            }
            mo_32.id_finally();
        }));
        this.id_extends.id_new = false;
        this.id_extends.id_int = this.id_int.isPresent();
        this.id_native = mo_32.id_class(new LF(n2, 120, 150, 20, new rgn_3("selectWorld.customizeType"), lF -> {
            mn_3 mn_32 = mN_2.id_protected.get(this.id_int);
            if (mn_32 != null) {
                qY.id_break(mn_32.createEditScreen(mo_32, this.id_package));
            }
        }));
        this.id_native.id_new = false;
        this.id_class = mo_32.id_class(new ve_3(this, n, 151, 150, 20, new rgn_3("selectWorld.bonusItems"), lF -> {
            this.id_package = this.id_package.id_native();
        }, mo_32));
        this.id_class.id_new = false;
        this.id_volatile = mo_32.id_class(new LF(n, 185, 150, 20, new rgn_3("selectWorld.import_worldgen_settings"), lF -> {
            rgn_3 rgn_32 = new rgn_3("selectWorld.import_worldgen_settings.select_file");
            String string = TinyFileDialogs.tinyfd_openFileDialog((CharSequence)rgn_32.getString(), (CharSequence)null, (PointerBuffer)null, (CharSequence)null, (boolean)false);
            if (string != null) {
                DataResult dataResult;
                Object object;
                Object object2;
                rAh_1 rAh_12;
                Object object3;
                rVv_1 rVv_12 = rVm_1.id_break();
                rAt_1 rAt_12 = new rAt_1(new rAf_1(), new rAz_1(mo_32.id_final().toFile(), rAZ.id_byte));
                try {
                    rnW_2.id_class(rAt_12, mo_32.id_throws, false);
                    object3 = rAh_1.id_class(rAt_12.id_case(), gq_3.INTEGRATED, 2, rqR_2.id_case(), qY);
                    qY.id_byte(() -> object3.isDone());
                    rAh_12 = ((CompletableFuture)object3).get();
                }
                catch (InterruptedException | ExecutionException exception) {
                    id_break.error("Error loading data packs when importing world settings", (Throwable)exception);
                    rgn_3 rgn_33 = new rgn_3("selectWorld.import_worldgen_settings.failure");
                    rgN_2 rgN_22 = new rgN_2(exception.getMessage());
                    rAt_12.close();
                    return;
                }
                object3 = rVq_1.id_class(JsonOps.INSTANCE, rAh_12.id_private(), rVv_12);
                JsonParser jsonParser = new JsonParser();
                try {
                    object2 = Files.newBufferedReader(Paths.get(string, new String[0]));
                    try {
                        object = jsonParser.parse((Reader)object2);
                        dataResult = rrSp_1.id_class.parse((DynamicOps)object3, object);
                    }
                    finally {
                        if (object2 != null) {
                            ((BufferedReader)object2).close();
                        }
                    }
                }
                catch (JsonIOException | JsonSyntaxException | IOException throwable) {
                    dataResult = DataResult.error((String)("Failed to parse file: " + throwable.getMessage()));
                }
                if (dataResult.error().isPresent()) {
                    object2 = new rgn_3("selectWorld.import_worldgen_settings.failure");
                    object = ((DataResult.PartialResult)dataResult.error().get()).message();
                    id_break.error("Error parsing world settings: {}", object);
                    rgN_2 rgN_23 = new rgN_2((String)object);
                }
                rAh_12.close();
                object2 = dataResult.lifecycle();
                dataResult.resultOrPartial(arg_0 -> ((Logger)id_break).error(arg_0)).ifPresent(arg_0 -> this.id_class(qY, mo_32, rVv_12, (Lifecycle)object2, arg_0));
            }
        }));
        this.id_volatile.id_new = false;
        this.id_case = cv_3.id_class(cm_32, (rgS_2)id_protected, this.id_extends.id_case());
    }

    private static String id_class(OptionalLong optionalLong) {
        return optionalLong.isPresent() ? Long.toString(optionalLong.getAsLong()) : "";
    }

    public boolean id_class() {
        return this.id_package.id_catch();
    }

    private void id_class(rVv_1 rVv_12, rrSp_1 rrSp_12) {
        this.id_final = rVv_12;
        this.id_package = rrSp_12;
        this.id_int = mN_2.id_class(rrSp_12);
        this.id_new = OptionalLong.of(rrSp_12.id_class());
        this.id_implements.id_class(vK_2.id_class(this.id_new));
        this.id_extends.id_int = this.id_int.isPresent();
    }

    public rrSp_1 id_class(boolean bl) {
        OptionalLong optionalLong = this.id_byte();
        return this.id_package.id_class(bl, optionalLong);
    }

    public void id_break(boolean bl) {
        this.id_extends.id_new = bl;
        if (this.id_package.id_catch()) {
            this.id_finally.id_new = false;
            this.id_class.id_new = false;
            this.id_native.id_new = false;
            this.id_volatile.id_new = false;
        } else {
            this.id_finally.id_new = bl;
            this.id_class.id_new = bl;
            this.id_native.id_new = bl && mN_2.id_protected.containsKey(this.id_int);
            this.id_volatile.id_new = bl;
        }
        this.id_implements.id_private(bl);
    }

    public rVv_1 id_break() {
        return this.id_final;
    }

    @Override
    public void id_private() {
        this.id_implements.id_catch();
    }
}

