/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringUtils
 */
package celestial;

import celestial.rqy_3;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.time.Duration;
import java.util.regex.Pattern;
import org.apache.commons.lang3.StringUtils;

public class rql_3 {
    private static final Pattern id_class = Pattern.compile("(?i)\\u00A7[0-9A-FK-OR]");

    public static String id_class(String string, char c) {
        if (string == null || string.length() < 4) {
            return string;
        }
        try {
            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
            decimalFormatSymbols.setGroupingSeparator(c);
            DecimalFormat decimalFormat = new DecimalFormat("#,###", decimalFormatSymbols);
            decimalFormat.setMaximumFractionDigits(0);
            return decimalFormat.format(Double.parseDouble(string));
        }
        catch (NumberFormatException numberFormatException) {
            return string;
        }
    }

    public static String id_class(Duration duration, rqy_3 ... rqy_3Array) {
        if (rqy_3Array.length == 0) {
            rqy_3Array = rqy_3.ALL_VALUES;
        }
        long l = duration.toDaysPart();
        long l2 = duration.toHoursPart();
        long l3 = duration.toMinutesPart();
        long l4 = duration.toSecondsPart();
        StringBuilder stringBuilder = new StringBuilder();
        block6: for (rqy_3 rqy_32 : rqy_3Array) {
            switch (rqy_32) {
                case DAYS: {
                    if (l <= 0L) continue block6;
                    stringBuilder.append(l).append("\u0434 ");
                    continue block6;
                }
                case HOURS: {
                    if (l2 <= 0L) continue block6;
                    stringBuilder.append(l2).append("\u0447 ");
                    continue block6;
                }
                case MINUTES: {
                    if (l3 <= 0L) continue block6;
                    stringBuilder.append(l3).append("\u043c ");
                    continue block6;
                }
                case SECONDS: {
                    stringBuilder.append(l4).append("\u0441");
                }
            }
        }
        return stringBuilder.toString();
    }

    public static String id_class(long l, String ... stringArray) {
        l = Math.abs(l) % 100L;
        long l2 = l % 10L;
        if (l >= 11L && l <= 19L) {
            return stringArray[Math.max(0, stringArray.length - 1)];
        }
        if (l2 >= 2L && l2 <= 4L) {
            return stringArray[Math.max(0, stringArray.length - 2)];
        }
        if (l2 == 1L) {
            return stringArray[Math.max(0, stringArray.length - 3)];
        }
        return stringArray[Math.max(0, stringArray.length - 1)];
    }

    public static String id_class(Number number, char c) {
        if (number == null) {
            return "null";
        }
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setGroupingSeparator(c);
        DecimalFormat decimalFormat = new DecimalFormat("#,###", decimalFormatSymbols);
        decimalFormat.setMaximumFractionDigits(0);
        return decimalFormat.format(number);
    }

    public static String id_class(String string) {
        return id_class.matcher(string).replaceAll("");
    }

    public static String id_class(float f) {
        return "" + (float)((int)(f * 10.0f)) / 10.0f;
    }

    public static String id_class(int n) {
        int n2 = n / 20;
        int n3 = n2 / 60;
        return (n2 %= 60) < 10 ? n3 + ":0" + n2 : n3 + ":" + n2;
    }

    public static boolean id_break(String string) {
        return StringUtils.isEmpty((CharSequence)string);
    }
}

