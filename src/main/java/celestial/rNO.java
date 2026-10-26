/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.rNE;
import celestial.rNJ;
import celestial.rNL;
import celestial.rNh_1;
import celestial.rNs_1;
import celestial.rzh_3;
import com.google.common.collect.Lists;
import java.util.List;

public class rNO
extends rzh_3<rNO> {
    private final rNJ id_class;
    private final List<rNh_1> id_break = Lists.newArrayList();

    public rNO(rNJ rNJ2) {
        this.id_class = rNJ2;
    }

    public rNO id_class(String string, String string2) {
        return this.id_class(string, string2, rNE.REPLACE);
    }

    public rNO id_class(String string, String string2, rNE rNE2) {
        this.id_break.add(new rNh_1(string, string2, rNE2));
        return this;
    }

    @Override
    protected /* synthetic */ rzh_3 id_break() {
        return this.id_throws();
    }

    protected rNO id_throws() {
        return this;
    }

    @Override
    public rNL id_case() {
        return new rNs_1(this.id_byte(), this.id_class, this.id_break);
    }
}

