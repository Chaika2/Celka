/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrbb_3;
import celestial.rrxi_3;
import java.io.InputStream;

public class rrdz_1
implements rrxi_3 {
    @Override
    public String id_class() {
        return "(internal)";
    }

    @Override
    public InputStream id_class(String string) {
        return rrbb_3.id_class(string);
    }

    @Override
    public void id_break() {
    }

    @Override
    public boolean id_break(String string) {
        return false;
    }
}

