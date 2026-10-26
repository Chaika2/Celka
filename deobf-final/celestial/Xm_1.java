package celestial;

import com.google.gson.JsonElement;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.function.Function;

public class Xm_1 extends Xu_1<Float> {
   public static final Xm_1 throws_ = new Xm_1((Float)null, (Float)null);
   private final Double case_;
   private final Double catch_;

   private Xm_1(Float var1, Float var2) {
      super(var1, var2);
      this.case_ = class_(var1);
      this.catch_ = class_(var2);
   }

   public static Xm_1 class_(JsonElement var0) {
      return class_(var0, throws_, rpY_2::protected_, Xm_1::new);
   }

   public static Xm_1 class_(StringReader var0) throws CommandSyntaxException {
      return class_(var0, var0x -> var0x);
   }

   public static Xm_1 class_(StringReader var0, Function<Float, Float> var1) throws CommandSyntaxException {
      return class_(var0, Xm_1::class_, Float::parseFloat, CommandSyntaxException.BUILT_IN_EXCEPTIONS::readerInvalidFloat, var1);
   }

   private static Xm_1 class_(StringReader var0, Float var1, Float var2) throws CommandSyntaxException {
      if (var1 != null && var2 != null && var1 > var2) {
         throw break_.createWithContext(var0);
      } else {
         return new Xm_1(var1, var2);
      }
   }

   private static Double class_(Float var0) {
      return var0 == null ? null : var0.doubleValue() * var0.doubleValue();
   }

   public static Xm_1 class_(float var0) {
      return new Xm_1(var0, (Float)null);
   }

   public boolean class_(double var1) {
      return this.case_ != null && this.case_ > var1 ? false : this.catch_ == null || !(this.catch_ < var1);
   }

   public boolean break_(float var1) {
      return this.byte_ != null && this.byte_ > var1 ? false : this.protected_ == null || !(this.protected_ < var1);
   }
}
