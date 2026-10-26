/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ComparisonChain
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.iB_2;
import celestial.rLR;
import celestial.rcd_3;
import com.google.common.collect.ComparisonChain;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rLY
implements Comparable<rLY> {
    private static final Logger id_class = LogManager.getLogger();
    private final rLR id_break;
    private int id_byte;
    private int id_protected;
    private boolean id_throws;
    private boolean id_case;
    private boolean id_catch;
    private boolean id_private;
    private boolean id_implements;
    private String id_finally;
    private rLY id_extends;

    public int id_byte(rLY rLY2) {
        return !(this.id_break() > 32147 && rLY2.id_break() > 32147 || this.id_protected() && rLY2.id_protected()) ? ComparisonChain.start().compare(Boolean.valueOf(this.id_protected()), Boolean.valueOf(rLY2.id_protected())).compare(this.id_break(), rLY2.id_break()).compare(this.id_class().id_case(), rLY2.id_class().id_case()).result() : ComparisonChain.start().compare(Boolean.valueOf(this.id_protected()), Boolean.valueOf(rLY2.id_protected())).compare(this.id_class().id_case(), rLY2.id_class().id_case()).result();
    }

    private void id_byte(rcd_3 rcd_32) {
        rcd_32.id_class("Amplifier", (byte)this.id_byte());
        rcd_32.id_break("Duration", this.id_break());
        rcd_32.id_class("Ambient", this.id_protected());
        rcd_32.id_class("ShowParticles", this.id_throws());
        rcd_32.id_class("ShowIcon", this.id_case());
        if (this.id_extends != null) {
            rcd_3 rcd_33 = new rcd_3();
            this.id_extends.id_class(rcd_33);
            rcd_32.id_class("HiddenEffect", rcd_33);
        }
    }

    public int id_byte() {
        return this.id_protected;
    }

    public rLY(rLR rLR2, int n, int n2, boolean bl, boolean bl2, boolean bl3, rLY rLY2) {
        this.id_break = rLR2;
        this.id_byte = n;
        this.id_protected = n2;
        this.id_case = bl;
        this.id_private = bl2;
        this.id_implements = bl3;
        this.id_extends = rLY2;
        this.id_finally = rLR2.id_protected().id_byte();
    }

    public rLY(rLY rLY2) {
        this.id_break = rLY2.id_break;
        this.id_class(rLY2);
    }

    public rLY(rLR rLR2) {
        this(rLR2, 0, 0);
    }

    public rLY(rLR rLR2, int n) {
        this(rLR2, n, 0);
    }

    public rLY(rLR rLR2, int n, int n2) {
        this(rLR2, n, n2, false, true);
    }

    public rLY(rLR rLR2, int n, int n2, boolean bl, boolean bl2) {
        this(rLR2, n, n2, bl, bl2, bl2);
    }

    public rLY(rLR rLR2, int n, int n2, boolean bl, boolean bl2, boolean bl3) {
        this(rLR2, n, n2, bl, bl2, bl3, null);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof rLY)) {
            return false;
        }
        rLY rLY2 = (rLY)object;
        return this.id_byte == rLY2.id_byte && this.id_protected == rLY2.id_protected && this.id_throws == rLY2.id_throws && this.id_case == rLY2.id_case && this.id_break.equals(rLY2.id_break);
    }

    public String toString() {
        String string = this.id_protected > 0 ? this.id_private() + " x " + (this.id_protected + 1) + ", Duration: " + this.id_byte : this.id_private() + ", Duration: " + this.id_byte;
        if (this.id_throws) {
            string = string + ", Splash: true";
        }
        if (!this.id_private) {
            string = string + ", Particles: false";
        }
        if (!this.id_implements) {
            string = string + ", Show Icon: false";
        }
        return string;
    }

    public int hashCode() {
        int n = this.id_break.hashCode();
        n = 31 * n + this.id_byte;
        n = 31 * n + this.id_protected;
        n = 31 * n + (this.id_throws ? 1 : 0);
        return 31 * n + (this.id_case ? 1 : 0);
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.id_byte((rLY)object);
    }

    public rcd_3 id_class(rcd_3 rcd_32) {
        rcd_32.id_class("Id", (byte)rLR.id_class(this.id_class()));
        this.id_byte(rcd_32);
        return rcd_32;
    }

    public rLR id_class() {
        return this.id_break;
    }

    public void id_class(iB_2 iB_22) {
        if (this.id_byte > 0) {
            this.id_break.id_class(iB_22, this.id_protected);
        }
    }

    public void id_class(rLY rLY2) {
        this.id_byte = rLY2.id_byte;
        this.id_protected = rLY2.id_protected;
        this.id_case = rLY2.id_case;
        this.id_private = rLY2.id_private;
        this.id_implements = rLY2.id_implements;
    }

    private static rLY id_class(rLR rLR2, rcd_3 rcd_32) {
        byte by = rcd_32.id_case("Amplifier");
        int n = rcd_32.id_private("Duration");
        boolean bl = rcd_32.id_new("Ambient");
        boolean bl2 = true;
        if (rcd_32.id_byte("ShowParticles", 1)) {
            bl2 = rcd_32.id_new("ShowParticles");
        }
        boolean bl3 = bl2;
        if (rcd_32.id_byte("ShowIcon", 1)) {
            bl3 = rcd_32.id_new("ShowIcon");
        }
        rLY rLY2 = null;
        if (rcd_32.id_byte("HiddenEffect", 10)) {
            rLY2 = rLY.id_class(rLR2, rcd_32.id_int("HiddenEffect"));
        }
        return new rLY(rLR2, n, by < 0 ? (byte)0 : by, bl, bl2, bl3, rLY2);
    }

    public boolean id_class(iB_2 iB_22, Runnable runnable) {
        if (this.id_byte > 0) {
            if (this.id_break.id_class(this.id_byte, this.id_protected)) {
                this.id_class(iB_22);
            }
            this.id_catch();
            if (this.id_byte == 0 && this.id_extends != null) {
                this.id_class(this.id_extends);
                this.id_extends = this.id_extends.id_extends;
                runnable.run();
            }
        }
        return this.id_byte > 0;
    }

    public void id_class(boolean bl) {
        this.id_catch = bl;
    }

    public boolean id_break(rLY rLY2) {
        if (this.id_break != rLY2.id_break) {
            id_class.warn("This method should only be called for matching effects!");
        }
        boolean bl = false;
        if (rLY2.id_protected > this.id_protected) {
            if (rLY2.id_byte < this.id_byte) {
                rLY rLY3 = this.id_extends;
                this.id_extends = new rLY(this);
                this.id_extends.id_extends = rLY3;
            }
            this.id_protected = rLY2.id_protected;
            this.id_byte = rLY2.id_byte;
            bl = true;
        } else if (rLY2.id_byte > this.id_byte) {
            if (rLY2.id_protected == this.id_protected) {
                this.id_byte = rLY2.id_byte;
                bl = true;
            } else if (this.id_extends == null) {
                this.id_extends = new rLY(rLY2);
            } else {
                this.id_extends.id_break(rLY2);
            }
        }
        if (!rLY2.id_case && this.id_case || bl) {
            this.id_case = rLY2.id_case;
            bl = true;
        }
        if (rLY2.id_private != this.id_private) {
            this.id_private = rLY2.id_private;
            bl = true;
        }
        if (rLY2.id_implements != this.id_implements) {
            this.id_implements = rLY2.id_implements;
            bl = true;
        }
        return bl;
    }

    public static rLY id_break(rcd_3 rcd_32) {
        byte by = rcd_32.id_case("Id");
        rLR rLR2 = rLR.id_class(by);
        return rLR2 == null ? null : rLY.id_class(rLR2, rcd_32);
    }

    public int id_break() {
        return this.id_byte;
    }

    public boolean id_throws() {
        return this.id_private;
    }

    public boolean id_finally() {
        return this.id_throws;
    }

    public int id_catch() {
        if (this.id_extends != null) {
            this.id_extends.id_catch();
        }
        return --this.id_byte;
    }

    public boolean id_extends() {
        return this.id_catch;
    }

    public boolean id_case() {
        return this.id_implements;
    }

    public boolean id_implements() {
        return this.id_catch;
    }

    public boolean id_protected() {
        return this.id_case;
    }

    public String id_private() {
        return this.id_break.id_byte();
    }

    public String id_final() {
        return this.id_finally;
    }

    public rLY id_volatile() {
        return this.id_extends;
    }

    public boolean id_native() {
        return this.id_private;
    }
}

