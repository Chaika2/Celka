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
   private static byte[] id_byte;
   private static short[] id_protected;
   private static String[] id_throws;
   public Object[] id_class;
   private static boolean[] id_case;
   private static int[] id_catch;
   private static float[] id_private;
   public static Object[] id_break;
   private static long[] id_implements;

   public fv_3 id_boolean() {
      this.j();
      return (fv_3)this.id_class[51];
   }

   public rAt_1 id_char() {
      this.j();
      return (rAt_1)this.id_class[36];
   }

   @Override
   public boolean id_byte(Runnable var1) {
      return true;
   }

   public static void id_byte(KY var0) {
      File var1 = new File((File)id_instanceof().id_class[24], "crash-reports");
      File var2 = new File(var1, "crash-" + new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss").format(new Date()) + "-client.txt");
      rVN.id_class(var0.id_protected());
      if (var0.id_throws() != null) {
         rVN.id_class("#@!@# Game crashed! Crash report saved to: #@!@# " + var0.id_throws());
         System.exit(-1);
      } else if (var0.id_class(var2)) {
         rVN.id_class("#@!@# Game crashed! Crash report saved to: #@!@# " + var2.getAbsolutePath());
         System.exit(-1);
      } else {
         rVN.id_class(id_throws[31]);
         System.exit(-2);
      }
   }

   public PropertyMap id_byte() {
      this.j();
      if (((PropertyMap)this.id_class[1]).isEmpty()) {
         GameProfile var1 = this.r().fillProfileProperties(((rqN_2)this.id_class[14]).id_throws(), false);
         ((PropertyMap)this.id_class[1]).putAll(var1.getProperties());
      }

      return (PropertyMap)this.id_class[1];
   }

   private void id_byte(String var1) {
      this.j();
      if (this.id_switch() || this.id_final()) {
         this.id_break(new FP(var1));
      } else if ((cb_3)this.id_class[57] != null) {
         ((cb_3)this.id_class[57]).id_class(new rgn_3("chat.cannotSend").id_class(rgF_2.RED), rqR_2.id_break);
      }
   }

   private static int id_byte(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -219791063;
   }

   public void id_byte(vm_3 var1) {
      this.j();
      Aq_1 var2 = this.id_void();
      if (var2 != null) {
         this.rx();
         var2.id_byte();
      }

      rng_3 var3 = (rng_3)this.id_class[58];
      Object var8 = null;
      this.id_class[58] = var8;
      ((Hh_1)this.id_class[16]).id_case();
      Object var9 = null;
      this.id_class[55] = var9;
      this.id_protected(var1);
      if ((gm_3)this.id_class[56] != null) {
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrnm_3.id_class((gm_3)this.id_class[56]));
         if (var3 != null) {
            while (!var3.id_char()) {
               this.id_throws(false);
            }
         }

         ((jy_3)this.id_class[35]).id_break();
         ((cq_3)this.id_class[19]).id_finally();
         Object var10 = null;
         this.id_class[59] = var10;
         Boolean var11 = false;
         this.id_class[61] = var11;
         ((QU)this.id_class[53]).id_class();
      }

      Object var12 = null;
      this.id_class[56] = var12;
      this.id_break(null);
      Object var13 = null;
      this.id_class[57] = var13;
   }

   public void id_byte(boolean var1) {
      this.j();
      ((ub_3)this.id_class[43]).id_class(var1 ? ImmutableMap.of((rqO_2)id_break[3], (rqO_2)id_break[4]) : ImmutableMap.of());
   }

   public boolean id_int() {
      this.j();
      return (Boolean)this.id_class[31];
   }

   public cT_2 id_long() {
      this.j();
      return (cT_2)this.id_class[75];
   }

   public Hz_1 id_float() {
      this.j();
      return (Hz_1)this.id_class[10];
   }

   public void id_double() {
      this.j();
      Thread var7 = Thread.currentThread();
      this.id_class[76] = var7;

      try {
         boolean var1 = id_case[18];

         while (this.id_class[id_protected[192]]) {
            if ((KY)this.id_class[id_protected[193]] != null) {
               id_byte((KY)this.id_class[id_protected[194]]);
               return;
            }

            try {
               this.id_throws(!var1 ? id_case[19] : id_case[20]);
            } catch (OutOfMemoryError var8) {
               if (var1) {
                  throw var8;
               }

               this.b();
               this.id_break(new vS_2());
               System.gc();
               ((Logger)id_break[id_protected[195]]).fatal(id_throws[21], var8);
               var1 = id_case[21];
            }
         }
      } catch (KU var9) {
         this.id_class(var9.id_class());
         this.b();
         ((Logger)id_break[1]).fatal("Reported exception thrown!", var9);
         id_byte(var9.id_class());
      } catch (Throwable var10) {
         KY var2 = this.id_class(new KY("Unexpected error", var10));
         ((Logger)id_break[1]).fatal("Unreported exception thrown!", var10);
         this.b();
         id_byte(var2);
      }
   }

   public QY(Qy_1 var1) {
      super("Client");
      this.j();
      rqw_3 var13 = new rqw_3(20.0F, 0L);
      this.id_class[6] = var13;
      gJ_2 var14 = new gJ_2();
      this.id_class[13] = var14;
      AtomicReference var15 = new AtomicReference();
      this.id_class[18] = var15;
      rpN_2 var16 = new rpN_2();
      this.id_class[29] = var16;
      QU var17 = new QU(this);
      this.id_class[53] = var17;
      Long var18 = rqR_2.id_byte();
      this.id_class[69] = var18;
      Boolean var19 = true;
      this.id_class[77] = var19;
      String var20 = "";
      this.id_class[79] = var20;
      Boolean var21 = true;
      this.id_class[82] = var21;
      ConcurrentLinkedQueue var22 = Queues.newConcurrentLinkedQueue();
      this.id_class[84] = var22;
      String var23 = "root";
      this.id_class[86] = var23;
      id_break[0] = this;
      File var25 = var1.id_byte.id_class;
      this.id_class[24] = var25;
      File var2 = var1.id_byte.id_byte;
      File var26 = var1.id_byte.id_break;
      this.id_class[0] = var26;
      String var27 = var1.id_protected.id_break;
      this.id_class[25] = var27;
      String var28 = var1.id_protected.id_byte;
      this.id_class[26] = var28;
      PropertyMap var29 = var1.id_class.id_byte;
      this.id_class[1] = var29;
      jy_3 var30 = new jy_3(new File((File)this.id_class[24], "server-resource-packs"), var1.id_byte.id_class());
      this.id_class[35] = var30;
      rAt_1 var31 = new rAt_1(QY::id_class, (jy_3)this.id_class[35], new rAz_1((File)this.id_class[0], rAZ.id_class));
      this.id_class[36] = var31;
      Proxy var32 = var1.id_class.id_protected;
      this.id_class[27] = var32;
      YggdrasilAuthenticationService var3 = new YggdrasilAuthenticationService((Proxy)this.id_class[27]);
      MinecraftSessionService var33 = var3.createMinecraftSessionService();
      this.id_class[46] = var33;
      UserApiService var34 = this.id_class(var3, var1);
      this.id_class[47] = var34;
      rqN_2 var35 = var1.id_class.id_class;
      this.id_class[14] = var35;
      ((Logger)id_break[1]).info("Setting user: {}", ((rqN_2)this.id_class[14]).id_byte());
      ((Logger)id_break[1]).debug("(Session ID is {})", ((rqN_2)this.id_class[14]).id_class());
      Boolean var36 = var1.id_protected.id_class;
      this.id_class[31] = var36;
      Boolean var37 = !var1.id_protected.id_protected ? true : id_case[5];
      this.id_class[32] = var37;
      Boolean var38 = !var1.id_protected.id_throws ? true : id_case[7];
      this.id_class[33] = var38;
      Boolean var39 = e();
      this.id_class[30] = var39;
      Object var40 = null;
      this.id_class[58] = var40;
      String var4;
      int var5;
      if (this.J() && var1.id_throws.id_class != null) {
         var4 = var1.id_throws.id_class;
         var5 = var1.id_throws.id_break;
      } else {
         var4 = null;
         var5 = 0;
      }

      rgh_3.id_class(Vu_1::id_class);
      DataFixer var41 = rTu_1.id_class();
      this.id_class[3] = var41;
      Thread var42 = Thread.currentThread();
      this.id_class[76] = var42;
      Qw_1 var43 = new Qw_1(this, (File)this.id_class[24]);
      this.id_class[20] = var43;
      Vk_1 var44 = new Vk_1((File)this.id_class[24], (DataFixer)this.id_class[3]);
      this.id_class[21] = var44;
      ((Logger)id_break[1]).info("Backend library: {}", RenderSystem.getBackendDescription());
      ys_3 var6;
      if (((Qw_1)this.id_class[20]).id_this > 0 && ((Qw_1)this.id_class[20]).id_super > 0) {
         var6 = new ys_3(
            ((Qw_1)this.id_class[20]).id_super, ((Qw_1)this.id_class[20]).id_this, var1.id_break.id_byte, var1.id_break.id_protected, var1.id_break.id_throws
         );
      } else {
         var6 = var1.id_break;
      }

      rqR_2.id_class = RenderSystem.initBackendSystem();
      yh_3 var45 = new yh_3(this);
      this.id_class[4] = var45;
      Qg_1 var46 = ((yh_3)this.id_class[4]).id_class(var6, ((Qw_1)this.id_class[20]).id_final, this.C());
      this.id_class[5] = var46;
      this.id_class(true);

      try {
         InputStream var7 = this.Z().id_class().id_class(rAI.CLIENT_RESOURCES, new rqO_2(id_throws[7]));
         InputStream var8 = this.Z().id_class().id_class(rAI.CLIENT_RESOURCES, new rqO_2(id_throws[8]));
         ((Qg_1)this.id_class[id_protected[52]]).id_class(var7, var8);
      } catch (IOException var77) {
         ((Logger)id_break[1]).error("Couldn't set icon", var77);
      }

      ((Qg_1)this.id_class[5]).id_class(((Qw_1)this.id_class[20]).id_protected);
      Qi_1 var47 = new Qi_1(this);
      this.id_class[22] = var47;
      ((Qi_1)this.id_class[22]).id_class(((Qg_1)this.id_class[5]).id_implements());
      Qj_1 var48 = new Qj_1(this);
      this.id_class[23] = var48;
      ((Qj_1)this.id_class[23]).id_class(((Qg_1)this.id_class[5]).id_implements());
      RenderSystem.initRenderer(((Qw_1)this.id_class[20]).id_void, false);
      VC var49 = new VC(((Qg_1)this.id_class[5]).id_extends(), ((Qg_1)this.id_class[5]).id_native(), true, (Boolean)id_break[2]);
      this.id_class[40] = var49;
      ((VC)this.id_class[40]).id_class(0.0F, 0.0F, 0.0F, 0.0F);
      rAj_1 var50 = new rAj_1(rAI.CLIENT_RESOURCES);
      this.id_class[34] = var50;
      ((rAt_1)this.id_class[36]).id_class();
      ((Qw_1)this.id_class[20]).id_class((rAt_1)this.id_class[36]);
      jV_2 var51 = new jV_2(((Qw_1)this.id_class[20]).rG);
      this.id_class[37] = var51;
      ((rAv_1)this.id_class[34]).id_class((jV_2)this.id_class[37]);
      fY_2 var52 = new fY_2((rAv_1)this.id_class[34]);
      this.id_class[2] = var52;
      ((rAv_1)this.id_class[34]).id_class((fY_2)this.id_class[2]);
      SkinProvider var53 = new SkinProvider((fY_2)this.id_class[2], new File(var2, "skins"), (MinecraftSessionService)this.id_class[46]);
      this.id_class[48] = var53;
      rrGd_1 var54 = new rrGd_1(
         ((File)this.id_class[24]).toPath().resolve("saves"), ((File)this.id_class[24]).toPath().resolve("backups"), (DataFixer)this.id_class[3]
      );
      this.id_class[28] = var54;
      Nf_1 var55 = new Nf_1((rAv_1)this.id_class[34], (Qw_1)this.id_class[20]);
      this.id_class[41] = var55;
      ((rAv_1)this.id_class[34]).id_class((Nf_1)this.id_class[41]);
      gW_2 var56 = new gW_2((rqN_2)this.id_class[14]);
      this.id_class[44] = var56;
      ((rAv_1)this.id_class[34]).id_class((gW_2)this.id_class[44]);
      NL var57 = new NL(this);
      this.id_class[42] = var57;
      ub_3 var58 = new ub_3((fY_2)this.id_class[2]);
      this.id_class[43] = var58;
      cm_3 var59 = ((ub_3)this.id_class[43]).id_class();
      this.id_class[15] = var59;
      ((rAv_1)this.id_class[34]).id_class(((ub_3)this.id_class[43]).id_break());
      this.id_byte(this.id_continue());
      ((rAv_1)this.id_class[34]).id_class(new jw_3());
      ((rAv_1)this.id_class[34]).id_class(new jt_3());
      ((Qg_1)this.id_class[5]).id_class("Startup");
      RenderSystem.setupDefaultState(0, 0, ((Qg_1)this.id_class[5]).id_extends(), ((Qg_1)this.id_class[5]).id_native());
      ((Qg_1)this.id_class[5]).id_class("Post startup");
      yC_2 var60 = yC_2.id_class();
      this.id_class[38] = var60;
      yq_3 var61 = yq_3.id_class((yC_2)this.id_class[38]);
      this.id_class[39] = var61;
      Ip_1 var62 = new Ip_1((fY_2)this.id_class[2], (yC_2)this.id_class[38], ((Qw_1)this.id_class[20]).id_instanceof);
      this.id_class[49] = var62;
      ((rAv_1)this.id_class[34]).id_class((Ip_1)this.id_class[49]);
      Hz_1 var63 = new Hz_1((fY_2)this.id_class[2], (Ip_1)this.id_class[49], (yq_3)this.id_class[39]);
      this.id_class[10] = var63;
      pg_3 var64 = new pg_3((fY_2)this.id_class[2], (Hz_1)this.id_class[10], (rAv_1)this.id_class[34], (cm_3)this.id_class[15], (Qw_1)this.id_class[20]);
      this.id_class[9] = var64;
      HB var65 = new HB(this);
      this.id_class[11] = var65;
      ((rAv_1)this.id_class[34]).id_class((Hz_1)this.id_class[10]);
      yB_2 var66 = new yB_2();
      this.id_class[7] = var66;
      Hh_1 var67 = new Hh_1(this, (rAv_1)this.id_class[34], (yB_2)this.id_class[7]);
      this.id_class[16] = var67;
      ((rAv_1)this.id_class[34]).id_class((Hh_1)this.id_class[16]);
      FU var68 = new FU(this, (UserApiService)this.id_class[47]);
      this.id_class[54] = var68;
      lo_3 var69 = new lo_3(((Ip_1)this.id_class[49]).id_byte(), (yC_2)this.id_class[38]);
      this.id_class[50] = var69;
      ((rAv_1)this.id_class[34]).id_class((lo_3)this.id_class[50]);
      yX_2 var70 = new yX_2(this, (yB_2)this.id_class[7]);
      this.id_class[8] = var70;
      ((rAv_1)this.id_class[34]).id_class((yX_2)this.id_class[8]);
      this.U();
      ((rAv_1)this.id_class[34]).id_class((gJ_2)this.id_class[13]);
      Cy_1 var71 = new Cy_1((gm_3)this.id_class[56], (fY_2)this.id_class[2]);
      this.id_class[12] = var71;
      ((rAv_1)this.id_class[34]).id_class((Cy_1)this.id_class[12]);
      fv_3 var72 = new fv_3((fY_2)this.id_class[2]);
      this.id_class[51] = var72;
      ((rAv_1)this.id_class[34]).id_class((fv_3)this.id_class[51]);
      fC_2 var73 = new fC_2((fY_2)this.id_class[2]);
      this.id_class[52] = var73;
      ((rAv_1)this.id_class[34]).id_class((fC_2)this.id_class[52]);
      HM var74 = new HM();
      this.id_class[45] = var74;
      ((rAv_1)this.id_class[34]).id_class((HM)this.id_class[45]);
      cq_3 var75 = new cq_3(this);
      this.id_class[19] = var75;
      yK_2 var76 = new yK_2(this);
      this.id_class[17] = var76;
      RenderSystem.setErrorCallback(this::id_class);
      if (((Qw_1)this.id_class[20]).s && !((Qg_1)this.id_class[5]).id_finally()) {
         ((Qg_1)this.id_class[5]).id_private();
         ((Qw_1)this.id_class[20]).s = ((Qg_1)this.id_class[5]).id_finally();
      }

      ((Qg_1)this.id_class[5]).id_class(((Qw_1)this.id_class[20]).id_strictfp);
      ((Qg_1)this.id_class[5]).id_break(((Qw_1)this.id_class[20]).id_float);
      ((Qg_1)this.id_class[5]).id_byte();
      this.v();
      if (var4 != null) {
         this.id_break(new mt_3(new rrvL(), this, var4, var5));
      } else {
         this.id_break(new rrvL(true));
      }

      cj_3.id_class(this);
      List var78 = ((rAt_1)this.id_class[36]).id_case();
      this.id_class(
         new cj_3(
            this,
            ((rAv_1)this.id_class[34]).id_class(rqR_2.id_case(), this, (CompletableFuture<rqg_3>)id_break[5], var78),
            var1x -> rqR_2.id_class(var1x, this::id_class, () -> {
                  if (rqu_3.id_byte) {
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
      return (VC)this.id_class[40];
   }

   private String C() {
      StringBuilder var1 = new StringBuilder();
      var1.append("Celestial Client");
      var1.append(" - Build: ");
      var1.append("1.1");
      var1.append(" (");
      var1.append(((rrZr_1)rrQJ.id_class[5]).id_protected());
      var1.append(")");
      return var1.toString();
   }

   private static void D() {
      id_byte = new byte[]{
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
      return (rAv_1)this.id_class[34];
   }

   public boolean J() {
      return true;
   }

   public Ak_1 S() {
      this.j();
      return (Ak_1)this.id_class[59];
   }

   public jy_3 Z() {
      this.j();
      return (jy_3)this.id_class[35];
   }

   private void V() {
      if (!((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_case()) {
         this.G();
      } else {
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(new rrLP());
      }
   }

   public rng_3 id_this() {
      this.j();
      return (rng_3)this.id_class[58];
   }

   private static boolean e() {
      String[] var0 = new String[]{"sun.arch.data.model", "com.ibm.vm.bitmode", "os.arch"};

      for (String var4 : var0) {
         String var5 = System.getProperty(var4);
         if (var5 != null && var5.contains("64")) {
            return true;
         }
      }

      return id_case[27];
   }

   private static void i() {
      id_implements = new long[]{0L, 1000L, 1000L, 16L, 0L, 0L, 0L};
   }

   public void b() {
      this.j();

      try {
         byte[] var6 = new byte[id_case[46]];
         id_break[id_protected[348]] = var6;
         ((yX_2)this.id_class[id_protected[349]]).id_extends();
      } catch (Throwable var8) {
      }

      try {
         System.gc();
         if ((Boolean)this.id_class[id_protected[350]] && (rng_3)this.id_class[id_protected[351]] != null) {
            ((rng_3)this.id_class[id_protected[352]]).id_class(id_case[47]);
         }

         this.id_byte(new ZE(new rgn_3(id_throws[49])));
      } catch (Throwable var7) {
      }

      System.gc();
   }

   public CompletableFuture<Void> x() {
      return this.id_class(this::id_private).thenCompose(var0 -> (CompletionStage<Void>)var0);
   }

   public yC_2 s() {
      this.j();
      return (yC_2)this.id_class[38];
   }

   public Nf_1 c() {
      this.j();
      return (Nf_1)this.id_class[41];
   }

   public File h() {
      this.j();
      return (File)this.id_class[0];
   }

   private void f() {
      this.j();

      for (; ((Qw_1)this.id_class[20]).C.id_case(); ((yX_2)this.id_class[8]).id_volatile()) {
         VZ var1 = ((Qw_1)this.id_class[20]).id_volatile();
         ((Qw_1)this.id_class[20]).id_class(((Qw_1)this.id_class[20]).id_volatile().id_byte());
         if (var1.id_class() != ((Qw_1)this.id_class[20]).id_volatile().id_class()) {
            ((Hh_1)this.id_class[16]).id_class(((Qw_1)this.id_class[20]).id_volatile().id_class() ? this.id_catch() : null);
         }
      }

      while (((Qw_1)this.id_class[20]).H.id_case()) {
         ((Qw_1)this.id_class[20]).D = !((Qw_1)this.id_class[20]).D ? true : id_case[66];
      }

      for (int var4 = id_case[67]; var4 < 9; var4++) {
         boolean var2 = ((Qw_1)this.id_class[20]).w.id_protected();
         boolean var3 = ((Qw_1)this.id_class[20]).I.id_protected();
         if (((Qw_1)this.id_class[20]).t[var4].id_case()) {
            if (((cb_3)this.id_class[57]).id_native()) {
               ((cq_3)this.id_class[19]).id_private().id_break(var4);
            } else if (((cb_3)this.id_class[57]).id_implements() && (vm_3)this.id_class[73] == null && (var3 || var2)) {
               Fv_1.id_class(this, var4, var3, var2);
            } else {
               ((rhz_3)((cb_3)this.id_class[57]).id_implements[1]).id_protected = var4;
            }
         }
      }

      while (((Qw_1)this.id_class[20]).A.id_case()) {
         if (!this.H()) {
            ((cb_3)this.id_class[57]).id_class((rgP_2)id_break[6], true);
         } else {
            this.id_break(new Fe_1());
         }
      }

      while (((Qw_1)this.id_class[20]).z.id_case()) {
         if (((Ax_1)this.id_class[55]).id_implements()) {
            ((cb_3)this.id_class[57]).id_else();
         } else {
            this.id_break(new FH((cb_3)this.id_class[57]));
         }
      }

      while (((Qw_1)this.id_class[20]).q.id_case()) {
         this.id_break(new ca_3(((Aq_1)((cb_3)this.id_class[57]).id_break[0]).id_private()));
      }

      while (((Qw_1)this.id_class[20]).Q.id_case()) {
         if (!((cb_3)this.id_class[57]).id_native()) {
            this.id_void().id_class(new rZb_1(rZM.SWAP_ITEM_WITH_OFFHAND, rfH_2.id_protected, rpr_3.DOWN));
         }
      }

      while (((Qw_1)this.id_class[20]).N.id_case()) {
         if (!((cb_3)this.id_class[57]).id_native() && ((cb_3)this.id_class[57]).id_protected(vm_3.id_else())) {
            ((cb_3)this.id_class[57]).id_class(rpm_3.MAIN_HAND, false);
         }
      }

      boolean var5 = ((Qw_1)this.id_class[20]).id_finally != rhJ_2.HIDDEN ? true : id_case[71];
      if (var5) {
         while (((Qw_1)this.id_class[20]).v.id_case()) {
            this.id_byte("");
         }

         if ((vm_3)this.id_class[73] == null && (cT_2)this.id_class[75] == null && ((Qw_1)this.id_class[20]).L.id_case()) {
            this.id_byte("/");
         }
      }

      if (((cb_3)this.id_class[57]).id_return()) {
         if (!((Qw_1)this.id_class[20]).u.id_protected()) {
            ((Ax_1)this.id_class[55]).id_break((cb_3)this.id_class[57]);
         }

         while (((Qw_1)this.id_class[20]).m.id_case()) {
         }

         while (((Qw_1)this.id_class[20]).u.id_case()) {
         }

         while (((Qw_1)this.id_class[20]).Z.id_case()) {
         }
      } else {
         while (((Qw_1)this.id_class[20]).m.id_case()) {
            this.z();
         }

         while (((Qw_1)this.id_class[20]).u.id_case()) {
            this.id_for();
         }

         while (((Qw_1)this.id_class[20]).Z.id_case()) {
            this.K();
         }
      }

      if (((Qw_1)this.id_class[20]).u.id_protected() && (Integer)this.id_class[65] == 0 && !((cb_3)this.id_class[57]).id_return()) {
         this.id_for();
      }

      this.id_protected(
         (vm_3)this.id_class[73] == null && ((Qw_1)this.id_class[20]).m.id_protected() && ((Qi_1)this.id_class[22]).id_case() ? true : id_case[73]
      );
   }

   private static void l() {
      id_case = new boolean[]{
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
      return ((Qw_1)((QY)id_break[0]).id_class[20]).id_case.id_class() >= VW.FABULOUS.id_class() ? true : id_case[98];
   }

   private static void a() {
      id_catch = new int[]{10485760};
   }

   public yB_2 id_interface() {
      this.j();
      return (yB_2)this.id_class[7];
   }

   private void id_class(String var1, rVv_1 var2, Function<rrGk_1, rTH> var3, Function4<rrGk_1, rVv_1, rAL, rTH, rrGP> var4, boolean var5, QD var6) {
      this.j();

      rrGk_1 var7;
      try {
         var7 = ((rrGd_1)this.id_class[id_protected[558]]).id_byte(var1);
      } catch (IOException var28) {
         ((Logger)id_break[1]).warn("Failed to read level {} data", var1, var28);
         this.id_break(null);
         return;
      }

      QK var8;
      try {
         var8 = this.id_class(var2, var3, var4, var5, var7);
      } catch (Exception var27) {
         ((Logger)id_break[1]).warn("Failed to load datapacks, can't proceed with server load", var27);
         this.id_break(new ZB(() -> this.id_class(var1, var2, var3, var4, true, var6)));

         try {
            var7.close();
         } catch (IOException var23) {
            ((Logger)id_break[1]).warn("Failed to unlock access to level {}", var1, var23);
         }

         return;
      }

      rrGP var9 = var8.id_byte();
      boolean var10 = var9.id_long().id_implements();
      boolean var11 = var9.id_float() != Lifecycle.stable() ? true : id_case[77];
      if (var6 == (QD)QD.staticFields25f7c1a34dee3bdaa6c7082af054c49d[0] || !var10 && !var11) {
         this.id_transient();
         ((AtomicReference)this.id_class[18]).set(null);

         try {
            var7.id_class(var2, var9);
            var8.id_break().id_implements();
            YggdrasilAuthenticationService var12 = new YggdrasilAuthenticationService((Proxy)this.id_class[id_protected[564]]);
            MinecraftSessionService var30 = var12.createMinecraftSessionService();
            GameProfileRepository var32 = var12.createProfileRepository();
            rCB var15 = new rCB(var32, new File((File)this.id_class[id_protected[565]], rnW_2.id_class.getName()));
            rys_3.id_class(var15);
            rys_3.id_class(var30);
            rCB.id_class(id_case[78]);
            rng_3 var20 = rnW_2.id_class(
               (Function<Thread, rng_3>)(var8x -> new rng_3(var8x, this, var2, var7, var8.id_class(), var8.id_break(), var9, var30, var32, var15, var1xx -> {
                     this.j();
                     row_3 var2xx = new row_3(var1xx);
                     var2xx.id_break();
                     ((AtomicReference)this.id_class[18]).set(var2xx);
                     return new rop_3(var2xx, ((Queue)this.id_class[84])::add);
                  }))
            );
            this.id_class[id_protected[566]] = var20;
            Boolean var21 = id_case[79];
            this.id_class[id_protected[567]] = var21;
         } catch (Throwable var26) {
            KY var13 = KY.id_class(var26, "Starting integrated server");
            Ko_1 var14 = var13.id_class("Starting integrated server");
            var14.id_class("Level ID", var1);
            var14.id_class("Level Name", var9.id_volatile());
            throw new KU(var13);
         }

         while (((AtomicReference)this.id_class[18]).get() == null) {
            Thread.yield();
         }

         vo_3 var29 = new vo_3((row_3)((AtomicReference)this.id_class[18]).get());
         this.id_break(var29);

         while (!((rng_3)this.id_class[58]).W()) {
            var29.id_private();
            this.id_throws(false);

            try {
               Thread.sleep(id_implements[3]);
            } catch (InterruptedException var25) {
            }

            if ((KY)this.id_class[78] != null) {
               id_byte((KY)this.id_class[78]);
               return;
            }
         }

         SocketAddress var31 = ((rng_3)this.id_class[58]).k().id_class();
         rud_3 var33 = rud_3.id_class(var31);
         var33.id_class(new Al_1(var33, this, null, var0 -> {
         }));
         var33.id_class(new rmJ_2(var31.toString(), 0, ruv_3.LOGIN));
         var33.id_class(new rmu_3(this.id_while().id_throws()));
         this.id_class[60] = var33;
      } else {
         this.id_class(var6, var1, var10, () -> this.id_class(var1, var2, var3, var4, var5, (QD)QD.staticFields25f7c1a34dee3bdaa6c7082af054c49d[0]));
         var8.close();

         try {
            var7.close();
         } catch (IOException var24) {
            ((Logger)id_break[1]).warn("Failed to unlock access to level {}", var1, var24);
         }
      }
   }

   private void id_class(int var1, long var2) {
      this.j();
      ((Qw_1)this.id_class[20]).id_strictfp = false;
      ((Qw_1)this.id_class[20]).id_break();
   }

   private rdn_3 id_class(rdn_3 var1, ryO_2 var2) {
      rcd_3 var3 = var2.id_class(new rcd_3());
      if (var1.id_break() instanceof rkG_2 && var3.id_throws("SkullOwner")) {
         rcd_3 var6 = var3.id_int("SkullOwner");
         var1.id_int().id_class("SkullOwner", var6);
         return var1;
      } else {
         var1.id_class("BlockEntityTag", var3);
         rcd_3 var4 = new rcd_3();
         rcy_3 var5 = new rcy_3();
         var5.add(rca_3.id_class("\"(+NBT)\""));
         var4.id_class("Lore", var5);
         var1.id_class("display", var4);
         return var1;
      }
   }

   private void id_class(QD var1, String var2, boolean var3, Runnable var4) {
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

         this.id_break(new my_3(null, (var3x, var4x) -> {
            this.j();
            if (var3x) {
               ZA.id_class((rrGd_1)this.id_class[28], var2);
            }

            var4.run();
         }, var5, var6, false));
      } else {
         this.id_break(new mT_2(var3x -> {
            this.j();
            if (var3x) {
               var4.run();
            } else {
               this.id_break(null);

               try (rrGk_1 var4x = ((rrGd_1)this.id_class[id_protected[733]]).id_byte(var2)) {
                  var4x.id_catch();
               } catch (IOException var9) {
                  ((Logger)id_break[1]).error("Failed to delete world {}", var2, var9);
               }
            }
         }, new rgn_3("selectWorld.backupQuestion.experimental"), new rgn_3("selectWorld.backupWarning.experimental"), cN_2.id_catch, cN_2.id_protected));
      }
   }

   public void id_class(String var1, rYE var2, rVv_1 var3, rrSp_1 var4) {
      this.id_class(
         var1,
         var3,
         var1x -> var2.id_catch(),
         (var3x, var4x, var5, var6) -> {
            rVp_1 var7 = rVp_1.id_class(JsonOps.INSTANCE, var3);
            rVq_1 var8 = rVq_1.id_class(JsonOps.INSTANCE, var5, var3);
            DataResult var9 = rrSp_1.id_class.encodeStart(var7, var4).setLifecycle(Lifecycle.stable()).flatMap(var1xx -> rrSp_1.id_class.parse(var8, var1xx));
            rrSp_1 var10 = var9.resultOrPartial(rqR_2.id_class("Error reading worldgen settings after loading data packs: ", ((Logger)id_break[1])::error))
               .orElse(var4);
            return new rrGQ(var2, var10, var9.lifecycle());
         },
         false,
         (QD)QD.staticFields25f7c1a34dee3bdaa6c7082af054c49d[1]
      );
   }

   public void id_class(Qw_1 var1) {
      this.j();
      this.id_class[20] = var1;
   }

   public void id_class(Ak_1 var1) {
      this.j();
      this.id_class[59] = var1;
      rrfp_3.id_class[0] = var1;
   }

   public void id_class(Throwable var1, rgP_2 var2) {
      this.j();
      ((Logger)id_break[1]).info("Caught error loading resourcepacks, removing all selected resourcepacks", var1);
      ((rAt_1)this.id_class[36]).id_class(Collections.emptyList());
      ((Qw_1)this.id_class[20]).id_private.clear();
      ((Qw_1)this.id_class[20]).id_implements.clear();
      ((Qw_1)this.id_class[20]).id_break();
      this.id_private().thenRun(() -> {
      });
   }

   public <T> Vo_1<T> id_class(gx_3<T> var1) {
      this.j();
      return ((gJ_2)this.id_class[13]).id_class(var1);
   }

   public void id_class(cq_3 var1) {
      this.j();
      this.id_class[19] = var1;
   }

   public void id_class(rqN_2 var1) {
      this.j();
      this.id_class[14] = var1;
   }

   private static rAp_1 id_class(String var0, boolean var1, Supplier<rAC> var2, rAC var3, rAK var4, rAT var5, rAZ var6) {
      int var7 = var4.id_break();
      Supplier var8 = var2;
      if (var7 <= 3) {
         var8 = id_protected(var2);
      }

      if (var7 <= 4) {
         var8 = id_break(var8);
      }

      return new rAp_1(var0, var1, var8, var3, var4, var5, var6);
   }

   public static void id_class(jV_2 var0, String var1, Qw_1 var2, KY var3) {
      Ko_1 var4 = var3.id_case();
      var4.id_class("Launched Version", () -> var1);
      var4.id_class("Backend library", RenderSystem::getBackendDescription);
      var4.id_class("Backend API", RenderSystem::getApiDescription);
      var4.id_class("GL Caps", RenderSystem::getCapsString);
      var4.id_class("Using VBOs", () -> "Yes");
      var4.id_class("Is Modded", () -> {
         String var0x = Qn_1.id_class();
         if (!"vanilla".equals(var0x)) {
            return "Definitely; Client brand changed to '" + var0x + "'";
         } else {
            return QY.class.getSigners() == null ? "Very likely; Jar signature invalidated" : id_throws[107];
         }
      });
      var4.id_class("Type", "Client (map_client.txt)");
      if (var2 != null) {
         if ((QY)id_break[0] != null) {
            String var5 = ((QY)id_break[0]).id_new().id_volatile();
            if (var5 != null) {
               var4.id_class("GPU Warnings", var5);
            }
         }

         var4.id_class("Graphics mode", var2.id_case);
         var4.id_class("Resource Packs", () -> {
            StringBuilder var1x = new StringBuilder();

            for (String var3x : var2.id_private) {
               if (var1x.length() > 0) {
                  var1x.append(", ");
               }

               var1x.append(var3x);
               if (var2.id_implements.contains(var3x)) {
                  var1x.append(" (incompatible)");
               }
            }

            return var1x.toString();
         });
      }

      if (var0 != null) {
         var4.id_class("Current Language", () -> var0.id_break().toString());
      }

      var4.id_class("CPU", Oh_1::id_break);
   }

   public static rTH id_class(rrGk_1 var0) {
      rnW_2.id_class(var0);
      rTH var1 = var0.id_throws();
      if (var1 == null) {
         throw new IllegalStateException("Failed to load data pack config");
      } else {
         return var1;
      }
   }

   public boolean id_class(an_3 var1) {
      this.j();
      return !var1.w()
            && (
               (cb_3)this.id_class[57] == null || !((cb_3)this.id_class[57]).id_native() || !((Qw_1)this.id_class[20]).p.id_protected() || var1.BC() != aI_2.rM
            )
         ? id_case[105]
         : id_case[104];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 103904214521924696L;
   }

   public void id_class(gm_3 var1) {
      this.j();
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).id_break(var1);
      vY_2 var2 = new vY_2();
      var2.id_break(new rgn_3("connect.joining"));
      this.id_protected(var2);
      this.id_class[56] = var1;
      this.id_break(var1);
      if (!(Boolean)this.id_class[61]) {
         YggdrasilAuthenticationService var3 = new YggdrasilAuthenticationService((Proxy)this.id_class[27]);
         MinecraftSessionService var4 = var3.createMinecraftSessionService();
         GameProfileRepository var5 = var3.createProfileRepository();
         rCB var6 = new rCB(var5, new File((File)this.id_class[24], rnW_2.id_class.getName()));
         rys_3.id_class(var6);
         rys_3.id_class(var4);
         rCB.id_class(false);
      }

      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).id_class(var1);
   }

   public Function<rqO_2, fj_3> id_class(rqO_2 var1) {
      this.j();
      return ((Ip_1)this.id_class[49]).id_class(var1)::id_break;
   }

   private UserApiService id_class(YggdrasilAuthenticationService var1, Qy_1 var2) {
      try {
         return var1.createUserApiService(var2.id_class.id_class.id_protected());
      } catch (AuthenticationException var4) {
         return UserApiService.OFFLINE;
      }
   }

   public String id_class() {
      this.j();
      return (String)this.id_class[25];
   }

   public void id_class(Qg_1 var1) {
      this.j();
      this.id_class[5] = var1;
   }

   @Override
   public void id_class(boolean var1) {
      this.j();
      Boolean var6 = var1;
      this.id_class[83] = var6;
   }

   public void id_class(vm_3 var1) {
      this.id_break(var1);
      this.id_throws(false);
   }

   public boolean id_class(UUID var1) {
      this.j();
      if (this.id_final()) {
         return ((FU)this.id_class[54]).id_byte(var1);
      } else {
         return ((cb_3)this.id_class[57] == null || !var1.equals(((cb_3)this.id_class[57]).ro())) && !var1.equals(rqR_2.id_break) ? true : id_case[92];
      }
   }

   public void id_class(Runnable var1) {
      ((ConcurrentLinkedQueue)id_break[7]).add(var1);
   }

   public KY id_class(KY var1) {
      this.j();
      id_class((jV_2)this.id_class[37], (String)this.id_class[25], (Qw_1)this.id_class[20], var1);
      if ((gm_3)this.id_class[56] != null) {
         ((gm_3)this.id_class[56]).id_class(var1);
      }

      return var1;
   }

   public void id_class(cT_2 var1) {
      this.j();
      this.id_class[75] = var1;
   }

   public QK id_class(rVv_1 var1, Function<rrGk_1, rTH> var2, Function4<rrGk_1, rVv_1, rAL, rTH, rrGP> var3, boolean var4, rrGk_1 var5) throws ExecutionException, InterruptedException {
      rTH var6 = (rTH)var2.apply(var5);
      rAt_1 var7 = new rAt_1(new rAf_1(), new rAz_1(var5.id_class(rrGr_1.id_catch).toFile(), rAZ.id_byte));

      try {
         rTH var8 = rnW_2.id_class(var7, var6, var4);
         CompletableFuture var9 = rAh_1.id_class(var7.id_case(), gq_3.INTEGRATED, id_byte[18], rqR_2.id_case(), this);
         this.id_byte(var9::isDone);
         rAh_1 var10 = (rAh_1)var9.get();
         rrGP var11 = (rrGP)var3.apply(var5, var1, var10.id_private(), var8);
         return new QK(var7, var10, var11);
      } catch (InterruptedException | ExecutionException var12) {
         var7.close();
         throw var12;
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{57, -97, -33, 29, -1, -79, -69, 69}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void id_class(int var1) {
      this.j();
      Integer var6 = var1;
      this.id_class[65] = var6;
   }

   private void id_class(Throwable var1) {
      this.j();
      if (((rAt_1)this.id_class[36]).id_protected().size() > 1) {
         rgN_2 var2;
         if (var1 instanceof rAV) {
            var2 = new rgN_2(((rAV)var1).id_class().id_class());
         } else {
            var2 = null;
         }

         this.id_class(var1, var2);
      } else {
         rqR_2.id_break(var1);
      }
   }

   public static rrGP id_class(rrGk_1 var0, rVv_1 var1, rAL var2, rTH var3) {
      rVq_1 var4 = rVq_1.id_class(rcf_3.id_class, var2, var1);
      rrGP var5 = var0.id_class(var4, var3);
      if (var5 == null) {
         throw new IllegalStateException("Failed to load world");
      } else {
         return var5;
      }
   }

   public void m() {
      this.j();

      try {
         ((Logger)id_break[id_protected[244]]).info(id_throws[37]);

         try {
            if ((gm_3)this.id_class[id_protected[245]] != null) {
               ((gm_3)this.id_class[id_protected[246]]).id_catch();
            }

            this.id_transient();
         } catch (Throwable var5) {
         }

         if ((vm_3)this.id_class[id_protected[247]] != null) {
            ((vm_3)this.id_class[id_protected[248]]).w_();
            ((vm_3)this.id_class[id_protected[249]]).id_this();
         }

         this.close();
      } finally {
         rqR_2.id_class = System::nanoTime;
         if ((KY)this.id_class[78] == null) {
            System.exit(0);
         }
      }
   }

   private static void p() {
      id_throws = new String[]{
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
      return (rpN_2)this.id_class[29];
   }

   public float id_default() {
      this.j();
      return ((rqw_3)this.id_class[6]).id_break;
   }

   @Override
   public void v() {
      this.j();
      int var1 = ((Qg_1)this.id_class[5]).id_class(((Qw_1)this.id_class[20]).rs, this.id_continue());
      ((Qg_1)this.id_class[5]).id_class((double)var1);
      VC var2 = this.B();
      var2.id_class(((Qg_1)this.id_class[5]).id_extends(), ((Qg_1)this.id_class[5]).id_native(), (Boolean)id_break[2]);
      ((Hh_1)this.id_class[16]).id_class(((Qg_1)this.id_class[5]).id_extends(), ((Qg_1)this.id_class[5]).id_native());
      ((Qi_1)this.id_class[22]).id_throws();
      if ((vm_3)this.id_class[73] != null) {
         ((vm_3)this.id_class[73]).id_class(this, ((Qg_1)this.id_class[5]).id_super(), ((Qg_1)this.id_class[5]).id_this());
      }
   }

   private void j() {
      if (this.id_class == null) {
         this.id_class = new Object[88];
         this.id_class[30] = false;
         this.id_class[31] = false;
         this.id_class[32] = false;
         this.id_class[33] = false;
         this.id_class[61] = false;
         this.id_class[65] = 0;
         this.id_class[66] = 0;
         this.id_class[67] = false;
         this.id_class[68] = 0.0F;
         this.id_class[69] = 0L;
         this.id_class[70] = 0L;
         this.id_class[71] = 0;
         this.id_class[72] = false;
         this.id_class[77] = false;
         this.id_class[80] = false;
         this.id_class[81] = false;
         this.id_class[82] = false;
         this.id_class[83] = false;
         this.id_class[87] = 0L;
      }
   }

   private static void q() {
      id_protected = new short[]{
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
         var0 -> var0.id_class(null, VU.NORMAL)
               .stream()
               .map(var0x -> rgF_2.id_class(var0x.getString()).trim())
               .filter(var0x -> !var0x.isEmpty() ? true : id_case[115]),
         var0 -> Stream.of(rVL.id_for.id_break(var0.id_break()))
      );
      gd_3 var2 = new gd_3<>(var0 -> rlc_3.id_class().id_class(var0.id_break()).stream());
      rqs_3 var3 = rqs_3.id_class();

      for (rdb_3 var5 : rVL.id_for) {
         var5.id_class(rdX_2.id_catch, var3);
      }

      var3.forEach(var2x -> {
         var1.id_class(var2x);
         var2.id_class(var2x);
      });
      gh_3 var6 = new gh_3<>(
         var0 -> var0.id_protected()
               .stream()
               .flatMap(var0x -> var0x.id_byte().id_class(null, VU.NORMAL).stream())
               .map(var0x -> rgF_2.id_class(var0x.getString()).trim())
               .filter(var0x -> !var0x.isEmpty() ? true : id_case[113]),
         var0 -> var0.id_protected().stream().map(var0x -> rVL.id_for.id_break(var0x.id_byte().id_break()))
      );
      ((gJ_2)this.id_class[13]).id_class(gJ_2.id_class, var1);
      ((gJ_2)this.id_class[13]).id_class(gJ_2.id_break, var2);
      ((gJ_2)this.id_class[13]).id_class(gJ_2.id_byte, var6);
   }

   public QU id_short() {
      this.j();
      return (QU)this.id_class[53];
   }

   @Override
   public void close() {
      this.j();

      try {
         ((Ip_1)this.id_class[id_protected[252]]).close();
         ((ub_3)this.id_class[id_protected[253]]).close();
         ((Hh_1)this.id_class[id_protected[254]]).close();
         ((yX_2)this.id_class[id_protected[255]]).close();
         ((Nf_1)this.id_class[id_protected[256]]).id_protected();
         ((rAt_1)this.id_class[id_protected[257]]).close();
         ((Cy_1)this.id_class[id_protected[258]]).id_break();
         ((fC_2)this.id_class[id_protected[259]]).close();
         ((fv_3)this.id_class[id_protected[260]]).close();
         ((fY_2)this.id_class[id_protected[261]]).close();
         ((rAv_1)this.id_class[id_protected[262]]).close();
         rqR_2.id_private();
      } catch (Throwable var5) {
         ((Logger)id_break[id_protected[265]]).error(id_throws[38], var5);
         throw var5;
      } finally {
         ((yh_3)this.id_class[4]).close();
         ((Qg_1)this.id_class[5]).close();
      }
   }

   public void z() {
      this.j();
      if ((Integer)this.id_class[66] <= 0) {
         if ((rjG_2)this.id_class[64] == null) {
            ((Logger)id_break[1]).error("Null returned as 'hitResult', this shouldn't happen!");
            if (((Ax_1)this.id_class[55]).id_case()) {
               Integer var8 = 10;
               this.id_class[66] = var8;
            }
         } else if (!((cb_3)this.id_class[57]).id_long()) {
            switch (((int[])Qo_1.id_class[0])[((rjG_2)this.id_class[64]).id_byte().ordinal()]) {
               case 1:
                  ((Ax_1)this.id_class[55]).id_class((cb_3)this.id_class[57], ((rfo_3)((rjG_2)this.id_class[64])).id_class(), true);
                  break;
               case 2:
                  rff_3 var1 = (rff_3)((rjG_2)this.id_class[64]);
                  rfH_2 var2 = var1.id_class();
                  xc_3 var3 = ((gm_3)this.id_class[56]).id_byte(var2);
                  if (!var3.id_catch()) {
                     ((Ax_1)this.id_class[55]).id_class(var2, var1.id_break(), true);
                     break;
                  }
               case 3:
                  if (((Ax_1)this.id_class[55]).id_case()) {
                     Integer var9 = 10;
                     this.id_class[66] = var9;
                  }

                  ((cb_3)this.id_class[57]).sg();
            }

            rrjl_3.id_class((rjG_2)this.id_class[64], rpm_3.MAIN_HAND);
         }
      }
   }

   public Aq_1 id_void() {
      this.j();
      return (cb_3)this.id_class[57] == null ? null : (Aq_1)((cb_3)this.id_class[57]).id_break[0];
   }

   private void w() {
      boolean var1 = false;
      lY_2 var2 = this.id_synchronized().id_break();
      IJ var3 = var2.id_class().id_break();

      for (xd_3 var5 : rVL.id_strictfp) {
         UnmodifiableIterator var6 = var5.id_new().id_class().iterator();

         while (var6.hasNext()) {
            xc_3 var7 = (xc_3)var6.next();
            if (var7.id_private() == xN_2.MODEL) {
               IJ var8 = var2.id_break(var7);
               if (var8 == var3) {
                  ((Logger)id_break[1]).debug("Missing model for: {}", var7);
                  var1 = true;
               }
            }
         }
      }

      fj_3 var13 = var3.id_throws();

      for (xd_3 var16 : rVL.id_strictfp) {
         UnmodifiableIterator var18 = var16.id_new().id_class().iterator();

         while (var18.hasNext()) {
            xc_3 var20 = (xc_3)var18.next();
            fj_3 var9 = var2.id_class(var20);
            if (!var20.id_catch() && var9 == var13) {
               ((Logger)id_break[1]).debug("Missing particle icon for: {}", var20);
               var1 = true;
            }
         }
      }

      rqs_3 var15 = rqs_3.id_class();

      for (rdb_3 var19 : rVL.id_for) {
         var15.clear();
         var19.id_class(rdX_2.id_catch, var15);

         for (rdn_3 var22 : var15) {
            String var10 = var22.id_finally();
            String var11 = new rgn_3(var10).getString();
            if (var11.toLowerCase(Locale.ROOT).equals(var19.id_break())) {
               ((Logger)id_break[1]).debug("Missing translation for: {} {} {}", var22, var10, var22.id_break());
            }
         }
      }

      var1 |= cg_3.id_class();
      if (var1) {
         throw new IllegalStateException("Your game data is foobar, fix the errors above!");
      }
   }

   public jV_2 u() {
      this.j();
      return (jV_2)this.id_class[37];
   }

   public MinecraftSessionService r() {
      this.j();
      return (MinecraftSessionService)this.id_class[46];
   }

   public NL N() {
      this.j();
      return (NL)this.id_class[42];
   }

   @Override
   public void id_break() {
      this.j();
      ((Qi_1)this.id_class[22]).id_implements();
   }

   public void id_break(vm_3 var1) {
      this.j();
      rrFo_1 var2 = null;
      if ((vm_3)this.id_class[73] != null) {
         ((vm_3)this.id_class[73]).w_();
         var2 = ((vm_3)this.id_class[73]).id_this();
      }

      if (var1 == null && (gm_3)this.id_class[56] == null) {
         var1 = new rrvL();
      } else if (var1 == null && ((cb_3)this.id_class[57]).Sl()) {
         if (((cb_3)this.id_class[57]).d()) {
            var1 = new ZS(null, ((gm_3)this.id_class[56]).id_synchronized().id_implements());
         } else {
            ((cb_3)this.id_class[57]).J();
         }
      }

      if (var1 instanceof vB_2 || var1 instanceof vG_2) {
         ((Qw_1)this.id_class[20]).R = false;
         ((cq_3)this.id_class[19]).id_throws().id_class(true);
      }

      this.id_class[73] = var1;
      if (var1 != null) {
         ((Qi_1)this.id_class[22]).id_private();
         Vu_1.id_break();
         ((vm_3)var1).id_break(this, ((Qg_1)this.id_class[5]).id_super(), ((Qg_1)this.id_class[5]).id_this());
         Boolean var8 = false;
         this.id_class[72] = var8;
      } else {
         ((Nf_1)this.id_class[41]).id_throws();
         if (var2 == null || !var2.id_class()) {
            ((Qi_1)this.id_class[22]).id_catch();
         }

         vs_3.INSTANCE.id_class();
      }

      this.id_implements();
   }

   public void id_break(an_3 var1) {
      this.j();
      this.id_class[62] = var1;
      ((Hh_1)this.id_class[16]).id_class(var1);
   }

   @Override
   public Runnable id_break(Runnable var1) {
      return var1;
   }

   private static Supplier<rAC> id_break(Supplier<rAC> var0) {
      return () -> new jR_2((rAC)var0.get());
   }

   public void id_break(boolean var1) {
      this.j();
      if ((vm_3)this.id_class[73] == null) {
         boolean var2 = this.id_finally() && !((rng_3)this.id_class[58]).d() ? true : id_case[50];
         if (var2) {
            this.id_break(new ZY(!var1 ? true : id_case[52]));
            ((Nf_1)this.id_class[41]).id_break();
         } else {
            this.id_break(new ZY(true));
         }
      }
   }

   public void id_break(KY var1) {
      this.j();
      this.id_class[78] = var1;
   }

   private void id_break(gm_3 var1) {
      this.j();
      ((yX_2)this.id_class[8]).id_class(var1);
      ((Cy_1)this.id_class[12]).id_class(var1);
      jz_3.id_break.id_class(var1);
      this.id_implements();
   }

   public void id_break(String var1) {
      this.id_class(var1, rVm_1.id_break(), QY::id_class, QY::id_class, false, (QD)QD.staticFields25f7c1a34dee3bdaa6c7082af054c49d[2]);
   }

   public void id_break(int var1) {
      this.j();
      ((Ip_1)this.id_class[49]).id_class(var1);
   }

   public SkinProvider id_throws() {
      this.j();
      return (SkinProvider)this.id_class[48];
   }

   private void id_throws(boolean var1) {
      this.j();
      ((Qg_1)this.id_class[5]).id_class("Pre render");
      long var2 = rqR_2.id_byte();
      long var4 = System.currentTimeMillis();
      double var6 = (double)((int)(var4 - (Long)this.id_class[87]));
      Long var17 = var4;
      this.id_class[87] = var17;
      Double var18 = var6;
      rrQo_1.id_class[0] = var18;
      if (((Qg_1)this.id_class[5]).id_break()) {
         this.G();
      }

      if ((CompletableFuture)this.id_class[85] != null && !((cT_2)this.id_class[75] instanceof cj_3)) {
         CompletableFuture var8 = (CompletableFuture)this.id_class[85];
         Object var19 = null;
         this.id_class[85] = var19;
         this.id_private().thenRun(() -> var8.complete(null));
      }

      Runnable var28;
      while ((var28 = (Runnable)((Queue)this.id_class[84]).poll()) != null) {
         var28.run();
      }

      if (var1) {
         int var9 = ((rqw_3)this.id_class[6]).id_class(rqR_2.id_break());
         this.rd();

         for (int var10 = 0; var10 < Math.min(10, var9); var10++) {
            this.id_package();
         }
      }

      ((Qi_1)this.id_class[22]).id_class(false);
      ((Qg_1)this.id_class[5]).id_class("Render");
      ((Nf_1)this.id_class[41]).id_class(((Hh_1)this.id_class[16]).id_finally());
      RenderSystem.pushMatrix();
      RenderSystem.clear(16640, (Boolean)id_break[2]);
      ((VC)this.id_class[40]).id_class(true);
      HE.id_class();
      RenderSystem.enableTexture();
      RenderSystem.enableCull();
      if (!(Boolean)this.id_class[72]) {
         ((Hh_1)this.id_class[16]).id_class(this.id_class[67] ? (Float)this.id_class[68] : ((rqw_3)this.id_class[6]).id_class, var2, var1);
      }

      ((VC)this.id_class[40]).id_throws();
      RenderSystem.popMatrix();
      RenderSystem.pushMatrix();
      ((VC)this.id_class[40]).id_class(((Qg_1)this.id_class[5]).id_extends(), ((Qg_1)this.id_class[5]).id_native());
      RenderSystem.popMatrix();
      ((Qg_1)this.id_class[5]).id_throws();
      int var29 = this.R();
      if ((double)var29 < QF.id_extends.id_case()) {
         RenderSystem.limitDisplayFPS(var29);
      }

      Thread.yield();
      ((Qg_1)this.id_class[5]).id_class("Post render");
      Integer var20 = (Integer)this.id_class[71] + 1;
      this.id_class[71] = var20;
      boolean var30 = this.id_finally()
            && ((vm_3)this.id_class[73] != null && ((vm_3)this.id_class[73]).z_() || (cT_2)this.id_class[75] != null && ((cT_2)this.id_class[75]).id_class())
            && !((rng_3)this.id_class[58]).d()
         ? true
         : id_case[42];
      if ((Boolean)this.id_class[67] != var30) {
         if ((Boolean)this.id_class[67]) {
            Float var21 = ((rqw_3)this.id_class[6]).id_class;
            this.id_class[68] = var21;
         } else {
            ((rqw_3)this.id_class[6]).id_class = (Float)this.id_class[68];
         }

         Boolean var22 = var30;
         this.id_class[67] = var22;
      }

      long var11 = rqR_2.id_byte();
      ((rpN_2)this.id_class[29]).id_class(var11 - (Long)this.id_class[69]);
      Long var23 = var11;
      this.id_class[69] = var23;

      while (rqR_2.id_break() >= this.id_class[70] + 1000L) {
         Integer var24 = (Integer)this.id_class[71];
         id_break[9] = var24;
         String var25 = String.format(
            "%d fps T: %s%s%s%s B: %d",
            (Integer)id_break[9],
            (double)((Qw_1)this.id_class[20]).id_protected == QF.id_extends.id_case() ? "inf" : ((Qw_1)this.id_class[20]).id_protected,
            ((Qw_1)this.id_class[20]).id_strictfp ? " vsync" : id_throws[45],
            ((Qw_1)this.id_class[20]).id_case.toString(),
            ((Qw_1)this.id_class[20]).id_throws == Vd_1.OFF ? "" : (((Qw_1)this.id_class[20]).id_throws == Vd_1.FAST ? " fast-clouds" : id_throws[48]),
            ((Qw_1)this.id_class[20]).id_abstract
         );
         this.id_class[79] = var25;
         Long var26 = (Long)this.id_class[70] + 1000L;
         this.id_class[70] = var26;
         Integer var27 = 0;
         this.id_class[71] = var27;
      }
   }

   public static boolean L() {
      return ((Qw_1)((QY)id_break[0]).id_class[20]).id_catch != Vh_1.OFF ? true : id_case[100];
   }

   public rrGd_1 M() {
      this.j();
      return (rrGd_1)this.id_class[28];
   }

   public Proxy W() {
      this.j();
      return (Proxy)this.id_class[27];
   }

   private boolean H() {
      this.j();
      return this.id_class[61] && ((rng_3)this.id_class[58] == null || !((rng_3)this.id_class[58]).d()) ? id_case[64] : id_case[63];
   }

   private int R() {
      this.j();
      int var1 = ((Qg_1)this.id_class[5]).id_protected();
      return this.id_static() && ((gm_3)this.id_class[56] != null || (vm_3)this.id_class[73] == null && (cT_2)this.id_class[75] == null)
         ? var1
         : Math.min(var1, 60);
   }

   @Override
   public Thread P() {
      this.j();
      return (Thread)this.id_class[76];
   }

   public boolean id_finally() {
      this.j();
      return this.id_class[61] && (rng_3)this.id_class[58] != null ? true : id_case[102];
   }

   public an_3 id_catch() {
      this.j();
      return (an_3)this.id_class[62];
   }

   public void G() {
      this.j();
      Boolean var5 = false;
      this.id_class[77] = var5;
   }

   public boolean O() {
      return false;
   }

   public Ip_1 id_extends() {
      this.j();
      return (Ip_1)this.id_class[49];
   }

   public boolean id_goto() {
      this.j();
      return (Boolean)this.id_class[77];
   }

   private void K() {
      this.j();
      if ((rjG_2)this.id_class[64] != null && ((rjG_2)this.id_class[64]).id_byte() != rjM_2.MISS) {
         boolean var1 = ((rhx_3)((cb_3)this.id_class[57]).id_implements[18]).id_protected;
         ryO_2 var2 = null;
         rjM_2 var3 = ((rjG_2)this.id_class[64]).id_byte();
         rdn_3 var4;
         if (var3 == rjM_2.BLOCK) {
            rfH_2 var5 = ((rff_3)((rjG_2)this.id_class[64])).id_class();
            xc_3 var6 = ((gm_3)this.id_class[56]).id_byte(var5);
            xd_3 var7 = var6.id_break();
            if (var6.id_catch()) {
               return;
            }

            var4 = var7.id_class((rRq_1)((gm_3)this.id_class[56]), var5, var6);
            if (var4.id_class()) {
               return;
            }

            if (var1 && vm_3.id_else() && var7.id_protected()) {
               var2 = ((gm_3)this.id_class[56]).id_class(var5);
            }
         } else {
            if (var3 != rjM_2.ENTITY || !var1) {
               return;
            }

            an_3 var9 = ((rfo_3)((rjG_2)this.id_class[64])).id_class();
            if (var9 instanceof rsO_2) {
               var4 = new rdn_3(rdy_3.hH);
            } else if (var9 instanceof rsM_2) {
               var4 = new rdn_3(rdy_3.df);
            } else if (var9 instanceof rsG_2 var12) {
               rdn_3 var8 = var12.id_final();
               if (var8.id_class()) {
                  var4 = new rdn_3(rdy_3.dB);
               } else {
                  var4 = var8.id_implements();
               }
            } else if (var9 instanceof rsJ_2 var14) {
               var4 = new rdn_3(switch (((int[])Qo_1.id_class[1])[var14.id_final().ordinal()]) {
                  case 1 -> rdy_3.XX;
                  case 2 -> rdy_3.Xh;
                  case 3 -> rdy_3.dF;
                  case 4 -> rdy_3.dL;
                  case 5 -> rdy_3.dV;
                  default -> rdy_3.ho;
               });
            } else if (var9 instanceof rSK) {
               var4 = new rdn_3(((rSK)var9).id_protected());
            } else if (var9 instanceof rSY) {
               var4 = new rdn_3(rdy_3.dq);
            } else if (var9 instanceof rSa_1) {
               var4 = new rdn_3(rdy_3.kM);
            } else {
               rkO_2 var16 = rkO_2.id_class(var9.BC());
               if (var16 == null) {
                  return;
               }

               var4 = new rdn_3(var16);
            }
         }

         if (var4.id_class()) {
            String var10 = "";
            if (var3 == rjM_2.BLOCK) {
               var10 = rVL.id_strictfp.id_break(((gm_3)this.id_class[56]).id_byte(((rff_3)((rjG_2)this.id_class[64])).id_class()).id_break()).toString();
            } else if (var3 == rjM_2.ENTITY) {
               var10 = rVL.id_transient.id_break(((rfo_3)((rjG_2)this.id_class[64])).id_class().BC()).toString();
            }

            ((Logger)id_break[1]).warn("Picking on: [{}] {} gave null item", var3, var10);
         } else {
            rhz_3 var11 = (rhz_3)((cb_3)this.id_class[57]).id_implements[1];
            if (var2 != null) {
               this.id_class(var4, var2);
            }

            if (!rrfZ_2.id_byte()) {
               int var13 = var11.id_break(var4);
               if (var1) {
                  var11.id_class(var4);
                  ((Ax_1)this.id_class[55]).id_class(((cb_3)this.id_class[57]).id_protected(rpm_3.MAIN_HAND), 36 + var11.id_protected);
               } else if (var13 != -1) {
                  if (rhz_3.id_break(var13)) {
                     var11.id_protected = var13;
                  } else {
                     ((Ax_1)this.id_class[55]).id_class(var13);
                  }
               }
            }
         }
      }
   }

   public pg_3 id_case() {
      this.j();
      return (pg_3)this.id_class[9];
   }

   public gW_2 id_const() {
      this.j();
      return (gW_2)this.id_class[44];
   }

   public boolean id_continue() {
      this.j();
      return ((Qw_1)this.id_class[20]).id_transient;
   }

   public Qg_1 id_else() {
      this.j();
      return (Qg_1)this.id_class[5];
   }

   public void id_for() {
      this.j();
      if (!((Ax_1)this.id_class[55]).id_volatile()) {
         rrAu_1 var1 = rrAu_1.id_break(4);
         if (((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(var1).id_byte()) {
            return;
         }

         Integer var17 = var1.id_class();
         this.id_class[65] = var17;
         if (!((cb_3)this.id_class[57]).id_long()) {
            if ((rjG_2)this.id_class[64] == null) {
               ((Logger)id_break[1]).warn("Null returned as 'hitResult', this shouldn't happen!");
            }

            for (rpm_3 var5 : rpm_3.values()) {
               rdn_3 var6 = ((cb_3)this.id_class[57]).id_protected(var5);
               if (((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrAY.id_class(var6, var5)).id_byte()) {
                  break;
               }

               if ((rjG_2)this.id_class[64] != null) {
                  switch (((int[])Qo_1.id_class[0])[((rjG_2)this.id_class[64]).id_byte().ordinal()]) {
                     case 1:
                        rfo_3 var7 = (rfo_3)((rjG_2)this.id_class[64]);
                        an_3 var8 = var7.id_class();
                        ryZ_2 var9 = ((Ax_1)this.id_class[55]).id_class((cb_3)this.id_class[57], var8, var7, var5);
                        if (!var9.id_class()) {
                           var9 = ((Ax_1)this.id_class[55]).id_class((cb_3)this.id_class[57], var8, var5);
                        }

                        if (var9.id_class()) {
                           if (var9.id_break()) {
                              ((cb_3)this.id_class[57]).id_class(var5);
                           }

                           return;
                        }
                        break;
                     case 2:
                        rff_3 var10 = (rff_3)((rjG_2)this.id_class[64]);
                        int var11 = var6.id_char();
                        ryZ_2 var12 = ((Ax_1)this.id_class[55]).id_class((cb_3)this.id_class[57], (gm_3)this.id_class[56], var5, var10);
                        if (var12.id_class()) {
                           if (var12.id_break()) {
                              ((cb_3)this.id_class[57]).id_class(var5);
                              if (!var6.id_class() && (var6.id_char() != var11 || ((Ax_1)this.id_class[55]).id_catch())) {
                                 ((Hh_1)this.id_class[16]).id_class.id_class(var5);
                              }
                           }

                           return;
                        }

                        if (var12 == ryZ_2.FAIL) {
                           return;
                        }
                  }
               }

               if (!var6.id_class()) {
                  ryZ_2 var18 = ((Ax_1)this.id_class[55]).id_class(var5);
                  ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrAf_1.id_class(var18, var6, var5));
                  if (var18.id_class()) {
                     if (var18.id_break()) {
                        ((cb_3)this.id_class[57]).id_class(var5);
                     }

                     ((Hh_1)this.id_class[16]).id_class.id_class(var5);
                     return;
                  }
               } else {
                  ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrAf_1.id_class(ryZ_2.PASS, var6, var5));
               }
            }
         }
      }
   }

   public void id_implements() {
      this.j();
      ((Qg_1)this.id_class[5]).id_break(this.C());
   }

   public HB id_import() {
      this.j();
      return (HB)this.id_class[11];
   }

   public static QY id_instanceof() {
      return (QY)id_break[0];
   }

   public HM id_new() {
      this.j();
      return (HM)this.id_class[45];
   }

   public void id_package() {
      this.j();

      while (!((ConcurrentLinkedQueue)id_break[7]).isEmpty()) {
         ((Runnable)((ConcurrentLinkedQueue)id_break[7]).poll()).run();
      }

      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).id_byte();
      if ((Integer)this.id_class[65] > 0) {
         Integer var8 = (Integer)this.id_class[65] - 1;
         this.id_class[65] = var8;
      }

      if (!(Boolean)this.id_class[67]) {
         ((cq_3)this.id_class[19]).id_protected();
      }

      ((Hh_1)this.id_class[16]).id_class(1.0F);
      if (!(Boolean)this.id_class[67] && (gm_3)this.id_class[56] != null) {
         ((Ax_1)this.id_class[55]).id_protected();
      }

      if ((gm_3)this.id_class[56] != null) {
         ((fY_2)this.id_class[2]).id_break();
      }

      if ((vm_3)this.id_class[73] == null && (cb_3)this.id_class[57] != null) {
         if (((cb_3)this.id_class[57]).Sl() && !((vm_3)this.id_class[73] instanceof ZS)) {
            this.id_break(null);
         } else if (((cb_3)this.id_class[57]).Sc() && (gm_3)this.id_class[56] != null) {
            this.id_break(new vy_3());
         }
      } else if ((vm_3)this.id_class[73] != null && (vm_3)this.id_class[73] instanceof vy_3 && !((cb_3)this.id_class[57]).Sc()) {
         this.id_break(null);
      }

      if ((vm_3)this.id_class[73] != null) {
         Integer var9 = 10000;
         this.id_class[66] = var9;
      }

      if ((vm_3)this.id_class[73] != null) {
         vm_3.id_class(() -> {
            this.j();
            ((vm_3)this.id_class[73]).id_private();
         }, "Ticking screen", ((vm_3)this.id_class[73]).getClass().getCanonicalName());
      }

      if (!((Qw_1)this.id_class[20]).R) {
         ((cq_3)this.id_class[19]).id_native();
      }

      if ((cT_2)this.id_class[75] == null
         && (
            (vm_3)this.id_class[73] == null
               || (cb_3)this.id_class[57] != null
                  && ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrAm_1.id_class((vm_3)this.id_class[73])).id_break()
               || ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).id_class((vm_3)this.id_class[73])
         )) {
         this.f();
         if ((Integer)this.id_class[66] > 0) {
            Integer var10 = (Integer)this.id_class[66] - 1;
            this.id_class[66] = var10;
         }
      }

      if ((gm_3)this.id_class[56] != null) {
         if (!(Boolean)this.id_class[67]) {
            ((Hh_1)this.id_class[16]).id_protected();
         }

         if (!(Boolean)this.id_class[67]) {
            ((yX_2)this.id_class[8]).id_finally();
         }

         if (!(Boolean)this.id_class[67]) {
            if (((gm_3)this.id_class[56]).id_super() > 0) {
               ((gm_3)this.id_class[56]).id_byte(((gm_3)this.id_class[56]).id_super() - 1);
            }

            ((gm_3)this.id_class[56]).id_protected();
         }
      } else if (((Hh_1)this.id_class[16]).id_throws() != null) {
         ((Hh_1)this.id_class[16]).id_break();
      }

      if (!(Boolean)this.id_class[67]) {
         ((NL)this.id_class[42]).id_class();
      }

      ((Nf_1)this.id_class[41]).id_class((Boolean)this.id_class[67]);
      if ((gm_3)this.id_class[56] != null) {
         if (!(Boolean)this.id_class[67]) {
            if (!((Qw_1)this.id_class[20]).id_char && this.H()) {
               ((Qw_1)this.id_class[20]).id_char = true;
               ((Qw_1)this.id_class[20]).id_break();
            }

            try {
               ((gm_3)this.id_class[id_protected[482]]).id_class(() -> true);
            } catch (Throwable var11) {
               KY var2 = KY.id_class(var11, "Exception in world tick");
               if ((gm_3)this.id_class[56] == null) {
                  Ko_1 var3 = var2.id_class("Affected level");
                  var3.id_class("Problem", "Level is null!");
               } else {
                  ((gm_3)this.id_class[56]).id_class(var2);
               }

               throw new KU(var2);
            }
         }

         if (!(Boolean)this.id_class[67] && (gm_3)this.id_class[56] != null) {
            ((gm_3)this.id_class[56])
               .id_class(
                  rfU_2.id_byte(((cb_3)this.id_class[57]).rx()), rfU_2.id_byte(((cb_3)this.id_class[57]).re()), rfU_2.id_byte(((cb_3)this.id_class[57]).BO())
               );
         }

         if (!(Boolean)this.id_class[67]) {
            ((Cy_1)this.id_class[12]).id_byte();
         }
      } else if ((rud_3)this.id_class[60] != null) {
         ((rud_3)this.id_class[60]).id_class();
      }

      ((Qj_1)this.id_class[23]).id_break();
   }

   public static boolean id_return() {
      return ((Qw_1)((QY)id_break[0]).id_class[20]).id_case.id_class() >= VW.FANCY.id_class() ? true : id_case[96];
   }

   public Vk_1 id_super() {
      this.j();
      return (Vk_1)this.id_class[21];
   }

   public boolean id_switch() {
      this.j();
      return (Boolean)this.id_class[61];
   }

   public boolean id_throw() {
      this.j();
      return (Boolean)this.id_class[67];
   }

   public NS id_try() {
      this.j();
      if ((vm_3)this.id_class[73] instanceof vg_3) {
         return Ns_1.id_byte;
      } else if ((cb_3)this.id_class[57] != null) {
         if (((rYB)((cb_3)this.id_class[57]).id_throws[7]).E() == rYB.id_throws) {
            return ((cq_3)this.id_class[19]).id_extends().id_protected() ? Ns_1.id_protected : Ns_1.id_throws;
         } else {
            rYh_1 var1 = ((rYB)((cb_3)this.id_class[57]).id_throws[7]).id_implements(((cb_3)this.id_class[57]).Bs()).id_this();
            if (!((NL)this.id_class[42]).id_break(Ns_1.id_case) && (!((cb_3)this.id_class[57]).W() || var1 != rYh_1.OCEAN && var1 != rYh_1.RIVER)) {
               return ((rYB)((cb_3)this.id_class[57]).id_throws[7]).E() != rYB.id_protected
                     && ((rhx_3)((cb_3)this.id_class[57]).id_implements[18]).id_protected
                     && ((rhx_3)((cb_3)this.id_class[57]).id_implements[18]).id_byte
                  ? Ns_1.id_break
                  : ((gm_3)this.id_class[56]).id_static().id_break(((cb_3)this.id_class[57]).Bs()).id_super().orElse(Ns_1.id_catch);
            } else {
               return Ns_1.id_case;
            }
         }
      } else {
         return Ns_1.id_class;
      }
   }

   public rqN_2 id_while() {
      this.j();
      return (rqN_2)this.id_class[14];
   }

   public boolean id_static() {
      this.j();
      return (Boolean)this.id_class[83];
   }

   public static boolean id_public() {
      return !((Qw_1)((QY)id_break[0]).id_class[20]).g ? true : id_case[94];
   }

   private static Supplier<rAC> id_protected(Supplier<rAC> var0) {
      return () -> new jg_3((rAC)var0.get(), jg_3.id_class);
   }

   private void id_protected(boolean var1) {
      this.j();
      if (!var1) {
         Integer var10 = 0;
         this.id_class[66] = var10;
      }

      if ((Integer)this.id_class[66] <= 0 && !((cb_3)this.id_class[57]).id_return()) {
         if (var1 && (rjG_2)this.id_class[64] != null && ((rjG_2)this.id_class[64]).id_byte() == rjM_2.BLOCK) {
            rff_3 var2 = (rff_3)((rjG_2)this.id_class[64]);
            rfH_2 var3 = var2.id_class();
            xc_3 var4 = ((gm_3)this.id_class[56]).id_byte(var3);
            if (!var4.id_catch()) {
               rpr_3 var5 = var2.id_break();
               ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0])
                  .id_finally()
                  .id_class(rrLH.id_class(var3, var4, (rrLy_1)rrLy_1.staticFields4117bd257b2839b395dedb8ac6b8a087[0]));
               if (((Ax_1)this.id_class[55]).id_break(var3, var5, true)) {
                  if (rrbb_3.M()) {
                     ((Cy_1)this.id_class[12]).id_class(var3, var5);
                  }

                  ((cb_3)this.id_class[57]).id_class(rpm_3.MAIN_HAND);
               }

               ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0])
                  .id_finally()
                  .id_class(rrLH.id_class(var3, var4, (rrLy_1)rrLy_1.staticFields4117bd257b2839b395dedb8ac6b8a087[1]));
            }
         } else {
            ((Ax_1)this.id_class[55]).id_break();
         }
      }
   }

   private void id_protected(vm_3 var1) {
      this.j();
      ((Nf_1)this.id_class[41]).id_byte();
      Object var6 = null;
      this.id_class[62] = var6;
      Object var7 = null;
      this.id_class[60] = var7;
      this.id_break(var1);
      this.id_throws(false);
   }

   public DataFixer id_protected() {
      this.j();
      return (DataFixer)this.id_class[3];
   }

   public CompletableFuture<Void> id_private() {
      this.j();
      if ((CompletableFuture)this.id_class[85] != null) {
         return (CompletableFuture<Void>)this.id_class[85];
      } else {
         CompletableFuture var1 = new CompletableFuture();
         if ((cT_2)this.id_class[75] instanceof cj_3) {
            this.id_class[85] = var1;
            return var1;
         } else {
            ((rAt_1)this.id_class[36]).id_class();
            List var2 = ((rAt_1)this.id_class[36]).id_case();
            this.id_class(
               new cj_3(
                  this,
                  ((rAv_1)this.id_class[34]).id_class(rqR_2.id_case(), this, (CompletableFuture<rqg_3>)id_break[5], var2),
                  var2x -> rqR_2.id_class(var2x, this::id_class, () -> {
                        this.j();
                        ((yX_2)this.id_class[8]).id_throws();
                        var1.complete(null);
                     }),
                  true
               )
            );
            return var1;
         }
      }
   }

   public fC_2 id_abstract() {
      this.j();
      return (fC_2)this.id_class[52];
   }

   public boolean id_final() {
      this.j();
      return (Boolean)this.id_class[33];
   }

   public void id_transient() {
      this.id_byte(new vY_2());
   }

   public FU id_volatile() {
      this.j();
      return (FU)this.id_class[54];
   }

   public lo_3 id_synchronized() {
      this.j();
      return (lo_3)this.id_class[50];
   }

   public boolean id_native() {
      return false;
   }

   public boolean id_strictfp() {
      this.j();
      return (Boolean)this.id_class[30];
   }

   public boolean E() {
      this.j();
      return ((cb_3)this.id_class[57] == null || !((cb_3)this.id_class[57]).sW()) && !((Qw_1)this.id_class[20]).id_switch ? id_case[108] : id_case[107];
   }

   public fY_2 A() {
      this.j();
      return (fY_2)this.id_class[2];
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
      id_break = var0;
   }

   public float X() {
      this.j();
      return ((rqw_3)this.id_class[6]).id_class;
   }

   public String Q() {
      this.j();
      return (String)this.id_class[26];
   }

   private String rr() {
      this.j();
      if ((rng_3)this.id_class[58] != null) {
         return ((rng_3)this.id_class[58]).d() ? "hosting_lan" : id_throws[99];
      } else if ((Ak_1)this.id_class[59] != null) {
         return ((Ak_1)this.id_class[59]).id_protected() ? "playing_lan" : id_throws[101];
      } else {
         return id_throws[102];
      }
   }

   private static void rP() {
      id_private = new float[]{20.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F};
   }
}
