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
   private static rrxT_2[][] id_class = (rrxT_2[][])null;
   private static boolean id_break = false;
   private static rrzE_2 id_byte = null;
   private static boolean id_protected;
   private static List<List<rrxT_2>> id_throws;

   public static rrzE_2 id_byte() {
      return id_byte;
   }

   public static int id_byte(xc_3 var0) {
      if (id_break) {
         xd_3 var1 = var0.id_break();
         if (var1 instanceof dj_3) {
            return 1;
         } else {
            xN_2 var2 = var0.id_private();
            return var2 != xN_2.ENTITYBLOCK_ANIMATED && var2 != xN_2.MODEL ? var2.ordinal() : var2.ordinal() + 1;
         }
      } else {
         return var0.id_private().ordinal();
      }
   }

   private static rrMn_1 id_class(xd_3 var0, int var1, Map<rCZ, Comparable> var2) {
      ArrayList var3 = new ArrayList();
      Set var4 = var2.keySet();

      for (xc_3 var6 : rrWP.id_byte(var0)) {
         boolean var7 = true;

         for (rCZ var9 : var4) {
            if (!var6.id_break(var9)) {
               var7 = false;
               break;
            }

            Comparable var10 = (Comparable)var2.get(var9);
            Comparable var11 = var6.id_byte(var9);
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
         var12.add(var15.id_super());
      }

      Integer[] var14 = var12.toArray(new Integer[var12.size()]);
      int[] var16 = rrbb_3.id_class(var14);
      return new rrMn_1(var1, var16);
   }

   private static void id_class(List<rrxT_2> var0, int var1, int var2, rrMn_1 var3) {
      for (rrxT_2 var5 : var0) {
         if (var5.id_class() == var1 && var5.id_break() == var2) {
            rrMn_1[] var6 = var5.id_byte();

            for (int var7 = 0; var7 < var6.length; var7++) {
               rrMn_1 var8 = var6[var7];
               if (var8.id_class() == var3.id_class()) {
                  var8.id_class(var3.id_break());
                  return;
               }
            }
         }
      }

      rrxT_2 var9 = new rrxT_2(var1, var2, new rrMn_1[]{var3});
      var0.add(var9);
   }

   private static void id_class(String var0, int var1, List<List<rrxT_2>> var2) {
      String[] var3 = rrbb_3.id_class(var0, " ");
      if (var3.length != 4) {
         rrbb_3.id_protected("Invalid flattening line: " + var0);
      } else {
         String var4 = var3[0];
         String var5 = var3[1];
         int var6 = rrbb_3.id_class(var3[2], Integer.MIN_VALUE);
         int var7 = rrbb_3.id_class(var3[3], Integer.MIN_VALUE);
         if (var6 >= 0 && var7 >= 0) {
            try {
               JsonParser var8 = new JsonParser();
               JsonObject var9 = var8.parse(var4).getAsJsonObject();
               String var10 = var9.get("Name").getAsString();
               rqO_2 var11 = new rqO_2(var10);
               xd_3 var12 = rrWP.id_class(var11);
               if (var12 == null) {
                  rrbb_3.id_protected("Invalid block name (" + var1 + "): " + var10);
                  return;
               }

               xc_3 var13 = var12.id_continue();
               Collection var14 = var13.id_public();
               LinkedHashMap var15 = new LinkedHashMap();
               JsonObject var16 = (JsonObject)var9.get("Properties");
               if (var16 != null) {
                  for (Entry var18 : var16.entrySet()) {
                     String var19 = (String)var18.getKey();
                     String var20 = ((JsonElement)var18.getValue()).getAsString();
                     rCZ var21 = rrbM_2.id_class(var19, var14);
                     if (var21 == null) {
                        rrbb_3.id_protected("Invalid property (" + var1 + "): " + var19);
                     } else {
                        Comparable var22 = rrMz_1.id_class(var21, var20);
                        if (var22 == null) {
                           rrbb_3.id_protected("Invalid property value (" + var1 + "): " + var20);
                        } else {
                           var15.put(var21, var22);
                        }
                     }
                  }
               }

               int var24 = var13.id_continue();

               while (var2.size() <= var24) {
                  var2.add((List)null);
               }

               Object var25 = (List)var2.get(var24);
               if (var25 == null) {
                  var25 = new ArrayList(rrWP.id_break(var12));
                  var2.set(var24, var25);
               }

               rrMn_1 var26 = id_class(var13.id_break(), var13.id_continue(), var15);
               id_class((List<rrxT_2>)var25, var6, var7, var26);
            } catch (Exception var23) {
               rrbb_3.id_protected("Error parsing: " + var0);
            }
         } else {
            rrbb_3.id_protected("Invalid blockID or metadata (" + var1 + "): " + var6 + ":" + var7);
         }
      }
   }

   private static rrxT_2[][] id_class(List<List<rrxT_2>> var0) {
      rrxT_2[][] var1 = new rrxT_2[var0.size()][];

      for (int var2 = 0; var2 < var1.length; var2++) {
         List var3 = (List)var0.get(var2);
         if (var3 != null) {
            var1[var2] = var3.toArray(new rrxT_2[var3.size()]);
         }
      }

      return var1;
   }

   public static boolean id_class() {
      return id_break;
   }

   public static int id_class(xc_3 var0) {
      int var1 = var0.id_continue();
      int var2 = var0.id_super();
      rrxT_2 var3 = id_class(var1, var2);
      return var3 != null ? var3.id_class() : -1;
   }

   public static void id_class(rrxi_3 var0) {
      id_protected();
      if (var0 != null && !(var0 instanceof rrdN)) {
         if (rrxr_3.Bx.id_byte() && QY.id_instanceof().F() == null) {
            rrbb_3.id_byte("[Shaders] Delayed loading of block mappings after resources are loaded");
            id_protected = true;
         } else {
            Object var1 = new ArrayList();
            String var2 = "/shaders/block.properties";
            InputStream var3 = var0.id_class(var2);
            if (var3 != null) {
               id_class(var3, var2, (List<List<rrxT_2>>)var1);
            }

            if (var1.size() <= 0) {
               var1 = id_throws();
               id_break = true;
            }

            id_class = id_class((List<List<rrxT_2>>)var1);
         }
      }
   }

   public static rrxT_2[] id_class(int var0) {
      if (id_class == null) {
         return null;
      } else {
         return var0 >= 0 && var0 < id_class.length ? id_class[var0] : null;
      }
   }

   private static void id_class(List<List<rrxT_2>> var0, rrxT_2 var1) {
      int[] var2 = var1.id_protected();

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

         rrxT_2 var6 = new rrxT_2(var1.id_class(), var1.id_class(var4));
         var5.add(var6);
      }
   }

   public static rrxT_2 id_class(int var0, int var1) {
      if (id_class == null) {
         return null;
      } else if (var0 >= 0 && var0 < id_class.length) {
         rrxT_2[] var2 = id_class[var0];
         if (var2 == null) {
            return null;
         } else {
            for (int var3 = 0; var3 < var2.length; var3++) {
               rrxT_2 var4 = var2[var3];
               if (var4.id_class(var0, var1)) {
                  return var4;
               }
            }

            return null;
         }
      } else {
         return null;
      }
   }

   private static void id_class(InputStream var0, String var1, List<List<rrxT_2>> var2) {
      if (var0 != null) {
         try {
            var0 = rrdT.id_class(var0, var1, true);
            rrzE_2 var3 = new rrzE_2();
            var3.load(var0);
            var0.close();
            rrbb_3.id_byte("[Shaders] Parsing block mappings: " + var1);
            rrMz_1 var4 = new rrMz_1("Shaders");

            for (String var6 : var3.keySet()) {
               String var7 = var3.getProperty(var6);
               if (var6.startsWith("layer.")) {
                  if (id_byte == null) {
                     id_byte = new rrzE_2();
                  }

                  id_byte.put(var6, var7);
               } else {
                  String var8 = "block.";
                  if (!var6.startsWith(var8)) {
                     rrbb_3.id_protected("[Shaders] Invalid block ID: " + var6);
                  } else {
                     String var9 = rrzX_2.id_protected(var6, var8);
                     int var10 = rrbb_3.id_class(var9, -1);
                     if (var10 < 0) {
                        rrbb_3.id_protected("[Shaders] Invalid block ID: " + var6);
                     } else {
                        rrMn_1[] var11 = var4.id_byte(var7);
                        if (var11 != null && var11.length >= 1) {
                           rrxT_2 var12 = new rrxT_2(var10, var11);
                           id_class(var2, var12);
                        } else {
                           rrbb_3.id_protected("[Shaders] Invalid block ID mapping: " + var6 + "=" + var7);
                        }
                     }
                  }
               }
            }
         } catch (IOException var13) {
            rrbb_3.id_protected("[Shaders] Error reading: " + var1);
         }
      }
   }

   public static void id_break() {
      if (id_protected) {
         id_protected = false;
         id_class(rrdZ.id_protected());
      }
   }

   public static int id_break(xc_3 var0) {
      if (!id_break) {
         return 0;
      } else {
         int var1 = var0.id_continue();
         int var2 = var0.id_super();
         rrxT_2 var3 = id_class(var1, var2);
         return var3 != null ? var3.id_break() : 0;
      }
   }

   private static List<List<rrxT_2>> id_throws() {
      if (id_throws == null) {
         id_throws = id_case();
      }

      return id_throws;
   }

   private static void id_catch() {
      for (rqO_2 var1 : rVL.id_strictfp.id_protected()) {
         xd_3 var2 = rVL.id_strictfp.id_class(var1);
         int var3 = var2.id_continue().id_continue();
         rrxT_2[] var4 = id_class(var3);
         if (var4 == null) {
            rrbb_3.id_protected("Block has no alias: " + var2);
         } else {
            for (xc_3 var6 : rrWP.id_byte(var2)) {
               int var7 = var6.id_super();
               rrxT_2 var8 = id_class(var3, var7);
               if (var8 == null) {
                  rrbb_3.id_protected("State has no alias: " + var6);
               }
            }
         }
      }
   }

   private static List<List<rrxT_2>> id_case() {
      try {
         String var0 = "flattening_ids.txt";
         rrbb_3.id_byte("Using legacy block aliases: " + var0);
         ArrayList var1 = new ArrayList();
         ArrayList var2 = new ArrayList();
         int var3 = 0;
         InputStream var4 = rrbb_3.id_class("/" + var0);
         if (var4 == null) {
            return var1;
         } else {
            String[] var5 = rrbb_3.id_class(var4);

            for (int var6 = 0; var6 < var5.length; var6++) {
               int var7 = var6 + 1;
               String var8 = var5[var6];
               if (var8.trim().length() > 0) {
                  var2.add(var8);
                  if (!var8.startsWith("#")) {
                     if (var8.startsWith("alias")) {
                        String[] var9 = rrbb_3.id_class(var8, " ");
                        String var10 = var9[1];
                        String var11 = var9[2];
                        String var12 = "{Name:'" + var11 + "'";
                        List var13 = var2.stream().filter(var1x -> var1x.startsWith(var12)).collect(Collectors.toList());
                        if (var13.size() <= 0) {
                           rrbb_3.id_protected("Block not processed: " + var8);
                        } else {
                           for (String var15 : var13) {
                              String var16 = "{Name:'" + var10 + "'";
                              String var17 = var15.replace(var12, var16);
                              var2.add(var17);
                              id_class(var17, var7, var1);
                              var3++;
                           }
                        }
                     } else {
                        id_class(var8, var7, var1);
                        var3++;
                     }
                  }
               }
            }

            rrbb_3.id_byte("Legacy block aliases: " + var3);
            return var1;
         }
      } catch (IOException var18) {
         rrbb_3.id_protected("Error loading legacy block aliases: " + var18.getClass().getName() + ": " + var18.getMessage());
         return new ArrayList<>();
      }
   }

   public static void id_protected() {
      id_class = (rrxT_2[][])null;
      id_break = false;
      id_byte = null;
   }
}
