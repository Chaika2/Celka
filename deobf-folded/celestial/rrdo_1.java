package celestial;

import java.util.ArrayList;
import java.util.Arrays;

public class rrdo_1 {
   private static String id_abstract = "MC_";
   public static final String id_class = "MC_VERSION";
   public static final String id_break = "MC_GL_VERSION";
   public static final String id_byte = "MC_GLSL_VERSION";
   public static final String id_protected = "MC_OS_WINDOWS";
   public static final String id_throws = "MC_OS_MAC";
   public static final String id_case = "MC_OS_LINUX";
   public static final String id_catch = "MC_OS_OTHER";
   public static final String id_private = "MC_GL_VENDOR_AMD";
   public static final String id_implements = "MC_GL_VENDOR_ATI";
   public static final String id_finally = "MC_GL_VENDOR_INTEL";
   public static final String id_extends = "MC_GL_VENDOR_MESA";
   public static final String id_native = "MC_GL_VENDOR_NVIDIA";
   public static final String id_volatile = "MC_GL_VENDOR_XORG";
   public static final String id_final = "MC_GL_VENDOR_OTHER";
   public static final String id_package = "MC_GL_RENDERER_RADEON";
   public static final String id_int = "MC_GL_RENDERER_GEFORCE";
   public static final String id_new = "MC_GL_RENDERER_QUADRO";
   public static final String id_continue = "MC_GL_RENDERER_INTEL";
   public static final String id_super = "MC_GL_RENDERER_GALLIUM";
   public static final String id_this = "MC_GL_RENDERER_MESA";
   public static final String id_else = "MC_GL_RENDERER_OTHER";
   public static final String id_synchronized = "MC_FXAA_LEVEL";
   public static final String id_return = "MC_NORMAL_MAP";
   public static final String id_public = "MC_SPECULAR_MAP";
   public static final String id_goto = "MC_RENDER_QUALITY";
   public static final String id_while = "MC_SHADOW_QUALITY";
   public static final String id_try = "MC_HAND_DEPTH";
   public static final String id_instanceof = "MC_OLD_HAND_LIGHT";
   public static final String id_throw = "MC_OLD_LIGHTING";
   public static final String id_interface = "MC_ANISOTROPIC_FILTERING";
   public static final String id_char = "MC_TEXTURE_FORMAT_";
   private static rrdY[] id_long;
   private static rrdY[] id_float;

   public static String id_byte() {
      String var0 = rrbb_3.id_catch;
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

   private static void id_class(StringBuilder var0, String var1, int var2) {
      var0.append("#define ");
      var0.append(var1);
      var0.append(" ");
      var0.append(var2);
      var0.append("\n");
   }

   public static String id_class() {
      rqi_3 var0 = rqR_2.id_implements();
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

   private static void id_class(StringBuilder var0, String var1) {
      var0.append("#define ");
      var0.append(var1);
      var0.append("\n");
   }

   private static void id_class(StringBuilder var0, String var1, float var2) {
      var0.append("#define ");
      var0.append(var1);
      var0.append(" ");
      var0.append(var2);
      var0.append("\n");
   }

   public static String id_break() {
      String var0 = rrbb_3.id_case;
      if (var0 != null && var0.contains("Mesa")) {
         return "MC_GL_VENDOR_MESA";
      } else {
         String var1 = rrbb_3.id_private;
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

   public static rrdY[] id_throws() {
      if (id_long == null) {
         String[] var0 = rrbb_3.id_native();
         rrdY[] var1 = new rrdY[var0.length];

         for (int var2 = 0; var2 < var0.length; var2++) {
            var1[var2] = new rrdY(id_abstract + var0[var2], "");
         }

         id_long = var1;
      }

      return id_long;
   }

   public static String[] id_finally() {
      String var0 = id_catch() + id_private() + id_implements();
      return rrbb_3.id_class(var0, "\n\r");
   }

   public static String id_catch() {
      StringBuilder var0 = new StringBuilder();
      id_class(var0, "MC_VERSION", rrbb_3.id_private());
      id_class(var0, "MC_GL_VERSION " + rrbb_3.id_finally().id_protected());
      id_class(var0, "MC_GLSL_VERSION " + rrbb_3.id_extends().id_protected());
      id_class(var0, id_class());
      id_class(var0, id_break());
      id_class(var0, id_byte());
      return var0.toString();
   }

   private static rrdY[] id_extends() {
      rrdX[] var0 = rrdX.values();
      rrdY[] var1 = new rrdY[var0.length];

      for (int var2 = 0; var2 < var0.length; var2++) {
         rrdX var3 = var0[var2];
         var1[var2] = new rrdY(id_abstract + "RENDER_STAGE_" + var3.name(), var3.ordinal() + "");
      }

      return var1;
   }

   public static rrdY[] id_case() {
      if (id_float == null) {
         ArrayList var0 = new ArrayList();
         var0.addAll(Arrays.asList(id_extends()));
         id_float = var0.toArray(new rrdY[var0.size()]);
      }

      return id_float;
   }

   public static String id_implements() {
      fJ_2 var0 = rrbb_3.rF();
      if (var0 == null) {
         return "";
      } else {
         rrdr_1 var1 = var0.id_final();
         if (var1 == null) {
            return "";
         } else {
            StringBuilder var2 = new StringBuilder();
            String var3 = var1.id_class();
            if (var3 != null) {
               id_class(var2, "MC_TEXTURE_FORMAT_" + var3);
               String var4 = var1.id_break();
               if (var4 != null) {
                  id_class(var2, "MC_TEXTURE_FORMAT_" + var3 + "_" + var4);
               }
            }

            return var2.toString();
         }
      }
   }

   public static String id_protected() {
      return id_abstract;
   }

   public static String id_private() {
      StringBuilder var0 = new StringBuilder();
      if (rrdZ.So > 0) {
         id_class(var0, "MC_FXAA_LEVEL", rrdZ.So);
      }

      if (rrdZ.SV) {
         id_class(var0, "MC_NORMAL_MAP");
      }

      if (rrdZ.Sg) {
         id_class(var0, "MC_SPECULAR_MAP");
      }

      id_class(var0, "MC_RENDER_QUALITY", rrdZ.Sy);
      id_class(var0, "MC_SHADOW_QUALITY", rrdZ.Sp);
      id_class(var0, "MC_HAND_DEPTH", rrdZ.SH);
      if (rrdZ.id_implements()) {
         id_class(var0, "MC_OLD_HAND_LIGHT");
      }

      if (rrdZ.id_extends()) {
         id_class(var0, "MC_OLD_LIGHTING");
      }

      if (rrbb_3.p()) {
         id_class(var0, "MC_ANISOTROPIC_FILTERING", rrbb_3.y());
      }

      return var0.toString();
   }
}
