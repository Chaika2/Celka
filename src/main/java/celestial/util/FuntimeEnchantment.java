/*
 * Decompiled with CFR 0.152.
 */
package celestial.util;

public class FuntimeEnchantment {
    public Object[] id_class;

    public FuntimeEnchantment(String var1, int var2) {
        this.id_throws();
        this.id_class[0] = var1;
        this.id_class[1] = var2;
    }

    public String toString() {
        return "FuntimeCustomEnchantmentWrapper{enchantment='" + (String)this.id_class[0] + "', level=" + (Integer)this.id_class[1] + "}";
    }

    public static FuntimeEnchantment id_class(String var0) {
        return FuntimeEnchantment.id_class(var0, 1);
    }

    public String id_class() {
        return (String)this.id_class[0];
    }

    public static FuntimeEnchantment id_class(String var0, int var1) {
        return new FuntimeEnchantment(var0, var1);
    }

    public int id_break() {
        return (Integer)this.id_class[1];
    }

    private void id_throws() {
        if (this.id_class == null) {
            this.id_class = new Object[2];
            this.id_class[1] = 0;
        }
    }
}

