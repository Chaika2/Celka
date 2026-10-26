/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.context.StringRange
 *  com.mojang.brigadier.suggestion.Suggestion
 *  com.mojang.brigadier.suggestion.Suggestions
 */
package celestial;

import celestial.At_1;
import celestial.rgP_2;
import celestial.rgv_3;
import celestial.ruS_2;
import celestial.ruu_3;
import com.google.common.collect.Lists;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.context.StringRange;
import com.mojang.brigadier.suggestion.Suggestion;
import com.mojang.brigadier.suggestion.Suggestions;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class rFQ
implements ruS_2<At_1> {
    private int id_class;
    private Suggestions id_break;

    public Suggestions id_byte() {
        return this.id_break;
    }

    public rFQ() {
    }

    public rFQ(int n, Suggestions suggestions) {
        this.id_class = n;
        this.id_break = suggestions;
    }

    @Override
    public void id_class(At_1 at_1) {
        at_1.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.id_case();
        int n = ruu_32.id_case();
        int n2 = ruu_32.id_case();
        StringRange stringRange = StringRange.between((int)n, (int)(n + n2));
        int n3 = ruu_32.id_case();
        ArrayList arrayList = Lists.newArrayListWithCapacity((int)n3);
        for (int i = 0; i < n3; ++i) {
            String string = ruu_32.id_throws(Short.MAX_VALUE);
            rgP_2 rgP_22 = ruu_32.readBoolean() ? ruu_32.id_throws() : null;
            arrayList.add(new Suggestion(stringRange, string, (Message)rgP_22));
        }
        this.id_break = new Suggestions(stringRange, (List)arrayList);
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_protected(this.id_class);
        ruu_32.id_protected(this.id_break.getRange().getStart());
        ruu_32.id_protected(this.id_break.getRange().getLength());
        ruu_32.id_protected(this.id_break.getList().size());
        for (Suggestion suggestion : this.id_break.getList()) {
            ruu_32.id_class(suggestion.getText());
            ruu_32.writeBoolean(suggestion.getTooltip() != null);
            if (suggestion.getTooltip() == null) continue;
            ruu_32.id_class(rgv_3.id_class(suggestion.getTooltip()));
        }
    }

    public int id_break() {
        return this.id_class;
    }
}

