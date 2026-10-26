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
   public static final rqO_2 id_class = new rqO_2("overworld");
   public static final rqO_2 id_break = new rqO_2("the_nether");
   public static final rqO_2 id_byte = new rqO_2("the_end");
   public static final Codec<rRJ> id_protected = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.LONG
                  .optionalFieldOf("fixed_time")
                  .xmap(
                     var0x -> var0x.map(OptionalLong::of).orElseGet(OptionalLong::empty),
                     var0x -> var0x.isPresent() ? Optional.of(var0x.getAsLong()) : Optional.empty()
                  )
                  .forGetter(var0x -> var0x.id_package),
               Codec.BOOL.fieldOf("has_skylight").forGetter(rRJ::id_break),
               Codec.BOOL.fieldOf("has_ceiling").forGetter(rRJ::id_byte),
               Codec.BOOL.fieldOf("ultrawarm").forGetter(rRJ::id_protected),
               Codec.BOOL.fieldOf("natural").forGetter(rRJ::id_throws),
               Codec.doubleRange(1.0E-5F, 3.0E7).fieldOf("coordinate_scale").forGetter(rRJ::id_case),
               Codec.BOOL.fieldOf("piglin_safe").forGetter(rRJ::id_catch),
               Codec.BOOL.fieldOf("bed_works").forGetter(rRJ::id_private),
               Codec.BOOL.fieldOf("respawn_anchor_works").forGetter(rRJ::id_implements),
               Codec.BOOL.fieldOf("has_raids").forGetter(rRJ::id_finally),
               Codec.intRange(0, 256).fieldOf("logical_height").forGetter(rRJ::id_extends),
               rqO_2.id_class.fieldOf("infiniburn").forGetter(var0x -> var0x.id_instanceof),
               rqO_2.id_class.fieldOf("effects").orElse(id_class).forGetter(var0x -> var0x.id_throw),
               Codec.FLOAT.fieldOf("ambient_light").forGetter(var0x -> var0x.id_interface)
            )
            .apply(var0, rRJ::new)
   );
   public static final float[] id_throws = new float[]{1.0F, 0.75F, 0.5F, 0.25F, 0.0F, 0.25F, 0.5F, 0.75F};
   public static final rqM_2<rRJ> id_case = rqM_2.id_class(rVL.id_void, new rqO_2("overworld"));
   public static final rqM_2<rRJ> id_catch = rqM_2.id_class(rVL.id_void, new rqO_2("the_nether"));
   public static final rqM_2<rRJ> id_private = rqM_2.id_class(rVL.id_void, new rqO_2("the_end"));
   protected static final rRJ id_implements = new rRJ(
      OptionalLong.empty(), true, false, false, true, 1.0, false, false, true, false, true, 256, rYH.INSTANCE, rls_3.t.id_break(), id_class, 0.0F
   );
   protected static final rRJ id_finally = new rRJ(
      OptionalLong.of(18000L), false, true, true, false, 8.0, false, true, false, true, false, 128, rYq_1.INSTANCE, rls_3.w.id_break(), id_break, 0.1F
   );
   protected static final rRJ id_extends = new rRJ(
      OptionalLong.of(6000L), false, false, false, false, 1.0, true, false, false, false, true, 256, rYq_1.INSTANCE, rls_3.I.id_break(), id_byte, 0.0F
   );
   public static final rqM_2<rRJ> id_native = rqM_2.id_class(rVL.id_void, new rqO_2("overworld_caves"));
   protected static final rRJ id_volatile = new rRJ(
      OptionalLong.empty(), true, true, false, true, 1.0, false, false, true, false, true, 256, rYH.INSTANCE, rls_3.t.id_break(), id_class, 0.0F
   );
   public static final Codec<Supplier<rRJ>> id_final = rVA.id_class(rVL.id_void, id_protected);
   private final OptionalLong id_package;
   private final boolean id_int;
   private final boolean id_new;
   private final boolean id_continue;
   private final boolean id_super;
   private final double id_this;
   private final boolean id_else;
   private final boolean id_synchronized;
   private final boolean id_return;
   private final boolean id_public;
   private final boolean id_goto;
   private final int id_while;
   private final rYT id_try;
   private final rqO_2 id_instanceof;
   private final rqO_2 id_throw;
   private final float id_interface;
   private final transient float[] id_char;

   public boolean id_byte() {
      return this.id_new;
   }

   public rqO_2 id_int() {
      return this.id_throw;
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
      this.id_package = var1;
      this.id_int = var2;
      this.id_new = var3;
      this.id_continue = var4;
      this.id_super = var5;
      this.id_this = var6;
      this.id_else = var8;
      this.id_synchronized = var9;
      this.id_return = var10;
      this.id_public = var11;
      this.id_goto = var12;
      this.id_while = var13;
      this.id_try = var14;
      this.id_instanceof = var15;
      this.id_throw = var16;
      this.id_interface = var17;
      this.id_char = id_class(var17);
   }

   public boolean id_class(rRJ var1) {
      return this == var1
         ? true
         : this.id_int == var1.id_int
            && this.id_new == var1.id_new
            && this.id_continue == var1.id_continue
            && this.id_super == var1.id_super
            && this.id_this == var1.id_this
            && this.id_else == var1.id_else
            && this.id_synchronized == var1.id_synchronized
            && this.id_return == var1.id_return
            && this.id_public == var1.id_public
            && this.id_goto == var1.id_goto
            && this.id_while == var1.id_while
            && Float.compare(var1.id_interface, this.id_interface) == 0
            && this.id_package.equals(var1.id_package)
            && this.id_try.equals(var1.id_try)
            && this.id_instanceof.equals(var1.id_instanceof)
            && this.id_throw.equals(var1.id_throw);
   }

   public static rVv_1 id_class(rVv_1 var0) {
      rVF var1 = var0.id_break(rVL.id_void);
      var1.id_class(id_case, id_implements, Lifecycle.stable());
      var1.id_class(id_native, id_volatile, Lifecycle.stable());
      var1.id_class(id_catch, id_finally, Lifecycle.stable());
      var1.id_class(id_private, id_extends, Lifecycle.stable());
      return var0;
   }

   public float id_class(int var1) {
      return this.id_char[var1];
   }

   public float id_class(long var1) {
      double var3 = rfU_2.id_catch((double)this.id_package.orElse(var1) / 24000.0 - 0.25);
      double var5 = 0.5 - Math.cos(var3 * Math.PI) / 2.0;
      return (float)(var3 * 2.0 + var5) / 3.0F;
   }

   private static rKd_1 id_class(rVL<rYG> var0, rVL<rKW> var1, long var2) {
      return new rKT(new rYK(var0, var2), var2, () -> var1.id_byte(rKW.id_case));
   }

   private static float[] id_class(float var0) {
      float[] var1 = new float[16];

      for (int var2 = 0; var2 <= 15; var2++) {
         float var3 = (float)var2 / 15.0F;
         float var4 = var3 / (4.0F - 3.0F * var3);
         var1[var2] = rfU_2.id_catch(var0, var4, 1.0F);
      }

      return var1;
   }

   @Deprecated
   public static DataResult<rqM_2<rYB>> id_class(Dynamic<?> var0) {
      Optional var1 = var0.asNumber().result();
      if (var1.isPresent()) {
         int var2 = ((Number)var1.get()).intValue();
         if (var2 == -1) {
            return DataResult.success(rYB.id_protected);
         }

         if (var2 == 0) {
            return DataResult.success(rYB.id_byte);
         }

         if (var2 == 1) {
            return DataResult.success(rYB.id_throws);
         }
      }

      return rYB.id_break.parse(var0);
   }

   @Deprecated
   public String id_class() {
      return this.id_class(id_extends) ? "_end" : "";
   }

   public static rVC<rRX> id_class(rVL<rRJ> var0, rVL<rYG> var1, rVL<rKW> var2, long var3) {
      rVC var5 = new rVC<>(rVL.id_import, Lifecycle.experimental());
      var5.id_class(rRX.id_byte, new rRX(() -> var0.id_byte(id_catch), id_break(var1, var2, var3)), Lifecycle.stable());
      var5.id_class(rRX.id_protected, new rRX(() -> var0.id_byte(id_private), id_class(var1, var2, var3)), Lifecycle.stable());
      return var5;
   }

   public static File id_class(rqM_2<rYB> var0, File var1) {
      if (var0 == rYB.id_byte) {
         return var1;
      } else if (var0 == rYB.id_throws) {
         return new File(var1, "DIM1");
      } else {
         return var0 == rYB.id_protected
            ? new File(var1, "DIM-1")
            : new File(var1, "dimensions/" + var0.id_class().id_byte() + "/" + var0.id_class().id_break());
      }
   }

   public static double id_class(rRJ var0, rRJ var1) {
      double var2 = var0.id_case();
      double var4 = var1.id_case();
      return var2 / var4;
   }

   public int id_break(long var1) {
      return (int)(var1 / 24000L % 8L + 8L) % 8;
   }

   public boolean id_break() {
      return this.id_int;
   }

   private static rKd_1 id_break(rVL<rYG> var0, rVL<rKW> var1, long var2) {
      return new rKT(rYa_1.id_class.id_class(var0, var2), var2, () -> var1.id_byte(rKW.id_throws));
   }

   public boolean id_throws() {
      return this.id_super;
   }

   public boolean id_finally() {
      return this.id_goto;
   }

   public boolean id_catch() {
      return this.id_synchronized;
   }

   public int id_extends() {
      return this.id_while;
   }

   public double id_case() {
      return this.id_this;
   }

   public boolean id_implements() {
      return this.id_public;
   }

   public rlb_3<xd_3> id_package() {
      rlb_3 var1 = rls_3.id_class().id_class(this.id_instanceof);
      return (rlb_3<xd_3>)(var1 != null ? var1 : rls_3.t);
   }

   public boolean id_protected() {
      return this.id_continue;
   }

   public boolean id_private() {
      return this.id_return;
   }

   public boolean id_final() {
      return this.id_package.isPresent();
   }

   public rYT id_volatile() {
      return this.id_try;
   }

   public boolean id_native() {
      return this.id_else;
   }
}
