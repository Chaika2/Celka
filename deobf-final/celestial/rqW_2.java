package celestial;

import com.mojang.blaze3d.platform.GLX;
import com.mojang.blaze3d.systems.RenderSystem;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.Consumer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rqW_2 {
   private static final Logger class_ = LogManager.getLogger();
   private static final DateFormat break_ = new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss");

   public static void class_(File var0, int var1, int var2, VC var3, Consumer<rgP_2> var4) {
      class_(var0, (String)null, var1, var2, var3, var4);
   }

   private static File class_(File var0) {
      String var1 = break_.format(new Date());
      int var2 = 1;

      while (true) {
         File var3 = new File(var0, var1 + (var2 == 1 ? "" : "_" + var2) + ".png");
         if (!var3.exists()) {
            return var3;
         }

         var2++;
      }
   }

   public static fN_2 class_(int var0, int var1, VC var2) {
      if (!GLX.isUsingFBOs()) {
         fN_2 var6 = new fN_2(var0, var1, false);
         var6.break_(true);
         var6.case_();
         return var6;
      } else {
         var0 = var2.class_;
         var1 = var2.break_;
         fN_2 var3 = new fN_2(var0, var1, false);
         RenderSystem.bindTexture(var2.case_());
         var3.class_(0, true);
         var3.case_();
         return var3;
      }
   }

   public static void class_(File var0, String var1, int var2, int var3, VC var4, Consumer<rgP_2> var5) {
      if (!RenderSystem.isOnRenderThread()) {
         RenderSystem.recordRenderCall(() -> break_(var0, var1, var2, var3, var4, var5));
      } else {
         break_(var0, var1, var2, var3, var4, var5);
      }
   }

   private static void break_(File var0, String var1, int var2, int var3, VC var4, Consumer<rgP_2> var5) {
      QY var6 = rrbb_3.X();
      Qg_1 var7 = var6.else_();
      Qw_1 var8 = rrbb_3.rE();
      int var9 = var7.extends_();
      int var10 = var7.native_();
      int var11 = var8.rs;
      int var12 = var7.class_(((Qw_1)var6.class_[20]).rs, ((Qw_1)var6.class_[20]).transient_);
      int var13 = rrbb_3.rH();
      boolean var14 = GLX.isUsingFBOs() && var13 > 1;
      if (var14) {
         var8.rs = var12 * var13;
         var7.class_(var9 * var13, var10 * var13);
         MT.transient_();
         MT.interface_(16640);
         var6.B().class_(true);
         MT.import_();
         ((Hh_1)var6.class_[16]).class_(var6.X(), System.nanoTime(), true);
      }

      fN_2 var15 = class_(var2, var3, var4);
      if (var14) {
         var6.B().throws_();
         MT.for_();
         rrbb_3.rE().rs = var11;
         var7.class_(var9, var10);
      }

      File var16 = new File(var0, "screenshots");
      var16.mkdir();
      File var17;
      if (var1 == null) {
         var17 = class_(var16);
      } else {
         var17 = new File(var16, var1);
      }

      Object var18 = null;
      if (rrxr_3.rT.byte_()) {
         var18 = rrxr_3.private_(rrxr_3.rT, var15, var17);
         if (rrxr_3.break_(var18, rrxr_3.B)) {
            rgP_2 var21 = (rgP_2)rrxr_3.private_(var18, rrxr_3.BU);
            var5.accept(var21);
            return;
         }

         var17 = (File)rrxr_3.private_(var18, rrxr_3.Be);
      }

      File var19 = var17;
      Object var20 = var18;
      rqR_2.catch_()
         .execute(
            () -> {
               try {
                  var15.class_(var19);
                  rVi_1 var4x = new rgN_2(var19.getName())
                     .class_(rgF_2.UNDERLINE)
                     .class_(var1xx -> var1xx.class_(new rgl_3(rgH_2.OPEN_FILE, var19.getAbsolutePath())));
                  if (var20 != null && rrxr_3.private_(var20, rrxr_3.Ba) != null) {
                     var5.accept((rgP_2)rrxr_3.private_(var20, rrxr_3.Ba));
                  } else {
                     var5.accept(new rgn_3("screenshot.success", var4x));
                  }
               } catch (Exception var8x) {
                  class_.warn("Couldn't save screenshot", var8x);
                  var5.accept(new rgn_3("screenshot.failure", var8x.getMessage()));
               } finally {
                  var15.close();
               }
            }
         );
   }
}
