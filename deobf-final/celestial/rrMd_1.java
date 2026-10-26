package celestial;

import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Properties;
import javax.imageio.ImageIO;

public class rrMd_1 {
   private static rrMJ[] class_ = null;
   private static int break_ = 0;
   private static int byte_ = 0;

   public static void byte_() {
      if (class_ != null && rrbb_3.V()) {
         int var0 = 0;

         for (int var1 = 0; var1 < class_.length; var1++) {
            rrMJ var2 = class_[var1];
            var2.protected_();
            if (var2.private_()) {
               var0++;
            }
         }

         int var3 = ((yX_2)rrbb_3.X().class_[8]).public_();
         if (var3 != byte_) {
            break_ = var0;
            byte_ = var3;
         }

         if (rrMh_1.class_()) {
            rrMh_1.byte_();
         }
      } else {
         break_ = 0;
      }
   }

   private static rrMJ class_(Properties var0, rqO_2 var1) {
      String var2 = var0.getProperty("from");
      String var3 = var0.getProperty("to");
      int var4 = rrbb_3.class_(var0.getProperty("x"), -1);
      int var5 = rrbb_3.class_(var0.getProperty("y"), -1);
      int var6 = rrbb_3.class_(var0.getProperty("w"), -1);
      int var7 = rrbb_3.class_(var0.getProperty("h"), -1);
      if (var2 == null || var3 == null) {
         rrbb_3.protected_("TextureAnimation: Source or target texture not specified");
         return null;
      } else if (var4 >= 0 && var5 >= 0 && var6 >= 0 && var7 >= 0) {
         var2 = var2.trim();
         var3 = var3.trim();
         String var8 = rrzJ_2.class_(var1.break_());
         var2 = rrzJ_2.class_(var2, var8);
         var3 = rrzJ_2.class_(var3, var8);
         byte[] var9 = class_(var2, var6);
         if (var9 == null) {
            rrbb_3.protected_("TextureAnimation: Source texture not found: " + var3);
            return null;
         } else {
            int var10 = var9.length / 4;
            int var11 = var10 / (var6 * var7);
            int var12 = var11 * var6 * var7;
            if (var10 != var12) {
               rrbb_3.protected_("TextureAnimation: Source texture has invalid number of frames: " + var2 + ", frames: " + (float)var10 / (float)(var6 * var7));
               return null;
            } else {
               rqO_2 var13 = new rqO_2(var3);

               try {
                  InputStream var14 = rrbb_3.class_(var13);
                  if (var14 == null) {
                     rrbb_3.protected_("TextureAnimation: Target texture not found: " + var3);
                     return null;
                  } else {
                     BufferedImage var15 = class_(var14);
                     if (var4 + var6 <= var15.getWidth() && var5 + var7 <= var15.getHeight()) {
                        return new rrMJ(var2, var9, var3, var13, var4, var5, var6, var7, var0);
                     } else {
                        rrbb_3.protected_("TextureAnimation: Animation coordinates are outside the target texture: " + var3);
                        return null;
                     }
                  }
               } catch (IOException var16) {
                  rrbb_3.protected_("TextureAnimation: Target texture not found: " + var3);
                  return null;
               }
            }
         }
      } else {
         rrbb_3.protected_("TextureAnimation: Invalid coordinates");
         return null;
      }
   }

   public static void class_() {
      class_ = null;
   }

   private static BufferedImage class_(InputStream var0) throws IOException {
      BufferedImage var1 = ImageIO.read(var0);
      var0.close();
      return var1;
   }

   private static BufferedImage class_(BufferedImage var0, int var1, int var2) {
      BufferedImage var3 = new BufferedImage(var1, var2, 2);
      Graphics2D var4 = var3.createGraphics();
      var4.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
      var4.drawImage(var0, 0, 0, var1, var2, (ImageObserver)null);
      return var3;
   }

   private static byte[] class_(String var0, int var1) {
      byte[] var2 = break_(var0, var1);
      if (var2 == null) {
         var2 = break_("/anim" + var0, var1);
      }

      return var2;
   }

   private static rrMJ[] class_(rAC[] var0) {
      ArrayList var1 = new ArrayList();

      for (int var2 = 0; var2 < var0.length; var2++) {
         rAC var3 = var0[var2];
         rrMJ[] var4 = class_(var3);
         if (var4 != null) {
            var1.addAll(Arrays.asList(var4));
         }
      }

      return var1.toArray(new rrMJ[var1.size()]);
   }

   private static rrMJ[] class_(rAC var0) {
      String[] var1 = rrzM_2.class_(var0, "optifine/anim/", ".properties", (String[])null);
      if (var1.length <= 0) {
         return null;
      } else {
         ArrayList var2 = new ArrayList();

         for (int var3 = 0; var3 < var1.length; var3++) {
            String var4 = var1[var3];
            rrbb_3.byte_("Texture animation: " + var4);

            try {
               rqO_2 var5 = new rqO_2(var4);
               InputStream var6 = var0.class_(rAI.CLIENT_RESOURCES, var5);
               rrzE_2 var7 = new rrzE_2();
               var7.load(var6);
               var6.close();
               rrMJ var8 = class_(var7, var5);
               if (var8 != null) {
                  rqO_2 var9 = new rqO_2(var8.case_());
                  if (!rrbb_3.class_(var0, var9)) {
                     rrbb_3.byte_("Skipped: " + var4 + ", target texture not loaded from same resource pack");
                  } else {
                     var2.add(var8);
                  }
               }
            } catch (FileNotFoundException var10) {
               rrbb_3.protected_("File not found: " + var10.getMessage());
            } catch (IOException var11) {
               var11.printStackTrace();
            }
         }

         return var2.toArray(new rrMJ[var2.size()]);
      }
   }

   public static void break_() {
      class_ = null;
      break_ = 0;
      rAC[] var0 = rrbb_3.d();
      class_ = class_(var0);
      byte_();
   }

   private static byte[] break_(String var0, int var1) {
      Qw_1 var2 = rrbb_3.rE();

      try {
         rqO_2 var3 = new rqO_2(var0);
         InputStream var4 = rrbb_3.class_(var3);
         if (var4 == null) {
            return null;
         } else {
            BufferedImage var5 = class_(var4);
            var4.close();
            if (var5 == null) {
               return null;
            } else {
               if (var1 > 0 && var5.getWidth() != var1) {
                  double var6 = (double)(var5.getHeight() / var5.getWidth());
                  int var8 = (int)((double)var1 * var6);
                  var5 = class_(var5, var1, var8);
               }

               int var17 = var5.getWidth();
               int var7 = var5.getHeight();
               int[] var18 = new int[var17 * var7];
               byte[] var9 = new byte[var17 * var7 * 4];
               var5.getRGB(0, 0, var17, var7, var18, 0, var17);

               for (int var10 = 0; var10 < var18.length; var10++) {
                  int var11 = var18[var10] >> 24 & 0xFF;
                  int var12 = var18[var10] >> 16 & 0xFF;
                  int var13 = var18[var10] >> 8 & 0xFF;
                  int var14 = var18[var10] & 0xFF;
                  var9[var10 * 4 + 0] = (byte)var12;
                  var9[var10 * 4 + 1] = (byte)var13;
                  var9[var10 * 4 + 2] = (byte)var14;
                  var9[var10 * 4 + 3] = (byte)var11;
               }

               return var9;
            }
         }
      } catch (FileNotFoundException var15) {
         return null;
      } catch (Exception var16) {
         var16.printStackTrace();
         return null;
      }
   }

   public static int throws_() {
      return break_;
   }

   public static int protected_() {
      return class_ == null ? 0 : class_.length;
   }
}
