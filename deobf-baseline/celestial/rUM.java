package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class rUM implements rUv_1 {
   public static final Codec<rUM> id_class = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.BOOL.fieldOf("crystal_invulnerable").orElse(false).forGetter(var0x -> var0x.id_break),
               rUG.id_class.listOf().fieldOf("spikes").forGetter(var0x -> var0x.id_byte),
               rfH_2.id_byte.optionalFieldOf("crystal_beam_target").forGetter(var0x -> Optional.ofNullable(var0x.id_protected))
            )
            .apply(var0, rUM::new)
   );
   private final boolean id_break;
   private final List<rUG> id_byte;
   private final rfH_2 id_protected;

   public List<rUG> id_byte() {
      return this.id_byte;
   }

   public rUM(boolean var1, List<rUG> var2, rfH_2 var3) {
      this(var1, var2, Optional.ofNullable(var3));
   }

   private rUM(boolean var1, List<rUG> var2, Optional<rfH_2> var3) {
      this.id_break = var1;
      this.id_byte = var2;
      this.id_protected = (rfH_2)var3.orElse((rfH_2)null);
   }

   public boolean id_break() {
      return this.id_break;
   }

   public rfH_2 id_protected() {
      return this.id_protected;
   }
}
