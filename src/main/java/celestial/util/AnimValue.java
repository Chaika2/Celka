/*
 * Decompiled with CFR 0.152.
 */
package celestial.util;

import celestial.rrNE;
import celestial.rrNG;
import celestial.rrNb_1;
import celestial.rrQK;

public class AnimValue
implements rrNG {
    public Object[] id_class;

    @Override
    public float id_byte() {
        return ((Float)this.id_class[2]).floatValue();
    }

    public float id_byte(float var1) {
        return this.id_byte() + Math.min(1.0f, var1) * (1.0f - this.id_byte());
    }

    public rrNE id_int() {
        return (rrNE)((Object)this.id_class[1]);
    }

    public AnimValue(float var1, boolean var2) {
        this((rrQK)((Object)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[0]), var1, var2);
    }

    public AnimValue(rrQK var1, float var2, boolean var3) {
        this.id_this();
        rrNE var8 = (rrNE)((Object)rrNE.staticFieldsf494c4277fc533979058c6d61fda001b[0]);
        this.id_class[1] = var8;
        this.id_class[3] = Float.valueOf(-1.0f);
        this.id_class[4] = true;
        rrNb_1 var11 = new rrNb_1(var1, var2);
        this.id_class[0] = var11;
        if (var3) {
            this.id_class();
        }
    }

    private void id_this() {
        if (this.id_class == null) {
            Object[] var1 = this.id_class = new Object[6];
            var1[2] = Float.valueOf(0.0f);
            var1[3] = Float.valueOf(0.0f);
            var1[4] = 0;
            var1[5] = 0;
        }
    }

    public void id_class(float var1) {
        this.id_class[2] = Float.valueOf(var1);
        ((rrNb_1)this.id_class[0]).id_class(var1);
    }

    public void id_class(rrNE var1, float var2) {
        this.id_class[3] = Float.valueOf(var2);
        this.id_class[1] = var1;
        if (((Boolean)this.id_class[5]).booleanValue() && ((Float)this.id_class[2]).floatValue() != var2) {
            this.id_class[5] = false;
            this.id_class(var2);
        } else if (!((Boolean)this.id_class[4]).booleanValue() || !this.id_protected()) {
            ((rrNb_1)this.id_class[0]).id_class(var2);
            ((rrNb_1)this.id_class[0]).id_protected();
            this.id_class[2] = Float.valueOf((float)((rrNb_1)this.id_class[0]).id_byte());
        }
    }

    public void id_class() {
        this.id_class[3] = Float.valueOf(1.0f);
        this.id_class[2] = Float.valueOf(1.0f);
        ((rrNb_1)this.id_class[0]).id_class(1.0);
        ((rrNb_1)this.id_class[0]).id_break();
    }

    public void id_class(boolean var1) {
        byte var2 = (byte)(var1 ? 1 : 0);
        this.id_class[3] = Float.valueOf(var2);
        rrNE var8 = var1 ? (rrNE)((Object)rrNE.staticFieldsf494c4277fc533979058c6d61fda001b[0]) : (rrNE)((Object)rrNE.staticFieldsf494c4277fc533979058c6d61fda001b[1]);
        this.id_class[1] = var8;
        if (((Boolean)this.id_class[5]).booleanValue() && ((Float)this.id_class[2]).floatValue() != (float)var2) {
            this.id_class[5] = false;
            this.id_class(var2);
        } else if (!((Boolean)this.id_class[4]).booleanValue() || !this.id_protected()) {
            ((rrNb_1)this.id_class[0]).id_class(var2);
            ((rrNb_1)this.id_class[0]).id_protected();
            this.id_class[2] = Float.valueOf((float)((rrNb_1)this.id_class[0]).id_byte());
        }
    }

    public rrNb_1 id_break() {
        return (rrNb_1)this.id_class[0];
    }

    public void id_break(float var1) {
        this.id_class((rrNE)((Object)rrNE.staticFieldsf494c4277fc533979058c6d61fda001b[0]), var1);
    }

    public AnimValue id_throws() {
        this.id_class[4] = false;
        return this;
    }

    public boolean id_finally() {
        return (rrNE)((Object)this.id_class[1]) == (rrNE)((Object)rrNE.staticFieldsf494c4277fc533979058c6d61fda001b[0]);
    }

    public boolean id_catch() {
        return this.id_new() && this.id_protected();
    }

    public void id_extends() {
        this.id_class[2] = Float.valueOf(0.0f);
        ((rrNb_1)this.id_class[0]).id_case();
    }

    @Override
    public boolean id_case() {
        return this.id_byte() > 0.0f;
    }

    public float id_continue() {
        return ((Float)this.id_class[3]).floatValue() > 1.0f ? ((Float)this.id_class[3]).floatValue() - this.id_byte() : 1.0f - this.id_byte();
    }

    public float id_implements() {
        return ((Float)this.id_class[3]).floatValue();
    }

    public boolean id_new() {
        return (rrNE)((Object)this.id_class[1]) == (rrNE)((Object)rrNE.staticFieldsf494c4277fc533979058c6d61fda001b[1]);
    }

    public AnimValue id_package() {
        this.id_class[5] = true;
        return this;
    }

    @Override
    public boolean id_protected() {
        return this.id_byte() == ((Float)this.id_class[3]).floatValue();
    }

    public boolean id_private() {
        return (Boolean)this.id_class[5];
    }

    public float id_final() {
        if (((Float)this.id_class[3]).floatValue() < 0.0f) {
            this.id_class((rrNE)((Object)rrNE.staticFieldsf494c4277fc533979058c6d61fda001b[0]), 1.0f);
        } else if (this.id_protected()) {
            boolean var1 = ((Float)this.id_class[3]).floatValue() >= 0.999f;
            this.id_class(var1 ? (rrNE)((Object)rrNE.staticFieldsf494c4277fc533979058c6d61fda001b[1]) : (rrNE)((Object)rrNE.staticFieldsf494c4277fc533979058c6d61fda001b[0]), var1 ? 0.0f : 1.0f);
        } else {
            this.id_class((rrNE)((Object)this.id_class[1]), ((Float)this.id_class[3]).floatValue());
        }
        return ((Float)this.id_class[2]).floatValue();
    }

    public boolean id_volatile() {
        return this.id_finally() && this.id_protected();
    }

    public boolean id_native() {
        return (Boolean)this.id_class[4];
    }
}

