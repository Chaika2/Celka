package celestial;

import java.util.ArrayList;
import java.util.Arrays;

public class rrdo_1 {
   private static String abstract_ = "MC_";
   public static final String class_ = "MC_VERSION";
   public static final String break_ = "MC_GL_VERSION";
   public static final String byte_ = "MC_GLSL_VERSION";
   public static final String protected_ = "MC_OS_WINDOWS";
   public static final String throws_ = "MC_OS_MAC";
   public static final String case_ = "MC_OS_LINUX";
   public static final String catch_ = "MC_OS_OTHER";
   public static final String private_ = "MC_GL_VENDOR_AMD";
   public static final String implements_ = "MC_GL_VENDOR_ATI";
   public static final String finally_ = "MC_GL_VENDOR_INTEL";
   public static final String extends_ = "MC_GL_VENDOR_MESA";
   public static final String native_ = "MC_GL_VENDOR_NVIDIA";
   public static final String volatile_ = "MC_GL_VENDOR_XORG";
   public static final String final_ = "MC_GL_VENDOR_OTHER";
   public static final String package_ = "MC_GL_RENDERER_RADEON";
   public static final String int_ = "MC_GL_RENDERER_GEFORCE";
   public static final String new_ = "MC_GL_RENDERER_QUADRO";
   public static final String continue_ = "MC_GL_RENDERER_INTEL";
   public static final String super_ = "MC_GL_RENDERER_GALLIUM";
   public static final String this_ = "MC_GL_RENDERER_MESA";
   public static final String else_ = "MC_GL_RENDERER_OTHER";
   public static final String synchronized_ = "MC_FXAA_LEVEL";
   public static final String return_ = "MC_NORMAL_MAP";
   public static final String public_ = "MC_SPECULAR_MAP";
   public static final String goto_ = "MC_RENDER_QUALITY";
   public static final String while_ = "MC_SHADOW_QUALITY";
   public static final String try_ = "MC_HAND_DEPTH";
   public static final String instanceof_ = "MC_OLD_HAND_LIGHT";
   public static final String throw_ = "MC_OLD_LIGHTING";
   public static final String interface_ = "MC_ANISOTROPIC_FILTERING";
   public static final String char_ = "MC_TEXTURE_FORMAT_";
   private static rrdY[] long_;
   private static rrdY[] float_;

   public static String byte_() {
      String var0 = rrbb_3.catch_;
      if (var0 == null) {
         return "MC_GL_RENDERER_OTHER";
      } else {
         var0 = var0.toLowerCase();
         if (var0.startsWith("amd")) {
            return "MC_GL_RENDERER_RADEON";
         } else if (var0.startsWith("ati")) {
            return "MC_GL_RENDERER_RADEON";
         } else if (var0.startsWith("radeon")) {
            return "MC_GL_RENDERER_RADEON";
         } else if (var0.startsWith("gallium")) {
            return "MC_GL_RENDERER_GALLIUM";
         } else if (var0.startsWith("intel")) {
            return "MC_GL_RENDERER_INTEL";
         } else if (var0.startsWith("geforce")) {
            return "MC_GL_RENDERER_GEFORCE";
         } else if (var0.startsWith("nvidia")) {
            return "MC_GL_RENDERER_GEFORCE";
         } else if (var0.startsWith("quadro")) {
            return "MC_GL_RENDERER_QUADRO";
         } else if (var0.startsWith("nvs")) {
            return "MC_GL_RENDERER_QUADRO";
         } else {
            return var0.startsWith("mesa") ? "MC_GL_RENDERER_MESA" : "MC_GL_RENDERER_OTHER";
         }
      }
   }

   private static void class_(StringBuilder var0, String var1, int var2) {
      var0.append("#define ");
      var0.append(var1);
      var0.append(" ");
      var0.append(var2);
      var0.append("\n");
   }

   public static String class_() {
      rqi_3 var0 = rqR_2.implements_();
      switch (var0) {
         case WINDOWS:
            return "MC_OS_WINDOWS";
         case OSX:
            return "MC_OS_MAC";
         case LINUX:
            return "MC_OS_LINUX";
         default:
            return "MC_OS_OTHER";
      }
   }

   private static void class_(StringBuilder var0, String var1) {
      var0.append("#define ");
      var0.append(var1);
      var0.append("\n");
   }

   private static void class_(StringBuilder var0, String var1, float var2) {
      var0.append("#define ");
      var0.append(var1);
      var0.append(" ");
      var0.append(var2);
      var0.append("\n");
   }

   public static String break_() {
      String var0 = rrbb_3.case_;
      if (var0 != null && var0.contains("Mesa")) {
         return "MC_GL_VENDOR_MESA";
      } else {
         String var1 = rrbb_3.private_;
         if (var1 == null) {
            return "MC_GL_VENDOR_OTHER";
         } else {
            var1 = var1.toLowerCase();
            if (var1.startsWith("amd")) {
               return "MC_GL_VENDOR_AMD";
            } else if (var1.startsWith("ati")) {
               return "MC_GL_VENDOR_ATI";
            } else if (var1.startsWith("intel")) {
               return "MC_GL_VENDOR_INTEL";
            } else if (var1.startsWith("nvidia")) {
               return "MC_GL_VENDOR_NVIDIA";
            } else {
               return var1.startsWith("x.org") ? "MC_GL_VENDOR_XORG" : "MC_GL_VENDOR_OTHER";
            }
         }
      }
   }

   public static rrdY[] throws_() {
      if (long_ == null) {
         String[] var0 = rrbb_3.native_();
         rrdY[] var1 = new rrdY[var0.length];

         for (int var2 = 0; var2 < var0.length; var2++) {
            var1[var2] = new rrdY(abstract_ + var0[var2], "");
         }

         long_ = var1;
      }

      return long_;
   }

   public static String[] finally_() {
      String var0 = catch_() + private_() + implements_();
      return rrbb_3.class_(var0, "\n\r");
   }

   public static String catch_() {
      StringBuilder var0 = new StringBuilder();
      class_(var0, "MC_VERSION", rrbb_3.private_());
      class_(var0, "MC_GL_VERSION " + rrbb_3.finally_().protected_());
      class_(var0, "MC_GLSL_VERSION " + rrbb_3.extends_().protected_());
      class_(var0, class_());
      class_(var0, break_());
      class_(var0, byte_());
      return var0.toString();
   }

   private static rrdY[] extends_() {
      rrdX[] var0 = rrdX.values();
      rrdY[] var1 = new rrdY[var0.length];

      for (int var2 = 0; var2 < var0.length; var2++) {
         rrdX var3 = var0[var2];
         var1[var2] = new rrdY(abstract_ + "RENDER_STAGE_" + var3.name(), var3.ordinal() + "");
      }

      return var1;
   }

   public static rrdY[] case_() {
      if (float_ == null) {
         ArrayList var0 = new ArrayList();
         var0.addAll(Arrays.asList(extends_()));
         float_ = var0.toArray(new rrdY[var0.size()]);
      }

      return float_;
   }

   public static String implements_() {
      fJ_2 var0 = rrbb_3.rF();
      if (var0 == null) {
         return "";
      } else {
         rrdr_1 var1 = var0.final_();
         if (var1 == null) {
            return "";
         } else {
            StringBuilder var2 = new StringBuilder();
            String var3 = var1.class_();
            if (var3 != null) {
               class_(var2, "MC_TEXTURE_FORMAT_" + var3);
               String var4 = var1.break_();
               if (var4 != null) {
                  class_(var2, "MC_TEXTURE_FORMAT_" + var3 + "_" + var4);
               }
            }

            return var2.toString();
         }
      }
   }

   public static String protected_() {
      return abstract_;
   }

   public static String private_() {
      StringBuilder var0 = new StringBuilder();
      if (rrdZ.So > 0) {
         class_(var0, "MC_FXAA_LEVEL", rrdZ.So);
      }

      if (rrdZ.SV) {
         class_(var0, "MC_NORMAL_MAP");
      }

      if (rrdZ.Sg) {
         class_(var0, "MC_SPECULAR_MAP");
      }

      class_(var0, "MC_RENDER_QUALITY", rrdZ.Sy);
      class_(var0, "MC_SHADOW_QUALITY", rrdZ.Sp);
      class_(var0, "MC_HAND_DEPTH", rrdZ.SH);
      if (rrdZ.implements_()) {
         class_(var0, "MC_OLD_HAND_LIGHT");
      }

      if (rrdZ.extends_()) {
         class_(var0, "MC_OLD_LIGHTING");
      }

      if (rrbb_3.p()) {
         class_(var0, "MC_ANISOTROPIC_FILTERING", rrbb_3.y());
      }

      return var0.toString();
   }
}
