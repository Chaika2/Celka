/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ix_1;
import celestial.rfU_2;
import celestial.rjY_2;
import celestial.rje_3;
import celestial.rjg_3;
import celestial.rjo_3;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public final class If_1
extends Enum<If_1>
implements Ix_1 {
    public static final /* enum */ If_1 X0_Y0 = new If_1(0, 0);
    public static final /* enum */ If_1 X0_Y90 = new If_1(0, 90);
    public static final /* enum */ If_1 X0_Y180 = new If_1(0, 180);
    public static final /* enum */ If_1 X0_Y270 = new If_1(0, 270);
    public static final /* enum */ If_1 X90_Y0 = new If_1(90, 0);
    public static final /* enum */ If_1 X90_Y90 = new If_1(90, 90);
    public static final /* enum */ If_1 X90_Y180 = new If_1(90, 180);
    public static final /* enum */ If_1 X90_Y270 = new If_1(90, 270);
    public static final /* enum */ If_1 X180_Y0 = new If_1(180, 0);
    public static final /* enum */ If_1 X180_Y90 = new If_1(180, 90);
    public static final /* enum */ If_1 X180_Y180 = new If_1(180, 180);
    public static final /* enum */ If_1 X180_Y270 = new If_1(180, 270);
    public static final /* enum */ If_1 X270_Y0 = new If_1(270, 0);
    public static final /* enum */ If_1 X270_Y90 = new If_1(270, 90);
    public static final /* enum */ If_1 X270_Y180 = new If_1(270, 180);
    public static final /* enum */ If_1 X270_Y270 = new If_1(270, 270);
    private static final Map<Integer, If_1> MAP_ROTATIONS;
    private final rjo_3 transformation;
    private final rjg_3 orientation;
    private final int combinedXY;
    private static final /* synthetic */ If_1[] $VALUES;

    private static /* synthetic */ If_1[] id_byte() {
        return new If_1[]{X0_Y0, X0_Y90, X0_Y180, X0_Y270, X90_Y0, X90_Y90, X90_Y180, X90_Y270, X180_Y0, X180_Y90, X180_Y180, X180_Y270, X270_Y0, X270_Y90, X270_Y180, X270_Y270};
    }

    private If_1(int n2, int n3) {
        int n4;
        this.combinedXY = If_1.id_break(n2, n3);
        rjY_2 rjY_22 = new rjY_2(new rje_3(0.0f, 1.0f, 0.0f), -n3, true);
        rjY_22.id_class(new rjY_2(new rje_3(1.0f, 0.0f, 0.0f), -n2, true));
        rjg_3 rjg_32 = rjg_3.IDENTITY;
        for (n4 = 0; n4 < n3; n4 += 90) {
            rjg_32 = rjg_32.id_class(rjg_3.ROT_90_Y_NEG);
        }
        for (n4 = 0; n4 < n2; n4 += 90) {
            rjg_32 = rjg_32.id_class(rjg_3.ROT_90_X_NEG);
        }
        this.transformation = new rjo_3(null, rjY_22, null, null);
        this.orientation = rjg_32;
    }

    static {
        $VALUES = If_1.id_byte();
        MAP_ROTATIONS = Arrays.stream(If_1.values()).collect(Collectors.toMap(if_1 -> if_1.combinedXY, if_1 -> if_1));
    }

    public static If_1[] values() {
        return (If_1[])$VALUES.clone();
    }

    public static If_1 valueOf(String string) {
        return Enum.valueOf(If_1.class, string);
    }

    public static If_1 id_class(int n, int n2) {
        return MAP_ROTATIONS.get(If_1.id_break(rfU_2.id_break(n, 360), rfU_2.id_break(n2, 360)));
    }

    @Override
    public rjo_3 id_class() {
        return this.transformation;
    }

    private static int id_break(int n, int n2) {
        return n * 360 + n2;
    }
}

