package celestial;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;

public class rrbY_2 {
   private static String id_class = null;
   private static String id_break = null;
   private static boolean id_byte = false;
   private static boolean id_protected = false;
   private static boolean id_throws = false;
   private static boolean id_case = false;
   private static final String id_catch = ".png";
   private static final rqO_2 id_private = rrzJ_2.id_while;
   private static final rqO_2 id_implements = rrzJ_2.id_goto;
   private static fY_2 id_finally;
   private static int id_extends = 0;

   public static void id_byte() {
      if (id_protected) {
         id_extends++;
      } else {
         id_protected = true;
         id_throws = false;
      }
   }

   public static void id_class(fJ_2 var0, Set<rqO_2> var1) {
      if (id_byte) {
         for (rqO_2 var3 : var1) {
            id_class(var0, var3);
         }
      }
   }

   private static void id_class(String var0) {
      rrbb_3.id_byte("EmissiveTextures: " + var0);
   }

   private static void id_class(fj_3 var0, fJ_2 var1) {
      if (var0.id_final != null) {
         fj_3 var2 = var1.id_protected(var0.id_finally());
         if (var2 != null) {
            fj_3 var3 = var1.id_protected(var0.id_final.id_finally());
            if (var3 != null) {
               var3.id_package = true;
               var2.id_final = var3;
            }
         }
      }
   }

   public static void id_class(fJ_2 var0) {
      for (fj_3 var2 : var0.id_implements()) {
         id_class(var2, var0);
      }
   }

   private static void id_class(fJ_2 var0, rqO_2 var1) {
      String var2 = id_break();
      if (var2 != null && !var1.id_break().endsWith(var2)) {
         rqO_2 var3 = new rqO_2(var1.id_byte(), var1.id_break() + var2);
         rqO_2 var4 = var0.id_class(var3);
         if (rrbb_3.id_byte(var4)) {
            fj_3 var5 = var0.id_throws(var1);
            fj_3 var6 = var0.id_throws(var3);
            var6.id_package = true;
            var5.id_final = var6;
            var0.id_throws(id_implements);
         }
      }
   }

   public static boolean id_class() {
      return id_byte;
   }

   public static rqO_2 id_class(rqO_2 var0) {
      if (!id_protected) {
         return var0;
      } else {
         ff_3 var1 = id_finally.id_break(var0);
         if (var1 instanceof fJ_2) {
            return var0;
         } else {
            rqO_2 var2 = null;
            if (var1 instanceof fH_2) {
               var2 = ((fH_2)var1).id_protected;
            }

            if (!id_case) {
               if (var2 != null) {
                  id_throws = true;
               }

               return var0;
            } else {
               if (var2 == null) {
                  var2 = id_private;
               }

               return var2;
            }
         }
      }
   }

   public static fj_3 id_class(fj_3 var0) {
      if (!id_protected) {
         return var0;
      } else {
         fj_3 var1 = var0.id_final;
         if (!id_case) {
            if (var1 != null) {
               id_throws = true;
            }

            return var0;
         } else {
            if (var1 == null) {
               var1 = var0.id_extends().id_break(id_implements);
            }

            return var1;
         }
      }
   }

   public static wK_2 id_class(wK_2 var0) {
      if (!id_protected) {
         return var0;
      } else {
         wK_2 var1 = var0.id_int();
         if (!id_case) {
            if (var1 != null) {
               id_throws = true;
            }

            return var0;
         } else {
            return var1;
         }
      }
   }

   public static void id_class(rqO_2 var0, fH_2 var1) {
      if (var0 != null && var1 != null) {
         var1.id_throws = false;
         var1.id_protected = null;
         if (id_break != null) {
            String var2 = var0.id_break();
            if (var2.endsWith(".png")) {
               if (var2.endsWith(id_break)) {
                  var1.id_throws = true;
               } else {
                  String var3 = var2.substring(0, var2.length() - ".png".length()) + id_break;
                  rqO_2 var4 = new rqO_2(var0.id_byte(), var3);
                  if (rrbb_3.id_byte(var4)) {
                     var1.id_protected = var4;
                  }
               }
            }
         }
      }
   }

   private static void id_break(String var0) {
      rrbb_3.id_protected("EmissiveTextures: " + var0);
   }

   public static boolean id_break(rqO_2 var0) {
      return id_break == null ? false : var0.id_break().endsWith(id_break);
   }

   public static String id_break() {
      return id_class;
   }

   public static void id_throws() {
      id_case = true;
   }

   public static void id_catch() {
      rrxn_3.id_break();
      id_case = false;
   }

   public static boolean id_case() {
      return id_case;
   }

   public static void id_implements() {
      id_finally = QY.id_instanceof().A();
      id_byte = false;
      id_class = null;
      id_break = null;
      if (rrbb_3.rr()) {
         try {
            String var0 = "optifine/emissive.properties";
            rqO_2 var1 = new rqO_2(var0);
            InputStream var2 = rrbb_3.id_class(var1);
            if (var2 == null) {
               return;
            }

            id_class("Loading " + var0);
            rrzE_2 var3 = new rrzE_2();
            var3.load(var2);
            var2.close();
            id_class = var3.getProperty("suffix.emissive");
            if (id_class != null) {
               id_break = id_class + ".png";
            }

            id_byte = id_class != null;
         } catch (FileNotFoundException var4) {
            return;
         } catch (IOException var5) {
            var5.printStackTrace();
         }
      }
   }

   public static boolean id_protected() {
      return id_extends > 0 ? false : id_throws;
   }

   public static void id_private() {
      if (id_extends > 0) {
         id_extends--;
      } else {
         id_protected = false;
         id_throws = false;
      }
   }
}
