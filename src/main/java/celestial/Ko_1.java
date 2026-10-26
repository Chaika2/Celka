/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.KD;
import celestial.KK;
import celestial.KY;
import celestial.rfH_2;
import celestial.xc_3;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

public class Ko_1 {
    private final KY id_class;
    private final String id_break;
    private final List<KK> id_byte = Lists.newArrayList();
    private StackTraceElement[] id_protected = new StackTraceElement[0];

    public Ko_1(KY kY, String string) {
        this.id_class = kY;
        this.id_break = string;
    }

    public boolean id_class(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        if (this.id_protected.length != 0 && stackTraceElement != null) {
            StackTraceElement stackTraceElement3 = this.id_protected[0];
            if (stackTraceElement3.isNativeMethod() == stackTraceElement.isNativeMethod() && stackTraceElement3.getClassName().equals(stackTraceElement.getClassName()) && Objects.equals(stackTraceElement3.getFileName(), stackTraceElement.getFileName()) && stackTraceElement3.getMethodName().equals(stackTraceElement.getMethodName())) {
                if (stackTraceElement2 != null != this.id_protected.length > 1) {
                    return false;
                }
                if (stackTraceElement2 != null && !this.id_protected[1].equals(stackTraceElement2)) {
                    return false;
                }
                this.id_protected[0] = stackTraceElement;
                return true;
            }
            return false;
        }
        return false;
    }

    public int id_class(int n) {
        StackTraceElement[] stackTraceElementArray = Thread.currentThread().getStackTrace();
        if (stackTraceElementArray.length <= 0) {
            return 0;
        }
        this.id_protected = new StackTraceElement[stackTraceElementArray.length - 3 - n];
        System.arraycopy(stackTraceElementArray, 3 + n, this.id_protected, 0, this.id_protected.length);
        return this.id_protected.length;
    }

    public void id_class(String string, Throwable throwable) {
        this.id_class(string, (Object)throwable);
    }

    public void id_class(StringBuilder stringBuilder) {
        stringBuilder.append("-- ").append(this.id_break).append(" --\n");
        stringBuilder.append("Details:");
        for (KK kK : this.id_byte) {
            stringBuilder.append("\n\t");
            stringBuilder.append(kK.id_class());
            stringBuilder.append(": ");
            stringBuilder.append(kK.id_break());
        }
        if (this.id_protected != null && this.id_protected.length > 0) {
            stringBuilder.append("\nStacktrace:");
            for (StackTraceElement stackTraceElement : this.id_protected) {
                stringBuilder.append("\n\tat ");
                stringBuilder.append(stackTraceElement);
            }
        }
    }

    public StackTraceElement[] id_class() {
        return this.id_protected;
    }

    public static void id_class(Ko_1 ko_1, rfH_2 rfH_22, xc_3 xc_32) {
        if (xc_32 != null) {
            ko_1.id_class("Block", xc_32::toString);
        }
        ko_1.id_class("Block location", () -> Ko_1.id_class(rfH_22));
    }

    public static String id_class(double d, double d2, double d3) {
        return String.format(Locale.ROOT, "%.2f,%.2f,%.2f - %s", d, d2, d3, Ko_1.id_class(new rfH_2(d, d2, d3)));
    }

    public static String id_class(rfH_2 rfH_22) {
        return Ko_1.id_class(rfH_22.b_(), rfH_22.c_(), rfH_22.d_());
    }

    public static String id_class(int n, int n2, int n3) {
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        int n11;
        StringBuilder stringBuilder = new StringBuilder();
        try {
            stringBuilder.append(String.format("World: (%d,%d,%d)", n, n2, n3));
        }
        catch (Throwable throwable) {
            stringBuilder.append("(Error finding world loc)");
        }
        stringBuilder.append(", ");
        try {
            int n12 = n >> 4;
            n11 = n3 >> 4;
            n10 = n & 0xF;
            n9 = n2 >> 4;
            n8 = n3 & 0xF;
            n7 = n12 << 4;
            n6 = n11 << 4;
            n5 = (n12 + 1 << 4) - 1;
            n4 = (n11 + 1 << 4) - 1;
            stringBuilder.append(String.format("Chunk: (at %d,%d,%d in %d,%d; contains blocks %d,0,%d to %d,255,%d)", n10, n9, n8, n12, n11, n7, n6, n5, n4));
        }
        catch (Throwable throwable) {
            stringBuilder.append("(Error finding chunk loc)");
        }
        stringBuilder.append(", ");
        try {
            int n13 = n >> 9;
            n11 = n3 >> 9;
            n10 = n13 << 5;
            n9 = n11 << 5;
            n8 = (n13 + 1 << 5) - 1;
            n7 = (n11 + 1 << 5) - 1;
            n6 = n13 << 9;
            n5 = n11 << 9;
            n4 = (n13 + 1 << 9) - 1;
            int n14 = (n11 + 1 << 9) - 1;
            stringBuilder.append(String.format("Region: (%d,%d; contains chunks %d,%d to %d,%d, blocks %d,0,%d to %d,255,%d)", n13, n11, n10, n9, n8, n7, n6, n5, n4, n14));
        }
        catch (Throwable throwable) {
            stringBuilder.append("(Error finding world loc)");
        }
        return stringBuilder.toString();
    }

    public Ko_1 id_class(String string, Object object) {
        this.id_byte.add(new KK(string, object));
        return this;
    }

    public Ko_1 id_class(String string, KD<String> kD) {
        try {
            this.id_class(string, kD.call());
        }
        catch (Throwable throwable) {
            this.id_class(string, throwable);
        }
        return this;
    }

    public void id_break(int n) {
        StackTraceElement[] stackTraceElementArray = new StackTraceElement[this.id_protected.length - n];
        System.arraycopy(this.id_protected, 0, stackTraceElementArray, 0, stackTraceElementArray.length);
        this.id_protected = stackTraceElementArray;
    }
}

