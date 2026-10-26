/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HU;
import celestial.In_1;
import celestial.an_3;
import celestial.rqO_2;
import java.util.function.Function;

public abstract class tp_3<T extends an_3>
extends In_1 {
    public float id_final;
    public boolean id_package;
    public boolean id_int = true;

    protected tp_3() {
        this(HU::id_protected);
    }

    protected tp_3(Function<rqO_2, HU> function) {
        super(function);
    }

    public void id_class(T t, float f, float f2, float f3) {
    }

    public void id_class(tp_3<T> tp_32) {
        tp_32.id_final = this.id_final;
        tp_32.id_package = this.id_package;
        tp_32.id_int = this.id_int;
    }

    public abstract void id_class(T var1, float var2, float var3, float var4, float var5, float var6);
}

