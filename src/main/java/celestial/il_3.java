/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.an_3;
import celestial.au_3;
import celestial.iB_2;
import celestial.iH_2;
import celestial.in_3;
import celestial.is_3;
import celestial.rEg_1;
import celestial.rLC;
import celestial.rVL;
import celestial.rbM_2;
import celestial.rfD_2;
import celestial.rfH_2;
import celestial.rfK_2;
import celestial.rhd_3;
import celestial.rqO_2;
import celestial.rqV_2;
import celestial.rsE_2;
import celestial.rye_3;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class il_3<U> {
    public static final il_3<Void> id_class = il_3.id_class("dummy");
    public static final il_3<rfK_2> id_break = il_3.id_class("home", rfK_2.id_class);
    public static final il_3<rfK_2> id_byte = il_3.id_class("job_site", rfK_2.id_class);
    public static final il_3<rfK_2> id_protected = il_3.id_class("potential_job_site", rfK_2.id_class);
    public static final il_3<rfK_2> id_throws = il_3.id_class("meeting_point", rfK_2.id_class);
    public static final il_3<List<rfK_2>> id_case = il_3.id_class("secondary_job_site");
    public static final il_3<List<iB_2>> id_catch = il_3.id_class("mobs");
    public static final il_3<List<iB_2>> id_private = il_3.id_class("visible_mobs");
    public static final il_3<List<iB_2>> id_implements = il_3.id_class("visible_villager_babies");
    public static final il_3<List<rhd_3>> id_finally = il_3.id_class("nearest_players");
    public static final il_3<rhd_3> id_extends = il_3.id_class("nearest_visible_player");
    public static final il_3<rhd_3> id_native = il_3.id_class("nearest_visible_targetable_player");
    public static final il_3<iH_2> id_volatile = il_3.id_class("walk_target");
    public static final il_3<rfD_2> id_final = il_3.id_class("look_target");
    public static final il_3<iB_2> id_package = il_3.id_class("attack_target");
    public static final il_3<Boolean> id_int = il_3.id_class("attack_cooling_down");
    public static final il_3<iB_2> id_new = il_3.id_class("interaction_target");
    public static final il_3<au_3> id_continue = il_3.id_class("breed_target");
    public static final il_3<an_3> id_super = il_3.id_class("ride_target");
    public static final il_3<rLC> id_this = il_3.id_class("path");
    public static final il_3<List<rfK_2>> id_else = il_3.id_class("interactable_doors");
    public static final il_3<Set<rfK_2>> id_synchronized = il_3.id_class("doors_to_close");
    public static final il_3<rfH_2> id_return = il_3.id_class("nearest_bed");
    public static final il_3<rye_3> id_public = il_3.id_class("hurt_by");
    public static final il_3<iB_2> id_goto = il_3.id_class("hurt_by_entity");
    public static final il_3<iB_2> id_while = il_3.id_class("avoid_target");
    public static final il_3<iB_2> id_try = il_3.id_class("nearest_hostile");
    public static final il_3<rfK_2> id_instanceof = il_3.id_class("hiding_place");
    public static final il_3<Long> id_throw = il_3.id_class("heard_bell_time");
    public static final il_3<Long> id_interface = il_3.id_class("cant_reach_walk_target_since");
    public static final il_3<Boolean> id_char = il_3.id_class("golem_detected_recently", Codec.BOOL);
    public static final il_3<Long> id_abstract = il_3.id_class("last_slept", Codec.LONG);
    public static final il_3<Long> id_long = il_3.id_class("last_woken", Codec.LONG);
    public static final il_3<Long> id_float = il_3.id_class("last_worked_at_poi", Codec.LONG);
    public static final il_3<au_3> id_void = il_3.id_class("nearest_visible_adult");
    public static final il_3<rsE_2> id_static = il_3.id_class("nearest_visible_wanted_item");
    public static final il_3<is_3> id_import = il_3.id_class("nearest_visible_nemesis");
    public static final il_3<UUID> id_short = il_3.id_class("angry_at", rqV_2.id_class);
    public static final il_3<Boolean> id_default = il_3.id_class("universal_anger", Codec.BOOL);
    public static final il_3<Boolean> id_const = il_3.id_class("admiring_item", Codec.BOOL);
    public static final il_3<Integer> id_strictfp = il_3.id_class("time_trying_to_reach_admire_item");
    public static final il_3<Boolean> id_boolean = il_3.id_class("disable_walk_to_admire_item");
    public static final il_3<Boolean> id_transient = il_3.id_class("admiring_disabled", Codec.BOOL);
    public static final il_3<Boolean> id_for = il_3.id_class("hunted_recently", Codec.BOOL);
    public static final il_3<rfH_2> id_double = il_3.id_class("celebrate_location");
    public static final il_3<Boolean> id_switch = il_3.id_class("dancing");
    public static final il_3<rEg_1> r = il_3.id_class("nearest_visible_huntable_hoglin");
    public static final il_3<rEg_1> P = il_3.id_class("nearest_visible_baby_hoglin");
    public static final il_3<rhd_3> B = il_3.id_class("nearest_targetable_player_not_wearing_gold");
    public static final il_3<List<rbM_2>> S = il_3.id_class("nearby_adult_piglins");
    public static final il_3<List<rbM_2>> s = il_3.id_class("nearest_visible_adult_piglins");
    public static final il_3<List<rEg_1>> E = il_3.id_class("nearest_visible_adult_hoglins");
    public static final il_3<rbM_2> G = il_3.id_class("nearest_visible_adult_piglin");
    public static final il_3<iB_2> b = il_3.id_class("nearest_visible_zombified");
    public static final il_3<Integer> M = il_3.id_class("visible_adult_piglin_count");
    public static final il_3<Integer> O = il_3.id_class("visible_adult_hoglin_count");
    public static final il_3<rhd_3> h = il_3.id_class("nearest_player_holding_wanted_item");
    public static final il_3<Boolean> X = il_3.id_class("ate_recently");
    public static final il_3<rfH_2> J = il_3.id_class("nearest_repellent");
    public static final il_3<Boolean> x = il_3.id_class("pacified");
    private final Optional<Codec<in_3<U>>> d;

    private il_3(Optional<Codec<U>> optional) {
        this.d = optional.map(in_3::id_class);
    }

    public String toString() {
        return rVL.d.id_break(this).toString();
    }

    private static <U> il_3<U> id_class(String string, Codec<U> codec) {
        return rVL.id_class(rVL.d, new rqO_2(string), new il_3<U>(Optional.of(codec)));
    }

    private static <U> il_3<U> id_class(String string) {
        return rVL.id_class(rVL.d, new rqO_2(string), new il_3<U>(Optional.empty()));
    }

    public Optional<Codec<in_3<U>>> id_class() {
        return this.d;
    }
}

