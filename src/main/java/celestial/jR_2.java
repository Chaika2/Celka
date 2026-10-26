/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.util.Pair
 */
package celestial;

import celestial.fN_2;
import celestial.rAC;
import celestial.rAI;
import celestial.rAo_1;
import celestial.rCt_1;
import celestial.rqO_2;
import celestial.rqR_2;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class jR_2
implements rAC {
    private static final Map<String, Pair<rCt_1, rqO_2>> id_protected = rqR_2.id_class(Maps.newHashMap(), hashMap -> {
        hashMap.put("textures/entity/chest/normal_left.png", new Pair((Object)rCt_1.LEFT, (Object)new rqO_2("textures/entity/chest/normal_double.png")));
        hashMap.put("textures/entity/chest/normal_right.png", new Pair((Object)rCt_1.RIGHT, (Object)new rqO_2("textures/entity/chest/normal_double.png")));
        hashMap.put("textures/entity/chest/normal.png", new Pair((Object)rCt_1.SINGLE, (Object)new rqO_2("textures/entity/chest/normal.png")));
        hashMap.put("textures/entity/chest/trapped_left.png", new Pair((Object)rCt_1.LEFT, (Object)new rqO_2("textures/entity/chest/trapped_double.png")));
        hashMap.put("textures/entity/chest/trapped_right.png", new Pair((Object)rCt_1.RIGHT, (Object)new rqO_2("textures/entity/chest/trapped_double.png")));
        hashMap.put("textures/entity/chest/trapped.png", new Pair((Object)rCt_1.SINGLE, (Object)new rqO_2("textures/entity/chest/trapped.png")));
        hashMap.put("textures/entity/chest/christmas_left.png", new Pair((Object)rCt_1.LEFT, (Object)new rqO_2("textures/entity/chest/christmas_double.png")));
        hashMap.put("textures/entity/chest/christmas_right.png", new Pair((Object)rCt_1.RIGHT, (Object)new rqO_2("textures/entity/chest/christmas_double.png")));
        hashMap.put("textures/entity/chest/christmas.png", new Pair((Object)rCt_1.SINGLE, (Object)new rqO_2("textures/entity/chest/christmas.png")));
        hashMap.put("textures/entity/chest/ender.png", new Pair((Object)rCt_1.SINGLE, (Object)new rqO_2("textures/entity/chest/ender.png")));
    });
    private static final List<String> id_throws = Lists.newArrayList((Object[])new String[]{"base", "border", "bricks", "circle", "creeper", "cross", "curly_border", "diagonal_left", "diagonal_right", "diagonal_up_left", "diagonal_up_right", "flower", "globe", "gradient", "gradient_up", "half_horizontal", "half_horizontal_bottom", "half_vertical", "half_vertical_right", "mojang", "rhombus", "skull", "small_stripes", "square_bottom_left", "square_bottom_right", "square_top_left", "square_top_right", "straight_cross", "stripe_bottom", "stripe_center", "stripe_downleft", "stripe_downright", "stripe_left", "stripe_middle", "stripe_right", "stripe_top", "triangle_bottom", "triangle_top", "triangles_bottom", "triangles_top"});
    private static final Set<String> id_case = id_throws.stream().map(string -> "textures/entity/shield/" + string + ".png").collect(Collectors.toSet());
    private static final Set<String> id_catch = id_throws.stream().map(string -> "textures/entity/banner/" + string + ".png").collect(Collectors.toSet());
    public static final rqO_2 id_class = new rqO_2("textures/entity/shield_base.png");
    public static final rqO_2 id_break = new rqO_2("textures/entity/banner_base.png");
    public static final rqO_2 id_byte = new rqO_2("textures/entity/iron_golem.png");
    private final rAC id_private;

    public static InputStream id_byte(InputStream inputStream) throws IOException {
        ByteArrayInputStream byteArrayInputStream;
        try (fN_2 fN_22 = fN_2.id_class(inputStream);){
            int n = fN_22.id_class();
            int n2 = fN_22.id_break();
            try (fN_2 fN_23 = new fN_2(n / 2, n2, true);){
                int n3 = n2 / 64;
                jR_2.id_class(fN_22, fN_23, 14, 0, 29, 0, 15, 14, n3, false, true);
                jR_2.id_class(fN_22, fN_23, 44, 0, 14, 0, 15, 14, n3, false, true);
                jR_2.id_class(fN_22, fN_23, 0, 14, 0, 14, 14, 5, n3, true, true);
                jR_2.id_class(fN_22, fN_23, 14, 14, 43, 14, 15, 5, n3, true, true);
                jR_2.id_class(fN_22, fN_23, 73, 14, 14, 14, 15, 5, n3, true, true);
                jR_2.id_class(fN_22, fN_23, 14, 19, 29, 19, 15, 14, n3, false, true);
                jR_2.id_class(fN_22, fN_23, 44, 19, 14, 19, 15, 14, n3, false, true);
                jR_2.id_class(fN_22, fN_23, 0, 33, 0, 33, 14, 10, n3, true, true);
                jR_2.id_class(fN_22, fN_23, 14, 33, 43, 33, 15, 10, n3, true, true);
                jR_2.id_class(fN_22, fN_23, 73, 33, 14, 33, 15, 10, n3, true, true);
                jR_2.id_class(fN_22, fN_23, 1, 0, 2, 0, 1, 1, n3, false, true);
                jR_2.id_class(fN_22, fN_23, 3, 0, 1, 0, 1, 1, n3, false, true);
                jR_2.id_class(fN_22, fN_23, 0, 1, 0, 1, 1, 4, n3, true, true);
                jR_2.id_class(fN_22, fN_23, 1, 1, 3, 1, 1, 4, n3, true, true);
                jR_2.id_class(fN_22, fN_23, 5, 1, 1, 1, 1, 4, n3, true, true);
                byteArrayInputStream = new ByteArrayInputStream(fN_23.id_throws());
            }
        }
        return byteArrayInputStream;
    }

    public jR_2(rAC rAC2) {
        this.id_private = rAC2;
    }

    private static void id_class(fN_2 fN_22, fN_2 fN_23, int n, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl, boolean bl2) {
        n6 *= n7;
        n5 *= n7;
        n3 *= n7;
        n4 *= n7;
        n *= n7;
        n2 *= n7;
        for (int i = 0; i < n6; ++i) {
            for (int j = 0; j < n5; ++j) {
                fN_23.id_class(n3 + j, n4 + i, fN_22.id_class(n + (bl ? n5 - 1 - j : j), n2 + (bl2 ? n6 - 1 - i : i)));
            }
        }
    }

    @Override
    public String id_class() {
        return this.id_private.id_class();
    }

    @Override
    public <T> T id_class(rAo_1<T> rAo_12) throws IOException {
        return this.id_private.id_class(rAo_12);
    }

    @Override
    public Set<String> id_class(rAI rAI2) {
        return this.id_private.id_class(rAI2);
    }

    @Override
    public InputStream id_class(String string) throws IOException {
        return this.id_private.id_class(string);
    }

    @Override
    public Collection<rqO_2> id_class(rAI rAI2, String string, String string2, int n, Predicate<String> predicate) {
        return this.id_private.id_class(rAI2, string, string2, n, predicate);
    }

    public static InputStream id_class(InputStream inputStream) throws IOException {
        ByteArrayInputStream byteArrayInputStream;
        try (fN_2 fN_22 = fN_2.id_class(inputStream);){
            int n = fN_22.id_class();
            int n2 = fN_22.id_break();
            try (fN_2 fN_23 = new fN_2(2 * n, 2 * n2, true);){
                jR_2.id_class(fN_22, fN_23, 0, 0, 0, 0, n, n2, 1, false, false);
                byteArrayInputStream = new ByteArrayInputStream(fN_23.id_throws());
            }
        }
        return byteArrayInputStream;
    }

    @Override
    public InputStream id_class(rAI rAI2, rqO_2 rqO_22) throws IOException {
        if (!"minecraft".equals(rqO_22.id_byte())) {
            return this.id_private.id_class(rAI2, rqO_22);
        }
        String string = rqO_22.id_break();
        if ("textures/entity/iron_golem/iron_golem.png".equals(string)) {
            return this.id_private.id_class(rAI2, id_byte);
        }
        if (id_case.contains(string)) {
            InputStream inputStream = jR_2.id_class(this.id_private.id_class(rAI2, id_class), this.id_private.id_class(rAI2, rqO_22), 64, 2, 2, 12, 22);
            if (inputStream != null) {
                return inputStream;
            }
        } else if (id_catch.contains(string)) {
            InputStream inputStream = jR_2.id_class(this.id_private.id_class(rAI2, id_break), this.id_private.id_class(rAI2, rqO_22), 64, 0, 0, 42, 41);
            if (inputStream != null) {
                return inputStream;
            }
        } else {
            if ("textures/entity/enderdragon/dragon.png".equals(string) || "textures/entity/enderdragon/dragon_exploding.png".equals(string)) {
                ByteArrayInputStream byteArrayInputStream;
                try (fN_2 fN_22 = fN_2.id_class(this.id_private.id_class(rAI2, rqO_22));){
                    int n = fN_22.id_class() / 256;
                    for (int i = 88 * n; i < 200 * n; ++i) {
                        for (int j = 56 * n; j < 112 * n; ++j) {
                            fN_22.id_class(j, i, 0);
                        }
                    }
                    byteArrayInputStream = new ByteArrayInputStream(fN_22.id_throws());
                }
                return byteArrayInputStream;
            }
            if ("textures/entity/conduit/closed_eye.png".equals(string) || "textures/entity/conduit/open_eye.png".equals(string)) {
                return jR_2.id_class(this.id_private.id_class(rAI2, rqO_22));
            }
            Pair<rCt_1, rqO_2> pair = id_protected.get(string);
            if (pair != null) {
                rCt_1 rCt_12 = (rCt_1)pair.getFirst();
                InputStream inputStream = this.id_private.id_class(rAI2, (rqO_2)pair.getSecond());
                if (rCt_12 == rCt_1.SINGLE) {
                    return jR_2.id_protected(inputStream);
                }
                if (rCt_12 == rCt_1.LEFT) {
                    return jR_2.id_break(inputStream);
                }
                if (rCt_12 == rCt_1.RIGHT) {
                    return jR_2.id_byte(inputStream);
                }
            }
        }
        return this.id_private.id_class(rAI2, rqO_22);
    }

    public static InputStream id_class(InputStream inputStream, InputStream inputStream2, int n, int n2, int n3, int n4, int n5) throws IOException {
        ByteArrayInputStream byteArrayInputStream;
        try (fN_2 fN_22 = fN_2.id_class(inputStream2);
             fN_2 fN_23 = fN_2.id_class(inputStream);){
            int n6 = fN_23.id_class();
            int n7 = fN_23.id_break();
            if (n6 != fN_22.id_class() || n7 != fN_22.id_break()) {
                InputStream inputStream3 = null;
                return inputStream3;
            }
            try (fN_2 fN_24 = new fN_2(n6, n7, true);){
                int n8 = n6 / n;
                for (int i = n3 * n8; i < n5 * n8; ++i) {
                    for (int j = n2 * n8; j < n4 * n8; ++j) {
                        int n9 = fN_2.id_break(fN_22.id_class(j, i));
                        int n10 = fN_23.id_class(j, i);
                        fN_24.id_class(j, i, fN_2.id_class(n9, fN_2.id_protected(n10), fN_2.id_byte(n10), fN_2.id_break(n10)));
                    }
                }
                byteArrayInputStream = new ByteArrayInputStream(fN_24.id_throws());
            }
        }
        return byteArrayInputStream;
    }

    @Override
    public void close() {
        this.id_private.close();
    }

    @Override
    public boolean id_break(rAI rAI2, rqO_2 rqO_22) {
        if (!"minecraft".equals(rqO_22.id_byte())) {
            return this.id_private.id_break(rAI2, rqO_22);
        }
        String string = rqO_22.id_break();
        if ("textures/misc/enchanted_item_glint.png".equals(string)) {
            return false;
        }
        if ("textures/entity/iron_golem/iron_golem.png".equals(string)) {
            return this.id_private.id_break(rAI2, id_byte);
        }
        if (!"textures/entity/conduit/wind.png".equals(string) && !"textures/entity/conduit/wind_vertical.png".equals(string)) {
            if (id_case.contains(string)) {
                return this.id_private.id_break(rAI2, id_class) && this.id_private.id_break(rAI2, rqO_22);
            }
            if (!id_catch.contains(string)) {
                Pair<rCt_1, rqO_2> pair = id_protected.get(string);
                return pair != null && this.id_private.id_break(rAI2, (rqO_2)pair.getSecond()) ? true : this.id_private.id_break(rAI2, rqO_22);
            }
            return this.id_private.id_break(rAI2, id_break) && this.id_private.id_break(rAI2, rqO_22);
        }
        return false;
    }

    public static InputStream id_break(InputStream inputStream) throws IOException {
        ByteArrayInputStream byteArrayInputStream;
        try (fN_2 fN_22 = fN_2.id_class(inputStream);){
            int n = fN_22.id_class();
            int n2 = fN_22.id_break();
            try (fN_2 fN_23 = new fN_2(n / 2, n2, true);){
                int n3 = n2 / 64;
                jR_2.id_class(fN_22, fN_23, 29, 0, 29, 0, 15, 14, n3, false, true);
                jR_2.id_class(fN_22, fN_23, 59, 0, 14, 0, 15, 14, n3, false, true);
                jR_2.id_class(fN_22, fN_23, 29, 14, 43, 14, 15, 5, n3, true, true);
                jR_2.id_class(fN_22, fN_23, 44, 14, 29, 14, 14, 5, n3, true, true);
                jR_2.id_class(fN_22, fN_23, 58, 14, 14, 14, 15, 5, n3, true, true);
                jR_2.id_class(fN_22, fN_23, 29, 19, 29, 19, 15, 14, n3, false, true);
                jR_2.id_class(fN_22, fN_23, 59, 19, 14, 19, 15, 14, n3, false, true);
                jR_2.id_class(fN_22, fN_23, 29, 33, 43, 33, 15, 10, n3, true, true);
                jR_2.id_class(fN_22, fN_23, 44, 33, 29, 33, 14, 10, n3, true, true);
                jR_2.id_class(fN_22, fN_23, 58, 33, 14, 33, 15, 10, n3, true, true);
                jR_2.id_class(fN_22, fN_23, 2, 0, 2, 0, 1, 1, n3, false, true);
                jR_2.id_class(fN_22, fN_23, 4, 0, 1, 0, 1, 1, n3, false, true);
                jR_2.id_class(fN_22, fN_23, 2, 1, 3, 1, 1, 4, n3, true, true);
                jR_2.id_class(fN_22, fN_23, 3, 1, 2, 1, 1, 4, n3, true, true);
                jR_2.id_class(fN_22, fN_23, 4, 1, 1, 1, 1, 4, n3, true, true);
                byteArrayInputStream = new ByteArrayInputStream(fN_23.id_throws());
            }
        }
        return byteArrayInputStream;
    }

    public static InputStream id_protected(InputStream inputStream) throws IOException {
        ByteArrayInputStream byteArrayInputStream;
        try (fN_2 fN_22 = fN_2.id_class(inputStream);){
            int n = fN_22.id_class();
            int n2 = fN_22.id_break();
            try (fN_2 fN_23 = new fN_2(n, n2, true);){
                int n3 = n2 / 64;
                jR_2.id_class(fN_22, fN_23, 14, 0, 28, 0, 14, 14, n3, false, true);
                jR_2.id_class(fN_22, fN_23, 28, 0, 14, 0, 14, 14, n3, false, true);
                jR_2.id_class(fN_22, fN_23, 0, 14, 0, 14, 14, 5, n3, true, true);
                jR_2.id_class(fN_22, fN_23, 14, 14, 42, 14, 14, 5, n3, true, true);
                jR_2.id_class(fN_22, fN_23, 28, 14, 28, 14, 14, 5, n3, true, true);
                jR_2.id_class(fN_22, fN_23, 42, 14, 14, 14, 14, 5, n3, true, true);
                jR_2.id_class(fN_22, fN_23, 14, 19, 28, 19, 14, 14, n3, false, true);
                jR_2.id_class(fN_22, fN_23, 28, 19, 14, 19, 14, 14, n3, false, true);
                jR_2.id_class(fN_22, fN_23, 0, 33, 0, 33, 14, 10, n3, true, true);
                jR_2.id_class(fN_22, fN_23, 14, 33, 42, 33, 14, 10, n3, true, true);
                jR_2.id_class(fN_22, fN_23, 28, 33, 28, 33, 14, 10, n3, true, true);
                jR_2.id_class(fN_22, fN_23, 42, 33, 14, 33, 14, 10, n3, true, true);
                jR_2.id_class(fN_22, fN_23, 1, 0, 3, 0, 2, 1, n3, false, true);
                jR_2.id_class(fN_22, fN_23, 3, 0, 1, 0, 2, 1, n3, false, true);
                jR_2.id_class(fN_22, fN_23, 0, 1, 0, 1, 1, 4, n3, true, true);
                jR_2.id_class(fN_22, fN_23, 1, 1, 4, 1, 2, 4, n3, true, true);
                jR_2.id_class(fN_22, fN_23, 3, 1, 3, 1, 1, 4, n3, true, true);
                jR_2.id_class(fN_22, fN_23, 4, 1, 1, 1, 2, 4, n3, true, true);
                byteArrayInputStream = new ByteArrayInputStream(fN_23.id_throws());
            }
        }
        return byteArrayInputStream;
    }
}

