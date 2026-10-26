/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Splitter
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.GameProfileRepository
 *  com.mojang.authlib.minecraft.MinecraftSessionService
 *  com.mojang.datafixers.DataFixer
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.ByteBufOutputStream
 *  io.netty.buffer.Unpooled
 *  it.unimi.dsi.fastutil.longs.LongIterator
 *  org.apache.commons.lang3.Validate
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.KU;
import celestial.KY;
import celestial.Oa_1;
import celestial.Of_1;
import celestial.gV_2;
import celestial.gp_3;
import celestial.gq_3;
import celestial.gy_3;
import celestial.rAC;
import celestial.rAh_1;
import celestial.rAp_1;
import celestial.rAt_1;
import celestial.rCB;
import celestial.rCk_1;
import celestial.rCr_1;
import celestial.rDg_1;
import celestial.rFE;
import celestial.rFp_1;
import celestial.rKd_1;
import celestial.rRB;
import celestial.rRJ;
import celestial.rRO;
import celestial.rRX;
import celestial.rRc_1;
import celestial.rRl_1;
import celestial.rRu_1;
import celestial.rTH;
import celestial.rTN;
import celestial.rTz_1;
import celestial.rUx_1;
import celestial.rVC;
import celestial.rVL;
import celestial.rVm_1;
import celestial.rVv_1;
import celestial.rWB;
import celestial.rYA;
import celestial.rYB;
import celestial.rYE;
import celestial.rYY;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rfj_3;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgV_2;
import celestial.rgn_3;
import celestial.rhN_2;
import celestial.rhc_3;
import celestial.rhd_3;
import celestial.rjK_2;
import celestial.rjU_2;
import celestial.rlQ_2;
import celestial.rlT_2;
import celestial.rls_3;
import celestial.rnE_2;
import celestial.rnG_2;
import celestial.rnQ_2;
import celestial.rnd_3;
import celestial.rne_3;
import celestial.rnz_3;
import celestial.roE_2;
import celestial.roT_2;
import celestial.roq_3;
import celestial.ros_3;
import celestial.rpC_2;
import celestial.rpN_2;
import celestial.rqM_2;
import celestial.rqO_2;
import celestial.rqR_2;
import celestial.rqg_3;
import celestial.rqu_3;
import celestial.rrEI;
import celestial.rrEN;
import celestial.rrEU;
import celestial.rrEa_1;
import celestial.rrEf_1;
import celestial.rrEi_1;
import celestial.rrEl_1;
import celestial.rrEm_1;
import celestial.rrEp_1;
import celestial.rrEq_1;
import celestial.rrEw_1;
import celestial.rrGB;
import celestial.rrGP;
import celestial.rrGk_1;
import celestial.rrGr_1;
import celestial.rrGs_1;
import celestial.rrGu_1;
import celestial.rrGx_1;
import celestial.rrPt_1;
import celestial.rrSp_1;
import celestial.ruC_2;
import celestial.ruQ_2;
import celestial.run_3;
import celestial.ruy_3;
import celestial.ryK_2;
import celestial.ryo_3;
import celestial.rzC_2;
import celestial.rzZ_2;
import celestial.xd_3;
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.datafixers.DataFixer;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufOutputStream;
import io.netty.buffer.Unpooled;
import it.unimi.dsi.fastutil.longs.LongIterator;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.net.Proxy;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.security.KeyPair;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import javax.imageio.ImageIO;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class rnW_2
extends rTz_1<rTN>
implements AutoCloseable,
gV_2 {
    public static final Logger id_finally = LogManager.getLogger();
    public static final File id_class = new File("usercache.json");
    public static final rYE id_break = new rYE("Demo World", rRl_1.SURVIVAL, false, rRO.NORMAL, false, new rRu_1(), rTH.id_class);
    protected final rrGk_1 id_protected;
    protected final rrGx_1 id_throws;
    private final List<Runnable> id_extends = Lists.newArrayList();
    private final ruQ_2 id_native;
    private final roT_2 id_volatile;
    private final run_3 id_final = new run_3();
    private final Random id_package = new Random();
    private final DataFixer id_int;
    private String id_new;
    private int id_continue = -1;
    protected final rVv_1 id_case;
    private final Map<rqM_2<rYB>, rrEm_1> id_super = Maps.newLinkedHashMap();
    private rCr_1 id_this;
    private volatile boolean id_else = true;
    private boolean id_synchronized;
    private int id_return;
    protected final Proxy id_catch;
    private boolean id_public;
    private boolean id_goto;
    private boolean id_while;
    private boolean id_try;
    private String id_instanceof;
    private int id_throw;
    private int id_interface;
    public final long[] id_private = new long[100];
    private KeyPair id_char;
    private String id_abstract;
    private boolean id_long;
    private String id_float = "";
    private String id_void = "";
    private volatile boolean id_static;
    private long id_import;
    private boolean id_short;
    private final MinecraftSessionService id_default;
    private final GameProfileRepository id_const;
    private final rCB id_strictfp;
    private long id_boolean;
    private final Thread id_transient;
    private long id_for = rqR_2.id_break();
    private long id_double;
    private boolean id_switch;
    private boolean r;
    private final rAt_1 P;
    private final rnG_2 B = new rnG_2(this);
    private rrEU S;
    private final rnd_3 s = new rnd_3();
    private final Oa_1 E;
    private final rpN_2 G = new rpN_2();
    private boolean b;
    private float M;
    private final Executor O;
    private String h;
    private rAh_1 X;
    private final rrPt_1 J;
    protected final rrGP id_implements;

    protected boolean id_boolean() {
        return this.id_implements.id_extends() != rRO.PEACEFUL;
    }

    public boolean id_char() {
        return !this.id_transient.isAlive();
    }

    public void id_byte(int n) {
        this.id_throw = n;
    }

    @Override
    protected /* synthetic */ boolean id_byte(Runnable runnable) {
        return this.id_class((rTN)runnable);
    }

    private void id_byte(Path path) throws IOException {
        KY kY = new KY("Server dump", new Exception("dummy"));
        this.id_break(kY);
        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(path, new OpenOption[0]);){
            bufferedWriter.write(kY.id_protected());
        }
    }

    protected void id_byte(String string) {
        this.h = string;
    }

    public void id_byte(boolean bl) {
        this.id_long = bl;
    }

    private boolean id_byte() {
        if (super.k_()) {
            return true;
        }
        if (this.id_break()) {
            for (rrEm_1 rrEm_12 : this.id_float()) {
                if (!rrEm_12.id_else().id_catch()) continue;
                return true;
            }
        }
        return false;
    }

    public boolean id_int() {
        return this.id_implements.id_implements();
    }

    public Set<rqM_2<rYB>> id_long() {
        return this.id_super.keySet();
    }

    public Iterable<rrEm_1> id_float() {
        return this.id_super.values();
    }

    public String id_double() {
        return this.id_void;
    }

    public rnW_2(Thread thread, rVv_1 rVv_12, rrGk_1 rrGk_12, rrGP rrGP2, rAt_1 rAt_12, Proxy proxy, DataFixer dataFixer, rAh_1 rAh_12, MinecraftSessionService minecraftSessionService, GameProfileRepository gameProfileRepository, rCB rCB2, roT_2 roT_22) {
        super("Server");
        this.id_case = rVv_12;
        this.id_implements = rrGP2;
        this.id_catch = proxy;
        this.P = rAt_12;
        this.X = rAh_12;
        this.id_default = minecraftSessionService;
        this.id_const = gameProfileRepository;
        this.id_strictfp = rCB2;
        this.id_native = new ruQ_2(this);
        this.id_volatile = roT_22;
        this.id_protected = rrGk_12;
        this.id_throws = rrGk_12.id_break();
        this.id_int = dataFixer;
        this.E = new Oa_1(this, rAh_12.id_class());
        this.J = new rrPt_1(rAh_12.id_private(), rrGk_12, dataFixer);
        this.id_transient = thread;
        this.O = rqR_2.id_case();
    }

    public boolean B() {
        return this.id_public;
    }

    @Override
    public boolean C() {
        return true;
    }

    public rRu_1 D() {
        return this.id_abstract().B();
    }

    public rCB F() {
        return this.id_strictfp;
    }

    public rAt_1 I() {
        return this.P;
    }

    public boolean J() {
        return this.id_synchronized;
    }

    public boolean S() {
        return this.id_goto;
    }

    public MinecraftSessionService Z() {
        return this.id_default;
    }

    public rWB V() {
        return this.X.id_throws();
    }

    protected void id_this() {
        id_finally.info("Stopping server");
        if (this.k() != null) {
            this.k().id_break();
        }
        if (this.id_this != null) {
            id_finally.info("Saving players");
            this.id_this.id_implements();
            this.id_this.id_continue();
        }
        id_finally.info("Saving worlds");
        for (rrEm_1 rrEm_12 : this.id_float()) {
            if (rrEm_12 == null) continue;
            rrEm_12.id_synchronized = false;
        }
        this.id_class(false, true, false);
        for (rrEm_1 rrEm_12 : this.id_float()) {
            if (rrEm_12 == null) continue;
            try {
                rrEm_12.close();
            }
            catch (IOException iOException) {
                id_finally.error("Exception closing the level", (Throwable)iOException);
            }
        }
        this.X.close();
        try {
            this.id_protected.close();
        }
        catch (IOException iOException) {
            id_finally.error("Failed to unlock level {}", (Object)this.id_protected.id_class(), (Object)iOException);
        }
    }

    public boolean e() {
        return this.b;
    }

    public rpN_2 i() {
        return this.G;
    }

    public boolean b() {
        return this.id_while;
    }

    public rCr_1 x() {
        return this.id_this;
    }

    public boolean s() {
        return true;
    }

    public boolean c() {
        return this.id_short;
    }

    public int n() {
        return 29999984;
    }

    public String h() {
        return this.id_instanceof;
    }

    public gp_3 f() {
        return this.X.id_case();
    }

    @Override
    public boolean l() {
        return true;
    }

    public abstract boolean d();

    public float a() {
        return this.M;
    }

    public boolean id_interface() {
        return true;
    }

    @Override
    public void id_class(int n) {
        this.id_continue = n;
    }

    public void id_class(rRO rRO2, boolean bl) {
        if (bl || !this.id_implements.id_native()) {
            this.id_implements.id_class(this.id_implements.id_implements() ? rRO.HARD : rRO2);
            this.id_protected();
            this.x().id_super().forEach(this::id_break);
        }
    }

    public void id_class(String string, String string2) {
        this.id_float = string;
        this.id_void = string2;
    }

    public static <S extends rnW_2> S id_class(Function<Thread, S> function) {
        AtomicReference<rnW_2> atomicReference = new AtomicReference<rnW_2>();
        Thread thread2 = new Thread(() -> ((rnW_2)atomicReference.get()).id_return(), "Server thread");
        thread2.setUncaughtExceptionHandler((thread, throwable) -> id_finally.error((Object)throwable));
        rnW_2 rnW_22 = (rnW_2)function.apply(thread2);
        atomicReference.set(rnW_22);
        thread2.start();
        return (S)rnW_22;
    }

    public static rTH id_class(rAt_1 rAt_12, rTH rTH2, boolean bl) {
        rAt_12.id_class();
        if (bl) {
            rAt_12.id_class(Collections.singleton("vanilla"));
            return new rTH((List<String>)ImmutableList.of((Object)"vanilla"), (List<String>)ImmutableList.of());
        }
        LinkedHashSet linkedHashSet = Sets.newLinkedHashSet();
        for (String object : rTH2.id_class()) {
            if (rAt_12.id_break(object)) {
                linkedHashSet.add(object);
                continue;
            }
            id_finally.warn("Missing data pack {}", (Object)object);
        }
        for (rAp_1 rAp_12 : rAt_12.id_byte()) {
            String string = rAp_12.id_throws();
            if (rTH2.id_break().contains(string) || linkedHashSet.contains(string)) continue;
            id_finally.info("Found new data pack {}, loading it automatically", (Object)string);
            linkedHashSet.add(string);
        }
        if (linkedHashSet.isEmpty()) {
            id_finally.info("No datapacks selected, forcing vanilla");
            linkedHashSet.add("vanilla");
        }
        rAt_12.id_class(linkedHashSet);
        return rnW_2.id_class(rAt_12);
    }

    @Override
    public CompletableFuture<Void> id_class(Collection<String> collection) {
        CompletionStage completionStage = ((CompletableFuture)CompletableFuture.supplyAsync(() -> (ImmutableList)collection.stream().map(this.P::id_class).filter(Objects::nonNull).map(rAp_1::id_protected).collect(ImmutableList.toImmutableList()), this).thenCompose(immutableList -> rAh_1.id_class((List<rAC>)immutableList, this.id_switch() ? gq_3.DEDICATED : gq_3.INTEGRATED, this.id_continue(), this.O, this))).thenAcceptAsync(rAh_12 -> {
            this.X.close();
            this.X = rAh_12;
            this.P.id_class(collection);
            this.id_implements.id_class(rnW_2.id_class(this.P));
            rAh_12.id_implements();
            this.x().id_implements();
            this.x().id_this();
            this.E.id_class(this.X.id_class());
            this.J.id_class(this.X.id_private());
        }, (Executor)this);
        if (this.rX()) {
            this.id_byte(((CompletableFuture)completionStage)::isDone);
        }
        return completionStage;
    }

    public int id_class(rrEm_1 rrEm_12) {
        return rrEm_12 != null ? rrEm_12.B().id_byte(rRu_1.id_new) : 10;
    }

    @Override
    public void id_class(Path path) throws IOException {
        Path path2 = path.resolve("levels");
        for (Map.Entry<rqM_2<rYB>, rrEm_1> entry : this.id_super.entrySet()) {
            rqO_2 rqO_22 = entry.getKey().id_class();
            Path path3 = path2.resolve(rqO_22.id_byte()).resolve(rqO_22.id_break());
            Files.createDirectories(path3, new FileAttribute[0]);
            entry.getValue().id_class(path3);
        }
        this.id_protected(path.resolve("gamerules.txt"));
        this.id_throws(path.resolve("classpath.txt"));
        this.id_byte(path.resolve("example_crash.txt"));
        this.id_break(path.resolve("stats.txt"));
        this.id_case(path.resolve("threads.txt"));
    }

    private static rTH id_class(rAt_1 rAt_12) {
        Collection<String> collection = rAt_12.id_protected();
        ImmutableList immutableList = ImmutableList.copyOf(collection);
        List list = (List)rAt_12.id_break().stream().filter(string -> !collection.contains(string)).collect(ImmutableList.toImmutableList());
        return new rTH((List<String>)immutableList, list);
    }

    @Override
    public void id_class(gy_3 gy_32) {
        if (this.e()) {
            rCr_1 rCr_12 = gy_32.id_super().x();
            rCk_1 rCk_12 = rCr_12.id_finally();
            for (rhN_2 rhN_22 : Lists.newArrayList(rCr_12.id_super())) {
                if (rCk_12.id_class(rhN_22.sv())) continue;
                rhN_22.id_class.id_class(new rgn_3("multiplayer.disconnect.not_whitelisted"));
            }
        }
    }

    public int id_class(GameProfile gameProfile) {
        if (this.x().id_case(gameProfile)) {
            rne_3 rne_32 = (rne_3)this.x().id_native().id_break(gameProfile);
            if (rne_32 != null) {
                return rne_32.id_class();
            }
            if (this.id_break(gameProfile)) {
                return 4;
            }
            if (this.id_const()) {
                return this.x().id_else() ? 4 : 0;
            }
            return this.id_new();
        }
        return 0;
    }

    @Override
    public void id_class(rCr_1 rCr_12) {
        this.id_this = rCr_12;
    }

    public Path id_class(rrGr_1 rrGr_12) {
        return this.id_protected.id_class(rrGr_12);
    }

    public rgV_2 id_class(rhN_2 rhN_22) {
        return null;
    }

    @Override
    public void id_class(rRl_1 rRl_12) {
        this.id_implements.id_class(rRl_12);
    }

    public abstract boolean id_class(rRl_1 var1, boolean var2, int var3);

    public boolean id_class(rrEm_1 rrEm_12, rfH_2 rfH_22, rhd_3 rhd_32) {
        return false;
    }

    private static void id_class(rrEm_1 rrEm_12, rrGB rrGB2, boolean bl, boolean bl2, boolean bl3) {
        rKd_1 rKd_12 = rrEm_12.id_else().id_implements();
        if (!bl3) {
            rrGB2.id_class(rfH_2.id_protected.id_break(rKd_12.id_byte()), 0.0f);
        } else if (bl2) {
            rrGB2.id_class(rfH_2.id_protected.id_final(), 0.0f);
        } else {
            rfj_3 rfj_32;
            rYY rYY2 = rKd_12.id_protected();
            Random random = new Random(rrEm_12.id_break());
            rfH_2 rfH_22 = rYY2.id_class(0, rrEm_12.id_short(), 0, 256, rYG2 -> rYG2.id_break().id_break(), random);
            rfj_3 rfj_33 = rfj_32 = rfH_22 == null ? new rfj_3(0, 0) : new rfj_3(rfH_22);
            if (rfH_22 == null) {
                id_finally.warn("Unable to find spawn biome");
            }
            boolean bl4 = false;
            for (xd_3 xd_32 : rls_3.P.id_class()) {
                if (!rYY2.id_byte().contains(xd_32.id_continue())) continue;
                bl4 = true;
                break;
            }
            rrGB2.id_class(rfj_32.id_finally().id_break(8, rKd_12.id_byte(), 8), 0.0f);
            int n = 0;
            int n2 = 0;
            int n3 = 0;
            int n4 = -1;
            int n5 = 32;
            for (int i = 0; i < 1024; ++i) {
                rfH_2 rfH_23;
                if (n > -16 && n <= 16 && n2 > -16 && n2 <= 16 && (rfH_23 = rhc_3.id_class(rrEm_12, new rfj_3(rfj_32.id_break + n, rfj_32.id_byte + n2), bl4)) != null) {
                    rrGB2.id_class(rfH_23, 0.0f);
                    break;
                }
                if (n == n2 || n < 0 && n == -n2 || n > 0 && n == 1 - n2) {
                    int n6 = n3;
                    n3 = -n4;
                    n4 = n6;
                }
                n += n3;
                n2 += n4;
            }
            if (bl) {
                rDg_1<?, ?> rDg_12 = rUx_1.r;
                rDg_12.id_class(rrEm_12, rKd_12, rrEm_12.id_int, new rfH_2(rrGB2.id_class(), rrGB2.id_break(), rrGB2.id_byte()));
            }
        }
    }

    @Override
    public void id_class(rgP_2 rgP_22, UUID uUID) {
        id_finally.info(rgP_22.getString());
    }

    public boolean id_class(boolean bl, boolean bl2, boolean bl3) {
        boolean bl4 = false;
        for (rrEm_1 object2 : this.id_float()) {
            if (!bl) {
                // empty if block
            }
            object2.id_class((rpC_2)null, bl2, object2.id_synchronized && !bl3);
            bl4 = true;
        }
        rrEm_1 rrEm_12 = this.id_abstract();
        rrGB rrGB2 = this.id_implements.id_instanceof();
        rrGB2.id_class(rrEm_12.id_instanceof().id_this());
        this.id_implements.id_class(this.U().id_byte());
        this.id_protected.id_class(this.id_case, this.id_implements, this.x().id_protected());
        return bl4;
    }

    @Override
    protected void id_class(KY kY) {
    }

    public rrEm_1 id_class(rqM_2<rYB> rqM_22) {
        return this.id_super.get(rqM_22);
    }

    @Override
    private void id_class(rrGP rrGP2) {
        rrGP2.id_class(rRO.PEACEFUL);
        rrGP2.id_protected(true);
        rrGB rrGB2 = rrGP2.id_instanceof();
        rrGB2.id_class(false);
        rrGB2.id_break(false);
        rrGB2.id_protected(1000000000);
        rrGB2.id_break(6000L);
        rrGB2.id_class(rRl_1.SPECTATOR);
    }

    @Override
    public void id_class(boolean bl) {
        this.id_else = false;
        if (bl) {
            try {
                this.id_transient.join();
            }
            catch (InterruptedException interruptedException) {
                id_finally.error("Error while shutting down", (Throwable)interruptedException);
            }
        }
    }

    @Override
    protected void id_class(BooleanSupplier booleanSupplier) {
        long l = rqR_2.id_byte();
        ++this.id_return;
        this.id_break(booleanSupplier);
        if (l - this.id_boolean >= 5000000000L) {
            this.id_boolean = l;
            this.id_final.id_class(new ruC_2(this.id_catch(), this.id_case()));
            GameProfile[] gameProfileArray = new GameProfile[Math.min(this.id_case(), 12)];
            int n = rfU_2.id_class(this.id_package, 0, this.id_case() - gameProfileArray.length);
            for (int i = 0; i < gameProfileArray.length; ++i) {
                gameProfileArray[i] = this.id_this.id_super().get(n + i).sv();
            }
            Collections.shuffle(Arrays.asList(gameProfileArray));
            this.id_final.id_break().id_class(gameProfileArray);
        }
        if (this.id_return % 6000 == 0) {
            id_finally.debug("Autosave started");
            this.id_this.id_implements();
            this.id_class(true, false, false);
            id_finally.debug("Autosave finished");
        }
        long l2 = rqR_2.id_byte() - l;
        this.id_private[this.id_return % 100] = l2;
        long l3 = l2;
        this.M = this.M * 0.8f + (float)l3 / 1000000.0f * 0.19999999f;
        long l4 = rqR_2.id_byte();
        this.G.id_class(l4 - l);
    }

    public static void id_class(rrGk_1 rrGk_12) {
        if (rrGk_12.id_byte()) {
            id_finally.info("Converting map!");
            rrGk_12.id_class(new rnz_3());
        }
    }

    @Override
    private void id_class(rrEi_1 rrEi_12) {
        rnE_2 rnE_22 = rrEi_12.id_class(rnE_2::new, "scoreboard");
        rnE_22.id_class(this.R());
        this.R().id_class(new rrGu_1(rnE_22));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    private void id_class(run_3 run_32) {
        File file = this.id_protected("server-icon.png");
        if (!file.exists()) {
            file = this.id_protected.id_case();
        }
        if (file.isFile()) {
            ByteBuf byteBuf = Unpooled.buffer();
            try {
                BufferedImage bufferedImage = ImageIO.read(file);
                Validate.validState((bufferedImage.getWidth() == 64 ? 1 : 0) != 0, (String)"Must be 64 pixels wide", (Object[])new Object[0]);
                Validate.validState((bufferedImage.getHeight() == 64 ? 1 : 0) != 0, (String)"Must be 64 pixels high", (Object[])new Object[0]);
                ImageIO.write((RenderedImage)bufferedImage, "PNG", (OutputStream)new ByteBufOutputStream(byteBuf));
                ByteBuffer byteBuffer = Base64.getEncoder().encode(byteBuf.nioBuffer());
                run_32.id_class("data:image/png;base64," + StandardCharsets.UTF_8.decode(byteBuffer));
            }
            catch (Exception exception) {
                id_finally.error("Couldn't load server icon", (Throwable)exception);
            }
            finally {
                byteBuf.release();
            }
        }
    }

    @Override
    protected void id_class(roq_3 roq_32) {
        rKd_1 rKd_12;
        rRJ rRJ2;
        rrGB rrGB2 = this.id_implements.id_instanceof();
        rrSp_1 rrSp_12 = this.id_implements.id_long();
        boolean bl = rrSp_12.id_catch();
        long l = rrSp_12.id_class();
        long l2 = rYA.id_class(l);
        ImmutableList immutableList = ImmutableList.of((Object)new rrEI(), (Object)new rrEw_1(), (Object)new rrEp_1(), (Object)new rRB(), (Object)new rrEf_1(rrGB2));
        rVC<rRX> rVC2 = rrSp_12.id_protected();
        rRX rRX2 = rVC2.id_class(rRX.id_break);
        if (rRX2 == null) {
            rRJ2 = this.id_case.id_class().id_byte(rRJ.id_case);
            rKd_12 = rrSp_1.id_class(this.id_case.id_break(rVL.n), this.id_case.id_break(rVL.u), new Random().nextLong());
        } else {
            rRJ2 = rRX2.id_break();
            rKd_12 = rRX2.id_byte();
        }
        rrEm_1 rrEm_12 = new rrEm_1(this, this.O, this.id_protected, rrGB2, rYB.id_byte, rRJ2, roq_32, rKd_12, bl, l2, (List<rrEq_1>)immutableList, true);
        this.id_super.put(rYB.id_byte, rrEm_12);
        rrEi_1 rrEi_12 = rrEm_12.h();
        this.id_class(rrEi_12);
        this.S = new rrEU(rrEi_12);
        roE_2 roE_22 = rrEm_12.id_instanceof();
        roE_22.id_class(rrGB2.id_this());
        if (!rrGB2.id_super()) {
            try {
                rnW_2.id_class(rrEm_12, rrGB2, rrSp_12.id_byte(), bl, true);
                rrGB2.id_byte(true);
                if (bl) {
                    this.id_class(this.id_implements);
                }
            }
            catch (Throwable throwable) {
                KY kY = KY.id_class(throwable, "Exception initializing level");
                try {
                    rrEm_12.id_class(kY);
                }
                catch (Throwable throwable2) {
                    // empty catch block
                }
                throw new KU(kY);
            }
            rrGB2.id_byte(true);
        }
        this.x().id_class(rrEm_12);
        if (this.id_implements.id_try() != null) {
            this.U().id_class(this.id_implements.id_try());
        }
        for (Map.Entry<rqM_2<rRX>, rRX> entry : rVC2.id_throws()) {
            rqM_2<rRX> rqM_22 = entry.getKey();
            if (rqM_22 == rRX.id_break) continue;
            rqM_2<rYB> rqM_23 = rqM_2.id_class(rVL.id_static, rqM_22.id_class());
            rRJ rRJ3 = entry.getValue().id_break();
            rKd_1 rKd_13 = entry.getValue().id_byte();
            rrEa_1 rrEa_12 = new rrEa_1(this.id_implements, rrGB2);
            rrEm_1 rrEm_13 = new rrEm_1(this, this.O, this.id_protected, rrEa_12, rqM_23, rRJ3, roq_32, rKd_13, bl, l2, (List<rrEq_1>)ImmutableList.of(), false);
            roE_22.id_class(new ros_3(rrEm_13.id_instanceof()));
            this.id_super.put(rqM_23, rrEm_13);
        }
    }

    protected rTN id_class(Runnable runnable) {
        return new rTN(this.id_return, runnable);
    }

    protected boolean id_class(rTN rTN2) {
        return rTN2.id_class() + 3 < this.id_return || this.id_break();
    }

    public int m() {
        return this.id_interface;
    }

    public rzC_2 o() {
        return this.X.id_byte();
    }

    public int p() {
        return 256;
    }

    public ruQ_2 k() {
        return this.id_native;
    }

    public String id_default() {
        return this.id_abstract;
    }

    public Of_1 t() {
        return this.X.id_catch();
    }

    public rlQ_2 g() {
        return this.X.id_protected();
    }

    public GameProfileRepository v() {
        return this.id_const;
    }

    public gy_3 j() {
        rrEm_1 rrEm_12 = this.id_abstract();
        return new gy_3(this, rrEm_12 == null ? rjU_2.id_class : rjU_2.id_byte(rrEm_12.X()), rjK_2.id_class, rrEm_12, 4, "Server", new rgN_2("Server"), this, null);
    }

    public long q() {
        return this.id_for;
    }

    public rnd_3 U() {
        return this.s;
    }

    public int id_short() {
        return this.id_continue;
    }

    @Override
    public void close() {
        this.id_this();
    }

    public boolean z() {
        return false;
    }

    public String id_void() {
        return "vanilla";
    }

    public Oa_1 w() {
        return this.E;
    }

    public boolean u() {
        return true;
    }

    public abstract int r();

    @Override
    public boolean y() {
        return super.y() && !this.J();
    }

    public int N() {
        return 16;
    }

    public void id_break(boolean bl) {
        this.id_implements.id_protected(bl);
        this.x().id_super().forEach(this::id_break);
    }

    private void id_break(rhN_2 rhN_22) {
        rrGs_1 rrGs_12 = rhN_22.id_continue().id_public();
        rhN_22.id_class.id_class(new rFE(rrGs_12.id_extends(), rrGs_12.id_native()));
    }

    protected void id_break(rTN rTN2) {
        super.id_throws(rTN2);
    }

    public int id_break(int n) {
        return n;
    }

    private void id_break(roq_3 roq_32) {
        rrEm_1 rrEm_12 = this.id_abstract();
        id_finally.info("Preparing start region for dimension {}", (Object)rrEm_12.E().id_class());
        rfH_2 rfH_22 = rrEm_12.X();
        roq_32.id_class(new rfj_3(rfH_22));
        rrEN rrEN2 = rrEm_12.id_else();
        rrEN2.id_protected().id_class(500);
        this.id_for = rqR_2.id_break();
        rrEN2.id_class(rrEl_1.id_class, new rfj_3(rfH_22), 11, rqg_3.INSTANCE);
        while (rrEN2.id_throws() != 441) {
            this.id_for = rqR_2.id_break() + 10L;
            this.id_public();
        }
        this.id_for = rqR_2.id_break() + 10L;
        this.id_public();
        for (rrEm_1 rrEm_13 : this.id_super.values()) {
            rRc_1 rRc_12 = rrEm_13.h().id_break(rRc_1::new, "chunks");
            if (rRc_12 == null) continue;
            LongIterator longIterator = rRc_12.id_class().iterator();
            while (longIterator.hasNext()) {
                long l = longIterator.nextLong();
                rfj_3 rfj_32 = new rfj_3(l);
                rrEm_13.id_else().id_class(rfj_32, true);
            }
        }
        this.id_for = rqR_2.id_break() + 10L;
        this.id_public();
        roq_32.id_class();
        rrEN2.id_protected().id_class(5);
        this.id_protected();
    }

    public KY id_break(KY kY) {
        if (this.id_this != null) {
            kY.id_case().id_class("Player Count", () -> this.id_this.id_final() + " / " + this.id_this.id_package() + "; " + this.id_this.id_super());
        }
        kY.id_case().id_class("Data Packs", () -> {
            StringBuilder stringBuilder = new StringBuilder();
            for (rAp_1 rAp_12 : this.P.id_throws()) {
                if (stringBuilder.length() > 0) {
                    stringBuilder.append(", ");
                }
                stringBuilder.append(rAp_12.id_throws());
                if (rAp_12.id_byte().id_class()) continue;
                stringBuilder.append(" (incompatible)");
            }
            return stringBuilder.toString();
        });
        if (this.h != null) {
            kY.id_case().id_class("Server Id", () -> this.h);
        }
        return kY;
    }

    public void id_break(String string) {
        this.id_new = string;
    }

    public abstract boolean id_break(GameProfile var1);

    protected void id_break(BooleanSupplier booleanSupplier) {
        this.w().id_byte();
        for (rrEm_1 rrEm_12 : this.id_float()) {
            if (this.id_return % 20 == 0) {
                this.id_this.id_class(new rFp_1(rrEm_12.r(), rrEm_12.P(), rrEm_12.B().id_break(rRu_1.id_finally)), rrEm_12.E());
            }
            try {
                rrEm_12.id_class(booleanSupplier);
            }
            catch (Throwable throwable) {
                KY kY = KY.id_class(throwable, "Exception ticking world");
                rrEm_12.id_class(kY);
                throw new KU(kY);
            }
        }
        this.k().id_byte();
        this.id_this.id_throws();
        if (rqu_3.id_byte) {
            rlT_2.id_class.id_break();
        }
        for (int i = 0; i < this.id_extends.size(); ++i) {
            this.id_extends.get(i).run();
        }
    }

    @Override
    protected /* synthetic */ Runnable id_break(Runnable runnable) {
        return this.id_class(runnable);
    }

    private boolean id_break() {
        return this.rh() || rqR_2.id_break() < (this.id_switch ? this.id_double : this.id_for);
    }

    private void id_break(Path path) throws IOException {
        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(path, new OpenOption[0]);){
            bufferedWriter.write(String.format("pending_tasks: %d\n", this.rJ()));
            bufferedWriter.write(String.format("average_tick_time: %f\n", Float.valueOf(this.a())));
            bufferedWriter.write(String.format("tick_times: %s\n", Arrays.toString(this.id_private)));
            bufferedWriter.write(String.format("queue: %s\n", rqR_2.id_case()));
        }
    }

    @Override
    public void id_throws(String string) {
        this.id_abstract = string;
    }

    @Override
    protected /* synthetic */ void id_throws(Runnable runnable) {
        this.id_break((rTN)runnable);
    }

    @Override
    private void id_throws(Path path) throws IOException {
        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(path, new OpenOption[0]);){
            String string = System.getProperty("java.class.path");
            String string2 = System.getProperty("path.separator");
            for (String string3 : Splitter.on((String)string2).split((CharSequence)string)) {
                bufferedWriter.write(string3);
                bufferedWriter.write("\n");
            }
        }
    }

    public String id_throws() {
        return rqu_3.id_class().getName();
    }

    @Override
    public void id_throws(boolean bl) {
        this.id_goto = bl;
    }

    public run_3 L() {
        return this.id_final;
    }

    public boolean M() {
        return this.id_try;
    }

    public boolean W() {
        return this.id_static;
    }

    public rnG_2 R() {
        return this.B;
    }

    @Override
    public Thread P() {
        return this.id_transient;
    }

    public int id_catch() {
        return this.id_this.id_package();
    }

    public void id_catch(boolean bl) {
        this.id_try = bl;
    }

    public abstract boolean G();

    public abstract boolean O();

    protected abstract boolean id_extends() throws IOException;

    public rzZ_2 K() {
        return this.X.id_break();
    }

    private void id_case(Path path) throws IOException {
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        ThreadInfo[] threadInfoArray = threadMXBean.dumpAllThreads(true, true);
        Arrays.sort(threadInfoArray, Comparator.comparing(ThreadInfo::getThreadName));
        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(path, new OpenOption[0]);){
            for (ThreadInfo threadInfo : threadInfoArray) {
                bufferedWriter.write(threadInfo.toString());
                ((Writer)bufferedWriter).write(10);
            }
        }
    }

    public int id_case() {
        return this.id_this.id_final();
    }

    public void id_case(String string) {
        this.id_instanceof = string;
    }

    public void id_case(boolean bl) {
        this.id_while = bl;
    }

    public boolean id_const() {
        return this.id_abstract != null;
    }

    public abstract int id_continue();

    public String id_else() {
        return this.id_new;
    }

    public String id_for() {
        return this.id_float;
    }

    public void id_implements(boolean bl) {
        this.b = bl;
    }

    public KeyPair id_import() {
        return this.id_char;
    }

    public File id_instanceof() {
        return new File(".");
    }

    public abstract int id_new();

    public rRl_1 id_package() {
        return this.id_implements.id_new();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void id_return() {
        try {
            if (this.id_extends()) {
                this.id_for = rqR_2.id_break();
                this.id_final.id_class(new rgN_2(this.id_instanceof));
                this.id_final.id_class(new ruy_3(rqu_3.id_class().getName(), rqu_3.id_class().getProtocolVersion()));
                this.id_class(this.id_final);
                while (this.id_else) {
                    long l = rqR_2.id_break() - this.id_for;
                    if (l > 2000L && this.id_for - this.id_import >= 15000L) {
                        long l2 = l / 50L;
                        id_finally.warn("Can't keep up! Is the server overloaded? Running {}ms or {} ticks behind", (Object)l, (Object)l2);
                        this.id_for += l2 * 50L;
                        this.id_import = this.id_for;
                    }
                    this.id_for += 50L;
                    this.id_class(this::id_break);
                    this.id_switch = true;
                    this.id_double = Math.max(rqR_2.id_break() + 50L, this.id_for);
                    this.id_public();
                    this.id_static = true;
                }
            } else {
                this.id_class((KY)null);
            }
        }
        catch (Throwable throwable) {
            id_finally.error("Encountered an unexpected exception", throwable);
            KY kY = throwable instanceof KU ? this.id_break(((KU)throwable).id_class()) : this.id_break(new KY("Exception in server tick loop", throwable));
            File file = new File(new File(this.id_instanceof(), "crash-reports"), "crash-" + new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss").format(new Date()) + "-server.txt");
            if (kY.id_class(file)) {
                id_finally.error("This crash report has been saved to: {}", (Object)file.getAbsolutePath());
            } else {
                id_finally.error("We were unable to save this crash report to disk.");
            }
            this.id_class(kY);
        }
        finally {
            try {
                this.id_synchronized = true;
                this.id_this();
            }
            catch (Throwable throwable) {
                id_finally.error("Exception stopping the server", throwable);
            }
            finally {
                this.id_throw();
            }
        }
    }

    public abstract boolean id_super();

    public abstract boolean id_switch();

    protected void id_throw() {
    }

    public File id_try() {
        return this.id_protected.id_case();
    }

    public boolean id_while() {
        this.r = this.r || this.id_try().isFile();
        return this.r;
    }

    public abstract Optional<String> id_static();

    protected void id_public() {
        this.rd();
        this.id_byte(() -> !this.id_break());
    }

    private void id_protected(Path path) throws IOException {
        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(path, new OpenOption[0]);){
            ArrayList arrayList = Lists.newArrayList();
            rRu_1 rRu_12 = this.D();
            rRu_1.id_class(new rnQ_2(this, arrayList, rRu_12));
            for (String string : arrayList) {
                bufferedWriter.write(string);
            }
        }
    }

    private void id_protected() {
        for (rrEm_1 rrEm_12 : this.id_float()) {
            rrEm_12.id_class(this.id_boolean(), this.s());
        }
    }

    public void id_protected(int n) {
        this.id_interface = n;
    }

    public void id_protected(boolean bl) {
        this.id_public = bl;
    }

    public File id_protected(String string) {
        return new File(this.id_instanceof(), string);
    }

    public void id_protected(Runnable runnable) {
        this.id_extends.add(runnable);
    }

    @Override
    public void id_private(boolean bl) {
        this.id_short = bl;
    }

    public String[] id_private() {
        return this.id_this.id_case();
    }

    public final rrEm_1 id_abstract() {
        return this.id_super.get(rYB.id_byte);
    }

    protected void id_final() {
        File file = this.id_protected.id_class(rrGr_1.id_private).toFile();
        if (file.isFile()) {
            String string = this.id_protected.id_class();
            try {
                this.id_class("level://" + URLEncoder.encode(string, StandardCharsets.UTF_8.toString()) + "/resources.zip", "");
            }
            catch (UnsupportedEncodingException unsupportedEncodingException) {
                id_finally.warn("Something went wrong url encoding {}", (Object)string);
            }
        }
    }

    public boolean id_transient() {
        return this.id_long;
    }

    protected void id_volatile() {
    }

    public boolean id_synchronized() {
        return this.id_else;
    }

    protected void id_native() {
        this.id_final();
        this.id_implements.id_class(this.id_void(), this.id_static().isPresent());
        roq_3 roq_32 = this.id_volatile.create(11);
        this.id_class(roq_32);
        this.id_volatile();
        this.id_break(roq_32);
    }

    protected void id_strictfp() {
        id_finally.info("Generating keypair");
        try {
            this.id_char = ryK_2.id_break();
        }
        catch (ryo_3 ryo_32) {
            throw new IllegalStateException("Failed to generate key pair", ryo_32);
        }
    }

    public boolean E() {
        return true;
    }

    public void A() {
        this.id_boolean = 0L;
    }

    public DataFixer T() {
        return this.id_int;
    }

    public int X() {
        return this.id_throw;
    }

    public int Q() {
        return this.id_return;
    }

    public boolean rr() {
        return true;
    }

    public rrGP rB() {
        return this.id_implements;
    }

    public rrPt_1 rP() {
        return this.J;
    }

    public rVm_1 rS() {
        return this.id_case;
    }

    @Override
    public boolean k_() {
        boolean bl;
        this.id_switch = bl = this.id_byte();
        return bl;
    }

    public rrEU Y() {
        if (this.S == null) {
            throw new NullPointerException("Called before server init");
        }
        return this.S;
    }
}

