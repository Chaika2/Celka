/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.OptionalDynamic
 */
package celestial;

import celestial.rqu_3;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.OptionalDynamic;

public class rrGN {
    private final int id_class;
    private final long id_break;
    private final String id_byte;
    private final int id_protected;
    private final boolean id_throws;

    public String id_byte() {
        return this.id_byte;
    }

    public rrGN(int n, long l, String string, int n2, boolean bl) {
        this.id_class = n;
        this.id_break = l;
        this.id_byte = string;
        this.id_protected = n2;
        this.id_throws = bl;
    }

    public static rrGN id_class(Dynamic<?> dynamic) {
        int n = dynamic.get("version").asInt(0);
        long l = dynamic.get("LastPlayed").asLong(0L);
        OptionalDynamic optionalDynamic = dynamic.get("Version");
        return optionalDynamic.result().isPresent() ? new rrGN(n, l, optionalDynamic.get("Name").asString(rqu_3.id_class().getName()), optionalDynamic.get("Id").asInt(rqu_3.id_class().getWorldVersion()), optionalDynamic.get("Snapshot").asBoolean(!rqu_3.id_class().isStable())) : new rrGN(n, l, "", 0, false);
    }

    public int id_class() {
        return this.id_class;
    }

    public long id_break() {
        return this.id_break;
    }

    public boolean id_throws() {
        return this.id_throws;
    }

    public int id_protected() {
        return this.id_protected;
    }
}

