package celestial;

import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.HashMap;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Supplier;

public final class rKW {
   public static final Codec<rKW> id_class = RecordCodecBuilder.create(
      var0 -> var0.group(
               rrSq_1.id_class.fieldOf("structures").forGetter(rKW::id_class),
               rrST.id_class.fieldOf("noise").forGetter(rKW::id_break),
               xc_3.id_break.fieldOf("default_block").forGetter(rKW::id_byte),
               xc_3.id_break.fieldOf("default_fluid").forGetter(rKW::id_protected),
               Codec.intRange(-20, 276).fieldOf("bedrock_roof_position").forGetter(rKW::id_throws),
               Codec.intRange(-20, 276).fieldOf("bedrock_floor_position").forGetter(rKW::id_case),
               Codec.intRange(0, 255).fieldOf("sea_level").forGetter(rKW::id_catch),
               Codec.BOOL.fieldOf("disable_mob_generation").forGetter(rKW::id_private)
            )
            .apply(var0, rKW::new)
   );
   public static final Codec<Supplier<rKW>> id_break = rVA.id_class(rVL.u, id_class);
   private final rrSq_1 id_implements;
   private final rrST id_finally;
   private final xc_3 id_extends;
   private final xc_3 id_native;
   private final int id_volatile;
   private final int id_final;
   private final int id_package;
   private final boolean id_int;
   public static final rqM_2<rKW> id_byte = rqM_2.id_class(rVL.u, new rqO_2("overworld"));
   public static final rqM_2<rKW> id_protected = rqM_2.id_class(rVL.u, new rqO_2("amplified"));
   public static final rqM_2<rKW> id_throws = rqM_2.id_class(rVL.u, new rqO_2("nether"));
   public static final rqM_2<rKW> id_case = rqM_2.id_class(rVL.u, new rqO_2("end"));
   public static final rqM_2<rKW> id_catch = rqM_2.id_class(rVL.u, new rqO_2("caves"));
   public static final rqM_2<rKW> id_private = rqM_2.id_class(rVL.u, new rqO_2("floating_islands"));
   private static final rKW id_new = id_class(id_byte, id_class(new rrSq_1(true), false, id_byte.id_class()));

   public xc_3 id_byte() {
      return this.id_extends;
   }

   private rKW(rrSq_1 var1, rrST var2, xc_3 var3, xc_3 var4, int var5, int var6, int var7, boolean var8) {
      this.id_implements = var1;
      this.id_finally = var2;
      this.id_extends = var3;
      this.id_native = var4;
      this.id_volatile = var5;
      this.id_final = var6;
      this.id_package = var7;
      this.id_int = var8;
   }

   static {
      id_class(id_protected, id_class(new rrSq_1(true), true, id_protected.id_class()));
      id_class(id_throws, id_class(new rrSq_1(false), xu_3.PR.id_continue(), xu_3.id_instanceof.id_continue(), id_throws.id_class()));
      id_class(id_case, id_class(new rrSq_1(false), xu_3.Sh.id_continue(), xu_3.id_class.id_continue(), id_case.id_class(), true, true));
      id_class(id_catch, id_class(new rrSq_1(true), xu_3.id_break.id_continue(), xu_3.id_try.id_continue(), id_catch.id_class()));
      id_class(id_private, id_class(new rrSq_1(true), xu_3.id_break.id_continue(), xu_3.id_try.id_continue(), id_private.id_class(), false, false));
   }

   private static rKW id_class(rrSq_1 var0, xc_3 var1, xc_3 var2, rqO_2 var3) {
      HashMap var4 = Maps.newHashMap(rrSq_1.id_break);
      var4.put(rrrZ.id_private, new rrSI(25, 10, 34222645));
      return new rKW(
         new rrSq_1(Optional.ofNullable(var0.id_break()), var4),
         new rrST(128, new rrSt_1(1.0, 3.0, 80.0, 60.0), new rrSw_1(120, 3, 0), new rrSw_1(320, 4, -1), 1, 2, 0.0, 0.019921875, false, false, false, false),
         var1,
         var2,
         0,
         0,
         32,
         false
      );
   }

   private static rKW id_class(rrSq_1 var0, xc_3 var1, xc_3 var2, rqO_2 var3, boolean var4, boolean var5) {
      return new rKW(
         var0,
         new rrST(128, new rrSt_1(2.0, 1.0, 80.0, 160.0), new rrSw_1(-3000, 64, -46), new rrSw_1(-30, 7, 1), 2, 1, 0.0, 0.0, true, false, var5, false),
         var1,
         var2,
         -10,
         -10,
         0,
         var4
      );
   }

   public rrSq_1 id_class() {
      return this.id_implements;
   }

   public boolean id_class(rqM_2<rKW> var1) {
      return Objects.equals(this, rVy_1.id_finally.id_class(var1));
   }

   private static rKW id_class(rqM_2<rKW> var0, rKW var1) {
      rVy_1.id_class(rVy_1.id_finally, var0.id_class(), var1);
      return var1;
   }

   private static rKW id_class(rrSq_1 var0, boolean var1, rqO_2 var2) {
      double var3 = 0.9999999814507745;
      return new rKW(
         var0,
         new rrST(
            256,
            new rrSt_1(0.9999999814507745, 0.9999999814507745, 80.0, 160.0),
            new rrSw_1(-10, 3, 0),
            new rrSw_1(-30, 0, 0),
            1,
            2,
            1.0,
            -0.46875,
            true,
            true,
            false,
            var1
         ),
         xu_3.id_break.id_continue(),
         xu_3.id_try.id_continue(),
         -10,
         0,
         63,
         false
      );
   }

   public rrST id_break() {
      return this.id_finally;
   }

   public int id_throws() {
      return this.id_volatile;
   }

   public int id_catch() {
      return this.id_package;
   }

   public int id_case() {
      return this.id_final;
   }

   public static rKW id_implements() {
      return id_new;
   }

   public xc_3 id_protected() {
      return this.id_native;
   }

   @Deprecated
   protected boolean id_private() {
      return this.id_int;
   }
}
