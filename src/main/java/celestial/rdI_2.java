/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rcd_3;
import celestial.rco_3;
import celestial.rdn_3;
import celestial.rfU_2;

public class rdI_2 {
    private final rdn_3 id_class;
    private final rdn_3 id_break;
    private final rdn_3 id_byte;
    private int id_protected;
    private final int id_throws;
    private boolean id_case = true;
    private int id_catch;
    private int id_private;
    private float id_implements;
    private int id_finally = 1;

    private boolean id_byte(rdn_3 rdn_32, rdn_3 rdn_33) {
        if (rdn_33.id_class() && rdn_32.id_class()) {
            return true;
        }
        rdn_3 rdn_34 = rdn_32.id_implements();
        if (rdn_34.id_break().id_extends()) {
            rdn_34.id_break(rdn_34.id_catch());
        }
        return rdn_3.id_byte(rdn_34, rdn_33) && (!rdn_33.id_final() || rdn_34.id_final() && rco_3.id_class(rdn_33.id_package(), rdn_34.id_package(), false));
    }

    public rdn_3 id_byte() {
        return this.id_break;
    }

    public boolean id_int() {
        return this.id_protected >= this.id_throws;
    }

    public rdI_2(rdn_3 rdn_32, rdn_3 rdn_33, rdn_3 rdn_34, int n, int n2, int n3, float f, int n4) {
        this.id_class = rdn_32;
        this.id_break = rdn_33;
        this.id_byte = rdn_34;
        this.id_protected = n;
        this.id_throws = n2;
        this.id_finally = n3;
        this.id_implements = f;
        this.id_private = n4;
    }

    public rdI_2(rcd_3 rcd_32) {
        this.id_class = rdn_3.id_class(rcd_32.id_int("buy"));
        this.id_break = rdn_3.id_class(rcd_32.id_int("buyB"));
        this.id_byte = rdn_3.id_class(rcd_32.id_int("sell"));
        this.id_protected = rcd_32.id_private("uses");
        this.id_throws = rcd_32.id_byte("maxUses", 99) ? rcd_32.id_private("maxUses") : 4;
        if (rcd_32.id_byte("rewardExp", 1)) {
            this.id_case = rcd_32.id_new("rewardExp");
        }
        if (rcd_32.id_byte("xp", 3)) {
            this.id_finally = rcd_32.id_private("xp");
        }
        if (rcd_32.id_byte("priceMultiplier", 5)) {
            this.id_implements = rcd_32.id_finally("priceMultiplier");
        }
        this.id_catch = rcd_32.id_private("specialPrice");
        this.id_private = rcd_32.id_private("demand");
    }

    public rdI_2(rdn_3 rdn_32, rdn_3 rdn_33, int n, int n2, float f) {
        this(rdn_32, rdn_3.id_break, rdn_33, n, n2, f);
    }

    public rdI_2(rdn_3 rdn_32, rdn_3 rdn_33, rdn_3 rdn_34, int n, int n2, int n3, float f) {
        this(rdn_32, rdn_33, rdn_34, n, n2, n3, f, 0);
    }

    public rdI_2(rdn_3 rdn_32, rdn_3 rdn_33, rdn_3 rdn_34, int n, int n2, float f) {
        this(rdn_32, rdn_33, rdn_34, 0, n, n2, f);
    }

    public rcd_3 id_this() {
        rcd_3 rcd_32 = new rcd_3();
        rcd_32.id_class("buy", this.id_class.id_break(new rcd_3()));
        rcd_32.id_class("sell", this.id_byte.id_break(new rcd_3()));
        rcd_32.id_class("buyB", this.id_break.id_break(new rcd_3()));
        rcd_32.id_break("uses", this.id_protected);
        rcd_32.id_break("maxUses", this.id_throws);
        rcd_32.id_class("rewardExp", this.id_case);
        rcd_32.id_break("xp", this.id_finally);
        rcd_32.id_class("priceMultiplier", this.id_implements);
        rcd_32.id_break("specialPrice", this.id_catch);
        rcd_32.id_break("demand", this.id_private);
        return rcd_32;
    }

    public void id_class(int n) {
        this.id_catch += n;
    }

    public boolean id_class(rdn_3 rdn_32, rdn_3 rdn_33) {
        return this.id_byte(rdn_32, this.id_break()) && rdn_32.id_char() >= this.id_break().id_char() && this.id_byte(rdn_33, this.id_break) && rdn_33.id_char() >= this.id_break.id_char();
    }

    public rdn_3 id_class() {
        return this.id_class;
    }

    public void id_break(int n) {
        this.id_catch = n;
    }

    public boolean id_break(rdn_3 rdn_32, rdn_3 rdn_33) {
        if (!this.id_class(rdn_32, rdn_33)) {
            return false;
        }
        rdn_32.id_catch(this.id_break().id_char());
        if (!this.id_byte().id_class()) {
            rdn_33.id_catch(this.id_byte().id_char());
        }
        return true;
    }

    public rdn_3 id_break() {
        int n = this.id_class.id_char();
        rdn_3 rdn_32 = this.id_class.id_implements();
        int n2 = Math.max(0, rfU_2.id_protected((float)(n * this.id_private) * this.id_implements));
        rdn_32.id_throws(rfU_2.id_class(n + n2 + this.id_catch, 1, this.id_class.id_break().id_implements()));
        return rdn_32;
    }

    public void id_throws() {
        this.id_private = this.id_private + this.id_protected - (this.id_throws - this.id_protected);
    }

    public void id_finally() {
        ++this.id_protected;
    }

    public int id_catch() {
        return this.id_protected;
    }

    public int id_extends() {
        return this.id_private;
    }

    public rdn_3 id_case() {
        return this.id_byte.id_implements();
    }

    public boolean id_continue() {
        return this.id_protected > 0;
    }

    public int id_implements() {
        return this.id_throws;
    }

    public void id_new() {
        this.id_protected = this.id_throws;
    }

    public int id_package() {
        return this.id_finally;
    }

    public boolean id_super() {
        return this.id_case;
    }

    public rdn_3 id_protected() {
        return this.id_byte;
    }

    public void id_private() {
        this.id_protected = 0;
    }

    public float id_final() {
        return this.id_implements;
    }

    public int id_volatile() {
        return this.id_catch;
    }

    public void id_native() {
        this.id_catch = 0;
    }
}

