/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rqR_2;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public interface rCe_1 {
    public static final DecimalFormat id_class = rqR_2.id_class(new DecimalFormat("########0.00"), decimalFormat -> decimalFormat.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT)));
    public static final rCe_1 id_break = NumberFormat.getIntegerInstance(Locale.US)::format;
    public static final rCe_1 id_byte = n -> id_class.format((double)n * 0.1);
    public static final rCe_1 id_protected = n -> {
        double d = (double)n / 100.0;
        double d2 = d / 1000.0;
        if (d2 > 0.5) {
            return id_class.format(d2) + " km";
        }
        return d > 0.5 ? id_class.format(d) + " m" : n + " cm";
    };
    public static final rCe_1 id_throws = n -> {
        double d = (double)n / 20.0;
        double d2 = d / 60.0;
        double d3 = d2 / 60.0;
        double d4 = d3 / 24.0;
        double d5 = d4 / 365.0;
        if (d5 > 0.5) {
            return id_class.format(d5) + " y";
        }
        if (d4 > 0.5) {
            return id_class.format(d4) + " d";
        }
        if (d3 > 0.5) {
            return id_class.format(d3) + " h";
        }
        return d2 > 0.5 ? id_class.format(d2) + " m" : d + " s";
    };

    public String format(int var1);
}

