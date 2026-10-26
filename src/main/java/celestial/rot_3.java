/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.rfU_2;
import celestial.rfj_3;
import celestial.rgn_3;
import celestial.roN_2;
import celestial.roq_3;
import celestial.rqR_2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rot_3
implements roq_3 {
    private static final Logger id_class = LogManager.getLogger();
    private final int id_break;
    private int id_byte;
    private long id_protected;
    private long id_throws = Long.MAX_VALUE;

    public rot_3(int n) {
        int n2 = n * 2 + 1;
        this.id_break = n2 * n2;
    }

    @Override
    public void id_class() {
        id_class.info("Time elapsed: {} ms", (Object)(rqR_2.id_break() - this.id_protected));
        this.id_throws = Long.MAX_VALUE;
    }

    @Override
    public void id_class(rfj_3 rfj_32) {
        this.id_protected = this.id_throws = rqR_2.id_break();
    }

    @Override
    public void id_class(rfj_3 rfj_32, roN_2 roN_22) {
        if (roN_22 == roN_2.id_volatile) {
            ++this.id_byte;
        }
        int n = this.id_break();
        if (rqR_2.id_break() > this.id_throws) {
            this.id_throws += 500L;
            id_class.info(new rgn_3("menu.preparingSpawn", rfU_2.id_class(n, 0, 100)).getString());
        }
    }

    public int id_break() {
        return rfU_2.id_protected((float)this.id_byte * 100.0f / (float)this.id_break);
    }
}

