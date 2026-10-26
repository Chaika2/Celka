package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class rYW {
   public static final Codec<rYW> class_ = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.INT.fieldOf("fog_color").forGetter(var0x -> var0x.break_),
               Codec.INT.fieldOf("water_color").forGetter(var0x -> var0x.byte_),
               Codec.INT.fieldOf("water_fog_color").forGetter(var0x -> var0x.protected_),
               Codec.INT.fieldOf("sky_color").forGetter(var0x -> var0x.throws_),
               Codec.INT.optionalFieldOf("foliage_color").forGetter(var0x -> var0x.case_),
               Codec.INT.optionalFieldOf("grass_color").forGetter(var0x -> var0x.catch_),
               rYQ.CODEC.optionalFieldOf("grass_color_modifier", rYQ.NONE).forGetter(var0x -> var0x.private_),
               rYV.class_.optionalFieldOf("particle").forGetter(var0x -> var0x.implements_),
               rqA_2.class_.optionalFieldOf("ambient_sound").forGetter(var0x -> var0x.finally_),
               rYj_1.class_.optionalFieldOf("mood_sound").forGetter(var0x -> var0x.extends_),
               rYg_1.class_.optionalFieldOf("additions_sound").forGetter(var0x -> var0x.native_),
               NS.class_.optionalFieldOf("music").forGetter(var0x -> var0x.volatile_)
            )
            .apply(var0, rYW::new)
   );
   private final int break_;
   private final int byte_;
   private final int protected_;
   private final int throws_;
   private final Optional<Integer> case_;
   private final Optional<Integer> catch_;
   private final rYQ private_;
   private final Optional<rYV> implements_;
   private final Optional<rqA_2> finally_;
   private final Optional<rYj_1> extends_;
   private final Optional<rYg_1> native_;
   private final Optional<NS> volatile_;

   public int byte_() {
      return this.protected_;
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
      this.volatile_ = var12;
   }

   public int class_() {
      return this.break_;
   }

   public int break_() {
      return this.byte_;
   }

   public Optional<Integer> throws_() {
      return this.case_;
   }

   public Optional<rYj_1> finally_() {
      return this.extends_;
   }

   public rYQ catch_() {
      return this.private_;
   }

   public Optional<rYg_1> extends_() {
      return this.native_;
   }

   public Optional<Integer> case_() {
      return this.catch_;
   }

   public Optional<rqA_2> implements_() {
      return this.finally_;
   }

   public int protected_() {
      return this.throws_;
   }

   public Optional<rYV> private_() {
      return this.implements_;
   }

   public Optional<NS> native_() {
      return this.volatile_;
   }
}
