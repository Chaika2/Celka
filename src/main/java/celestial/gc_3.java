/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.util.Locale;

public final class gc_3
extends Enum<gc_3> {
    public static final /* enum */ gc_3 B = new gc_3();
    public static final /* enum */ gc_3 KB = new gc_3();
    public static final /* enum */ gc_3 MB = new gc_3();
    public static final /* enum */ gc_3 GB = new gc_3();
    private static final /* synthetic */ gc_3[] $VALUES;

    static {
        $VALUES = gc_3.id_class();
    }

    public static gc_3[] values() {
        return (gc_3[])$VALUES.clone();
    }

    public static gc_3 valueOf(String string) {
        return Enum.valueOf(gc_3.class, string);
    }

    private static /* synthetic */ gc_3[] id_class() {
        return new gc_3[]{B, KB, MB, GB};
    }

    public static double id_class(long l, gc_3 gc_32) {
        return gc_32 == B ? (double)l : (double)l / Math.pow(1024.0, gc_32.ordinal());
    }

    public static gc_3 id_class(long l) {
        if (l < 1024L) {
            return B;
        }
        try {
            int n = (int)(Math.log(l) / Math.log(1024.0));
            String string = String.valueOf("KMGTPE".charAt(n - 1));
            return gc_3.valueOf(string + "B");
        }
        catch (Exception exception) {
            return GB;
        }
    }

    public static String id_break(long l) {
        int n = 1024;
        if (l < 1024L) {
            return l + " B";
        }
        int n2 = (int)(Math.log(l) / Math.log(1024.0));
        String string = "" + "KMGTPE".charAt(n2 - 1);
        return String.format(Locale.ROOT, "%.1f %sB", (double)l / Math.pow(1024.0, n2), string);
    }

    public static String id_break(long l, gc_3 gc_32) {
        return String.format("%." + (gc_32 == GB ? "1" : "0") + "f %s", gc_3.id_class(l, gc_32), gc_32.name());
    }
}

