/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
package celestial;

import com.mojang.authlib.GameProfile;
import java.util.Date;

public class rCs_1 {
    private final GameProfile id_class;
    public final Date id_break;
    private volatile long id_byte;

    public long id_byte() {
        return this.id_byte;
    }

    public rCs_1(GameProfile gameProfile, Date date) {
        this.id_class = gameProfile;
        this.id_break = date;
    }

    public GameProfile id_class() {
        return this.id_class;
    }

    public void id_class(long l) {
        this.id_byte = l;
    }

    public Date id_break() {
        return this.id_break;
    }
}

