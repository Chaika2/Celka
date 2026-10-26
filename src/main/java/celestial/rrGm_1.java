/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringUtils
 */
package celestial;

import celestial.rRl_1;
import celestial.rVi_1;
import celestial.rYE;
import celestial.rgF_2;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rql_3;
import celestial.rqu_3;
import celestial.rrGN;
import java.io.File;
import org.apache.commons.lang3.StringUtils;

public class rrGm_1
implements Comparable<rrGm_1> {
    private final rYE id_class;
    private final rrGN id_break;
    private final String id_byte;
    private final boolean id_protected;
    private final boolean id_throws;
    private final File id_case;
    private rgP_2 id_catch;

    public File id_byte() {
        return this.id_case;
    }

    private rgP_2 id_int() {
        rgn_3 rgn_32;
        if (this.id_final()) {
            return new rgn_3("selectWorld.locked").id_class(rgF_2.RED);
        }
        if (this.id_protected()) {
            return new rgn_3("selectWorld.conversion");
        }
        rVi_1 rVi_12 = rgn_32 = this.id_catch() ? new rgN_2("").id_class(new rgn_3("gameMode.hardcore").id_class(rgF_2.DARK_RED)) : new rgn_3("gameMode." + this.id_case().id_break());
        if (this.id_private()) {
            rgn_32.id_break(", ").id_class(new rgn_3("selectWorld.cheats"));
        }
        rVi_1 rVi_13 = this.id_implements();
        rVi_1 rVi_14 = new rgN_2(", ").id_class(new rgn_3("selectWorld.version")).id_break(" ");
        if (this.id_extends()) {
            rVi_14.id_class(rVi_13.id_class(this.id_native() ? rgF_2.RED : rgF_2.ITALIC));
        } else {
            rVi_14.id_class(rVi_13);
        }
        rgn_32.id_class(rVi_14);
        return rgn_32;
    }

    public rrGm_1(rYE rYE2, rrGN rrGN2, String string, boolean bl, boolean bl2, File file) {
        this.id_class = rYE2;
        this.id_break = rrGN2;
        this.id_byte = string;
        this.id_throws = bl2;
        this.id_case = file;
        this.id_protected = bl;
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.id_class((rrGm_1)object);
    }

    public int id_class(rrGm_1 rrGm_12) {
        if (this.id_break.id_break() < rrGm_12.id_break.id_break()) {
            return 1;
        }
        return this.id_break.id_break() > rrGm_12.id_break.id_break() ? -1 : this.id_byte.compareTo(rrGm_12.id_byte);
    }

    public String id_class() {
        return this.id_byte;
    }

    public String id_break() {
        return StringUtils.isEmpty((CharSequence)this.id_class.id_class()) ? this.id_byte : this.id_class.id_class();
    }

    public long id_throws() {
        return this.id_break.id_break();
    }

    public rrGN id_finally() {
        return this.id_break;
    }

    public boolean id_catch() {
        return this.id_class.id_byte();
    }

    public boolean id_extends() {
        return this.id_native() || !rqu_3.id_class().isStable() && !this.id_break.id_throws() || this.id_volatile();
    }

    public rRl_1 id_case() {
        return this.id_class.id_break();
    }

    public rVi_1 id_implements() {
        return rql_3.id_break(this.id_break.id_byte()) ? new rgn_3("selectWorld.versionUnknown") : new rgN_2(this.id_break.id_byte());
    }

    public rgP_2 id_package() {
        if (this.id_catch == null) {
            this.id_catch = this.id_int();
        }
        return this.id_catch;
    }

    public boolean id_protected() {
        return this.id_protected;
    }

    public boolean id_private() {
        return this.id_class.id_throws();
    }

    public boolean id_final() {
        return this.id_throws;
    }

    public boolean id_volatile() {
        return this.id_break.id_protected() < rqu_3.id_class().getWorldVersion();
    }

    public boolean id_native() {
        return this.id_break.id_protected() > rqu_3.id_class().getWorldVersion();
    }
}

