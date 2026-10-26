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
   private static final Logger id_class = LogManager.getLogger();
   private static final DateFormat id_break = new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss");

   public static void id_class(File var0, int var1, int var2, VC var3, Consumer<rgP_2> var4) {
      id_class(var0, (String)null, var1, var2, var3, var4);
   }

   private static File id_class(File var0) {
      String var1 = id_break.format(new Date());
      int var2 = 1;

      while (true) {
         File var3 = new File(var0, var1 + (var2 == 1 ? "" : "_" + var2) + ".png");
         if (!var3.exists()) {
            return var3;
         }

         var2++;
      }
   }

   public static fN_2 id_class(int var0, int var1, VC var2) {
      if (!GLX.isUsingFBOs()) {
         fN_2 var6 = new fN_2(var0, var1, false);
         var6.id_break(true);
         var6.id_case();
         return var6;
      } else {
         var0 = var2.id_class;
         var1 = var2.id_break;
         fN_2 var3 = new fN_2(var0, var1, false);
         RenderSystem.bindTexture(var2.id_case());
         var3.id_class(0, true);
         var3.id_case();
         return var3;
      }
   }

   public static void id_class(File var0, String var1, int var2, int var3, VC var4, Consumer<rgP_2> var5) {
      if (!RenderSystem.isOnRenderThread()) {
         RenderSystem.recordRenderCall(() -> id_break(var0, var1, var2, var3, var4, var5));
      } else {
         id_break(var0, var1, var2, var3, var4, var5);
      }
   }

   private static void id_break(File var0, String var1, int var2, int var3, VC var4, Consumer<rgP_2> var5) {
      QY var6 = rrbb_3.X();
      Qg_1 var7 = var6.id_else();
      Qw_1 var8 = rrbb_3.rE();
      int var9 = var7.id_extends();
      int var10 = var7.id_native();
      int var11 = var8.rs;
      int var12 = var7.id_class(((Qw_1)var6.id_class[20]).rs, ((Qw_1)var6.id_class[20]).id_transient);
      int var13 = rrbb_3.rH();
      boolean var14 = GLX.isUsingFBOs() && var13 > 1;
      if (var14) {
         var8.rs = var12 * var13;
         var7.id_class(var9 * var13, var10 * var13);
         MT.id_transient();
         MT.id_interface(16640);
         var6.B().id_class(true);
         MT.id_import();
         ((Hh_1)var6.id_class[16]).id_class(var6.X(), System.nanoTime(), true);
      }

      fN_2 var15 = id_class(var2, var3, var4);
      if (var14) {
         var6.B().id_throws();
         MT.id_for();
         rrbb_3.rE().rs = var11;
         var7.id_class(var9, var10);
      }

      File var16 = new File(var0, "screenshots");
      var16.mkdir();
      File var17;
      if (var1 == null) {
         var17 = id_class(var16);
      } else {
         var17 = new File(var16, var1);
      }

      Object var18 = null;
      if (rrxr_3.rT.id_byte()) {
         var18 = rrxr_3.id_private(rrxr_3.rT, var15, var17);
         if (rrxr_3.id_break(var18, rrxr_3.B)) {
            rgP_2 var21 = (rgP_2)rrxr_3.id_private(var18, rrxr_3.BU);
            var5.accept(var21);
            return;
         }

         var17 = (File)rrxr_3.id_private(var18, rrxr_3.Be);
      }

      File var19 = var17;
      Object var20 = var18;
      rqR_2.id_catch()
         .execute(
            () -> {
               try {
                  var15.id_class(var19);
                  rVi_1 var4x = new rgN_2(var19.getName())
                     .id_class(rgF_2.UNDERLINE)
                     .id_class(var1xx -> var1xx.id_class(new rgl_3(rgH_2.OPEN_FILE, var19.getAbsolutePath())));
                  if (var20 != null && rrxr_3.id_private(var20, rrxr_3.Ba) != null) {
                     var5.accept((rgP_2)rrxr_3.id_private(var20, rrxr_3.Ba));
                  } else {
                     var5.accept(new rgn_3("screenshot.success", var4x));
                  }
               } catch (Exception var8x) {
                  id_class.warn("Couldn't save screenshot", var8x);
                  var5.accept(new rgn_3("screenshot.failure", var8x.getMessage()));
               } finally {
                  var15.close();
               }
            }
         );
   }
}
