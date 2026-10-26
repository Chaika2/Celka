/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 */
package celestial;

import celestial.rcD_2;
import celestial.rcK_2;
import celestial.rcL_2;
import celestial.rcM_2;
import celestial.rcZ_2;
import celestial.rca_3;
import celestial.rcd_3;
import celestial.rch_3;
import celestial.rcn_3;
import celestial.rcq_3;
import celestial.rct_3;
import celestial.rcu_3;
import celestial.rcv_3;
import celestial.rcy_3;
import celestial.rcz_3;
import celestial.rgn_3;
import com.google.common.collect.Lists;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class rcH_2 {
    public static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType((Message)new rgn_3("argument.nbt.trailing"));
    public static final SimpleCommandExceptionType id_break = new SimpleCommandExceptionType((Message)new rgn_3("argument.nbt.expected.key"));
    public static final SimpleCommandExceptionType id_byte = new SimpleCommandExceptionType((Message)new rgn_3("argument.nbt.expected.value"));
    public static final Dynamic2CommandExceptionType id_protected = new Dynamic2CommandExceptionType((object, object2) -> new rgn_3("argument.nbt.list.mixed", object, object2));
    public static final Dynamic2CommandExceptionType id_throws = new Dynamic2CommandExceptionType((object, object2) -> new rgn_3("argument.nbt.array.mixed", object, object2));
    public static final DynamicCommandExceptionType id_case = new DynamicCommandExceptionType(object -> new rgn_3("argument.nbt.array.invalid", object));
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
        int n = this.id_final.getCursor();
        if (StringReader.isQuotedStringStart((char)this.id_final.peek())) {
            return rca_3.id_class(this.id_final.readQuotedString());
        }
        String string = this.id_final.readUnquotedString();
        if (string.isEmpty()) {
            this.id_final.setCursor(n);
            throw id_byte.createWithContext((ImmutableStringReader)this.id_final);
        }
        return this.id_break(string);
    }

    public rcH_2(StringReader stringReader) {
        this.id_final = stringReader;
    }

    public static rcd_3 id_class(String string) throws CommandSyntaxException {
        return new rcH_2(new StringReader(string)).id_class();
    }

    private <T extends Number> List<T> id_class(rcv_3<?> rcv_32, rcv_3<?> rcv_33) throws CommandSyntaxException {
        ArrayList arrayList = Lists.newArrayList();
        while (this.id_final.peek() != ']') {
            int n = this.id_final.getCursor();
            rcZ_2 rcZ_22 = this.id_protected();
            rcv_3<?> rcv_34 = rcZ_22.id_break();
            if (rcv_34 != rcv_33) {
                this.id_final.setCursor(n);
                throw id_throws.createWithContext((ImmutableStringReader)this.id_final, (Object)rcv_34.id_break(), (Object)rcv_32.id_break());
            }
            if (rcv_33 == rch_3.id_class) {
                arrayList.add(((rcK_2)rcZ_22).id_private());
            } else if (rcv_33 == rct_3.id_class) {
                arrayList.add(((rcK_2)rcZ_22).id_throws());
            } else {
                arrayList.add(((rcK_2)rcZ_22).id_case());
            }
            if (!this.id_implements()) break;
            if (this.id_final.canRead()) continue;
            throw id_byte.createWithContext((ImmutableStringReader)this.id_final);
        }
        this.id_class(']');
        return arrayList;
    }

    private void id_class(char c) throws CommandSyntaxException {
        this.id_final.skipWhitespace();
        this.id_final.expect(c);
    }

    public rcd_3 id_class() throws CommandSyntaxException {
        rcd_3 rcd_32 = this.id_case();
        this.id_final.skipWhitespace();
        if (this.id_final.canRead()) {
            throw id_class.createWithContext((ImmutableStringReader)this.id_final);
        }
        return rcd_32;
    }

    protected String id_break() throws CommandSyntaxException {
        this.id_final.skipWhitespace();
        if (!this.id_final.canRead()) {
            throw id_break.createWithContext((ImmutableStringReader)this.id_final);
        }
        return this.id_final.readString();
    }

    private rcZ_2 id_break(String string) {
        try {
            if (id_implements.matcher(string).matches()) {
                return rcu_3.id_class(Float.parseFloat(string.substring(0, string.length() - 1)));
            }
            if (id_finally.matcher(string).matches()) {
                return rch_3.id_class(Byte.parseByte(string.substring(0, string.length() - 1)));
            }
            if (id_extends.matcher(string).matches()) {
                return rct_3.id_class(Long.parseLong(string.substring(0, string.length() - 1)));
            }
            if (id_native.matcher(string).matches()) {
                return rcD_2.id_class(Short.parseShort(string.substring(0, string.length() - 1)));
            }
            if (id_volatile.matcher(string).matches()) {
                return rcn_3.id_class(Integer.parseInt(string));
            }
            if (id_private.matcher(string).matches()) {
                return rcz_3.id_class(Double.parseDouble(string.substring(0, string.length() - 1)));
            }
            if (id_catch.matcher(string).matches()) {
                return rcz_3.id_class(Double.parseDouble(string));
            }
            if ("true".equalsIgnoreCase(string)) {
                return rch_3.id_byte;
            }
            if ("false".equalsIgnoreCase(string)) {
                return rch_3.id_break;
            }
        }
        catch (NumberFormatException numberFormatException) {
            // empty catch block
        }
        return rca_3.id_class(string);
    }

    protected rcZ_2 id_throws() throws CommandSyntaxException {
        return this.id_final.canRead(3) && !StringReader.isQuotedStringStart((char)this.id_final.peek(1)) && this.id_final.peek(2) == ';' ? this.id_private() : this.id_catch();
    }

    private rcZ_2 id_catch() throws CommandSyntaxException {
        this.id_class('[');
        this.id_final.skipWhitespace();
        if (!this.id_final.canRead()) {
            throw id_byte.createWithContext((ImmutableStringReader)this.id_final);
        }
        rcy_3 rcy_32 = new rcy_3();
        rcv_3<?> rcv_32 = null;
        while (this.id_final.peek() != ']') {
            int n = this.id_final.getCursor();
            rcZ_2 rcZ_22 = this.id_protected();
            rcv_3<?> rcv_33 = rcZ_22.id_break();
            if (rcv_32 == null) {
                rcv_32 = rcv_33;
            } else if (rcv_33 != rcv_32) {
                this.id_final.setCursor(n);
                throw id_protected.createWithContext((ImmutableStringReader)this.id_final, (Object)rcv_33.id_break(), (Object)rcv_32.id_break());
            }
            rcy_32.add(rcZ_22);
            if (!this.id_implements()) break;
            if (this.id_final.canRead()) continue;
            throw id_byte.createWithContext((ImmutableStringReader)this.id_final);
        }
        this.id_class(']');
        return rcy_32;
    }

    public rcd_3 id_case() throws CommandSyntaxException {
        this.id_class('{');
        rcd_3 rcd_32 = new rcd_3();
        this.id_final.skipWhitespace();
        while (this.id_final.canRead() && this.id_final.peek() != '}') {
            int n = this.id_final.getCursor();
            String string = this.id_break();
            if (string.isEmpty()) {
                this.id_final.setCursor(n);
                throw id_break.createWithContext((ImmutableStringReader)this.id_final);
            }
            this.id_class(':');
            rcd_32.id_class(string, this.id_protected());
            if (!this.id_implements()) break;
            if (this.id_final.canRead()) continue;
            throw id_break.createWithContext((ImmutableStringReader)this.id_final);
        }
        this.id_class('}');
        return rcd_32;
    }

    private boolean id_implements() {
        this.id_final.skipWhitespace();
        if (this.id_final.canRead() && this.id_final.peek() == ',') {
            this.id_final.skip();
            this.id_final.skipWhitespace();
            return true;
        }
        return false;
    }

    public rcZ_2 id_protected() throws CommandSyntaxException {
        this.id_final.skipWhitespace();
        if (!this.id_final.canRead()) {
            throw id_byte.createWithContext((ImmutableStringReader)this.id_final);
        }
        char c = this.id_final.peek();
        if (c == '{') {
            return this.id_case();
        }
        return c == '[' ? this.id_throws() : this.id_byte();
    }

    private rcZ_2 id_private() throws CommandSyntaxException {
        this.id_class('[');
        int n = this.id_final.getCursor();
        char c = this.id_final.read();
        this.id_final.read();
        this.id_final.skipWhitespace();
        if (!this.id_final.canRead()) {
            throw id_byte.createWithContext((ImmutableStringReader)this.id_final);
        }
        if (c == 'B') {
            return new rcM_2(this.id_class(rcM_2.id_class, rch_3.id_class));
        }
        if (c == 'L') {
            return new rcq_3(this.id_class(rcq_3.id_class, rct_3.id_class));
        }
        if (c == 'I') {
            return new rcL_2(this.id_class(rcL_2.id_class, rcn_3.id_class));
        }
        this.id_final.setCursor(n);
        throw id_case.createWithContext((ImmutableStringReader)this.id_final, (Object)String.valueOf(c));
    }
}

