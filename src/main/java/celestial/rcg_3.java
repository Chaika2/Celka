/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rcR_2;

public class rcg_3 {
    public static final rcg_3 id_class = new rcR_2(0L);
    private final long id_break;
    private long id_byte;

    public rcg_3(long l) {
        this.id_break = l;
    }

    public void id_class(long l) {
        this.id_byte += l / 8L;
        if (this.id_byte > this.id_break) {
            throw new RuntimeException("Tried to read NBT tag that was too big; tried to allocate: " + this.id_byte + "bytes where max allowed: " + this.id_break);
        }
    }
}

