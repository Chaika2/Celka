package celestial;

import com.mojang.blaze3d.platform.GLX;
import java.util.List;
import java.util.Optional;

public abstract class QF {
   public static final VF class_ = new VF("options.biomeBlendRadius", 0.0, 7.0, 1.0F, var0 -> (double)var0.abstract_, (var0, var1) -> {
      var0.abstract_ = rfU_2.class_((int)var1.doubleValue(), 0, 7);
      ((yX_2)QY.instanceof_().class_[8]).throws_();
   }, (var0, var1) -> {
      double var2 = var1.class_(var0);
      int var4 = (int)var2 * 2 + 1;
      return var1.class_(new rgn_3("options.biomeBlendRadius." + var4));
   });
   public static final VF break_ = new VF("options.chat.height.focused", 0.0, 1.0, 0.0F, var0 -> var0.while_, (var0, var1) -> {
      var0.while_ = var1;
      ((cq_3)QY.instanceof_().class_[19]).throws_().class_();
   }, (var0, var1) -> {
      double var2 = var1.break_(var1.class_(var0));
      return var1.class_(cI_2.byte_(var2));
   });
   public static final VF byte_ = new VF("options.chat.height.unfocused", 0.0, 1.0, 0.0F, var0 -> var0.goto_, (var0, var1) -> {
      var0.goto_ = var1;
      ((cq_3)QY.instanceof_().class_[19]).throws_().class_();
   }, (var0, var1) -> {
      double var2 = var1.break_(var1.class_(var0));
      return var1.class_(cI_2.byte_(var2));
   });
   public static final VF protected_ = new VF("options.chat.opacity", 0.0, 1.0, 0.0F, var0 -> var0.extends_, (var0, var1) -> {
      var0.extends_ = var1;
      ((cq_3)QY.instanceof_().class_[19]).throws_().class_();
   }, (var0, var1) -> {
      double var2 = var1.break_(var1.class_(var0));
      return var1.class_(var2 * 0.9 + 0.1);
   });
   public static final VF throws_ = new VF("options.chat.scale", 0.0, 1.0, 0.0F, var0 -> var0.return_, (var0, var1) -> {
      var0.return_ = var1;
      ((cq_3)QY.instanceof_().class_[19]).throws_().class_();
   }, (var0, var1) -> {
      double var2 = var1.break_(var1.class_(var0));
      return (rgP_2)(var2 == 0.0 ? cN_2.class_(var1.class_(), false) : var1.class_(var2));
   });
   public static final VF case_ = new VF("options.chat.width", 0.0, 1.0, 0.0F, var0 -> var0.public_ / 4.0571431, (var0, var1) -> {
      var1 = var1 * 4.0571431;
      var0.public_ = var1;
      ((cq_3)QY.instanceof_().class_[19]).throws_().class_();
   }, (var0, var1) -> {
      double var2 = var1.break_(var1.class_(var0));
      return var1.class_(cI_2.break_(var2 * 4.0571431));
   });
   public static final VF catch_ = new VF(
      "options.chat.line_spacing",
      0.0,
      1.0,
      0.0F,
      var0 -> var0.native_,
      (var0, var1) -> var0.native_ = var1,
      (var0, var1) -> var1.class_(var1.break_(var1.class_(var0)))
   );
   public static final VF private_ = new VF(
      "options.chat.delay_instant", 0.0, 6.0, 0.1F, var0 -> var0.try_, (var0, var1) -> var0.try_ = var1, (var0, var1) -> {
         double var2 = var1.class_(var0);
         return var2 <= 0.0 ? new rgn_3("options.chat.delay_none") : new rgn_3("options.chat.delay", String.format("%.1f", var2));
      }
   );
   public static final VF implements_ = new VF("options.fov", 30.0, 160.0, 1.0F, var0 -> var0.U, (var0, var1) -> var0.U = var1, (var0, var1) -> {
      double var2 = var1.class_(var0);
      if (var2 == 70.0) {
         return var1.class_(new rgn_3("options.fov.min"));
      } else {
         return var2 == var1.case_() ? var1.class_(new rgn_3("options.fov.max")) : var1.byte_((int)var2);
      }
   });
   private static final rgP_2 rF = new rgn_3("options.fovEffectScale.tooltip");
   public static final VF finally_ = new VF(
      "options.fovEffectScale", 0.0, 1.0, 0.0F, var0 -> Math.pow((double)var0.e, 2.0), (var0, var1) -> var0.e = rfU_2.class_(var1), (var0, var1) -> {
         var1.class_(((cm_3)QY.instanceof_().class_[15]).break_(rF, 200));
         double var2 = var1.break_(var1.class_(var0));
         return var2 == 0.0 ? var1.class_(new rgn_3("options.fovEffectScale.off")) : var1.class_(var2);
      }
   );
   public static final VF extends_ = new VF(
      "options.framerateLimit", 0.0, 500.0, 5.0F, var0 -> var0.strictfp_ ? 0.0 : (double)var0.protected_, (var0, var1) -> {
         var0.protected_ = (int)var1.doubleValue();
         var0.strictfp_ = false;
         if (var0.protected_ <= 0) {
            var0.protected_ = 300;
            var0.strictfp_ = true;
         }

         var0.extends_();
         QY.instanceof_().else_().class_(var0.protected_);
      }, (var0, var1) -> {
         if (var0.strictfp_) {
            return var1.class_(new rgn_3("of.options.framerateLimit.vsync"));
         } else {
            double var2 = var1.class_(var0);
            return var2 == var1.case_() ? var1.class_(new rgn_3("options.framerateLimit.max")) : var1.class_(new rgn_3("options.framerate", (int)var2));
         }
      }
   );
   public static final VF native_ = new VF("options.gamma", 0.0, 1.0, 0.0F, var0 -> var0.a, (var0, var1) -> var0.a = var1, (var0, var1) -> {
      double var2 = var1.break_(var1.class_(var0));
      if (var2 == 0.0) {
         return var1.class_(new rgn_3("options.gamma.min"));
      } else if (var2 == 1.0) {
         var0.a = 100.0;
         return var1.class_(new rgn_3("options.gamma.max"));
      } else {
         return var1.break_((int)(var2 * 100.0));
      }
   });
   public static final VF volatile_ = new VF("options.mipmapLevels", 0.0, 4.0, 1.0F, var0 -> (double)var0.instanceof_, (var0, var1) -> {
      var0.instanceof_ = (int)var1.doubleValue();
      var0.native_();
   }, (var0, var1) -> {
      double var2 = var1.class_(var0);
      if (var2 >= 4.0) {
         return var1.class_(new rgn_3("of.general.max"));
      } else {
         return (rgP_2)(var2 == 0.0 ? cN_2.class_(var1.class_(), false) : var1.byte_((int)var2));
      }
   });
   public static final VF final_ = new Vv_1(
      "options.mouseWheelSensitivity", 0.01, 10.0, 0.01F, var0 -> var0.long_, (var0, var1) -> var0.long_ = var1, (var0, var1) -> {
         double var2 = var1.break_(var1.class_(var0));
         return var1.class_(new rgN_2(String.format("%.2f", var1.byte_(var2))));
      }
   );
   public static final VJ package_ = new VJ("options.rawMouseInput", var0 -> var0.float_, (var0, var1) -> {
      var0.float_ = var1;
      Qg_1 var2 = QY.instanceof_().else_();
      if (var2 != null) {
         var2.break_(var1);
      }
   });
   public static final VF int_ = new VF("options.renderDistance", 2.0, 16.0, 1.0F, var0 -> (double)var0.break_, (var0, var1) -> {
      var0.break_ = (int)var1.doubleValue();
      ((yX_2)QY.instanceof_().class_[8]).volatile_();
   }, (var0, var1) -> {
      double var2 = var1.class_(var0);
      return var1.class_(new rgn_3("options.chunks", (int)var2));
   });
   public static final VF new_ = new VF(
      "options.entityDistanceScaling", 0.5, 5.0, 0.25F, var0 -> (double)var0.byte_, (var0, var1) -> var0.byte_ = (float)var1.doubleValue(), (var0, var1) -> {
         double var2 = var1.class_(var0);
         return var1.class_(var2);
      }
   );
   public static final VF continue_ = new VF("options.sensitivity", 0.0, 1.0, 0.0F, var0 -> var0.class_, (var0, var1) -> var0.class_ = var1, (var0, var1) -> {
      double var2 = var1.break_(var1.class_(var0));
      if (var2 == 0.0) {
         return var1.class_(new rgn_3("options.sensitivity.min"));
      } else {
         return var2 == 1.0 ? var1.class_(new rgn_3("options.sensitivity.max")) : var1.class_(2.0 * var2);
      }
   });
   public static final VF super_ = new VF("options.accessibility.text_background_opacity", 0.0, 1.0, 0.0F, var0 -> var0.volatile_, (var0, var1) -> {
      var0.volatile_ = var1;
      ((cq_3)QY.instanceof_().class_[19]).throws_().class_();
   }, (var0, var1) -> var1.class_(var1.break_(var1.class_(var0))));
   public static final VN this_ = new VN("options.ao", (var0, var1) -> {
      var0.catch_ = Vh_1.class_(var0.catch_.class_() + var1);
      ((yX_2)QY.instanceof_().class_[8]).throws_();
   }, (var0, var1) -> var1.class_(new rgn_3(var0.catch_.break_())));
   public static final VN else_ = new VN(
      "options.attackIndicator",
      (var0, var1) -> var0.interface_ = VX.class_(var0.interface_.class_() + var1),
      (var0, var1) -> var1.class_(new rgn_3(var0.interface_.break_()))
   );
   public static final VN synchronized_ = new VN(
      "options.chat.visibility",
      (var0, var1) -> var0.finally_ = rhJ_2.class_((var0.finally_.class_() + var1) % 3),
      (var0, var1) -> var1.class_(new rgn_3(var0.finally_.break_()))
   );
   private static final rgP_2 rL = new rgn_3("options.graphics.fast.tooltip");
   private static final rgP_2 rA = new rgn_3("options.graphics.fabulous.tooltip", new rgn_3("options.graphics.fabulous").class_(rgF_2.ITALIC));
   private static final rgP_2 rn = new rgn_3("options.graphics.fancy.tooltip");
   public static final VN return_ = new VN("options.graphics", (var0, var1) -> {
      QY var2 = QY.instanceof_();
      HM var3 = var2.new_();
      if (var0.case_ == VW.FANCY && var3.byte_()) {
         var3.protected_();
      } else {
         var0.case_ = var0.case_.byte_();
         if (var0.case_ == VW.FABULOUS && (rrbb_3.rs() || !GLX.isUsingFBOs() || !MT.r() || var3.private_())) {
            var0.case_ = VW.FAST;
         }

         var0.implements_();
         ((yX_2)var2.class_[8]).throws_();
      }
   }, (var0, var1) -> {
      switch (var0.case_) {
         case FAST:
            var1.class_(((cm_3)QY.instanceof_().class_[15]).break_(rL, 200));
            break;
         case FANCY:
            var1.class_(((cm_3)QY.instanceof_().class_[15]).break_(rn, 200));
            break;
         case FABULOUS:
            var1.class_(((cm_3)QY.instanceof_().class_[15]).break_(rA, 200));
      }

      rgn_3 var2 = new rgn_3(var0.case_.break_());
      return var0.case_ == VW.FABULOUS ? var1.class_(var2.class_(rgF_2.ITALIC)) : var1.class_(var2);
   });
   public static final VN public_ = new VN(
      "options.guiScale",
      (var0, var1) -> var0.rs = rfU_2.break_(var0.rs + var1, QY.instanceof_().else_().class_(0, QY.instanceof_().continue_()) + 1),
      (var0, var1) -> var0.rs == 0 ? var1.class_(new rgn_3("options.guiScale.auto")) : var1.byte_(var0.rs)
   );
   public static final VN goto_ = new VN(
      "options.mainHand", (var0, var1) -> var0.continue_ = var0.continue_.class_(), (var0, var1) -> var1.class_(var0.continue_.break_())
   );
   public static final VN while_ = new VN(
      "options.particles", (var0, var1) -> var0.rE = Vm_1.class_(var0.rE.break_() + var1), (var0, var1) -> var1.class_(new rgn_3(var0.rE.class_()))
   );
   public static final VN try_ = new VN("options.renderClouds", (var0, var1) -> {
      var0.throws_ = Vd_1.class_(var0.throws_.class_() + var1);
      if (QY.d()) {
         VC var2 = ((yX_2)QY.instanceof_().class_[8]).void_();
         if (var2 != null) {
            var2.break_((Boolean)QY.break_[2]);
         }
      }
   }, (var0, var1) -> var1.class_(new rgn_3(var0.throws_.break_())));
   public static final VN instanceof_ = new VN(
      "options.accessibility.text_background",
      (var0, var1) -> var0.B = !var0.B,
      (var0, var1) -> var1.class_(new rgn_3(var0.B ? "options.accessibility.text_background.chat" : "options.accessibility.text_background.everywhere"))
   );
   private static final rgP_2 rC = new rgn_3("options.hideMatchedNames.tooltip");
   public static final VJ throw_ = new VJ("options.autoJump", var0 -> var0.static_, (var0, var1) -> var0.static_ = var1);
   public static final VJ interface_ = new VJ("options.autoSuggestCommands", var0 -> var0.import_, (var0, var1) -> var0.import_ = var1);
   public static final VJ char_ = new VJ("options.hideMatchedNames", rC, var0 -> var0.M, (var0, var1) -> var0.M = var1);
   public static final VJ abstract_ = new VJ("options.chat.color", var0 -> var0.short_, (var0, var1) -> var0.short_ = var1);
   public static final VJ long_ = new VJ("options.chat.removeSpam", var0 -> var0.synchronized_, (var0, var1) -> var0.synchronized_ = var1);
   public static final VJ float_ = new VJ("options.chat.links", var0 -> var0.default_, (var0, var1) -> var0.default_ = var1);
   public static final VJ void_ = new VJ("options.chat.links.prompt", var0 -> var0.const_, (var0, var1) -> var0.const_ = var1);
   public static final VJ static_ = new VJ("options.discrete_mouse_scroll", var0 -> var0.double_, (var0, var1) -> var0.double_ = var1);
   public static final VJ import_ = new VJ("options.vsync", var0 -> var0.strictfp_, (var0, var1) -> {
      var0.strictfp_ = var1;
      if (QY.instanceof_().else_() != null) {
         QY.instanceof_().else_().class_(var0.strictfp_);
      }
   });
   public static final VJ short_ = new VJ("options.entityShadows", var0 -> var0.boolean_, (var0, var1) -> var0.boolean_ = var1);
   public static final VJ default_ = new VJ("options.forceUnicodeFont", var0 -> var0.transient_, (var0, var1) -> {
      var0.transient_ = var1;
      QY var2 = QY.instanceof_();
      if (var2.else_() != null) {
         var2.byte_(var1);
      }
   });
   public static final VJ const_ = new VJ("options.invertMouse", var0 -> var0.for_, (var0, var1) -> var0.for_ = var1);
   public static final VJ strictfp_ = new VJ("options.reducedDebugInfo", var0 -> var0.switch_, (var0, var1) -> var0.switch_ = var1);
   public static final VJ boolean_ = new VJ("options.showSubtitles", var0 -> var0.P, (var0, var1) -> var0.P = var1);
   public static final VJ transient_ = new VJ("options.snooper", var0 -> {
      if (var0.r) {
      }

      return false;
   }, (var0, var1) -> var0.r = var1);
   public static final VN for_ = new VN(
      "key.sneak", (var0, var1) -> var0.G = !var0.G, (var0, var1) -> var1.class_(new rgn_3(var0.G ? "options.key.toggle" : "options.key.hold"))
   );
   public static final VN double_ = new VN(
      "key.sprint", (var0, var1) -> var0.b = !var0.b, (var0, var1) -> var1.class_(new rgn_3(var0.b ? "options.key.toggle" : "options.key.hold"))
   );
   public static final VJ switch_ = new VJ("options.touchscreen", var0 -> var0.S, (var0, var1) -> var0.S = var1);
   public static final VJ r = new VJ("options.fullscreen", var0 -> var0.s, (var0, var1) -> {
      var0.s = var1;
      QY var2 = QY.instanceof_();
      if (var2.else_() != null && var2.else_().finally_() != var0.s) {
         var2.else_().private_();
         var0.s = var2.else_().finally_();
      }
   });
   public static final VF P = new VF("options.viewBobbingEffect", 0.0, 1.0, 0.0F, var0 -> var0.E, (var0, var1) -> var0.E = var1, (var0, var1) -> {
      double var2 = var1.class_(var0);
      return var2 == 0.0 ? var1.class_(new rgn_3("options.fovEffectScale.off")) : var1.class_(var1.break_(var2));
   }).class_(1.0F);
   private final rgP_2 rl;
   private Optional<List<rpl_3>> rH = Optional.empty();
   private final String ry;
   public static final VN B = new rrMA("of.options.FOG_FANCY");
   public static final VN S = new rrMA("of.options.FOG_START");
   public static final VF s = new rrMT("of.options.MIPMAP_TYPE", 0.0, 3.0, 1.0F);
   public static final VN E = new rrMA("of.options.SMOOTH_FPS");
   public static final VN G = new rrMA("of.options.CLOUDS");
   public static final VF b = new rrMT("of.options.CLOUD_HEIGHT");
   public static final VN M = new rrMA("of.options.TREES");
   public static final VN O = new rrMA("of.options.RAIN");
   public static final VN h = new rrMA("of.options.ANIMATED_WATER");
   public static final VN X = new rrMA("of.options.ANIMATED_LAVA");
   public static final VN J = new rrMA("of.options.ANIMATED_FIRE");
   public static final VN x = new rrMA("of.options.ANIMATED_PORTAL");
   public static final VF d = new rrMT("of.options.AO_LEVEL");
   public static final VN k = new rrMA("of.options.LAGOMETER");
   public static final VN W = new rrMA("of.options.SHOW_FPS");
   public static final VN z = new rrMA("of.options.AUTOSAVE_TICKS");
   public static final VN Q = new rrMA("of.options.BETTER_GRASS");
   public static final VN N = new rrMA("of.options.ANIMATED_REDSTONE");
   public static final VN c = new rrMA("of.options.ANIMATED_EXPLOSION");
   public static final VN u = new rrMA("of.options.ANIMATED_FLAME");
   public static final VN m = new rrMA("of.options.ANIMATED_SMOKE");
   public static final VN Z = new rrMA("of.options.WEATHER");
   public static final VN v = new rrMA("of.options.SKY");
   public static final VN F = new rrMA("of.options.STARS");
   public static final VN L = new rrMA("of.options.SUN_MOON");
   public static final VN A = new rrMA("of.options.VIGNETTE");
   public static final VN n = new rrMA("of.options.CHUNK_UPDATES");
   public static final VN C = new rrMA("of.options.CHUNK_UPDATES_DYNAMIC");
   public static final VN l = new rrMA("of.options.TIME");
   public static final VN H = new rrMA("of.options.SMOOTH_WORLD");
   public static final VN y = new rrMA("of.options.VOID_PARTICLES");
   public static final VN p = new rrMA("of.options.WATER_PARTICLES");
   public static final VN q = new rrMA("of.options.RAIN_SPLASH");
   public static final VN T = new rrMA("of.options.PORTAL_PARTICLES");
   public static final VN t = new rrMA("of.options.POTION_PARTICLES");
   public static final VN w = new rrMA("of.options.FIREWORK_PARTICLES");
   public static final VN I = new rrMA("of.options.BLOCK_PARTICLES");
   public static final VN f = new rrMA("of.options.BUBBLE_COLUMN_PARTICLES");
   public static final VN j = new rrMA("of.options.PROFILER");
   public static final VN V = new rrMA("of.options.DRIPPING_WATER_LAVA");
   public static final VN g = new rrMA("of.options.BETTER_SNOW");
   public static final VN R = new rrMA("of.options.ANIMATED_TERRAIN");
   public static final VN Y = new rrMA("of.options.SWAMP_COLORS");
   public static final VN o = new rrMA("of.options.RANDOM_ENTITIES");
   public static final VN K = new rrMA("of.options.SMOOTH_BIOMES");
   public static final VN D = new rrMA("of.options.CUSTOM_FONTS");
   public static final VN U = new rrMA("of.options.CUSTOM_COLORS");
   public static final VN e = new rrMA("of.options.SHOW_CAPES");
   public static final VN a = new rrMA("of.options.CONNECTED_TEXTURES");
   public static final VN i = new rrMA("of.options.CUSTOM_ITEMS");
   public static final VF rr = new rrMT("of.options.AA_LEVEL", 0.0, 16.0, new double[]{0.0, 2.0, 4.0, 6.0, 8.0, 12.0, 16.0});
   public static final VF rP = new rrMT("of.options.AF_LEVEL", 1.0, 16.0, new double[]{1.0, 2.0, 4.0, 8.0, 16.0});
   public static final VN rB = new rrMA("of.options.ANIMATED_TEXTURES");
   public static final VN rS = new rrMA("of.options.NATURAL_TEXTURES");
   public static final VN rs = new rrMA("of.options.EMISSIVE_TEXTURES");
   public static final VN rE = new rrMA("of.options.HELD_ITEM_TOOLTIPS");
   public static final VN rG = new rrMA("of.options.DROPPED_ITEMS");
   public static final VN rb = new rrMA("of.options.LAZY_CHUNK_LOADING");
   public static final VN rM = new rrMA("of.options.CUSTOM_SKY");
   public static final VN rO = new rrMA("of.options.FAST_MATH");
   public static final VN rh = new rrMA("of.options.FAST_RENDER");
   public static final VN rX = new rrMA("of.options.TRANSLUCENT_BLOCKS");
   public static final VN rJ = new rrMA("of.options.DYNAMIC_FOV");
   public static final VN rx = new rrMA("of.options.DYNAMIC_LIGHTS");
   public static final VN rd = new rrMA("of.options.ALTERNATE_BLOCKS");
   public static final VN rk = new rrMA("of.options.CUSTOM_ENTITY_MODELS");
   public static final VN rW = new rrMA("of.options.ADVANCED_ITEMS_OVERLAY");
   public static final VN rz = new rrMA("of.options.ADVANCED_TOOLTIPS");
   public static final VN rQ = new rrMA("of.options.SCREENSHOT_SIZE");
   public static final VN rN = new rrMA("of.options.CUSTOM_GUIS");
   public static final VN rc = new rrMA("of.options.RENDER_REGIONS");
   public static final VN ru = new rrMA("of.options.SHOW_GL_ERRORS");
   public static final VN rm = new rrMA("of.options.SMART_ANIMATIONS");
   public static final VN rZ = new rrMA("of.options.CHAT_BACKGROUND");
   public static final VN rv = new rrMA("of.options.CHAT_SHADOW");
   private float rp;

   public rgP_2 byte_(int var1) {
      return this.class_(new rgN_2(Integer.toString(var1)));
   }

   public String byte_() {
      return this.ry;
   }

   public QF(String var1) {
      this.rl = new rgn_3(var1);
      this.ry = var1;
   }

   protected rgP_2 class_(double var1) {
      return new rgn_3("options.percent_value", this.class_(), (int)(var1 * 100.0));
   }

   protected rgP_2 class_(int var1) {
      return new rgn_3("options.pixel_value", this.class_(), var1);
   }

   public rgP_2 class_(rgP_2 var1) {
      return new rgn_3("options.generic_value", this.class_(), var1);
   }

   public <T extends QF> T class_(float var1) {
      this.rp = var1;
      return (T)this;
   }

   public rgP_2 class_() {
      return this.rl;
   }

   public abstract LZ class_(Qw_1 var1, int var2, int var3, int var4);

   public void class_(List<rpl_3> var1) {
      this.rH = Optional.of(var1);
   }

   public Optional<List<rpl_3>> break_() {
      return this.rH;
   }

   public rgP_2 break_(int var1) {
      return new rgn_3("options.percent_add_value", this.class_(), var1);
   }

   public float protected_() {
      return this.rp;
   }
}
