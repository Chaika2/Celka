/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.OT;
import com.google.common.collect.Lists;
import java.util.List;

public class OY {
    private final OT id_class;
    private final OY id_break;
    private final OY id_byte;
    private final int id_protected;
    private final List<OY> id_throws = Lists.newArrayList();
    private OY id_case;
    private OY id_catch;
    private int id_private;
    private float id_implements;
    private float id_finally;
    private float id_extends;
    private float id_native;

    private OY id_byte() {
        if (this.id_catch != null) {
            return this.id_catch;
        }
        return !this.id_throws.isEmpty() ? this.id_throws.get(0) : null;
    }

    public OY(OT oT, OY oY, OY oY2, int n, int n2) {
        if (oT.id_byte() == null) {
            throw new IllegalArgumentException("Can't position an invisible advancement!");
        }
        this.id_class = oT;
        this.id_break = oY;
        this.id_byte = oY2;
        this.id_protected = n;
        this.id_case = this;
        this.id_private = n2;
        this.id_implements = -1.0f;
        OY oY3 = null;
        for (OT oT2 : oT.id_throws()) {
            oY3 = this.id_class(oT2, oY3);
        }
    }

    private OY id_class(OT oT, OY oY) {
        if (oT.id_byte() != null) {
            oY = new OY(oT, this, oY, this.id_throws.size() + 1, this.id_private + 1);
            this.id_throws.add(oY);
        } else {
            for (OT oT2 : oT.id_throws()) {
                oY = this.id_class(oT2, oY);
            }
        }
        return oY;
    }

    public static void id_class(OT oT) {
        if (oT.id_byte() == null) {
            throw new IllegalArgumentException("Can't position children of an invisible root!");
        }
        OY oY = new OY(oT, null, null, 1, 0);
        oY.id_class();
        float f = oY.id_class(0.0f, 0, oY.id_implements);
        if (f < 0.0f) {
            oY.id_class(-f);
        }
        oY.id_throws();
    }

    private OY id_class(OY oY) {
        if (this.id_byte == null) {
            return oY;
        }
        OY oY2 = this;
        OY oY3 = this;
        OY oY4 = this.id_byte;
        OY oY5 = this.id_break.id_throws.get(0);
        float f = this.id_finally;
        float f2 = this.id_finally;
        float f3 = oY4.id_finally;
        float f4 = oY5.id_finally;
        while (oY4.id_protected() != null && oY2.id_byte() != null) {
            oY4 = oY4.id_protected();
            oY2 = oY2.id_byte();
            oY5 = oY5.id_byte();
            oY3 = oY3.id_protected();
            oY3.id_case = this;
            float f5 = oY4.id_implements + f3 - (oY2.id_implements + f) + 1.0f;
            if (f5 > 0.0f) {
                oY4.id_class(this, oY).id_class(this, f5);
                f += f5;
                f2 += f5;
            }
            f3 += oY4.id_finally;
            f += oY2.id_finally;
            f4 += oY5.id_finally;
            f2 += oY3.id_finally;
        }
        if (oY4.id_protected() != null && oY3.id_protected() == null) {
            oY3.id_catch = oY4.id_protected();
            oY3.id_finally += f3 - f2;
        } else {
            if (oY2.id_byte() != null && oY5.id_byte() == null) {
                oY5.id_catch = oY2.id_byte();
                oY5.id_finally += f - f4;
            }
            oY = this;
        }
        return oY;
    }

    private void id_class(OY oY, float f) {
        float f2 = oY.id_protected - this.id_protected;
        if (f2 != 0.0f) {
            oY.id_extends -= f / f2;
            this.id_extends += f / f2;
        }
        oY.id_native += f;
        oY.id_implements += f;
        oY.id_finally += f;
    }

    private OY id_class(OY oY, OY oY2) {
        return this.id_case != null && oY.id_break.id_throws.contains(this.id_case) ? this.id_case : oY2;
    }

    private float id_class(float f, int n, float f2) {
        this.id_implements += f;
        this.id_private = n;
        if (this.id_implements < f2) {
            f2 = this.id_implements;
        }
        for (OY oY : this.id_throws) {
            f2 = oY.id_class(f + this.id_finally, n + 1, f2);
        }
        return f2;
    }

    private void id_class(float f) {
        this.id_implements += f;
        for (OY oY : this.id_throws) {
            oY.id_class(f);
        }
    }

    private void id_class() {
        if (this.id_throws.isEmpty()) {
            this.id_implements = this.id_byte != null ? this.id_byte.id_implements + 1.0f : 0.0f;
        } else {
            OY oY = null;
            for (OY oY2 : this.id_throws) {
                oY2.id_class();
                oY = oY2.id_class(oY == null ? oY2 : oY);
            }
            this.id_break();
            float f = (this.id_throws.get((int)0).id_implements + this.id_throws.get((int)(this.id_throws.size() - 1)).id_implements) / 2.0f;
            if (this.id_byte != null) {
                this.id_implements = this.id_byte.id_implements + 1.0f;
                this.id_finally = this.id_implements - f;
            } else {
                this.id_implements = f;
            }
        }
    }

    private void id_break() {
        float f = 0.0f;
        float f2 = 0.0f;
        for (int i = this.id_throws.size() - 1; i >= 0; --i) {
            OY oY = this.id_throws.get(i);
            oY.id_implements += f;
            oY.id_finally += f;
            f += oY.id_native + (f2 += oY.id_extends);
        }
    }

    private void id_throws() {
        if (this.id_class.id_byte() != null) {
            this.id_class.id_byte().id_class(this.id_private, this.id_implements);
        }
        if (!this.id_throws.isEmpty()) {
            for (OY oY : this.id_throws) {
                oY.id_throws();
            }
        }
    }

    private OY id_protected() {
        if (this.id_catch != null) {
            return this.id_catch;
        }
        return !this.id_throws.isEmpty() ? this.id_throws.get(this.id_throws.size() - 1) : null;
    }
}

