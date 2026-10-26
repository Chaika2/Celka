/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.fj_3;
import celestial.jZ_2;
import java.nio.ByteBuffer;

public class le_3 {
    public final ByteBuffer id_class;
    public final jZ_2 id_break;
    public fj_3[] id_byte;

    public le_3(ByteBuffer byteBuffer, jZ_2 jZ_22, fj_3[] fj_3Array) {
        this(byteBuffer, jZ_22);
        this.id_byte = fj_3Array;
    }

    private le_3(ByteBuffer byteBuffer, jZ_2 jZ_22) {
        this.id_class = byteBuffer;
        this.id_break = jZ_22;
    }
}

