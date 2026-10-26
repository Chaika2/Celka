/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.suggestion.Suggestion
 */
package celestial;

import celestial.HZ;
import celestial.Ml_1;
import celestial.Qi_1;
import celestial.cW_2;
import celestial.ch_3;
import celestial.jI_2;
import celestial.rfU_2;
import celestial.rgv_3;
import celestial.rjK_2;
import celestial.vm_3;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.suggestion.Suggestion;
import java.util.List;

public class cQ_2 {
    private final HZ id_break;
    private final String id_byte;
    private final List<Suggestion> id_protected;
    private int id_throws;
    private int id_case;
    private rjK_2 id_catch = rjK_2.id_class;
    private boolean id_private;
    private int id_implements;
    public final /* synthetic */ cW_2 id_class;

    public String id_byte() {
        this.id_implements = this.id_case;
        Suggestion suggestion = this.id_protected.get(this.id_case);
        Message message = suggestion.getTooltip();
        return message != null ? jI_2.id_class("narration.suggestion.tooltip", this.id_case + 1, this.id_protected.size(), suggestion.getText(), message.getString()) : jI_2.id_class("narration.suggestion", this.id_case + 1, this.id_protected.size(), suggestion.getText());
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public cQ_2(cW_2 cW_22, int n, int n2, int n3, List list, boolean bl) {
        this.id_class = cW_22;
        int n4 = n - 1;
        int n5 = cW_22.id_volatile ? n2 - 3 - Math.min(list.size(), cW_22.id_native) * 12 : n2;
        this.id_break = new HZ(n4, n5, n3 + 1, Math.min(list.size(), cW_22.id_native) * 12);
        this.id_byte = cW_22.id_catch.id_private();
        this.id_implements = bl ? -1 : 0;
        this.id_protected = list;
        this.id_break(0);
    }

    public void id_class(int n) {
        this.id_break(this.id_case + n);
        int n2 = this.id_throws;
        int n3 = this.id_throws + this.id_class.id_native - 1;
        if (this.id_case < n2) {
            this.id_throws = rfU_2.id_class(this.id_case, 0, Math.max(this.id_protected.size() - this.id_class.id_native, 0));
        } else if (this.id_case > n3) {
            this.id_throws = rfU_2.id_class(this.id_case + this.id_class.id_extends - this.id_class.id_native, 0, Math.max(this.id_protected.size() - this.id_class.id_native, 0));
        }
    }

    public void id_class() {
        Suggestion suggestion = this.id_protected.get(this.id_case);
        this.id_class.id_synchronized = true;
        this.id_class.id_catch.id_class(suggestion.apply(this.id_byte));
        int n = suggestion.getRange().getStart() + suggestion.getText().length();
        this.id_class.id_catch.id_private(n);
        this.id_class.id_catch.id_native(n);
        this.id_break(this.id_case);
        this.id_class.id_synchronized = false;
        this.id_private = true;
    }

    public void id_class(Ml_1 ml_1, int n, int n2) {
        Message message;
        int n3;
        boolean bl;
        int n4 = Math.min(this.id_protected.size(), this.id_class.id_native);
        int n5 = -5592406;
        boolean bl2 = this.id_throws > 0;
        boolean bl3 = this.id_protected.size() > this.id_throws + n4;
        boolean bl4 = bl2 || bl3;
        boolean bl5 = bl = this.id_catch.id_byte != (float)n || this.id_catch.id_protected != (float)n2;
        if (bl) {
            this.id_catch = new rjK_2(n, n2);
        }
        if (bl4) {
            ch_3.id_class(ml_1, this.id_break.id_class(), this.id_break.id_break() - 1, this.id_break.id_class() + this.id_break.id_byte(), this.id_break.id_break(), this.id_class.id_final);
            ch_3.id_class(ml_1, this.id_break.id_class(), this.id_break.id_break() + this.id_break.id_protected(), this.id_break.id_class() + this.id_break.id_byte(), this.id_break.id_break() + this.id_break.id_protected() + 1, this.id_class.id_final);
            if (bl2) {
                for (n3 = 0; n3 < this.id_break.id_byte(); ++n3) {
                    if (n3 % 2 != 0) continue;
                    ch_3.id_class(ml_1, this.id_break.id_class() + n3, this.id_break.id_break() - 1, this.id_break.id_class() + n3 + 1, this.id_break.id_break(), -1);
                }
            }
            if (bl3) {
                for (n3 = 0; n3 < this.id_break.id_byte(); ++n3) {
                    if (n3 % 2 != 0) continue;
                    ch_3.id_class(ml_1, this.id_break.id_class() + n3, this.id_break.id_break() + this.id_break.id_protected(), this.id_break.id_class() + n3 + 1, this.id_break.id_break() + this.id_break.id_protected() + 1, -1);
                }
            }
        }
        n3 = 0;
        for (int i = 0; i < n4; ++i) {
            Suggestion suggestion = this.id_protected.get(i + this.id_throws);
            ch_3.id_class(ml_1, this.id_break.id_class(), this.id_break.id_break() + 12 * i, this.id_break.id_class() + this.id_break.id_byte(), this.id_break.id_break() + 12 * i + 12, this.id_class.id_final);
            if (n > this.id_break.id_class() && n < this.id_break.id_class() + this.id_break.id_byte() && n2 > this.id_break.id_break() + 12 * i && n2 < this.id_break.id_break() + 12 * i + 12) {
                if (bl) {
                    this.id_break(i + this.id_throws);
                }
                n3 = 1;
            }
            this.id_class.id_private.id_class(ml_1, suggestion.getText(), (float)(this.id_break.id_class() + 1), (float)(this.id_break.id_break() + 2 + 12 * i), i + this.id_throws == this.id_case ? -256 : -5592406);
        }
        if (n3 != 0 && (message = this.id_protected.get(this.id_case).getTooltip()) != null) {
            this.id_class.id_case.id_class(ml_1, rgv_3.id_class(message), n, n2);
        }
    }

    public boolean id_class(double d) {
        int n;
        int n2 = (int)(((Qi_1)this.id_class.id_throws.id_class[22]).id_byte() * (double)this.id_class.id_throws.id_else().id_super() / (double)this.id_class.id_throws.id_else().id_new());
        if (this.id_break.id_class(n2, n = (int)(((Qi_1)this.id_class.id_throws.id_class[22]).id_protected() * (double)this.id_class.id_throws.id_else().id_this() / (double)this.id_class.id_throws.id_else().id_continue()))) {
            this.id_throws = rfU_2.id_class((int)((double)this.id_throws - d), 0, Math.max(this.id_protected.size() - this.id_class.id_native, 0));
            return true;
        }
        return false;
    }

    public boolean id_class(int n, int n2, int n3) {
        if (!this.id_break.id_class(n, n2)) {
            return false;
        }
        int n4 = (n2 - this.id_break.id_break()) / 12 + this.id_throws;
        if (n4 >= 0 && n4 < this.id_protected.size()) {
            this.id_break(n4);
            this.id_class();
        }
        return true;
    }

    public void id_break() {
        this.id_class.id_this = null;
    }

    public boolean id_break(int n, int n2, int n3) {
        if (n == 265) {
            this.id_class(-1);
            this.id_private = false;
            return true;
        }
        if (n == 264) {
            this.id_class(1);
            this.id_private = false;
            return true;
        }
        if (n == 258) {
            if (this.id_private) {
                this.id_class(vm_3.id_synchronized() ? -1 : 1);
            }
            this.id_class();
            return true;
        }
        if (n == 256) {
            this.id_break();
            return true;
        }
        return false;
    }

    public void id_break(int n) {
        this.id_case = n;
        if (this.id_case < 0) {
            this.id_case += this.id_protected.size();
        }
        if (this.id_case >= this.id_protected.size()) {
            this.id_case -= this.id_protected.size();
        }
        Suggestion suggestion = this.id_protected.get(this.id_case);
        this.id_class.id_catch.id_byte(cW_2.id_class(this.id_class.id_catch.id_private(), suggestion.apply(this.id_byte)));
    }
}

