package celestial;

import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class il_3<U> {
   public static final il_3<Void> class_ = class_("dummy");
   public static final il_3<rfK_2> break_ = class_("home", rfK_2.class_);
   public static final il_3<rfK_2> byte_ = class_("job_site", rfK_2.class_);
   public static final il_3<rfK_2> protected_ = class_("potential_job_site", rfK_2.class_);
   public static final il_3<rfK_2> throws_ = class_("meeting_point", rfK_2.class_);
   public static final il_3<List<rfK_2>> case_ = class_("secondary_job_site");
   public static final il_3<List<iB_2>> catch_ = class_("mobs");
   public static final il_3<List<iB_2>> private_ = class_("visible_mobs");
   public static final il_3<List<iB_2>> implements_ = class_("visible_villager_babies");
   public static final il_3<List<rhd_3>> finally_ = class_("nearest_players");
   public static final il_3<rhd_3> extends_ = class_("nearest_visible_player");
   public static final il_3<rhd_3> native_ = class_("nearest_visible_targetable_player");
   public static final il_3<iH_2> volatile_ = class_("walk_target");
   public static final il_3<rfD_2> final_ = class_("look_target");
   public static final il_3<iB_2> package_ = class_("attack_target");
   public static final il_3<Boolean> int_ = class_("attack_cooling_down");
   public static final il_3<iB_2> new_ = class_("interaction_target");
   public static final il_3<au_3> continue_ = class_("breed_target");
   public static final il_3<an_3> super_ = class_("ride_target");
   public static final il_3<rLC> this_ = class_("path");
   public static final il_3<List<rfK_2>> else_ = class_("interactable_doors");
   public static final il_3<Set<rfK_2>> synchronized_ = class_("doors_to_close");
   public static final il_3<rfH_2> return_ = class_("nearest_bed");
   public static final il_3<rye_3> public_ = class_("hurt_by");
   public static final il_3<iB_2> goto_ = class_("hurt_by_entity");
   public static final il_3<iB_2> while_ = class_("avoid_target");
   public static final il_3<iB_2> try_ = class_("nearest_hostile");
   public static final il_3<rfK_2> instanceof_ = class_("hiding_place");
   public static final il_3<Long> throw_ = class_("heard_bell_time");
   public static final il_3<Long> interface_ = class_("cant_reach_walk_target_since");
   public static final il_3<Boolean> char_ = class_("golem_detected_recently", Codec.BOOL);
   public static final il_3<Long> abstract_ = class_("last_slept", Codec.LONG);
   public static final il_3<Long> long_ = class_("last_woken", Codec.LONG);
   public static final il_3<Long> float_ = class_("last_worked_at_poi", Codec.LONG);
   public static final il_3<au_3> void_ = class_("nearest_visible_adult");
   public static final il_3<rsE_2> static_ = class_("nearest_visible_wanted_item");
   public static final il_3<is_3> import_ = class_("nearest_visible_nemesis");
   public static final il_3<UUID> short_ = class_("angry_at", rqV_2.class_);
   public static final il_3<Boolean> default_ = class_("universal_anger", Codec.BOOL);
   public static final il_3<Boolean> const_ = class_("admiring_item", Codec.BOOL);
   public static final il_3<Integer> strictfp_ = class_("time_trying_to_reach_admire_item");
   public static final il_3<Boolean> boolean_ = class_("disable_walk_to_admire_item");
   public static final il_3<Boolean> transient_ = class_("admiring_disabled", Codec.BOOL);
   public static final il_3<Boolean> for_ = class_("hunted_recently", Codec.BOOL);
   public static final il_3<rfH_2> double_ = class_("celebrate_location");
   public static final il_3<Boolean> switch_ = class_("dancing");
   public static final il_3<rEg_1> r = class_("nearest_visible_huntable_hoglin");
   public static final il_3<rEg_1> P = class_("nearest_visible_baby_hoglin");
   public static final il_3<rhd_3> B = class_("nearest_targetable_player_not_wearing_gold");
   public static final il_3<List<rbM_2>> S = class_("nearby_adult_piglins");
   public static final il_3<List<rbM_2>> s = class_("nearest_visible_adult_piglins");
   public static final il_3<List<rEg_1>> E = class_("nearest_visible_adult_hoglins");
   public static final il_3<rbM_2> G = class_("nearest_visible_adult_piglin");
   public static final il_3<iB_2> b = class_("nearest_visible_zombified");
   public static final il_3<Integer> M = class_("visible_adult_piglin_count");
   public static final il_3<Integer> O = class_("visible_adult_hoglin_count");
   public static final il_3<rhd_3> h = class_("nearest_player_holding_wanted_item");
   public static final il_3<Boolean> X = class_("ate_recently");
   public static final il_3<rfH_2> J = class_("nearest_repellent");
   public static final il_3<Boolean> x = class_("pacified");
   private final Optional<Codec<in_3<U>>> d;

   private il_3(Optional<Codec<U>> var1) {
      this.d = var1.map(in_3::class_);
   }

   @Override
   public String toString() {
      return rVL.d.break_(this).toString();
   }

   private static <U> il_3<U> class_(String var0, Codec<U> var1) {
      return rVL.class_(rVL.d, new rqO_2(var0), new il_3<>(Optional.of(var1)));
   }

   private static <U> il_3<U> class_(String var0) {
      return rVL.class_(rVL.d, new rqO_2(var0), new il_3<>(Optional.empty()));
   }

   public Optional<Codec<in_3<U>>> class_() {
      return this.d;
   }
}
