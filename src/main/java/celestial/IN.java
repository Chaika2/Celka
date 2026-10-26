/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.util.Either
 */
package celestial;

import celestial.IG;
import celestial.IS;
import celestial.Ig_1;
import celestial.Im_1;
import celestial.Iu_1;
import celestial.fj_3;
import celestial.rje_3;
import celestial.rpr_3;
import celestial.wD_2;
import celestial.we_3;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Either;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;

public class IN {
    public static final List<String> id_class = Lists.newArrayList((Object[])new String[]{"layer0", "layer1", "layer2", "layer3", "layer4"});

    private void id_class(Im_1 im_1, List<Iu_1> list, fj_3 fj_32, int n, int n2, int n3, int n4, int n5, boolean bl) {
        boolean bl2;
        boolean bl3 = bl2 = this.id_class(fj_32, n, n2 + im_1.id_break(), n3 + im_1.id_byte(), n4, n5) && bl;
        if (bl2) {
            this.id_class(list, im_1, n2, n3);
        }
    }

    private void id_class(List<Iu_1> list, Im_1 im_1, int n, int n2) {
        int n3;
        Iu_1 iu_1 = null;
        for (Iu_1 iu_12 : list) {
            int n4;
            if (iu_12.id_class() != im_1) continue;
            int n5 = n4 = im_1.id_protected() ? n2 : n;
            if (iu_12.id_protected() != n4) continue;
            iu_1 = iu_12;
            break;
        }
        int n6 = im_1.id_protected() ? n2 : n;
        int n7 = n3 = im_1.id_protected() ? n : n2;
        if (iu_1 == null) {
            list.add(new Iu_1(im_1, n3, n6));
        } else {
            iu_1.id_class(n3);
        }
    }

    private boolean id_class(fj_3 fj_32, int n, int n2, int n3, int n4, int n5) {
        return n2 >= 0 && n3 >= 0 && n2 < n4 && n3 < n5 ? fj_32.id_class(n, n2, n3) : true;
    }

    private List<Iu_1> id_class(fj_3 fj_32) {
        int n = fj_32.id_protected();
        int n2 = fj_32.id_throws();
        ArrayList arrayList = Lists.newArrayList();
        for (int i = 0; i < fj_32.id_native(); ++i) {
            for (int j = 0; j < n2; ++j) {
                for (int k = 0; k < n; ++k) {
                    boolean bl = !this.id_class(fj_32, i, k, j, n, n2);
                    this.id_class(Im_1.UP, arrayList, fj_32, i, k, j, n, n2, bl);
                    this.id_class(Im_1.DOWN, arrayList, fj_32, i, k, j, n, n2, bl);
                    this.id_class(Im_1.LEFT, arrayList, fj_32, i, k, j, n, n2, bl);
                    this.id_class(Im_1.RIGHT, arrayList, fj_32, i, k, j, n, n2, bl);
                }
            }
        }
        return arrayList;
    }

    public we_3 id_class(Function<Ig_1, fj_3> function, we_3 we_32) {
        String string;
        HashMap hashMap = Maps.newHashMap();
        ArrayList arrayList = Lists.newArrayList();
        for (int i = 0; i < id_class.size() && we_32.id_break(string = id_class.get(i)); ++i) {
            Ig_1 ig_1 = we_32.id_byte(string);
            hashMap.put(string, Either.left((Object)ig_1));
            fj_3 fj_32 = function.apply(ig_1);
            arrayList.addAll(this.id_class(i, string, fj_32));
        }
        hashMap.put("particle", we_32.id_break("particle") ? Either.left((Object)we_32.id_byte("particle")) : (Either)hashMap.get("layer0"));
        we_3 we_33 = new we_3(null, arrayList, hashMap, false, we_32.id_byte(), we_32.id_catch(), we_32.id_protected());
        we_33.id_break = we_32.id_break;
        return we_33;
    }

    private List<IS> id_class(fj_3 fj_32, String string, int n) {
        float f = fj_32.id_protected();
        float f2 = fj_32.id_throws();
        ArrayList arrayList = Lists.newArrayList();
        for (Iu_1 iu_1 : this.id_class(fj_32)) {
            float f3 = 0.0f;
            float f4 = 0.0f;
            float f5 = 0.0f;
            float f6 = 0.0f;
            float f7 = 0.0f;
            float f8 = 0.0f;
            float f9 = 0.0f;
            float f10 = 0.0f;
            float f11 = 16.0f / f;
            float f12 = 16.0f / f2;
            float f13 = iu_1.id_break();
            float f14 = iu_1.id_byte();
            float f15 = iu_1.id_protected();
            Im_1 im_1 = iu_1.id_class();
            switch (im_1) {
                case UP: {
                    f7 = f13;
                    f3 = f13;
                    f5 = f8 = f14 + 1.0f;
                    f9 = f15;
                    f4 = f15;
                    f6 = f15;
                    f10 = f15 + 1.0f;
                    break;
                }
                case DOWN: {
                    f9 = f15;
                    f10 = f15 + 1.0f;
                    f7 = f13;
                    f3 = f13;
                    f5 = f8 = f14 + 1.0f;
                    f4 = f15 + 1.0f;
                    f6 = f15 + 1.0f;
                    break;
                }
                case LEFT: {
                    f7 = f15;
                    f3 = f15;
                    f5 = f15;
                    f8 = f15 + 1.0f;
                    f10 = f13;
                    f4 = f13;
                    f6 = f9 = f14 + 1.0f;
                    break;
                }
                case RIGHT: {
                    f7 = f15;
                    f8 = f15 + 1.0f;
                    f3 = f15 + 1.0f;
                    f5 = f15 + 1.0f;
                    f10 = f13;
                    f4 = f13;
                    f6 = f9 = f14 + 1.0f;
                }
            }
            f3 *= f11;
            f5 *= f11;
            f4 *= f12;
            f6 *= f12;
            f4 = 16.0f - f4;
            f6 = 16.0f - f6;
            HashMap hashMap = Maps.newHashMap();
            hashMap.put(im_1.id_class(), new IG(null, n, string, new wD_2(new float[]{f7 *= f11, f9 *= f12, f8 *= f11, f10 *= f12}, 0)));
            switch (im_1) {
                case UP: {
                    arrayList.add(new IS(new rje_3(f3, f4, 7.5f), new rje_3(f5, f4, 8.5f), hashMap, null, true));
                    break;
                }
                case DOWN: {
                    arrayList.add(new IS(new rje_3(f3, f6, 7.5f), new rje_3(f5, f6, 8.5f), hashMap, null, true));
                    break;
                }
                case LEFT: {
                    arrayList.add(new IS(new rje_3(f3, f4, 7.5f), new rje_3(f3, f6, 8.5f), hashMap, null, true));
                    break;
                }
                case RIGHT: {
                    arrayList.add(new IS(new rje_3(f5, f4, 7.5f), new rje_3(f5, f6, 8.5f), hashMap, null, true));
                }
            }
        }
        return arrayList;
    }

    private List<IS> id_class(int n, String string, fj_3 fj_32) {
        HashMap hashMap = Maps.newHashMap();
        hashMap.put(rpr_3.SOUTH, new IG(null, n, string, new wD_2(new float[]{0.0f, 0.0f, 16.0f, 16.0f}, 0)));
        hashMap.put(rpr_3.NORTH, new IG(null, n, string, new wD_2(new float[]{16.0f, 0.0f, 0.0f, 16.0f}, 0)));
        ArrayList arrayList = Lists.newArrayList();
        arrayList.add(new IS(new rje_3(0.0f, 0.0f, 7.5f), new rje_3(16.0f, 16.0f, 8.5f), hashMap, null, true));
        arrayList.addAll(this.id_class(fj_32, string, n));
        return arrayList;
    }
}

