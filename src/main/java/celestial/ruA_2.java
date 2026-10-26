/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.util.concurrent.Future
 *  io.netty.util.concurrent.GenericFutureListener
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rud_3;
import celestial.rum_3;
import celestial.rvb_3;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ruA_2
extends rud_3 {
    private static final Logger id_catch = LogManager.getLogger();
    private static final rgP_2 id_private = new rgn_3("disconnect.exceeded_packet_rate");
    private final int id_implements;

    public ruA_2(int n) {
        super(rum_3.SERVERBOUND);
        this.id_implements = n;
    }

    @Override
    protected void id_break() {
        super.id_break();
        float f = this.id_volatile();
        if (f > (float)this.id_implements) {
            id_catch.warn("Player exceeded rate-limit (sent {} packets per second)", (Object)Float.valueOf(f));
            this.id_class(new rvb_3(id_private), (GenericFutureListener<? extends Future<? super Void>>)((GenericFutureListener)future -> this.id_class(id_private)));
            this.id_extends();
        }
    }
}

