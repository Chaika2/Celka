/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.ParseResults
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 */
package celestial;

import celestial.gI_2;
import celestial.gj_3;
import celestial.gp_3;
import celestial.gy_3;
import celestial.rqO_2;
import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.ArrayList;
import java.util.List;

public class gt_3 {
    private final gj_3[] id_class;
    public final rqO_2 id_break;

    public gt_3(rqO_2 rqO_22, gj_3[] gj_3Array) {
        this.id_break = rqO_22;
        this.id_class = gj_3Array;
    }

    public static gt_3 id_class(rqO_2 rqO_22, CommandDispatcher<gy_3> commandDispatcher, gy_3 gy_32, List<String> list) {
        ArrayList arrayList = Lists.newArrayListWithCapacity((int)list.size());
        for (int i = 0; i < list.size(); ++i) {
            Object object;
            int n = i + 1;
            String string = list.get(i).trim();
            StringReader stringReader = new StringReader(string);
            if (!stringReader.canRead() || stringReader.peek() == '#') continue;
            if (stringReader.peek() == '/') {
                stringReader.skip();
                if (stringReader.peek() == '/') {
                    throw new IllegalArgumentException("Unknown or invalid command '" + string + "' on line " + n + " (if you intended to make a comment, use '#' not '//')");
                }
                object = stringReader.readUnquotedString();
                throw new IllegalArgumentException("Unknown or invalid command '" + string + "' on line " + n + " (did you mean '" + (String)object + "'? Do not use a preceding forwards slash.)");
            }
            try {
                object = commandDispatcher.parse(stringReader, (Object)gy_32);
                if (object.getReader().canRead()) {
                    throw gp_3.id_class(object);
                }
                arrayList.add(new gI_2((ParseResults<gy_3>)object));
                continue;
            }
            catch (CommandSyntaxException commandSyntaxException) {
                throw new IllegalArgumentException("Whilst parsing command on line " + n + ": " + commandSyntaxException.getMessage());
            }
        }
        return new gt_3(rqO_22, arrayList.toArray(new gj_3[0]));
    }

    public rqO_2 id_class() {
        return this.id_break;
    }

    public gj_3[] id_break() {
        return this.id_class;
    }
}

