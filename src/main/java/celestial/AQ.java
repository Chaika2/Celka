/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.Ak_1;
import celestial.QY;
import celestial.rcW_2;
import celestial.rcd_3;
import celestial.rcy_3;
import celestial.rqR_2;
import celestial.rrwp_3;
import celestial.rrwq_3;
import com.google.common.collect.Lists;
import java.io.File;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AQ {
    private static final Logger id_class = LogManager.getLogger();
    private final QY id_break;
    private final List<Ak_1> id_byte = Lists.newArrayList();

    public int id_byte() {
        return this.id_byte.size();
    }

    public static void id_byte(Ak_1 ak_1) {
        AQ aQ = new AQ(QY.id_instanceof());
        aQ.id_class();
        for (int i = 0; i < aQ.id_byte(); ++i) {
            Ak_1 ak_12 = aQ.id_class(i);
            if (!ak_12.id_class.equals(ak_1.id_class) || !ak_12.id_break.equals(ak_1.id_break)) continue;
            aQ.id_class(i, ak_1);
            break;
        }
        aQ.id_break();
    }

    public AQ(QY qY) {
        this.id_break = qY;
        this.id_class();
    }

    public void id_class(int n, int n2) {
        Ak_1 ak_1 = this.id_class(n);
        this.id_byte.set(n, this.id_class(n2));
        this.id_byte.set(n2, ak_1);
        this.id_break();
    }

    public void id_class(int n, Ak_1 ak_1) {
        this.id_byte.set(n, ak_1);
    }

    public void id_class() {
        try {
            this.id_byte.clear();
            ((rrwq_3)((Object)rrwq_3.staticFieldsd739829cf0613d349fc0bda49435f7f4[0])).id_class(this.id_byte);
            rcd_3 rcd_32 = rcW_2.id_break(new File((File)this.id_break.id_class[24], "servers.dat"));
            if (rcd_32 == null) {
                return;
            }
            rcy_3 rcy_32 = rcd_32.id_protected("servers", 10);
            for (int i = 0; i < rcy_32.size(); ++i) {
                this.id_byte.add(Ak_1.id_class(rcy_32.id_class(i)));
            }
        }
        catch (Exception exception) {
            id_class.error("Couldn't load server list", (Throwable)exception);
        }
    }

    public Ak_1 id_class(int n) {
        return this.id_byte.get(n);
    }

    public void id_class(Ak_1 ak_1) {
        this.id_byte.remove(ak_1);
    }

    public void id_break() {
        try {
            rcy_3 rcy_32 = new rcy_3();
            for (Ak_1 object2 : this.id_byte) {
                if (object2 instanceof rrwp_3) continue;
                rcy_32.add(object2.id_class());
            }
            rcd_3 rcd_32 = new rcd_3();
            rcd_32.id_class("servers", rcy_32);
            File file = File.createTempFile("servers", ".dat", (File)this.id_break.id_class[24]);
            rcW_2.id_break(rcd_32, file);
            File file2 = new File((File)this.id_break.id_class[24], "servers.dat_old");
            File file3 = new File((File)this.id_break.id_class[24], "servers.dat");
            rqR_2.id_class(file3, file, file2);
        }
        catch (Exception exception) {
            id_class.error("Couldn't save server list", (Throwable)exception);
        }
    }

    public void id_break(Ak_1 ak_1) {
        this.id_byte.add(ak_1);
    }

    public List<Ak_1> id_protected() {
        return this.id_byte;
    }
}

