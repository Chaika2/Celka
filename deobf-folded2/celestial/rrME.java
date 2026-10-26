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
   private static Map<String, rrMb_1> id_private = new HashMap<>();
   private static boolean id_implements = false;
   private static yX_2 id_finally;
   private static rrMG id_extends = new rrMG();
   private static jz_3 id_native;
   private static rrMO id_volatile = new rrMO();
   private static boolean id_final = false;
   public static final String id_class = ".png";
   public static final String id_break = ".properties";
   public static final String id_byte = "textures/entity/";
   public static final String id_protected = "textures/painting/";
   public static final String id_throws = "textures/";
   public static final String id_case = "optifine/random/";
   public static final String id_catch = "optifine/mob/";
   private static final String[] id_package = new String[]{
      "_armor", "_eyes", "_exploding", "_shooting", "_fur", "_eyes", "_invulnerable", "_angry", "_tame", "_collar"
   };
   private static final String id_int = "horse/";
   private static final String[] id_new = (String[])rrxb_3.id_class(null, rOi_1.class, String[].class, 0);
   private static final String[] id_continue = (String[])rrxb_3.id_class(null, rOi_1.class, String[].class, 1);

   private static String id_byte(String var0) {
      if (var0.startsWith("optifine/random/")) {
         return rrzX_2.id_break(var0, "optifine/random/", "textures/");
      } else {
         return var0.startsWith("optifine/mob/") ? rrzX_2.id_break(var0, "optifine/mob/", "textures/entity/") : null;
      }
   }

   private static void id_byte() {
      id_finally = rrbb_3.z();
      id_native = jz_3.id_break;
      String[] var0 = new String[]{"optifine/random/", "optifine/mob/"};
      String[] var1 = new String[]{".png", ".properties"};
      String[] var2 = rrzM_2.id_class(var0, var1);
      HashSet var3 = new HashSet();

      for (int var4 = 0; var4 < var2.length; var4++) {
         String var5 = var2[var4];
         var5 = rrzX_2.id_byte(var5, var1);
         var5 = rrzX_2.id_finally(var5, "0123456789");
         var5 = var5 + ".png";
         String var6 = id_byte(var5);
         if (!var3.contains(var6)) {
            var3.add(var6);
            rqO_2 var7 = new rqO_2(var6);
            if (rrbb_3.id_byte(var7)) {
               rrMb_1 var8 = id_private.get(var6);
               if (var8 == null) {
                  var8 = id_break(var7, false);
                  if (var8 == null) {
                     var8 = id_break(var7, true);
                  }

                  if (var8 != null) {
                     id_private.put(var6, var8);
                  }
               }
            }
         }
      }

      id_implements = !id_private.isEmpty();
   }

   private static rqO_2 id_byte(rqO_2 var0, boolean var1) {
      rqO_2 var2 = id_class(var0, var1);
      if (var2 == null) {
         return null;
      } else {
         String var3 = var2.id_byte();
         String var4 = var2.id_break();
         String var5 = rrzX_2.id_throws(var4, ".png");
         String var6 = var5 + ".properties";
         rqO_2 var7 = new rqO_2(var3, var6);
         if (rrbb_3.id_byte(var7)) {
            return var7;
         } else {
            String var8 = id_protected(var5);
            if (var8 == null) {
               return null;
            } else {
               rqO_2 var9 = new rqO_2(var3, var8 + ".properties");
               return rrbb_3.id_byte(var9) ? var9 : null;
            }
         }
      }
   }

   public static void id_class(rYB var0, rYB var1) {
      if (var1 instanceof gm_3 var2) {
         for (an_3 var4 : var2.id_byte()) {
            id_class(var4, var1);
         }
      }

      id_extends.id_class((an_3)null);
      id_volatile.id_class((ryO_2)null);
   }

   protected static rqO_2 id_class(rqO_2 var0, boolean var1) {
      String var2 = var0.id_byte();
      String var3 = var0.id_break();
      String var4 = "textures/";
      String var5 = "optifine/random/";
      if (var1) {
         var4 = "textures/entity/";
         var5 = "optifine/mob/";
      }

      if (!var3.startsWith(var4)) {
         return null;
      } else {
         String var6 = rrzX_2.id_break(var3, var4, var5);
         return new rqO_2(var2, var6);
      }
   }

   private static void id_class(rOh_1 var0, boolean var1) {
      Object var2 = var0.sF();
      if (var2 == null) {
         var2 = (cb_3)rrbb_3.X().id_class[57];
      }

      if (var2 instanceof cG_2 var3) {
         UUID var4 = var0.ro();
         if (var1) {
            rcd_3 var5 = var3.sQ();
            if (var5 != null && var5.id_throws("UUID") && rrbb_3.id_class(var5.id_class("UUID"), var4)) {
               var3.id_class[9] = var0;
            }

            rcd_3 var6 = var3.sJ();
            if (var6 != null && var6.id_throws("UUID") && rrbb_3.id_class(var6.id_class("UUID"), var4)) {
               var3.id_class[10] = var0;
            }
         } else {
            rmE_2 var15 = var0.BQ();
            if ((rOh_1)var3.id_class[9] != null && rrbb_3.id_class(((rOh_1)var3.id_class[9]).ro(), var4)) {
               rmE_2 var16 = ((rOh_1)var3.id_class[9]).BQ();
               var15.id_break = var16.id_break;
               var15.id_class = var16.id_class;
               Object var13 = null;
               var3.id_class[9] = var13;
            }

            if ((rOh_1)var3.id_class[10] != null && rrbb_3.id_class(((rOh_1)var3.id_class[10]).ro(), var4)) {
               rmE_2 var17 = ((rOh_1)var3.id_class[10]).BQ();
               var15.id_break = var17.id_break;
               var15.id_class = var17.id_class;
               Object var14 = null;
               var3.id_class[10] = var14;
            }
         }
      }
   }

   protected static rqO_2 id_class(rqO_2 var0, int var1) {
      if (var0 == null) {
         return null;
      } else {
         String var2 = var0.id_break();
         int var3 = var2.lastIndexOf(46);
         if (var3 < 0) {
            return null;
         } else {
            String var4 = var2.substring(0, var3);
            String var5 = var2.substring(var3);
            String var6 = var4 + var1 + var5;
            return new rqO_2(var0.id_byte(), var6);
         }
      }
   }

   public static void id_class(an_3 var0, rYB var1) {
      if (var1 != null) {
         rmE_2 var2 = var0.BQ();
         var2.id_break = var0.Bs();
         var2.id_class = var1.id_implements(var2.id_break);
         if (var0 instanceof rOh_1 var3) {
            id_class(var3, false);
         }
      }
   }

   public static void id_class(String var0) {
      rrbb_3.id_byte("RandomEntities: " + var0);
   }

   public static rqO_2 id_class(rqO_2 var0) {
      if (!id_implements) {
         return var0;
      } else if (id_final) {
         return var0;
      } else {
         rqO_2 var4;
         try {
            id_final = true;
            rrbD_2 var2 = id_class();
            if (var2 == null) {
               return var0;
            }

            String var3 = var0.id_break();
            if (var3.startsWith("horse/")) {
               var3 = id_class(var3, "horse/".length());
            }

            if (var3.startsWith("textures/entity/") || var3.startsWith("textures/painting/")) {
               rrMb_1 var9 = id_private.get(var3);
               if (var9 != null) {
                  return var9.id_class(var0, var2);
               }

               return var0;
            }

            var4 = var0;
         } finally {
            id_final = false;
         }

         return var4;
      }
   }

   private static String id_class(String var0, int var1) {
      if (id_new != null && id_continue != null) {
         for (int var2 = 0; var2 < id_continue.length; var2++) {
            String var3 = id_continue[var2];
            if (var0.startsWith(var3, var1)) {
               return id_new[var2];
            }
         }

         return var0;
      } else {
         return var0;
      }
   }

   public static rrbD_2 id_class() {
      if (id_finally.id_break != null) {
         id_extends.id_class(id_finally.id_break);
         return id_extends;
      } else {
         jz_3 var0 = id_native;
         if (jz_3.id_catch != null) {
            var0 = id_native;
            ryO_2 var1 = jz_3.id_catch;
            if (var1.id_while() != null) {
               id_volatile.id_class(var1);
               return id_volatile;
            }
         }

         return null;
      }
   }

   private static rrMb_1 id_class(rqO_2 var0, rqO_2 var1) {
      try {
         String var2 = var0.id_break();
         id_class(var1.id_break() + ", properties: " + var2);
         InputStream var3 = rrbb_3.id_class(var0);
         if (var3 == null) {
            id_break("Properties not found: " + var2);
            return null;
         } else {
            rrzE_2 var4 = new rrzE_2();
            var4.load(var3);
            var3.close();
            rrMb_1 var5 = new rrMb_1(var4, var2, var1);
            return !var5.id_class(var2) ? null : var5;
         }
      } catch (FileNotFoundException var6) {
         id_break("File not found: " + var1.id_break());
         return null;
      } catch (IOException var7) {
         var7.printStackTrace();
         return null;
      }
   }

   public static void id_break(an_3 var0, rYB var1) {
      if (var0 instanceof rOh_1 var2) {
         id_class(var2, true);
      }
   }

   public static void id_break(String var0) {
      rrbb_3.id_protected("RandomEntities: " + var0);
   }

   private static rrMb_1 id_break(rqO_2 var0, boolean var1) {
      String var2 = var0.id_break();
      rqO_2 var3 = id_byte(var0, var1);
      if (var3 != null) {
         rrMb_1 var4 = id_class(var3, var0);
         if (var4 != null) {
            return var4;
         }
      }

      rqO_2[] var5 = id_protected(var0, var1);
      return var5 == null ? null : new rrMb_1(var2, var5);
   }

   public static void id_break() {
      id_private.clear();
      id_implements = false;
      if (rrbb_3.R()) {
         id_byte();
      }
   }

   private static rqO_2[] id_protected(rqO_2 var0, boolean var1) {
      ArrayList var2 = new ArrayList();
      var2.add(var0);
      rqO_2 var3 = id_class(var0, var1);
      if (var3 == null) {
         return null;
      } else {
         for (int var4 = 1; var4 < var2.size() + 10; var4++) {
            int var5 = var4 + 1;
            rqO_2 var6 = id_class(var3, var5);
            if (rrbb_3.id_byte(var6)) {
               var2.add(var6);
            }
         }

         if (var2.size() <= 1) {
            return null;
         } else {
            rqO_2[] var7 = var2.toArray(new rqO_2[var2.size()]);
            id_class(var0.id_break() + ", variants: " + var7.length);
            return var7;
         }
      }
   }

   private static String id_protected(String var0) {
      for (int var1 = 0; var1 < id_package.length; var1++) {
         String var2 = id_package[var1];
         if (var0.endsWith(var2)) {
            return rrzX_2.id_throws(var0, var2);
         }
      }

      return null;
   }
}
