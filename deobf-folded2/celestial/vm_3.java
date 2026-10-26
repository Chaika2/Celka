package celestial;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.blaze3d.systems.RenderSystem;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class vm_3 extends cu_3 implements ZR, cp_3, MinecraftAccessor {
   private static final Logger id_class = LogManager.getLogger();
   private static final Set<String> id_throws = Sets.newHashSet(new String[]{"http", "https"});
   protected rgP_2 id_extends;
   protected final List<cC_2> id_native = Lists.newArrayList();
   protected QY id_volatile;
   protected Hz_1 id_final;
   public int id_package;
   public int id_int;
   protected final List<LZ> id_new = Lists.newArrayList();
   public boolean id_continue;
   protected cm_3 id_super;
   private URI id_case;
   private boolean id_catch;
   private vZ_2 id_private;
   public int id_this;
   private int id_implements;

   private void id_byte(boolean var1) {
      if (var1) {
         this.id_class(this.id_case);
      }

      this.id_case = null;
      this.id_volatile.id_break(this);
   }

   protected vm_3(rgP_2 var1) {
      this.id_extends = var1;
   }

   public rrFo_1 id_this() {
      return rrFo_1.id_break(this);
   }

   public void id_class(rgP_2 var1) {
      this.id_extends = var1;
   }

   public void id_class(Ml_1 var1) {
      this.id_class(var1, 0);
   }

   public void id_class(Ml_1 var1, int var2) {
      if ((gm_3)this.id_volatile.id_class[56] != null) {
         this.id_class(var1, 0, 0, this.id_package, this.id_int, -1072689136, -804253680);
      } else {
         this.id_protected(var2);
      }
   }

   public boolean id_class(rgc_3 var1) {
      if (var1 == null) {
         return false;
      } else {
         rgl_3 var2 = var1.id_private();
         if (id_synchronized()) {
            if (var1.id_finally() != null) {
               this.id_class(var1.id_finally(), false);
            }
         } else if (var2 != null) {
            if (var2.id_class() == rgH_2.OPEN_URL) {
               if (!((Qw_1)this.id_volatile.id_class[20]).id_default) {
                  return false;
               }

               try {
                  URI var3 = new URI(var2.id_break());
                  String var4 = var3.getScheme();
                  if (var4 == null) {
                     throw new URISyntaxException(var2.id_break(), "Missing protocol");
                  }

                  if (!id_throws.contains(var4.toLowerCase(Locale.ROOT))) {
                     throw new URISyntaxException(var2.id_break(), "Unsupported protocol: " + var4.toLowerCase(Locale.ROOT));
                  }

                  if (((Qw_1)this.id_volatile.id_class[20]).id_const) {
                     this.id_case = var3;
                     this.id_volatile.id_break(new mq_3(this::id_byte, var2.id_break(), false));
                  } else {
                     this.id_class(var3);
                  }
               } catch (URISyntaxException var5) {
                  id_class.error("Can't open url for {}", var2, var5);
               }
            } else if (var2.id_class() == rgH_2.OPEN_FILE) {
               URI var6 = new File(var2.id_break()).toURI();
               this.id_class(var6);
            } else if (var2.id_class() == rgH_2.SUGGEST_COMMAND) {
               this.id_class(var2.id_break(), true);
            } else if (var2.id_class() == rgH_2.RUN_COMMAND) {
               this.id_break(var2.id_break(), false);
            } else if (var2.id_class() == rgH_2.RUNNABLE) {
               var2.id_byte().run();
            } else if (var2.id_class() == rgH_2.COPY_TO_CLIPBOARD) {
               ((Qj_1)this.id_volatile.id_class[23]).id_class(var2.id_break());
            } else {
               id_class.error("Don't know how to handle {}", var2);
            }

            return true;
         }

         return false;
      }
   }

   protected void id_class(String var1, boolean var2) {
   }

   protected void id_class(Ml_1 var1, rgc_3 var2, int var3, int var4) {
      if (var2 != null && var2.id_implements() != null) {
         rgy_3 var5 = var2.id_implements();
         rgT_2 var6 = var5.id_class(rgp_3.id_break);
         if (var6 != null) {
            this.id_class(var1, var6.id_class(), var3, var4);
         } else {
            rgq_3 var7 = var5.id_class(rgp_3.id_byte);
            if (var7 != null) {
               if (((Qw_1)this.id_volatile.id_class[20]).id_int) {
                  this.id_class(var1, var7.id_break(), var3, var4);
               }
            } else {
               rgP_2 var8 = var5.id_class(rgp_3.id_class);
               if (var8 != null) {
                  this.id_break(var1, ((cm_3)this.id_volatile.id_class[15]).id_break(var8, Math.max(this.id_package / 2, 200)), var3, var4);
               }
            }
         }
      }
   }

   protected boolean id_class(String var1, char var2, int var3) {
      int var4 = var1.indexOf(58);
      int var5 = var1.indexOf(47);
      if (var2 == ':') {
         return (var5 == -1 || var3 <= var5) && var4 == -1;
      } else {
         return var2 == '/' ? var3 > var4 : var2 == '_' || var2 == '-' || var2 >= 'a' && var2 <= 'z' || var2 >= '0' && var2 <= '9' || var2 == '.';
      }
   }

   public static void id_class(Runnable var0, String var1, String var2) {
      try {
         var0.run();
      } catch (Throwable var6) {
         KY var4 = KY.id_class(var6, var1);
         Ko_1 var5 = var4.id_class("Affected screen");
         var5.id_class("Screen name", () -> var2);
         throw new KU(var4);
      }
   }

   public void id_class(QY var1, int var2, int var3) {
      this.id_break(var1, var2, var3);
   }

   private void id_class(URI var1) {
      rqR_2.id_implements().id_class(var1);
   }

   protected void id_class(Ml_1 var1, rdn_3 var2, int var3, int var4) {
      this.id_class(var1, this.id_class(var2), var3, var4);
   }

   public List<rgP_2> id_class(rdn_3 var1) {
      return var1.id_class((cb_3)this.id_volatile.id_class[57], ((Qw_1)this.id_volatile.id_class[20]).id_int ? VU.ADVANCED : VU.NORMAL);
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      for (int var5 = 0; var5 < this.id_new.size(); var5++) {
         this.id_new.get(var5).id_class(var1, var2, var3, var4);
      }
   }

   @Override
   public boolean id_class(int var1, int var2, int var3) {
      if (var1 == 256 && this.E_()) {
         if (!rrFY.id_class(this).id_byte()) {
            if (this instanceof rrZv_1) {
               this.id_goto();
            } else {
               this.id_volatile();
               this.id_try();
            }

            return true;
         } else {
            return false;
         }
      } else if (var1 == 258) {
         boolean var4 = !id_synchronized();
         if (!this.id_break(var4)) {
            this.id_break(var4);
         }

         return false;
      } else {
         return super.id_class(var1, var2, var3);
      }
   }

   public <T extends LZ> T id_class(T var1) {
      this.id_new.add(var1);
      return this.id_protected((T)var1);
   }

   public void id_class(Ml_1 var1, rgP_2 var2, int var3, int var4) {
      this.id_break(var1, Arrays.asList(var2.id_catch()), var3, var4);
   }

   public void id_class(Ml_1 var1, List<rgP_2> var2, int var3, int var4) {
      this.id_break(var1, Lists.transform(var2, rgP_2::id_catch), var3, var4);
   }

   @Override
   public boolean id_break(double var1, double var3) {
      return true;
   }

   public void id_break(Ml_1 var1, List<? extends rpl_3> var2, int var3, int var4) {
      if (!var2.isEmpty()) {
         int var5 = 0;

         for (rpl_3 var7 : var2) {
            int var8 = this.id_super.id_class(var7);
            if (var8 > var5) {
               var5 = var8;
            }
         }

         int var19 = var3 + 12;
         int var20 = var4 - 12;
         int var21 = 8;
         if (var2.size() > 1) {
            var21 += 2 + (var2.size() - 1) * 10;
         }

         if (var19 + var5 > this.id_package) {
            var19 -= 28 + var5;
         }

         if (var20 + this.id_this + var21 + 6 > this.id_int) {
            var20 = this.id_int - this.id_this - var21 - 6;
         }

         int var9 = var19 - 4;
         int var10 = var20 - 4;
         int var11 = var5 + 6;
         int var12 = var21 + 8;
         var1.id_class();
         yb_3 var13 = yb_3.id_class();
         lD_2 var14 = var13.id_byte();
         var14.id_class(7, ju_3.id_this);
         rjV_2 var15 = var1.id_byte().id_class();
         id_class(var15, var14, var19 - 3, var20 - 4, var19 + var5 + 3, var20 - 3, 400, -267386864, -267386864);
         id_class(var15, var14, var19 - 3, var20 + var21 + 3, var19 + var5 + 3, var20 + var21 + 4, 400, -267386864, -267386864);
         id_class(var15, var14, var19 - 3, var20 - 3, var19 + var5 + 3, var20 + var21 + 3, 400, -267386864, -267386864);
         id_class(var15, var14, var19 - 4, var20 - 3, var19 - 3, var20 + var21 + 3, 400, -267386864, -267386864);
         id_class(var15, var14, var19 + var5 + 3, var20 - 3, var19 + var5 + 4, var20 + var21 + 3, 400, -267386864, -267386864);
         id_class(var15, var14, var19 - 3, var20 - 3 + 1, var19 - 3 + 1, var20 + var21 + 3 - 1, 400, 1347420415, 1344798847);
         id_class(var15, var14, var19 + var5 + 2, var20 - 3 + 1, var19 + var5 + 3, var20 + var21 + 3 - 1, 400, 1347420415, 1344798847);
         id_class(var15, var14, var19 - 3, var20 - 3, var19 + var5 + 3, var20 - 3 + 1, 400, 1347420415, 1347420415);
         id_class(var15, var14, var19 - 3, var20 + var21 + 2, var19 + var5 + 3, var20 + var21 + 3, 400, 1344798847, 1344798847);
         RenderSystem.enableDepthTest();
         RenderSystem.disableTexture();
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.shadeModel(7425);
         var14.id_finally();
         yk_3.id_class(var14);
         RenderSystem.shadeModel(7424);
         RenderSystem.disableBlend();
         RenderSystem.enableTexture();
         Hd_1 var16 = Hx_1.id_class(yb_3.id_class().id_byte());
         var1.id_class(0.0, 0.0, 400.0);

         for (int var17 = 0; var17 < var2.size(); var17++) {
            rpl_3 var18 = (rpl_3)var2.get(var17);
            if (var18 != null) {
               this.id_super.id_class(var18, (float)var19, (float)var20, -1, true, var15, var16, false, 0, 15728880);
            }

            if (var17 == 0) {
               var20 += 2;
            }

            var20 += 10;
         }

         var16.id_break();
         var1.id_break();
         this.id_private = new vZ_2((float)var9, (float)var10, (float)var11, (float)var12);
         this.id_this = 0;
      }
   }

   public void id_break(String var1) {
      this.id_break(var1, true);
   }

   public void id_break(QY var1, int var2, int var3) {
      this.id_volatile = var1;
      this.id_final = var1.id_float();
      this.id_super = (cm_3)var1.id_class[15];
      this.id_package = var2;
      this.id_int = var3;
      this.id_new.clear();
      this.id_native.clear();
      this.id_class((cC_2)null);
      this.v_();
   }

   public void id_break(String var1, boolean var2) {
      if (var2) {
         ((cq_3)this.id_volatile.id_class[19]).id_throws().id_class(var1);
      }

      ((cb_3)this.id_volatile.id_class[57]).id_protected(var1);
   }

   public static boolean id_throws(int var0) {
      return var0 == 88 && id_else() && !id_synchronized() && !id_return();
   }

   public static boolean id_catch(int var0) {
      return var0 == 67 && id_else() && !id_synchronized() && !id_return();
   }

   public void id_goto() {
      this.id_catch = true;
      ((Qi_1)id_import.id_class[22]).id_break(false);
      this.id_try();
   }

   public static boolean id_case(int var0) {
      return var0 == 86 && id_else() && !id_synchronized() && !id_return();
   }

   public void id_continue() {
      this.id_catch = false;
   }

   public static boolean id_else() {
      return QY.id_break[2]
         ? Ve_1.id_class(QY.id_instanceof().id_else().id_implements(), 343) || Ve_1.id_class(QY.id_instanceof().id_else().id_implements(), 347)
         : Ve_1.id_class(QY.id_instanceof().id_else().id_implements(), 341) || Ve_1.id_class(QY.id_instanceof().id_else().id_implements(), 345);
   }

   public void id_implements(int var1) {
      this.id_implements = var1;
   }

   public vZ_2 id_instanceof() {
      return this.id_private;
   }

   public rgP_2 id_new() {
      return this.id_extends;
   }

   public static boolean id_return() {
      return Ve_1.id_class(QY.id_instanceof().id_else().id_implements(), 342) || Ve_1.id_class(QY.id_instanceof().id_else().id_implements(), 346);
   }

   public void id_super() {
      this.id_private = null;
      this.id_implements++;
      rrAZ.id_class(this);
   }

   public int id_throw() {
      return this.id_implements;
   }

   public void id_try() {
   }

   public List<LZ> id_while() {
      return this.id_new;
   }

   public boolean id_public() {
      return this.id_catch;
   }

   protected <T extends cC_2> T id_protected(T var1) {
      this.id_native.add(var1);
      return (T)var1;
   }

   public void id_protected(int var1) {
      yb_3 var2 = yb_3.id_class();
      lD_2 var3 = var2.id_byte();
      this.id_volatile.A().id_class(id_break);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      float var4 = 32.0F;
      var3.id_class(7, ju_3.id_public);
      var3.id_class(0.0, (double)this.id_int, 0.0).id_class(0.0F, (float)this.id_int / 32.0F + (float)var1).id_break(64, 64, 64, 255).id_class();
      var3.id_class((double)this.id_package, (double)this.id_int, 0.0)
         .id_class((float)this.id_package / 32.0F, (float)this.id_int / 32.0F + (float)var1)
         .id_break(64, 64, 64, 255)
         .id_class();
      var3.id_class((double)this.id_package, 0.0, 0.0).id_class((float)this.id_package / 32.0F, (float)var1).id_break(64, 64, 64, 255).id_class();
      var3.id_class(0.0, 0.0, 0.0).id_class(0.0F, (float)var1).id_break(64, 64, 64, 255).id_class();
      var2.id_break();
   }

   public static boolean id_private(int var0) {
      return var0 == 65 && id_else() && !id_synchronized() && !id_return();
   }

   @Override
   public void id_private() {
      if (this instanceof rrZv_1 var1 && var1.id_final()) {
         this.id_volatile();
      }
   }

   public void id_volatile() {
      this.id_volatile.id_break((vm_3)null);
   }

   public static boolean id_synchronized() {
      return Ve_1.id_class(QY.id_instanceof().id_else().id_implements(), 340) || Ve_1.id_class(QY.id_instanceof().id_else().id_implements(), 344);
   }

   public void a_(List<Path> var1) {
   }

   public String D_() {
      return this.id_new().getString();
   }

   public boolean E_() {
      return true;
   }

   @Override
   public List<? extends cC_2> x_() {
      return this.id_native;
   }

   protected void v_() {
      this.id_implements = 0;
      rrLU.id_class(this);
   }

   public boolean z_() {
      return true;
   }

   public void w_() {
   }
}
