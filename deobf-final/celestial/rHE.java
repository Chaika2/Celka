package celestial;

import java.util.Arrays;

public enum rHE {
   BASE("base", "b", false),
   SQUARE_BOTTOM_LEFT("square_bottom_left", "bl"),
   SQUARE_BOTTOM_RIGHT("square_bottom_right", "br"),
   SQUARE_TOP_LEFT("square_top_left", "tl"),
   SQUARE_TOP_RIGHT("square_top_right", "tr"),
   STRIPE_BOTTOM("stripe_bottom", "bs"),
   STRIPE_TOP("stripe_top", "ts"),
   STRIPE_LEFT("stripe_left", "ls"),
   STRIPE_RIGHT("stripe_right", "rs"),
   STRIPE_CENTER("stripe_center", "cs"),
   STRIPE_MIDDLE("stripe_middle", "ms"),
   STRIPE_DOWNRIGHT("stripe_downright", "drs"),
   STRIPE_DOWNLEFT("stripe_downleft", "dls"),
   STRIPE_SMALL("small_stripes", "ss"),
   CROSS("cross", "cr"),
   STRAIGHT_CROSS("straight_cross", "sc"),
   TRIANGLE_BOTTOM("triangle_bottom", "bt"),
   TRIANGLE_TOP("triangle_top", "tt"),
   TRIANGLES_BOTTOM("triangles_bottom", "bts"),
   TRIANGLES_TOP("triangles_top", "tts"),
   DIAGONAL_LEFT("diagonal_left", "ld"),
   DIAGONAL_RIGHT("diagonal_up_right", "rd"),
   DIAGONAL_LEFT_MIRROR("diagonal_up_left", "lud"),
   DIAGONAL_RIGHT_MIRROR("diagonal_right", "rud"),
   CIRCLE_MIDDLE("circle", "mc"),
   RHOMBUS_MIDDLE("rhombus", "mr"),
   HALF_VERTICAL("half_vertical", "vh"),
   HALF_HORIZONTAL("half_horizontal", "hh"),
   HALF_VERTICAL_MIRROR("half_vertical_right", "vhr"),
   HALF_HORIZONTAL_MIRROR("half_horizontal_bottom", "hhb"),
   BORDER("border", "bo"),
   CURLY_BORDER("curly_border", "cbo"),
   GRADIENT("gradient", "gra"),
   GRADIENT_UP("gradient_up", "gru"),
   BRICKS("bricks", "bri"),
   GLOBE("globe", "glb", true),
   CREEPER("creeper", "cre", true),
   SKULL("skull", "sku", true),
   FLOWER("flower", "flo", true),
   MOJANG("mojang", "moj", true),
   PIGLIN("piglin", "pig", true);

   private static final rHE[] BANNER_PATTERNS = values();
   public static final int BANNER_PATTERNS_COUNT = BANNER_PATTERNS.length;
   public static final int BANNERS_WITH_ITEMS = (int)Arrays.stream(BANNER_PATTERNS).filter(var0 -> var0.hasPatternItem).count();
   public static final int PATTERN_ITEM_INDEX = BANNER_PATTERNS_COUNT - BANNERS_WITH_ITEMS - 1;
   private final boolean hasPatternItem;
   private final String fileName;
   final String hashname;

   private rHE(String var3, String var4) {
      this(var3, var4, false);
   }

   private rHE(String var3, String var4, boolean var5) {
      this.fileName = var3;
      this.hashname = var4;
      this.hasPatternItem = var5;
   }

   public String class_() {
      return this.fileName;
   }

   public static rHE class_(String var0) {
      for (rHE var4 : values()) {
         if (var4.hashname.equals(var0)) {
            return var4;
         }
      }

      return null;
   }

   public rqO_2 class_(boolean var1) {
      String var2 = var1 ? "banner" : "shield";
      return new rqO_2("entity/" + var2 + "/" + this.class_());
   }

   public String break_() {
      return this.hashname;
   }
}
