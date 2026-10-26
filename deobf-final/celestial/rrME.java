package celestial;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.UUID;

public class rrME {
   private static Map<String, rrMb_1> private_ = new HashMap<>();
   private static boolean implements_ = false;
   private static yX_2 finally_;
   private static rrMG extends_ = new rrMG();
   private static jz_3 native_;
   private static rrMO volatile_ = new rrMO();
   private static boolean final_ = false;
   public static final String class_ = ".png";
   public static final String break_ = ".properties";
   public static final String byte_ = "textures/entity/";
   public static final String protected_ = "textures/painting/";
   public static final String throws_ = "textures/";
   public static final String case_ = "optifine/random/";
   public static final String catch_ = "optifine/mob/";
   private static final String[] package_ = new String[]{
      "_armor", "_eyes", "_exploding", "_shooting", "_fur", "_eyes", "_invulnerable", "_angry", "_tame", "_collar"
   };
   private static final String int_ = "horse/";
   private static final String[] new_ = (String[])rrxb_3.class_(null, rOi_1.class, String[].class, 0);
   private static final String[] continue_ = (String[])rrxb_3.class_(null, rOi_1.class, String[].class, 1);

   private static String byte_(String var0) {
      if (var0.startsWith("optifine/random/")) {
         return rrzX_2.break_(var0, "optifine/random/", "textures/");
      } else {
         return var0.startsWith("optifine/mob/") ? rrzX_2.break_(var0, "optifine/mob/", "textures/entity/") : null;
      }
   }

   private static void byte_() {
      finally_ = rrbb_3.z();
      native_ = jz_3.break_;
      String[] var0 = new String[]{"optifine/random/", "optifine/mob/"};
      String[] var1 = new String[]{".png", ".properties"};
      String[] var2 = rrzM_2.class_(var0, var1);
      HashSet var3 = new HashSet();

      for (int var4 = 0; var4 < var2.length; var4++) {
         String var5 = var2[var4];
         var5 = rrzX_2.byte_(var5, var1);
         var5 = rrzX_2.finally_(var5, "0123456789");
         var5 = var5 + ".png";
         String var6 = byte_(var5);
         if (!var3.contains(var6)) {
            var3.add(var6);
            rqO_2 var7 = new rqO_2(var6);
            if (rrbb_3.byte_(var7)) {
               rrMb_1 var8 = private_.get(var6);
               if (var8 == null) {
                  var8 = break_(var7, false);
                  if (var8 == null) {
                     var8 = break_(var7, true);
                  }

                  if (var8 != null) {
                     private_.put(var6, var8);
                  }
               }
            }
         }
      }

      implements_ = !private_.isEmpty();
   }

   private static rqO_2 byte_(rqO_2 var0, boolean var1) {
      rqO_2 var2 = class_(var0, var1);
      if (var2 == null) {
         return null;
      } else {
         String var3 = var2.byte_();
         String var4 = var2.break_();
         String var5 = rrzX_2.throws_(var4, ".png");
         String var6 = var5 + ".properties";
         rqO_2 var7 = new rqO_2(var3, var6);
         if (rrbb_3.byte_(var7)) {
            return var7;
         } else {
            String var8 = protected_(var5);
            if (var8 == null) {
               return null;
            } else {
               rqO_2 var9 = new rqO_2(var3, var8 + ".properties");
               return rrbb_3.byte_(var9) ? var9 : null;
            }
         }
      }
   }

   public static void class_(rYB var0, rYB var1) {
      if (var1 instanceof gm_3 var2) {
         for (an_3 var4 : var2.byte_()) {
            class_(var4, var1);
         }
      }

      extends_.class_((an_3)null);
      volatile_.class_((ryO_2)null);
   }

   protected static rqO_2 class_(rqO_2 var0, boolean var1) {
      String var2 = var0.byte_();
      String var3 = var0.break_();
      String var4 = "textures/";
      String var5 = "optifine/random/";
      if (var1) {
         var4 = "textures/entity/";
         var5 = "optifine/mob/";
      }

      if (!var3.startsWith(var4)) {
         return null;
      } else {
         String var6 = rrzX_2.break_(var3, var4, var5);
         return new rqO_2(var2, var6);
      }
   }

   private static void class_(rOh_1 var0, boolean var1) {
      Object var2 = var0.sF();
      if (var2 == null) {
         var2 = (cb_3)rrbb_3.X().class_[57];
      }

      if (var2 instanceof cG_2 var3) {
         UUID var4 = var0.ro();
         if (var1) {
            rcd_3 var5 = var3.sQ();
            if (var5 != null && var5.throws_("UUID") && rrbb_3.class_(var5.class_("UUID"), var4)) {
               var3.class_[9] = var0;
            }

            rcd_3 var6 = var3.sJ();
            if (var6 != null && var6.throws_("UUID") && rrbb_3.class_(var6.class_("UUID"), var4)) {
               var3.class_[10] = var0;
            }
         } else {
            rmE_2 var15 = var0.BQ();
            if ((rOh_1)var3.class_[9] != null && rrbb_3.class_(((rOh_1)var3.class_[9]).ro(), var4)) {
               rmE_2 var16 = ((rOh_1)var3.class_[9]).BQ();
               var15.break_ = var16.break_;
               var15.class_ = var16.class_;
               Object var13 = null;
               var3.class_[9] = var13;
            }

            if ((rOh_1)var3.class_[10] != null && rrbb_3.class_(((rOh_1)var3.class_[10]).ro(), var4)) {
               rmE_2 var17 = ((rOh_1)var3.class_[10]).BQ();
               var15.break_ = var17.break_;
               var15.class_ = var17.class_;
               Object var14 = null;
               var3.class_[10] = var14;
            }
         }
      }
   }

   protected static rqO_2 class_(rqO_2 var0, int var1) {
      if (var0 == null) {
         return null;
      } else {
         String var2 = var0.break_();
         int var3 = var2.lastIndexOf(46);
         if (var3 < 0) {
            return null;
         } else {
            String var4 = var2.substring(0, var3);
            String var5 = var2.substring(var3);
            String var6 = var4 + var1 + var5;
            return new rqO_2(var0.byte_(), var6);
         }
      }
   }

   public static void class_(an_3 var0, rYB var1) {
      if (var1 != null) {
         rmE_2 var2 = var0.BQ();
         var2.break_ = var0.Bs();
         var2.class_ = var1.implements_(var2.break_);
         if (var0 instanceof rOh_1 var3) {
            class_(var3, false);
         }
      }
   }

   public static void class_(String var0) {
      rrbb_3.byte_("RandomEntities: " + var0);
   }

   public static rqO_2 class_(rqO_2 var0) {
      if (!implements_) {
         return var0;
      } else if (final_) {
         return var0;
      } else {
         rqO_2 var4;
         try {
            final_ = true;
            rrbD_2 var2 = class_();
            if (var2 == null) {
               return var0;
            }

            String var3 = var0.break_();
            if (var3.startsWith("horse/")) {
               var3 = class_(var3, "horse/".length());
            }

            if (var3.startsWith("textures/entity/") || var3.startsWith("textures/painting/")) {
               rrMb_1 var9 = private_.get(var3);
               if (var9 != null) {
                  return var9.class_(var0, var2);
               }

               return var0;
            }

            var4 = var0;
         } finally {
            final_ = false;
         }

         return var4;
      }
   }

   private static String class_(String var0, int var1) {
      if (new_ != null && continue_ != null) {
         for (int var2 = 0; var2 < continue_.length; var2++) {
            String var3 = continue_[var2];
            if (var0.startsWith(var3, var1)) {
               return new_[var2];
            }
         }

         return var0;
      } else {
         return var0;
      }
   }

   public static rrbD_2 class_() {
      if (finally_.break_ != null) {
         extends_.class_(finally_.break_);
         return extends_;
      } else {
         jz_3 var0 = native_;
         if (jz_3.catch_ != null) {
            var0 = native_;
            ryO_2 var1 = jz_3.catch_;
            if (var1.while_() != null) {
               volatile_.class_(var1);
               return volatile_;
            }
         }

         return null;
      }
   }

   private static rrMb_1 class_(rqO_2 var0, rqO_2 var1) {
      try {
         String var2 = var0.break_();
         class_(var1.break_() + ", properties: " + var2);
         InputStream var3 = rrbb_3.class_(var0);
         if (var3 == null) {
            break_("Properties not found: " + var2);
            return null;
         } else {
            rrzE_2 var4 = new rrzE_2();
            var4.load(var3);
            var3.close();
            rrMb_1 var5 = new rrMb_1(var4, var2, var1);
            return !var5.class_(var2) ? null : var5;
         }
      } catch (FileNotFoundException var6) {
         break_("File not found: " + var1.break_());
         return null;
      } catch (IOException var7) {
         var7.printStackTrace();
         return null;
      }
   }

   public static void break_(an_3 var0, rYB var1) {
      if (var0 instanceof rOh_1 var2) {
         class_(var2, true);
      }
   }

   public static void break_(String var0) {
      rrbb_3.protected_("RandomEntities: " + var0);
   }

   private static rrMb_1 break_(rqO_2 var0, boolean var1) {
      String var2 = var0.break_();
      rqO_2 var3 = byte_(var0, var1);
      if (var3 != null) {
         rrMb_1 var4 = class_(var3, var0);
         if (var4 != null) {
            return var4;
         }
      }

      rqO_2[] var5 = protected_(var0, var1);
      return var5 == null ? null : new rrMb_1(var2, var5);
   }

   public static void break_() {
      private_.clear();
      implements_ = false;
      if (rrbb_3.R()) {
         byte_();
      }
   }

   private static rqO_2[] protected_(rqO_2 var0, boolean var1) {
      ArrayList var2 = new ArrayList();
      var2.add(var0);
      rqO_2 var3 = class_(var0, var1);
      if (var3 == null) {
         return null;
      } else {
         for (int var4 = 1; var4 < var2.size() + 10; var4++) {
            int var5 = var4 + 1;
            rqO_2 var6 = class_(var3, var5);
            if (rrbb_3.byte_(var6)) {
               var2.add(var6);
            }
         }

         if (var2.size() <= 1) {
            return null;
         } else {
            rqO_2[] var7 = var2.toArray(new rqO_2[var2.size()]);
            class_(var0.break_() + ", variants: " + var7.length);
            return var7;
         }
      }
   }

   private static String protected_(String var0) {
      for (int var1 = 0; var1 < package_.length; var1++) {
         String var2 = package_[var1];
         if (var0.endsWith(var2)) {
            return rrzX_2.throws_(var0, var2);
         }
      }

      return null;
   }
}
