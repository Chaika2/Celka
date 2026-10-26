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
   static final Logger id_finally = LogManager.getLogger();
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

   public void id_byte(int var1) {
      this.id_throw = var1;
   }

   private void id_byte(Path var1) throws IOException {
      KY var2 = new KY("Server dump", new Exception("dummy"));
      this.id_break(var2);

      try (BufferedWriter var3 = Files.newBufferedWriter(var1)) {
         var3.write(var2.id_protected());
      }
   }

   protected void id_byte(String var1) {
      this.h = var1;
   }

   public void id_byte(boolean var1) {
      this.id_long = var1;
   }

   private boolean id_byte() {
      if (super.k_()) {
         return true;
      } else {
         if (this.id_break()) {
            for (rrEm_1 var2 : this.id_float()) {
               if (var2.id_else().id_catch()) {
                  return true;
               }
            }
         }

         return false;
      }
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
      this.id_case = var2;
      this.id_implements = var4;
      this.id_catch = var6;
      this.P = var5;
      this.X = var8;
      this.id_default = var9;
      this.id_const = var10;
      this.id_strictfp = var11;
      this.id_native = new ruQ_2(this);
      this.id_volatile = var12;
      this.id_protected = var3;
      this.id_throws = var3.id_break();
      this.id_int = var7;
      this.E = new Oa_1(this, var8.id_class());
      this.J = new rrPt_1(var8.id_private(), var3, var7);
      this.id_transient = var1;
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

      for (rrEm_1 var2 : this.id_float()) {
         if (var2 != null) {
            var2.id_synchronized = false;
         }
      }

      this.id_class(false, true, false);

      for (rrEm_1 var7 : this.id_float()) {
         if (var7 != null) {
            try {
               var7.close();
            } catch (IOException var5) {
               id_finally.error("Exception closing the level", var5);
            }
         }
      }

      this.X.close();

      try {
         this.id_protected.close();
      } catch (IOException var4) {
         id_finally.error("Failed to unlock level {}", this.id_protected.id_class(), var4);
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

   public void id_class(int var1) {
      this.id_continue = var1;
   }

   public void id_class(rRO var1, boolean var2) {
      if (var2 || !this.id_implements.id_native()) {
         this.id_implements.id_class(this.id_implements.id_implements() ? rRO.HARD : var1);
         this.id_protected();
         this.x().id_super().forEach(this::id_break);
      }
   }

   public void id_class(String var1, String var2) {
      this.id_float = var1;
      this.id_void = var2;
   }

   public static <S extends rnW_2> S id_class(Function<Thread, S> var0) {
      AtomicReference var1 = new AtomicReference();
      Thread var2 = new Thread(() -> ((rnW_2)var1.get()).id_return(), "Server thread");
      var2.setUncaughtExceptionHandler((var0x, var1x) -> id_finally.error(var1x));
      rnW_2 var3 = (rnW_2)var0.apply(var2);
      var1.set(var3);
      var2.start();
      return (S)var3;
   }

   public static rTH id_class(rAt_1 var0, rTH var1, boolean var2) {
      var0.id_class();
      if (var2) {
         var0.id_class(Collections.singleton("vanilla"));
         return new rTH(ImmutableList.of("vanilla"), ImmutableList.of());
      } else {
         LinkedHashSet var3 = Sets.newLinkedHashSet();

         for (String var5 : var1.id_class()) {
            if (var0.id_break(var5)) {
               var3.add(var5);
            } else {
               id_finally.warn("Missing data pack {}", var5);
            }
         }

         for (rAp_1 var8 : var0.id_byte()) {
            String var6 = var8.id_throws();
            if (!var1.id_break().contains(var6) && !var3.contains(var6)) {
               id_finally.info("Found new data pack {}, loading it automatically", var6);
               var3.add(var6);
            }
         }

         if (var3.isEmpty()) {
            id_finally.info("No datapacks selected, forcing vanilla");
            var3.add("vanilla");
         }

         var0.id_class(var3);
         return id_class(var0);
      }
   }

   public CompletableFuture<Void> id_class(Collection<String> var1) {
      CompletableFuture var2 = CompletableFuture.<ImmutableList>supplyAsync(
            () -> var1.stream().map(this.P::id_class).filter(Objects::nonNull).map(rAp_1::id_protected).collect(ImmutableList.toImmutableList()), this
         )
         .thenCompose(var1x -> rAh_1.id_class(var1x, this.id_switch() ? gq_3.DEDICATED : gq_3.INTEGRATED, this.id_continue(), this.O, this))
         .thenAcceptAsync(var2x -> {
            this.X.close();
            this.X = var2x;
            this.P.id_class(var1);
            this.id_implements.id_class(id_class(this.P));
            var2x.id_implements();
            this.x().id_implements();
            this.x().id_this();
            this.E.id_class(this.X.id_class());
            this.J.id_class(this.X.id_private());
         }, this);
      if (this.rX()) {
         this.id_byte(var2::isDone);
      }

      return var2;
   }

   public int id_class(rrEm_1 var1) {
      return var1 != null ? var1.B().id_byte(rRu_1.id_new) : 10;
   }

   public void id_class(Path var1) throws IOException {
      Path var2 = var1.resolve("levels");

      for (Entry var4 : this.id_super.entrySet()) {
         rqO_2 var5 = ((rqM_2)var4.getKey()).id_class();
         Path var6 = var2.resolve(var5.id_byte()).resolve(var5.id_break());
         Files.createDirectories(var6);
         ((rrEm_1)var4.getValue()).id_class(var6);
      }

      this.id_protected(var1.resolve("gamerules.txt"));
      this.id_throws(var1.resolve("classpath.txt"));
      this.id_byte(var1.resolve("example_crash.txt"));
      this.id_break(var1.resolve("stats.txt"));
      this.id_case(var1.resolve("threads.txt"));
   }

   private static rTH id_class(rAt_1 var0) {
      Collection var1 = var0.id_protected();
      ImmutableList var2 = ImmutableList.copyOf(var1);
      List var3 = var0.id_break().stream().filter(var1x -> !var1.contains(var1x)).collect(ImmutableList.toImmutableList());
      return new rTH(var2, var3);
   }

   public void id_class(gy_3 var1) {
      if (this.e()) {
         rCr_1 var2 = var1.id_super().x();
         rCk_1 var3 = var2.id_finally();

         for (rhN_2 var5 : Lists.newArrayList(var2.id_super())) {
            if (!var3.id_class(var5.sv())) {
               var5.id_class.id_class(new rgn_3("multiplayer.disconnect.not_whitelisted"));
            }
         }
      }
   }

   public int id_class(GameProfile var1) {
      if (this.x().id_case(var1)) {
         rne_3 var2 = this.x().id_native().id_break(var1);
         if (var2 != null) {
            return var2.id_class();
         } else if (this.id_break(var1)) {
            return 4;
         } else if (this.id_const()) {
            return this.x().id_else() ? 4 : 0;
         } else {
            return this.id_new();
         }
      } else {
         return 0;
      }
   }

   public void id_class(rCr_1 var1) {
      this.id_this = var1;
   }

   public Path id_class(rrGr_1 var1) {
      return this.id_protected.id_class(var1);
   }

   public rgV_2 id_class(rhN_2 var1) {
      return null;
   }

   public void id_class(rRl_1 var1) {
      this.id_implements.id_class(var1);
   }

   public abstract boolean id_class(rRl_1 var1, boolean var2, int var3);

   public boolean id_class(rrEm_1 var1, rfH_2 var2, rhd_3 var3) {
      return false;
   }

   private static void id_class(rrEm_1 var0, rrGB var1, boolean var2, boolean var3, boolean var4) {
      rKd_1 var5 = var0.id_else().id_implements();
      if (!var4) {
         var1.id_class(rfH_2.id_protected.id_break(var5.id_byte()), 0.0F);
      } else if (var3) {
         var1.id_class(rfH_2.id_protected.id_final(), 0.0F);
      } else {
         rYY var6 = var5.id_protected();
         Random var7 = new Random(var0.id_break());
         rfH_2 var8 = var6.id_class(0, var0.id_short(), 0, 256, var0x -> var0x.id_break().id_break(), var7);
         rfj_3 var9 = var8 == null ? new rfj_3(0, 0) : new rfj_3(var8);
         if (var8 == null) {
            id_finally.warn("Unable to find spawn biome");
         }

         boolean var10 = false;

         for (xd_3 var12 : rls_3.P.id_class()) {
            if (var6.id_byte().contains(var12.id_continue())) {
               var10 = true;
               break;
            }
         }

         var1.id_class(var9.id_finally().id_break(8, var5.id_byte(), 8), 0.0F);
         int var18 = 0;
         int var19 = 0;
         int var13 = 0;
         int var14 = -1;
         byte var15 = 32;

         for (int var16 = 0; var16 < 1024; var16++) {
            if (var18 > -16 && var18 <= 16 && var19 > -16 && var19 <= 16) {
               rfH_2 var17 = rhc_3.id_class(var0, new rfj_3(var9.id_break + var18, var9.id_byte + var19), var10);
               if (var17 != null) {
                  var1.id_class(var17, 0.0F);
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
            var20.id_class(var0, var5, var0.id_int, new rfH_2(var1.id_class(), var1.id_break(), var1.id_byte()));
         }
      }
   }

   @Override
   public void id_class(rgP_2 var1, UUID var2) {
      id_finally.info(var1.getString());
   }

   public boolean id_class(boolean var1, boolean var2, boolean var3) {
      boolean var4 = false;

      for (rrEm_1 var6 : this.id_float()) {
         if (!var1) {
         }

         var6.id_class((rpC_2)null, var2, var6.id_synchronized && !var3);
         var4 = true;
      }

      rrEm_1 var7 = this.id_abstract();
      rrGB var8 = this.id_implements.id_instanceof();
      var8.id_class(var7.id_instanceof().id_this());
      this.id_implements.id_class(this.U().id_byte());
      this.id_protected.id_class(this.id_case, this.id_implements, this.x().id_protected());
      return var4;
   }

   protected void id_class(KY var1) {
   }

   public rrEm_1 id_class(rqM_2<rYB> var1) {
      return this.id_super.get(var1);
   }

   private void id_class(rrGP var1) {
      var1.id_class(rRO.PEACEFUL);
      var1.id_protected(true);
      rrGB var2 = var1.id_instanceof();
      var2.id_class(false);
      var2.id_break(false);
      var2.id_protected(1000000000);
      var2.id_break(6000L);
      var2.id_class(rRl_1.SPECTATOR);
   }

   public void id_class(boolean var1) {
      this.id_else = false;
      if (var1) {
         try {
            this.id_transient.join();
         } catch (InterruptedException var3) {
            id_finally.error("Error while shutting down", var3);
         }
      }
   }

   protected void id_class(BooleanSupplier var1) {
      long var2 = rqR_2.id_byte();
      this.id_return++;
      this.id_break(var1);
      if (var2 - this.id_boolean >= 5000000000L) {
         this.id_boolean = var2;
         this.id_final.id_class(new ruC_2(this.id_catch(), this.id_case()));
         GameProfile[] var4 = new GameProfile[Math.min(this.id_case(), 12)];
         int var5 = rfU_2.id_class(this.id_package, 0, this.id_case() - var4.length);

         for (int var6 = 0; var6 < var4.length; var6++) {
            var4[var6] = this.id_this.id_super().get(var5 + var6).sv();
         }

         Collections.shuffle(Arrays.asList(var4));
         this.id_final.id_break().id_class(var4);
      }

      if (this.id_return % 6000 == 0) {
         id_finally.debug("Autosave started");
         this.id_this.id_implements();
         this.id_class(true, false, false);
         id_finally.debug("Autosave finished");
      }

      long var8 = this.id_private[this.id_return % 100] = rqR_2.id_byte() - var2;
      this.M = this.M * 0.8F + (float)var8 / 1000000.0F * 0.19999999F;
      long var9 = rqR_2.id_byte();
      this.G.id_class(var9 - var2);
   }

   public static void id_class(rrGk_1 var0) {
      if (var0.id_byte()) {
         id_finally.info("Converting map!");
         var0.id_class(new rnz_3());
      }
   }

   private void id_class(rrEi_1 var1) {
      rnE_2 var2 = var1.id_class(rnE_2::new, "scoreboard");
      var2.id_class(this.R());
      this.R().id_class(new rrGu_1(var2));
   }

   private void id_class(run_3 var1) {
      File var2 = this.id_protected("server-icon.png");
      if (!var2.exists()) {
         var2 = this.id_protected.id_case();
      }

      if (var2.isFile()) {
         ByteBuf var3 = Unpooled.buffer();

         try {
            BufferedImage var4 = ImageIO.read(var2);
            Validate.validState(var4.getWidth() == 64, "Must be 64 pixels wide", new Object[0]);
            Validate.validState(var4.getHeight() == 64, "Must be 64 pixels high", new Object[0]);
            ImageIO.write(var4, "PNG", new ByteBufOutputStream(var3));
            ByteBuffer var5 = Base64.getEncoder().encode(var3.nioBuffer());
            var1.id_class("data:image/png;base64," + StandardCharsets.UTF_8.decode(var5));
         } catch (Exception var9) {
            id_finally.error("Couldn't load server icon", var9);
         } finally {
            var3.release();
         }
      }
   }

   protected void id_class(roq_3 var1) {
      rrGB var2 = this.id_implements.id_instanceof();
      rrSp_1 var3 = this.id_implements.id_long();
      boolean var4 = var3.id_catch();
      long var5 = var3.id_class();
      long var7 = rYA.id_class(var5);
      ImmutableList var9 = ImmutableList.of(new rrEI(), new rrEw_1(), new rrEp_1(), new rRB(), new rrEf_1(var2));
      rVC var10 = var3.id_protected();
      rRX var11 = var10.id_class(rRX.id_break);
      Object var12;
      rRJ var13;
      if (var11 == null) {
         var13 = this.id_case.id_class().id_byte(rRJ.id_case);
         var12 = rrSp_1.id_class(this.id_case.id_break(rVL.n), this.id_case.id_break(rVL.u), new Random().nextLong());
      } else {
         var13 = var11.id_break();
         var12 = var11.id_byte();
      }

      rrEm_1 var14 = new rrEm_1(this, this.O, this.id_protected, var2, rYB.id_byte, var13, var1, (rKd_1)var12, var4, var7, var9, true);
      this.id_super.put(rYB.id_byte, var14);
      rrEi_1 var15 = var14.h();
      this.id_class(var15);
      this.S = new rrEU(var15);
      roE_2 var16 = var14.id_instanceof();
      var16.id_class(var2.id_this());
      if (!var2.id_super()) {
         try {
            id_class(var14, var2, var3.id_byte(), var4, true);
            var2.id_byte(true);
            if (var4) {
               this.id_class(this.id_implements);
            }
         } catch (Throwable var26) {
            KY var18 = KY.id_class(var26, "Exception initializing level");

            try {
               var14.id_class(var18);
            } catch (Throwable var25) {
            }

            throw new KU(var18);
         }

         var2.id_byte(true);
      }

      this.x().id_class(var14);
      if (this.id_implements.id_try() != null) {
         this.U().id_class(this.id_implements.id_try());
      }

      for (Entry var27 : var10.id_throws()) {
         rqM_2 var19 = (rqM_2)var27.getKey();
         if (var19 != rRX.id_break) {
            rqM_2 var20 = rqM_2.id_class(rVL.id_static, var19.id_class());
            rRJ var21 = ((rRX)var27.getValue()).id_break();
            rKd_1 var22 = ((rRX)var27.getValue()).id_byte();
            rrEa_1 var23 = new rrEa_1(this.id_implements, var2);
            rrEm_1 var24 = new rrEm_1(this, this.O, this.id_protected, var23, var20, var21, var1, var22, var4, var7, ImmutableList.of(), false);
            var16.id_class(new ros_3(var24.id_instanceof()));
            this.id_super.put(var20, var24);
         }
      }
   }

   protected rTN id_class(Runnable var1) {
      return new rTN(this.id_return, var1);
   }

   protected boolean id_class(rTN var1) {
      return var1.id_class() + 3 < this.id_return || this.id_break();
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
      rrEm_1 var1 = this.id_abstract();
      return new gy_3(this, var1 == null ? rjU_2.id_class : rjU_2.id_byte(var1.X()), rjK_2.id_class, var1, 4, "Server", new rgN_2("Server"), this, (an_3)null);
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

   public void id_break(boolean var1) {
      this.id_implements.id_protected(var1);
      this.x().id_super().forEach(this::id_break);
   }

   private void id_break(rhN_2 var1) {
      rrGs_1 var2 = var1.id_continue().id_public();
      var1.id_class.id_class(new rFE(var2.id_extends(), var2.id_native()));
   }

   protected void id_break(rTN var1) {
      super.id_throws(var1);
   }

   public int id_break(int var1) {
      return var1;
   }

   private void id_break(roq_3 var1) {
      rrEm_1 var2 = this.id_abstract();
      id_finally.info("Preparing start region for dimension {}", var2.E().id_class());
      rfH_2 var3 = var2.X();
      var1.id_class(new rfj_3(var3));
      rrEN var4 = var2.id_else();
      var4.id_protected().id_class(500);
      this.id_for = rqR_2.id_break();
      var4.id_class(rrEl_1.id_class, new rfj_3(var3), 11, rqg_3.INSTANCE);

      while (var4.id_throws() != 441) {
         this.id_for = rqR_2.id_break() + 10L;
         this.id_public();
      }

      this.id_for = rqR_2.id_break() + 10L;
      this.id_public();

      for (rrEm_1 var6 : this.id_super.values()) {
         rRc_1 var7 = var6.h().id_break(rRc_1::new, "chunks");
         if (var7 != null) {
            LongIterator var8 = var7.id_class().iterator();

            while (var8.hasNext()) {
               long var9 = var8.nextLong();
               rfj_3 var11 = new rfj_3(var9);
               var6.id_else().id_class(var11, true);
            }
         }
      }

      this.id_for = rqR_2.id_break() + 10L;
      this.id_public();
      var1.id_class();
      var4.id_protected().id_class(5);
      this.id_protected();
   }

   public KY id_break(KY var1) {
      if (this.id_this != null) {
         var1.id_case().id_class("Player Count", () -> this.id_this.id_final() + " / " + this.id_this.id_package() + "; " + this.id_this.id_super());
      }

      var1.id_case().id_class("Data Packs", () -> {
         StringBuilder var1x = new StringBuilder();

         for (rAp_1 var3 : this.P.id_throws()) {
            if (var1x.length() > 0) {
               var1x.append(", ");
            }

            var1x.append(var3.id_throws());
            if (!var3.id_byte().id_class()) {
               var1x.append(" (incompatible)");
            }
         }

         return var1x.toString();
      });
      if (this.h != null) {
         var1.id_case().id_class("Server Id", () -> this.h);
      }

      return var1;
   }

   public void id_break(String var1) {
      this.id_new = var1;
   }

   public abstract boolean id_break(GameProfile var1);

   protected void id_break(BooleanSupplier var1) {
      this.w().id_byte();

      for (rrEm_1 var3 : this.id_float()) {
         if (this.id_return % 20 == 0) {
            this.id_this.id_class(new rFp_1(var3.r(), var3.P(), var3.B().id_break(rRu_1.id_finally)), var3.E());
         }

         try {
            var3.id_class(var1);
         } catch (Throwable var6) {
            KY var5 = KY.id_class(var6, "Exception ticking world");
            var3.id_class(var5);
            throw new KU(var5);
         }
      }

      this.k().id_byte();
      this.id_this.id_throws();
      if (rqu_3.id_byte) {
         rlT_2.id_class.id_break();
      }

      for (int var7 = 0; var7 < this.id_extends.size(); var7++) {
         this.id_extends.get(var7).run();
      }
   }

   private boolean id_break() {
      return this.rh() || rqR_2.id_break() < (this.id_switch ? this.id_double : this.id_for);
   }

   private void id_break(Path var1) throws IOException {
      try (BufferedWriter var2 = Files.newBufferedWriter(var1)) {
         var2.write(String.format("pending_tasks: %d\n", this.rJ()));
         var2.write(String.format("average_tick_time: %f\n", this.a()));
         var2.write(String.format("tick_times: %s\n", Arrays.toString(this.id_private)));
         var2.write(String.format("queue: %s\n", rqR_2.id_case()));
      }
   }

   public void id_throws(String var1) {
      this.id_abstract = var1;
   }

   private void id_throws(Path var1) throws IOException {
      try (BufferedWriter var2 = Files.newBufferedWriter(var1)) {
         String var3 = System.getProperty("java.class.path");
         String var4 = System.getProperty("path.separator");

         for (String var6 : Splitter.on(var4).split(var3)) {
            var2.write(var6);
            var2.write("\n");
         }
      }
   }

   public String id_throws() {
      return rqu_3.id_class().getName();
   }

   public void id_throws(boolean var1) {
      this.id_goto = var1;
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

   public void id_catch(boolean var1) {
      this.id_try = var1;
   }

   public abstract boolean G();

   public abstract boolean O();

   protected abstract boolean id_extends() throws IOException;

   public rzZ_2 K() {
      return this.X.id_break();
   }

   private void id_case(Path var1) throws IOException {
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

   public int id_case() {
      return this.id_this.id_final();
   }

   public void id_case(String var1) {
      this.id_instanceof = var1;
   }

   public void id_case(boolean var1) {
      this.id_while = var1;
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

   public void id_implements(boolean var1) {
      this.b = var1;
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

   protected void id_return() {
      try {
         if (this.id_extends()) {
            this.id_for = rqR_2.id_break();
            this.id_final.id_class(new rgN_2(this.id_instanceof));
            this.id_final.id_class(new ruy_3(rqu_3.id_class().getName(), rqu_3.id_class().getProtocolVersion()));
            this.id_class(this.id_final);

            while (this.id_else) {
               long var1 = rqR_2.id_break() - this.id_for;
               if (var1 > 2000L && this.id_for - this.id_import >= 15000L) {
                  long var46 = var1 / 50L;
                  id_finally.warn("Can't keep up! Is the server overloaded? Running {}ms or {} ticks behind", var1, var46);
                  this.id_for += var46 * 50L;
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
      } catch (Throwable var44) {
         id_finally.error("Encountered an unexpected exception", var44);
         KY var2;
         if (var44 instanceof KU) {
            var2 = this.id_break(((KU)var44).id_class());
         } else {
            var2 = this.id_break(new KY("Exception in server tick loop", var44));
         }

         File var3 = new File(
            new File(this.id_instanceof(), "crash-reports"), "crash-" + new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss").format(new Date()) + "-server.txt"
         );
         if (var2.id_class(var3)) {
            id_finally.error("This crash report has been saved to: {}", var3.getAbsolutePath());
         } else {
            id_finally.error("We were unable to save this crash report to disk.");
         }

         this.id_class(var2);
      } finally {
         try {
            this.id_synchronized = true;
            this.id_this();
         } catch (Throwable var42) {
            id_finally.error("Exception stopping the server", var42);
         } finally {
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

   private void id_protected(Path var1) throws IOException {
      try (BufferedWriter var2 = Files.newBufferedWriter(var1)) {
         ArrayList var3 = Lists.newArrayList();
         rRu_1 var4 = this.D();
         rRu_1.id_class(new rnQ_2(this, var3, var4));

         for (String var6 : var3) {
            var2.write(var6);
         }
      }
   }

   private void id_protected() {
      for (rrEm_1 var2 : this.id_float()) {
         var2.id_class(this.id_boolean(), this.s());
      }
   }

   public void id_protected(int var1) {
      this.id_interface = var1;
   }

   public void id_protected(boolean var1) {
      this.id_public = var1;
   }

   public File id_protected(String var1) {
      return new File(this.id_instanceof(), var1);
   }

   public void id_protected(Runnable var1) {
      this.id_extends.add(var1);
   }

   public void id_private(boolean var1) {
      this.id_short = var1;
   }

   public String[] id_private() {
      return this.id_this.id_case();
   }

   public final rrEm_1 id_abstract() {
      return this.id_super.get(rYB.id_byte);
   }

   protected void id_final() {
      File var1 = this.id_protected.id_class(rrGr_1.id_private).toFile();
      if (var1.isFile()) {
         String var2 = this.id_protected.id_class();

         try {
            this.id_class("level://" + URLEncoder.encode(var2, StandardCharsets.UTF_8.toString()) + "/resources.zip", "");
         } catch (UnsupportedEncodingException var4) {
            id_finally.warn("Something went wrong url encoding {}", var2);
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
      roq_3 var1 = this.id_volatile.create(11);
      this.id_class(var1);
      this.id_volatile();
      this.id_break(var1);
   }

   protected void id_strictfp() {
      id_finally.info("Generating keypair");

      try {
         this.id_char = ryK_2.id_break();
      } catch (ryo_3 var2) {
         throw new IllegalStateException("Failed to generate key pair", var2);
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
      boolean var1 = this.id_byte();
      this.id_switch = var1;
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
