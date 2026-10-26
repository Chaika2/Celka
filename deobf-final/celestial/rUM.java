package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class rUM implements rUv_1 {
   public static final Codec<rUM> class_ = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.BOOL.fieldOf("crystal_invulnerable").orElse(false).forGetter(var0x -> var0x.break_),
               rUG.class_.listOf().fieldOf("spikes").forGetter(var0x -> var0x.byte_),
               rfH_2.byte_.optionalFieldOf("crystal_beam_target").forGetter(var0x -> Optional.ofNullable(var0x.protected_))
            )
            .apply(var0, rUM::new)
   );
   private final boolean break_;
   private final List<rUG> byte_;
   private final rfH_2 protected_;

   public List<rUG> byte_() {
      return this.byte_;
   }

   public rUM(boolean var1, List<rUG> var2, rfH_2 var3) {
      this(var1, var2, Optional.ofNullable(var3));
   }

   private rUM(boolean var1, List<rUG> var2, Optional<rfH_2> var3) {
      this.break_ = var1;
      this.byte_ = var2;
      this.protected_ = (rfH_2)var3.orElse((rfH_2)null);
   }

   public boolean break_() {
      return this.break_;
   }

   public rfH_2 protected_() {
      return this.protected_;
   }
}
