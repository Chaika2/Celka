/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rKH;
import celestial.rKi_1;
import celestial.rRI;
import celestial.rUO;
import celestial.rfH_2;
import celestial.rfi_3;
import celestial.rrsW_2;
import celestial.rrsk_3;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class rrsX_2
extends rrsk_3 {
    public static final Codec<rrsX_2> id_class = rKi_1.id_break.fieldOf("provider").xmap(rrsX_2::new, rrsX_22 -> rrsX_22.id_break).codec();
    private final rKi_1 id_break;

    public rrsX_2(rKi_1 rKi_12) {
        this.id_break = rKi_12;
    }

    @Override
    public void id_class(rRI rRI2, Random random, List<rfH_2> list, List<rfH_2> list2, Set<rfH_2> set, rfi_3 rfi_32) {
        int n = list.get(0).c_();
        list.stream().filter(rfH_22 -> rfH_22.c_() == n).forEach(rfH_22 -> {
            this.id_class((rKH)rRI2, random, rfH_22.id_byte().id_private());
            this.id_class((rKH)rRI2, random, rfH_22.id_volatile(2).id_private());
            this.id_class((rKH)rRI2, random, rfH_22.id_byte().id_private(2));
            this.id_class((rKH)rRI2, random, rfH_22.id_volatile(2).id_private(2));
            for (int i = 0; i < 5; ++i) {
                int n = random.nextInt(64);
                int n2 = n % 8;
                int n3 = n / 8;
                if (n2 != 0 && n2 != 7 && n3 != 0 && n3 != 7) continue;
                this.id_class((rKH)rRI2, random, rfH_22.id_break(-3 + n2, 0, -3 + n3));
            }
        });
    }

    private void id_class(rKH rKH2, Random random, rfH_2 rfH_22) {
        for (int i = -2; i <= 2; ++i) {
            for (int j = -2; j <= 2; ++j) {
                if (Math.abs(i) == 2 && Math.abs(j) == 2) continue;
                this.id_break(rKH2, random, rfH_22.id_break(i, 0, j));
            }
        }
    }

    @Override
    protected rrsW_2<?> id_class() {
        return rrsW_2.id_throws;
    }

    private void id_break(rKH rKH2, Random random, rfH_2 rfH_22) {
        for (int i = 2; i >= -3; --i) {
            rfH_2 rfH_23 = rfH_22.id_break(i);
            if (rUO.id_class(rKH2, rfH_23)) {
                rKH2.id_class(rfH_23, this.id_break.id_class(random, rfH_22), 19);
                break;
            }
            if (!rUO.id_break(rKH2, rfH_23) && i < 0) break;
        }
    }
}

