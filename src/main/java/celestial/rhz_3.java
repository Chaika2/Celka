/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
package celestial;

import celestial.KU;
import celestial.KY;
import celestial.Ko_1;
import celestial.rFM;
import celestial.rWr_1;
import celestial.rXC;
import celestial.rXN;
import celestial.rXQ;
import celestial.rXu_1;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rcy_3;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rhN_2;
import celestial.rhd_3;
import celestial.rhx_3;
import celestial.rlb_3;
import celestial.rpA_2;
import celestial.rqs_3;
import celestial.rxS_2;
import celestial.rye_3;
import celestial.xc_3;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.Predicate;

public class rhz_3
implements rXu_1,
rpA_2 {
    public final rqs_3<rdn_3> id_class = rqs_3.id_class(36, rdn_3.id_break);
    public final rqs_3<rdn_3> id_break = rqs_3.id_class(4, rdn_3.id_break);
    public final rqs_3<rdn_3> id_byte = rqs_3.id_class(1, rdn_3.id_break);
    private final List<rqs_3<rdn_3>> id_case = ImmutableList.of(this.id_class, this.id_break, this.id_byte);
    public int id_protected;
    public final rhd_3 id_throws;
    private rdn_3 id_catch = rdn_3.id_break;
    private int id_private;

    public int id_byte(rdn_3 rdn_32) {
        for (int i = 0; i < this.id_class.size(); ++i) {
            rdn_3 rdn_33 = this.id_class.get(i);
            if (this.id_class.get(i).id_class() || !this.id_break(rdn_32, this.id_class.get(i)) || this.id_class.get(i).id_case() || rdn_33.id_public() || rdn_33.id_this()) continue;
            return i;
        }
        return -1;
    }

    @Override
    public boolean id_byte(rhd_3 rhd_32) {
        if (((Boolean)this.id_throws.id_throws[27]).booleanValue()) {
            return false;
        }
        return !(rhd_32.id_int(this.id_throws) > 64.0);
    }

    public rdn_3 id_byte(int n) {
        return this.id_break.get(n);
    }

    public rdn_3 id_byte() {
        return rhz_3.id_break(this.id_protected) ? this.id_class.get(this.id_protected) : rdn_3.id_break;
    }

    private int id_byte(int n, rdn_3 rdn_32) {
        rdb_3 rdb_32 = rdn_32.id_break();
        int n2 = rdn_32.id_char();
        rdn_3 rdn_33 = this.id_extends(n);
        if (rdn_33.id_class()) {
            rdn_33 = new rdn_3(rdb_32, 0);
            if (rdn_32.id_final()) {
                rdn_33.id_byte(rdn_32.id_package().id_catch());
            }
            this.id_break(n, rdn_33);
        }
        int n3 = n2;
        if (n2 > rdn_33.id_byte() - rdn_33.id_char()) {
            n3 = rdn_33.id_byte() - rdn_33.id_char();
        }
        if (n3 > this.ab_() - rdn_33.id_char()) {
            n3 = this.ab_() - rdn_33.id_char();
        }
        if (n3 == 0) {
            return n2;
        }
        rdn_33.id_case(n3);
        rdn_33.id_protected(5);
        return n2 -= n3;
    }

    public rhz_3(rhd_3 rhd_32) {
        this.id_throws = rhd_32;
    }

    private boolean id_class(rdn_3 rdn_32, rdn_3 rdn_33) {
        return !rdn_32.id_class() && this.id_break(rdn_32, rdn_33) && rdn_32.id_protected() && rdn_32.id_char() < rdn_32.id_byte() && rdn_32.id_char() < this.ab_();
    }

    public void id_class(rWr_1 rWr_12) {
        for (rdn_3 rdn_32 : this.id_class) {
            rWr_12.id_class(rdn_32);
        }
    }

    public boolean id_class(rlb_3<rdb_3> rlb_32) {
        for (List list : this.id_case) {
            for (rdn_3 rdn_32 : list) {
                if (rdn_32.id_class() || !rlb_32.id_class(rdn_32.id_break())) continue;
                return true;
            }
        }
        return false;
    }

    public boolean id_class(int n, rdn_3 rdn_32) {
        if (rdn_32.id_class()) {
            return false;
        }
        try {
            int n2;
            if (rdn_32.id_case()) {
                if (n == -1) {
                    n = this.id_throws();
                }
                if (n >= 0) {
                    this.id_class.set(n, rdn_32.id_implements());
                    this.id_class.get(n).id_protected(5);
                    rdn_32.id_throws(0);
                    return true;
                }
                if (((rhx_3)this.id_throws.id_implements[18]).id_protected) {
                    rdn_32.id_throws(0);
                    return true;
                }
                return false;
            }
            do {
                n2 = rdn_32.id_char();
                if (n == -1) {
                    rdn_32.id_throws(this.id_finally(rdn_32));
                    continue;
                }
                rdn_32.id_throws(this.id_byte(n, rdn_32));
            } while (!rdn_32.id_class() && rdn_32.id_char() < n2);
            if (rdn_32.id_char() == n2 && ((rhx_3)this.id_throws.id_implements[18]).id_protected) {
                rdn_32.id_throws(0);
                return true;
            }
            return rdn_32.id_char() < n2;
        }
        catch (Throwable throwable) {
            KY kY = KY.id_class(throwable, "Adding item to inventory");
            Ko_1 ko_1 = kY.id_class("Item being added");
            ko_1.id_class("Item ID", rdb_3.id_class(rdn_32.id_break()));
            ko_1.id_class("Item data", rdn_32.id_catch());
            ko_1.id_class("Item name", () -> rdn_32.id_continue().getString());
            throw new KU(kY);
        }
    }

    public void id_class(rye_3 rye_32, float f) {
        if (!(f <= 0.0f)) {
            if ((f /= 4.0f) < 1.0f) {
                f = 1.0f;
            }
            for (int i = 0; i < this.id_break.size(); ++i) {
                rdn_3 rdn_32 = this.id_break.get(i);
                if (rye_32.id_int() && rdn_32.id_break().id_else() || !(rdn_32.id_break() instanceof rxS_2)) continue;
                int n = i;
                rdn_32.id_class((int)f, this.id_throws, (T rhd_32) -> rhd_32.id_break(rXQ.id_class(rXN.ARMOR, n)));
            }
        }
    }

    public void id_class(rYB rYB2, rdn_3 rdn_32) {
        if (!rYB2.id_continue) {
            while (!rdn_32.id_class()) {
                int n = this.id_protected(rdn_32);
                if (n == -1) {
                    n = this.id_throws();
                }
                if (n == -1) {
                    this.id_throws.id_class(rdn_32, false);
                    break;
                }
                int n2 = rdn_32.id_byte() - this.id_extends(n).id_char();
                if (!this.id_class(n, rdn_32.id_class(n2))) continue;
                ((rhN_2)this.id_throws).id_class.id_class(new rFM(-2, n, this.id_extends(n)));
            }
        }
    }

    @Override
    public rdn_3 id_class(int n, int n2) {
        rqs_3<rdn_3> rqs_32 = null;
        for (rqs_3<rdn_3> rqs_33 : this.id_case) {
            if (n < rqs_33.size()) {
                rqs_32 = rqs_33;
                break;
            }
            n -= rqs_33.size();
        }
        return rqs_32 != null && !((rdn_3)rqs_32.get(n)).id_class() ? rXC.id_class(rqs_32, n, n2) : rdn_3.id_break;
    }

    public float id_class(xc_3 xc_32) {
        return this.id_class(this.id_class.get(this.id_protected), xc_32);
    }

    public rcy_3 id_class(rcy_3 rcy_32) {
        rcd_3 rcd_32;
        int n;
        for (n = 0; n < this.id_class.size(); ++n) {
            if (this.id_class.get(n).id_class()) continue;
            rcd_32 = new rcd_3();
            rcd_32.id_class("Slot", (byte)n);
            this.id_class.get(n).id_break(rcd_32);
            rcy_32.add(rcd_32);
        }
        for (n = 0; n < this.id_break.size(); ++n) {
            if (this.id_break.get(n).id_class()) continue;
            rcd_32 = new rcd_3();
            rcd_32.id_class("Slot", (byte)(n + 100));
            this.id_break.get(n).id_break(rcd_32);
            rcy_32.add(rcd_32);
        }
        for (n = 0; n < this.id_byte.size(); ++n) {
            if (this.id_byte.get(n).id_class()) continue;
            rcd_32 = new rcd_3();
            rcd_32.id_class("Slot", (byte)(n + 150));
            this.id_byte.get(n).id_break(rcd_32);
            rcy_32.add(rcd_32);
        }
        return rcy_32;
    }

    public void id_class(int n) {
        this.id_protected = this.id_case();
        rdn_3 rdn_32 = this.id_class.get(this.id_protected);
        this.id_class.set(this.id_protected, this.id_class.get(n));
        this.id_class.set(n, rdn_32);
    }

    public void id_class(rdn_3 rdn_32) {
        int n = this.id_break(rdn_32);
        if (rhz_3.id_break(n)) {
            this.id_protected = n;
        } else if (n == -1) {
            int n2;
            this.id_protected = this.id_case();
            if (!this.id_class.get(this.id_protected).id_class() && (n2 = this.id_throws()) != -1) {
                this.id_class.set(n2, this.id_class.get(this.id_protected));
            }
            this.id_class.set(this.id_protected, rdn_32);
        } else {
            this.id_class(n);
        }
    }

    public int id_class(Predicate<rdn_3> predicate, int n, rXu_1 rXu_12) {
        int n2 = 0;
        boolean bl = n == 0;
        n2 += rXC.id_class(this, predicate, n - n2, bl);
        n2 += rXC.id_class(rXu_12, predicate, n - n2, bl);
        n2 += rXC.id_class(this.id_catch, predicate, n - n2, bl);
        if (this.id_catch.id_class()) {
            this.id_catch = rdn_3.id_break;
        }
        return n2;
    }

    public void id_class(double d) {
        if (d > 0.0) {
            d = 1.0;
        }
        if (d < 0.0) {
            d = -1.0;
        }
        this.id_protected = (int)((double)this.id_protected - d);
        while (this.id_protected < 0) {
            this.id_protected += 9;
        }
        while (this.id_protected >= 9) {
            this.id_protected -= 9;
        }
    }

    public void id_class(rhz_3 rhz_32) {
        for (int i = 0; i < this.id_else(); ++i) {
            this.id_break(i, rhz_32.id_extends(i));
        }
        this.id_protected = rhz_32.id_protected;
    }

    public float id_class(rdn_3 rdn_32, xc_3 xc_32) {
        if (rdn_32 == null) {
            return this.id_class(xc_32);
        }
        return rdn_32.id_class(xc_32);
    }

    @Override
    public rgP_2 g() {
        return new rgn_3("container.inventory");
    }

    @Override
    public void id_break() {
        ++this.id_private;
    }

    public int id_break(rdn_3 rdn_32) {
        for (int i = 0; i < this.id_class.size(); ++i) {
            if (this.id_class.get(i).id_class() || !this.id_break(rdn_32, this.id_class.get(i))) continue;
            return i;
        }
        return -1;
    }

    public static boolean id_break(int n) {
        return n >= 0 && n < 9;
    }

    public void id_break(rcy_3 rcy_32) {
        this.id_class.clear();
        this.id_break.clear();
        this.id_byte.clear();
        for (int i = 0; i < rcy_32.size(); ++i) {
            rcd_3 rcd_32 = rcy_32.id_class(i);
            int n = rcd_32.id_case("Slot") & 0xFF;
            rdn_3 rdn_32 = rdn_3.id_class(rcd_32);
            if (rdn_32.id_class()) continue;
            if (n >= 0 && n < this.id_class.size()) {
                this.id_class.set(n, rdn_32);
                continue;
            }
            if (n >= 100 && n < this.id_break.size() + 100) {
                this.id_break.set(n - 100, rdn_32);
                continue;
            }
            if (n < 150 || n >= this.id_byte.size() + 150) continue;
            this.id_byte.set(n - 150, rdn_32);
        }
    }

    @Override
    public void id_break(int n, rdn_3 rdn_32) {
        rqs_3<rdn_3> rqs_32 = null;
        for (rqs_3<rdn_3> rqs_33 : this.id_case) {
            if (n < rqs_33.size()) {
                rqs_32 = rqs_33;
                break;
            }
            n -= rqs_33.size();
        }
        if (rqs_32 != null) {
            rqs_32.set(n, rdn_32);
        }
    }

    private boolean id_break(rdn_3 rdn_32, rdn_3 rdn_33) {
        return rdn_32.id_break() == rdn_33.id_break() && rdn_3.id_class(rdn_32, rdn_33);
    }

    public boolean id_throws(rdn_3 rdn_32) {
        return this.id_class(-1, rdn_32);
    }

    public int id_throws() {
        for (int i = 0; i < this.id_class.size(); ++i) {
            if (!this.id_class.get(i).id_class()) continue;
            return i;
        }
        return -1;
    }

    private int id_finally(rdn_3 rdn_32) {
        int n = this.id_protected(rdn_32);
        if (n == -1) {
            n = this.id_throws();
        }
        return n == -1 ? rdn_32.id_char() : this.id_byte(n, rdn_32);
    }

    public rdn_3 id_finally() {
        return this.id_catch;
    }

    public void id_catch(rdn_3 rdn_32) {
        block0: for (rqs_3<rdn_3> rqs_32 : this.id_case) {
            for (int i = 0; i < rqs_32.size(); ++i) {
                if (rqs_32.get(i) != rdn_32) continue;
                rqs_32.set(i, rdn_3.id_break);
                continue block0;
            }
        }
    }

    public void id_catch() {
        for (rqs_3<rdn_3> rqs_32 : this.id_case) {
            for (int i = 0; i < rqs_32.size(); ++i) {
                if (rqs_32.get(i).id_class()) continue;
                rqs_32.get(i).id_class((rYB)this.id_throws.id_throws[7], this.id_throws, i, this.id_protected == i);
            }
        }
    }

    public List<rqs_3<rdn_3>> id_extends() {
        return this.id_case;
    }

    private int id_extends(rdn_3 rdn_32) {
        int n = this.id_protected(rdn_32);
        if (n == -1) {
            n = this.id_throws();
        }
        return n == -1 ? rdn_32.id_char() : this.id_protected(n, rdn_32);
    }

    @Override
    public rdn_3 id_extends(int n) {
        rqs_3<rdn_3> rqs_32 = null;
        for (rqs_3<rdn_3> rqs_33 : this.id_case) {
            if (n < rqs_33.size()) {
                rqs_32 = rqs_33;
                break;
            }
            n -= rqs_33.size();
        }
        return rqs_32 == null ? rdn_3.id_break : (rdn_3)rqs_32.get(n);
    }

    public int id_case() {
        int n;
        int n2;
        for (n2 = 0; n2 < 9; ++n2) {
            n = (this.id_protected + n2) % 9;
            if (!this.id_class.get(n).id_class()) continue;
            return n;
        }
        for (n2 = 0; n2 < 9; ++n2) {
            n = (this.id_protected + n2) % 9;
            if (this.id_class.get(n).id_public()) continue;
            return n;
        }
        return this.id_protected;
    }

    public boolean id_case(rdn_3 rdn_32) {
        if (rdn_32.id_class()) {
            return false;
        }
        try {
            int n;
            rdn_32 = rdn_32.id_implements();
            if (rdn_32.id_case()) {
                int n2 = this.id_throws();
                if (n2 >= 0) {
                    rdn_32.id_throws(0);
                    return true;
                }
                if (((rhx_3)this.id_throws.id_implements[18]).id_protected) {
                    rdn_32.id_throws(0);
                    return true;
                }
                return false;
            }
            do {
                n = rdn_32.id_char();
                rdn_32.id_throws(this.id_extends(rdn_32));
            } while (!rdn_32.id_class() && rdn_32.id_char() < n);
            if (rdn_32.id_char() == n && ((rhx_3)this.id_throws.id_implements[18]).id_protected) {
                rdn_32.id_throws(0);
                return true;
            }
            return rdn_32.id_char() < n;
        }
        catch (Throwable throwable) {
            KY kY = KY.id_class(throwable, "Adding item to inventory");
            Ko_1 ko_1 = kY.id_class("Item being added");
            ko_1.id_class("Item ID", rdb_3.id_class(rdn_32.id_break()));
            ko_1.id_class("Item data", rdn_32.id_catch());
            rdn_3 rdn_33 = rdn_32;
            ko_1.id_class("Item name", () -> rdn_33.id_continue().getString());
            throw new KU(kY);
        }
    }

    @Override
    public int id_else() {
        return this.id_class.size() + this.id_break.size() + this.id_byte.size();
    }

    public int id_implements() {
        return this.id_private;
    }

    public boolean id_implements(rdn_3 rdn_32) {
        for (List list : this.id_case) {
            for (rdn_3 rdn_33 : list) {
                if (rdn_33.id_class() || !rdn_33.id_class(rdn_32)) continue;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean id_return() {
        for (rdn_3 rdn_32 : this.id_class) {
            if (rdn_32.id_class()) continue;
            return false;
        }
        for (rdn_3 rdn_32 : this.id_break) {
            if (rdn_32.id_class()) continue;
            return false;
        }
        for (rdn_3 rdn_32 : this.id_byte) {
            if (rdn_32.id_class()) continue;
            return false;
        }
        return true;
    }

    @Override
    public void id_public() {
        for (List list : this.id_case) {
            list.clear();
        }
    }

    public static int id_protected() {
        return 9;
    }

    public int id_protected(rdn_3 rdn_32) {
        if (this.id_class(this.id_extends(this.id_protected), rdn_32)) {
            return this.id_protected;
        }
        if (this.id_class(this.id_extends(40), rdn_32)) {
            return 40;
        }
        for (int i = 0; i < this.id_class.size(); ++i) {
            if (!this.id_class(this.id_class.get(i), rdn_32)) continue;
            return i;
        }
        return -1;
    }

    private int id_protected(int n, rdn_3 rdn_32) {
        rdb_3 rdb_32 = rdn_32.id_break();
        int n2 = rdn_32.id_char();
        rdn_3 rdn_33 = this.id_extends(n);
        if (rdn_33.id_class()) {
            rdn_33 = new rdn_3(rdb_32, 0);
            if (rdn_32.id_final()) {
                rdn_33.id_byte(rdn_32.id_package().id_catch());
            }
        }
        int n3 = n2;
        if (n2 > rdn_33.id_byte() - rdn_33.id_char()) {
            n3 = rdn_33.id_byte() - rdn_33.id_char();
        }
        if (n3 > this.ab_() - rdn_33.id_char()) {
            n3 = this.ab_() - rdn_33.id_char();
        }
        if (n3 != 0) {
            n2 -= n3;
        }
        return n2;
    }

    public void id_private(rdn_3 rdn_32) {
        this.id_catch = rdn_32;
    }

    public void id_private() {
        for (List list : this.id_case) {
            for (int i = 0; i < list.size(); ++i) {
                rdn_3 rdn_32 = (rdn_3)list.get(i);
                if (rdn_32.id_class()) continue;
                this.id_throws.id_class(rdn_32, true, false);
                list.set(i, rdn_3.id_break);
            }
        }
    }

    @Override
    public rdn_3 id_native(int n) {
        rqs_3<rdn_3> rqs_32 = null;
        for (rqs_3<rdn_3> rqs_33 : this.id_case) {
            if (n < rqs_33.size()) {
                rqs_32 = rqs_33;
                break;
            }
            n -= rqs_33.size();
        }
        if (rqs_32 != null && !((rdn_3)rqs_32.get(n)).id_class()) {
            rdn_3 rdn_32 = rqs_32.get(n);
            rqs_32.set(n, rdn_3.id_break);
            return rdn_32;
        }
        return rdn_3.id_break;
    }
}

