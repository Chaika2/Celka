/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.AQ;
import celestial.AZ;
import celestial.Ak_1;
import celestial.LV;
import celestial.Lt_1;
import celestial.Lw_1;
import celestial.QY;
import celestial.rgF_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rqO_2;
import celestial.rya_3;
import celestial.vA_2;
import celestial.vC_2;
import celestial.vG_2;
import celestial.vL_2;
import celestial.vn_3;
import com.google.common.collect.Lists;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.util.List;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class vF_2
extends LV<vL_2> {
    public static final Logger id_implements = LogManager.getLogger();
    public static final ThreadPoolExecutor id_class = new ScheduledThreadPoolExecutor(5, new ThreadFactoryBuilder().setNameFormat("Server Pinger #%d").setDaemon(true).setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)new rya_3(id_implements)).build());
    public static final rqO_2 id_throws = new rqO_2("textures/misc/unknown_server.png");
    public static final rqO_2 id_case = new rqO_2("textures/gui/server_selection.png");
    public static final rgP_2 id_finally = new rgn_3("lanServer.scanning");
    public static final rgP_2 id_catch = new rgn_3("multiplayer.status.cannot_resolve").id_class(rgF_2.DARK_RED);
    public static final rgP_2 id_private = new rgn_3("multiplayer.status.cannot_connect").id_class(rgF_2.DARK_RED);
    public static final rgP_2 id_extends = new rgn_3("multiplayer.status.incompatible");
    public static final rgP_2 id_return = new rgn_3("multiplayer.status.no_connection");
    public static final rgP_2 id_public = new rgn_3("multiplayer.status.pinging");
    private final vG_2 id_goto;
    private final List<vC_2> id_while = Lists.newArrayList();
    private final vL_2 id_try = new vn_3();
    private final List<vA_2> id_instanceof = Lists.newArrayList();

    public vF_2(vG_2 vG_22, QY qY, int n, int n2, int n3, int n4, int n5) {
        super(qY, n, n2, n3, n4, n5);
        this.id_goto = vG_22;
    }

    @Override
    public void id_class(vL_2 vL_22) {
        super.id_class(vL_22);
        this.id_goto.id_native();
    }

    @Override
    protected boolean id_class() {
        return this.id_goto.id_catch() == this;
    }

    public static /* synthetic */ void id_class(vF_2 vF_22, Lt_1 lt_1) {
        vF_22.id_protected(lt_1);
    }

    public static /* synthetic */ int id_class(vF_2 vF_22, int n) {
        return vF_22.id_case(n);
    }

    @Override
    public boolean id_class(int n, int n2, int n3) {
        vL_2 vL_22 = (vL_2)this.id_finally();
        return vL_22 != null && vL_22.id_class(n, n2, n3) || super.id_class(n, n2, n3);
    }

    @Override
    public void id_class(AQ aQ) {
        this.id_while.clear();
        for (int i = 0; i < aQ.id_byte(); ++i) {
            Ak_1 ak_1 = aQ.id_class(i);
            this.id_while.add(new vC_2(this, this.id_goto, ak_1));
        }
        this.id_private();
    }

    @Override
    public void id_class(List<AZ> list) {
        this.id_instanceof.clear();
        for (AZ aZ : list) {
            this.id_instanceof.add(new vA_2(this.id_goto, aZ));
        }
        this.id_private();
    }

    @Override
    protected void id_class(Lw_1 lw_1) {
        this.id_class(lw_1, vL_22 -> !(vL_22 instanceof vn_3));
    }

    @Override
    protected int id_protected() {
        return super.id_protected() + 30;
    }

    private void id_private() {
        this.id_native();
        this.id_while.forEach(lt_1 -> this.id_break(lt_1));
        this.id_break(this.id_try);
        this.id_instanceof.forEach(lt_1 -> this.id_break(lt_1));
    }

    @Override
    public int F_() {
        return super.F_() + 85;
    }
}

