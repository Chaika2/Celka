package celestial;

import com.google.gson.JsonElement;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.function.Function;

public class XF extends Xu_1<Integer> {
   public static final XF id_throws = new XF((Integer)null, (Integer)null);
   private final Long id_case;
   private final Long id_catch;

   public boolean id_byte(int var1) {
      return this.id_byte != null && this.id_byte > var1 ? false : this.id_protected == null || this.id_protected >= var1;
   }

   private XF(Integer var1, Integer var2) {
      super(var1, var2);
      this.id_case = id_class(var1);
      this.id_catch = id_class(var2);
   }

   public static XF id_class(JsonElement var0) {
      return id_class(var0, id_throws, rpY_2::id_case, XF::new);
   }

   public static XF id_class(StringReader var0) throws CommandSyntaxException {
      return id_class(var0, var0x -> var0x);
   }

   public static XF id_class(StringReader var0, Function<Integer, Integer> var1) throws CommandSyntaxException {
      return id_class(var0, XF::id_class, Integer::parseInt, CommandSyntaxException.BUILT_IN_EXCEPTIONS::readerInvalidInt, var1);
   }

   private static XF id_class(StringReader var0, Integer var1, Integer var2) throws CommandSyntaxException {
      if (var1 != null && var2 != null && var1 > var2) {
         throw id_break.createWithContext(var0);
      } else {
         return new XF(var1, var2);
      }
   }

   public static XF id_class(int var0) {
      return new XF(var0, var0);
   }

   private static Long id_class(Integer var0) {
      return var0 == null ? null : var0.longValue() * var0.longValue();
   }

   public static XF id_break(int var0) {
      return new XF(var0, (Integer)null);
   }
}
