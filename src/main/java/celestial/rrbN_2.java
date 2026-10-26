package celestial;

import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import javax.imageio.ImageIO;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

public class rrbN_2 {
   private static String id_break = "vanilla";
   static rrbQ_2 id_byte = null;
   static rrbQ_2 id_protected = null;
   static rrbQ_2 id_throws = null;
   static rrbQ_2 id_case = null;
   static rrbQ_2 id_catch = null;
   private static rrbQ_2[] id_private = null;
   private static rrbQ_2[][] id_implements = (rrbQ_2[][])null;
   private static rrbQ_2 id_finally = null;
   private static rrbz_3 id_extends = new rrbz_3();
   private static rrbQ_2 id_native = null;
   private static rrbz_3 id_volatile = new rrbz_3();
   private static rrbQ_2 id_final = null;
   private static rrbz_3 id_package = new rrbz_3();
   private static rrbQ_2 id_int = null;
   private static rrbz_3 id_new = new rrbz_3();
   private static rrMr_1[] id_continue = null;
   private static int id_super = 0;
   private static rrbQ_2 id_this = null;
   private static rrbQ_2 id_else = null;
   private static int id_synchronized = -1;
   private static rrbQ_2 id_return = null;
   private static rrbQ_2 id_public = null;
   private static rrbQ_2 id_goto = null;
   private static rrbQ_2 id_while = null;
   private static rrbQ_2 id_try = null;
   private static boolean id_instanceof = true;
   private static int id_throw = -1;
   private static int id_interface = -1;
   private static int id_char = -1;
   private static int id_abstract = -1;
   private static int id_long = -1;
   private static int id_float = -1;
   private static rjU_2 id_void = null;
   private static rjU_2 id_static = null;
   private static rjU_2 id_import = null;
   private static int[] id_short = null;
   private static int[] id_default = null;
   private static float[][] id_const = (float[][])null;
   private static float[][] id_strictfp = (float[][])null;
   private static int[] id_boolean = null;
   private static int[] id_transient = null;
   private static float[][] id_for = (float[][])null;
   private static int[] id_double = null;
   private static final xc_3 id_switch = xu_3.id_finally.id_continue();
   private static final xc_3 r = xu_3.id_try.id_continue();
   public static Random id_class = new Random();
   private static final rrbF_2 P = new rrbc_3();
   private static final rrbF_2 B = new rrbu_3();
   private static final rrbF_2 S = new rrbm_3();
   private static final rrbF_2 s = new rrbZ_2();
   private static final rrbF_2 E = new rrbv_3();

   private static rjU_2 id_byte(Properties var0, String var1) {
      int var2 = id_break(var0, var1);
      if (var2 < 0) {
         return null;
      } else {
         int var3 = var2 >> 16 & 0xFF;
         int var4 = var2 >> 8 & 0xFF;
         int var5 = var2 & 0xFF;
         float var6 = (float)var3 / 255.0F;
         float var7 = (float)var4 / 255.0F;
         float var8 = (float)var5 / 255.0F;
         return new rjU_2((double)var6, (double)var7, (double)var8);
      }
   }

   public static yC_2 id_byte() {
      return QY.id_instanceof().s();
   }

   private static int[] id_byte(Properties var0, String var1, String var2, String var3) {
      int[] var4 = new int[32];
      Arrays.fill(var4, -1);
      int var5 = 0;

      for (String var7 : var0.keySet()) {
         String var8 = var0.getProperty(var7);
         if (var7.startsWith(var2)) {
            String var9 = rrzX_2.id_protected(var7, var2);
            int var10 = rrbb_3.id_class(var9, -1);
            int var11 = id_break(var8);
            if (var10 >= 0 && var10 < var4.length && var11 >= 0) {
               var4[var10] = var11;
               var5++;
            } else {
               id_case("Invalid color: " + var7 + " = " + var8);
            }
         }
      }

      if (var5 <= 0) {
         return null;
      } else {
         id_throws(var3 + " colors: " + var5);
         return var4;
      }
   }

   private static rjU_2 id_byte(rjU_2 var0) {
      return id_import == null ? var0 : id_import;
   }

   public static int id_byte(int var0) {
      if (var0 != 0) {
         return var0;
      } else {
         return id_float < 0 ? var0 : id_float;
      }
   }

   private static int id_byte(String var0) {
      if (var0.equals("potion.water")) {
         return 0;
      } else {
         var0 = rrzX_2.id_break(var0, "potion.", "effect.");
         String var1 = rrzX_2.id_break(var0, "effect.", "effect.minecraft.");

         for (rqO_2 var3 : rVL.id_const.id_protected()) {
            rLR var4 = rrzs_3.id_class(var3);
            if (var4.id_byte().equals(var0)) {
               return rLR.id_class(var4);
            }

            if (var4.id_byte().equals(var1)) {
               return rLR.id_class(var4);
            }
         }

         return -1;
      }
   }

   public static boolean id_class(gm_3 var0, float var1, fN_2 var2, boolean var3, float var4) {
      if (var0 == null) {
         return false;
      } else if (id_continue == null) {
         return false;
      } else {
         int var5 = rrzc_3.id_class(var0);
         int var6 = var5 - id_super;
         if (var6 >= 0 && var6 < id_continue.length) {
            rrMr_1 var7 = id_continue[var6];
            return var7 == null ? false : var7.id_class(var0, var1, var2, var3, var4);
         } else {
            return false;
         }
      }
   }

   private static int id_class(xc_3 var0, rRq_1 var1, rfH_2 var2, rrxF_2 var3) {
      rrbQ_2 var4 = id_public;
      xd_3 var5 = var0.id_break();
      if (var5 == xu_3.Bo && id_while != null) {
         var4 = id_while;
      }

      if (var5 == xu_3.BK && id_goto != null) {
         var4 = id_goto;
      }

      if (var4 == null) {
         return -1;
      } else if (!(var5 instanceof zO_2)) {
         return -1;
      } else {
         int var6 = (Integer)var0.id_byte(zO_2.id_volatile);
         return var4.id_class(var6);
      }
   }

   public static rjU_2 id_class(rRp_1 var0, double var1, double var3, double var5, rrbQ_2 var7, rrbz_3 var8) {
      if (var7 == null) {
         return null;
      } else {
         int var9 = var7.id_class(var0, var1, var3, var5, 3);
         int var10 = var9 >> 16 & 0xFF;
         int var11 = var9 >> 8 & 0xFF;
         int var12 = var9 & 0xFF;
         float var13 = (float)var10 / 255.0F;
         float var14 = (float)var11 / 255.0F;
         float var15 = (float)var12 / 255.0F;
         return var8.id_class((double)var13, (double)var14, (double)var15);
      }
   }

   public static rjU_2 id_class(rjU_2 var0, rYB var1, an_3 var2, float var3) {
      QY var4 = QY.id_instanceof();
      if (rrzc_3.id_break(var1)) {
         return id_class(var0);
      } else if (rrzc_3.id_byte(var1)) {
         return id_break(var0, (gm_3)var4.id_class[56], var2.rx(), var2.re() + 1.0, var2.BO());
      } else {
         return rrzc_3.id_protected(var1) ? id_break(var0) : var0;
      }
   }

   private static int[] id_class(Properties var0, String var1, String var2, String var3) {
      ArrayList var4 = new ArrayList();
      Set var5 = var0.keySet();
      int var6 = 0;

      for (String var8 : var5) {
         String var9 = var0.getProperty(var8);
         if (var8.startsWith(var2)) {
            String var10 = rrzX_2.id_protected(var8, var2);
            int var11 = rrWu_1.id_break(var10);

            try {
               if (var11 < 0) {
                  var11 = rrWu_1.id_class(new rqO_2(var10).toString());
               }
            } catch (rqX_2 var13) {
               rrbb_3.id_protected("ResourceLocationException: " + var13.getMessage());
            }

            if (var11 < 0) {
               id_case("Invalid spawn egg name: " + var8);
            } else {
               int var12 = id_break(var9);
               if (var12 < 0) {
                  id_case("Invalid spawn egg color: " + var8 + " = " + var9);
               } else {
                  while (var4.size() <= var11) {
                     var4.add(-1);
                  }

                  var4.set(var11, var12);
                  var6++;
               }
            }
         }
      }

      if (var6 <= 0) {
         return null;
      } else {
         id_throws(var3 + " colors: " + var6);
         int[] var14 = new int[var4.size()];

         for (int var15 = 0; var15 < var14.length; var15++) {
            var14[var15] = (Integer)var4.get(var15);
         }

         return var14;
      }
   }

   private static int id_class(rkO_2 var0, rdn_3 var1, int var2, int var3) {
      if (id_short == null && id_default == null) {
         return var3;
      } else {
         aI_2 var4 = var0.id_class(var1.id_package());
         if (var4 == null) {
            return var3;
         } else {
            int var5 = rVL.id_transient.id_class(var4);
            if (var5 < 0) {
               return var3;
            } else {
               int[] var6 = var2 == 0 ? id_short : id_default;
               if (var6 == null) {
                  return var3;
               } else if (var5 >= 0 && var5 < var6.length) {
                  int var7 = var6[var5];
                  return var7 < 0 ? var3 : var7;
               } else {
                  return var3;
               }
            }
         }
      }
   }

   public static int id_class(float var0, int var1) {
      if (id_return == null) {
         return var1;
      } else {
         int var2 = (int)(var0 * (float)id_return.id_protected());
         return id_return.id_class(var2);
      }
   }

   public static void id_class(CH var0, rRp_1 var1, double var2, double var4, double var6, rrxF_2 var8) {
      if (id_byte != null || id_implements != null || id_throw >= 0) {
         rfH_2 var9 = new rfH_2(var2, var4, var6);
         var8.id_class(r, var9);
         int var10 = id_class(var1, r, var9, var8);
         int var11 = var10 >> 16 & 0xFF;
         int var12 = var10 >> 8 & 0xFF;
         int var13 = var10 & 0xFF;
         float var14 = (float)var11 / 255.0F;
         float var15 = (float)var12 / 255.0F;
         float var16 = (float)var13 / 255.0F;
         if (id_throw >= 0) {
            int var17 = id_throw >> 16 & 0xFF;
            int var18 = id_throw >> 8 & 0xFF;
            int var19 = id_throw & 0xFF;
            var14 = (float)var17 / 255.0F;
            var15 = (float)var18 / 255.0F;
            var16 = (float)var19 / 255.0F;
            var14 *= (float)var17 / 255.0F;
            var15 *= (float)var18 / 255.0F;
            var16 *= (float)var19 / 255.0F;
         }

         var0.id_class(var14, var15, var16);
      }
   }

   private static rjU_2 id_class(rjU_2 var0) {
      return id_void == null ? var0 : id_void;
   }

   private static int id_class(String var0, int var1) {
      try {
         InputStream var2 = rrbb_3.id_class(new rqO_2(var0));
         if (var2 == null) {
            return var1;
         } else {
            BufferedImage var3 = ImageIO.read(var2);
            var2.close();
            return var3 == null ? var1 : var3.getHeight();
         }
      } catch (IOException var4) {
         return var1;
      }
   }

   public static rjU_2 id_class(rjU_2 var0, rRp_1 var1, double var2, double var4, double var6) {
      if (id_finally == null) {
         return var0;
      } else {
         int var8 = id_finally.id_class(var1, var2, var4, var6, 3);
         int var9 = var8 >> 16 & 0xFF;
         int var10 = var8 >> 8 & 0xFF;
         int var11 = var8 & 0xFF;
         float var12 = (float)var9 / 255.0F;
         float var13 = (float)var10 / 255.0F;
         float var14 = (float)var11 / 255.0F;
         float var15 = (float)var0.id_break / 0.5F;
         float var16 = (float)var0.id_byte / 0.66275F;
         float var17 = (float)var0.id_protected;
         var12 *= var15;
         var13 *= var16;
         var14 *= var17;
         return id_extends.id_class((double)var12, (double)var13, (double)var14);
      }
   }

   public static rjU_2 id_class(rRp_1 var0, double var1, double var3, double var5) {
      return id_class(var0, var1, var3, var5, id_final, id_package);
   }

   public static int id_class(rLR var0, int var1) {
      int var2 = 0;
      if (var0 != null) {
         var2 = rLR.id_class(var0);
      }

      return id_break(var2, var1);
   }

   private static void id_class(int[] var0) {
      if (var0 != null) {
         QS[] var1 = QS.id_class;

         for (int var2 = 0; var2 < var1.length && var2 < var0.length; var2++) {
            QS var3 = var1[var2];
            if (var3 != null) {
               int var4 = var0[var2];
               if (var4 >= 0 && var3.d != var4) {
                  var3.d = var4;
               }
            }
         }
      }
   }

   private static void id_class(float[][] var0) {
      if (var0 != null) {
         rxL_2[] var1 = rxL_2.values();

         for (int var2 = 0; var2 < var1.length && var2 < var0.length; var2++) {
            rxL_2 var3 = var1[var2];
            if (var3 != null) {
               float[] var4 = var0[var2];
               if (var4 != null && !var3.id_protected().equals(var4)) {
                  var3.id_class(var4);
               }
            }
         }
      }
   }

   public static int id_class(int var0) {
      return id_abstract < 0 ? var0 : id_abstract;
   }

   public static void id_class() {
      id_break = "vanilla";
      id_byte = null;
      id_throws = null;
      id_protected = null;
      id_catch = null;
      id_case = null;
      id_finally = null;
      id_native = null;
      id_final = null;
      id_int = null;
      id_this = null;
      id_else = null;
      id_synchronized = -1;
      id_return = null;
      id_public = null;
      id_try = null;
      id_continue = null;
      id_throw = -1;
      id_interface = -1;
      id_char = -1;
      id_abstract = -1;
      id_long = -1;
      id_float = -1;
      id_void = null;
      id_static = null;
      id_import = null;
      id_private = null;
      id_implements = (rrbQ_2[][])null;
      id_instanceof = true;
      id_short = null;
      id_default = null;
      id_const = (float[][])null;
      id_strictfp = (float[][])null;
      id_boolean = null;
      id_class(id_transient);
      id_class(id_for);
      id_double = null;
      id_break = id_class("optifine/color.properties", "palette.format", rrbQ_2.id_case, "vanilla");
      String var0 = "optifine/colormap/";
      String[] var1 = new String[]{"water.png", "watercolorx.png"};
      id_byte = id_class(var0, var1, 256, 256);
      id_break();
      if (rrbb_3.K()) {
         String[] var2 = new String[]{"pine.png", "pinecolor.png"};
         id_protected = id_class(var0, var2, 256, 256);
         String[] var3 = new String[]{"birch.png", "birchcolor.png"};
         id_throws = id_class(var0, var3, 256, 256);
         String[] var4 = new String[]{"swampgrass.png", "swampgrasscolor.png"};
         id_catch = id_class(var0, var4, 256, 256);
         String[] var5 = new String[]{"swampfoliage.png", "swampfoliagecolor.png"};
         id_case = id_class(var0, var5, 256, 256);
         String[] var6 = new String[]{"sky0.png", "skycolor0.png"};
         id_finally = id_class(var0, var6, 256, 256);
         String[] var7 = new String[]{"fog0.png", "fogcolor0.png"};
         id_native = id_class(var0, var7, 256, 256);
         String[] var8 = new String[]{"underwater.png", "underwatercolor.png"};
         id_final = id_class(var0, var8, 256, 256);
         String[] var9 = new String[]{"underlava.png", "underlavacolor.png"};
         id_int = id_class(var0, var9, 256, 256);
         String[] var10 = new String[]{"redstone.png", "redstonecolor.png"};
         id_this = id_class(var0, var10, 16, 1);
         id_else = id_class(var0 + "xporb.png", -1, -1);
         id_return = id_class(var0 + "durability.png", -1, -1);
         String[] var11 = new String[]{"stem.png", "stemcolor.png"};
         id_public = id_class(var0, var11, 8, 1);
         id_while = id_class(var0 + "pumpkinstem.png", 8, 1);
         id_goto = id_class(var0 + "melonstem.png", 8, 1);
         String[] var12 = new String[]{"myceliumparticle.png", "myceliumparticlecolor.png"};
         id_try = id_class(var0, var12, -1, -1);
         Pair var13 = id_protected();
         id_continue = (rrMr_1[])var13.getLeft();
         id_super = (Integer)var13.getRight();
         id_class("optifine/color.properties");
         id_implements = id_class(new String[]{var0 + "custom/", var0 + "blocks/"}, id_private, 256, 256);
         id_break();
      }
   }

   private static rrbQ_2[][] id_class(String[] var0, rrbQ_2[] var1, int var2, int var3) {
      String[] var4 = rrzM_2.id_class(var0, new String[]{".properties"});
      Arrays.sort(var4);
      ArrayList var5 = new ArrayList();

      for (int var6 = 0; var6 < var4.length; var6++) {
         String var7 = var4[var6];
         id_throws("Block colormap: " + var7);

         try {
            rqO_2 var8 = new rqO_2("minecraft", var7);
            InputStream var9 = rrbb_3.id_class(var8);
            if (var9 == null) {
               id_case("File not found: " + var7);
            } else {
               rrzE_2 var10 = new rrzE_2();
               var10.load(var9);
               var9.close();
               rrbQ_2 var11 = new rrbQ_2(var10, var7, var2, var3, id_break);
               if (var11.id_class(var7) && var11.id_break(var7)) {
                  id_class(var11, var5);
               }
            }
         } catch (FileNotFoundException var12) {
            id_case("File not found: " + var7);
         } catch (Exception var13) {
            var13.printStackTrace();
         }
      }

      if (var1 != null) {
         for (int var14 = 0; var14 < var1.length; var14++) {
            rrbQ_2 var15 = var1[var14];
            id_class(var15, var5);
         }
      }

      return var5.size() <= 0 ? (rrbQ_2[][])null : id_class(var5);
   }

   public static int id_class(rdn_3 var0, int var1, int var2) {
      if (var0 == null) {
         return var2;
      } else {
         rdb_3 var3 = var0.id_break();
         if (var3 == null) {
            return var2;
         } else {
            return var3 instanceof rkO_2 ? id_class((rkO_2)var3, var0, var1, var2) : var2;
         }
      }
   }

   private static float[] id_class(rxL_2 var0, float[][] var1, float[] var2) {
      if (var1 == null) {
         return var2;
      } else if (var0 == null) {
         return var2;
      } else {
         float[] var3 = var1[var0.ordinal()];
         return var3 == null ? var2 : var3;
      }
   }

   public static float[] id_class(rxL_2 var0, float[] var1) {
      return id_class(var0, id_const, var1);
   }

   public static int id_class(int var0, int var1) {
      if (id_boolean == null) {
         return var1;
      } else if (var0 >= 0 && var0 < id_boolean.length) {
         int var2 = id_boolean[var0];
         return var2 < 0 ? var1 : var2;
      } else {
         return var1;
      }
   }

   private static String id_class(String var0, String var1, String[] var2, String var3) {
      try {
         rqO_2 var4 = new rqO_2(var0);
         InputStream var5 = rrbb_3.id_class(var4);
         if (var5 == null) {
            return var3;
         } else {
            rrzE_2 var6 = new rrzE_2();
            var6.load(var5);
            var5.close();
            String var7 = var6.getProperty(var1);
            if (var7 == null) {
               return var3;
            } else {
               List var8 = Arrays.asList(var2);
               if (!var8.contains(var7)) {
                  id_case("Invalid value: " + var1 + "=" + var7);
                  id_case("Expected values: " + rrbb_3.id_class(var2));
                  return var3;
               } else {
                  id_throws(var1 + "=" + var7);
                  return var7;
               }
            }
         }
      } catch (FileNotFoundException var9) {
         return var3;
      } catch (IOException var10) {
         var10.printStackTrace();
         return var3;
      }
   }

   public static int id_class(wK_2 var0, xc_3 var1, rRp_1 var2, rfH_2 var3, rrxF_2 var4) {
      xd_3 var5 = var1.id_break();
      xc_3 var6 = var1;
      if (id_implements != null) {
         if (!var0.id_break()) {
            if (var5 == xu_3.id_implements) {
               var6 = id_switch;
            }

            if (var5 == xu_3.ra) {
               return -1;
            }
         }

         if (var5 instanceof du_3 && var1.id_byte(du_3.id_volatile) == rCf_1.UPPER) {
            var3 = var3.id_break();
            var6 = var2.id_byte(var3);
         }

         rrbQ_2 var7 = id_class(var6);
         if (var7 != null) {
            if (rrbb_3.Y() && !var7.id_byte()) {
               return id_class(var1, var2, var3, var7, var4.id_private());
            }

            return var7.id_class(var2, var3);
         }
      }

      if (!var0.id_break()) {
         return -1;
      } else if (var5 == xu_3.Sr) {
         return id_break(var2, var3);
      } else if (var5 == xu_3.ra) {
         return id_break(var4.id_catch());
      } else if (var5 instanceof zO_2) {
         return id_class(var1, var2, var3, var4);
      } else if (id_instanceof) {
         return -1;
      } else {
         rrbF_2 var8;
         if (var5 == xu_3.id_implements || var5 == xu_3.Gs || var5 instanceof du_3) {
            var8 = P;
         } else if (var5 instanceof du_3) {
            var8 = P;
            if (var1.id_byte(du_3.id_volatile) == rCf_1.UPPER) {
               var3 = var3.id_break();
            }
         } else if (var5 instanceof kZ_2) {
            if (var5 == xu_3.x) {
               var8 = B;
            } else if (var5 == xu_3.d) {
               var8 = S;
            } else if (var5 == xu_3.k) {
               var8 = s;
            } else {
               var8 = B;
            }
         } else {
            if (var5 != xu_3.BD) {
               return -1;
            }

            var8 = B;
         }

         return rrbb_3.Y() && !var8.id_byte() ? id_class(var1, var2, var3, var8, var4.id_private()) : var8.id_class(var6, var2, var3);
      }
   }

   protected static rYG id_class(rRp_1 var0, rfH_2 var1) {
      rYG var2 = rrWr_1.id_class(var0, var1);
      if ((var2 == rrWr_1.id_break || var2 == rrWr_1.id_byte) && !rrbb_3.g()) {
         var2 = rrWr_1.id_class;
      }

      return var2;
   }

   private static rrbQ_2 id_class(xc_3 var0) {
      if (id_implements == null) {
         return null;
      } else if (!(var0 instanceof xc_3)) {
         return null;
      } else {
         xc_3 var1 = var0;
         int var2 = var0.id_continue();
         if (var2 >= 0 && var2 < id_implements.length) {
            rrbQ_2[] var3 = id_implements[var2];
            if (var3 == null) {
               return null;
            } else {
               for (int var4 = 0; var4 < var3.length; var4++) {
                  rrbQ_2 var5 = var3[var4];
                  if (var5.id_class(var1)) {
                     return var5;
                  }
               }

               return null;
            }
         } else {
            return null;
         }
      }
   }

   private static int id_class(xc_3 var0, rRp_1 var1, rfH_2 var2, rrbF_2 var3, rrGi_1 var4) {
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;
      int var8 = var2.b_();
      int var9 = var2.c_();
      int var10 = var2.d_();
      rrGi_1 var11 = var4;
      int var12 = rrbb_3.o();
      int var13 = var12 * 2 + 1;
      int var14 = var13 * var13;

      for (int var15 = var8 - var12; var15 <= var8 + var12; var15++) {
         for (int var16 = var10 - var12; var16 <= var10 + var12; var16++) {
            var11.id_class(var15, var9, var16);
            int var17 = var3.id_class(var0, var1, var11);
            var5 += var17 >> 16 & 0xFF;
            var6 += var17 >> 8 & 0xFF;
            var7 += var17 & 0xFF;
         }
      }

      int var18 = var5 / var14;
      int var19 = var6 / var14;
      int var20 = var7 / var14;
      return var18 << 16 | var19 << 8 | var20;
   }

   public static int id_class(rRp_1 var0, xc_3 var1, rfH_2 var2, rrxF_2 var3) {
      xd_3 var4 = var1.id_break();
      Object var5 = id_class(var1);
      if (var5 == null && var1.id_byte() == QP.id_finally) {
         var5 = E;
      }

      if (var5 == null) {
         return id_byte().id_class(var1, var0, var2, 0);
      } else {
         return rrbb_3.Y() && !var5.id_byte() ? id_class(var1, var0, var2, (rrbF_2)var5, var3.id_private()) : var5.id_class(var1, var0, var2);
      }
   }

   private static void id_class(String var0) {
      try {
         rqO_2 var1 = new rqO_2(var0);
         InputStream var2 = rrbb_3.id_class(var1);
         if (var2 == null) {
            return;
         }

         id_throws("Loading " + var0);
         rrzE_2 var3 = new rrzE_2();
         var3.load(var2);
         var2.close();
         id_throw = id_class(var3, new String[]{"particle.water", "drop.water"});
         id_interface = id_break(var3, "particle.portal");
         id_char = id_break(var3, "lilypad");
         id_abstract = id_break(var3, "text.xpbar");
         id_long = id_break(var3, "text.boss");
         id_float = id_break(var3, "text.sign");
         id_void = id_byte(var3, "fog.nether");
         id_static = id_byte(var3, "fog.end");
         id_import = id_byte(var3, "sky.end");
         id_private = id_class(var3, var0);
         id_short = id_class(var3, var0, "egg.shell.", "Spawn egg shell");
         id_default = id_class(var3, var0, "egg.spots.", "Spawn egg spot");
         id_const = id_break(var3, var0, "collar.", "Wolf collar");
         id_strictfp = id_break(var3, var0, "sheep.", "Sheep");
         id_boolean = id_byte(var3, var0, "text.code.", "Text");
         int[] var4 = id_protected(var3, var0, "map.", "Map");
         if (var4 != null) {
            if (id_transient == null) {
               id_transient = id_case();
            }

            id_class(var4);
         }

         float[][] var5 = id_break(var3, var0, "dye.", "Dye");
         if (var5 != null) {
            if (id_for == null) {
               id_for = id_catch();
            }

            id_class(var5);
         }

         id_double = id_throws(var3, var0, "potion.", "Potion");
         id_synchronized = rrbb_3.id_class(var3.getProperty("xporb.time"), -1);
      } catch (FileNotFoundException var6) {
         return;
      } catch (IOException var7) {
         rrbb_3.id_protected("Error parsing: " + var0);
         rrbb_3.id_protected(var7.getClass().getName() + ": " + var7.getMessage());
      }
   }

   private static void id_class(rrbQ_2 var0, List var1, int var2) {
      while (var2 >= var1.size()) {
         var1.add(null);
      }

      Object var3 = (List)var1.get(var2);
      if (var3 == null) {
         var3 = new ArrayList();
         var1.set(var2, var3);
      }

      var3.add(var0);
   }

   private static rrbQ_2[][] id_class(List var0) {
      rrbQ_2[][] var1 = new rrbQ_2[var0.size()][];

      for (int var2 = 0; var2 < var0.size(); var2++) {
         List var3 = (List)var0.get(var2);
         if (var3 != null) {
            rrbQ_2[] var4 = var3.toArray(new rrbQ_2[var3.size()]);
            var1[var2] = var4;
         }
      }

      return var1;
   }

   private static int id_class(Properties var0, String[] var1) {
      for (int var2 = 0; var2 < var1.length; var2++) {
         String var3 = var1[var2];
         int var4 = id_break(var0, var3);
         if (var4 >= 0) {
            return var4;
         }
      }

      return -1;
   }

   private static rrbQ_2[] id_class(Properties var0, String var1) {
      ArrayList var2 = new ArrayList();
      String var3 = "palette.block.";
      HashMap var4 = new HashMap();

      for (String var6 : var0.keySet()) {
         String var7 = var0.getProperty(var6);
         if (var6.startsWith(var3)) {
            var4.put(var6, var7);
         }
      }

      String[] var16 = var4.keySet().toArray(new String[var4.size()]);

      for (int var17 = 0; var17 < var16.length; var17++) {
         String var18 = var16[var17];
         String var8 = var0.getProperty(var18);
         id_throws("Block palette: " + var18 + " = " + var8);
         String var9 = var18.substring(var3.length());
         String var10 = rrzJ_2.id_class(var1);
         var9 = rrzJ_2.id_class(var9, var10);
         rrbQ_2 var11 = id_class(var9, 256, 256);
         if (var11 == null) {
            id_case("Colormap not found: " + var9);
         } else {
            rrMz_1 var12 = new rrMz_1("CustomColors");
            rrMn_1[] var13 = var12.id_byte(var8);
            if (var13 != null && var13.length > 0) {
               for (int var14 = 0; var14 < var13.length; var14++) {
                  rrMn_1 var15 = var13[var14];
                  var11.id_class(var15);
               }

               var2.add(var11);
            } else {
               id_case("Invalid match blocks: " + var8);
            }
         }
      }

      return var2.size() <= 0 ? null : var2.toArray(new rrbQ_2[var2.size()]);
   }

   private static rrbQ_2 id_class(String var0, String[] var1, int var2, int var3) {
      for (int var4 = 0; var4 < var1.length; var4++) {
         String var5 = var1[var4];
         var5 = var0 + var5;
         rrbQ_2 var6 = id_class(var5, var2, var3);
         if (var6 != null) {
            return var6;
         }
      }

      return null;
   }

   private static void id_class(rrbQ_2 var0, List var1) {
      int[] var2 = var0.id_catch();
      if (var2 != null && var2.length > 0) {
         for (int var3 = 0; var3 < var2.length; var3++) {
            int var4 = var2[var3];
            if (var4 < 0) {
               id_case("Invalid block ID: " + var4);
            } else {
               id_class(var0, var1, var4);
            }
         }
      } else {
         id_case("No match blocks: " + rrbb_3.id_class(var2));
      }
   }

   private static int id_class(xc_3 var0, int var1) {
      xd_3 var2 = var0.id_break();
      if (!(var2 instanceof Wu_1)) {
         return var1;
      } else {
         return !(var0.id_byte(Wu_1.id_new) instanceof Integer var4) ? var1 : var4;
      }
   }

   public static void id_class(CH var0, rRp_1 var1, double var2, double var4, double var6) {
      if (id_this != null) {
         xc_3 var8 = var1.id_byte(new rfH_2(var2, var4, var6));
         int var9 = id_class(var8, 15);
         int var10 = id_this.id_class(var9);
         int var11 = var10 >> 16 & 0xFF;
         int var12 = var10 >> 8 & 0xFF;
         int var13 = var10 & 0xFF;
         float var14 = (float)var11 / 255.0F;
         float var15 = (float)var12 / 255.0F;
         float var16 = (float)var13 / 255.0F;
         var0.id_class(var14, var15, var16);
      }
   }

   public static float id_class(float var0) {
      if (id_synchronized <= 0) {
         return var0;
      } else {
         float var1 = 628.0F / (float)id_synchronized;
         return var0 * var1;
      }
   }

   public static rrbQ_2 id_class(String var0, int var1, int var2) {
      try {
         rqO_2 var3 = new rqO_2(var0);
         if (!rrbb_3.id_byte(var3)) {
            return null;
         } else {
            id_throws("Colormap " + var0);
            rrzE_2 var4 = new rrzE_2();
            String var5 = rrzX_2.id_class(var0, ".png", ".properties");
            rqO_2 var6 = new rqO_2(var5);
            if (rrbb_3.id_byte(var6)) {
               InputStream var7 = rrbb_3.id_class(var6);
               var4.load(var7);
               var7.close();
               id_throws("Colormap properties: " + var5);
            } else {
               var4.put("format", id_break);
               var4.put("source", var0);
               var5 = var0;
            }

            rrbQ_2 var9 = new rrbQ_2(var4, var5, var1, var2, id_break);
            return !var9.id_class(var5) ? null : var9;
         }
      } catch (Exception var8) {
         var8.printStackTrace();
         return null;
      }
   }

   public static void id_class(CH var0) {
      if (id_interface >= 0) {
         int var1 = id_interface;
         int var2 = var1 >> 16 & 0xFF;
         int var3 = var1 >> 8 & 0xFF;
         int var4 = var1 & 0xFF;
         float var5 = (float)var2 / 255.0F;
         float var6 = (float)var3 / 255.0F;
         float var7 = (float)var4 / 255.0F;
         var0.id_class(var5, var6, var7);
      }
   }

   private static int id_break(String var0) {
      if (var0 == null) {
         return -1;
      } else {
         var0 = var0.trim();

         try {
            return Integer.parseInt(var0, 16) & 16777215;
         } catch (NumberFormatException var2) {
            return -1;
         }
      }
   }

   public static int id_break(float var0) {
      if (id_else == null) {
         return -1;
      } else {
         int var1 = (int)Math.round((double)((rfU_2.id_class(var0) + 1.0F) * (float)(id_else.id_protected() - 1)) / 2.0);
         return id_else.id_class(var1);
      }
   }

   private static rjU_2 id_break(rjU_2 var0) {
      return id_static == null ? var0 : id_static;
   }

   public static int id_break(int var0) {
      return id_long < 0 ? var0 : id_long;
   }

   private static int id_break(rRp_1 var0, rfH_2 var1) {
      return id_char < 0 ? id_byte().id_class(xu_3.Sr.id_continue(), var0, var1, 0) : id_char;
   }

   private static int id_break(Properties var0, String var1) {
      String var2 = var0.getProperty(var1);
      if (var2 == null) {
         return -1;
      } else {
         var2 = var2.trim();
         int var3 = id_break(var2);
         if (var3 < 0) {
            id_case("Invalid color: " + var1 + " = " + var2);
            return var3;
         } else {
            id_throws(var1 + " = " + var2);
            return var3;
         }
      }
   }

   public static int id_break(int var0, int var1) {
      if (id_double == null) {
         return var1;
      } else if (var0 >= 0 && var0 < id_double.length) {
         int var2 = id_double[var0];
         return var2 < 0 ? var1 : var2;
      } else {
         return var1;
      }
   }

   public static void id_break() {
      id_instanceof = id_throws == null && id_protected == null && id_catch == null && id_case == null && rrbb_3.g();
   }

   private static float[][] id_break(Properties var0, String var1, String var2, String var3) {
      rxL_2[] var4 = rxL_2.values();
      HashMap var5 = new HashMap();

      for (int var6 = 0; var6 < var4.length; var6++) {
         rxL_2 var7 = var4[var6];
         var5.put(var7.id_class(), var7);
      }

      var5.put("lightBlue", rxL_2.LIGHT_BLUE);
      var5.put("silver", rxL_2.LIGHT_GRAY);
      float[][] var15 = new float[var4.length][];
      int var16 = 0;

      for (String var9 : var0.keySet()) {
         String var10 = var0.getProperty(var9);
         if (var9.startsWith(var2)) {
            String var11 = rrzX_2.id_protected(var9, var2);
            rxL_2 var12 = (rxL_2)var5.get(var11);
            int var13 = id_break(var10);
            if (var12 != null && var13 >= 0) {
               float[] var14 = new float[]{(float)(var13 >> 16 & 0xFF) / 255.0F, (float)(var13 >> 8 & 0xFF) / 255.0F, (float)(var13 & 0xFF) / 255.0F};
               var15[var12.ordinal()] = var14;
               var16++;
            } else {
               id_case("Invalid color: " + var9 + " = " + var10);
            }
         }
      }

      if (var16 <= 0) {
         return (float[][])null;
      } else {
         id_throws(var3 + " colors: " + var16);
         return var15;
      }
   }

   public static void id_break(CH var0) {
      if (id_try != null) {
         int var1 = id_try.id_class();
         int var2 = var1 >> 16 & 0xFF;
         int var3 = var1 >> 8 & 0xFF;
         int var4 = var1 & 0xFF;
         float var5 = (float)var2 / 255.0F;
         float var6 = (float)var3 / 255.0F;
         float var7 = (float)var4 / 255.0F;
         var0.id_class(var5, var6, var7);
      }
   }

   private static rjU_2 id_break(rjU_2 var0, rRp_1 var1, double var2, double var4, double var6) {
      if (id_native == null) {
         return var0;
      } else {
         int var8 = id_native.id_class(var1, var2, var4, var6, 3);
         int var9 = var8 >> 16 & 0xFF;
         int var10 = var8 >> 8 & 0xFF;
         int var11 = var8 & 0xFF;
         float var12 = (float)var9 / 255.0F;
         float var13 = (float)var10 / 255.0F;
         float var14 = (float)var11 / 255.0F;
         float var15 = (float)var0.id_break / 0.753F;
         float var16 = (float)var0.id_byte / 0.8471F;
         float var17 = (float)var0.id_protected;
         var12 *= var15;
         var13 *= var16;
         var14 *= var17;
         return id_volatile.id_class((double)var12, (double)var13, (double)var14);
      }
   }

   private static int id_break(xc_3 var0) {
      if (id_this == null) {
         return -1;
      } else {
         int var1 = id_class(var0, 15);
         return id_this.id_class(var1);
      }
   }

   public static rjU_2 id_break(rRp_1 var0, double var1, double var3, double var5) {
      return id_class(var0, var1, var3, var5, id_int, id_new);
   }

   public static rjU_2 id_break(rjU_2 var0, rYB var1, an_3 var2, float var3) {
      QY var4 = QY.id_instanceof();
      if (rrzc_3.id_byte(var1)) {
         return id_class(var0, (gm_3)var4.id_class[56], var2.rx(), var2.re() + 1.0, var2.BO());
      } else {
         return rrzc_3.id_protected(var1) ? id_byte(var0) : var0;
      }
   }

   public static float[] id_break(rxL_2 var0, float[] var1) {
      return id_class(var0, id_strictfp, var1);
   }

   private static void id_throws(String var0) {
      rrbb_3.id_byte("CustomColors: " + var0);
   }

   private static int[] id_throws(Properties var0, String var1, String var2, String var3) {
      int[] var4 = new int[id_throws()];
      Arrays.fill(var4, -1);
      int var5 = 0;

      for (String var7 : var0.keySet()) {
         String var8 = var0.getProperty(var7);
         if (var7.startsWith(var2)) {
            int var9 = id_byte(var7);
            int var10 = id_break(var8);
            if (var9 >= 0 && var9 < var4.length && var10 >= 0) {
               var4[var9] = var10;
               var5++;
            } else {
               id_case("Invalid color: " + var7 + " = " + var8);
            }
         }
      }

      if (var5 <= 0) {
         return null;
      } else {
         id_throws(var3 + " colors: " + var5);
         return var4;
      }
   }

   private static int id_throws() {
      int var0 = 0;

      for (rqO_2 var2 : rVL.id_const.id_protected()) {
         rLR var3 = rrzs_3.id_class(var2);
         int var4 = rLR.id_class(var3);
         if (var4 > var0) {
            var0 = var4;
         }
      }

      return var0;
   }

   private static float[][] id_catch() {
      rxL_2[] var0 = rxL_2.values();
      float[][] var1 = new float[var0.length][];

      for (int var2 = 0; var2 < var0.length && var2 < var1.length; var2++) {
         rxL_2 var3 = var0[var2];
         if (var3 != null) {
            var1[var2] = var3.id_protected();
         }
      }

      return var1;
   }

   private static int[] id_case() {
      QS[] var0 = QS.id_class;
      int[] var1 = new int[var0.length];
      Arrays.fill(var1, -1);

      for (int var2 = 0; var2 < var0.length && var2 < var1.length; var2++) {
         QS var3 = var0[var2];
         if (var3 != null) {
            var1[var2] = var3.d;
         }
      }

      return var1;
   }

   private static void id_case(String var0) {
      rrbb_3.id_protected("CustomColors: " + var0);
   }

   private static int[] id_protected(Properties var0, String var1, String var2, String var3) {
      int[] var4 = new int[QS.id_class.length];
      Arrays.fill(var4, -1);
      int var5 = 0;

      for (String var7 : var0.keySet()) {
         String var8 = var0.getProperty(var7);
         if (var7.startsWith(var2)) {
            String var9 = rrzX_2.id_protected(var7, var2);
            int var10 = id_protected(var9);
            int var11 = id_break(var8);
            if (var10 >= 0 && var10 < var4.length && var11 >= 0) {
               var4[var10] = var11;
               var5++;
            } else {
               id_case("Invalid color: " + var7 + " = " + var8);
            }
         }
      }

      if (var5 <= 0) {
         return null;
      } else {
         id_throws(var3 + " colors: " + var5);
         return var4;
      }
   }

   private static Pair<rrMr_1[], Integer> id_protected() {
      String var0 = "optifine/lightmap/world";
      String var1 = ".png";
      String[] var2 = rrzM_2.id_class(var0, var1);
      HashMap var3 = new HashMap();

      for (int var4 = 0; var4 < var2.length; var4++) {
         String var5 = var2[var4];
         String var6 = rrzX_2.id_byte(var5, var0, var1);
         int var7 = rrbb_3.id_class(var6, Integer.MIN_VALUE);
         if (var7 == Integer.MIN_VALUE) {
            id_case("Invalid dimension ID: " + var6 + ", path: " + var5);
         } else {
            var3.put(var7, var5);
         }
      }

      Set var21 = var3.keySet();
      Integer[] var22 = var21.toArray(new Integer[var21.size()]);
      Arrays.sort(var22);
      if (var22.length <= 0) {
         return new ImmutablePair((rrMr_1[])null, 0);
      } else {
         int var23 = var22[0];
         int var24 = var22[var22.length - 1];
         int var8 = var24 - var23 + 1;
         rrbQ_2[] var9 = new rrbQ_2[var8];

         for (int var10 = 0; var10 < var22.length; var10++) {
            Integer var11 = var22[var10];
            String var12 = (String)var3.get(var11);
            rrbQ_2 var13 = id_class(var12, -1, -1);
            if (var13 != null) {
               if (var13.id_throws() < 16) {
                  id_case("Invalid lightmap width: " + var13.id_throws() + ", path: " + var12);
               } else {
                  int var14 = var11 - var23;
                  var9[var14] = var13;
               }
            }
         }

         rrMr_1[] var25 = new rrMr_1[var9.length];

         for (int var26 = 0; var26 < var9.length; var26++) {
            rrbQ_2 var27 = var9[var26];
            if (var27 != null) {
               String var28 = var27.id_class;
               String var29 = var27.id_break;
               rrbQ_2 var15 = id_class(var29 + "/" + var28 + "_rain.png", -1, -1);
               rrbQ_2 var16 = id_class(var29 + "/" + var28 + "_thunder.png", -1, -1);
               rrbi_3 var17 = new rrbi_3(var27);
               rrbi_3 var18 = var15 != null ? new rrbi_3(var15) : null;
               rrbi_3 var19 = var16 != null ? new rrbi_3(var16) : null;
               rrMr_1 var20 = new rrMr_1(var17, var18, var19);
               var25[var26] = var20;
            }
         }

         return new ImmutablePair(var25, var23);
      }
   }

   private static int id_protected(String var0) {
      if (var0 == null) {
         return -1;
      } else if (var0.equals("air")) {
         return QS.id_break.k;
      } else if (var0.equals("grass")) {
         return QS.id_byte.k;
      } else if (var0.equals("sand")) {
         return QS.id_protected.k;
      } else if (var0.equals("cloth")) {
         return QS.id_throws.k;
      } else if (var0.equals("tnt")) {
         return QS.id_case.k;
      } else if (var0.equals("ice")) {
         return QS.id_catch.k;
      } else if (var0.equals("iron")) {
         return QS.id_private.k;
      } else if (var0.equals("foliage")) {
         return QS.id_implements.k;
      } else if (var0.equals("clay")) {
         return QS.id_extends.k;
      } else if (var0.equals("dirt")) {
         return QS.id_native.k;
      } else if (var0.equals("stone")) {
         return QS.id_volatile.k;
      } else if (var0.equals("water")) {
         return QS.id_final.k;
      } else if (var0.equals("wood")) {
         return QS.id_package.k;
      } else if (var0.equals("quartz")) {
         return QS.id_int.k;
      } else if (var0.equals("gold")) {
         return QS.id_abstract.k;
      } else if (var0.equals("diamond")) {
         return QS.id_long.k;
      } else if (var0.equals("lapis")) {
         return QS.id_float.k;
      } else if (var0.equals("emerald")) {
         return QS.id_void.k;
      } else if (var0.equals("obsidian")) {
         return QS.id_static.k;
      } else if (var0.equals("netherrack")) {
         return QS.id_import.k;
      } else if (var0.equals("snow") || var0.equals("white")) {
         return QS.id_finally.k;
      } else if (var0.equals("adobe") || var0.equals("orange")) {
         return QS.id_new.k;
      } else if (var0.equals("magenta")) {
         return QS.id_continue.k;
      } else if (var0.equals("light_blue") || var0.equals("lightBlue")) {
         return QS.id_super.k;
      } else if (var0.equals("yellow")) {
         return QS.id_this.k;
      } else if (var0.equals("lime")) {
         return QS.id_else.k;
      } else if (var0.equals("pink")) {
         return QS.id_synchronized.k;
      } else if (var0.equals("gray")) {
         return QS.id_return.k;
      } else if (var0.equals("silver") || var0.equals("light_gray")) {
         return QS.id_public.k;
      } else if (var0.equals("cyan")) {
         return QS.id_goto.k;
      } else if (var0.equals("purple")) {
         return QS.id_while.k;
      } else if (var0.equals("blue")) {
         return QS.id_try.k;
      } else if (var0.equals("brown")) {
         return QS.id_instanceof.k;
      } else if (var0.equals("green")) {
         return QS.id_throw.k;
      } else if (var0.equals("red")) {
         return QS.id_interface.k;
      } else if (var0.equals("black")) {
         return QS.id_char.k;
      } else if (var0.equals("white_terracotta")) {
         return QS.id_short.k;
      } else if (var0.equals("orange_terracotta")) {
         return QS.id_default.k;
      } else if (var0.equals("magenta_terracotta")) {
         return QS.id_const.k;
      } else if (var0.equals("light_blue_terracotta")) {
         return QS.id_strictfp.k;
      } else if (var0.equals("yellow_terracotta")) {
         return QS.id_boolean.k;
      } else if (var0.equals("lime_terracotta")) {
         return QS.id_transient.k;
      } else if (var0.equals("pink_terracotta")) {
         return QS.id_for.k;
      } else if (var0.equals("gray_terracotta")) {
         return QS.id_double.k;
      } else if (var0.equals("light_gray_terracotta")) {
         return QS.id_switch.k;
      } else if (var0.equals("cyan_terracotta")) {
         return QS.r.k;
      } else if (var0.equals("purple_terracotta")) {
         return QS.P.k;
      } else if (var0.equals("blue_terracotta")) {
         return QS.B.k;
      } else if (var0.equals("brown_terracotta")) {
         return QS.S.k;
      } else if (var0.equals("green_terracotta")) {
         return QS.s.k;
      } else if (var0.equals("red_terracotta")) {
         return QS.E.k;
      } else if (var0.equals("black_terracotta")) {
         return QS.G.k;
      } else if (var0.equals("crimson_nylium")) {
         return QS.b.k;
      } else if (var0.equals("crimson_stem")) {
         return QS.M.k;
      } else if (var0.equals("crimson_hyphae")) {
         return QS.O.k;
      } else if (var0.equals("warped_nylium")) {
         return QS.h.k;
      } else if (var0.equals("warped_stem")) {
         return QS.X.k;
      } else if (var0.equals("warped_hyphae")) {
         return QS.J.k;
      } else {
         return var0.equals("warped_wart_block") ? QS.x.k : -1;
      }
   }
}
