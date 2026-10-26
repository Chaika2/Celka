/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Aq_1;
import celestial.Ax_1;
import celestial.Hh_1;
import celestial.KU;
import celestial.KY;
import celestial.Lu_1;
import celestial.QF;
import celestial.QY;
import celestial.Ql_1;
import celestial.Qw_1;
import celestial.Rk_1;
import celestial.Va_1;
import celestial.Ve_1;
import celestial.Vu_1;
import celestial.Zt_1;
import celestial.an_3;
import celestial.cI_2;
import celestial.cb_3;
import celestial.cq_3;
import celestial.gb_3;
import celestial.jI_2;
import celestial.mI_2;
import celestial.module.util.TestFunc;
import celestial.rVL;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rff_3;
import celestial.rfo_3;
import celestial.rgF_2;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rjG_2;
import celestial.rjU_2;
import celestial.rqO_2;
import celestial.rqR_2;
import celestial.rqW_2;
import celestial.rrLB;
import celestial.rrLS;
import celestial.rrLs_1;
import celestial.rrbb_3;
import celestial.rrdZ;
import celestial.rrkJ;
import celestial.rrth_3;
import celestial.rrxr_3;
import celestial.ryO_2;
import celestial.vm_3;
import celestial.xc_3;
import celestial.yK_2;
import celestial.yX_2;
import java.io.File;
import java.util.List;
import java.util.Locale;

public class Qj_1 {
    private final QY id_class;
    private boolean id_break;
    private final Ql_1 id_byte = new Ql_1();
    private long id_protected = -1L;
    private long id_throws = -1L;
    private long id_case = -1L;
    private boolean id_catch;

    public Qj_1(QY qY) {
        this.id_class = qY;
    }

    public String id_class() {
        return this.id_byte.id_class(this.id_class.id_else().id_implements(), (n, l) -> {
            if (n != 65545) {
                this.id_class.id_else().id_class(n, l);
            }
        });
    }

    public void id_class(String string) {
        this.id_byte.id_class(this.id_class.id_else().id_implements(), string);
    }

    private void id_class(rqO_2 rqO_22, rjU_2 rjU_22, rcd_3 rcd_32) {
        String string;
        if (rcd_32 != null) {
            rcd_32.id_continue("UUID");
            rcd_32.id_continue("Pos");
            rcd_32.id_continue("Dimension");
            String string2 = rcd_32.id_volatile().getString();
            string = String.format(Locale.ROOT, "/summon %s %.2f %.2f %.2f %s", rqO_22.toString(), rjU_22.id_break, rjU_22.id_byte, rjU_22.id_protected, string2);
        } else {
            string = String.format(Locale.ROOT, "/summon %s %.2f %.2f %.2f", rqO_22.toString(), rjU_22.id_break, rjU_22.id_byte, rjU_22.id_protected);
        }
        this.id_class(string);
    }

    private void id_class(xc_3 xc_32, rfH_2 rfH_22, rcd_3 rcd_32) {
        if (rcd_32 != null) {
            rcd_32.id_continue("x");
            rcd_32.id_continue("y");
            rcd_32.id_continue("z");
            rcd_32.id_continue("id");
        }
        StringBuilder stringBuilder = new StringBuilder(Rk_1.id_class(xc_32));
        if (rcd_32 != null) {
            stringBuilder.append(rcd_32);
        }
        String string = String.format(Locale.ROOT, "/setblock %d %d %d %s", rfH_22.b_(), rfH_22.c_(), rfH_22.d_(), stringBuilder);
        this.id_class(string);
    }

    private void id_class(boolean bl, boolean bl2) {
        rjG_2 rjG_22 = (rjG_2)this.id_class.id_class[64];
        if (rjG_22 != null) {
            switch (rjG_22.id_byte()) {
                case BLOCK: {
                    rfH_2 rfH_22 = ((rff_3)rjG_22).id_class();
                    xc_3 xc_32 = ((rYB)((cb_3)this.id_class.id_class[57]).id_throws[7]).id_byte(rfH_22);
                    if (bl) {
                        if (bl2) {
                            ((Aq_1)((cb_3)this.id_class.id_class[57]).id_break[0]).id_native().id_class(rfH_22, (rcd_3 rcd_32) -> {
                                this.id_class(xc_32, rfH_22, (rcd_3)rcd_32);
                                this.id_class("debug.inspect.server.block", new Object[0]);
                            });
                            break;
                        }
                        ryO_2 ryO_22 = ((rYB)((cb_3)this.id_class.id_class[57]).id_throws[7]).id_class(rfH_22);
                        rcd_3 rcd_33 = ryO_22 != null ? ryO_22.id_class(new rcd_3()) : null;
                        this.id_class(xc_32, rfH_22, rcd_33);
                        this.id_class("debug.inspect.client.block", new Object[0]);
                        break;
                    }
                    this.id_class(xc_32, rfH_22, (rcd_3)null);
                    this.id_class("debug.inspect.client.block", new Object[0]);
                    break;
                }
                case ENTITY: {
                    an_3 an_32 = ((rfo_3)rjG_22).id_class();
                    rqO_2 rqO_22 = rVL.id_transient.id_break(an_32.BC());
                    if (bl) {
                        if (bl2) {
                            ((Aq_1)((cb_3)this.id_class.id_class[57]).id_break[0]).id_native().id_class(an_32.V(), (rcd_3 rcd_32) -> {
                                this.id_class(rqO_22, an_32.Ps(), (rcd_3)rcd_32);
                                this.id_class("debug.inspect.server.entity", new Object[0]);
                            });
                            break;
                        }
                        rcd_3 rcd_34 = an_32.id_case(new rcd_3());
                        this.id_class(rqO_22, an_32.Ps(), rcd_34);
                        this.id_class("debug.inspect.client.entity", new Object[0]);
                        break;
                    }
                    this.id_class(rqO_22, an_32.Ps(), (rcd_3)null);
                    this.id_class("debug.inspect.client.entity", new Object[0]);
                }
            }
        }
    }

    private boolean id_class(int n) {
        if (this.id_protected > 0L && this.id_protected < rqR_2.id_break() - 100L) {
            return true;
        }
        switch (n) {
            case 65: {
                ((yX_2)this.id_class.id_class[8]).id_throws();
                this.id_class("debug.reload_chunks.message", new Object[0]);
                return true;
            }
            case 66: {
                boolean bl = !this.id_class.id_case().id_break();
                this.id_class.id_case().id_break(bl);
                this.id_class(bl ? "debug.show_hitboxes.on" : "debug.show_hitboxes.off", new Object[0]);
                return true;
            }
            case 67: {
                if (((cb_3)this.id_class.id_class[57]).sW()) {
                    return false;
                }
                Aq_1 aq_1 = (Aq_1)((cb_3)this.id_class.id_class[57]).id_break[0];
                if (aq_1 == null) {
                    return false;
                }
                this.id_class("debug.copy_location.message", new Object[0]);
                this.id_class(String.format(Locale.ROOT, "/execute in %s run tp @s %.2f %.2f %.2f %.2f %.2f", ((rYB)((cb_3)this.id_class.id_class[57]).id_throws[7]).E().id_class(), ((cb_3)this.id_class.id_class[57]).rx(), ((cb_3)this.id_class.id_class[57]).re(), ((cb_3)this.id_class.id_class[57]).BO(), Float.valueOf(((Float)((cb_3)this.id_class.id_class[57]).id_throws[15]).floatValue()), Float.valueOf(((Float)((cb_3)this.id_class.id_class[57]).id_throws[16]).floatValue())));
                return true;
            }
            case 68: {
                if ((cq_3)this.id_class.id_class[19] != null) {
                    ((cq_3)this.id_class.id_class[19]).id_throws().id_class(false);
                    ((cq_3)this.id_class.id_class[19]).id_class(null, null, -1, -1, -1);
                    ((cq_3)this.id_class.id_class[19]).id_class();
                }
                ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).id_class();
                ((List)TestFunc.id_byte[0]).clear();
                return true;
            }
            case 70: {
                QF.id_int.id_class((Qw_1)this.id_class.id_class[20], rfU_2.id_class((double)(((Qw_1)this.id_class.id_class[20]).id_break + (vm_3.id_synchronized() ? -1 : 1)), QF.id_int.id_throws(), QF.id_int.id_case()));
                this.id_class("debug.cycle_renderdistance.message", ((Qw_1)this.id_class.id_class[20]).id_break);
                return true;
            }
            case 71: {
                boolean bl = ((yK_2)this.id_class.id_class[17]).id_break();
                this.id_class(bl ? "debug.chunk_boundaries.on" : "debug.chunk_boundaries.off", new Object[0]);
                return true;
            }
            case 72: {
                ((Qw_1)this.id_class.id_class[20]).id_int = !((Qw_1)this.id_class.id_class[20]).id_int;
                this.id_class(((Qw_1)this.id_class.id_class[20]).id_int ? "debug.advanced_tooltips.on" : "debug.advanced_tooltips.off", new Object[0]);
                ((Qw_1)this.id_class.id_class[20]).id_break();
                return true;
            }
            case 73: {
                if (!((cb_3)this.id_class.id_class[57]).sW()) {
                    this.id_class(((cb_3)this.id_class.id_class[57]).id_catch(2), !vm_3.id_synchronized());
                }
                return true;
            }
            case 76: {
                QY qY = rrbb_3.X();
                ((yX_2)qY.id_class[8]).id_catch = 1;
                rgN_2 rgN_22 = new rgN_2(jI_2.id_class("of.message.loadingVisibleChunks", new Object[0]));
                ((cq_3)qY.id_class[19]).id_throws().id_class((rgP_2)rgN_22, 201435902);
                return true;
            }
            case 78: {
                if (!((cb_3)this.id_class.id_class[57]).id_catch(2)) {
                    this.id_class("debug.creative_spectator.error", new Object[0]);
                } else if (!((cb_3)this.id_class.id_class[57]).id_native()) {
                    ((cb_3)this.id_class.id_class[57]).id_protected("/gamemode spectator");
                } else {
                    ((cb_3)this.id_class.id_class[57]).id_protected("/gamemode " + ((Ax_1)this.id_class.id_class[55]).id_extends().id_break());
                }
                return true;
            }
            case 79: {
                if (rrbb_3.rs()) {
                    rrkJ rrkJ2 = new rrkJ(null, rrbb_3.rE());
                    rrbb_3.X().id_break(rrkJ2);
                }
                return true;
            }
            case 80: {
                ((Qw_1)this.id_class.id_class[20]).id_new = !((Qw_1)this.id_class.id_class[20]).id_new;
                ((Qw_1)this.id_class.id_class[20]).id_break();
                this.id_class(((Qw_1)this.id_class.id_class[20]).id_new ? "debug.pause_focus.on" : "debug.pause_focus.off", new Object[0]);
                return true;
            }
            case 81: {
                this.id_class("debug.help.message", new Object[0]);
                cI_2 cI_22 = ((cq_3)this.id_class.id_class[19]).id_throws();
                cI_22.id_class(new rgn_3("debug.reload_chunks.help"));
                cI_22.id_class(new rgn_3("debug.show_hitboxes.help"));
                cI_22.id_class(new rgn_3("debug.copy_location.help"));
                cI_22.id_class(new rgn_3("debug.clear_chat.help"));
                cI_22.id_class(new rgn_3("debug.cycle_renderdistance.help"));
                cI_22.id_class(new rgn_3("debug.chunk_boundaries.help"));
                cI_22.id_class(new rgn_3("debug.advanced_tooltips.help"));
                cI_22.id_class(new rgn_3("debug.inspect.help"));
                cI_22.id_class(new rgn_3("debug.creative_spectator.help"));
                cI_22.id_class(new rgn_3("debug.pause_focus.help"));
                cI_22.id_class(new rgn_3("debug.help.help"));
                cI_22.id_class(new rgn_3("debug.reload_resourcepacks.help"));
                cI_22.id_class(new rgn_3("debug.pause.help"));
                cI_22.id_class(new rgn_3("debug.gamemodes.help"));
                return true;
            }
            case 82: {
                if (rrbb_3.rs()) {
                    rrdZ.id_while();
                    rrdZ.id_byte();
                }
                return true;
            }
            case 84: {
                this.id_class("debug.reload_resourcepacks.message", new Object[0]);
                this.id_class.id_private();
                return true;
            }
            case 293: {
                if (!((cb_3)this.id_class.id_class[57]).id_catch(2)) {
                    this.id_class("debug.gamemodes.error", new Object[0]);
                } else {
                    this.id_class.id_break(new Zt_1());
                }
                return true;
            }
        }
        return false;
    }

    private void id_class(String string, Object ... objectArray) {
        ((cq_3)this.id_class.id_class[19]).id_throws().id_class(new rgN_2("").id_class(new rgn_3("debug.prefix").id_class(rgF_2.YELLOW, rgF_2.BOLD)).id_break(" ").id_class(new rgn_3(string, objectArray)));
    }

    public void id_class(long l2) {
        Ve_1.id_class(l2, (l, n, n2, n3, n4) -> this.id_class.execute(() -> this.id_class(l, n, n2, n3, n4)), (l, n, n2) -> this.id_class.execute(() -> this.id_class(l, n, n2)));
    }

    private void id_class(long l, int n, int n2) {
        vm_3 vm_32;
        if (l == this.id_class.id_else().id_implements() && (vm_32 = (vm_3)this.id_class.id_class[73]) != null && this.id_class.id_long() == null) {
            if (Character.charCount(n) == 1) {
                vm_3.id_class(() -> {
                    if (!rrxr_3.rC.id_byte() || !rrxr_3.id_break(rrxr_3.rC, (vm_3)this.id_class.id_class[73], Character.valueOf((char)n), n2)) {
                        boolean bl = vm_32.id_class((char)n, n2);
                        if (rrxr_3.rl.id_byte() && !bl) {
                            rrxr_3.id_break(rrxr_3.rl, (vm_3)this.id_class.id_class[73], Character.valueOf((char)n), n2);
                        }
                    }
                }, "charTyped event handler", vm_32.getClass().getCanonicalName());
            } else {
                for (char c : Character.toChars(n)) {
                    vm_3.id_class(() -> {
                        if (!rrxr_3.rC.id_byte() || !rrxr_3.id_break(rrxr_3.rC, (vm_3)this.id_class.id_class[73], Character.valueOf(c), n2)) {
                            boolean bl = vm_32.id_class(c, n2);
                            if (rrxr_3.rl.id_byte() && !bl) {
                                rrxr_3.id_break(rrxr_3.rl, (vm_3)this.id_class.id_class[73], Character.valueOf(c), n2);
                            }
                        }
                    }, "charTyped event handler", vm_32.getClass().getCanonicalName());
                }
            }
        }
    }

    public void id_class(long l, int n, int n2, int n3, int n4) {
        if (l == this.id_class.id_else().id_implements()) {
            boolean bl;
            Va_1 va_1;
            boolean bl2 = Ve_1.id_class(QY.id_instanceof().id_else().id_implements(), 292);
            if (this.id_protected > 0L) {
                if (!Ve_1.id_class(QY.id_instanceof().id_else().id_implements(), 67) || !bl2) {
                    this.id_protected = -1L;
                }
            } else if (Ve_1.id_class(QY.id_instanceof().id_else().id_implements(), 67) && bl2) {
                this.id_catch = true;
                this.id_protected = rqR_2.id_break();
                this.id_throws = rqR_2.id_break();
                this.id_case = 0L;
            }
            if (rrLs_1.id_class(va_1 = Ve_1.id_class(n, n2), n, n3).id_byte()) {
                return;
            }
            vm_3 vm_32 = (vm_3)this.id_class.id_class[73];
            if (!((vm_3)this.id_class.id_class[73] instanceof mI_2 && ((mI_2)vm_32).id_throws > rqR_2.id_break() - 20L || n3 != 1)) {
                if (((Qw_1)this.id_class.id_class[20]).y.id_class(n, n2)) {
                    this.id_class.id_else().id_private();
                    ((Qw_1)this.id_class.id_class[20]).s = this.id_class.id_else().id_finally();
                    ((Qw_1)this.id_class.id_class[20]).id_break();
                    return;
                }
                if (((Qw_1)this.id_class.id_class[20]).n.id_class(n, n2)) {
                    if (vm_3.id_else()) {
                        // empty if block
                    }
                    rqW_2.id_class((File)this.id_class.id_class[24], this.id_class.id_else().id_extends(), this.id_class.id_else().id_native(), this.id_class.B(), rgP_22 -> this.id_class.execute(() -> ((cq_3)this.id_class.id_class[19]).id_throws().id_class((rgP_2)rgP_22)));
                    return;
                }
            }
            boolean bl3 = bl = vm_32 == null || !(vm_32.id_catch() instanceof Lu_1) || !((Lu_1)vm_32.id_catch()).id_volatile();
            if (vm_32 != null) {
                boolean[] blArray = new boolean[]{false};
                vm_3.id_class(() -> {
                    if (!(n3 == 1 || n3 == 2 && this.id_break)) {
                        if (n3 == 0) {
                            if (rrxr_3.rp.id_byte()) {
                                blArray[0] = rrxr_3.id_break(rrxr_3.rp, (vm_3)this.id_class.id_class[73], n, n2, n4);
                                if (blArray[0]) {
                                    return;
                                }
                            }
                            blArray[0] = vm_32.id_break(n, n2, n4);
                            if (rrxr_3.rq.id_byte() && !blArray[0]) {
                                blArray[0] = rrxr_3.id_break(rrxr_3.rq, (vm_3)this.id_class.id_class[73], n, n2, n4);
                            }
                        }
                    } else {
                        if (rrxr_3.rH.id_byte()) {
                            blArray[0] = rrxr_3.id_break(rrxr_3.rH, (vm_3)this.id_class.id_class[73], n, n2, n4);
                            if (blArray[0]) {
                                return;
                            }
                        }
                        blArray[0] = vm_32.id_class(n, n2, n4);
                        if (rrxr_3.ry.id_byte() && !blArray[0]) {
                            blArray[0] = rrxr_3.id_break(rrxr_3.ry, (vm_3)this.id_class.id_class[73], n, n2, n4);
                        }
                    }
                }, "keyPressed event handler", vm_32.getClass().getCanonicalName());
                if (blArray[0]) {
                    return;
                }
            }
            if ((vm_3)this.id_class.id_class[73] == null || ((vm_3)this.id_class.id_class[73]).id_continue) {
                if (n3 == 0) {
                    Vu_1.id_class(va_1, false);
                    if (n == 292) {
                        if (this.id_catch) {
                            this.id_catch = false;
                        } else {
                            ((Qw_1)this.id_class.id_class[20]).R = !((Qw_1)this.id_class.id_class[20]).R;
                            ((Qw_1)this.id_class.id_class[20]).Y = ((Qw_1)this.id_class.id_class[20]).R && vm_3.id_synchronized();
                            boolean bl4 = ((Qw_1)this.id_class.id_class[20]).o = ((Qw_1)this.id_class.id_class[20]).R && vm_3.id_return();
                            if (((Qw_1)this.id_class.id_class[20]).R) {
                                if (((Qw_1)this.id_class.id_class[20]).rA) {
                                    ((Qw_1)this.id_class.id_class[20]).o = true;
                                }
                                if (((Qw_1)this.id_class.id_class[20]).rn) {
                                    ((Qw_1)this.id_class.id_class[20]).Y = true;
                                }
                            }
                        }
                    }
                } else {
                    if (n == 293 && (Hh_1)this.id_class.id_class[16] != null) {
                        ((Hh_1)this.id_class.id_class[16]).id_byte();
                    }
                    if ((vm_3)this.id_class.id_class[73] == null) {
                        if (n3 == 1) {
                            rrLB.id_break((rrLS)((Object)rrLS.staticFields5263c46d9cc33ff8a76200218759034b[1]), n, bl2);
                        }
                        if (n == 256) {
                            this.id_class.id_break(bl2);
                        }
                        boolean bl5 = bl2 && this.id_class(n);
                        this.id_catch |= bl5;
                        if (n == 290) {
                            ((Qw_1)this.id_class.id_class[20]).g = !((Qw_1)this.id_class.id_class[20]).g;
                        }
                    }
                    Vu_1.id_class(va_1, true);
                    Vu_1.id_class(va_1);
                }
            }
        }
    }

    public void id_class(boolean bl) {
        this.id_break = bl;
    }

    private void id_break(String string, Object ... objectArray) {
        ((cq_3)this.id_class.id_class[19]).id_throws().id_class(new rgN_2("").id_class(new rgn_3("debug.prefix").id_class(rgF_2.RED, rgF_2.BOLD)).id_break(" ").id_class(new rgn_3(string, objectArray)));
    }

    public void id_break() {
        if (this.id_protected > 0L) {
            long l = rqR_2.id_break();
            long l2 = 10000L - (l - this.id_protected);
            long l3 = l - this.id_throws;
            if (l2 < 0L) {
                if (vm_3.id_else()) {
                    gb_3.id_class();
                }
                throw new KU(new KY("Manually triggered debug crash", new Throwable()));
            }
            if (l3 >= 1000L) {
                if (this.id_case == 0L) {
                    this.id_class("debug.crash.message", new Object[0]);
                } else {
                    this.id_break("debug.crash.warning", rfU_2.id_case((float)l2 / 1000.0f));
                }
                this.id_throws = l;
                ++this.id_case;
            }
        }
    }
}

