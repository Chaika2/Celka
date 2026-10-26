/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 */
package celestial;

import celestial.RC;
import celestial.Rn_1;
import celestial.YS;
import celestial.gy_3;
import celestial.rgN_2;
import celestial.rgP_2;
import com.google.common.collect.Lists;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.ArrayList;

public class YB {
    private final String id_class;
    private final YS[] id_break;

    public YB(String string, YS[] ySArray) {
        this.id_class = string;
        this.id_break = ySArray;
    }

    public rgP_2 id_class(gy_3 gy_32, boolean bl) throws CommandSyntaxException {
        if (this.id_break.length != 0 && bl) {
            rgN_2 rgN_22 = new rgN_2(this.id_class.substring(0, this.id_break[0].id_class()));
            int n = this.id_break[0].id_class();
            for (YS yS : this.id_break) {
                rgP_2 rgP_22 = yS.id_class(gy_32);
                if (n < yS.id_class()) {
                    rgN_22.id_break(this.id_class.substring(n, yS.id_class()));
                }
                if (rgP_22 != null) {
                    rgN_22.id_class(rgP_22);
                }
                n = yS.id_break();
            }
            if (n < this.id_class.length()) {
                rgN_22.id_break(this.id_class.substring(n, this.id_class.length()));
            }
            return rgN_22;
        }
        return new rgN_2(this.id_class);
    }

    public static YB id_class(StringReader stringReader, boolean bl) throws CommandSyntaxException {
        String string = stringReader.getString().substring(stringReader.getCursor(), stringReader.getTotalLength());
        if (!bl) {
            stringReader.setCursor(stringReader.getTotalLength());
            return new YB(string, new YS[0]);
        }
        ArrayList arrayList = Lists.newArrayList();
        int n = stringReader.getCursor();
        while (true) {
            Rn_1 rn_1;
            int n2;
            block7: {
                if (!stringReader.canRead()) {
                    return new YB(string, arrayList.toArray(new YS[arrayList.size()]));
                }
                if (stringReader.peek() == '@') {
                    n2 = stringReader.getCursor();
                    try {
                        RC rC = new RC(stringReader);
                        rn_1 = rC.id_super();
                        break block7;
                    }
                    catch (CommandSyntaxException commandSyntaxException) {
                        if (commandSyntaxException.getType() != RC.id_protected && commandSyntaxException.getType() != RC.id_break) {
                            throw commandSyntaxException;
                        }
                        stringReader.setCursor(n2 + 1);
                        continue;
                    }
                }
                stringReader.skip();
                continue;
            }
            arrayList.add(new YS(n2 - n, stringReader.getCursor() - n, rn_1));
        }
    }
}

