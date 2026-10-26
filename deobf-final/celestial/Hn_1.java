package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.OptionalDouble;

public abstract class Hn_1 {
   protected final String class_;
   private final Runnable S;
   private final Runnable s;
   public static float break_ = 1.0F;
   protected static final Ho_1 byte_ = new Ho_1("no_transparency", () -> RenderSystem.disableBlend(), () -> {
   });
   protected static final Ho_1 protected_ = new Ho_1("additive_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(OP.ONE, MK.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final Ho_1 throws_ = new Ho_1("lightning_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(OP.SRC_ALPHA, MK.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final Ho_1 case_ = new Ho_1("glint_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFuncSeparate(OP.SRC_COLOR, MK.ONE, OP.ZERO, MK.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final Ho_1 catch_ = new Ho_1("crumbling_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFuncSeparate(OP.DST_COLOR, MK.SRC_COLOR, OP.ONE, MK.ZERO);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final Ho_1 private_ = new Ho_1("translucent_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFuncSeparate(OP.SRC_ALPHA, MK.ONE_MINUS_SRC_ALPHA, OP.ONE, MK.ONE_MINUS_SRC_ALPHA);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final HC implements_ = new HC(0.0F);
   protected static final HC finally_ = new HC(0.003921569F);
   protected static final HC extends_ = new HC(0.5F);
   protected static final HC native_ = new HC(0.1F);
   protected static final HV volatile_ = new HV(false);
   protected static final HV final_ = new HV(true);
   protected static final HR package_ = new HR(fJ_2.class_, false, true);
   protected static final HR int_ = new HR(fJ_2.class_, false, false);
   protected static final HR new_ = new HR();
   protected static final HY continue_ = new HY("default_texturing", () -> {
   }, () -> {
   });
   protected static final HY super_ = new HY("outline_texturing", () -> RenderSystem.setupOutline(), () -> RenderSystem.teardownOutline());
   protected static final HY this_ = new HY("glint_texturing", () -> {
      class_(8.0F);
      RenderSystem.color4f(break_, break_, break_, 1.0F);
   }, () -> {
      RenderSystem.matrixMode(5890);
      RenderSystem.popMatrix();
      RenderSystem.matrixMode(5888);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
   });
   protected static final HY else_ = new HY("entity_glint_texturing", () -> {
      class_(0.16F);
      RenderSystem.color4f(break_, break_, break_, 1.0F);
   }, () -> {
      RenderSystem.matrixMode(5890);
      RenderSystem.popMatrix();
      RenderSystem.matrixMode(5888);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
   });
   protected static final Ht_1 synchronized_ = new Ht_1(true);
   protected static final Ht_1 return_ = new Ht_1(false);
   protected static final Hf_1 public_ = new Hf_1(true);
   protected static final Hf_1 goto_ = new Hf_1(false);
   protected static final Hp_1 while_ = new Hp_1(true);
   protected static final Hp_1 try_ = new Hp_1(false);
   protected static final HH instanceof_ = new HH(true);
   protected static final HH throw_ = new HH(false);
   protected static final Hy_1 interface_ = new Hy_1("always", 519);
   protected static final Hy_1 char_ = new Hy_1("==", 514);
   protected static final Hy_1 abstract_ = new Hy_1("<=", 515);
   protected static final HK long_ = new HK(true, true);
   protected static final HK float_ = new HK(true, false);
   protected static final HK void_ = new HK(false, true);
   protected static final HT static_ = new HT("no_layering", () -> {
   }, () -> {
   });
   protected static final HT import_ = new HT("polygon_offset_layering", () -> {
      RenderSystem.polygonOffset(-1.0F, -10.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final HT short_ = new HT("view_offset_z_layering", () -> {
      RenderSystem.pushMatrix();
      RenderSystem.scalef(0.99975586F, 0.99975586F, 0.99975586F);
   }, RenderSystem::popMatrix);
   protected static final Hq_1 default_ = new Hq_1("no_fog", () -> {
   }, () -> {
   });
   protected static final Hq_1 const_ = new Hq_1("fog", () -> {
      HE.break_();
      RenderSystem.enableFog();
   }, () -> RenderSystem.disableFog());
   protected static final Hq_1 strictfp_ = new Hq_1("black_fog", () -> {
      RenderSystem.fog(2918, 0.0F, 0.0F, 0.0F, 1.0F);
      RenderSystem.enableFog();
   }, () -> {
      HE.break_();
      RenderSystem.disableFog();
   });
   protected static final Hg_1 boolean_ = new Hg_1("main_target", () -> {
   }, () -> {
   });
   protected static final Hg_1 transient_ = new Hg_1(
      "outline_target", () -> ((yX_2)QY.instanceof_().class_[8]).interface_().class_(false), () -> QY.instanceof_().B().class_(false)
   );
   protected static final Hg_1 for_ = new Hg_1("translucent_target", () -> {
      if (QY.d()) {
         ((yX_2)QY.instanceof_().class_[8]).char_().class_(false);
      }
   }, () -> {
      if (QY.d()) {
         QY.instanceof_().B().class_(false);
      }
   });
   protected static final Hg_1 double_ = new Hg_1("particles_target", () -> {
      if (QY.d()) {
         ((yX_2)QY.instanceof_().class_[8]).long_().class_(false);
      }
   }, () -> {
      if (QY.d()) {
         QY.instanceof_().B().class_(false);
      }
   });
   protected static final Hg_1 switch_ = new Hg_1("weather_target", () -> {
      if (QY.d()) {
         ((yX_2)QY.instanceof_().class_[8]).float_().class_(false);
      }
   }, () -> {
      if (QY.d()) {
         QY.instanceof_().B().class_(false);
      }
   });
   protected static final Hg_1 r = new Hg_1("clouds_target", () -> {
      if (QY.d()) {
         ((yX_2)QY.instanceof_().class_[8]).void_().class_(false);
      }
   }, () -> {
      if (QY.d()) {
         QY.instanceof_().B().class_(false);
      }
   });
   protected static final Hg_1 P = new Hg_1("item_entity_target", () -> {
      if (QY.d()) {
         ((yX_2)QY.instanceof_().class_[8]).abstract_().class_(false);
      }
   }, () -> {
      if (QY.d()) {
         QY.instanceof_().B().class_(false);
      }
   });
   protected static final Hw_1 B = new Hw_1(OptionalDouble.of(1.0));

   public String byte_() {
      return this.class_;
   }

   public Hn_1(String var1, Runnable var2, Runnable var3) {
      this.class_ = var1;
      this.S = var2;
      this.s = var3;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         Hn_1 var2 = (Hn_1)var1;
         return this.class_.equals(var2.class_);
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return this.class_;
   }

   @Override
   public int hashCode() {
      return this.class_.hashCode();
   }

   private static void class_(float var0) {
      RenderSystem.matrixMode(5890);
      RenderSystem.pushMatrix();
      RenderSystem.loadIdentity();
      long var1 = rqR_2.break_() * 8L;
      float var3 = (float)(var1 % 110000L) / 110000.0F;
      float var4 = (float)(var1 % 30000L) / 30000.0F;
      RenderSystem.translatef(-var3, var4, 0.0F);
      RenderSystem.rotatef(10.0F, 0.0F, 0.0F, 1.0F);
      RenderSystem.scalef(var0, var0, var0);
      RenderSystem.matrixMode(5888);
   }

   public void class_() {
      this.S.run();
   }

   public void break_() {
      this.s.run();
   }
}
