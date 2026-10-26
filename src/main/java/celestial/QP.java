/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.QB;
import celestial.QS;
import celestial.Qs_1;

public final class QP {
    public static final QP id_class = new QB(QS.id_break).id_byte().id_implements().id_break().id_throws().id_private();
    public static final QP id_break = new QB(QS.id_break).id_byte().id_implements().id_break().id_throws().id_private();
    public static final QP id_byte = new QB(QS.id_break).id_byte().id_implements().id_break().id_catch().id_private();
    public static final QP id_protected = new QB(QS.id_throws).id_byte().id_implements().id_break().id_protected().id_private();
    public static final QP id_throws = new QB(QS.id_implements).id_byte().id_implements().id_break().id_case().id_private();
    public static final QP id_case = new QB(QS.id_final).id_byte().id_implements().id_break().id_case().id_private();
    public static final QP id_catch = new QB(QS.id_implements).id_byte().id_implements().id_break().id_case().id_throws().id_protected().id_private();
    public static final QP id_private = new QB(QS.id_implements).id_byte().id_implements().id_break().id_case().id_throws().id_private();
    public static final QP id_implements = new QB(QS.id_final).id_byte().id_implements().id_break().id_case().id_throws().id_private();
    public static final QP id_finally = new QB(QS.id_final).id_byte().id_implements().id_break().id_case().id_throws().id_class().id_private();
    public static final QP id_extends = new QB(QS.id_final).id_byte().id_implements().id_break().id_case().id_throws().id_class().id_private();
    public static final QP id_native = new QB(QS.id_case).id_byte().id_implements().id_break().id_case().id_throws().id_class().id_private();
    public static final QP id_volatile = new QB(QS.id_finally).id_byte().id_implements().id_break().id_case().id_throws().id_private();
    public static final QP id_final = new QB(QS.id_break).id_byte().id_implements().id_break().id_case().id_throws().id_private();
    public static final QP id_package = new QB(QS.id_break).id_byte().id_implements().id_break().id_case().id_private();
    public static final QP id_int = new QB(QS.id_throws).id_byte().id_implements().id_case().id_private();
    public static final QP id_new = new QB(QS.id_break).id_private();
    public static final QP id_continue = new QB(QS.id_extends).id_private();
    public static final QP id_super = new QB(QS.id_native).id_private();
    public static final QP id_this = new QB(QS.id_byte).id_private();
    public static final QP id_else = new QB(QS.id_catch).id_private();
    public static final QP id_synchronized = new QB(QS.id_protected).id_private();
    public static final QP id_return = new QB(QS.id_this).id_private();
    public static final QP id_public = new QB(QS.id_while).id_private();
    public static final QP id_goto = new QB(QS.id_package).id_protected().id_private();
    public static final QP id_while = new QB(QS.id_package).id_private();
    public static final QP id_try = new QB(QS.id_package).id_protected().id_case().id_byte().id_private();
    public static final QP id_instanceof = new QB(QS.id_package).id_protected().id_case().id_private();
    public static final QP id_throw = new QB(QS.id_throws).id_protected().id_private();
    public static final QP id_interface = new QB(QS.id_case).id_protected().id_implements().id_private();
    public static final QP id_char = new QB(QS.id_implements).id_protected().id_implements().id_case().id_private();
    public static final QP id_abstract = new QB(QS.id_break).id_implements().id_private();
    public static final QP id_long = new QB(QS.id_catch).id_implements().id_private();
    public static final QP id_float = new QB(QS.id_implements).id_implements().id_case().id_private();
    public static final QP id_void = new QB(QS.id_volatile).id_private();
    public static final QP id_static = new QB(QS.id_private).id_private();
    public static final QP id_import = new QB(QS.id_finally).id_private();
    public static final QP id_short = new QB(QS.id_private).id_catch().id_private();
    public static final QP id_default = new QB(QS.id_break).id_catch().id_private();
    public static final QP id_const = new QB(QS.id_volatile).id_catch().id_private();
    public static final QP id_strictfp = new QB(QS.id_implements).id_case().id_private();
    public static final QP id_boolean = new QB(QS.id_implements).id_case().id_private();
    public static final QP id_transient = new QB(QS.id_implements).id_case().id_private();
    public static final QP id_for = new QB(QS.id_break).id_case().id_private();
    private final QS id_double;
    private final Qs_1 id_switch;
    private final boolean r;
    private final boolean P;
    private final boolean B;
    private final boolean S;
    private final boolean s;
    private final boolean E;

    public boolean id_byte() {
        return this.r;
    }

    public QP(QS qS, boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6, Qs_1 qs_1) {
        this.id_double = qS;
        this.B = bl;
        this.E = bl2;
        this.r = bl3;
        this.S = bl4;
        this.P = bl5;
        this.s = bl6;
        this.id_switch = qs_1;
    }

    public boolean id_class() {
        return this.B;
    }

    public boolean id_break() {
        return this.E;
    }

    public boolean id_throws() {
        return this.s;
    }

    public Qs_1 id_catch() {
        return this.id_switch;
    }

    public boolean id_case() {
        return this.S;
    }

    public boolean id_protected() {
        return this.P;
    }

    public QS id_private() {
        return this.id_double;
    }
}

