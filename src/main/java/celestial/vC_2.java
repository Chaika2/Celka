/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.hash.Hashing
 *  org.apache.commons.lang3.Validate
 */
package celestial;

import celestial.Ak_1;
import celestial.Ml_1;
import celestial.QY;
import celestial.Qw_1;
import celestial.ch_3;
import celestial.cm_3;
import celestial.fN_2;
import celestial.ff_3;
import celestial.fk_3;
import celestial.rgF_2;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgS_2;
import celestial.rgn_3;
import celestial.rpl_3;
import celestial.rqO_2;
import celestial.rqR_2;
import celestial.rqu_3;
import celestial.rrQX;
import celestial.rrfD_2;
import celestial.rrwA_2;
import celestial.rrwp_3;
import celestial.util.ColorHelper;
import celestial.vF_2;
import celestial.vG_2;
import celestial.vL_2;
import celestial.vm_3;
import com.google.common.hash.Hashing;
import com.mojang.blaze3d.systems.RenderSystem;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.apache.commons.lang3.Validate;

public class vC_2
extends vL_2 {
    private final vG_2 id_break;
    private final QY id_byte;
    private final Ak_1 id_protected;
    private final rqO_2 id_throws;
    private String id_case;
    private fk_3 id_catch;
    private long id_private;
    public final /* synthetic */ vF_2 id_class;

    private boolean id_byte() {
        return true;
    }

    protected vC_2(vF_2 vF_22, vG_2 vG_22, Ak_1 ak_1) {
        this.id_class = vF_22;
        this.id_break = vG_22;
        this.id_protected = ak_1;
        this.id_byte = QY.id_instanceof();
        this.id_throws = new rqO_2("servers/" + Hashing.sha1().hashUnencodedChars((CharSequence)ak_1.id_break) + "/icon");
        this.id_catch = (fk_3)this.id_byte.A().id_break(this.id_throws);
    }

    private void id_class(int n, int n2) {
        this.id_break.id_package().id_class(n, n2);
        this.id_break.id_class.id_class(this.id_break.id_package());
        vL_2 vL_22 = (vL_2)this.id_break.id_class.x_().get(n2);
        this.id_break.id_class.id_class(vL_22);
        vF_2.id_class(this.id_class, vL_22);
    }

    private boolean id_class(String string) {
        if (string == null) {
            this.id_byte.A().id_byte(this.id_throws);
            if (this.id_catch != null && this.id_catch.id_break() != null) {
                this.id_catch.id_break().close();
            }
            this.id_catch = null;
        } else {
            try {
                fN_2 fN_22 = fN_2.id_class(string);
                Validate.validState((fN_22.id_class() == 64 ? 1 : 0) != 0, (String)"Must be 64 pixels wide", (Object[])new Object[0]);
                Validate.validState((fN_22.id_break() == 64 ? 1 : 0) != 0, (String)"Must be 64 pixels high", (Object[])new Object[0]);
                if (this.id_catch == null) {
                    this.id_catch = new fk_3(fN_22);
                } else {
                    this.id_catch.id_class(fN_22);
                    this.id_catch.id_class();
                }
                this.id_byte.A().id_class(this.id_throws, (ff_3)this.id_catch);
            }
            catch (Throwable throwable) {
                vF_2.id_implements.error("Invalid icon for server {} ({})", (Object)this.id_protected.id_class, (Object)this.id_protected.id_break, (Object)throwable);
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean id_class(int n, int n2, int n3) {
        if (vm_3.id_synchronized()) {
            vF_2 vF_22 = this.id_break.id_class;
            int n4 = vF_22.x_().indexOf(this);
            if (n == 264 && n4 < this.id_break.id_package().id_byte() - 1 || n == 265 && n4 > 0) {
                this.id_class(n4, n == 264 ? n4 + 1 : n4 - 1);
                return true;
            }
        }
        return super.id_class(n, n2, n3);
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl, float f) {
        List<rgP_2> list;
        rgP_2 rgP_22;
        int n8;
        int n9;
        Object object;
        Object object2;
        int n10;
        if (!this.id_protected.id_private) {
            this.id_protected.id_private = true;
            this.id_protected.id_throws = -2L;
            this.id_protected.id_protected = rgN_2.id_byte;
            this.id_protected.id_byte = rgN_2.id_byte;
            vF_2.id_class.submit(() -> {
                try {
                    this.id_break.id_final().id_class(this.id_protected, () -> this.id_byte.execute(this::id_class));
                }
                catch (UnknownHostException unknownHostException) {
                    this.id_protected.id_throws = -1L;
                    this.id_protected.id_protected = vF_2.id_catch;
                }
                catch (Exception exception) {
                    this.id_protected.id_throws = -1L;
                    this.id_protected.id_protected = vF_2.id_private;
                }
            });
        }
        boolean bl2 = this.id_protected.id_case != rqu_3.id_class().getProtocolVersion();
        Ak_1 ak_1 = this.id_protected;
        if (ak_1 instanceof rrwp_3 && (n10 = ((rrwp_3)(object2 = (rrwp_3)ak_1)).id_private()) != -1) {
            rrfD_2.id_byte(ml_1, n3, (float)n2, (float)(n4 - 5), (float)n5, ColorHelper.id_class(n10, 0.1f), n10);
        }
        object2 = this.id_protected.id_class;
        boolean bl3 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().id_throws().id_super();
        boolean bl4 = false;
        String string = null;
        if (bl3 && this.id_protected instanceof rrwA_2) {
            object2 = "FT";
            bl4 = true;
            string = "celestial.su";
        }
        ((cm_3)this.id_byte.id_class[15]).id_break(ml_1, (String)object2, (float)(n3 + 32 + 3), (float)(n2 + 1), 0xFFFFFF);
        if (string != null) {
            ((cm_3)this.id_byte.id_class[15]).id_break(ml_1, string, (float)(n3 + 32 + 3), (float)(n2 + 12), 0x808080);
        } else {
            object = ((cm_3)this.id_byte.id_class[15]).id_break(this.id_protected.id_protected, n4 - 32 - 2);
            for (n9 = 0; n9 < Math.min(object.size(), 2); ++n9) {
                ((cm_3)this.id_byte.id_class[15]).id_break(ml_1, (rpl_3)object.get(n9), (float)(n3 + 32 + 3), (float)(n2 + 12 + 9 * n9), 0x808080);
            }
        }
        object = bl2 ? this.id_protected.id_catch.id_case().id_class(rgF_2.RED) : this.id_protected.id_byte;
        n9 = ((cm_3)this.id_byte.id_class[15]).id_class((rgS_2)object);
        ((cm_3)this.id_byte.id_class[15]).id_byte(ml_1, (rgP_2)object, n3 + n4 - n9 - 15 - 2, n2 + 1, 0x808080);
        int n11 = 0;
        if (bl2) {
            n8 = 5;
            rgP_22 = vF_2.id_extends;
            list = this.id_protected.id_implements;
        } else if (this.id_protected.id_private && this.id_protected.id_throws != -2L) {
            n8 = this.id_protected.id_throws < 0L ? 5 : (this.id_protected.id_throws < 150L ? 0 : (this.id_protected.id_throws < 300L ? 1 : (this.id_protected.id_throws < 600L ? 2 : (this.id_protected.id_throws < 1000L ? 3 : 4))));
            if (this.id_protected.id_throws < 0L) {
                rgP_22 = vF_2.id_return;
                list = Collections.emptyList();
            } else {
                rgP_22 = new rgn_3("multiplayer.status.ping", this.id_protected.id_throws);
                list = this.id_protected.id_implements;
            }
        } else {
            n11 = 1;
            n8 = (int)(rqR_2.id_break() / 100L + (long)(n * 2) & 7L);
            if (n8 > 4) {
                n8 = 8 - n8;
            }
            rgP_22 = vF_2.id_public;
            list = Collections.emptyList();
        }
        RenderSystem.color4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.id_byte.A().id_class(ch_3.id_protected);
        ch_3.id_class(ml_1, n3 + n4 - 15, n2, (float)(n11 * 10), (float)(176 + n8 * 8), 10, 8, 256, 256);
        String string2 = this.id_protected.id_byte();
        if (!Objects.equals(string2, this.id_case)) {
            if (this.id_class(string2)) {
                this.id_case = string2;
            } else {
                this.id_protected.id_class((String)null);
                this.id_class();
            }
        }
        if (bl4) {
            this.id_class(ml_1, n3, n2, vF_2.id_throws);
        } else if (this.id_catch != null) {
            this.id_class(ml_1, n3, n2, this.id_throws);
        } else {
            this.id_class(ml_1, n3, n2, vF_2.id_throws);
        }
        int n12 = n6 - n3;
        int n13 = n7 - n2;
        if (n12 >= n4 - 15 && n12 <= n4 - 5 && n13 >= 0 && n13 <= 8) {
            this.id_break.id_class(Collections.singletonList(rgP_22));
        } else if (n12 >= n4 - n9 - 15 - 2 && n12 <= n4 - 15 - 2 && n13 >= 0 && n13 <= 8) {
            this.id_break.id_class(list);
        }
        if (((Qw_1)this.id_byte.id_class[20]).S || bl) {
            this.id_byte.A().id_class(vF_2.id_case);
            ch_3.id_class(ml_1, n3, n2, n3 + 32, n2 + 32, -1601138544);
            RenderSystem.color4f(1.0f, 1.0f, 1.0f, 1.0f);
            int n14 = n6 - n3;
            int n15 = n7 - n2;
            if (this.id_byte()) {
                if (n14 < 32 && n14 > 16) {
                    ch_3.id_class(ml_1, n3, n2, 0.0f, 32.0f, 32, 32, 256, 256);
                } else {
                    ch_3.id_class(ml_1, n3, n2, 0.0f, 0.0f, 32, 32, 256, 256);
                }
            }
            if (n > 0) {
                if (n14 < 16 && n15 < 16) {
                    ch_3.id_class(ml_1, n3, n2, 96.0f, 32.0f, 32, 32, 256, 256);
                } else {
                    ch_3.id_class(ml_1, n3, n2, 96.0f, 0.0f, 32, 32, 256, 256);
                }
            }
            if (n < this.id_break.id_package().id_byte() - 1) {
                if (n14 < 16 && n15 > 16) {
                    ch_3.id_class(ml_1, n3, n2, 64.0f, 32.0f, 32, 32, 256, 256);
                } else {
                    ch_3.id_class(ml_1, n3, n2, 64.0f, 0.0f, 32, 32, 256, 256);
                }
            }
        }
    }

    public void id_class() {
        this.id_break.id_package().id_break();
    }

    protected void id_class(Ml_1 ml_1, int n, int n2, rqO_2 rqO_22) {
        this.id_byte.A().id_class(rqO_22);
        RenderSystem.enableBlend();
        ch_3.id_class(ml_1, n, n2, 0.0f, 0.0f, 32, 32, 32, 32);
        RenderSystem.disableBlend();
    }

    public Ak_1 id_break() {
        return this.id_protected;
    }

    @Override
    public boolean id_break(double d, double d2, int n) {
        double d3 = d - (double)this.id_class.id_continue();
        double d4 = d2 - (double)vF_2.id_class(this.id_class, this.id_class.x_().indexOf(this));
        if (d3 <= 32.0) {
            if (d3 < 32.0 && d3 > 16.0 && this.id_byte()) {
                this.id_break.id_class(this);
                this.id_break.id_finally();
                return true;
            }
            int n2 = this.id_break.id_class.x_().indexOf(this);
            if (d3 < 16.0 && d4 < 16.0 && n2 > 0) {
                this.id_class(n2, n2 - 1);
                return true;
            }
            if (d3 < 16.0 && d4 > 16.0 && n2 < this.id_break.id_package().id_byte() - 1) {
                this.id_class(n2, n2 + 1);
                return true;
            }
        }
        this.id_break.id_class(this);
        if (rqR_2.id_break() - this.id_private < 250L) {
            this.id_break.id_finally();
        }
        this.id_private = rqR_2.id_break();
        return false;
    }
}

