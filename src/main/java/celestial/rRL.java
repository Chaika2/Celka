/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.context.CommandContext
 */
package celestial;

import celestial.gy_3;
import celestial.rRC;
import celestial.rRF;
import celestial.rRn_1;
import celestial.rRu_1;
import celestial.rnW_2;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.context.CommandContext;
import java.util.function.BiConsumer;

public class rRL
extends rRC<rRL> {
    private int id_break;

    private static int id_byte(String string) {
        if (!string.isEmpty()) {
            try {
                return Integer.parseInt(string);
            }
            catch (NumberFormatException numberFormatException) {
                rRu_1.id_float.warn("Failed to parse integer {}", (Object)string);
            }
        }
        return 0;
    }

    @Override
    public int id_byte() {
        return this.id_break;
    }

    public rRL(rRn_1<rRL> rRn_12, int n) {
        super(rRn_12);
        this.id_break = n;
    }

    @Override
    protected /* synthetic */ Object clone() throws CloneNotSupportedException {
        return this.id_throws();
    }

    private static rRn_1<rRL> id_class(int n, BiConsumer<rnW_2, rRL> biConsumer) {
        return new rRn_1<rRL>(IntegerArgumentType::integer, rRn_12 -> new rRL((rRn_1<rRL>)rRn_12, n), biConsumer, rRF::id_break);
    }

    @Override
    public void id_class(rRL rRL2, rnW_2 rnW_22) {
        this.id_break = rRL2.id_break;
        this.id_class(rnW_22);
    }

    @Override
    protected void id_class(String string) {
        this.id_break = rRL.id_byte(string);
    }

    public int id_class() {
        return this.id_break;
    }

    @Override
    protected void id_class(CommandContext<gy_3> commandContext, String string) {
        this.id_break = IntegerArgumentType.getInteger(commandContext, (String)string);
    }

    public static rRn_1<rRL> id_class(int n) {
        return rRL.id_class(n, (rnW_2 rnW_22, rRL rRL2) -> {});
    }

    public boolean id_break(String string) {
        try {
            this.id_break = Integer.parseInt(string);
            return true;
        }
        catch (NumberFormatException numberFormatException) {
            return false;
        }
    }

    @Override
    public String id_break() {
        return Integer.toString(this.id_break);
    }

    protected rRL id_throws() {
        return new rRL(this.id_class, this.id_break);
    }

    @Override
    protected /* synthetic */ rRC id_catch() {
        return this.id_protected();
    }

    @Override
    protected /* synthetic */ rRC id_case() {
        return this.id_throws();
    }

    protected rRL id_protected() {
        return this;
    }
}

