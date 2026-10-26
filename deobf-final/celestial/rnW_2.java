package celestial;

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
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.net.Proxy;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
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
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import javax.imageio.ImageIO;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class rnW_2 extends rTz_1<rTN> implements AutoCloseable, gV_2 {
   static final Logger finally_ = LogManager.getLogger();
   public static final File class_ = new File("usercache.json");
   public static final rYE break_ = new rYE("Demo World", rRl_1.SURVIVAL, false, rRO.NORMAL, false, new rRu_1(), rTH.class_);
   protected final rrGk_1 protected_;
   protected final rrGx_1 throws_;
   private final List<Runnable> extends_ = Lists.newArrayList();
   private final ruQ_2 native_;
   private final roT_2 volatile_;
   private final run_3 final_ = new run_3();
   private final Random package_ = new Random();
   private final DataFixer int_;
   private String new_;
   private int continue_ = -1;
   protected final rVv_1 case_;
   private final Map<rqM_2<rYB>, rrEm_1> super_ = Maps.newLinkedHashMap();
   private rCr_1 this_;
   private volatile boolean else_ = true;
   private boolean synchronized_;
   private int return_;
   protected final Proxy catch_;
   private boolean public_;
   private boolean goto_;
   private boolean while_;
   private boolean try_;
   private String instanceof_;
   private int throw_;
   private int interface_;
   public final long[] private_ = new long[100];
   private KeyPair char_;
   private String abstract_;
   private boolean long_;
   private String float_ = "";
   private String void_ = "";
   private volatile boolean static_;
   private long import_;
   private boolean short_;
   private final MinecraftSessionService default_;
   private final GameProfileRepository const_;
   private final rCB strictfp_;
   private long boolean_;
   private final Thread transient_;
   private long for_ = rqR_2.break_();
   private long double_;
   private boolean switch_;
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
   protected final rrGP implements_;

   protected boolean boolean_() {
      return this.implements_.extends_() != rRO.PEACEFUL;
   }

   public boolean char_() {
      return !this.transient_.isAlive();
   }

   public void byte_(int var1) {
      this.throw_ = var1;
   }

   private void byte_(Path var1) throws IOException {
      KY var2 = new KY("Server dump", new Exception("dummy"));
      this.break_(var2);

      try (BufferedWriter var3 = Files.newBufferedWriter(var1)) {
         var3.write(var2.protected_());
      }
   }

   protected void byte_(String var1) {
      this.h = var1;
   }

   public void byte_(boolean var1) {
      this.long_ = var1;
   }

   private boolean byte_() {
      if (super.k_()) {
         return true;
      } else {
         if (this.break_()) {
            for (rrEm_1 var2 : this.float_()) {
               if (var2.else_().catch_()) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   public boolean int_() {
      return this.implements_.implements_();
   }

   public Set<rqM_2<rYB>> long_() {
      return this.super_.keySet();
   }

   public Iterable<rrEm_1> float_() {
      return this.super_.values();
   }

   public String double_() {
      return this.void_;
   }

   public rnW_2(
      Thread var1,
      rVv_1 var2,
      rrGk_1 var3,
      rrGP var4,
      rAt_1 var5,
      Proxy var6,
      DataFixer var7,
      rAh_1 var8,
      MinecraftSessionService var9,
      GameProfileRepository var10,
      rCB var11,
      roT_2 var12
   ) {
      super("Server");
      this.case_ = var2;
      this.implements_ = var4;
      this.catch_ = var6;
      this.P = var5;
      this.X = var8;
      this.default_ = var9;
      this.const_ = var10;
      this.strictfp_ = var11;
      this.native_ = new ruQ_2(this);
      this.volatile_ = var12;
      this.protected_ = var3;
      this.throws_ = var3.break_();
      this.int_ = var7;
      this.E = new Oa_1(this, var8.class_());
      this.J = new rrPt_1(var8.private_(), var3, var7);
      this.transient_ = var1;
      this.O = rqR_2.case_();
   }

   public boolean B() {
      return this.public_;
   }

   @Override
   public boolean C() {
      return true;
   }

   public rRu_1 D() {
      return this.abstract_().B();
   }

   public rCB F() {
      return this.strictfp_;
   }

   public rAt_1 I() {
      return this.P;
   }

   public boolean J() {
      return this.synchronized_;
   }

   public boolean S() {
      return this.goto_;
   }

   public MinecraftSessionService Z() {
      return this.default_;
   }

   public rWB V() {
      return this.X.throws_();
   }

   protected void this_() {
      finally_.info("Stopping server");
      if (this.k() != null) {
         this.k().break_();
      }

      if (this.this_ != null) {
         finally_.info("Saving players");
         this.this_.implements_();
         this.this_.continue_();
      }

      finally_.info("Saving worlds");

      for (rrEm_1 var2 : this.float_()) {
         if (var2 != null) {
            var2.synchronized_ = false;
         }
      }

      this.class_(false, true, false);

      for (rrEm_1 var7 : this.float_()) {
         if (var7 != null) {
            try {
               var7.close();
            } catch (IOException var5) {
               finally_.error("Exception closing the level", var5);
            }
         }
      }

      this.X.close();

      try {
         this.protected_.close();
      } catch (IOException var4) {
         finally_.error("Failed to unlock level {}", this.protected_.class_(), var4);
      }
   }

   public boolean e() {
      return this.b;
   }

   public rpN_2 i() {
      return this.G;
   }

   public boolean b() {
      return this.while_;
   }

   public rCr_1 x() {
      return this.this_;
   }

   public boolean s() {
      return true;
   }

   public boolean c() {
      return this.short_;
   }

   public int n() {
      return 29999984;
   }

   public String h() {
      return this.instanceof_;
   }

   public gp_3 f() {
      return this.X.case_();
   }

   @Override
   public boolean l() {
      return true;
   }

   public abstract boolean d();

   public float a() {
      return this.M;
   }

   public boolean interface_() {
      return true;
   }

   public void class_(int var1) {
      this.continue_ = var1;
   }

   public void class_(rRO var1, boolean var2) {
      if (var2 || !this.implements_.native_()) {
         this.implements_.class_(this.implements_.implements_() ? rRO.HARD : var1);
         this.protected_();
         this.x().super_().forEach(this::break_);
      }
   }

   public void class_(String var1, String var2) {
      this.float_ = var1;
      this.void_ = var2;
   }

   public static <S extends rnW_2> S class_(Function<Thread, S> var0) {
      AtomicReference var1 = new AtomicReference();
      Thread var2 = new Thread(() -> ((rnW_2)var1.get()).return_(), "Server thread");
      var2.setUncaughtExceptionHandler((var0x, var1x) -> finally_.error(var1x));
      rnW_2 var3 = (rnW_2)var0.apply(var2);
      var1.set(var3);
      var2.start();
      return (S)var3;
   }

   public static rTH class_(rAt_1 var0, rTH var1, boolean var2) {
      var0.class_();
      if (var2) {
         var0.class_(Collections.singleton("vanilla"));
         return new rTH(ImmutableList.of("vanilla"), ImmutableList.of());
      } else {
         LinkedHashSet var3 = Sets.newLinkedHashSet();

         for (String var5 : var1.class_()) {
            if (var0.break_(var5)) {
               var3.add(var5);
            } else {
               finally_.warn("Missing data pack {}", var5);
            }
         }

         for (rAp_1 var8 : var0.byte_()) {
            String var6 = var8.throws_();
            if (!var1.break_().contains(var6) && !var3.contains(var6)) {
               finally_.info("Found new data pack {}, loading it automatically", var6);
               var3.add(var6);
            }
         }

         if (var3.isEmpty()) {
            finally_.info("No datapacks selected, forcing vanilla");
            var3.add("vanilla");
         }

         var0.class_(var3);
         return class_(var0);
      }
   }

   public CompletableFuture<Void> class_(Collection<String> var1) {
      CompletableFuture var2 = CompletableFuture.<ImmutableList>supplyAsync(
            () -> var1.stream().map(this.P::class_).filter(Objects::nonNull).map(rAp_1::protected_).collect(ImmutableList.toImmutableList()), this
         )
         .thenCompose(var1x -> rAh_1.class_(var1x, this.switch_() ? gq_3.DEDICATED : gq_3.INTEGRATED, this.continue_(), this.O, this))
         .thenAcceptAsync(var2x -> {
            this.X.close();
            this.X = var2x;
            this.P.class_(var1);
            this.implements_.class_(class_(this.P));
            var2x.implements_();
            this.x().implements_();
            this.x().this_();
            this.E.class_(this.X.class_());
            this.J.class_(this.X.private_());
         }, this);
      if (this.rX()) {
         this.byte_(var2::isDone);
      }

      return var2;
   }

   public int class_(rrEm_1 var1) {
      return var1 != null ? var1.B().byte_(rRu_1.new_) : 10;
   }

   public void class_(Path var1) throws IOException {
      Path var2 = var1.resolve("levels");

      for (Entry var4 : this.super_.entrySet()) {
         rqO_2 var5 = ((rqM_2)var4.getKey()).class_();
         Path var6 = var2.resolve(var5.byte_()).resolve(var5.break_());
         Files.createDirectories(var6);
         ((rrEm_1)var4.getValue()).class_(var6);
      }

      this.protected_(var1.resolve("gamerules.txt"));
      this.throws_(var1.resolve("classpath.txt"));
      this.byte_(var1.resolve("example_crash.txt"));
      this.break_(var1.resolve("stats.txt"));
      this.case_(var1.resolve("threads.txt"));
   }

   private static rTH class_(rAt_1 var0) {
      Collection var1 = var0.protected_();
      ImmutableList var2 = ImmutableList.copyOf(var1);
      List var3 = var0.break_().stream().filter(var1x -> !var1.contains(var1x)).collect(ImmutableList.toImmutableList());
      return new rTH(var2, var3);
   }

   public void class_(gy_3 var1) {
      if (this.e()) {
         rCr_1 var2 = var1.super_().x();
         rCk_1 var3 = var2.finally_();

         for (rhN_2 var5 : Lists.newArrayList(var2.super_())) {
            if (!var3.class_(var5.sv())) {
               var5.class_.class_(new rgn_3("multiplayer.disconnect.not_whitelisted"));
            }
         }
      }
   }

   public int class_(GameProfile var1) {
      if (this.x().case_(var1)) {
         rne_3 var2 = this.x().native_().break_(var1);
         if (var2 != null) {
            return var2.class_();
         } else if (this.break_(var1)) {
            return 4;
         } else if (this.const_()) {
            return this.x().else_() ? 4 : 0;
         } else {
            return this.new_();
         }
      } else {
         return 0;
      }
   }

   public void class_(rCr_1 var1) {
      this.this_ = var1;
   }

   public Path class_(rrGr_1 var1) {
      return this.protected_.class_(var1);
   }

   public rgV_2 class_(rhN_2 var1) {
      return null;
   }

   public void class_(rRl_1 var1) {
      this.implements_.class_(var1);
   }

   public abstract boolean class_(rRl_1 var1, boolean var2, int var3);

   public boolean class_(rrEm_1 var1, rfH_2 var2, rhd_3 var3) {
      return false;
   }

   private static void class_(rrEm_1 var0, rrGB var1, boolean var2, boolean var3, boolean var4) {
      rKd_1 var5 = var0.else_().implements_();
      if (!var4) {
         var1.class_(rfH_2.protected_.break_(var5.byte_()), 0.0F);
      } else if (var3) {
         var1.class_(rfH_2.protected_.final_(), 0.0F);
      } else {
         rYY var6 = var5.protected_();
         Random var7 = new Random(var0.break_());
         rfH_2 var8 = var6.class_(0, var0.short_(), 0, 256, var0x -> var0x.break_().break_(), var7);
         rfj_3 var9 = var8 == null ? new rfj_3(0, 0) : new rfj_3(var8);
         if (var8 == null) {
            finally_.warn("Unable to find spawn biome");
         }

         boolean var10 = false;

         for (xd_3 var12 : rls_3.P.class_()) {
            if (var6.byte_().contains(var12.continue_())) {
               var10 = true;
               break;
            }
         }

         var1.class_(var9.finally_().break_(8, var5.byte_(), 8), 0.0F);
         int var18 = 0;
         int var19 = 0;
         int var13 = 0;
         int var14 = -1;
         byte var15 = 32;

         for (int var16 = 0; var16 < 1024; var16++) {
            if (var18 > -16 && var18 <= 16 && var19 > -16 && var19 <= 16) {
               rfH_2 var17 = rhc_3.class_(var0, new rfj_3(var9.break_ + var18, var9.byte_ + var19), var10);
               if (var17 != null) {
                  var1.class_(var17, 0.0F);
                  break;
               }
            }

            if (var18 == var19 || var18 < 0 && var18 == -var19 || var18 > 0 && var18 == 1 - var19) {
               int var21 = var13;
               var13 = -var14;
               var14 = var21;
            }

            var18 += var13;
            var19 += var14;
         }

         if (var2) {
            rDg_1 var20 = rUx_1.r;
            var20.class_(var0, var5, var0.int_, new rfH_2(var1.class_(), var1.break_(), var1.byte_()));
         }
      }
   }

   @Override
   public void class_(rgP_2 var1, UUID var2) {
      finally_.info(var1.getString());
   }

   public boolean class_(boolean var1, boolean var2, boolean var3) {
      boolean var4 = false;

      for (rrEm_1 var6 : this.float_()) {
         if (!var1) {
         }

         var6.class_((rpC_2)null, var2, var6.synchronized_ && !var3);
         var4 = true;
      }

      rrEm_1 var7 = this.abstract_();
      rrGB var8 = this.implements_.instanceof_();
      var8.class_(var7.instanceof_().this_());
      this.implements_.class_(this.U().byte_());
      this.protected_.class_(this.case_, this.implements_, this.x().protected_());
      return var4;
   }

   protected void class_(KY var1) {
   }

   public rrEm_1 class_(rqM_2<rYB> var1) {
      return this.super_.get(var1);
   }

   private void class_(rrGP var1) {
      var1.class_(rRO.PEACEFUL);
      var1.protected_(true);
      rrGB var2 = var1.instanceof_();
      var2.class_(false);
      var2.break_(false);
      var2.protected_(1000000000);
      var2.break_(6000L);
      var2.class_(rRl_1.SPECTATOR);
   }

   public void class_(boolean var1) {
      this.else_ = false;
      if (var1) {
         try {
            this.transient_.join();
         } catch (InterruptedException var3) {
            finally_.error("Error while shutting down", var3);
         }
      }
   }

   protected void class_(BooleanSupplier var1) {
      long var2 = rqR_2.byte_();
      this.return_++;
      this.break_(var1);
      if (var2 - this.boolean_ >= 5000000000L) {
         this.boolean_ = var2;
         this.final_.class_(new ruC_2(this.catch_(), this.case_()));
         GameProfile[] var4 = new GameProfile[Math.min(this.case_(), 12)];
         int var5 = rfU_2.class_(this.package_, 0, this.case_() - var4.length);

         for (int var6 = 0; var6 < var4.length; var6++) {
            var4[var6] = this.this_.super_().get(var5 + var6).sv();
         }

         Collections.shuffle(Arrays.asList(var4));
         this.final_.break_().class_(var4);
      }

      if (this.return_ % 6000 == 0) {
         finally_.debug("Autosave started");
         this.this_.implements_();
         this.class_(true, false, false);
         finally_.debug("Autosave finished");
      }

      long var8 = this.private_[this.return_ % 100] = rqR_2.byte_() - var2;
      this.M = this.M * 0.8F + (float)var8 / 1000000.0F * 0.19999999F;
      long var9 = rqR_2.byte_();
      this.G.class_(var9 - var2);
   }

   public static void class_(rrGk_1 var0) {
      if (var0.byte_()) {
         finally_.info("Converting map!");
         var0.class_(new rnz_3());
      }
   }

   private void class_(rrEi_1 var1) {
      rnE_2 var2 = var1.class_(rnE_2::new, "scoreboard");
      var2.class_(this.R());
      this.R().class_(new rrGu_1(var2));
   }

   private void class_(run_3 var1) {
      File var2 = this.protected_("server-icon.png");
      if (!var2.exists()) {
         var2 = this.protected_.case_();
      }

      if (var2.isFile()) {
         ByteBuf var3 = Unpooled.buffer();

         try {
            BufferedImage var4 = ImageIO.read(var2);
            Validate.validState(var4.getWidth() == 64, "Must be 64 pixels wide", new Object[0]);
            Validate.validState(var4.getHeight() == 64, "Must be 64 pixels high", new Object[0]);
            ImageIO.write(var4, "PNG", new ByteBufOutputStream(var3));
            ByteBuffer var5 = Base64.getEncoder().encode(var3.nioBuffer());
            var1.class_("data:image/png;base64," + StandardCharsets.UTF_8.decode(var5));
         } catch (Exception var9) {
            finally_.error("Couldn't load server icon", var9);
         } finally {
            var3.release();
         }
      }
   }

   protected void class_(roq_3 var1) {
      rrGB var2 = this.implements_.instanceof_();
      rrSp_1 var3 = this.implements_.long_();
      boolean var4 = var3.catch_();
      long var5 = var3.class_();
      long var7 = rYA.class_(var5);
      ImmutableList var9 = ImmutableList.of(new rrEI(), new rrEw_1(), new rrEp_1(), new rRB(), new rrEf_1(var2));
      rVC var10 = var3.protected_();
      rRX var11 = var10.class_(rRX.break_);
      Object var12;
      rRJ var13;
      if (var11 == null) {
         var13 = this.case_.class_().byte_(rRJ.case_);
         var12 = rrSp_1.class_(this.case_.break_(rVL.n), this.case_.break_(rVL.u), new Random().nextLong());
      } else {
         var13 = var11.break_();
         var12 = var11.byte_();
      }

      rrEm_1 var14 = new rrEm_1(this, this.O, this.protected_, var2, rYB.byte_, var13, var1, (rKd_1)var12, var4, var7, var9, true);
      this.super_.put(rYB.byte_, var14);
      rrEi_1 var15 = var14.h();
      this.class_(var15);
      this.S = new rrEU(var15);
      roE_2 var16 = var14.instanceof_();
      var16.class_(var2.this_());
      if (!var2.super_()) {
         try {
            class_(var14, var2, var3.byte_(), var4, true);
            var2.byte_(true);
            if (var4) {
               this.class_(this.implements_);
            }
         } catch (Throwable var26) {
            KY var18 = KY.class_(var26, "Exception initializing level");

            try {
               var14.class_(var18);
            } catch (Throwable var25) {
            }

            throw new KU(var18);
         }

         var2.byte_(true);
      }

      this.x().class_(var14);
      if (this.implements_.try_() != null) {
         this.U().class_(this.implements_.try_());
      }

      for (Entry var27 : var10.throws_()) {
         rqM_2 var19 = (rqM_2)var27.getKey();
         if (var19 != rRX.break_) {
            rqM_2 var20 = rqM_2.class_(rVL.static_, var19.class_());
            rRJ var21 = ((rRX)var27.getValue()).break_();
            rKd_1 var22 = ((rRX)var27.getValue()).byte_();
            rrEa_1 var23 = new rrEa_1(this.implements_, var2);
            rrEm_1 var24 = new rrEm_1(this, this.O, this.protected_, var23, var20, var21, var1, var22, var4, var7, ImmutableList.of(), false);
            var16.class_(new ros_3(var24.instanceof_()));
            this.super_.put(var20, var24);
         }
      }
   }

   protected rTN class_(Runnable var1) {
      return new rTN(this.return_, var1);
   }

   protected boolean class_(rTN var1) {
      return var1.class_() + 3 < this.return_ || this.break_();
   }

   public int m() {
      return this.interface_;
   }

   public rzC_2 o() {
      return this.X.byte_();
   }

   public int p() {
      return 256;
   }

   public ruQ_2 k() {
      return this.native_;
   }

   public String default_() {
      return this.abstract_;
   }

   public Of_1 t() {
      return this.X.catch_();
   }

   public rlQ_2 g() {
      return this.X.protected_();
   }

   public GameProfileRepository v() {
      return this.const_;
   }

   public gy_3 j() {
      rrEm_1 var1 = this.abstract_();
      return new gy_3(this, var1 == null ? rjU_2.class_ : rjU_2.byte_(var1.X()), rjK_2.class_, var1, 4, "Server", new rgN_2("Server"), this, (an_3)null);
   }

   public long q() {
      return this.for_;
   }

   public rnd_3 U() {
      return this.s;
   }

   public int short_() {
      return this.continue_;
   }

   @Override
   public void close() {
      this.this_();
   }

   public boolean z() {
      return false;
   }

   public String void_() {
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

   public void break_(boolean var1) {
      this.implements_.protected_(var1);
      this.x().super_().forEach(this::break_);
   }

   private void break_(rhN_2 var1) {
      rrGs_1 var2 = var1.continue_().public_();
      var1.class_.class_(new rFE(var2.extends_(), var2.native_()));
   }

   protected void break_(rTN var1) {
      super.throws_(var1);
   }

   public int break_(int var1) {
      return var1;
   }

   private void break_(roq_3 var1) {
      rrEm_1 var2 = this.abstract_();
      finally_.info("Preparing start region for dimension {}", var2.E().class_());
      rfH_2 var3 = var2.X();
      var1.class_(new rfj_3(var3));
      rrEN var4 = var2.else_();
      var4.protected_().class_(500);
      this.for_ = rqR_2.break_();
      var4.class_(rrEl_1.class_, new rfj_3(var3), 11, rqg_3.INSTANCE);

      while (var4.throws_() != 441) {
         this.for_ = rqR_2.break_() + 10L;
         this.public_();
      }

      this.for_ = rqR_2.break_() + 10L;
      this.public_();

      for (rrEm_1 var6 : this.super_.values()) {
         rRc_1 var7 = var6.h().break_(rRc_1::new, "chunks");
         if (var7 != null) {
            LongIterator var8 = var7.class_().iterator();

            while (var8.hasNext()) {
               long var9 = var8.nextLong();
               rfj_3 var11 = new rfj_3(var9);
               var6.else_().class_(var11, true);
            }
         }
      }

      this.for_ = rqR_2.break_() + 10L;
      this.public_();
      var1.class_();
      var4.protected_().class_(5);
      this.protected_();
   }

   public KY break_(KY var1) {
      if (this.this_ != null) {
         var1.case_().class_("Player Count", () -> this.this_.final_() + " / " + this.this_.package_() + "; " + this.this_.super_());
      }

      var1.case_().class_("Data Packs", () -> {
         StringBuilder var1x = new StringBuilder();

         for (rAp_1 var3 : this.P.throws_()) {
            if (var1x.length() > 0) {
               var1x.append(", ");
            }

            var1x.append(var3.throws_());
            if (!var3.byte_().class_()) {
               var1x.append(" (incompatible)");
            }
         }

         return var1x.toString();
      });
      if (this.h != null) {
         var1.case_().class_("Server Id", () -> this.h);
      }

      return var1;
   }

   public void break_(String var1) {
      this.new_ = var1;
   }

   public abstract boolean break_(GameProfile var1);

   protected void break_(BooleanSupplier var1) {
      this.w().byte_();

      for (rrEm_1 var3 : this.float_()) {
         if (this.return_ % 20 == 0) {
            this.this_.class_(new rFp_1(var3.r(), var3.P(), var3.B().break_(rRu_1.finally_)), var3.E());
         }

         try {
            var3.class_(var1);
         } catch (Throwable var6) {
            KY var5 = KY.class_(var6, "Exception ticking world");
            var3.class_(var5);
            throw new KU(var5);
         }
      }

      this.k().byte_();
      this.this_.throws_();
      if (rqu_3.byte_) {
         rlT_2.class_.break_();
      }

      for (int var7 = 0; var7 < this.extends_.size(); var7++) {
         this.extends_.get(var7).run();
      }
   }

   private boolean break_() {
      return this.rh() || rqR_2.break_() < (this.switch_ ? this.double_ : this.for_);
   }

   private void break_(Path var1) throws IOException {
      try (BufferedWriter var2 = Files.newBufferedWriter(var1)) {
         var2.write(String.format("pending_tasks: %d\n", this.rJ()));
         var2.write(String.format("average_tick_time: %f\n", this.a()));
         var2.write(String.format("tick_times: %s\n", Arrays.toString(this.private_)));
         var2.write(String.format("queue: %s\n", rqR_2.case_()));
      }
   }

   public void throws_(String var1) {
      this.abstract_ = var1;
   }

   private void throws_(Path var1) throws IOException {
      try (BufferedWriter var2 = Files.newBufferedWriter(var1)) {
         String var3 = System.getProperty("java.class.path");
         String var4 = System.getProperty("path.separator");

         for (String var6 : Splitter.on(var4).split(var3)) {
            var2.write(var6);
            var2.write("\n");
         }
      }
   }

   public String throws_() {
      return rqu_3.class_().getName();
   }

   public void throws_(boolean var1) {
      this.goto_ = var1;
   }

   public run_3 L() {
      return this.final_;
   }

   public boolean M() {
      return this.try_;
   }

   public boolean W() {
      return this.static_;
   }

   public rnG_2 R() {
      return this.B;
   }

   @Override
   public Thread P() {
      return this.transient_;
   }

   public int catch_() {
      return this.this_.package_();
   }

   public void catch_(boolean var1) {
      this.try_ = var1;
   }

   public abstract boolean G();

   public abstract boolean O();

   protected abstract boolean extends_() throws IOException;

   public rzZ_2 K() {
      return this.X.break_();
   }

   private void case_(Path var1) throws IOException {
      ThreadMXBean var2 = ManagementFactory.getThreadMXBean();
      ThreadInfo[] var3 = var2.dumpAllThreads(true, true);
      Arrays.sort(var3, Comparator.comparing(ThreadInfo::getThreadName));

      try (BufferedWriter var4 = Files.newBufferedWriter(var1)) {
         for (ThreadInfo var8 : var3) {
            var4.write(var8.toString());
            var4.write(10);
         }
      }
   }

   public int case_() {
      return this.this_.final_();
   }

   public void case_(String var1) {
      this.instanceof_ = var1;
   }

   public void case_(boolean var1) {
      this.while_ = var1;
   }

   public boolean const_() {
      return this.abstract_ != null;
   }

   public abstract int continue_();

   public String else_() {
      return this.new_;
   }

   public String for_() {
      return this.float_;
   }

   public void implements_(boolean var1) {
      this.b = var1;
   }

   public KeyPair import_() {
      return this.char_;
   }

   public File instanceof_() {
      return new File(".");
   }

   public abstract int new_();

   public rRl_1 package_() {
      return this.implements_.new_();
   }

   protected void return_() {
      try {
         if (this.extends_()) {
            this.for_ = rqR_2.break_();
            this.final_.class_(new rgN_2(this.instanceof_));
            this.final_.class_(new ruy_3(rqu_3.class_().getName(), rqu_3.class_().getProtocolVersion()));
            this.class_(this.final_);

            while (this.else_) {
               long var1 = rqR_2.break_() - this.for_;
               if (var1 > 2000L && this.for_ - this.import_ >= 15000L) {
                  long var46 = var1 / 50L;
                  finally_.warn("Can't keep up! Is the server overloaded? Running {}ms or {} ticks behind", var1, var46);
                  this.for_ += var46 * 50L;
                  this.import_ = this.for_;
               }

               this.for_ += 50L;
               this.class_(this::break_);
               this.switch_ = true;
               this.double_ = Math.max(rqR_2.break_() + 50L, this.for_);
               this.public_();
               this.static_ = true;
            }
         } else {
            this.class_((KY)null);
         }
      } catch (Throwable var44) {
         finally_.error("Encountered an unexpected exception", var44);
         KY var2;
         if (var44 instanceof KU) {
            var2 = this.break_(((KU)var44).class_());
         } else {
            var2 = this.break_(new KY("Exception in server tick loop", var44));
         }

         File var3 = new File(
            new File(this.instanceof_(), "crash-reports"), "crash-" + new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss").format(new Date()) + "-server.txt"
         );
         if (var2.class_(var3)) {
            finally_.error("This crash report has been saved to: {}", var3.getAbsolutePath());
         } else {
            finally_.error("We were unable to save this crash report to disk.");
         }

         this.class_(var2);
      } finally {
         try {
            this.synchronized_ = true;
            this.this_();
         } catch (Throwable var42) {
            finally_.error("Exception stopping the server", var42);
         } finally {
            this.throw_();
         }
      }
   }

   public abstract boolean super_();

   public abstract boolean switch_();

   protected void throw_() {
   }

   public File try_() {
      return this.protected_.case_();
   }

   public boolean while_() {
      this.r = this.r || this.try_().isFile();
      return this.r;
   }

   public abstract Optional<String> static_();

   protected void public_() {
      this.rd();
      this.byte_(() -> !this.break_());
   }

   private void protected_(Path var1) throws IOException {
      try (BufferedWriter var2 = Files.newBufferedWriter(var1)) {
         ArrayList var3 = Lists.newArrayList();
         rRu_1 var4 = this.D();
         rRu_1.class_(new rnQ_2(this, var3, var4));

         for (String var6 : var3) {
            var2.write(var6);
         }
      }
   }

   private void protected_() {
      for (rrEm_1 var2 : this.float_()) {
         var2.class_(this.boolean_(), this.s());
      }
   }

   public void protected_(int var1) {
      this.interface_ = var1;
   }

   public void protected_(boolean var1) {
      this.public_ = var1;
   }

   public File protected_(String var1) {
      return new File(this.instanceof_(), var1);
   }

   public void protected_(Runnable var1) {
      this.extends_.add(var1);
   }

   public void private_(boolean var1) {
      this.short_ = var1;
   }

   public String[] private_() {
      return this.this_.case_();
   }

   public final rrEm_1 abstract_() {
      return this.super_.get(rYB.byte_);
   }

   protected void final_() {
      File var1 = this.protected_.class_(rrGr_1.private_).toFile();
      if (var1.isFile()) {
         String var2 = this.protected_.class_();

         try {
            this.class_("level://" + URLEncoder.encode(var2, StandardCharsets.UTF_8.toString()) + "/resources.zip", "");
         } catch (UnsupportedEncodingException var4) {
            finally_.warn("Something went wrong url encoding {}", var2);
         }
      }
   }

   public boolean transient_() {
      return this.long_;
   }

   protected void volatile_() {
   }

   public boolean synchronized_() {
      return this.else_;
   }

   protected void native_() {
      this.final_();
      this.implements_.class_(this.void_(), this.static_().isPresent());
      roq_3 var1 = this.volatile_.create(11);
      this.class_(var1);
      this.volatile_();
      this.break_(var1);
   }

   protected void strictfp_() {
      finally_.info("Generating keypair");

      try {
         this.char_ = ryK_2.break_();
      } catch (ryo_3 var2) {
         throw new IllegalStateException("Failed to generate key pair", var2);
      }
   }

   public boolean E() {
      return true;
   }

   public void A() {
      this.boolean_ = 0L;
   }

   public DataFixer T() {
      return this.int_;
   }

   public int X() {
      return this.throw_;
   }

   public int Q() {
      return this.return_;
   }

   public boolean rr() {
      return true;
   }

   public rrGP rB() {
      return this.implements_;
   }

   public rrPt_1 rP() {
      return this.J;
   }

   public rVm_1 rS() {
      return this.case_;
   }

   @Override
   public boolean k_() {
      boolean var1 = this.byte_();
      this.switch_ = var1;
      return var1;
   }

   public rrEU Y() {
      if (this.S == null) {
         throw new NullPointerException("Called before server init");
      } else {
         return this.S;
      }
   }
}
