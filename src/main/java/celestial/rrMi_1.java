/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.Iq_1;
import celestial.aI_2;
import celestial.rrMa_1;
import celestial.rrWQ;
import celestial.ryW_2;
import java.util.ArrayList;

public abstract class rrMi_1 {
    private rrWQ<aI_2, ryW_2> id_class;
    private String id_break;
    private float id_byte;
    private String[] id_protected;

    public String[] id_byte() {
        return this.id_protected;
    }

    public rrMi_1(ryW_2 ryW_22, String string, float f, String[] stringArray) {
        this(rrWQ.id_break(ryW_22), string, f, stringArray);
    }

    public rrMi_1(rrWQ<aI_2, ryW_2> rrWQ2, String string, float f, String[] stringArray) {
        this.id_class = rrWQ2;
        this.id_break = string;
        this.id_byte = f;
        this.id_protected = stringArray;
    }

    public rrMi_1(aI_2 aI_22, String string, float f) {
        this(rrWQ.id_class(aI_22), string, f, (String[])null);
    }

    public rrMi_1(ryW_2 ryW_22, String string, float f) {
        this(rrWQ.id_break(ryW_22), string, f, (String[])null);
    }

    public rrMi_1(aI_2 aI_22, String string, float f, String[] stringArray) {
        this(rrWQ.id_class(aI_22), string, f, stringArray);
    }

    public Iq_1[] id_class(In_1 in_1) {
        String[] stringArray = this.id_case();
        ArrayList<Iq_1> arrayList = new ArrayList<Iq_1>();
        for (int i = 0; i < stringArray.length; ++i) {
            String string = stringArray[i];
            Iq_1 iq_1 = this.id_class(in_1, string);
            if (iq_1 == null) continue;
            arrayList.add(iq_1);
        }
        return arrayList.toArray(new Iq_1[arrayList.size()]);
    }

    public abstract Iq_1 id_class(In_1 var1, String var2);

    public abstract rrMa_1 id_class(In_1 var1, float var2);

    public rrWQ<aI_2, ryW_2> id_class() {
        return this.id_class;
    }

    public String id_break() {
        return this.id_break;
    }

    public abstract In_1 id_throws();

    public abstract String[] id_case();

    public float id_protected() {
        return this.id_byte;
    }
}

