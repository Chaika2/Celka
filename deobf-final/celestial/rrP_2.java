package celestial;

import java.util.function.Supplier;

public class rrP_2<U extends rrr_3<?>> {
   public static final rrP_2<iV_2> class_ = class_("dummy", iV_2::new);
   public static final rrP_2<rrs_3> break_ = class_("nearest_items", rrs_3::new);
   public static final rrP_2<iD_2> byte_ = class_("nearest_living_entities", iD_2::new);
   public static final rrP_2<iU_2> protected_ = class_("nearest_players", iU_2::new);
   public static final rrP_2<iK_2> throws_ = class_("nearest_bed", iK_2::new);
   public static final rrP_2<iY_2> case_ = class_("hurt_by", iY_2::new);
   public static final rrP_2<rrS_2> catch_ = class_("villager_hostiles", rrS_2::new);
   public static final rrP_2<rrB_2> private_ = class_("villager_babies", rrB_2::new);
   public static final rrP_2<ii_3> implements_ = class_("secondary_pois", ii_3::new);
   public static final rrP_2<ig_3> finally_ = class_("golem_detected", ig_3::new);
   public static final rrP_2<ia_3> extends_ = class_("piglin_specific_sensor", ia_3::new);
   public static final rrP_2<ie_3> native_ = class_("piglin_brute_specific_sensor", ie_3::new);
   public static final rrP_2<iR_2> volatile_ = class_("hoglin_specific_sensor", iR_2::new);
   public static final rrP_2<io_3> final_ = class_("nearest_adult", io_3::new);
   private final Supplier<U> package_;

   private rrP_2(Supplier<U> var1) {
      this.package_ = var1;
   }

   public U class_() {
      return this.package_.get();
   }

   private static <U extends rrr_3<?>> rrP_2<U> class_(String var0, Supplier<U> var1) {
      return rVL.class_(rVL.k, new rqO_2(var0), new rrP_2<>(var1));
   }
}
