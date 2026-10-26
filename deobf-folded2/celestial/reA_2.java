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
   private static final Codec<Either<rqO_2, rrPl_1>> id_class = Codec.of(reA_2::id_class, rqO_2.id_class.map(Either::left));
   public static final Codec<reA_2> id_break = RecordCodecBuilder.create(var0 -> var0.group(id_catch(), id_case(), id_break()).apply(var0, reA_2::new));
   protected final Either<rqO_2, rrPl_1> id_protected;
   protected final Supplier<rrPn_1> id_throws;

   protected reA_2(Either<rqO_2, rrPl_1> var1, Supplier<rrPn_1> var2, rem_3 var3) {
      super(var3);
      this.id_protected = var1;
      this.id_throws = var2;
   }

   public reA_2(rrPl_1 var1) {
      this(Either.right(var1), () -> rrPu_1.id_class, rem_3.RIGID);
   }

   @Override
   public String toString() {
      return "Single[" + this.id_protected + "]";
   }

   protected rrPN id_class(rqd_3 var1, rfi_3 var2, boolean var3) {
      rrPN var4 = new rrPN();
      var4.id_class(var2);
      var4.id_class(var1);
      var4.id_break(true);
      var4.id_class(false);
      var4.id_class(rrPG.id_break);
      var4.id_byte(true);
      if (!var3) {
         var4.id_class(rrPk_1.id_break);
      }

      this.id_throws.get().id_class().forEach(var4::id_class);
      this.id_byte().id_byte().forEach(var4::id_class);
      return var4;
   }

   @Override
   public red_3<?> id_class() {
      return red_3.id_class;
   }

   @Override
   public boolean id_class(rrPt_1 var1, rRI var2, rrrA var3, rKd_1 var4, rfH_2 var5, rfH_2 var6, rqd_3 var7, rfi_3 var8, Random var9, boolean var10) {
      rrPl_1 var11 = this.id_class(var1);
      rrPN var12 = this.id_class(var7, var8, var10);
      if (!var11.id_class(var2, var5, var6, var12, var9, 18)) {
         return false;
      } else {
         for (rrPp_1 var14 : rrPl_1.id_class(var2, var5, var6, var12, this.id_class(var1, var5, var7, false))) {
            this.id_class(var2, var14, var5, var7, var9, var8);
         }

         return true;
      }
   }

   private static <T> DataResult<T> id_class(Either<rqO_2, rrPl_1> var0, DynamicOps<T> var1, T var2) {
      Optional var3 = var0.left();
      return !var3.isPresent() ? DataResult.error("Can not serialize a runtime pool element") : rqO_2.id_class.encode((rqO_2)var3.get(), var1, var2);
   }

   private rrPl_1 id_class(rrPt_1 var1) {
      return (rrPl_1)this.id_protected.map(var1::id_class, Function.identity());
   }

   public List<rrPp_1> id_class(rrPt_1 var1, rfH_2 var2, rqd_3 var3, boolean var4) {
      rrPl_1 var5 = this.id_class(var1);
      List var6 = var5.id_class(var2, new rrPN().id_class(var3), xu_3.Js, var4);
      ArrayList var7 = Lists.newArrayList();

      for (rrPp_1 var9 : var6) {
         if (var9.id_byte != null) {
            rCD var10 = rCD.valueOf(var9.id_byte.id_native("mode"));
            if (var10 == rCD.DATA) {
               var7.add(var9);
            }
         }
      }

      return var7;
   }

   @Override
   public List<rrPp_1> id_class(rrPt_1 var1, rfH_2 var2, rqd_3 var3, Random var4) {
      rrPl_1 var5 = this.id_class(var1);
      List var6 = var5.id_class(var2, new rrPN().id_class(var3), xu_3.JE, true);
      Collections.shuffle(var6, var4);
      return var6;
   }

   @Override
   public rfi_3 id_class(rrPt_1 var1, rfH_2 var2, rqd_3 var3) {
      rrPl_1 var4 = this.id_class(var1);
      return var4.id_break(new rrPN().id_class(var3), var2);
   }

   protected static <E extends reA_2> RecordCodecBuilder<E, Either<rqO_2, rrPl_1>> id_catch() {
      return id_class.fieldOf("location").forGetter(var0 -> var0.id_protected);
   }

   protected static <E extends reA_2> RecordCodecBuilder<E, Supplier<rrPn_1>> id_case() {
      return rrPx_1.id_volatile.fieldOf("processors").forGetter(var0 -> var0.id_throws);
   }
}
