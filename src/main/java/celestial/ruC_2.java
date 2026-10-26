/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
package celestial;

import com.mojang.authlib.GameProfile;

public class ruC_2 {
    private final int id_class;
    private final int id_break;
    private GameProfile[] id_byte;

    public GameProfile[] id_byte() {
        return this.id_byte;
    }

    public ruC_2(int n, int n2) {
        this.id_class = n;
        this.id_break = n2;
    }

    public void id_class(GameProfile[] gameProfileArray) {
        this.id_byte = gameProfileArray;
    }

    public int id_class() {
        return this.id_class;
    }

    public int id_break() {
        return this.id_break;
    }
}

