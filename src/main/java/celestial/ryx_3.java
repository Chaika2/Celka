/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.ryJ_2;
import celestial.ryX_2;

public final class ryx_3<S>
implements ryJ_2<S> {
    private final S id_class;
    private final S id_break;

    public ryx_3(S s, S s2) {
        this.id_class = s;
        this.id_break = s2;
    }

    @Override
    public <T> T apply(ryX_2<? super S, T> ryX_22) {
        return ryX_22.id_class(this.id_class, this.id_break);
    }
}

