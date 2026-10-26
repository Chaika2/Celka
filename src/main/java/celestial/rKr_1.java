/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap
 */
package celestial;

import celestial.rKs_1;
import celestial.rcW_2;
import celestial.rcd_3;
import celestial.rfj_3;
import celestial.roe_3;
import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;

public final class rKr_1
implements AutoCloseable {
    private final Long2ObjectLinkedOpenHashMap<roe_3> id_class = new Long2ObjectLinkedOpenHashMap();
    private final File id_break;
    private final boolean id_byte;

    public rKr_1(File file, boolean bl) {
        this.id_break = file;
        this.id_byte = bl;
    }

    public void id_class() throws IOException {
        for (roe_3 roe_32 : this.id_class.values()) {
            roe_32.id_class();
        }
    }

    protected void id_class(rfj_3 rfj_32, rcd_3 rcd_32) throws IOException {
        roe_3 roe_32 = this.id_break(rfj_32);
        try (DataOutputStream dataOutputStream = roe_32.id_byte(rfj_32);){
            rcW_2.id_class(rcd_32, (DataOutput)dataOutputStream);
        }
    }

    public rcd_3 id_class(rfj_3 rfj_32) throws IOException {
        Object var3_6;
        roe_3 roe_32 = this.id_break(rfj_32);
        try (DataInputStream dataInputStream = roe_32.id_class(rfj_32);){
            if (dataInputStream != null) {
                rcd_3 rcd_32 = rcW_2.id_class(dataInputStream);
                return rcd_32;
            }
            var3_6 = null;
        }
        return var3_6;
    }

    @Override
    public void close() throws IOException {
        rKs_1<IOException> rKs_12 = new rKs_1<IOException>();
        for (roe_3 roe_32 : this.id_class.values()) {
            try {
                roe_32.close();
            }
            catch (IOException iOException) {
                rKs_12.id_class(iOException);
            }
        }
        rKs_12.id_class();
    }

    private roe_3 id_break(rfj_3 rfj_32) throws IOException {
        long l = rfj_3.id_class(rfj_32.id_case(), rfj_32.id_catch());
        roe_3 roe_32 = (roe_3)this.id_class.getAndMoveToFirst(l);
        if (roe_32 != null) {
            return roe_32;
        }
        if (this.id_class.size() >= 256) {
            ((roe_3)this.id_class.removeLast()).close();
        }
        if (!this.id_break.exists()) {
            this.id_break.mkdirs();
        }
        File file = new File(this.id_break, "r." + rfj_32.id_case() + "." + rfj_32.id_catch() + ".mca");
        roe_3 roe_33 = new roe_3(file, this.id_break, this.id_byte);
        this.id_class.putAndMoveToFirst(l, (Object)roe_33);
        return roe_33;
    }
}

