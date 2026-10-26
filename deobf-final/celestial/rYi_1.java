package celestial;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class rYi_1 extends rYY {
   public static final Codec<rYi_1> throws_ = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.LONG.fieldOf("seed").stable().forGetter(var0x -> var0x.private_),
               Codec.BOOL.optionalFieldOf("legacy_biome_init_layer", false, Lifecycle.stable()).forGetter(var0x -> var0x.implements_),
               Codec.BOOL.fieldOf("large_biomes").orElse(false).stable().forGetter(var0x -> var0x.finally_),
               rVn_1.class_(rVL.n).forGetter(var0x -> var0x.extends_)
            )
            .apply(var0, var0.stable(rYi_1::new))
   );
   private final rrBJ case_;
   private static final List<rqM_2<rYG>> catch_ = ImmutableList.of(
      rYl_1.class_,
      rYl_1.break_,
      rYl_1.byte_,
      rYl_1.protected_,
      rYl_1.throws_,
      rYl_1.case_,
      rYl_1.catch_,
      rYl_1.private_,
      rYl_1.extends_,
      rYl_1.native_,
      rYl_1.volatile_,
      rYl_1.final_,
      new rqM_2[]{
         rYl_1.package_,
         rYl_1.int_,
         rYl_1.new_,
         rYl_1.continue_,
         rYl_1.super_,
         rYl_1.this_,
         rYl_1.else_,
         rYl_1.synchronized_,
         rYl_1.return_,
         rYl_1.public_,
         rYl_1.goto_,
         rYl_1.while_,
         rYl_1.try_,
         rYl_1.instanceof_,
         rYl_1.throw_,
         rYl_1.interface_,
         rYl_1.char_,
         rYl_1.abstract_,
         rYl_1.long_,
         rYl_1.float_,
         rYl_1.void_,
         rYl_1.static_,
         rYl_1.import_,
         rYl_1.short_,
         rYl_1.default_,
         rYl_1.const_,
         rYl_1.double_,
         rYl_1.switch_,
         rYl_1.r,
         rYl_1.P,
         rYl_1.B,
         rYl_1.S,
         rYl_1.s,
         rYl_1.G,
         rYl_1.b,
         rYl_1.M,
         rYl_1.O,
         rYl_1.h,
         rYl_1.X,
         rYl_1.J,
         rYl_1.x,
         rYl_1.d,
         rYl_1.k,
         rYl_1.W,
         rYl_1.z,
         rYl_1.Q,
         rYl_1.N,
         rYl_1.c,
         rYl_1.u,
         rYl_1.m,
         rYl_1.Z,
         rYl_1.v,
         rYl_1.F,
         rYl_1.L
      }
   );
   private final long private_;
   private final boolean implements_;
   private final boolean finally_;
   private final rVL<rYG> extends_;

   public rYi_1(long var1, boolean var3, boolean var4, rVL<rYG> var5) {
      super(catch_.stream().map(var1x -> () -> var5.byte_((rqM_2<rYG>)var1x)));
      this.private_ = var1;
      this.implements_ = var3;
      this.finally_ = var4;
      this.extends_ = var5;
      this.case_ = rrBx_1.class_(var1, var3, var4 ? 6 : 4, 4);
   }

   @Override
   protected Codec<? extends rYY> class_() {
      return throws_;
   }

   @Override
   public rYY class_(long var1) {
      return new rYi_1(var1, this.implements_, this.finally_, this.extends_);
   }

   @Override
   public rYG protected_(int var1, int var2, int var3) {
      return this.case_.class_(this.extends_, var1, var3);
   }
}
