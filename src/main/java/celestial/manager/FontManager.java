/*
 * Decompiled with CFR 0.152.
 */
package celestial.manager;

import celestial.rrZO;
import celestial.rrZb_1;
import celestial.rrZx_1;
import celestial.util.MinecraftAccessor;

public enum FontManager implements MinecraftAccessor
{
    INSTANCE;

    public Object[] fields71d6c26f697c30cf88e2ba2ddc0b4971 = new Object[12];
    public static Object[] staticFields71d6c26f697c30cf88e2ba2ddc0b4971;
    private static final float[] FLOATS;

    private FontManager() {
        this.id_else();
    }

    private static rrZO id_class(rrZx_1 var0, String var1, float var2, boolean var3) {
        return new rrZO(rrZb_1.id_class(var1, var2), var0, true, false, var3);
    }

    public static rrZO id_class(String var0, float var1, boolean var2) {
        rrZx_1 var10000 = new rrZx_1();
        var10000 = var10000.id_class(248, 249, 250, 9889, 9733);
        rrZx_1[] var4 = new rrZx_1[]{(rrZx_1)rrZx_1.id_break[4]};
        return FontManager.id_class(var10000.id_class(var4), var0, var1, var2);
    }

    public rrZO id_implements() {
        return (rrZO)this.fields71d6c26f697c30cf88e2ba2ddc0b4971[0];
    }

    public rrZO id_private() {
        return (rrZO)this.fields71d6c26f697c30cf88e2ba2ddc0b4971[1];
    }

    public rrZO id_native() {
        return (rrZO)this.fields71d6c26f697c30cf88e2ba2ddc0b4971[2];
    }

    public rrZO id_class() {
        return (rrZO)this.fields71d6c26f697c30cf88e2ba2ddc0b4971[3];
    }

    public rrZO id_finally() {
        return (rrZO)this.fields71d6c26f697c30cf88e2ba2ddc0b4971[4];
    }

    public rrZO id_throws() {
        return (rrZO)this.fields71d6c26f697c30cf88e2ba2ddc0b4971[5];
    }

    public rrZO id_extends() {
        return (rrZO)this.fields71d6c26f697c30cf88e2ba2ddc0b4971[6];
    }

    public rrZO id_catch() {
        return (rrZO)this.fields71d6c26f697c30cf88e2ba2ddc0b4971[7];
    }

    public rrZO id_case() {
        return (rrZO)this.fields71d6c26f697c30cf88e2ba2ddc0b4971[8];
    }

    public rrZO id_protected() {
        return (rrZO)this.fields71d6c26f697c30cf88e2ba2ddc0b4971[9];
    }

    public rrZO id_byte() {
        return (rrZO)this.fields71d6c26f697c30cf88e2ba2ddc0b4971[10];
    }

    public rrZO id_break() {
        return (rrZO)this.fields71d6c26f697c30cf88e2ba2ddc0b4971[11];
    }

    private void id_else() {
        if (this.fields71d6c26f697c30cf88e2ba2ddc0b4971 == null) {
            this.fields71d6c26f697c30cf88e2ba2ddc0b4971 = new Object[12];
        }
    }

    public void id_volatile() {
        String var1 = "montserrat";
        String var2 = "pixel";
        this.fields71d6c26f697c30cf88e2ba2ddc0b4971[0] = FontManager.id_class(var1, FLOATS[0], false);
        this.fields71d6c26f697c30cf88e2ba2ddc0b4971[1] = FontManager.id_class(var1, FLOATS[1], false);
        this.fields71d6c26f697c30cf88e2ba2ddc0b4971[2] = FontManager.id_class(var1, FLOATS[2], false);
        this.fields71d6c26f697c30cf88e2ba2ddc0b4971[3] = FontManager.id_class(var1, FLOATS[3], false);
        this.fields71d6c26f697c30cf88e2ba2ddc0b4971[4] = FontManager.id_class(var1, FLOATS[4], false);
        this.fields71d6c26f697c30cf88e2ba2ddc0b4971[5] = FontManager.id_class(var1, FLOATS[5], false);
        this.fields71d6c26f697c30cf88e2ba2ddc0b4971[6] = FontManager.id_class(var1, FLOATS[6], false);
        this.fields71d6c26f697c30cf88e2ba2ddc0b4971[7] = FontManager.id_class(var1, FLOATS[7], false);
        this.fields71d6c26f697c30cf88e2ba2ddc0b4971[8] = FontManager.id_class(var1, FLOATS[8], false);
        this.fields71d6c26f697c30cf88e2ba2ddc0b4971[9] = FontManager.id_class(var1, FLOATS[9], false);
        this.fields71d6c26f697c30cf88e2ba2ddc0b4971[10] = FontManager.id_class(var1, FLOATS[10], false);
        this.fields71d6c26f697c30cf88e2ba2ddc0b4971[11] = FontManager.id_class(var2, FLOATS[11], false);
    }

    static {
        staticFields71d6c26f697c30cf88e2ba2ddc0b4971 = new Object[]{INSTANCE, new FontManager[]{INSTANCE}};
        FLOATS = new float[]{10.0f, 11.0f, 12.0f, 13.0f, 14.0f, 15.0f, 16.0f, 17.0f, 18.0f, 20.0f, 21.0f, 16.0f};
    }
}

