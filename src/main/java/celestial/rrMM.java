/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.gm_3;
import celestial.iB_2;
import celestial.rOH;
import celestial.rOQ;
import celestial.rYB;
import celestial.rbf_3;
import celestial.rja_3;
import celestial.rqO_2;
import celestial.rrMC;
import celestial.rrME;
import celestial.rrMG;
import celestial.rrMH;
import celestial.rrMk_1;
import celestial.rrMl_1;
import celestial.rrMp_1;
import celestial.rrMq_1;
import celestial.rrMt_1;
import celestial.rrMz_1;
import celestial.rrWD;
import celestial.rrbD_2;
import celestial.rrbb_3;
import celestial.rrki_1;
import celestial.rsT_2;
import celestial.rsp_3;
import celestial.rsq_3;
import celestial.rxL_2;
import java.util.Properties;

public class rrMM {
    private String id_byte = null;
    private rqO_2 id_protected = null;
    private int id_throws;
    private int[] id_case = null;
    private rqO_2[] id_catch = null;
    private int[] id_private = null;
    private rrMk_1[] id_implements = null;
    private rrMq_1 id_finally = null;
    private rrMq_1 id_extends = null;
    private boolean id_native = false;
    private rrMH id_volatile = null;
    public int[] id_class = null;
    public int id_break = 1;
    private rrMC[] id_final = null;
    private rxL_2[] id_package = null;
    private Boolean id_int = null;
    private rrMq_1 id_new = null;
    private rrMq_1 id_continue = null;
    private rrMt_1[] id_super = null;

    public rrMM(Properties properties, String string, rqO_2 rqO_22, int n, String string2, rrMz_1 rrMz_12) {
        String string3;
        this.id_byte = string;
        this.id_protected = rqO_22;
        this.id_throws = n;
        this.id_case = rrMz_12.id_private(string2);
        this.id_private = rrMz_12.id_private(properties.getProperty("weights." + n));
        this.id_implements = rrMz_12.id_case(properties.getProperty("biomes." + n));
        this.id_finally = rrMz_12.id_native(properties.getProperty("heights." + n));
        if (this.id_finally == null) {
            this.id_finally = this.id_class(properties, n);
        }
        if ((string3 = properties.getProperty("health." + n)) != null) {
            this.id_native = string3.contains("%");
            string3 = string3.replace("%", "");
            this.id_extends = rrMz_12.id_native(string3);
        }
        this.id_volatile = rrMz_12.id_break("name", properties.getProperty("name." + n));
        this.id_final = rrMz_12.id_final(properties.getProperty("professions." + n));
        this.id_package = rrMz_12.id_class(properties.getProperty("collarColors." + n), "collar color", rrMz_1.id_break);
        this.id_int = rrMz_12.id_volatile(properties.getProperty("baby." + n));
        this.id_new = rrMz_12.id_native(properties.getProperty("moonPhase." + n));
        this.id_continue = rrMz_12.id_native(properties.getProperty("dayTime." + n));
        this.id_super = rrMz_12.id_class(properties.getProperty("weather." + n), "weather." + n, (rrMt_1[])null);
    }

    public rqO_2 id_class(rqO_2 rqO_22, int n) {
        if (this.id_catch != null && this.id_catch.length != 0) {
            int n2 = 0;
            if (this.id_private == null) {
                n2 = n % this.id_catch.length;
            } else {
                int n3 = n % this.id_break;
                for (int i = 0; i < this.id_class.length; ++i) {
                    if (this.id_class[i] <= n3) continue;
                    n2 = i;
                    break;
                }
            }
            return this.id_catch[n2];
        }
        return rqO_22;
    }

    public boolean id_class(rrbD_2 rrbD_22) {
        rrMt_1 rrMt_12;
        an_3 an_32;
        int n;
        iB_2 iB_22;
        Object object;
        rsT_2 rsT_22;
        an_3 an_33;
        int n2;
        Object object2;
        if (this.id_implements != null && !rrMl_1.id_class(rrbD_22.id_byte(), this.id_implements)) {
            return false;
        }
        if (this.id_finally != null && (object2 = rrbD_22.id_break()) != null && !this.id_finally.id_class(((rja_3)object2).c_())) {
            return false;
        }
        if (this.id_extends != null) {
            int n3 = rrbD_22.id_throws();
            if (this.id_native && (n2 = rrbD_22.id_case()) > 0) {
                n3 = (int)((double)(n3 * 100) / (double)n2);
            }
            if (!this.id_extends.id_class(n3)) {
                return false;
            }
        }
        if (this.id_volatile != null && !this.id_volatile.id_class((String)(object2 = rrbD_22.id_protected()))) {
            return false;
        }
        if (this.id_final != null && rrbD_22 instanceof rrMG && (an_33 = ((rrMG)(object2 = (rrMG)rrbD_22)).id_catch()) instanceof rsq_3 && !rrMC.id_class(rsT_22 = ((rsp_3)(object = ((rsq_3)(iB_22 = (rsq_3)an_33)).su())).id_break(), n = ((rsp_3)object).id_byte(), this.id_final)) {
            return false;
        }
        if (this.id_package != null && rrbD_22 instanceof rrMG) {
            object2 = (rrMG)rrbD_22;
            an_3 an_34 = ((rrMG)object2).id_catch();
            if (an_34 instanceof rOH) {
                iB_22 = (rOH)an_34;
                if (!((rOQ)iB_22).sZ()) {
                    return false;
                }
                object = ((rOH)iB_22).sx();
                if (!rrbb_3.id_class(object, (Object[])this.id_package)) {
                    return false;
                }
            }
            if (an_34 instanceof rbf_3) {
                iB_22 = (rbf_3)an_34;
                if (!((rOQ)iB_22).sZ()) {
                    return false;
                }
                object = ((rbf_3)iB_22).sd();
                if (!rrbb_3.id_class(object, (Object[])this.id_package)) {
                    return false;
                }
            }
        }
        if (this.id_int != null && rrbD_22 instanceof rrMG && (an_32 = ((rrMG)(object2 = (rrMG)rrbD_22)).id_catch()) instanceof iB_2 && (iB_22 = (iB_2)an_32).n_() != this.id_int.booleanValue()) {
            return false;
        }
        if (this.id_new != null && (object2 = (gm_3)rrbb_3.X().id_class[56]) != null && !this.id_new.id_class(n2 = object2.id_char())) {
            return false;
        }
        if (this.id_continue != null && (object2 = (gm_3)rrbb_3.X().id_class[56]) != null && !this.id_continue.id_class(n2 = (int)((rYB)object2).P())) {
            return false;
        }
        return this.id_super == null || (object2 = (gm_3)rrbb_3.X().id_class[56]) == null || rrki_1.id_class((Object[])this.id_super, (Object)(rrMt_12 = rrMt_1.id_class((rYB)object2, 0.0f)));
    }

    public boolean id_class(String string) {
        if (this.id_case != null && this.id_case.length != 0) {
            int n;
            int n2;
            if (this.id_catch != null) {
                return true;
            }
            this.id_catch = new rqO_2[this.id_case.length];
            boolean bl = this.id_byte.startsWith("optifine/mob/");
            rqO_2 rqO_22 = rrME.id_class(this.id_protected, bl);
            if (rqO_22 == null) {
                rrbb_3.id_protected("Invalid path: " + this.id_protected.id_break());
                return false;
            }
            for (n2 = 0; n2 < this.id_catch.length; ++n2) {
                n = this.id_case[n2];
                if (n <= 1) {
                    this.id_catch[n2] = this.id_protected;
                    continue;
                }
                rqO_2 rqO_23 = rrME.id_class(rqO_22, n);
                if (rqO_23 == null) {
                    rrbb_3.id_protected("Invalid path: " + this.id_protected.id_break());
                    return false;
                }
                if (!rrbb_3.id_byte(rqO_23)) {
                    rrbb_3.id_protected("Texture not found: " + rqO_23.id_break());
                    return false;
                }
                this.id_catch[n2] = rqO_23;
            }
            if (this.id_private != null) {
                if (this.id_private.length > this.id_catch.length) {
                    rrbb_3.id_protected("More weights defined than skins, trimming weights: " + string);
                    int[] nArray = new int[this.id_catch.length];
                    System.arraycopy(this.id_private, 0, nArray, 0, nArray.length);
                    this.id_private = nArray;
                }
                if (this.id_private.length < this.id_catch.length) {
                    rrbb_3.id_protected("Less weights defined than skins, expanding weights: " + string);
                    int[] nArray = new int[this.id_catch.length];
                    System.arraycopy(this.id_private, 0, nArray, 0, this.id_private.length);
                    n = rrWD.id_class(this.id_private);
                    for (int i = this.id_private.length; i < nArray.length; ++i) {
                        nArray[i] = n;
                    }
                    this.id_private = nArray;
                }
                this.id_class = new int[this.id_private.length];
                n2 = 0;
                for (n = 0; n < this.id_private.length; ++n) {
                    if (this.id_private[n] < 0) {
                        rrbb_3.id_protected("Invalid weight: " + this.id_private[n]);
                        return false;
                    }
                    this.id_class[n] = n2 += this.id_private[n];
                }
                this.id_break = n2;
                if (this.id_break <= 0) {
                    rrbb_3.id_protected("Invalid sum of all weights: " + n2);
                    this.id_break = 1;
                }
            }
            if (this.id_final == rrMz_1.id_class) {
                rrbb_3.id_protected("Invalid professions or careers: " + string);
                return false;
            }
            if (this.id_package == rrMz_1.id_break) {
                rrbb_3.id_protected("Invalid collar colors: " + string);
                return false;
            }
            return true;
        }
        rrbb_3.id_protected("Invalid skins for rule: " + this.id_throws);
        return false;
    }

    private rrMq_1 id_class(Properties properties, int n) {
        String string = properties.getProperty("minHeight." + n);
        String string2 = properties.getProperty("maxHeight." + n);
        if (string == null && string2 == null) {
            return null;
        }
        int n2 = 0;
        if (string != null && (n2 = rrbb_3.id_class(string, -1)) < 0) {
            rrbb_3.id_protected("Invalid minHeight: " + string);
            return null;
        }
        int n3 = 256;
        if (string2 != null && (n3 = rrbb_3.id_class(string2, -1)) < 0) {
            rrbb_3.id_protected("Invalid maxHeight: " + string2);
            return null;
        }
        if (n3 < 0) {
            rrbb_3.id_protected("Invalid minHeight, maxHeight: " + string + ", " + string2);
            return null;
        }
        rrMq_1 rrMq_12 = new rrMq_1();
        rrMq_12.id_class(new rrMp_1(n2, n3));
        return rrMq_12;
    }
}

