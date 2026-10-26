/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.net.DatagramPacket;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.Random;

public class rFK {
    private final long id_class = new Date().getTime();
    private final int id_break;
    private final byte[] id_byte;
    private final byte[] id_protected;
    private final String id_throws;

    public byte[] id_byte() {
        return this.id_byte;
    }

    public rFK(DatagramPacket datagramPacket) {
        byte[] byArray = datagramPacket.getData();
        this.id_byte = new byte[4];
        this.id_byte[0] = byArray[3];
        this.id_byte[1] = byArray[4];
        this.id_byte[2] = byArray[5];
        this.id_byte[3] = byArray[6];
        this.id_throws = new String(this.id_byte, StandardCharsets.UTF_8);
        this.id_break = new Random().nextInt(0x1000000);
        this.id_protected = String.format("\t%s%d\ufffd\ufffd", this.id_throws, this.id_break).getBytes(StandardCharsets.UTF_8);
    }

    public Boolean id_class(long l) {
        return this.id_class < l;
    }

    public int id_class() {
        return this.id_break;
    }

    public byte[] id_break() {
        return this.id_protected;
    }
}

