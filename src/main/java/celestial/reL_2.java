/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
package celestial;

import celestial.rKd_1;
import celestial.rRI;
import celestial.red_3;
import celestial.rem_3;
import celestial.rev_3;
import celestial.rfH_2;
import celestial.rfi_3;
import celestial.rqd_3;
import celestial.rrPp_1;
import celestial.rrPt_1;
import celestial.rrrA;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class reL_2
extends rev_3 {
    public static final Codec<reL_2> id_class = RecordCodecBuilder.create(instance -> instance.group((App)rev_3.id_byte.listOf().fieldOf("elements").forGetter(reL_22 -> reL_22.id_break), reL_2.id_break()).apply((Applicative)instance, reL_2::new));
    private final List<rev_3> id_break;

    public reL_2(List<rev_3> list, rem_3 rem_32) {
        super(rem_32);
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Elements are empty");
        }
        this.id_break = list;
        this.id_break(rem_32);
    }

    public String toString() {
        return "List[" + this.id_break.stream().map(Object::toString).collect(Collectors.joining(", ")) + "]";
    }

    @Override
    public rfi_3 id_class(rrPt_1 rrPt_12, rfH_2 rfH_22, rqd_3 rqd_32) {
        rfi_3 rfi_32 = rfi_3.id_class();
        for (rev_3 rev_32 : this.id_break) {
            rfi_3 rfi_33 = rev_32.id_class(rrPt_12, rfH_22, rqd_32);
            rfi_32.id_break(rfi_33);
        }
        return rfi_32;
    }

    @Override
    public boolean id_class(rrPt_1 rrPt_12, rRI rRI2, rrrA rrrA2, rKd_1 rKd_12, rfH_2 rfH_22, rfH_2 rfH_23, rqd_3 rqd_32, rfi_3 rfi_32, Random random, boolean bl) {
        for (rev_3 rev_32 : this.id_break) {
            if (rev_32.id_class(rrPt_12, rRI2, rrrA2, rKd_12, rfH_22, rfH_23, rqd_32, rfi_32, random, bl)) continue;
            return false;
        }
        return true;
    }

    @Override
    public red_3<?> id_class() {
        return red_3.id_break;
    }

    @Override
    public rev_3 id_class(rem_3 rem_32) {
        super.id_class(rem_32);
        this.id_break(rem_32);
        return this;
    }

    @Override
    public List<rrPp_1> id_class(rrPt_1 rrPt_12, rfH_2 rfH_22, rqd_3 rqd_32, Random random) {
        return this.id_break.get(0).id_class(rrPt_12, rfH_22, rqd_32, random);
    }

    private void id_break(rem_3 rem_32) {
        this.id_break.forEach(rev_32 -> rev_32.id_class(rem_32));
    }
}

