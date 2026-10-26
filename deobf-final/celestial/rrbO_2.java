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
   private static Map[] extends_ = null;
   private static Map[] native_ = null;
   private static Map[][] volatile_ = (Map[][])null;
   private static rrbM_2[][] final_ = (rrbM_2[][])null;
   private static rrbM_2[][] package_ = (rrbM_2[][])null;
   private static boolean int_ = false;
   protected static final int class_ = -1;
   protected static final int break_ = 0;
   protected static final int byte_ = 1;
   protected static final int protected_ = 2;
   protected static final int throws_ = 3;
   protected static final int case_ = 4;
   protected static final int catch_ = 5;
   private static final int new_ = 0;
   private static final int continue_ = 1;
   private static final int super_ = 2;
   public static final xc_3 private_ = xu_3.class_.continue_();
   private static fj_3 this_ = null;
   public static rqO_2 implements_ = rrzJ_2.goto_;
   private static final rrGa_1[] else_ = new rrGa_1[]{rrGa_1.WEST, rrGa_1.EAST, rrGa_1.NORTH, rrGa_1.SOUTH};
   private static final rrGa_1[] synchronized_ = new rrGa_1[]{rrGa_1.WEST, rrGa_1.EAST, rrGa_1.SOUTH, rrGa_1.NORTH};
   private static final rrGa_1[] return_ = new rrGa_1[]{rrGa_1.EAST, rrGa_1.WEST, rrGa_1.DOWN, rrGa_1.UP};
   private static final rrGa_1[] public_ = new rrGa_1[]{rrGa_1.WEST, rrGa_1.EAST, rrGa_1.DOWN, rrGa_1.UP};
   private static final rrGa_1[] goto_ = new rrGa_1[]{rrGa_1.NORTH, rrGa_1.SOUTH, rrGa_1.DOWN, rrGa_1.UP};
   private static final rrGa_1[] while_ = new rrGa_1[]{rrGa_1.SOUTH, rrGa_1.NORTH, rrGa_1.DOWN, rrGa_1.UP};
   private static final rrGa_1[] try_ = new rrGa_1[]{rrGa_1.NORTH_EAST, rrGa_1.NORTH_WEST, rrGa_1.SOUTH_EAST, rrGa_1.SOUTH_WEST};
   private static final rrGa_1[] instanceof_ = new rrGa_1[]{rrGa_1.SOUTH_EAST, rrGa_1.SOUTH_WEST, rrGa_1.NORTH_EAST, rrGa_1.NORTH_WEST};
   private static final rrGa_1[] throw_ = new rrGa_1[]{rrGa_1.DOWN_WEST, rrGa_1.DOWN_EAST, rrGa_1.UP_WEST, rrGa_1.UP_EAST};
   private static final rrGa_1[] interface_ = new rrGa_1[]{rrGa_1.DOWN_EAST, rrGa_1.DOWN_WEST, rrGa_1.UP_EAST, rrGa_1.UP_WEST};
   private static final rrGa_1[] char_ = new rrGa_1[]{rrGa_1.DOWN_SOUTH, rrGa_1.DOWN_NORTH, rrGa_1.UP_SOUTH, rrGa_1.UP_NORTH};
   private static final rrGa_1[] abstract_ = new rrGa_1[]{rrGa_1.DOWN_NORTH, rrGa_1.DOWN_SOUTH, rrGa_1.UP_NORTH, rrGa_1.UP_SOUTH};
   public static final fj_3 finally_ = new fj_3(new rqO_2("default"));
   private static final Random long_ = new Random(0L);

   private static rrGa_1[] byte_(int var0, int var1) {
      switch (var0) {
         case 0:
            return try_;
         case 1:
            return instanceof_;
         case 2:
            return throw_;
         case 3:
            return interface_;
         case 4:
            return char_;
         case 5:
            return abstract_;
         default:
            throw new IllegalArgumentException("Unknown side: " + var0);
      }
   }

   private static wK_2[] byte_(rrbM_2 var0, rRq_1 var1, xc_3 var2, rfH_2 var3, int var4, int var5, wK_2 var6, int var7, rrxF_2 var8) {
      if (!var6.final_()) {
         return null;
      } else {
         rrJp_1 var9 = var8.class_(var0.char_);

         Object var10;
         try {
            fj_3 var11 = class_(var0, var1, var2, var3, var4, var5, var6.case_(), var7, var8);
            if (var11 != null) {
               var9.class_(class_(var11, var6, var0.throw_), var0.interface_);
            }

            var10 = null;
         } finally {
            if (var9.class_() > 0) {
               var8.class_(true);
            }
         }

         return (wK_2[])var10;
      }
   }

   private static fj_3 byte_(rrbM_2 var0, rRq_1 var1, xc_3 var2, rfH_2 var3, int var4, int var5, fj_3 var6, int var7) {
      fj_3[] var8 = var0.goto_;
      fj_3 var9 = class_(var0, var1, var2, var3, var4, var5, var6, var7);
      if (var9 != null && var9 != var6 && var9 != var8[3]) {
         return var9;
      } else {
         fj_3 var10 = break_(var0, var1, var2, var3, var4, var5, var6, var7);
         if (var10 == var8[0]) {
            return var8[4];
         } else if (var10 == var8[1]) {
            return var8[5];
         } else {
            return var10 == var8[2] ? var8[6] : var10;
         }
      }
   }

   private static boolean byte_(rrbM_2 var0, rRq_1 var1, xc_3 var2, rfH_2 var3, int var4, fj_3 var5, int var6) {
      xc_3 var7 = var1.byte_(var3);
      return class_(var0, var1, var2, var3, var7, var4, var5, var6);
   }

   private static String[] byte_() {
      ArrayList var0 = new ArrayList();
      class_(var0, "textures/block/glass.png", "20_glass/glass.properties");
      class_(var0, "textures/block/glass.png", "20_glass/glass_pane.properties");
      class_(var0, "textures/block/bookshelf.png", "30_bookshelf/bookshelf.properties");
      class_(var0, "textures/block/sandstone.png", "40_sandstone/sandstone.properties");
      class_(var0, "textures/block/red_sandstone.png", "41_red_sandstone/red_sandstone.properties");
      String[] var1 = new String[]{
         "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"
      };

      for (int var2 = 0; var2 < var1.length; var2++) {
         String var3 = var1[var2];
         String var4 = rrzX_2.class_(var2 + "", 2, '0');
         class_(var0, "textures/block/" + var3 + "_stained_glass.png", var4 + "_glass_" + var3 + "/glass_" + var3 + ".properties");
         class_(var0, "textures/block/" + var3 + "_stained_glass.png", var4 + "_glass_" + var3 + "/glass_pane_" + var3 + ".properties");
      }

      return var0.toArray(new String[var0.size()]);
   }

   private static boolean class_(rrbM_2 var0, rRq_1 var1, xc_3 var2, rfH_2 var3, xc_3 var4, int var5, fj_3 var6, int var7) {
      if (var2 == var4) {
         return true;
      } else if (var0.private_ == 2) {
         if (var4 == null) {
            return false;
         } else if (var4 == private_) {
            return false;
         } else {
            fj_3 var10 = class_(var1, var2, var3, var4, var5);
            return var10 == var6;
         }
      } else if (var0.private_ == 3) {
         if (var4 == null) {
            return false;
         } else {
            return var4 == private_ ? false : var4.byte_() == var2.byte_();
         }
      } else if (var0.private_ == 1) {
         xd_3 var8 = var2.break_();
         xd_3 var9 = var4.break_();
         return var9 == var8;
      } else {
         return false;
      }
   }

   private static fj_3 class_(rRq_1 var0, xc_3 var1, rfH_2 var2, xc_3 var3, int var4) {
      IJ var5 = QY.instanceof_().synchronized_().break_().break_(var3);
      if (var5 == null) {
         return null;
      } else {
         rpr_3 var6 = class_(var4);
         List var7 = var5.class_(var3, var6, long_);
         if (var7 == null) {
            return null;
         } else {
            if (rrbb_3.c()) {
               var7 = rrGU.class_(var0, var3, var2, var6, var7);
            }

            if (var7.size() > 0) {
               wK_2 var11 = (wK_2)var7.get(0);
               return var11.case_();
            } else {
               List var8 = var5.class_(var3, (rpr_3)null, long_);
               if (var8 == null) {
                  return null;
               } else {
                  for (int var9 = 0; var9 < var8.size(); var9++) {
                     wK_2 var10 = (wK_2)var8.get(var9);
                     if (var10.protected_() == var6) {
                        return var10.case_();
                     }
                  }

                  return null;
               }
            }
         }
      }
   }

   private static fj_3 class_(rrbM_2 var0, rRq_1 var1, xc_3 var2, rfH_2 var3, int var4, int var5, fj_3 var6, int var7) {
      boolean var8;
      boolean var9;
      var8 = false;
      var9 = false;
      label46:
      switch (var4) {
         case 0:
            switch (var5) {
               case 0:
                  var8 = byte_(var0, var1, var2, var3.byte_(), var5, var6, var7);
                  var9 = byte_(var0, var1, var2, var3.extends_(), var5, var6, var7);
                  break label46;
               case 1:
                  var8 = byte_(var0, var1, var2, var3.byte_(), var5, var6, var7);
                  var9 = byte_(var0, var1, var2, var3.extends_(), var5, var6, var7);
                  break label46;
               case 2:
                  var8 = byte_(var0, var1, var2, var3.extends_(), var5, var6, var7);
                  var9 = byte_(var0, var1, var2, var3.byte_(), var5, var6, var7);
                  break label46;
               case 3:
                  var8 = byte_(var0, var1, var2, var3.byte_(), var5, var6, var7);
                  var9 = byte_(var0, var1, var2, var3.extends_(), var5, var6, var7);
                  break label46;
               case 4:
                  var8 = byte_(var0, var1, var2, var3.private_(), var5, var6, var7);
                  var9 = byte_(var0, var1, var2, var3.protected_(), var5, var6, var7);
                  break label46;
               case 5:
                  var8 = byte_(var0, var1, var2, var3.protected_(), var5, var6, var7);
                  var9 = byte_(var0, var1, var2, var3.private_(), var5, var6, var7);
               default:
                  break label46;
            }
         case 1:
            switch (var5) {
               case 0:
                  var8 = byte_(var0, var1, var2, var3.extends_(), var5, var6, var7);
                  var9 = byte_(var0, var1, var2, var3.byte_(), var5, var6, var7);
                  break label46;
               case 1:
                  var8 = byte_(var0, var1, var2, var3.byte_(), var5, var6, var7);
                  var9 = byte_(var0, var1, var2, var3.extends_(), var5, var6, var7);
                  break label46;
               case 2:
                  var8 = byte_(var0, var1, var2, var3.byte_(), var5, var6, var7);
                  var9 = byte_(var0, var1, var2, var3.extends_(), var5, var6, var7);
                  break label46;
               case 3:
                  var8 = byte_(var0, var1, var2, var3.byte_(), var5, var6, var7);
                  var9 = byte_(var0, var1, var2, var3.extends_(), var5, var6, var7);
                  break label46;
               case 4:
                  var8 = byte_(var0, var1, var2, var3.break_(), var5, var6, var7);
                  var9 = byte_(var0, var1, var2, var3.final_(), var5, var6, var7);
                  break label46;
               case 5:
                  var8 = byte_(var0, var1, var2, var3.final_(), var5, var6, var7);
                  var9 = byte_(var0, var1, var2, var3.break_(), var5, var6, var7);
               default:
                  break label46;
            }
         case 2:
            switch (var5) {
               case 0:
                  var8 = byte_(var0, var1, var2, var3.protected_(), var5, var6, var7);
                  var9 = byte_(var0, var1, var2, var3.private_(), var5, var6, var7);
                  break;
               case 1:
                  var8 = byte_(var0, var1, var2, var3.private_(), var5, var6, var7);
                  var9 = byte_(var0, var1, var2, var3.protected_(), var5, var6, var7);
                  break;
               case 2:
                  var8 = byte_(var0, var1, var2, var3.break_(), var5, var6, var7);
                  var9 = byte_(var0, var1, var2, var3.final_(), var5, var6, var7);
                  break;
               case 3:
                  var8 = byte_(var0, var1, var2, var3.final_(), var5, var6, var7);
                  var9 = byte_(var0, var1, var2, var3.break_(), var5, var6, var7);
                  break;
               case 4:
                  var8 = byte_(var0, var1, var2, var3.private_(), var5, var6, var7);
                  var9 = byte_(var0, var1, var2, var3.protected_(), var5, var6, var7);
                  break;
               case 5:
                  var8 = byte_(var0, var1, var2, var3.private_(), var5, var6, var7);
                  var9 = byte_(var0, var1, var2, var3.protected_(), var5, var6, var7);
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

      return var0.goto_[var10];
   }

   private static boolean class_(rRq_1 var0, xc_3 var1, rfH_2 var2, wK_2 var3, rrxF_2 var4) {
      xd_3 var5 = var1.break_();
      if (var5 instanceof kK_2) {
         rpr_3 var6 = var3.protected_();
         if (var6 != rpr_3.UP && var6 != rpr_3.DOWN) {
            return false;
         }

         if (!var3.volatile_()) {
            return false;
         }

         rfH_2 var7 = var2.break_(var3.protected_());
         xc_3 var8 = var0.byte_(var7);
         if (var8.break_() != var5) {
            return false;
         }

         xd_3 var9 = var8.break_();
         if (var5 instanceof zE_2 && var9 instanceof zE_2) {
            rxL_2 var10 = ((zE_2)var5).break_();
            rxL_2 var11 = ((zE_2)var9).break_();
            if (var10 != var11) {
               return false;
            }
         }

         double var14 = (double)var3.finally_();
         if (var14 < 0.4) {
            if (var8.byte_(dV_2.int_)) {
               return true;
            }
         } else if (var14 > 0.6) {
            if (var8.byte_(dV_2.final_)) {
               return true;
            }
         } else {
            double var12 = var3.native_();
            if (var12 < 0.4) {
               if (var8.byte_(dV_2.volatile_)) {
                  return true;
               }
            } else {
               if (!(var12 > 0.6)) {
                  return true;
               }

               if (var8.byte_(dV_2.package_)) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public static void class_(fJ_2 var0) {
      final_ = (rrbM_2[][])null;
      package_ = (rrbM_2[][])null;
      extends_ = null;
      volatile_ = (Map[][])null;
      if (rrbb_3.a()) {
         rAC[] var1 = rrbb_3.d();

         for (int var2 = var1.length - 1; var2 >= 0; var2--) {
            rAC var3 = var1[var2];
            class_(var0, var3);
         }

         class_(var0, rrbb_3.W());
         this_ = var0.throws_(implements_);
         extends_ = new Map[var0.throws_() + 1];
         native_ = new Map[var0.throws_() + 1];
         volatile_ = new Map[var0.throws_() + 1][];
         if (final_.length <= 0) {
            final_ = (rrbM_2[][])null;
         }

         if (package_.length <= 0) {
            package_ = (rrbM_2[][])null;
         }
      }
   }

   private static synchronized wK_2 class_(fj_3 var0, wK_2 var1) {
      if (extends_ == null) {
         return var1;
      } else {
         int var2 = var0.new_();
         if (var2 >= 0 && var2 < extends_.length) {
            Object var3 = extends_[var2];
            if (var3 == null) {
               var3 = new IdentityHashMap(1);
               extends_[var2] = (Map)var3;
            }

            wK_2 var4 = (wK_2)var3.get(var1);
            if (var4 == null) {
               var4 = class_(var1, var0);
               var3.put(var1, var4);
            }

            return var4;
         } else {
            return var1;
         }
      }
   }

   private static void class_(int var0, int var1, boolean[] var2) {
      boolean var3 = var2[var0];
      var2[var0] = var2[var1];
      var2[var1] = var3;
   }

   private static boolean class_(rrbM_2 var0, rRq_1 var1, xc_3 var2, rfH_2 var3, int var4, fj_3 var5, int var6) {
      xc_3 var7 = var1.byte_(var3);
      if (!class_(var7, var1, var3)) {
         return false;
      } else if (var0.while_ != null && !rrMl_1.class_(var7.continue_(), var7.super_(), var0.while_)) {
         return false;
      } else {
         if (var0.instanceof_ != null) {
            fj_3 var8 = class_(var1, var2, var3, var7, var4);
            if (!rrbb_3.break_(var8, var0.instanceof_)) {
               return false;
            }
         }

         rfH_2 var10 = var3.break_(class_(var4));
         xc_3 var9 = var1.byte_(var10);
         if (var9.implements_(var1, var10)) {
            return false;
         } else {
            return var4 == 1 && var9.break_() == xu_3.Pq ? false : !class_(var0, var1, var2, var3, var7, var4, var5, var6);
         }
      }
   }

   private static boolean class_(xc_3 var0, rRq_1 var1, rfH_2 var2) {
      if (rrWP.class_(var0, var1, var2)) {
         return true;
      } else {
         xd_3 var3 = var0.break_();
         return var3 instanceof dK_2 ? true : var3 instanceof zs_3;
      }
   }

   protected static wK_2[] class_(fj_3 var0, wK_2 var1, rrxF_2 var2) {
      if (var0 == null) {
         return null;
      } else if (var0 == finally_) {
         return var2.break_(var1);
      } else {
         wK_2 var3 = class_(var0, var1);
         return var2.break_(var3);
      }
   }

   private static void class_(rrbM_2 var0, List var1) {
      if (var0.public_ != null) {
         for (int var2 = 0; var2 < var0.public_.length; var2++) {
            fj_3 var3 = var0.public_[var2];
            if (!(var3 instanceof fj_3)) {
               rrbb_3.protected_("TextureAtlasSprite is not TextureAtlasSprite: " + var3 + ", name: " + var3.finally_());
            } else {
               int var4 = var3.new_();
               if (var4 < 0) {
                  rrbb_3.protected_("Invalid tile ID: " + var4 + ", icon: " + var3.finally_());
               } else {
                  class_(var0, var1, var4);
               }
            }
         }
      }
   }

   private static void class_(rrbM_2 var0, List var1, int var2) {
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

   public static wK_2[] class_(rRp_1 var0, xc_3 var1, rfH_2 var2, wK_2 var3, rrxF_2 var4) {
      fj_3 var5 = var3.case_();
      if (var5 == null) {
         return var4.break_(var3);
      } else if (class_((rRq_1)var0, var1, var2, var3, var4)) {
         var3 = class_(this_, var3);
         return var4.break_(var3);
      } else {
         rpr_3 var6 = var3.protected_();
         return class_(var0, var1, var2, var6, var3, var4);
      }
   }

   private static void class_(List var0, String var1, String var2) {
      String var3 = "optifine/ctm/default/";
      rqO_2 var4 = new rqO_2(var1);
      rAC var5 = rrbb_3.throws_(var4);
      if (var5 != null) {
         if (var5.class_().equals("Programmer Art")) {
            String var6 = var3 + "programmer_art/";
            var0.add(var6 + var2);
         } else if (var5 == rrbb_3.W()) {
            var0.add(var3 + var2);
         }
      }
   }

   protected static Map[][] class_() {
      return volatile_;
   }

   public static void class_(fJ_2 var0, rAC var1) {
      String[] var2 = rrzM_2.class_(var1, "optifine/ctm/", ".properties", byte_());
      Arrays.sort(var2);
      List var3 = class_(package_);
      List var4 = class_(final_);

      for (int var5 = 0; var5 < var2.length; var5++) {
         String var6 = var2[var5];
         rrbb_3.byte_("ConnectedTextures: " + var6);

         try {
            rqO_2 var7 = new rqO_2(var6);
            InputStream var8 = var1.class_(rAI.CLIENT_RESOURCES, var7);
            if (var8 == null) {
               rrbb_3.protected_("ConnectedTextures file not found: " + var6);
            } else {
               rrzE_2 var9 = new rrzE_2();
               var9.load(var8);
               var8.close();
               rrbM_2 var10 = new rrbM_2(var9, var6);
               if (var10.class_(var6)) {
                  var10.class_(var0);
                  class_(var10, var3);
                  break_(var10, var4);
               }
            }
         } catch (FileNotFoundException var11) {
            rrbb_3.protected_("ConnectedTextures file not found: " + var6);
         } catch (Exception var12) {
            var12.printStackTrace();
         }
      }

      final_ = class_(var4);
      package_ = class_(var3);
      int_ = break_();
      rrbb_3.byte_("Multipass connected textures: " + int_);
   }

   private static fj_3 class_(fJ_2 var0, rqO_2 var1) {
      fj_3 var2 = var0.break_(var1);
      if (var2 == null || var2 instanceof fQ_2) {
         rrbb_3.protected_("Missing CTM sprite: " + var1);
      }

      return var2;
   }

   private static void class_(rrbM_2[][] var0, fJ_2 var1) {
      if (var0 != null) {
         for (int var2 = 0; var2 < var0.length; var2++) {
            rrbM_2[] var3 = var0[var2];
            if (var3 != null) {
               for (int var4 = 0; var4 < var3.length; var4++) {
                  rrbM_2 var5 = var3[var4];
                  if (var5 != null) {
                     var5.break_(var1);
                  }
               }
            }
         }
      }
   }

   private static List class_(rrbM_2[][] var0) {
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

   private static rrbM_2[][] class_(List var0) {
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

   private static int class_(int var0, int var1) {
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

   private static int class_(xc_3 var0) {
      rpB_2 var1 = var0.byte_(WL.new_);
      switch (var1) {
         case X:
            return 2;
         case Z:
            return 1;
         default:
            return 0;
      }
   }

   private static fj_3 class_(rrbM_2 var0, rRq_1 var1, xc_3 var2, rfH_2 var3, int var4) {
      if (var0.goto_.length == 1) {
         return var0.goto_[0];
      } else {
         int var5 = var4 / var0.super_ * var0.super_;
         if (var0.this_) {
            rfH_2 var6 = var3.break_();

            for (xc_3 var7 = var1.byte_(var6); var7.break_() == var2.break_(); var7 = var1.byte_(var6)) {
               var3 = var6;
               var6 = var6.break_();
               if (var6.c_() < 0) {
                  break;
               }
            }
         }

         int var11 = rrbb_3.class_(var3, var5) & 2147483647;

         for (int var12 = 0; var12 < var0.continue_; var12++) {
            var11 = rrbb_3.class_(var11);
         }

         int var13 = 0;
         if (var0.new_ == null) {
            var13 = var11 % var0.goto_.length;
         } else {
            int var8 = var11 % var0.return_;
            int[] var9 = var0.synchronized_;

            for (int var10 = 0; var10 < var9.length; var10++) {
               if (var8 < var9[var10]) {
                  var13 = var10;
                  break;
               }
            }
         }

         return var0.goto_[var13];
      }
   }

   private static fj_3 class_(rrbM_2 var0) {
      return var0.goto_[0];
   }

   private static fj_3 class_(rrbM_2 var0, rfH_2 var1, int var2) {
      if (var0.goto_.length == 1) {
         return var0.goto_[0];
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

         var6 %= var0.package_;
         var7 %= var0.int_;
         if (var6 < 0) {
            var6 += var0.package_;
         }

         if (var7 < 0) {
            var7 += var0.int_;
         }

         int var8 = var7 * var0.package_ + var6;
         return var0.goto_[var8];
      }
   }

   private static fj_3 class_(rrbM_2 var0, rRq_1 var1, xc_3 var2, rfH_2 var3, int var4, int var5, fj_3 var6, int var7, rrxF_2 var8) {
      int var9 = break_(var0, var1, var2, var3, var4, var5, var6, var7, var8);
      return var0.goto_[var9];
   }

   private static void class_(int[] var0, int var1, fj_3 var2, fj_3 var3) {
      int var4 = var0.length / 4;
      int var5 = var4 * var1;
      float var6 = Float.intBitsToFloat(var0[var5 + 4]);
      float var7 = Float.intBitsToFloat(var0[var5 + 4 + 1]);
      double var8 = var2.class_(var6);
      double var10 = var2.break_(var7);
      var0[var5 + 4] = Float.floatToRawIntBits(var3.class_(var8));
      var0[var5 + 4 + 1] = Float.floatToRawIntBits(var3.break_(var10));
   }

   private static wK_2[] class_(rRp_1 var0, xc_3 var1, rfH_2 var2, rpr_3 var3, wK_2 var4, rrxF_2 var5) {
      wK_2[] var6 = class_(var0, var1, var2, var3, var4, true, 0, var5);
      if (!int_) {
         return var6;
      } else if (var6.length == 1 && var6[0] == var4) {
         return var6;
      } else {
         List var7 = var5.class_(var6);

         for (int var8 = 0; var8 < var7.size(); var8++) {
            wK_2 var9 = (wK_2)var7.get(var8);
            wK_2 var10 = var9;

            for (int var11 = 0; var11 < 3; var11++) {
               wK_2[] var12 = class_(var0, var1, var2, var3, var10, false, var11 + 1, var5);
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

   public static wK_2[] class_(rRp_1 var0, xc_3 var1, rfH_2 var2, rpr_3 var3, wK_2 var4, boolean var5, int var6, rrxF_2 var7) {
      xd_3 var8 = var1.break_();
      fj_3 var9 = var4.case_();
      if (package_ != null) {
         int var10 = var9.new_();
         if (var10 >= 0 && var10 < package_.length) {
            rrbM_2[] var11 = package_[var10];
            if (var11 != null) {
               int var12 = class_(var3);

               for (int var13 = 0; var13 < var11.length; var13++) {
                  rrbM_2 var14 = var11[var13];
                  if (var14 != null && var14.class_(var1.continue_())) {
                     wK_2[] var15 = class_(var14, var0, var1, var2, var12, var4, var6, var7);
                     if (var15 != null) {
                        return var15;
                     }
                  }
               }
            }
         }
      }

      if (final_ != null && var5) {
         int var16 = var7.class_();
         if (var16 >= 0 && var16 < final_.length) {
            rrbM_2[] var17 = final_[var16];
            if (var17 != null) {
               int var18 = class_(var3);

               for (int var19 = 0; var19 < var17.length; var19++) {
                  rrbM_2 var20 = var17[var19];
                  if (var20 != null && var20.class_(var9)) {
                     wK_2[] var21 = class_(var20, var0, var1, var2, var18, var4, var6, var7);
                     if (var21 != null) {
                        return var21;
                     }
                  }
               }
            }
         }
      }

      return var7.break_(var4);
   }

   public static int class_(rpr_3 var0) {
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

   private static rpr_3 class_(int var0) {
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

   private static wK_2[] class_(rrbM_2 var0, rRp_1 var1, xc_3 var2, rfH_2 var3, int var4, wK_2 var5, int var6, rrxF_2 var7) {
      int var8 = 0;
      int var9 = var2.super_();
      xd_3 var10 = var2.break_();
      if (var10 instanceof WL) {
         var8 = class_(var2);
      }

      if (!var0.class_(var2.continue_(), var9)) {
         return null;
      } else {
         if (var4 >= 0 && var0.implements_ != 63) {
            int var11 = var4;
            if (var8 != 0) {
               var11 = class_(var4, var8);
            }

            if ((1 << var11 & var0.implements_) == 0) {
               return null;
            }
         }

         int var13 = var3.c_();
         if (var0.extends_ != null && !var0.extends_.class_(var13)) {
            return null;
         } else {
            if (var0.finally_ != null) {
               rYG var12 = rrWr_1.class_(var1, var3);
               if (!var0.class_(var12)) {
                  return null;
               }
            }

            if (var0.else_ != null) {
               String var14 = rrzz_3.class_(var1, var3);
               if (!var0.else_.class_(var14)) {
                  return null;
               }
            }

            fj_3 var15 = var5.case_();
            switch (var0.case_) {
               case 1:
                  return class_(class_(var0, var1, var2, var3, var8, var4, var15, var9, var7), var5, var7);
               case 2:
                  return class_(class_(var0, var1, var2, var3, var8, var4, var15, var9), var5, var7);
               case 3:
                  return class_(throws_(var0, var1, var2, var3, var8, var4, var15, var9), var5, var7);
               case 4:
                  return class_(class_(var0, var1, var2, var3, var4), var5, var7);
               case 5:
                  return class_(class_(var0, var3, var4), var5, var7);
               case 6:
                  return class_(break_(var0, var1, var2, var3, var8, var4, var15, var9), var5, var7);
               case 7:
                  return class_(class_(var0), var5, var7);
               case 8:
                  return class_(byte_(var0, var1, var2, var3, var8, var4, var15, var9), var5, var7);
               case 9:
                  return class_(protected_(var0, var1, var2, var3, var8, var4, var15, var9), var5, var7);
               case 10:
                  if (var6 == 0) {
                     return class_(var0, var1, var2, var3, var8, var4, var5, var9, var7);
                  }
               default:
                  return null;
               case 11:
                  return break_(var0, var1, var2, var3, var8, var4, var5, var9, var7);
               case 12:
                  return class_(var0, var5, var7);
               case 13:
                  return class_(var0, var1, var2, var3, var4, var5, var7);
               case 14:
                  return class_(var0, var3, var4, var5, var7);
               case 15:
                  return byte_(var0, var1, var2, var3, var8, var4, var5, var9, var7);
            }
         }
      }
   }

   private static synchronized wK_2[] class_(rrbM_2 var0, rRq_1 var1, xc_3 var2, rfH_2 var3, int var4, int var5, wK_2 var6, int var7, rrxF_2 var8) {
      fj_3 var9 = var6.case_();
      int var10 = break_(var0, var1, var2, var3, var4, var5, var9, var7, var8);
      return rrbX_2.class_(var10, var0, var5, var6, var8);
   }

   private static wK_2 class_(wK_2 var0, fj_3 var1) {
      int[] var2 = (int[])var0.class_().clone();
      fj_3 var3 = var0.case_();

      for (int var4 = 0; var4 < 4; var4++) {
         class_(var2, var4, var3, var1);
      }

      return new wK_2(var2, var0.byte_(), var0.protected_(), var1, var0.throws_());
   }

   private static wK_2[] class_(rrbM_2 var0, rRq_1 var1, xc_3 var2, rfH_2 var3, int var4, wK_2 var5, rrxF_2 var6) {
      if (!var5.final_()) {
         return null;
      } else {
         rrJp_1 var7 = var6.class_(var0.char_);

         Object var8;
         try {
            fj_3 var9 = class_(var0, var1, var2, var3, var4);
            if (var9 != null) {
               var7.class_(class_(var9, var5, var0.throw_), var0.interface_);
            }

            var8 = null;
         } finally {
            if (var7.class_() > 0) {
               var6.class_(true);
            }
         }

         return (wK_2[])var8;
      }
   }

   private static wK_2[] class_(rrbM_2 var0, wK_2 var1, rrxF_2 var2) {
      if (!var1.final_()) {
         return null;
      } else {
         rrJp_1 var3 = var2.class_(var0.char_);

         Object var4;
         try {
            fj_3 var5 = class_(var0);
            if (var5 != null) {
               var3.class_(class_(var5, var1, var0.throw_), var0.interface_);
            }

            var4 = null;
         } finally {
            if (var3.class_() > 0) {
               var2.class_(true);
            }
         }

         return (wK_2[])var4;
      }
   }

   private static wK_2[] class_(rrbM_2 var0, rfH_2 var1, int var2, wK_2 var3, rrxF_2 var4) {
      if (!var3.final_()) {
         return null;
      } else {
         rrJp_1 var5 = var4.class_(var0.char_);

         Object var6;
         try {
            fj_3 var7 = class_(var0, var1, var2);
            if (var7 != null) {
               var5.class_(class_(var7, var3, var0.throw_), var0.interface_);
            }

            var6 = null;
         } finally {
            if (var5.class_() > 0) {
               var4.class_(true);
            }
         }

         return (wK_2[])var6;
      }
   }

   private static synchronized wK_2 class_(fj_3 var0, wK_2 var1, int var2) {
      if (native_ == null) {
         return null;
      } else if (var0 == null) {
         return null;
      } else {
         int var3 = var0.new_();
         if (var3 >= 0 && var3 < native_.length) {
            Object var4 = native_[var3];
            if (var4 == null) {
               var4 = new EnumMap<>(rpr_3.class);
               native_[var3] = (Map)var4;
            }

            rpr_3 var5 = var1.protected_();
            wK_2 var6 = (wK_2)var4.get(var5);
            if (var6 == null) {
               var6 = rrJy_1.class_(var5, var0, var2);
               var4.put(var5, var6);
            }

            return var6;
         } else {
            return null;
         }
      }
   }

   private static boolean break_(rrbM_2 var0, rRq_1 var1, xc_3 var2, rfH_2 var3, int var4, fj_3 var5, int var6) {
      xc_3 var7 = var1.byte_(var3);
      if (var7 == private_) {
         return false;
      } else if (var0.byte_ != null && !var0.class_(var7.continue_(), var7.super_())) {
         return false;
      } else {
         if (var0.public_ != null) {
            fj_3 var8 = class_(var1, var2, var3, var7, var4);
            if (var8 != var5) {
               return false;
            }
         }

         rfH_2 var10 = var3.break_(class_(var4));
         xc_3 var9 = var1.byte_(var10);
         return var9.implements_(var1, var10) ? false : var4 != 1 || var9.break_() != xu_3.Pq;
      }
   }

   private static void break_(rrbM_2 var0, List var1) {
      if (var0.byte_ != null) {
         for (int var2 = 0; var2 < var0.byte_.length; var2++) {
            int var3 = var0.byte_[var2].class_();
            if (var3 < 0) {
               rrbb_3.protected_("Invalid block ID: " + var3);
            } else {
               class_(var0, var1, var3);
            }
         }
      }
   }

   private static rrGa_1[] break_(int var0, int var1) {
      switch (var0) {
         case 0:
            return else_;
         case 1:
            return synchronized_;
         case 2:
            return return_;
         case 3:
            return public_;
         case 4:
            return goto_;
         case 5:
            return while_;
         default:
            throw new IllegalArgumentException("Unknown side: " + var0);
      }
   }

   private static int break_(rrbM_2 var0, rRq_1 var1, xc_3 var2, rfH_2 var3, int var4, int var5, fj_3 var6, int var7, rrxF_2 var8) {
      boolean[] var9 = var8.implements_();
      switch (var5) {
         case 0:
            var9[0] = byte_(var0, var1, var2, var3.byte_(), var5, var6, var7);
            var9[1] = byte_(var0, var1, var2, var3.extends_(), var5, var6, var7);
            var9[2] = byte_(var0, var1, var2, var3.private_(), var5, var6, var7);
            var9[3] = byte_(var0, var1, var2, var3.protected_(), var5, var6, var7);
            if (var0.volatile_) {
               rfH_2 var16 = var3.break_();
               var9[0] = var9[0] && !byte_(var0, var1, var2, var16.byte_(), var5, var6, var7);
               var9[1] = var9[1] && !byte_(var0, var1, var2, var16.extends_(), var5, var6, var7);
               var9[2] = var9[2] && !byte_(var0, var1, var2, var16.private_(), var5, var6, var7);
               var9[3] = var9[3] && !byte_(var0, var1, var2, var16.protected_(), var5, var6, var7);
            }
            break;
         case 1:
            var9[0] = byte_(var0, var1, var2, var3.byte_(), var5, var6, var7);
            var9[1] = byte_(var0, var1, var2, var3.extends_(), var5, var6, var7);
            var9[2] = byte_(var0, var1, var2, var3.protected_(), var5, var6, var7);
            var9[3] = byte_(var0, var1, var2, var3.private_(), var5, var6, var7);
            if (var0.volatile_) {
               rfH_2 var15 = var3.final_();
               var9[0] = var9[0] && !byte_(var0, var1, var2, var15.byte_(), var5, var6, var7);
               var9[1] = var9[1] && !byte_(var0, var1, var2, var15.extends_(), var5, var6, var7);
               var9[2] = var9[2] && !byte_(var0, var1, var2, var15.protected_(), var5, var6, var7);
               var9[3] = var9[3] && !byte_(var0, var1, var2, var15.private_(), var5, var6, var7);
            }
            break;
         case 2:
            var9[0] = byte_(var0, var1, var2, var3.extends_(), var5, var6, var7);
            var9[1] = byte_(var0, var1, var2, var3.byte_(), var5, var6, var7);
            var9[2] = byte_(var0, var1, var2, var3.break_(), var5, var6, var7);
            var9[3] = byte_(var0, var1, var2, var3.final_(), var5, var6, var7);
            if (var0.volatile_) {
               rfH_2 var14 = var3.private_();
               var9[0] = var9[0] && !byte_(var0, var1, var2, var14.extends_(), var5, var6, var7);
               var9[1] = var9[1] && !byte_(var0, var1, var2, var14.byte_(), var5, var6, var7);
               var9[2] = var9[2] && !byte_(var0, var1, var2, var14.break_(), var5, var6, var7);
               var9[3] = var9[3] && !byte_(var0, var1, var2, var14.final_(), var5, var6, var7);
            }
            break;
         case 3:
            var9[0] = byte_(var0, var1, var2, var3.byte_(), var5, var6, var7);
            var9[1] = byte_(var0, var1, var2, var3.extends_(), var5, var6, var7);
            var9[2] = byte_(var0, var1, var2, var3.break_(), var5, var6, var7);
            var9[3] = byte_(var0, var1, var2, var3.final_(), var5, var6, var7);
            if (var0.volatile_) {
               rfH_2 var13 = var3.protected_();
               var9[0] = var9[0] && !byte_(var0, var1, var2, var13.byte_(), var5, var6, var7);
               var9[1] = var9[1] && !byte_(var0, var1, var2, var13.extends_(), var5, var6, var7);
               var9[2] = var9[2] && !byte_(var0, var1, var2, var13.break_(), var5, var6, var7);
               var9[3] = var9[3] && !byte_(var0, var1, var2, var13.final_(), var5, var6, var7);
            }
            break;
         case 4:
            var9[0] = byte_(var0, var1, var2, var3.private_(), var5, var6, var7);
            var9[1] = byte_(var0, var1, var2, var3.protected_(), var5, var6, var7);
            var9[2] = byte_(var0, var1, var2, var3.break_(), var5, var6, var7);
            var9[3] = byte_(var0, var1, var2, var3.final_(), var5, var6, var7);
            if (var0.volatile_) {
               rfH_2 var12 = var3.byte_();
               var9[0] = var9[0] && !byte_(var0, var1, var2, var12.private_(), var5, var6, var7);
               var9[1] = var9[1] && !byte_(var0, var1, var2, var12.protected_(), var5, var6, var7);
               var9[2] = var9[2] && !byte_(var0, var1, var2, var12.break_(), var5, var6, var7);
               var9[3] = var9[3] && !byte_(var0, var1, var2, var12.final_(), var5, var6, var7);
            }
            break;
         case 5:
            var9[0] = byte_(var0, var1, var2, var3.protected_(), var5, var6, var7);
            var9[1] = byte_(var0, var1, var2, var3.private_(), var5, var6, var7);
            var9[2] = byte_(var0, var1, var2, var3.break_(), var5, var6, var7);
            var9[3] = byte_(var0, var1, var2, var3.final_(), var5, var6, var7);
            if (var0.volatile_) {
               rfH_2 var10 = var3.extends_();
               var9[0] = var9[0] && !byte_(var0, var1, var2, var10.protected_(), var5, var6, var7);
               var9[1] = var9[1] && !byte_(var0, var1, var2, var10.private_(), var5, var6, var7);
               var9[2] = var9[2] && !byte_(var0, var1, var2, var10.break_(), var5, var6, var7);
               var9[3] = var9[3] && !byte_(var0, var1, var2, var10.final_(), var5, var6, var7);
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
               var9[0] = !byte_(var0, var1, var2, var3.extends_().private_(), var5, var6, var7);
               var9[1] = !byte_(var0, var1, var2, var3.byte_().private_(), var5, var6, var7);
               var9[2] = !byte_(var0, var1, var2, var3.extends_().protected_(), var5, var6, var7);
               var9[3] = !byte_(var0, var1, var2, var3.byte_().protected_(), var5, var6, var7);
               if (var0.volatile_) {
                  rfH_2 var22 = var3.break_();
                  var9[0] = var9[0] || byte_(var0, var1, var2, var22.extends_().private_(), var5, var6, var7);
                  var9[1] = var9[1] || byte_(var0, var1, var2, var22.byte_().private_(), var5, var6, var7);
                  var9[2] = var9[2] || byte_(var0, var1, var2, var22.extends_().protected_(), var5, var6, var7);
                  var9[3] = var9[3] || byte_(var0, var1, var2, var22.byte_().protected_(), var5, var6, var7);
               }
               break;
            case 1:
               var9[0] = !byte_(var0, var1, var2, var3.extends_().protected_(), var5, var6, var7);
               var9[1] = !byte_(var0, var1, var2, var3.byte_().protected_(), var5, var6, var7);
               var9[2] = !byte_(var0, var1, var2, var3.extends_().private_(), var5, var6, var7);
               var9[3] = !byte_(var0, var1, var2, var3.byte_().private_(), var5, var6, var7);
               if (var0.volatile_) {
                  rfH_2 var21 = var3.final_();
                  var9[0] = var9[0] || byte_(var0, var1, var2, var21.extends_().protected_(), var5, var6, var7);
                  var9[1] = var9[1] || byte_(var0, var1, var2, var21.byte_().protected_(), var5, var6, var7);
                  var9[2] = var9[2] || byte_(var0, var1, var2, var21.extends_().private_(), var5, var6, var7);
                  var9[3] = var9[3] || byte_(var0, var1, var2, var21.byte_().private_(), var5, var6, var7);
               }
               break;
            case 2:
               var9[0] = !byte_(var0, var1, var2, var3.byte_().break_(), var5, var6, var7);
               var9[1] = !byte_(var0, var1, var2, var3.extends_().break_(), var5, var6, var7);
               var9[2] = !byte_(var0, var1, var2, var3.byte_().final_(), var5, var6, var7);
               var9[3] = !byte_(var0, var1, var2, var3.extends_().final_(), var5, var6, var7);
               if (var0.volatile_) {
                  rfH_2 var20 = var3.private_();
                  var9[0] = var9[0] || byte_(var0, var1, var2, var20.byte_().break_(), var5, var6, var7);
                  var9[1] = var9[1] || byte_(var0, var1, var2, var20.extends_().break_(), var5, var6, var7);
                  var9[2] = var9[2] || byte_(var0, var1, var2, var20.byte_().final_(), var5, var6, var7);
                  var9[3] = var9[3] || byte_(var0, var1, var2, var20.extends_().final_(), var5, var6, var7);
               }
               break;
            case 3:
               var9[0] = !byte_(var0, var1, var2, var3.extends_().break_(), var5, var6, var7);
               var9[1] = !byte_(var0, var1, var2, var3.byte_().break_(), var5, var6, var7);
               var9[2] = !byte_(var0, var1, var2, var3.extends_().final_(), var5, var6, var7);
               var9[3] = !byte_(var0, var1, var2, var3.byte_().final_(), var5, var6, var7);
               if (var0.volatile_) {
                  rfH_2 var19 = var3.protected_();
                  var9[0] = var9[0] || byte_(var0, var1, var2, var19.extends_().break_(), var5, var6, var7);
                  var9[1] = var9[1] || byte_(var0, var1, var2, var19.byte_().break_(), var5, var6, var7);
                  var9[2] = var9[2] || byte_(var0, var1, var2, var19.extends_().final_(), var5, var6, var7);
                  var9[3] = var9[3] || byte_(var0, var1, var2, var19.byte_().final_(), var5, var6, var7);
               }
               break;
            case 4:
               var9[0] = !byte_(var0, var1, var2, var3.break_().protected_(), var5, var6, var7);
               var9[1] = !byte_(var0, var1, var2, var3.break_().private_(), var5, var6, var7);
               var9[2] = !byte_(var0, var1, var2, var3.final_().protected_(), var5, var6, var7);
               var9[3] = !byte_(var0, var1, var2, var3.final_().private_(), var5, var6, var7);
               if (var0.volatile_) {
                  rfH_2 var18 = var3.byte_();
                  var9[0] = var9[0] || byte_(var0, var1, var2, var18.break_().protected_(), var5, var6, var7);
                  var9[1] = var9[1] || byte_(var0, var1, var2, var18.break_().private_(), var5, var6, var7);
                  var9[2] = var9[2] || byte_(var0, var1, var2, var18.final_().protected_(), var5, var6, var7);
                  var9[3] = var9[3] || byte_(var0, var1, var2, var18.final_().private_(), var5, var6, var7);
               }
               break;
            case 5:
               var9[0] = !byte_(var0, var1, var2, var3.break_().private_(), var5, var6, var7);
               var9[1] = !byte_(var0, var1, var2, var3.break_().protected_(), var5, var6, var7);
               var9[2] = !byte_(var0, var1, var2, var3.final_().private_(), var5, var6, var7);
               var9[3] = !byte_(var0, var1, var2, var3.final_().protected_(), var5, var6, var7);
               if (var0.volatile_) {
                  rfH_2 var11 = var3.extends_();
                  var9[0] = var9[0] || byte_(var0, var1, var2, var11.break_().private_(), var5, var6, var7);
                  var9[1] = var9[1] || byte_(var0, var1, var2, var11.break_().protected_(), var5, var6, var7);
                  var9[2] = var9[2] || byte_(var0, var1, var2, var11.final_().private_(), var5, var6, var7);
                  var9[3] = var9[3] || byte_(var0, var1, var2, var11.final_().protected_(), var5, var6, var7);
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

   private static fj_3 break_(rrbM_2 var0, rRq_1 var1, xc_3 var2, rfH_2 var3, int var4, int var5, fj_3 var6, int var7) {
      boolean var8 = false;
      boolean var9 = false;
      switch (var4) {
         case 0:
            if (var5 == 1) {
               var8 = byte_(var0, var1, var2, var3.protected_(), var5, var6, var7);
               var9 = byte_(var0, var1, var2, var3.private_(), var5, var6, var7);
            } else if (var5 == 0) {
               var8 = byte_(var0, var1, var2, var3.private_(), var5, var6, var7);
               var9 = byte_(var0, var1, var2, var3.protected_(), var5, var6, var7);
            } else {
               var8 = byte_(var0, var1, var2, var3.break_(), var5, var6, var7);
               var9 = byte_(var0, var1, var2, var3.final_(), var5, var6, var7);
            }
            break;
         case 1:
            if (var5 == 3) {
               var8 = byte_(var0, var1, var2, var3.break_(), var5, var6, var7);
               var9 = byte_(var0, var1, var2, var3.final_(), var5, var6, var7);
            } else if (var5 == 2) {
               var8 = byte_(var0, var1, var2, var3.final_(), var5, var6, var7);
               var9 = byte_(var0, var1, var2, var3.break_(), var5, var6, var7);
            } else {
               var8 = byte_(var0, var1, var2, var3.protected_(), var5, var6, var7);
               var9 = byte_(var0, var1, var2, var3.private_(), var5, var6, var7);
            }
            break;
         case 2:
            if (var5 == 5) {
               var8 = byte_(var0, var1, var2, var3.final_(), var5, var6, var7);
               var9 = byte_(var0, var1, var2, var3.break_(), var5, var6, var7);
            } else if (var5 == 4) {
               var8 = byte_(var0, var1, var2, var3.break_(), var5, var6, var7);
               var9 = byte_(var0, var1, var2, var3.final_(), var5, var6, var7);
            } else {
               var8 = byte_(var0, var1, var2, var3.byte_(), var5, var6, var7);
               var9 = byte_(var0, var1, var2, var3.extends_(), var5, var6, var7);
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

      return var0.goto_[var10];
   }

   public static void break_(fJ_2 var0) {
      class_(final_, var0);
      class_(package_, var0);
      this_ = class_(var0, implements_);
   }

   private static wK_2[] break_(rrbM_2 var0, rRq_1 var1, xc_3 var2, rfH_2 var3, int var4, int var5, wK_2 var6, int var7, rrxF_2 var8) {
      if (!var6.final_()) {
         return null;
      } else {
         fj_3 var9 = var6.case_();
         rrGa_1[] var10 = break_(var5, var4);
         boolean[] var11 = var8.implements_();

         for (int var12 = 0; var12 < 4; var12++) {
            var11[var12] = class_(var0, var1, var2, var10[var12].class_(var3), var5, var9, var7);
         }

         rrJp_1 var21 = var8.class_(var0.char_);

         Object var13;
         try {
            if (!var11[0] || !var11[1] || !var11[2] || !var11[3]) {
               if (var11[0] && var11[1] && var11[2]) {
                  var21.class_(class_(var0.goto_[5], var6, var0.throw_), var0.interface_);
                  return null;
               }

               if (var11[0] && var11[2] && var11[3]) {
                  var21.class_(class_(var0.goto_[6], var6, var0.throw_), var0.interface_);
                  return null;
               }

               if (var11[1] && var11[2] && var11[3]) {
                  var21.class_(class_(var0.goto_[12], var6, var0.throw_), var0.interface_);
                  return null;
               }

               if (var11[0] && var11[1] && var11[3]) {
                  var21.class_(class_(var0.goto_[13], var6, var0.throw_), var0.interface_);
                  return null;
               }

               rrGa_1[] var14 = byte_(var5, var4);
               boolean[] var15 = var8.finally_();

               for (int var16 = 0; var16 < 4; var16++) {
                  var15[var16] = class_(var0, var1, var2, var14[var16].class_(var3), var5, var9, var7);
               }

               if (var11[1] && var11[2]) {
                  var21.class_(class_(var0.goto_[3], var6, var0.throw_), var0.interface_);
                  if (var15[3]) {
                     var21.class_(class_(var0.goto_[16], var6, var0.throw_), var0.interface_);
                  }

                  return null;
               }

               if (var11[0] && var11[2]) {
                  var21.class_(class_(var0.goto_[4], var6, var0.throw_), var0.interface_);
                  if (var15[2]) {
                     var21.class_(class_(var0.goto_[14], var6, var0.throw_), var0.interface_);
                  }

                  return null;
               }

               if (var11[1] && var11[3]) {
                  var21.class_(class_(var0.goto_[10], var6, var0.throw_), var0.interface_);
                  if (var15[1]) {
                     var21.class_(class_(var0.goto_[2], var6, var0.throw_), var0.interface_);
                  }

                  return null;
               }

               if (var11[0] && var11[3]) {
                  var21.class_(class_(var0.goto_[11], var6, var0.throw_), var0.interface_);
                  if (var15[0]) {
                     var21.class_(class_(var0.goto_[0], var6, var0.throw_), var0.interface_);
                  }

                  return null;
               }

               boolean[] var26 = var8.extends_();

               for (int var17 = 0; var17 < 4; var17++) {
                  var26[var17] = break_(var0, var1, var2, var10[var17].class_(var3), var5, var9, var7);
               }

               if (var11[0]) {
                  var21.class_(class_(var0.goto_[9], var6, var0.throw_), var0.interface_);
               }

               if (var11[1]) {
                  var21.class_(class_(var0.goto_[7], var6, var0.throw_), var0.interface_);
               }

               if (var11[2]) {
                  var21.class_(class_(var0.goto_[1], var6, var0.throw_), var0.interface_);
               }

               if (var11[3]) {
                  var21.class_(class_(var0.goto_[15], var6, var0.throw_), var0.interface_);
               }

               if (var15[0] && (var26[1] || var26[2]) && !var11[1] && !var11[2]) {
                  var21.class_(class_(var0.goto_[0], var6, var0.throw_), var0.interface_);
               }

               if (var15[1] && (var26[0] || var26[2]) && !var11[0] && !var11[2]) {
                  var21.class_(class_(var0.goto_[2], var6, var0.throw_), var0.interface_);
               }

               if (var15[2] && (var26[1] || var26[3]) && !var11[1] && !var11[3]) {
                  var21.class_(class_(var0.goto_[14], var6, var0.throw_), var0.interface_);
               }

               if (var15[3] && (var26[0] || var26[3]) && !var11[0] && !var11[3]) {
                  var21.class_(class_(var0.goto_[16], var6, var0.throw_), var0.interface_);
               }

               return null;
            }

            var21.class_(class_(var0.goto_[8], var6, var0.throw_), var0.interface_);
            var13 = null;
         } finally {
            if (var21.class_() > 0) {
               var8.class_(true);
            }
         }

         return (wK_2[])var13;
      }
   }

   private static boolean break_() {
      ArrayList var0 = new ArrayList();

      for (int var1 = 0; var1 < package_.length; var1++) {
         rrbM_2[] var2 = package_[var1];
         if (var2 != null) {
            var0.addAll(Arrays.asList(var2));
         }
      }

      for (int var6 = 0; var6 < final_.length; var6++) {
         rrbM_2[] var8 = final_[var6];
         if (var8 != null) {
            var0.addAll(Arrays.asList(var8));
         }
      }

      rrbM_2[] var7 = var0.toArray(new rrbM_2[var0.size()]);
      HashSet var9 = new HashSet();
      HashSet var3 = new HashSet();

      for (int var4 = 0; var4 < var7.length; var4++) {
         rrbM_2 var5 = var7[var4];
         if (var5.public_ != null) {
            var9.addAll(Arrays.asList(var5.public_));
         }

         if (var5.goto_ != null) {
            var3.addAll(Arrays.asList(var5.goto_));
         }
      }

      var9.retainAll(var3);
      return !var9.isEmpty();
   }

   private static fj_3 throws_(rrbM_2 var0, rRq_1 var1, xc_3 var2, rfH_2 var3, int var4, int var5, fj_3 var6, int var7) {
      boolean var8 = false;
      switch (var4) {
         case 0:
            if (var5 == 1 || var5 == 0) {
               return null;
            }

            var8 = byte_(var0, var1, var2, var3.final_(), var5, var6, var7);
            break;
         case 1:
            if (var5 == 3 || var5 == 2) {
               return null;
            }

            var8 = byte_(var0, var1, var2, var3.protected_(), var5, var6, var7);
            break;
         case 2:
            if (var5 == 5 || var5 == 4) {
               return null;
            }

            var8 = byte_(var0, var1, var2, var3.extends_(), var5, var6, var7);
      }

      return var8 ? var0.goto_[0] : null;
   }

   private static fj_3 protected_(rrbM_2 var0, rRq_1 var1, xc_3 var2, rfH_2 var3, int var4, int var5, fj_3 var6, int var7) {
      fj_3[] var8 = var0.goto_;
      fj_3 var9 = break_(var0, var1, var2, var3, var4, var5, var6, var7);
      if (var9 != null && var9 != var6 && var9 != var8[3]) {
         return var9;
      } else {
         fj_3 var10 = class_(var0, var1, var2, var3, var4, var5, var6, var7);
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
