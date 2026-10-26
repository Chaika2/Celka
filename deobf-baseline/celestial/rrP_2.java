package celestial;

import java.util.function.Supplier;

public class rrP_2<U extends rrr_3<?>> {
   public static final rrP_2<iV_2> id_class = id_class("dummy", iV_2::new);
   public static final rrP_2<rrs_3> id_break = id_class("nearest_items", rrs_3::new);
   public static final rrP_2<iD_2> id_byte = id_class("nearest_living_entities", iD_2::new);
   public static final rrP_2<iU_2> id_protected = id_class("nearest_players", iU_2::new);
   public static final rrP_2<iK_2> id_throws = id_class("nearest_bed", iK_2::new);
   public static final rrP_2<iY_2> id_case = id_class("hurt_by", iY_2::new);
   public static final rrP_2<rrS_2> id_catch = id_class("villager_hostiles", rrS_2::new);
   public static final rrP_2<rrB_2> id_private = id_class("villager_babies", rrB_2::new);
   public static final rrP_2<ii_3> id_implements = id_class("secondary_pois", ii_3::new);
   public static final rrP_2<ig_3> id_finally = id_class("golem_detected", ig_3::new);
   public static final rrP_2<ia_3> id_extends = id_class("piglin_specific_sensor", ia_3::new);
   public static final rrP_2<ie_3> id_native = id_class("piglin_brute_specific_sensor", ie_3::new);
   public static final rrP_2<iR_2> id_volatile = id_class("hoglin_specific_sensor", iR_2::new);
   public static final rrP_2<io_3> id_final = id_class("nearest_adult", io_3::new);
   private final Supplier<U> id_package;

   private rrP_2(Supplier<U> var1) {
      this.id_package = var1;
   }

   public U id_class() {
      return this.id_package.get();
   }

   private static <U extends rrr_3<?>> rrP_2<U> id_class(String var0, Supplier<U> var1) {
      return rVL.id_class(rVL.k, new rqO_2(var0), new rrP_2<>(var1));
   }
}
