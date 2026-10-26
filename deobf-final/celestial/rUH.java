package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public class rUH implements rUv_1 {
   public static final Codec<rUH> class_ = RecordCodecBuilder.create(
      var0 -> var0.group(
               rXE.class_.fieldOf("state").forGetter(var0x -> var0x.break_),
               Codec.BOOL.fieldOf("requires_block_below").orElse(true).forGetter(var0x -> var0x.byte_),
               Codec.INT.fieldOf("rock_count").orElse(4).forGetter(var0x -> var0x.protected_),
               Codec.INT.fieldOf("hole_count").orElse(1).forGetter(var0x -> var0x.throws_),
               rVL.strictfp_.listOf().fieldOf("valid_blocks").xmap(ImmutableSet::copyOf, ImmutableList::copyOf).forGetter(var0x -> var0x.case_)
            )
            .apply(var0, rUH::new)
   );
   public final rXE break_;
   public final boolean byte_;
   public final int protected_;
   public final int throws_;
   public final Set<xd_3> case_;

   public rUH(rXE var1, boolean var2, int var3, int var4, Set<xd_3> var5) {
      this.break_ = var1;
      this.byte_ = var2;
      this.protected_ = var3;
      this.throws_ = var4;
      this.case_ = var5;
   }
}
