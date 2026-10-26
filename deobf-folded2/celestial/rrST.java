package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rrST {
   public static final Codec<rrST> id_class = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.intRange(0, 256).fieldOf("height").forGetter(rrST::id_class),
               rrSt_1.id_class.fieldOf("sampling").forGetter(rrST::id_break),
               rrSw_1.id_class.fieldOf("top_slide").forGetter(rrST::id_byte),
               rrSw_1.id_class.fieldOf("bottom_slide").forGetter(rrST::id_protected),
               Codec.intRange(1, 4).fieldOf("size_horizontal").forGetter(rrST::id_throws),
               Codec.intRange(1, 4).fieldOf("size_vertical").forGetter(rrST::id_case),
               Codec.DOUBLE.fieldOf("density_factor").forGetter(rrST::id_catch),
               Codec.DOUBLE.fieldOf("density_offset").forGetter(rrST::id_private),
               Codec.BOOL.fieldOf("simplex_surface_noise").forGetter(rrST::id_implements),
               Codec.BOOL.optionalFieldOf("random_density_offset", false, Lifecycle.experimental()).forGetter(rrST::id_finally),
               Codec.BOOL.optionalFieldOf("island_noise_override", false, Lifecycle.experimental()).forGetter(rrST::id_extends),
               Codec.BOOL.optionalFieldOf("amplified", false, Lifecycle.experimental()).forGetter(rrST::id_native)
            )
            .apply(var0, rrST::new)
   );
   private final int id_break;
   private final rrSt_1 id_byte;
   private final rrSw_1 id_protected;
   private final rrSw_1 id_throws;
   private final int id_case;
   private final int id_catch;
   private final double id_private;
   private final double id_implements;
   private final boolean id_finally;
   private final boolean id_extends;
   private final boolean id_native;
   private final boolean id_volatile;

   public rrSw_1 id_byte() {
      return this.id_protected;
   }

   public rrST(
      int var1, rrSt_1 var2, rrSw_1 var3, rrSw_1 var4, int var5, int var6, double var7, double var9, boolean var11, boolean var12, boolean var13, boolean var14
   ) {
      this.id_break = var1;
      this.id_byte = var2;
      this.id_protected = var3;
      this.id_throws = var4;
      this.id_case = var5;
      this.id_catch = var6;
      this.id_private = var7;
      this.id_implements = var9;
      this.id_finally = var11;
      this.id_extends = var12;
      this.id_native = var13;
      this.id_volatile = var14;
   }

   public int id_class() {
      return this.id_break;
   }

   public rrSt_1 id_break() {
      return this.id_byte;
   }

   public int id_throws() {
      return this.id_case;
   }

   @Deprecated
   public boolean id_finally() {
      return this.id_extends;
   }

   public double id_catch() {
      return this.id_private;
   }

   @Deprecated
   public boolean id_extends() {
      return this.id_native;
   }

   public int id_case() {
      return this.id_catch;
   }

   @Deprecated
   public boolean id_implements() {
      return this.id_finally;
   }

   public rrSw_1 id_protected() {
      return this.id_throws;
   }

   public double id_private() {
      return this.id_implements;
   }

   @Deprecated
   public boolean id_native() {
      return this.id_volatile;
   }
}
