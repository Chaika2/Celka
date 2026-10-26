package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class rDH implements rUv_1 {
   public static final Codec<rDH> class_ = RecordCodecBuilder.create(
      var0 -> var0.group(
               rKi_1.break_.fieldOf("state_provider").forGetter(var0x -> var0x.break_),
               rKY.class_.fieldOf("block_placer").forGetter(var0x -> var0x.byte_),
               xc_3.break_.listOf().fieldOf("whitelist").forGetter(var0x -> var0x.protected_.stream().map(xd_3::continue_).collect(Collectors.toList())),
               xc_3.break_.listOf().fieldOf("blacklist").forGetter(var0x -> ImmutableList.copyOf(var0x.throws_)),
               Codec.INT.fieldOf("tries").orElse(128).forGetter(var0x -> var0x.case_),
               Codec.INT.fieldOf("xspread").orElse(7).forGetter(var0x -> var0x.catch_),
               Codec.INT.fieldOf("yspread").orElse(3).forGetter(var0x -> var0x.private_),
               Codec.INT.fieldOf("zspread").orElse(7).forGetter(var0x -> var0x.implements_),
               Codec.BOOL.fieldOf("can_replace").orElse(false).forGetter(var0x -> var0x.finally_),
               Codec.BOOL.fieldOf("project").orElse(true).forGetter(var0x -> var0x.extends_),
               Codec.BOOL.fieldOf("need_water").orElse(false).forGetter(var0x -> var0x.native_)
            )
            .apply(var0, rDH::new)
   );
   public final rKi_1 break_;
   public final rKY byte_;
   public final Set<xd_3> protected_;
   public final Set<xc_3> throws_;
   public final int case_;
   public final int catch_;
   public final int private_;
   public final int implements_;
   public final boolean finally_;
   public final boolean extends_;
   public final boolean native_;

   private rDH(rKi_1 var1, rKY var2, List<xc_3> var3, List<xc_3> var4, int var5, int var6, int var7, int var8, boolean var9, boolean var10, boolean var11) {
      this(var1, var2, var3.stream().map(JC::break_).collect(Collectors.toSet()), ImmutableSet.copyOf(var4), var5, var6, var7, var8, var9, var10, var11);
   }

   rDH(rKi_1 var1, rKY var2, Set<xd_3> var3, Set<xc_3> var4, int var5, int var6, int var7, int var8, boolean var9, boolean var10, boolean var11) {
      this.break_ = var1;
      this.byte_ = var2;
      this.protected_ = var3;
      this.throws_ = var4;
      this.case_ = var5;
      this.catch_ = var6;
      this.private_ = var7;
      this.implements_ = var8;
      this.finally_ = var9;
      this.extends_ = var10;
      this.native_ = var11;
   }
}
