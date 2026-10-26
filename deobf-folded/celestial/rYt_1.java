package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rYt_1 {
   public static final Logger id_class = LogManager.getLogger();
   public static final rYt_1 id_break = new rYt_1(
      0.1F, Stream.of(aH_2.values()).collect(ImmutableMap.toImmutableMap(var0 -> var0, var0 -> ImmutableList.of())), ImmutableMap.of(), false
   );
   public static final MapCodec<rYt_1> id_byte = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
               Codec.FLOAT.optionalFieldOf("creature_spawn_probability", 0.1F).forGetter(var0x -> var0x.id_protected),
               Codec.simpleMap(
                     aH_2.CODEC, rYf_1.id_class.listOf().promotePartial(rqR_2.id_class("Spawn data: ", id_class::error)), rpH_2.id_class(aH_2.values())
                  )
                  .fieldOf("spawners")
                  .forGetter(var0x -> var0x.id_throws),
               Codec.simpleMap(rVL.id_transient, rYI.id_class, rVL.id_transient).fieldOf("spawn_costs").forGetter(var0x -> var0x.id_case),
               Codec.BOOL.fieldOf("player_spawn_friendly").orElse(false).forGetter(rYt_1::id_break)
            )
            .apply(var0, rYt_1::new)
   );
   private final float id_protected;
   private final Map<aH_2, List<rYf_1>> id_throws;
   private final Map<aI_2<?>, rYI> id_case;
   private final boolean id_catch;

   rYt_1(float var1, Map<aH_2, List<rYf_1>> var2, Map<aI_2<?>, rYI> var3, boolean var4) {
      this.id_protected = var1;
      this.id_throws = var2;
      this.id_case = var3;
      this.id_catch = var4;
   }

   public List<rYf_1> id_class(aH_2 var1) {
      return this.id_throws.getOrDefault(var1, ImmutableList.of());
   }

   public float id_class() {
      return this.id_protected;
   }

   public rYI id_class(aI_2<?> var1) {
      return this.id_case.get(var1);
   }

   public boolean id_break() {
      return this.id_catch;
   }
}
