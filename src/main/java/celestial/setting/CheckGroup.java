/*
 * Decompiled with CFR 0.152.
 */
package celestial.setting;

import celestial.rrIA;
import celestial.rrIk_1;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class CheckGroup {
    public Object[] id_class;

    public List<rrIk_1> id_byte() {
        return new ArrayList<rrIk_1>(((Map)this.id_class[0]).values());
    }

    public CheckGroup id_byte(boolean var1) {
        return this.id_class((rrIA)((Object)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[3]), var1);
    }

    public CheckGroup() {
        EnumMap var5;
        this.id_native();
        this.id_class[0] = var5 = new EnumMap(rrIA.class);
    }

    public CheckGroup id_class(rrIA var1, boolean var2) {
        rrIk_1 var3 = new rrIk_1(var1.id_class(), var1.id_break());
        var3.id_class(var2, false, true);
        if (var1 == (rrIA)((Object)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[1])) {
            var3.id_class(this::id_throws);
        }
        ((Map)this.id_class[0]).put(var1, var3);
        return this;
    }

    private boolean id_class(rrIA var1) {
        return Optional.ofNullable((rrIk_1)((Map)this.id_class[0]).get((Object)var1)).map(rrIk_1::id_class).orElse(false);
    }

    public CheckGroup id_class(boolean var1) {
        return this.id_class((rrIA)((Object)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[5]), var1);
    }

    public boolean id_class() {
        return this.id_class((rrIA)((Object)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[6]));
    }

    public boolean id_break() {
        return this.id_class((rrIA)((Object)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[3]));
    }

    public CheckGroup id_break(boolean var1) {
        return this.id_class((rrIA)((Object)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[6]), var1);
    }

    public CheckGroup id_throws(boolean var1) {
        return this.id_class((rrIA)((Object)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[2]), var1);
    }

    public boolean id_throws() {
        return this.id_class((rrIA)((Object)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[0]));
    }

    public boolean id_finally() {
        return this.id_class((rrIA)((Object)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[1]));
    }

    public boolean id_catch() {
        return this.id_class((rrIA)((Object)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[5]));
    }

    public CheckGroup id_catch(boolean var1) {
        return this.id_class((rrIA)((Object)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[0]), var1);
    }

    public boolean id_extends() {
        return this.id_class((rrIA)((Object)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[8]));
    }

    public boolean id_case() {
        return this.id_class((rrIA)((Object)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[4]));
    }

    public CheckGroup id_case(boolean var1) {
        return this.id_class((rrIA)((Object)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[1]), var1);
    }

    public CheckGroup id_implements(boolean var1) {
        return this.id_class((rrIA)((Object)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[4]), var1);
    }

    public boolean id_implements() {
        return this.id_class((rrIA)((Object)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[2]));
    }

    public CheckGroup id_protected(boolean var1) {
        return this.id_class((rrIA)((Object)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[7]), var1);
    }

    public Map<rrIA, rrIk_1> id_protected() {
        return (Map)this.id_class[0];
    }

    public CheckGroup id_private(boolean var1) {
        return this.id_class((rrIA)((Object)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[8]), var1);
    }

    public boolean id_private() {
        return this.id_class((rrIA)((Object)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[7]));
    }

    private void id_native() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[1];
        }
    }
}

