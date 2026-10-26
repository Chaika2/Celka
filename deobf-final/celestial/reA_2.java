package celestial;

import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;

public class reA_2 extends rev_3 {
   private static final Codec<Either<rqO_2, rrPl_1>> class_ = Codec.of(reA_2::class_, rqO_2.class_.map(Either::left));
   public static final Codec<reA_2> break_ = RecordCodecBuilder.create(var0 -> var0.group(catch_(), case_(), break_()).apply(var0, reA_2::new));
   protected final Either<rqO_2, rrPl_1> protected_;
   protected final Supplier<rrPn_1> throws_;

   protected reA_2(Either<rqO_2, rrPl_1> var1, Supplier<rrPn_1> var2, rem_3 var3) {
      super(var3);
      this.protected_ = var1;
      this.throws_ = var2;
   }

   public reA_2(rrPl_1 var1) {
      this(Either.right(var1), () -> rrPu_1.class_, rem_3.RIGID);
   }

   @Override
   public String toString() {
      return "Single[" + this.protected_ + "]";
   }

   protected rrPN class_(rqd_3 var1, rfi_3 var2, boolean var3) {
      rrPN var4 = new rrPN();
      var4.class_(var2);
      var4.class_(var1);
      var4.break_(true);
      var4.class_(false);
      var4.class_(rrPG.break_);
      var4.byte_(true);
      if (!var3) {
         var4.class_(rrPk_1.break_);
      }

      this.throws_.get().class_().forEach(var4::class_);
      this.byte_().byte_().forEach(var4::class_);
      return var4;
   }

   @Override
   public red_3<?> class_() {
      return red_3.class_;
   }

   @Override
   public boolean class_(rrPt_1 var1, rRI var2, rrrA var3, rKd_1 var4, rfH_2 var5, rfH_2 var6, rqd_3 var7, rfi_3 var8, Random var9, boolean var10) {
      rrPl_1 var11 = this.class_(var1);
      rrPN var12 = this.class_(var7, var8, var10);
      if (!var11.class_(var2, var5, var6, var12, var9, 18)) {
         return false;
      } else {
         for (rrPp_1 var14 : rrPl_1.class_(var2, var5, var6, var12, this.class_(var1, var5, var7, false))) {
            this.class_(var2, var14, var5, var7, var9, var8);
         }

         return true;
      }
   }

   private static <T> DataResult<T> class_(Either<rqO_2, rrPl_1> var0, DynamicOps<T> var1, T var2) {
      Optional var3 = var0.left();
      return !var3.isPresent() ? DataResult.error("Can not serialize a runtime pool element") : rqO_2.class_.encode((rqO_2)var3.get(), var1, var2);
   }

   private rrPl_1 class_(rrPt_1 var1) {
      return (rrPl_1)this.protected_.map(var1::class_, Function.identity());
   }

   public List<rrPp_1> class_(rrPt_1 var1, rfH_2 var2, rqd_3 var3, boolean var4) {
      rrPl_1 var5 = this.class_(var1);
      List var6 = var5.class_(var2, new rrPN().class_(var3), xu_3.Js, var4);
      ArrayList var7 = Lists.newArrayList();

      for (rrPp_1 var9 : var6) {
         if (var9.byte_ != null) {
            rCD var10 = rCD.valueOf(var9.byte_.native_("mode"));
            if (var10 == rCD.DATA) {
               var7.add(var9);
            }
         }
      }

      return var7;
   }

   @Override
   public List<rrPp_1> class_(rrPt_1 var1, rfH_2 var2, rqd_3 var3, Random var4) {
      rrPl_1 var5 = this.class_(var1);
      List var6 = var5.class_(var2, new rrPN().class_(var3), xu_3.JE, true);
      Collections.shuffle(var6, var4);
      return var6;
   }

   @Override
   public rfi_3 class_(rrPt_1 var1, rfH_2 var2, rqd_3 var3) {
      rrPl_1 var4 = this.class_(var1);
      return var4.break_(new rrPN().class_(var3), var2);
   }

   protected static <E extends reA_2> RecordCodecBuilder<E, Either<rqO_2, rrPl_1>> catch_() {
      return class_.fieldOf("location").forGetter(var0 -> var0.protected_);
   }

   protected static <E extends reA_2> RecordCodecBuilder<E, Supplier<rrPn_1>> case_() {
      return rrPx_1.volatile_.fieldOf("processors").forGetter(var0 -> var0.throws_);
   }
}
