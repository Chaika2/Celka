/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.LF;
import celestial.Lu_1;
import celestial.Ml_1;
import celestial.QY;
import celestial.Qj_1;
import celestial.ZD;
import celestial.ZK;
import celestial.cN_2;
import celestial.kW_2;
import celestial.rHV;
import celestial.rHj_1;
import celestial.rZC;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rmi_3;
import celestial.rqO_2;
import celestial.vm_3;

public class Zo_1
extends vm_3 {
    private static final rgP_2 id_class = new rgn_3("jigsaw_block.joint_label");
    private static final rgP_2 id_throws = new rgn_3("jigsaw_block.pool");
    private static final rgP_2 id_case = new rgn_3("jigsaw_block.name");
    private static final rgP_2 id_catch = new rgn_3("jigsaw_block.target");
    private static final rgP_2 id_private = new rgn_3("jigsaw_block.final_state");
    private final rHj_1 id_implements;
    private Lu_1 id_finally;
    private Lu_1 id_else;
    private Lu_1 id_synchronized;
    private Lu_1 id_return;
    public int id_public;
    public boolean id_goto = true;
    private LF id_while;
    private LF id_try;
    private rHV id_instanceof;

    private void id_int() {
        this.id_try.id_int = rqO_2.id_byte(this.id_finally.id_private()) && rqO_2.id_byte(this.id_else.id_private()) && rqO_2.id_byte(this.id_synchronized.id_private());
    }

    public Zo_1(rHj_1 rHj_12) {
        super(rgN_2.id_byte);
        this.id_implements = rHj_12;
    }

    private rgP_2 id_interface() {
        return new rgn_3("jigsaw_block.joint." + this.id_instanceof.id_class());
    }

    @Override
    public void id_class(QY qY, int n, int n2) {
        String string = this.id_finally.id_private();
        String string2 = this.id_else.id_private();
        String string3 = this.id_synchronized.id_private();
        String string4 = this.id_return.id_private();
        int n3 = this.id_public;
        rHV rHV2 = this.id_instanceof;
        this.id_break(qY, n, n2);
        this.id_finally.id_class(string);
        this.id_else.id_class(string2);
        this.id_synchronized.id_class(string3);
        this.id_return.id_class(string4);
        this.id_public = n3;
        this.id_instanceof = rHV2;
        this.id_while.id_break(this.id_interface());
    }

    @Override
    public boolean id_class(int n, int n2, int n3) {
        if (super.id_class(n, n2, n3)) {
            return true;
        }
        if (!this.id_try.id_int || n != 257 && n != 335) {
            return false;
        }
        this.id_finally();
        return true;
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        this.id_class(ml_1);
        Zo_1.id_break(ml_1, this.id_super, id_throws, this.id_package / 2 - 153, 10, 0xA0A0A0);
        this.id_synchronized.id_class(ml_1, n, n2, f);
        Zo_1.id_break(ml_1, this.id_super, id_case, this.id_package / 2 - 153, 45, 0xA0A0A0);
        this.id_finally.id_class(ml_1, n, n2, f);
        Zo_1.id_break(ml_1, this.id_super, id_catch, this.id_package / 2 - 153, 80, 0xA0A0A0);
        this.id_else.id_class(ml_1, n, n2, f);
        Zo_1.id_break(ml_1, this.id_super, id_private, this.id_package / 2 - 153, 115, 0xA0A0A0);
        this.id_return.id_class(ml_1, n, n2, f);
        if (kW_2.id_private(this.id_implements.id_abstract()).id_final().id_byte()) {
            Zo_1.id_break(ml_1, this.id_super, id_class, this.id_package / 2 - 153, 156, 0xFFFFFF);
        }
        super.id_class(ml_1, n, n2, f);
    }

    private void id_finally() {
        this.id_final();
        this.id_volatile.id_break((vm_3)null);
    }

    private void id_package() {
        this.id_volatile.id_void().id_class(new rmi_3(this.id_implements.id_char(), this.id_public, this.id_goto));
    }

    @Override
    public void id_private() {
        this.id_finally.id_catch();
        this.id_else.id_catch();
        this.id_synchronized.id_catch();
        this.id_return.id_catch();
    }

    private void id_final() {
        this.id_volatile.id_void().id_class(new rZC(this.id_implements.id_char(), new rqO_2(this.id_finally.id_private()), new rqO_2(this.id_else.id_private()), new rqO_2(this.id_synchronized.id_private()), this.id_return.id_private(), this.id_instanceof));
    }

    @Override
    public void id_volatile() {
        this.id_native();
    }

    private void id_native() {
        this.id_volatile.id_break((vm_3)null);
    }

    @Override
    protected void v_() {
        boolean bl;
        ((Qj_1)this.id_volatile.id_class[23]).id_class(true);
        this.id_synchronized = new Lu_1(this.id_super, this.id_package / 2 - 152, 20, 300, 20, new rgn_3("jigsaw_block.pool"));
        this.id_synchronized.id_implements(128);
        this.id_synchronized.id_class(this.id_implements.id_private().toString());
        this.id_synchronized.id_class((String string) -> this.id_int());
        this.id_native.add(this.id_synchronized);
        this.id_finally = new Lu_1(this.id_super, this.id_package / 2 - 152, 55, 300, 20, new rgn_3("jigsaw_block.name"));
        this.id_finally.id_implements(128);
        this.id_finally.id_class(this.id_implements.id_throws().toString());
        this.id_finally.id_class((String string) -> this.id_int());
        this.id_native.add(this.id_finally);
        this.id_else = new Lu_1(this.id_super, this.id_package / 2 - 152, 90, 300, 20, new rgn_3("jigsaw_block.target"));
        this.id_else.id_implements(128);
        this.id_else.id_class(this.id_implements.id_catch().toString());
        this.id_else.id_class((String string) -> this.id_int());
        this.id_native.add(this.id_else);
        this.id_return = new Lu_1(this.id_super, this.id_package / 2 - 152, 125, 300, 20, new rgn_3("jigsaw_block.final_state"));
        this.id_return.id_implements(256);
        this.id_return.id_class(this.id_implements.id_finally());
        this.id_native.add(this.id_return);
        this.id_instanceof = this.id_implements.id_extends();
        int n = this.id_super.id_class(id_class) + 10;
        this.id_while = this.id_class(new LF(this.id_package / 2 - 152 + n, 150, 300 - n, 20, this.id_interface(), lF -> {
            rHV[] rHVArray = rHV.values();
            int n = (this.id_instanceof.ordinal() + 1) % rHVArray.length;
            this.id_instanceof = rHVArray[n];
            lF.id_break(this.id_interface());
        }));
        this.id_while.id_int = bl = kW_2.id_private(this.id_implements.id_abstract()).id_final().id_byte();
        this.id_while.id_new = bl;
        this.id_class(new ZK(this, this.id_package / 2 - 154, 180, 100, 20, rgN_2.id_byte, 0.0));
        this.id_class(new ZD(this, this.id_package / 2 - 50, 180, 100, 20, new rgn_3("jigsaw_block.keep_jigsaws"), lF -> {
            this.id_goto = !this.id_goto;
        }));
        this.id_class(new LF(this.id_package / 2 + 54, 180, 100, 20, new rgn_3("jigsaw_block.generate"), lF -> {
            this.id_finally();
            this.id_package();
        }));
        this.id_try = this.id_class(new LF(this.id_package / 2 - 4 - 150, 210, 150, 20, cN_2.id_byte, lF -> this.id_finally()));
        this.id_class(new LF(this.id_package / 2 + 4, 210, 150, 20, cN_2.id_protected, lF -> this.id_native()));
        this.id_break(this.id_synchronized);
        this.id_int();
    }

    @Override
    public void w_() {
        super.w_();
        ((Qj_1)this.id_volatile.id_class[23]).id_class(false);
    }
}

