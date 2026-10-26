/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectArraySet
 */
package celestial;

import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.util.Set;
import java.util.stream.Stream;

public class Qr_1 {
    private static final Set<Qr_1> id_implements = new ObjectArraySet();
    public static final Qr_1 id_class = Qr_1.id_class(new Qr_1("oak"));
    public static final Qr_1 id_break = Qr_1.id_class(new Qr_1("spruce"));
    public static final Qr_1 id_byte = Qr_1.id_class(new Qr_1("birch"));
    public static final Qr_1 id_protected = Qr_1.id_class(new Qr_1("acacia"));
    public static final Qr_1 id_throws = Qr_1.id_class(new Qr_1("jungle"));
    public static final Qr_1 id_case = Qr_1.id_class(new Qr_1("dark_oak"));
    public static final Qr_1 id_catch = Qr_1.id_class(new Qr_1("crimson"));
    public static final Qr_1 id_private = Qr_1.id_class(new Qr_1("warped"));
    private final String id_finally;

    protected Qr_1(String string) {
        this.id_finally = string;
    }

    private static Qr_1 id_class(Qr_1 qr_1) {
        id_implements.add(qr_1);
        return qr_1;
    }

    public static Stream<Qr_1> id_class() {
        return id_implements.stream();
    }

    public String id_break() {
        return this.id_finally;
    }
}

