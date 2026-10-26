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
   public static final SimpleCommandExceptionType class_ = new SimpleCommandExceptionType(new rgn_3("argument.nbt.trailing"));
   public static final SimpleCommandExceptionType break_ = new SimpleCommandExceptionType(new rgn_3("argument.nbt.expected.key"));
   public static final SimpleCommandExceptionType byte_ = new SimpleCommandExceptionType(new rgn_3("argument.nbt.expected.value"));
   public static final Dynamic2CommandExceptionType protected_ = new Dynamic2CommandExceptionType(
      (var0, var1) -> new rgn_3("argument.nbt.list.mixed", var0, var1)
   );
   public static final Dynamic2CommandExceptionType throws_ = new Dynamic2CommandExceptionType(
      (var0, var1) -> new rgn_3("argument.nbt.array.mixed", var0, var1)
   );
   public static final DynamicCommandExceptionType case_ = new DynamicCommandExceptionType(var0 -> new rgn_3("argument.nbt.array.invalid", var0));
   private static final Pattern catch_ = Pattern.compile("[-+]?(?:[0-9]+[.]|[0-9]*[.][0-9]+)(?:e[-+]?[0-9]+)?", 2);
   private static final Pattern private_ = Pattern.compile("[-+]?(?:[0-9]+[.]?|[0-9]*[.][0-9]+)(?:e[-+]?[0-9]+)?d", 2);
   private static final Pattern implements_ = Pattern.compile("[-+]?(?:[0-9]+[.]?|[0-9]*[.][0-9]+)(?:e[-+]?[0-9]+)?f", 2);
   private static final Pattern finally_ = Pattern.compile("[-+]?(?:0|[1-9][0-9]*)b", 2);
   private static final Pattern extends_ = Pattern.compile("[-+]?(?:0|[1-9][0-9]*)l", 2);
   private static final Pattern native_ = Pattern.compile("[-+]?(?:0|[1-9][0-9]*)s", 2);
   private static final Pattern volatile_ = Pattern.compile("[-+]?(?:0|[1-9][0-9]*)");
   private final StringReader final_;

   protected rcZ_2 byte_() throws CommandSyntaxException {
      this.final_.skipWhitespace();
      int var1 = this.final_.getCursor();
      if (StringReader.isQuotedStringStart(this.final_.peek())) {
         return rca_3.class_(this.final_.readQuotedString());
      } else {
         String var2 = this.final_.readUnquotedString();
         if (var2.isEmpty()) {
            this.final_.setCursor(var1);
            throw byte_.createWithContext(this.final_);
         } else {
            return this.break_(var2);
         }
      }
   }

   public rcH_2(StringReader var1) {
      this.final_ = var1;
   }

   public static rcd_3 class_(String var0) throws CommandSyntaxException {
      return new rcH_2(new StringReader(var0)).class_();
   }

   private <T extends Number> List<T> class_(rcv_3<?> var1, rcv_3<?> var2) throws CommandSyntaxException {
      ArrayList var3 = Lists.newArrayList();

      while (this.final_.peek() != ']') {
         int var4 = this.final_.getCursor();
         rcZ_2 var5 = this.protected_();
         rcv_3 var6 = var5.break_();
         if (var6 != var2) {
            this.final_.setCursor(var4);
            throw throws_.createWithContext(this.final_, var6.break_(), var1.break_());
         }

         if (var2 == rch_3.class_) {
            var3.add(((rcK_2)var5).private_());
         } else if (var2 == rct_3.class_) {
            var3.add(((rcK_2)var5).throws_());
         } else {
            var3.add(((rcK_2)var5).case_());
         }

         if (!this.implements_()) {
            break;
         }

         if (!this.final_.canRead()) {
            throw byte_.createWithContext(this.final_);
         }
      }

      this.class_(']');
      return var3;
   }

   private void class_(char var1) throws CommandSyntaxException {
      this.final_.skipWhitespace();
      this.final_.expect(var1);
   }

   rcd_3 class_() throws CommandSyntaxException {
      rcd_3 var1 = this.case_();
      this.final_.skipWhitespace();
      if (this.final_.canRead()) {
         throw class_.createWithContext(this.final_);
      } else {
         return var1;
      }
   }

   protected String break_() throws CommandSyntaxException {
      this.final_.skipWhitespace();
      if (!this.final_.canRead()) {
         throw break_.createWithContext(this.final_);
      } else {
         return this.final_.readString();
      }
   }

   private rcZ_2 break_(String var1) {
      try {
         if (implements_.matcher(var1).matches()) {
            return rcu_3.class_(Float.parseFloat(var1.substring(0, var1.length() - 1)));
         }

         if (finally_.matcher(var1).matches()) {
            return rch_3.class_(Byte.parseByte(var1.substring(0, var1.length() - 1)));
         }

         if (extends_.matcher(var1).matches()) {
            return rct_3.class_(Long.parseLong(var1.substring(0, var1.length() - 1)));
         }

         if (native_.matcher(var1).matches()) {
            return rcD_2.class_(Short.parseShort(var1.substring(0, var1.length() - 1)));
         }

         if (volatile_.matcher(var1).matches()) {
            return rcn_3.class_(Integer.parseInt(var1));
         }

         if (private_.matcher(var1).matches()) {
            return rcz_3.class_(Double.parseDouble(var1.substring(0, var1.length() - 1)));
         }

         if (catch_.matcher(var1).matches()) {
            return rcz_3.class_(Double.parseDouble(var1));
         }

         if ("true".equalsIgnoreCase(var1)) {
            return rch_3.byte_;
         }

         if ("false".equalsIgnoreCase(var1)) {
            return rch_3.break_;
         }
      } catch (NumberFormatException var3) {
      }

      return rca_3.class_(var1);
   }

   protected rcZ_2 throws_() throws CommandSyntaxException {
      return this.final_.canRead(3) && !StringReader.isQuotedStringStart(this.final_.peek(1)) && this.final_.peek(2) == ';' ? this.private_() : this.catch_();
   }

   private rcZ_2 catch_() throws CommandSyntaxException {
      this.class_('[');
      this.final_.skipWhitespace();
      if (!this.final_.canRead()) {
         throw byte_.createWithContext(this.final_);
      } else {
         rcy_3 var1 = new rcy_3();
         rcv_3 var2 = null;

         while (this.final_.peek() != ']') {
            int var3 = this.final_.getCursor();
            rcZ_2 var4 = this.protected_();
            rcv_3 var5 = var4.break_();
            if (var2 == null) {
               var2 = var5;
            } else if (var5 != var2) {
               this.final_.setCursor(var3);
               throw protected_.createWithContext(this.final_, var5.break_(), var2.break_());
            }

            var1.add(var4);
            if (!this.implements_()) {
               break;
            }

            if (!this.final_.canRead()) {
               throw byte_.createWithContext(this.final_);
            }
         }

         this.class_(']');
         return var1;
      }
   }

   public rcd_3 case_() throws CommandSyntaxException {
      this.class_('{');
      rcd_3 var1 = new rcd_3();
      this.final_.skipWhitespace();

      while (this.final_.canRead() && this.final_.peek() != '}') {
         int var2 = this.final_.getCursor();
         String var3 = this.break_();
         if (var3.isEmpty()) {
            this.final_.setCursor(var2);
            throw break_.createWithContext(this.final_);
         }

         this.class_(':');
         var1.class_(var3, this.protected_());
         if (!this.implements_()) {
            break;
         }

         if (!this.final_.canRead()) {
            throw break_.createWithContext(this.final_);
         }
      }

      this.class_('}');
      return var1;
   }

   private boolean implements_() {
      this.final_.skipWhitespace();
      if (this.final_.canRead() && this.final_.peek() == ',') {
         this.final_.skip();
         this.final_.skipWhitespace();
         return true;
      } else {
         return false;
      }
   }

   public rcZ_2 protected_() throws CommandSyntaxException {
      this.final_.skipWhitespace();
      if (!this.final_.canRead()) {
         throw byte_.createWithContext(this.final_);
      } else {
         char var1 = this.final_.peek();
         if (var1 == '{') {
            return this.case_();
         } else {
            return var1 == '[' ? this.throws_() : this.byte_();
         }
      }
   }

   private rcZ_2 private_() throws CommandSyntaxException {
      this.class_('[');
      int var1 = this.final_.getCursor();
      char var2 = this.final_.read();
      this.final_.read();
      this.final_.skipWhitespace();
      if (!this.final_.canRead()) {
         throw byte_.createWithContext(this.final_);
      } else if (var2 == 'B') {
         return new rcM_2(this.class_(rcM_2.class_, rch_3.class_));
      } else if (var2 == 'L') {
         return new rcq_3(this.class_(rcq_3.class_, rct_3.class_));
      } else if (var2 == 'I') {
         return new rcL_2(this.class_(rcL_2.class_, rcn_3.class_));
      } else {
         this.final_.setCursor(var1);
         throw case_.createWithContext(this.final_, String.valueOf(var2));
      }
   }
}
