package celestial;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class jR_2 implements rAC {
   private static final Map<String, Pair<rCt_1, rqO_2>> protected_ = rqR_2.class_(Maps.newHashMap(), var0 -> {
      var0.put("textures/entity/chest/normal_left.png", new Pair(rCt_1.LEFT, new rqO_2("textures/entity/chest/normal_double.png")));
      var0.put("textures/entity/chest/normal_right.png", new Pair(rCt_1.RIGHT, new rqO_2("textures/entity/chest/normal_double.png")));
      var0.put("textures/entity/chest/normal.png", new Pair(rCt_1.SINGLE, new rqO_2("textures/entity/chest/normal.png")));
      var0.put("textures/entity/chest/trapped_left.png", new Pair(rCt_1.LEFT, new rqO_2("textures/entity/chest/trapped_double.png")));
      var0.put("textures/entity/chest/trapped_right.png", new Pair(rCt_1.RIGHT, new rqO_2("textures/entity/chest/trapped_double.png")));
      var0.put("textures/entity/chest/trapped.png", new Pair(rCt_1.SINGLE, new rqO_2("textures/entity/chest/trapped.png")));
      var0.put("textures/entity/chest/christmas_left.png", new Pair(rCt_1.LEFT, new rqO_2("textures/entity/chest/christmas_double.png")));
      var0.put("textures/entity/chest/christmas_right.png", new Pair(rCt_1.RIGHT, new rqO_2("textures/entity/chest/christmas_double.png")));
      var0.put("textures/entity/chest/christmas.png", new Pair(rCt_1.SINGLE, new rqO_2("textures/entity/chest/christmas.png")));
      var0.put("textures/entity/chest/ender.png", new Pair(rCt_1.SINGLE, new rqO_2("textures/entity/chest/ender.png")));
   });
   private static final List<String> throws_ = Lists.newArrayList(
      new String[]{
         "base",
         "border",
         "bricks",
         "circle",
         "creeper",
         "cross",
         "curly_border",
         "diagonal_left",
         "diagonal_right",
         "diagonal_up_left",
         "diagonal_up_right",
         "flower",
         "globe",
         "gradient",
         "gradient_up",
         "half_horizontal",
         "half_horizontal_bottom",
         "half_vertical",
         "half_vertical_right",
         "mojang",
         "rhombus",
         "skull",
         "small_stripes",
         "square_bottom_left",
         "square_bottom_right",
         "square_top_left",
         "square_top_right",
         "straight_cross",
         "stripe_bottom",
         "stripe_center",
         "stripe_downleft",
         "stripe_downright",
         "stripe_left",
         "stripe_middle",
         "stripe_right",
         "stripe_top",
         "triangle_bottom",
         "triangle_top",
         "triangles_bottom",
         "triangles_top"
      }
   );
   private static final Set<String> case_ = throws_.stream().map(var0 -> "textures/entity/shield/" + var0 + ".png").collect(Collectors.toSet());
   private static final Set<String> catch_ = throws_.stream().map(var0 -> "textures/entity/banner/" + var0 + ".png").collect(Collectors.toSet());
   public static final rqO_2 class_ = new rqO_2("textures/entity/shield_base.png");
   public static final rqO_2 break_ = new rqO_2("textures/entity/banner_base.png");
   public static final rqO_2 byte_ = new rqO_2("textures/entity/iron_golem.png");
   private final rAC private_;

   public static InputStream byte_(InputStream var0) throws IOException {
      ByteArrayInputStream var1;
      try (fN_2 var2 = fN_2.class_(var0)) {
         int var3 = var2.class_();
         int var4 = var2.break_();

         try (fN_2 var5 = new fN_2(var3 / 2, var4, true)) {
            int var6 = var4 / 64;
            class_(var2, var5, 14, 0, 29, 0, 15, 14, var6, false, true);
            class_(var2, var5, 44, 0, 14, 0, 15, 14, var6, false, true);
            class_(var2, var5, 0, 14, 0, 14, 14, 5, var6, true, true);
            class_(var2, var5, 14, 14, 43, 14, 15, 5, var6, true, true);
            class_(var2, var5, 73, 14, 14, 14, 15, 5, var6, true, true);
            class_(var2, var5, 14, 19, 29, 19, 15, 14, var6, false, true);
            class_(var2, var5, 44, 19, 14, 19, 15, 14, var6, false, true);
            class_(var2, var5, 0, 33, 0, 33, 14, 10, var6, true, true);
            class_(var2, var5, 14, 33, 43, 33, 15, 10, var6, true, true);
            class_(var2, var5, 73, 33, 14, 33, 15, 10, var6, true, true);
            class_(var2, var5, 1, 0, 2, 0, 1, 1, var6, false, true);
            class_(var2, var5, 3, 0, 1, 0, 1, 1, var6, false, true);
            class_(var2, var5, 0, 1, 0, 1, 1, 4, var6, true, true);
            class_(var2, var5, 1, 1, 3, 1, 1, 4, var6, true, true);
            class_(var2, var5, 5, 1, 1, 1, 1, 4, var6, true, true);
            var1 = new ByteArrayInputStream(var5.throws_());
         }
      }

      return var1;
   }

   public jR_2(rAC var1) {
      this.private_ = var1;
   }

   private static void class_(fN_2 var0, fN_2 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, boolean var10) {
      var7 *= var8;
      var6 *= var8;
      var4 *= var8;
      var5 *= var8;
      var2 *= var8;
      var3 *= var8;

      for (int var11 = 0; var11 < var7; var11++) {
         for (int var12 = 0; var12 < var6; var12++) {
            var1.class_(var4 + var12, var5 + var11, var0.class_(var2 + (var9 ? var6 - 1 - var12 : var12), var3 + (var10 ? var7 - 1 - var11 : var11)));
         }
      }
   }

   @Override
   public String class_() {
      return this.private_.class_();
   }

   @Override
   public <T> T class_(rAo_1<T> var1) throws IOException {
      return this.private_.class_(var1);
   }

   @Override
   public Set<String> class_(rAI var1) {
      return this.private_.class_(var1);
   }

   @Override
   public InputStream class_(String var1) throws IOException {
      return this.private_.class_(var1);
   }

   @Override
   public Collection<rqO_2> class_(rAI var1, String var2, String var3, int var4, Predicate<String> var5) {
      return this.private_.class_(var1, var2, var3, var4, var5);
   }

   public static InputStream class_(InputStream var0) throws IOException {
      ByteArrayInputStream var1;
      try (fN_2 var2 = fN_2.class_(var0)) {
         int var3 = var2.class_();
         int var4 = var2.break_();

         try (fN_2 var5 = new fN_2(2 * var3, 2 * var4, true)) {
            class_(var2, var5, 0, 0, 0, 0, var3, var4, 1, false, false);
            var1 = new ByteArrayInputStream(var5.throws_());
         }
      }

      return var1;
   }

   @Override
   public InputStream class_(rAI var1, rqO_2 var2) throws IOException {
      if (!"minecraft".equals(var2.byte_())) {
         return this.private_.class_(var1, var2);
      } else {
         String var3 = var2.break_();
         if ("textures/entity/iron_golem/iron_golem.png".equals(var3)) {
            return this.private_.class_(var1, byte_);
         } else {
            if (case_.contains(var3)) {
               InputStream var13 = class_(this.private_.class_(var1, class_), this.private_.class_(var1, var2), 64, 2, 2, 12, 22);
               if (var13 != null) {
                  return var13;
               }
            } else if (catch_.contains(var3)) {
               InputStream var12 = class_(this.private_.class_(var1, break_), this.private_.class_(var1, var2), 64, 0, 0, 42, 41);
               if (var12 != null) {
                  return var12;
               }
            } else {
               if ("textures/entity/enderdragon/dragon.png".equals(var3) || "textures/entity/enderdragon/dragon_exploding.png".equals(var3)) {
                  ByteArrayInputStream var11;
                  try (fN_2 var14 = fN_2.class_(this.private_.class_(var1, var2))) {
                     int var15 = var14.class_() / 256;

                     for (int var7 = 88 * var15; var7 < 200 * var15; var7++) {
                        for (int var8 = 56 * var15; var8 < 112 * var15; var8++) {
                           var14.class_(var8, var7, 0);
                        }
                     }

                     var11 = new ByteArrayInputStream(var14.throws_());
                  }

                  return var11;
               }

               if ("textures/entity/conduit/closed_eye.png".equals(var3) || "textures/entity/conduit/open_eye.png".equals(var3)) {
                  return class_(this.private_.class_(var1, var2));
               }

               Pair var4 = protected_.get(var3);
               if (var4 != null) {
                  rCt_1 var5 = (rCt_1)var4.getFirst();
                  InputStream var6 = this.private_.class_(var1, (rqO_2)var4.getSecond());
                  if (var5 == rCt_1.SINGLE) {
                     return protected_(var6);
                  }

                  if (var5 == rCt_1.LEFT) {
                     return break_(var6);
                  }

                  if (var5 == rCt_1.RIGHT) {
                     return byte_(var6);
                  }
               }
            }

            return this.private_.class_(var1, var2);
         }
      }
   }

   public static InputStream class_(InputStream var0, InputStream var1, int var2, int var3, int var4, int var5, int var6) throws IOException {
      Object var24;
      try (
         fN_2 var8 = fN_2.class_(var1);
         fN_2 var9 = fN_2.class_(var0);
      ) {
         int var10 = var9.class_();
         int var11 = var9.break_();
         if (var10 == var8.class_() && var11 == var8.break_()) {
            try (fN_2 var12 = new fN_2(var10, var11, true)) {
               int var13 = var10 / var2;

               for (int var14 = var4 * var13; var14 < var6 * var13; var14++) {
                  for (int var15 = var3 * var13; var15 < var5 * var13; var15++) {
                     int var16 = fN_2.break_(var8.class_(var15, var14));
                     int var17 = var9.class_(var15, var14);
                     var12.class_(var15, var14, fN_2.class_(var16, fN_2.protected_(var17), fN_2.byte_(var17), fN_2.break_(var17)));
                  }
               }

               return new ByteArrayInputStream(var12.throws_());
            }
         }

         var24 = null;
      }

      return (InputStream)var24;
   }

   @Override
   public void close() {
      this.private_.close();
   }

   @Override
   public boolean break_(rAI var1, rqO_2 var2) {
      if (!"minecraft".equals(var2.byte_())) {
         return this.private_.break_(var1, var2);
      } else {
         String var3 = var2.break_();
         if ("textures/misc/enchanted_item_glint.png".equals(var3)) {
            return false;
         } else if ("textures/entity/iron_golem/iron_golem.png".equals(var3)) {
            return this.private_.break_(var1, byte_);
         } else if ("textures/entity/conduit/wind.png".equals(var3) || "textures/entity/conduit/wind_vertical.png".equals(var3)) {
            return false;
         } else if (case_.contains(var3)) {
            return this.private_.break_(var1, class_) && this.private_.break_(var1, var2);
         } else if (!catch_.contains(var3)) {
            Pair var4 = protected_.get(var3);
            return var4 != null && this.private_.break_(var1, (rqO_2)var4.getSecond()) ? true : this.private_.break_(var1, var2);
         } else {
            return this.private_.break_(var1, break_) && this.private_.break_(var1, var2);
         }
      }
   }

   public static InputStream break_(InputStream var0) throws IOException {
      ByteArrayInputStream var1;
      try (fN_2 var2 = fN_2.class_(var0)) {
         int var3 = var2.class_();
         int var4 = var2.break_();

         try (fN_2 var5 = new fN_2(var3 / 2, var4, true)) {
            int var6 = var4 / 64;
            class_(var2, var5, 29, 0, 29, 0, 15, 14, var6, false, true);
            class_(var2, var5, 59, 0, 14, 0, 15, 14, var6, false, true);
            class_(var2, var5, 29, 14, 43, 14, 15, 5, var6, true, true);
            class_(var2, var5, 44, 14, 29, 14, 14, 5, var6, true, true);
            class_(var2, var5, 58, 14, 14, 14, 15, 5, var6, true, true);
            class_(var2, var5, 29, 19, 29, 19, 15, 14, var6, false, true);
            class_(var2, var5, 59, 19, 14, 19, 15, 14, var6, false, true);
            class_(var2, var5, 29, 33, 43, 33, 15, 10, var6, true, true);
            class_(var2, var5, 44, 33, 29, 33, 14, 10, var6, true, true);
            class_(var2, var5, 58, 33, 14, 33, 15, 10, var6, true, true);
            class_(var2, var5, 2, 0, 2, 0, 1, 1, var6, false, true);
            class_(var2, var5, 4, 0, 1, 0, 1, 1, var6, false, true);
            class_(var2, var5, 2, 1, 3, 1, 1, 4, var6, true, true);
            class_(var2, var5, 3, 1, 2, 1, 1, 4, var6, true, true);
            class_(var2, var5, 4, 1, 1, 1, 1, 4, var6, true, true);
            var1 = new ByteArrayInputStream(var5.throws_());
         }
      }

      return var1;
   }

   public static InputStream protected_(InputStream var0) throws IOException {
      ByteArrayInputStream var1;
      try (fN_2 var2 = fN_2.class_(var0)) {
         int var3 = var2.class_();
         int var4 = var2.break_();

         try (fN_2 var5 = new fN_2(var3, var4, true)) {
            int var6 = var4 / 64;
            class_(var2, var5, 14, 0, 28, 0, 14, 14, var6, false, true);
            class_(var2, var5, 28, 0, 14, 0, 14, 14, var6, false, true);
            class_(var2, var5, 0, 14, 0, 14, 14, 5, var6, true, true);
            class_(var2, var5, 14, 14, 42, 14, 14, 5, var6, true, true);
            class_(var2, var5, 28, 14, 28, 14, 14, 5, var6, true, true);
            class_(var2, var5, 42, 14, 14, 14, 14, 5, var6, true, true);
            class_(var2, var5, 14, 19, 28, 19, 14, 14, var6, false, true);
            class_(var2, var5, 28, 19, 14, 19, 14, 14, var6, false, true);
            class_(var2, var5, 0, 33, 0, 33, 14, 10, var6, true, true);
            class_(var2, var5, 14, 33, 42, 33, 14, 10, var6, true, true);
            class_(var2, var5, 28, 33, 28, 33, 14, 10, var6, true, true);
            class_(var2, var5, 42, 33, 14, 33, 14, 10, var6, true, true);
            class_(var2, var5, 1, 0, 3, 0, 2, 1, var6, false, true);
            class_(var2, var5, 3, 0, 1, 0, 2, 1, var6, false, true);
            class_(var2, var5, 0, 1, 0, 1, 1, 4, var6, true, true);
            class_(var2, var5, 1, 1, 4, 1, 2, 4, var6, true, true);
            class_(var2, var5, 3, 1, 3, 1, 1, 4, var6, true, true);
            class_(var2, var5, 4, 1, 1, 1, 2, 4, var6, true, true);
            var1 = new ByteArrayInputStream(var5.throws_());
         }
      }

      return var1;
   }
}
