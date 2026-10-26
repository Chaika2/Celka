package celestial;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class rrxt_3 {
   private static rrxT_2[][] class_ = (rrxT_2[][])null;
   private static boolean break_ = false;
   private static rrzE_2 byte_ = null;
   private static boolean protected_;
   private static List<List<rrxT_2>> throws_;

   public static rrzE_2 byte_() {
      return byte_;
   }

   public static int byte_(xc_3 var0) {
      if (break_) {
         xd_3 var1 = var0.break_();
         if (var1 instanceof dj_3) {
            return 1;
         } else {
            xN_2 var2 = var0.private_();
            return var2 != xN_2.ENTITYBLOCK_ANIMATED && var2 != xN_2.MODEL ? var2.ordinal() : var2.ordinal() + 1;
         }
      } else {
         return var0.private_().ordinal();
      }
   }

   private static rrMn_1 class_(xd_3 var0, int var1, Map<rCZ, Comparable> var2) {
      ArrayList var3 = new ArrayList();
      Set var4 = var2.keySet();

      for (xc_3 var6 : rrWP.byte_(var0)) {
         boolean var7 = true;

         for (rCZ var9 : var4) {
            if (!var6.break_(var9)) {
               var7 = false;
               break;
            }

            Comparable var10 = (Comparable)var2.get(var9);
            Comparable var11 = var6.byte_(var9);
            if (!var10.equals(var11)) {
               var7 = false;
               break;
            }
         }

         if (var7) {
            var3.add(var6);
         }
      }

      LinkedHashSet var12 = new LinkedHashSet();

      for (xc_3 var15 : var3) {
         var12.add(var15.super_());
      }

      Integer[] var14 = var12.toArray(new Integer[var12.size()]);
      int[] var16 = rrbb_3.class_(var14);
      return new rrMn_1(var1, var16);
   }

   private static void class_(List<rrxT_2> var0, int var1, int var2, rrMn_1 var3) {
      for (rrxT_2 var5 : var0) {
         if (var5.class_() == var1 && var5.break_() == var2) {
            rrMn_1[] var6 = var5.byte_();

            for (int var7 = 0; var7 < var6.length; var7++) {
               rrMn_1 var8 = var6[var7];
               if (var8.class_() == var3.class_()) {
                  var8.class_(var3.break_());
                  return;
               }
            }
         }
      }

      rrxT_2 var9 = new rrxT_2(var1, var2, new rrMn_1[]{var3});
      var0.add(var9);
   }

   private static void class_(String var0, int var1, List<List<rrxT_2>> var2) {
      String[] var3 = rrbb_3.class_(var0, " ");
      if (var3.length != 4) {
         rrbb_3.protected_("Invalid flattening line: " + var0);
      } else {
         String var4 = var3[0];
         String var5 = var3[1];
         int var6 = rrbb_3.class_(var3[2], Integer.MIN_VALUE);
         int var7 = rrbb_3.class_(var3[3], Integer.MIN_VALUE);
         if (var6 >= 0 && var7 >= 0) {
            try {
               JsonParser var8 = new JsonParser();
               JsonObject var9 = var8.parse(var4).getAsJsonObject();
               String var10 = var9.get("Name").getAsString();
               rqO_2 var11 = new rqO_2(var10);
               xd_3 var12 = rrWP.class_(var11);
               if (var12 == null) {
                  rrbb_3.protected_("Invalid block name (" + var1 + "): " + var10);
                  return;
               }

               xc_3 var13 = var12.continue_();
               Collection var14 = var13.public_();
               LinkedHashMap var15 = new LinkedHashMap();
               JsonObject var16 = (JsonObject)var9.get("Properties");
               if (var16 != null) {
                  for (Entry var18 : var16.entrySet()) {
                     String var19 = (String)var18.getKey();
                     String var20 = ((JsonElement)var18.getValue()).getAsString();
                     rCZ var21 = rrbM_2.class_(var19, var14);
                     if (var21 == null) {
                        rrbb_3.protected_("Invalid property (" + var1 + "): " + var19);
                     } else {
                        Comparable var22 = rrMz_1.class_(var21, var20);
                        if (var22 == null) {
                           rrbb_3.protected_("Invalid property value (" + var1 + "): " + var20);
                        } else {
                           var15.put(var21, var22);
                        }
                     }
                  }
               }

               int var24 = var13.continue_();

               while (var2.size() <= var24) {
                  var2.add((List)null);
               }

               Object var25 = (List)var2.get(var24);
               if (var25 == null) {
                  var25 = new ArrayList(rrWP.break_(var12));
                  var2.set(var24, var25);
               }

               rrMn_1 var26 = class_(var13.break_(), var13.continue_(), var15);
               class_((List<rrxT_2>)var25, var6, var7, var26);
            } catch (Exception var23) {
               rrbb_3.protected_("Error parsing: " + var0);
            }
         } else {
            rrbb_3.protected_("Invalid blockID or metadata (" + var1 + "): " + var6 + ":" + var7);
         }
      }
   }

   private static rrxT_2[][] class_(List<List<rrxT_2>> var0) {
      rrxT_2[][] var1 = new rrxT_2[var0.size()][];

      for (int var2 = 0; var2 < var1.length; var2++) {
         List var3 = (List)var0.get(var2);
         if (var3 != null) {
            var1[var2] = var3.toArray(new rrxT_2[var3.size()]);
         }
      }

      return var1;
   }

   public static boolean class_() {
      return break_;
   }

   public static int class_(xc_3 var0) {
      int var1 = var0.continue_();
      int var2 = var0.super_();
      rrxT_2 var3 = class_(var1, var2);
      return var3 != null ? var3.class_() : -1;
   }

   public static void class_(rrxi_3 var0) {
      protected_();
      if (var0 != null && !(var0 instanceof rrdN)) {
         if (rrxr_3.Bx.byte_() && QY.instanceof_().F() == null) {
            rrbb_3.byte_("[Shaders] Delayed loading of block mappings after resources are loaded");
            protected_ = true;
         } else {
            Object var1 = new ArrayList();
            String var2 = "/shaders/block.properties";
            InputStream var3 = var0.class_(var2);
            if (var3 != null) {
               class_(var3, var2, (List<List<rrxT_2>>)var1);
            }

            if (var1.size() <= 0) {
               var1 = throws_();
               break_ = true;
            }

            class_ = class_((List<List<rrxT_2>>)var1);
         }
      }
   }

   public static rrxT_2[] class_(int var0) {
      if (class_ == null) {
         return null;
      } else {
         return var0 >= 0 && var0 < class_.length ? class_[var0] : null;
      }
   }

   private static void class_(List<List<rrxT_2>> var0, rrxT_2 var1) {
      int[] var2 = var1.protected_();

      for (int var3 = 0; var3 < var2.length; var3++) {
         int var4 = var2[var3];

         while (var4 >= var0.size()) {
            var0.add((List)null);
         }

         Object var5 = (List)var0.get(var4);
         if (var5 == null) {
            var5 = new ArrayList();
            var0.set(var4, var5);
         }

         rrxT_2 var6 = new rrxT_2(var1.class_(), var1.class_(var4));
         var5.add(var6);
      }
   }

   public static rrxT_2 class_(int var0, int var1) {
      if (class_ == null) {
         return null;
      } else if (var0 >= 0 && var0 < class_.length) {
         rrxT_2[] var2 = class_[var0];
         if (var2 == null) {
            return null;
         } else {
            for (int var3 = 0; var3 < var2.length; var3++) {
               rrxT_2 var4 = var2[var3];
               if (var4.class_(var0, var1)) {
                  return var4;
               }
            }

            return null;
         }
      } else {
         return null;
      }
   }

   private static void class_(InputStream var0, String var1, List<List<rrxT_2>> var2) {
      if (var0 != null) {
         try {
            var0 = rrdT.class_(var0, var1, true);
            rrzE_2 var3 = new rrzE_2();
            var3.load(var0);
            var0.close();
            rrbb_3.byte_("[Shaders] Parsing block mappings: " + var1);
            rrMz_1 var4 = new rrMz_1("Shaders");

            for (String var6 : var3.keySet()) {
               String var7 = var3.getProperty(var6);
               if (var6.startsWith("layer.")) {
                  if (byte_ == null) {
                     byte_ = new rrzE_2();
                  }

                  byte_.put(var6, var7);
               } else {
                  String var8 = "block.";
                  if (!var6.startsWith(var8)) {
                     rrbb_3.protected_("[Shaders] Invalid block ID: " + var6);
                  } else {
                     String var9 = rrzX_2.protected_(var6, var8);
                     int var10 = rrbb_3.class_(var9, -1);
                     if (var10 < 0) {
                        rrbb_3.protected_("[Shaders] Invalid block ID: " + var6);
                     } else {
                        rrMn_1[] var11 = var4.byte_(var7);
                        if (var11 != null && var11.length >= 1) {
                           rrxT_2 var12 = new rrxT_2(var10, var11);
                           class_(var2, var12);
                        } else {
                           rrbb_3.protected_("[Shaders] Invalid block ID mapping: " + var6 + "=" + var7);
                        }
                     }
                  }
               }
            }
         } catch (IOException var13) {
            rrbb_3.protected_("[Shaders] Error reading: " + var1);
         }
      }
   }

   public static void break_() {
      if (protected_) {
         protected_ = false;
         class_(rrdZ.protected_());
      }
   }

   public static int break_(xc_3 var0) {
      if (!break_) {
         return 0;
      } else {
         int var1 = var0.continue_();
         int var2 = var0.super_();
         rrxT_2 var3 = class_(var1, var2);
         return var3 != null ? var3.break_() : 0;
      }
   }

   private static List<List<rrxT_2>> throws_() {
      if (throws_ == null) {
         throws_ = case_();
      }

      return throws_;
   }

   private static void catch_() {
      for (rqO_2 var1 : rVL.strictfp_.protected_()) {
         xd_3 var2 = rVL.strictfp_.class_(var1);
         int var3 = var2.continue_().continue_();
         rrxT_2[] var4 = class_(var3);
         if (var4 == null) {
            rrbb_3.protected_("Block has no alias: " + var2);
         } else {
            for (xc_3 var6 : rrWP.byte_(var2)) {
               int var7 = var6.super_();
               rrxT_2 var8 = class_(var3, var7);
               if (var8 == null) {
                  rrbb_3.protected_("State has no alias: " + var6);
               }
            }
         }
      }
   }

   private static List<List<rrxT_2>> case_() {
      try {
         String var0 = "flattening_ids.txt";
         rrbb_3.byte_("Using legacy block aliases: " + var0);
         ArrayList var1 = new ArrayList();
         ArrayList var2 = new ArrayList();
         int var3 = 0;
         InputStream var4 = rrbb_3.class_("/" + var0);
         if (var4 == null) {
            return var1;
         } else {
            String[] var5 = rrbb_3.class_(var4);

            for (int var6 = 0; var6 < var5.length; var6++) {
               int var7 = var6 + 1;
               String var8 = var5[var6];
               if (var8.trim().length() > 0) {
                  var2.add(var8);
                  if (!var8.startsWith("#")) {
                     if (var8.startsWith("alias")) {
                        String[] var9 = rrbb_3.class_(var8, " ");
                        String var10 = var9[1];
                        String var11 = var9[2];
                        String var12 = "{Name:'" + var11 + "'";
                        List var13 = var2.stream().filter(var1x -> var1x.startsWith(var12)).collect(Collectors.toList());
                        if (var13.size() <= 0) {
                           rrbb_3.protected_("Block not processed: " + var8);
                        } else {
                           for (String var15 : var13) {
                              String var16 = "{Name:'" + var10 + "'";
                              String var17 = var15.replace(var12, var16);
                              var2.add(var17);
                              class_(var17, var7, var1);
                              var3++;
                           }
                        }
                     } else {
                        class_(var8, var7, var1);
                        var3++;
                     }
                  }
               }
            }

            rrbb_3.byte_("Legacy block aliases: " + var3);
            return var1;
         }
      } catch (IOException var18) {
         rrbb_3.protected_("Error loading legacy block aliases: " + var18.getClass().getName() + ": " + var18.getMessage());
         return new ArrayList<>();
      }
   }

   public static void protected_() {
      class_ = (rrxT_2[][])null;
      break_ = false;
      byte_ = null;
   }
}
