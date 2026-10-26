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
   public static final Logger class_ = LogManager.getLogger();
   public static final rYt_1 break_ = new rYt_1(
      0.1F, Stream.of(aH_2.values()).collect(ImmutableMap.toImmutableMap(var0 -> var0, var0 -> ImmutableList.of())), ImmutableMap.of(), false
   );
   public static final MapCodec<rYt_1> byte_ = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
               Codec.FLOAT.optionalFieldOf("creature_spawn_probability", 0.1F).forGetter(var0x -> var0x.protected_),
               Codec.simpleMap(aH_2.CODEC, rYf_1.class_.listOf().promotePartial(rqR_2.class_("Spawn data: ", class_::error)), rpH_2.class_(aH_2.values()))
                  .fieldOf("spawners")
                  .forGetter(var0x -> var0x.throws_),
               Codec.simpleMap(rVL.transient_, rYI.class_, rVL.transient_).fieldOf("spawn_costs").forGetter(var0x -> var0x.case_),
               Codec.BOOL.fieldOf("player_spawn_friendly").orElse(false).forGetter(rYt_1::break_)
            )
            .apply(var0, rYt_1::new)
   );
   private final float protected_;
   private final Map<aH_2, List<rYf_1>> throws_;
   private final Map<aI_2<?>, rYI> case_;
   private final boolean catch_;

   rYt_1(float var1, Map<aH_2, List<rYf_1>> var2, Map<aI_2<?>, rYI> var3, boolean var4) {
      this.protected_ = var1;
      this.throws_ = var2;
      this.case_ = var3;
      this.catch_ = var4;
   }

   public List<rYf_1> class_(aH_2 var1) {
      return this.throws_.getOrDefault(var1, ImmutableList.of());
   }

   public float class_() {
      return this.protected_;
   }

   public rYI class_(aI_2<?> var1) {
      return this.case_.get(var1);
   }

   public boolean break_() {
      return this.catch_;
   }
}
