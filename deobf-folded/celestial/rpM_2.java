package celestial;

import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.Set;

public enum rpM_2 {
   NORTH(rpr_3.NORTH),
   NORTH_EAST(rpr_3.NORTH, rpr_3.EAST),
   EAST(rpr_3.EAST),
   SOUTH_EAST(rpr_3.SOUTH, rpr_3.EAST),
   SOUTH(rpr_3.SOUTH),
   SOUTH_WEST(rpr_3.SOUTH, rpr_3.WEST),
   WEST(rpr_3.WEST),
   NORTH_WEST(rpr_3.NORTH, rpr_3.WEST);

   private static final int NW_DIR_MASK = 1 << NORTH_WEST.ordinal();
   private static final int W_DIR_MASK = 1 << WEST.ordinal();
   private static final int SW_DIR_MASK = 1 << SOUTH_WEST.ordinal();
   private static final int S_DIR_MASK = 1 << SOUTH.ordinal();
   private static final int SE_DIR_MASK = 1 << SOUTH_EAST.ordinal();
   private static final int E_DIR_MASK = 1 << EAST.ordinal();
   private static final int NE_DIR_MASK = 1 << NORTH_EAST.ordinal();
   private static final int N_DIR_MASK = 1 << NORTH.ordinal();
   private final Set<rpr_3> directions;

   private rpM_2(rpr_3... var3) {
      this.directions = Sets.immutableEnumSet(Arrays.asList(var3));
   }

   public Set<rpr_3> id_class() {
      return this.directions;
   }
}
