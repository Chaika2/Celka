package celestial;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class rrby_3 {
   private static rrbH_2[][] id_finally = (rrbH_2[][])null;
   private static rrbH_2[][] id_extends = (rrbH_2[][])null;
   private static Map id_native = null;
   private static IN id_volatile = new IN();
   private static boolean id_final = true;
   private static boolean id_package = false;
   public static final int id_class = 16384;
   public static final int id_break = 63;
   public static final int id_byte = 64;
   public static final String id_protected = "texture.potion_overlay";
   public static final String id_throws = "texture.potion_bottle_splash";
   public static final String id_case = "texture.potion_bottle_drinkable";
   public static final String id_catch = "item/potion_overlay";
   public static final String id_private = "item/potion_bottle_splash";
   public static final String id_implements = "item/potion_bottle_drinkable";
   private static final int[][] id_int = new int[0][];
   private static final Map<String, Integer> id_new = id_private();
   private static final String id_continue = "normal";
   private static final String id_super = "splash";
   private static final String id_this = "linger";

   private static int[][] id_byte(rdn_3 var0) {
      rdb_3 var1 = var0.id_break();
      rcy_3 var2;
      if (var1 == rdy_3.dm) {
         rxy_3 var3 = (rxy_3)rdy_3.dm;
         var2 = rxy_3.id_protected(var0);
      } else {
         var2 = var0.id_new();
      }

      rcy_3 var11 = var2;
      if (var2 != null && var2.size() > 0) {
         int[][] var4 = new int[var2.size()][2];

         for (int var5 = 0; var5 < var11.size(); var5++) {
            rcd_3 var6 = var11.id_class(var5);
            String var7 = var6.id_native("id");
            int var8 = var6.id_private("lvl");
            ev_3 var9 = rrWN.id_class(var7);
            if (var9 != null) {
               int var10 = rVL.id_boolean.id_class(var9);
               var4[var5][0] = var10;
               var4[var5][1] = var8;
            }
         }

         return var4;
      } else {
         return id_int;
      }
   }

   public static boolean id_byte() {
      return id_final;
   }

   public static IJ id_class(rdn_3 var0, IJ var1, rqO_2 var2, boolean var3) {
      if (!var3 && var1.id_break()) {
         return var1;
      } else if (id_finally == null) {
         return var1;
      } else {
         rrbH_2 var4 = id_class(var0, 1);
         if (var4 == null) {
            return var1;
         } else {
            IJ var5 = var4.id_class(var2, var3);
            return var5 != null ? var5 : var1;
         }
      }
   }

   public static rqO_2 id_class(rdn_3 var0, rXQ var1, String var2, rqO_2 var3) {
      if (id_finally == null) {
         return var3;
      } else {
         rqO_2 var4 = id_class(var0, var1, var2);
         return var4 == null ? var3 : var4;
      }
   }

   private static rqO_2 id_class(rdn_3 var0, rXQ var1, String var2) {
      rrbH_2 var3 = id_class(var0, 3);
      if (var3 == null) {
         return null;
      } else if (var3.id_public == null) {
         return var3.id_return;
      } else if (!(var0.id_break() instanceof rxS_2 var5)) {
         return null;
      } else {
         String var6 = var5.id_throws().id_protected();
         int var7 = var1 == rXQ.LEGS ? 2 : 1;
         StringBuffer var8 = new StringBuffer();
         var8.append("texture.");
         var8.append(var6);
         var8.append("_layer_");
         var8.append(var7);
         if (var2 != null) {
            var8.append("_");
            var8.append(var2);
         }

         String var9 = var8.toString();
         rqO_2 var10 = (rqO_2)var3.id_public.get(var9);
         return var10 == null ? var3.id_return : var10;
      }
   }

   public static rqO_2 id_class(rdn_3 var0, rqO_2 var1) {
      if (id_finally == null) {
         return var1;
      } else {
         rrbH_2 var2 = id_class(var0, 4);
         if (var2 == null) {
            return var1;
         } else {
            return var2.id_return == null ? var1 : var2.id_return;
         }
      }
   }

   private static rrbH_2[][] id_class(List var0) {
      rrbH_2[][] var1 = new rrbH_2[var0.size()][];

      for (int var2 = 0; var2 < var0.size(); var2++) {
         List var3 = (List)var0.get(var2);
         if (var3 != null) {
            rrbH_2[] var4 = var3.toArray(new rrbH_2[var3.size()]);
            Arrays.sort(var4, new rrbq_3());
            var1[var2] = var4;
         }
      }

      return var1;
   }

   private static void id_class(rAC var0) {
      String[] var1 = rrzM_2.id_class(var0, "optifine/cit/", ".properties", (String[])null);
      Map var2 = id_break(var0);
      if (var2.size() > 0) {
         Set var3 = var2.keySet();
         String[] var4 = var3.toArray(new String[var3.size()]);
         var1 = (String[])rrbb_3.id_class((Object[])var1, (Object[])var4);
      }

      Arrays.sort(var1);
      List var13 = id_class(id_finally);
      List var14 = id_class(id_extends);

      for (int var5 = 0; var5 < var1.length; var5++) {
         String var6 = var1[var5];
         rrbb_3.id_byte("CustomItems: " + var6);

         try {
            rrbH_2 var7 = null;
            if (var2.containsKey(var6)) {
               var7 = (rrbH_2)var2.get(var6);
            }

            if (var7 == null) {
               rqO_2 var8 = new rqO_2(var6);
               InputStream var9 = var0.id_class(rAI.CLIENT_RESOURCES, var8);
               if (var9 == null) {
                  rrbb_3.id_protected("CustomItems file not found: " + var6);
                  continue;
               }

               rrzE_2 var10 = new rrzE_2();
               var10.load(var9);
               var9.close();
               var7 = new rrbH_2(var10, var6);
            }

            if (var7.id_class(var6)) {
               id_class(var7, var13);
               id_break(var7, var14);
            }
         } catch (FileNotFoundException var11) {
            rrbb_3.id_protected("CustomItems file not found: " + var6);
         } catch (Exception var12) {
            var12.printStackTrace();
         }
      }

      id_finally = id_class(var13);
      id_extends = id_class(var14);
      Comparator var15 = id_protected();

      for (int var16 = 0; var16 < id_finally.length; var16++) {
         rrbH_2[] var18 = id_finally[var16];
         if (var18 != null) {
            Arrays.sort(var18, var15);
         }
      }

      for (int var17 = 0; var17 < id_extends.length; var17++) {
         rrbH_2[] var19 = id_extends[var17];
         if (var19 != null) {
            Arrays.sort(var19, var15);
         }
      }
   }

   public static void id_class() {
      id_finally = (rrbH_2[][])null;
      id_extends = (rrbH_2[][])null;
      id_final = true;
      if (rrbb_3.rd()) {
         id_class("optifine/cit.properties");
         rAC[] var0 = rrbb_3.d();

         for (int var1 = var0.length - 1; var1 >= 0; var1--) {
            rAC var2 = var0[var1];
            id_class(var2);
         }

         id_class(rrbb_3.W());
         if (id_finally.length <= 0) {
            id_finally = (rrbH_2[][])null;
         }

         if (id_extends.length <= 0) {
            id_extends = (rrbH_2[][])null;
         }
      }
   }

   private static void id_class(rrbH_2 var0, List<List<rrbH_2>> var1, int var2) {
      while (var2 >= var1.size()) {
         var1.add((List)null);
      }

      Object var3 = (List)var1.get(var2);
      if (var3 == null) {
         var3 = new ArrayList();
         var1.set(var2, var3);
      }

      var3.add(var0);
   }

   public static boolean id_class(iB_2 var0, rdn_3 var1, tp_3 var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9) {
      rrbH_2[][] var10 = id_extends;
      if (var10 == null) {
         return false;
      } else if (rrbb_3.rs() && rrdZ.id_new) {
         return false;
      } else if (var1 == null) {
         return false;
      } else {
         int[][] var11 = id_byte(var1);
         if (var11.length <= 0) {
            return false;
         } else {
            HashSet var12 = null;
            boolean var13 = false;
            fY_2 var14 = rrbb_3.J();

            for (int var15 = 0; var15 < var11.length; var15++) {
               int var16 = var11[var15][0];
               if (var16 >= 0 && var16 < var10.length) {
                  rrbH_2[] var17 = var10[var16];
                  if (var17 != null) {
                     for (int var18 = 0; var18 < var17.length; var18++) {
                        rrbH_2 var19 = var17[var18];
                        if (var12 == null) {
                           var12 = new HashSet();
                        }

                        if (var12.add(var16) && id_class(var19, var1, var11) && var19.id_return != null) {
                           var14.id_class(var19.id_return);
                           float var20 = var19.id_class(var14);
                           if (!var13) {
                              var13 = true;
                              if (rrbb_3.rs()) {
                                 rrdL.id_else();
                              }

                              MT.id_package();
                              MT.id_break(514);
                              MT.id_class(false);
                           }

                           rrxh_3.id_class(var19.id_new, 1.0F);
                           MT.id_catch();
                           MT.id_return(5890);
                           MT.id_boolean();
                           MT.id_byte(var19.id_super, 0.0F, 0.0F, 1.0F);
                           float var21 = var20 / 8.0F;
                           MT.id_break(var21, var21 / 2.0F, var21);
                           float var22 = var19.id_continue * (float)(rqR_2.id_break() % 3000L) / 3000.0F / 8.0F;
                           MT.id_byte(0.0F, var22, 0.0F);
                           MT.id_return(5888);
                        }
                     }
                  }
               }
            }

            if (var13) {
               MT.id_throws();
               MT.id_package();
               MT.id_break(770, 771);
               MT.id_protected(1.0F, 1.0F, 1.0F, 1.0F);
               MT.id_return(5890);
               MT.id_boolean();
               MT.id_return(5888);
               MT.id_case();
               MT.id_class(true);
               MT.id_break(515);
               MT.id_final();
               if (rrbb_3.rs()) {
                  rrdL.id_synchronized();
               }
            }

            return var13;
         }
      }
   }

   private static void id_class(String var0, int var1, boolean var2, Map<String, Integer> var3) {
      if (var2) {
         var1 |= 8192;
      }

      var3.put("minecraft:" + var0, var1);
      if (var2) {
         int var4 = var1 | 32;
         var3.put("minecraft:strong_" + var0, var4);
         int var5 = var1 | 64;
         var3.put("minecraft:long_" + var0, var5);
      }
   }

   private static void id_class(String var0) {
      try {
         rqO_2 var1 = new rqO_2(var0);
         InputStream var2 = rrbb_3.id_class(var1);
         if (var2 == null) {
            return;
         }

         rrbb_3.id_byte("CustomItems: Loading " + var0);
         rrzE_2 var3 = new rrzE_2();
         var3.load(var2);
         var2.close();
         id_final = rrbb_3.id_class(var3.getProperty("useGlint"), true);
      } catch (FileNotFoundException var4) {
         return;
      } catch (IOException var5) {
         var5.printStackTrace();
      }
   }

   public static boolean id_class(Hz_1 var0, rdn_3 var1, IJ var2) {
      rrbH_2[][] var3 = id_extends;
      if (var3 == null) {
         return false;
      } else if (var1 == null) {
         return false;
      } else {
         int[][] var4 = id_byte(var1);
         if (var4.length <= 0) {
            return false;
         } else {
            HashSet var5 = null;
            boolean var6 = false;
            fY_2 var7 = rrbb_3.J();

            for (int var8 = 0; var8 < var4.length; var8++) {
               int var9 = var4[var8][0];
               if (var9 >= 0 && var9 < var3.length) {
                  rrbH_2[] var10 = var3[var9];
                  if (var10 != null) {
                     for (int var11 = 0; var11 < var10.length; var11++) {
                        rrbH_2 var12 = var10[var11];
                        if (var5 == null) {
                           var5 = new HashSet();
                        }

                        if (var5.add(var9) && id_class(var12, var1, var4) && var12.id_return != null) {
                           var7.id_class(var12.id_return);
                           float var13 = var12.id_class(var7);
                           if (!var6) {
                              var6 = true;
                              MT.id_class(false);
                              MT.id_break(514);
                              MT.id_catch();
                              MT.id_return(5890);
                           }

                           rrxh_3.id_class(var12.id_new, 1.0F);
                           MT.id_transient();
                           MT.id_break(var13, var13, var13);
                           float var14 = var12.id_continue * (float)(rqR_2.id_break() % 3000L) / 3000.0F / 8.0F;
                           MT.id_byte(var14, 0.0F, 0.0F);
                           MT.id_byte(var12.id_super, 0.0F, 0.0F, 1.0F);
                           MT.id_for();
                        }
                     }
                  }
               }
            }

            if (var6) {
               MT.id_throws();
               MT.id_package();
               MT.id_break(770, 771);
               MT.id_protected(1.0F, 1.0F, 1.0F, 1.0F);
               MT.id_return(5888);
               MT.id_case();
               MT.id_break(515);
               MT.id_class(true);
               var7.id_class(fJ_2.id_class);
            }

            return var6;
         }
      }
   }

   private static int id_class(rdn_3 var0) {
      rdb_3 var1 = var0.id_break();
      return var1 instanceof rdU_2 ? id_break(var0) : var0.id_catch();
   }

   private static boolean id_class(rrbH_2 var0, rdn_3 var1, int[][] var2) {
      rdb_3 var3 = var1.id_break();
      if (var0.id_implements != null) {
         int var4 = id_class(var1);
         if (var4 < 0) {
            return false;
         }

         if (var0.id_extends != 0) {
            var4 &= var0.id_extends;
         }

         if (var0.id_finally) {
            int var5 = var3.id_finally();
            var4 = (int)((double)(var4 * 100) / (double)var5);
         }

         if (!var0.id_implements.id_class(var4)) {
            return false;
         }
      }

      if (var0.id_native != null && !var0.id_native.id_class(var1.id_char())) {
         return false;
      } else {
         int[][] var8 = var2;
         if (var0.id_volatile != null) {
            if (var2 == null) {
               var8 = id_byte(var1);
            }

            boolean var9 = false;

            for (int var6 = 0; var6 < var8.length; var6++) {
               int var7 = var8[var6][0];
               if (rrbb_3.id_class(var7, var0.id_volatile)) {
                  var9 = true;
                  break;
               }
            }

            if (!var9) {
               return false;
            }
         }

         if (var0.id_final != null) {
            if (var8 == null) {
               var8 = id_byte(var1);
            }

            boolean var10 = false;

            for (int var12 = 0; var12 < var8.length; var12++) {
               int var14 = var8[var12][1];
               if (var0.id_final.id_class(var14)) {
                  var10 = true;
                  break;
               }
            }

            if (!var10) {
               return false;
            }
         }

         if (var0.id_package != null) {
            rcd_3 var11 = var1.id_package();

            for (int var13 = 0; var13 < var0.id_package.length; var13++) {
               rrMH var15 = var0.id_package[var13];
               if (!var15.id_class(var11)) {
                  return false;
               }
            }
         }

         if (var0.id_int != 0) {
            if (var0.id_int == 1 && id_package) {
               return false;
            }

            if (var0.id_int == 2 && !id_package) {
               return false;
            }
         }

         return true;
      }
   }

   private static rrbH_2 id_class(rdn_3 var0, int var1) {
      rrbH_2[][] var2 = id_finally;
      if (var2 == null) {
         return null;
      } else if (var0 == null) {
         return null;
      } else {
         rdb_3 var3 = var0.id_break();
         int var4 = rdb_3.id_class(var3);
         if (var4 >= 0 && var4 < var2.length) {
            rrbH_2[] var5 = var2[var4];
            if (var5 != null) {
               for (int var6 = 0; var6 < var5.length; var6++) {
                  rrbH_2 var7 = var5[var6];
                  if (var7.id_byte == var1 && id_class(var7, var0, (int[][])null)) {
                     return var7;
                  }
               }
            }
         }

         return null;
      }
   }

   private static Properties id_class(String var0, String var1, rqO_2 var2, String var3) {
      if (rrzX_2.id_break(var0, new String[]{"_n", "_s"})) {
         return null;
      } else if (var0.equals("empty") && var1.equals("normal")) {
         var2 = rVL.id_for.id_break(rdy_3.Jn);
         rrzE_2 var9 = new rrzE_2();
         var9.put("type", "item");
         var9.put("items", var2.toString());
         return var9;
      } else {
         int[] var4 = (int[])id_case().get(var0);
         if (var4 == null) {
            rrbb_3.id_protected("Potion not found for image: " + var3);
            return null;
         } else {
            StringBuffer var5 = new StringBuffer();

            for (int var6 = 0; var6 < var4.length; var6++) {
               int var7 = var4[var6];
               if (var1.equals("splash")) {
                  var7 |= 16384;
               }

               if (var6 > 0) {
                  var5.append(" ");
               }

               var5.append(var7);
            }

            int var10 = 16447;
            if (var0.equals("water") || var0.equals("mundane")) {
               var10 |= 64;
            }

            rrzE_2 var11 = new rrzE_2();
            var11.put("type", "item");
            var11.put("items", var2.toString());
            var11.put("damage", var5.toString());
            var11.put("damageMask", var10 + "");
            if (var1.equals("splash")) {
               var11.put("texture.potion_bottle_splash", var0);
            } else {
               var11.put("texture.potion_bottle_drinkable", var0);
            }

            return var11;
         }
      }
   }

   private static Map<String, rrbH_2> id_class(rAC var0, String var1, rqO_2 var2) {
      HashMap var3 = new HashMap();
      String var4 = var1 + "/";
      String[] var5 = new String[]{"optifine/cit/potion/" + var4, "optifine/cit/Potion/" + var4};
      String[] var6 = new String[]{".png"};
      String[] var7 = rrzM_2.id_class(var0, var5, var6);

      for (int var8 = 0; var8 < var7.length; var8++) {
         String var9 = var7[var8];
         String var10 = rrzX_2.id_class(var9, var5, var6);
         Properties var11 = id_class(var10, var1, var2, var9);
         if (var11 != null) {
            String var12 = rrzX_2.id_byte(var9, var6) + ".properties";
            rrbH_2 var13 = new rrbH_2(var11, var12);
            var3.put(var12, var13);
         }
      }

      return var3;
   }

   private static void id_class(rrbH_2 var0, List<List<rrbH_2>> var1) {
      if (var0.id_protected != null) {
         for (int var2 = 0; var2 < var0.id_protected.length; var2++) {
            int var3 = var0.id_protected[var2];
            if (var3 <= 0) {
               rrbb_3.id_protected("Invalid item ID: " + var3);
            } else {
               id_class(var0, var1, var3);
            }
         }
      }
   }

   private static void id_class(rrbH_2[][] var0, List<rrbH_2> var1) {
      if (var0 != null) {
         for (int var2 = 0; var2 < var0.length; var2++) {
            rrbH_2[] var3 = var0[var2];
            if (var3 != null) {
               for (int var4 = 0; var4 < var3.length; var4++) {
                  rrbH_2 var5 = var3[var4];
                  if (var5 != null) {
                     var1.add(var5);
                  }
               }
            }
         }
      }
   }

   public static void id_class(IC var0) {
      for (rrbH_2 var2 : id_throws()) {
         var2.id_class(var0);
      }
   }

   public static void id_class(fJ_2 var0) {
      for (rrbH_2 var2 : id_throws()) {
         var2.id_class(var0);
      }
   }

   private static List<List<rrbH_2>> id_class(rrbH_2[][] var0) {
      ArrayList var1 = new ArrayList();
      if (var0 != null) {
         for (int var2 = 0; var2 < var0.length; var2++) {
            rrbH_2[] var3 = var0[var2];
            ArrayList var4 = null;
            if (var3 != null) {
               var4 = new ArrayList<>(Arrays.asList(var3));
            }

            var1.add(var4);
         }
      }

      return var1;
   }

   private static int[] id_class(int var0, int var1) {
      return new int[]{var0 + var1 * 16};
   }

   private static int[] id_class(int var0) {
      return new int[]{var0, var0 + 16, var0 + 32, var0 + 48};
   }

   public static void id_class(boolean var0) {
      id_package = var0;
   }

   public static void id_break(fJ_2 var0) {
      for (rrbH_2 var2 : id_throws()) {
         var2.id_break(var0);
      }
   }

   private static int id_break(String var0) {
      String var1 = "effect." + var0;

      for (rqO_2 var3 : rVL.id_const.id_protected()) {
         if (rVL.id_const.id_byte(var3)) {
            rLR var4 = rVL.id_const.id_class(var3);
            String var5 = var4.id_byte();
            if (var1.equals(var5)) {
               return rLR.id_class(var4);
            }
         }
      }

      return -1;
   }

   private static Map<String, rrbH_2> id_break(rAC var0) {
      HashMap var1 = new HashMap();
      var1.putAll(id_class(var0, "normal", rVL.id_for.id_break(rdy_3.JA)));
      var1.putAll(id_class(var0, "splash", rVL.id_for.id_break(rdy_3.kk)));
      var1.putAll(id_class(var0, "linger", rVL.id_for.id_break(rdy_3.kQ)));
      return var1;
   }

   private static void id_break(rrbH_2 var0, List<List<rrbH_2>> var1) {
      if (var0.id_byte == 2 && var0.id_volatile != null) {
         int var2 = id_catch() + 1;

         for (int var3 = 0; var3 < var2; var3++) {
            if (rrbb_3.id_class(var3, var0.id_volatile)) {
               id_class(var0, var1, var3);
            }
         }
      }
   }

   public static void id_break() {
      for (rrbH_2 var1 : id_throws()) {
         if (var1.id_byte == 1) {
            fJ_2 var2 = rrbb_3.rF();
            var1.id_class(var2, id_volatile);
            var1.id_class();
         }
      }
   }

   private static int id_break(rdn_3 var0) {
      rcd_3 var1 = var0.id_package();
      if (var1 == null) {
         return 0;
      } else {
         String var2 = var1.id_native("Potion");
         if (var2 != null && !var2.equals("")) {
            Integer var3 = id_new.get(var2);
            if (var3 == null) {
               return -1;
            } else {
               int var4 = var3;
               if (var0.id_break() == rdy_3.kk) {
                  var4 |= 16384;
               }

               return var4;
            }
         } else {
            return 0;
         }
      }
   }

   private static List<rrbH_2> id_throws() {
      ArrayList var0 = new ArrayList();
      id_class(id_finally, var0);
      id_class(id_extends, var0);
      return var0;
   }

   private static int id_catch() {
      int var0 = 0;

      while (true) {
         ev_3 var1 = rVL.id_boolean.id_class(var0);
         if (var1 == null) {
            return var0;
         }

         var0++;
      }
   }

   private static Map id_case() {
      if (id_native == null) {
         id_native = new LinkedHashMap();
         id_native.put("water", id_class(0, 0));
         id_native.put("awkward", id_class(0, 1));
         id_native.put("thick", id_class(0, 2));
         id_native.put("potent", id_class(0, 3));
         id_native.put("regeneration", id_class(1));
         id_native.put("movespeed", id_class(2));
         id_native.put("fireresistance", id_class(3));
         id_native.put("poison", id_class(4));
         id_native.put("heal", id_class(5));
         id_native.put("nightvision", id_class(6));
         id_native.put("clear", id_class(7, 0));
         id_native.put("bungling", id_class(7, 1));
         id_native.put("charming", id_class(7, 2));
         id_native.put("rank", id_class(7, 3));
         id_native.put("weakness", id_class(8));
         id_native.put("damageboost", id_class(9));
         id_native.put("moveslowdown", id_class(10));
         id_native.put("leaping", id_class(11));
         id_native.put("harm", id_class(12));
         id_native.put("waterbreathing", id_class(13));
         id_native.put("invisibility", id_class(14));
         id_native.put("thin", id_class(15, 0));
         id_native.put("debonair", id_class(15, 1));
         id_native.put("sparkling", id_class(15, 2));
         id_native.put("stinky", id_class(15, 3));
         id_native.put("mundane", id_class(0, 4));
         id_native.put("speed", id_native.get("movespeed"));
         id_native.put("fire_resistance", id_native.get("fireresistance"));
         id_native.put("instant_health", id_native.get("heal"));
         id_native.put("night_vision", id_native.get("nightvision"));
         id_native.put("strength", id_native.get("damageboost"));
         id_native.put("slowness", id_native.get("moveslowdown"));
         id_native.put("instant_damage", id_native.get("harm"));
         id_native.put("water_breathing", id_native.get("waterbreathing"));
      }

      return id_native;
   }

   private static Comparator id_protected() {
      return new rrbp_3();
   }

   private static Map<String, Integer> id_private() {
      HashMap var0 = new HashMap();
      id_class("water", 0, false, var0);
      id_class("awkward", 16, false, var0);
      id_class("thick", 32, false, var0);
      id_class("mundane", 64, false, var0);
      id_class("regeneration", 1, true, var0);
      id_class("swiftness", 2, true, var0);
      id_class("fire_resistance", 3, true, var0);
      id_class("poison", 4, true, var0);
      id_class("healing", 5, true, var0);
      id_class("night_vision", 6, true, var0);
      id_class("weakness", 8, true, var0);
      id_class("strength", 9, true, var0);
      id_class("slowness", 10, true, var0);
      id_class("leaping", 11, true, var0);
      id_class("harming", 12, true, var0);
      id_class("water_breathing", 13, true, var0);
      id_class("invisibility", 14, true, var0);
      return var0;
   }
}
