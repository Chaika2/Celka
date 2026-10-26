package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rrST {
   public static final Codec<rrST> class_ = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.intRange(0, 256).fieldOf("height").forGetter(rrST::class_),
               rrSt_1.class_.fieldOf("sampling").forGetter(rrST::break_),
               rrSw_1.class_.fieldOf("top_slide").forGetter(rrST::byte_),
               rrSw_1.class_.fieldOf("bottom_slide").forGetter(rrST::protected_),
               Codec.intRange(1, 4).fieldOf("size_horizontal").forGetter(rrST::throws_),
               Codec.intRange(1, 4).fieldOf("size_vertical").forGetter(rrST::case_),
               Codec.DOUBLE.fieldOf("density_factor").forGetter(rrST::catch_),
               Codec.DOUBLE.fieldOf("density_offset").forGetter(rrST::private_),
               Codec.BOOL.fieldOf("simplex_surface_noise").forGetter(rrST::implements_),
               Codec.BOOL.optionalFieldOf("random_density_offset", false, Lifecycle.experimental()).forGetter(rrST::finally_),
               Codec.BOOL.optionalFieldOf("island_noise_override", false, Lifecycle.experimental()).forGetter(rrST::extends_),
               Codec.BOOL.optionalFieldOf("amplified", false, Lifecycle.experimental()).forGetter(rrST::native_)
            )
            .apply(var0, rrST::new)
   );
   private final int break_;
   private final rrSt_1 byte_;
   private final rrSw_1 protected_;
   private final rrSw_1 throws_;
   private final int case_;
   private final int catch_;
   private final double private_;
   private final double implements_;
   private final boolean finally_;
   private final boolean extends_;
   private final boolean native_;
   private final boolean volatile_;

   public rrSw_1 byte_() {
      return this.protected_;
   }

   public rrST(
      int var1, rrSt_1 var2, rrSw_1 var3, rrSw_1 var4, int var5, int var6, double var7, double var9, boolean var11, boolean var12, boolean var13, boolean var14
   ) {
      this.break_ = var1;
      this.byte_ = var2;
      this.protected_ = var3;
      this.throws_ = var4;
      this.case_ = var5;
      this.catch_ = var6;
      this.private_ = var7;
      this.implements_ = var9;
      this.finally_ = var11;
      this.extends_ = var12;
      this.native_ = var13;
      this.volatile_ = var14;
   }

   public int class_() {
      return this.break_;
   }

   public rrSt_1 break_() {
      return this.byte_;
   }

   public int throws_() {
      return this.case_;
   }

   @Deprecated
   public boolean finally_() {
      return this.extends_;
   }

   public double catch_() {
      return this.private_;
   }

   @Deprecated
   public boolean extends_() {
      return this.native_;
   }

   public int case_() {
      return this.catch_;
   }

   @Deprecated
   public boolean implements_() {
      return this.finally_;
   }

   public rrSw_1 protected_() {
      return this.throws_;
   }

   public double private_() {
      return this.implements_;
   }

   @Deprecated
   public boolean native_() {
      return this.volatile_;
   }
}
