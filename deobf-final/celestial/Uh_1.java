package celestial;

import java.util.Optional;
import java.util.stream.IntStream;

public class Uh_1 {
   public static final DD class_ = class_("cube", UX.byte_, UX.finally_, UX.extends_, UX.native_, UX.volatile_, UX.final_, UX.package_);
   public static final DD break_ = class_("cube_directional", UX.byte_, UX.finally_, UX.extends_, UX.native_, UX.volatile_, UX.final_, UX.package_);
   public static final DD byte_ = class_("cube_all", UX.class_);
   public static final DD protected_ = class_("cube_mirrored_all", "_mirrored", UX.class_);
   public static final DD throws_ = class_("cube_column", UX.protected_, UX.implements_);
   public static final DD case_ = class_("cube_column_horizontal", "_horizontal", UX.protected_, UX.implements_);
   public static final DD catch_ = class_("cube_top", UX.case_, UX.implements_);
   public static final DD private_ = class_("cube_bottom_top", UX.case_, UX.throws_, UX.implements_);
   public static final DD implements_ = class_("orientable", UX.case_, UX.catch_, UX.implements_);
   public static final DD finally_ = class_("orientable_with_bottom", UX.case_, UX.throws_, UX.implements_, UX.catch_);
   public static final DD extends_ = class_("orientable_vertical", "_vertical", UX.catch_, UX.implements_);
   public static final DD native_ = class_("button", UX.break_);
   public static final DD volatile_ = class_("button_pressed", "_pressed", UX.break_);
   public static final DD final_ = class_("button_inventory", "_inventory", UX.break_);
   public static final DD package_ = class_("door_bottom", "_bottom", UX.case_, UX.throws_);
   public static final DD int_ = class_("door_bottom_rh", "_bottom_hinge", UX.case_, UX.throws_);
   public static final DD new_ = class_("door_top", "_top", UX.case_, UX.throws_);
   public static final DD continue_ = class_("door_top_rh", "_top_hinge", UX.case_, UX.throws_);
   public static final DD super_ = class_("fence_post", "_post", UX.break_);
   public static final DD this_ = class_("fence_side", "_side", UX.break_);
   public static final DD else_ = class_("fence_inventory", "_inventory", UX.break_);
   public static final DD synchronized_ = class_("template_wall_post", "_post", UX.continue_);
   public static final DD return_ = class_("template_wall_side", "_side", UX.continue_);
   public static final DD public_ = class_("template_wall_side_tall", "_side_tall", UX.continue_);
   public static final DD goto_ = class_("wall_inventory", "_inventory", UX.continue_);
   public static final DD while_ = class_("template_fence_gate", UX.break_);
   public static final DD try_ = class_("template_fence_gate_open", "_open", UX.break_);
   public static final DD instanceof_ = class_("template_fence_gate_wall", "_wall", UX.break_);
   public static final DD throw_ = class_("template_fence_gate_wall_open", "_wall_open", UX.break_);
   public static final DD interface_ = class_("pressure_plate_up", UX.break_);
   public static final DD char_ = class_("pressure_plate_down", "_down", UX.break_);
   public static final DD abstract_ = class_(UX.byte_);
   public static final DD long_ = class_("slab", UX.throws_, UX.case_, UX.implements_);
   public static final DD float_ = class_("slab_top", "_top", UX.throws_, UX.case_, UX.implements_);
   public static final DD void_ = class_("leaves", UX.class_);
   public static final DD static_ = class_("stairs", UX.throws_, UX.case_, UX.implements_);
   public static final DD import_ = class_("inner_stairs", "_inner", UX.throws_, UX.case_, UX.implements_);
   public static final DD short_ = class_("outer_stairs", "_outer", UX.throws_, UX.case_, UX.implements_);
   public static final DD default_ = class_("template_trapdoor_top", "_top", UX.break_);
   public static final DD const_ = class_("template_trapdoor_bottom", "_bottom", UX.break_);
   public static final DD strictfp_ = class_("template_trapdoor_open", "_open", UX.break_);
   public static final DD boolean_ = class_("template_orientable_trapdoor_top", "_top", UX.break_);
   public static final DD transient_ = class_("template_orientable_trapdoor_bottom", "_bottom", UX.break_);
   public static final DD for_ = class_("template_orientable_trapdoor_open", "_open", UX.break_);
   public static final DD double_ = class_("cross", UX.int_);
   public static final DD switch_ = class_("tinted_cross", UX.int_);
   public static final DD r = class_("flower_pot_cross", UX.new_);
   public static final DD P = class_("tinted_flower_pot_cross", UX.new_);
   public static final DD B = class_("rail_flat", UX.super_);
   public static final DD S = class_("rail_curved", "_corner", UX.super_);
   public static final DD s = class_("template_rail_raised_ne", "_raised_ne", UX.super_);
   public static final DD E = class_("template_rail_raised_sw", "_raised_sw", UX.super_);
   public static final DD G = class_("carpet", UX.this_);
   public static final DD b = class_("coral_fan", UX.public_);
   public static final DD M = class_("coral_wall_fan", UX.public_);
   public static final DD O = class_("template_glazed_terracotta", UX.else_);
   public static final DD h = class_("template_chorus_flower", UX.break_);
   public static final DD X = class_("template_daylight_detector", UX.case_, UX.implements_);
   public static final DD J = class_("template_glass_pane_noside", "_noside", UX.synchronized_);
   public static final DD x = class_("template_glass_pane_noside_alt", "_noside_alt", UX.synchronized_);
   public static final DD d = class_("template_glass_pane_post", "_post", UX.synchronized_, UX.return_);
   public static final DD k = class_("template_glass_pane_side", "_side", UX.synchronized_, UX.return_);
   public static final DD W = class_("template_glass_pane_side_alt", "_side_alt", UX.synchronized_, UX.return_);
   public static final DD z = class_("template_command_block", UX.catch_, UX.private_, UX.implements_);
   public static final DD Q = class_("template_anvil", UX.case_);
   public static final DD[] N = IntStream.range(0, 8).mapToObj(var0 -> class_("stem_growth" + var0, "_stage" + var0, UX.goto_)).toArray(DD[]::new);
   public static final DD c = class_("stem_fruit", UX.goto_, UX.while_);
   public static final DD u = class_("crop", UX.try_);
   public static final DD m = class_("template_farmland", UX.instanceof_, UX.case_);
   public static final DD Z = class_("template_fire_floor", UX.throw_);
   public static final DD v = class_("template_fire_side", UX.throw_);
   public static final DD F = class_("template_fire_side_alt", UX.throw_);
   public static final DD L = class_("template_fire_up", UX.throw_);
   public static final DD A = class_("template_fire_up_alt", UX.throw_);
   public static final DD n = class_("template_campfire", UX.throw_, UX.void_);
   public static final DD C = class_("template_lantern", UX.interface_);
   public static final DD l = class_("template_hanging_lantern", "_hanging", UX.interface_);
   public static final DD H = class_("template_torch", UX.long_);
   public static final DD y = class_("template_torch_wall", UX.long_);
   public static final DD p = class_("template_piston", UX.char_, UX.throws_, UX.implements_);
   public static final DD q = class_("template_piston_head", UX.char_, UX.implements_, UX.abstract_);
   public static final DD T = class_("template_piston_head_short", UX.char_, UX.implements_, UX.abstract_);
   public static final DD t = class_("template_seagrass", UX.break_);
   public static final DD w = class_("template_turtle_egg", UX.class_);
   public static final DD I = class_("template_two_turtle_eggs", UX.class_);
   public static final DD f = class_("template_three_turtle_eggs", UX.class_);
   public static final DD j = class_("template_four_turtle_eggs", UX.class_);
   public static final DD V = class_("template_single_face", UX.break_);
   public static final DD g = break_("generated", UX.float_);
   public static final DD R = break_("handheld", UX.float_);
   public static final DD Y = break_("handheld_rod", UX.float_);
   public static final DD o = break_("template_shulker_box", UX.byte_);
   public static final DD K = break_("template_bed", UX.byte_);
   public static final DD D = break_("template_banner");
   public static final DD U = break_("template_skull");

   private static DD class_(String var0, String var1, UX... var2) {
      return new DD(Optional.of(new rqO_2("minecraft", "block/" + var0)), Optional.of(var1), var2);
   }

   private static DD class_(UX... var0) {
      return new DD(Optional.empty(), Optional.empty(), var0);
   }

   private static DD class_(String var0, UX... var1) {
      return new DD(Optional.of(new rqO_2("minecraft", "block/" + var0)), Optional.empty(), var1);
   }

   private static DD break_(String var0, UX... var1) {
      return new DD(Optional.of(new rqO_2("minecraft", "item/" + var0)), Optional.empty(), var1);
   }
}
