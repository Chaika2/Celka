package celestial;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class rrbO_2 {
   private static Map[] id_extends = null;
   private static Map[] id_native = null;
   private static Map[][] id_volatile = (Map[][])null;
   private static rrbM_2[][] id_final = (rrbM_2[][])null;
   private static rrbM_2[][] id_package = (rrbM_2[][])null;
   private static boolean id_int = false;
   protected static final int id_class = -1;
   protected static final int id_break = 0;
   protected static final int id_byte = 1;
   protected static final int id_protected = 2;
   protected static final int id_throws = 3;
   protected static final int id_case = 4;
   protected static final int id_catch = 5;
   private static final int id_new = 0;
   private static final int id_continue = 1;
   private static final int id_super = 2;
   public static final xc_3 id_private = xu_3.id_class.id_continue();
   private static fj_3 id_this = null;
   public static rqO_2 id_implements = rrzJ_2.id_goto;
   private static final rrGa_1[] id_else = new rrGa_1[]{rrGa_1.WEST, rrGa_1.EAST, rrGa_1.NORTH, rrGa_1.SOUTH};
   private static final rrGa_1[] id_synchronized = new rrGa_1[]{rrGa_1.WEST, rrGa_1.EAST, rrGa_1.SOUTH, rrGa_1.NORTH};
   private static final rrGa_1[] id_return = new rrGa_1[]{rrGa_1.EAST, rrGa_1.WEST, rrGa_1.DOWN, rrGa_1.UP};
   private static final rrGa_1[] id_public = new rrGa_1[]{rrGa_1.WEST, rrGa_1.EAST, rrGa_1.DOWN, rrGa_1.UP};
   private static final rrGa_1[] id_goto = new rrGa_1[]{rrGa_1.NORTH, rrGa_1.SOUTH, rrGa_1.DOWN, rrGa_1.UP};
   private static final rrGa_1[] id_while = new rrGa_1[]{rrGa_1.SOUTH, rrGa_1.NORTH, rrGa_1.DOWN, rrGa_1.UP};
   private static final rrGa_1[] id_try = new rrGa_1[]{rrGa_1.NORTH_EAST, rrGa_1.NORTH_WEST, rrGa_1.SOUTH_EAST, rrGa_1.SOUTH_WEST};
   private static final rrGa_1[] id_instanceof = new rrGa_1[]{rrGa_1.SOUTH_EAST, rrGa_1.SOUTH_WEST, rrGa_1.NORTH_EAST, rrGa_1.NORTH_WEST};
   private static final rrGa_1[] id_throw = new rrGa_1[]{rrGa_1.DOWN_WEST, rrGa_1.DOWN_EAST, rrGa_1.UP_WEST, rrGa_1.UP_EAST};
   private static final rrGa_1[] id_interface = new rrGa_1[]{rrGa_1.DOWN_EAST, rrGa_1.DOWN_WEST, rrGa_1.UP_EAST, rrGa_1.UP_WEST};
   private static final rrGa_1[] id_char = new rrGa_1[]{rrGa_1.DOWN_SOUTH, rrGa_1.DOWN_NORTH, rrGa_1.UP_SOUTH, rrGa_1.UP_NORTH};
   private static final rrGa_1[] id_abstract = new rrGa_1[]{rrGa_1.DOWN_NORTH, rrGa_1.DOWN_SOUTH, rrGa_1.UP_NORTH, rrGa_1.UP_SOUTH};
   public static final fj_3 id_finally = new fj_3(new rqO_2("default"));
   private static final Random id_long = new Random(0L);

   private static rrGa_1[] id_byte(int var0, int var1) {
      switch (var0) {
         case 0:
            return id_try;
         case 1:
            return id_instanceof;
         case 2:
            return id_throw;
         case 3:
            return id_interface;
         case 4:
            return id_char;
         case 5:
            return id_abstract;
         default:
            throw new IllegalArgumentException("Unknown side: " + var0);
      }
   }

   private static wK_2[] id_byte(rrbM_2 var0, rRq_1 var1, xc_3 var2, rfH_2 var3, int var4, int var5, wK_2 var6, int var7, rrxF_2 var8) {
      if (!var6.id_final()) {
         return null;
      } else {
         rrJp_1 var9 = var8.id_class(var0.id_char);

         Object var10;
         try {
            fj_3 var11 = id_class(var0, var1, var2, var3, var4, var5, var6.id_case(), var7, var8);
            if (var11 != null) {
               var9.id_class(id_class(var11, var6, var0.id_throw), var0.id_interface);
            }

            var10 = null;
         } finally {
            if (var9.id_class() > 0) {
               var8.id_class(true);
            }
         }

         return (wK_2[])var10;
      }
   }

   private static fj_3 id_byte(rrbM_2 var0, rRq_1 var1, xc_3 var2, rfH_2 var3, int var4, int var5, fj_3 var6, int var7) {
      fj_3[] var8 = var0.id_goto;
      fj_3 var9 = id_class(var0, var1, var2, var3, var4, var5, var6, var7);
      if (var9 != null && var9 != var6 && var9 != var8[3]) {
         return var9;
      } else {
         fj_3 var10 = id_break(var0, var1, var2, var3, var4, var5, var6, var7);
         if (var10 == var8[0]) {
            return var8[4];
         } else if (var10 == var8[1]) {
            return var8[5];
         } else {
            return var10 == var8[2] ? var8[6] : var10;
         }
      }
   }

   private static boolean id_byte(rrbM_2 var0, rRq_1 var1, xc_3 var2, rfH_2 var3, int var4, fj_3 var5, int var6) {
      xc_3 var7 = var1.id_byte(var3);
      return id_class(var0, var1, var2, var3, var7, var4, var5, var6);
   }

   private static String[] id_byte() {
      ArrayList var0 = new ArrayList();
      id_class(var0, "textures/block/glass.png", "20_glass/glass.properties");
      id_class(var0, "textures/block/glass.png", "20_glass/glass_pane.properties");
      id_class(var0, "textures/block/bookshelf.png", "30_bookshelf/bookshelf.properties");
      id_class(var0, "textures/block/sandstone.png", "40_sandstone/sandstone.properties");
      id_class(var0, "textures/block/red_sandstone.png", "41_red_sandstone/red_sandstone.properties");
      String[] var1 = new String[]{
         "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"
      };

      for (int var2 = 0; var2 < var1.length; var2++) {
         String var3 = var1[var2];
         String var4 = rrzX_2.id_class(var2 + "", 2, '0');
         id_class(var0, "textures/block/" + var3 + "_stained_glass.png", var4 + "_glass_" + var3 + "/glass_" + var3 + ".properties");
         id_class(var0, "textures/block/" + var3 + "_stained_glass.png", var4 + "_glass_" + var3 + "/glass_pane_" + var3 + ".properties");
      }

      return var0.toArray(new String[var0.size()]);
   }

   private static boolean id_class(rrbM_2 var0, rRq_1 var1, xc_3 var2, rfH_2 var3, xc_3 var4, int var5, fj_3 var6, int var7) {
      if (var2 == var4) {
         return true;
      } else if (var0.id_private == 2) {
         if (var4 == null) {
            return false;
         } else if (var4 == id_private) {
            return false;
         } else {
            fj_3 var10 = id_class(var1, var2, var3, var4, var5);
            return var10 == var6;
         }
      } else if (var0.id_private == 3) {
         if (var4 == null) {
            return false;
         } else {
            return var4 == id_private ? false : var4.id_byte() == var2.id_byte();
         }
      } else if (var0.id_private == 1) {
         xd_3 var8 = var2.id_break();
         xd_3 var9 = var4.id_break();
         return var9 == var8;
      } else {
         return false;
      }
   }

   private static fj_3 id_class(rRq_1 var0, xc_3 var1, rfH_2 var2, xc_3 var3, int var4) {
      IJ var5 = QY.id_instanceof().id_synchronized().id_break().id_break(var3);
      if (var5 == null) {
         return null;
      } else {
         rpr_3 var6 = id_class(var4);
         List var7 = var5.id_class(var3, var6, id_long);
         if (var7 == null) {
            return null;
         } else {
            if (rrbb_3.c()) {
               var7 = rrGU.id_class(var0, var3, var2, var6, var7);
            }

            if (var7.size() > 0) {
               wK_2 var11 = (wK_2)var7.get(0);
               return var11.id_case();
            } else {
               List var8 = var5.id_class(var3, (rpr_3)null, id_long);
               if (var8 == null) {
                  return null;
               } else {
                  for (int var9 = 0; var9 < var8.size(); var9++) {
                     wK_2 var10 = (wK_2)var8.get(var9);
                     if (var10.id_protected() == var6) {
                        return var10.id_case();
                     }
                  }

                  return null;
               }
            }
         }
      }
   }

   private static fj_3 id_class(rrbM_2 var0, rRq_1 var1, xc_3 var2, rfH_2 var3, int var4, int var5, fj_3 var6, int var7) {
      boolean var8;
      boolean var9;
      var8 = false;
      var9 = false;
      label46:
      switch (var4) {
         case 0:
            switch (var5) {
               case 0:
                  var8 = id_byte(var0, var1, var2, var3.id_byte(), var5, var6, var7);
                  var9 = id_byte(var0, var1, var2, var3.id_extends(), var5, var6, var7);
                  break label46;
               case 1:
                  var8 = id_byte(var0, var1, var2, var3.id_byte(), var5, var6, var7);
                  var9 = id_byte(var0, var1, var2, var3.id_extends(), var5, var6, var7);
                  break label46;
               case 2:
                  var8 = id_byte(var0, var1, var2, var3.id_extends(), var5, var6, var7);
                  var9 = id_byte(var0, var1, var2, var3.id_byte(), var5, var6, var7);
                  break label46;
               case 3:
                  var8 = id_byte(var0, var1, var2, var3.id_byte(), var5, var6, var7);
                  var9 = id_byte(var0, var1, var2, var3.id_extends(), var5, var6, var7);
                  break label46;
               case 4:
                  var8 = id_byte(var0, var1, var2, var3.id_private(), var5, var6, var7);
                  var9 = id_byte(var0, var1, var2, var3.id_protected(), var5, var6, var7);
                  break label46;
               case 5:
                  var8 = id_byte(var0, var1, var2, var3.id_protected(), var5, var6, var7);
                  var9 = id_byte(var0, var1, var2, var3.id_private(), var5, var6, var7);
               default:
                  break label46;
            }
         case 1:
            switch (var5) {
               case 0:
                  var8 = id_byte(var0, var1, var2, var3.id_extends(), var5, var6, var7);
                  var9 = id_byte(var0, var1, var2, var3.id_byte(), var5, var6, var7);
                  break label46;
               case 1:
                  var8 = id_byte(var0, var1, var2, var3.id_byte(), var5, var6, var7);
                  var9 = id_byte(var0, var1, var2, var3.id_extends(), var5, var6, var7);
                  break label46;
               case 2:
                  var8 = id_byte(var0, var1, var2, var3.id_byte(), var5, var6, var7);
                  var9 = id_byte(var0, var1, var2, var3.id_extends(), var5, var6, var7);
                  break label46;
               case 3:
                  var8 = id_byte(var0, var1, var2, var3.id_byte(), var5, var6, var7);
                  var9 = id_byte(var0, var1, var2, var3.id_extends(), var5, var6, var7);
                  break label46;
               case 4:
                  var8 = id_byte(var0, var1, var2, var3.id_break(), var5, var6, var7);
                  var9 = id_byte(var0, var1, var2, var3.id_final(), var5, var6, var7);
                  break label46;
               case 5:
                  var8 = id_byte(var0, var1, var2, var3.id_final(), var5, var6, var7);
                  var9 = id_byte(var0, var1, var2, var3.id_break(), var5, var6, var7);
               default:
                  break label46;
            }
         case 2:
            switch (var5) {
               case 0:
                  var8 = id_byte(var0, var1, var2, var3.id_protected(), var5, var6, var7);
                  var9 = id_byte(var0, var1, var2, var3.id_private(), var5, var6, var7);
                  break;
               case 1:
                  var8 = id_byte(var0, var1, var2, var3.id_private(), var5, var6, var7);
                  var9 = id_byte(var0, var1, var2, var3.id_protected(), var5, var6, var7);
                  break;
               case 2:
                  var8 = id_byte(var0, var1, var2, var3.id_break(), var5, var6, var7);
                  var9 = id_byte(var0, var1, var2, var3.id_final(), var5, var6, var7);
                  break;
               case 3:
                  var8 = id_byte(var0, var1, var2, var3.id_final(), var5, var6, var7);
                  var9 = id_byte(var0, var1, var2, var3.id_break(), var5, var6, var7);
                  break;
               case 4:
                  var8 = id_byte(var0, var1, var2, var3.id_private(), var5, var6, var7);
                  var9 = id_byte(var0, var1, var2, var3.id_protected(), var5, var6, var7);
                  break;
               case 5:
                  var8 = id_byte(var0, var1, var2, var3.id_private(), var5, var6, var7);
                  var9 = id_byte(var0, var1, var2, var3.id_protected(), var5, var6, var7);
            }
      }

      byte var10 = 3;
      if (var8) {
         if (var9) {
            var10 = 1;
         } else {
            var10 = 2;
         }
      } else if (var9) {
         var10 = 0;
      } else {
         var10 = 3;
      }

      return var0.id_goto[var10];
   }

   private static boolean id_class(rRq_1 var0, xc_3 var1, rfH_2 var2, wK_2 var3, rrxF_2 var4) {
      xd_3 var5 = var1.id_break();
      if (var5 instanceof kK_2) {
         rpr_3 var6 = var3.id_protected();
         if (var6 != rpr_3.UP && var6 != rpr_3.DOWN) {
            return false;
         }

         if (!var3.id_volatile()) {
            return false;
         }

         rfH_2 var7 = var2.id_break(var3.id_protected());
         xc_3 var8 = var0.id_byte(var7);
         if (var8.id_break() != var5) {
            return false;
         }

         xd_3 var9 = var8.id_break();
         if (var5 instanceof zE_2 && var9 instanceof zE_2) {
            rxL_2 var10 = ((zE_2)var5).id_break();
            rxL_2 var11 = ((zE_2)var9).id_break();
            if (var10 != var11) {
               return false;
            }
         }

         double var14 = (double)var3.id_finally();
         if (var14 < 0.4) {
            if (var8.id_byte(dV_2.id_int)) {
               return true;
            }
         } else if (var14 > 0.6) {
            if (var8.id_byte(dV_2.id_final)) {
               return true;
            }
         } else {
            double var12 = var3.id_native();
            if (var12 < 0.4) {
               if (var8.id_byte(dV_2.id_volatile)) {
                  return true;
               }
            } else {
               if (!(var12 > 0.6)) {
                  return true;
               }

               if (var8.id_byte(dV_2.id_package)) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public static void id_class(fJ_2 var0) {
      id_final = (rrbM_2[][])null;
      id_package = (rrbM_2[][])null;
      id_extends = null;
      id_volatile = (Map[][])null;
      if (rrbb_3.a()) {
         rAC[] var1 = rrbb_3.d();

         for (int var2 = var1.length - 1; var2 >= 0; var2--) {
            rAC var3 = var1[var2];
            id_class(var0, var3);
         }

         id_class(var0, rrbb_3.W());
         id_this = var0.id_throws(id_implements);
         id_extends = new Map[var0.id_throws() + 1];
         id_native = new Map[var0.id_throws() + 1];
         id_volatile = new Map[var0.id_throws() + 1][];
         if (id_final.length <= 0) {
            id_final = (rrbM_2[][])null;
         }

         if (id_package.length <= 0) {
            id_package = (rrbM_2[][])null;
         }
      }
   }

   private static synchronized wK_2 id_class(fj_3 var0, wK_2 var1) {
      if (id_extends == null) {
         return var1;
      } else {
         int var2 = var0.id_new();
         if (var2 >= 0 && var2 < id_extends.length) {
            Object var3 = id_extends[var2];
            if (var3 == null) {
               var3 = new IdentityHashMap(1);
               id_extends[var2] = (Map)var3;
            }

            wK_2 var4 = (wK_2)var3.get(var1);
            if (var4 == null) {
               var4 = id_class(var1, var0);
               var3.put(var1, var4);
            }

            return var4;
         } else {
            return var1;
         }
      }
   }

   private static void id_class(int var0, int var1, boolean[] var2) {
      boolean var3 = var2[var0];
      var2[var0] = var2[var1];
      var2[var1] = var3;
   }

   private static boolean id_class(rrbM_2 var0, rRq_1 var1, xc_3 var2, rfH_2 var3, int var4, fj_3 var5, int var6) {
      xc_3 var7 = var1.id_byte(var3);
      if (!id_class(var7, var1, var3)) {
         return false;
      } else if (var0.id_while != null && !rrMl_1.id_class(var7.id_continue(), var7.id_super(), var0.id_while)) {
         return false;
      } else {
         if (var0.id_instanceof != null) {
            fj_3 var8 = id_class(var1, var2, var3, var7, var4);
            if (!rrbb_3.id_break(var8, var0.id_instanceof)) {
               return false;
            }
         }

         rfH_2 var10 = var3.id_break(id_class(var4));
         xc_3 var9 = var1.id_byte(var10);
         if (var9.id_implements(var1, var10)) {
            return false;
         } else {
            return var4 == 1 && var9.id_break() == xu_3.Pq ? false : !id_class(var0, var1, var2, var3, var7, var4, var5, var6);
         }
      }
   }

   private static boolean id_class(xc_3 var0, rRq_1 var1, rfH_2 var2) {
      if (rrWP.id_class(var0, var1, var2)) {
         return true;
      } else {
         xd_3 var3 = var0.id_break();
         return var3 instanceof dK_2 ? true : var3 instanceof zs_3;
      }
   }

   protected static wK_2[] id_class(fj_3 var0, wK_2 var1, rrxF_2 var2) {
      if (var0 == null) {
         return null;
      } else if (var0 == id_finally) {
         return var2.id_break(var1);
      } else {
         wK_2 var3 = id_class(var0, var1);
         return var2.id_break(var3);
      }
   }

   private static void id_class(rrbM_2 var0, List var1) {
      if (var0.id_public != null) {
         for (int var2 = 0; var2 < var0.id_public.length; var2++) {
            fj_3 var3 = var0.id_public[var2];
            if (!(var3 instanceof fj_3)) {
               rrbb_3.id_protected("TextureAtlasSprite is not TextureAtlasSprite: " + var3 + ", name: " + var3.id_finally());
            } else {
               int var4 = var3.id_new();
               if (var4 < 0) {
                  rrbb_3.id_protected("Invalid tile ID: " + var4 + ", icon: " + var3.id_finally());
               } else {
                  id_class(var0, var1, var4);
               }
            }
         }
      }
   }

   private static void id_class(rrbM_2 var0, List var1, int var2) {
      while (var2 >= var1.size()) {
         var1.add(null);
      }

      Object var3 = (List)var1.get(var2);
      if (var3 == null) {
         var3 = new ArrayList();
         var1.set(var2, var3);
      }

      var3.add(var0);
   }

   public static wK_2[] id_class(rRp_1 var0, xc_3 var1, rfH_2 var2, wK_2 var3, rrxF_2 var4) {
      fj_3 var5 = var3.id_case();
      if (var5 == null) {
         return var4.id_break(var3);
      } else if (id_class((rRq_1)var0, var1, var2, var3, var4)) {
         var3 = id_class(id_this, var3);
         return var4.id_break(var3);
      } else {
         rpr_3 var6 = var3.id_protected();
         return id_class(var0, var1, var2, var6, var3, var4);
      }
   }

   private static void id_class(List var0, String var1, String var2) {
      String var3 = "optifine/ctm/default/";
      rqO_2 var4 = new rqO_2(var1);
      rAC var5 = rrbb_3.id_throws(var4);
      if (var5 != null) {
         if (var5.id_class().equals("Programmer Art")) {
            String var6 = var3 + "programmer_art/";
            var0.add(var6 + var2);
         } else if (var5 == rrbb_3.W()) {
            var0.add(var3 + var2);
         }
      }
   }

   protected static Map[][] id_class() {
      return id_volatile;
   }

   public static void id_class(fJ_2 var0, rAC var1) {
      String[] var2 = rrzM_2.id_class(var1, "optifine/ctm/", ".properties", id_byte());
      Arrays.sort(var2);
      List var3 = id_class(id_package);
      List var4 = id_class(id_final);

      for (int var5 = 0; var5 < var2.length; var5++) {
         String var6 = var2[var5];
         rrbb_3.id_byte("ConnectedTextures: " + var6);

         try {
            rqO_2 var7 = new rqO_2(var6);
            InputStream var8 = var1.id_class(rAI.CLIENT_RESOURCES, var7);
            if (var8 == null) {
               rrbb_3.id_protected("ConnectedTextures file not found: " + var6);
            } else {
               rrzE_2 var9 = new rrzE_2();
               var9.load(var8);
               var8.close();
               rrbM_2 var10 = new rrbM_2(var9, var6);
               if (var10.id_class(var6)) {
                  var10.id_class(var0);
                  id_class(var10, var3);
                  id_break(var10, var4);
               }
            }
         } catch (FileNotFoundException var11) {
            rrbb_3.id_protected("ConnectedTextures file not found: " + var6);
         } catch (Exception var12) {
            var12.printStackTrace();
         }
      }

      id_final = id_class(var4);
      id_package = id_class(var3);
      id_int = id_break();
      rrbb_3.id_byte("Multipass connected textures: " + id_int);
   }

   private static fj_3 id_class(fJ_2 var0, rqO_2 var1) {
      fj_3 var2 = var0.id_break(var1);
      if (var2 == null || var2 instanceof fQ_2) {
         rrbb_3.id_protected("Missing CTM sprite: " + var1);
      }

      return var2;
   }

   private static void id_class(rrbM_2[][] var0, fJ_2 var1) {
      if (var0 != null) {
         for (int var2 = 0; var2 < var0.length; var2++) {
            rrbM_2[] var3 = var0[var2];
            if (var3 != null) {
               for (int var4 = 0; var4 < var3.length; var4++) {
                  rrbM_2 var5 = var3[var4];
                  if (var5 != null) {
                     var5.id_break(var1);
                  }
               }
            }
         }
      }
   }

   private static List id_class(rrbM_2[][] var0) {
      ArrayList var1 = new ArrayList();
      if (var0 != null) {
         for (int var2 = 0; var2 < var0.length; var2++) {
            rrbM_2[] var3 = var0[var2];
            ArrayList var4 = null;
            if (var3 != null) {
               var4 = new ArrayList<>(Arrays.asList(var3));
            }

            var1.add(var4);
         }
      }

      return var1;
   }

   private static rrbM_2[][] id_class(List var0) {
      rrbM_2[][] var1 = new rrbM_2[var0.size()][];

      for (int var2 = 0; var2 < var0.size(); var2++) {
         List var3 = (List)var0.get(var2);
         if (var3 != null) {
            rrbM_2[] var4 = var3.toArray(new rrbM_2[var3.size()]);
            var1[var2] = var4;
         }
      }

      return var1;
   }

   private static int id_class(int var0, int var1) {
      switch (var1) {
         case 0:
            return var0;
         case 1:
            switch (var0) {
               case 0:
                  return 2;
               case 1:
                  return 3;
               case 2:
                  return 1;
               case 3:
                  return 0;
               default:
                  return var0;
            }
         case 2:
            switch (var0) {
               case 0:
                  return 4;
               case 1:
                  return 5;
               case 2:
               case 3:
               default:
                  return var0;
               case 4:
                  return 1;
               case 5:
                  return 0;
            }
         default:
            return var0;
      }
   }

   private static int id_class(xc_3 var0) {
      rpB_2 var1 = var0.id_byte(WL.id_new);
      switch (var1) {
         case X:
            return 2;
         case Z:
            return 1;
         default:
            return 0;
      }
   }

   private static fj_3 id_class(rrbM_2 var0, rRq_1 var1, xc_3 var2, rfH_2 var3, int var4) {
      if (var0.id_goto.length == 1) {
         return var0.id_goto[0];
      } else {
         int var5 = var4 / var0.id_super * var0.id_super;
         if (var0.id_this) {
            rfH_2 var6 = var3.id_break();

            for (xc_3 var7 = var1.id_byte(var6); var7.id_break() == var2.id_break(); var7 = var1.id_byte(var6)) {
               var3 = var6;
               var6 = var6.id_break();
               if (var6.c_() < 0) {
                  break;
               }
            }
         }

         int var11 = rrbb_3.id_class(var3, var5) & 2147483647;

         for (int var12 = 0; var12 < var0.id_continue; var12++) {
            var11 = rrbb_3.id_class(var11);
         }

         int var13 = 0;
         if (var0.id_new == null) {
            var13 = var11 % var0.id_goto.length;
         } else {
            int var8 = var11 % var0.id_return;
            int[] var9 = var0.id_synchronized;

            for (int var10 = 0; var10 < var9.length; var10++) {
               if (var8 < var9[var10]) {
                  var13 = var10;
                  break;
               }
            }
         }

         return var0.id_goto[var13];
      }
   }

   private static fj_3 id_class(rrbM_2 var0) {
      return var0.id_goto[0];
   }

   private static fj_3 id_class(rrbM_2 var0, rfH_2 var1, int var2) {
      if (var0.id_goto.length == 1) {
         return var0.id_goto[0];
      } else {
         int var3 = var1.b_();
         int var4 = var1.c_();
         int var5 = var1.d_();
         int var6 = 0;
         int var7 = 0;
         switch (var2) {
            case 0:
               var6 = var3;
               var7 = -var5 - 1;
               break;
            case 1:
               var6 = var3;
               var7 = var5;
               break;
            case 2:
               var6 = -var3 - 1;
               var7 = -var4;
               break;
            case 3:
               var6 = var3;
               var7 = -var4;
               break;
            case 4:
               var6 = var5;
               var7 = -var4;
               break;
            case 5:
               var6 = -var5 - 1;
               var7 = -var4;
         }

         var6 %= var0.id_package;
         var7 %= var0.id_int;
         if (var6 < 0) {
            var6 += var0.id_package;
         }

         if (var7 < 0) {
            var7 += var0.id_int;
         }

         int var8 = var7 * var0.id_package + var6;
         return var0.id_goto[var8];
      }
   }

   private static fj_3 id_class(rrbM_2 var0, rRq_1 var1, xc_3 var2, rfH_2 var3, int var4, int var5, fj_3 var6, int var7, rrxF_2 var8) {
      int var9 = id_break(var0, var1, var2, var3, var4, var5, var6, var7, var8);
      return var0.id_goto[var9];
   }

   private static void id_class(int[] var0, int var1, fj_3 var2, fj_3 var3) {
      int var4 = var0.length / 4;
      int var5 = var4 * var1;
      float var6 = Float.intBitsToFloat(var0[var5 + 4]);
      float var7 = Float.intBitsToFloat(var0[var5 + 4 + 1]);
      double var8 = var2.id_class(var6);
      double var10 = var2.id_break(var7);
      var0[var5 + 4] = Float.floatToRawIntBits(var3.id_class(var8));
      var0[var5 + 4 + 1] = Float.floatToRawIntBits(var3.id_break(var10));
   }

   private static wK_2[] id_class(rRp_1 var0, xc_3 var1, rfH_2 var2, rpr_3 var3, wK_2 var4, rrxF_2 var5) {
      wK_2[] var6 = id_class(var0, var1, var2, var3, var4, true, 0, var5);
      if (!id_int) {
         return var6;
      } else if (var6.length == 1 && var6[0] == var4) {
         return var6;
      } else {
         List var7 = var5.id_class(var6);

         for (int var8 = 0; var8 < var7.size(); var8++) {
            wK_2 var9 = (wK_2)var7.get(var8);
            wK_2 var10 = var9;

            for (int var11 = 0; var11 < 3; var11++) {
               wK_2[] var12 = id_class(var0, var1, var2, var3, var10, false, var11 + 1, var5);
               if (var12.length != 1 || var12[0] == var10) {
                  break;
               }

               var10 = var12[0];
            }

            var7.set(var8, var10);
         }

         for (int var13 = 0; var13 < var6.length; var13++) {
            var6[var13] = (wK_2)var7.get(var13);
         }

         return var6;
      }
   }

   public static wK_2[] id_class(rRp_1 var0, xc_3 var1, rfH_2 var2, rpr_3 var3, wK_2 var4, boolean var5, int var6, rrxF_2 var7) {
      xd_3 var8 = var1.id_break();
      fj_3 var9 = var4.id_case();
      if (id_package != null) {
         int var10 = var9.id_new();
         if (var10 >= 0 && var10 < id_package.length) {
            rrbM_2[] var11 = id_package[var10];
            if (var11 != null) {
               int var12 = id_class(var3);

               for (int var13 = 0; var13 < var11.length; var13++) {
                  rrbM_2 var14 = var11[var13];
                  if (var14 != null && var14.id_class(var1.id_continue())) {
                     wK_2[] var15 = id_class(var14, var0, var1, var2, var12, var4, var6, var7);
                     if (var15 != null) {
                        return var15;
                     }
                  }
               }
            }
         }
      }

      if (id_final != null && var5) {
         int var16 = var7.id_class();
         if (var16 >= 0 && var16 < id_final.length) {
            rrbM_2[] var17 = id_final[var16];
            if (var17 != null) {
               int var18 = id_class(var3);

               for (int var19 = 0; var19 < var17.length; var19++) {
                  rrbM_2 var20 = var17[var19];
                  if (var20 != null && var20.id_class(var9)) {
                     wK_2[] var21 = id_class(var20, var0, var1, var2, var18, var4, var6, var7);
                     if (var21 != null) {
                        return var21;
                     }
                  }
               }
            }
         }
      }

      return var7.id_break(var4);
   }

   public static int id_class(rpr_3 var0) {
      if (var0 == null) {
         return -1;
      } else {
         switch (var0) {
            case DOWN:
               return 0;
            case UP:
               return 1;
            case EAST:
               return 5;
            case WEST:
               return 4;
            case NORTH:
               return 2;
            case SOUTH:
               return 3;
            default:
               return -1;
         }
      }
   }

   private static rpr_3 id_class(int var0) {
      switch (var0) {
         case 0:
            return rpr_3.DOWN;
         case 1:
            return rpr_3.UP;
         case 2:
            return rpr_3.NORTH;
         case 3:
            return rpr_3.SOUTH;
         case 4:
            return rpr_3.WEST;
         case 5:
            return rpr_3.EAST;
         default:
            return rpr_3.UP;
      }
   }

   private static wK_2[] id_class(rrbM_2 var0, rRp_1 var1, xc_3 var2, rfH_2 var3, int var4, wK_2 var5, int var6, rrxF_2 var7) {
      int var8 = 0;
      int var9 = var2.id_super();
      xd_3 var10 = var2.id_break();
      if (var10 instanceof WL) {
         var8 = id_class(var2);
      }

      if (!var0.id_class(var2.id_continue(), var9)) {
         return null;
      } else {
         if (var4 >= 0 && var0.id_implements != 63) {
            int var11 = var4;
            if (var8 != 0) {
               var11 = id_class(var4, var8);
            }

            if ((1 << var11 & var0.id_implements) == 0) {
               return null;
            }
         }

         int var13 = var3.c_();
         if (var0.id_extends != null && !var0.id_extends.id_class(var13)) {
            return null;
         } else {
            if (var0.id_finally != null) {
               rYG var12 = rrWr_1.id_class(var1, var3);
               if (!var0.id_class(var12)) {
                  return null;
               }
            }

            if (var0.id_else != null) {
               String var14 = rrzz_3.id_class(var1, var3);
               if (!var0.id_else.id_class(var14)) {
                  return null;
               }
            }

            fj_3 var15 = var5.id_case();
            switch (var0.id_case) {
               case 1:
                  return id_class(id_class(var0, var1, var2, var3, var8, var4, var15, var9, var7), var5, var7);
               case 2:
                  return id_class(id_class(var0, var1, var2, var3, var8, var4, var15, var9), var5, var7);
               case 3:
                  return id_class(id_throws(var0, var1, var2, var3, var8, var4, var15, var9), var5, var7);
               case 4:
                  return id_class(id_class(var0, var1, var2, var3, var4), var5, var7);
               case 5:
                  return id_class(id_class(var0, var3, var4), var5, var7);
               case 6:
                  return id_class(id_break(var0, var1, var2, var3, var8, var4, var15, var9), var5, var7);
               case 7:
                  return id_class(id_class(var0), var5, var7);
               case 8:
                  return id_class(id_byte(var0, var1, var2, var3, var8, var4, var15, var9), var5, var7);
               case 9:
                  return id_class(id_protected(var0, var1, var2, var3, var8, var4, var15, var9), var5, var7);
               case 10:
                  if (var6 == 0) {
                     return id_class(var0, var1, var2, var3, var8, var4, var5, var9, var7);
                  }
               default:
                  return null;
               case 11:
                  return id_break(var0, var1, var2, var3, var8, var4, var5, var9, var7);
               case 12:
                  return id_class(var0, var5, var7);
               case 13:
                  return id_class(var0, var1, var2, var3, var4, var5, var7);
               case 14:
                  return id_class(var0, var3, var4, var5, var7);
               case 15:
                  return id_byte(var0, var1, var2, var3, var8, var4, var5, var9, var7);
            }
         }
      }
   }

   private static synchronized wK_2[] id_class(rrbM_2 var0, rRq_1 var1, xc_3 var2, rfH_2 var3, int var4, int var5, wK_2 var6, int var7, rrxF_2 var8) {
      fj_3 var9 = var6.id_case();
      int var10 = id_break(var0, var1, var2, var3, var4, var5, var9, var7, var8);
      return rrbX_2.id_class(var10, var0, var5, var6, var8);
   }

   private static wK_2 id_class(wK_2 var0, fj_3 var1) {
      int[] var2 = (int[])var0.id_class().clone();
      fj_3 var3 = var0.id_case();

      for (int var4 = 0; var4 < 4; var4++) {
         id_class(var2, var4, var3, var1);
      }

      return new wK_2(var2, var0.id_byte(), var0.id_protected(), var1, var0.id_throws());
   }

   private static wK_2[] id_class(rrbM_2 var0, rRq_1 var1, xc_3 var2, rfH_2 var3, int var4, wK_2 var5, rrxF_2 var6) {
      if (!var5.id_final()) {
         return null;
      } else {
         rrJp_1 var7 = var6.id_class(var0.id_char);

         Object var8;
         try {
            fj_3 var9 = id_class(var0, var1, var2, var3, var4);
            if (var9 != null) {
               var7.id_class(id_class(var9, var5, var0.id_throw), var0.id_interface);
            }

            var8 = null;
         } finally {
            if (var7.id_class() > 0) {
               var6.id_class(true);
            }
         }

         return (wK_2[])var8;
      }
   }

   private static wK_2[] id_class(rrbM_2 var0, wK_2 var1, rrxF_2 var2) {
      if (!var1.id_final()) {
         return null;
      } else {
         rrJp_1 var3 = var2.id_class(var0.id_char);

         Object var4;
         try {
            fj_3 var5 = id_class(var0);
            if (var5 != null) {
               var3.id_class(id_class(var5, var1, var0.id_throw), var0.id_interface);
            }

            var4 = null;
         } finally {
            if (var3.id_class() > 0) {
               var2.id_class(true);
            }
         }

         return (wK_2[])var4;
      }
   }

   private static wK_2[] id_class(rrbM_2 var0, rfH_2 var1, int var2, wK_2 var3, rrxF_2 var4) {
      if (!var3.id_final()) {
         return null;
      } else {
         rrJp_1 var5 = var4.id_class(var0.id_char);

         Object var6;
         try {
            fj_3 var7 = id_class(var0, var1, var2);
            if (var7 != null) {
               var5.id_class(id_class(var7, var3, var0.id_throw), var0.id_interface);
            }

            var6 = null;
         } finally {
            if (var5.id_class() > 0) {
               var4.id_class(true);
            }
         }

         return (wK_2[])var6;
      }
   }

   private static synchronized wK_2 id_class(fj_3 var0, wK_2 var1, int var2) {
      if (id_native == null) {
         return null;
      } else if (var0 == null) {
         return null;
      } else {
         int var3 = var0.id_new();
         if (var3 >= 0 && var3 < id_native.length) {
            Object var4 = id_native[var3];
            if (var4 == null) {
               var4 = new EnumMap<>(rpr_3.class);
               id_native[var3] = (Map)var4;
            }

            rpr_3 var5 = var1.id_protected();
            wK_2 var6 = (wK_2)var4.get(var5);
            if (var6 == null) {
               var6 = rrJy_1.id_class(var5, var0, var2);
               var4.put(var5, var6);
            }

            return var6;
         } else {
            return null;
         }
      }
   }

   private static boolean id_break(rrbM_2 var0, rRq_1 var1, xc_3 var2, rfH_2 var3, int var4, fj_3 var5, int var6) {
      xc_3 var7 = var1.id_byte(var3);
      if (var7 == id_private) {
         return false;
      } else if (var0.id_byte != null && !var0.id_class(var7.id_continue(), var7.id_super())) {
         return false;
      } else {
         if (var0.id_public != null) {
            fj_3 var8 = id_class(var1, var2, var3, var7, var4);
            if (var8 != var5) {
               return false;
            }
         }

         rfH_2 var10 = var3.id_break(id_class(var4));
         xc_3 var9 = var1.id_byte(var10);
         return var9.id_implements(var1, var10) ? false : var4 != 1 || var9.id_break() != xu_3.Pq;
      }
   }

   private static void id_break(rrbM_2 var0, List var1) {
      if (var0.id_byte != null) {
         for (int var2 = 0; var2 < var0.id_byte.length; var2++) {
            int var3 = var0.id_byte[var2].id_class();
            if (var3 < 0) {
               rrbb_3.id_protected("Invalid block ID: " + var3);
            } else {
               id_class(var0, var1, var3);
            }
         }
      }
   }

   private static rrGa_1[] id_break(int var0, int var1) {
      switch (var0) {
         case 0:
            return id_else;
         case 1:
            return id_synchronized;
         case 2:
            return id_return;
         case 3:
            return id_public;
         case 4:
            return id_goto;
         case 5:
            return id_while;
         default:
            throw new IllegalArgumentException("Unknown side: " + var0);
      }
   }

   private static int id_break(rrbM_2 var0, rRq_1 var1, xc_3 var2, rfH_2 var3, int var4, int var5, fj_3 var6, int var7, rrxF_2 var8) {
      boolean[] var9 = var8.id_implements();
      switch (var5) {
         case 0:
            var9[0] = id_byte(var0, var1, var2, var3.id_byte(), var5, var6, var7);
            var9[1] = id_byte(var0, var1, var2, var3.id_extends(), var5, var6, var7);
            var9[2] = id_byte(var0, var1, var2, var3.id_private(), var5, var6, var7);
            var9[3] = id_byte(var0, var1, var2, var3.id_protected(), var5, var6, var7);
            if (var0.id_volatile) {
               rfH_2 var16 = var3.id_break();
               var9[0] = var9[0] && !id_byte(var0, var1, var2, var16.id_byte(), var5, var6, var7);
               var9[1] = var9[1] && !id_byte(var0, var1, var2, var16.id_extends(), var5, var6, var7);
               var9[2] = var9[2] && !id_byte(var0, var1, var2, var16.id_private(), var5, var6, var7);
               var9[3] = var9[3] && !id_byte(var0, var1, var2, var16.id_protected(), var5, var6, var7);
            }
            break;
         case 1:
            var9[0] = id_byte(var0, var1, var2, var3.id_byte(), var5, var6, var7);
            var9[1] = id_byte(var0, var1, var2, var3.id_extends(), var5, var6, var7);
            var9[2] = id_byte(var0, var1, var2, var3.id_protected(), var5, var6, var7);
            var9[3] = id_byte(var0, var1, var2, var3.id_private(), var5, var6, var7);
            if (var0.id_volatile) {
               rfH_2 var15 = var3.id_final();
               var9[0] = var9[0] && !id_byte(var0, var1, var2, var15.id_byte(), var5, var6, var7);
               var9[1] = var9[1] && !id_byte(var0, var1, var2, var15.id_extends(), var5, var6, var7);
               var9[2] = var9[2] && !id_byte(var0, var1, var2, var15.id_protected(), var5, var6, var7);
               var9[3] = var9[3] && !id_byte(var0, var1, var2, var15.id_private(), var5, var6, var7);
            }
            break;
         case 2:
            var9[0] = id_byte(var0, var1, var2, var3.id_extends(), var5, var6, var7);
            var9[1] = id_byte(var0, var1, var2, var3.id_byte(), var5, var6, var7);
            var9[2] = id_byte(var0, var1, var2, var3.id_break(), var5, var6, var7);
            var9[3] = id_byte(var0, var1, var2, var3.id_final(), var5, var6, var7);
            if (var0.id_volatile) {
               rfH_2 var14 = var3.id_private();
               var9[0] = var9[0] && !id_byte(var0, var1, var2, var14.id_extends(), var5, var6, var7);
               var9[1] = var9[1] && !id_byte(var0, var1, var2, var14.id_byte(), var5, var6, var7);
               var9[2] = var9[2] && !id_byte(var0, var1, var2, var14.id_break(), var5, var6, var7);
               var9[3] = var9[3] && !id_byte(var0, var1, var2, var14.id_final(), var5, var6, var7);
            }
            break;
         case 3:
            var9[0] = id_byte(var0, var1, var2, var3.id_byte(), var5, var6, var7);
            var9[1] = id_byte(var0, var1, var2, var3.id_extends(), var5, var6, var7);
            var9[2] = id_byte(var0, var1, var2, var3.id_break(), var5, var6, var7);
            var9[3] = id_byte(var0, var1, var2, var3.id_final(), var5, var6, var7);
            if (var0.id_volatile) {
               rfH_2 var13 = var3.id_protected();
               var9[0] = var9[0] && !id_byte(var0, var1, var2, var13.id_byte(), var5, var6, var7);
               var9[1] = var9[1] && !id_byte(var0, var1, var2, var13.id_extends(), var5, var6, var7);
               var9[2] = var9[2] && !id_byte(var0, var1, var2, var13.id_break(), var5, var6, var7);
               var9[3] = var9[3] && !id_byte(var0, var1, var2, var13.id_final(), var5, var6, var7);
            }
            break;
         case 4:
            var9[0] = id_byte(var0, var1, var2, var3.id_private(), var5, var6, var7);
            var9[1] = id_byte(var0, var1, var2, var3.id_protected(), var5, var6, var7);
            var9[2] = id_byte(var0, var1, var2, var3.id_break(), var5, var6, var7);
            var9[3] = id_byte(var0, var1, var2, var3.id_final(), var5, var6, var7);
            if (var0.id_volatile) {
               rfH_2 var12 = var3.id_byte();
               var9[0] = var9[0] && !id_byte(var0, var1, var2, var12.id_private(), var5, var6, var7);
               var9[1] = var9[1] && !id_byte(var0, var1, var2, var12.id_protected(), var5, var6, var7);
               var9[2] = var9[2] && !id_byte(var0, var1, var2, var12.id_break(), var5, var6, var7);
               var9[3] = var9[3] && !id_byte(var0, var1, var2, var12.id_final(), var5, var6, var7);
            }
            break;
         case 5:
            var9[0] = id_byte(var0, var1, var2, var3.id_protected(), var5, var6, var7);
            var9[1] = id_byte(var0, var1, var2, var3.id_private(), var5, var6, var7);
            var9[2] = id_byte(var0, var1, var2, var3.id_break(), var5, var6, var7);
            var9[3] = id_byte(var0, var1, var2, var3.id_final(), var5, var6, var7);
            if (var0.id_volatile) {
               rfH_2 var10 = var3.id_extends();
               var9[0] = var9[0] && !id_byte(var0, var1, var2, var10.id_protected(), var5, var6, var7);
               var9[1] = var9[1] && !id_byte(var0, var1, var2, var10.id_private(), var5, var6, var7);
               var9[2] = var9[2] && !id_byte(var0, var1, var2, var10.id_break(), var5, var6, var7);
               var9[3] = var9[3] && !id_byte(var0, var1, var2, var10.id_final(), var5, var6, var7);
            }
      }

      byte var17 = 0;
      if (var9[0] & !var9[1] & !var9[2] & !var9[3]) {
         var17 = 3;
      } else if (!var9[0] & var9[1] & !var9[2] & !var9[3]) {
         var17 = 1;
      } else if (!var9[0] & !var9[1] & var9[2] & !var9[3]) {
         var17 = 12;
      } else if (!var9[0] & !var9[1] & !var9[2] & var9[3]) {
         var17 = 36;
      } else if (var9[0] & var9[1] & !var9[2] & !var9[3]) {
         var17 = 2;
      } else if (!var9[0] & !var9[1] & var9[2] & var9[3]) {
         var17 = 24;
      } else if (var9[0] & !var9[1] & var9[2] & !var9[3]) {
         var17 = 15;
      } else if (var9[0] & !var9[1] & !var9[2] & var9[3]) {
         var17 = 39;
      } else if (!var9[0] & var9[1] & var9[2] & !var9[3]) {
         var17 = 13;
      } else if (!var9[0] & var9[1] & !var9[2] & var9[3]) {
         var17 = 37;
      } else if (!var9[0] & var9[1] & var9[2] & var9[3]) {
         var17 = 25;
      } else if (var9[0] & !var9[1] & var9[2] & var9[3]) {
         var17 = 27;
      } else if (var9[0] & var9[1] & !var9[2] & var9[3]) {
         var17 = 38;
      } else if (var9[0] & var9[1] & var9[2] & !var9[3]) {
         var17 = 14;
      } else if (var9[0] & var9[1] & var9[2] & var9[3]) {
         var17 = 26;
      }

      if (var17 == 0) {
         return var17;
      } else if (!rrbb_3.rP()) {
         return var17;
      } else {
         switch (var5) {
            case 0:
               var9[0] = !id_byte(var0, var1, var2, var3.id_extends().id_private(), var5, var6, var7);
               var9[1] = !id_byte(var0, var1, var2, var3.id_byte().id_private(), var5, var6, var7);
               var9[2] = !id_byte(var0, var1, var2, var3.id_extends().id_protected(), var5, var6, var7);
               var9[3] = !id_byte(var0, var1, var2, var3.id_byte().id_protected(), var5, var6, var7);
               if (var0.id_volatile) {
                  rfH_2 var22 = var3.id_break();
                  var9[0] = var9[0] || id_byte(var0, var1, var2, var22.id_extends().id_private(), var5, var6, var7);
                  var9[1] = var9[1] || id_byte(var0, var1, var2, var22.id_byte().id_private(), var5, var6, var7);
                  var9[2] = var9[2] || id_byte(var0, var1, var2, var22.id_extends().id_protected(), var5, var6, var7);
                  var9[3] = var9[3] || id_byte(var0, var1, var2, var22.id_byte().id_protected(), var5, var6, var7);
               }
               break;
            case 1:
               var9[0] = !id_byte(var0, var1, var2, var3.id_extends().id_protected(), var5, var6, var7);
               var9[1] = !id_byte(var0, var1, var2, var3.id_byte().id_protected(), var5, var6, var7);
               var9[2] = !id_byte(var0, var1, var2, var3.id_extends().id_private(), var5, var6, var7);
               var9[3] = !id_byte(var0, var1, var2, var3.id_byte().id_private(), var5, var6, var7);
               if (var0.id_volatile) {
                  rfH_2 var21 = var3.id_final();
                  var9[0] = var9[0] || id_byte(var0, var1, var2, var21.id_extends().id_protected(), var5, var6, var7);
                  var9[1] = var9[1] || id_byte(var0, var1, var2, var21.id_byte().id_protected(), var5, var6, var7);
                  var9[2] = var9[2] || id_byte(var0, var1, var2, var21.id_extends().id_private(), var5, var6, var7);
                  var9[3] = var9[3] || id_byte(var0, var1, var2, var21.id_byte().id_private(), var5, var6, var7);
               }
               break;
            case 2:
               var9[0] = !id_byte(var0, var1, var2, var3.id_byte().id_break(), var5, var6, var7);
               var9[1] = !id_byte(var0, var1, var2, var3.id_extends().id_break(), var5, var6, var7);
               var9[2] = !id_byte(var0, var1, var2, var3.id_byte().id_final(), var5, var6, var7);
               var9[3] = !id_byte(var0, var1, var2, var3.id_extends().id_final(), var5, var6, var7);
               if (var0.id_volatile) {
                  rfH_2 var20 = var3.id_private();
                  var9[0] = var9[0] || id_byte(var0, var1, var2, var20.id_byte().id_break(), var5, var6, var7);
                  var9[1] = var9[1] || id_byte(var0, var1, var2, var20.id_extends().id_break(), var5, var6, var7);
                  var9[2] = var9[2] || id_byte(var0, var1, var2, var20.id_byte().id_final(), var5, var6, var7);
                  var9[3] = var9[3] || id_byte(var0, var1, var2, var20.id_extends().id_final(), var5, var6, var7);
               }
               break;
            case 3:
               var9[0] = !id_byte(var0, var1, var2, var3.id_extends().id_break(), var5, var6, var7);
               var9[1] = !id_byte(var0, var1, var2, var3.id_byte().id_break(), var5, var6, var7);
               var9[2] = !id_byte(var0, var1, var2, var3.id_extends().id_final(), var5, var6, var7);
               var9[3] = !id_byte(var0, var1, var2, var3.id_byte().id_final(), var5, var6, var7);
               if (var0.id_volatile) {
                  rfH_2 var19 = var3.id_protected();
                  var9[0] = var9[0] || id_byte(var0, var1, var2, var19.id_extends().id_break(), var5, var6, var7);
                  var9[1] = var9[1] || id_byte(var0, var1, var2, var19.id_byte().id_break(), var5, var6, var7);
                  var9[2] = var9[2] || id_byte(var0, var1, var2, var19.id_extends().id_final(), var5, var6, var7);
                  var9[3] = var9[3] || id_byte(var0, var1, var2, var19.id_byte().id_final(), var5, var6, var7);
               }
               break;
            case 4:
               var9[0] = !id_byte(var0, var1, var2, var3.id_break().id_protected(), var5, var6, var7);
               var9[1] = !id_byte(var0, var1, var2, var3.id_break().id_private(), var5, var6, var7);
               var9[2] = !id_byte(var0, var1, var2, var3.id_final().id_protected(), var5, var6, var7);
               var9[3] = !id_byte(var0, var1, var2, var3.id_final().id_private(), var5, var6, var7);
               if (var0.id_volatile) {
                  rfH_2 var18 = var3.id_byte();
                  var9[0] = var9[0] || id_byte(var0, var1, var2, var18.id_break().id_protected(), var5, var6, var7);
                  var9[1] = var9[1] || id_byte(var0, var1, var2, var18.id_break().id_private(), var5, var6, var7);
                  var9[2] = var9[2] || id_byte(var0, var1, var2, var18.id_final().id_protected(), var5, var6, var7);
                  var9[3] = var9[3] || id_byte(var0, var1, var2, var18.id_final().id_private(), var5, var6, var7);
               }
               break;
            case 5:
               var9[0] = !id_byte(var0, var1, var2, var3.id_break().id_private(), var5, var6, var7);
               var9[1] = !id_byte(var0, var1, var2, var3.id_break().id_protected(), var5, var6, var7);
               var9[2] = !id_byte(var0, var1, var2, var3.id_final().id_private(), var5, var6, var7);
               var9[3] = !id_byte(var0, var1, var2, var3.id_final().id_protected(), var5, var6, var7);
               if (var0.id_volatile) {
                  rfH_2 var11 = var3.id_extends();
                  var9[0] = var9[0] || id_byte(var0, var1, var2, var11.id_break().id_private(), var5, var6, var7);
                  var9[1] = var9[1] || id_byte(var0, var1, var2, var11.id_break().id_protected(), var5, var6, var7);
                  var9[2] = var9[2] || id_byte(var0, var1, var2, var11.id_final().id_private(), var5, var6, var7);
                  var9[3] = var9[3] || id_byte(var0, var1, var2, var11.id_final().id_protected(), var5, var6, var7);
               }
         }

         if (var17 == 13 && var9[0]) {
            var17 = 4;
         } else if (var17 == 15 && var9[1]) {
            var17 = 5;
         } else if (var17 == 37 && var9[2]) {
            var17 = 16;
         } else if (var17 == 39 && var9[3]) {
            var17 = 17;
         } else if (var17 == 14 && var9[0] && var9[1]) {
            var17 = 7;
         } else if (var17 == 25 && var9[0] && var9[2]) {
            var17 = 6;
         } else if (var17 == 27 && var9[3] && var9[1]) {
            var17 = 19;
         } else if (var17 == 38 && var9[3] && var9[2]) {
            var17 = 18;
         } else if (var17 == 14 && !var9[0] && var9[1]) {
            var17 = 31;
         } else if (var17 == 25 && var9[0] && !var9[2]) {
            var17 = 30;
         } else if (var17 == 27 && !var9[3] && var9[1]) {
            var17 = 41;
         } else if (var17 == 38 && var9[3] && !var9[2]) {
            var17 = 40;
         } else if (var17 == 14 && var9[0] && !var9[1]) {
            var17 = 29;
         } else if (var17 == 25 && !var9[0] && var9[2]) {
            var17 = 28;
         } else if (var17 == 27 && var9[3] && !var9[1]) {
            var17 = 43;
         } else if (var17 == 38 && !var9[3] && var9[2]) {
            var17 = 42;
         } else if (var17 == 26 && var9[0] && var9[1] && var9[2] && var9[3]) {
            var17 = 46;
         } else if (var17 == 26 && !var9[0] && var9[1] && var9[2] && var9[3]) {
            var17 = 9;
         } else if (var17 == 26 && var9[0] && !var9[1] && var9[2] && var9[3]) {
            var17 = 21;
         } else if (var17 == 26 && var9[0] && var9[1] && !var9[2] && var9[3]) {
            var17 = 8;
         } else if (var17 == 26 && var9[0] && var9[1] && var9[2] && !var9[3]) {
            var17 = 20;
         } else if (var17 == 26 && var9[0] && var9[1] && !var9[2] && !var9[3]) {
            var17 = 11;
         } else if (var17 == 26 && !var9[0] && !var9[1] && var9[2] && var9[3]) {
            var17 = 22;
         } else if (var17 == 26 && !var9[0] && var9[1] && !var9[2] && var9[3]) {
            var17 = 23;
         } else if (var17 == 26 && var9[0] && !var9[1] && var9[2] && !var9[3]) {
            var17 = 10;
         } else if (var17 == 26 && var9[0] && !var9[1] && !var9[2] && var9[3]) {
            var17 = 34;
         } else if (var17 == 26 && !var9[0] && var9[1] && var9[2] && !var9[3]) {
            var17 = 35;
         } else if (var17 == 26 && var9[0] && !var9[1] && !var9[2] && !var9[3]) {
            var17 = 32;
         } else if (var17 == 26 && !var9[0] && var9[1] && !var9[2] && !var9[3]) {
            var17 = 33;
         } else if (var17 == 26 && !var9[0] && !var9[1] && var9[2] && !var9[3]) {
            var17 = 44;
         } else if (var17 == 26 && !var9[0] && !var9[1] && !var9[2] && var9[3]) {
            var17 = 45;
         }

         return var17;
      }
   }

   private static fj_3 id_break(rrbM_2 var0, rRq_1 var1, xc_3 var2, rfH_2 var3, int var4, int var5, fj_3 var6, int var7) {
      boolean var8 = false;
      boolean var9 = false;
      switch (var4) {
         case 0:
            if (var5 == 1) {
               var8 = id_byte(var0, var1, var2, var3.id_protected(), var5, var6, var7);
               var9 = id_byte(var0, var1, var2, var3.id_private(), var5, var6, var7);
            } else if (var5 == 0) {
               var8 = id_byte(var0, var1, var2, var3.id_private(), var5, var6, var7);
               var9 = id_byte(var0, var1, var2, var3.id_protected(), var5, var6, var7);
            } else {
               var8 = id_byte(var0, var1, var2, var3.id_break(), var5, var6, var7);
               var9 = id_byte(var0, var1, var2, var3.id_final(), var5, var6, var7);
            }
            break;
         case 1:
            if (var5 == 3) {
               var8 = id_byte(var0, var1, var2, var3.id_break(), var5, var6, var7);
               var9 = id_byte(var0, var1, var2, var3.id_final(), var5, var6, var7);
            } else if (var5 == 2) {
               var8 = id_byte(var0, var1, var2, var3.id_final(), var5, var6, var7);
               var9 = id_byte(var0, var1, var2, var3.id_break(), var5, var6, var7);
            } else {
               var8 = id_byte(var0, var1, var2, var3.id_protected(), var5, var6, var7);
               var9 = id_byte(var0, var1, var2, var3.id_private(), var5, var6, var7);
            }
            break;
         case 2:
            if (var5 == 5) {
               var8 = id_byte(var0, var1, var2, var3.id_final(), var5, var6, var7);
               var9 = id_byte(var0, var1, var2, var3.id_break(), var5, var6, var7);
            } else if (var5 == 4) {
               var8 = id_byte(var0, var1, var2, var3.id_break(), var5, var6, var7);
               var9 = id_byte(var0, var1, var2, var3.id_final(), var5, var6, var7);
            } else {
               var8 = id_byte(var0, var1, var2, var3.id_byte(), var5, var6, var7);
               var9 = id_byte(var0, var1, var2, var3.id_extends(), var5, var6, var7);
            }
      }

      byte var10 = 3;
      if (var8) {
         if (var9) {
            var10 = 1;
         } else {
            var10 = 2;
         }
      } else if (var9) {
         var10 = 0;
      } else {
         var10 = 3;
      }

      return var0.id_goto[var10];
   }

   public static void id_break(fJ_2 var0) {
      id_class(id_final, var0);
      id_class(id_package, var0);
      id_this = id_class(var0, id_implements);
   }

   private static wK_2[] id_break(rrbM_2 var0, rRq_1 var1, xc_3 var2, rfH_2 var3, int var4, int var5, wK_2 var6, int var7, rrxF_2 var8) {
      if (!var6.id_final()) {
         return null;
      } else {
         fj_3 var9 = var6.id_case();
         rrGa_1[] var10 = id_break(var5, var4);
         boolean[] var11 = var8.id_implements();

         for (int var12 = 0; var12 < 4; var12++) {
            var11[var12] = id_class(var0, var1, var2, var10[var12].id_class(var3), var5, var9, var7);
         }

         rrJp_1 var21 = var8.id_class(var0.id_char);

         Object var13;
         try {
            if (!var11[0] || !var11[1] || !var11[2] || !var11[3]) {
               if (var11[0] && var11[1] && var11[2]) {
                  var21.id_class(id_class(var0.id_goto[5], var6, var0.id_throw), var0.id_interface);
                  return null;
               }

               if (var11[0] && var11[2] && var11[3]) {
                  var21.id_class(id_class(var0.id_goto[6], var6, var0.id_throw), var0.id_interface);
                  return null;
               }

               if (var11[1] && var11[2] && var11[3]) {
                  var21.id_class(id_class(var0.id_goto[12], var6, var0.id_throw), var0.id_interface);
                  return null;
               }

               if (var11[0] && var11[1] && var11[3]) {
                  var21.id_class(id_class(var0.id_goto[13], var6, var0.id_throw), var0.id_interface);
                  return null;
               }

               rrGa_1[] var14 = id_byte(var5, var4);
               boolean[] var15 = var8.id_finally();

               for (int var16 = 0; var16 < 4; var16++) {
                  var15[var16] = id_class(var0, var1, var2, var14[var16].id_class(var3), var5, var9, var7);
               }

               if (var11[1] && var11[2]) {
                  var21.id_class(id_class(var0.id_goto[3], var6, var0.id_throw), var0.id_interface);
                  if (var15[3]) {
                     var21.id_class(id_class(var0.id_goto[16], var6, var0.id_throw), var0.id_interface);
                  }

                  return null;
               }

               if (var11[0] && var11[2]) {
                  var21.id_class(id_class(var0.id_goto[4], var6, var0.id_throw), var0.id_interface);
                  if (var15[2]) {
                     var21.id_class(id_class(var0.id_goto[14], var6, var0.id_throw), var0.id_interface);
                  }

                  return null;
               }

               if (var11[1] && var11[3]) {
                  var21.id_class(id_class(var0.id_goto[10], var6, var0.id_throw), var0.id_interface);
                  if (var15[1]) {
                     var21.id_class(id_class(var0.id_goto[2], var6, var0.id_throw), var0.id_interface);
                  }

                  return null;
               }

               if (var11[0] && var11[3]) {
                  var21.id_class(id_class(var0.id_goto[11], var6, var0.id_throw), var0.id_interface);
                  if (var15[0]) {
                     var21.id_class(id_class(var0.id_goto[0], var6, var0.id_throw), var0.id_interface);
                  }

                  return null;
               }

               boolean[] var26 = var8.id_extends();

               for (int var17 = 0; var17 < 4; var17++) {
                  var26[var17] = id_break(var0, var1, var2, var10[var17].id_class(var3), var5, var9, var7);
               }

               if (var11[0]) {
                  var21.id_class(id_class(var0.id_goto[9], var6, var0.id_throw), var0.id_interface);
               }

               if (var11[1]) {
                  var21.id_class(id_class(var0.id_goto[7], var6, var0.id_throw), var0.id_interface);
               }

               if (var11[2]) {
                  var21.id_class(id_class(var0.id_goto[1], var6, var0.id_throw), var0.id_interface);
               }

               if (var11[3]) {
                  var21.id_class(id_class(var0.id_goto[15], var6, var0.id_throw), var0.id_interface);
               }

               if (var15[0] && (var26[1] || var26[2]) && !var11[1] && !var11[2]) {
                  var21.id_class(id_class(var0.id_goto[0], var6, var0.id_throw), var0.id_interface);
               }

               if (var15[1] && (var26[0] || var26[2]) && !var11[0] && !var11[2]) {
                  var21.id_class(id_class(var0.id_goto[2], var6, var0.id_throw), var0.id_interface);
               }

               if (var15[2] && (var26[1] || var26[3]) && !var11[1] && !var11[3]) {
                  var21.id_class(id_class(var0.id_goto[14], var6, var0.id_throw), var0.id_interface);
               }

               if (var15[3] && (var26[0] || var26[3]) && !var11[0] && !var11[3]) {
                  var21.id_class(id_class(var0.id_goto[16], var6, var0.id_throw), var0.id_interface);
               }

               return null;
            }

            var21.id_class(id_class(var0.id_goto[8], var6, var0.id_throw), var0.id_interface);
            var13 = null;
         } finally {
            if (var21.id_class() > 0) {
               var8.id_class(true);
            }
         }

         return (wK_2[])var13;
      }
   }

   private static boolean id_break() {
      ArrayList var0 = new ArrayList();

      for (int var1 = 0; var1 < id_package.length; var1++) {
         rrbM_2[] var2 = id_package[var1];
         if (var2 != null) {
            var0.addAll(Arrays.asList(var2));
         }
      }

      for (int var6 = 0; var6 < id_final.length; var6++) {
         rrbM_2[] var8 = id_final[var6];
         if (var8 != null) {
            var0.addAll(Arrays.asList(var8));
         }
      }

      rrbM_2[] var7 = var0.toArray(new rrbM_2[var0.size()]);
      HashSet var9 = new HashSet();
      HashSet var3 = new HashSet();

      for (int var4 = 0; var4 < var7.length; var4++) {
         rrbM_2 var5 = var7[var4];
         if (var5.id_public != null) {
            var9.addAll(Arrays.asList(var5.id_public));
         }

         if (var5.id_goto != null) {
            var3.addAll(Arrays.asList(var5.id_goto));
         }
      }

      var9.retainAll(var3);
      return !var9.isEmpty();
   }

   private static fj_3 id_throws(rrbM_2 var0, rRq_1 var1, xc_3 var2, rfH_2 var3, int var4, int var5, fj_3 var6, int var7) {
      boolean var8 = false;
      switch (var4) {
         case 0:
            if (var5 == 1 || var5 == 0) {
               return null;
            }

            var8 = id_byte(var0, var1, var2, var3.id_final(), var5, var6, var7);
            break;
         case 1:
            if (var5 == 3 || var5 == 2) {
               return null;
            }

            var8 = id_byte(var0, var1, var2, var3.id_protected(), var5, var6, var7);
            break;
         case 2:
            if (var5 == 5 || var5 == 4) {
               return null;
            }

            var8 = id_byte(var0, var1, var2, var3.id_extends(), var5, var6, var7);
      }

      return var8 ? var0.id_goto[0] : null;
   }

   private static fj_3 id_protected(rrbM_2 var0, rRq_1 var1, xc_3 var2, rfH_2 var3, int var4, int var5, fj_3 var6, int var7) {
      fj_3[] var8 = var0.id_goto;
      fj_3 var9 = id_break(var0, var1, var2, var3, var4, var5, var6, var7);
      if (var9 != null && var9 != var6 && var9 != var8[3]) {
         return var9;
      } else {
         fj_3 var10 = id_class(var0, var1, var2, var3, var4, var5, var6, var7);
         if (var10 == var8[0]) {
            return var8[4];
         } else if (var10 == var8[1]) {
            return var8[5];
         } else {
            return var10 == var8[2] ? var8[6] : var10;
         }
      }
   }
}
