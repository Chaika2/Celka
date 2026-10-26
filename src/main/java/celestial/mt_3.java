/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.Ad_1;
import celestial.Ak_1;
import celestial.LF;
import celestial.Ml_1;
import celestial.QY;
import celestial.cN_2;
import celestial.mw_3;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rqR_2;
import celestial.rrQJ;
import celestial.rrZr_1;
import celestial.rrft_3;
import celestial.rrvu_1;
import celestial.rud_3;
import celestial.rya_3;
import celestial.vm_3;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class mt_3
extends vm_3 {
    private static final AtomicInteger id_class = new AtomicInteger(0);
    public static final Logger id_throws = LogManager.getLogger();
    public rud_3 id_case;
    public boolean id_catch;
    public final vm_3 id_private;
    private rgP_2 id_implements = new rgn_3("connect.connecting");
    private long id_finally = -1L;

    public mt_3(vm_3 vm_32, QY qY, String string, int n) {
        super(rgN_2.id_byte);
        this.id_volatile = qY;
        this.id_private = vm_32;
        qY.id_transient();
        this.id_class(string, n);
    }

    public mt_3(vm_3 vm_32, QY qY, Ak_1 ak_1, int n) {
        super(rgN_2.id_byte);
        this.id_volatile = qY;
        this.id_private = vm_32;
        Ad_1 ad_1 = Ad_1.id_class(ak_1.id_break);
        qY.id_transient();
        qY.id_class(ak_1);
        rrft_3.id_class(() -> this.id_class(ad_1.id_class(), ad_1.id_break()), n);
    }

    public mt_3(vm_3 vm_32, QY qY, Ak_1 ak_1) {
        super(rgN_2.id_byte);
        this.id_volatile = qY;
        this.id_private = vm_32;
        Ad_1 ad_1 = Ad_1.id_class(ak_1.id_break);
        qY.id_transient();
        qY.id_class(ak_1);
        this.id_class(ad_1.id_class(), ad_1.id_break());
    }

    private void id_class(String string, int n) {
        ((rrvu_1)rrvu_1.staticFields795d62f6fe74334786edf14455ec3bfd[0]).id_class((rrZr_1)rrQJ.id_class[5], string);
        id_throws.info("Connecting to {}, {}", (Object)string, (Object)n);
        mw_3 mw_32 = new mw_3(this, "Server Connector #" + id_class.incrementAndGet(), string, n);
        mw_32.setUncaughtExceptionHandler(new rya_3(id_throws));
        mw_32.start();
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        this.id_class(ml_1);
        long l = rqR_2.id_break();
        if (l - this.id_finally > 2000L) {
            this.id_finally = l;
        }
        mt_3.id_class(ml_1, this.id_super, this.id_implements, this.id_package / 2, this.id_int / 2 - 50, 0xFFFFFF);
        super.id_class(ml_1, n, n2, f);
    }

    public void id_break(rgP_2 rgP_22) {
        this.id_implements = rgP_22;
    }

    @Override
    public void id_private() {
        if (this.id_case != null) {
            if (this.id_case.id_case()) {
                this.id_case.id_class();
            } else {
                this.id_case.id_native();
            }
        }
    }

    @Override
    public boolean E_() {
        return false;
    }

    @Override
    protected void v_() {
        this.id_class(new LF(this.id_package / 2 - 100, this.id_int / 4 + 120 + 12, 200, 20, cN_2.id_protected, lF -> {
            this.id_catch = true;
            if (this.id_case != null) {
                this.id_case.id_class(new rgn_3("connect.aborted"));
            }
            this.id_volatile.id_break(this.id_private);
        }));
    }
}

