/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.Ah_1;
import celestial.QY;
import celestial.an_3;
import celestial.gm_3;
import celestial.rRo_1;
import celestial.rRq_1;
import celestial.rYB;
import celestial.rYZ;
import celestial.rcd_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rfj_3;
import celestial.rjh_3;
import celestial.roC_2;
import celestial.roJ_2;
import celestial.roN_2;
import celestial.roQ_2;
import celestial.roX_2;
import celestial.ron_3;
import celestial.rrbB_2;
import celestial.rrbS_2;
import celestial.rrse_3;
import celestial.ruu_3;
import celestial.yX_2;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.function.BooleanSupplier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AO
extends roX_2 {
    private static final Logger id_class = LogManager.getLogger();
    private final roJ_2 id_break;
    private final rrse_3 id_byte;
    private volatile Ah_1 id_protected;
    public final gm_3 id_throws;

    @Override
    public String id_byte() {
        return "Client Chunk Cache: " + this.id_protected.id_break.length() + ", " + this.id_protected();
    }

    @Override
    public boolean id_byte(int n, int n2) {
        return this.id_case(n >> 4, n2 >> 4);
    }

    public AO(gm_3 gm_32, int n) {
        this.id_throws = gm_32;
        this.id_break = new ron_3((rYB)gm_32, new rfj_3(0, 0));
        this.id_byte = new rrse_3(this, true, gm_32.id_default().id_break());
        this.id_protected = new Ah_1(this, AO.id_break(n));
    }

    @Override
    public boolean id_class(rfH_2 rfH_22) {
        return this.id_case(rfH_22.b_() >> 4, rfH_22.d_() >> 4);
    }

    @Override
    public void id_class(rRo_1 rRo_12, rjh_3 rjh_32) {
        ((yX_2)QY.id_instanceof().id_class[8]).id_break(rjh_32.id_break(), rjh_32.id_byte(), rjh_32.id_protected());
    }

    public void id_class(int n, int n2) {
        int n3;
        roJ_2 roJ_22;
        if (this.id_protected.id_break(n, n2) && AO.id_class(roJ_22 = this.id_protected.id_class(n3 = this.id_protected.id_class(n, n2)), n, n2)) {
            roJ_22.id_class(false);
            this.id_protected.id_class(n3, roJ_22, null);
        }
    }

    private static boolean id_class(roJ_2 roJ_22, int n, int n2) {
        if (roJ_22 == null) {
            return false;
        }
        rfj_3 rfj_32 = roJ_22.id_private();
        return rfj_32.id_break == n && rfj_32.id_byte == n2;
    }

    @Override
    public boolean id_class(rfj_3 rfj_32) {
        return this.id_case(rfj_32.id_break, rfj_32.id_byte);
    }

    @Override
    public rrse_3 id_class() {
        return this.id_byte;
    }

    @Override
    public boolean id_class(an_3 an_32) {
        return this.id_case(rfU_2.id_byte(an_32.rx()) >> 4, rfU_2.id_byte(an_32.BO()) >> 4);
    }

    public roJ_2 id_class(int n, int n2, rYZ rYZ2, ruu_3 ruu_32, rcd_3 rcd_32, int n3, boolean bl) {
        Object object;
        Object object2;
        if (!this.id_protected.id_break(n, n2)) {
            id_class.warn("Ignoring chunk since it's not in the view range: {}, {}", (Object)n, (Object)n2);
            return null;
        }
        int n4 = this.id_protected.id_class(n, n2);
        roJ_2 roJ_22 = this.id_protected.id_break.get(n4);
        if (!bl && AO.id_class(roJ_22, n, n2)) {
            boolean bl2 = false;
            if (roJ_22 instanceof rrbS_2) {
                object2 = (rrbS_2)roJ_22;
                Object object3 = ruu_32.id_break("ChunkDataOF");
                if (object3 instanceof rrbB_2) {
                    object = (rrbB_2)object3;
                    ((rrbS_2)object2).id_class((rrbB_2)object);
                    roQ_2.id_class.set((rrbB_2)object);
                    bl2 = true;
                }
            }
            roJ_22.id_class(rYZ2, ruu_32, rcd_32, n3);
            if (bl2) {
                roQ_2.id_class.set(null);
            }
        } else {
            if (rYZ2 == null) {
                id_class.warn("Ignoring chunk since we don't have complete data: {}, {}", (Object)n, (Object)n2);
                return null;
            }
            if (roJ_22 != null) {
                roJ_22.id_class(false);
            }
            roJ_22 = new rrbS_2(this.id_throws, new rfj_3(n, n2), rYZ2);
            roJ_22.id_class(rYZ2, ruu_32, rcd_32, n3);
            this.id_protected.id_class(n4, roJ_22);
        }
        roQ_2[] roQ_2Array = roJ_22.id_byte();
        object2 = this.id_class();
        ((rrse_3)object2).id_class(new rfj_3(n, n2), true);
        for (int i = 0; i < roQ_2Array.length; ++i) {
            object = roQ_2Array[i];
            ((rrse_3)object2).id_class(rjh_3.id_class(n, i, n2), roQ_2.id_class((roQ_2)object));
        }
        this.id_throws.id_class(n, n2);
        roJ_22.id_class(true);
        return roJ_22;
    }

    public roJ_2 id_class(int n, int n2, roN_2 roN_22, boolean bl) {
        roJ_2 roJ_22;
        if (this.id_protected.id_break(n, n2) && AO.id_class(roJ_22 = this.id_protected.id_class(this.id_protected.id_class(n, n2)), n, n2)) {
            return roJ_22;
        }
        return bl ? this.id_break : null;
    }

    public void id_class(int n) {
        int n2 = this.id_protected.id_byte;
        int n3 = AO.id_break(n);
        if (n2 != n3) {
            Ah_1 ah_1 = new Ah_1(this, n3);
            ah_1.id_throws = this.id_protected.id_throws;
            ah_1.id_case = this.id_protected.id_case;
            for (int i = 0; i < this.id_protected.id_break.length(); ++i) {
                roJ_2 roJ_22 = this.id_protected.id_break.get(i);
                if (roJ_22 == null) continue;
                rfj_3 rfj_32 = roJ_22.id_private();
                if (!ah_1.id_break(rfj_32.id_break, rfj_32.id_byte)) continue;
                ah_1.id_class(ah_1.id_class(rfj_32.id_break, rfj_32.id_byte), roJ_22);
            }
            this.id_protected = ah_1;
        }
    }

    public void id_class(BooleanSupplier booleanSupplier) {
    }

    @Override
    public rRq_1 id_break() {
        return this.id_throws;
    }

    @Override
    public /* synthetic */ roC_2 id_break(int n, int n2, roN_2 roN_22, boolean bl) {
        return this.id_class(n, n2, roN_22, bl);
    }

    public void id_break(int n, int n2) {
        this.id_protected.id_throws = n;
        this.id_protected.id_case = n2;
    }

    private static int id_break(int n) {
        return Math.max(2, n) + 3;
    }

    public AO id_throws() {
        Ah_1 ah_1 = this.id_case();
        AO aO = new AO(this.id_throws, ah_1.id_byte() - 3);
        Ah_1 ah_12 = aO.id_case();
        ah_12.id_class(ah_1);
        if (ah_12.id_byte() != ah_1.id_byte()) {
            throw new IllegalStateException(ah_12.id_byte() + " " + ah_1.id_byte());
        }
        return aO;
    }

    public Ah_1 id_case() {
        for (Field field : AO.class.getDeclaredFields()) {
            if (!Ah_1.class.isAssignableFrom(field.getType())) continue;
            try {
                return (Ah_1)field.get(this);
            }
            catch (IllegalAccessException illegalAccessException) {
                throw new RuntimeException(illegalAccessException);
            }
        }
        throw new RuntimeException(Arrays.toString(AO.class.getDeclaredFields()));
    }

    public int id_protected() {
        return this.id_protected.id_catch;
    }
}

