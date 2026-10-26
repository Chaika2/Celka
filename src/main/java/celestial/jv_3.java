/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.jF_2;
import celestial.jL_2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class jv_3 {
    private static final Logger id_class = LogManager.getLogger();
    private final jF_2 id_break;
    private final jL_2 id_byte;
    private final int id_protected;
    private final int id_throws;
    private final int id_case;
    private String id_catch;

    public final int id_byte() {
        return this.id_protected;
    }

    public jv_3(int n, jF_2 jF_22, jL_2 jL_22, int n2) {
        if (this.id_class(n, jL_22)) {
            this.id_byte = jL_22;
        } else {
            id_class.warn("Multiple vertex elements of the same type other than UVs are not supported. Forcing type to UV.");
            this.id_byte = jL_2.UV;
        }
        this.id_break = jF_22;
        this.id_protected = n;
        this.id_throws = n2;
        this.id_case = jF_22.id_class() * this.id_throws;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            jv_3 jv_32 = (jv_3)object;
            if (this.id_throws != jv_32.id_throws) {
                return false;
            }
            if (this.id_protected != jv_32.id_protected) {
                return false;
            }
            if (this.id_break != jv_32.id_break) {
                return false;
            }
            return this.id_byte == jv_32.id_byte;
        }
        return false;
    }

    public String toString() {
        return this.id_catch != null ? this.id_catch : this.id_throws + "," + this.id_byte.id_class() + "," + this.id_break.id_break();
    }

    public int hashCode() {
        int n = this.id_break.hashCode();
        n = 31 * n + this.id_byte.hashCode();
        n = 31 * n + this.id_protected;
        return 31 * n + this.id_throws;
    }

    public void id_class(long l, int n) {
        this.id_byte.id_class(this.id_throws, this.id_break.id_byte(), n, l, this.id_protected);
    }

    public void id_class(String string) {
        this.id_catch = string;
    }

    private boolean id_class(int n, jL_2 jL_22) {
        return n == 0 || jL_22 == jL_2.UV;
    }

    public final jF_2 id_class() {
        return this.id_break;
    }

    public final jL_2 id_break() {
        return this.id_byte;
    }

    public void id_throws() {
        this.id_byte.id_class(this.id_protected);
    }

    public String id_catch() {
        return this.id_catch;
    }

    public final int id_case() {
        return this.id_throws;
    }

    public final int id_protected() {
        return this.id_case;
    }
}

