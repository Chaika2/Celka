/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.rle_3;
import celestial.rll_3;
import celestial.rqR_2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rlg_3
implements rll_3 {
    private static final Logger id_class = LogManager.getLogger();

    @Override
    public void id_class(rle_3 rle_32) {
        if (rle_32.id_extends()) {
            id_class.error(rle_32.id_byte() + " failed! " + rqR_2.id_protected(rle_32.id_finally()));
        } else {
            id_class.warn("(optional) " + rle_32.id_byte() + " failed. " + rqR_2.id_protected(rle_32.id_finally()));
        }
    }
}

