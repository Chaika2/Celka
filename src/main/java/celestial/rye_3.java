/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.iB_2;
import celestial.rRW;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rhU_2;
import celestial.rhd_3;
import celestial.rhm_3;
import celestial.rhv_3;
import celestial.rhx_3;
import celestial.rhy_3;
import celestial.rjU_2;
import celestial.rpX_2;
import celestial.rpw_3;
import celestial.ryC_2;

public class rye_3 {
    public static final rye_3 id_class = new rye_3("inFire").id_native().id_package();
    public static final rye_3 id_break = new rye_3("lightningBolt");
    public static final rye_3 id_byte = new rye_3("onFire").id_native().id_package();
    public static final rye_3 id_protected = new rye_3("lava").id_package();
    public static final rye_3 id_throws = new rye_3("hotFloor").id_package();
    public static final rye_3 id_case = new rye_3("inWall").id_native();
    public static final rye_3 id_catch = new rye_3("cramming").id_native();
    public static final rye_3 id_private = new rye_3("drown").id_native();
    public static final rye_3 id_implements = new rye_3("starve").id_native().id_final();
    public static final rye_3 id_finally = new rye_3("cactus");
    public static final rye_3 id_extends = new rye_3("fall").id_native();
    public static final rye_3 id_native = new rye_3("flyIntoWall").id_native();
    public static final rye_3 id_volatile = new rye_3("outOfWorld").id_native().id_volatile();
    public static final rye_3 id_final = new rye_3("generic").id_native();
    public static final rye_3 id_package = new rye_3("magic").id_native().id_else();
    public static final rye_3 id_int = new rye_3("wither").id_native();
    public static final rye_3 id_new = new rye_3("anvil");
    public static final rye_3 id_continue = new rye_3("fallingBlock");
    public static final rye_3 id_super = new rye_3("dragonBreath").id_native();
    public static final rye_3 id_this = new rye_3("dryout");
    public static final rye_3 id_else = new rye_3("sweetBerryBush");
    private boolean id_return;
    private boolean id_public;
    private boolean id_goto;
    private float id_while = 0.1f;
    private boolean id_try;
    private boolean id_instanceof;
    private boolean id_throw;
    private boolean id_interface;
    private boolean id_char;
    public final String id_synchronized;

    public rye_3 id_byte() {
        this.id_instanceof = true;
        return this;
    }

    public static rye_3 id_byte(iB_2 iB_22) {
        return new rpX_2("mob", iB_22);
    }

    public static rye_3 id_byte(an_3 an_32, an_3 an_33) {
        return new rpw_3("indirectMagic", an_32, an_33).id_native().id_else();
    }

    public boolean id_int() {
        return this.id_try;
    }

    protected rye_3(String string) {
        this.id_synchronized = string;
    }

    public String toString() {
        return "DamageSource (" + this.id_synchronized + ")";
    }

    public boolean id_this() {
        return this.id_interface;
    }

    public static rye_3 id_class(rhm_3 rhm_32, an_3 an_32) {
        return new rpw_3("arrow", rhm_32, an_32).id_byte();
    }

    public static rye_3 id_class() {
        return new ryC_2();
    }

    public static rye_3 id_class(an_3 an_32, iB_2 iB_22) {
        return new rpw_3("mob", an_32, iB_22);
    }

    public rgP_2 id_class(iB_2 iB_22) {
        iB_2 iB_23 = iB_22.Sh();
        String string = "death.attack." + this.id_synchronized;
        String string2 = string + ".player";
        return iB_23 != null ? new rgn_3(string2, iB_22.L_(), iB_23.L_()) : new rgn_3(string, iB_22.L_());
    }

    public static rye_3 id_class(rhd_3 rhd_32) {
        return new rpX_2("player", rhd_32);
    }

    public static rye_3 id_class(rhy_3 rhy_32, an_3 an_32) {
        return new rpw_3("fireworks", rhy_32, an_32).id_throws();
    }

    public static rye_3 id_class(rhv_3 rhv_32, an_3 an_32) {
        return an_32 == null ? new rpw_3("onFire", rhv_32, rhv_32).id_package().id_byte() : new rpw_3("fireball", rhv_32, an_32).id_package().id_byte();
    }

    public static rye_3 id_class(rhU_2 rhU_22, an_3 an_32) {
        return new rpw_3("witherSkull", rhU_22, an_32).id_byte();
    }

    public static rye_3 id_class(rRW rRW2) {
        return rye_3.id_protected(rRW2 != null ? rRW2.id_protected() : null);
    }

    public static rye_3 id_class(an_3 an_32) {
        return new rpX_2("thorns", an_32).id_public().id_else();
    }

    public static rye_3 id_class(an_3 an_32, an_3 an_33) {
        return new rpw_3("trident", an_32, an_33).id_byte();
    }

    public static rye_3 id_break(iB_2 iB_22) {
        return new rpX_2("sting", iB_22);
    }

    public boolean id_break() {
        return this.id_instanceof;
    }

    public static rye_3 id_break(an_3 an_32, an_3 an_33) {
        return new rpw_3("thrown", an_32, an_33).id_byte();
    }

    public rye_3 id_throws() {
        this.id_char = true;
        return this;
    }

    public an_3 id_finally() {
        return this.id_extends();
    }

    public float id_catch() {
        return this.id_while;
    }

    public an_3 id_extends() {
        return null;
    }

    public boolean id_case() {
        return this.id_return;
    }

    public rye_3 id_continue() {
        this.id_throw = true;
        return this;
    }

    public rye_3 id_else() {
        this.id_interface = true;
        return this;
    }

    public boolean id_implements() {
        return this.id_goto;
    }

    public String id_new() {
        return this.id_synchronized;
    }

    protected rye_3 id_package() {
        this.id_try = true;
        return this;
    }

    public rjU_2 id_return() {
        return null;
    }

    public boolean id_super() {
        return this.id_throw;
    }

    public static rye_3 id_protected(iB_2 iB_22) {
        return iB_22 != null ? new rpX_2("explosion.player", iB_22).id_continue().id_throws() : new rye_3("explosion").id_continue().id_throws();
    }

    public boolean id_protected() {
        return this.id_char;
    }

    public boolean id_private() {
        return this.id_public;
    }

    protected rye_3 id_final() {
        this.id_goto = true;
        this.id_while = 0.0f;
        return this;
    }

    protected rye_3 id_volatile() {
        this.id_public = true;
        return this;
    }

    public boolean id_synchronized() {
        an_3 an_32 = this.id_extends();
        return an_32 instanceof rhd_3 && ((rhx_3)((rhd_3)an_32).id_implements[18]).id_protected;
    }

    protected rye_3 id_native() {
        this.id_return = true;
        this.id_while = 0.0f;
        return this;
    }
}

