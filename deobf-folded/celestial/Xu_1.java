package celestial;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public abstract class Xu_1<T extends Number> {
   public static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType(new rgn_3("argument.range.empty"));
   public static final SimpleCommandExceptionType id_break = new SimpleCommandExceptionType(new rgn_3("argument.range.swapped"));
   protected final T id_byte;
   protected final T id_protected;

   public boolean id_byte() {
      return this.id_byte == null && this.id_protected == null;
   }

   protected Xu_1(T var1, T var2) {
      this.id_byte = (T)var1;
      this.id_protected = (T)var2;
   }

   protected static <T extends Number, R extends Xu_1<T>> R id_class(
      StringReader var0, Xv_1<T, R> var1, Function<String, T> var2, Supplier<DynamicCommandExceptionType> var3, Function<T, T> var4
   ) throws CommandSyntaxException {
      if (!var0.canRead()) {
         throw id_class.createWithContext(var0);
      } else {
         int var5 = var0.getCursor();

         try {
            Number var6 = id_class(id_class(var0, var2, var3), var4);
            Number var7;
            if (var0.canRead(2) && var0.peek() == '.' && var0.peek(1) == '.') {
               var0.skip();
               var0.skip();
               var7 = id_class(id_class(var0, var2, var3), var4);
               if (var6 == null && var7 == null) {
                  throw id_class.createWithContext(var0);
               }
            } else {
               var7 = var6;
            }

            if (var6 == null && var7 == null) {
               throw id_class.createWithContext(var0);
            } else {
               return (R)var1.create(var0, var6, var7);
            }
         } catch (CommandSyntaxException var8) {
            var0.setCursor(var5);
            throw new CommandSyntaxException(var8.getType(), var8.getRawMessage(), var8.getInput(), var5);
         }
      }
   }

   protected static <T extends Number, R extends Xu_1<T>> R id_class(JsonElement var0, R var1, BiFunction<JsonElement, String, T> var2, XZ<T, R> var3) {
      if (var0 == null || var0.isJsonNull()) {
         return (R)var1;
      } else if (rpY_2.id_break(var0)) {
         Number var7 = (Number)var2.apply(var0, "value");
         return (R)var3.create(var7, var7);
      } else {
         JsonObject var4 = rpY_2.id_private(var0, "value");
         Number var5 = var4.has("min") ? (Number)var2.apply(var4.get("min"), "min") : null;
         Number var6 = var4.has("max") ? (Number)var2.apply(var4.get("max"), "max") : null;
         return (R)var3.create(var5, var6);
      }
   }

   private static boolean id_class(StringReader var0) {
      char var1 = var0.peek();
      if ((var1 < '0' || var1 > '9') && var1 != '-') {
         return var1 != '.' ? false : !var0.canRead(2) || var0.peek(1) != '.';
      } else {
         return true;
      }
   }

   private static <T> T id_class(T var0, Function<T, T> var1) {
      return (T)(var0 == null ? null : var1.apply(var0));
   }

   private static <T extends Number> T id_class(StringReader var0, Function<String, T> var1, Supplier<DynamicCommandExceptionType> var2) throws CommandSyntaxException {
      int var3 = var0.getCursor();

      while (var0.canRead() && id_class(var0)) {
         var0.skip();
      }

      String var4 = var0.getString().substring(var3, var0.getCursor());
      if (var4.isEmpty()) {
         return null;
      } else {
         try {
            return (T)var1.apply(var4);
         } catch (NumberFormatException var6) {
            throw ((DynamicCommandExceptionType)var2.get()).createWithContext(var0, var4);
         }
      }
   }

   public T id_class() {
      return this.id_byte;
   }

   public T id_break() {
      return this.id_protected;
   }

   public JsonElement id_protected() {
      if (this.id_byte()) {
         return JsonNull.INSTANCE;
      } else if (this.id_byte != null && this.id_byte.equals(this.id_protected)) {
         return new JsonPrimitive(this.id_byte);
      } else {
         JsonObject var1 = new JsonObject();
         if (this.id_byte != null) {
            var1.addProperty("min", this.id_byte);
         }

         if (this.id_protected != null) {
            var1.addProperty("max", this.id_protected);
         }

         return var1;
      }
   }
}
