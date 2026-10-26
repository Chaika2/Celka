package celestial;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class rrbg_3 {
   private static rrbR_2 id_class = new rrbR_2();
   private static Map<String, Integer> id_break = new HashMap<>();
   private static Map<rdb_3, Integer> id_byte = new HashMap<>();
   private static long id_protected = 0L;
   private static final double id_throws = 7.5;
   private static final double id_case = 56.25;
   private static final int id_catch = 15;
   private static final int id_private = 15;
   private static final int id_implements = 10;
   private static final int id_finally = 8;
   private static final int id_extends = 13;
   private static final int id_native = 8;
   private static final int id_volatile = 8;
   private static final rut_3<rdn_3> id_final = (rut_3<rdn_3>)rrxr_3.SE.id_byte();
   private static boolean id_package;

   private static void id_byte() {
      id_package = true;
      id_break.clear();
      id_byte.clear();
      if (id_break.size() > 0) {
         rrbb_3.id_byte("DynamicLights entities: " + id_break.size());
      }
   }

   private static void id_byte(yX_2 var0) {
      gm_3 var1 = var0.id_this();
      if (var1 != null) {
         for (an_3 var3 : var1.id_byte()) {
            int var4 = id_class(var3);
            if (var4 > 0) {
               int var5 = var3.V();
               rrbV_2 var6 = id_class.id_class(var5);
               if (var6 == null) {
                  var6 = new rrbV_2(var3);
                  id_class.id_class(var5, var6);
               }
            } else {
               int var7 = var3.V();
               rrbV_2 var9 = id_class.id_break(var7);
               if (var9 != null) {
                  var9.id_break(var0);
               }
            }
         }
      }
   }

   public static int id_class(an_3 var0) {
      if (var0 == rrbb_3.X().id_catch() && !rrbb_3.rn()) {
         return 0;
      } else {
         if (var0 instanceof rhd_3 var1 && var1.id_native()) {
            return 0;
         }

         if (var0.Pz()) {
            return 15;
         } else {
            if (!id_break.isEmpty()) {
               String var9 = rrMc_1.id_class(var0);
               Integer var2 = id_break.get(var9);
               if (var2 != null) {
                  return var2;
               }
            }

            if (var0 instanceof rhL_2) {
               return 15;
            } else if (var0 instanceof rsX_2) {
               return 15;
            } else if (var0 instanceof rEO var14) {
               return var14.Pz() ? 15 : 10;
            } else if (var0 instanceof rEa_1 var13) {
               return (double)var13.id_break > 0.6 ? 13 : 8;
            } else {
               if (var0 instanceof rEJ var10 && (double)var10.id_throw(0.0F) > 0.001) {
                  return 15;
               }

               if (var0 instanceof iB_2 var12) {
                  rdn_3 var16 = var12.ss();
                  int var3 = id_class(var16);
                  rdn_3 var4 = var12.Sn();
                  int var5 = id_class(var4);
                  rdn_3 var6 = var12.id_class(rXQ.HEAD);
                  int var7 = id_class(var6);
                  int var8 = Math.max(var3, var5);
                  return Math.max(var8, var7);
               } else if (var0 instanceof rsE_2 var11) {
                  rdn_3 var15 = id_class(var11);
                  return id_class(var15);
               } else {
                  return 0;
               }
            }
         }
      }
   }

   public static int id_class(rdn_3 var0) {
      if (var0 == null) {
         return 0;
      } else {
         rdb_3 var1 = var0.id_break();
         if (var1 instanceof rxJ_2 var2) {
            xd_3 var3 = var2.id_catch();
            if (var3 != null) {
               return var3.id_continue().id_case();
            }
         }

         if (var1 == rdy_3.hY) {
            return xu_3.id_instanceof.id_continue().id_case();
         } else if (var1 == rdy_3.JZ || var1 == rdy_3.JH) {
            return 10;
         } else if (var1 == rdy_3.XW) {
            return 8;
         } else if (var1 == rdy_3.dn) {
            return 8;
         } else if (var1 == rdy_3.Jy) {
            return 8;
         } else if (var1 == rdy_3.dQ) {
            return xu_3.Sv.id_continue().id_case() / 2;
         } else {
            if (!id_byte.isEmpty()) {
               Integer var4 = id_byte.get(var1);
               if (var4 != null) {
                  return var4;
               }
            }

            return 0;
         }
      }
   }

   public static double id_class(rfH_2 var0) {
      double var1 = 0.0;
      synchronized (id_class) {
         List var4 = id_class.id_byte();
         int var5 = var4.size();

         for (int var6 = 0; var6 < var5; var6++) {
            rrbV_2 var7 = (rrbV_2)var4.get(var6);
            int var8 = var7.id_throws();
            if (var8 > 0) {
               double var9 = var7.id_break();
               double var11 = var7.id_byte();
               double var13 = var7.id_protected();
               double var15 = (double)var0.b_() - var9;
               double var17 = (double)var0.c_() - var11;
               double var19 = (double)var0.d_() - var13;
               double var21 = var15 * var15 + var17 * var17 + var19 * var19;
               if (!(var21 > 56.25)) {
                  double var23 = Math.sqrt(var21);
                  double var25 = 1.0 - var23 / 7.5;
                  double var27 = var25 * (double)var8;
                  if (var27 > var1) {
                     var1 = var27;
                  }
               }
            }
         }
      }

      return rrbb_3.id_class(var1, 0.0, 15.0);
   }

   public static int id_class(double var0, int var2) {
      if (var0 > 0.0) {
         int var3 = (int)(var0 * 16.0);
         int var4 = var2 & 0xFF;
         if (var3 > var4) {
            var2 &= -256;
            var2 |= var3;
         }
      }

      return var2;
   }

   public static void id_class() {
      synchronized (id_class) {
         id_class.id_break();
      }
   }

   public static rdn_3 id_class(rsE_2 var0) {
      return var0.BQ().id_class(id_final);
   }

   public static int id_class(an_3 var0, int var1) {
      double var2 = id_class(var0.Bs());
      if (var0 == (cb_3)rrbb_3.X().id_class[57]) {
         double var4 = (double)id_class(var0);
         var2 = Math.max(var2, var4);
      }

      return id_class(var2, var1);
   }

   public static void id_class(yX_2 var0) {
      long var1 = System.currentTimeMillis();
      if (var1 >= id_protected + 50L) {
         id_protected = var1;
         if (!id_package) {
            id_byte();
         }

         synchronized (id_class) {
            id_byte(var0);
            if (id_class.id_class() > 0) {
               List var4 = id_class.id_byte();

               for (int var5 = 0; var5 < var4.size(); var5++) {
                  rrbV_2 var6 = (rrbV_2)var4.get(var5);
                  var6.id_class(var0);
               }
            }
         }
      }
   }

   private static void id_class(InputStream var0, String var1, String var2) {
      if (var0 != null) {
         try {
            rrzE_2 var3 = new rrzE_2();
            var3.load(var0);
            var0.close();
            rrbb_3.id_byte("DynamicLights: Parsing " + var1);
            rrMz_1 var4 = new rrMz_1("DynamicLights");
            id_class(var3.getProperty("entities"), id_break, new rrMc_1(), var4, var1, var2);
            id_class(var3.getProperty("items"), id_byte, new rrML(), var4, var1, var2);
         } catch (IOException var5) {
            rrbb_3.id_protected("DynamicLights: Error reading " + var1);
         }
      }
   }

   private static <T> void id_class(String var0, Map<T, Integer> var1, rrMv_1<T> var2, rrMz_1 var3, String var4, String var5) {
      if (var0 != null) {
         String[] var6 = rrbb_3.id_class(var0, " ");

         for (int var7 = 0; var7 < var6.length; var7++) {
            String var8 = var6[var7];
            String[] var9 = rrbb_3.id_class(var8, ":");
            if (var9.length != 2) {
               var3.id_extends("Invalid entry: " + var8 + ", in:" + var4);
            } else {
               String var10 = var9[0];
               String var11 = var9[1];
               String var12 = var5 + ":" + var10;
               rqO_2 var13 = new rqO_2(var12);
               Object var14 = var2.id_break(var13);
               if (var14 == null) {
                  var3.id_extends("Object not found: " + var12);
               } else {
                  int var15 = var3.id_class(var11, -1);
                  if (var15 >= 0 && var15 <= 15) {
                     var1.put(var14, var15);
                  } else {
                     var3.id_extends("Invalid light level: " + var8);
                  }
               }
            }
         }
      }
   }

   public static void id_class(an_3 var0, yX_2 var1) {
   }

   public static int id_class(rfH_2 var0, int var1) {
      double var2 = id_class(var0);
      return id_class(var2, var1);
   }

   public static void id_break(yX_2 var0) {
      synchronized (id_class) {
         List var2 = id_class.id_byte();

         for (int var3 = 0; var3 < var2.size(); var3++) {
            rrbV_2 var4 = (rrbV_2)var2.get(var3);
            var4.id_break(var0);
         }

         id_class.id_break();
      }
   }

   public static int id_break() {
      synchronized (id_class) {
         return id_class.id_class();
      }
   }

   public static void id_break(an_3 var0, yX_2 var1) {
      synchronized (id_class) {
         rrbV_2 var3 = id_class.id_break(var0.V());
         if (var3 != null) {
            var3.id_break(var1);
         }
      }
   }
}
