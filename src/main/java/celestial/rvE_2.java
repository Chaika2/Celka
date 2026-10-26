/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.At_1;
import celestial.rqO_2;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rvE_2
implements ruS_2<At_1> {
    public static final rqO_2 id_class = new rqO_2("brand");
    public static final rqO_2 id_break = new rqO_2("debug/path");
    public static final rqO_2 id_byte = new rqO_2("debug/neighbors_update");
    public static final rqO_2 id_protected = new rqO_2("debug/caves");
    public static final rqO_2 id_throws = new rqO_2("debug/structures");
    public static final rqO_2 id_case = new rqO_2("debug/worldgen_attempt");
    public static final rqO_2 id_catch = new rqO_2("debug/poi_ticket_count");
    public static final rqO_2 id_private = new rqO_2("debug/poi_added");
    public static final rqO_2 id_implements = new rqO_2("debug/poi_removed");
    public static final rqO_2 id_finally = new rqO_2("debug/village_sections");
    public static final rqO_2 id_extends = new rqO_2("debug/goal_selector");
    public static final rqO_2 id_native = new rqO_2("debug/brain");
    public static final rqO_2 id_volatile = new rqO_2("debug/bee");
    public static final rqO_2 id_final = new rqO_2("debug/hive");
    public static final rqO_2 id_package = new rqO_2("debug/game_test_add_marker");
    public static final rqO_2 id_int = new rqO_2("debug/game_test_clear");
    public static final rqO_2 id_new = new rqO_2("debug/raids");
    private rqO_2 id_continue;
    private ruu_3 id_super;

    public ruu_3 id_byte() {
        return new ruu_3(this.id_super.copy());
    }

    public rvE_2() {
    }

    public rvE_2(rqO_2 rqO_22, ruu_3 ruu_32) {
        this.id_continue = rqO_22;
        this.id_super = ruu_32;
        if (ruu_32.writerIndex() > 0x100000) {
            throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
        }
    }

    @Override
    public void id_class(At_1 at_1) {
        at_1.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_continue = ruu_32.id_volatile();
        int n = ruu_32.readableBytes();
        if (n < 0 || n > 0x100000) {
            throw new IOException("Payload may not be larger than 1048576 bytes");
        }
        this.id_super = new ruu_3(ruu_32.readBytes(n));
    }

    public rqO_2 id_break() {
        return this.id_continue;
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_class(this.id_continue);
        ruu_32.writeBytes(this.id_super.copy());
    }
}

