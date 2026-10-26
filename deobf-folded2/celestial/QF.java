package celestial;

import com.mojang.blaze3d.platform.GLX;
import java.util.List;
import java.util.Optional;

public abstract class QF {
   public static final VF id_class = new VF("options.biomeBlendRadius", 0.0, 7.0, 1.0F, var0 -> (double)var0.id_abstract, (var0, var1) -> {
      var0.id_abstract = rfU_2.id_class((int)var1.doubleValue(), 0, 7);
      ((yX_2)QY.id_instanceof().id_class[8]).id_throws();
   }, (var0, var1) -> {
      double var2 = var1.id_class(var0);
      int var4 = (int)var2 * 2 + 1;
      return var1.id_class(new rgn_3("options.biomeBlendRadius." + var4));
   });
   public static final VF id_break = new VF("options.chat.height.focused", 0.0, 1.0, 0.0F, var0 -> var0.id_while, (var0, var1) -> {
      var0.id_while = var1;
      ((cq_3)QY.id_instanceof().id_class[19]).id_throws().id_class();
   }, (var0, var1) -> {
      double var2 = var1.id_break(var1.id_class(var0));
      return var1.id_class(cI_2.id_byte(var2));
   });
   public static final VF id_byte = new VF("options.chat.height.unfocused", 0.0, 1.0, 0.0F, var0 -> var0.id_goto, (var0, var1) -> {
      var0.id_goto = var1;
      ((cq_3)QY.id_instanceof().id_class[19]).id_throws().id_class();
   }, (var0, var1) -> {
      double var2 = var1.id_break(var1.id_class(var0));
      return var1.id_class(cI_2.id_byte(var2));
   });
   public static final VF id_protected = new VF("options.chat.opacity", 0.0, 1.0, 0.0F, var0 -> var0.id_extends, (var0, var1) -> {
      var0.id_extends = var1;
      ((cq_3)QY.id_instanceof().id_class[19]).id_throws().id_class();
   }, (var0, var1) -> {
      double var2 = var1.id_break(var1.id_class(var0));
      return var1.id_class(var2 * 0.9 + 0.1);
   });
   public static final VF id_throws = new VF("options.chat.scale", 0.0, 1.0, 0.0F, var0 -> var0.id_return, (var0, var1) -> {
      var0.id_return = var1;
      ((cq_3)QY.id_instanceof().id_class[19]).id_throws().id_class();
   }, (var0, var1) -> {
      double var2 = var1.id_break(var1.id_class(var0));
      return (rgP_2)(var2 == 0.0 ? cN_2.id_class(var1.id_class(), false) : var1.id_class(var2));
   });
   public static final VF id_case = new VF("options.chat.width", 0.0, 1.0, 0.0F, var0 -> var0.id_public / 4.0571431, (var0, var1) -> {
      var1 = var1 * 4.0571431;
      var0.id_public = var1;
      ((cq_3)QY.id_instanceof().id_class[19]).id_throws().id_class();
   }, (var0, var1) -> {
      double var2 = var1.id_break(var1.id_class(var0));
      return var1.id_class(cI_2.id_break(var2 * 4.0571431));
   });
   public static final VF id_catch = new VF(
      "options.chat.line_spacing",
      0.0,
      1.0,
      0.0F,
      var0 -> var0.id_native,
      (var0, var1) -> var0.id_native = var1,
      (var0, var1) -> var1.id_class(var1.id_break(var1.id_class(var0)))
   );
   public static final VF id_private = new VF(
      "options.chat.delay_instant", 0.0, 6.0, 0.1F, var0 -> var0.id_try, (var0, var1) -> var0.id_try = var1, (var0, var1) -> {
         double var2 = var1.id_class(var0);
         return var2 <= 0.0 ? new rgn_3("options.chat.delay_none") : new rgn_3("options.chat.delay", String.format("%.1f", var2));
      }
   );
   public static final VF id_implements = new VF("options.fov", 30.0, 160.0, 1.0F, var0 -> var0.U, (var0, var1) -> var0.U = var1, (var0, var1) -> {
      double var2 = var1.id_class(var0);
      if (var2 == 70.0) {
         return var1.id_class(new rgn_3("options.fov.min"));
      } else {
         return var2 == var1.id_case() ? var1.id_class(new rgn_3("options.fov.max")) : var1.id_byte((int)var2);
      }
   });
   private static final rgP_2 rF = new rgn_3("options.fovEffectScale.tooltip");
   public static final VF id_finally = new VF(
      "options.fovEffectScale", 0.0, 1.0, 0.0F, var0 -> Math.pow((double)var0.e, 2.0), (var0, var1) -> var0.e = rfU_2.id_class(var1), (var0, var1) -> {
         var1.id_class(((cm_3)QY.id_instanceof().id_class[15]).id_break(rF, 200));
         double var2 = var1.id_break(var1.id_class(var0));
         return var2 == 0.0 ? var1.id_class(new rgn_3("options.fovEffectScale.off")) : var1.id_class(var2);
      }
   );
   public static final VF id_extends = new VF(
      "options.framerateLimit", 0.0, 500.0, 5.0F, var0 -> var0.id_strictfp ? 0.0 : (double)var0.id_protected, (var0, var1) -> {
         var0.id_protected = (int)var1.doubleValue();
         var0.id_strictfp = false;
         if (var0.id_protected <= 0) {
            var0.id_protected = 300;
            var0.id_strictfp = true;
         }

         var0.id_extends();
         QY.id_instanceof().id_else().id_class(var0.id_protected);
      }, (var0, var1) -> {
         if (var0.id_strictfp) {
            return var1.id_class(new rgn_3("of.options.framerateLimit.vsync"));
         } else {
            double var2 = var1.id_class(var0);
            return var2 == var1.id_case() ? var1.id_class(new rgn_3("options.framerateLimit.max")) : var1.id_class(new rgn_3("options.framerate", (int)var2));
         }
      }
   );
   public static final VF id_native = new VF("options.gamma", 0.0, 1.0, 0.0F, var0 -> var0.a, (var0, var1) -> var0.a = var1, (var0, var1) -> {
      double var2 = var1.id_break(var1.id_class(var0));
      if (var2 == 0.0) {
         return var1.id_class(new rgn_3("options.gamma.min"));
      } else if (var2 == 1.0) {
         var0.a = 100.0;
         return var1.id_class(new rgn_3("options.gamma.max"));
      } else {
         return var1.id_break((int)(var2 * 100.0));
      }
   });
   public static final VF id_volatile = new VF("options.mipmapLevels", 0.0, 4.0, 1.0F, var0 -> (double)var0.id_instanceof, (var0, var1) -> {
      var0.id_instanceof = (int)var1.doubleValue();
      var0.id_native();
   }, (var0, var1) -> {
      double var2 = var1.id_class(var0);
      if (var2 >= 4.0) {
         return var1.id_class(new rgn_3("of.general.max"));
      } else {
         return (rgP_2)(var2 == 0.0 ? cN_2.id_class(var1.id_class(), false) : var1.id_byte((int)var2));
      }
   });
   public static final VF id_final = new Vv_1(
      "options.mouseWheelSensitivity", 0.01, 10.0, 0.01F, var0 -> var0.id_long, (var0, var1) -> var0.id_long = var1, (var0, var1) -> {
         double var2 = var1.id_break(var1.id_class(var0));
         return var1.id_class(new rgN_2(String.format("%.2f", var1.id_byte(var2))));
      }
   );
   public static final VJ id_package = new VJ("options.rawMouseInput", var0 -> var0.id_float, (var0, var1) -> {
      var0.id_float = var1;
      Qg_1 var2 = QY.id_instanceof().id_else();
      if (var2 != null) {
         var2.id_break(var1);
      }
   });
   public static final VF id_int = new VF("options.renderDistance", 2.0, 16.0, 1.0F, var0 -> (double)var0.id_break, (var0, var1) -> {
      var0.id_break = (int)var1.doubleValue();
      ((yX_2)QY.id_instanceof().id_class[8]).id_volatile();
   }, (var0, var1) -> {
      double var2 = var1.id_class(var0);
      return var1.id_class(new rgn_3("options.chunks", (int)var2));
   });
   public static final VF id_new = new VF(
      "options.entityDistanceScaling",
      0.5,
      5.0,
      0.25F,
      var0 -> (double)var0.id_byte,
      (var0, var1) -> var0.id_byte = (float)var1.doubleValue(),
      (var0, var1) -> {
         double var2 = var1.id_class(var0);
         return var1.id_class(var2);
      }
   );
   public static final VF id_continue = new VF(
      "options.sensitivity", 0.0, 1.0, 0.0F, var0 -> var0.id_class, (var0, var1) -> var0.id_class = var1, (var0, var1) -> {
         double var2 = var1.id_break(var1.id_class(var0));
         if (var2 == 0.0) {
            return var1.id_class(new rgn_3("options.sensitivity.min"));
         } else {
            return var2 == 1.0 ? var1.id_class(new rgn_3("options.sensitivity.max")) : var1.id_class(2.0 * var2);
         }
      }
   );
   public static final VF id_super = new VF("options.accessibility.text_background_opacity", 0.0, 1.0, 0.0F, var0 -> var0.id_volatile, (var0, var1) -> {
      var0.id_volatile = var1;
      ((cq_3)QY.id_instanceof().id_class[19]).id_throws().id_class();
   }, (var0, var1) -> var1.id_class(var1.id_break(var1.id_class(var0))));
   public static final VN id_this = new VN("options.ao", (var0, var1) -> {
      var0.id_catch = Vh_1.id_class(var0.id_catch.id_class() + var1);
      ((yX_2)QY.id_instanceof().id_class[8]).id_throws();
   }, (var0, var1) -> var1.id_class(new rgn_3(var0.id_catch.id_break())));
   public static final VN id_else = new VN(
      "options.attackIndicator",
      (var0, var1) -> var0.id_interface = VX.id_class(var0.id_interface.id_class() + var1),
      (var0, var1) -> var1.id_class(new rgn_3(var0.id_interface.id_break()))
   );
   public static final VN id_synchronized = new VN(
      "options.chat.visibility",
      (var0, var1) -> var0.id_finally = rhJ_2.id_class((var0.id_finally.id_class() + var1) % 3),
      (var0, var1) -> var1.id_class(new rgn_3(var0.id_finally.id_break()))
   );
   private static final rgP_2 rL = new rgn_3("options.graphics.fast.tooltip");
   private static final rgP_2 rA = new rgn_3("options.graphics.fabulous.tooltip", new rgn_3("options.graphics.fabulous").id_class(rgF_2.ITALIC));
   private static final rgP_2 rn = new rgn_3("options.graphics.fancy.tooltip");
   public static final VN id_return = new VN("options.graphics", (var0, var1) -> {
      QY var2 = QY.id_instanceof();
      HM var3 = var2.id_new();
      if (var0.id_case == VW.FANCY && var3.id_byte()) {
         var3.id_protected();
      } else {
         var0.id_case = var0.id_case.id_byte();
         if (var0.id_case == VW.FABULOUS && (rrbb_3.rs() || !GLX.isUsingFBOs() || !MT.r() || var3.id_private())) {
            var0.id_case = VW.FAST;
         }

         var0.id_implements();
         ((yX_2)var2.id_class[8]).id_throws();
      }
   }, (var0, var1) -> {
      switch (var0.id_case) {
         case FAST:
            var1.id_class(((cm_3)QY.id_instanceof().id_class[15]).id_break(rL, 200));
            break;
         case FANCY:
            var1.id_class(((cm_3)QY.id_instanceof().id_class[15]).id_break(rn, 200));
            break;
         case FABULOUS:
            var1.id_class(((cm_3)QY.id_instanceof().id_class[15]).id_break(rA, 200));
      }

      rgn_3 var2 = new rgn_3(var0.id_case.id_break());
      return var0.id_case == VW.FABULOUS ? var1.id_class(var2.id_class(rgF_2.ITALIC)) : var1.id_class(var2);
   });
   public static final VN id_public = new VN(
      "options.guiScale",
      (var0, var1) -> var0.rs = rfU_2.id_break(var0.rs + var1, QY.id_instanceof().id_else().id_class(0, QY.id_instanceof().id_continue()) + 1),
      (var0, var1) -> var0.rs == 0 ? var1.id_class(new rgn_3("options.guiScale.auto")) : var1.id_byte(var0.rs)
   );
   public static final VN id_goto = new VN(
      "options.mainHand", (var0, var1) -> var0.id_continue = var0.id_continue.id_class(), (var0, var1) -> var1.id_class(var0.id_continue.id_break())
   );
   public static final VN id_while = new VN(
      "options.particles", (var0, var1) -> var0.rE = Vm_1.id_class(var0.rE.id_break() + var1), (var0, var1) -> var1.id_class(new rgn_3(var0.rE.id_class()))
   );
   public static final VN id_try = new VN("options.renderClouds", (var0, var1) -> {
      var0.id_throws = Vd_1.id_class(var0.id_throws.id_class() + var1);
      if (QY.d()) {
         VC var2 = ((yX_2)QY.id_instanceof().id_class[8]).id_void();
         if (var2 != null) {
            var2.id_break((Boolean)QY.id_break[2]);
         }
      }
   }, (var0, var1) -> var1.id_class(new rgn_3(var0.id_throws.id_break())));
   public static final VN id_instanceof = new VN(
      "options.accessibility.text_background",
      (var0, var1) -> var0.B = !var0.B,
      (var0, var1) -> var1.id_class(new rgn_3(var0.B ? "options.accessibility.text_background.chat" : "options.accessibility.text_background.everywhere"))
   );
   private static final rgP_2 rC = new rgn_3("options.hideMatchedNames.tooltip");
   public static final VJ id_throw = new VJ("options.autoJump", var0 -> var0.id_static, (var0, var1) -> var0.id_static = var1);
   public static final VJ id_interface = new VJ("options.autoSuggestCommands", var0 -> var0.id_import, (var0, var1) -> var0.id_import = var1);
   public static final VJ id_char = new VJ("options.hideMatchedNames", rC, var0 -> var0.M, (var0, var1) -> var0.M = var1);
   public static final VJ id_abstract = new VJ("options.chat.color", var0 -> var0.id_short, (var0, var1) -> var0.id_short = var1);
   public static final VJ id_long = new VJ("options.chat.removeSpam", var0 -> var0.id_synchronized, (var0, var1) -> var0.id_synchronized = var1);
   public static final VJ id_float = new VJ("options.chat.links", var0 -> var0.id_default, (var0, var1) -> var0.id_default = var1);
   public static final VJ id_void = new VJ("options.chat.links.prompt", var0 -> var0.id_const, (var0, var1) -> var0.id_const = var1);
   public static final VJ id_static = new VJ("options.discrete_mouse_scroll", var0 -> var0.id_double, (var0, var1) -> var0.id_double = var1);
   public static final VJ id_import = new VJ("options.vsync", var0 -> var0.id_strictfp, (var0, var1) -> {
      var0.id_strictfp = var1;
      if (QY.id_instanceof().id_else() != null) {
         QY.id_instanceof().id_else().id_class(var0.id_strictfp);
      }
   });
   public static final VJ id_short = new VJ("options.entityShadows", var0 -> var0.id_boolean, (var0, var1) -> var0.id_boolean = var1);
   public static final VJ id_default = new VJ("options.forceUnicodeFont", var0 -> var0.id_transient, (var0, var1) -> {
      var0.id_transient = var1;
      QY var2 = QY.id_instanceof();
      if (var2.id_else() != null) {
         var2.id_byte(var1);
      }
   });
   public static final VJ id_const = new VJ("options.invertMouse", var0 -> var0.id_for, (var0, var1) -> var0.id_for = var1);
   public static final VJ id_strictfp = new VJ("options.reducedDebugInfo", var0 -> var0.id_switch, (var0, var1) -> var0.id_switch = var1);
   public static final VJ id_boolean = new VJ("options.showSubtitles", var0 -> var0.P, (var0, var1) -> var0.P = var1);
   public static final VJ id_transient = new VJ("options.snooper", var0 -> {
      if (var0.r) {
      }

      return false;
   }, (var0, var1) -> var0.r = var1);
   public static final VN id_for = new VN(
      "key.sneak", (var0, var1) -> var0.G = !var0.G, (var0, var1) -> var1.id_class(new rgn_3(var0.G ? "options.key.toggle" : "options.key.hold"))
   );
   public static final VN id_double = new VN(
      "key.sprint", (var0, var1) -> var0.b = !var0.b, (var0, var1) -> var1.id_class(new rgn_3(var0.b ? "options.key.toggle" : "options.key.hold"))
   );
   public static final VJ id_switch = new VJ("options.touchscreen", var0 -> var0.S, (var0, var1) -> var0.S = var1);
   public static final VJ r = new VJ("options.fullscreen", var0 -> var0.s, (var0, var1) -> {
      var0.s = var1;
      QY var2 = QY.id_instanceof();
      if (var2.id_else() != null && var2.id_else().id_finally() != var0.s) {
         var2.id_else().id_private();
         var0.s = var2.id_else().id_finally();
      }
   });
   public static final VF P = new VF("options.viewBobbingEffect", 0.0, 1.0, 0.0F, var0 -> var0.E, (var0, var1) -> var0.E = var1, (var0, var1) -> {
      double var2 = var1.id_class(var0);
      return var2 == 0.0 ? var1.id_class(new rgn_3("options.fovEffectScale.off")) : var1.id_class(var1.id_break(var2));
   }).id_class(1.0F);
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

   public rgP_2 id_byte(int var1) {
      return this.id_class(new rgN_2(Integer.toString(var1)));
   }

   public String id_byte() {
      return this.ry;
   }

   public QF(String var1) {
      this.rl = new rgn_3(var1);
      this.ry = var1;
   }

   protected rgP_2 id_class(double var1) {
      return new rgn_3("options.percent_value", this.id_class(), (int)(var1 * 100.0));
   }

   protected rgP_2 id_class(int var1) {
      return new rgn_3("options.pixel_value", this.id_class(), var1);
   }

   public rgP_2 id_class(rgP_2 var1) {
      return new rgn_3("options.generic_value", this.id_class(), var1);
   }

   public <T extends QF> T id_class(float var1) {
      this.rp = var1;
      return (T)this;
   }

   public rgP_2 id_class() {
      return this.rl;
   }

   public abstract LZ id_class(Qw_1 var1, int var2, int var3, int var4);

   public void id_class(List<rpl_3> var1) {
      this.rH = Optional.of(var1);
   }

   public Optional<List<rpl_3>> id_break() {
      return this.rH;
   }

   public rgP_2 id_break(int var1) {
      return new rgn_3("options.percent_add_value", this.id_class(), var1);
   }

   public float id_protected() {
      return this.rp;
   }
}
