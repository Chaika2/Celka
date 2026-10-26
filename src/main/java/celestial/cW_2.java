/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Strings
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.ParseResults
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.context.CommandContextBuilder
 *  com.mojang.brigadier.context.ParsedArgument
 *  com.mojang.brigadier.context.SuggestionContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.suggestion.Suggestion
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  com.mojang.brigadier.tree.LiteralCommandNode
 *  javax.annotation.Nullable
 */
package celestial;

import celestial.Aq_1;
import celestial.C_break;
import celestial.Lu_1;
import celestial.Ml_1;
import celestial.QY;
import celestial.Qw_1;
import celestial.cQ_2;
import celestial.cb_3;
import celestial.ch_3;
import celestial.cm_3;
import celestial.cz_3;
import celestial.gR_2;
import celestial.gp_3;
import celestial.rfU_2;
import celestial.rgF_2;
import celestial.rgP_2;
import celestial.rgc_3;
import celestial.rgn_3;
import celestial.rgv_3;
import celestial.rpl_3;
import celestial.rrLE;
import celestial.vm_3;
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.context.CommandContextBuilder;
import com.mojang.brigadier.context.ParsedArgument;
import com.mojang.brigadier.context.SuggestionContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestion;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class cW_2 {
    private static final Pattern id_class = Pattern.compile("(\\s+)");
    private static final rgc_3 id_break = rgc_3.id_class.id_class(rgF_2.RED);
    private static final rgc_3 id_byte = rgc_3.id_class.id_class(rgF_2.GRAY);
    private static final List<rgc_3> id_protected = (List)Stream.of(rgF_2.AQUA, rgF_2.YELLOW, rgF_2.GREEN, rgF_2.LIGHT_PURPLE, rgF_2.GOLD).map(rgc_3.id_class::id_class).collect(ImmutableList.toImmutableList());
    public final QY id_throws;
    public final vm_3 id_case;
    public final Lu_1 id_catch;
    public final cm_3 id_private;
    private final boolean id_implements;
    private final boolean id_finally;
    public final int id_extends;
    public final int id_native;
    public final boolean id_volatile;
    public final int id_final;
    private final List<cz_3> id_package = Lists.newArrayList();
    private int id_int;
    private int id_new;
    private ParseResults<gR_2> id_continue;
    private CompletableFuture<Suggestions> id_super;
    public cQ_2 id_this;
    private boolean id_else;
    public boolean id_synchronized;

    public Lu_1 id_byte() {
        return this.id_catch;
    }

    public cW_2(QY qY, vm_3 vm_32, Lu_1 lu_1, cm_3 cm_32, boolean bl, boolean bl2, int n, int n2, boolean bl3, int n3) {
        this.id_throws = qY;
        this.id_case = vm_32;
        this.id_catch = lu_1;
        this.id_private = cm_32;
        this.id_implements = bl;
        this.id_finally = bl2;
        this.id_extends = n;
        this.id_native = n2;
        this.id_volatile = bl3;
        this.id_final = n3;
        lu_1.id_class(this::id_class);
    }

    public void id_class(boolean bl) {
        this.id_else = bl;
        if (!bl) {
            this.id_this = null;
        }
    }

    public void id_class(Ml_1 ml_1, int n, int n2) {
        if (this.id_this != null) {
            this.id_this.id_class(ml_1, n, n2);
        } else {
            int n3 = 0;
            for (cz_3 cz_32 : this.id_package) {
                rpl_3 rpl_32 = cz_32.id_class();
                int n4 = this.id_volatile ? this.id_case.id_int - 14 - 13 - 12 * n3 : 72 + 12 * n3;
                ch_3.id_class(ml_1, this.id_int, n4, this.id_int + this.id_private.id_class(rpl_32) + 4, n4 + 12, this.id_final);
                this.id_private.id_class(ml_1, rpl_32, (float)this.id_int + 2.0f, (float)(n4 + 2), -1);
                ++n3;
            }
        }
    }

    private static rpl_3 id_class(ParseResults<gR_2> parseResults, String string, int n) {
        int n2;
        ArrayList arrayList = Lists.newArrayList();
        int n3 = 0;
        int n4 = -1;
        CommandContextBuilder commandContextBuilder = parseResults.getContext().getLastChild();
        for (ParsedArgument parsedArgument : commandContextBuilder.getArguments().values()) {
            int n5;
            if (++n4 >= id_protected.size()) {
                n4 = 0;
            }
            if ((n5 = Math.max(parsedArgument.getRange().getStart() - n, 0)) >= string.length()) break;
            int n6 = Math.min(parsedArgument.getRange().getEnd() - n, string.length());
            if (n6 <= 0) continue;
            arrayList.add(rpl_3.id_class(string.substring(n3, n5), id_byte));
            arrayList.add(rpl_3.id_class(string.substring(n5, n6), id_protected.get(n4)));
            n3 = n6;
        }
        if (parseResults.getReader().canRead() && (n2 = Math.max(parseResults.getReader().getCursor() - n, 0)) < string.length()) {
            int n7 = Math.min(n2 + parseResults.getReader().getRemainingLength(), string.length());
            arrayList.add(rpl_3.id_class(string.substring(n3, n2), id_byte));
            arrayList.add(rpl_3.id_class(string.substring(n2, n7), id_break));
            n3 = n7;
        }
        arrayList.add(rpl_3.id_class(string.substring(n3), id_byte));
        return rpl_3.id_class(arrayList);
    }

    public boolean id_class(int n, int n2, int n3) {
        if (this.id_this != null && this.id_this.id_break(n, n2, n3)) {
            return true;
        }
        if (this.id_case.id_catch() == this.id_catch && n == 258) {
            this.id_break(true);
            return true;
        }
        return false;
    }

    private rpl_3 id_class(String string, int n) {
        return this.id_continue != null ? cW_2.id_class(this.id_continue, string, n) : rpl_3.id_class(string, rgc_3.id_class);
    }

    @Nullable
    public static String id_class(String string, String string2) {
        return string2.startsWith(string) ? string2.substring(string.length()) : null;
    }

    public void id_class(ParseResults<gR_2> parseResults) {
        this.id_continue = parseResults;
    }

    public void id_class(cQ_2 cQ_22) {
        this.id_this = cQ_22;
    }

    public void id_class(CompletableFuture<Suggestions> completableFuture) {
        this.id_super = completableFuture;
    }

    public void id_class() {
        StringReader stringReader;
        boolean bl;
        if (!((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).id_class(this)) {
            return;
        }
        this.id_package.clear();
        if (rrLE.id_class(this).id_byte()) {
            this.id_catch.id_byte(null);
            this.id_super = null;
            this.id_this = null;
            this.id_continue = null;
            return;
        }
        String string = this.id_catch.id_private();
        if (this.id_continue != null && !this.id_continue.getReader().getString().equals(string)) {
            this.id_continue = null;
        }
        if (!this.id_synchronized) {
            this.id_catch.id_byte(null);
            this.id_this = null;
        }
        boolean bl2 = bl = (stringReader = new StringReader(string)).canRead() && stringReader.peek() == '/';
        if (bl) {
            stringReader.skip();
        }
        boolean bl3 = this.id_implements || bl;
        int n = this.id_catch.id_final();
        if (!this.id_synchronized) {
            this.id_catch.id_byte(null);
            this.id_this = null;
        }
        if (bl3) {
            int n2;
            CommandDispatcher<gR_2> commandDispatcher = ((Aq_1)((cb_3)this.id_throws.id_class[57]).id_break[0]).id_implements();
            if (this.id_continue == null) {
                this.id_continue = commandDispatcher.parse(stringReader, (Object)((Aq_1)((cb_3)this.id_throws.id_class[57]).id_break[0]).id_break());
            }
            int n3 = n2 = this.id_finally ? stringReader.getCursor() : 1;
            if (!(n < n2 || this.id_this != null && this.id_synchronized)) {
                this.id_super = commandDispatcher.getCompletionSuggestions(this.id_continue, n);
                this.id_super.thenRun(() -> {
                    if (this.id_super.isDone()) {
                        this.id_catch();
                    }
                });
            }
        } else {
            String string2 = string.substring(0, n);
            int n4 = cW_2.id_class(string2);
            Collection<String> collection = ((Aq_1)((cb_3)this.id_throws.id_class[57]).id_break[0]).id_break().id_class();
            this.id_super = gR_2.id_break(collection, new SuggestionsBuilder(string2, n4));
        }
    }

    private List<Suggestion> id_class(Suggestions suggestions) {
        String string = this.id_catch.id_private().substring(0, this.id_catch.id_final());
        int n = cW_2.id_class(string);
        String string2 = string.substring(n).toLowerCase(Locale.ROOT);
        ArrayList arrayList = Lists.newArrayList();
        ArrayList arrayList2 = Lists.newArrayList();
        for (Suggestion suggestion : suggestions.getList()) {
            if (!suggestion.getText().startsWith(string2) && !suggestion.getText().startsWith("minecraft:" + string2)) {
                arrayList2.add(suggestion);
                continue;
            }
            arrayList.add(suggestion);
        }
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    public boolean id_class(double d, double d2, int n) {
        return this.id_this != null && this.id_this.id_class((int)d, (int)d2, n);
    }

    public boolean id_class(double d) {
        return this.id_this != null && this.id_this.id_class(rfU_2.id_class(d, -1.0, 1.0));
    }

    private static cz_3 id_class(CommandSyntaxException commandSyntaxException) {
        rgP_2 rgP_22 = rgv_3.id_class(commandSyntaxException.getRawMessage());
        String string = commandSyntaxException.getContext();
        return string == null ? new cz_3(rgP_22.id_catch()) : new cz_3(new rgn_3("command.context.parse_error", rgP_22, commandSyntaxException.getCursor(), string).id_catch());
    }

    private static int id_class(String string) {
        if (Strings.isNullOrEmpty((String)string)) {
            return 0;
        }
        int n = 0;
        Matcher matcher = id_class.matcher(string);
        while (matcher.find()) {
            n = matcher.end();
        }
        return n;
    }

    private void id_class(rgF_2 rgF_22) {
        CommandContextBuilder commandContextBuilder = this.id_continue.getContext();
        SuggestionContext suggestionContext = commandContextBuilder.findSuggestionContext(this.id_catch.id_final());
        Map map = ((Aq_1)((cb_3)this.id_throws.id_class[57]).id_break[0]).id_implements().getSmartUsage(suggestionContext.parent, (Object)((Aq_1)((cb_3)this.id_throws.id_class[57]).id_break[0]).id_break());
        ArrayList arrayList = Lists.newArrayList();
        int n = 0;
        rgc_3 rgc_32 = rgc_3.id_class.id_class(rgF_22);
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() instanceof LiteralCommandNode) continue;
            arrayList.add(new cz_3(rpl_3.id_class((String)entry.getValue(), rgc_32)));
            n = Math.max(n, this.id_private.id_break((String)entry.getValue()));
        }
        if (!arrayList.isEmpty()) {
            this.id_package.addAll(arrayList);
        }
    }

    public void id_break(boolean bl) {
        Suggestions suggestions;
        if (this.id_super != null && this.id_super.isDone() && !(suggestions = this.id_super.join()).isEmpty()) {
            int n = 0;
            for (Suggestion suggestion : suggestions.getList()) {
                n = Math.max(n, this.id_private.id_break(suggestion.getText()));
            }
            int n2 = rfU_2.id_class(this.id_catch.id_volatile(suggestions.getRange().getStart()), 0, this.id_catch.id_volatile(0) + this.id_catch.id_package() - n);
            int n3 = this.id_volatile ? this.id_case.id_int - 12 : 72;
            this.id_this = new cQ_2(this, n2, n3, n, this.id_class(suggestions), bl);
        }
    }

    public String id_break() {
        return this.id_this != null ? "\n" + this.id_this.id_byte() : "";
    }

    public List<cz_3> id_throws() {
        return this.id_package;
    }

    private void id_catch() {
        if (this.id_catch.id_final() == this.id_catch.id_private().length()) {
            if (this.id_super.join().isEmpty() && !this.id_continue.getExceptions().isEmpty()) {
                int n = 0;
                for (Map.Entry entry : this.id_continue.getExceptions().entrySet()) {
                    CommandSyntaxException commandSyntaxException = (CommandSyntaxException)((Object)entry.getValue());
                    if (commandSyntaxException.getType() == CommandSyntaxException.BUILT_IN_EXCEPTIONS.literalIncorrect()) {
                        ++n;
                        continue;
                    }
                    this.id_package.add(cW_2.id_class(commandSyntaxException));
                }
                if (n > 0) {
                    this.id_package.add(cW_2.id_class(CommandSyntaxException.BUILT_IN_EXCEPTIONS.dispatcherUnknownCommand().create()));
                }
            } else if (this.id_continue.getReader().canRead()) {
                this.id_package.add(cW_2.id_class(gp_3.id_class(this.id_continue)));
            }
        }
        this.id_int = 2;
        this.id_new = this.id_case.id_package;
        if (this.id_package.isEmpty()) {
            this.id_class(rgF_2.GRAY);
        }
        this.id_this = null;
        if (this.id_else && ((Qw_1)this.id_throws.id_class[20]).id_import) {
            this.id_break(false);
        }
    }

    public boolean id_case() {
        return this.id_synchronized;
    }

    public CompletableFuture<Suggestions> id_protected() {
        return this.id_super;
    }
}

