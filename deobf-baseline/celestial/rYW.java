package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class rYW {
   public static final Codec<rYW> id_class = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.INT.fieldOf("fog_color").forGetter(var0x -> var0x.id_break),
               Codec.INT.fieldOf("water_color").forGetter(var0x -> var0x.id_byte),
               Codec.INT.fieldOf("water_fog_color").forGetter(var0x -> var0x.id_protected),
               Codec.INT.fieldOf("sky_color").forGetter(var0x -> var0x.id_throws),
               Codec.INT.optionalFieldOf("foliage_color").forGetter(var0x -> var0x.id_case),
               Codec.INT.optionalFieldOf("grass_color").forGetter(var0x -> var0x.id_catch),
               rYQ.CODEC.optionalFieldOf("grass_color_modifier", rYQ.NONE).forGetter(var0x -> var0x.id_private),
               rYV.id_class.optionalFieldOf("particle").forGetter(var0x -> var0x.id_implements),
               rqA_2.id_class.optionalFieldOf("ambient_sound").forGetter(var0x -> var0x.id_finally),
               rYj_1.id_class.optionalFieldOf("mood_sound").forGetter(var0x -> var0x.id_extends),
               rYg_1.id_class.optionalFieldOf("additions_sound").forGetter(var0x -> var0x.id_native),
               NS.id_class.optionalFieldOf("music").forGetter(var0x -> var0x.id_volatile)
            )
            .apply(var0, rYW::new)
   );
   private final int id_break;
   private final int id_byte;
   private final int id_protected;
   private final int id_throws;
   private final Optional<Integer> id_case;
   private final Optional<Integer> id_catch;
   private final rYQ id_private;
   private final Optional<rYV> id_implements;
   private final Optional<rqA_2> id_finally;
   private final Optional<rYj_1> id_extends;
   private final Optional<rYg_1> id_native;
   private final Optional<NS> id_volatile;

   public int id_byte() {
      return this.id_protected;
   }

   rYW(
      int var1,
      int var2,
      int var3,
      int var4,
      Optional<Integer> var5,
      Optional<Integer> var6,
      rYQ var7,
      Optional<rYV> var8,
      Optional<rqA_2> var9,
      Optional<rYj_1> var10,
      Optional<rYg_1> var11,
      Optional<NS> var12
   ) {
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
      this.id_volatile = var12;
   }

   public int id_class() {
      return this.id_break;
   }

   public int id_break() {
      return this.id_byte;
   }

   public Optional<Integer> id_throws() {
      return this.id_case;
   }

   public Optional<rYj_1> id_finally() {
      return this.id_extends;
   }

   public rYQ id_catch() {
      return this.id_private;
   }

   public Optional<rYg_1> id_extends() {
      return this.id_native;
   }

   public Optional<Integer> id_case() {
      return this.id_catch;
   }

   public Optional<rqA_2> id_implements() {
      return this.id_finally;
   }

   public int id_protected() {
      return this.id_throws;
   }

   public Optional<rYV> id_private() {
      return this.id_implements;
   }

   public Optional<NS> id_native() {
      return this.id_volatile;
   }
}
