/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrbb_3;
import celestial.rrdw_1;

public class rrdI
extends rrdw_1 {
    public static final String[] id_class = new String[]{"default", "fast", "fancy", "off"};
    public static final String[] id_break = new String[]{"Default", "Fast", "Fancy", "OFF"};

    public rrdI(String string, String string2, int n) {
        super(string, id_class, string2, id_break, n);
    }

    @Override
    public boolean id_class(String string) {
        if (rrbb_3.id_class((Object)string, (Object)"none")) {
            string = "off";
        }
        return super.id_class(string);
    }

    public boolean id_finally() {
        return this.id_class() == 3;
    }

    public boolean id_catch() {
        return this.id_class() == 0;
    }

    public boolean id_implements() {
        return this.id_class() == 2;
    }

    public boolean id_private() {
        return this.id_class() == 1;
    }
}

