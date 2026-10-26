/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Qa_1;
import celestial.Qg_1;
import celestial.Qw_1;
import celestial.VF;
import celestial.rgN_2;
import celestial.rgn_3;
import celestial.yM_2;
import java.util.Optional;

public class QH
extends VF {
    public QH(Qg_1 qg_1) {
        this(qg_1, qg_1.id_public());
    }

    private QH(Qg_1 qg_1, Qa_1 qa_1) {
        super("options.fullscreen.resolution", -1.0, qa_1 != null ? (double)(qa_1.id_throws() - 1) : -1.0, 1.0f, (Qw_1 qw_1) -> {
            if (qa_1 == null) {
                return -1.0;
            }
            Optional<yM_2> optional = qg_1.id_case();
            return optional.map(yM_22 -> qa_1.id_class((yM_2)yM_22)).orElse(-1.0);
        }, (Qw_1 qw_1, Double d) -> {
            if (qa_1 != null) {
                if (d == -1.0) {
                    qg_1.id_class(Optional.empty());
                } else {
                    qg_1.id_class(Optional.of(qa_1.id_class(d.intValue())));
                }
            }
        }, (Qw_1 qw_1, VF vF) -> {
            if (qa_1 == null) {
                return new rgn_3("options.fullscreen.unavailable");
            }
            double d = vF.id_class((Qw_1)qw_1);
            return d == -1.0 ? vF.id_class(new rgn_3("options.fullscreen.current")) : vF.id_class(new rgN_2(qa_1.id_class((int)d).toString()));
        });
    }
}

