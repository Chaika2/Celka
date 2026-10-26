package celestial;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;
import java.util.Random;

public class rrGU {
   private static boolean id_class = true;
   private static boolean id_break = true;
   private static boolean id_byte = true;
   private static boolean id_protected = true;
   private static boolean id_throws = true;
   private static boolean id_case = true;
   private static boolean id_catch = true;
   private static boolean id_private = false;
   private static fj_3 id_implements = null;
   private static fj_3 id_finally = null;
   private static fj_3 id_extends = null;
   private static fj_3 id_native = null;
   private static fj_3 id_volatile = null;
   private static fj_3 id_final = null;
   private static fj_3 id_package = null;
   private static boolean id_int = false;
   private static IJ id_new = null;
   private static IJ id_continue = null;
   private static IJ id_super = null;
   private static IJ id_this = null;
   private static IJ id_else = null;
   private static IJ id_synchronized = null;
   private static boolean id_return = false;
   private static final String id_public = "block/grass_block_top";
   private static final String id_goto = "block/grass_block_side";
   private static final String id_while = "block/grass_path_top";
   private static final String id_try = "block/grass_path_side";
   private static final String id_instanceof = "block/mycelium_top";
   private static final String id_throw = "block/podzol_top";
   private static final String id_interface = "block/snow";
   private static final Random id_char = new Random(0L);

   private static void id_byte(fJ_2 var0) {
      id_class = true;
      id_break = true;
      id_byte = true;
      id_protected = true;
      id_throws = true;
      id_case = true;
      id_catch = true;
      id_implements = var0.id_throws(new rqO_2("block/grass_block_top"));
      id_finally = var0.id_throws(new rqO_2("block/grass_block_side"));
      id_extends = var0.id_throws(new rqO_2("block/grass_path_top"));
      id_native = var0.id_throws(new rqO_2("block/grass_path_side"));
      id_volatile = var0.id_throws(new rqO_2("block/mycelium_top"));
      id_final = var0.id_throws(new rqO_2("block/podzol_top"));
      id_package = var0.id_throws(new rqO_2("block/snow"));
      id_int = true;
      String var1 = "optifine/bettergrass.properties";

      try {
         rqO_2 var2 = new rqO_2(var1);
         if (!rrbb_3.id_byte(var2)) {
            return;
         }

         InputStream var3 = rrbb_3.id_class(var2);
         if (var3 == null) {
            return;
         }

         boolean var4 = rrbb_3.id_protected(var2);
         if (var4) {
            rrbb_3.id_byte("BetterGrass: Parsing default configuration " + var1);
         } else {
            rrbb_3.id_byte("BetterGrass: Parsing configuration " + var1);
         }

         rrzE_2 var5 = new rrzE_2();
         var5.load(var3);
         var3.close();
         id_class = id_class(var5, "grass", true);
         id_break = id_class(var5, "grass_path", true);
         id_byte = id_class(var5, "mycelium", true);
         id_protected = id_class(var5, "podzol", true);
         id_throws = id_class(var5, "grass.snow", true);
         id_case = id_class(var5, "mycelium.snow", true);
         id_catch = id_class(var5, "podzol.snow", true);
         id_private = id_class(var5, "grass.multilayer", false);
         id_implements = id_class(var5, "texture.grass", "block/grass_block_top", var0);
         id_finally = id_class(var5, "texture.grass_side", "block/grass_block_side", var0);
         id_extends = id_class(var5, "texture.grass_path", "block/grass_path_top", var0);
         id_native = id_class(var5, "texture.grass_path_side", "block/grass_path_side", var0);
         id_volatile = id_class(var5, "texture.mycelium", "block/mycelium_top", var0);
         id_final = id_class(var5, "texture.podzol", "block/podzol_top", var0);
         id_package = id_class(var5, "texture.snow", "block/snow", var0);
      } catch (IOException var6) {
         rrbb_3.id_protected("Error reading: " + var1 + ", " + var6.getClass().getName() + ": " + var6.getMessage());
      }
   }

   private static List id_byte(rRq_1 var0, xc_3 var1, rfH_2 var2, rpr_3 var3, List var4) {
      if (!id_break) {
         return var4;
      } else if (rrbb_3.u()) {
         return id_class(var2.id_break(), var3, var0) == xu_3.bt ? id_continue.id_class(var1, var3, id_char) : var4;
      } else {
         return id_continue.id_class(var1, var3, id_char);
      }
   }

   public static List id_class(rRq_1 var0, xc_3 var1, rfH_2 var2, rpr_3 var3, List var4) {
      if (var3 == rpr_3.UP || var3 == rpr_3.DOWN) {
         return var4;
      } else if (!id_return) {
         return var4;
      } else {
         xd_3 var5 = var1.id_break();
         if (var5 instanceof kq_3) {
            return id_break(var0, var1, var2, var3, var4);
         } else if (var5 instanceof de_3) {
            return id_byte(var0, var1, var2, var3, var4);
         } else if (var5 == xu_3.id_native) {
            return id_protected(var0, var1, var2, var3, var4);
         } else if (var5 == xu_3.id_finally) {
            return id_throws(var0, var1, var2, var3, var4);
         } else {
            return var5 instanceof dU_2 ? id_case(var0, var1, var2, var3, var4) : var4;
         }
      }
   }

   public static void id_class() {
      if (id_int) {
         id_new = rrJy_1.id_class(id_implements, 0);
         if (id_private) {
            IJ var0 = rrJy_1.id_class(id_finally, -1);
            id_new = rrJy_1.id_class(var0, id_new);
         }

         id_continue = rrJy_1.id_class("grass_path", id_native, id_extends);
         id_super = rrJy_1.id_class(id_extends, -1);
         id_this = rrJy_1.id_class(id_volatile, -1);
         id_else = rrJy_1.id_class(id_final, 0);
         id_synchronized = rrJy_1.id_class(id_package, -1);
         id_return = true;
      }
   }

   public static void id_class(fJ_2 var0) {
      id_int = false;
      id_return = false;
      id_byte(var0);
   }

   private static xd_3 id_class(rfH_2 var0, rpr_3 var1, rRq_1 var2) {
      rfH_2 var3 = var0.id_break(var1);
      return var2.id_byte(var3).id_break();
   }

   private static fj_3 id_class(Properties var0, String var1, String var2, fJ_2 var3) {
      String var4 = var0.getProperty(var1);
      if (var4 == null) {
         var4 = var2;
      }

      rqO_2 var5 = new rqO_2("textures/" + var4 + ".png");
      if (!rrbb_3.id_byte(var5)) {
         rrbb_3.id_protected("BetterGrass texture not found: " + var5);
         var4 = var2;
      }

      rqO_2 var6 = new rqO_2(var4);
      return var3.id_throws(var6);
   }

   private static fj_3 id_class(fJ_2 var0, rqO_2 var1) {
      fj_3 var2 = var0.id_break(var1);
      if (var2 == null || var2 instanceof fQ_2) {
         rrbb_3.id_protected("Missing BetterGrass sprite: " + var1);
      }

      return var2;
   }

   private static boolean id_class(Properties var0, String var1, boolean var2) {
      String var3 = var0.getProperty(var1);
      return var3 == null ? var2 : Boolean.parseBoolean(var3);
   }

   private static List id_break(rRq_1 var0, xc_3 var1, rfH_2 var2, rpr_3 var3, List var4) {
      xd_3 var5 = var0.id_byte(var2.id_final()).id_break();
      boolean var6 = var5 == xu_3.Pt || var5 == xu_3.Pq;
      if (rrbb_3.u()) {
         if (var6) {
            if (id_case && id_class(var2, var3, var0) == xu_3.Pq) {
               return id_synchronized.id_class(var1, var3, id_char);
            }
         } else if (id_byte && id_class(var2.id_break(), var3, var0) == xu_3.Bi) {
            return id_this.id_class(var1, var3, id_char);
         }
      } else if (var6) {
         if (id_case) {
            return id_synchronized.id_class(var1, var3, id_char);
         }
      } else if (id_byte) {
         return id_this.id_class(var1, var3, id_char);
      }

      return var4;
   }

   public static void id_break(fJ_2 var0) {
      id_implements = id_class(var0, id_implements.id_finally());
      id_finally = id_class(var0, id_finally.id_finally());
      id_extends = id_class(var0, id_extends.id_finally());
      id_native = id_class(var0, id_native.id_finally());
      id_volatile = id_class(var0, id_volatile.id_finally());
      id_final = id_class(var0, id_final.id_finally());
      id_package = id_class(var0, id_package.id_finally());
   }

   private static List id_throws(rRq_1 var0, xc_3 var1, rfH_2 var2, rpr_3 var3, List var4) {
      xd_3 var5 = id_class(var2, rpr_3.UP, var0);
      return var5 == xu_3.bt && id_break && id_class(var2, var3, var0) == xu_3.bt ? id_super.id_class(var1, var3, id_char) : var4;
   }

   private static List id_case(rRq_1 var0, xc_3 var1, rfH_2 var2, rpr_3 var3, List var4) {
      xd_3 var5 = var0.id_byte(var2.id_final()).id_break();
      boolean var6 = var5 == xu_3.Pt || var5 == xu_3.Pq;
      if (rrbb_3.u()) {
         if (var6) {
            if (id_throws && id_class(var2, var3, var0) == xu_3.Pq) {
               return id_synchronized.id_class(var1, var3, id_char);
            }
         } else if (id_class && id_class(var2.id_break(), var3, var0) == xu_3.id_implements) {
            return id_new.id_class(var1, var3, id_char);
         }
      } else if (var6) {
         if (id_throws) {
            return id_synchronized.id_class(var1, var3, id_char);
         }
      } else if (id_class) {
         return id_new.id_class(var1, var3, id_char);
      }

      return var4;
   }

   private static List id_protected(rRq_1 var0, xc_3 var1, rfH_2 var2, rpr_3 var3, List var4) {
      xd_3 var5 = id_class(var2, rpr_3.UP, var0);
      boolean var6 = var5 == xu_3.Pt || var5 == xu_3.Pq;
      if (rrbb_3.u()) {
         if (var6) {
            if (id_catch && id_class(var2, var3, var0) == xu_3.Pq) {
               return id_synchronized.id_class(var1, var3, id_char);
            }
         } else if (id_protected) {
            rfH_2 var7 = var2.id_break().id_break(var3);
            xc_3 var8 = var0.id_byte(var7);
            if (var8.id_break() == xu_3.id_native) {
               return id_else.id_class(var1, var3, id_char);
            }
         }
      } else if (var6) {
         if (id_catch) {
            return id_synchronized.id_class(var1, var3, id_char);
         }
      } else if (id_protected) {
         return id_else.id_class(var1, var3, id_char);
      }

      return var4;
   }
}
