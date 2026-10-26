/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.authlib.GameProfile
 *  org.apache.commons.lang3.ArrayUtils
 */
package celestial;

import celestial.Af_1;
import celestial.Ak_1;
import celestial.Av_1;
import celestial.rLB;
import celestial.rLG;
import celestial.rLb_1;
import celestial.rgF_2;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rqR_2;
import celestial.rud_3;
import celestial.run_3;
import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import java.util.Objects;
import org.apache.commons.lang3.ArrayUtils;

public class AF
implements Af_1 {
    private boolean id_throws;
    private boolean id_case;
    private long id_catch;
    public final /* synthetic */ rud_3 id_class;
    public final /* synthetic */ Ak_1 id_break;
    public final /* synthetic */ Runnable id_byte;
    public final /* synthetic */ Av_1 id_protected;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public AF(Av_1 av_1, rud_3 rud_32, Ak_1 ak_1, Runnable runnable) {
        this.id_protected = av_1;
        this.id_class = rud_32;
        this.id_break = ak_1;
        this.id_byte = runnable;
    }

    @Override
    public rud_3 id_class() {
        return this.id_class;
    }

    @Override
    public void id_class(rgP_2 rgP_22, rgP_2 rgP_23) {
        if (!this.id_throws) {
            Av_1.id_break.error("Can't ping {}: {}", (Object)this.id_break.id_break, (Object)rgP_23.getString());
            this.id_break.id_protected = new rgn_3("multiplayer.status.cannot_connect").id_class(rgF_2.DARK_RED);
            this.id_break.id_byte = rgN_2.id_byte;
            this.id_protected.id_class(this.id_break);
        }
    }

    @Override
    public void id_class(rLG rLG2) {
        long l = this.id_catch;
        long l2 = rqR_2.id_break();
        this.id_break.id_throws = l2 - l;
        this.id_class.id_class(new rgn_3("multiplayer.status.finished"));
    }

    @Override
    public void id_class(rLb_1 rLb_12) {
        if (this.id_case) {
            this.id_class.id_class(new rgn_3("multiplayer.status.unrequested"));
        } else {
            Object object;
            this.id_case = true;
            run_3 run_32 = rLb_12.id_break();
            this.id_break.id_protected = run_32.id_class() != null ? run_32.id_class() : rgN_2.id_byte;
            if (run_32.id_byte() != null) {
                this.id_break.id_catch = new rgN_2(run_32.id_byte().id_class());
                this.id_break.id_case = run_32.id_byte().id_break();
            } else {
                this.id_break.id_catch = new rgn_3("multiplayer.status.old");
                this.id_break.id_case = 0;
            }
            if (run_32.id_break() != null) {
                this.id_break.id_byte = Av_1.id_class(run_32.id_break().id_break(), run_32.id_break().id_class());
                object = Lists.newArrayList();
                if (ArrayUtils.isNotEmpty((Object[])run_32.id_break().id_byte())) {
                    for (GameProfile gameProfile : run_32.id_break().id_byte()) {
                        object.add(new rgN_2(gameProfile.getName()));
                    }
                    if (run_32.id_break().id_byte().length < run_32.id_break().id_break()) {
                        object.add(new rgn_3("multiplayer.status.and_more", run_32.id_break().id_break() - run_32.id_break().id_byte().length));
                    }
                    this.id_break.id_implements = object;
                }
            } else {
                this.id_break.id_byte = new rgn_3("multiplayer.status.unknown").id_class(rgF_2.DARK_GRAY);
            }
            object = null;
            if (run_32.id_protected() != null) {
                GameProfile[] gameProfileArray = run_32.id_protected();
                if (gameProfileArray.startsWith("data:image/png;base64,")) {
                    object = gameProfileArray.substring("data:image/png;base64,".length());
                } else {
                    Av_1.id_break.error("Invalid server icon (unknown format)");
                }
            }
            if (!Objects.equals(object, this.id_break.id_byte())) {
                this.id_break.id_class((String)object);
                this.id_byte.run();
            }
            this.id_catch = rqR_2.id_break();
            this.id_class.id_class(new rLB(this.id_catch));
            this.id_throws = true;
        }
    }
}

