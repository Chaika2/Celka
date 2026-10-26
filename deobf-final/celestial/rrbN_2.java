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
   private static String break_ = "vanilla";
   static rrbQ_2 byte_ = null;
   static rrbQ_2 protected_ = null;
   static rrbQ_2 throws_ = null;
   static rrbQ_2 case_ = null;
   static rrbQ_2 catch_ = null;
   private static rrbQ_2[] private_ = null;
   private static rrbQ_2[][] implements_ = (rrbQ_2[][])null;
   private static rrbQ_2 finally_ = null;
   private static rrbz_3 extends_ = new rrbz_3();
   private static rrbQ_2 native_ = null;
   private static rrbz_3 volatile_ = new rrbz_3();
   private static rrbQ_2 final_ = null;
   private static rrbz_3 package_ = new rrbz_3();
   private static rrbQ_2 int_ = null;
   private static rrbz_3 new_ = new rrbz_3();
   private static rrMr_1[] continue_ = null;
   private static int super_ = 0;
   private static rrbQ_2 this_ = null;
   private static rrbQ_2 else_ = null;
   private static int synchronized_ = -1;
   private static rrbQ_2 return_ = null;
   private static rrbQ_2 public_ = null;
   private static rrbQ_2 goto_ = null;
   private static rrbQ_2 while_ = null;
   private static rrbQ_2 try_ = null;
   private static boolean instanceof_ = true;
   private static int throw_ = -1;
   private static int interface_ = -1;
   private static int char_ = -1;
   private static int abstract_ = -1;
   private static int long_ = -1;
   private static int float_ = -1;
   private static rjU_2 void_ = null;
   private static rjU_2 static_ = null;
   private static rjU_2 import_ = null;
   private static int[] short_ = null;
   private static int[] default_ = null;
   private static float[][] const_ = (float[][])null;
   private static float[][] strictfp_ = (float[][])null;
   private static int[] boolean_ = null;
   private static int[] transient_ = null;
   private static float[][] for_ = (float[][])null;
   private static int[] double_ = null;
   private static final xc_3 switch_ = xu_3.finally_.continue_();
   private static final xc_3 r = xu_3.try_.continue_();
   public static Random class_ = new Random();
   private static final rrbF_2 P = new rrbc_3();
   private static final rrbF_2 B = new rrbu_3();
   private static final rrbF_2 S = new rrbm_3();
   private static final rrbF_2 s = new rrbZ_2();
   private static final rrbF_2 E = new rrbv_3();

   private static rjU_2 byte_(Properties var0, String var1) {
      int var2 = break_(var0, var1);
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

   public static yC_2 byte_() {
      return QY.instanceof_().s();
   }

   private static int[] byte_(Properties var0, String var1, String var2, String var3) {
      int[] var4 = new int[32];
      Arrays.fill(var4, -1);
      int var5 = 0;

      for (String var7 : var0.keySet()) {
         String var8 = var0.getProperty(var7);
         if (var7.startsWith(var2)) {
            String var9 = rrzX_2.protected_(var7, var2);
            int var10 = rrbb_3.class_(var9, -1);
            int var11 = break_(var8);
            if (var10 >= 0 && var10 < var4.length && var11 >= 0) {
               var4[var10] = var11;
               var5++;
            } else {
               case_("Invalid color: " + var7 + " = " + var8);
            }
         }
      }

      if (var5 <= 0) {
         return null;
      } else {
         throws_(var3 + " colors: " + var5);
         return var4;
      }
   }

   private static rjU_2 byte_(rjU_2 var0) {
      return import_ == null ? var0 : import_;
   }

   public static int byte_(int var0) {
      if (var0 != 0) {
         return var0;
      } else {
         return float_ < 0 ? var0 : float_;
      }
   }

   private static int byte_(String var0) {
      if (var0.equals("potion.water")) {
         return 0;
      } else {
         var0 = rrzX_2.break_(var0, "potion.", "effect.");
         String var1 = rrzX_2.break_(var0, "effect.", "effect.minecraft.");

         for (rqO_2 var3 : rVL.const_.protected_()) {
            rLR var4 = rrzs_3.class_(var3);
            if (var4.byte_().equals(var0)) {
               return rLR.class_(var4);
            }

            if (var4.byte_().equals(var1)) {
               return rLR.class_(var4);
            }
         }

         return -1;
      }
   }

   public static boolean class_(gm_3 var0, float var1, fN_2 var2, boolean var3, float var4) {
      if (var0 == null) {
         return false;
      } else if (continue_ == null) {
         return false;
      } else {
         int var5 = rrzc_3.class_(var0);
         int var6 = var5 - super_;
         if (var6 >= 0 && var6 < continue_.length) {
            rrMr_1 var7 = continue_[var6];
            return var7 == null ? false : var7.class_(var0, var1, var2, var3, var4);
         } else {
            return false;
         }
      }
   }

   private static int class_(xc_3 var0, rRq_1 var1, rfH_2 var2, rrxF_2 var3) {
      rrbQ_2 var4 = public_;
      xd_3 var5 = var0.break_();
      if (var5 == xu_3.Bo && while_ != null) {
         var4 = while_;
      }

      if (var5 == xu_3.BK && goto_ != null) {
         var4 = goto_;
      }

      if (var4 == null) {
         return -1;
      } else if (!(var5 instanceof zO_2)) {
         return -1;
      } else {
         int var6 = var0.byte_(zO_2.volatile_);
         return var4.class_(var6);
      }
   }

   public static rjU_2 class_(rRp_1 var0, double var1, double var3, double var5, rrbQ_2 var7, rrbz_3 var8) {
      if (var7 == null) {
         return null;
      } else {
         int var9 = var7.class_(var0, var1, var3, var5, 3);
         int var10 = var9 >> 16 & 0xFF;
         int var11 = var9 >> 8 & 0xFF;
         int var12 = var9 & 0xFF;
         float var13 = (float)var10 / 255.0F;
         float var14 = (float)var11 / 255.0F;
         float var15 = (float)var12 / 255.0F;
         return var8.class_((double)var13, (double)var14, (double)var15);
      }
   }

   public static rjU_2 class_(rjU_2 var0, rYB var1, an_3 var2, float var3) {
      QY var4 = QY.instanceof_();
      if (rrzc_3.break_(var1)) {
         return class_(var0);
      } else if (rrzc_3.byte_(var1)) {
         return break_(var0, (gm_3)var4.class_[56], var2.rx(), var2.re() + 1.0, var2.BO());
      } else {
         return rrzc_3.protected_(var1) ? break_(var0) : var0;
      }
   }

   private static int[] class_(Properties var0, String var1, String var2, String var3) {
      ArrayList var4 = new ArrayList();
      Set var5 = var0.keySet();
      int var6 = 0;

      for (String var8 : var5) {
         String var9 = var0.getProperty(var8);
         if (var8.startsWith(var2)) {
            String var10 = rrzX_2.protected_(var8, var2);
            int var11 = rrWu_1.break_(var10);

            try {
               if (var11 < 0) {
                  var11 = rrWu_1.class_(new rqO_2(var10).toString());
               }
            } catch (rqX_2 var13) {
               rrbb_3.protected_("ResourceLocationException: " + var13.getMessage());
            }

            if (var11 < 0) {
               case_("Invalid spawn egg name: " + var8);
            } else {
               int var12 = break_(var9);
               if (var12 < 0) {
                  case_("Invalid spawn egg color: " + var8 + " = " + var9);
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
         throws_(var3 + " colors: " + var6);
         int[] var14 = new int[var4.size()];

         for (int var15 = 0; var15 < var14.length; var15++) {
            var14[var15] = (Integer)var4.get(var15);
         }

         return var14;
      }
   }

   private static int class_(rkO_2 var0, rdn_3 var1, int var2, int var3) {
      if (short_ == null && default_ == null) {
         return var3;
      } else {
         aI_2 var4 = var0.class_(var1.package_());
         if (var4 == null) {
            return var3;
         } else {
            int var5 = rVL.transient_.class_(var4);
            if (var5 < 0) {
               return var3;
            } else {
               int[] var6 = var2 == 0 ? short_ : default_;
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

   public static int class_(float var0, int var1) {
      if (return_ == null) {
         return var1;
      } else {
         int var2 = (int)(var0 * (float)return_.protected_());
         return return_.class_(var2);
      }
   }

   public static void class_(CH var0, rRp_1 var1, double var2, double var4, double var6, rrxF_2 var8) {
      if (byte_ != null || implements_ != null || throw_ >= 0) {
         rfH_2 var9 = new rfH_2(var2, var4, var6);
         var8.class_(r, var9);
         int var10 = class_(var1, r, var9, var8);
         int var11 = var10 >> 16 & 0xFF;
         int var12 = var10 >> 8 & 0xFF;
         int var13 = var10 & 0xFF;
         float var14 = (float)var11 / 255.0F;
         float var15 = (float)var12 / 255.0F;
         float var16 = (float)var13 / 255.0F;
         if (throw_ >= 0) {
            int var17 = throw_ >> 16 & 0xFF;
            int var18 = throw_ >> 8 & 0xFF;
            int var19 = throw_ & 0xFF;
            var14 = (float)var17 / 255.0F;
            var15 = (float)var18 / 255.0F;
            var16 = (float)var19 / 255.0F;
            var14 *= (float)var17 / 255.0F;
            var15 *= (float)var18 / 255.0F;
            var16 *= (float)var19 / 255.0F;
         }

         var0.class_(var14, var15, var16);
      }
   }

   private static rjU_2 class_(rjU_2 var0) {
      return void_ == null ? var0 : void_;
   }

   private static int class_(String var0, int var1) {
      try {
         InputStream var2 = rrbb_3.class_(new rqO_2(var0));
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

   public static rjU_2 class_(rjU_2 var0, rRp_1 var1, double var2, double var4, double var6) {
      if (finally_ == null) {
         return var0;
      } else {
         int var8 = finally_.class_(var1, var2, var4, var6, 3);
         int var9 = var8 >> 16 & 0xFF;
         int var10 = var8 >> 8 & 0xFF;
         int var11 = var8 & 0xFF;
         float var12 = (float)var9 / 255.0F;
         float var13 = (float)var10 / 255.0F;
         float var14 = (float)var11 / 255.0F;
         float var15 = (float)var0.break_ / 0.5F;
         float var16 = (float)var0.byte_ / 0.66275F;
         float var17 = (float)var0.protected_;
         var12 *= var15;
         var13 *= var16;
         var14 *= var17;
         return extends_.class_((double)var12, (double)var13, (double)var14);
      }
   }

   public static rjU_2 class_(rRp_1 var0, double var1, double var3, double var5) {
      return class_(var0, var1, var3, var5, final_, package_);
   }

   public static int class_(rLR var0, int var1) {
      int var2 = 0;
      if (var0 != null) {
         var2 = rLR.class_(var0);
      }

      return break_(var2, var1);
   }

   private static void class_(int[] var0) {
      if (var0 != null) {
         QS[] var1 = QS.class_;

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

   private static void class_(float[][] var0) {
      if (var0 != null) {
         rxL_2[] var1 = rxL_2.values();

         for (int var2 = 0; var2 < var1.length && var2 < var0.length; var2++) {
            rxL_2 var3 = var1[var2];
            if (var3 != null) {
               float[] var4 = var0[var2];
               if (var4 != null && !var3.protected_().equals(var4)) {
                  var3.class_(var4);
               }
            }
         }
      }
   }

   public static int class_(int var0) {
      return abstract_ < 0 ? var0 : abstract_;
   }

   public static void class_() {
      break_ = "vanilla";
      byte_ = null;
      throws_ = null;
      protected_ = null;
      catch_ = null;
      case_ = null;
      finally_ = null;
      native_ = null;
      final_ = null;
      int_ = null;
      this_ = null;
      else_ = null;
      synchronized_ = -1;
      return_ = null;
      public_ = null;
      try_ = null;
      continue_ = null;
      throw_ = -1;
      interface_ = -1;
      char_ = -1;
      abstract_ = -1;
      long_ = -1;
      float_ = -1;
      void_ = null;
      static_ = null;
      import_ = null;
      private_ = null;
      implements_ = (rrbQ_2[][])null;
      instanceof_ = true;
      short_ = null;
      default_ = null;
      const_ = (float[][])null;
      strictfp_ = (float[][])null;
      boolean_ = null;
      class_(transient_);
      class_(for_);
      double_ = null;
      break_ = class_("optifine/color.properties", "palette.format", rrbQ_2.case_, "vanilla");
      String var0 = "optifine/colormap/";
      String[] var1 = new String[]{"water.png", "watercolorx.png"};
      byte_ = class_(var0, var1, 256, 256);
      break_();
      if (rrbb_3.K()) {
         String[] var2 = new String[]{"pine.png", "pinecolor.png"};
         protected_ = class_(var0, var2, 256, 256);
         String[] var3 = new String[]{"birch.png", "birchcolor.png"};
         throws_ = class_(var0, var3, 256, 256);
         String[] var4 = new String[]{"swampgrass.png", "swampgrasscolor.png"};
         catch_ = class_(var0, var4, 256, 256);
         String[] var5 = new String[]{"swampfoliage.png", "swampfoliagecolor.png"};
         case_ = class_(var0, var5, 256, 256);
         String[] var6 = new String[]{"sky0.png", "skycolor0.png"};
         finally_ = class_(var0, var6, 256, 256);
         String[] var7 = new String[]{"fog0.png", "fogcolor0.png"};
         native_ = class_(var0, var7, 256, 256);
         String[] var8 = new String[]{"underwater.png", "underwatercolor.png"};
         final_ = class_(var0, var8, 256, 256);
         String[] var9 = new String[]{"underlava.png", "underlavacolor.png"};
         int_ = class_(var0, var9, 256, 256);
         String[] var10 = new String[]{"redstone.png", "redstonecolor.png"};
         this_ = class_(var0, var10, 16, 1);
         else_ = class_(var0 + "xporb.png", -1, -1);
         return_ = class_(var0 + "durability.png", -1, -1);
         String[] var11 = new String[]{"stem.png", "stemcolor.png"};
         public_ = class_(var0, var11, 8, 1);
         while_ = class_(var0 + "pumpkinstem.png", 8, 1);
         goto_ = class_(var0 + "melonstem.png", 8, 1);
         String[] var12 = new String[]{"myceliumparticle.png", "myceliumparticlecolor.png"};
         try_ = class_(var0, var12, -1, -1);
         Pair var13 = protected_();
         continue_ = (rrMr_1[])var13.getLeft();
         super_ = (Integer)var13.getRight();
         class_("optifine/color.properties");
         implements_ = class_(new String[]{var0 + "custom/", var0 + "blocks/"}, private_, 256, 256);
         break_();
      }
   }

   private static rrbQ_2[][] class_(String[] var0, rrbQ_2[] var1, int var2, int var3) {
      String[] var4 = rrzM_2.class_(var0, new String[]{".properties"});
      Arrays.sort(var4);
      ArrayList var5 = new ArrayList();

      for (int var6 = 0; var6 < var4.length; var6++) {
         String var7 = var4[var6];
         throws_("Block colormap: " + var7);

         try {
            rqO_2 var8 = new rqO_2("minecraft", var7);
            InputStream var9 = rrbb_3.class_(var8);
            if (var9 == null) {
               case_("File not found: " + var7);
            } else {
               rrzE_2 var10 = new rrzE_2();
               var10.load(var9);
               var9.close();
               rrbQ_2 var11 = new rrbQ_2(var10, var7, var2, var3, break_);
               if (var11.class_(var7) && var11.break_(var7)) {
                  class_(var11, var5);
               }
            }
         } catch (FileNotFoundException var12) {
            case_("File not found: " + var7);
         } catch (Exception var13) {
            var13.printStackTrace();
         }
      }

      if (var1 != null) {
         for (int var14 = 0; var14 < var1.length; var14++) {
            rrbQ_2 var15 = var1[var14];
            class_(var15, var5);
         }
      }

      return var5.size() <= 0 ? (rrbQ_2[][])null : class_(var5);
   }

   public static int class_(rdn_3 var0, int var1, int var2) {
      if (var0 == null) {
         return var2;
      } else {
         rdb_3 var3 = var0.break_();
         if (var3 == null) {
            return var2;
         } else {
            return var3 instanceof rkO_2 ? class_((rkO_2)var3, var0, var1, var2) : var2;
         }
      }
   }

   private static float[] class_(rxL_2 var0, float[][] var1, float[] var2) {
      if (var1 == null) {
         return var2;
      } else if (var0 == null) {
         return var2;
      } else {
         float[] var3 = var1[var0.ordinal()];
         return var3 == null ? var2 : var3;
      }
   }

   public static float[] class_(rxL_2 var0, float[] var1) {
      return class_(var0, const_, var1);
   }

   public static int class_(int var0, int var1) {
      if (boolean_ == null) {
         return var1;
      } else if (var0 >= 0 && var0 < boolean_.length) {
         int var2 = boolean_[var0];
         return var2 < 0 ? var1 : var2;
      } else {
         return var1;
      }
   }

   private static String class_(String var0, String var1, String[] var2, String var3) {
      try {
         rqO_2 var4 = new rqO_2(var0);
         InputStream var5 = rrbb_3.class_(var4);
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
                  case_("Invalid value: " + var1 + "=" + var7);
                  case_("Expected values: " + rrbb_3.class_(var2));
                  return var3;
               } else {
                  throws_(var1 + "=" + var7);
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

   public static int class_(wK_2 var0, xc_3 var1, rRp_1 var2, rfH_2 var3, rrxF_2 var4) {
      xd_3 var5 = var1.break_();
      xc_3 var6 = var1;
      if (implements_ != null) {
         if (!var0.break_()) {
            if (var5 == xu_3.implements_) {
               var6 = switch_;
            }

            if (var5 == xu_3.ra) {
               return -1;
            }
         }

         if (var5 instanceof du_3 && var1.byte_(du_3.volatile_) == rCf_1.UPPER) {
            var3 = var3.break_();
            var6 = var2.byte_(var3);
         }

         rrbQ_2 var7 = class_(var6);
         if (var7 != null) {
            if (rrbb_3.Y() && !var7.byte_()) {
               return class_(var1, var2, var3, var7, var4.private_());
            }

            return var7.class_(var2, var3);
         }
      }

      if (!var0.break_()) {
         return -1;
      } else if (var5 == xu_3.Sr) {
         return break_(var2, var3);
      } else if (var5 == xu_3.ra) {
         return break_(var4.catch_());
      } else if (var5 instanceof zO_2) {
         return class_(var1, var2, var3, var4);
      } else if (instanceof_) {
         return -1;
      } else {
         rrbF_2 var8;
         if (var5 == xu_3.implements_ || var5 == xu_3.Gs || var5 instanceof du_3) {
            var8 = P;
         } else if (var5 instanceof du_3) {
            var8 = P;
            if (var1.byte_(du_3.volatile_) == rCf_1.UPPER) {
               var3 = var3.break_();
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

         return rrbb_3.Y() && !var8.byte_() ? class_(var1, var2, var3, var8, var4.private_()) : var8.class_(var6, var2, var3);
      }
   }

   protected static rYG class_(rRp_1 var0, rfH_2 var1) {
      rYG var2 = rrWr_1.class_(var0, var1);
      if ((var2 == rrWr_1.break_ || var2 == rrWr_1.byte_) && !rrbb_3.g()) {
         var2 = rrWr_1.class_;
      }

      return var2;
   }

   private static rrbQ_2 class_(xc_3 var0) {
      if (implements_ == null) {
         return null;
      } else if (!(var0 instanceof xc_3)) {
         return null;
      } else {
         xc_3 var1 = var0;
         int var2 = var0.continue_();
         if (var2 >= 0 && var2 < implements_.length) {
            rrbQ_2[] var3 = implements_[var2];
            if (var3 == null) {
               return null;
            } else {
               for (int var4 = 0; var4 < var3.length; var4++) {
                  rrbQ_2 var5 = var3[var4];
                  if (var5.class_(var1)) {
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

   private static int class_(xc_3 var0, rRp_1 var1, rfH_2 var2, rrbF_2 var3, rrGi_1 var4) {
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
            var11.class_(var15, var9, var16);
            int var17 = var3.class_(var0, var1, var11);
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

   public static int class_(rRp_1 var0, xc_3 var1, rfH_2 var2, rrxF_2 var3) {
      xd_3 var4 = var1.break_();
      Object var5 = class_(var1);
      if (var5 == null && var1.byte_() == QP.finally_) {
         var5 = E;
      }

      if (var5 == null) {
         return byte_().class_(var1, var0, var2, 0);
      } else {
         return rrbb_3.Y() && !((rrbF_2)var5).byte_() ? class_(var1, var0, var2, (rrbF_2)var5, var3.private_()) : ((rrbF_2)var5).class_(var1, var0, var2);
      }
   }

   private static void class_(String var0) {
      try {
         rqO_2 var1 = new rqO_2(var0);
         InputStream var2 = rrbb_3.class_(var1);
         if (var2 == null) {
            return;
         }

         throws_("Loading " + var0);
         rrzE_2 var3 = new rrzE_2();
         var3.load(var2);
         var2.close();
         throw_ = class_(var3, new String[]{"particle.water", "drop.water"});
         interface_ = break_(var3, "particle.portal");
         char_ = break_(var3, "lilypad");
         abstract_ = break_(var3, "text.xpbar");
         long_ = break_(var3, "text.boss");
         float_ = break_(var3, "text.sign");
         void_ = byte_(var3, "fog.nether");
         static_ = byte_(var3, "fog.end");
         import_ = byte_(var3, "sky.end");
         private_ = class_(var3, var0);
         short_ = class_(var3, var0, "egg.shell.", "Spawn egg shell");
         default_ = class_(var3, var0, "egg.spots.", "Spawn egg spot");
         const_ = break_(var3, var0, "collar.", "Wolf collar");
         strictfp_ = break_(var3, var0, "sheep.", "Sheep");
         boolean_ = byte_(var3, var0, "text.code.", "Text");
         int[] var4 = protected_(var3, var0, "map.", "Map");
         if (var4 != null) {
            if (transient_ == null) {
               transient_ = case_();
            }

            class_(var4);
         }

         float[][] var5 = break_(var3, var0, "dye.", "Dye");
         if (var5 != null) {
            if (for_ == null) {
               for_ = catch_();
            }

            class_(var5);
         }

         double_ = throws_(var3, var0, "potion.", "Potion");
         synchronized_ = rrbb_3.class_(var3.getProperty("xporb.time"), -1);
      } catch (FileNotFoundException var6) {
         return;
      } catch (IOException var7) {
         rrbb_3.protected_("Error parsing: " + var0);
         rrbb_3.protected_(var7.getClass().getName() + ": " + var7.getMessage());
      }
   }

   private static void class_(rrbQ_2 var0, List var1, int var2) {
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

   private static rrbQ_2[][] class_(List var0) {
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

   private static int class_(Properties var0, String[] var1) {
      for (int var2 = 0; var2 < var1.length; var2++) {
         String var3 = var1[var2];
         int var4 = break_(var0, var3);
         if (var4 >= 0) {
            return var4;
         }
      }

      return -1;
   }

   private static rrbQ_2[] class_(Properties var0, String var1) {
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
         throws_("Block palette: " + var18 + " = " + var8);
         String var9 = var18.substring(var3.length());
         String var10 = rrzJ_2.class_(var1);
         var9 = rrzJ_2.class_(var9, var10);
         rrbQ_2 var11 = class_(var9, 256, 256);
         if (var11 == null) {
            case_("Colormap not found: " + var9);
         } else {
            rrMz_1 var12 = new rrMz_1("CustomColors");
            rrMn_1[] var13 = var12.byte_(var8);
            if (var13 != null && var13.length > 0) {
               for (int var14 = 0; var14 < var13.length; var14++) {
                  rrMn_1 var15 = var13[var14];
                  var11.class_(var15);
               }

               var2.add(var11);
            } else {
               case_("Invalid match blocks: " + var8);
            }
         }
      }

      return var2.size() <= 0 ? null : var2.toArray(new rrbQ_2[var2.size()]);
   }

   private static rrbQ_2 class_(String var0, String[] var1, int var2, int var3) {
      for (int var4 = 0; var4 < var1.length; var4++) {
         String var5 = var1[var4];
         var5 = var0 + var5;
         rrbQ_2 var6 = class_(var5, var2, var3);
         if (var6 != null) {
            return var6;
         }
      }

      return null;
   }

   private static void class_(rrbQ_2 var0, List var1) {
      int[] var2 = var0.catch_();
      if (var2 != null && var2.length > 0) {
         for (int var3 = 0; var3 < var2.length; var3++) {
            int var4 = var2[var3];
            if (var4 < 0) {
               case_("Invalid block ID: " + var4);
            } else {
               class_(var0, var1, var4);
            }
         }
      } else {
         case_("No match blocks: " + rrbb_3.class_(var2));
      }
   }

   private static int class_(xc_3 var0, int var1) {
      xd_3 var2 = var0.break_();
      if (!(var2 instanceof Wu_1)) {
         return var1;
      } else {
         return !(var0.byte_(Wu_1.new_) instanceof Integer var4) ? var1 : var4;
      }
   }

   public static void class_(CH var0, rRp_1 var1, double var2, double var4, double var6) {
      if (this_ != null) {
         xc_3 var8 = var1.byte_(new rfH_2(var2, var4, var6));
         int var9 = class_(var8, 15);
         int var10 = this_.class_(var9);
         int var11 = var10 >> 16 & 0xFF;
         int var12 = var10 >> 8 & 0xFF;
         int var13 = var10 & 0xFF;
         float var14 = (float)var11 / 255.0F;
         float var15 = (float)var12 / 255.0F;
         float var16 = (float)var13 / 255.0F;
         var0.class_(var14, var15, var16);
      }
   }

   public static float class_(float var0) {
      if (synchronized_ <= 0) {
         return var0;
      } else {
         float var1 = 628.0F / (float)synchronized_;
         return var0 * var1;
      }
   }

   public static rrbQ_2 class_(String var0, int var1, int var2) {
      try {
         rqO_2 var3 = new rqO_2(var0);
         if (!rrbb_3.byte_(var3)) {
            return null;
         } else {
            throws_("Colormap " + var0);
            rrzE_2 var4 = new rrzE_2();
            String var5 = rrzX_2.class_(var0, ".png", ".properties");
            rqO_2 var6 = new rqO_2(var5);
            if (rrbb_3.byte_(var6)) {
               InputStream var7 = rrbb_3.class_(var6);
               var4.load(var7);
               var7.close();
               throws_("Colormap properties: " + var5);
            } else {
               var4.put("format", break_);
               var4.put("source", var0);
               var5 = var0;
            }

            rrbQ_2 var9 = new rrbQ_2(var4, var5, var1, var2, break_);
            return !var9.class_(var5) ? null : var9;
         }
      } catch (Exception var8) {
         var8.printStackTrace();
         return null;
      }
   }

   public static void class_(CH var0) {
      if (interface_ >= 0) {
         int var1 = interface_;
         int var2 = var1 >> 16 & 0xFF;
         int var3 = var1 >> 8 & 0xFF;
         int var4 = var1 & 0xFF;
         float var5 = (float)var2 / 255.0F;
         float var6 = (float)var3 / 255.0F;
         float var7 = (float)var4 / 255.0F;
         var0.class_(var5, var6, var7);
      }
   }

   private static int break_(String var0) {
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

   public static int break_(float var0) {
      if (else_ == null) {
         return -1;
      } else {
         int var1 = (int)Math.round((double)((rfU_2.class_(var0) + 1.0F) * (float)(else_.protected_() - 1)) / 2.0);
         return else_.class_(var1);
      }
   }

   private static rjU_2 break_(rjU_2 var0) {
      return static_ == null ? var0 : static_;
   }

   public static int break_(int var0) {
      return long_ < 0 ? var0 : long_;
   }

   private static int break_(rRp_1 var0, rfH_2 var1) {
      return char_ < 0 ? byte_().class_(xu_3.Sr.continue_(), var0, var1, 0) : char_;
   }

   private static int break_(Properties var0, String var1) {
      String var2 = var0.getProperty(var1);
      if (var2 == null) {
         return -1;
      } else {
         var2 = var2.trim();
         int var3 = break_(var2);
         if (var3 < 0) {
            case_("Invalid color: " + var1 + " = " + var2);
            return var3;
         } else {
            throws_(var1 + " = " + var2);
            return var3;
         }
      }
   }

   public static int break_(int var0, int var1) {
      if (double_ == null) {
         return var1;
      } else if (var0 >= 0 && var0 < double_.length) {
         int var2 = double_[var0];
         return var2 < 0 ? var1 : var2;
      } else {
         return var1;
      }
   }

   public static void break_() {
      instanceof_ = throws_ == null && protected_ == null && catch_ == null && case_ == null && rrbb_3.g();
   }

   private static float[][] break_(Properties var0, String var1, String var2, String var3) {
      rxL_2[] var4 = rxL_2.values();
      HashMap var5 = new HashMap();

      for (int var6 = 0; var6 < var4.length; var6++) {
         rxL_2 var7 = var4[var6];
         var5.put(var7.class_(), var7);
      }

      var5.put("lightBlue", rxL_2.LIGHT_BLUE);
      var5.put("silver", rxL_2.LIGHT_GRAY);
      float[][] var15 = new float[var4.length][];
      int var16 = 0;

      for (String var9 : var0.keySet()) {
         String var10 = var0.getProperty(var9);
         if (var9.startsWith(var2)) {
            String var11 = rrzX_2.protected_(var9, var2);
            rxL_2 var12 = (rxL_2)var5.get(var11);
            int var13 = break_(var10);
            if (var12 != null && var13 >= 0) {
               float[] var14 = new float[]{(float)(var13 >> 16 & 0xFF) / 255.0F, (float)(var13 >> 8 & 0xFF) / 255.0F, (float)(var13 & 0xFF) / 255.0F};
               var15[var12.ordinal()] = var14;
               var16++;
            } else {
               case_("Invalid color: " + var9 + " = " + var10);
            }
         }
      }

      if (var16 <= 0) {
         return (float[][])null;
      } else {
         throws_(var3 + " colors: " + var16);
         return var15;
      }
   }

   public static void break_(CH var0) {
      if (try_ != null) {
         int var1 = try_.class_();
         int var2 = var1 >> 16 & 0xFF;
         int var3 = var1 >> 8 & 0xFF;
         int var4 = var1 & 0xFF;
         float var5 = (float)var2 / 255.0F;
         float var6 = (float)var3 / 255.0F;
         float var7 = (float)var4 / 255.0F;
         var0.class_(var5, var6, var7);
      }
   }

   private static rjU_2 break_(rjU_2 var0, rRp_1 var1, double var2, double var4, double var6) {
      if (native_ == null) {
         return var0;
      } else {
         int var8 = native_.class_(var1, var2, var4, var6, 3);
         int var9 = var8 >> 16 & 0xFF;
         int var10 = var8 >> 8 & 0xFF;
         int var11 = var8 & 0xFF;
         float var12 = (float)var9 / 255.0F;
         float var13 = (float)var10 / 255.0F;
         float var14 = (float)var11 / 255.0F;
         float var15 = (float)var0.break_ / 0.753F;
         float var16 = (float)var0.byte_ / 0.8471F;
         float var17 = (float)var0.protected_;
         var12 *= var15;
         var13 *= var16;
         var14 *= var17;
         return volatile_.class_((double)var12, (double)var13, (double)var14);
      }
   }

   private static int break_(xc_3 var0) {
      if (this_ == null) {
         return -1;
      } else {
         int var1 = class_(var0, 15);
         return this_.class_(var1);
      }
   }

   public static rjU_2 break_(rRp_1 var0, double var1, double var3, double var5) {
      return class_(var0, var1, var3, var5, int_, new_);
   }

   public static rjU_2 break_(rjU_2 var0, rYB var1, an_3 var2, float var3) {
      QY var4 = QY.instanceof_();
      if (rrzc_3.byte_(var1)) {
         return class_(var0, (gm_3)var4.class_[56], var2.rx(), var2.re() + 1.0, var2.BO());
      } else {
         return rrzc_3.protected_(var1) ? byte_(var0) : var0;
      }
   }

   public static float[] break_(rxL_2 var0, float[] var1) {
      return class_(var0, strictfp_, var1);
   }

   private static void throws_(String var0) {
      rrbb_3.byte_("CustomColors: " + var0);
   }

   private static int[] throws_(Properties var0, String var1, String var2, String var3) {
      int[] var4 = new int[throws_()];
      Arrays.fill(var4, -1);
      int var5 = 0;

      for (String var7 : var0.keySet()) {
         String var8 = var0.getProperty(var7);
         if (var7.startsWith(var2)) {
            int var9 = byte_(var7);
            int var10 = break_(var8);
            if (var9 >= 0 && var9 < var4.length && var10 >= 0) {
               var4[var9] = var10;
               var5++;
            } else {
               case_("Invalid color: " + var7 + " = " + var8);
            }
         }
      }

      if (var5 <= 0) {
         return null;
      } else {
         throws_(var3 + " colors: " + var5);
         return var4;
      }
   }

   private static int throws_() {
      int var0 = 0;

      for (rqO_2 var2 : rVL.const_.protected_()) {
         rLR var3 = rrzs_3.class_(var2);
         int var4 = rLR.class_(var3);
         if (var4 > var0) {
            var0 = var4;
         }
      }

      return var0;
   }

   private static float[][] catch_() {
      rxL_2[] var0 = rxL_2.values();
      float[][] var1 = new float[var0.length][];

      for (int var2 = 0; var2 < var0.length && var2 < var1.length; var2++) {
         rxL_2 var3 = var0[var2];
         if (var3 != null) {
            var1[var2] = var3.protected_();
         }
      }

      return var1;
   }

   private static int[] case_() {
      QS[] var0 = QS.class_;
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

   private static void case_(String var0) {
      rrbb_3.protected_("CustomColors: " + var0);
   }

   private static int[] protected_(Properties var0, String var1, String var2, String var3) {
      int[] var4 = new int[QS.class_.length];
      Arrays.fill(var4, -1);
      int var5 = 0;

      for (String var7 : var0.keySet()) {
         String var8 = var0.getProperty(var7);
         if (var7.startsWith(var2)) {
            String var9 = rrzX_2.protected_(var7, var2);
            int var10 = protected_(var9);
            int var11 = break_(var8);
            if (var10 >= 0 && var10 < var4.length && var11 >= 0) {
               var4[var10] = var11;
               var5++;
            } else {
               case_("Invalid color: " + var7 + " = " + var8);
            }
         }
      }

      if (var5 <= 0) {
         return null;
      } else {
         throws_(var3 + " colors: " + var5);
         return var4;
      }
   }

   private static Pair<rrMr_1[], Integer> protected_() {
      String var0 = "optifine/lightmap/world";
      String var1 = ".png";
      String[] var2 = rrzM_2.class_(var0, var1);
      HashMap var3 = new HashMap();

      for (int var4 = 0; var4 < var2.length; var4++) {
         String var5 = var2[var4];
         String var6 = rrzX_2.byte_(var5, var0, var1);
         int var7 = rrbb_3.class_(var6, Integer.MIN_VALUE);
         if (var7 == Integer.MIN_VALUE) {
            case_("Invalid dimension ID: " + var6 + ", path: " + var5);
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
            rrbQ_2 var13 = class_(var12, -1, -1);
            if (var13 != null) {
               if (var13.throws_() < 16) {
                  case_("Invalid lightmap width: " + var13.throws_() + ", path: " + var12);
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
               String var28 = var27.class_;
               String var29 = var27.break_;
               rrbQ_2 var15 = class_(var29 + "/" + var28 + "_rain.png", -1, -1);
               rrbQ_2 var16 = class_(var29 + "/" + var28 + "_thunder.png", -1, -1);
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

   private static int protected_(String var0) {
      if (var0 == null) {
         return -1;
      } else if (var0.equals("air")) {
         return QS.break_.k;
      } else if (var0.equals("grass")) {
         return QS.byte_.k;
      } else if (var0.equals("sand")) {
         return QS.protected_.k;
      } else if (var0.equals("cloth")) {
         return QS.throws_.k;
      } else if (var0.equals("tnt")) {
         return QS.case_.k;
      } else if (var0.equals("ice")) {
         return QS.catch_.k;
      } else if (var0.equals("iron")) {
         return QS.private_.k;
      } else if (var0.equals("foliage")) {
         return QS.implements_.k;
      } else if (var0.equals("clay")) {
         return QS.extends_.k;
      } else if (var0.equals("dirt")) {
         return QS.native_.k;
      } else if (var0.equals("stone")) {
         return QS.volatile_.k;
      } else if (var0.equals("water")) {
         return QS.final_.k;
      } else if (var0.equals("wood")) {
         return QS.package_.k;
      } else if (var0.equals("quartz")) {
         return QS.int_.k;
      } else if (var0.equals("gold")) {
         return QS.abstract_.k;
      } else if (var0.equals("diamond")) {
         return QS.long_.k;
      } else if (var0.equals("lapis")) {
         return QS.float_.k;
      } else if (var0.equals("emerald")) {
         return QS.void_.k;
      } else if (var0.equals("obsidian")) {
         return QS.static_.k;
      } else if (var0.equals("netherrack")) {
         return QS.import_.k;
      } else if (var0.equals("snow") || var0.equals("white")) {
         return QS.finally_.k;
      } else if (var0.equals("adobe") || var0.equals("orange")) {
         return QS.new_.k;
      } else if (var0.equals("magenta")) {
         return QS.continue_.k;
      } else if (var0.equals("light_blue") || var0.equals("lightBlue")) {
         return QS.super_.k;
      } else if (var0.equals("yellow")) {
         return QS.this_.k;
      } else if (var0.equals("lime")) {
         return QS.else_.k;
      } else if (var0.equals("pink")) {
         return QS.synchronized_.k;
      } else if (var0.equals("gray")) {
         return QS.return_.k;
      } else if (var0.equals("silver") || var0.equals("light_gray")) {
         return QS.public_.k;
      } else if (var0.equals("cyan")) {
         return QS.goto_.k;
      } else if (var0.equals("purple")) {
         return QS.while_.k;
      } else if (var0.equals("blue")) {
         return QS.try_.k;
      } else if (var0.equals("brown")) {
         return QS.instanceof_.k;
      } else if (var0.equals("green")) {
         return QS.throw_.k;
      } else if (var0.equals("red")) {
         return QS.interface_.k;
      } else if (var0.equals("black")) {
         return QS.char_.k;
      } else if (var0.equals("white_terracotta")) {
         return QS.short_.k;
      } else if (var0.equals("orange_terracotta")) {
         return QS.default_.k;
      } else if (var0.equals("magenta_terracotta")) {
         return QS.const_.k;
      } else if (var0.equals("light_blue_terracotta")) {
         return QS.strictfp_.k;
      } else if (var0.equals("yellow_terracotta")) {
         return QS.boolean_.k;
      } else if (var0.equals("lime_terracotta")) {
         return QS.transient_.k;
      } else if (var0.equals("pink_terracotta")) {
         return QS.for_.k;
      } else if (var0.equals("gray_terracotta")) {
         return QS.double_.k;
      } else if (var0.equals("light_gray_terracotta")) {
         return QS.switch_.k;
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
