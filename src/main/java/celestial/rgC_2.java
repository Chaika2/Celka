/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rgn_3;

public class rgC_2
extends IllegalArgumentException {
    public rgC_2(rgn_3 rgn_32, String string) {
        super(String.format("Error parsing: %s: %s", rgn_32, string));
    }

    public rgC_2(rgn_3 rgn_32, int n) {
        super(String.format("Invalid index %d requested for %s", n, rgn_32));
    }

    public rgC_2(rgn_3 rgn_32, Throwable throwable) {
        super(String.format("Error while parsing: %s", rgn_32), throwable);
    }
}

