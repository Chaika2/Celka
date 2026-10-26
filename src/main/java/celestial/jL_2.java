/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.MT;
import celestial.jA_2;
import java.util.function.IntConsumer;

public final class jL_2
extends Enum<jL_2> {
    public static final /* enum */ jL_2 POSITION = new jL_2("Position", (n, n2, n3, l, n4) -> {
        MT.id_break(n, n2, n3, l);
        MT.id_public(32884);
    }, n -> MT.id_goto(32884));
    public static final /* enum */ jL_2 NORMAL = new jL_2("Normal", (n, n2, n3, l, n4) -> {
        MT.id_class(n2, n3, l);
        MT.id_public(32885);
    }, n -> MT.id_goto(32885));
    public static final /* enum */ jL_2 COLOR = new jL_2("Vertex Color", (n, n2, n3, l, n4) -> {
        MT.id_byte(n, n2, n3, l);
        MT.id_public(32886);
    }, n -> {
        MT.id_goto(32886);
        MT.id_double();
    });
    public static final /* enum */ jL_2 UV = new jL_2("UV", (n, n2, n3, l, n4) -> {
        MT.id_final(33984 + n4);
        MT.id_class(n, n2, n3, l);
        MT.id_public(32888);
        MT.id_final(33984);
    }, n -> {
        MT.id_final(33984 + n);
        MT.id_goto(32888);
        MT.id_final(33984);
    });
    public static final /* enum */ jL_2 PADDING = new jL_2("Padding", (n, n2, n3, l, n4) -> {}, n -> {});
    public static final /* enum */ jL_2 GENERIC = new jL_2("Generic", (n, n2, n3, l, n4) -> {
        MT.id_while(n4);
        MT.id_class(n4, n, n2, false, n3, l);
    }, MT::id_try);
    private final String displayName;
    private final jA_2 setupState;
    private final IntConsumer clearState;
    private static final /* synthetic */ jL_2[] $VALUES;

    private jL_2(String string2, jA_2 jA_22, IntConsumer intConsumer) {
        this.displayName = string2;
        this.setupState = jA_22;
        this.clearState = intConsumer;
    }

    static {
        $VALUES = jL_2.id_break();
    }

    public static jL_2[] values() {
        return (jL_2[])$VALUES.clone();
    }

    public static jL_2 valueOf(String string) {
        return Enum.valueOf(jL_2.class, string);
    }

    public void id_class(int n) {
        this.clearState.accept(n);
    }

    public void id_class(int n, int n2, int n3, long l, int n4) {
        this.setupState.setupBufferState(n, n2, n3, l, n4);
    }

    public String id_class() {
        return this.displayName;
    }

    private static /* synthetic */ jL_2[] id_break() {
        return new jL_2[]{POSITION, NORMAL, COLOR, UV, PADDING, GENERIC};
    }
}

