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
   public static final rqO_2 id_class = new rqO_2("textures/atlas/shulker_boxes.png");
   public static final rqO_2 id_break = new rqO_2("textures/atlas/beds.png");
   public static final rqO_2 id_byte = new rqO_2("textures/atlas/banner_patterns.png");
   public static final rqO_2 id_protected = new rqO_2("textures/atlas/shield_patterns.png");
   public static final rqO_2 id_throws = new rqO_2("textures/atlas/signs.png");
   public static final rqO_2 id_case = new rqO_2("textures/atlas/chest.png");
   private static final HU id_else = HU.id_protected(id_class);
   private static final HU id_synchronized = HU.id_break(id_break);
   private static final HU id_return = HU.id_extends(id_byte);
   private static final HU id_public = HU.id_extends(id_protected);
   private static final HU id_goto = HU.id_protected(id_throws);
   private static final HU id_while = HU.id_byte(id_case);
   private static final HU id_try = HU.id_break(fJ_2.id_class);
   private static final HU id_instanceof = HU.id_byte(fJ_2.id_class);
   private static final HU id_throw = HU.id_case(fJ_2.id_class);
   private static final HU id_interface = HU.id_catch(fJ_2.id_class);
   public static final Ig_1 id_catch = new Ig_1(id_class, new rqO_2("entity/shulker/shulker"));
   public static final List<Ig_1> id_private = Stream.of(
         "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"
      )
      .map(var0 -> new Ig_1(id_class, new rqO_2("entity/shulker/shulker_" + var0)))
      .collect(ImmutableList.toImmutableList());
   public static final Map<Qr_1, Ig_1> id_implements = Qr_1.id_class().collect(Collectors.toMap(Function.identity(), lp_3::id_class));
   public static final Ig_1[] id_finally = Arrays.stream(rxL_2.values())
      .sorted(Comparator.comparingInt(rxL_2::id_break))
      .map(var0 -> new Ig_1(id_break, new rqO_2("entity/bed/" + var0.id_byte())))
      .toArray(Ig_1[]::new);
   public static final Ig_1 id_extends = id_class("trapped");
   public static final Ig_1 id_native = id_class("trapped_left");
   public static final Ig_1 id_volatile = id_class("trapped_right");
   public static final Ig_1 id_final = id_class("christmas");
   public static final Ig_1 id_package = id_class("christmas_left");
   public static final Ig_1 id_int = id_class("christmas_right");
   public static final Ig_1 id_new = id_class("normal");
   public static final Ig_1 id_continue = id_class("normal_left");
   public static final Ig_1 id_super = id_class("normal_right");
   public static final Ig_1 id_this = id_class("ender");

   public static HU id_byte() {
      return id_synchronized;
   }

   private static Ig_1 id_class(rCt_1 var0, Ig_1 var1, Ig_1 var2, Ig_1 var3) {
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

   public static Ig_1 id_class(ryO_2 var0, rCt_1 var1, boolean var2) {
      if (var2) {
         return id_class(var1, id_final, id_package, id_int);
      } else if (var0 instanceof ryQ_2) {
         return id_class(var1, id_extends, id_native, id_volatile);
      } else {
         return var0 instanceof rHq_1 ? id_this : id_class(var1, id_new, id_continue, id_super);
      }
   }

   private static Ig_1 id_class(String var0) {
      return new Ig_1(id_case, new rqO_2("entity/chest/" + var0));
   }

   public static HU id_class() {
      return id_return;
   }

   public static Ig_1 id_class(Qr_1 var0) {
      return new Ig_1(id_throws, new rqO_2("entity/signs/" + var0.id_break()));
   }

   public static void id_class(Consumer<Ig_1> var0) {
      var0.accept(id_catch);
      id_private.forEach(var0);

      for (rHE var4 : rHE.values()) {
         var0.accept(new Ig_1(id_byte, var4.id_class(true)));
         var0.accept(new Ig_1(id_protected, var4.id_class(false)));
      }

      id_implements.values().forEach(var0);

      for (Ig_1 var8 : id_finally) {
         var0.accept(var8);
      }

      var0.accept(id_extends);
      var0.accept(id_native);
      var0.accept(id_volatile);
      var0.accept(id_final);
      var0.accept(id_package);
      var0.accept(id_int);
      var0.accept(id_new);
      var0.accept(id_continue);
      var0.accept(id_super);
      var0.accept(id_this);
   }

   public static HU id_break() {
      return id_public;
   }

   public static HU id_throws() {
      return id_goto;
   }

   public static HU id_finally() {
      return id_interface;
   }

   public static HU id_catch() {
      return id_try;
   }

   public static HU id_case() {
      return id_while;
   }

   public static HU id_implements() {
      return id_throw;
   }

   public static HU id_protected() {
      return id_else;
   }

   public static HU id_private() {
      return id_instanceof;
   }
}
