/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rSA;
import celestial.rSC;
import celestial.rSF;
import celestial.rSH;
import celestial.rSI;
import celestial.rSL;
import celestial.rSf_1;
import celestial.rSl_1;
import celestial.rSn_1;
import celestial.rSt_1;
import celestial.rSu_1;
import celestial.rSv_1;
import celestial.rSy_1;
import java.lang.reflect.Constructor;
import java.util.Arrays;

public class rST<T extends rSl_1> {
    private static rST<?>[] id_native = new rST[0];
    public static final rST<rSn_1> id_class = rST.id_class(rSn_1.class, "HoldingPattern");
    public static final rST<rSI> id_break = rST.id_class(rSI.class, "StrafePlayer");
    public static final rST<rSH> id_byte = rST.id_class(rSH.class, "LandingApproach");
    public static final rST<rSy_1> id_protected = rST.id_class(rSy_1.class, "Landing");
    public static final rST<rSf_1> id_throws = rST.id_class(rSf_1.class, "Takeoff");
    public static final rST<rSA> id_case = rST.id_class(rSA.class, "SittingFlaming");
    public static final rST<rSt_1> id_catch = rST.id_class(rSt_1.class, "SittingScanning");
    public static final rST<rSv_1> id_private = rST.id_class(rSv_1.class, "SittingAttacking");
    public static final rST<rSF> id_implements = rST.id_class(rSF.class, "ChargingPlayer");
    public static final rST<rSL> id_finally = rST.id_class(rSL.class, "Dying");
    public static final rST<rSC> id_extends = rST.id_class(rSC.class, "Hover");
    private final Class<? extends rSl_1> id_volatile;
    private final int id_final;
    private final String id_package;

    public static int id_byte() {
        return id_native.length;
    }

    private rST(int n, Class<? extends rSl_1> clazz, String string) {
        this.id_final = n;
        this.id_volatile = clazz;
        this.id_package = string;
    }

    public String toString() {
        return this.id_package + " (#" + this.id_final + ")";
    }

    private static <T extends rSl_1> rST<T> id_class(Class<T> clazz, String string) {
        rST<T> rST2 = new rST<T>(id_native.length, clazz, string);
        id_native = Arrays.copyOf(id_native, id_native.length + 1);
        rST.id_native[rST2.id_break()] = rST2;
        return rST2;
    }

    public rSl_1 id_class(rSu_1 rSu_12) {
        try {
            Constructor<rSl_1> constructor = this.id_class();
            return constructor.newInstance(rSu_12);
        }
        catch (Exception exception) {
            throw new Error(exception);
        }
    }

    public static rST<?> id_class(int n) {
        return n >= 0 && n < id_native.length ? id_native[n] : id_class;
    }

    protected Constructor<? extends rSl_1> id_class() throws NoSuchMethodException {
        return this.id_volatile.getConstructor(rSu_1.class);
    }

    public int id_break() {
        return this.id_final;
    }
}

