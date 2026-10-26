/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 */
package celestial;

import celestial.YE;
import celestial.YO;
import celestial.rcZ_2;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class YJ {
    private final String id_class;
    private final Object2IntMap<YO> id_break;
    private final YO[] id_byte;

    public int id_byte(rcZ_2 rcZ_22) {
        List<rcZ_2> list = Collections.singletonList(rcZ_22);
        for (int i = 0; i < this.id_byte.length - 1; ++i) {
            list = this.id_byte[i].id_class(list);
        }
        YO yO = this.id_byte[this.id_byte.length - 1];
        return YJ.id_class(list, yO::id_class);
    }

    public YJ(String string, YO[] yOArray, Object2IntMap<YO> object2IntMap) {
        this.id_class = string;
        this.id_byte = yOArray;
        this.id_break = object2IntMap;
    }

    public String toString() {
        return this.id_class;
    }

    private CommandSyntaxException id_class(YO yO) {
        int n = this.id_break.getInt((Object)yO);
        return YE.id_break.create((Object)this.id_class.substring(0, n));
    }

    public List<rcZ_2> id_class(rcZ_2 rcZ_22) throws CommandSyntaxException {
        List<rcZ_2> list = Collections.singletonList(rcZ_22);
        for (YO yO : this.id_byte) {
            if (!(list = yO.id_class(list)).isEmpty()) continue;
            throw this.id_class(yO);
        }
        return list;
    }

    public List<rcZ_2> id_class(rcZ_2 rcZ_22, Supplier<rcZ_2> supplier) throws CommandSyntaxException {
        List<rcZ_2> list = this.id_protected(rcZ_22);
        YO yO = this.id_byte[this.id_byte.length - 1];
        return yO.id_class(list, supplier);
    }

    private static int id_class(List<rcZ_2> list, Function<rcZ_2, Integer> function) {
        return list.stream().map(function).reduce(0, (n, n2) -> n + n2);
    }

    public int id_break(rcZ_2 rcZ_23, Supplier<rcZ_2> supplier) throws CommandSyntaxException {
        List<rcZ_2> list = this.id_protected(rcZ_23);
        YO yO = this.id_byte[this.id_byte.length - 1];
        return YJ.id_class(list, (rcZ_2 rcZ_22) -> yO.id_class((rcZ_2)rcZ_22, supplier));
    }

    public int id_break(rcZ_2 rcZ_22) {
        List<rcZ_2> list = Collections.singletonList(rcZ_22);
        for (YO yO : this.id_byte) {
            if (!(list = yO.id_class(list)).isEmpty()) continue;
            return 0;
        }
        return list.size();
    }

    private List<rcZ_2> id_protected(rcZ_2 rcZ_22) throws CommandSyntaxException {
        List<rcZ_2> list = Collections.singletonList(rcZ_22);
        for (int i = 0; i < this.id_byte.length - 1; ++i) {
            YO yO = this.id_byte[i];
            int n = i + 1;
            if (!(list = yO.id_class(list, this.id_byte[n]::id_class)).isEmpty()) continue;
            throw this.id_class(yO);
        }
        return list;
    }
}

