/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.arguments.BoolArgumentType
 *  com.mojang.brigadier.context.CommandContext
 */
package celestial;

import celestial.gy_3;
import celestial.rRC;
import celestial.rRF;
import celestial.rRn_1;
import celestial.rnW_2;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.context.CommandContext;
import java.util.function.BiConsumer;

public class rRm_1
extends rRC<rRm_1> {
    private boolean id_break;

    @Override
    public int id_byte() {
        return this.id_break ? 1 : 0;
    }

    public rRm_1(rRn_1<rRm_1> rRn_12, boolean bl) {
        super(rRn_12);
        this.id_break = bl;
    }

    @Override
    protected /* synthetic */ Object clone() throws CloneNotSupportedException {
        return this.id_throws();
    }

    @Override
    protected void id_class(String string) {
        this.id_break = Boolean.parseBoolean(string);
    }

    @Override
    public void id_class(rRm_1 rRm_12, rnW_2 rnW_22) {
        this.id_break = rRm_12.id_break;
        this.id_class(rnW_22);
    }

    public static rRn_1<rRm_1> id_class(boolean bl, BiConsumer<rnW_2, rRm_1> biConsumer) {
        return new rRn_1<rRm_1>(BoolArgumentType::bool, rRn_12 -> new rRm_1((rRn_1<rRm_1>)rRn_12, bl), biConsumer, rRF::id_class);
    }

    public static rRn_1<rRm_1> id_class(boolean bl) {
        return rRm_1.id_class(bl, (rnW_2 rnW_22, rRm_1 rRm_12) -> {});
    }

    public boolean id_class() {
        return this.id_break;
    }

    @Override
    protected void id_class(CommandContext<gy_3> commandContext, String string) {
        this.id_break = BoolArgumentType.getBool(commandContext, (String)string);
    }

    @Override
    public void id_class(boolean bl, rnW_2 rnW_22) {
        this.id_break = bl;
        this.id_class(rnW_22);
    }

    @Override
    public String id_break() {
        return Boolean.toString(this.id_break);
    }

    protected rRm_1 id_throws() {
        return new rRm_1(this.id_class, this.id_break);
    }

    @Override
    protected /* synthetic */ rRC id_catch() {
        return this.id_protected();
    }

    @Override
    protected /* synthetic */ rRC id_case() {
        return this.id_throws();
    }

    protected rRm_1 id_protected() {
        return this;
    }
}

