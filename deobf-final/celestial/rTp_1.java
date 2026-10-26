package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.Arrays;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class rTp_1 extends DataFix {
   protected static final Logger class_ = LogManager.getLogger();
   protected TypeReference break_;

   protected static Optional<Dynamic<?>> byte_(Dynamic<?> var0, String var1, String var2) {
      String var3 = var1 + "Most";
      String var4 = var1 + "Least";
      return protected_(var0, var3, var4).map(var4x -> var0.remove(var3).remove(var4).set(var2, var4x));
   }

   public rTp_1(Schema var1, TypeReference var2) {
      super(var1, false);
      this.break_ = var2;
   }

   protected Typed<?> class_(Typed<?> var1, String var2, Function<Dynamic<?>, Dynamic<?>> var3) {
      Type var4 = this.getInputSchema().getChoiceType(this.break_, var2);
      Type var5 = this.getOutputSchema().getChoiceType(this.break_, var2);
      return var1.updateTyped(DSL.namedChoice(var2, var4), var5, var1x -> var1x.update(DSL.remainderFinder(), var3));
   }

   protected static Optional<Dynamic<?>> class_(Dynamic<?> var0, long var1, long var3) {
      return Optional.of(var0.createIntList(Arrays.stream(new int[]{(int)(var1 >> 32), (int)var1, (int)(var3 >> 32), (int)var3})));
   }

   protected static Optional<Dynamic<?>> class_(Dynamic<?> var0, String var1, String var2) {
      return class_(var0, var1).map(var3 -> var0.remove(var1).set(var2, var3));
   }

   protected static Optional<Dynamic<?>> class_(Dynamic<?> var0, String var1) {
      return var0.get(var1).result().flatMap(var1x -> {
         String var2 = var1x.asString((String)null);
         if (var2 != null) {
            try {
               UUID var3 = UUID.fromString(var2);
               return class_(var0, var3.getMostSignificantBits(), var3.getLeastSignificantBits());
            } catch (IllegalArgumentException var4) {
            }
         }

         return Optional.empty();
      });
   }

   protected static Optional<Dynamic<?>> class_(Dynamic<?> var0) {
      return protected_(var0, "M", "L");
   }

   protected static Optional<Dynamic<?>> break_(Dynamic<?> var0, String var1, String var2) {
      return var0.get(var1).result().flatMap(rTp_1::class_).map(var3 -> var0.remove(var1).set(var2, var3));
   }

   protected static Optional<Dynamic<?>> protected_(Dynamic<?> var0, String var1, String var2) {
      long var3 = var0.get(var1).asLong(0L);
      long var5 = var0.get(var2).asLong(0L);
      return var3 != 0L && var5 != 0L ? class_(var0, var3, var5) : Optional.empty();
   }
}
