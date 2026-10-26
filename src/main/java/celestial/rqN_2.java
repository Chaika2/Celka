/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.util.UUIDTypeAdapter
 */
package celestial;

import celestial.rqc_3;
import com.mojang.authlib.GameProfile;
import com.mojang.util.UUIDTypeAdapter;
import java.util.UUID;

public class rqN_2 {
    private final String id_class;
    private final String id_break;
    private final String id_byte;
    private final rqc_3 id_protected;

    public String id_byte() {
        return this.id_class;
    }

    public rqN_2(String string, String string2, String string3, String string4) {
        this.id_class = string;
        this.id_break = string2;
        this.id_byte = string3;
        this.id_protected = rqc_3.id_class(string4);
    }

    public String toString() {
        return "Session{username='" + this.id_class + "', playerID='" + this.id_break + "', token='" + this.id_byte + "', sessionType=" + this.id_protected + "}";
    }

    public String id_class() {
        return "token:" + this.id_byte + ":" + this.id_break;
    }

    public String id_break() {
        return this.id_break;
    }

    public GameProfile id_throws() {
        try {
            UUID uUID = UUIDTypeAdapter.fromString((String)this.id_break());
            return new GameProfile(uUID, this.id_byte());
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return new GameProfile((UUID)null, this.id_byte());
        }
    }

    public String id_protected() {
        return this.id_byte;
    }
}

