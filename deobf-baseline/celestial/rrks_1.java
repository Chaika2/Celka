package celestial;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class rrks_1 {
   private static final Pattern id_class = Pattern.compile("^\\s*#version\\s+.*$");
   private static final Pattern id_break = Pattern.compile("^\\s*#include\\s+\"([A-Za-z0-9_/\\.]+)\".*$");
   private static final Set<String> id_byte = id_class();
   private static final Map<String, Integer> id_protected = id_break();
   private static final Map<String, Integer> id_throws = id_byte();

   public static Set<String> id_byte(Properties var0, rrdD[] var1) {
      HashSet var2 = new HashSet();
      String var3 = var0.getProperty("sliders");
      if (var3 == null) {
         return var2;
      } else {
         String[] var4 = rrbb_3.id_class(var3, " ");

         for (int var5 = 0; var5 < var4.length; var5++) {
            String var6 = var4[var5];
            rrdD var7 = rrdm_1.id_class(var6, var1);
            if (var7 == null) {
               rrbb_3.id_protected("Invalid shader option: " + var6);
            } else {
               var2.add(var6);
            }
         }

         return var2;
      }
   }

   private static rrdj_1 id_byte(String var0) {
      if (var0 == null) {
         return null;
      } else {
         String[] var1 = rrbb_3.id_class(var0, " ");
         float var2 = rrbb_3.id_class(var1[0], -1.0F);
         float var3 = 0.0F;
         float var4 = 0.0F;
         if (var1.length > 1) {
            if (var1.length != 3) {
               rrdJ.id_class("Invalid render scale: " + var0);
               return null;
            }

            var3 = rrbb_3.id_class(var1[1], -1.0F);
            var4 = rrbb_3.id_class(var1[2], -1.0F);
         }

         if (rrbb_3.id_break(var2, 0.0F, 1.0F) && rrbb_3.id_break(var3, 0.0F, 1.0F) && rrbb_3.id_break(var4, 0.0F, 1.0F)) {
            return new rrdj_1(var2, var3, var4);
         } else {
            rrdJ.id_class("Invalid render scale: " + var0);
            return null;
         }
      }
   }

   private static Map<String, Integer> id_byte() {
      HashMap var0 = new HashMap();
      var0.put("ZERO", new Integer(0));
      var0.put("ONE", new Integer(1));
      var0.put("SRC_COLOR", new Integer(768));
      var0.put("ONE_MINUS_SRC_COLOR", new Integer(769));
      var0.put("DST_COLOR", new Integer(774));
      var0.put("ONE_MINUS_DST_COLOR", new Integer(775));
      var0.put("SRC_ALPHA", new Integer(770));
      var0.put("ONE_MINUS_SRC_ALPHA", new Integer(771));
      var0.put("DST_ALPHA", new Integer(772));
      var0.put("ONE_MINUS_DST_ALPHA", new Integer(773));
      var0.put("CONSTANT_COLOR", new Integer(32769));
      var0.put("ONE_MINUS_CONSTANT_COLOR", new Integer(32770));
      var0.put("CONSTANT_ALPHA", new Integer(32771));
      var0.put("ONE_MINUS_CONSTANT_ALPHA", new Integer(32772));
      var0.put("SRC_ALPHA_SATURATE", new Integer(776));
      return Collections.unmodifiableMap(var0);
   }

   public static void id_byte(Properties var0) {
      for (String var2 : var0.keySet()) {
         String[] var3 = rrbb_3.id_class(var2, ".");
         if (var3.length >= 2 && var3.length <= 3) {
            String var4 = var3[0];
            String var5 = var3[1];
            String var6 = var3.length == 3 ? var3[2] : null;
            if (var4.equals("blend")) {
               rrdG var7 = rrdZ.id_native(var5);
               if (var7 == null) {
                  rrdJ.id_class("Invalid program name: " + var5);
               } else {
                  String var8 = var0.getProperty(var2).trim();
                  rrxz_3 var9 = id_break(var8);
                  if (var9 != null) {
                     if (var6 != null) {
                        int var10 = var7.id_case().id_protected() ? rrkG.id_byte(var6) : rrdZ.id_implements(var6);
                        int var11 = var7.id_case().id_protected() ? 2 : 16;
                        if (var10 >= 0 && var10 < var11) {
                           var7.id_class(var10, var9);
                           rrdJ.id_byte("Blend " + var5 + "." + var6 + "=" + var8);
                        } else {
                           rrdJ.id_class("Invalid buffer name: " + var6);
                        }
                     } else {
                        var7.id_class(var9);
                     }
                  }
               }
            }
         }
      }
   }

   private static rrXt_1 id_class(rrXt_1 var0) {
      if (var0 instanceof rrXf_1) {
         return new rrXL((rrXf_1)var0);
      } else {
         return (rrXt_1)(var0 instanceof rrXj_1 ? new rrXF((rrXj_1)var0) : var0);
      }
   }

   private static rrkz_1 id_class(String var0, String var1, String var2, String var3, Map<String, rrXt_1> var4) {
      try {
         rrkt_1 var5 = rrkt_1.id_break(var2);
         if (var5 == null) {
            rrdJ.id_break("Unknown " + var0 + " type: " + var5);
            return null;
         } else {
            rrkN var6 = new rrkN(var4);
            rrXA var7 = new rrXA(var6);
            rrXt_1 var8 = var7.id_byte(var3);
            rrXC var9 = var8.id_byte();
            if (!var5.id_class(var9)) {
               rrdJ.id_break("Expression type does not match " + var0 + " type, expression: " + var9 + ", " + var0 + ": " + var5 + " " + var1);
               return null;
            } else {
               var8 = id_class(var8);
               return new rrkz_1(var1, var5, var8);
            }
         }
      } catch (rrXo_1 var10) {
         rrdJ.id_break(var10.getClass().getName() + ": " + var10.getMessage());
         return null;
      }
   }

   public static rrkQ id_class(Properties var0) {
      String var1 = "uniform";
      String var2 = "variable";
      String var3 = var1 + ".";
      String var4 = var2 + ".";
      HashMap var5 = new HashMap();
      ArrayList var6 = new ArrayList();

      for (String var8 : var0.keySet()) {
         String[] var9 = rrbb_3.id_class(var8, ".");
         if (var9.length == 3) {
            String var10 = var9[0];
            String var11 = var9[1];
            String var12 = var9[2];
            String var13 = var0.getProperty(var8).trim();
            if (var5.containsKey(var12)) {
               rrdJ.id_break("Expression already defined: " + var12);
            } else if (var10.equals(var1) || var10.equals(var2)) {
               rrdJ.id_byte("Custom " + var10 + ": " + var12);
               rrkz_1 var14 = id_class(var10, var12, var11, var13, var5);
               if (var14 != null) {
                  var5.put(var12, var14.id_throws());
                  if (!var10.equals(var2)) {
                     var6.add(var14);
                  }
               }
            }
         }
      }

      if (var6.size() <= 0) {
         return null;
      } else {
         rrkz_1[] var15 = var6.toArray(new rrkz_1[var6.size()]);
         return new rrkQ(var15, var5);
      }
   }

   private static rrWV id_class(String var0, rrxi_3 var1, int var2, List<String> var3, int var4) throws IOException {
      if (var4 >= 10) {
         throw new IOException("#include depth exceeded: " + var4 + ", file: " + var0);
      } else {
         var4++;
         InputStream var5 = var1.id_class(var0);
         if (var5 == null) {
            return null;
         } else {
            InputStreamReader var6 = new InputStreamReader(var5, "ASCII");
            rrWV var7 = rrWV.id_class(var6);
            return id_class(var7, var0, var1, var2, var3, var4);
         }
      }
   }

   private static rrdY[] id_class(String var0, rrdY[] var1) {
      ArrayList var2 = new ArrayList();

      for (int var3 = 0; var3 < var1.length; var3++) {
         rrdY var4 = var1[var3];
         if (var0.contains(var4.id_class())) {
            var2.add(var4);
         }
      }

      return var2.toArray(new rrdY[var2.size()]);
   }

   private static boolean id_class(rrdD var0, String[] var1) {
      for (int var2 = 0; var2 < var1.length; var2++) {
         String var3 = var1[var2];
         if (var0.id_catch(var3)) {
            return true;
         }
      }

      return false;
   }

   public static rrWV id_class(rrWV var0) throws IOException {
      if (!rrdZ.i()) {
         return var0;
      } else {
         rrWV var1 = new rrWV();

         for (String var3 : var0) {
            String var4 = var3.replace("gl_TextureMatrix[1]", "gl_TextureMatrix[2]");
            var4 = var4.replace("gl_MultiTexCoord1", "gl_MultiTexCoord2");
            if (!var4.equals(var3)) {
               var4 = var4 + " // Legacy fix, replaced TU 1 with 2";
               var3 = var4;
            }

            var1.id_class(var3);
         }

         return var1;
      }
   }

   public static rrWz_1[] id_class(Properties var0, int var1) {
      rrWz_1[] var2 = new rrWz_1[var1];

      for (Object var4 : var0.keySet()) {
         String var5 = (String)var4;
         if (var5.startsWith("size.buffer.")) {
            String[] var6 = rrbb_3.id_class(var5, ".");
            if (var6.length == 3) {
               String var7 = var6[2];
               int var8 = rrdZ.id_implements(var7);
               if (var8 >= 0 && var8 < var2.length) {
                  String var9 = var0.getProperty(var5).trim();
                  rrWz_1 var10 = id_protected(var9);
                  if (var10 == null) {
                     rrdJ.id_class("Invalid buffer size: " + var5 + "=" + var9);
                  } else {
                     var2[var8] = var10;
                     if (var10.id_class()) {
                        rrdJ.id_byte("Relative size " + var7 + ": " + var10.id_break() + " " + var10.id_byte());
                     } else {
                        rrdJ.id_byte("Fixed size " + var7 + ": " + (int)var10.id_break() + " " + (int)var10.id_byte());
                     }
                  }
               } else {
                  rrdJ.id_class("Invalid buffer name: " + var5);
               }
            }
         }
      }

      return var2;
   }

   public static rrdD[] id_class(rrxi_3 var0, String[] var1, List<Integer> var2) {
      if (var0 == null) {
         return new rrdD[0];
      } else {
         HashMap var3 = new HashMap();
         id_class(var0, "/shaders", var1, var3);

         for (int var5 : var2) {
            String var6 = "/shaders/world" + var5;
            id_class(var0, var6, var1, var3);
         }

         Collection var7 = var3.values();
         rrdD[] var8 = var7.toArray(new rrdD[var7.size()]);
         rrkE var9 = new rrkE();
         Arrays.sort(var8, var9);
         return var8;
      }
   }

   private static void id_class(rrxi_3 var0, String var1, String[] var2, Map<String, rrdD> var3) {
      for (int var4 = 0; var4 < var2.length; var4++) {
         String var5 = var2[var4];
         if (!var5.equals("")) {
            String var6 = var1 + "/" + var5 + ".csh";
            String var7 = var1 + "/" + var5 + ".vsh";
            String var8 = var1 + "/" + var5 + ".gsh";
            String var9 = var1 + "/" + var5 + ".fsh";
            id_class(var0, var6, var3);
            id_class(var0, var7, var3);
            id_class(var0, var8, var3);
            id_class(var0, var9, var3);
         }
      }
   }

   private static void id_class(rrxi_3 var0, String var1, Map<String, rrdD> var2) {
      String[] var3 = id_class(var0, var1);

      for (int var4 = 0; var4 < var3.length; var4++) {
         String var5 = var3[var4];
         rrdD var6 = id_class(var5, var1);
         if (var6 != null && !var6.id_class().startsWith(rrdo_1.id_protected()) && (!var6.id_final() || id_class(var6, var3))) {
            String var7 = var6.id_class();
            rrdD var8 = (rrdD)var2.get(var7);
            if (var8 != null) {
               if (!rrbb_3.id_class(var8.id_throws(), var6.id_throws())) {
                  if (var8.id_finally()) {
                     rrbb_3.id_protected("Ambiguous shader option: " + var6.id_class());
                     rrbb_3.id_protected(" - in " + rrbb_3.id_class(var8.id_implements()) + ": " + var8.id_throws());
                     rrbb_3.id_protected(" - in " + rrbb_3.id_class(var6.id_implements()) + ": " + var6.id_throws());
                  }

                  var8.id_class(false);
               }

               if (var8.id_break() == null || var8.id_break().length() <= 0) {
                  var8.id_class(var6.id_break());
               }

               var8.id_class(var6.id_implements());
            } else {
               var2.put(var7, var6);
            }
         }
      }
   }

   public static rrxW_2 id_class(String var0) {
      if (var0 == null) {
         return null;
      } else {
         String[] var1 = rrbb_3.id_class(var0, " ");
         if (var1.length == 1) {
            String var2 = var1[0];
            if (var2.equals("off") || var2.equals("false")) {
               return new rrxW_2(false);
            }
         } else if (var1.length == 2) {
            String var6 = var1[0];
            String var3 = var1[1];
            Integer var4 = id_protected.get(var6);
            float var5 = rrbb_3.id_class(var3, -1.0F);
            if (var4 != null && var5 >= 0.0F) {
               return new rrxW_2(true, var4, var5);
            }
         }

         rrdJ.id_class("Invalid alpha test: " + var0);
         return null;
      }
   }

   private static String[] id_class(rrxi_3 var0, String var1) {
      try {
         ArrayList var2 = new ArrayList();
         rrWV var3 = id_class(var1, var0, 0, var2, 0);
         return var3 == null ? new String[0] : var3.id_break();
      } catch (IOException var4) {
         rrbb_3.id_byte(var4.getClass().getName() + ": " + var4.getMessage());
         return new String[0];
      }
   }

   private static rrXw_1 id_class(String var0, rrdD[] var1) {
      try {
         rrde_1 var2 = new rrde_1(var1);
         rrXA var3 = new rrXA(var2);
         return var3.id_break(var0);
      } catch (rrXo_1 var4) {
         rrdJ.id_break(var4.getClass().getName() + ": " + var4.getMessage());
         return null;
      }
   }

   private static rrdD id_class(String var0, String var1) {
      rrdD var2 = null;
      if (var2 == null) {
         var2 = rrkr_1.id_class(var0, var1);
      }

      if (var2 == null) {
         var2 = rrkB.id_class(var0, var1);
      }

      if (var2 != null) {
         return var2;
      } else {
         if (var2 == null) {
            var2 = rrkP.id_break(var0, var1);
         }

         if (var2 == null) {
            var2 = rrkS.id_byte(var0, var1);
         }

         return var2 != null && id_byte.contains(var2.id_class()) ? var2 : null;
      }
   }

   public static rrkb_1[] id_class(Properties var0, rrdD[] var1) {
      String var2 = "profile.";
      ArrayList var3 = new ArrayList();

      for (String var5 : var0.keySet()) {
         if (var5.startsWith(var2)) {
            String var6 = var5.substring(var2.length());
            var0.getProperty(var5);
            HashSet var7 = new HashSet();
            rrkb_1 var8 = id_class(var6, var0, var7, var1);
            if (var8 != null) {
               var3.add(var8);
            }
         }
      }

      return var3.size() <= 0 ? null : var3.toArray(new rrkb_1[var3.size()]);
   }

   private static Set<String> id_class() {
      HashSet var0 = new HashSet();
      var0.add("shadowMapResolution");
      var0.add("shadowMapFov");
      var0.add("shadowDistance");
      var0.add("shadowDistanceRenderMul");
      var0.add("shadowIntervalSize");
      var0.add("generateShadowMipmap");
      var0.add("generateShadowColorMipmap");
      var0.add("shadowHardwareFiltering");
      var0.add("shadowHardwareFiltering0");
      var0.add("shadowHardwareFiltering1");
      var0.add("shadowtex0Mipmap");
      var0.add("shadowtexMipmap");
      var0.add("shadowtex1Mipmap");
      var0.add("shadowcolor0Mipmap");
      var0.add("shadowColor0Mipmap");
      var0.add("shadowcolor1Mipmap");
      var0.add("shadowColor1Mipmap");
      var0.add("shadowtex0Nearest");
      var0.add("shadowtexNearest");
      var0.add("shadow0MinMagNearest");
      var0.add("shadowtex1Nearest");
      var0.add("shadow1MinMagNearest");
      var0.add("shadowcolor0Nearest");
      var0.add("shadowColor0Nearest");
      var0.add("shadowColor0MinMagNearest");
      var0.add("shadowcolor1Nearest");
      var0.add("shadowColor1Nearest");
      var0.add("shadowColor1MinMagNearest");
      var0.add("wetnessHalflife");
      var0.add("drynessHalflife");
      var0.add("eyeBrightnessHalflife");
      var0.add("centerDepthHalflife");
      var0.add("sunPathRotation");
      var0.add("ambientOcclusionLevel");
      var0.add("superSamplingLevel");
      var0.add("noiseTextureResolution");
      return var0;
   }

   public static rrWV id_class(rrWV var0, String var1, rrxi_3 var2, int var3, List<String> var4, int var5) throws IOException {
      String var6 = "/";
      int var7 = var1.lastIndexOf("/");
      if (var7 >= 0) {
         var6 = var1.substring(0, var7);
      }

      rrWV var8 = new rrWV();
      int var9 = -1;
      int var10 = 0;

      for (String var12 : var0) {
         var10++;
         if (var9 < 0) {
            Matcher var13 = id_class.matcher(var12);
            if (var13.matches()) {
               var8.id_class(var12);
               String[] var23 = rrdo_1.id_finally();
               var8.id_class(var23);
               var9 = var8.id_class();
               String var25 = "#line " + (var10 + 1) + " " + var3;
               var8.id_class(var25);
               continue;
            }
         }

         Matcher var21 = id_break.matcher(var12);
         if (var21.matches()) {
            String var14 = var21.group(1);
            boolean var15 = var14.startsWith("/");
            String var16 = var15 ? "/shaders" + var14 : var6 + "/" + var14;
            if (!var4.contains(var16)) {
               var4.add(var16);
            }

            int var17 = var4.indexOf(var16) + 1;
            rrWV var18 = id_class(var16, var2, var17, var4, var5);
            if (var18 == null) {
               throw new IOException("Included file not found: " + var1);
            }

            if (var18.id_class(id_class) < 0) {
               var8.id_class("#line 1 " + var17);
            }

            var8.id_class(var18.id_break());
            var8.id_class("#line " + (var10 + 1) + " " + var3);
         } else {
            var8.id_class(var12);
         }
      }

      if (var9 >= 0) {
         rrdY[] var19 = id_class(var8, var9);
         if (var19.length > 0) {
            rrWV var20 = new rrWV();

            for (int var22 = 0; var22 < var19.length; var22++) {
               rrdY var24 = var19[var22];
               var20.id_class(var24.id_byte());
            }

            var8.id_class(var9, var20.id_break());
         }
      }

      return var8;
   }

   private static boolean id_class(String var0, Properties var1, Map<String, rrdV> var2, rrkb_1[] var3, rrdD[] var4) {
      String var5 = var1.getProperty(var0);
      if (var5 == null) {
         return false;
      } else {
         String var6 = var0 + "$parent$";
         if (var2.containsKey(var6)) {
            rrbb_3.id_protected("[Shaders] Screen circular reference: " + var0 + " = " + var5);
            return false;
         } else {
            ArrayList var7 = new ArrayList();
            HashSet var8 = new HashSet();
            String[] var9 = rrbb_3.id_class(var5, " ");

            for (int var10 = 0; var10 < var9.length; var10++) {
               String var11 = var9[var10];
               if (var11.equals("<empty>")) {
                  var7.add((rrdD)null);
               } else if (var8.contains(var11)) {
                  rrbb_3.id_protected("[Shaders] Duplicate option: " + var11 + ", key: " + var0);
               } else {
                  var8.add(var11);
                  if (var11.equals("<profile>")) {
                     if (var3 == null) {
                        rrbb_3.id_protected("[Shaders] Option profile can not be used, no profiles defined: " + var11 + ", key: " + var0);
                     } else {
                        rrdU var12 = new rrdU(var3, var4);
                        var7.add(var12);
                     }
                  } else if (var11.equals("*")) {
                     rrda_1 var17 = new rrda_1("<rest>");
                     var7.add(var17);
                  } else if (var11.startsWith("[") && var11.endsWith("]")) {
                     String var19 = rrzX_2.id_byte(var11, "[", "]");
                     if (!var19.matches("^[a-zA-Z0-9_]+$")) {
                        rrbb_3.id_protected("[Shaders] Invalid screen: " + var11 + ", key: " + var0);
                     } else {
                        var2.put(var6, (rrdV)null);
                        boolean var13 = id_class("screen." + var19, var1, var2, var3, var4);
                        var2.remove(var6);
                        if (!var13) {
                           rrbb_3.id_protected("[Shaders] Invalid screen: " + var11 + ", key: " + var0);
                        } else {
                           rrdi_1 var14 = new rrdi_1(var19);
                           var7.add(var14);
                        }
                     }
                  } else {
                     rrdD var18 = rrdm_1.id_class(var11, var4);
                     if (var18 == null) {
                        rrbb_3.id_protected("[Shaders] Invalid option: " + var11 + ", key: " + var0);
                        var7.add((rrdD)null);
                     } else {
                        var18.id_break(true);
                        var7.add(var18);
                     }
                  }
               }
            }

            rrdD[] var15 = var7.toArray(new rrdD[var7.size()]);
            String var16 = var1.getProperty(var0 + ".columns");
            int var20 = rrbb_3.id_class(var16, 2);
            rrdV var21 = new rrdV(var0, var15, var20);
            var2.put(var0, var21);
            return true;
         }
      }
   }

   public static Map<String, rrdV> id_class(Properties var0, rrkb_1[] var1, rrdD[] var2) {
      HashMap var3 = new HashMap();
      id_class("screen", var0, var3, var1, var2);
      return var3.isEmpty() ? null : var3;
   }

   private static rrkb_1 id_class(String var0, Properties var1, Set<String> var2, rrdD[] var3) {
      String var4 = "profile.";
      String var5 = var4 + var0;
      if (var2.contains(var5)) {
         rrbb_3.id_protected("[Shaders] Profile already parsed: " + var0);
         return null;
      } else {
         var2.add(var0);
         rrkb_1 var6 = new rrkb_1(var0);
         String var7 = var1.getProperty(var5);
         String[] var8 = rrbb_3.id_class(var7, " ");

         for (int var9 = 0; var9 < var8.length; var9++) {
            String var10 = var8[var9];
            if (var10.startsWith(var4)) {
               String var11 = var10.substring(var4.length());
               rrkb_1 var12 = id_class(var11, var1, var2, var3);
               if (var6 != null) {
                  var6.id_class(var12);
                  var6.id_class(var12.id_byte());
               }
            } else {
               String[] var16 = rrbb_3.id_class(var10, ":=");
               if (var16.length == 1) {
                  String var17 = var16[0];
                  boolean var13 = true;
                  if (var17.startsWith("!")) {
                     var13 = false;
                     var17 = var17.substring(1);
                  }

                  String var14 = "program.";
                  if (var17.startsWith(var14)) {
                     String var15 = var17.substring(var14.length());
                     if (!rrdZ.id_extends(var15)) {
                        rrbb_3.id_protected("Invalid program: " + var15 + " in profile: " + var6.id_class());
                     } else if (var13) {
                        var6.id_byte(var15);
                     } else {
                        var6.id_break(var15);
                     }
                  } else {
                     rrdD var21 = rrdm_1.id_class(var17, var3);
                     if (!(var21 instanceof rrkr_1)) {
                        rrbb_3.id_protected("[Shaders] Invalid option: " + var17);
                     } else {
                        var6.id_class(var17, String.valueOf(var13));
                        var21.id_break(true);
                     }
                  }
               } else if (var16.length != 2) {
                  rrbb_3.id_protected("[Shaders] Invalid option value: " + var10);
               } else {
                  String var18 = var16[0];
                  String var19 = var16[1];
                  rrdD var20 = rrdm_1.id_class(var18, var3);
                  if (var20 == null) {
                     rrbb_3.id_protected("[Shaders] Invalid option: " + var10);
                  } else if (!var20.id_byte(var19)) {
                     rrbb_3.id_protected("[Shaders] Invalid value: " + var10);
                  } else {
                     var20.id_break(true);
                     var6.id_class(var18, var19);
                  }
               }
            }
         }

         return var6;
      }
   }

   private static rrdY[] id_class(rrWV var0, int var1) {
      LinkedHashSet var2 = new LinkedHashSet();

      for (int var3 = var1; var3 < var0.id_class(); var3++) {
         String var4 = var0.id_class(var3);
         if (var4.contains(rrdo_1.id_protected())) {
            rrdY[] var5 = id_class(var4, rrdo_1.id_throws());
            var2.addAll(Arrays.asList(var5));
            rrdY[] var6 = id_class(var4, rrdo_1.id_case());
            var2.addAll(Arrays.asList(var6));
         }
      }

      return var2.toArray(new rrdY[var2.size()]);
   }

   public static rrxz_3 id_break(String var0) {
      if (var0 == null) {
         return null;
      } else {
         String[] var1 = rrbb_3.id_class(var0, " ");
         if (var1.length == 1) {
            String var2 = var1[0];
            if (var2.equals("off") || var2.equals("false")) {
               return new rrxz_3(false);
            }
         } else if (var1.length == 2 || var1.length == 4) {
            String var10 = var1[0];
            String var3 = var1[1];
            String var4 = var10;
            String var5 = var3;
            if (var1.length == 4) {
               var4 = var1[2];
               var5 = var1[3];
            }

            Integer var6 = id_throws.get(var10);
            Integer var7 = id_throws.get(var3);
            Integer var8 = id_throws.get(var4);
            Integer var9 = id_throws.get(var5);
            if (var6 != null && var7 != null && var8 != null && var9 != null) {
               return new rrxz_3(true, var6, var7, var8, var9);
            }
         }

         rrdJ.id_class("Invalid blend mode: " + var0);
         return null;
      }
   }

   private static Map<String, Integer> id_break() {
      HashMap var0 = new HashMap();
      var0.put("NEVER", new Integer(512));
      var0.put("LESS", new Integer(513));
      var0.put("EQUAL", new Integer(514));
      var0.put("LEQUAL", new Integer(515));
      var0.put("GREATER", new Integer(516));
      var0.put("NOTEQUAL", new Integer(517));
      var0.put("GEQUAL", new Integer(518));
      var0.put("ALWAYS", new Integer(519));
      return Collections.unmodifiableMap(var0);
   }

   public static void id_break(Properties var0) {
      for (String var2 : var0.keySet()) {
         String[] var3 = rrbb_3.id_class(var2, ".");
         if (var3.length == 2) {
            String var4 = var3[0];
            String var5 = var3[1];
            if (var4.equals("alphaTest")) {
               rrdG var6 = rrdZ.id_native(var5);
               if (var6 == null) {
                  rrdJ.id_class("Invalid program name: " + var5);
               } else {
                  String var7 = var0.getProperty(var2).trim();
                  rrxW_2 var8 = id_class(var7);
                  if (var8 != null) {
                     var6.id_class(var8);
                  }
               }
            }
         }
      }
   }

   public static Map<String, rrXw_1> id_break(Properties var0, rrdD[] var1) {
      String var2 = "program.";
      Pattern var3 = Pattern.compile("program\\.([^.]+)\\.enabled");
      HashMap var4 = new HashMap();

      for (String var6 : var0.keySet()) {
         Matcher var7 = var3.matcher(var6);
         if (var7.matches()) {
            String var8 = var7.group(1);
            String var9 = var0.getProperty(var6).trim();
            rrXw_1 var10 = id_class(var9, var1);
            if (var10 == null) {
               rrdJ.id_class("Error parsing program condition: " + var6);
            } else {
               var4.put(var8, var10);
            }
         }
      }

      return var4;
   }

   public static void id_throws(Properties var0) {
      for (String var2 : var0.keySet()) {
         String[] var3 = rrbb_3.id_class(var2, ".");
         if (var3.length == 3) {
            String var4 = var3[0];
            String var5 = var3[1];
            String var6 = var3[2];
            if (var4.equals("flip")) {
               rrdG var7 = rrdZ.id_native(var5);
               if (var7 == null) {
                  rrdJ.id_class("Invalid program name: " + var5);
               } else {
                  Boolean[] var8 = var7.id_this();
                  int var9 = rrdZ.id_implements(var6);
                  if (var9 >= 0 && var9 < var8.length) {
                     String var10 = var0.getProperty(var2).trim();
                     Boolean var11 = rrbb_3.id_class(var10, (Boolean)null);
                     if (var11 == null) {
                        rrdJ.id_class("Invalid boolean value: " + var10);
                     } else {
                        var8[var9] = var11;
                     }
                  } else {
                     rrdJ.id_class("Invalid buffer name: " + var6);
                  }
               }
            }
         }
      }
   }

   public static void id_protected(Properties var0) {
      for (String var2 : var0.keySet()) {
         String[] var3 = rrbb_3.id_class(var2, ".");
         if (var3.length == 2) {
            String var4 = var3[0];
            String var5 = var3[1];
            if (var4.equals("scale")) {
               rrdG var6 = rrdZ.id_native(var5);
               if (var6 == null) {
                  rrdJ.id_class("Invalid program name: " + var5);
               } else {
                  String var7 = var0.getProperty(var2).trim();
                  rrdj_1 var8 = id_byte(var7);
                  if (var8 != null) {
                     var6.id_class(var8);
                  }
               }
            }
         }
      }
   }

   private static rrWz_1 id_protected(String var0) {
      if (var0 == null) {
         return null;
      } else {
         String[] var1 = rrbb_3.id_class(var0, " ");
         if (var1.length != 2) {
            return null;
         } else {
            int var2 = rrbb_3.id_class(var1[0], -1);
            int var3 = rrbb_3.id_class(var1[1], -1);
            if (var2 >= 0 && var3 >= 0) {
               return new rrWz_1(false, (float)var2, (float)var3);
            } else {
               float var4 = rrbb_3.id_class(var1[0], -1.0F);
               float var5 = rrbb_3.id_class(var1[1], -1.0F);
               return var4 >= 0.0F && var5 >= 0.0F ? new rrWz_1(true, var4, var5) : null;
            }
         }
      }
   }
}
