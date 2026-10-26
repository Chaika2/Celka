package celestial;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import org.apache.commons.lang3.StringUtils;

public class rqO_2 implements Comparable<rqO_2> {
   public static final Codec<rqO_2> id_class = Codec.STRING.comapFlatMap(rqO_2::id_class, rqO_2::toString).stable();
   private static final SimpleCommandExceptionType id_protected = new SimpleCommandExceptionType(new rgn_3("argument.id.invalid"));
   protected final String id_break;
   protected final String id_byte;

   private static boolean id_byte(char var0) {
      return var0 == '_' || var0 == '-' || var0 >= 'a' && var0 <= 'z' || var0 >= '0' && var0 <= '9' || var0 == '.';
   }

   public String id_byte() {
      return this.id_break;
   }

   public static boolean id_byte(String var0) {
      String[] var1 = id_break(var0, ':');
      return id_throws(StringUtils.isEmpty(var1[0]) ? "minecraft" : var1[0]) && id_protected(var1[1]);
   }

   protected rqO_2(String[] var1) {
      this.id_break = StringUtils.isEmpty(var1[0]) ? "minecraft" : var1[0];
      this.id_byte = var1[1];
      if (this.id_byte.equals("DUMMY")) {
         if (!id_throws(this.id_break)) {
            throw new rqX_2("Non [a-z0-9_.-] character in namespace of location: " + this.id_break + ":" + this.id_byte);
         }

         if (!id_protected(this.id_byte)) {
            throw new rqX_2("Non [a-z0-9/._-] character in path of location: " + this.id_break + ":" + this.id_byte);
         }
      }
   }

   public rqO_2(String var1, String var2) {
      this(new String[]{var1, var2});
   }

   public rqO_2(String var1) {
      this(id_break(var1, ':'));
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof rqO_2 var2) ? false : this.id_break.equals(var2.id_break) && this.id_byte.equals(var2.id_byte);
      }
   }

   @Override
   public String toString() {
      return this.id_break + ":" + this.id_byte;
   }

   @Override
   public int hashCode() {
      return 31 * this.id_break.hashCode() + this.id_byte.hashCode();
   }

   public static rqO_2 id_class(StringReader var0) throws CommandSyntaxException {
      int var1 = var0.getCursor();

      while (var0.canRead() && id_class(var0.peek())) {
         var0.skip();
      }

      String var2 = var0.getString().substring(var1, var0.getCursor());

      try {
         return new rqO_2(var2);
      } catch (rqX_2 var4) {
         var0.setCursor(var1);
         throw id_protected.createWithContext(var0);
      }
   }

   public static boolean id_class(char var0) {
      return var0 >= '0' && var0 <= '9' || var0 >= 'a' && var0 <= 'z' || var0 == '_' || var0 == ':' || var0 == '/' || var0 == '.' || var0 == '-';
   }

   public static rqO_2 id_class(String var0, char var1) {
      return new rqO_2(id_break(var0, var1));
   }

   private static DataResult<rqO_2> id_class(String var0) {
      try {
         return DataResult.success(new rqO_2(var0));
      } catch (rqX_2 var2) {
         return DataResult.error("Not a valid resource location: " + var0 + " " + var2.getMessage());
      }
   }

   public int id_class(rqO_2 var1) {
      int var2 = this.id_byte.compareTo(var1.id_byte);
      if (var2 == 0) {
         var2 = this.id_break.compareTo(var1.id_break);
      }

      return var2;
   }

   public int id_break(rqO_2 var1) {
      int var2 = this.id_break.compareTo(var1.id_break);
      return var2 != 0 ? var2 : this.id_byte.compareTo(var1.id_byte);
   }

   public static rqO_2 id_break(String var0) {
      try {
         return new rqO_2(var0);
      } catch (rqX_2 var2) {
         return null;
      }
   }

   protected static String[] id_break(String var0, char var1) {
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

   public String id_break() {
      return this.id_byte;
   }

   public static boolean id_break(char var0) {
      return var0 == '_' || var0 == '-' || var0 >= 'a' && var0 <= 'z' || var0 >= '0' && var0 <= '9' || var0 == '/' || var0 == '.';
   }

   private static boolean id_throws(String var0) {
      for (int var1 = 0; var1 < var0.length(); var1++) {
         if (!id_byte(var0.charAt(var1))) {
            return false;
         }
      }

      return true;
   }

   private static boolean id_protected(String var0) {
      for (int var1 = 0; var1 < var0.length(); var1++) {
         if (!id_break(var0.charAt(var1))) {
            return false;
         }
      }

      return true;
   }
}
