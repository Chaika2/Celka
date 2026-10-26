/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.exceptions.BuiltInExceptionProvider
 *  com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 */
package celestial;

import celestial.rgn_3;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.exceptions.BuiltInExceptionProvider;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class RB
implements BuiltInExceptionProvider {
    private static final Dynamic2CommandExceptionType id_class = new Dynamic2CommandExceptionType((object, object2) -> new rgn_3("argument.double.low", object2, object));
    private static final Dynamic2CommandExceptionType id_break = new Dynamic2CommandExceptionType((object, object2) -> new rgn_3("argument.double.big", object2, object));
    private static final Dynamic2CommandExceptionType id_byte = new Dynamic2CommandExceptionType((object, object2) -> new rgn_3("argument.float.low", object2, object));
    private static final Dynamic2CommandExceptionType id_protected = new Dynamic2CommandExceptionType((object, object2) -> new rgn_3("argument.float.big", object2, object));
    private static final Dynamic2CommandExceptionType id_throws = new Dynamic2CommandExceptionType((object, object2) -> new rgn_3("argument.integer.low", object2, object));
    private static final Dynamic2CommandExceptionType id_case = new Dynamic2CommandExceptionType((object, object2) -> new rgn_3("argument.integer.big", object2, object));
    private static final Dynamic2CommandExceptionType id_catch = new Dynamic2CommandExceptionType((object, object2) -> new rgn_3("argument.long.low", object2, object));
    private static final Dynamic2CommandExceptionType id_private = new Dynamic2CommandExceptionType((object, object2) -> new rgn_3("argument.long.big", object2, object));
    private static final DynamicCommandExceptionType id_implements = new DynamicCommandExceptionType(object -> new rgn_3("argument.literal.incorrect", object));
    private static final SimpleCommandExceptionType id_finally = new SimpleCommandExceptionType((Message)new rgn_3("parsing.quote.expected.start"));
    private static final SimpleCommandExceptionType id_extends = new SimpleCommandExceptionType((Message)new rgn_3("parsing.quote.expected.end"));
    private static final DynamicCommandExceptionType id_native = new DynamicCommandExceptionType(object -> new rgn_3("parsing.quote.escape", object));
    private static final DynamicCommandExceptionType id_volatile = new DynamicCommandExceptionType(object -> new rgn_3("parsing.bool.invalid", object));
    private static final DynamicCommandExceptionType id_final = new DynamicCommandExceptionType(object -> new rgn_3("parsing.int.invalid", object));
    private static final SimpleCommandExceptionType id_package = new SimpleCommandExceptionType((Message)new rgn_3("parsing.int.expected"));
    private static final DynamicCommandExceptionType id_int = new DynamicCommandExceptionType(object -> new rgn_3("parsing.long.invalid", object));
    private static final SimpleCommandExceptionType id_new = new SimpleCommandExceptionType((Message)new rgn_3("parsing.long.expected"));
    private static final DynamicCommandExceptionType id_continue = new DynamicCommandExceptionType(object -> new rgn_3("parsing.double.invalid", object));
    private static final SimpleCommandExceptionType id_super = new SimpleCommandExceptionType((Message)new rgn_3("parsing.double.expected"));
    private static final DynamicCommandExceptionType id_this = new DynamicCommandExceptionType(object -> new rgn_3("parsing.float.invalid", object));
    private static final SimpleCommandExceptionType id_else = new SimpleCommandExceptionType((Message)new rgn_3("parsing.float.expected"));
    private static final SimpleCommandExceptionType id_synchronized = new SimpleCommandExceptionType((Message)new rgn_3("parsing.bool.expected"));
    private static final DynamicCommandExceptionType id_return = new DynamicCommandExceptionType(object -> new rgn_3("parsing.expected", object));
    private static final SimpleCommandExceptionType id_public = new SimpleCommandExceptionType((Message)new rgn_3("command.unknown.command"));
    private static final SimpleCommandExceptionType id_goto = new SimpleCommandExceptionType((Message)new rgn_3("command.unknown.argument"));
    private static final SimpleCommandExceptionType id_while = new SimpleCommandExceptionType((Message)new rgn_3("command.expected.separator"));
    private static final DynamicCommandExceptionType id_try = new DynamicCommandExceptionType(object -> new rgn_3("command.exception", object));

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

