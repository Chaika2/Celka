/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.DD;
import celestial.UX;
import celestial.rqO_2;
import java.util.Optional;
import java.util.stream.IntStream;

public class Uh_1 {
    public static final DD id_class = Uh_1.id_class("cube", UX.id_byte, UX.id_finally, UX.id_extends, UX.id_native, UX.id_volatile, UX.id_final, UX.id_package);
    public static final DD id_break = Uh_1.id_class("cube_directional", UX.id_byte, UX.id_finally, UX.id_extends, UX.id_native, UX.id_volatile, UX.id_final, UX.id_package);
    public static final DD id_byte = Uh_1.id_class("cube_all", UX.id_class);
    public static final DD id_protected = Uh_1.id_class("cube_mirrored_all", "_mirrored", UX.id_class);
    public static final DD id_throws = Uh_1.id_class("cube_column", UX.id_protected, UX.id_implements);
    public static final DD id_case = Uh_1.id_class("cube_column_horizontal", "_horizontal", UX.id_protected, UX.id_implements);
    public static final DD id_catch = Uh_1.id_class("cube_top", UX.id_case, UX.id_implements);
    public static final DD id_private = Uh_1.id_class("cube_bottom_top", UX.id_case, UX.id_throws, UX.id_implements);
    public static final DD id_implements = Uh_1.id_class("orientable", UX.id_case, UX.id_catch, UX.id_implements);
    public static final DD id_finally = Uh_1.id_class("orientable_with_bottom", UX.id_case, UX.id_throws, UX.id_implements, UX.id_catch);
    public static final DD id_extends = Uh_1.id_class("orientable_vertical", "_vertical", UX.id_catch, UX.id_implements);
    public static final DD id_native = Uh_1.id_class("button", UX.id_break);
    public static final DD id_volatile = Uh_1.id_class("button_pressed", "_pressed", UX.id_break);
    public static final DD id_final = Uh_1.id_class("button_inventory", "_inventory", UX.id_break);
    public static final DD id_package = Uh_1.id_class("door_bottom", "_bottom", UX.id_case, UX.id_throws);
    public static final DD id_int = Uh_1.id_class("door_bottom_rh", "_bottom_hinge", UX.id_case, UX.id_throws);
    public static final DD id_new = Uh_1.id_class("door_top", "_top", UX.id_case, UX.id_throws);
    public static final DD id_continue = Uh_1.id_class("door_top_rh", "_top_hinge", UX.id_case, UX.id_throws);
    public static final DD id_super = Uh_1.id_class("fence_post", "_post", UX.id_break);
    public static final DD id_this = Uh_1.id_class("fence_side", "_side", UX.id_break);
    public static final DD id_else = Uh_1.id_class("fence_inventory", "_inventory", UX.id_break);
    public static final DD id_synchronized = Uh_1.id_class("template_wall_post", "_post", UX.id_continue);
    public static final DD id_return = Uh_1.id_class("template_wall_side", "_side", UX.id_continue);
    public static final DD id_public = Uh_1.id_class("template_wall_side_tall", "_side_tall", UX.id_continue);
    public static final DD id_goto = Uh_1.id_class("wall_inventory", "_inventory", UX.id_continue);
    public static final DD id_while = Uh_1.id_class("template_fence_gate", UX.id_break);
    public static final DD id_try = Uh_1.id_class("template_fence_gate_open", "_open", UX.id_break);
    public static final DD id_instanceof = Uh_1.id_class("template_fence_gate_wall", "_wall", UX.id_break);
    public static final DD id_throw = Uh_1.id_class("template_fence_gate_wall_open", "_wall_open", UX.id_break);
    public static final DD id_interface = Uh_1.id_class("pressure_plate_up", UX.id_break);
    public static final DD id_char = Uh_1.id_class("pressure_plate_down", "_down", UX.id_break);
    public static final DD id_abstract = Uh_1.id_class(UX.id_byte);
    public static final DD id_long = Uh_1.id_class("slab", UX.id_throws, UX.id_case, UX.id_implements);
    public static final DD id_float = Uh_1.id_class("slab_top", "_top", UX.id_throws, UX.id_case, UX.id_implements);
    public static final DD id_void = Uh_1.id_class("leaves", UX.id_class);
    public static final DD id_static = Uh_1.id_class("stairs", UX.id_throws, UX.id_case, UX.id_implements);
    public static final DD id_import = Uh_1.id_class("inner_stairs", "_inner", UX.id_throws, UX.id_case, UX.id_implements);
    public static final DD id_short = Uh_1.id_class("outer_stairs", "_outer", UX.id_throws, UX.id_case, UX.id_implements);
    public static final DD id_default = Uh_1.id_class("template_trapdoor_top", "_top", UX.id_break);
    public static final DD id_const = Uh_1.id_class("template_trapdoor_bottom", "_bottom", UX.id_break);
    public static final DD id_strictfp = Uh_1.id_class("template_trapdoor_open", "_open", UX.id_break);
    public static final DD id_boolean = Uh_1.id_class("template_orientable_trapdoor_top", "_top", UX.id_break);
    public static final DD id_transient = Uh_1.id_class("template_orientable_trapdoor_bottom", "_bottom", UX.id_break);
    public static final DD id_for = Uh_1.id_class("template_orientable_trapdoor_open", "_open", UX.id_break);
    public static final DD id_double = Uh_1.id_class("cross", UX.id_int);
    public static final DD id_switch = Uh_1.id_class("tinted_cross", UX.id_int);
    public static final DD r = Uh_1.id_class("flower_pot_cross", UX.id_new);
    public static final DD P = Uh_1.id_class("tinted_flower_pot_cross", UX.id_new);
    public static final DD B = Uh_1.id_class("rail_flat", UX.id_super);
    public static final DD S = Uh_1.id_class("rail_curved", "_corner", UX.id_super);
    public static final DD s = Uh_1.id_class("template_rail_raised_ne", "_raised_ne", UX.id_super);
    public static final DD E = Uh_1.id_class("template_rail_raised_sw", "_raised_sw", UX.id_super);
    public static final DD G = Uh_1.id_class("carpet", UX.id_this);
    public static final DD b = Uh_1.id_class("coral_fan", UX.id_public);
    public static final DD M = Uh_1.id_class("coral_wall_fan", UX.id_public);
    public static final DD O = Uh_1.id_class("template_glazed_terracotta", UX.id_else);
    public static final DD h = Uh_1.id_class("template_chorus_flower", UX.id_break);
    public static final DD X = Uh_1.id_class("template_daylight_detector", UX.id_case, UX.id_implements);
    public static final DD J = Uh_1.id_class("template_glass_pane_noside", "_noside", UX.id_synchronized);
    public static final DD x = Uh_1.id_class("template_glass_pane_noside_alt", "_noside_alt", UX.id_synchronized);
    public static final DD d = Uh_1.id_class("template_glass_pane_post", "_post", UX.id_synchronized, UX.id_return);
    public static final DD k = Uh_1.id_class("template_glass_pane_side", "_side", UX.id_synchronized, UX.id_return);
    public static final DD W = Uh_1.id_class("template_glass_pane_side_alt", "_side_alt", UX.id_synchronized, UX.id_return);
    public static final DD z = Uh_1.id_class("template_command_block", UX.id_catch, UX.id_private, UX.id_implements);
    public static final DD Q = Uh_1.id_class("template_anvil", UX.id_case);
    public static final DD[] N = (DD[])IntStream.range(0, 8).mapToObj(n -> Uh_1.id_class("stem_growth" + n, "_stage" + n, UX.id_goto)).toArray(DD[]::new);
    public static final DD c = Uh_1.id_class("stem_fruit", UX.id_goto, UX.id_while);
    public static final DD u = Uh_1.id_class("crop", UX.id_try);
    public static final DD m = Uh_1.id_class("template_farmland", UX.id_instanceof, UX.id_case);
    public static final DD Z = Uh_1.id_class("template_fire_floor", UX.id_throw);
    public static final DD v = Uh_1.id_class("template_fire_side", UX.id_throw);
    public static final DD F = Uh_1.id_class("template_fire_side_alt", UX.id_throw);
    public static final DD L = Uh_1.id_class("template_fire_up", UX.id_throw);
    public static final DD A = Uh_1.id_class("template_fire_up_alt", UX.id_throw);
    public static final DD n = Uh_1.id_class("template_campfire", UX.id_throw, UX.id_void);
    public static final DD C = Uh_1.id_class("template_lantern", UX.id_interface);
    public static final DD l = Uh_1.id_class("template_hanging_lantern", "_hanging", UX.id_interface);
    public static final DD H = Uh_1.id_class("template_torch", UX.id_long);
    public static final DD y = Uh_1.id_class("template_torch_wall", UX.id_long);
    public static final DD p = Uh_1.id_class("template_piston", UX.id_char, UX.id_throws, UX.id_implements);
    public static final DD q = Uh_1.id_class("template_piston_head", UX.id_char, UX.id_implements, UX.id_abstract);
    public static final DD T = Uh_1.id_class("template_piston_head_short", UX.id_char, UX.id_implements, UX.id_abstract);
    public static final DD t = Uh_1.id_class("template_seagrass", UX.id_break);
    public static final DD w = Uh_1.id_class("template_turtle_egg", UX.id_class);
    public static final DD I = Uh_1.id_class("template_two_turtle_eggs", UX.id_class);
    public static final DD f = Uh_1.id_class("template_three_turtle_eggs", UX.id_class);
    public static final DD j = Uh_1.id_class("template_four_turtle_eggs", UX.id_class);
    public static final DD V = Uh_1.id_class("template_single_face", UX.id_break);
    public static final DD g = Uh_1.id_break("generated", UX.id_float);
    public static final DD R = Uh_1.id_break("handheld", UX.id_float);
    public static final DD Y = Uh_1.id_break("handheld_rod", UX.id_float);
    public static final DD o = Uh_1.id_break("template_shulker_box", UX.id_byte);
    public static final DD K = Uh_1.id_break("template_bed", UX.id_byte);
    public static final DD D = Uh_1.id_break("template_banner", new UX[0]);
    public static final DD U = Uh_1.id_break("template_skull", new UX[0]);

    private static DD id_class(String string, String string2, UX ... uXArray) {
        return new DD(Optional.of(new rqO_2("minecraft", "block/" + string)), Optional.of(string2), uXArray);
    }

    private static DD id_class(UX ... uXArray) {
        return new DD(Optional.empty(), Optional.empty(), uXArray);
    }

    private static DD id_class(String string, UX ... uXArray) {
        return new DD(Optional.of(new rqO_2("minecraft", "block/" + string)), Optional.empty(), uXArray);
    }

    private static DD id_break(String string, UX ... uXArray) {
        return new DD(Optional.of(new rqO_2("minecraft", "item/" + string)), Optional.empty(), uXArray);
    }
}

