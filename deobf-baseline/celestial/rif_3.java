package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rif_3 {
   public static final Codec<rif_3> id_class = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.BOOL.fieldOf("cold").forGetter(var0x -> var0x.id_break),
               Codec.FLOAT.fieldOf("mossiness").forGetter(var0x -> var0x.id_byte),
               Codec.BOOL.fieldOf("air_pocket").forGetter(var0x -> var0x.id_protected),
               Codec.BOOL.fieldOf("overgrown").forGetter(var0x -> var0x.id_throws),
               Codec.BOOL.fieldOf("vines").forGetter(var0x -> var0x.id_case),
               Codec.BOOL.fieldOf("replace_with_blackstone").forGetter(var0x -> var0x.id_catch)
            )
            .apply(var0, rif_3::new)
   );
   public boolean id_break;
   public float id_byte = 0.2F;
   public boolean id_protected;
   public boolean id_throws;
   public boolean id_case;
   public boolean id_catch;

   public rif_3() {
   }

   public <T> rif_3(boolean var1, float var2, boolean var3, boolean var4, boolean var5, boolean var6) {
      this.id_break = var1;
      this.id_byte = var2;
      this.id_protected = var3;
      this.id_throws = var4;
      this.id_case = var5;
      this.id_catch = var6;
   }
}
