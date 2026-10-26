/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.commons.lang3.mutable.MutableFloat
 *  org.apache.commons.lang3.mutable.MutableInt
 *  org.apache.commons.lang3.mutable.MutableObject
 */
package celestial;

import celestial.rVD;
import celestial.rVK;
import celestial.rVR;
import celestial.rVV;
import celestial.rVY;
import celestial.rVg_1;
import celestial.rVo_1;
import celestial.rgL_2;
import celestial.rgS_2;
import celestial.rgc_3;
import celestial.rpl_3;
import celestial.rpv_3;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;
import org.apache.commons.lang3.mutable.MutableFloat;
import org.apache.commons.lang3.mutable.MutableInt;
import org.apache.commons.lang3.mutable.MutableObject;

public class rVj_1 {
    public final rVg_1 id_class;

    public String id_byte(String string, int n, rgc_3 rgc_33) {
        MutableFloat mutableFloat = new MutableFloat();
        MutableInt mutableInt = new MutableInt(string.length());
        rgL_2.id_break(string, rgc_33, (n2, rgc_32, n3) -> {
            float f = mutableFloat.addAndGet(this.id_class.getWidth(n3, rgc_32));
            if (f > (float)n) {
                return false;
            }
            mutableInt.setValue(n2);
            return true;
        });
        return string.substring(mutableInt.intValue());
    }

    public rVj_1(rVg_1 rVg_12) {
        this.id_class = rVg_12;
    }

    public void id_class(rgS_2 rgS_22, int n, rgc_3 rgc_33, BiConsumer<rgS_2, Boolean> biConsumer) {
        Object object;
        ArrayList arrayList = Lists.newArrayList();
        rgS_22.id_class((rgc_3 rgc_32, String string) -> {
            if (!string.isEmpty()) {
                arrayList.add(new rVK(string, rgc_32));
            }
            return Optional.empty();
        }, rgc_33);
        rVD rVD2 = new rVD(arrayList);
        boolean bl = true;
        boolean bl2 = false;
        boolean bl3 = false;
        block0: while (bl) {
            bl = false;
            object = new rVY(this, n);
            for (rVK rVK2 : rVD2.id_class) {
                boolean bl4 = rgL_2.id_class(rVK2.id_byte, 0, rVK2.id_protected, rgc_33, (rpv_3)object);
                if (!bl4) {
                    int n2 = ((rVY)object).id_class();
                    rgc_3 rgc_34 = ((rVY)object).id_break();
                    char c = rVD2.id_class(n2);
                    boolean bl5 = c == '\n';
                    boolean bl6 = bl5 || c == ' ';
                    bl2 = bl5;
                    rgS_2 rgS_23 = rVD2.id_class(n2, bl6 ? 1 : 0, rgc_34);
                    biConsumer.accept(rgS_23, bl3);
                    bl3 = !bl5;
                    bl = true;
                    continue block0;
                }
                ((rVY)object).id_class(rVK2.id_byte.length());
            }
        }
        object = rVD2.id_class();
        if (object != null) {
            biConsumer.accept((rgS_2)object, bl3);
        } else if (bl2) {
            biConsumer.accept(rgS_2.id_break, false);
        }
    }

    public float id_class(String string) {
        if (string == null) {
            return 0.0f;
        }
        MutableFloat mutableFloat = new MutableFloat();
        rgL_2.id_byte(string, rgc_3.id_class, (n, rgc_32, n2) -> {
            mutableFloat.add(this.id_class.getWidth(n2, rgc_32));
            return true;
        });
        return mutableFloat.floatValue();
    }

    public rgc_3 id_class(rgS_2 rgS_22, int n) {
        rVo_1 rVo_12 = new rVo_1(this, n);
        return rgS_22.id_class((rgc_3 rgc_32, String string) -> rgL_2.id_byte(string, rgc_32, rVo_12) ? Optional.empty() : Optional.of(rgc_32), rgc_3.id_class).orElse(null);
    }

    public float id_class(rgS_2 rgS_22) {
        MutableFloat mutableFloat = new MutableFloat();
        rgL_2.id_class(rgS_22, rgc_3.id_class, (int n, rgc_3 rgc_32, int n2) -> {
            mutableFloat.add(this.id_class.getWidth(n2, rgc_32));
            return true;
        });
        return mutableFloat.floatValue();
    }

    public int id_class(String string, int n, rgc_3 rgc_32) {
        rVo_1 rVo_12 = new rVo_1(this, n);
        rgL_2.id_class(string, rgc_32, (rpv_3)rVo_12);
        return rVo_12.id_class();
    }

    public float id_class(rpl_3 rpl_32) {
        MutableFloat mutableFloat = new MutableFloat();
        rpl_32.accept((n, rgc_32, n2) -> {
            mutableFloat.add(this.id_class.getWidth(n2, rgc_32));
            return true;
        });
        return mutableFloat.floatValue();
    }

    public static int id_class(String string, int n, int n2, boolean bl) {
        int n3 = n2;
        boolean bl2 = n < 0;
        int n4 = Math.abs(n);
        for (int i = 0; i < n4; ++i) {
            if (bl2) {
                while (bl && n3 > 0 && (string.charAt(n3 - 1) == ' ' || string.charAt(n3 - 1) == '\n')) {
                    --n3;
                }
                while (n3 > 0 && string.charAt(n3 - 1) != ' ' && string.charAt(n3 - 1) != '\n') {
                    --n3;
                }
                continue;
            }
            int n5 = string.length();
            int n6 = string.indexOf(32, n3);
            int n7 = string.indexOf(10, n3);
            n3 = n6 == -1 && n7 == -1 ? -1 : (n6 != -1 && n7 != -1 ? Math.min(n6, n7) : (n6 != -1 ? n6 : n7));
            if (n3 == -1) {
                n3 = n5;
                continue;
            }
            while (bl && n3 < n5 && (string.charAt(n3) == ' ' || string.charAt(n3) == '\n')) {
                ++n3;
            }
        }
        return n3;
    }

    public void id_class(String string, int n, rgc_3 rgc_32, boolean bl, rVR rVR2) {
        int n2 = 0;
        int n3 = string.length();
        rgc_3 rgc_33 = rgc_32;
        while (n2 < n3) {
            rVY rVY2 = new rVY(this, n);
            boolean bl2 = rgL_2.id_class(string, n2, rgc_33, rgc_32, rVY2);
            if (bl2) {
                rVR2.accept(rgc_33, n2, n3);
                break;
            }
            int n4 = rVY2.id_class();
            char c = string.charAt(n4);
            int n5 = c != '\n' && c != ' ' ? n4 : n4 + 1;
            rVR2.accept(rgc_33, n2, bl ? n5 : n4);
            n2 = n5;
            rgc_33 = rVY2.id_break();
        }
    }

    public rgS_2 id_class(rgS_2 rgS_22, int n, rgc_3 rgc_32) {
        rVo_1 rVo_12 = new rVo_1(this, n);
        return rgS_22.id_class(new rVV(this, rVo_12), rgc_32).orElse(rgS_22);
    }

    public rgc_3 id_class(rpl_3 rpl_32, int n3) {
        rVo_1 rVo_12 = new rVo_1(this, n3);
        MutableObject mutableObject = new MutableObject();
        rpl_32.accept((n, rgc_32, n2) -> {
            if (!rVo_12.accept(n, rgc_32, n2)) {
                mutableObject.setValue((Object)rgc_32);
                return false;
            }
            return true;
        });
        return (rgc_3)mutableObject.getValue();
    }

    public List<rgS_2> id_break(rgS_2 rgS_23, int n, rgc_3 rgc_32) {
        ArrayList arrayList = Lists.newArrayList();
        this.id_class(rgS_23, n, rgc_32, (rgS_22, bl) -> arrayList.add(rgS_22));
        return arrayList;
    }

    public String id_break(String string, int n, rgc_3 rgc_32) {
        return string.substring(0, this.id_class(string, n, rgc_32));
    }

    public List<rgS_2> id_protected(String string, int n3, rgc_3 rgc_33) {
        ArrayList arrayList = Lists.newArrayList();
        this.id_class(string, n3, rgc_33, false, (rgc_32, n, n2) -> arrayList.add(rgS_2.id_class(string.substring(n, n2), rgc_32)));
        return arrayList;
    }
}

