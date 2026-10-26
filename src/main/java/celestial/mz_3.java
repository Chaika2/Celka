/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.booleans.BooleanConsumer
 */
package celestial;

import celestial.Ak_1;
import celestial.Az_1;
import celestial.LF;
import celestial.Lu_1;
import celestial.Ml_1;
import celestial.QY;
import celestial.Qj_1;
import celestial.cN_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rql_3;
import celestial.rrwp_3;
import celestial.vm_3;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.net.IDN;
import java.util.function.Predicate;

public class mz_3
extends vm_3 {
    private static final rgP_2 id_class = new rgn_3("addServer.enterName");
    private static final rgP_2 id_throws = new rgn_3("addServer.enterIp");
    private LF id_case;
    private final BooleanConsumer id_catch;
    private final Ak_1 id_private;
    private Lu_1 id_implements;
    private Lu_1 id_finally;
    private LF id_else;
    private final vm_3 id_synchronized;
    private final Predicate<String> id_return = string -> {
        if (rql_3.id_break(string)) {
            return true;
        }
        String[] stringArray = string.split(":");
        if (stringArray.length == 0) {
            return true;
        }
        try {
            String string2 = IDN.toASCII(stringArray[0]);
            return true;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return false;
        }
    };

    public mz_3(vm_3 vm_32, BooleanConsumer booleanConsumer, Ak_1 ak_1) {
        super(new rgn_3("addServer.title"));
        this.id_synchronized = vm_32;
        this.id_catch = booleanConsumer;
        this.id_private = ak_1;
    }

    private static rgP_2 id_class(Az_1 az_1) {
        return new rgn_3("addServer.resourcePack").id_break(": ").id_class(az_1.id_class());
    }

    @Override
    public boolean id_class(int n, int n2, int n3) {
        if ((n == 257 || n == 335) && this.id_case.id_int) {
            this.id_finally();
            return true;
        }
        return super.id_class(n, n2, n3);
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        this.id_class(ml_1);
        mz_3.id_class(ml_1, this.id_super, this.id_extends, this.id_package / 2, 17, 0xFFFFFF);
        mz_3.id_break(ml_1, this.id_super, id_class, this.id_package / 2 - 100, 53, 0xA0A0A0);
        mz_3.id_break(ml_1, this.id_super, id_throws, this.id_package / 2 - 100, 94, 0xA0A0A0);
        this.id_finally.id_class(ml_1, n, n2, f);
        this.id_implements.id_class(ml_1, n, n2, f);
        super.id_class(ml_1, n, n2, f);
    }

    private void id_class(String string) {
        this.id_native();
    }

    @Override
    public void id_class(QY qY, int n, int n2) {
        String string = this.id_implements.id_private();
        String string2 = this.id_finally.id_private();
        this.id_break(qY, n, n2);
        this.id_implements.id_class(string);
        this.id_finally.id_class(string2);
    }

    private void id_finally() {
        this.id_private.id_class = this.id_finally.id_private();
        this.id_private.id_break = this.id_implements.id_private();
        this.id_catch.accept(true);
    }

    @Override
    public void id_private() {
        this.id_finally.id_catch();
        this.id_implements.id_catch();
    }

    @Override
    public void id_volatile() {
        this.id_native();
        this.id_volatile.id_break(this.id_synchronized);
    }

    private void id_native() {
        String string = this.id_implements.id_private();
        boolean bl = !string.isEmpty() && string.split(":").length > 0 && string.indexOf(32) == -1;
        boolean bl2 = this.id_case.id_int = bl && !this.id_finally.id_private().isEmpty();
        if (this.id_private instanceof rrwp_3) {
            this.id_implements.id_case(false);
            this.id_implements.id_byte(false);
            this.id_finally.id_case(false);
            this.id_finally.id_byte(false);
        }
    }

    @Override
    protected void v_() {
        ((Qj_1)this.id_volatile.id_class[23]).id_class(true);
        this.id_finally = new Lu_1(this.id_super, this.id_package / 2 - 100, 66, 200, 20, new rgn_3("addServer.enterName"));
        this.id_finally.id_byte(true);
        this.id_finally.id_class(this.id_private.id_class);
        this.id_finally.id_class(this::id_class);
        this.id_native.add(this.id_finally);
        this.id_implements = new Lu_1(this.id_super, this.id_package / 2 - 100, 106, 200, 20, new rgn_3("addServer.enterIp"));
        this.id_implements.id_implements(128);
        this.id_implements.id_class(this.id_private.id_break);
        this.id_implements.id_class(this.id_return);
        this.id_implements.id_class(this::id_class);
        this.id_native.add(this.id_implements);
        this.id_else = this.id_class(new LF(this.id_package / 2 - 100, this.id_int / 4 + 72, 200, 20, mz_3.id_class(this.id_private.id_break()), lF -> {
            this.id_private.id_class(Az_1.values()[(this.id_private.id_break().ordinal() + 1) % Az_1.values().length]);
            this.id_else.id_break(mz_3.id_class(this.id_private.id_break()));
        }));
        this.id_case = this.id_class(new LF(this.id_package / 2 - 100, this.id_int / 4 + 96 + 18, 200, 20, new rgn_3("addServer.add"), lF -> this.id_finally()));
        this.id_class(new LF(this.id_package / 2 - 100, this.id_int / 4 + 120 + 18, 200, 20, cN_2.id_protected, lF -> this.id_catch.accept(false)));
        this.id_native();
    }

    @Override
    public void w_() {
        super.w_();
        ((Qj_1)this.id_volatile.id_class[23]).id_class(false);
    }
}

