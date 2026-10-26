package celestial;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;

public class rrbY_2 {
   private static String class_ = null;
   private static String break_ = null;
   private static boolean byte_ = false;
   private static boolean protected_ = false;
   private static boolean throws_ = false;
   private static boolean case_ = false;
   private static final String catch_ = ".png";
   private static final rqO_2 private_ = rrzJ_2.while_;
   private static final rqO_2 implements_ = rrzJ_2.goto_;
   private static fY_2 finally_;
   private static int extends_ = 0;

   public static void byte_() {
      if (protected_) {
         extends_++;
      } else {
         protected_ = true;
         throws_ = false;
      }
   }

   public static void class_(fJ_2 var0, Set<rqO_2> var1) {
      if (byte_) {
         for (rqO_2 var3 : var1) {
            class_(var0, var3);
         }
      }
   }

   private static void class_(String var0) {
      rrbb_3.byte_("EmissiveTextures: " + var0);
   }

   private static void class_(fj_3 var0, fJ_2 var1) {
      if (var0.final_ != null) {
         fj_3 var2 = var1.protected_(var0.finally_());
         if (var2 != null) {
            fj_3 var3 = var1.protected_(var0.final_.finally_());
            if (var3 != null) {
               var3.package_ = true;
               var2.final_ = var3;
            }
         }
      }
   }

   public static void class_(fJ_2 var0) {
      for (fj_3 var2 : var0.implements_()) {
         class_(var2, var0);
      }
   }

   private static void class_(fJ_2 var0, rqO_2 var1) {
      String var2 = break_();
      if (var2 != null && !var1.break_().endsWith(var2)) {
         rqO_2 var3 = new rqO_2(var1.byte_(), var1.break_() + var2);
         rqO_2 var4 = var0.class_(var3);
         if (rrbb_3.byte_(var4)) {
            fj_3 var5 = var0.throws_(var1);
            fj_3 var6 = var0.throws_(var3);
            var6.package_ = true;
            var5.final_ = var6;
            var0.throws_(implements_);
         }
      }
   }

   public static boolean class_() {
      return byte_;
   }

   public static rqO_2 class_(rqO_2 var0) {
      if (!protected_) {
         return var0;
      } else {
         ff_3 var1 = finally_.break_(var0);
         if (var1 instanceof fJ_2) {
            return var0;
         } else {
            rqO_2 var2 = null;
            if (var1 instanceof fH_2) {
               var2 = ((fH_2)var1).protected_;
            }

            if (!case_) {
               if (var2 != null) {
                  throws_ = true;
               }

               return var0;
            } else {
               if (var2 == null) {
                  var2 = private_;
               }

               return var2;
            }
         }
      }
   }

   public static fj_3 class_(fj_3 var0) {
      if (!protected_) {
         return var0;
      } else {
         fj_3 var1 = var0.final_;
         if (!case_) {
            if (var1 != null) {
               throws_ = true;
            }

            return var0;
         } else {
            if (var1 == null) {
               var1 = var0.extends_().break_(implements_);
            }

            return var1;
         }
      }
   }

   public static wK_2 class_(wK_2 var0) {
      if (!protected_) {
         return var0;
      } else {
         wK_2 var1 = var0.int_();
         if (!case_) {
            if (var1 != null) {
               throws_ = true;
            }

            return var0;
         } else {
            return var1;
         }
      }
   }

   public static void class_(rqO_2 var0, fH_2 var1) {
      if (var0 != null && var1 != null) {
         var1.throws_ = false;
         var1.protected_ = null;
         if (break_ != null) {
            String var2 = var0.break_();
            if (var2.endsWith(".png")) {
               if (var2.endsWith(break_)) {
                  var1.throws_ = true;
               } else {
                  String var3 = var2.substring(0, var2.length() - ".png".length()) + break_;
                  rqO_2 var4 = new rqO_2(var0.byte_(), var3);
                  if (rrbb_3.byte_(var4)) {
                     var1.protected_ = var4;
                  }
               }
            }
         }
      }
   }

   private static void break_(String var0) {
      rrbb_3.protected_("EmissiveTextures: " + var0);
   }

   public static boolean break_(rqO_2 var0) {
      return break_ == null ? false : var0.break_().endsWith(break_);
   }

   public static String break_() {
      return class_;
   }

   public static void throws_() {
      case_ = true;
   }

   public static void catch_() {
      rrxn_3.break_();
      case_ = false;
   }

   public static boolean case_() {
      return case_;
   }

   public static void implements_() {
      finally_ = QY.instanceof_().A();
      byte_ = false;
      class_ = null;
      break_ = null;
      if (rrbb_3.rr()) {
         try {
            String var0 = "optifine/emissive.properties";
            rqO_2 var1 = new rqO_2(var0);
            InputStream var2 = rrbb_3.class_(var1);
            if (var2 == null) {
               return;
            }

            class_("Loading " + var0);
            rrzE_2 var3 = new rrzE_2();
            var3.load(var2);
            var2.close();
            class_ = var3.getProperty("suffix.emissive");
            if (class_ != null) {
               break_ = class_ + ".png";
            }

            byte_ = class_ != null;
         } catch (FileNotFoundException var4) {
            return;
         } catch (IOException var5) {
            var5.printStackTrace();
         }
      }
   }

   public static boolean protected_() {
      return extends_ > 0 ? false : throws_;
   }

   public static void private_() {
      if (extends_ > 0) {
         extends_--;
      } else {
         protected_ = false;
         throws_ = false;
      }
   }
}
