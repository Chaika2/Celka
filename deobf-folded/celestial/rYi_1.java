package celestial;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class rYi_1 extends rYY {
   public static final Codec<rYi_1> id_throws = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.LONG.fieldOf("seed").stable().forGetter(var0x -> var0x.id_private),
               Codec.BOOL.optionalFieldOf("legacy_biome_init_layer", false, Lifecycle.stable()).forGetter(var0x -> var0x.id_implements),
               Codec.BOOL.fieldOf("large_biomes").orElse(false).stable().forGetter(var0x -> var0x.id_finally),
               rVn_1.id_class(rVL.n).forGetter(var0x -> var0x.id_extends)
            )
            .apply(var0, var0.stable(rYi_1::new))
   );
   private final rrBJ id_case;
   private static final List<rqM_2<rYG>> id_catch = ImmutableList.of(
      rYl_1.id_class,
      rYl_1.id_break,
      rYl_1.id_byte,
      rYl_1.id_protected,
      rYl_1.id_throws,
      rYl_1.id_case,
      rYl_1.id_catch,
      rYl_1.id_private,
      rYl_1.id_extends,
      rYl_1.id_native,
      rYl_1.id_volatile,
      rYl_1.id_final,
      new rqM_2[]{
         rYl_1.id_package,
         rYl_1.id_int,
         rYl_1.id_new,
         rYl_1.id_continue,
         rYl_1.id_super,
         rYl_1.id_this,
         rYl_1.id_else,
         rYl_1.id_synchronized,
         rYl_1.id_return,
         rYl_1.id_public,
         rYl_1.id_goto,
         rYl_1.id_while,
         rYl_1.id_try,
         rYl_1.id_instanceof,
         rYl_1.id_throw,
         rYl_1.id_interface,
         rYl_1.id_char,
         rYl_1.id_abstract,
         rYl_1.id_long,
         rYl_1.id_float,
         rYl_1.id_void,
         rYl_1.id_static,
         rYl_1.id_import,
         rYl_1.id_short,
         rYl_1.id_default,
         rYl_1.id_const,
         rYl_1.id_double,
         rYl_1.id_switch,
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
   private final long id_private;
   private final boolean id_implements;
   private final boolean id_finally;
   private final rVL<rYG> id_extends;

   public rYi_1(long var1, boolean var3, boolean var4, rVL<rYG> var5) {
      super(id_catch.stream().map(var1x -> () -> var5.id_byte((rqM_2<rYG>)var1x)));
      this.id_private = var1;
      this.id_implements = var3;
      this.id_finally = var4;
      this.id_extends = var5;
      this.id_case = rrBx_1.id_class(var1, var3, var4 ? 6 : 4, 4);
   }

   @Override
   protected Codec<? extends rYY> id_class() {
      return id_throws;
   }

   @Override
   public rYY id_class(long var1) {
      return new rYi_1(var1, this.id_implements, this.id_finally, this.id_extends);
   }

   @Override
   public rYG id_protected(int var1, int var2, int var3) {
      return this.id_case.id_class(this.id_extends, var1, var3);
   }
}
