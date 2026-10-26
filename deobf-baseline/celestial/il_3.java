package celestial;

import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class il_3<U> {
   public static final il_3<Void> id_class = id_class("dummy");
   public static final il_3<rfK_2> id_break = id_class("home", rfK_2.id_class);
   public static final il_3<rfK_2> id_byte = id_class("job_site", rfK_2.id_class);
   public static final il_3<rfK_2> id_protected = id_class("potential_job_site", rfK_2.id_class);
   public static final il_3<rfK_2> id_throws = id_class("meeting_point", rfK_2.id_class);
   public static final il_3<List<rfK_2>> id_case = id_class("secondary_job_site");
   public static final il_3<List<iB_2>> id_catch = id_class("mobs");
   public static final il_3<List<iB_2>> id_private = id_class("visible_mobs");
   public static final il_3<List<iB_2>> id_implements = id_class("visible_villager_babies");
   public static final il_3<List<rhd_3>> id_finally = id_class("nearest_players");
   public static final il_3<rhd_3> id_extends = id_class("nearest_visible_player");
   public static final il_3<rhd_3> id_native = id_class("nearest_visible_targetable_player");
   public static final il_3<iH_2> id_volatile = id_class("walk_target");
   public static final il_3<rfD_2> id_final = id_class("look_target");
   public static final il_3<iB_2> id_package = id_class("attack_target");
   public static final il_3<Boolean> id_int = id_class("attack_cooling_down");
   public static final il_3<iB_2> id_new = id_class("interaction_target");
   public static final il_3<au_3> id_continue = id_class("breed_target");
   public static final il_3<an_3> id_super = id_class("ride_target");
   public static final il_3<rLC> id_this = id_class("path");
   public static final il_3<List<rfK_2>> id_else = id_class("interactable_doors");
   public static final il_3<Set<rfK_2>> id_synchronized = id_class("doors_to_close");
   public static final il_3<rfH_2> id_return = id_class("nearest_bed");
   public static final il_3<rye_3> id_public = id_class("hurt_by");
   public static final il_3<iB_2> id_goto = id_class("hurt_by_entity");
   public static final il_3<iB_2> id_while = id_class("avoid_target");
   public static final il_3<iB_2> id_try = id_class("nearest_hostile");
   public static final il_3<rfK_2> id_instanceof = id_class("hiding_place");
   public static final il_3<Long> id_throw = id_class("heard_bell_time");
   public static final il_3<Long> id_interface = id_class("cant_reach_walk_target_since");
   public static final il_3<Boolean> id_char = id_class("golem_detected_recently", Codec.BOOL);
   public static final il_3<Long> id_abstract = id_class("last_slept", Codec.LONG);
   public static final il_3<Long> id_long = id_class("last_woken", Codec.LONG);
   public static final il_3<Long> id_float = id_class("last_worked_at_poi", Codec.LONG);
   public static final il_3<au_3> id_void = id_class("nearest_visible_adult");
   public static final il_3<rsE_2> id_static = id_class("nearest_visible_wanted_item");
   public static final il_3<is_3> id_import = id_class("nearest_visible_nemesis");
   public static final il_3<UUID> id_short = id_class("angry_at", rqV_2.id_class);
   public static final il_3<Boolean> id_default = id_class("universal_anger", Codec.BOOL);
   public static final il_3<Boolean> id_const = id_class("admiring_item", Codec.BOOL);
   public static final il_3<Integer> id_strictfp = id_class("time_trying_to_reach_admire_item");
   public static final il_3<Boolean> id_boolean = id_class("disable_walk_to_admire_item");
   public static final il_3<Boolean> id_transient = id_class("admiring_disabled", Codec.BOOL);
   public static final il_3<Boolean> id_for = id_class("hunted_recently", Codec.BOOL);
   public static final il_3<rfH_2> id_double = id_class("celebrate_location");
   public static final il_3<Boolean> id_switch = id_class("dancing");
   public static final il_3<rEg_1> r = id_class("nearest_visible_huntable_hoglin");
   public static final il_3<rEg_1> P = id_class("nearest_visible_baby_hoglin");
   public static final il_3<rhd_3> B = id_class("nearest_targetable_player_not_wearing_gold");
   public static final il_3<List<rbM_2>> S = id_class("nearby_adult_piglins");
   public static final il_3<List<rbM_2>> s = id_class("nearest_visible_adult_piglins");
   public static final il_3<List<rEg_1>> E = id_class("nearest_visible_adult_hoglins");
   public static final il_3<rbM_2> G = id_class("nearest_visible_adult_piglin");
   public static final il_3<iB_2> b = id_class("nearest_visible_zombified");
   public static final il_3<Integer> M = id_class("visible_adult_piglin_count");
   public static final il_3<Integer> O = id_class("visible_adult_hoglin_count");
   public static final il_3<rhd_3> h = id_class("nearest_player_holding_wanted_item");
   public static final il_3<Boolean> X = id_class("ate_recently");
   public static final il_3<rfH_2> J = id_class("nearest_repellent");
   public static final il_3<Boolean> x = id_class("pacified");
   private final Optional<Codec<in_3<U>>> d;

   private il_3(Optional<Codec<U>> var1) {
      this.d = var1.map(in_3::id_class);
   }

   @Override
   public String toString() {
      return rVL.d.id_break(this).toString();
   }

   private static <U> il_3<U> id_class(String var0, Codec<U> var1) {
      return rVL.id_class(rVL.d, new rqO_2(var0), new il_3<>(Optional.of(var1)));
   }

   private static <U> il_3<U> id_class(String var0) {
      return rVL.id_class(rVL.d, new rqO_2(var0), new il_3<>(Optional.empty()));
   }

   public Optional<Codec<in_3<U>>> id_class() {
      return this.d;
   }
}
