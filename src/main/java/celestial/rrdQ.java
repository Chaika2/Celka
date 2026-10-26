/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrxi_3;
import celestial.rrzX_2;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class rrdQ
implements rrxi_3 {
    protected File id_class;

    public rrdQ(String string, File file) {
        this.id_class = file;
    }

    @Override
    public String id_class() {
        return this.id_class.getName();
    }

    @Override
    public InputStream id_class(String string) {
        try {
            String string2 = rrzX_2.id_byte(string, "/", "/");
            File file = new File(this.id_class, string2);
            return !file.exists() ? null : new BufferedInputStream(new FileInputStream(file));
        }
        catch (Exception exception) {
            return null;
        }
    }

    @Override
    public boolean id_break(String string) {
        File file = new File(this.id_class, string.substring(1));
        if (!file.exists()) {
            return false;
        }
        return file.isDirectory();
    }

    @Override
    public void id_break() {
    }
}

