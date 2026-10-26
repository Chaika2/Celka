package celestial;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum rem_3 implements rpH_2 {
   TERRAIN_MATCHING("terrain_matching", ImmutableList.of(new rrPh_1(rKv_1.WORLD_SURFACE_WG, -1))),
   RIGID("rigid", ImmutableList.of());

   public static final Codec<rem_3> field_236858_c_ = rpH_2.id_class(rem_3::values, rem_3::id_class);
   private static final Map<String, rem_3> BEHAVIOURS = Arrays.stream(values()).collect(Collectors.toMap(rem_3::id_break, var0 -> (rem_3)var0));
   private final String name;
   private final ImmutableList<rrPA> structureProcessors;

   public ImmutableList<rrPA> id_byte() {
      return this.structureProcessors;
   }

   private rem_3(String var3, ImmutableList<rrPA> var4) {
      this.name = var3;
      this.structureProcessors = var4;
   }

   @Override
   public String id_class() {
      return this.name;
   }

   public static rem_3 id_class(String var0) {
      return BEHAVIOURS.get(var0);
   }

   public String id_break() {
      return this.name;
   }
}
