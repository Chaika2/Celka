/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.Iq_1;
import celestial.QY;
import celestial.aI_2;
import celestial.pg_3;
import celestial.qS_2;
import celestial.rrMa_1;
import celestial.rrMi_1;
import celestial.rrxr_3;
import celestial.tV_2;
import java.util.HashMap;
import java.util.Map;

public class rrOg_1
extends rrMi_1 {
    private static Map<String, Integer> id_class = rrOg_1.id_catch();
    private static Map<String, Integer> id_break = rrOg_1.id_private();
    private static Map<String, Integer> id_byte = rrOg_1.id_implements();

    public rrOg_1() {
        super(aI_2.id_float, "horse", 0.75f);
    }

    protected rrOg_1(aI_2 aI_22, String string, float f) {
        super(aI_22, string, f);
    }

    @Override
    public Iq_1 id_class(In_1 in_1, String string) {
        if (!(in_1 instanceof tV_2)) {
            return null;
        }
        tV_2 tV_22 = (tV_2)in_1;
        if (id_class.containsKey(string)) {
            int n = id_class.get(string);
            return (Iq_1)rrxr_3.id_class((Object)tV_22, rrxr_3.sO, n);
        }
        if (id_break.containsKey(string)) {
            Iq_1 iq_1 = this.id_class((In_1)tV_22, "neck");
            int n = id_break.get(string);
            return iq_1.id_class(n);
        }
        if (id_byte.containsKey(string)) {
            Iq_1 iq_1 = this.id_class((In_1)tV_22, "body");
            int n = id_byte.get(string);
            return iq_1.id_class(n);
        }
        return null;
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        pg_3 pg_32 = QY.id_instanceof().id_case();
        qS_2 qS_22 = new qS_2(pg_32);
        qS_22.id_throws = (tV_2)in_1;
        qS_22.id_byte = f;
        return qS_22;
    }

    @Override
    public In_1 id_throws() {
        return new tV_2(0.0f);
    }

    private static Map<String, Integer> id_catch() {
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("body", 0);
        hashMap.put("neck", 1);
        hashMap.put("back_left_leg", 2);
        hashMap.put("back_right_leg", 3);
        hashMap.put("front_left_leg", 4);
        hashMap.put("front_right_leg", 5);
        hashMap.put("child_back_left_leg", 6);
        hashMap.put("child_back_right_leg", 7);
        hashMap.put("child_front_left_leg", 8);
        hashMap.put("child_front_right_leg", 9);
        return hashMap;
    }

    @Override
    public String[] id_case() {
        return new String[]{"body", "neck", "back_left_leg", "back_right_leg", "front_left_leg", "front_right_leg", "child_back_left_leg", "child_back_right_leg", "child_front_left_leg", "child_front_right_leg", "tail", "saddle", "head", "mane", "mouth", "left_ear", "right_ear", "left_bit", "right_bit", "left_rein", "right_rein", "headpiece", "noseband"};
    }

    private static Map<String, Integer> id_implements() {
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("tail", 0);
        hashMap.put("saddle", 1);
        return hashMap;
    }

    private static Map<String, Integer> id_private() {
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("head", 0);
        hashMap.put("mane", 1);
        hashMap.put("mouth", 2);
        hashMap.put("left_ear", 3);
        hashMap.put("right_ear", 4);
        hashMap.put("left_bit", 5);
        hashMap.put("right_bit", 6);
        hashMap.put("left_rein", 7);
        hashMap.put("right_rein", 8);
        hashMap.put("headpiece", 9);
        hashMap.put("noseband", 10);
        return hashMap;
    }
}

