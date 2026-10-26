package celestial;

import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class lp_3 {
   public static final rqO_2 class_ = new rqO_2("textures/atlas/shulker_boxes.png");
   public static final rqO_2 break_ = new rqO_2("textures/atlas/beds.png");
   public static final rqO_2 byte_ = new rqO_2("textures/atlas/banner_patterns.png");
   public static final rqO_2 protected_ = new rqO_2("textures/atlas/shield_patterns.png");
   public static final rqO_2 throws_ = new rqO_2("textures/atlas/signs.png");
   public static final rqO_2 case_ = new rqO_2("textures/atlas/chest.png");
   private static final HU else_ = HU.protected_(class_);
   private static final HU synchronized_ = HU.break_(break_);
   private static final HU return_ = HU.extends_(byte_);
   private static final HU public_ = HU.extends_(protected_);
   private static final HU goto_ = HU.protected_(throws_);
   private static final HU while_ = HU.byte_(case_);
   private static final HU try_ = HU.break_(fJ_2.class_);
   private static final HU instanceof_ = HU.byte_(fJ_2.class_);
   private static final HU throw_ = HU.case_(fJ_2.class_);
   private static final HU interface_ = HU.catch_(fJ_2.class_);
   public static final Ig_1 catch_ = new Ig_1(class_, new rqO_2("entity/shulker/shulker"));
   public static final List<Ig_1> private_ = Stream.of(
         "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"
      )
      .map(var0 -> new Ig_1(class_, new rqO_2("entity/shulker/shulker_" + var0)))
      .collect(ImmutableList.toImmutableList());
   public static final Map<Qr_1, Ig_1> implements_ = Qr_1.class_().collect(Collectors.toMap(Function.identity(), lp_3::class_));
   public static final Ig_1[] finally_ = Arrays.stream(rxL_2.values())
      .sorted(Comparator.comparingInt(rxL_2::break_))
      .map(var0 -> new Ig_1(break_, new rqO_2("entity/bed/" + var0.byte_())))
      .toArray(Ig_1[]::new);
   public static final Ig_1 extends_ = class_("trapped");
   public static final Ig_1 native_ = class_("trapped_left");
   public static final Ig_1 volatile_ = class_("trapped_right");
   public static final Ig_1 final_ = class_("christmas");
   public static final Ig_1 package_ = class_("christmas_left");
   public static final Ig_1 int_ = class_("christmas_right");
   public static final Ig_1 new_ = class_("normal");
   public static final Ig_1 continue_ = class_("normal_left");
   public static final Ig_1 super_ = class_("normal_right");
   public static final Ig_1 this_ = class_("ender");

   public static HU byte_() {
      return synchronized_;
   }

   private static Ig_1 class_(rCt_1 var0, Ig_1 var1, Ig_1 var2, Ig_1 var3) {
      switch (var0) {
         case LEFT:
            return var2;
         case RIGHT:
            return var3;
         case SINGLE:
         default:
            return var1;
      }
   }

   public static Ig_1 class_(ryO_2 var0, rCt_1 var1, boolean var2) {
      if (var2) {
         return class_(var1, final_, package_, int_);
      } else if (var0 instanceof ryQ_2) {
         return class_(var1, extends_, native_, volatile_);
      } else {
         return var0 instanceof rHq_1 ? this_ : class_(var1, new_, continue_, super_);
      }
   }

   private static Ig_1 class_(String var0) {
      return new Ig_1(case_, new rqO_2("entity/chest/" + var0));
   }

   public static HU class_() {
      return return_;
   }

   public static Ig_1 class_(Qr_1 var0) {
      return new Ig_1(throws_, new rqO_2("entity/signs/" + var0.break_()));
   }

   public static void class_(Consumer<Ig_1> var0) {
      var0.accept(catch_);
      private_.forEach(var0);

      for (rHE var4 : rHE.values()) {
         var0.accept(new Ig_1(byte_, var4.class_(true)));
         var0.accept(new Ig_1(protected_, var4.class_(false)));
      }

      implements_.values().forEach(var0);

      for (Ig_1 var8 : finally_) {
         var0.accept(var8);
      }

      var0.accept(extends_);
      var0.accept(native_);
      var0.accept(volatile_);
      var0.accept(final_);
      var0.accept(package_);
      var0.accept(int_);
      var0.accept(new_);
      var0.accept(continue_);
      var0.accept(super_);
      var0.accept(this_);
   }

   public static HU break_() {
      return public_;
   }

   public static HU throws_() {
      return goto_;
   }

   public static HU finally_() {
      return interface_;
   }

   public static HU catch_() {
      return try_;
   }

   public static HU case_() {
      return while_;
   }

   public static HU implements_() {
      return throw_;
   }

   public static HU protected_() {
      return else_;
   }

   public static HU private_() {
      return instanceof_;
   }
}
