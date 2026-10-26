/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ko_1;
import celestial.rRO;
import celestial.rRu_1;
import celestial.rfH_2;
import celestial.rrGS;
import celestial.rrxr_3;

public class gv_3
implements rrGS {
    private final boolean id_class;
    private final rRu_1 id_break;
    private final boolean id_byte;
    private int id_protected;
    private int id_throws;
    private int id_case;
    private float id_catch;
    private long id_private;
    private long id_implements;
    private boolean id_finally;
    private rRO id_extends;
    private boolean id_native;

    @Override
    public void id_byte(int n) {
        this.id_case = n;
    }

    @Override
    public int id_byte() {
        return this.id_case;
    }

    public gv_3(rRO rRO2, boolean bl, boolean bl2) {
        this.id_extends = rRO2;
        this.id_class = bl;
        this.id_byte = bl2;
        this.id_break = new rRu_1();
    }

    @Override
    public void id_class(boolean bl) {
        this.id_finally = bl;
    }

    @Override
    public void id_class(float f) {
        this.id_catch = f;
    }

    public void id_class(long l) {
        this.id_private = l;
    }

    @Override
    public void id_class(rfH_2 rfH_22, float f) {
        this.id_protected = rfH_22.b_();
        this.id_throws = rfH_22.c_();
        this.id_case = rfH_22.d_();
        this.id_catch = f;
    }

    public void id_class(rRO rRO2) {
        rrxr_3.a.id_catch(new Object[]{rRO2, this.id_extends});
        this.id_extends = rRO2;
    }

    @Override
    public void id_class(Ko_1 ko_1) {
        rrGS.super.id_class(ko_1);
    }

    @Override
    public int id_class() {
        return this.id_protected;
    }

    @Override
    public void id_class(int n) {
        this.id_protected = n;
    }

    @Override
    public int id_break() {
        return this.id_throws;
    }

    @Override
    public void id_break(int n) {
        this.id_throws = n;
    }

    public void id_break(boolean bl) {
        this.id_native = bl;
    }

    public void id_break(long l) {
        this.id_implements = l;
    }

    @Override
    public long id_throws() {
        return this.id_private;
    }

    @Override
    public rRu_1 id_finally() {
        return this.id_break;
    }

    @Override
    public boolean id_catch() {
        return false;
    }

    @Override
    public rRO id_extends() {
        return this.id_extends;
    }

    @Override
    public long id_case() {
        return this.id_implements;
    }

    @Override
    public boolean id_implements() {
        return this.id_class;
    }

    @Override
    public float id_protected() {
        return this.id_catch;
    }

    @Override
    public boolean id_private() {
        return this.id_finally;
    }

    public double id_final() {
        return this.id_byte ? 1.0 : 0.03125;
    }

    public double id_volatile() {
        return this.id_byte ? 0.0 : 63.0;
    }

    @Override
    public boolean id_native() {
        return this.id_native;
    }
}

