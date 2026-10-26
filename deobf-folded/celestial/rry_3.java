package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;

public class rry_3<E extends iB_2> extends rre_3<E> {
   public rry_3(List<Pair<rPm_1<? super E>, Integer>> var1) {
      this(ImmutableMap.of(), var1);
   }

   public rry_3(Map<il_3<?>, iC_2> var1, List<Pair<rPm_1<? super E>, Integer>> var2) {
      super(var1, ImmutableSet.of(), rra_3.SHUFFLED, rri_3.RUN_ONE, var2);
   }
}
