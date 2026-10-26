/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.LZ;
import celestial.Ma_1;
import celestial.Ml_1;
import celestial.QY;
import celestial.Qj_1;
import celestial.cC_2;
import celestial.ch_3;
import celestial.cm_3;
import celestial.cp_3;
import celestial.ju_3;
import celestial.lD_2;
import celestial.rVi_1;
import celestial.rfU_2;
import celestial.rgP_2;
import celestial.rgc_3;
import celestial.rgn_3;
import celestial.rpl_3;
import celestial.rqR_2;
import celestial.rqu_3;
import celestial.rrFg_1;
import celestial.rrQX;
import celestial.rrvs_1;
import celestial.vm_3;
import celestial.vs_3;
import celestial.yb_3;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Lu_1
extends LZ
implements cC_2,
cp_3,
rrvs_1 {
    private final cm_3 id_class;
    private String id_throws = "";
    private rgP_2 id_case;
    private int id_catch = 32;
    private int id_private;
    private boolean id_implements = true;
    private boolean id_super = true;
    private boolean id_this = true;
    private boolean id_else;
    private int id_synchronized;
    private int id_return;
    private int id_public;
    private int id_goto = 0xE0E0E0;
    private int id_while = 0x707070;
    private String id_try;
    private Consumer<String> id_instanceof;
    private Predicate<String> id_throw = Objects::nonNull;
    private BiFunction<String, Integer, rpl_3> id_interface = this.id_continue();

    public Lu_1 id_byte(String string) {
        this.id_try = string;
        return this;
    }

    public void id_byte(boolean bl) {
        super.id_implements(bl);
    }

    public void id_byte(int n) {
        if (!this.id_throws.isEmpty()) {
            if (this.id_public != this.id_return) {
                this.id_break("");
            } else {
                this.id_protected(this.id_throws(n) - this.id_return);
            }
        }
    }

    public boolean id_int() {
        return this.id_new;
    }

    public Lu_1(cm_3 cm_32, int n, int n2, int n3, int n4, rgP_2 rgP_22) {
        this(cm_32, n, n2, n3, n4, null, rgP_22, true);
    }

    public Lu_1(cm_3 cm_32, int n, int n2, int n3, int n4, Lu_1 lu_1, rgP_2 rgP_22, boolean bl) {
        super(n, n2, n3, n4, rgP_22);
        this.id_class = cm_32;
        if (lu_1 != null) {
            this.id_class(lu_1.id_private());
        }
        if (bl) {
            vs_3.INSTANCE.id_class(this);
        }
    }

    public float id_this() {
        return this.id_final;
    }

    private int id_class(int n, int n2) {
        return this.id_class(n, n2, true);
    }

    private int id_class(int n, int n2, boolean bl) {
        int n3 = n2;
        boolean bl2 = n < 0;
        int n4 = Math.abs(n);
        for (int i = 0; i < n4; ++i) {
            if (!bl2) {
                int n5 = this.id_throws.length();
                if ((n3 = this.id_throws.indexOf(32, n3)) == -1) {
                    n3 = n5;
                    continue;
                }
                while (bl && n3 < n5 && this.id_throws.charAt(n3) == ' ') {
                    ++n3;
                }
                continue;
            }
            while (bl && n3 > 0 && this.id_throws.charAt(n3 - 1) == ' ') {
                --n3;
            }
            while (n3 > 0 && this.id_throws.charAt(n3 - 1) != ' ') {
                --n3;
            }
        }
        return n3;
    }

    @Override
    public boolean id_class(int n, int n2, int n3) {
        if (!this.id_volatile()) {
            return false;
        }
        this.id_else = vm_3.id_synchronized();
        if (vm_3.id_private(n)) {
            this.id_native();
            this.id_native(0);
            return true;
        }
        if (vm_3.id_catch(n)) {
            ((Qj_1)QY.id_instanceof().id_class[23]).id_class(this.id_implements());
            return true;
        }
        if (vm_3.id_case(n)) {
            if (this.id_this) {
                this.id_break(((Qj_1)QY.id_instanceof().id_class[23]).id_class());
            }
            return true;
        }
        if (vm_3.id_throws(n)) {
            ((Qj_1)QY.id_instanceof().id_class[23]).id_class(this.id_implements());
            if (this.id_this) {
                this.id_break("");
            }
            return true;
        }
        switch (n) {
            case 259: {
                if (this.id_this) {
                    this.id_else = false;
                    this.id_new(-1);
                    this.id_else = vm_3.id_synchronized();
                }
                return true;
            }
            default: {
                return false;
            }
            case 261: {
                if (this.id_this) {
                    this.id_else = false;
                    this.id_new(1);
                    this.id_else = vm_3.id_synchronized();
                }
                return true;
            }
            case 262: {
                if (vm_3.id_else()) {
                    this.id_catch(this.id_throws(1));
                } else {
                    this.id_case(1);
                }
                return true;
            }
            case 263: {
                if (vm_3.id_else()) {
                    this.id_catch(this.id_throws(-1));
                } else {
                    this.id_case(-1);
                }
                return true;
            }
            case 268: {
                this.id_extends();
                return true;
            }
            case 269: 
        }
        this.id_native();
        return true;
    }

    @Override
    public boolean id_class(char c, int n) {
        if (!this.id_volatile()) {
            return false;
        }
        if (rqu_3.id_class(c)) {
            if (this.id_this) {
                this.id_break(Character.toString(c));
            }
            return true;
        }
        return false;
    }

    public Lu_1 id_class(rgP_2 rgP_22) {
        this.id_case = rgP_22;
        return this;
    }

    public void id_class(Predicate<String> predicate) {
        this.id_throw = predicate;
    }

    public void id_class(String string) {
        if (this.id_throw.test(string)) {
            this.id_throws = string.length() > this.id_catch ? string.substring(0, this.id_catch) : string;
            this.id_native();
            this.id_native(this.id_return);
            this.id_protected(string);
        }
    }

    public void id_class(BiFunction<String, Integer, rpl_3> biFunction) {
        this.id_interface = biFunction;
    }

    public void id_class(Consumer<String> consumer) {
        this.id_instanceof = consumer;
    }

    @Override
    public boolean id_break(boolean bl) {
        return this.id_new && this.id_this ? super.id_break(bl) : false;
    }

    @Override
    public boolean id_break(double d, double d2) {
        return this.id_new && d >= (double)this.id_volatile && d < (double)(this.id_volatile + this.id_extends) && d2 >= (double)this.id_final && d2 < (double)(this.id_final + this.id_native);
    }

    @Override
    public boolean id_break(double d, double d2, int n) {
        boolean bl;
        if (!this.id_int()) {
            return false;
        }
        boolean bl2 = bl = d >= (double)this.id_volatile && d < (double)(this.id_volatile + this.id_extends) && d2 >= (double)this.id_final && d2 < (double)(this.id_final + this.id_native);
        if (this.id_super) {
            this.id_byte(bl);
        }
        if (this.aO_() && bl && n == 0) {
            int n2 = rfU_2.id_byte(d) - this.id_volatile;
            if (this.id_implements) {
                n2 -= 4;
            }
            String string = this.id_class.id_class(this.id_throws.substring(this.id_synchronized), this.id_package());
            this.id_catch(this.id_class.id_class(string, n2).length() + this.id_synchronized);
            return true;
        }
        return false;
    }

    private void id_break(int n, int n2, int n3, int n4) {
        int n5;
        if (n < n3) {
            n5 = n;
            n = n3;
            n3 = n5;
        }
        if (n2 < n4) {
            n5 = n2;
            n2 = n4;
            n4 = n5;
        }
        if (n3 > this.id_volatile + this.id_extends) {
            n3 = this.id_volatile + this.id_extends;
        }
        if (n > this.id_volatile + this.id_extends) {
            n = this.id_volatile + this.id_extends;
        }
        yb_3 yb_32 = yb_3.id_class();
        lD_2 lD_22 = yb_32.id_byte();
        RenderSystem.color4f(0.0f, 0.0f, 255.0f, 255.0f);
        RenderSystem.disableTexture();
        RenderSystem.enableColorLogicOp();
        RenderSystem.logicOp(Ma_1.OR_REVERSE);
        lD_22.id_class(7, ju_3.id_super);
        lD_22.id_class((double)n, (double)n4, 0.0).id_class();
        lD_22.id_class((double)n3, (double)n4, 0.0).id_class();
        lD_22.id_class((double)n3, (double)n2, 0.0).id_class();
        lD_22.id_class((double)n, (double)n2, 0.0).id_class();
        yb_32.id_break();
        RenderSystem.disableColorLogicOp();
        RenderSystem.enableTexture();
    }

    public void id_break(String string) {
        String string2;
        String string3;
        int n;
        int n2 = this.id_return < this.id_public ? this.id_return : this.id_public;
        int n3 = this.id_return < this.id_public ? this.id_public : this.id_return;
        int n4 = this.id_catch - this.id_throws.length() - (n2 - n3);
        if (n4 < (n = (string3 = rqu_3.id_class(string)).length())) {
            string3 = string3.substring(0, n4);
            n = n4;
        }
        if (this.id_throw.test(string2 = new StringBuilder(this.id_throws).replace(n2, n3, string3).toString())) {
            this.id_throws = string2;
            this.id_private(n2 + n);
            this.id_native(this.id_return);
            this.id_protected(this.id_throws);
        }
    }

    @Override
    public void id_break(Ml_1 ml_1, int n, int n2, float f) {
        if (this.id_int()) {
            int n3;
            boolean bl = this.aO_();
            if (this.id_while()) {
                n3 = bl ? -1 : -6250336;
                Lu_1.id_class(ml_1, this.id_volatile - 1, this.id_final - 1, this.id_volatile + this.id_extends + 1, this.id_final + this.id_native + 1, n3);
                Lu_1.id_class(ml_1, this.id_volatile, this.id_final, this.id_volatile + this.id_extends, this.id_final + this.id_native, -16777216);
            }
            n3 = this.id_this ? this.id_goto : this.id_while;
            int n4 = this.id_return - this.id_synchronized;
            int n5 = this.id_public - this.id_synchronized;
            String string = this.id_class.id_class(this.id_throws.substring(this.id_synchronized), this.id_package());
            boolean bl2 = n4 >= 0 && n4 <= string.length();
            boolean bl3 = bl && this.id_private / 6 % 2 == 0 && bl2;
            int n6 = this.id_implements ? this.id_volatile + 4 : this.id_volatile;
            int n7 = this.id_implements ? this.id_final + (this.id_native - 8) / 2 : this.id_final;
            int n8 = n6;
            if (n5 > string.length()) {
                n5 = string.length();
            }
            if (!string.isEmpty()) {
                String string2 = bl2 ? string.substring(0, n4) : string;
                n8 = this.id_class.id_class(ml_1, this.id_interface.apply(string2, this.id_synchronized), (float)n6, (float)n7, n3);
            }
            boolean bl4 = this.id_return < this.id_throws.length() || this.id_throws.length() >= this.id_goto();
            int n9 = n8;
            if (!bl2) {
                n9 = n4 > 0 ? n6 + this.id_extends : n6;
            } else if (bl4) {
                n9 = n8 - 1;
                --n8;
            }
            if (!string.isEmpty() && bl2 && n4 < string.length()) {
                this.id_class.id_class(ml_1, this.id_interface.apply(string.substring(n4), this.id_return), (float)n8, (float)n7, n3);
            }
            if (!bl4 && this.id_try != null) {
                this.id_class.id_class(ml_1, this.id_try, (float)(n9 - 1), (float)n7, -8355712);
            }
            if (!bl && this.id_case != null && this.id_throws.isEmpty()) {
                this.id_class.id_break(ml_1, this.id_case, (float)(n9 - 1), (float)n7, n3);
            }
            if (bl3) {
                if (bl4) {
                    ch_3.id_class(ml_1, n9, n7 - 1, n9 + 1, n7 + 1 + 9, -3092272);
                } else {
                    this.id_class.id_class(ml_1, "_", (float)n9, (float)n7, n3);
                }
            }
            if (n5 != n4) {
                int n10 = n6 + this.id_class.id_break(string.substring(0, n5));
                this.id_break(n9, n7 - 1, n10 - 1, n7 + 1 + 9);
            }
        }
    }

    @Override
    protected void id_throws(boolean bl) {
        if (bl) {
            this.id_private = 0;
        }
    }

    public int id_throws(int n) {
        return this.id_class(n, this.id_final());
    }

    public void id_finally(int n) {
        this.id_goto = n;
    }

    public void id_catch(boolean bl) {
        this.id_super = bl;
    }

    public void id_catch(int n) {
        this.id_private(n);
        if (!this.id_else) {
            this.id_native(this.id_return);
        }
        this.id_protected(this.id_throws);
    }

    public void id_catch() {
        ++this.id_private;
    }

    public void id_extends(int n) {
        this.id_while = n;
    }

    public void id_extends() {
        this.id_catch(0);
    }

    private int id_goto() {
        return this.id_catch;
    }

    public void id_case(int n) {
        this.id_catch(this.id_continue(n));
    }

    public void id_case(boolean bl) {
        this.id_this = bl;
    }

    private int id_continue(int n) {
        return rqR_2.id_class(this.id_throws, this.id_return, n);
    }

    public BiFunction<String, Integer, rpl_3> id_continue() {
        return (string, n) -> rpl_3.id_class(string, rgc_3.id_class);
    }

    public Lu_1 id_implements(int n) {
        this.id_catch = n;
        if (this.id_throws.length() > n) {
            this.id_throws = this.id_throws.substring(0, n);
            this.id_protected(this.id_throws);
        }
        return this;
    }

    public String id_implements() {
        int n = this.id_return < this.id_public ? this.id_return : this.id_public;
        int n2 = this.id_return < this.id_public ? this.id_public : this.id_return;
        return this.id_throws.substring(n, n2);
    }

    public boolean id_new() {
        return this.id_throws == null || this.id_throws.isEmpty();
    }

    private void id_new(int n) {
        if (vm_3.id_else()) {
            this.id_byte(n);
        } else {
            this.id_protected(n);
        }
    }

    public int id_package() {
        return this.id_while() ? this.id_extends - 8 : this.id_extends;
    }

    public void id_package(int n) {
        this.id_final = n;
    }

    public float id_super() {
        return this.id_volatile;
    }

    private boolean id_try() {
        return this.id_this;
    }

    private boolean id_while() {
        return this.id_implements;
    }

    public void id_protected(boolean bl) {
        this.id_implements = bl;
    }

    private void id_protected(String string) {
        if (this.id_instanceof != null) {
            this.id_instanceof.accept(string);
        }
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrFg_1.id_class(this, string));
    }

    public void id_protected(int n) {
        if (!this.id_throws.isEmpty()) {
            if (this.id_public != this.id_return) {
                this.id_break("");
            } else {
                String string;
                int n2;
                int n3 = this.id_continue(n);
                int n4 = Math.min(n3, this.id_return);
                if (n4 != (n2 = Math.max(n3, this.id_return)) && this.id_throw.test(string = new StringBuilder(this.id_throws).delete(n4, n2).toString())) {
                    this.id_throws = string;
                    this.id_catch(n4);
                }
            }
        }
    }

    public String id_private() {
        return this.id_throws;
    }

    public void id_private(int n) {
        this.id_return = rfU_2.id_class(n, 0, this.id_throws.length());
    }

    public void id_private(boolean bl) {
        this.id_new = bl;
    }

    public int id_final() {
        return this.id_return;
    }

    public void id_final(int n) {
        this.id_volatile = n;
    }

    public int id_volatile(int n) {
        return n > this.id_throws.length() ? this.id_volatile : this.id_volatile + this.id_class.id_break(this.id_throws.substring(0, n));
    }

    public boolean id_volatile() {
        return this.id_int() && this.aO_() && this.id_try();
    }

    public void id_native() {
        this.id_catch(this.id_throws.length());
    }

    public void id_native(int n) {
        int n2 = this.id_throws.length();
        this.id_public = rfU_2.id_class(n, 0, n2);
        if (this.id_class != null) {
            if (this.id_synchronized > n2) {
                this.id_synchronized = n2;
            }
            int n3 = this.id_package();
            String string = this.id_class.id_class(this.id_throws.substring(this.id_synchronized), n3);
            int n4 = string.length() + this.id_synchronized;
            if (this.id_public == this.id_synchronized) {
                this.id_synchronized -= this.id_class.id_class(this.id_throws, n3, true).length();
            }
            if (this.id_public > n4) {
                this.id_synchronized += this.id_public - n4;
            } else if (this.id_public <= this.id_synchronized) {
                this.id_synchronized -= this.id_synchronized - this.id_public;
            }
            this.id_synchronized = rfU_2.id_class(this.id_synchronized, 0, n2);
        }
    }

    @Override
    protected rVi_1 A_() {
        rgP_2 rgP_22 = this.C_();
        return new rgn_3("gui.narrate.editBox", rgP_22, this.id_throws);
    }
}

