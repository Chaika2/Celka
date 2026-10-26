/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrba_3;
import celestial.rrdD;
import celestial.rrdZ;
import celestial.rrdm_1;
import celestial.rrkb_1;
import java.util.ArrayList;

public class rrdU
extends rrdD {
    private rrkb_1[] id_protected = null;
    private rrdD[] id_throws = null;
    private static final String id_case = "<profile>";
    private static final String id_catch = "<custom>";

    @Override
    public String id_byte() {
        String string = rrdZ.id_break("profile.comment", (String)null);
        if (string != null) {
            return string;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < this.id_protected.length; ++i) {
            String string2;
            String string3 = this.id_protected[i].id_class();
            if (string3 == null || (string2 = rrdZ.id_break("profile." + string3 + ".comment", (String)null)) == null) continue;
            stringBuffer.append(string2);
            if (string2.endsWith(". ")) continue;
            stringBuffer.append(". ");
        }
        return stringBuffer.toString();
    }

    public rrdU(rrkb_1[] rrkb_1Array, rrdD[] rrdDArray) {
        super(id_case, "", rrdU.id_class(rrkb_1Array, rrdDArray), rrdU.id_class(rrkb_1Array), rrdU.id_class(rrkb_1Array, rrdDArray, true), null);
        this.id_protected = rrkb_1Array;
        this.id_throws = rrdDArray;
    }

    private static String[] id_class(rrkb_1[] rrkb_1Array) {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (int i = 0; i < rrkb_1Array.length; ++i) {
            rrkb_1 rrkb_12 = rrkb_1Array[i];
            arrayList.add(rrkb_12.id_class());
        }
        arrayList.add(id_catch);
        return arrayList.toArray(new String[arrayList.size()]);
    }

    private static String id_class(rrkb_1[] rrkb_1Array, rrdD[] rrdDArray) {
        return rrdU.id_class(rrkb_1Array, rrdDArray, false);
    }

    private static String id_class(rrkb_1[] rrkb_1Array, rrdD[] rrdDArray, boolean bl) {
        rrkb_1 rrkb_12 = rrdm_1.id_class(rrkb_1Array, rrdDArray, bl);
        return rrkb_12 == null ? id_catch : rrkb_12.id_class();
    }

    @Override
    public String id_throws(String string) {
        return string.equals(id_catch) ? "\u00a7c" : "\u00a7a";
    }

    @Override
    public void id_catch() {
        super.id_catch();
        if (this.id_protected().equals(id_catch)) {
            super.id_catch();
        }
        this.id_super();
    }

    public void id_continue() {
        rrkb_1 rrkb_12 = this.id_implements(this.id_protected());
        if (rrkb_12 == null || !rrdm_1.id_class(rrkb_12, this.id_throws, false)) {
            String string = rrdU.id_class(this.id_protected, this.id_throws);
            this.id_break(string);
        }
    }

    private rrkb_1 id_implements(String string) {
        for (int i = 0; i < this.id_protected.length; ++i) {
            rrkb_1 rrkb_12 = this.id_protected[i];
            if (!rrkb_12.id_class().equals(string)) continue;
            return rrkb_12;
        }
        return null;
    }

    private void id_super() {
        rrkb_1 rrkb_12 = this.id_implements(this.id_protected());
        if (rrkb_12 != null) {
            String[] stringArray = rrkb_12.id_break();
            for (int i = 0; i < stringArray.length; ++i) {
                String string = stringArray[i];
                rrdD rrdD2 = this.id_private(string);
                if (rrdD2 == null) continue;
                String string2 = rrkb_12.id_class(string);
                rrdD2.id_break(string2);
            }
        }
    }

    @Override
    public String id_protected(String string) {
        return string.equals(id_catch) ? rrba_3.id_class("of.general.custom", id_catch) : rrdZ.id_break("profile." + string, string);
    }

    private rrdD id_private(String string) {
        for (int i = 0; i < this.id_throws.length; ++i) {
            rrdD rrdD2 = this.id_throws[i];
            if (!rrdD2.id_class().equals(string)) continue;
            return rrdD2;
        }
        return null;
    }

    @Override
    public String id_volatile() {
        return rrba_3.id_class("of.shaders.profile");
    }
}

