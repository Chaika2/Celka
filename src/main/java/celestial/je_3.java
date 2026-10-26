/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.jo_3;
import celestial.rAI;
import celestial.rAY;
import celestial.rqO_2;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Collection;
import java.util.function.Predicate;

public class je_3
extends rAY {
    private final jo_3 id_protected;

    @Override
    protected InputStream id_byte(rAI rAI2, rqO_2 rqO_22) {
        File file;
        if (rAI2 == rAI.CLIENT_RESOURCES && (file = this.id_protected.id_class(rqO_22)) != null && file.exists()) {
            try {
                return new FileInputStream(file);
            }
            catch (FileNotFoundException fileNotFoundException) {
                // empty catch block
            }
        }
        return super.id_byte(rAI2, rqO_22);
    }

    public je_3(jo_3 jo_32) {
        super("minecraft", "realms");
        this.id_protected = jo_32;
    }

    @Override
    public Collection<rqO_2> id_class(rAI rAI2, String string, String string2, int n, Predicate<String> predicate) {
        Collection<rqO_2> collection = super.id_class(rAI2, string, string2, n, predicate);
        collection.addAll(this.id_protected.id_class(string2, string, n, predicate));
        return collection;
    }

    @Override
    protected InputStream id_break(String string) {
        File file = this.id_protected.id_class(string);
        if (file != null && file.exists()) {
            try {
                return new FileInputStream(file);
            }
            catch (FileNotFoundException fileNotFoundException) {
                // empty catch block
            }
        }
        return super.id_break(string);
    }

    @Override
    public boolean id_break(rAI rAI2, rqO_2 rqO_22) {
        File file;
        if (rAI2 == rAI.CLIENT_RESOURCES && (file = this.id_protected.id_class(rqO_22)) != null && file.exists()) {
            return true;
        }
        return super.id_break(rAI2, rqO_22);
    }
}

