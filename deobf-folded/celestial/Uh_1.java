package celestial;

import java.util.Optional;
import java.util.stream.IntStream;

public class Uh_1 {
   public static final DD id_class = id_class("cube", UX.id_byte, UX.id_finally, UX.id_extends, UX.id_native, UX.id_volatile, UX.id_final, UX.id_package);
   public static final DD id_break = id_class(
      "cube_directional", UX.id_byte, UX.id_finally, UX.id_extends, UX.id_native, UX.id_volatile, UX.id_final, UX.id_package
   );
   public static final DD id_byte = id_class("cube_all", UX.id_class);
   public static final DD id_protected = id_class("cube_mirrored_all", "_mirrored", UX.id_class);
   public static final DD id_throws = id_class("cube_column", UX.id_protected, UX.id_implements);
   public static final DD id_case = id_class("cube_column_horizontal", "_horizontal", UX.id_protected, UX.id_implements);
   public static final DD id_catch = id_class("cube_top", UX.id_case, UX.id_implements);
   public static final DD id_private = id_class("cube_bottom_top", UX.id_case, UX.id_throws, UX.id_implements);
   public static final DD id_implements = id_class("orientable", UX.id_case, UX.id_catch, UX.id_implements);
   public static final DD id_finally = id_class("orientable_with_bottom", UX.id_case, UX.id_throws, UX.id_implements, UX.id_catch);
   public static final DD id_extends = id_class("orientable_vertical", "_vertical", UX.id_catch, UX.id_implements);
   public static final DD id_native = id_class("button", UX.id_break);
   public static final DD id_volatile = id_class("button_pressed", "_pressed", UX.id_break);
   public static final DD id_final = id_class("button_inventory", "_inventory", UX.id_break);
   public static final DD id_package = id_class("door_bottom", "_bottom", UX.id_case, UX.id_throws);
   public static final DD id_int = id_class("door_bottom_rh", "_bottom_hinge", UX.id_case, UX.id_throws);
   public static final DD id_new = id_class("door_top", "_top", UX.id_case, UX.id_throws);
   public static final DD id_continue = id_class("door_top_rh", "_top_hinge", UX.id_case, UX.id_throws);
   public static final DD id_super = id_class("fence_post", "_post", UX.id_break);
   public static final DD id_this = id_class("fence_side", "_side", UX.id_break);
   public static final DD id_else = id_class("fence_inventory", "_inventory", UX.id_break);
   public static final DD id_synchronized = id_class("template_wall_post", "_post", UX.id_continue);
   public static final DD id_return = id_class("template_wall_side", "_side", UX.id_continue);
   public static final DD id_public = id_class("template_wall_side_tall", "_side_tall", UX.id_continue);
   public static final DD id_goto = id_class("wall_inventory", "_inventory", UX.id_continue);
   public static final DD id_while = id_class("template_fence_gate", UX.id_break);
   public static final DD id_try = id_class("template_fence_gate_open", "_open", UX.id_break);
   public static final DD id_instanceof = id_class("template_fence_gate_wall", "_wall", UX.id_break);
   public static final DD id_throw = id_class("template_fence_gate_wall_open", "_wall_open", UX.id_break);
   public static final DD id_interface = id_class("pressure_plate_up", UX.id_break);
   public static final DD id_char = id_class("pressure_plate_down", "_down", UX.id_break);
   public static final DD id_abstract = id_class(UX.id_byte);
   public static final DD id_long = id_class("slab", UX.id_throws, UX.id_case, UX.id_implements);
   public static final DD id_float = id_class("slab_top", "_top", UX.id_throws, UX.id_case, UX.id_implements);
   public static final DD id_void = id_class("leaves", UX.id_class);
   public static final DD id_static = id_class("stairs", UX.id_throws, UX.id_case, UX.id_implements);
   public static final DD id_import = id_class("inner_stairs", "_inner", UX.id_throws, UX.id_case, UX.id_implements);
   public static final DD id_short = id_class("outer_stairs", "_outer", UX.id_throws, UX.id_case, UX.id_implements);
   public static final DD id_default = id_class("template_trapdoor_top", "_top", UX.id_break);
   public static final DD id_const = id_class("template_trapdoor_bottom", "_bottom", UX.id_break);
   public static final DD id_strictfp = id_class("template_trapdoor_open", "_open", UX.id_break);
   public static final DD id_boolean = id_class("template_orientable_trapdoor_top", "_top", UX.id_break);
   public static final DD id_transient = id_class("template_orientable_trapdoor_bottom", "_bottom", UX.id_break);
   public static final DD id_for = id_class("template_orientable_trapdoor_open", "_open", UX.id_break);
   public static final DD id_double = id_class("cross", UX.id_int);
   public static final DD id_switch = id_class("tinted_cross", UX.id_int);
   public static final DD r = id_class("flower_pot_cross", UX.id_new);
   public static final DD P = id_class("tinted_flower_pot_cross", UX.id_new);
   public static final DD B = id_class("rail_flat", UX.id_super);
   public static final DD S = id_class("rail_curved", "_corner", UX.id_super);
   public static final DD s = id_class("template_rail_raised_ne", "_raised_ne", UX.id_super);
   public static final DD E = id_class("template_rail_raised_sw", "_raised_sw", UX.id_super);
   public static final DD G = id_class("carpet", UX.id_this);
   public static final DD b = id_class("coral_fan", UX.id_public);
   public static final DD M = id_class("coral_wall_fan", UX.id_public);
   public static final DD O = id_class("template_glazed_terracotta", UX.id_else);
   public static final DD h = id_class("template_chorus_flower", UX.id_break);
   public static final DD X = id_class("template_daylight_detector", UX.id_case, UX.id_implements);
   public static final DD J = id_class("template_glass_pane_noside", "_noside", UX.id_synchronized);
   public static final DD x = id_class("template_glass_pane_noside_alt", "_noside_alt", UX.id_synchronized);
   public static final DD d = id_class("template_glass_pane_post", "_post", UX.id_synchronized, UX.id_return);
   public static final DD k = id_class("template_glass_pane_side", "_side", UX.id_synchronized, UX.id_return);
   public static final DD W = id_class("template_glass_pane_side_alt", "_side_alt", UX.id_synchronized, UX.id_return);
   public static final DD z = id_class("template_command_block", UX.id_catch, UX.id_private, UX.id_implements);
   public static final DD Q = id_class("template_anvil", UX.id_case);
   public static final DD[] N = IntStream.range(0, 8).mapToObj(var0 -> id_class("stem_growth" + var0, "_stage" + var0, UX.id_goto)).toArray(DD[]::new);
   public static final DD c = id_class("stem_fruit", UX.id_goto, UX.id_while);
   public static final DD u = id_class("crop", UX.id_try);
   public static final DD m = id_class("template_farmland", UX.id_instanceof, UX.id_case);
   public static final DD Z = id_class("template_fire_floor", UX.id_throw);
   public static final DD v = id_class("template_fire_side", UX.id_throw);
   public static final DD F = id_class("template_fire_side_alt", UX.id_throw);
   public static final DD L = id_class("template_fire_up", UX.id_throw);
   public static final DD A = id_class("template_fire_up_alt", UX.id_throw);
   public static final DD n = id_class("template_campfire", UX.id_throw, UX.id_void);
   public static final DD C = id_class("template_lantern", UX.id_interface);
   public static final DD l = id_class("template_hanging_lantern", "_hanging", UX.id_interface);
   public static final DD H = id_class("template_torch", UX.id_long);
   public static final DD y = id_class("template_torch_wall", UX.id_long);
   public static final DD p = id_class("template_piston", UX.id_char, UX.id_throws, UX.id_implements);
   public static final DD q = id_class("template_piston_head", UX.id_char, UX.id_implements, UX.id_abstract);
   public static final DD T = id_class("template_piston_head_short", UX.id_char, UX.id_implements, UX.id_abstract);
   public static final DD t = id_class("template_seagrass", UX.id_break);
   public static final DD w = id_class("template_turtle_egg", UX.id_class);
   public static final DD I = id_class("template_two_turtle_eggs", UX.id_class);
   public static final DD f = id_class("template_three_turtle_eggs", UX.id_class);
   public static final DD j = id_class("template_four_turtle_eggs", UX.id_class);
   public static final DD V = id_class("template_single_face", UX.id_break);
   public static final DD g = id_break("generated", UX.id_float);
   public static final DD R = id_break("handheld", UX.id_float);
   public static final DD Y = id_break("handheld_rod", UX.id_float);
   public static final DD o = id_break("template_shulker_box", UX.id_byte);
   public static final DD K = id_break("template_bed", UX.id_byte);
   public static final DD D = id_break("template_banner");
   public static final DD U = id_break("template_skull");

   private static DD id_class(String var0, String var1, UX... var2) {
      return new DD(Optional.of(new rqO_2("minecraft", "block/" + var0)), Optional.of(var1), var2);
   }

   private static DD id_class(UX... var0) {
      return new DD(Optional.empty(), Optional.empty(), var0);
   }

   private static DD id_class(String var0, UX... var1) {
      return new DD(Optional.of(new rqO_2("minecraft", "block/" + var0)), Optional.empty(), var1);
   }

   private static DD id_break(String var0, UX... var1) {
      return new DD(Optional.of(new rqO_2("minecraft", "item/" + var0)), Optional.empty(), var1);
   }
}
