package celestial;

import com.google.common.collect.Lists;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class rcH_2 {
   public static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType(new rgn_3("argument.nbt.trailing"));
   public static final SimpleCommandExceptionType id_break = new SimpleCommandExceptionType(new rgn_3("argument.nbt.expected.key"));
   public static final SimpleCommandExceptionType id_byte = new SimpleCommandExceptionType(new rgn_3("argument.nbt.expected.value"));
   public static final Dynamic2CommandExceptionType id_protected = new Dynamic2CommandExceptionType(
      (var0, var1) -> new rgn_3("argument.nbt.list.mixed", var0, var1)
   );
   public static final Dynamic2CommandExceptionType id_throws = new Dynamic2CommandExceptionType(
      (var0, var1) -> new rgn_3("argument.nbt.array.mixed", var0, var1)
   );
   public static final DynamicCommandExceptionType id_case = new DynamicCommandExceptionType(var0 -> new rgn_3("argument.nbt.array.invalid", var0));
   private static final Pattern id_catch = Pattern.compile("[-+]?(?:[0-9]+[.]|[0-9]*[.][0-9]+)(?:e[-+]?[0-9]+)?", 2);
   private static final Pattern id_private = Pattern.compile("[-+]?(?:[0-9]+[.]?|[0-9]*[.][0-9]+)(?:e[-+]?[0-9]+)?d", 2);
   private static final Pattern id_implements = Pattern.compile("[-+]?(?:[0-9]+[.]?|[0-9]*[.][0-9]+)(?:e[-+]?[0-9]+)?f", 2);
   private static final Pattern id_finally = Pattern.compile("[-+]?(?:0|[1-9][0-9]*)b", 2);
   private static final Pattern id_extends = Pattern.compile("[-+]?(?:0|[1-9][0-9]*)l", 2);
   private static final Pattern id_native = Pattern.compile("[-+]?(?:0|[1-9][0-9]*)s", 2);
   private static final Pattern id_volatile = Pattern.compile("[-+]?(?:0|[1-9][0-9]*)");
   private final StringReader id_final;

   protected rcZ_2 id_byte() throws CommandSyntaxException {
      this.id_final.skipWhitespace();
      int var1 = this.id_final.getCursor();
      if (StringReader.isQuotedStringStart(this.id_final.peek())) {
         return rca_3.id_class(this.id_final.readQuotedString());
      } else {
         String var2 = this.id_final.readUnquotedString();
         if (var2.isEmpty()) {
            this.id_final.setCursor(var1);
            throw id_byte.createWithContext(this.id_final);
         } else {
            return this.id_break(var2);
         }
      }
   }

   public rcH_2(StringReader var1) {
      this.id_final = var1;
   }

   public static rcd_3 id_class(String var0) throws CommandSyntaxException {
      return new rcH_2(new StringReader(var0)).id_class();
   }

   private <T extends Number> List<T> id_class(rcv_3<?> var1, rcv_3<?> var2) throws CommandSyntaxException {
      ArrayList var3 = Lists.newArrayList();

      while (this.id_final.peek() != ']') {
         int var4 = this.id_final.getCursor();
         rcZ_2 var5 = this.id_protected();
         rcv_3 var6 = var5.id_break();
         if (var6 != var2) {
            this.id_final.setCursor(var4);
            throw id_throws.createWithContext(this.id_final, var6.id_break(), var1.id_break());
         }

         if (var2 == rch_3.id_class) {
            var3.add(((rcK_2)var5).id_private());
         } else if (var2 == rct_3.id_class) {
            var3.add(((rcK_2)var5).id_throws());
         } else {
            var3.add(((rcK_2)var5).id_case());
         }

         if (!this.id_implements()) {
            break;
         }

         if (!this.id_final.canRead()) {
            throw id_byte.createWithContext(this.id_final);
         }
      }

      this.id_class(']');
      return var3;
   }

   private void id_class(char var1) throws CommandSyntaxException {
      this.id_final.skipWhitespace();
      this.id_final.expect(var1);
   }

   rcd_3 id_class() throws CommandSyntaxException {
      rcd_3 var1 = this.id_case();
      this.id_final.skipWhitespace();
      if (this.id_final.canRead()) {
         throw id_class.createWithContext(this.id_final);
      } else {
         return var1;
      }
   }

   protected String id_break() throws CommandSyntaxException {
      this.id_final.skipWhitespace();
      if (!this.id_final.canRead()) {
         throw id_break.createWithContext(this.id_final);
      } else {
         return this.id_final.readString();
      }
   }

   private rcZ_2 id_break(String var1) {
      try {
         if (id_implements.matcher(var1).matches()) {
            return rcu_3.id_class(Float.parseFloat(var1.substring(0, var1.length() - 1)));
         }

         if (id_finally.matcher(var1).matches()) {
            return rch_3.id_class(Byte.parseByte(var1.substring(0, var1.length() - 1)));
         }

         if (id_extends.matcher(var1).matches()) {
            return rct_3.id_class(Long.parseLong(var1.substring(0, var1.length() - 1)));
         }

         if (id_native.matcher(var1).matches()) {
            return rcD_2.id_class(Short.parseShort(var1.substring(0, var1.length() - 1)));
         }

         if (id_volatile.matcher(var1).matches()) {
            return rcn_3.id_class(Integer.parseInt(var1));
         }

         if (id_private.matcher(var1).matches()) {
            return rcz_3.id_class(Double.parseDouble(var1.substring(0, var1.length() - 1)));
         }

         if (id_catch.matcher(var1).matches()) {
            return rcz_3.id_class(Double.parseDouble(var1));
         }

         if ("true".equalsIgnoreCase(var1)) {
            return rch_3.id_byte;
         }

         if ("false".equalsIgnoreCase(var1)) {
            return rch_3.id_break;
         }
      } catch (NumberFormatException var3) {
      }

      return rca_3.id_class(var1);
   }

   protected rcZ_2 id_throws() throws CommandSyntaxException {
      return this.id_final.canRead(3) && !StringReader.isQuotedStringStart(this.id_final.peek(1)) && this.id_final.peek(2) == ';'
         ? this.id_private()
         : this.id_catch();
   }

   private rcZ_2 id_catch() throws CommandSyntaxException {
      this.id_class('[');
      this.id_final.skipWhitespace();
      if (!this.id_final.canRead()) {
         throw id_byte.createWithContext(this.id_final);
      } else {
         rcy_3 var1 = new rcy_3();
         rcv_3 var2 = null;

         while (this.id_final.peek() != ']') {
            int var3 = this.id_final.getCursor();
            rcZ_2 var4 = this.id_protected();
            rcv_3 var5 = var4.id_break();
            if (var2 == null) {
               var2 = var5;
            } else if (var5 != var2) {
               this.id_final.setCursor(var3);
               throw id_protected.createWithContext(this.id_final, var5.id_break(), var2.id_break());
            }

            var1.add(var4);
            if (!this.id_implements()) {
               break;
            }

            if (!this.id_final.canRead()) {
               throw id_byte.createWithContext(this.id_final);
            }
         }

         this.id_class(']');
         return var1;
      }
   }

   public rcd_3 id_case() throws CommandSyntaxException {
      this.id_class('{');
      rcd_3 var1 = new rcd_3();
      this.id_final.skipWhitespace();

      while (this.id_final.canRead() && this.id_final.peek() != '}') {
         int var2 = this.id_final.getCursor();
         String var3 = this.id_break();
         if (var3.isEmpty()) {
            this.id_final.setCursor(var2);
            throw id_break.createWithContext(this.id_final);
         }

         this.id_class(':');
         var1.id_class(var3, this.id_protected());
         if (!this.id_implements()) {
            break;
         }

         if (!this.id_final.canRead()) {
            throw id_break.createWithContext(this.id_final);
         }
      }

      this.id_class('}');
      return var1;
   }

   private boolean id_implements() {
      this.id_final.skipWhitespace();
      if (this.id_final.canRead() && this.id_final.peek() == ',') {
         this.id_final.skip();
         this.id_final.skipWhitespace();
         return true;
      } else {
         return false;
      }
   }

   public rcZ_2 id_protected() throws CommandSyntaxException {
      this.id_final.skipWhitespace();
      if (!this.id_final.canRead()) {
         throw id_byte.createWithContext(this.id_final);
      } else {
         char var1 = this.id_final.peek();
         if (var1 == '{') {
            return this.id_case();
         } else {
            return var1 == '[' ? this.id_throws() : this.id_byte();
         }
      }
   }

   private rcZ_2 id_private() throws CommandSyntaxException {
      this.id_class('[');
      int var1 = this.id_final.getCursor();
      char var2 = this.id_final.read();
      this.id_final.read();
      this.id_final.skipWhitespace();
      if (!this.id_final.canRead()) {
         throw id_byte.createWithContext(this.id_final);
      } else if (var2 == 'B') {
         return new rcM_2(this.id_class(rcM_2.id_class, rch_3.id_class));
      } else if (var2 == 'L') {
         return new rcq_3(this.id_class(rcq_3.id_class, rct_3.id_class));
      } else if (var2 == 'I') {
         return new rcL_2(this.id_class(rcL_2.id_class, rcn_3.id_class));
      } else {
         this.id_final.setCursor(var1);
         throw id_case.createWithContext(this.id_final, String.valueOf(var2));
      }
   }
}
