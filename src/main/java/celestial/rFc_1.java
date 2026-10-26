/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.At_1;
import celestial.rgF_2;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rnB_2;
import celestial.rnX_2;
import celestial.rnh_3;
import celestial.ruS_2;
import celestial.ruu_3;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.Collection;

public class rFc_1
implements ruS_2<At_1> {
    private String id_class = "";
    private rgP_2 id_break = rgN_2.id_byte;
    private rgP_2 id_byte = rgN_2.id_byte;
    private rgP_2 id_protected = rgN_2.id_byte;
    private String id_throws;
    private String id_case;
    private rgF_2 id_catch;
    private final Collection<String> id_private;
    private int id_implements;
    private int id_finally;

    public rgP_2 id_byte() {
        return this.id_break;
    }

    public rFc_1() {
        this.id_throws = rnX_2.ALWAYS.internalName;
        this.id_case = rnh_3.ALWAYS.name;
        this.id_catch = rgF_2.RESET;
        this.id_private = Lists.newArrayList();
    }

    public rFc_1(rnB_2 rnB_22, Collection<String> collection, int n) {
        this.id_throws = rnX_2.ALWAYS.internalName;
        this.id_case = rnh_3.ALWAYS.name;
        this.id_catch = rgF_2.RESET;
        this.id_private = Lists.newArrayList();
        if (n != 3 && n != 4) {
            throw new IllegalArgumentException("Method must be join or leave for player constructor");
        }
        if (collection == null || collection.isEmpty()) {
            throw new IllegalArgumentException("Players cannot be null/empty");
        }
        this.id_implements = n;
        this.id_class = rnB_22.id_class();
        this.id_private.addAll(collection);
    }

    public rFc_1(rnB_2 rnB_22, int n) {
        this.id_throws = rnX_2.ALWAYS.internalName;
        this.id_case = rnh_3.ALWAYS.name;
        this.id_catch = rgF_2.RESET;
        this.id_private = Lists.newArrayList();
        this.id_class = rnB_22.id_class();
        this.id_implements = n;
        if (n == 0 || n == 2) {
            this.id_break = rnB_22.id_break();
            this.id_finally = rnB_22.id_native();
            this.id_throws = rnB_22.id_implements().internalName;
            this.id_case = rnB_22.id_extends().name;
            this.id_catch = rnB_22.id_volatile();
            this.id_byte = rnB_22.id_protected();
            this.id_protected = rnB_22.id_throws();
        }
        if (n == 0) {
            this.id_private.addAll(rnB_22.id_case());
        }
    }

    public String toString() {
        return "STeamsPacket(name=" + this.id_break() + ", displayName=" + this.id_byte() + ", prefix=" + this.id_finally() + ", suffix=" + this.id_extends() + ", nameTagVisibility=" + this.id_private() + ", collisionRule=" + this.id_implements() + ", color=" + this.id_catch() + ", players=" + this.id_protected() + ", action=" + this.id_throws() + ", friendlyFlags=" + this.id_case() + ")";
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.id_throws(16);
        this.id_implements = ruu_32.readByte();
        if (this.id_implements == 0 || this.id_implements == 2) {
            this.id_break = ruu_32.id_throws();
            this.id_finally = ruu_32.readByte();
            this.id_throws = ruu_32.id_throws(40);
            this.id_case = ruu_32.id_throws(40);
            this.id_catch = ruu_32.id_class(rgF_2.class);
            this.id_byte = ruu_32.id_throws();
            this.id_protected = ruu_32.id_throws();
        }
        if (this.id_implements == 0 || this.id_implements == 3 || this.id_implements == 4) {
            int n = ruu_32.id_case();
            for (int i = 0; i < n; ++i) {
                this.id_private.add(ruu_32.id_throws(40));
            }
        }
    }

    @Override
    public void id_class(At_1 at_1) {
        at_1.id_class(this);
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_class(this.id_class);
        ruu_32.writeByte(this.id_implements);
        if (this.id_implements == 0 || this.id_implements == 2) {
            ruu_32.id_class(this.id_break);
            ruu_32.writeByte(this.id_finally);
            ruu_32.id_class(this.id_throws);
            ruu_32.id_class(this.id_case);
            ruu_32.id_class(this.id_catch);
            ruu_32.id_class(this.id_byte);
            ruu_32.id_class(this.id_protected);
        }
        if (this.id_implements == 0 || this.id_implements == 3 || this.id_implements == 4) {
            ruu_32.id_protected(this.id_private.size());
            for (String string : this.id_private) {
                ruu_32.id_class(string);
            }
        }
    }

    public String id_break() {
        return this.id_class;
    }

    public int id_throws() {
        return this.id_implements;
    }

    public rgP_2 id_finally() {
        return this.id_byte;
    }

    public rgF_2 id_catch() {
        return this.id_catch;
    }

    public rgP_2 id_extends() {
        return this.id_protected;
    }

    public int id_case() {
        return this.id_finally;
    }

    public String id_implements() {
        return this.id_case;
    }

    public Collection<String> id_protected() {
        return this.id_private;
    }

    public String id_private() {
        return this.id_throws;
    }
}

