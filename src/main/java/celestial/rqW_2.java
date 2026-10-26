/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.Hh_1;
import celestial.MT;
import celestial.QY;
import celestial.Qg_1;
import celestial.Qw_1;
import celestial.VC;
import celestial.fN_2;
import celestial.rVi_1;
import celestial.rgF_2;
import celestial.rgH_2;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgl_3;
import celestial.rgn_3;
import celestial.rqR_2;
import celestial.rrbb_3;
import celestial.rrxr_3;
import com.mojang.blaze3d.platform.GLX;
import com.mojang.blaze3d.systems.RenderSystem;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.Consumer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rqW_2 {
    private static final Logger id_class = LogManager.getLogger();
    private static final DateFormat id_break = new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss");

    public static void id_class(File file, int n, int n2, VC vC, Consumer<rgP_2> consumer) {
        rqW_2.id_class(file, null, n, n2, vC, consumer);
    }

    private static File id_class(File file) {
        String string = id_break.format(new Date());
        int n = 1;
        File file2;
        while ((file2 = new File(file, string + (String)(n == 1 ? "" : "_" + n) + ".png")).exists()) {
            ++n;
        }
        return file2;
    }

    public static fN_2 id_class(int n, int n2, VC vC) {
        if (!GLX.isUsingFBOs()) {
            fN_2 fN_22 = new fN_2(n, n2, false);
            fN_22.id_break(true);
            fN_22.id_case();
            return fN_22;
        }
        n = vC.id_class;
        n2 = vC.id_break;
        fN_2 fN_23 = new fN_2(n, n2, false);
        RenderSystem.bindTexture(vC.id_case());
        fN_23.id_class(0, true);
        fN_23.id_case();
        return fN_23;
    }

    public static void id_class(File file, String string, int n, int n2, VC vC, Consumer<rgP_2> consumer) {
        if (!RenderSystem.isOnRenderThread()) {
            RenderSystem.recordRenderCall(() -> rqW_2.id_break(file, string, n, n2, vC, consumer));
        } else {
            rqW_2.id_break(file, string, n, n2, vC, consumer);
        }
    }

    private static void id_break(File file, String string, int n, int n2, VC vC, Consumer<rgP_2> consumer) {
        boolean bl;
        QY qY = rrbb_3.X();
        Qg_1 qg_1 = qY.id_else();
        Qw_1 qw_1 = rrbb_3.rE();
        int n3 = qg_1.id_extends();
        int n4 = qg_1.id_native();
        int n5 = qw_1.rs;
        int n6 = qg_1.id_class(((Qw_1)qY.id_class[20]).rs, ((Qw_1)qY.id_class[20]).id_transient);
        int n7 = rrbb_3.rH();
        boolean bl2 = bl = GLX.isUsingFBOs() && n7 > 1;
        if (bl) {
            qw_1.rs = n6 * n7;
            qg_1.id_class(n3 * n7, n4 * n7);
            MT.id_transient();
            MT.id_interface(16640);
            qY.B().id_class(true);
            MT.id_import();
            ((Hh_1)qY.id_class[16]).id_class(qY.X(), System.nanoTime(), true);
        }
        fN_2 fN_22 = rqW_2.id_class(n, n2, vC);
        if (bl) {
            qY.B().id_throws();
            MT.id_for();
            rrbb_3.rE().rs = n5;
            qg_1.id_class(n3, n4);
        }
        File file2 = new File(file, "screenshots");
        file2.mkdir();
        File file3 = string == null ? rqW_2.id_class(file2) : new File(file2, string);
        Object object = null;
        if (rrxr_3.rT.id_byte()) {
            object = rrxr_3.id_private(rrxr_3.rT, fN_22, file3);
            if (rrxr_3.id_break(object, rrxr_3.B, new Object[0])) {
                rgP_2 rgP_22 = (rgP_2)rrxr_3.id_private(object, rrxr_3.BU, new Object[0]);
                consumer.accept(rgP_22);
                return;
            }
            file3 = (File)rrxr_3.id_private(object, rrxr_3.Be, new Object[0]);
        }
        File file4 = file3;
        Object object2 = object;
        rqR_2.id_catch().execute(() -> {
            try {
                fN_22.id_class(file4);
                rVi_1 rVi_12 = new rgN_2(file4.getName()).id_class(rgF_2.UNDERLINE).id_class(rgc_32 -> rgc_32.id_class(new rgl_3(rgH_2.OPEN_FILE, file4.getAbsolutePath())));
                if (object2 != null && rrxr_3.id_private(object2, rrxr_3.Ba, new Object[0]) != null) {
                    consumer.accept((rgP_2)rrxr_3.id_private(object2, rrxr_3.Ba, new Object[0]));
                } else {
                    consumer.accept(new rgn_3("screenshot.success", rVi_12));
                }
            }
            catch (Exception exception) {
                id_class.warn("Couldn't save screenshot", (Throwable)exception);
                consumer.accept(new rgn_3("screenshot.failure", exception.getMessage()));
            }
            finally {
                fN_22.close();
            }
        });
    }
}

