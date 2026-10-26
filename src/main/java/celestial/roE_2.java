/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.an_3;
import celestial.rfH_2;
import celestial.rfj_3;
import celestial.rfl_3;
import celestial.rjC_2;
import celestial.roB_2;
import celestial.roG_2;
import celestial.roM_2;
import celestial.roO_2;
import celestial.roS_2;
import celestial.rob_3;
import com.google.common.collect.Lists;
import java.util.List;

public class roE_2 {
    private final List<roS_2> id_class = Lists.newArrayList();
    private double id_byte = 0.2;
    private double id_protected = 5.0;
    private int id_throws = 15;
    private int id_case = 5;
    private double id_catch;
    private double id_private;
    public int id_implements = 29999984;
    private roG_2 id_finally = new roO_2(this, 6.0E7);
    public static final roM_2 id_break = new roM_2(0.0, 0.0, 0.2, 5.0, 5, 15, 6.0E7, 0L, 0.0);

    public rjC_2 id_byte() {
        return this.id_finally.id_volatile();
    }

    public void id_byte(int n) {
        this.id_case = n;
        for (roS_2 roS_22 : this.id_native()) {
            roS_22.id_break(this, n);
        }
    }

    public void id_byte(double d) {
        this.id_byte = d;
        for (roS_2 roS_22 : this.id_native()) {
            roS_22.id_break(this, d);
        }
    }

    public double id_int() {
        return this.id_finally.id_case();
    }

    public roM_2 id_this() {
        return new roM_2(this);
    }

    public void id_class(roS_2 roS_22) {
        this.id_class.add(roS_22);
    }

    public boolean id_class(rfl_3 rfl_32) {
        return rfl_32.id_protected > this.id_throws() && rfl_32.id_class < this.id_catch() && rfl_32.id_case > this.id_case() && rfl_32.id_byte < this.id_private();
    }

    public void id_class(int n) {
        this.id_implements = n;
        this.id_finally.id_finally();
    }

    public void id_class(double d, double d2, long l) {
        this.id_finally = d == d2 ? new roO_2(this, d2) : new rob_3(this, d, d2, l);
        for (roS_2 roS_22 : this.id_native()) {
            roS_22.id_class(this, d, d2, l);
        }
    }

    public double id_class(an_3 an_32) {
        return this.id_class(an_32.rx(), an_32.BO());
    }

    public void id_class(double d) {
        this.id_finally = new roO_2(this, d);
        for (roS_2 roS_22 : this.id_native()) {
            roS_22.id_class(this, d);
        }
    }

    public void id_class(roM_2 roM_22) {
        this.id_break(roM_22.id_class(), roM_22.id_break());
        this.id_byte(roM_22.id_byte());
        this.id_break(roM_22.id_protected());
        this.id_byte(roM_22.id_throws());
        this.id_break(roM_22.id_case());
        if (roM_22.id_private() > 0L) {
            this.id_class(roM_22.id_catch(), roM_22.id_implements(), roM_22.id_private());
        } else {
            this.id_class(roM_22.id_catch());
        }
    }

    public boolean id_class(rfH_2 rfH_22) {
        return (double)(rfH_22.b_() + 1) > this.id_throws() && (double)rfH_22.b_() < this.id_catch() && (double)(rfH_22.d_() + 1) > this.id_case() && (double)rfH_22.d_() < this.id_private();
    }

    public boolean id_class(rfj_3 rfj_32) {
        return (double)rfj_32.id_protected() > this.id_throws() && (double)rfj_32.id_break() < this.id_catch() && (double)rfj_32.id_throws() > this.id_case() && (double)rfj_32.id_byte() < this.id_private();
    }

    public double id_class(double d, double d2) {
        double d3 = d2 - this.id_case();
        double d4 = this.id_private() - d2;
        double d5 = d - this.id_throws();
        double d6 = this.id_catch() - d;
        double d7 = Math.min(d5, d6);
        d7 = Math.min(d7, d3);
        return Math.min(d7, d4);
    }

    public double id_class() {
        return this.id_catch;
    }

    public void id_break(double d) {
        this.id_protected = d;
        for (roS_2 roS_22 : this.id_native()) {
            roS_22.id_byte(this, d);
        }
    }

    public double id_break() {
        return this.id_private;
    }

    public void id_break(double d, double d2) {
        this.id_catch = d;
        this.id_private = d2;
        this.id_finally.id_extends();
        for (roS_2 roS_22 : this.id_native()) {
            roS_22.id_class(this, d, d2);
        }
    }

    public void id_break(int n) {
        this.id_throws = n;
        for (roS_2 roS_22 : this.id_native()) {
            roS_22.id_class(this, n);
        }
    }

    public double id_throws() {
        return this.id_finally.id_class();
    }

    public long id_finally() {
        return this.id_finally.id_catch();
    }

    public double id_catch() {
        return this.id_finally.id_break();
    }

    public double id_extends() {
        return this.id_finally.id_private();
    }

    public double id_case() {
        return this.id_finally.id_byte();
    }

    public int id_continue() {
        return this.id_case;
    }

    public double id_implements() {
        return this.id_finally.id_throws();
    }

    public int id_new() {
        return this.id_throws;
    }

    public double id_package() {
        return this.id_byte;
    }

    public void id_super() {
        this.id_finally = this.id_finally.id_native();
    }

    public roB_2 id_protected() {
        return this.id_finally.id_implements();
    }

    public double id_private() {
        return this.id_finally.id_protected();
    }

    public double id_final() {
        return this.id_protected;
    }

    public int id_volatile() {
        return this.id_implements;
    }

    protected List<roS_2> id_native() {
        return Lists.newArrayList(this.id_class);
    }
}

