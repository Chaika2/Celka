package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rif_3 {
   public static final Codec<rif_3> class_ = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.BOOL.fieldOf("cold").forGetter(var0x -> var0x.break_),
               Codec.FLOAT.fieldOf("mossiness").forGetter(var0x -> var0x.byte_),
               Codec.BOOL.fieldOf("air_pocket").forGetter(var0x -> var0x.protected_),
               Codec.BOOL.fieldOf("overgrown").forGetter(var0x -> var0x.throws_),
               Codec.BOOL.fieldOf("vines").forGetter(var0x -> var0x.case_),
               Codec.BOOL.fieldOf("replace_with_blackstone").forGetter(var0x -> var0x.catch_)
            )
            .apply(var0, rif_3::new)
   );
   public boolean break_;
   public float byte_ = 0.2F;
   public boolean protected_;
   public boolean throws_;
   public boolean case_;
   public boolean catch_;

   public rif_3() {
   }

   public <T> rif_3(boolean var1, float var2, boolean var3, boolean var4, boolean var5, boolean var6) {
      this.break_ = var1;
      this.byte_ = var2;
      this.protected_ = var3;
      this.throws_ = var4;
      this.case_ = var5;
      this.catch_ = var6;
   }
}
