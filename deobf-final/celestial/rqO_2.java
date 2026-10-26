package celestial;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import org.apache.commons.lang3.StringUtils;

public class rqO_2 implements Comparable<rqO_2> {
   public static final Codec<rqO_2> class_ = Codec.STRING.comapFlatMap(rqO_2::class_, rqO_2::toString).stable();
   private static final SimpleCommandExceptionType protected_ = new SimpleCommandExceptionType(new rgn_3("argument.id.invalid"));
   protected final String break_;
   protected final String byte_;

   private static boolean byte_(char var0) {
      return var0 == '_' || var0 == '-' || var0 >= 'a' && var0 <= 'z' || var0 >= '0' && var0 <= '9' || var0 == '.';
   }

   public String byte_() {
      return this.break_;
   }

   public static boolean byte_(String var0) {
      String[] var1 = break_(var0, ':');
      return throws_(StringUtils.isEmpty(var1[0]) ? "minecraft" : var1[0]) && protected_(var1[1]);
   }

   protected rqO_2(String[] var1) {
      this.break_ = StringUtils.isEmpty(var1[0]) ? "minecraft" : var1[0];
      this.byte_ = var1[1];
      if (this.byte_.equals("DUMMY")) {
         if (!throws_(this.break_)) {
            throw new rqX_2("Non [a-z0-9_.-] character in namespace of location: " + this.break_ + ":" + this.byte_);
         }

         if (!protected_(this.byte_)) {
            throw new rqX_2("Non [a-z0-9/._-] character in path of location: " + this.break_ + ":" + this.byte_);
         }
      }
   }

   public rqO_2(String var1, String var2) {
      this(new String[]{var1, var2});
   }

   public rqO_2(String var1) {
      this(break_(var1, ':'));
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof rqO_2 var2) ? false : this.break_.equals(var2.break_) && this.byte_.equals(var2.byte_);
      }
   }

   @Override
   public String toString() {
      return this.break_ + ":" + this.byte_;
   }

   @Override
   public int hashCode() {
      return 31 * this.break_.hashCode() + this.byte_.hashCode();
   }

   public static rqO_2 class_(StringReader var0) throws CommandSyntaxException {
      int var1 = var0.getCursor();

      while (var0.canRead() && class_(var0.peek())) {
         var0.skip();
      }

      String var2 = var0.getString().substring(var1, var0.getCursor());

      try {
         return new rqO_2(var2);
      } catch (rqX_2 var4) {
         var0.setCursor(var1);
         throw protected_.createWithContext(var0);
      }
   }

   public static boolean class_(char var0) {
      return var0 >= '0' && var0 <= '9' || var0 >= 'a' && var0 <= 'z' || var0 == '_' || var0 == ':' || var0 == '/' || var0 == '.' || var0 == '-';
   }

   public static rqO_2 class_(String var0, char var1) {
      return new rqO_2(break_(var0, var1));
   }

   private static DataResult<rqO_2> class_(String var0) {
      try {
         return DataResult.success(new rqO_2(var0));
      } catch (rqX_2 var2) {
         return DataResult.error("Not a valid resource location: " + var0 + " " + var2.getMessage());
      }
   }

   public int class_(rqO_2 var1) {
      int var2 = this.byte_.compareTo(var1.byte_);
      if (var2 == 0) {
         var2 = this.break_.compareTo(var1.break_);
      }

      return var2;
   }

   public int break_(rqO_2 var1) {
      int var2 = this.break_.compareTo(var1.break_);
      return var2 != 0 ? var2 : this.byte_.compareTo(var1.byte_);
   }

   public static rqO_2 break_(String var0) {
      try {
         return new rqO_2(var0);
      } catch (rqX_2 var2) {
         return null;
      }
   }

   protected static String[] break_(String var0, char var1) {
      String[] var2 = new String[]{"minecraft", var0};
      int var3 = var0.indexOf(var1);
      if (var3 >= 0) {
         var2[1] = var0.substring(var3 + 1, var0.length());
         if (var3 >= 1) {
            var2[0] = var0.substring(0, var3);
         }
      }

      return var2;
   }

   public String break_() {
      return this.byte_;
   }

   public static boolean break_(char var0) {
      return var0 == '_' || var0 == '-' || var0 >= 'a' && var0 <= 'z' || var0 >= '0' && var0 <= '9' || var0 == '/' || var0 == '.';
   }

   private static boolean throws_(String var0) {
      for (int var1 = 0; var1 < var0.length(); var1++) {
         if (!byte_(var0.charAt(var1))) {
            return false;
         }
      }

      return true;
   }

   private static boolean protected_(String var0) {
      for (int var1 = 0; var1 < var0.length(); var1++) {
         if (!break_(var0.charAt(var1))) {
            return false;
         }
      }

      return true;
   }
}
