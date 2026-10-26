/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.At_1;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rjU_2;
import celestial.ruS_2;
import celestial.ruu_3;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.List;

public class rvu_3
implements ruS_2<At_1> {
    private double id_class;
    private double id_break;
    private double id_byte;
    private float id_protected;
    private List<rfH_2> id_throws;
    private float id_case;
    private float id_catch;
    private float id_private;

    public float id_byte() {
        return this.id_catch;
    }

    public void id_byte(float f) {
        this.id_private = f;
    }

    public rvu_3() {
    }

    public rvu_3(double d, double d2, double d3, float f, List<rfH_2> list, rjU_2 rjU_22) {
        this.id_class = d;
        this.id_break = d2;
        this.id_byte = d3;
        this.id_protected = f;
        this.id_throws = Lists.newArrayList(list);
        if (rjU_22 != null) {
            this.id_case = (float)rjU_22.id_break;
            this.id_catch = (float)rjU_22.id_byte;
            this.id_private = (float)rjU_22.id_protected;
        }
    }

    @Override
    public void id_class(float f) {
        this.id_case = f;
    }

    @Override
    public void id_class(At_1 at_1) {
        at_1.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.readFloat();
        this.id_break = ruu_32.readFloat();
        this.id_byte = ruu_32.readFloat();
        this.id_protected = ruu_32.readFloat();
        int n = ruu_32.readInt();
        this.id_throws = Lists.newArrayListWithCapacity((int)n);
        int n2 = rfU_2.id_byte(this.id_class);
        int n3 = rfU_2.id_byte(this.id_break);
        int n4 = rfU_2.id_byte(this.id_byte);
        for (int i = 0; i < n; ++i) {
            int n5 = ruu_32.readByte() + n2;
            int n6 = ruu_32.readByte() + n3;
            int n7 = ruu_32.readByte() + n4;
            this.id_throws.add(new rfH_2(n5, n6, n7));
        }
        this.id_case = ruu_32.readFloat();
        this.id_catch = ruu_32.readFloat();
        this.id_private = ruu_32.readFloat();
    }

    public void id_break(float f) {
        this.id_catch = f;
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.writeFloat((float)this.id_class);
        ruu_32.writeFloat((float)this.id_break);
        ruu_32.writeFloat((float)this.id_byte);
        ruu_32.writeFloat(this.id_protected);
        ruu_32.writeInt(this.id_throws.size());
        int n = rfU_2.id_byte(this.id_class);
        int n2 = rfU_2.id_byte(this.id_break);
        int n3 = rfU_2.id_byte(this.id_byte);
        for (rfH_2 rfH_22 : this.id_throws) {
            int n4 = rfH_22.b_() - n;
            int n5 = rfH_22.c_() - n2;
            int n6 = rfH_22.d_() - n3;
            ruu_32.writeByte(n4);
            ruu_32.writeByte(n5);
            ruu_32.writeByte(n6);
        }
        ruu_32.writeFloat(this.id_case);
        ruu_32.writeFloat(this.id_catch);
        ruu_32.writeFloat(this.id_private);
    }

    public float id_break() {
        return this.id_case;
    }

    public double id_throws() {
        return this.id_class;
    }

    public double id_catch() {
        return this.id_byte;
    }

    public double id_case() {
        return this.id_break;
    }

    public List<rfH_2> id_implements() {
        return this.id_throws;
    }

    public float id_protected() {
        return this.id_private;
    }

    public float id_private() {
        return this.id_protected;
    }
}

