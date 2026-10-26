/*
 * Decompiled with CFR 0.152.
 */
package celestial.module.util;

import celestial.module.Category;
import celestial.module.Module;
import celestial.rrTF;
import celestial.rrZW;
import celestial.rrlp_3;
import celestial.rrlq_3;
import celestial.rrlt_3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class AutoAccept
extends Module {
    public Object[] id_break;

    public AutoAccept() {
        super("Auto Accept", "\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438 \u043f\u0440\u0438\u043d\u0438\u043c\u0430\u0435\u0442\n\u0437\u0430\u043f\u0440\u043e\u0441\u044b \u043d\u0430 \u0447\u0442\u043e-\u043b\u0438\u0431\u043e", Category.UTIL);
        ArrayList var5;
        this.id_super();
        this.id_break[0] = var5 = new ArrayList();
        this.id_class(new rrlt_3(this));
        this.id_class(new rrlq_3(this));
        this.id_class(new rrlp_3(this));
    }

    @Override
    public void id_class(boolean var1) {
        this.id_super();
        super.id_class(var1);
        for (rrTF var3 : (List)this.id_break[0]) {
            var3.aI_();
        }
    }

    @Override
    public <T extends rrTF<?>> T id_class(T var1) {
        this.id_super();
        ((List)this.id_break[0]).add(var1);
        return var1;
    }

    public boolean id_class(String[] var1) {
        Set var2 = Arrays.stream(var1).map(String::toLowerCase).collect(Collectors.toSet());
        Set<String> var3 = ((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[0]).id_class().keySet();
        for (String var5 : (List)((Object)var2)) {
            if (!var3.contains(var5)) continue;
            return true;
        }
        return false;
    }

    @Override
    public void id_throws(boolean var1) {
        this.id_super();
        super.id_throws(var1);
        for (rrTF var3 : (List)this.id_break[0]) {
            var3.aK_();
        }
    }

    private void id_super() {
        if (this.id_break == null) {
            this.id_break = new Object[1];
        }
    }
}

