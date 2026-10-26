package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.File;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.function.Supplier;

public class rRJ {
   public static final rqO_2 class_ = new rqO_2("overworld");
   public static final rqO_2 break_ = new rqO_2("the_nether");
   public static final rqO_2 byte_ = new rqO_2("the_end");
   public static final Codec<rRJ> protected_ = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.LONG
                  .optionalFieldOf("fixed_time")
                  .xmap(
                     var0x -> var0x.map(OptionalLong::of).orElseGet(OptionalLong::empty),
                     var0x -> var0x.isPresent() ? Optional.of(var0x.getAsLong()) : Optional.empty()
                  )
                  .forGetter(var0x -> var0x.package_),
               Codec.BOOL.fieldOf("has_skylight").forGetter(rRJ::break_),
               Codec.BOOL.fieldOf("has_ceiling").forGetter(rRJ::byte_),
               Codec.BOOL.fieldOf("ultrawarm").forGetter(rRJ::protected_),
               Codec.BOOL.fieldOf("natural").forGetter(rRJ::throws_),
               Codec.doubleRange(1.0E-5F, 3.0E7).fieldOf("coordinate_scale").forGetter(rRJ::case_),
               Codec.BOOL.fieldOf("piglin_safe").forGetter(rRJ::catch_),
               Codec.BOOL.fieldOf("bed_works").forGetter(rRJ::private_),
               Codec.BOOL.fieldOf("respawn_anchor_works").forGetter(rRJ::implements_),
               Codec.BOOL.fieldOf("has_raids").forGetter(rRJ::finally_),
               Codec.intRange(0, 256).fieldOf("logical_height").forGetter(rRJ::extends_),
               rqO_2.class_.fieldOf("infiniburn").forGetter(var0x -> var0x.instanceof_),
               rqO_2.class_.fieldOf("effects").orElse(class_).forGetter(var0x -> var0x.throw_),
               Codec.FLOAT.fieldOf("ambient_light").forGetter(var0x -> var0x.interface_)
            )
            .apply(var0, rRJ::new)
   );
   public static final float[] throws_ = new float[]{1.0F, 0.75F, 0.5F, 0.25F, 0.0F, 0.25F, 0.5F, 0.75F};
   public static final rqM_2<rRJ> case_ = rqM_2.class_(rVL.void_, new rqO_2("overworld"));
   public static final rqM_2<rRJ> catch_ = rqM_2.class_(rVL.void_, new rqO_2("the_nether"));
   public static final rqM_2<rRJ> private_ = rqM_2.class_(rVL.void_, new rqO_2("the_end"));
   protected static final rRJ implements_ = new rRJ(
      OptionalLong.empty(), true, false, false, true, 1.0, false, false, true, false, true, 256, rYH.INSTANCE, rls_3.t.break_(), class_, 0.0F
   );
   protected static final rRJ finally_ = new rRJ(
      OptionalLong.of(18000L), false, true, true, false, 8.0, false, true, false, true, false, 128, rYq_1.INSTANCE, rls_3.w.break_(), break_, 0.1F
   );
   protected static final rRJ extends_ = new rRJ(
      OptionalLong.of(6000L), false, false, false, false, 1.0, true, false, false, false, true, 256, rYq_1.INSTANCE, rls_3.I.break_(), byte_, 0.0F
   );
   public static final rqM_2<rRJ> native_ = rqM_2.class_(rVL.void_, new rqO_2("overworld_caves"));
   protected static final rRJ volatile_ = new rRJ(
      OptionalLong.empty(), true, true, false, true, 1.0, false, false, true, false, true, 256, rYH.INSTANCE, rls_3.t.break_(), class_, 0.0F
   );
   public static final Codec<Supplier<rRJ>> final_ = rVA.class_(rVL.void_, protected_);
   private final OptionalLong package_;
   private final boolean int_;
   private final boolean new_;
   private final boolean continue_;
   private final boolean super_;
   private final double this_;
   private final boolean else_;
   private final boolean synchronized_;
   private final boolean return_;
   private final boolean public_;
   private final boolean goto_;
   private final int while_;
   private final rYT try_;
   private final rqO_2 instanceof_;
   private final rqO_2 throw_;
   private final float interface_;
   private final transient float[] char_;

   public boolean byte_() {
      return this.new_;
   }

   public rqO_2 int_() {
      return this.throw_;
   }

   protected rRJ(
      OptionalLong var1,
      boolean var2,
      boolean var3,
      boolean var4,
      boolean var5,
      double var6,
      boolean var8,
      boolean var9,
      boolean var10,
      boolean var11,
      int var12,
      rqO_2 var13,
      rqO_2 var14,
      float var15
   ) {
      this(var1, var2, var3, var4, var5, var6, false, var8, var9, var10, var11, var12, rYq_1.INSTANCE, var13, var14, var15);
   }

   protected rRJ(
      OptionalLong var1,
      boolean var2,
      boolean var3,
      boolean var4,
      boolean var5,
      double var6,
      boolean var8,
      boolean var9,
      boolean var10,
      boolean var11,
      boolean var12,
      int var13,
      rYT var14,
      rqO_2 var15,
      rqO_2 var16,
      float var17
   ) {
      this.package_ = var1;
      this.int_ = var2;
      this.new_ = var3;
      this.continue_ = var4;
      this.super_ = var5;
      this.this_ = var6;
      this.else_ = var8;
      this.synchronized_ = var9;
      this.return_ = var10;
      this.public_ = var11;
      this.goto_ = var12;
      this.while_ = var13;
      this.try_ = var14;
      this.instanceof_ = var15;
      this.throw_ = var16;
      this.interface_ = var17;
      this.char_ = class_(var17);
   }

   public boolean class_(rRJ var1) {
      return this == var1
         ? true
         : this.int_ == var1.int_
            && this.new_ == var1.new_
            && this.continue_ == var1.continue_
            && this.super_ == var1.super_
            && this.this_ == var1.this_
            && this.else_ == var1.else_
            && this.synchronized_ == var1.synchronized_
            && this.return_ == var1.return_
            && this.public_ == var1.public_
            && this.goto_ == var1.goto_
            && this.while_ == var1.while_
            && Float.compare(var1.interface_, this.interface_) == 0
            && this.package_.equals(var1.package_)
            && this.try_.equals(var1.try_)
            && this.instanceof_.equals(var1.instanceof_)
            && this.throw_.equals(var1.throw_);
   }

   public static rVv_1 class_(rVv_1 var0) {
      rVF var1 = var0.break_(rVL.void_);
      var1.class_(case_, implements_, Lifecycle.stable());
      var1.class_(native_, volatile_, Lifecycle.stable());
      var1.class_(catch_, finally_, Lifecycle.stable());
      var1.class_(private_, extends_, Lifecycle.stable());
      return var0;
   }

   public float class_(int var1) {
      return this.char_[var1];
   }

   public float class_(long var1) {
      double var3 = rfU_2.catch_((double)this.package_.orElse(var1) / 24000.0 - 0.25);
      double var5 = 0.5 - Math.cos(var3 * Math.PI) / 2.0;
      return (float)(var3 * 2.0 + var5) / 3.0F;
   }

   private static rKd_1 class_(rVL<rYG> var0, rVL<rKW> var1, long var2) {
      return new rKT(new rYK(var0, var2), var2, () -> var1.byte_(rKW.case_));
   }

   private static float[] class_(float var0) {
      float[] var1 = new float[16];

      for (int var2 = 0; var2 <= 15; var2++) {
         float var3 = (float)var2 / 15.0F;
         float var4 = var3 / (4.0F - 3.0F * var3);
         var1[var2] = rfU_2.catch_(var0, var4, 1.0F);
      }

      return var1;
   }

   @Deprecated
   public static DataResult<rqM_2<rYB>> class_(Dynamic<?> var0) {
      Optional var1 = var0.asNumber().result();
      if (var1.isPresent()) {
         int var2 = ((Number)var1.get()).intValue();
         if (var2 == -1) {
            return DataResult.success(rYB.protected_);
         }

         if (var2 == 0) {
            return DataResult.success(rYB.byte_);
         }

         if (var2 == 1) {
            return DataResult.success(rYB.throws_);
         }
      }

      return rYB.break_.parse(var0);
   }

   @Deprecated
   public String class_() {
      return this.class_(extends_) ? "_end" : "";
   }

   public static rVC<rRX> class_(rVL<rRJ> var0, rVL<rYG> var1, rVL<rKW> var2, long var3) {
      rVC var5 = new rVC<>(rVL.import_, Lifecycle.experimental());
      var5.class_(rRX.byte_, new rRX(() -> var0.byte_(catch_), break_(var1, var2, var3)), Lifecycle.stable());
      var5.class_(rRX.protected_, new rRX(() -> var0.byte_(private_), class_(var1, var2, var3)), Lifecycle.stable());
      return var5;
   }

   public static File class_(rqM_2<rYB> var0, File var1) {
      if (var0 == rYB.byte_) {
         return var1;
      } else if (var0 == rYB.throws_) {
         return new File(var1, "DIM1");
      } else {
         return var0 == rYB.protected_ ? new File(var1, "DIM-1") : new File(var1, "dimensions/" + var0.class_().byte_() + "/" + var0.class_().break_());
      }
   }

   public static double class_(rRJ var0, rRJ var1) {
      double var2 = var0.case_();
      double var4 = var1.case_();
      return var2 / var4;
   }

   public int break_(long var1) {
      return (int)(var1 / 24000L % 8L + 8L) % 8;
   }

   public boolean break_() {
      return this.int_;
   }

   private static rKd_1 break_(rVL<rYG> var0, rVL<rKW> var1, long var2) {
      return new rKT(rYa_1.class_.class_(var0, var2), var2, () -> var1.byte_(rKW.throws_));
   }

   public boolean throws_() {
      return this.super_;
   }

   public boolean finally_() {
      return this.goto_;
   }

   public boolean catch_() {
      return this.synchronized_;
   }

   public int extends_() {
      return this.while_;
   }

   public double case_() {
      return this.this_;
   }

   public boolean implements_() {
      return this.public_;
   }

   public rlb_3<xd_3> package_() {
      rlb_3 var1 = rls_3.class_().class_(this.instanceof_);
      return (rlb_3<xd_3>)(var1 != null ? var1 : rls_3.t);
   }

   public boolean protected_() {
      return this.continue_;
   }

   public boolean private_() {
      return this.return_;
   }

   public boolean final_() {
      return this.package_.isPresent();
   }

   public rYT volatile_() {
      return this.try_;
   }

   public boolean native_() {
      return this.else_;
   }
}
