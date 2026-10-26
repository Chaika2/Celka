/*
 * Decompiled with CFR 0.152.
 */
package celestial.manager;

import celestial.rrvP;
import java.util.Arrays;

public enum ThemeManager {
    INSTANCE;

    public Object[] fieldsc3c8b26240a53959b0b3ce0fbbe0f311;
    public static Object[] staticFieldsc3c8b26240a53959b0b3ce0fbbe0f311;

    private ThemeManager() {
        rrvP[] var7;
        this.id_implements();
        this.fieldsc3c8b26240a53959b0b3ce0fbbe0f311[1] = var7 = rrvP.values();
        rrvP var8 = (rrvP)((Object)rrvP.staticFieldsf01ecca4eb60322eb4dd34fd4e806aa5[17]);
        this.fieldsc3c8b26240a53959b0b3ce0fbbe0f311[3] = var8;
    }

    public rrvP[] id_class() {
        return (rrvP[])this.fieldsc3c8b26240a53959b0b3ce0fbbe0f311[1];
    }

    public void id_class(rrvP var1) {
        this.fieldsc3c8b26240a53959b0b3ce0fbbe0f311[3] = var1;
    }

    public rrvP id_break() {
        return (rrvP)((Object)this.fieldsc3c8b26240a53959b0b3ce0fbbe0f311[3]);
    }

    public void id_break(String var1) {
        rrvP var6 = Arrays.stream((rrvP[])this.fieldsc3c8b26240a53959b0b3ce0fbbe0f311[1]).filter(var1x -> var1x.id_byte().equals(var1)).findFirst().orElse((rrvP)((Object)this.fieldsc3c8b26240a53959b0b3ce0fbbe0f311[3]));
        this.fieldsc3c8b26240a53959b0b3ce0fbbe0f311[3] = var6;
    }

    private void id_implements() {
        if (this.fieldsc3c8b26240a53959b0b3ce0fbbe0f311 == null) {
            this.fieldsc3c8b26240a53959b0b3ce0fbbe0f311 = new Object[4];
        }
    }

    static {
        staticFieldsc3c8b26240a53959b0b3ce0fbbe0f311 = new Object[]{INSTANCE, new ThemeManager[]{INSTANCE}};
    }
}

