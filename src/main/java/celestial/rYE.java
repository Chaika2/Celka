/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicLike
 */
package celestial;

import celestial.rRO;
import celestial.rRl_1;
import celestial.rRu_1;
import celestial.rTH;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicLike;

public final class rYE {
    private final String id_class;
    private final rRl_1 id_break;
    private final boolean id_byte;
    private final rRO id_protected;
    private final boolean id_throws;
    private final rRu_1 id_case;
    private final rTH id_catch;

    public boolean id_byte() {
        return this.id_byte;
    }

    public rYE(String string, rRl_1 rRl_12, boolean bl, rRO rRO2, boolean bl2, rRu_1 rRu_12, rTH rTH2) {
        this.id_class = string;
        this.id_break = rRl_12;
        this.id_byte = bl;
        this.id_protected = rRO2;
        this.id_throws = bl2;
        this.id_case = rRu_12;
        this.id_catch = rTH2;
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return this.id_private();
    }

    public rYE id_class(rRl_1 rRl_12) {
        return new rYE(this.id_class, rRl_12, this.id_byte, this.id_protected, this.id_throws, this.id_case, this.id_catch);
    }

    public rYE id_class(rRO rRO2) {
        return new rYE(this.id_class, this.id_break, this.id_byte, rRO2, this.id_throws, this.id_case, this.id_catch);
    }

    public rYE id_class(rTH rTH2) {
        return new rYE(this.id_class, this.id_break, this.id_byte, this.id_protected, this.id_throws, this.id_case, rTH2);
    }

    public String id_class() {
        return this.id_class;
    }

    public static rYE id_class(Dynamic<?> dynamic, rTH rTH2) {
        rRl_1 rRl_12 = rRl_1.id_class(dynamic.get("GameType").asInt(0));
        return new rYE(dynamic.get("LevelName").asString(""), rRl_12, dynamic.get("hardcore").asBoolean(false), dynamic.get("Difficulty").asNumber().map(number -> rRO.id_class(number.byteValue())).result().orElse(rRO.NORMAL), dynamic.get("allowCommands").asBoolean(rRl_12 == rRl_1.CREATIVE), new rRu_1((DynamicLike<?>)dynamic.get("GameRules")), rTH2);
    }

    public rRl_1 id_break() {
        return this.id_break;
    }

    public boolean id_throws() {
        return this.id_throws;
    }

    public rTH id_catch() {
        return this.id_catch;
    }

    public rRu_1 id_case() {
        return this.id_case;
    }

    public rRO id_protected() {
        return this.id_protected;
    }

    public rYE id_private() {
        return new rYE(this.id_class, this.id_break, this.id_byte, this.id_protected, this.id_throws, this.id_case.id_break(), this.id_catch);
    }
}

