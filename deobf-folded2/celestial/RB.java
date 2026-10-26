package celestial;

import com.mojang.brigadier.exceptions.BuiltInExceptionProvider;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class RB implements BuiltInExceptionProvider {
   private static final Dynamic2CommandExceptionType id_class = new Dynamic2CommandExceptionType((var0, var1) -> new rgn_3("argument.double.low", var1, var0));
   private static final Dynamic2CommandExceptionType id_break = new Dynamic2CommandExceptionType((var0, var1) -> new rgn_3("argument.double.big", var1, var0));
   private static final Dynamic2CommandExceptionType id_byte = new Dynamic2CommandExceptionType((var0, var1) -> new rgn_3("argument.float.low", var1, var0));
   private static final Dynamic2CommandExceptionType id_protected = new Dynamic2CommandExceptionType(
      (var0, var1) -> new rgn_3("argument.float.big", var1, var0)
   );
   private static final Dynamic2CommandExceptionType id_throws = new Dynamic2CommandExceptionType((var0, var1) -> new rgn_3("argument.integer.low", var1, var0));
   private static final Dynamic2CommandExceptionType id_case = new Dynamic2CommandExceptionType((var0, var1) -> new rgn_3("argument.integer.big", var1, var0));
   private static final Dynamic2CommandExceptionType id_catch = new Dynamic2CommandExceptionType((var0, var1) -> new rgn_3("argument.long.low", var1, var0));
   private static final Dynamic2CommandExceptionType id_private = new Dynamic2CommandExceptionType((var0, var1) -> new rgn_3("argument.long.big", var1, var0));
   private static final DynamicCommandExceptionType id_implements = new DynamicCommandExceptionType(var0 -> new rgn_3("argument.literal.incorrect", var0));
   private static final SimpleCommandExceptionType id_finally = new SimpleCommandExceptionType(new rgn_3("parsing.quote.expected.start"));
   private static final SimpleCommandExceptionType id_extends = new SimpleCommandExceptionType(new rgn_3("parsing.quote.expected.end"));
   private static final DynamicCommandExceptionType id_native = new DynamicCommandExceptionType(var0 -> new rgn_3("parsing.quote.escape", var0));
   private static final DynamicCommandExceptionType id_volatile = new DynamicCommandExceptionType(var0 -> new rgn_3("parsing.bool.invalid", var0));
   private static final DynamicCommandExceptionType id_final = new DynamicCommandExceptionType(var0 -> new rgn_3("parsing.int.invalid", var0));
   private static final SimpleCommandExceptionType id_package = new SimpleCommandExceptionType(new rgn_3("parsing.int.expected"));
   private static final DynamicCommandExceptionType id_int = new DynamicCommandExceptionType(var0 -> new rgn_3("parsing.long.invalid", var0));
   private static final SimpleCommandExceptionType id_new = new SimpleCommandExceptionType(new rgn_3("parsing.long.expected"));
   private static final DynamicCommandExceptionType id_continue = new DynamicCommandExceptionType(var0 -> new rgn_3("parsing.double.invalid", var0));
   private static final SimpleCommandExceptionType id_super = new SimpleCommandExceptionType(new rgn_3("parsing.double.expected"));
   private static final DynamicCommandExceptionType id_this = new DynamicCommandExceptionType(var0 -> new rgn_3("parsing.float.invalid", var0));
   private static final SimpleCommandExceptionType id_else = new SimpleCommandExceptionType(new rgn_3("parsing.float.expected"));
   private static final SimpleCommandExceptionType id_synchronized = new SimpleCommandExceptionType(new rgn_3("parsing.bool.expected"));
   private static final DynamicCommandExceptionType id_return = new DynamicCommandExceptionType(var0 -> new rgn_3("parsing.expected", var0));
   private static final SimpleCommandExceptionType id_public = new SimpleCommandExceptionType(new rgn_3("command.unknown.command"));
   private static final SimpleCommandExceptionType id_goto = new SimpleCommandExceptionType(new rgn_3("command.unknown.argument"));
   private static final SimpleCommandExceptionType id_while = new SimpleCommandExceptionType(new rgn_3("command.expected.separator"));
   private static final DynamicCommandExceptionType id_try = new DynamicCommandExceptionType(var0 -> new rgn_3("command.exception", var0));

   public DynamicCommandExceptionType readerInvalidLong() {
      return id_int;
   }

   public SimpleCommandExceptionType readerExpectedLong() {
      return id_new;
   }

   public Dynamic2CommandExceptionType doubleTooHigh() {
      return id_break;
   }

   public Dynamic2CommandExceptionType floatTooHigh() {
      return id_protected;
   }

   public DynamicCommandExceptionType literalIncorrect() {
      return id_implements;
   }

   public Dynamic2CommandExceptionType longTooHigh() {
      return id_private;
   }

   public DynamicCommandExceptionType readerInvalidBool() {
      return id_volatile;
   }

   public Dynamic2CommandExceptionType integerTooLow() {
      return id_throws;
   }

   public Dynamic2CommandExceptionType integerTooHigh() {
      return id_case;
   }

   public SimpleCommandExceptionType readerExpectedInt() {
      return id_package;
   }

   public DynamicCommandExceptionType readerInvalidFloat() {
      return id_this;
   }

   public Dynamic2CommandExceptionType floatTooLow() {
      return id_byte;
   }

   public SimpleCommandExceptionType readerExpectedBool() {
      return id_synchronized;
   }

   public DynamicCommandExceptionType readerInvalidInt() {
      return id_final;
   }

   public Dynamic2CommandExceptionType doubleTooLow() {
      return id_class;
   }

   public Dynamic2CommandExceptionType longTooLow() {
      return id_catch;
   }

   public SimpleCommandExceptionType dispatcherExpectedArgumentSeparator() {
      return id_while;
   }

   public SimpleCommandExceptionType readerExpectedFloat() {
      return id_else;
   }

   public DynamicCommandExceptionType readerInvalidEscape() {
      return id_native;
   }

   public DynamicCommandExceptionType readerExpectedSymbol() {
      return id_return;
   }

   public SimpleCommandExceptionType readerExpectedStartOfQuote() {
      return id_finally;
   }

   public DynamicCommandExceptionType readerInvalidDouble() {
      return id_continue;
   }

   public SimpleCommandExceptionType dispatcherUnknownCommand() {
      return id_public;
   }

   public SimpleCommandExceptionType dispatcherUnknownArgument() {
      return id_goto;
   }

   public SimpleCommandExceptionType readerExpectedEndOfQuote() {
      return id_extends;
   }

   public DynamicCommandExceptionType dispatcherParseException() {
      return id_try;
   }

   public SimpleCommandExceptionType readerExpectedDouble() {
      return id_super;
   }
}
