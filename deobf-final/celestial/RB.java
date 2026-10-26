package celestial;

import com.mojang.brigadier.exceptions.BuiltInExceptionProvider;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class RB implements BuiltInExceptionProvider {
   private static final Dynamic2CommandExceptionType class_ = new Dynamic2CommandExceptionType((var0, var1) -> new rgn_3("argument.double.low", var1, var0));
   private static final Dynamic2CommandExceptionType break_ = new Dynamic2CommandExceptionType((var0, var1) -> new rgn_3("argument.double.big", var1, var0));
   private static final Dynamic2CommandExceptionType byte_ = new Dynamic2CommandExceptionType((var0, var1) -> new rgn_3("argument.float.low", var1, var0));
   private static final Dynamic2CommandExceptionType protected_ = new Dynamic2CommandExceptionType((var0, var1) -> new rgn_3("argument.float.big", var1, var0));
   private static final Dynamic2CommandExceptionType throws_ = new Dynamic2CommandExceptionType((var0, var1) -> new rgn_3("argument.integer.low", var1, var0));
   private static final Dynamic2CommandExceptionType case_ = new Dynamic2CommandExceptionType((var0, var1) -> new rgn_3("argument.integer.big", var1, var0));
   private static final Dynamic2CommandExceptionType catch_ = new Dynamic2CommandExceptionType((var0, var1) -> new rgn_3("argument.long.low", var1, var0));
   private static final Dynamic2CommandExceptionType private_ = new Dynamic2CommandExceptionType((var0, var1) -> new rgn_3("argument.long.big", var1, var0));
   private static final DynamicCommandExceptionType implements_ = new DynamicCommandExceptionType(var0 -> new rgn_3("argument.literal.incorrect", var0));
   private static final SimpleCommandExceptionType finally_ = new SimpleCommandExceptionType(new rgn_3("parsing.quote.expected.start"));
   private static final SimpleCommandExceptionType extends_ = new SimpleCommandExceptionType(new rgn_3("parsing.quote.expected.end"));
   private static final DynamicCommandExceptionType native_ = new DynamicCommandExceptionType(var0 -> new rgn_3("parsing.quote.escape", var0));
   private static final DynamicCommandExceptionType volatile_ = new DynamicCommandExceptionType(var0 -> new rgn_3("parsing.bool.invalid", var0));
   private static final DynamicCommandExceptionType final_ = new DynamicCommandExceptionType(var0 -> new rgn_3("parsing.int.invalid", var0));
   private static final SimpleCommandExceptionType package_ = new SimpleCommandExceptionType(new rgn_3("parsing.int.expected"));
   private static final DynamicCommandExceptionType int_ = new DynamicCommandExceptionType(var0 -> new rgn_3("parsing.long.invalid", var0));
   private static final SimpleCommandExceptionType new_ = new SimpleCommandExceptionType(new rgn_3("parsing.long.expected"));
   private static final DynamicCommandExceptionType continue_ = new DynamicCommandExceptionType(var0 -> new rgn_3("parsing.double.invalid", var0));
   private static final SimpleCommandExceptionType super_ = new SimpleCommandExceptionType(new rgn_3("parsing.double.expected"));
   private static final DynamicCommandExceptionType this_ = new DynamicCommandExceptionType(var0 -> new rgn_3("parsing.float.invalid", var0));
   private static final SimpleCommandExceptionType else_ = new SimpleCommandExceptionType(new rgn_3("parsing.float.expected"));
   private static final SimpleCommandExceptionType synchronized_ = new SimpleCommandExceptionType(new rgn_3("parsing.bool.expected"));
   private static final DynamicCommandExceptionType return_ = new DynamicCommandExceptionType(var0 -> new rgn_3("parsing.expected", var0));
   private static final SimpleCommandExceptionType public_ = new SimpleCommandExceptionType(new rgn_3("command.unknown.command"));
   private static final SimpleCommandExceptionType goto_ = new SimpleCommandExceptionType(new rgn_3("command.unknown.argument"));
   private static final SimpleCommandExceptionType while_ = new SimpleCommandExceptionType(new rgn_3("command.expected.separator"));
   private static final DynamicCommandExceptionType try_ = new DynamicCommandExceptionType(var0 -> new rgn_3("command.exception", var0));

   public DynamicCommandExceptionType readerInvalidLong() {
      return int_;
   }

   public SimpleCommandExceptionType readerExpectedLong() {
      return new_;
   }

   public Dynamic2CommandExceptionType doubleTooHigh() {
      return break_;
   }

   public Dynamic2CommandExceptionType floatTooHigh() {
      return protected_;
   }

   public DynamicCommandExceptionType literalIncorrect() {
      return implements_;
   }

   public Dynamic2CommandExceptionType longTooHigh() {
      return private_;
   }

   public DynamicCommandExceptionType readerInvalidBool() {
      return volatile_;
   }

   public Dynamic2CommandExceptionType integerTooLow() {
      return throws_;
   }

   public Dynamic2CommandExceptionType integerTooHigh() {
      return case_;
   }

   public SimpleCommandExceptionType readerExpectedInt() {
      return package_;
   }

   public DynamicCommandExceptionType readerInvalidFloat() {
      return this_;
   }

   public Dynamic2CommandExceptionType floatTooLow() {
      return byte_;
   }

   public SimpleCommandExceptionType readerExpectedBool() {
      return synchronized_;
   }

   public DynamicCommandExceptionType readerInvalidInt() {
      return final_;
   }

   public Dynamic2CommandExceptionType doubleTooLow() {
      return class_;
   }

   public Dynamic2CommandExceptionType longTooLow() {
      return catch_;
   }

   public SimpleCommandExceptionType dispatcherExpectedArgumentSeparator() {
      return while_;
   }

   public SimpleCommandExceptionType readerExpectedFloat() {
      return else_;
   }

   public DynamicCommandExceptionType readerInvalidEscape() {
      return native_;
   }

   public DynamicCommandExceptionType readerExpectedSymbol() {
      return return_;
   }

   public SimpleCommandExceptionType readerExpectedStartOfQuote() {
      return finally_;
   }

   public DynamicCommandExceptionType readerInvalidDouble() {
      return continue_;
   }

   public SimpleCommandExceptionType dispatcherUnknownCommand() {
      return public_;
   }

   public SimpleCommandExceptionType dispatcherUnknownArgument() {
      return goto_;
   }

   public SimpleCommandExceptionType readerExpectedEndOfQuote() {
      return extends_;
   }

   public DynamicCommandExceptionType dispatcherParseException() {
      return try_;
   }

   public SimpleCommandExceptionType readerExpectedDouble() {
      return super_;
   }
}
