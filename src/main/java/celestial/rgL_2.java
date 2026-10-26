/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rgF_2;
import celestial.rgS_2;
import celestial.rgc_3;
import celestial.rpv_3;
import celestial.rqg_3;
import java.util.Optional;

public class rgL_2 {
    private static final Optional<Object> id_class = Optional.of(rqg_3.INSTANCE);

    public static boolean id_byte(String string, rgc_3 rgc_32, rpv_3 rpv_32) {
        return rgL_2.id_class(string, 0, rgc_32, rpv_32);
    }

    private static boolean id_class(rgc_3 rgc_32, rpv_3 rpv_32, int n, char c) {
        return Character.isSurrogate(c) ? rpv_32.accept(n, rgc_32, 65533) : rpv_32.accept(n, rgc_32, c);
    }

    public static boolean id_class(rgS_2 rgS_22, rgc_3 rgc_33, rpv_3 rpv_32) {
        return !rgS_22.id_class((rgc_32, string) -> rgL_2.id_class(string, 0, rgc_32, rpv_32) ? Optional.empty() : id_class, rgc_33).isPresent();
    }

    public static String id_class(rgS_2 rgS_22) {
        StringBuilder stringBuilder = new StringBuilder();
        rgL_2.id_class(rgS_22, rgc_3.id_class, (int n, rgc_3 rgc_32, int n2) -> {
            stringBuilder.appendCodePoint(n2);
            return true;
        });
        return stringBuilder.toString();
    }

    public static String id_class(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        rgL_2.id_class(string, rgc_3.id_class, (int n, rgc_3 rgc_32, int n2) -> {
            stringBuilder.appendCodePoint(n2);
            return true;
        });
        return stringBuilder.toString();
    }

    public static boolean id_class(String string, rgc_3 rgc_32, rpv_3 rpv_32) {
        int n = string.length();
        for (int i = 0; i < n; ++i) {
            char c = string.charAt(i);
            if (Character.isHighSurrogate(c)) {
                if (i + 1 >= n) {
                    if (rpv_32.accept(i, rgc_32, 65533)) break;
                    return false;
                }
                char c2 = string.charAt(i + 1);
                if (Character.isLowSurrogate(c2)) {
                    if (!rpv_32.accept(i, rgc_32, Character.toCodePoint(c, c2))) {
                        return false;
                    }
                    ++i;
                    continue;
                }
                if (rpv_32.accept(i, rgc_32, 65533)) continue;
                return false;
            }
            if (rgL_2.id_class(rgc_32, rpv_32, i, c)) continue;
            return false;
        }
        return true;
    }

    public static boolean id_class(String string, int n, rgc_3 rgc_32, rpv_3 rpv_32) {
        return rgL_2.id_class(string, n, rgc_32, rgc_32, rpv_32);
    }

    public static boolean id_class(String string, int n, rgc_3 rgc_32, rgc_3 rgc_33, rpv_3 rpv_32) {
        int n2 = string.length();
        rgc_3 rgc_34 = rgc_32;
        for (int i = n; i < n2; ++i) {
            char c;
            char c2 = string.charAt(i);
            if (c2 == '\u00a7') {
                if (i + 1 >= n2) break;
                c = string.charAt(i + 1);
                rgF_2 rgF_22 = rgF_2.id_class(c);
                if (rgF_22 != null) {
                    rgc_34 = rgF_22 == rgF_2.RESET ? rgc_33 : rgc_34.id_byte(rgF_22);
                }
                ++i;
                continue;
            }
            if (Character.isHighSurrogate(c2)) {
                if (i + 1 >= n2) {
                    if (rpv_32.accept(i, rgc_34, 65533)) break;
                    return false;
                }
                c = string.charAt(i + 1);
                if (Character.isLowSurrogate(c)) {
                    if (!rpv_32.accept(i, rgc_34, Character.toCodePoint(c2, c))) {
                        return false;
                    }
                    ++i;
                    continue;
                }
                if (rpv_32.accept(i, rgc_34, 65533)) continue;
                return false;
            }
            if (rgL_2.id_class(rgc_34, rpv_32, i, c2)) continue;
            return false;
        }
        return true;
    }

    public static boolean id_break(String string, rgc_3 rgc_32, rpv_3 rpv_32) {
        int n = string.length();
        for (int i = n - 1; i >= 0; --i) {
            char c = string.charAt(i);
            if (Character.isLowSurrogate(c)) {
                if (i - 1 < 0) {
                    if (rpv_32.accept(0, rgc_32, 65533)) break;
                    return false;
                }
                char c2 = string.charAt(i - 1);
                if (!(Character.isHighSurrogate(c2) ? !rpv_32.accept(--i, rgc_32, Character.toCodePoint(c2, c)) : !rpv_32.accept(i, rgc_32, 65533))) continue;
                return false;
            }
            if (rgL_2.id_class(rgc_32, rpv_32, i, c)) continue;
            return false;
        }
        return true;
    }
}

