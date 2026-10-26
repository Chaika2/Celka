package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public class rUH implements rUv_1 {
   public static final Codec<rUH> id_class = RecordCodecBuilder.create(
      var0 -> var0.group(
               rXE.id_class.fieldOf("state").forGetter(var0x -> var0x.id_break),
               Codec.BOOL.fieldOf("requires_block_below").orElse(true).forGetter(var0x -> var0x.id_byte),
               Codec.INT.fieldOf("rock_count").orElse(4).forGetter(var0x -> var0x.id_protected),
               Codec.INT.fieldOf("hole_count").orElse(1).forGetter(var0x -> var0x.id_throws),
               rVL.id_strictfp.listOf().fieldOf("valid_blocks").xmap(ImmutableSet::copyOf, ImmutableList::copyOf).forGetter(var0x -> var0x.id_case)
            )
            .apply(var0, rUH::new)
   );
   public final rXE id_break;
   public final boolean id_byte;
   public final int id_protected;
   public final int id_throws;
   public final Set<xd_3> id_case;

   public rUH(rXE var1, boolean var2, int var3, int var4, Set<xd_3> var5) {
      this.id_break = var1;
      this.id_byte = var2;
      this.id_protected = var3;
      this.id_throws = var4;
      this.id_case = var5;
   }
}
