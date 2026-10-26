/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  com.google.common.collect.UnmodifiableIterator
 *  com.mojang.datafixers.DataFixer
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.Lifecycle
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.QA;
import celestial.rRJ;
import celestial.rTC;
import celestial.rTH;
import celestial.rTu_1;
import celestial.rTv_1;
import celestial.rVL;
import celestial.rVn_1;
import celestial.rYE;
import celestial.rcW_2;
import celestial.rcZ_2;
import celestial.rcd_3;
import celestial.rcf_3;
import celestial.rgn_3;
import celestial.rnu_3;
import celestial.rqR_2;
import celestial.rqu_3;
import celestial.rrGN;
import celestial.rrGQ;
import celestial.rrGk_1;
import celestial.rrGm_1;
import celestial.rrSp_1;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.SignStyle;
import java.time.temporal.ChronoField;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rrGd_1 {
    public static final Logger id_class = LogManager.getLogger();
    public static final DateTimeFormatter id_break = new DateTimeFormatterBuilder().appendValue(ChronoField.YEAR, 4, 10, SignStyle.EXCEEDS_PAD).appendLiteral('-').appendValue(ChronoField.MONTH_OF_YEAR, 2).appendLiteral('-').appendValue(ChronoField.DAY_OF_MONTH, 2).appendLiteral('_').appendValue(ChronoField.HOUR_OF_DAY, 2).appendLiteral('-').appendValue(ChronoField.MINUTE_OF_HOUR, 2).appendLiteral('-').appendValue(ChronoField.SECOND_OF_MINUTE, 2).toFormatter();
    private static final ImmutableList<String> id_byte = ImmutableList.of((Object)"RandomSeed", (Object)"generatorName", (Object)"generatorOptions", (Object)"generatorVersion", (Object)"legacy_custom_options", (Object)"MapFeatures", (Object)"BonusChest");
    public final Path id_protected;
    private final Path id_throws;
    public final DataFixer id_case;

    public Path id_byte() {
        return this.id_throws;
    }

    public rrGk_1 id_byte(String string) throws IOException {
        return new rrGk_1(this, string);
    }

    public rrGd_1(Path path, Path path2, DataFixer dataFixer) {
        this.id_case = dataFixer;
        try {
            Files.createDirectories(Files.exists(path, new LinkOption[0]) ? path.toRealPath(new LinkOption[0]) : path, new FileAttribute[0]);
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
        this.id_protected = path;
        this.id_throws = path2;
    }

    public boolean id_class(String string) {
        try {
            Path path = this.id_protected.resolve(string);
            Files.createDirectory(path, new FileAttribute[0]);
            Files.deleteIfExists(path);
            return true;
        }
        catch (IOException iOException) {
            return false;
        }
    }

    private static rTH id_class(Dynamic<?> dynamic) {
        return rTH.id_break.parse(dynamic).resultOrPartial(arg_0 -> ((Logger)id_class).error(arg_0)).orElse(rTH.id_class);
    }

    private static <T> Pair<rrSp_1, Lifecycle> id_class(Dynamic<T> dynamic, DataFixer dataFixer, int n) {
        String string2;
        Dynamic dynamic2 = dynamic.get("WorldGenSettings").orElseEmptyMap();
        for (String string2 : id_byte) {
            Optional optional = dynamic.get(string2).result();
            if (!optional.isPresent()) continue;
            dynamic2 = dynamic2.set(string2, (Dynamic)optional.get());
        }
        UnmodifiableIterator unmodifiableIterator = dataFixer.update(rTC.id_goto, dynamic2, n, rqu_3.id_class().getWorldVersion());
        string2 = rrSp_1.id_class.parse((Dynamic)unmodifiableIterator);
        return Pair.of((Object)string2.resultOrPartial((Consumer)((Object)rqR_2.id_class("WorldGenSettings: ", arg_0 -> ((Logger)id_class).error(arg_0)))).orElseGet(() -> rrGd_1.id_break((Dynamic)unmodifiableIterator)), (Object)string2.lifecycle());
    }

    public static rrGd_1 id_class(Path path) {
        return new rrGd_1(path, path.resolve("../backups"), rTu_1.id_class());
    }

    public List<rrGm_1> id_class() throws QA {
        File[] fileArray;
        if (!Files.isDirectory(this.id_protected, new LinkOption[0])) {
            throw new QA(new rgn_3("selectWorld.load_folder_access").getString());
        }
        ArrayList arrayList = Lists.newArrayList();
        for (File file : fileArray = this.id_protected.toFile().listFiles()) {
            boolean bl;
            if (!file.isDirectory()) continue;
            try {
                bl = rnu_3.id_break(file.toPath());
            }
            catch (Exception exception) {
                id_class.warn("Failed to read {} lock", (Object)file, (Object)exception);
                continue;
            }
            rrGm_1 rrGm_12 = this.id_class(file, this.id_class(file, bl));
            if (rrGm_12 == null) continue;
            arrayList.add(rrGm_12);
        }
        return arrayList;
    }

    public <T> T id_class(File file, BiFunction<File, DataFixer, T> biFunction) {
        T t;
        if (!file.exists()) {
            return null;
        }
        File file2 = new File(file, "level.dat");
        if (file2.exists() && (t = biFunction.apply(file2, this.id_case)) != null) {
            return t;
        }
        file2 = new File(file, "level.dat_old");
        return file2.exists() ? (T)biFunction.apply(file2, this.id_case) : null;
    }

    public static rTH id_class(File file, DataFixer dataFixer) {
        try {
            rcd_3 rcd_32 = rcW_2.id_class(file);
            rcd_3 rcd_33 = rcd_32.id_int("Data");
            rcd_33.id_continue("Player");
            int n = rcd_33.id_byte("DataVersion", 99) ? rcd_33.id_private("DataVersion") : -1;
            Dynamic dynamic = dataFixer.update(rTv_1.LEVEL.id_class(), new Dynamic((DynamicOps)rcf_3.id_class, (Object)rcd_33), n, rqu_3.id_class().getWorldVersion());
            return dynamic.get("DataPacks").result().map(rrGd_1::id_class).orElse(rTH.id_class);
        }
        catch (Exception exception) {
            id_class.error("Exception reading {}", (Object)file, (Object)exception);
            return null;
        }
    }

    public BiFunction<File, DataFixer, rrGm_1> id_class(File file, boolean bl) {
        return (file2, dataFixer) -> {
            try {
                rcd_3 rcd_32 = rcW_2.id_class(file2);
                rcd_3 rcd_33 = rcd_32.id_int("Data");
                rcd_33.id_continue("Player");
                int n = rcd_33.id_byte("DataVersion", 99) ? rcd_33.id_private("DataVersion") : -1;
                Dynamic dynamic = dataFixer.update(rTv_1.LEVEL.id_class(), new Dynamic((DynamicOps)rcf_3.id_class, (Object)rcd_33), n, rqu_3.id_class().getWorldVersion());
                rrGN rrGN2 = rrGN.id_class(dynamic);
                int n2 = rrGN2.id_class();
                if (n2 != 19132 && n2 != 19133) {
                    return null;
                }
                boolean bl2 = n2 != this.id_protected();
                File file3 = new File(file, "icon.png");
                rTH rTH2 = dynamic.get("DataPacks").result().map(rrGd_1::id_class).orElse(rTH.id_class);
                rYE rYE2 = rYE.id_class(dynamic, rTH2);
                return new rrGm_1(rYE2, rrGN2, file.getName(), bl2, bl, file3);
            }
            catch (Exception exception) {
                id_class.error("Exception reading {}", file2, (Object)exception);
                return null;
            }
        };
    }

    public static BiFunction<File, DataFixer, rrGQ> id_class(DynamicOps<rcZ_2> dynamicOps, rTH rTH2) {
        return (file, dataFixer) -> {
            try {
                rcd_3 rcd_32 = rcW_2.id_class(file);
                rcd_3 rcd_33 = rcd_32.id_int("Data");
                rcd_3 rcd_34 = rcd_33.id_byte("Player", 10) ? rcd_33.id_int("Player") : null;
                rcd_33.id_continue("Player");
                int n = rcd_33.id_byte("DataVersion", 99) ? rcd_33.id_private("DataVersion") : -1;
                Dynamic dynamic = dataFixer.update(rTv_1.LEVEL.id_class(), new Dynamic(dynamicOps, (Object)rcd_33), n, rqu_3.id_class().getWorldVersion());
                Pair<rrSp_1, Lifecycle> pair = rrGd_1.id_class(dynamic, dataFixer, n);
                rrGN rrGN2 = rrGN.id_class(dynamic);
                rYE rYE2 = rYE.id_class(dynamic, rTH2);
                return rrGQ.id_class((Dynamic<rcZ_2>)dynamic, dataFixer, n, rcd_34, rYE2, rrGN2, (rrSp_1)pair.getFirst(), (Lifecycle)pair.getSecond());
            }
            catch (Exception exception) {
                id_class.error("Exception reading {}", file, (Object)exception);
                return null;
            }
        };
    }

    public boolean id_break(String string) {
        return Files.isDirectory(this.id_protected.resolve(string), new LinkOption[0]);
    }

    private static /* synthetic */ rrSp_1 id_break(Dynamic dynamic) {
        rVL rVL2 = (rVL)rVn_1.id_class(rVL.id_void).codec().parse(dynamic).resultOrPartial((Consumer)((Object)rqR_2.id_class("Dimension type registry: ", arg_0 -> ((Logger)id_class).error(arg_0)))).orElseThrow(() -> new IllegalStateException("Failed to get dimension registry"));
        rVL rVL3 = (rVL)rVn_1.id_class(rVL.n).codec().parse(dynamic).resultOrPartial((Consumer)((Object)rqR_2.id_class("Biome registry: ", arg_0 -> ((Logger)id_class).error(arg_0)))).orElseThrow(() -> new IllegalStateException("Failed to get biome registry"));
        rVL rVL4 = (rVL)rVn_1.id_class(rVL.u).codec().parse(dynamic).resultOrPartial((Consumer)((Object)rqR_2.id_class("Noise settings registry: ", arg_0 -> ((Logger)id_class).error(arg_0)))).orElseThrow(() -> new IllegalStateException("Failed to get noise settings registry"));
        return rrSp_1.id_class((rVL<rRJ>)rVL2, rVL3, rVL4);
    }

    public Path id_break() {
        return this.id_protected;
    }

    public int id_protected() {
        return 19133;
    }
}

