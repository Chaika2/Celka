package celestial;

import com.google.gson.JsonElement;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.function.Function;

public class Xm_1 extends Xu_1<Float> {
   public static final Xm_1 id_throws = new Xm_1((Float)null, (Float)null);
   private final Double id_case;
   private final Double id_catch;

   private Xm_1(Float var1, Float var2) {
      super(var1, var2);
      this.id_case = id_class(var1);
      this.id_catch = id_class(var2);
   }

   public static Xm_1 id_class(JsonElement var0) {
      return id_class(var0, id_throws, rpY_2::id_protected, Xm_1::new);
   }

   public static Xm_1 id_class(StringReader var0) throws CommandSyntaxException {
      return id_class(var0, var0x -> var0x);
   }

   public static Xm_1 id_class(StringReader var0, Function<Float, Float> var1) throws CommandSyntaxException {
      return id_class(var0, Xm_1::id_class, Float::parseFloat, CommandSyntaxException.BUILT_IN_EXCEPTIONS::readerInvalidFloat, var1);
   }

   private static Xm_1 id_class(StringReader var0, Float var1, Float var2) throws CommandSyntaxException {
      if (var1 != null && var2 != null && var1 > var2) {
         throw id_break.createWithContext(var0);
      } else {
         return new Xm_1(var1, var2);
      }
   }

   private static Double id_class(Float var0) {
      return var0 == null ? null : var0.doubleValue() * var0.doubleValue();
   }

   public static Xm_1 id_class(float var0) {
      return new Xm_1(var0, (Float)null);
   }

   public boolean id_class(double var1) {
      return this.id_case != null && this.id_case > var1 ? false : this.id_catch == null || !(this.id_catch < var1);
   }

   public boolean id_break(float var1) {
      return this.id_byte != null && this.id_byte > var1 ? false : this.id_protected == null || !(this.id_protected < var1);
   }
}
