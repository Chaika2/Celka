package celestial;

import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.HashMap;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Supplier;

public final class rKW {
   public static final Codec<rKW> class_ = RecordCodecBuilder.create(
      var0 -> var0.group(
               rrSq_1.class_.fieldOf("structures").forGetter(rKW::class_),
               rrST.class_.fieldOf("noise").forGetter(rKW::break_),
               xc_3.break_.fieldOf("default_block").forGetter(rKW::byte_),
               xc_3.break_.fieldOf("default_fluid").forGetter(rKW::protected_),
               Codec.intRange(-20, 276).fieldOf("bedrock_roof_position").forGetter(rKW::throws_),
               Codec.intRange(-20, 276).fieldOf("bedrock_floor_position").forGetter(rKW::case_),
               Codec.intRange(0, 255).fieldOf("sea_level").forGetter(rKW::catch_),
               Codec.BOOL.fieldOf("disable_mob_generation").forGetter(rKW::private_)
            )
            .apply(var0, rKW::new)
   );
   public static final Codec<Supplier<rKW>> break_ = rVA.class_(rVL.u, class_);
   private final rrSq_1 implements_;
   private final rrST finally_;
   private final xc_3 extends_;
   private final xc_3 native_;
   private final int volatile_;
   private final int final_;
   private final int package_;
   private final boolean int_;
   public static final rqM_2<rKW> byte_ = rqM_2.class_(rVL.u, new rqO_2("overworld"));
   public static final rqM_2<rKW> protected_ = rqM_2.class_(rVL.u, new rqO_2("amplified"));
   public static final rqM_2<rKW> throws_ = rqM_2.class_(rVL.u, new rqO_2("nether"));
   public static final rqM_2<rKW> case_ = rqM_2.class_(rVL.u, new rqO_2("end"));
   public static final rqM_2<rKW> catch_ = rqM_2.class_(rVL.u, new rqO_2("caves"));
   public static final rqM_2<rKW> private_ = rqM_2.class_(rVL.u, new rqO_2("floating_islands"));
   private static final rKW new_ = class_(byte_, class_(new rrSq_1(true), false, byte_.class_()));

   public xc_3 byte_() {
      return this.extends_;
   }

   private rKW(rrSq_1 var1, rrST var2, xc_3 var3, xc_3 var4, int var5, int var6, int var7, boolean var8) {
      this.implements_ = var1;
      this.finally_ = var2;
      this.extends_ = var3;
      this.native_ = var4;
      this.volatile_ = var5;
      this.final_ = var6;
      this.package_ = var7;
      this.int_ = var8;
   }

   static {
      class_(protected_, class_(new rrSq_1(true), true, protected_.class_()));
      class_(throws_, class_(new rrSq_1(false), xu_3.PR.continue_(), xu_3.instanceof_.continue_(), throws_.class_()));
      class_(case_, class_(new rrSq_1(false), xu_3.Sh.continue_(), xu_3.class_.continue_(), case_.class_(), true, true));
      class_(catch_, class_(new rrSq_1(true), xu_3.break_.continue_(), xu_3.try_.continue_(), catch_.class_()));
      class_(private_, class_(new rrSq_1(true), xu_3.break_.continue_(), xu_3.try_.continue_(), private_.class_(), false, false));
   }

   private static rKW class_(rrSq_1 var0, xc_3 var1, xc_3 var2, rqO_2 var3) {
      HashMap var4 = Maps.newHashMap(rrSq_1.break_);
      var4.put(rrrZ.private_, new rrSI(25, 10, 34222645));
      return new rKW(
         new rrSq_1(Optional.ofNullable(var0.break_()), var4),
         new rrST(128, new rrSt_1(1.0, 3.0, 80.0, 60.0), new rrSw_1(120, 3, 0), new rrSw_1(320, 4, -1), 1, 2, 0.0, 0.019921875, false, false, false, false),
         var1,
         var2,
         0,
         0,
         32,
         false
      );
   }

   private static rKW class_(rrSq_1 var0, xc_3 var1, xc_3 var2, rqO_2 var3, boolean var4, boolean var5) {
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

   public rrSq_1 class_() {
      return this.implements_;
   }

   public boolean class_(rqM_2<rKW> var1) {
      return Objects.equals(this, rVy_1.finally_.class_(var1));
   }

   private static rKW class_(rqM_2<rKW> var0, rKW var1) {
      rVy_1.class_(rVy_1.finally_, var0.class_(), var1);
      return var1;
   }

   private static rKW class_(rrSq_1 var0, boolean var1, rqO_2 var2) {
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
         xu_3.break_.continue_(),
         xu_3.try_.continue_(),
         -10,
         0,
         63,
         false
      );
   }

   public rrST break_() {
      return this.finally_;
   }

   public int throws_() {
      return this.volatile_;
   }

   public int catch_() {
      return this.package_;
   }

   public int case_() {
      return this.final_;
   }

   public static rKW implements_() {
      return new_;
   }

   public xc_3 protected_() {
      return this.native_;
   }

   @Deprecated
   protected boolean private_() {
      return this.int_;
   }
}
