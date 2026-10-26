/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.jT_2;
import celestial.jo_3;
import java.io.File;

public class Qp_1 {
    public final File id_class;
    public final File id_break;
    public final File id_byte;
    public final String id_protected;

    public Qp_1(File file, File file2, File file3, String string) {
        this.id_class = file;
        this.id_break = file2;
        this.id_byte = file3;
        this.id_protected = string;
    }

    public jo_3 id_class() {
        return this.id_protected == null ? new jT_2(this.id_byte) : new jo_3(this.id_byte, this.id_protected);
    }
}

