/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 */
package celestial;

import celestial.AO;
import celestial.gm_3;
import celestial.rYB;
import celestial.rfj_3;
import celestial.rng_3;
import celestial.roJ_2;
import celestial.rqM_2;
import celestial.rrEN;
import celestial.rrEm_1;
import celestial.yR_2;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public final class yY_2 {
    public final Map<rfj_3, String> id_class;
    public final CompletableFuture<Map<rfj_3, String>> id_break;

    public yY_2(yR_2 yR_22, rng_3 rng_32, double d, double d2) {
        gm_3 gm_32 = (gm_3)yR_22.id_class.id_class[56];
        rqM_2<rYB> rqM_22 = gm_32.E();
        int n = (int)d >> 4;
        int n2 = (int)d2 >> 4;
        ImmutableMap.Builder builder = ImmutableMap.builder();
        AO aO = gm_32.id_native();
        for (int i = n - 12; i <= n + 12; ++i) {
            for (int j = n2 - 12; j <= n2 + 12; ++j) {
                rfj_3 rfj_32 = new rfj_3(i, j);
                Object object = "";
                roJ_2 roJ_22 = aO.id_class(i, j, false);
                object = (String)object + "Client: ";
                if (roJ_22 == null) {
                    object = (String)object + "0n/a\n";
                } else {
                    object = (String)object + (roJ_22.id_catch() ? " E" : "");
                    object = (String)object + "\n";
                }
                builder.put((Object)rfj_32, object);
            }
        }
        this.id_class = builder.build();
        this.id_break = rng_32.id_class(() -> {
            rrEm_1 rrEm_12 = rng_32.id_class(rqM_22);
            if (rrEm_12 == null) {
                return ImmutableMap.of();
            }
            ImmutableMap.Builder builder = ImmutableMap.builder();
            rrEN rrEN2 = rrEm_12.id_else();
            for (int i = n - 12; i <= n + 12; ++i) {
                for (int j = n2 - 12; j <= n2 + 12; ++j) {
                    rfj_3 rfj_32 = new rfj_3(i, j);
                    builder.put((Object)rfj_32, (Object)("Server: " + rrEN2.id_break(rfj_32)));
                }
            }
            return builder.build();
        });
    }
}

