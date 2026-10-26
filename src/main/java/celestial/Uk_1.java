/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 */
package celestial;

import celestial.DD;
import celestial.Do_1;
import celestial.UW;
import celestial.Uh_1;
import celestial.rqO_2;
import celestial.xd_3;
import com.google.gson.JsonElement;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Uk_1 {
    public static final UW id_class = Uk_1.id_class(Do_1::id_class, Uh_1.id_byte);
    public static final UW id_break = Uk_1.id_class(Do_1::id_class, Uh_1.id_protected);
    public static final UW id_byte = Uk_1.id_class(Do_1::id_finally, Uh_1.id_throws);
    public static final UW id_protected = Uk_1.id_class(Do_1::id_finally, Uh_1.id_case);
    public static final UW id_throws = Uk_1.id_class(Do_1::id_volatile, Uh_1.id_private);
    public static final UW id_case = Uk_1.id_class(Do_1::id_extends, Uh_1.id_catch);
    public static final UW id_catch = Uk_1.id_class(Do_1::id_public, Uh_1.id_implements);
    public static final UW id_private = Uk_1.id_class(Do_1::id_return, Uh_1.id_finally);
    public static final UW id_implements = Uk_1.id_class(Do_1::id_case, Uh_1.G);
    public static final UW id_finally = Uk_1.id_class(Do_1::id_private, Uh_1.O);
    public static final UW id_extends = Uk_1.id_class(Do_1::id_implements, Uh_1.b);
    public static final UW id_native = Uk_1.id_class(Do_1::id_new, Uh_1.id_abstract);
    public static final UW id_volatile = Uk_1.id_class(Do_1::id_while, Uh_1.Q);
    public static final UW id_final = Uk_1.id_class(Do_1::id_class, Uh_1.id_void);
    public static final UW id_package = Uk_1.id_class(Do_1::id_this, Uh_1.C);
    public static final UW id_int = Uk_1.id_class(Do_1::id_this, Uh_1.l);
    public static final UW id_new = Uk_1.id_class(Do_1::id_break, Uh_1.t);
    public static final UW id_continue = Uk_1.id_class(Do_1::id_native, Uh_1.id_throws);
    public static final UW id_super = Uk_1.id_class(Do_1::id_native, Uh_1.id_case);
    public static final UW id_this = Uk_1.id_class(Do_1::id_final, Uh_1.id_private);
    public static final UW id_else = Uk_1.id_class(Do_1::id_package, Uh_1.id_throws);
    private final Do_1 id_synchronized;
    private final DD id_return;

    private Uk_1(Do_1 do_1, DD dD) {
        this.id_synchronized = do_1;
        this.id_return = dD;
    }

    public DD id_class() {
        return this.id_return;
    }

    public rqO_2 id_class(xd_3 xd_32, String string, BiConsumer<rqO_2, Supplier<JsonElement>> biConsumer) {
        return this.id_return.id_class(xd_32, string, this.id_synchronized, biConsumer);
    }

    public static Uk_1 id_class(rqO_2 rqO_22) {
        return new Uk_1(Do_1.id_break(rqO_22), Uh_1.id_byte);
    }

    private static UW id_class(Function<xd_3, Do_1> function, DD dD) {
        return xd_32 -> new Uk_1((Do_1)function.apply(xd_32), dD);
    }

    public Uk_1 id_class(Consumer<Do_1> consumer) {
        consumer.accept(this.id_synchronized);
        return this;
    }

    public rqO_2 id_class(xd_3 xd_32, BiConsumer<rqO_2, Supplier<JsonElement>> biConsumer) {
        return this.id_return.id_class(xd_32, this.id_synchronized, biConsumer);
    }

    public Do_1 id_break() {
        return this.id_synchronized;
    }
}

