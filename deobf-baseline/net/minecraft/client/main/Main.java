package net.minecraft.client.main;

import celestial.AE;
import celestial.AS;
import celestial.As_1;
import celestial.KY;
import celestial.MC;
import celestial.QT;
import celestial.QY;
import celestial.Qp_1;
import celestial.Qq_1;
import celestial.Qt_1;
import celestial.Qw_1;
import celestial.Qy_1;
import celestial.gN_2;
import celestial.jV_2;
import celestial.rVN;
import celestial.rhd_3;
import celestial.rpY_2;
import celestial.rqN_2;
import celestial.rqR_2;
import celestial.rrQJ;
import celestial.rrZr_1;
import celestial.rya_3;
import celestial.ys_3;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.authlib.properties.PropertyMap.Serializer;
import com.mojang.blaze3d.systems.RenderSystem;
import java.io.File;
import java.net.Authenticator;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.util.List;
import java.util.OptionalInt;
import joptsimple.ArgumentAcceptingOptionSpec;
import joptsimple.NonOptionArgumentSpec;
import joptsimple.OptionParser;
import joptsimple.OptionSet;
import joptsimple.OptionSpec;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.ntfhack.StringChecker;
import ru.ntfhack.UserInfo;

public class Main {
   public static final Logger id_class = LogManager.getLogger();

   public static void main(String[] var0) {
      try {
         rrZr_1 var1 = new rrZr_1(UserInfo.getUsername(), String.valueOf(UserInfo.getUID()));
         rrQJ.id_class[5] = var1;
         StringChecker.init("Celestial", (String)rrQJ.id_class[1], "1.1", "1.16.5", "25/05/2026", var1.id_break(), var1.id_protected());
      } catch (Exception | Error var78) {
         var78.printStackTrace();
         rrZr_1 var64 = new rrZr_1("Smertnix", "1");
         rrQJ.id_class[5] = var64;
      }

      OptionParser var79 = new OptionParser();
      var79.allowsUnrecognizedOptions();
      var79.accepts("demo");
      var79.accepts("disableMultiplayer");
      var79.accepts("disableChat");
      var79.accepts("fullscreen");
      var79.accepts("checkGlErrors");
      ArgumentAcceptingOptionSpec var2 = var79.accepts("server").withRequiredArg();
      ArgumentAcceptingOptionSpec var3 = var79.accepts("port").withRequiredArg().ofType(Integer.class).defaultsTo(25565, new Integer[0]);
      ArgumentAcceptingOptionSpec var4 = var79.accepts("gameDir").withRequiredArg().ofType(File.class).defaultsTo(new File("."), new File[0]);
      ArgumentAcceptingOptionSpec var5 = var79.accepts("assetsDir").withRequiredArg().ofType(File.class);
      ArgumentAcceptingOptionSpec var6 = var79.accepts("resourcePackDir").withRequiredArg().ofType(File.class);
      ArgumentAcceptingOptionSpec var7 = var79.accepts("dataPackDir").withRequiredArg().ofType(File.class);
      ArgumentAcceptingOptionSpec var8 = var79.accepts("proxyHost").withRequiredArg();
      ArgumentAcceptingOptionSpec var9 = var79.accepts("proxyPort").withRequiredArg().defaultsTo("8080", new String[0]).ofType(Integer.class);
      ArgumentAcceptingOptionSpec var10 = var79.accepts("proxyUser").withRequiredArg();
      ArgumentAcceptingOptionSpec var11 = var79.accepts("proxyPass").withRequiredArg();
      ArgumentAcceptingOptionSpec var12 = var79.accepts("username").withRequiredArg().defaultsTo("CelUser" + RandomStringUtils.randomNumeric(5), new String[0]);
      ArgumentAcceptingOptionSpec var13 = var79.accepts("uuid").withRequiredArg();
      ArgumentAcceptingOptionSpec var14 = var79.accepts("accessToken").withRequiredArg().required();
      ArgumentAcceptingOptionSpec var15 = var79.accepts("version").withRequiredArg().required();
      ArgumentAcceptingOptionSpec var16 = var79.accepts("width").withRequiredArg().ofType(Integer.class).defaultsTo(854, new Integer[0]);
      ArgumentAcceptingOptionSpec var17 = var79.accepts("height").withRequiredArg().ofType(Integer.class).defaultsTo(480, new Integer[0]);
      ArgumentAcceptingOptionSpec var18 = var79.accepts("fullscreenWidth").withRequiredArg().ofType(Integer.class);
      ArgumentAcceptingOptionSpec var19 = var79.accepts("fullscreenHeight").withRequiredArg().ofType(Integer.class);
      ArgumentAcceptingOptionSpec var20 = var79.accepts("userProperties").withRequiredArg().defaultsTo("{}", new String[0]);
      ArgumentAcceptingOptionSpec var21 = var79.accepts("profileProperties").withRequiredArg().defaultsTo("{}", new String[0]);
      ArgumentAcceptingOptionSpec var22 = var79.accepts("assetIndex").withRequiredArg();
      ArgumentAcceptingOptionSpec var23 = var79.accepts("userType").withRequiredArg().defaultsTo("legacy", new String[0]);
      ArgumentAcceptingOptionSpec var24 = var79.accepts("versionType").withRequiredArg().defaultsTo("release", new String[0]);
      NonOptionArgumentSpec var25 = var79.nonOptions();
      OptionSet var26 = var79.parse(var0);
      List var27 = var26.valuesOf(var25);
      if (!var27.isEmpty()) {
         System.out.println("Completely ignored arguments: " + var27);
      }

      String var28 = id_class(var26, var8);
      Proxy var29 = Proxy.NO_PROXY;
      if (var28 != null) {
         try {
            var29 = new Proxy(Type.SOCKS, new InetSocketAddress(var28, id_class(var26, var9)));
         } catch (Exception var77) {
         }
      }

      String var30 = id_class(var26, var10);
      String var31 = id_class(var26, var11);
      if (!var29.equals(Proxy.NO_PROXY) && id_class(var30) && id_class(var31)) {
         Authenticator.setDefault(new AS(var30, var31));
      }

      int var32 = id_class(var26, var16);
      int var33 = id_class(var26, var17);
      OptionalInt var34 = id_class(id_class(var26, var18));
      OptionalInt var35 = id_class(id_class(var26, var19));
      boolean var36 = var26.has("fullscreen");
      boolean var37 = var26.has("demo");
      boolean var38 = var26.has("disableMultiplayer");
      boolean var39 = var26.has("disableChat");
      String var40 = id_class(var26, var15);
      Gson var41 = new GsonBuilder().registerTypeAdapter(PropertyMap.class, new Serializer()).create();
      PropertyMap var42 = rpY_2.id_class(var41, id_class(var26, var20), PropertyMap.class);
      PropertyMap var43 = rpY_2.id_class(var41, id_class(var26, var21), PropertyMap.class);
      String var44 = id_class(var26, var24);
      File var45 = id_class(var26, var4);
      File var46 = var26.has(var5) ? id_class(var26, var5) : new File(var45, "assets/");
      File var47 = var26.has(var6) ? id_class(var26, var6) : new File(var45, "resourcepacks/");
      String var48 = var26.has(var13) ? (String)var13.value(var26) : rhd_3.id_extends((String)var12.value(var26)).toString();
      String var49 = var26.has(var22) ? (String)var22.value(var26) : null;
      String var50 = id_class(var26, var2);
      Integer var51 = id_class(var26, var3);
      KY.id_catch();
      rVN.id_class();
      rVN.id_byte();
      rqR_2.id_final();
      rqN_2 var52 = new rqN_2((String)var12.value(var26), var48, (String)var14.value(var26), (String)var23.value(var26));
      Qy_1 var53 = new Qy_1(
         new Qt_1(var52, var42, var43, var29),
         new ys_3(var32, var33, var34, var35, var36),
         new Qp_1(var45, var47, var46, var49),
         new Qq_1(var37, var40, var44, var38, var39),
         new QT(var50, var51)
      );
      As_1 var54 = new As_1("Client Shutdown Thread");
      var54.setUncaughtExceptionHandler(new rya_3(id_class));
      Runtime.getRuntime().addShutdownHook(var54);
      new MC();

      QY var55;
      try {
         Thread.currentThread().setName("Render thread");
         RenderSystem.initRenderThread();
         RenderSystem.beginInitialization();
         var55 = new QY(var53);
         RenderSystem.finishInitialization();
      } catch (gN_2 var75) {
         id_class.warn("Failed to create window: ", var75);
         return;
      } catch (Throwable var76) {
         KY var57 = KY.id_class(var76, "Initializing game");
         var57.id_class("Initialization");
         QY.id_class((jV_2)null, var53.id_protected.id_break, (Qw_1)null, var57);
         QY.id_byte(var57);
         return;
      }

      AE var56;
      if (var55.O()) {
         var56 = new AE("Game thread", var55);
         var56.start();

         while (var55.id_goto()) {
         }
      } else {
         var56 = null;

         try {
            RenderSystem.initGameThread(false);
            var55.id_double();
         } catch (Throwable var74) {
            id_class.error("Unhandled game exception", var74);
         }
      }

      try {
         var55.G();
         if (var56 != null) {
            var56.join();
         }
      } catch (InterruptedException var72) {
         id_class.error("Exception during client thread shutdown", var72);
      } finally {
         var55.m();
      }
   }

   private static <T> T id_class(OptionSet var0, OptionSpec<T> var1) {
      try {
         return (T)var0.valueOf(var1);
      } catch (Throwable var5) {
         if (var1 instanceof ArgumentAcceptingOptionSpec var3) {
            List var4 = var3.defaultValues();
            if (!var4.isEmpty()) {
               return (T)var4.get(0);
            }
         }

         throw var5;
      }
   }

   private static boolean id_class(String var0) {
      return var0 != null && !var0.isEmpty();
   }

   private static OptionalInt id_class(Integer var0) {
      return var0 != null ? OptionalInt.of(var0) : OptionalInt.empty();
   }
}
