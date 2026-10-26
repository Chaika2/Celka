package celestial;

import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.Map;
import java.util.function.Predicate;

public enum rKv_1 implements rpH_2 {
   WORLD_SURFACE_WG("WORLD_SURFACE_WG", rKF.WORLDGEN, rKZ.id_class),
   WORLD_SURFACE("WORLD_SURFACE", rKF.CLIENT, rKZ.id_class),
   OCEAN_FLOOR_WG("OCEAN_FLOOR_WG", rKF.WORLDGEN, rKZ.id_break),
   OCEAN_FLOOR("OCEAN_FLOOR", rKF.LIVE_WORLD, rKZ.id_break),
   MOTION_BLOCKING("MOTION_BLOCKING", rKF.CLIENT, var0 -> var0.id_byte().id_byte() || !var0.id_volatile().id_byte()),
   MOTION_BLOCKING_NO_LEAVES(
      "MOTION_BLOCKING_NO_LEAVES", rKF.LIVE_WORLD, var0 -> (var0.id_byte().id_byte() || !var0.id_volatile().id_byte()) && !(var0.id_break() instanceof kZ_2)
   );

   public static final Codec<rKv_1> field_236078_g_ = rpH_2.id_class(rKv_1::values, rKv_1::id_class);
   private final String id;
   private final rKF usage;
   private final Predicate<xc_3> heightLimitPredicate;
   private static final Map<String, rKv_1> BY_ID = rqR_2.id_class(Maps.newHashMap(), var0 -> {
      for (rKv_1 var4 : values()) {
         var0.put(var4.id, var4);
      }
   });

   public boolean id_byte() {
      return this.usage == rKF.CLIENT;
   }

   private rKv_1(String var3, rKF var4, Predicate<xc_3> var5) {
      this.id = var3;
      this.usage = var4;
      this.heightLimitPredicate = var5;
   }

   @Override
   public String id_class() {
      return this.id;
   }

   public static rKv_1 id_class(String var0) {
      return BY_ID.get(var0);
   }

   public String id_break() {
      return this.id;
   }

   public Predicate<xc_3> id_throws() {
      return this.heightLimitPredicate;
   }

   public boolean id_protected() {
      return this.usage != rKF.WORLDGEN;
   }
}
