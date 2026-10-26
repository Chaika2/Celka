/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.NS;
import celestial.rqA_2;
import celestial.rqn_3;

public class Ns_1 {
    public static final NS id_class = new NS(rqn_3.bN, 20, 600, true);
    public static final NS id_break = new NS(rqn_3.bP, 12000, 24000, false);
    public static final NS id_byte = new NS(rqn_3.bB, 0, 0, true);
    public static final NS id_protected = new NS(rqn_3.bW, 0, 0, true);
    public static final NS id_throws = new NS(rqn_3.bz, 6000, 24000, true);
    public static final NS id_case = Ns_1.id_class(rqn_3.bF);
    public static final NS id_catch = Ns_1.id_class(rqn_3.bQ);

    public static NS id_class(rqA_2 rqA_22) {
        return new NS(rqA_22, 12000, 24000, false);
    }
}

