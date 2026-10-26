package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class rDH implements rUv_1 {
   public static final Codec<rDH> id_class = RecordCodecBuilder.create(
      var0 -> var0.group(
               rKi_1.id_break.fieldOf("state_provider").forGetter(var0x -> var0x.id_break),
               rKY.id_class.fieldOf("block_placer").forGetter(var0x -> var0x.id_byte),
               xc_3.id_break.listOf().fieldOf("whitelist").forGetter(var0x -> var0x.id_protected.stream().map(xd_3::id_continue).collect(Collectors.toList())),
               xc_3.id_break.listOf().fieldOf("blacklist").forGetter(var0x -> ImmutableList.copyOf(var0x.id_throws)),
               Codec.INT.fieldOf("tries").orElse(128).forGetter(var0x -> var0x.id_case),
               Codec.INT.fieldOf("xspread").orElse(7).forGetter(var0x -> var0x.id_catch),
               Codec.INT.fieldOf("yspread").orElse(3).forGetter(var0x -> var0x.id_private),
               Codec.INT.fieldOf("zspread").orElse(7).forGetter(var0x -> var0x.id_implements),
               Codec.BOOL.fieldOf("can_replace").orElse(false).forGetter(var0x -> var0x.id_finally),
               Codec.BOOL.fieldOf("project").orElse(true).forGetter(var0x -> var0x.id_extends),
               Codec.BOOL.fieldOf("need_water").orElse(false).forGetter(var0x -> var0x.id_native)
            )
            .apply(var0, rDH::new)
   );
   public final rKi_1 id_break;
   public final rKY id_byte;
   public final Set<xd_3> id_protected;
   public final Set<xc_3> id_throws;
   public final int id_case;
   public final int id_catch;
   public final int id_private;
   public final int id_implements;
   public final boolean id_finally;
   public final boolean id_extends;
   public final boolean id_native;

   private rDH(rKi_1 var1, rKY var2, List<xc_3> var3, List<xc_3> var4, int var5, int var6, int var7, int var8, boolean var9, boolean var10, boolean var11) {
      this(var1, var2, var3.stream().map(JC::id_break).collect(Collectors.toSet()), ImmutableSet.copyOf(var4), var5, var6, var7, var8, var9, var10, var11);
   }

   rDH(rKi_1 var1, rKY var2, Set<xd_3> var3, Set<xc_3> var4, int var5, int var6, int var7, int var8, boolean var9, boolean var10, boolean var11) {
      this.id_break = var1;
      this.id_byte = var2;
      this.id_protected = var3;
      this.id_throws = var4;
      this.id_case = var5;
      this.id_catch = var6;
      this.id_private = var7;
      this.id_implements = var8;
      this.id_finally = var9;
      this.id_extends = var10;
      this.id_native = var11;
   }
}
