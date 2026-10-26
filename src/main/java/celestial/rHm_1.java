/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.ResultConsumer
 */
package celestial;

import celestial.KU;
import celestial.KY;
import celestial.Ko_1;
import celestial.gV_2;
import celestial.gy_3;
import celestial.rRu_1;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rgB_2;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rhd_3;
import celestial.rjU_2;
import celestial.rnW_2;
import celestial.rql_3;
import celestial.rrEm_1;
import celestial.ryZ_2;
import com.mojang.brigadier.ResultConsumer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public abstract class rHm_1
implements gV_2 {
    private static final SimpleDateFormat id_class = new SimpleDateFormat("HH:mm:ss");
    private static final rgP_2 id_break = new rgN_2("@");
    private long id_protected = -1L;
    private boolean id_throws = true;
    private int id_case;
    private boolean id_catch = true;
    private rgP_2 id_private;
    private String id_implements = "";
    private rgP_2 id_finally = id_break;

    public abstract rjU_2 id_byte();

    @Override
    public boolean C() {
        return this.id_class().B().id_break(rRu_1.id_final) && this.id_catch;
    }

    @Override
    public boolean l() {
        return this.id_catch;
    }

    @Override
    public void id_class(rgP_2 rgP_22, UUID uUID) {
        if (this.id_catch) {
            this.id_private = new rgN_2("[" + id_class.format(new Date()) + "] ").id_class(rgP_22);
            this.id_break();
        }
    }

    public void id_class(rgP_2 rgP_22) {
        this.id_finally = rgP_22 != null ? rgP_22 : id_break;
    }

    public abstract rrEm_1 id_class();

    public void id_class(int n) {
        this.id_case = n;
    }

    public void id_class(boolean bl) {
        this.id_catch = bl;
    }

    public rcd_3 id_class(rcd_3 rcd_32) {
        rcd_32.id_class("Command", this.id_implements);
        rcd_32.id_break("SuccessCount", this.id_case);
        rcd_32.id_class("CustomName", rgB_2.id_class(this.id_finally));
        rcd_32.id_class("TrackOutput", this.id_catch);
        if (this.id_private != null && this.id_catch) {
            rcd_32.id_class("LastOutput", rgB_2.id_class(this.id_private));
        }
        rcd_32.id_class("UpdateLastExecution", this.id_throws);
        if (this.id_throws && this.id_protected > 0L) {
            rcd_32.id_class("LastExecution", this.id_protected);
        }
        return rcd_32;
    }

    public void id_class(String string) {
        this.id_implements = string;
        this.id_case = 0;
    }

    public boolean id_class(rYB rYB2) {
        if (!rYB2.id_continue && rYB2.r() != this.id_protected) {
            if ("Searge".equalsIgnoreCase(this.id_implements)) {
                this.id_private = new rgN_2("#itzlipofutzli");
                this.id_case = 1;
                return true;
            }
            this.id_case = 0;
            rnW_2 rnW_22 = this.id_class().id_const();
            if (rnW_22.O() && !rql_3.id_break(this.id_implements)) {
                try {
                    this.id_private = null;
                    gy_3 gy_32 = this.id_throws().id_class((ResultConsumer<gy_3>)((ResultConsumer)(commandContext, bl, n) -> {
                        if (bl) {
                            ++this.id_case;
                        }
                    }));
                    rnW_22.f().id_class(gy_32, this.id_implements);
                }
                catch (Throwable throwable) {
                    KY kY = KY.id_class(throwable, "Executing command block");
                    Ko_1 ko_1 = kY.id_class("Command to be executed");
                    ko_1.id_class("Command", this::id_private);
                    ko_1.id_class("Name", () -> this.id_implements().getString());
                    throw new KU(kY);
                }
            }
            this.id_protected = this.id_throws ? rYB2.r() : -1L;
            return true;
        }
        return false;
    }

    public ryZ_2 id_class(rhd_3 rhd_32) {
        if (!rhd_32.sU()) {
            return ryZ_2.PASS;
        }
        if (rhd_32.e().id_continue) {
            rhd_32.id_class(this);
        }
        return ryZ_2.id_class(((rYB)rhd_32.id_throws[7]).id_continue);
    }

    public void id_break(rcd_3 rcd_32) {
        this.id_implements = rcd_32.id_native("Command");
        this.id_case = rcd_32.id_private("SuccessCount");
        if (rcd_32.id_byte("CustomName", 8)) {
            this.id_class(rgB_2.id_class(rcd_32.id_native("CustomName")));
        }
        if (rcd_32.id_byte("TrackOutput", 1)) {
            this.id_catch = rcd_32.id_new("TrackOutput");
        }
        if (rcd_32.id_byte("LastOutput", 8) && this.id_catch) {
            try {
                this.id_private = rgB_2.id_class(rcd_32.id_native("LastOutput"));
            }
            catch (Throwable throwable) {
                this.id_private = new rgN_2(throwable.getMessage());
            }
        } else {
            this.id_private = null;
        }
        if (rcd_32.id_throws("UpdateLastExecution")) {
            this.id_throws = rcd_32.id_new("UpdateLastExecution");
        }
        this.id_protected = this.id_throws && rcd_32.id_throws("LastExecution") ? rcd_32.id_implements("LastExecution") : -1L;
    }

    public void id_break(rgP_2 rgP_22) {
        this.id_private = rgP_22;
    }

    public abstract void id_break();

    public abstract gy_3 id_throws();

    @Override
    public boolean H() {
        return this.id_class().B().id_break(rRu_1.id_private);
    }

    public boolean id_finally() {
        return this.id_catch;
    }

    public rgP_2 id_catch() {
        return this.id_private == null ? rgN_2.id_byte : this.id_private;
    }

    public int id_case() {
        return this.id_case;
    }

    public rgP_2 id_implements() {
        return this.id_finally;
    }

    public String id_private() {
        return this.id_implements;
    }
}

