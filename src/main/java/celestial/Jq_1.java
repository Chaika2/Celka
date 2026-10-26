/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.JA;
import celestial.JH;
import celestial.Jy_1;
import celestial.QP;
import celestial.QS;
import celestial.aI_2;
import celestial.rpr_3;
import celestial.rqO_2;
import celestial.rxL_2;
import celestial.rzl_3;
import celestial.xc_3;
import celestial.xd_3;
import celestial.zr_3;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class Jq_1 {
    public QP id_class;
    public Function<xc_3, QS> id_break;
    public boolean id_byte = true;
    public zr_3 id_protected = zr_3.id_throws;
    public ToIntFunction<xc_3> id_throws = xc_32 -> 0;
    public float id_case;
    public float id_catch;
    public boolean id_private;
    public boolean id_implements;
    public float id_finally = 0.6f;
    public float id_extends = 1.0f;
    public float id_native = 1.0f;
    public rqO_2 id_volatile;
    public boolean id_final = true;
    public boolean id_package;
    public JH<aI_2<?>> id_int = (xc_32, rRq_12, rfH_22, aI_22) -> xc_32.id_protected(rRq_12, rfH_22, rpr_3.UP) && xc_32.id_case() < 14;
    public Jy_1 id_new = (xc_32, rRq_12, rfH_22) -> xc_32.id_byte().id_case() && xc_32.id_new(rRq_12, rfH_22);
    public Jy_1 id_continue;
    public Jy_1 id_super = this.id_continue = (xc_32, rRq_12, rfH_22) -> this.id_class.id_byte() && xc_32.id_new(rRq_12, rfH_22);
    public Jy_1 id_this = (xc_32, rRq_12, rfH_22) -> false;
    public Jy_1 id_else = (xc_32, rRq_12, rfH_22) -> false;
    public boolean id_synchronized;

    public Jq_1 id_byte(float f) {
        this.id_native = f;
        return this;
    }

    public Jq_1 id_byte(Jy_1 jy_1) {
        this.id_super = jy_1;
        return this;
    }

    public Jq_1 id_byte() {
        return this.id_protected(0.0f);
    }

    private Jq_1(QP qP, QS qS) {
        this(qP, (xc_3 xc_32) -> qS);
    }

    private Jq_1(QP qP, Function<xc_3, QS> function) {
        this.id_class = qP;
        this.id_break = function;
    }

    public Jq_1 id_class(xd_3 xd_32) {
        this.id_volatile = xd_32.id_throws();
        return this;
    }

    public Jq_1 id_class(float f, float f2) {
        this.id_catch = f;
        this.id_case = Math.max(0.0f, f2);
        return this;
    }

    public Jq_1 id_class(Jy_1 jy_1) {
        this.id_new = jy_1;
        return this;
    }

    public Jq_1 id_class(JH<aI_2<?>> jH) {
        this.id_int = jH;
        return this;
    }

    public static Jq_1 id_class(QP qP, Function<xc_3, QS> function) {
        return new Jq_1(qP, function);
    }

    public static Jq_1 id_class(JA jA) {
        Jq_1 jq_1 = new Jq_1(jA.id_break, jA.id_extends.id_break);
        jq_1.id_class = jA.id_extends.id_class;
        jq_1.id_catch = jA.id_extends.id_catch;
        jq_1.id_case = jA.id_extends.id_case;
        jq_1.id_byte = jA.id_extends.id_byte;
        jq_1.id_implements = jA.id_extends.id_implements;
        jq_1.id_throws = jA.id_extends.id_throws;
        jq_1.id_break = jA.id_extends.id_break;
        jq_1.id_protected = jA.id_extends.id_protected;
        jq_1.id_finally = jA.id_extends.id_finally;
        jq_1.id_extends = jA.id_extends.id_extends;
        jq_1.id_synchronized = jA.id_extends.id_synchronized;
        jq_1.id_final = jA.id_extends.id_final;
        jq_1.id_package = jA.id_extends.id_package;
        jq_1.id_private = jA.id_extends.id_private;
        return jq_1;
    }

    public Jq_1 id_class() {
        this.id_byte = false;
        this.id_final = false;
        return this;
    }

    public Jq_1 id_class(float f) {
        this.id_finally = f;
        return this;
    }

    public static Jq_1 id_class(QP qP, QS qS) {
        return new Jq_1(qP, qS);
    }

    public static Jq_1 id_class(QP qP, rxL_2 rxL_22) {
        return Jq_1.id_class(qP, rxL_22.id_throws());
    }

    public static Jq_1 id_class(QP qP) {
        return Jq_1.id_class(qP, qP.id_private());
    }

    public Jq_1 id_class(ToIntFunction<xc_3> toIntFunction) {
        this.id_throws = toIntFunction;
        return this;
    }

    public Jq_1 id_class(zr_3 zr_32) {
        this.id_protected = zr_32;
        return this;
    }

    public Jq_1 id_break(Jy_1 jy_1) {
        this.id_continue = jy_1;
        return this;
    }

    public Jq_1 id_break() {
        this.id_final = false;
        return this;
    }

    public Jq_1 id_break(float f) {
        this.id_extends = f;
        return this;
    }

    public Jq_1 id_throws() {
        this.id_synchronized = true;
        return this;
    }

    public Jq_1 id_throws(Jy_1 jy_1) {
        this.id_else = jy_1;
        return this;
    }

    public Jq_1 id_catch() {
        this.id_package = true;
        return this;
    }

    public Jq_1 id_case() {
        this.id_volatile = rzl_3.id_class;
        return this;
    }

    public Jq_1 id_protected(Jy_1 jy_1) {
        this.id_this = jy_1;
        return this;
    }

    public Jq_1 id_protected(float f) {
        this.id_class(f, f);
        return this;
    }

    public Jq_1 id_protected() {
        this.id_implements = true;
        return this;
    }

    public Jq_1 id_private() {
        this.id_private = true;
        return this;
    }
}

