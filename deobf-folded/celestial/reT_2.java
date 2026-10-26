package celestial;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class reT_2 {
   static {
      reZ_2.id_class(
         new reu_3(
            new rqO_2("bastion/mobs/piglin"),
            new rqO_2("empty"),
            ImmutableList.of(
               Pair.of(rev_3.id_break("bastion/mobs/melee_piglin"), 1),
               Pair.of(rev_3.id_break("bastion/mobs/sword_piglin"), 4),
               Pair.of(rev_3.id_break("bastion/mobs/crossbow_piglin"), 4),
               Pair.of(rev_3.id_break("bastion/mobs/empty"), 1)
            ),
            rem_3.RIGID
         )
      );
      reZ_2.id_class(
         new reu_3(
            new rqO_2("bastion/mobs/hoglin"),
            new rqO_2("empty"),
            ImmutableList.of(Pair.of(rev_3.id_break("bastion/mobs/hoglin"), 2), Pair.of(rev_3.id_break("bastion/mobs/empty"), 1)),
            rem_3.RIGID
         )
      );
      reZ_2.id_class(
         new reu_3(
            new rqO_2("bastion/blocks/gold"),
            new rqO_2("empty"),
            ImmutableList.of(Pair.of(rev_3.id_break("bastion/blocks/air"), 3), Pair.of(rev_3.id_break("bastion/blocks/gold"), 1)),
            rem_3.RIGID
         )
      );
      reZ_2.id_class(
         new reu_3(
            new rqO_2("bastion/mobs/piglin_melee"),
            new rqO_2("empty"),
            ImmutableList.of(
               Pair.of(rev_3.id_break("bastion/mobs/melee_piglin_always"), 1),
               Pair.of(rev_3.id_break("bastion/mobs/melee_piglin"), 5),
               Pair.of(rev_3.id_break("bastion/mobs/sword_piglin"), 1)
            ),
            rem_3.RIGID
         )
      );
   }

   public static void id_class() {
   }
}
