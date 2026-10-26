/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.util.Pair
 */
package celestial;

import celestial.iJ_2;
import celestial.id_3;
import celestial.ix_3;
import celestial.jI_2;
import celestial.rAS;
import celestial.rLK;
import celestial.rLR;
import celestial.rLY;
import celestial.rLi_1;
import celestial.rVL;
import celestial.rVi_1;
import celestial.rcd_3;
import celestial.rcy_3;
import celestial.rdn_3;
import celestial.rgF_2;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rqO_2;
import celestial.rrbN_2;
import celestial.rrbb_3;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class rAB {
    private static final rVi_1 id_class = new rgn_3("effect.none").id_class(rgF_2.GRAY);

    public static rLi_1 id_byte(rcd_3 rcd_32) {
        return rcd_32 == null ? rAS.id_class : rLi_1.id_class(rcd_32.id_native("Potion"));
    }

    public static int id_byte(rdn_3 rdn_32) {
        rcd_3 rcd_32 = rdn_32.id_package();
        if (rcd_32 != null && rcd_32.id_byte("CustomPotionColor", 99)) {
            return rcd_32.id_private("CustomPotionColor");
        }
        return rAB.id_protected(rdn_32) == rAS.id_class ? 0xF800F8 : rAB.id_class(rAB.id_class(rdn_32));
    }

    public static void id_class(rdn_3 rdn_32, List<rgP_2> list, float f) {
        Object object;
        List<rLY> list2 = rAB.id_class(rdn_32);
        ArrayList arrayList = Lists.newArrayList();
        if (list2.isEmpty()) {
            list.add(id_class);
        } else {
            for (rLY rLY2 : list2) {
                object = new rgn_3(rLY2.id_private());
                rLR rLR2 = rLY2.id_class();
                Map<iJ_2, ix_3> map = rLR2.id_catch();
                if (!map.isEmpty()) {
                    for (Map.Entry<iJ_2, ix_3> entry : map.entrySet()) {
                        ix_3 ix_32 = entry.getValue();
                        ix_3 ix_33 = new ix_3(ix_32.id_break(), rLR2.id_class(rLY2.id_byte(), ix_32), ix_32.id_byte());
                        arrayList.add(new Pair((Object)entry.getKey(), (Object)ix_33));
                    }
                }
                if (rLY2.id_byte() > 0) {
                    object = new rgn_3("potion.withAmplifier", object, new rgn_3("potion.potency." + rLY2.id_byte()));
                }
                if (rLY2.id_break() > 20) {
                    object = new rgn_3("potion.withDuration", object, rLK.id_class(rLY2, f));
                }
                list.add(object.id_class(rLR2.id_throws().id_class()));
            }
        }
        if (!arrayList.isEmpty()) {
            list.add(rgN_2.id_byte);
            list.add(new rgn_3("potion.whenDrank").id_class(rgF_2.DARK_PURPLE));
            for (rLY rLY2 : arrayList) {
                object = (ix_3)rLY2.getSecond();
                double d = ((ix_3)object).id_protected();
                double d2 = ((ix_3)object).id_byte() != id_3.MULTIPLY_BASE && ((ix_3)object).id_byte() != id_3.MULTIPLY_TOTAL ? ((ix_3)object).id_protected() : ((ix_3)object).id_protected() * 100.0;
                if (d > 0.0) {
                    list.add(new rgn_3("attribute.modifier.plus." + ((ix_3)object).id_byte().id_class(), rdn_3.id_byte.format(d2), new rgn_3(((iJ_2)rLY2.getFirst()).id_byte())).id_class(rgF_2.BLUE));
                    continue;
                }
                if (!(d < 0.0)) continue;
                list.add(new rgn_3("attribute.modifier.take." + ((ix_3)object).id_byte().id_class(), rdn_3.id_byte.format(d2 *= -1.0), new rgn_3(((iJ_2)rLY2.getFirst()).id_byte())).id_class(rgF_2.RED));
            }
        }
    }

    public static boolean id_class(rdn_3 rdn_32, List<rLY> list) {
        List<rLY> list2 = rAB.id_class(rdn_32);
        for (rLY rLY2 : list) {
            boolean bl = false;
            for (rLY rLY3 : list2) {
                if (rLY3.id_class() != rLY2.id_class() || rLY3.id_byte() != rLY2.id_byte()) continue;
                bl = true;
                break;
            }
            if (bl) continue;
            return false;
        }
        return true;
    }

    public static boolean id_class(rdn_3 rdn_32, rLR ... rLRArray) {
        List<rLY> list = rAB.id_class(rdn_32);
        for (rLY rLY2 : list) {
            boolean bl = false;
            for (rLR rLR2 : rLRArray) {
                if (rLY2.id_class() != rLR2) continue;
                bl = true;
                break;
            }
            if (bl) continue;
            return false;
        }
        return true;
    }

    public static rdn_3 id_class(rdn_3 rdn_32, Collection<rLY> collection) {
        if (collection.isEmpty()) {
            return rdn_32;
        }
        rcd_3 rcd_32 = rdn_32.id_int();
        rcy_3 rcy_32 = rcd_32.id_protected("CustomPotionEffects", 9);
        for (rLY rLY2 : collection) {
            rcy_32.add(rLY2.id_class(new rcd_3()));
        }
        rcd_32.id_class("CustomPotionEffects", rcy_32);
        return rdn_32;
    }

    public static rdn_3 id_class(rdn_3 rdn_32, rLi_1 rLi_12) {
        rqO_2 rqO_22 = rVL.id_double.id_break(rLi_12);
        if (rLi_12 == rAS.id_class) {
            rdn_32.id_byte("Potion");
        } else {
            rdn_32.id_int().id_class("Potion", rqO_22.toString());
        }
        return rdn_32;
    }

    public static List<rLY> id_class(rcd_3 rcd_32) {
        ArrayList arrayList = Lists.newArrayList();
        arrayList.addAll(rAB.id_byte(rcd_32).id_class());
        rAB.id_class(rcd_32, (List<rLY>)arrayList);
        return arrayList;
    }

    public static String id_class(rLY rLY2, rgF_2 rgF_22) {
        Object object = "";
        if (rLY2.id_byte() >= 1 && rLY2.id_byte() <= 9) {
            object = " " + jI_2.id_class("enchantment.level." + (rLY2.id_byte() + 1), new Object[0]);
        } else if (rLY2.id_byte() == 10) {
            object = " X";
        }
        String string = rLY2.id_final() + (String)object;
        if (rgF_22 != null) {
            string = string + rgF_22;
        }
        if (!rLY2.id_class().id_class()) {
            string = string + " (" + rLK.id_class(rLY2, 1.0f) + ")";
        }
        return string;
    }

    public static boolean id_class(rdn_3 rdn_32, rLY ... rLYArray) {
        List<rLY> list = rAB.id_class(rdn_32);
        for (rLY rLY2 : list) {
            boolean bl = false;
            for (rLY rLY3 : rLYArray) {
                if (rLY2.id_class() != rLY3.id_class()) continue;
                bl = true;
                break;
            }
            if (bl) continue;
            return false;
        }
        return true;
    }

    public static void id_class(rcd_3 rcd_32, List<rLY> list) {
        if (rcd_32 != null && rcd_32.id_byte("CustomPotionEffects", 9)) {
            rcy_3 rcy_32 = rcd_32.id_protected("CustomPotionEffects", 10);
            for (int i = 0; i < rcy_32.size(); ++i) {
                rcd_3 rcd_33 = rcy_32.id_class(i);
                rLY rLY2 = rLY.id_break(rcd_33);
                if (rLY2 == null) continue;
                list.add(rLY2);
            }
        }
    }

    public static List<rLY> id_class(rLi_1 rLi_12, Collection<rLY> collection) {
        ArrayList arrayList = Lists.newArrayList();
        arrayList.addAll(rLi_12.id_class());
        arrayList.addAll(collection);
        return arrayList;
    }

    public static int id_class(rLi_1 rLi_12) {
        return rLi_12 == rAS.id_class ? 0xF800F8 : rAB.id_class(rLi_12.id_class());
    }

    public static List<rLY> id_class(rdn_3 rdn_32) {
        return rAB.id_class(rdn_32.id_package());
    }

    public static int id_class(Collection<rLY> collection) {
        int n = 3694022;
        if (collection.isEmpty()) {
            return rrbb_3.K() ? rrbN_2.id_class((rLR)null, n) : 3694022;
        }
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int n2 = 0;
        for (rLY rLY2 : collection) {
            if (!rLY2.id_throws()) continue;
            int n3 = rLY2.id_class().id_case();
            if (rrbb_3.K()) {
                n3 = rrbN_2.id_class(rLY2.id_class(), n3);
            }
            int n4 = rLY2.id_byte() + 1;
            f += (float)(n4 * (n3 >> 16 & 0xFF)) / 255.0f;
            f2 += (float)(n4 * (n3 >> 8 & 0xFF)) / 255.0f;
            f3 += (float)(n4 * (n3 >> 0 & 0xFF)) / 255.0f;
            n2 += n4;
        }
        if (n2 == 0) {
            return 0;
        }
        f = f / (float)n2 * 255.0f;
        f2 = f2 / (float)n2 * 255.0f;
        f3 = f3 / (float)n2 * 255.0f;
        return (int)f << 16 | (int)f2 << 8 | (int)f3;
    }

    public static List<rLY> id_break(rdn_3 rdn_32) {
        return rAB.id_break(rdn_32.id_package());
    }

    public static List<rLY> id_break(rcd_3 rcd_32) {
        ArrayList arrayList = Lists.newArrayList();
        rAB.id_class(rcd_32, (List<rLY>)arrayList);
        return arrayList;
    }

    public static String id_break(Collection<rLY> collection) {
        StringBuilder stringBuilder = new StringBuilder();
        int n = collection.size();
        int n2 = 0;
        for (rLY rLY2 : collection) {
            if (rLY2.id_break() <= 0) continue;
            stringBuilder.append(rAB.id_class(rLY2, null));
            if (++n2 >= n) continue;
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public static boolean id_break(rdn_3 rdn_32, List<rLR> list) {
        List<rLR> list2 = rAB.id_class(rdn_32).stream().map(rLY2 -> rLY2.id_class()).toList();
        for (rLR rLR2 : list) {
            if (list2.contains(rLR2)) continue;
            return false;
        }
        return true;
    }

    public static rLi_1 id_protected(rdn_3 rdn_32) {
        return rAB.id_byte(rdn_32.id_package());
    }
}

