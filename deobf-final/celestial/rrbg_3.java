package celestial;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class rrbg_3 {
   private static rrbR_2 class_ = new rrbR_2();
   private static Map<String, Integer> break_ = new HashMap<>();
   private static Map<rdb_3, Integer> byte_ = new HashMap<>();
   private static long protected_ = 0L;
   private static final double throws_ = 7.5;
   private static final double case_ = 56.25;
   private static final int catch_ = 15;
   private static final int private_ = 15;
   private static final int implements_ = 10;
   private static final int finally_ = 8;
   private static final int extends_ = 13;
   private static final int native_ = 8;
   private static final int volatile_ = 8;
   private static final rut_3<rdn_3> final_ = (rut_3<rdn_3>)rrxr_3.SE.byte_();
   private static boolean package_;

   private static void byte_() {
      package_ = true;
      break_.clear();
      byte_.clear();
      if (break_.size() > 0) {
         rrbb_3.byte_("DynamicLights entities: " + break_.size());
      }
   }

   private static void byte_(yX_2 var0) {
      gm_3 var1 = var0.this_();
      if (var1 != null) {
         for (an_3 var3 : var1.byte_()) {
            int var4 = class_(var3);
            if (var4 > 0) {
               int var5 = var3.V();
               rrbV_2 var6 = class_.class_(var5);
               if (var6 == null) {
                  var6 = new rrbV_2(var3);
                  class_.class_(var5, var6);
               }
            } else {
               int var7 = var3.V();
               rrbV_2 var9 = class_.break_(var7);
               if (var9 != null) {
                  var9.break_(var0);
               }
            }
         }
      }
   }

   public static int class_(an_3 var0) {
      if (var0 == rrbb_3.X().catch_() && !rrbb_3.rn()) {
         return 0;
      } else {
         if (var0 instanceof rhd_3 var1 && var1.native_()) {
            return 0;
         }

         if (var0.Pz()) {
            return 15;
         } else {
            if (!break_.isEmpty()) {
               String var9 = rrMc_1.class_(var0);
               Integer var2 = break_.get(var9);
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
               return (double)var13.break_ > 0.6 ? 13 : 8;
            } else {
               if (var0 instanceof rEJ var10 && (double)var10.throw_(0.0F) > 0.001) {
                  return 15;
               }

               if (var0 instanceof iB_2 var12) {
                  rdn_3 var16 = var12.ss();
                  int var3 = class_(var16);
                  rdn_3 var4 = var12.Sn();
                  int var5 = class_(var4);
                  rdn_3 var6 = var12.class_(rXQ.HEAD);
                  int var7 = class_(var6);
                  int var8 = Math.max(var3, var5);
                  return Math.max(var8, var7);
               } else if (var0 instanceof rsE_2 var11) {
                  rdn_3 var15 = class_(var11);
                  return class_(var15);
               } else {
                  return 0;
               }
            }
         }
      }
   }

   public static int class_(rdn_3 var0) {
      if (var0 == null) {
         return 0;
      } else {
         rdb_3 var1 = var0.break_();
         if (var1 instanceof rxJ_2 var2) {
            xd_3 var3 = var2.catch_();
            if (var3 != null) {
               return var3.continue_().case_();
            }
         }

         if (var1 == rdy_3.hY) {
            return xu_3.instanceof_.continue_().case_();
         } else if (var1 == rdy_3.JZ || var1 == rdy_3.JH) {
            return 10;
         } else if (var1 == rdy_3.XW) {
            return 8;
         } else if (var1 == rdy_3.dn) {
            return 8;
         } else if (var1 == rdy_3.Jy) {
            return 8;
         } else if (var1 == rdy_3.dQ) {
            return xu_3.Sv.continue_().case_() / 2;
         } else {
            if (!byte_.isEmpty()) {
               Integer var4 = byte_.get(var1);
               if (var4 != null) {
                  return var4;
               }
            }

            return 0;
         }
      }
   }

   public static double class_(rfH_2 var0) {
      double var1 = 0.0;
      synchronized (class_) {
         List var4 = class_.byte_();
         int var5 = var4.size();

         for (int var6 = 0; var6 < var5; var6++) {
            rrbV_2 var7 = (rrbV_2)var4.get(var6);
            int var8 = var7.throws_();
            if (var8 > 0) {
               double var9 = var7.break_();
               double var11 = var7.byte_();
               double var13 = var7.protected_();
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

      return rrbb_3.class_(var1, 0.0, 15.0);
   }

   public static int class_(double var0, int var2) {
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

   public static void class_() {
      synchronized (class_) {
         class_.break_();
      }
   }

   public static rdn_3 class_(rsE_2 var0) {
      return var0.BQ().class_(final_);
   }

   public static int class_(an_3 var0, int var1) {
      double var2 = class_(var0.Bs());
      if (var0 == (cb_3)rrbb_3.X().class_[57]) {
         double var4 = (double)class_(var0);
         var2 = Math.max(var2, var4);
      }

      return class_(var2, var1);
   }

   public static void class_(yX_2 var0) {
      long var1 = System.currentTimeMillis();
      if (var1 >= protected_ + 50L) {
         protected_ = var1;
         if (!package_) {
            byte_();
         }

         synchronized (class_) {
            byte_(var0);
            if (class_.class_() > 0) {
               List var4 = class_.byte_();

               for (int var5 = 0; var5 < var4.size(); var5++) {
                  rrbV_2 var6 = (rrbV_2)var4.get(var5);
                  var6.class_(var0);
               }
            }
         }
      }
   }

   private static void class_(InputStream var0, String var1, String var2) {
      if (var0 != null) {
         try {
            rrzE_2 var3 = new rrzE_2();
            var3.load(var0);
            var0.close();
            rrbb_3.byte_("DynamicLights: Parsing " + var1);
            rrMz_1 var4 = new rrMz_1("DynamicLights");
            class_(var3.getProperty("entities"), break_, new rrMc_1(), var4, var1, var2);
            class_(var3.getProperty("items"), byte_, new rrML(), var4, var1, var2);
         } catch (IOException var5) {
            rrbb_3.protected_("DynamicLights: Error reading " + var1);
         }
      }
   }

   private static <T> void class_(String var0, Map<T, Integer> var1, rrMv_1<T> var2, rrMz_1 var3, String var4, String var5) {
      if (var0 != null) {
         String[] var6 = rrbb_3.class_(var0, " ");

         for (int var7 = 0; var7 < var6.length; var7++) {
            String var8 = var6[var7];
            String[] var9 = rrbb_3.class_(var8, ":");
            if (var9.length != 2) {
               var3.extends_("Invalid entry: " + var8 + ", in:" + var4);
            } else {
               String var10 = var9[0];
               String var11 = var9[1];
               String var12 = var5 + ":" + var10;
               rqO_2 var13 = new rqO_2(var12);
               Object var14 = var2.break_(var13);
               if (var14 == null) {
                  var3.extends_("Object not found: " + var12);
               } else {
                  int var15 = var3.class_(var11, -1);
                  if (var15 >= 0 && var15 <= 15) {
                     var1.put(var14, var15);
                  } else {
                     var3.extends_("Invalid light level: " + var8);
                  }
               }
            }
         }
      }
   }

   public static void class_(an_3 var0, yX_2 var1) {
   }

   public static int class_(rfH_2 var0, int var1) {
      double var2 = class_(var0);
      return class_(var2, var1);
   }

   public static void break_(yX_2 var0) {
      synchronized (class_) {
         List var2 = class_.byte_();

         for (int var3 = 0; var3 < var2.size(); var3++) {
            rrbV_2 var4 = (rrbV_2)var2.get(var3);
            var4.break_(var0);
         }

         class_.break_();
      }
   }

   public static int break_() {
      synchronized (class_) {
         return class_.class_();
      }
   }

   public static void break_(an_3 var0, yX_2 var1) {
      synchronized (class_) {
         rrbV_2 var3 = class_.break_(var0.V());
         if (var3 != null) {
            var3.break_(var1);
         }
      }
   }
}
