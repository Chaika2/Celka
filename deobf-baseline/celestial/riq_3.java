package celestial;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class riq_3 {
   public static final reu_3 id_class = reZ_2.id_class(
      new reu_3(
         new rqO_2("pillager_outpost/base_plates"),
         new rqO_2("empty"),
         ImmutableList.of(Pair.of(rev_3.id_class("pillager_outpost/base_plate"), 1)),
         rem_3.RIGID
      )
   );

   static {
      reZ_2.id_class(
         new reu_3(
            new rqO_2("pillager_outpost/towers"),
            new rqO_2("empty"),
            ImmutableList.of(
               Pair.of(
                  rev_3.id_class(
                     ImmutableList.of(
                        rev_3.id_class("pillager_outpost/watchtower"), rev_3.id_class("pillager_outpost/watchtower_overgrown", rrPu_1.id_continue)
                     )
                  ),
                  1
               )
            ),
            rem_3.RIGID
         )
      );
      reZ_2.id_class(
         new reu_3(
            new rqO_2("pillager_outpost/feature_plates"),
            new rqO_2("empty"),
            ImmutableList.of(Pair.of(rev_3.id_class("pillager_outpost/feature_plate"), 1)),
            rem_3.TERRAIN_MATCHING
         )
      );
      reZ_2.id_class(
         new reu_3(
            new rqO_2("pillager_outpost/features"),
            new rqO_2("empty"),
            ImmutableList.of(
               Pair.of(rev_3.id_class("pillager_outpost/feature_cage1"), 1),
               Pair.of(rev_3.id_class("pillager_outpost/feature_cage2"), 1),
               Pair.of(rev_3.id_class("pillager_outpost/feature_logs"), 1),
               Pair.of(rev_3.id_class("pillager_outpost/feature_tent1"), 1),
               Pair.of(rev_3.id_class("pillager_outpost/feature_tent2"), 1),
               Pair.of(rev_3.id_class("pillager_outpost/feature_targets"), 1),
               Pair.of(rev_3.id_throws(), 6)
            ),
            rem_3.RIGID
         )
      );
   }

   public static void id_class() {
   }
}
