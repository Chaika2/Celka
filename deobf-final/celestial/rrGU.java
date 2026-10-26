package celestial;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;
import java.util.Random;

public class rrGU {
   private static boolean class_ = true;
   private static boolean break_ = true;
   private static boolean byte_ = true;
   private static boolean protected_ = true;
   private static boolean throws_ = true;
   private static boolean case_ = true;
   private static boolean catch_ = true;
   private static boolean private_ = false;
   private static fj_3 implements_ = null;
   private static fj_3 finally_ = null;
   private static fj_3 extends_ = null;
   private static fj_3 native_ = null;
   private static fj_3 volatile_ = null;
   private static fj_3 final_ = null;
   private static fj_3 package_ = null;
   private static boolean int_ = false;
   private static IJ new_ = null;
   private static IJ continue_ = null;
   private static IJ super_ = null;
   private static IJ this_ = null;
   private static IJ else_ = null;
   private static IJ synchronized_ = null;
   private static boolean return_ = false;
   private static final String public_ = "block/grass_block_top";
   private static final String goto_ = "block/grass_block_side";
   private static final String while_ = "block/grass_path_top";
   private static final String try_ = "block/grass_path_side";
   private static final String instanceof_ = "block/mycelium_top";
   private static final String throw_ = "block/podzol_top";
   private static final String interface_ = "block/snow";
   private static final Random char_ = new Random(0L);

   private static void byte_(fJ_2 var0) {
      class_ = true;
      break_ = true;
      byte_ = true;
      protected_ = true;
      throws_ = true;
      case_ = true;
      catch_ = true;
      implements_ = var0.throws_(new rqO_2("block/grass_block_top"));
      finally_ = var0.throws_(new rqO_2("block/grass_block_side"));
      extends_ = var0.throws_(new rqO_2("block/grass_path_top"));
      native_ = var0.throws_(new rqO_2("block/grass_path_side"));
      volatile_ = var0.throws_(new rqO_2("block/mycelium_top"));
      final_ = var0.throws_(new rqO_2("block/podzol_top"));
      package_ = var0.throws_(new rqO_2("block/snow"));
      int_ = true;
      String var1 = "optifine/bettergrass.properties";

      try {
         rqO_2 var2 = new rqO_2(var1);
         if (!rrbb_3.byte_(var2)) {
            return;
         }

         InputStream var3 = rrbb_3.class_(var2);
         if (var3 == null) {
            return;
         }

         boolean var4 = rrbb_3.protected_(var2);
         if (var4) {
            rrbb_3.byte_("BetterGrass: Parsing default configuration " + var1);
         } else {
            rrbb_3.byte_("BetterGrass: Parsing configuration " + var1);
         }

         rrzE_2 var5 = new rrzE_2();
         var5.load(var3);
         var3.close();
         class_ = class_(var5, "grass", true);
         break_ = class_(var5, "grass_path", true);
         byte_ = class_(var5, "mycelium", true);
         protected_ = class_(var5, "podzol", true);
         throws_ = class_(var5, "grass.snow", true);
         case_ = class_(var5, "mycelium.snow", true);
         catch_ = class_(var5, "podzol.snow", true);
         private_ = class_(var5, "grass.multilayer", false);
         implements_ = class_(var5, "texture.grass", "block/grass_block_top", var0);
         finally_ = class_(var5, "texture.grass_side", "block/grass_block_side", var0);
         extends_ = class_(var5, "texture.grass_path", "block/grass_path_top", var0);
         native_ = class_(var5, "texture.grass_path_side", "block/grass_path_side", var0);
         volatile_ = class_(var5, "texture.mycelium", "block/mycelium_top", var0);
         final_ = class_(var5, "texture.podzol", "block/podzol_top", var0);
         package_ = class_(var5, "texture.snow", "block/snow", var0);
      } catch (IOException var6) {
         rrbb_3.protected_("Error reading: " + var1 + ", " + var6.getClass().getName() + ": " + var6.getMessage());
      }
   }

   private static List byte_(rRq_1 var0, xc_3 var1, rfH_2 var2, rpr_3 var3, List var4) {
      if (!break_) {
         return var4;
      } else if (rrbb_3.u()) {
         return class_(var2.break_(), var3, var0) == xu_3.bt ? continue_.class_(var1, var3, char_) : var4;
      } else {
         return continue_.class_(var1, var3, char_);
      }
   }

   public static List class_(rRq_1 var0, xc_3 var1, rfH_2 var2, rpr_3 var3, List var4) {
      if (var3 == rpr_3.UP || var3 == rpr_3.DOWN) {
         return var4;
      } else if (!return_) {
         return var4;
      } else {
         xd_3 var5 = var1.break_();
         if (var5 instanceof kq_3) {
            return break_(var0, var1, var2, var3, var4);
         } else if (var5 instanceof de_3) {
            return byte_(var0, var1, var2, var3, var4);
         } else if (var5 == xu_3.native_) {
            return protected_(var0, var1, var2, var3, var4);
         } else if (var5 == xu_3.finally_) {
            return throws_(var0, var1, var2, var3, var4);
         } else {
            return var5 instanceof dU_2 ? case_(var0, var1, var2, var3, var4) : var4;
         }
      }
   }

   public static void class_() {
      if (int_) {
         new_ = rrJy_1.class_(implements_, 0);
         if (private_) {
            IJ var0 = rrJy_1.class_(finally_, -1);
            new_ = rrJy_1.class_(var0, new_);
         }

         continue_ = rrJy_1.class_("grass_path", native_, extends_);
         super_ = rrJy_1.class_(extends_, -1);
         this_ = rrJy_1.class_(volatile_, -1);
         else_ = rrJy_1.class_(final_, 0);
         synchronized_ = rrJy_1.class_(package_, -1);
         return_ = true;
      }
   }

   public static void class_(fJ_2 var0) {
      int_ = false;
      return_ = false;
      byte_(var0);
   }

   private static xd_3 class_(rfH_2 var0, rpr_3 var1, rRq_1 var2) {
      rfH_2 var3 = var0.break_(var1);
      return var2.byte_(var3).break_();
   }

   private static fj_3 class_(Properties var0, String var1, String var2, fJ_2 var3) {
      String var4 = var0.getProperty(var1);
      if (var4 == null) {
         var4 = var2;
      }

      rqO_2 var5 = new rqO_2("textures/" + var4 + ".png");
      if (!rrbb_3.byte_(var5)) {
         rrbb_3.protected_("BetterGrass texture not found: " + var5);
         var4 = var2;
      }

      rqO_2 var6 = new rqO_2(var4);
      return var3.throws_(var6);
   }

   private static fj_3 class_(fJ_2 var0, rqO_2 var1) {
      fj_3 var2 = var0.break_(var1);
      if (var2 == null || var2 instanceof fQ_2) {
         rrbb_3.protected_("Missing BetterGrass sprite: " + var1);
      }

      return var2;
   }

   private static boolean class_(Properties var0, String var1, boolean var2) {
      String var3 = var0.getProperty(var1);
      return var3 == null ? var2 : Boolean.parseBoolean(var3);
   }

   private static List break_(rRq_1 var0, xc_3 var1, rfH_2 var2, rpr_3 var3, List var4) {
      xd_3 var5 = var0.byte_(var2.final_()).break_();
      boolean var6 = var5 == xu_3.Pt || var5 == xu_3.Pq;
      if (rrbb_3.u()) {
         if (var6) {
            if (case_ && class_(var2, var3, var0) == xu_3.Pq) {
               return synchronized_.class_(var1, var3, char_);
            }
         } else if (byte_ && class_(var2.break_(), var3, var0) == xu_3.Bi) {
            return this_.class_(var1, var3, char_);
         }
      } else if (var6) {
         if (case_) {
            return synchronized_.class_(var1, var3, char_);
         }
      } else if (byte_) {
         return this_.class_(var1, var3, char_);
      }

      return var4;
   }

   public static void break_(fJ_2 var0) {
      implements_ = class_(var0, implements_.finally_());
      finally_ = class_(var0, finally_.finally_());
      extends_ = class_(var0, extends_.finally_());
      native_ = class_(var0, native_.finally_());
      volatile_ = class_(var0, volatile_.finally_());
      final_ = class_(var0, final_.finally_());
      package_ = class_(var0, package_.finally_());
   }

   private static List throws_(rRq_1 var0, xc_3 var1, rfH_2 var2, rpr_3 var3, List var4) {
      xd_3 var5 = class_(var2, rpr_3.UP, var0);
      return var5 == xu_3.bt && break_ && class_(var2, var3, var0) == xu_3.bt ? super_.class_(var1, var3, char_) : var4;
   }

   private static List case_(rRq_1 var0, xc_3 var1, rfH_2 var2, rpr_3 var3, List var4) {
      xd_3 var5 = var0.byte_(var2.final_()).break_();
      boolean var6 = var5 == xu_3.Pt || var5 == xu_3.Pq;
      if (rrbb_3.u()) {
         if (var6) {
            if (throws_ && class_(var2, var3, var0) == xu_3.Pq) {
               return synchronized_.class_(var1, var3, char_);
            }
         } else if (class_ && class_(var2.break_(), var3, var0) == xu_3.implements_) {
            return new_.class_(var1, var3, char_);
         }
      } else if (var6) {
         if (throws_) {
            return synchronized_.class_(var1, var3, char_);
         }
      } else if (class_) {
         return new_.class_(var1, var3, char_);
      }

      return var4;
   }

   private static List protected_(rRq_1 var0, xc_3 var1, rfH_2 var2, rpr_3 var3, List var4) {
      xd_3 var5 = class_(var2, rpr_3.UP, var0);
      boolean var6 = var5 == xu_3.Pt || var5 == xu_3.Pq;
      if (rrbb_3.u()) {
         if (var6) {
            if (catch_ && class_(var2, var3, var0) == xu_3.Pq) {
               return synchronized_.class_(var1, var3, char_);
            }
         } else if (protected_) {
            rfH_2 var7 = var2.break_().break_(var3);
            xc_3 var8 = var0.byte_(var7);
            if (var8.break_() == xu_3.native_) {
               return else_.class_(var1, var3, char_);
            }
         }
      } else if (var6) {
         if (catch_) {
            return synchronized_.class_(var1, var3, char_);
         }
      } else if (protected_) {
         return else_.class_(var1, var3, char_);
      }

      return var4;
   }
}
