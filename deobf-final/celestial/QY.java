package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Queues;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.exceptions.AuthenticationException;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.minecraft.UserApiService;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.util.Function4;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.Lifecycle;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.Proxy;
import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Queue;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class QY extends rTz_1<Runnable> implements Hk_1 {
   private static byte[] byte_;
   private static short[] protected_;
   private static String[] throws_;
   public Object[] class_;
   private static boolean[] case_;
   private static int[] catch_;
   private static float[] private_;
   public static Object[] break_;
   private static long[] implements_;

   public fv_3 boolean_() {
      this.j();
      return (fv_3)this.class_[51];
   }

   public rAt_1 char_() {
      this.j();
      return (rAt_1)this.class_[36];
   }

   @Override
   public boolean byte_(Runnable var1) {
      return true;
   }

   public static void byte_(KY var0) {
      File var1 = new File((File)instanceof_().class_[24], "crash-reports");
      File var2 = new File(var1, "crash-" + new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss").format(new Date()) + "-client.txt");
      rVN.class_(var0.protected_());
      if (var0.throws_() != null) {
         rVN.class_("#@!@# Game crashed! Crash report saved to: #@!@# " + var0.throws_());
         System.exit(-1);
      } else if (var0.class_(var2)) {
         rVN.class_("#@!@# Game crashed! Crash report saved to: #@!@# " + var2.getAbsolutePath());
         System.exit(-1);
      } else {
         rVN.class_(throws_[31]);
         System.exit(-2);
      }
   }

   public PropertyMap byte_() {
      this.j();
      if (((PropertyMap)this.class_[1]).isEmpty()) {
         GameProfile var1 = this.r().fillProfileProperties(((rqN_2)this.class_[14]).throws_(), false);
         ((PropertyMap)this.class_[1]).putAll(var1.getProperties());
      }

      return (PropertyMap)this.class_[1];
   }

   private void byte_(String var1) {
      this.j();
      if (this.switch_() || this.final_()) {
         this.break_(new FP(var1));
      } else if ((cb_3)this.class_[57] != null) {
         ((cb_3)this.class_[57]).class_(new rgn_3("chat.cannotSend").class_(rgF_2.RED), rqR_2.break_);
      }
   }

   private static int byte_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -219791063;
   }

   public void byte_(vm_3 var1) {
      this.j();
      Aq_1 var2 = this.void_();
      if (var2 != null) {
         this.rx();
         var2.byte_();
      }

      rng_3 var3 = (rng_3)this.class_[58];
      Object var8 = null;
      this.class_[58] = var8;
      ((Hh_1)this.class_[16]).case_();
      Object var9 = null;
      this.class_[55] = var9;
      this.protected_(var1);
      if ((gm_3)this.class_[56] != null) {
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(rrnm_3.class_((gm_3)this.class_[56]));
         if (var3 != null) {
            while (!var3.char_()) {
               this.throws_(false);
            }
         }

         ((jy_3)this.class_[35]).break_();
         ((cq_3)this.class_[19]).finally_();
         Object var10 = null;
         this.class_[59] = var10;
         Boolean var11 = false;
         this.class_[61] = var11;
         ((QU)this.class_[53]).class_();
      }

      Object var12 = null;
      this.class_[56] = var12;
      this.break_(null);
      Object var13 = null;
      this.class_[57] = var13;
   }

   public void byte_(boolean var1) {
      this.j();
      ((ub_3)this.class_[43]).class_(var1 ? ImmutableMap.of((rqO_2)break_[3], (rqO_2)break_[4]) : ImmutableMap.of());
   }

   public boolean int_() {
      this.j();
      return (Boolean)this.class_[31];
   }

   public cT_2 long_() {
      this.j();
      return (cT_2)this.class_[75];
   }

   public Hz_1 float_() {
      this.j();
      return (Hz_1)this.class_[10];
   }

   public void double_() {
      this.j();
      Thread var7 = Thread.currentThread();
      this.class_[76] = var7;

      try {
         boolean var1 = case_[18];

         while (this.class_[protected_[192]]) {
            if ((KY)this.class_[protected_[193]] != null) {
               byte_((KY)this.class_[protected_[194]]);
               return;
            }

            try {
               this.throws_(!var1 ? case_[19] : case_[20]);
            } catch (OutOfMemoryError var8) {
               if (var1) {
                  throw var8;
               }

               this.b();
               this.break_(new vS_2());
               System.gc();
               ((Logger)break_[protected_[195]]).fatal(throws_[21], var8);
               var1 = case_[21];
            }
         }
      } catch (KU var9) {
         this.class_(var9.class_());
         this.b();
         ((Logger)break_[1]).fatal("Reported exception thrown!", var9);
         byte_(var9.class_());
      } catch (Throwable var10) {
         KY var2 = this.class_(new KY("Unexpected error", var10));
         ((Logger)break_[1]).fatal("Unreported exception thrown!", var10);
         this.b();
         byte_(var2);
      }
   }

   public QY(Qy_1 var1) {
      super("Client");
      this.j();
      rqw_3 var13 = new rqw_3(20.0F, 0L);
      this.class_[6] = var13;
      gJ_2 var14 = new gJ_2();
      this.class_[13] = var14;
      AtomicReference var15 = new AtomicReference();
      this.class_[18] = var15;
      rpN_2 var16 = new rpN_2();
      this.class_[29] = var16;
      QU var17 = new QU(this);
      this.class_[53] = var17;
      Long var18 = rqR_2.byte_();
      this.class_[69] = var18;
      Boolean var19 = true;
      this.class_[77] = var19;
      String var20 = "";
      this.class_[79] = var20;
      Boolean var21 = true;
      this.class_[82] = var21;
      ConcurrentLinkedQueue var22 = Queues.newConcurrentLinkedQueue();
      this.class_[84] = var22;
      String var23 = "root";
      this.class_[86] = var23;
      break_[0] = this;
      File var25 = var1.byte_.class_;
      this.class_[24] = var25;
      File var2 = var1.byte_.byte_;
      File var26 = var1.byte_.break_;
      this.class_[0] = var26;
      String var27 = var1.protected_.break_;
      this.class_[25] = var27;
      String var28 = var1.protected_.byte_;
      this.class_[26] = var28;
      PropertyMap var29 = var1.class_.byte_;
      this.class_[1] = var29;
      jy_3 var30 = new jy_3(new File((File)this.class_[24], "server-resource-packs"), var1.byte_.class_());
      this.class_[35] = var30;
      rAt_1 var31 = new rAt_1(QY::class_, (jy_3)this.class_[35], new rAz_1((File)this.class_[0], rAZ.class_));
      this.class_[36] = var31;
      Proxy var32 = var1.class_.protected_;
      this.class_[27] = var32;
      YggdrasilAuthenticationService var3 = new YggdrasilAuthenticationService((Proxy)this.class_[27]);
      MinecraftSessionService var33 = var3.createMinecraftSessionService();
      this.class_[46] = var33;
      UserApiService var34 = this.class_(var3, var1);
      this.class_[47] = var34;
      rqN_2 var35 = var1.class_.class_;
      this.class_[14] = var35;
      ((Logger)break_[1]).info("Setting user: {}", ((rqN_2)this.class_[14]).byte_());
      ((Logger)break_[1]).debug("(Session ID is {})", ((rqN_2)this.class_[14]).class_());
      Boolean var36 = var1.protected_.class_;
      this.class_[31] = var36;
      Boolean var37 = !var1.protected_.protected_ ? true : case_[5];
      this.class_[32] = var37;
      Boolean var38 = !var1.protected_.throws_ ? true : case_[7];
      this.class_[33] = var38;
      Boolean var39 = e();
      this.class_[30] = var39;
      Object var40 = null;
      this.class_[58] = var40;
      String var4;
      int var5;
      if (this.J() && var1.throws_.class_ != null) {
         var4 = var1.throws_.class_;
         var5 = var1.throws_.break_;
      } else {
         var4 = null;
         var5 = 0;
      }

      rgh_3.class_(Vu_1::class_);
      DataFixer var41 = rTu_1.class_();
      this.class_[3] = var41;
      Thread var42 = Thread.currentThread();
      this.class_[76] = var42;
      Qw_1 var43 = new Qw_1(this, (File)this.class_[24]);
      this.class_[20] = var43;
      Vk_1 var44 = new Vk_1((File)this.class_[24], (DataFixer)this.class_[3]);
      this.class_[21] = var44;
      ((Logger)break_[1]).info("Backend library: {}", RenderSystem.getBackendDescription());
      ys_3 var6;
      if (((Qw_1)this.class_[20]).this_ > 0 && ((Qw_1)this.class_[20]).super_ > 0) {
         var6 = new ys_3(((Qw_1)this.class_[20]).super_, ((Qw_1)this.class_[20]).this_, var1.break_.byte_, var1.break_.protected_, var1.break_.throws_);
      } else {
         var6 = var1.break_;
      }

      rqR_2.class_ = RenderSystem.initBackendSystem();
      yh_3 var45 = new yh_3(this);
      this.class_[4] = var45;
      Qg_1 var46 = ((yh_3)this.class_[4]).class_(var6, ((Qw_1)this.class_[20]).final_, this.C());
      this.class_[5] = var46;
      this.class_(true);

      try {
         InputStream var7 = this.Z().class_().class_(rAI.CLIENT_RESOURCES, new rqO_2(throws_[7]));
         InputStream var8 = this.Z().class_().class_(rAI.CLIENT_RESOURCES, new rqO_2(throws_[8]));
         ((Qg_1)this.class_[protected_[52]]).class_(var7, var8);
      } catch (IOException var77) {
         ((Logger)break_[1]).error("Couldn't set icon", var77);
      }

      ((Qg_1)this.class_[5]).class_(((Qw_1)this.class_[20]).protected_);
      Qi_1 var47 = new Qi_1(this);
      this.class_[22] = var47;
      ((Qi_1)this.class_[22]).class_(((Qg_1)this.class_[5]).implements_());
      Qj_1 var48 = new Qj_1(this);
      this.class_[23] = var48;
      ((Qj_1)this.class_[23]).class_(((Qg_1)this.class_[5]).implements_());
      RenderSystem.initRenderer(((Qw_1)this.class_[20]).void_, false);
      VC var49 = new VC(((Qg_1)this.class_[5]).extends_(), ((Qg_1)this.class_[5]).native_(), true, (Boolean)break_[2]);
      this.class_[40] = var49;
      ((VC)this.class_[40]).class_(0.0F, 0.0F, 0.0F, 0.0F);
      rAj_1 var50 = new rAj_1(rAI.CLIENT_RESOURCES);
      this.class_[34] = var50;
      ((rAt_1)this.class_[36]).class_();
      ((Qw_1)this.class_[20]).class_((rAt_1)this.class_[36]);
      jV_2 var51 = new jV_2(((Qw_1)this.class_[20]).rG);
      this.class_[37] = var51;
      ((rAv_1)this.class_[34]).class_((jV_2)this.class_[37]);
      fY_2 var52 = new fY_2((rAv_1)this.class_[34]);
      this.class_[2] = var52;
      ((rAv_1)this.class_[34]).class_((fY_2)this.class_[2]);
      SkinProvider var53 = new SkinProvider((fY_2)this.class_[2], new File(var2, "skins"), (MinecraftSessionService)this.class_[46]);
      this.class_[48] = var53;
      rrGd_1 var54 = new rrGd_1(
         ((File)this.class_[24]).toPath().resolve("saves"), ((File)this.class_[24]).toPath().resolve("backups"), (DataFixer)this.class_[3]
      );
      this.class_[28] = var54;
      Nf_1 var55 = new Nf_1((rAv_1)this.class_[34], (Qw_1)this.class_[20]);
      this.class_[41] = var55;
      ((rAv_1)this.class_[34]).class_((Nf_1)this.class_[41]);
      gW_2 var56 = new gW_2((rqN_2)this.class_[14]);
      this.class_[44] = var56;
      ((rAv_1)this.class_[34]).class_((gW_2)this.class_[44]);
      NL var57 = new NL(this);
      this.class_[42] = var57;
      ub_3 var58 = new ub_3((fY_2)this.class_[2]);
      this.class_[43] = var58;
      cm_3 var59 = ((ub_3)this.class_[43]).class_();
      this.class_[15] = var59;
      ((rAv_1)this.class_[34]).class_(((ub_3)this.class_[43]).break_());
      this.byte_(this.continue_());
      ((rAv_1)this.class_[34]).class_(new jw_3());
      ((rAv_1)this.class_[34]).class_(new jt_3());
      ((Qg_1)this.class_[5]).class_("Startup");
      RenderSystem.setupDefaultState(0, 0, ((Qg_1)this.class_[5]).extends_(), ((Qg_1)this.class_[5]).native_());
      ((Qg_1)this.class_[5]).class_("Post startup");
      yC_2 var60 = yC_2.class_();
      this.class_[38] = var60;
      yq_3 var61 = yq_3.class_((yC_2)this.class_[38]);
      this.class_[39] = var61;
      Ip_1 var62 = new Ip_1((fY_2)this.class_[2], (yC_2)this.class_[38], ((Qw_1)this.class_[20]).instanceof_);
      this.class_[49] = var62;
      ((rAv_1)this.class_[34]).class_((Ip_1)this.class_[49]);
      Hz_1 var63 = new Hz_1((fY_2)this.class_[2], (Ip_1)this.class_[49], (yq_3)this.class_[39]);
      this.class_[10] = var63;
      pg_3 var64 = new pg_3((fY_2)this.class_[2], (Hz_1)this.class_[10], (rAv_1)this.class_[34], (cm_3)this.class_[15], (Qw_1)this.class_[20]);
      this.class_[9] = var64;
      HB var65 = new HB(this);
      this.class_[11] = var65;
      ((rAv_1)this.class_[34]).class_((Hz_1)this.class_[10]);
      yB_2 var66 = new yB_2();
      this.class_[7] = var66;
      Hh_1 var67 = new Hh_1(this, (rAv_1)this.class_[34], (yB_2)this.class_[7]);
      this.class_[16] = var67;
      ((rAv_1)this.class_[34]).class_((Hh_1)this.class_[16]);
      FU var68 = new FU(this, (UserApiService)this.class_[47]);
      this.class_[54] = var68;
      lo_3 var69 = new lo_3(((Ip_1)this.class_[49]).byte_(), (yC_2)this.class_[38]);
      this.class_[50] = var69;
      ((rAv_1)this.class_[34]).class_((lo_3)this.class_[50]);
      yX_2 var70 = new yX_2(this, (yB_2)this.class_[7]);
      this.class_[8] = var70;
      ((rAv_1)this.class_[34]).class_((yX_2)this.class_[8]);
      this.U();
      ((rAv_1)this.class_[34]).class_((gJ_2)this.class_[13]);
      Cy_1 var71 = new Cy_1((gm_3)this.class_[56], (fY_2)this.class_[2]);
      this.class_[12] = var71;
      ((rAv_1)this.class_[34]).class_((Cy_1)this.class_[12]);
      fv_3 var72 = new fv_3((fY_2)this.class_[2]);
      this.class_[51] = var72;
      ((rAv_1)this.class_[34]).class_((fv_3)this.class_[51]);
      fC_2 var73 = new fC_2((fY_2)this.class_[2]);
      this.class_[52] = var73;
      ((rAv_1)this.class_[34]).class_((fC_2)this.class_[52]);
      HM var74 = new HM();
      this.class_[45] = var74;
      ((rAv_1)this.class_[34]).class_((HM)this.class_[45]);
      cq_3 var75 = new cq_3(this);
      this.class_[19] = var75;
      yK_2 var76 = new yK_2(this);
      this.class_[17] = var76;
      RenderSystem.setErrorCallback(this::class_);
      if (((Qw_1)this.class_[20]).s && !((Qg_1)this.class_[5]).finally_()) {
         ((Qg_1)this.class_[5]).private_();
         ((Qw_1)this.class_[20]).s = ((Qg_1)this.class_[5]).finally_();
      }

      ((Qg_1)this.class_[5]).class_(((Qw_1)this.class_[20]).strictfp_);
      ((Qg_1)this.class_[5]).break_(((Qw_1)this.class_[20]).float_);
      ((Qg_1)this.class_[5]).byte_();
      this.v();
      if (var4 != null) {
         this.break_(new mt_3(new rrvL(), this, var4, var5));
      } else {
         this.break_(new rrvL(true));
      }

      cj_3.class_(this);
      List var78 = ((rAt_1)this.class_[36]).case_();
      this.class_(
         new cj_3(
            this,
            ((rAv_1)this.class_[34]).class_(rqR_2.case_(), this, (CompletableFuture<rqg_3>)break_[5], var78),
            var1x -> rqR_2.class_(var1x, this::class_, () -> {
                  if (rqu_3.byte_) {
                     this.w();
                  }
               }),
            false
         )
      );
      this.V();
   }

   static {
      ntfClinit();
   }

   public VC B() {
      this.j();
      return (VC)this.class_[40];
   }

   private String C() {
      StringBuilder var1 = new StringBuilder();
      var1.append("Celestial Client");
      var1.append(" - Build: ");
      var1.append("1.1");
      var1.append(" (");
      var1.append(((rrZr_1)rrQJ.class_[5]).protected_());
      var1.append(")");
      return var1.toString();
   }

   private static void D() {
      byte_ = new byte[]{
         2,
         3,
         2,
         -1,
         -1,
         -2,
         10,
         6,
         2,
         3,
         4,
         5,
         60,
         10,
         10,
         4,
         9,
         2,
         2,
         36,
         -1,
         3,
         4,
         2,
         3,
         4,
         5,
         6,
         7,
         8,
         88,
         30,
         31,
         32,
         33,
         61,
         65,
         66,
         67,
         68,
         69,
         70,
         71,
         72,
         77,
         80,
         81,
         82,
         83,
         87,
         10,
         2,
         9
      };
   }

   public rAL F() {
      this.j();
      return (rAv_1)this.class_[34];
   }

   public boolean J() {
      return true;
   }

   public Ak_1 S() {
      this.j();
      return (Ak_1)this.class_[59];
   }

   public jy_3 Z() {
      this.j();
      return (jy_3)this.class_[35];
   }

   private void V() {
      if (!((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).case_()) {
         this.G();
      } else {
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(new rrLP());
      }
   }

   public rng_3 this_() {
      this.j();
      return (rng_3)this.class_[58];
   }

   private static boolean e() {
      String[] var0 = new String[]{"sun.arch.data.model", "com.ibm.vm.bitmode", "os.arch"};

      for (String var4 : var0) {
         String var5 = System.getProperty(var4);
         if (var5 != null && var5.contains("64")) {
            return true;
         }
      }

      return case_[27];
   }

   private static void i() {
      implements_ = new long[]{0L, 1000L, 1000L, 16L, 0L, 0L, 0L};
   }

   public void b() {
      this.j();

      try {
         byte[] var6 = new byte[case_[46]];
         break_[protected_[348]] = var6;
         ((yX_2)this.class_[protected_[349]]).extends_();
      } catch (Throwable var8) {
      }

      try {
         System.gc();
         if ((Boolean)this.class_[protected_[350]] && (rng_3)this.class_[protected_[351]] != null) {
            ((rng_3)this.class_[protected_[352]]).class_(case_[47]);
         }

         this.byte_(new ZE(new rgn_3(throws_[49])));
      } catch (Throwable var7) {
      }

      System.gc();
   }

   public CompletableFuture<Void> x() {
      return this.class_(this::private_).thenCompose(var0 -> (CompletionStage<Void>)var0);
   }

   public yC_2 s() {
      this.j();
      return (yC_2)this.class_[38];
   }

   public Nf_1 c() {
      this.j();
      return (Nf_1)this.class_[41];
   }

   public File h() {
      this.j();
      return (File)this.class_[0];
   }

   private void f() {
      this.j();

      for (; ((Qw_1)this.class_[20]).C.case_(); ((yX_2)this.class_[8]).volatile_()) {
         VZ var1 = ((Qw_1)this.class_[20]).volatile_();
         ((Qw_1)this.class_[20]).class_(((Qw_1)this.class_[20]).volatile_().byte_());
         if (var1.class_() != ((Qw_1)this.class_[20]).volatile_().class_()) {
            ((Hh_1)this.class_[16]).class_(((Qw_1)this.class_[20]).volatile_().class_() ? this.catch_() : null);
         }
      }

      while (((Qw_1)this.class_[20]).H.case_()) {
         ((Qw_1)this.class_[20]).D = !((Qw_1)this.class_[20]).D ? true : case_[66];
      }

      for (int var4 = case_[67]; var4 < 9; var4++) {
         boolean var2 = ((Qw_1)this.class_[20]).w.protected_();
         boolean var3 = ((Qw_1)this.class_[20]).I.protected_();
         if (((Qw_1)this.class_[20]).t[var4].case_()) {
            if (((cb_3)this.class_[57]).native_()) {
               ((cq_3)this.class_[19]).private_().break_(var4);
            } else if (((cb_3)this.class_[57]).implements_() && (vm_3)this.class_[73] == null && (var3 || var2)) {
               Fv_1.class_(this, var4, var3, var2);
            } else {
               ((rhz_3)((cb_3)this.class_[57]).implements_[1]).protected_ = var4;
            }
         }
      }

      while (((Qw_1)this.class_[20]).A.case_()) {
         if (!this.H()) {
            ((cb_3)this.class_[57]).class_((rgP_2)break_[6], true);
         } else {
            this.break_(new Fe_1());
         }
      }

      while (((Qw_1)this.class_[20]).z.case_()) {
         if (((Ax_1)this.class_[55]).implements_()) {
            ((cb_3)this.class_[57]).else_();
         } else {
            this.break_(new FH((cb_3)this.class_[57]));
         }
      }

      while (((Qw_1)this.class_[20]).q.case_()) {
         this.break_(new ca_3(((Aq_1)((cb_3)this.class_[57]).break_[0]).private_()));
      }

      while (((Qw_1)this.class_[20]).Q.case_()) {
         if (!((cb_3)this.class_[57]).native_()) {
            this.void_().class_(new rZb_1(rZM.SWAP_ITEM_WITH_OFFHAND, rfH_2.protected_, rpr_3.DOWN));
         }
      }

      while (((Qw_1)this.class_[20]).N.case_()) {
         if (!((cb_3)this.class_[57]).native_() && ((cb_3)this.class_[57]).protected_(vm_3.else_())) {
            ((cb_3)this.class_[57]).class_(rpm_3.MAIN_HAND, false);
         }
      }

      boolean var5 = ((Qw_1)this.class_[20]).finally_ != rhJ_2.HIDDEN ? true : case_[71];
      if (var5) {
         while (((Qw_1)this.class_[20]).v.case_()) {
            this.byte_("");
         }

         if ((vm_3)this.class_[73] == null && (cT_2)this.class_[75] == null && ((Qw_1)this.class_[20]).L.case_()) {
            this.byte_("/");
         }
      }

      if (((cb_3)this.class_[57]).return_()) {
         if (!((Qw_1)this.class_[20]).u.protected_()) {
            ((Ax_1)this.class_[55]).break_((cb_3)this.class_[57]);
         }

         while (((Qw_1)this.class_[20]).m.case_()) {
         }

         while (((Qw_1)this.class_[20]).u.case_()) {
         }

         while (((Qw_1)this.class_[20]).Z.case_()) {
         }
      } else {
         while (((Qw_1)this.class_[20]).m.case_()) {
            this.z();
         }

         while (((Qw_1)this.class_[20]).u.case_()) {
            this.for_();
         }

         while (((Qw_1)this.class_[20]).Z.case_()) {
            this.K();
         }
      }

      if (((Qw_1)this.class_[20]).u.protected_() && (Integer)this.class_[65] == 0 && !((cb_3)this.class_[57]).return_()) {
         this.for_();
      }

      this.protected_((vm_3)this.class_[73] == null && ((Qw_1)this.class_[20]).m.protected_() && ((Qi_1)this.class_[22]).case_() ? true : case_[73]);
   }

   private static void l() {
      case_ = new boolean[]{
         true,
         true,
         false,
         true,
         true,
         false,
         true,
         false,
         false,
         true,
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         true,
         false,
         true,
         false,
         false,
         false,
         false,
         false,
         true,
         true,
         true,
         false,
         false,
         true,
         false,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         true,
         true,
         false,
         true,
         true,
         true,
         true,
         true,
         false,
         true,
         false,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         false,
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         false,
         false,
         true,
         false,
         false,
         false,
         false,
         false,
         true,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         false,
         true,
         false,
         true,
         true,
         false,
         false,
         true,
         true,
         true,
         false,
         true,
         false,
         true,
         true,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false
      };
   }

   public static boolean d() {
      return ((Qw_1)((QY)break_[0]).class_[20]).case_.class_() >= VW.FABULOUS.class_() ? true : case_[98];
   }

   private static void a() {
      catch_ = new int[]{10485760};
   }

   public yB_2 interface_() {
      this.j();
      return (yB_2)this.class_[7];
   }

   private void class_(String var1, rVv_1 var2, Function<rrGk_1, rTH> var3, Function4<rrGk_1, rVv_1, rAL, rTH, rrGP> var4, boolean var5, QD var6) {
      this.j();

      rrGk_1 var7;
      try {
         var7 = ((rrGd_1)this.class_[protected_[558]]).byte_(var1);
      } catch (IOException var28) {
         ((Logger)break_[1]).warn("Failed to read level {} data", var1, var28);
         this.break_(null);
         return;
      }

      QK var8;
      try {
         var8 = this.class_(var2, var3, var4, var5, var7);
      } catch (Exception var27) {
         ((Logger)break_[1]).warn("Failed to load datapacks, can't proceed with server load", var27);
         this.break_(new ZB(() -> this.class_(var1, var2, var3, var4, true, var6)));

         try {
            var7.close();
         } catch (IOException var23) {
            ((Logger)break_[1]).warn("Failed to unlock access to level {}", var1, var23);
         }

         return;
      }

      rrGP var9 = var8.byte_();
      boolean var10 = var9.long_().implements_();
      boolean var11 = var9.float_() != Lifecycle.stable() ? true : case_[77];
      if (var6 == (QD)QD.staticFields25f7c1a34dee3bdaa6c7082af054c49d[0] || !var10 && !var11) {
         this.transient_();
         ((AtomicReference)this.class_[18]).set(null);

         try {
            var7.class_(var2, var9);
            var8.break_().implements_();
            YggdrasilAuthenticationService var12 = new YggdrasilAuthenticationService((Proxy)this.class_[protected_[564]]);
            MinecraftSessionService var30 = var12.createMinecraftSessionService();
            GameProfileRepository var32 = var12.createProfileRepository();
            rCB var15 = new rCB(var32, new File((File)this.class_[protected_[565]], rnW_2.class_.getName()));
            rys_3.class_(var15);
            rys_3.class_(var30);
            rCB.class_(case_[78]);
            rng_3 var20 = rnW_2.class_(
               (Function<Thread, rng_3>)(var8x -> new rng_3(var8x, this, var2, var7, var8.class_(), var8.break_(), var9, var30, var32, var15, var1xx -> {
                     this.j();
                     row_3 var2xx = new row_3(var1xx);
                     var2xx.break_();
                     ((AtomicReference)this.class_[18]).set(var2xx);
                     return new rop_3(var2xx, ((Queue)this.class_[84])::add);
                  }))
            );
            this.class_[protected_[566]] = var20;
            Boolean var21 = case_[79];
            this.class_[protected_[567]] = var21;
         } catch (Throwable var26) {
            KY var13 = KY.class_(var26, "Starting integrated server");
            Ko_1 var14 = var13.class_("Starting integrated server");
            var14.class_("Level ID", var1);
            var14.class_("Level Name", var9.volatile_());
            throw new KU(var13);
         }

         while (((AtomicReference)this.class_[18]).get() == null) {
            Thread.yield();
         }

         vo_3 var29 = new vo_3((row_3)((AtomicReference)this.class_[18]).get());
         this.break_(var29);

         while (!((rng_3)this.class_[58]).W()) {
            var29.private_();
            this.throws_(false);

            try {
               Thread.sleep(implements_[3]);
            } catch (InterruptedException var25) {
            }

            if ((KY)this.class_[78] != null) {
               byte_((KY)this.class_[78]);
               return;
            }
         }

         SocketAddress var31 = ((rng_3)this.class_[58]).k().class_();
         rud_3 var33 = rud_3.class_(var31);
         var33.class_(new Al_1(var33, this, null, var0 -> {
         }));
         var33.class_(new rmJ_2(var31.toString(), 0, ruv_3.LOGIN));
         var33.class_(new rmu_3(this.while_().throws_()));
         this.class_[60] = var33;
      } else {
         this.class_(var6, var1, var10, () -> this.class_(var1, var2, var3, var4, var5, (QD)QD.staticFields25f7c1a34dee3bdaa6c7082af054c49d[0]));
         var8.close();

         try {
            var7.close();
         } catch (IOException var24) {
            ((Logger)break_[1]).warn("Failed to unlock access to level {}", var1, var24);
         }
      }
   }

   private void class_(int var1, long var2) {
      this.j();
      ((Qw_1)this.class_[20]).strictfp_ = false;
      ((Qw_1)this.class_[20]).break_();
   }

   private rdn_3 class_(rdn_3 var1, ryO_2 var2) {
      rcd_3 var3 = var2.class_(new rcd_3());
      if (var1.break_() instanceof rkG_2 && var3.throws_("SkullOwner")) {
         rcd_3 var6 = var3.int_("SkullOwner");
         var1.int_().class_("SkullOwner", var6);
         return var1;
      } else {
         var1.class_("BlockEntityTag", var3);
         rcd_3 var4 = new rcd_3();
         rcy_3 var5 = new rcy_3();
         var5.add(rca_3.class_("\"(+NBT)\""));
         var4.class_("Lore", var5);
         var1.class_("display", var4);
         return var1;
      }
   }

   private void class_(QD var1, String var2, boolean var3, Runnable var4) {
      if (var1 == (QD)QD.staticFields25f7c1a34dee3bdaa6c7082af054c49d[2]) {
         rgn_3 var5;
         rgn_3 var6;
         if (var3) {
            var5 = new rgn_3("selectWorld.backupQuestion.customized");
            var6 = new rgn_3("selectWorld.backupWarning.customized");
         } else {
            var5 = new rgn_3("selectWorld.backupQuestion.experimental");
            var6 = new rgn_3("selectWorld.backupWarning.experimental");
         }

         this.break_(new my_3(null, (var3x, var4x) -> {
            this.j();
            if (var3x) {
               ZA.class_((rrGd_1)this.class_[28], var2);
            }

            var4.run();
         }, var5, var6, false));
      } else {
         this.break_(new mT_2(var3x -> {
            this.j();
            if (var3x) {
               var4.run();
            } else {
               this.break_(null);

               try (rrGk_1 var4x = ((rrGd_1)this.class_[protected_[733]]).byte_(var2)) {
                  var4x.catch_();
               } catch (IOException var9) {
                  ((Logger)break_[1]).error("Failed to delete world {}", var2, var9);
               }
            }
         }, new rgn_3("selectWorld.backupQuestion.experimental"), new rgn_3("selectWorld.backupWarning.experimental"), cN_2.catch_, cN_2.protected_));
      }
   }

   public void class_(String var1, rYE var2, rVv_1 var3, rrSp_1 var4) {
      this.class_(
         var1,
         var3,
         var1x -> var2.catch_(),
         (var3x, var4x, var5, var6) -> {
            rVp_1 var7 = rVp_1.class_(JsonOps.INSTANCE, var3);
            rVq_1 var8 = rVq_1.class_(JsonOps.INSTANCE, var5, var3);
            DataResult var9 = rrSp_1.class_.encodeStart(var7, var4).setLifecycle(Lifecycle.stable()).flatMap(var1xx -> rrSp_1.class_.parse(var8, var1xx));
            rrSp_1 var10 = var9.resultOrPartial(rqR_2.class_("Error reading worldgen settings after loading data packs: ", ((Logger)break_[1])::error))
               .orElse(var4);
            return new rrGQ(var2, var10, var9.lifecycle());
         },
         false,
         (QD)QD.staticFields25f7c1a34dee3bdaa6c7082af054c49d[1]
      );
   }

   public void class_(Qw_1 var1) {
      this.j();
      this.class_[20] = var1;
   }

   public void class_(Ak_1 var1) {
      this.j();
      this.class_[59] = var1;
      rrfp_3.class_[0] = var1;
   }

   public void class_(Throwable var1, rgP_2 var2) {
      this.j();
      ((Logger)break_[1]).info("Caught error loading resourcepacks, removing all selected resourcepacks", var1);
      ((rAt_1)this.class_[36]).class_(Collections.emptyList());
      ((Qw_1)this.class_[20]).private_.clear();
      ((Qw_1)this.class_[20]).implements_.clear();
      ((Qw_1)this.class_[20]).break_();
      this.private_().thenRun(() -> {
      });
   }

   public <T> Vo_1<T> class_(gx_3<T> var1) {
      this.j();
      return ((gJ_2)this.class_[13]).class_(var1);
   }

   public void class_(cq_3 var1) {
      this.j();
      this.class_[19] = var1;
   }

   public void class_(rqN_2 var1) {
      this.j();
      this.class_[14] = var1;
   }

   private static rAp_1 class_(String var0, boolean var1, Supplier<rAC> var2, rAC var3, rAK var4, rAT var5, rAZ var6) {
      int var7 = var4.break_();
      Supplier var8 = var2;
      if (var7 <= 3) {
         var8 = protected_(var2);
      }

      if (var7 <= 4) {
         var8 = break_(var8);
      }

      return new rAp_1(var0, var1, var8, var3, var4, var5, var6);
   }

   public static void class_(jV_2 var0, String var1, Qw_1 var2, KY var3) {
      Ko_1 var4 = var3.case_();
      var4.class_("Launched Version", () -> var1);
      var4.class_("Backend library", RenderSystem::getBackendDescription);
      var4.class_("Backend API", RenderSystem::getApiDescription);
      var4.class_("GL Caps", RenderSystem::getCapsString);
      var4.class_("Using VBOs", () -> "Yes");
      var4.class_("Is Modded", () -> {
         String var0x = Qn_1.class_();
         if (!"vanilla".equals(var0x)) {
            return "Definitely; Client brand changed to '" + var0x + "'";
         } else {
            return QY.class.getSigners() == null ? "Very likely; Jar signature invalidated" : throws_[107];
         }
      });
      var4.class_("Type", "Client (map_client.txt)");
      if (var2 != null) {
         if ((QY)break_[0] != null) {
            String var5 = ((QY)break_[0]).new_().volatile_();
            if (var5 != null) {
               var4.class_("GPU Warnings", var5);
            }
         }

         var4.class_("Graphics mode", var2.case_);
         var4.class_("Resource Packs", () -> {
            StringBuilder var1x = new StringBuilder();

            for (String var3x : var2.private_) {
               if (var1x.length() > 0) {
                  var1x.append(", ");
               }

               var1x.append(var3x);
               if (var2.implements_.contains(var3x)) {
                  var1x.append(" (incompatible)");
               }
            }

            return var1x.toString();
         });
      }

      if (var0 != null) {
         var4.class_("Current Language", () -> var0.break_().toString());
      }

      var4.class_("CPU", Oh_1::break_);
   }

   public static rTH class_(rrGk_1 var0) {
      rnW_2.class_(var0);
      rTH var1 = var0.throws_();
      if (var1 == null) {
         throw new IllegalStateException("Failed to load data pack config");
      } else {
         return var1;
      }
   }

   public boolean class_(an_3 var1) {
      this.j();
      return !var1.w()
            && ((cb_3)this.class_[57] == null || !((cb_3)this.class_[57]).native_() || !((Qw_1)this.class_[20]).p.protected_() || var1.BC() != aI_2.rM)
         ? case_[105]
         : case_[104];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 103904214521924696L;
   }

   public void class_(gm_3 var1) {
      this.j();
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).break_(var1);
      vY_2 var2 = new vY_2();
      var2.break_(new rgn_3("connect.joining"));
      this.protected_(var2);
      this.class_[56] = var1;
      this.break_(var1);
      if (!(Boolean)this.class_[61]) {
         YggdrasilAuthenticationService var3 = new YggdrasilAuthenticationService((Proxy)this.class_[27]);
         MinecraftSessionService var4 = var3.createMinecraftSessionService();
         GameProfileRepository var5 = var3.createProfileRepository();
         rCB var6 = new rCB(var5, new File((File)this.class_[24], rnW_2.class_.getName()));
         rys_3.class_(var6);
         rys_3.class_(var4);
         rCB.class_(false);
      }

      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).class_(var1);
   }

   public Function<rqO_2, fj_3> class_(rqO_2 var1) {
      this.j();
      return ((Ip_1)this.class_[49]).class_(var1)::break_;
   }

   private UserApiService class_(YggdrasilAuthenticationService var1, Qy_1 var2) {
      try {
         return var1.createUserApiService(var2.class_.class_.protected_());
      } catch (AuthenticationException var4) {
         return UserApiService.OFFLINE;
      }
   }

   public String class_() {
      this.j();
      return (String)this.class_[25];
   }

   public void class_(Qg_1 var1) {
      this.j();
      this.class_[5] = var1;
   }

   @Override
   public void class_(boolean var1) {
      this.j();
      Boolean var6 = var1;
      this.class_[83] = var6;
   }

   public void class_(vm_3 var1) {
      this.break_(var1);
      this.throws_(false);
   }

   public boolean class_(UUID var1) {
      this.j();
      if (this.final_()) {
         return ((FU)this.class_[54]).byte_(var1);
      } else {
         return ((cb_3)this.class_[57] == null || !var1.equals(((cb_3)this.class_[57]).ro())) && !var1.equals(rqR_2.break_) ? true : case_[92];
      }
   }

   public void class_(Runnable var1) {
      ((ConcurrentLinkedQueue)break_[7]).add(var1);
   }

   public KY class_(KY var1) {
      this.j();
      class_((jV_2)this.class_[37], (String)this.class_[25], (Qw_1)this.class_[20], var1);
      if ((gm_3)this.class_[56] != null) {
         ((gm_3)this.class_[56]).class_(var1);
      }

      return var1;
   }

   public void class_(cT_2 var1) {
      this.j();
      this.class_[75] = var1;
   }

   public QK class_(rVv_1 var1, Function<rrGk_1, rTH> var2, Function4<rrGk_1, rVv_1, rAL, rTH, rrGP> var3, boolean var4, rrGk_1 var5) throws ExecutionException, InterruptedException {
      rTH var6 = (rTH)var2.apply(var5);
      rAt_1 var7 = new rAt_1(new rAf_1(), new rAz_1(var5.class_(rrGr_1.catch_).toFile(), rAZ.byte_));

      try {
         rTH var8 = rnW_2.class_(var7, var6, var4);
         CompletableFuture var9 = rAh_1.class_(var7.case_(), gq_3.INTEGRATED, byte_[18], rqR_2.case_(), this);
         this.byte_(var9::isDone);
         rAh_1 var10 = (rAh_1)var9.get();
         rrGP var11 = (rrGP)var3.apply(var5, var1, var10.private_(), var8);
         return new QK(var7, var10, var11);
      } catch (InterruptedException | ExecutionException var12) {
         var7.close();
         throw var12;
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{57, -97, -33, 29, -1, -79, -69, 69}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void class_(int var1) {
      this.j();
      Integer var6 = var1;
      this.class_[65] = var6;
   }

   private void class_(Throwable var1) {
      this.j();
      if (((rAt_1)this.class_[36]).protected_().size() > 1) {
         rgN_2 var2;
         if (var1 instanceof rAV) {
            var2 = new rgN_2(((rAV)var1).class_().class_());
         } else {
            var2 = null;
         }

         this.class_(var1, var2);
      } else {
         rqR_2.break_(var1);
      }
   }

   public static rrGP class_(rrGk_1 var0, rVv_1 var1, rAL var2, rTH var3) {
      rVq_1 var4 = rVq_1.class_(rcf_3.class_, var2, var1);
      rrGP var5 = var0.class_(var4, var3);
      if (var5 == null) {
         throw new IllegalStateException("Failed to load world");
      } else {
         return var5;
      }
   }

   public void m() {
      this.j();

      try {
         ((Logger)break_[protected_[244]]).info(throws_[37]);

         try {
            if ((gm_3)this.class_[protected_[245]] != null) {
               ((gm_3)this.class_[protected_[246]]).catch_();
            }

            this.transient_();
         } catch (Throwable var5) {
         }

         if ((vm_3)this.class_[protected_[247]] != null) {
            ((vm_3)this.class_[protected_[248]]).w_();
            ((vm_3)this.class_[protected_[249]]).this_();
         }

         this.close();
      } finally {
         rqR_2.class_ = System::nanoTime;
         if ((KY)this.class_[78] == null) {
            System.exit(0);
         }
      }
   }

   private static void p() {
      throws_ = new String[]{
         new String("Client"),
         new String(""),
         new String("root"),
         new String("server-resource-packs"),
         new String("Setting user: {}"),
         new String("(Session ID is {})"),
         new String("Backend library: {}"),
         new String("icons/icon_16x16.png"),
         new String("icons/icon_32x32.png"),
         new String("Couldn't set icon"),
         new String("skins"),
         new String("saves"),
         new String("backups"),
         new String("Startup"),
         new String("Post startup"),
         new String("Celestial Client"),
         new String(" - Build: "),
         new String("1.1"),
         new String(" ("),
         new String(")"),
         new String("Caught error loading resourcepacks, removing all selected resourcepacks"),
         new String("Out of memory"),
         new String("Reported exception thrown!"),
         new String("Unexpected error"),
         new String("Unreported exception thrown!"),
         new String("sun.arch.data.model"),
         new String("com.ibm.vm.bitmode"),
         new String("os.arch"),
         new String("64"),
         new String("crash-reports"),
         new String("yyyy-MM-dd_HH.mm.ss"),
         new String("#@?@# Game crashed! Crash report could not be saved. #@?@#"),
         new String("Missing model for: {}"),
         new String("Missing particle icon for: {}"),
         new String("Missing translation for: {} {} {}"),
         new String("Your game data is foobar, fix the errors above!"),
         new String("chat.cannotSend"),
         new String("Stopping!"),
         new String("Shutdown failure!"),
         new String("Pre render"),
         new String("Render"),
         new String("Post render"),
         new String("%d fps T: %s%s%s%s B: %d"),
         new String("inf"),
         new String(" vsync"),
         new String(""),
         new String(""),
         new String(" fast-clouds"),
         new String(" fancy-clouds"),
         new String("menu.savingLevel"),
         new String("Null returned as 'hitResult', this shouldn't happen!"),
         new String("Null returned as 'hitResult', this shouldn't happen!"),
         new String("Ticking screen"),
         new String("Exception in world tick"),
         new String("Affected level"),
         new String("Problem"),
         new String("Level is null!"),
         new String(""),
         new String("/"),
         new String("Failed to load data pack config"),
         new String("Failed to load world"),
         new String("Failed to read level {} data"),
         new String("Failed to load datapacks, can't proceed with server load"),
         new String("Failed to unlock access to level {}"),
         new String("Starting integrated server"),
         new String("Starting integrated server"),
         new String("Level ID"),
         new String("Level Name"),
         new String("Failed to unlock access to level {}"),
         new String("selectWorld.backupQuestion.customized"),
         new String("selectWorld.backupWarning.customized"),
         new String("selectWorld.backupQuestion.experimental"),
         new String("selectWorld.backupWarning.experimental"),
         new String("selectWorld.backupQuestion.experimental"),
         new String("selectWorld.backupWarning.experimental"),
         new String("connect.joining"),
         new String(""),
         new String("Picking on: [{}] {} gave null item"),
         new String("SkullOwner"),
         new String("SkullOwner"),
         new String("SkullOwner"),
         new String("BlockEntityTag"),
         new String("\"(+NBT)\""),
         new String("Lore"),
         new String("display"),
         new String("Launched Version"),
         new String("Backend library"),
         new String("Backend API"),
         new String("GL Caps"),
         new String("Using VBOs"),
         new String("Is Modded"),
         new String("Type"),
         new String("Client (map_client.txt)"),
         new String("GPU Warnings"),
         new String("Graphics mode"),
         new String("Resource Packs"),
         new String("Current Language"),
         new String("CPU"),
         new String("hosting_lan"),
         new String("singleplayer"),
         new String("playing_lan"),
         new String("multiplayer"),
         new String("out_of_game"),
         new String(", "),
         new String(" (incompatible)"),
         new String("vanilla"),
         new String("Very likely; Jar signature invalidated"),
         new String("Probably not. Jar signature remains and client brand is untouched."),
         new String("Yes"),
         new String("Failed to delete world {}"),
         new String("Error reading worldgen settings after loading data packs: "),
         new String("id_default"),
         new String("uniform"),
         new String("multiplayer.socialInteractions.not_available")
      };
   }

   public rpN_2 k() {
      this.j();
      return (rpN_2)this.class_[29];
   }

   public float default_() {
      this.j();
      return ((rqw_3)this.class_[6]).break_;
   }

   @Override
   public void v() {
      this.j();
      int var1 = ((Qg_1)this.class_[5]).class_(((Qw_1)this.class_[20]).rs, this.continue_());
      ((Qg_1)this.class_[5]).class_((double)var1);
      VC var2 = this.B();
      var2.class_(((Qg_1)this.class_[5]).extends_(), ((Qg_1)this.class_[5]).native_(), (Boolean)break_[2]);
      ((Hh_1)this.class_[16]).class_(((Qg_1)this.class_[5]).extends_(), ((Qg_1)this.class_[5]).native_());
      ((Qi_1)this.class_[22]).throws_();
      if ((vm_3)this.class_[73] != null) {
         ((vm_3)this.class_[73]).class_(this, ((Qg_1)this.class_[5]).super_(), ((Qg_1)this.class_[5]).this_());
      }
   }

   private void j() {
      if (this.class_ == null) {
         this.class_ = new Object[88];
         this.class_[30] = false;
         this.class_[31] = false;
         this.class_[32] = false;
         this.class_[33] = false;
         this.class_[61] = false;
         this.class_[65] = 0;
         this.class_[66] = 0;
         this.class_[67] = false;
         this.class_[68] = 0.0F;
         this.class_[69] = 0L;
         this.class_[70] = 0L;
         this.class_[71] = 0;
         this.class_[72] = false;
         this.class_[77] = false;
         this.class_[80] = false;
         this.class_[81] = false;
         this.class_[82] = false;
         this.class_[83] = false;
         this.class_[87] = 0L;
      }
   }

   private static void q() {
      protected_ = new short[]{
         6,
         13,
         18,
         29,
         53,
         69,
         77,
         79,
         82,
         84,
         86,
         0,
         24,
         0,
         25,
         26,
         1,
         24,
         35,
         35,
         0,
         36,
         27,
         27,
         46,
         47,
         14,
         1,
         14,
         1,
         14,
         31,
         32,
         33,
         30,
         58,
         3,
         76,
         24,
         20,
         24,
         3,
         21,
         1,
         20,
         20,
         20,
         20,
         4,
         4,
         20,
         5,
         5,
         1,
         5,
         20,
         22,
         22,
         5,
         23,
         23,
         5,
         20,
         5,
         5,
         2,
         40,
         40,
         34,
         36,
         20,
         36,
         20,
         37,
         34,
         37,
         34,
         2,
         34,
         2,
         2,
         46,
         48,
         24,
         24,
         3,
         28,
         34,
         20,
         41,
         34,
         41,
         14,
         44,
         34,
         44,
         42,
         2,
         43,
         43,
         15,
         34,
         43,
         34,
         34,
         5,
         5,
         5,
         5,
         38,
         38,
         39,
         2,
         38,
         20,
         49,
         34,
         49,
         2,
         49,
         39,
         10,
         2,
         10,
         34,
         15,
         20,
         9,
         11,
         34,
         10,
         7,
         34,
         7,
         16,
         34,
         16,
         47,
         54,
         49,
         38,
         50,
         34,
         50,
         7,
         8,
         34,
         8,
         34,
         13,
         56,
         2,
         12,
         34,
         12,
         2,
         51,
         34,
         51,
         2,
         52,
         34,
         52,
         45,
         34,
         45,
         19,
         17,
         20,
         5,
         5,
         20,
         5,
         5,
         20,
         5,
         20,
         5,
         36,
         34,
         5,
         0,
         0,
         5,
         5,
         36,
         1,
         36,
         20,
         20,
         20,
         76,
         77,
         78,
         78,
         1,
         1,
         1,
         43,
         3,
         4,
         13,
         13,
         13,
         20,
         20,
         40,
         25,
         26,
         78,
         24,
         20,
         85,
         85,
         75,
         85,
         36,
         36,
         34,
         5,
         1,
         1,
         1,
         28,
         57,
         57,
         73,
         73,
         73,
         56,
         57,
         57,
         56,
         57,
         20,
         19,
         73,
         22,
         5,
         5,
         72,
         41,
         22,
         75,
         1,
         56,
         56,
         73,
         73,
         73,
         78,
         78,
         49,
         43,
         16,
         8,
         41,
         36,
         12,
         52,
         51,
         2,
         34,
         4,
         5,
         1,
         4,
         5,
         5,
         87,
         87,
         0,
         5,
         85,
         75,
         85,
         85,
         84,
         6,
         22,
         5,
         41,
         16,
         16640,
         2,
         40,
         72,
         16,
         67,
         68,
         6,
         40,
         40,
         5,
         5,
         5,
         5,
         71,
         71,
         73,
         73,
         75,
         75,
         58,
         67,
         67,
         6,
         68,
         6,
         68,
         67,
         29,
         69,
         69,
         70,
         71,
         9,
         9,
         20,
         20,
         20,
         20,
         20,
         20,
         20,
         79,
         70,
         70,
         71,
         5,
         20,
         5,
         5,
         5,
         2,
         16,
         5,
         5,
         22,
         73,
         73,
         5,
         5,
         22,
         5,
         56,
         73,
         75,
         8,
         8,
         61,
         58,
         58,
         77,
         77,
         73,
         58,
         41,
         66,
         66,
         57,
         64,
         64,
         64,
         56,
         0,
         0,
         55,
         12,
         57,
         0,
         1,
         55,
         66,
         64,
         1,
         55,
         66,
         57,
         0,
         64,
         55,
         57,
         64,
         64,
         56,
         55,
         55,
         66,
         57,
         64,
         55,
         0,
         65,
         57,
         64,
         1,
         57,
         0,
         64,
         0,
         64,
         64,
         55,
         57,
         55,
         57,
         57,
         64,
         55,
         57,
         56,
         57,
         55,
         16,
         55,
         0,
         57,
         16,
         0,
         42,
         7,
         7,
         0,
         65,
         65,
         65,
         67,
         19,
         16,
         67,
         56,
         55,
         56,
         2,
         73,
         57,
         57,
         73,
         57,
         56,
         73,
         73,
         57,
         73,
         10000,
         66,
         73,
         73,
         20,
         19,
         75,
         73,
         57,
         0,
         73,
         0,
         73,
         66,
         66,
         66,
         56,
         67,
         16,
         67,
         8,
         67,
         56,
         56,
         56,
         56,
         16,
         16,
         67,
         42,
         41,
         67,
         56,
         67,
         20,
         20,
         20,
         56,
         56,
         56,
         67,
         56,
         56,
         57,
         57,
         57,
         67,
         12,
         60,
         60,
         23,
         61,
         58,
         58,
         20,
         20,
         20,
         20,
         20,
         16,
         20,
         8,
         20,
         20,
         20,
         20,
         20,
         20,
         57,
         19,
         57,
         73,
         57,
         1,
         20,
         57,
         6,
         20,
         55,
         57,
         57,
         20,
         57,
         0,
         20,
         57,
         20,
         57,
         57,
         57,
         20,
         20,
         73,
         75,
         20,
         57,
         20,
         55,
         57,
         20,
         20,
         20,
         20,
         20,
         20,
         20,
         65,
         57,
         73,
         20,
         22,
         2,
         1,
         28,
         1,
         1,
         1,
         0,
         18,
         27,
         24,
         58,
         61,
         18,
         18,
         58,
         78,
         78,
         58,
         60,
         1,
         2,
         0,
         56,
         61,
         27,
         24,
         0,
         58,
         58,
         16,
         55,
         56,
         0,
         56,
         35,
         19,
         59,
         61,
         53,
         56,
         57,
         41,
         62,
         60,
         8,
         12,
         54,
         57,
         57,
         33,
         31,
         57,
         57,
         0,
         0,
         20,
         0,
         20,
         0,
         20,
         0,
         20,
         64,
         64,
         57,
         18,
         64,
         64,
         56,
         56,
         56,
         64,
         1,
         56,
         64,
         64,
         1,
         57,
         1,
         55,
         57,
         55,
         37,
         25,
         20,
         56,
         56,
         0,
         0,
         0,
         58,
         58,
         59,
         59,
         59,
         0,
         59,
         61,
         61,
         58,
         58,
         14,
         14,
         1,
         14,
         1,
         1,
         27,
         2,
         34,
         36,
         35,
         0,
         37,
         49,
         30,
         67,
         45,
         41,
         73,
         57,
         57,
         7,
         19,
         57,
         7,
         57,
         42,
         57,
         57,
         7,
         57,
         18,
         57,
         18,
         56,
         57,
         46,
         48,
         62,
         62,
         16,
         57,
         57,
         20,
         76,
         50,
         9,
         10,
         11,
         13,
         29,
         3,
         6,
         6,
         38,
         57,
         57,
         20,
         83,
         21,
         49,
         51,
         52,
         83,
         53,
         44,
         75,
         54,
         5,
         7,
         49,
         65,
         7,
         5,
         19,
         20,
         28,
         1,
         28,
         0,
         18,
         84,
         1,
         73,
         8
      };
   }

   private void U() {
      this.j();
      gh_3 var1 = new gh_3<>(
         var0 -> var0.class_(null, VU.NORMAL)
               .stream()
               .map(var0x -> rgF_2.class_(var0x.getString()).trim())
               .filter(var0x -> !var0x.isEmpty() ? true : case_[115]),
         var0 -> Stream.of(rVL.for_.break_(var0.break_()))
      );
      gd_3 var2 = new gd_3<>(var0 -> rlc_3.class_().class_(var0.break_()).stream());
      rqs_3 var3 = rqs_3.class_();

      for (rdb_3 var5 : rVL.for_) {
         var5.class_(rdX_2.catch_, var3);
      }

      var3.forEach(var2x -> {
         var1.class_(var2x);
         var2.class_(var2x);
      });
      gh_3 var6 = new gh_3<>(
         var0 -> var0.protected_()
               .stream()
               .flatMap(var0x -> var0x.byte_().class_(null, VU.NORMAL).stream())
               .map(var0x -> rgF_2.class_(var0x.getString()).trim())
               .filter(var0x -> !var0x.isEmpty() ? true : case_[113]),
         var0 -> var0.protected_().stream().map(var0x -> rVL.for_.break_(var0x.byte_().break_()))
      );
      ((gJ_2)this.class_[13]).class_(gJ_2.class_, var1);
      ((gJ_2)this.class_[13]).class_(gJ_2.break_, var2);
      ((gJ_2)this.class_[13]).class_(gJ_2.byte_, var6);
   }

   public QU short_() {
      this.j();
      return (QU)this.class_[53];
   }

   @Override
   public void close() {
      this.j();

      try {
         ((Ip_1)this.class_[protected_[252]]).close();
         ((ub_3)this.class_[protected_[253]]).close();
         ((Hh_1)this.class_[protected_[254]]).close();
         ((yX_2)this.class_[protected_[255]]).close();
         ((Nf_1)this.class_[protected_[256]]).protected_();
         ((rAt_1)this.class_[protected_[257]]).close();
         ((Cy_1)this.class_[protected_[258]]).break_();
         ((fC_2)this.class_[protected_[259]]).close();
         ((fv_3)this.class_[protected_[260]]).close();
         ((fY_2)this.class_[protected_[261]]).close();
         ((rAv_1)this.class_[protected_[262]]).close();
         rqR_2.private_();
      } catch (Throwable var5) {
         ((Logger)break_[protected_[265]]).error(throws_[38], var5);
         throw var5;
      } finally {
         ((yh_3)this.class_[4]).close();
         ((Qg_1)this.class_[5]).close();
      }
   }

   public void z() {
      this.j();
      if ((Integer)this.class_[66] <= 0) {
         if ((rjG_2)this.class_[64] == null) {
            ((Logger)break_[1]).error("Null returned as 'hitResult', this shouldn't happen!");
            if (((Ax_1)this.class_[55]).case_()) {
               Integer var8 = 10;
               this.class_[66] = var8;
            }
         } else if (!((cb_3)this.class_[57]).long_()) {
            switch (((int[])Qo_1.class_[0])[((rjG_2)this.class_[64]).byte_().ordinal()]) {
               case 1:
                  ((Ax_1)this.class_[55]).class_((cb_3)this.class_[57], ((rfo_3)((rjG_2)this.class_[64])).class_(), true);
                  break;
               case 2:
                  rff_3 var1 = (rff_3)((rjG_2)this.class_[64]);
                  rfH_2 var2 = var1.class_();
                  xc_3 var3 = ((gm_3)this.class_[56]).byte_(var2);
                  if (!var3.catch_()) {
                     ((Ax_1)this.class_[55]).class_(var2, var1.break_(), true);
                     break;
                  }
               case 3:
                  if (((Ax_1)this.class_[55]).case_()) {
                     Integer var9 = 10;
                     this.class_[66] = var9;
                  }

                  ((cb_3)this.class_[57]).sg();
            }

            rrjl_3.class_((rjG_2)this.class_[64], rpm_3.MAIN_HAND);
         }
      }
   }

   public Aq_1 void_() {
      this.j();
      return (cb_3)this.class_[57] == null ? null : (Aq_1)((cb_3)this.class_[57]).break_[0];
   }

   private void w() {
      boolean var1 = false;
      lY_2 var2 = this.synchronized_().break_();
      IJ var3 = var2.class_().break_();

      for (xd_3 var5 : rVL.strictfp_) {
         UnmodifiableIterator var6 = var5.new_().class_().iterator();

         while (var6.hasNext()) {
            xc_3 var7 = (xc_3)var6.next();
            if (var7.private_() == xN_2.MODEL) {
               IJ var8 = var2.break_(var7);
               if (var8 == var3) {
                  ((Logger)break_[1]).debug("Missing model for: {}", var7);
                  var1 = true;
               }
            }
         }
      }

      fj_3 var13 = var3.throws_();

      for (xd_3 var16 : rVL.strictfp_) {
         UnmodifiableIterator var18 = var16.new_().class_().iterator();

         while (var18.hasNext()) {
            xc_3 var20 = (xc_3)var18.next();
            fj_3 var9 = var2.class_(var20);
            if (!var20.catch_() && var9 == var13) {
               ((Logger)break_[1]).debug("Missing particle icon for: {}", var20);
               var1 = true;
            }
         }
      }

      rqs_3 var15 = rqs_3.class_();

      for (rdb_3 var19 : rVL.for_) {
         var15.clear();
         var19.class_(rdX_2.catch_, var15);

         for (rdn_3 var22 : var15) {
            String var10 = var22.finally_();
            String var11 = new rgn_3(var10).getString();
            if (var11.toLowerCase(Locale.ROOT).equals(var19.break_())) {
               ((Logger)break_[1]).debug("Missing translation for: {} {} {}", var22, var10, var22.break_());
            }
         }
      }

      var1 |= cg_3.class_();
      if (var1) {
         throw new IllegalStateException("Your game data is foobar, fix the errors above!");
      }
   }

   public jV_2 u() {
      this.j();
      return (jV_2)this.class_[37];
   }

   public MinecraftSessionService r() {
      this.j();
      return (MinecraftSessionService)this.class_[46];
   }

   public NL N() {
      this.j();
      return (NL)this.class_[42];
   }

   @Override
   public void break_() {
      this.j();
      ((Qi_1)this.class_[22]).implements_();
   }

   public void break_(vm_3 var1) {
      this.j();
      rrFo_1 var2 = null;
      if ((vm_3)this.class_[73] != null) {
         ((vm_3)this.class_[73]).w_();
         var2 = ((vm_3)this.class_[73]).this_();
      }

      if (var1 == null && (gm_3)this.class_[56] == null) {
         var1 = new rrvL();
      } else if (var1 == null && ((cb_3)this.class_[57]).Sl()) {
         if (((cb_3)this.class_[57]).d()) {
            var1 = new ZS(null, ((gm_3)this.class_[56]).synchronized_().implements_());
         } else {
            ((cb_3)this.class_[57]).J();
         }
      }

      if (var1 instanceof vB_2 || var1 instanceof vG_2) {
         ((Qw_1)this.class_[20]).R = false;
         ((cq_3)this.class_[19]).throws_().class_(true);
      }

      this.class_[73] = var1;
      if (var1 != null) {
         ((Qi_1)this.class_[22]).private_();
         Vu_1.break_();
         ((vm_3)var1).break_(this, ((Qg_1)this.class_[5]).super_(), ((Qg_1)this.class_[5]).this_());
         Boolean var8 = false;
         this.class_[72] = var8;
      } else {
         ((Nf_1)this.class_[41]).throws_();
         if (var2 == null || !var2.class_()) {
            ((Qi_1)this.class_[22]).catch_();
         }

         vs_3.INSTANCE.class_();
      }

      this.implements_();
   }

   public void break_(an_3 var1) {
      this.j();
      this.class_[62] = var1;
      ((Hh_1)this.class_[16]).class_(var1);
   }

   @Override
   public Runnable break_(Runnable var1) {
      return var1;
   }

   private static Supplier<rAC> break_(Supplier<rAC> var0) {
      return () -> new jR_2((rAC)var0.get());
   }

   public void break_(boolean var1) {
      this.j();
      if ((vm_3)this.class_[73] == null) {
         boolean var2 = this.finally_() && !((rng_3)this.class_[58]).d() ? true : case_[50];
         if (var2) {
            this.break_(new ZY(!var1 ? true : case_[52]));
            ((Nf_1)this.class_[41]).break_();
         } else {
            this.break_(new ZY(true));
         }
      }
   }

   public void break_(KY var1) {
      this.j();
      this.class_[78] = var1;
   }

   private void break_(gm_3 var1) {
      this.j();
      ((yX_2)this.class_[8]).class_(var1);
      ((Cy_1)this.class_[12]).class_(var1);
      jz_3.break_.class_(var1);
      this.implements_();
   }

   public void break_(String var1) {
      this.class_(var1, rVm_1.break_(), QY::class_, QY::class_, false, (QD)QD.staticFields25f7c1a34dee3bdaa6c7082af054c49d[2]);
   }

   public void break_(int var1) {
      this.j();
      ((Ip_1)this.class_[49]).class_(var1);
   }

   public SkinProvider throws_() {
      this.j();
      return (SkinProvider)this.class_[48];
   }

   private void throws_(boolean var1) {
      this.j();
      ((Qg_1)this.class_[5]).class_("Pre render");
      long var2 = rqR_2.byte_();
      long var4 = System.currentTimeMillis();
      double var6 = (double)((int)(var4 - (Long)this.class_[87]));
      Long var17 = var4;
      this.class_[87] = var17;
      Double var18 = var6;
      rrQo_1.class_[0] = var18;
      if (((Qg_1)this.class_[5]).break_()) {
         this.G();
      }

      if ((CompletableFuture)this.class_[85] != null && !((cT_2)this.class_[75] instanceof cj_3)) {
         CompletableFuture var8 = (CompletableFuture)this.class_[85];
         Object var19 = null;
         this.class_[85] = var19;
         this.private_().thenRun(() -> var8.complete(null));
      }

      Runnable var28;
      while ((var28 = (Runnable)((Queue)this.class_[84]).poll()) != null) {
         var28.run();
      }

      if (var1) {
         int var9 = ((rqw_3)this.class_[6]).class_(rqR_2.break_());
         this.rd();

         for (int var10 = 0; var10 < Math.min(10, var9); var10++) {
            this.package_();
         }
      }

      ((Qi_1)this.class_[22]).class_(false);
      ((Qg_1)this.class_[5]).class_("Render");
      ((Nf_1)this.class_[41]).class_(((Hh_1)this.class_[16]).finally_());
      RenderSystem.pushMatrix();
      RenderSystem.clear(16640, (Boolean)break_[2]);
      ((VC)this.class_[40]).class_(true);
      HE.class_();
      RenderSystem.enableTexture();
      RenderSystem.enableCull();
      if (!(Boolean)this.class_[72]) {
         ((Hh_1)this.class_[16]).class_(this.class_[67] ? (Float)this.class_[68] : ((rqw_3)this.class_[6]).class_, var2, var1);
      }

      ((VC)this.class_[40]).throws_();
      RenderSystem.popMatrix();
      RenderSystem.pushMatrix();
      ((VC)this.class_[40]).class_(((Qg_1)this.class_[5]).extends_(), ((Qg_1)this.class_[5]).native_());
      RenderSystem.popMatrix();
      ((Qg_1)this.class_[5]).throws_();
      int var29 = this.R();
      if ((double)var29 < QF.extends_.case_()) {
         RenderSystem.limitDisplayFPS(var29);
      }

      Thread.yield();
      ((Qg_1)this.class_[5]).class_("Post render");
      Integer var20 = (Integer)this.class_[71] + 1;
      this.class_[71] = var20;
      boolean var30 = this.finally_()
            && ((vm_3)this.class_[73] != null && ((vm_3)this.class_[73]).z_() || (cT_2)this.class_[75] != null && ((cT_2)this.class_[75]).class_())
            && !((rng_3)this.class_[58]).d()
         ? true
         : case_[42];
      if ((Boolean)this.class_[67] != var30) {
         if ((Boolean)this.class_[67]) {
            Float var21 = ((rqw_3)this.class_[6]).class_;
            this.class_[68] = var21;
         } else {
            ((rqw_3)this.class_[6]).class_ = (Float)this.class_[68];
         }

         Boolean var22 = var30;
         this.class_[67] = var22;
      }

      long var11 = rqR_2.byte_();
      ((rpN_2)this.class_[29]).class_(var11 - (Long)this.class_[69]);
      Long var23 = var11;
      this.class_[69] = var23;

      while (rqR_2.break_() >= this.class_[70] + 1000L) {
         Integer var24 = (Integer)this.class_[71];
         break_[9] = var24;
         String var25 = String.format(
            "%d fps T: %s%s%s%s B: %d",
            (Integer)break_[9],
            (double)((Qw_1)this.class_[20]).protected_ == QF.extends_.case_() ? "inf" : ((Qw_1)this.class_[20]).protected_,
            ((Qw_1)this.class_[20]).strictfp_ ? " vsync" : throws_[45],
            ((Qw_1)this.class_[20]).case_.toString(),
            ((Qw_1)this.class_[20]).throws_ == Vd_1.OFF ? "" : (((Qw_1)this.class_[20]).throws_ == Vd_1.FAST ? " fast-clouds" : throws_[48]),
            ((Qw_1)this.class_[20]).abstract_
         );
         this.class_[79] = var25;
         Long var26 = (Long)this.class_[70] + 1000L;
         this.class_[70] = var26;
         Integer var27 = 0;
         this.class_[71] = var27;
      }
   }

   public static boolean L() {
      return ((Qw_1)((QY)break_[0]).class_[20]).catch_ != Vh_1.OFF ? true : case_[100];
   }

   public rrGd_1 M() {
      this.j();
      return (rrGd_1)this.class_[28];
   }

   public Proxy W() {
      this.j();
      return (Proxy)this.class_[27];
   }

   private boolean H() {
      this.j();
      return this.class_[61] && ((rng_3)this.class_[58] == null || !((rng_3)this.class_[58]).d()) ? case_[64] : case_[63];
   }

   private int R() {
      this.j();
      int var1 = ((Qg_1)this.class_[5]).protected_();
      return this.static_() && ((gm_3)this.class_[56] != null || (vm_3)this.class_[73] == null && (cT_2)this.class_[75] == null) ? var1 : Math.min(var1, 60);
   }

   @Override
   public Thread P() {
      this.j();
      return (Thread)this.class_[76];
   }

   public boolean finally_() {
      this.j();
      return this.class_[61] && (rng_3)this.class_[58] != null ? true : case_[102];
   }

   public an_3 catch_() {
      this.j();
      return (an_3)this.class_[62];
   }

   public void G() {
      this.j();
      Boolean var5 = false;
      this.class_[77] = var5;
   }

   public boolean O() {
      return false;
   }

   public Ip_1 extends_() {
      this.j();
      return (Ip_1)this.class_[49];
   }

   public boolean goto_() {
      this.j();
      return (Boolean)this.class_[77];
   }

   private void K() {
      this.j();
      if ((rjG_2)this.class_[64] != null && ((rjG_2)this.class_[64]).byte_() != rjM_2.MISS) {
         boolean var1 = ((rhx_3)((cb_3)this.class_[57]).implements_[18]).protected_;
         ryO_2 var2 = null;
         rjM_2 var3 = ((rjG_2)this.class_[64]).byte_();
         rdn_3 var4;
         if (var3 == rjM_2.BLOCK) {
            rfH_2 var5 = ((rff_3)((rjG_2)this.class_[64])).class_();
            xc_3 var6 = ((gm_3)this.class_[56]).byte_(var5);
            xd_3 var7 = var6.break_();
            if (var6.catch_()) {
               return;
            }

            var4 = var7.class_((rRq_1)((gm_3)this.class_[56]), var5, var6);
            if (var4.class_()) {
               return;
            }

            if (var1 && vm_3.else_() && var7.protected_()) {
               var2 = ((gm_3)this.class_[56]).class_(var5);
            }
         } else {
            if (var3 != rjM_2.ENTITY || !var1) {
               return;
            }

            an_3 var9 = ((rfo_3)((rjG_2)this.class_[64])).class_();
            if (var9 instanceof rsO_2) {
               var4 = new rdn_3(rdy_3.hH);
            } else if (var9 instanceof rsM_2) {
               var4 = new rdn_3(rdy_3.df);
            } else if (var9 instanceof rsG_2 var12) {
               rdn_3 var8 = var12.final_();
               if (var8.class_()) {
                  var4 = new rdn_3(rdy_3.dB);
               } else {
                  var4 = var8.implements_();
               }
            } else if (var9 instanceof rsJ_2 var14) {
               var4 = new rdn_3(switch (((int[])Qo_1.class_[1])[var14.final_().ordinal()]) {
                  case 1 -> rdy_3.XX;
                  case 2 -> rdy_3.Xh;
                  case 3 -> rdy_3.dF;
                  case 4 -> rdy_3.dL;
                  case 5 -> rdy_3.dV;
                  default -> rdy_3.ho;
               });
            } else if (var9 instanceof rSK) {
               var4 = new rdn_3(((rSK)var9).protected_());
            } else if (var9 instanceof rSY) {
               var4 = new rdn_3(rdy_3.dq);
            } else if (var9 instanceof rSa_1) {
               var4 = new rdn_3(rdy_3.kM);
            } else {
               rkO_2 var16 = rkO_2.class_(var9.BC());
               if (var16 == null) {
                  return;
               }

               var4 = new rdn_3(var16);
            }
         }

         if (var4.class_()) {
            String var10 = "";
            if (var3 == rjM_2.BLOCK) {
               var10 = rVL.strictfp_.break_(((gm_3)this.class_[56]).byte_(((rff_3)((rjG_2)this.class_[64])).class_()).break_()).toString();
            } else if (var3 == rjM_2.ENTITY) {
               var10 = rVL.transient_.break_(((rfo_3)((rjG_2)this.class_[64])).class_().BC()).toString();
            }

            ((Logger)break_[1]).warn("Picking on: [{}] {} gave null item", var3, var10);
         } else {
            rhz_3 var11 = (rhz_3)((cb_3)this.class_[57]).implements_[1];
            if (var2 != null) {
               this.class_(var4, var2);
            }

            if (!rrfZ_2.byte_()) {
               int var13 = var11.break_(var4);
               if (var1) {
                  var11.class_(var4);
                  ((Ax_1)this.class_[55]).class_(((cb_3)this.class_[57]).protected_(rpm_3.MAIN_HAND), 36 + var11.protected_);
               } else if (var13 != -1) {
                  if (rhz_3.break_(var13)) {
                     var11.protected_ = var13;
                  } else {
                     ((Ax_1)this.class_[55]).class_(var13);
                  }
               }
            }
         }
      }
   }

   public pg_3 case_() {
      this.j();
      return (pg_3)this.class_[9];
   }

   public gW_2 const_() {
      this.j();
      return (gW_2)this.class_[44];
   }

   public boolean continue_() {
      this.j();
      return ((Qw_1)this.class_[20]).transient_;
   }

   public Qg_1 else_() {
      this.j();
      return (Qg_1)this.class_[5];
   }

   public void for_() {
      this.j();
      if (!((Ax_1)this.class_[55]).volatile_()) {
         rrAu_1 var1 = rrAu_1.break_(4);
         if (((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(var1).byte_()) {
            return;
         }

         Integer var17 = var1.class_();
         this.class_[65] = var17;
         if (!((cb_3)this.class_[57]).long_()) {
            if ((rjG_2)this.class_[64] == null) {
               ((Logger)break_[1]).warn("Null returned as 'hitResult', this shouldn't happen!");
            }

            for (rpm_3 var5 : rpm_3.values()) {
               rdn_3 var6 = ((cb_3)this.class_[57]).protected_(var5);
               if (((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(rrAY.class_(var6, var5)).byte_()) {
                  break;
               }

               if ((rjG_2)this.class_[64] != null) {
                  switch (((int[])Qo_1.class_[0])[((rjG_2)this.class_[64]).byte_().ordinal()]) {
                     case 1:
                        rfo_3 var7 = (rfo_3)((rjG_2)this.class_[64]);
                        an_3 var8 = var7.class_();
                        ryZ_2 var9 = ((Ax_1)this.class_[55]).class_((cb_3)this.class_[57], var8, var7, var5);
                        if (!var9.class_()) {
                           var9 = ((Ax_1)this.class_[55]).class_((cb_3)this.class_[57], var8, var5);
                        }

                        if (var9.class_()) {
                           if (var9.break_()) {
                              ((cb_3)this.class_[57]).class_(var5);
                           }

                           return;
                        }
                        break;
                     case 2:
                        rff_3 var10 = (rff_3)((rjG_2)this.class_[64]);
                        int var11 = var6.char_();
                        ryZ_2 var12 = ((Ax_1)this.class_[55]).class_((cb_3)this.class_[57], (gm_3)this.class_[56], var5, var10);
                        if (var12.class_()) {
                           if (var12.break_()) {
                              ((cb_3)this.class_[57]).class_(var5);
                              if (!var6.class_() && (var6.char_() != var11 || ((Ax_1)this.class_[55]).catch_())) {
                                 ((Hh_1)this.class_[16]).class_.class_(var5);
                              }
                           }

                           return;
                        }

                        if (var12 == ryZ_2.FAIL) {
                           return;
                        }
                  }
               }

               if (!var6.class_()) {
                  ryZ_2 var18 = ((Ax_1)this.class_[55]).class_(var5);
                  ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(rrAf_1.class_(var18, var6, var5));
                  if (var18.class_()) {
                     if (var18.break_()) {
                        ((cb_3)this.class_[57]).class_(var5);
                     }

                     ((Hh_1)this.class_[16]).class_.class_(var5);
                     return;
                  }
               } else {
                  ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(rrAf_1.class_(ryZ_2.PASS, var6, var5));
               }
            }
         }
      }
   }

   public void implements_() {
      this.j();
      ((Qg_1)this.class_[5]).break_(this.C());
   }

   public HB import_() {
      this.j();
      return (HB)this.class_[11];
   }

   public static QY instanceof_() {
      return (QY)break_[0];
   }

   public HM new_() {
      this.j();
      return (HM)this.class_[45];
   }

   public void package_() {
      this.j();

      while (!((ConcurrentLinkedQueue)break_[7]).isEmpty()) {
         ((Runnable)((ConcurrentLinkedQueue)break_[7]).poll()).run();
      }

      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).byte_();
      if ((Integer)this.class_[65] > 0) {
         Integer var8 = (Integer)this.class_[65] - 1;
         this.class_[65] = var8;
      }

      if (!(Boolean)this.class_[67]) {
         ((cq_3)this.class_[19]).protected_();
      }

      ((Hh_1)this.class_[16]).class_(1.0F);
      if (!(Boolean)this.class_[67] && (gm_3)this.class_[56] != null) {
         ((Ax_1)this.class_[55]).protected_();
      }

      if ((gm_3)this.class_[56] != null) {
         ((fY_2)this.class_[2]).break_();
      }

      if ((vm_3)this.class_[73] == null && (cb_3)this.class_[57] != null) {
         if (((cb_3)this.class_[57]).Sl() && !((vm_3)this.class_[73] instanceof ZS)) {
            this.break_(null);
         } else if (((cb_3)this.class_[57]).Sc() && (gm_3)this.class_[56] != null) {
            this.break_(new vy_3());
         }
      } else if ((vm_3)this.class_[73] != null && (vm_3)this.class_[73] instanceof vy_3 && !((cb_3)this.class_[57]).Sc()) {
         this.break_(null);
      }

      if ((vm_3)this.class_[73] != null) {
         Integer var9 = 10000;
         this.class_[66] = var9;
      }

      if ((vm_3)this.class_[73] != null) {
         vm_3.class_(() -> {
            this.j();
            ((vm_3)this.class_[73]).private_();
         }, "Ticking screen", ((vm_3)this.class_[73]).getClass().getCanonicalName());
      }

      if (!((Qw_1)this.class_[20]).R) {
         ((cq_3)this.class_[19]).native_();
      }

      if ((cT_2)this.class_[75] == null
         && (
            (vm_3)this.class_[73] == null
               || (cb_3)this.class_[57] != null
                  && ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(rrAm_1.class_((vm_3)this.class_[73])).break_()
               || ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).class_((vm_3)this.class_[73])
         )) {
         this.f();
         if ((Integer)this.class_[66] > 0) {
            Integer var10 = (Integer)this.class_[66] - 1;
            this.class_[66] = var10;
         }
      }

      if ((gm_3)this.class_[56] != null) {
         if (!(Boolean)this.class_[67]) {
            ((Hh_1)this.class_[16]).protected_();
         }

         if (!(Boolean)this.class_[67]) {
            ((yX_2)this.class_[8]).finally_();
         }

         if (!(Boolean)this.class_[67]) {
            if (((gm_3)this.class_[56]).super_() > 0) {
               ((gm_3)this.class_[56]).byte_(((gm_3)this.class_[56]).super_() - 1);
            }

            ((gm_3)this.class_[56]).protected_();
         }
      } else if (((Hh_1)this.class_[16]).throws_() != null) {
         ((Hh_1)this.class_[16]).break_();
      }

      if (!(Boolean)this.class_[67]) {
         ((NL)this.class_[42]).class_();
      }

      ((Nf_1)this.class_[41]).class_((Boolean)this.class_[67]);
      if ((gm_3)this.class_[56] != null) {
         if (!(Boolean)this.class_[67]) {
            if (!((Qw_1)this.class_[20]).char_ && this.H()) {
               ((Qw_1)this.class_[20]).char_ = true;
               ((Qw_1)this.class_[20]).break_();
            }

            try {
               ((gm_3)this.class_[protected_[482]]).class_(() -> true);
            } catch (Throwable var11) {
               KY var2 = KY.class_(var11, "Exception in world tick");
               if ((gm_3)this.class_[56] == null) {
                  Ko_1 var3 = var2.class_("Affected level");
                  var3.class_("Problem", "Level is null!");
               } else {
                  ((gm_3)this.class_[56]).class_(var2);
               }

               throw new KU(var2);
            }
         }

         if (!(Boolean)this.class_[67] && (gm_3)this.class_[56] != null) {
            ((gm_3)this.class_[56])
               .class_(rfU_2.byte_(((cb_3)this.class_[57]).rx()), rfU_2.byte_(((cb_3)this.class_[57]).re()), rfU_2.byte_(((cb_3)this.class_[57]).BO()));
         }

         if (!(Boolean)this.class_[67]) {
            ((Cy_1)this.class_[12]).byte_();
         }
      } else if ((rud_3)this.class_[60] != null) {
         ((rud_3)this.class_[60]).class_();
      }

      ((Qj_1)this.class_[23]).break_();
   }

   public static boolean return_() {
      return ((Qw_1)((QY)break_[0]).class_[20]).case_.class_() >= VW.FANCY.class_() ? true : case_[96];
   }

   public Vk_1 super_() {
      this.j();
      return (Vk_1)this.class_[21];
   }

   public boolean switch_() {
      this.j();
      return (Boolean)this.class_[61];
   }

   public boolean throw_() {
      this.j();
      return (Boolean)this.class_[67];
   }

   public NS try_() {
      this.j();
      if ((vm_3)this.class_[73] instanceof vg_3) {
         return Ns_1.byte_;
      } else if ((cb_3)this.class_[57] != null) {
         if (((rYB)((cb_3)this.class_[57]).throws_[7]).E() == rYB.throws_) {
            return ((cq_3)this.class_[19]).extends_().protected_() ? Ns_1.protected_ : Ns_1.throws_;
         } else {
            rYh_1 var1 = ((rYB)((cb_3)this.class_[57]).throws_[7]).implements_(((cb_3)this.class_[57]).Bs()).this_();
            if (!((NL)this.class_[42]).break_(Ns_1.case_) && (!((cb_3)this.class_[57]).W() || var1 != rYh_1.OCEAN && var1 != rYh_1.RIVER)) {
               return ((rYB)((cb_3)this.class_[57]).throws_[7]).E() != rYB.protected_
                     && ((rhx_3)((cb_3)this.class_[57]).implements_[18]).protected_
                     && ((rhx_3)((cb_3)this.class_[57]).implements_[18]).byte_
                  ? Ns_1.break_
                  : ((gm_3)this.class_[56]).static_().break_(((cb_3)this.class_[57]).Bs()).super_().orElse(Ns_1.catch_);
            } else {
               return Ns_1.case_;
            }
         }
      } else {
         return Ns_1.class_;
      }
   }

   public rqN_2 while_() {
      this.j();
      return (rqN_2)this.class_[14];
   }

   public boolean static_() {
      this.j();
      return (Boolean)this.class_[83];
   }

   public static boolean public_() {
      return !((Qw_1)((QY)break_[0]).class_[20]).g ? true : case_[94];
   }

   private static Supplier<rAC> protected_(Supplier<rAC> var0) {
      return () -> new jg_3((rAC)var0.get(), jg_3.class_);
   }

   private void protected_(boolean var1) {
      this.j();
      if (!var1) {
         Integer var10 = 0;
         this.class_[66] = var10;
      }

      if ((Integer)this.class_[66] <= 0 && !((cb_3)this.class_[57]).return_()) {
         if (var1 && (rjG_2)this.class_[64] != null && ((rjG_2)this.class_[64]).byte_() == rjM_2.BLOCK) {
            rff_3 var2 = (rff_3)((rjG_2)this.class_[64]);
            rfH_2 var3 = var2.class_();
            xc_3 var4 = ((gm_3)this.class_[56]).byte_(var3);
            if (!var4.catch_()) {
               rpr_3 var5 = var2.break_();
               ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0])
                  .finally_()
                  .class_(rrLH.class_(var3, var4, (rrLy_1)rrLy_1.staticFields4117bd257b2839b395dedb8ac6b8a087[0]));
               if (((Ax_1)this.class_[55]).break_(var3, var5, true)) {
                  if (rrbb_3.M()) {
                     ((Cy_1)this.class_[12]).class_(var3, var5);
                  }

                  ((cb_3)this.class_[57]).class_(rpm_3.MAIN_HAND);
               }

               ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0])
                  .finally_()
                  .class_(rrLH.class_(var3, var4, (rrLy_1)rrLy_1.staticFields4117bd257b2839b395dedb8ac6b8a087[1]));
            }
         } else {
            ((Ax_1)this.class_[55]).break_();
         }
      }
   }

   private void protected_(vm_3 var1) {
      this.j();
      ((Nf_1)this.class_[41]).byte_();
      Object var6 = null;
      this.class_[62] = var6;
      Object var7 = null;
      this.class_[60] = var7;
      this.break_(var1);
      this.throws_(false);
   }

   public DataFixer protected_() {
      this.j();
      return (DataFixer)this.class_[3];
   }

   public CompletableFuture<Void> private_() {
      this.j();
      if ((CompletableFuture)this.class_[85] != null) {
         return (CompletableFuture<Void>)this.class_[85];
      } else {
         CompletableFuture var1 = new CompletableFuture();
         if ((cT_2)this.class_[75] instanceof cj_3) {
            this.class_[85] = var1;
            return var1;
         } else {
            ((rAt_1)this.class_[36]).class_();
            List var2 = ((rAt_1)this.class_[36]).case_();
            this.class_(
               new cj_3(
                  this,
                  ((rAv_1)this.class_[34]).class_(rqR_2.case_(), this, (CompletableFuture<rqg_3>)break_[5], var2),
                  var2x -> rqR_2.class_(var2x, this::class_, () -> {
                        this.j();
                        ((yX_2)this.class_[8]).throws_();
                        var1.complete(null);
                     }),
                  true
               )
            );
            return var1;
         }
      }
   }

   public fC_2 abstract_() {
      this.j();
      return (fC_2)this.class_[52];
   }

   public boolean final_() {
      this.j();
      return (Boolean)this.class_[33];
   }

   public void transient_() {
      this.byte_(new vY_2());
   }

   public FU volatile_() {
      this.j();
      return (FU)this.class_[54];
   }

   public lo_3 synchronized_() {
      this.j();
      return (lo_3)this.class_[50];
   }

   public boolean native_() {
      return false;
   }

   public boolean strictfp_() {
      this.j();
      return (Boolean)this.class_[30];
   }

   public boolean E() {
      this.j();
      return ((cb_3)this.class_[57] == null || !((cb_3)this.class_[57]).sW()) && !((Qw_1)this.class_[20]).switch_ ? case_[108] : case_[107];
   }

   public fY_2 A() {
      this.j();
      return (fY_2)this.class_[2];
   }

   private static void T() {
      Object[] var0 = new Object[]{
         null,
         LogManager.getLogger(),
         false,
         new rqO_2("id_default"),
         new rqO_2("uniform"),
         CompletableFuture.completedFuture((rqg_3)rqg_3.INSTANCE),
         new rgn_3("multiplayer.socialInteractions.not_available"),
         Queues.newConcurrentLinkedQueue(),
         new byte[10485760],
         0
      };
      break_ = var0;
   }

   public float X() {
      this.j();
      return ((rqw_3)this.class_[6]).class_;
   }

   public String Q() {
      this.j();
      return (String)this.class_[26];
   }

   private String rr() {
      this.j();
      if ((rng_3)this.class_[58] != null) {
         return ((rng_3)this.class_[58]).d() ? "hosting_lan" : throws_[99];
      } else if ((Ak_1)this.class_[59] != null) {
         return ((Ak_1)this.class_[59]).protected_() ? "playing_lan" : throws_[101];
      } else {
         return throws_[102];
      }
   }

   private static void rP() {
      private_ = new float[]{20.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F};
   }
}
