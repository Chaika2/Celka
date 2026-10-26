package celestial;

import com.google.gson.JsonElement;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.function.Function;

public class XF extends Xu_1<Integer> {
   public static final XF throws_ = new XF((Integer)null, (Integer)null);
   private final Long case_;
   private final Long catch_;

   public boolean byte_(int var1) {
      return this.byte_ != null && this.byte_ > var1 ? false : this.protected_ == null || this.protected_ >= var1;
   }

   private XF(Integer var1, Integer var2) {
      super(var1, var2);
      this.case_ = class_(var1);
      this.catch_ = class_(var2);
   }

   public static XF class_(JsonElement var0) {
      return class_(var0, throws_, rpY_2::case_, XF::new);
   }

   public static XF class_(StringReader var0) throws CommandSyntaxException {
      return class_(var0, var0x -> var0x);
   }

   public static XF class_(StringReader var0, Function<Integer, Integer> var1) throws CommandSyntaxException {
      return class_(var0, XF::class_, Integer::parseInt, CommandSyntaxException.BUILT_IN_EXCEPTIONS::readerInvalidInt, var1);
   }

   private static XF class_(StringReader var0, Integer var1, Integer var2) throws CommandSyntaxException {
      if (var1 != null && var2 != null && var1 > var2) {
         throw break_.createWithContext(var0);
      } else {
         return new XF(var1, var2);
      }
   }

   public static XF class_(int var0) {
      return new XF(var0, var0);
   }

   private static Long class_(Integer var0) {
      return var0 == null ? null : var0.longValue() * var0.longValue();
   }

   public static XF break_(int var0) {
      return new XF(var0, (Integer)null);
   }
}
