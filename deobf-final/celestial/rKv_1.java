package celestial;

import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.Map;
import java.util.function.Predicate;

public enum rKv_1 implements rpH_2 {
   WORLD_SURFACE_WG("WORLD_SURFACE_WG", rKF.WORLDGEN, rKZ.class_),
   WORLD_SURFACE("WORLD_SURFACE", rKF.CLIENT, rKZ.class_),
   OCEAN_FLOOR_WG("OCEAN_FLOOR_WG", rKF.WORLDGEN, rKZ.break_),
   OCEAN_FLOOR("OCEAN_FLOOR", rKF.LIVE_WORLD, rKZ.break_),
   MOTION_BLOCKING("MOTION_BLOCKING", rKF.CLIENT, var0 -> var0.byte_().byte_() || !var0.volatile_().byte_()),
   MOTION_BLOCKING_NO_LEAVES(
      "MOTION_BLOCKING_NO_LEAVES", rKF.LIVE_WORLD, var0 -> (var0.byte_().byte_() || !var0.volatile_().byte_()) && !(var0.break_() instanceof kZ_2)
   );

   public static final Codec<rKv_1> field_236078_g_ = rpH_2.class_(rKv_1::values, rKv_1::class_);
   private final String id;
   private final rKF usage;
   private final Predicate<xc_3> heightLimitPredicate;
   private static final Map<String, rKv_1> BY_ID = rqR_2.class_(Maps.newHashMap(), var0 -> {
      for (rKv_1 var4 : values()) {
         var0.put(var4.id, var4);
      }
   });

   public boolean byte_() {
      return this.usage == rKF.CLIENT;
   }

   private rKv_1(String var3, rKF var4, Predicate<xc_3> var5) {
      this.id = var3;
      this.usage = var4;
      this.heightLimitPredicate = var5;
   }

   @Override
   public String class_() {
      return this.id;
   }

   public static rKv_1 class_(String var0) {
      return BY_ID.get(var0);
   }

   public String break_() {
      return this.id;
   }

   public Predicate<xc_3> throws_() {
      return this.heightLimitPredicate;
   }

   public boolean protected_() {
      return this.usage != rKF.WORLDGEN;
   }
}
