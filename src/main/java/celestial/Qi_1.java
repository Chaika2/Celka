/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.glfw.GLFWDropCallback
 */
package celestial;

import celestial.QY;
import celestial.Qw_1;
import celestial.Va_1;
import celestial.Ve_1;
import celestial.Vi_1;
import celestial.Vu_1;
import celestial.aF_2;
import celestial.cT_2;
import celestial.cb_3;
import celestial.cq_3;
import celestial.gb_3;
import celestial.rfU_2;
import celestial.rhx_3;
import celestial.rhz_3;
import celestial.rrAX;
import celestial.rrLB;
import celestial.rrLS;
import celestial.rrLs_1;
import celestial.vm_3;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import org.lwjgl.glfw.GLFWDropCallback;

public class Qi_1 {
    private final QY id_class;
    private boolean id_break;
    private boolean id_byte;
    private boolean id_protected;
    private double id_throws;
    private double id_case;
    private int id_catch;
    private int id_private = -1;
    private boolean id_implements = true;
    private int id_finally;
    private double id_extends;
    private double id_native;
    private double id_volatile;
    private double id_final;
    private boolean id_package;

    public double id_byte() {
        return this.id_throws;
    }

    public void id_byte(boolean bl) {
        this.id_package = bl;
    }

    public Qi_1(QY qY) {
        this.id_class = qY;
    }

    private void id_class(long l, double d) {
        if (l == QY.id_instanceof().id_else().id_implements()) {
            double d2 = (((Qw_1)this.id_class.id_class[20]).id_double ? Math.signum(d) : d) * ((Qw_1)this.id_class.id_class[20]).id_long;
            if ((cT_2)this.id_class.id_class[75] == null) {
                if ((vm_3)this.id_class.id_class[73] != null) {
                    double d3 = this.id_throws * (double)this.id_class.id_else().id_super() / (double)this.id_class.id_else().id_new();
                    double d4 = this.id_case * (double)this.id_class.id_else().id_this() / (double)this.id_class.id_else().id_continue();
                    ((vm_3)this.id_class.id_class[73]).id_class(d3, d4, d2);
                } else if ((cb_3)this.id_class.id_class[57] != null) {
                    if (this.id_final != 0.0 && Math.signum(d2) != Math.signum(this.id_final)) {
                        this.id_final = 0.0;
                    }
                    this.id_final += d2;
                    float f = (int)this.id_final;
                    if (f == 0.0f) {
                        return;
                    }
                    this.id_final -= (double)f;
                    if (((cb_3)this.id_class.id_class[57]).id_native()) {
                        if (((cq_3)this.id_class.id_class[19]).id_private().id_class()) {
                            ((cq_3)this.id_class.id_class[19]).id_private().id_class(-f);
                        } else {
                            float f2 = rfU_2.id_class(((rhx_3)((cb_3)this.id_class.id_class[57]).id_implements[18]).id_class() + f * 0.005f, 0.0f, 0.2f);
                            ((rhx_3)((cb_3)this.id_class.id_class[57]).id_implements[18]).id_class(f2);
                        }
                    } else {
                        ((rhz_3)((cb_3)this.id_class.id_class[57]).id_implements[1]).id_class(f);
                    }
                }
            }
        }
    }

    private void id_class(long l, int n, int n2, int n3) {
        if (l == this.id_class.id_else().id_implements()) {
            int n4;
            Va_1 va_1;
            rrLs_1 rrLs_12;
            boolean bl;
            boolean bl2 = bl = n2 == 1;
            if (((Boolean)QY.id_break[2]).booleanValue() && n == 0) {
                if (bl) {
                    if ((n3 & 2) == 2) {
                        n = 1;
                        ++this.id_catch;
                    }
                } else if (this.id_catch > 0) {
                    n = 1;
                    --this.id_catch;
                }
            }
            if ((rrLs_12 = rrLs_1.id_class(va_1 = Vi_1.MOUSE.id_class(n4 = n), n4, n2)).id_byte()) {
                return;
            }
            if (bl) {
                if (((Qw_1)this.id_class.id_class[20]).S && this.id_finally++ > 0) {
                    return;
                }
                this.id_private = n4;
                this.id_extends = gb_3.id_break();
            } else if (this.id_private != -1) {
                if (((Qw_1)this.id_class.id_class[20]).S && --this.id_finally > 0) {
                    return;
                }
                this.id_private = -1;
            }
            boolean[] blArray = new boolean[]{false};
            if ((cT_2)this.id_class.id_class[75] == null) {
                if ((vm_3)this.id_class.id_class[73] == null) {
                    if (!this.id_package && bl) {
                        this.id_catch();
                    }
                } else {
                    double d = this.id_throws * (double)this.id_class.id_else().id_super() / (double)this.id_class.id_else().id_new();
                    double d2 = this.id_case * (double)this.id_class.id_else().id_this() / (double)this.id_class.id_else().id_continue();
                    if (bl) {
                        vm_3.id_class(() -> {
                            blArray[0] = ((vm_3)this.id_class.id_class[73]).id_break(d, d2, n4);
                        }, "mouseClicked event handler", ((vm_3)this.id_class.id_class[73]).getClass().getCanonicalName());
                    } else {
                        vm_3.id_class(() -> {
                            blArray[0] = ((vm_3)this.id_class.id_class[73]).id_class(d, d2, n4);
                        }, "mouseReleased event handler", ((vm_3)this.id_class.id_class[73]).getClass().getCanonicalName());
                    }
                }
            }
            if (!blArray[0] && ((vm_3)this.id_class.id_class[73] == null || ((vm_3)this.id_class.id_class[73]).id_continue) && (cT_2)this.id_class.id_class[75] == null) {
                if (n4 == 0) {
                    this.id_break = bl;
                } else if (n4 == 2) {
                    this.id_byte = bl;
                } else if (n4 == 1) {
                    this.id_protected = bl;
                }
                Vu_1.id_class(va_1, bl);
                if (bl) {
                    rrLB.id_break((rrLS)((Object)rrLS.staticFields5263c46d9cc33ff8a76200218759034b[0]), n4, Ve_1.id_class(QY.id_instanceof().id_else().id_implements(), 292));
                    if (((cb_3)this.id_class.id_class[57]).id_native() && n4 == 2) {
                        ((cq_3)this.id_class.id_class[19]).id_private().id_protected();
                    } else {
                        Vu_1.id_class(va_1);
                    }
                }
            }
        }
    }

    public boolean id_class() {
        return this.id_break;
    }

    public void id_class(boolean bl) {
        if (this.id_case() && this.id_class.id_static()) {
            double d = ((Qw_1)this.id_class.id_class[20]).id_class * (double)0.6f + (double)0.2f;
            double d2 = d * d * d * 8.0;
            double d3 = this.id_native * d2;
            double d4 = this.id_volatile * d2;
            this.id_native = 0.0;
            this.id_volatile = 0.0;
            int n = 1;
            if (((Qw_1)this.id_class.id_class[20]).id_for) {
                n = -1;
            }
            if ((cb_3)this.id_class.id_class[57] != null) {
                ((cb_3)this.id_class.id_class[57]).id_class(d3, d4 * (double)n);
            }
        } else {
            aF_2 aF_22;
            if ((cb_3)this.id_class.id_class[57] != null && (aF_22 = ((cb_3)this.id_class.id_class[57]).s()) != null) {
                aF_22.id_class(((Float)((cb_3)this.id_class.id_class[57]).id_throws[15]).floatValue(), ((Float)((cb_3)this.id_class.id_class[57]).id_throws[16]).floatValue());
            }
            this.id_native = 0.0;
            this.id_volatile = 0.0;
        }
        if (!bl && (cb_3)this.id_class.id_class[57] != null) {
            ((cb_3)this.id_class.id_class[57]).id_class(rrAX.id_class().id_break());
        }
    }

    private void id_class(long l, double d, double d2) {
        if (l == QY.id_instanceof().id_else().id_implements()) {
            vm_3 vm_32;
            if (this.id_implements) {
                this.id_throws = d;
                this.id_case = d2;
                this.id_implements = false;
            }
            if ((vm_32 = (vm_3)this.id_class.id_class[73]) != null && (cT_2)this.id_class.id_class[75] == null) {
                double d3 = d * (double)this.id_class.id_else().id_super() / (double)this.id_class.id_else().id_new();
                double d4 = d2 * (double)this.id_class.id_else().id_this() / (double)this.id_class.id_else().id_continue();
                vm_3.id_class(() -> vm_32.id_class(d3, d4), "mouseMoved event handler", vm_32.getClass().getCanonicalName());
                if (this.id_private != -1 && this.id_extends > 0.0) {
                    double d5 = (d - this.id_throws) * (double)this.id_class.id_else().id_super() / (double)this.id_class.id_else().id_new();
                    double d6 = (d2 - this.id_case) * (double)this.id_class.id_else().id_this() / (double)this.id_class.id_else().id_continue();
                    vm_3.id_class(() -> vm_32.id_class(d3, d4, this.id_private, d5, d6), "mouseDragged event handler", vm_32.getClass().getCanonicalName());
                }
            }
            if (this.id_case() && this.id_class.id_static()) {
                this.id_native += d - this.id_throws;
                this.id_volatile += d2 - this.id_case;
            }
            this.id_class(true);
            this.id_throws = d;
            this.id_case = d2;
        }
    }

    public void id_class(long l3) {
        Ve_1.id_class(l3, (l, d, d2) -> this.id_class.execute(() -> this.id_class(l, d, d2)), (l, n, n2, n3) -> this.id_class.execute(() -> this.id_class(l, n, n2, n3)), (l, d, d2) -> this.id_class.execute(() -> this.id_class(l, d2)), (l, n, l2) -> {
            Path[] pathArray = new Path[n];
            for (int i = 0; i < n; ++i) {
                pathArray[i] = Paths.get(GLFWDropCallback.getName((long)l2, (int)i), new String[0]);
            }
            this.id_class.execute(() -> this.id_class(Arrays.asList(pathArray)));
        });
    }

    private void id_class(List<Path> list) {
        if ((vm_3)this.id_class.id_class[73] != null) {
            ((vm_3)this.id_class.id_class[73]).a_(list);
        }
    }

    public void id_break(boolean bl) {
        if (this.id_class.id_static() && !this.id_package) {
            if (!((Boolean)QY.id_break[2]).booleanValue()) {
                Vu_1.id_class();
            }
            this.id_package = true;
            this.id_throws = this.id_class.id_else().id_new() / 2;
            this.id_case = this.id_class.id_else().id_continue() / 2;
            Ve_1.id_class(this.id_class.id_else().id_implements(), 212995, this.id_throws, this.id_case);
            if (bl) {
                this.id_class.id_break((vm_3)null);
            }
            Integer n = 10000;
            this.id_class.id_class[66] = n;
            this.id_implements = true;
        }
    }

    public boolean id_break() {
        return this.id_protected;
    }

    public void id_throws() {
        this.id_implements = true;
    }

    public void id_catch() {
        this.id_break(true);
    }

    public boolean id_case() {
        return this.id_package;
    }

    public void id_implements() {
        this.id_implements = true;
    }

    public double id_protected() {
        return this.id_case;
    }

    public void id_private() {
        if (this.id_package) {
            this.id_package = false;
            this.id_throws = this.id_class.id_else().id_new() / 2;
            this.id_case = this.id_class.id_else().id_continue() / 2;
            Ve_1.id_class(this.id_class.id_else().id_implements(), 212993, this.id_throws, this.id_case);
        }
    }
}

