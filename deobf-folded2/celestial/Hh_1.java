package celestial;

import com.google.gson.JsonSyntaxException;
import com.mojang.blaze3d.platform.GLX;
import com.mojang.blaze3d.systems.RenderSystem;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Hh_1 implements AutoCloseable, rAn_1 {
   private static final rqO_2 id_byte = new rqO_2("textures/misc/nausea.png");
   private static final Logger id_protected = LogManager.getLogger();
   private final QY id_throws;
   private final rAL id_case;
   private final Random id_catch = new Random();
   private float id_private;
   public final HB id_class;
   private final ct_3 id_implements;
   private final yB_2 id_finally;
   private int id_extends;
   private float id_native;
   private float id_volatile;
   private float id_final;
   private float id_package;
   private final boolean id_int = true;
   private final boolean id_new = true;
   private long id_continue;
   private long id_super = rqR_2.id_break();
   private final HQ id_this;
   private final fZ_2 id_else = new fZ_2();
   private boolean id_synchronized;
   private final float id_return = 1.0F;
   private float id_public;
   private float id_goto;
   private rdn_3 id_while;
   private int id_try;
   private float id_instanceof;
   private float id_throw;
   private Vq_1 id_interface;
   private rjV_2 id_char = new rjV_2();
   private static final rqO_2[] id_abstract = new rqO_2[]{
      new rqO_2("shaders/post/notch.json"),
      new rqO_2("shaders/post/fxaa.json"),
      new rqO_2("shaders/post/art.json"),
      new rqO_2("shaders/post/bumpy.json"),
      new rqO_2("shaders/post/blobs2.json"),
      new rqO_2("shaders/post/pencil.json"),
      new rqO_2("shaders/post/color_convolve.json"),
      new rqO_2("shaders/post/deconverge.json"),
      new rqO_2("shaders/post/flip.json"),
      new rqO_2("shaders/post/invert.json"),
      new rqO_2("shaders/post/ntsc.json"),
      new rqO_2("shaders/post/outline.json"),
      new rqO_2("shaders/post/phosphor.json"),
      new rqO_2("shaders/post/scan_pincushion.json"),
      new rqO_2("shaders/post/sobel.json"),
      new rqO_2("shaders/post/bits.json"),
      new rqO_2("shaders/post/desaturate.json"),
      new rqO_2("shaders/post/green.json"),
      new rqO_2("shaders/post/blur.json"),
      new rqO_2("shaders/post/wobble.json"),
      new rqO_2("shaders/post/blobs.json"),
      new rqO_2("shaders/post/antialias.json"),
      new rqO_2("shaders/post/creeper.json"),
      new rqO_2("shaders/post/spider.json")
   };
   public static final int id_break = id_abstract.length;
   private int id_long = id_break;
   private boolean id_float;
   private final ly_3 id_void = new ly_3();
   private boolean id_static = false;
   private rYB id_import = null;
   private float id_short = 128.0F;
   private long id_default = 0L;
   private int id_const = 0;
   private int id_strictfp = 0;
   private int id_boolean = 0;
   private float id_transient = 0.0F;
   private float id_for = 0.0F;
   private final Vq_1[] id_double = new Vq_1[10];
   private boolean id_switch = false;
   private long r;

   private void id_byte(float var1) {
      int var2 = this.id_throws.id_else().id_super();
      int var3 = this.id_throws.id_else().id_this();
      double var4 = rfU_2.id_protected((double)var1, 2.0, 1.0);
      float var6 = 0.2F * var1;
      float var7 = 0.4F * var1;
      float var8 = 0.2F * var1;
      double var9 = (double)var2 * var4;
      double var11 = (double)var3 * var4;
      double var13 = ((double)var2 - var9) / 2.0;
      double var15 = ((double)var3 - var11) / 2.0;
      RenderSystem.disableDepthTest();
      RenderSystem.depthMask(false);
      RenderSystem.enableBlend();
      RenderSystem.blendFuncSeparate(OP.ONE, MK.ONE, OP.ONE, MK.ONE);
      RenderSystem.color4f(var6, var7, var8, 1.0F);
      this.id_throws.A().id_class(id_byte);
      yb_3 var17 = yb_3.id_class();
      lD_2 var18 = var17.id_byte();
      var18.id_class(7, ju_3.id_synchronized);
      var18.id_class(var13, var15 + var11, -90.0).id_class(0.0F, 1.0F).id_class();
      var18.id_class(var13 + var9, var15 + var11, -90.0).id_class(1.0F, 1.0F).id_class();
      var18.id_class(var13 + var9, var15, -90.0).id_class(1.0F, 0.0F).id_class();
      var18.id_class(var13, var15, -90.0).id_class(0.0F, 0.0F).id_class();
      var17.id_break();
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.defaultBlendFunc();
      RenderSystem.disableBlend();
      RenderSystem.depthMask(true);
      RenderSystem.enableDepthTest();
   }

   public void id_byte() {
      this.id_float = !this.id_float;
   }

   private boolean id_int() {
      Objects.requireNonNull(this);
      an_3 var1 = this.id_throws.id_catch();
      boolean var2 = var1 instanceof rhd_3 && !((Qw_1)this.id_throws.id_class[20]).g;
      if (var2 && !((rhx_3)((rhd_3)var1).id_implements[18]).id_throws) {
         rdn_3 var3 = ((iB_2)var1).ss();
         rjG_2 var4 = (rjG_2)this.id_throws.id_class[64];
         if (var4 != null && var4.id_byte() == rjM_2.BLOCK) {
            rfH_2 var5 = ((rff_3)var4).id_class();
            xc_3 var6 = ((gm_3)this.id_throws.id_class[56]).id_byte(var5);
            if (((Ax_1)this.id_throws.id_class[55]).id_native() == rRl_1.SPECTATOR) {
               var2 = var6.id_break((gm_3)this.id_throws.id_class[56], var5) != null;
            } else {
               ryw_3 var7 = new ryw_3((gm_3)this.id_throws.id_class[56], var5, false);
               var2 = !var3.id_class()
                  && (var3.id_class(((gm_3)this.id_throws.id_class[56]).id_int(), var7) || var3.id_break(((gm_3)this.id_throws.id_class[56]).id_int(), var7));
            }
         }
      }

      return var2;
   }

   public Hh_1(QY var1, rAL var2, yB_2 var3) {
      this.id_throws = var1;
      this.id_case = var2;
      this.id_class = var1.id_import();
      this.id_implements = new ct_3(var1.A());
      this.id_this = new HQ(this, var1);
      this.id_finally = var3;
      this.id_interface = null;
   }

   public void id_class(Qg_1 var1, double var2) {
      RenderSystem.clear(256, (Boolean)QY.id_break[2]);
      RenderSystem.matrixMode(5889);
      RenderSystem.loadIdentity();
      double var4 = (double)var1.id_extends() / var2;
      double var6 = (double)var1.id_native() / var2;
      RenderSystem.ortho(0.0, var4, var6, 0.0, 1000.0, 3000.0);
      RenderSystem.matrixMode(5888);
      RenderSystem.loadIdentity();
      RenderSystem.translatef(0.0F, 0.0F, -2000.0F);
   }

   public void id_class(an_3 var1) {
      if (this.id_interface != null) {
         this.id_interface.close();
      }

      this.id_interface = null;
      if (var1 instanceof rEJ) {
         this.id_class(new rqO_2("shaders/post/creeper.json"));
      } else if (var1 instanceof rGw_1) {
         this.id_class(new rqO_2("shaders/post/spider.json"));
      } else if (var1 instanceof rEu_1) {
         this.id_class(new rqO_2("shaders/post/invert.json"));
      } else if (rrxr_3.rF.id_byte()) {
         rrxr_3.id_private(rrxr_3.rF, var1, this);
      }
   }

   public void id_class(float var1, long var2, Ml_1 var4) {
      this.id_this.id_class(var1);
      if (this.id_throws.id_catch() == null) {
         this.id_throws.id_break((cb_3)this.id_throws.id_class[57]);
      }

      this.id_class(var1);
      if (rrbb_3.rs()) {
         rrdZ.id_class(this.id_throws, this.id_void, var1, var2);
      }

      boolean var5 = rrbb_3.rs();
      if (var5) {
         rrdZ.id_class(var1, var2);
      }

      boolean var6 = this.id_int();
      ly_3 var7 = this.id_void;
      this.id_private = (float)(((Qw_1)this.id_throws.id_class[20]).id_break * 16);
      if (rrbb_3.id_this()) {
         this.id_private *= 0.95F;
      }

      if (rrbb_3.id_else()) {
         this.id_private *= 0.83F;
      }

      Ml_1 var8 = new Ml_1();
      var8.id_byte().id_class().id_class(this.id_class(var7, var1, true));
      Ml_1 var9 = var8;
      if (rrdZ.rr()) {
         var8 = var4;
      }

      if (((Qw_1)this.id_throws.id_class[20]).E > 0.0) {
         this.id_class(var8, var1);
      }

      if (rrdZ.rr()) {
         var8 = var9;
      }

      rjV_2 var10 = var8.id_byte().id_class();
      this.id_class(var10);
      var7.id_class(
         this.id_throws,
         (gm_3)this.id_throws.id_class[56],
         (an_3)(this.id_throws.id_catch() == null ? (cb_3)this.id_throws.id_class[57] : this.id_throws.id_catch()),
         !((Qw_1)this.id_throws.id_class[20]).id_volatile().id_class(),
         ((Qw_1)this.id_throws.id_class[20]).id_volatile().id_break(),
         var1
      );
      var4.id_class(rje_3.id_break.id_byte(var7.id_protected()));
      var4.id_class(rje_3.id_protected.id_byte(var7.id_throws() + 180.0F));
      ((yX_2)this.id_throws.id_class[8]).id_class(var4, var1, var2, var6, var7, this, this.id_this, var10);
      this.id_char = var10.id_case();
      rjV_2 var11 = var4.id_byte().id_class();
      this.id_char.id_class(var11);
      rrfa_3.id_class(var10, var11, var1);
      RenderEvent.id_class(var4, var11, var1);
      Objects.requireNonNull(this);
      if (!rrdZ.id_new) {
         if (var5) {
            rrdL.id_break(this, var4, var7, var1);
            rrdZ.id_float();
         }

         RenderSystem.clear(256, (Boolean)QY.id_break[2]);
         if (var5) {
            rrdL.id_byte(this, var4, var7, var1);
         } else {
            this.id_class(var4, var7, var1);
         }
      }

      if (var5) {
         rrdZ.id_import();
      }
   }

   public void id_class(float var1, long var2, boolean var4) {
      this.id_continue();
      if (!this.id_throws.id_static()
         && ((Qw_1)this.id_throws.id_class[20]).id_new
         && (!((Qw_1)this.id_throws.id_class[20]).S || !((Qi_1)this.id_throws.id_class[22]).id_break())) {
         if (this.r < 2L) {
            this.r++;
         }

         if (this.r == 1L) {
            rrfc_3.id_class();
         }

         if (rqR_2.id_break() - this.id_super > 500L) {
            this.id_throws.id_break(false);
         }
      } else {
         this.id_super = rqR_2.id_break();
      }

      if (!(Boolean)this.id_throws.id_class[72]) {
         int var5 = (int)(
            ((Qi_1)this.id_throws.id_class[22]).id_byte() * (double)this.id_throws.id_else().id_super() / (double)this.id_throws.id_else().id_new()
         );
         int var6 = (int)(
            ((Qi_1)this.id_throws.id_class[22]).id_protected() * (double)this.id_throws.id_else().id_this() / (double)this.id_throws.id_else().id_continue()
         );
         if (var4 && (gm_3)this.id_throws.id_class[56] != null && !rrbb_3.rw()) {
            this.id_class(var1, var2, new Ml_1());
            if (this.id_throws.id_finally() && this.id_continue < rqR_2.id_break() - 1000L) {
               this.id_continue = rqR_2.id_break();
               if (!this.id_throws.id_this().id_while()) {
                  this.id_package();
               }
            }

            ((yX_2)this.id_throws.id_class[8]).id_byte();
            if (this.id_interface != null && this.id_float) {
               RenderSystem.disableBlend();
               RenderSystem.disableDepthTest();
               RenderSystem.disableAlphaTest();
               RenderSystem.enableTexture();
               RenderSystem.matrixMode(5890);
               RenderSystem.pushMatrix();
               RenderSystem.loadIdentity();
               this.id_interface.id_class(var1);
               RenderSystem.popMatrix();
               RenderSystem.enableTexture();
            }

            this.id_throws.B().id_class(true);
         } else {
            RenderSystem.viewport(0, 0, this.id_throws.id_else().id_extends(), this.id_throws.id_else().id_native());
         }

         Qg_1 var7 = this.id_throws.id_else();
         this.id_class(var7, var7.id_return());
         HF.id_protected();
         Ml_1 var8 = new Ml_1();
         if (this.id_this.id_throws()) {
            this.id_this.id_class(false);
         }

         rrnG_2 var9 = rrnG_2.id_class((vm_3)this.id_throws.id_class[73], var8, var5, var6, var1);
         ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).id_class(var9);
         QY var10000 = this.id_throws;
         vm_3 var19;
         vm_3 var30 = var19 = var9.id_break();
         var10000.id_class[74] = var19;
         vm_3 var10 = var30;
         if (var4 && (gm_3)this.id_throws.id_class[56] != null && (!((Qw_1)this.id_throws.id_class[20]).g || var10 != null)) {
            RenderSystem.defaultAlphaFunc();
            this.id_class(this.id_throws.id_else().id_super(), this.id_throws.id_else().id_this(), var1);
            ((cq_3)this.id_throws.id_class[19]).id_class(var8, var1);
            if (((Qw_1)this.id_throws.id_class[20]).rC && !((Qw_1)this.id_throws.id_class[20]).R) {
               rrbb_3.id_class(var8);
            }

            RenderSystem.clear(256, (Boolean)QY.id_break[2]);
         }

         if (this.id_switch == ((cT_2)this.id_throws.id_class[75] == null)) {
            if ((cT_2)this.id_throws.id_class[75] != null) {
               cj_3.id_class(this.id_throws);
               cT_2 var12 = (cT_2)this.id_throws.id_class[75];
               if (var12 instanceof cj_3 var11) {
                  var11.id_protected();
               }
            }

            this.id_switch = (cT_2)this.id_throws.id_class[75] != null;
         }

         if ((cT_2)this.id_throws.id_class[75] != null) {
            try {
               ((cT_2)this.id_throws.id_class[75]).id_class(var8, var5, var6, this.id_throws.id_default());
            } catch (Throwable var23) {
               KY var25 = KY.id_class(var23, "Rendering overlay");
               Ko_1 var13 = var25.id_class("Overlay render details");
               var13.id_class("Overlay name", () -> ((cT_2)this.id_throws.id_class[75]).getClass().getCanonicalName());
               throw new KU(var25);
            }
         } else if (var10 != null) {
            try {
               boolean var24 = ((Qw_1)this.id_throws.id_class[20]).rs != 2;
               if (var24 && var10 instanceof rrvE) {
                  this.id_class(var7, 2.0);
               }

               int var27 = (int)(((Qi_1)this.id_throws.id_class[22]).id_byte() * (double)var7.id_volatile() / (double)var7.id_new());
               int var29 = (int)(((Qi_1)this.id_throws.id_class[22]).id_protected() * (double)var7.id_final() / (double)var7.id_continue());
               var10.id_class(var8, var5, var6, this.id_throws.id_default());
               if (var10 instanceof ClickGuiScreen) {
                  ClickGuiScreen var14 = (ClickGuiScreen)ClickGuiScreen.id_class[0];
                  var14.id_byte(false);
                  var14.id_class(var8, (Integer)rrvk_1.id_class[0], (Integer)rrvk_1.id_class[1], this.id_throws.id_default());
                  var14.id_byte(true);
               }

               Integer var20 = var27;
               rrvk_1.id_class[0] = var20;
               Integer var21 = var29;
               rrvk_1.id_class[1] = var21;
               ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrnS_2.id_class(var10, var8, var5, var6, var1));
            } catch (Throwable var22) {
               KY var26 = KY.id_class(var22, "Rendering screen");
               Ko_1 var28 = var26.id_class("Screen render details");
               var28.id_class("Screen name", () -> var10.getClass().getCanonicalName());
               var28.id_class(
                  "Mouse location",
                  () -> String.format(
                        Locale.ROOT,
                        "Scaled: (%d, %d). Absolute: (%f, %f)",
                        var5,
                        var6,
                        ((Qi_1)this.id_throws.id_class[22]).id_byte(),
                        ((Qi_1)this.id_throws.id_class[22]).id_protected()
                     )
               );
               var28.id_class(
                  "Screen size",
                  () -> String.format(
                        Locale.ROOT,
                        "Scaled: (%d, %d). Absolute: (%d, %d). Scale factor of %f",
                        this.id_throws.id_else().id_super(),
                        this.id_throws.id_else().id_this(),
                        this.id_throws.id_else().id_extends(),
                        this.id_throws.id_else().id_native(),
                        this.id_throws.id_else().id_return()
                     )
               );
               throw new KU(var26);
            }
         }

         this.id_this.id_class(true);
         ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).id_class(var8);
      }

      this.id_super();
      this.id_new();
      rrWU.id_class();
      if (((Qw_1)this.id_throws.id_class[20]).rn) {
         ((Qw_1)this.id_throws.id_class[20]).Y = true;
      }
   }

   public static float id_class(iB_2 var0, float var1) {
      int var2 = var0.id_byte(rLD.id_int).id_break();
      return var2 > 200 ? 1.0F : 0.7F + rfU_2.id_class(((float)var2 - var1) * (float) Math.PI * 0.2F) * 0.3F;
   }

   public rjV_2 id_class(ly_3 var1, float var2, boolean var3) {
      Ml_1 var4 = new Ml_1();
      var4.id_byte().id_class().id_class();
      if (rrbb_3.rs() && rrdZ.R()) {
         rrdZ.id_case(var4);
      }

      this.id_short = this.id_private * 2.0F;
      if (this.id_short < 173.0F) {
         this.id_short = 173.0F;
      }

      if (1.0F != 1.0F) {
         var4.id_class((double)this.id_public, (double)(-this.id_goto), 0.0);
         var4.id_class(1.0F, 1.0F, 1.0F);
      }

      var4.id_byte()
         .id_class()
         .id_class(
            rjV_2.id_class(
               this.id_break(var1, var2, var3),
               (float)this.id_throws.id_else().id_extends() / (float)this.id_throws.id_else().id_native(),
               0.05F,
               this.id_short
            )
         );
      return var4.id_byte().id_class();
   }

   private void id_class(int var1, int var2, float var3) {
      if (this.id_while != null && this.id_try > 0) {
         int var4 = 40 - this.id_try;
         float var5 = ((float)var4 + var3) / 40.0F;
         float var6 = var5 * var5;
         float var7 = var5 * var6;
         float var8 = 10.25F * var7 * var6 - 24.95F * var6 * var6 + 25.5F * var7 - 13.8F * var6 + 4.0F * var5;
         float var9 = var8 * (float) Math.PI;
         float var10 = this.id_instanceof * (float)(var1 / 4);
         float var11 = this.id_throw * (float)(var2 / 4);
         RenderSystem.enableAlphaTest();
         RenderSystem.pushMatrix();
         RenderSystem.pushLightingAttributes();
         RenderSystem.enableDepthTest();
         RenderSystem.disableCull();
         Ml_1 var12 = new Ml_1();
         var12.id_class();
         var12.id_class(
            (double)((float)(var1 / 2) + var10 * rfU_2.id_throws(rfU_2.id_class(var9 * 2.0F))),
            (double)((float)(var2 / 2) + var11 * rfU_2.id_throws(rfU_2.id_class(var9 * 2.0F))),
            -50.0
         );
         float var13 = 50.0F + 175.0F * rfU_2.id_class(var9);
         var12.id_class(var13, -var13, var13);
         var12.id_class(rje_3.id_protected.id_byte(900.0F * rfU_2.id_throws(rfU_2.id_class(var9))));
         var12.id_class(rje_3.id_break.id_byte(6.0F * rfU_2.id_break(var5 * 8.0F)));
         var12.id_class(rje_3.id_case.id_byte(6.0F * rfU_2.id_break(var5 * 8.0F)));
         Hd_1 var14 = this.id_finally.id_break();
         this.id_throws.id_float().id_class(this.id_while, IQ.FIXED, 15728880, fZ_2.id_class, var12, var14);
         var12.id_break();
         var14.id_break();
         RenderSystem.popAttributes();
         RenderSystem.popMatrix();
         RenderSystem.enableCull();
         RenderSystem.disableDepthTest();
      }
   }

   public void id_class(rdn_3 var1) {
      this.id_while = var1;
      this.id_try = 40;
      this.id_instanceof = this.id_catch.nextFloat() * 2.0F - 1.0F;
      this.id_throw = this.id_catch.nextFloat() * 2.0F - 1.0F;
   }

   public boolean id_class(int var1) {
      if (!GLX.isUsingFBOs()) {
         return false;
      } else if (this.id_interface != null && this.id_interface != this.id_double[2] && this.id_interface != this.id_double[4]) {
         return true;
      } else if (var1 != 2 && var1 != 4) {
         if (this.id_interface == null) {
            return true;
         } else {
            this.id_interface.close();
            this.id_interface = null;
            return true;
         }
      } else if (this.id_interface != null && this.id_interface == this.id_double[var1]) {
         return true;
      } else if ((gm_3)this.id_throws.id_class[56] == null) {
         return true;
      } else {
         this.id_class(new rqO_2("shaders/post/fxaa_of_" + var1 + "x.json"));
         this.id_double[var1] = this.id_interface;
         return this.id_float;
      }
   }

   private void id_class(vB_2 var1) {
      try {
         String var2 = null;
         Calendar var3 = Calendar.getInstance();
         var3.setTime(new Date());
         int var4 = var3.get(5);
         int var5 = var3.get(2) + 1;
         if (var4 == 8 && var5 == 4) {
            var2 = "Happy birthday, OptiFine!";
         }

         if (var4 == 14 && var5 == 8) {
            var2 = "Happy birthday, sp614x!";
         }

         if (var2 == null) {
            return;
         }

         rrxr_3.id_class(var1, rrxr_3.SX, var2);
      } catch (Throwable var6) {
      }
   }

   public void id_class(float var1) {
      an_3 var2 = this.id_throws.id_catch();
      if (var2 != null && (gm_3)this.id_throws.id_class[56] != null) {
         Object var24 = null;
         this.id_throws.id_class[63] = var24;
         double var3 = (double)((Ax_1)this.id_throws.id_class[55]).id_byte();
         rrAz_1 var5 = rrAz_1.id_class(var2.id_break(var3, var1, false), 3.0, var3, var2.id_new(var1), var2.rN(), var2.rO(), false, var1);
         rrAz_1.id_class(var5);
         QY var10000 = this.id_throws;
         rjG_2 var25 = var5.id_break();
         var10000.id_class[64] = var25;
         if ((rjG_2)this.id_throws.id_class[64] != null && ((rjG_2)this.id_throws.id_class[64]).id_byte() == rjM_2.NONE) {
            return;
         }

         rjU_2 var6 = var5.id_throws();
         boolean var7 = false;
         double var8 = var3;
         if (!var5.id_byte() && ((Ax_1)this.id_throws.id_class[55]).id_private()) {
            var8 = 6.0;
            var3 = var8;
         } else if (var3 > 3.0) {
            var7 = true;
         }

         var8 *= var8;
         if ((rjG_2)this.id_throws.id_class[64] != null) {
            var8 = ((rjG_2)this.id_throws.id_class[64]).id_case().id_implements(var6);
         }

         PX var10 = var5.id_catch();
         rjU_2 var11 = var2.id_class(var10.id_throws(), var10.id_protected(), 1.0F);
         rjU_2 var12 = var6.id_break(var11.id_break * var3, var11.id_byte * var3, var11.id_protected * var3);
         rfl_3 var13 = var5.id_implements().id_break(var11.id_class(var3)).id_byte(1.0, 1.0, 1.0);
         rfo_3 var14 = rhj_3.id_class(var2, var6, var12, var13, var0 -> !var0.id_native() && var0.rY(), var8);
         if (var14 != null) {
            rrAW var15 = rrAW.id_class(var14);
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(var15);
            an_3 var16 = var14.id_class();
            rjU_2 var17 = var14.id_case();
            double var18 = var6.id_implements(var17);
            if (var7 && var18 > 9.0) {
               var10000 = this.id_throws;
               rff_3 var26 = rff_3.id_class(var17, rpr_3.id_class(var11.id_break, var11.id_byte, var11.id_protected), new rfH_2(var17));
               var10000.id_class[64] = var26;
            } else if (!var15.id_byte() && (var18 < var8 || (rjG_2)this.id_throws.id_class[64] == null)) {
               var10000 = this.id_throws;
               rfo_3 var27 = var15.id_class();
               var10000.id_class[64] = var27;
               if (var16 instanceof iB_2 || var16 instanceof rsG_2) {
                  this.id_throws.id_class[63] = var16;
               }
            }
         }
      }
   }

   public void id_class(int var1, int var2) {
      if (this.id_interface != null) {
         this.id_interface.id_class(var1, var2);
      }

      ((yX_2)this.id_throws.id_class[8]).id_class(var1, var2);
   }

   public void id_class(Vq_1 var1) {
      this.id_interface = var1;
   }

   @Override
   public void id_class(rAL var1) {
      if (this.id_interface != null) {
         this.id_interface.close();
      }

      this.id_interface = null;
      if (this.id_long == id_break) {
         this.id_class(this.id_throws.id_catch());
      } else {
         this.id_class(id_abstract[this.id_long]);
      }
   }

   public void id_class(rqO_2 var1) {
      if (GLX.isUsingFBOs()) {
         if (this.id_interface != null) {
            this.id_interface.close();
         }

         try {
            this.id_interface = new Vq_1(this.id_throws.A(), this.id_case, this.id_throws.B(), var1);
            this.id_interface.id_class(this.id_throws.id_else().id_extends(), this.id_throws.id_else().id_native());
            this.id_float = true;
         } catch (IOException var3) {
            id_protected.warn("Failed to load shader: {}", var1, var3);
            this.id_long = id_break;
            this.id_float = false;
         } catch (JsonSyntaxException var4) {
            id_protected.warn("Failed to parse shader: {}", var1, var4);
            this.id_long = id_break;
            this.id_float = false;
         }
      }
   }

   private void id_class(Ml_1 var1, ly_3 var2, float var3) {
      this.id_class(var1, var2, var3, true, true, false);
   }

   public void id_class(Ml_1 var1, ly_3 var2, float var3, boolean var4, boolean var5, boolean var6) {
      if (!this.id_synchronized) {
         rrdZ.id_break(var6);
         this.id_class(this.id_class(var2, var3, false));
         MH var7 = var1.id_byte();
         var7.id_class().id_class();
         var7.id_break().id_byte();
         boolean var8 = false;
         if (var4) {
            var1.id_class();
            if (((Qw_1)this.id_throws.id_class[20]).E > 0.0) {
               this.id_class(var1, var3);
            }

            var8 = this.id_throws.id_catch() instanceof iB_2 && ((iB_2)this.id_throws.id_catch()).Sc();
            if ((
                  ((Qw_1)this.id_throws.id_class[20]).id_volatile().id_class()
                     || ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().K().aJ_()
               )
               && !var8
               && !((Qw_1)this.id_throws.id_class[20]).g
               && ((Ax_1)this.id_throws.id_class[55]).id_native() != rRl_1.SPECTATOR) {
               this.id_this.id_byte();
               if (rrbb_3.rs()) {
                  rrdL.id_class(
                     this.id_class,
                     var3,
                     var1,
                     this.id_finally.id_break(),
                     (cb_3)this.id_throws.id_class[57],
                     this.id_throws.id_case().id_class((cb_3)this.id_throws.id_class[57], var3),
                     var6
                  );
               } else {
                  this.id_class
                     .id_class(
                        var3,
                        var1,
                        this.id_finally.id_break(),
                        (cb_3)this.id_throws.id_class[57],
                        this.id_throws.id_case().id_class((cb_3)this.id_throws.id_class[57], var3)
                     );
               }

               this.id_this.id_break();
            }

            var1.id_break();
         }

         rrdZ.g();
         if (!var5) {
            return;
         }

         this.id_this.id_break();
         if ((
               ((Qw_1)this.id_throws.id_class[20]).id_volatile().id_class()
                  || ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().K().aJ_()
            )
            && !var8) {
            Hm_1.id_class(this.id_throws, var1);
         }

         if (((Qw_1)this.id_throws.id_class[20]).E > 0.0) {
            this.id_class(var1, var3);
         }
      }
   }

   private void id_class(Ml_1 var1, float var2) {
      if (this.id_throws.id_catch() instanceof rhd_3 var3) {
         float var7 = (Float)var3.id_throws[29] - (Float)var3.id_throws[28];
         float var5 = -((Float)var3.id_throws[29] + var7 * var2);
         float var6 = rfU_2.id_catch(var2, (Float)var3.id_implements[7], (Float)var3.id_implements[8]);
         var6 *= (float)((Qw_1)this.id_throws.id_class[20]).E;
         var1.id_class((double)(rfU_2.id_class(var5 * (float) Math.PI) * var6 * 0.5F), (double)(-Math.abs(rfU_2.id_break(var5 * (float) Math.PI) * var6)), 0.0);
         var1.id_class(rje_3.id_case.id_byte(rfU_2.id_class(var5 * (float) Math.PI) * var6 * 3.0F));
         var1.id_class(rje_3.id_break.id_byte(Math.abs(rfU_2.id_break(var5 * (float) Math.PI - 0.2F) * var6) * 5.0F));
      }
   }

   public void id_class(rjV_2 var1) {
      RenderSystem.matrixMode(5889);
      RenderSystem.loadIdentity();
      RenderSystem.multMatrix(var1);
      RenderSystem.matrixMode(5888);
   }

   @Override
   public void close() {
      this.id_this.close();
      this.id_implements.close();
      this.id_else.close();
      this.id_break();
   }

   public float id_break(float var1) {
      return rfU_2.id_catch(var1, this.id_package, this.id_final);
   }

   public void id_break() {
      if (this.id_interface != null) {
         this.id_interface.close();
      }

      this.id_interface = null;
      this.id_long = id_break;
   }

   private double id_break(ly_3 var1, float var2, boolean var3) {
      if (this.id_synchronized) {
         return 90.0;
      } else {
         double var4 = 70.0;
         if (var3) {
            var4 = ((Qw_1)this.id_throws.id_class[20]).U;
            if (rrbb_3.rX()) {
               var4 *= (double)rfU_2.id_catch(var2, this.id_volatile, this.id_native);
            }
         }

         boolean var6 = false;
         if ((vm_3)this.id_throws.id_class[73] == null) {
            var6 = ((Qw_1)this.id_throws.id_class[20]).Pf.id_protected();
         }

         if (var6) {
            if (!rrbb_3.id_package) {
               rrbb_3.id_package = true;
               id_int = ((Qw_1)this.id_throws.id_class[20]).D;
               ((Qw_1)this.id_throws.id_class[20]).D = true;
               ((yX_2)this.id_throws.id_class[8]).id_volatile();
            }

            if (rrbb_3.id_package) {
               var4 /= 4.0;
            }
         } else if (rrbb_3.id_package) {
            rrbb_3.id_package = false;
            ((Qw_1)this.id_throws.id_class[20]).D = rrbb_3.id_int;
            ((yX_2)this.id_throws.id_class[8]).id_volatile();
         }

         if (var1.id_catch() instanceof iB_2 && ((iB_2)var1.id_catch()).Sl()) {
            float var7 = Math.min((float)((Integer)((iB_2)var1.id_catch()).id_private[13]).intValue() + var2, 20.0F);
            var4 /= (double)((1.0F - 500.0F / (var7 + 500.0F)) * 2.0F + 1.0F);
         }

         return var4;
      }
   }

   public Vq_1 id_throws() {
      return this.id_interface;
   }

   public ly_3 id_finally() {
      return this.id_void;
   }

   public ct_3 id_catch() {
      return this.id_implements;
   }

   public HQ id_extends() {
      return this.id_this;
   }

   public void id_case() {
      this.id_while = null;
      this.id_implements.id_class();
      this.id_void.id_package();
   }

   private void id_continue() {
      rrbb_3.rf();
      rrbo_3.id_class();
      if (!this.id_static) {
         rrxM_2.id_class();
         if (rrbb_3.ru() == 64 && rrbb_3.rm() == 32) {
            rrbb_3.id_class(true);
         }

         this.id_static = true;
      }

      gm_3 var1 = (gm_3)this.id_throws.id_class[56];
      if (var1 != null && rrbb_3.rZ()) {
         rrbb_3.id_class(false);
         rgN_2 var2 = new rgN_2(jI_2.id_class("of.message.java64Bit"));
         ((cq_3)this.id_throws.id_class[19]).id_throws().id_class(var2);
      }

      vm_3 var3 = (vm_3)this.id_throws.id_class[73];
      if (var3 instanceof vB_2 var4) {
         this.id_class(var4);
      }

      if (this.id_import != var1) {
         rrME.id_class(this.id_import, var1);
         rrbb_3.id_volatile();
         this.id_default = 0L;
         this.id_const = 0;
         this.id_import = var1;
      }

      if (!this.id_class(rrdZ.So)) {
         rrdZ.So = 0;
      }

      if ((vm_3)this.id_throws.id_class[73] != null && ((vm_3)this.id_throws.id_class[73]).getClass() == FP.class) {
         this.id_throws.id_break(new rrJr_1((FP)((vm_3)this.id_throws.id_class[73])));
      }
   }

   public float id_implements() {
      return this.id_private;
   }

   private void id_new() {
      this.id_boolean = 0;
      if (!rrbb_3.rO() || !rrbb_3.rM()) {
         this.id_default = 0L;
         this.id_const = 0;
      } else if (this.id_throws.id_switch()) {
         rng_3 var1 = this.id_throws.id_this();
         if (var1 != null) {
            boolean var2 = this.id_throws.id_throw();
            if (!var2 && !((vm_3)this.id_throws.id_class[73] instanceof Zb_1)) {
               if (this.id_strictfp > 0) {
                  rrbb_3.id_class((long)this.id_strictfp);
                  this.id_boolean = this.id_strictfp;
               }

               long var3 = System.nanoTime() / 1000000L;
               if (this.id_default != 0L && this.id_const != 0) {
                  long var5 = var3 - this.id_default;
                  if (var5 < 0L) {
                     this.id_default = var3;
                     var5 = 0L;
                  }

                  if (var5 >= 50L) {
                     this.id_default = var3;
                     int var7 = var1.Q();
                     int var8 = var7 - this.id_const;
                     if (var8 < 0) {
                        this.id_const = var7;
                        var8 = 0;
                     }

                     if (var8 < 1 && this.id_strictfp < 100) {
                        this.id_strictfp += 2;
                     }

                     if (var8 > 1 && this.id_strictfp > 0) {
                        this.id_strictfp--;
                     }

                     this.id_const = var7;
                  }
               } else {
                  this.id_default = var3;
                  this.id_const = var1.Q();
                  this.id_for = 1.0F;
                  this.id_transient = 50.0F;
               }
            } else {
               if ((vm_3)this.id_throws.id_class[73] instanceof Zb_1) {
                  rrbb_3.id_class(20L);
               }

               this.id_default = 0L;
               this.id_const = 0;
            }
         }
      }
   }

   private void id_package() {
      if (((yX_2)this.id_throws.id_class[8]).id_private() > 10 && ((yX_2)this.id_throws.id_class[8]).id_native() && !this.id_throws.id_this().id_while()) {
         fN_2 var1 = rqW_2.id_class(this.id_throws.id_else().id_extends(), this.id_throws.id_else().id_native(), this.id_throws.B());
         rqR_2.id_catch().execute(() -> {
            int var2 = var1.id_class();
            int var3 = var1.id_break();
            int var4 = 0;
            int var5 = 0;
            if (var2 > var3) {
               var4 = (var2 - var3) / 2;
               var2 = var3;
            } else {
               var5 = (var3 - var2) / 2;
               var3 = var2;
            }

            try (fN_2 var6 = new fN_2(64, 64, false)) {
               var1.id_class(var4, var5, var2, var3, var6);
               var6.id_class(this.id_throws.id_this().id_try());
            } catch (IOException var16) {
               id_protected.warn("Couldn't save auto screenshot", var16);
            } finally {
               var1.close();
            }
         });
      }
   }

   private void id_super() {
      if ((gm_3)this.id_throws.id_class[56] != null && rrbb_3.rT() && rrzQ_2.id_class("CheckGlErrorFrameFinish", 10000L)) {
         int var1 = MT.id_switch();
         if (var1 != 0 && rrbo_3.id_class(var1)) {
            String var2 = rrbb_3.id_byte(var1);
            rgN_2 var3 = new rgN_2(jI_2.id_class("of.message.openglError", var1, var2));
            ((cq_3)this.id_throws.id_class[19]).id_throws().id_class(var3);
         }
      }
   }

   public void id_protected() {
      this.id_final();
      this.id_this.id_class();
      if (this.id_throws.id_catch() == null) {
         this.id_throws.id_break((cb_3)this.id_throws.id_class[57]);
      }

      this.id_void.id_class();
      this.id_extends++;
      this.id_class.id_class();
      ((yX_2)this.id_throws.id_class[8]).id_class(this.id_void);
      this.id_package = this.id_final;
      if (((cq_3)this.id_throws.id_class[19]).id_extends().id_throws()) {
         this.id_final += 0.05F;
         if (this.id_final > 1.0F) {
            this.id_final = 1.0F;
         }
      } else if (this.id_final > 0.0F) {
         this.id_final -= 0.0125F;
      }

      if (this.id_try > 0) {
         this.id_try--;
         if (this.id_try == 0) {
            this.id_while = null;
         }
      }
   }

   public rrGK id_private() {
      return rrGD.SHADERS;
   }

   private void id_final() {
      float var1 = 1.0F;
      if (this.id_throws.id_catch() instanceof cG_2 var2) {
         var1 = var2.id_new();
      }

      this.id_volatile = this.id_native;
      this.id_native = this.id_native + (var1 - this.id_native) * 0.5F;
      if (this.id_native > 1.5F) {
         this.id_native = 1.5F;
      }

      if (this.id_native < 0.1F) {
         this.id_native = 0.1F;
      }
   }

   public rjV_2 id_volatile() {
      return this.id_char;
   }

   public fZ_2 id_native() {
      return this.id_else;
   }
}
