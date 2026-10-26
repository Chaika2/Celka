/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.Unpooled
 */
package celestial;

import celestial.At_1;
import celestial.rKZ;
import celestial.rKv_1;
import celestial.rYZ;
import celestial.rcd_3;
import celestial.rcq_3;
import celestial.rfH_2;
import celestial.rfj_3;
import celestial.roJ_2;
import celestial.roQ_2;
import celestial.rrbB_2;
import celestial.rrbS_2;
import celestial.ruS_2;
import celestial.ruu_3;
import celestial.ryO_2;
import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class rZD
implements ruS_2<At_1> {
    private int id_class;
    private int id_break;
    private int id_byte;
    private rcd_3 id_protected;
    private int[] id_throws;
    private byte[] id_case;
    private List<rcd_3> id_catch;
    private boolean id_private;
    private Map<String, Object> id_implements;

    public int id_byte() {
        return this.id_class;
    }

    public rZD() {
    }

    public rZD(roJ_2 roJ_22, int n) {
        rfj_3 rfj_32 = roJ_22.id_private();
        this.id_class = rfj_32.id_break;
        this.id_break = rfj_32.id_byte;
        this.id_private = n == 65535;
        this.id_protected = new rcd_3();
        for (Map.Entry<rKv_1, rKZ> entry : roJ_22.id_native()) {
            if (!entry.getKey().id_byte()) continue;
            this.id_protected.id_class(entry.getKey().id_break(), new rcq_3(entry.getValue().id_class()));
        }
        if (this.id_private) {
            this.id_throws = roJ_22.id_implements().id_class();
        }
        this.id_case = new byte[this.id_class(roJ_22, n)];
        this.id_byte = this.id_class(new ruu_3(this.id_finally()), roJ_22, n);
        this.id_catch = Lists.newArrayList();
        for (Map.Entry<Object, Object> entry : roJ_22.id_volatile().entrySet()) {
            rfH_2 rfH_22 = (rfH_2)entry.getKey();
            ryO_2 ryO_22 = (ryO_2)entry.getValue();
            int n2 = rfH_22.c_() >> 4;
            if (!this.id_case() && (n & 1 << n2) == 0) continue;
            rcd_3 rcd_32 = ryO_22.Z_();
            this.id_catch.add(rcd_32);
        }
        this.id_implements = new HashMap<String, Object>();
        rrbB_2 rrbB_22 = rrbS_2.id_class(roJ_22);
        this.id_implements.put("ChunkDataOF", rrbB_22);
    }

    public String toString() {
        return "SChunkDataPacket{chunkX=" + this.id_class + ", chunkZ=" + this.id_break + ", availableSections=" + this.id_byte + ", heightmapTags=" + this.id_protected + ", biomes=" + Arrays.toString(this.id_throws) + ", buffer=" + Arrays.toString(this.id_case) + ", tileEntityTags=" + this.id_catch + ", fullChunk=" + this.id_private + ", customData=" + this.id_implements + "}";
    }

    protected int id_class(roJ_2 roJ_22, int n) {
        int n2 = 0;
        roQ_2[] roQ_2Array = roJ_22.id_byte();
        int n3 = roQ_2Array.length;
        for (int i = 0; i < n3; ++i) {
            roQ_2 roQ_22 = roQ_2Array[i];
            if (roQ_22 == roJ_2.id_class || this.id_case() && roQ_22.id_byte() || (n & 1 << i) == 0) continue;
            n2 += roQ_22.id_finally();
        }
        return n2;
    }

    public int id_class(ruu_3 ruu_32, roJ_2 roJ_22, int n) {
        int n2 = 0;
        roQ_2[] roQ_2Array = roJ_22.id_byte();
        int n3 = roQ_2Array.length;
        for (int i = 0; i < n3; ++i) {
            roQ_2 roQ_22 = roQ_2Array[i];
            if (roQ_22 == roJ_2.id_class || this.id_case() && roQ_22.id_byte() || (n & 1 << i) == 0) continue;
            n2 |= 1 << i;
            roQ_22.id_break(ruu_32);
        }
        return n2;
    }

    @Override
    public void id_class(At_1 at_1) {
        at_1.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        int n;
        this.id_class = ruu_32.readInt();
        this.id_break = ruu_32.readInt();
        this.id_private = ruu_32.readBoolean();
        this.id_byte = ruu_32.id_case();
        this.id_protected = ruu_32.id_implements();
        if (this.id_private) {
            this.id_throws = ruu_32.id_byte(rYZ.id_class);
        }
        if ((n = ruu_32.id_case()) > 0x200000) {
            throw new RuntimeException("Chunk Packet trying to allocate too much memory on read.");
        }
        this.id_case = new byte[n];
        ruu_32.readBytes(this.id_case);
        int n2 = ruu_32.id_case();
        this.id_catch = Lists.newArrayList();
        for (int i = 0; i < n2; ++i) {
            this.id_catch.add(ruu_32.id_implements());
        }
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.writeInt(this.id_class);
        ruu_32.writeInt(this.id_break);
        ruu_32.writeBoolean(this.id_private);
        ruu_32.id_protected(this.id_byte);
        ruu_32.id_class(this.id_protected);
        if (this.id_throws != null) {
            ruu_32.id_class(this.id_throws);
        }
        ruu_32.id_protected(this.id_case.length);
        ruu_32.writeBytes(this.id_case);
        ruu_32.id_protected(this.id_catch.size());
        for (rcd_3 rcd_32 : this.id_catch) {
            ruu_32.id_class(rcd_32);
        }
    }

    public ruu_3 id_break() {
        return new ruu_3(Unpooled.wrappedBuffer((byte[])this.id_case), this.id_implements);
    }

    public int id_throws() {
        return this.id_byte;
    }

    private ByteBuf id_finally() {
        ByteBuf byteBuf = Unpooled.wrappedBuffer((byte[])this.id_case);
        byteBuf.writerIndex(0);
        return byteBuf;
    }

    public rcd_3 id_catch() {
        return this.id_protected;
    }

    public boolean id_case() {
        return this.id_private;
    }

    public int[] id_implements() {
        return this.id_throws;
    }

    public int id_protected() {
        return this.id_break;
    }

    public List<rcd_3> id_private() {
        return this.id_catch;
    }
}

